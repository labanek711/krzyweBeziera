# krzyweBeziera
Projekt podzielony jest na 3 klasy:
-klasę main

``
package com.company;
public class Main {
    public static void main(String[] args) {
        bezierCurves ex = new bezierCurves();
                ex.setVisible(true);
    }
}
``
-klasę bezierCurves
###
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
###

-klasę algorytmBeziera- w której wszystko się dzieje

W ostatniej klasie wszystkie etapy tworzenia programu mają komentarze. Zacząłem od wyszukanai odpowiednich punktów odpowiadającym moim inicjałom, następnie dodałem moją silnie oraz funkcję pomocniczą do rysowania naszych krzywych beziera. Na koniec zostało nam wyrysować nasze punkty na ekranmie i wywołać funkcję pomocniczą
