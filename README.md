# krzyweBeziera
Projekt podzielony jest na 3 klasy:|
##-klasę main
###
package com.company;

public class Main {
    public static void main(String[] args) {

        bezierCurves ex = new bezierCurves();
                ex.setVisible(true);

    }
}
###
##-klasę bezierCurves
package com.company;
import javax.swing.*;
###
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
##-klasę algorytmBeziera- w której wszystko się dzieje
###
package com.company;
import javax.swing.*;
import java.awt.*;

public class algorytmBeziera extends JPanel {

//     inicjalizacja punktów
    private final int[] px1={195,91,90};
    private final int[] py1={275,257,272};
    private final int[] px2={89,127,112};
    private final int[] py2={287,30,28};
    private final int[] px3={97,231,280};
    private final int[] py3={26,9,53};
    private final int[] px4={281,322,198};
    private final int[] py4={56,153,127};
    private final int[] px5={183,211,206};
    private final int[] py5={124,283,269};
    private final int[] px6={201,239,224};
    private final int[] py6={255,336,336};
    private final int[] px7={209,328,326};
    private final int[] py7={336,297,312};
    private final int[] px8={324,350,335};
    private final int[] py8={327,203,203};
    private final int[] px9={320,430,428};
    private final int[] py9={203,220,205};
    private final int[] px10={426,424,410};
    private final int[] py10={190,317,313};
    private final int[] px11={396,511,508};
    private final int[] py11={309,316,301};
    private final int[] px12={505,505,490};
    private final int[] py12={286,373,372};
    private final int[] px13={475,406,403};
    private final int[] py13={371,378,363};
    private final int[] px14={400,416,401};
    private final int[] py14={348,422,421};
    private final int[] px15={386,564,561};
    private final int[] py15={420,445,430};
    private final int[] px16={558,588,573};
    private final int[] py16={415,488,489 };
    private final int[] px17={558,312,310 };
    private final int[] py17={490,457,472 };
    private final int[] px18={308 ,338,323 };
    private final int[] py18={487,374,373 };
    private final int[] px19={308,250,246 };
    private final int[] py19={372,364,378 };
    private final int[] px20={242,215,211 };
    private final int[] py20={392,267,281 };
    private final int[] px21={162,258,174 };
    private final int[] py21={40,97,97 };
    private final int[] px22={164,176,165 };
    private final int[] py22={97,42,52 };

    private static double iksy;
    private static double igreki;

// po prostu silnia tylko nazwana STRONG
    static int strong(int i) {
        if (i == 0)
            return 1;
        else
            return i * strong(i - 1);
    }
// funkcja pomocnicza do rysowania naszych krzywych beziera
        public static void rysujPkt(int[] x,int[] y,Graphics g2d){
            float t;
            for (t = 0; t < 1; t += 0.0005) {
                iksy = 0;
                igreki = 0;

                for (int i = 0; i < x.length; i++) {
                    iksy += ((strong(x.length - 1)) / (strong(i) * strong(x.length - 1 - i))) * Math.pow(1 - t, x.length - 1 - i) * Math.pow(t, i) * x[i];
                    igreki += ((strong(x.length - 1)) / (strong(i) * strong(x.length - 1 - i))) * Math.pow(1 - t, x.length - 1 - i) * Math.pow(t, i) * y[i];
                }
                g2d.drawLine((int) iksy, (int)igreki, (int)iksy, (int)igreki);
            }

        }


//rysowanie elementow na ekranie
    public void doDrawing(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setPaint(Color.BLACK);
        g2d.drawOval(2,2,2,2);
        g2d.fillRect(0, 0, 10000, 10000);
        g2d.setPaint(Color.WHITE);
        g2d.setStroke(new BasicStroke(16));

//wywolanie funkcji pomocniczej
        rysujPkt(px1,py1,g);
        rysujPkt(px2,py2,g);
        rysujPkt(px3,py3,g);
        rysujPkt(px4,py4,g);
        rysujPkt(px5,py5,g);
        rysujPkt(px6,py6,g);
        rysujPkt(px7,py7,g);
        rysujPkt(px8,py8,g);
        rysujPkt(px9,py9,g);
        rysujPkt(px10,py10,g);
        rysujPkt(px11,py11,g);
        rysujPkt(px12,py12,g);
        rysujPkt(px13,py13,g);
        rysujPkt(px14,py14,g);
        rysujPkt(px15,py15,g);
        rysujPkt(px16,py16,g);
        rysujPkt(px17,py17,g);
        rysujPkt(px18,py18,g);
        rysujPkt(px19,py19,g);
        rysujPkt(px20,py20,g);
        rysujPkt(px21,py21,g);
        rysujPkt(px22,py22,g);
    }

    @Override
    public void paintComponent(Graphics g2d)  {

        super.paintComponent(g2d);
        doDrawing(g2d);
    }
}
###
