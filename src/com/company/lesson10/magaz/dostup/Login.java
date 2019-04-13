package com.company.lesson10.magaz.dostup;

import javax.swing.*;
import java.awt.*;

public class Login extends JDialog {
    private static Login loginDlg;
    private JButton submit;
    private JPanel rootPanel;
    private JLabel loginLabel;
    private JLabel passwordLabel;
    private JLabel confirmLabel;
    private static JTextField login;
    private static JTextField password;
    private static JTextField confirm;

    private MainWindow parent;

        private Login(MainWindow parent) {
        this.parent = parent;
        createLabels();
        createTextFields();
        createButton();
        createPanel();
        add(rootPanel);
        add(submit);
        createFrame();
    }

    public static Login instance(MainWindow parent) {
        if (loginDlg == null) {
            loginDlg = new Login(parent);
        }
        login.setText("");
        password.setText("");
        confirm.setText("");
        return loginDlg;
    }

    private void createFrame() {
        setTitle("Авторизация");
        setSize(300, 120);
        setLocationRelativeTo(null);
        setResizable(false);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
    }

    private void createLabels() {
        loginLabel = new JLabel("  Логин:");
        passwordLabel = new JLabel("  Пароль:");
        confirmLabel = new JLabel("  Подтвердите пароль:");
    }

    private void createTextFields() {
        login = new JTextField(15);
        password = new JPasswordField(15);
        confirm = new JPasswordField(15);
        textFieldsAlignment(CENTER_ALIGNMENT, login, password, confirm);
    }

    private void textFieldsAlignment(final float alignment, JTextField... fields) {
        for (JTextField field : fields) {
            field.setHorizontalAlignment((int) alignment);
        }
    }

    private void createButton() {
        submit = new JButton("submit");
    }

    private void createPanel() {
        rootPanel = new JPanel(new GridLayout(3, 1));
        rootPanel.add(loginLabel);
        rootPanel.add(login);
        rootPanel.add(passwordLabel);
        rootPanel.add(password);
        rootPanel.add(confirmLabel);
        rootPanel.add(confirm);
    }

}

