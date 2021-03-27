package com.company;
import javax.swing.*;

class bezierCurves extends JFrame {

    public bezierCurves() {
        initUI();
    }

    private void initUI() {
        setTitle("Krzywe Beziera");
        setSize(700, 600);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(new algorytmBeziera());
    }
}