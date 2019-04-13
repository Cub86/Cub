package com.company.lesson10.magaz.dostup;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.Comparator;


public class MainWindow extends JFrame {
    private JPanel itemPanel = new JPanel();
    private JPanel itemSortPanel = new JPanel();
    private JPanel itemTableBucketPanel = new JPanel(new BorderLayout());
    private JLabel userLabel = new JLabel(" Пользователь: гость");
    private JButton buySubmit = new JButton();
    private ButtonGroup sbg = new ButtonGroup();
    private JTable itemsTable = new JTable();


    private JPanel composeItemPanel() {
        itemPanel.setLayout(new BorderLayout());
        itemPanel.add(composeTablePanel(), BorderLayout.CENTER);
        return itemPanel;
    }

    private JPanel composeSortPanel() {
        itemSortPanel.setLayout(new GridLayout(6, 1));
        JLabel label = new JLabel("Сортировать");
        label.setHorizontalAlignment(SwingConstants.CENTER);
        itemSortPanel.add(label);

        JRadioButton sortByCost = new JRadioButton(" от дешевой фигни к дорогой");
        sortByCost.addActionListener(e -> {
            List<Item> itemList = tableModel.getItems();
            itemList.sort(Comparator.comparing(Item::getPrice));
            tableModel.setItems(itemList);
            itemTableBucketPanel.repaint();
            itemTableBucketPanel.revalidate();
        });
        sbg.add(sortByCost);

        JRadioButton sortReverseByCost = new JRadioButton(" от дорогой фигник дешевой");
        sortReverseByCost.addActionListener(e -> {
            List<Item> itemList = tableModel.getItems();
            Collections.sort(itemList, Collections.reverseOrder(Comparator.comparing(Item::getPrice)));
            tableModel.setItems(itemList);
            itemTableBucketPanel.repaint();
            itemTableBucketPanel.revalidate();
        });
        sbg.add(sortReverseByCost);

        itemSortPanel.add(sortByCost);
        itemSortPanel.add(sortReverseByCost);
        return itemSortPanel;
    }

    public JPanel composeTablePanel() {
        itemsTable.addMouseListener(this);
        itemTableBucketPanel.add(new JScrollPane(itemsTable), BorderLayout.CENTER);
        return itemTableBucketPanel;
    }

    public void repaintHeader() {
        String text = "Пользователь: " + session.getCurrentUserName() +
                (!session.isGuest() ? ", товаров в корзине: " +
                        session.getCurrentUser().getBucket().size() : "");
        userLabel.setText(text);
        userLabel.repaint();
        if (session.getCurrentUser().getBucket().size() == 0) {
            buySubmit.setEnabled(false);
        } else {
            buySubmit.setEnabled(true);
        }
    }


    Object[] options = {"В корзину", "К списку товаров"};
    int isOk = JOptionPane.showOptionDialog(MainWindow.this, item, "Информация о товаре",
            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE,
            null, options, options[0]);
                if(isOk ==0)

    {
        session.getCurrentUser().getBucket().addItem(item);
        repaintHeader();
        userLabel.repaint();
    }
}

