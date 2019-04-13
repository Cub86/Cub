package com.company.lesson10.magaz.dostup;

import javax.swing.*;

public class BucketMenu extends JFrame {
    private MainWindow parent;
    private JPanel rootPanel = new JPanel();
    private JPanel bottomPanel = new JPanel();
    private JTable bucketTable = new JTable();
    private JButton btnClear = new JButton("Очистить корзину");
    private JButton btnBuy = new JButton("Оформить покупку");
    private JButton btnCancel = new JButton("К списку товаров");

    private JPanel rootPanel() {
        bottomPanel.add(btnBuy);
        bottomPanel.add(btnClear);
        bottomPanel.add(btnCancel);
        createTable(bucketTable);
        rootPanel.add(new JScrollPane(bucketTable));
        rootPanel.add(bottomPanel);
        return rootPanel;
    }

    private void createTable(JTable table) {
        String[] columns = {"№", "Наименование товара", "Количество, шт", "Цена, грн", "Стоимость, грн"};
        Bucket bucket = parent.getSession().getCurrentUser().getBucket();
        Object[][] data = new Object[bucket.getItems().size() + 1][];
        int count = 0;
        double itemTotalCost = 0.0;
        double allTotalCost = 0.0;

        data[count] = new Object[]{"", "", "", "Итого:", allTotalCost};
        bucketTable.setModel(new DefaultTableModel(data, columns));
        bucketTable.getColumnModel().getColumn(0).setPreferredWidth(40);
        bucketTable.getColumnModel().getColumn(1).setPreferredWidth(460);
        bucketTable.getColumnModel().getColumn(2).setPreferredWidth(100);
        bucketTable.getColumnModel().getColumn(3).setPreferredWidth(100);
        bucketTable.getColumnModel().getColumn(4).setPreferredWidth(100);
    }

}
