package com.company.lesson10.magaz;

import com.company.lesson10.magaz.gui.MainWindow;

import javax.swing.*;

public class Launcher {

    public final static String splitter = "\\";

    public static void main(String[] args) {
        JFrame.setDefaultLookAndFeelDecorated(true);
        new MainWindow();
    }
}
