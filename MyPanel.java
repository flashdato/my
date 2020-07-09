package ge.itvet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyPanel extends JPanel {
    private static int counter =0;
  //  JButton[] jButtons = new JButton[12];
    JButton jButton1 = new JButton("1");
    JButton jButton2 = new JButton("2");
    JButton jButton3 = new JButton("3");
    JButton jButton4 = new JButton("4");
    JButton jButton5 = new JButton("5");
    JButton jButton6 = new JButton("6");
    JButton jButton7 = new JButton("7");
    JButton jButton8 = new JButton("8");
    JButton jButton9 = new JButton("9");
    {
        setLayout(new GridBagLayout());
//        setLayout(new FlowLayout());
//        for (int i=0; i < 10; i++) {
//            jButtons[i]= new JButton(String.valueOf(i));
//            add(jButtons[i]);
//            jButtons[i].addActionListener(this::actionPerformed);
//        }

        add(0,0,jButton1);
        add(1,0,jButton2);
        add(2,0,jButton3);
        add(0,1,jButton4);
        add(1,1,jButton5);
        add(2,1,jButton6);
        add(0,2,jButton7);
        add(1,2,jButton8);
        add(2,2,jButton9);
        jButton1.addActionListener(this::actionPerformed1);
        jButton2.addActionListener(this::actionPerformed2);
        jButton3.addActionListener(this::actionPerformed3);
        jButton4.addActionListener(this::actionPerformed4);
        jButton5.addActionListener(this::actionPerformed5);
        jButton6.addActionListener(this::actionPerformed6);
        jButton7.addActionListener(this::actionPerformed7);
        jButton8.addActionListener(this::actionPerformed8);
        jButton9.addActionListener(this::actionPerformed9);
    }
    public void add(int x,int y,Component comp) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        add(comp,gbc);
   }
//    public void actionPerformed(ActionEvent e){
//        if (counter%2==0) jButtons[i].setText("X");
//        else jButtons[i].setText("O");counter++;
//        jButtons[i].removeActionListener(this::actionPerformed);}
    public void actionPerformed1(ActionEvent e)
    {
        if (counter%2==0) jButton1.setText("X");
        else jButton1.setText("O");counter++;
        jButton1.removeActionListener(this::actionPerformed1);
        doLayout();
    }
    public void actionPerformed2(ActionEvent e)
    {
        if (counter%2==0) jButton2.setText("X");
        else jButton2.setText("O"); counter++;
        jButton2.removeActionListener(this::actionPerformed2);
    }
    public void actionPerformed3(ActionEvent e)
    {
        if (counter%2==0) jButton3.setText("X");
        else jButton3.setText("O"); counter++;
        jButton3.removeActionListener(this::actionPerformed3);
    }
    public void actionPerformed4(ActionEvent e)
    {
        if (counter%2==0) jButton4.setText("X");
        else jButton4.setText("O"); counter++;
        jButton4.removeActionListener(this::actionPerformed4);
    }
    public void actionPerformed5(ActionEvent e)
    {
        if (counter%2==0) jButton5.setText("X");
        else jButton5.setText("O"); counter++;
        jButton5.removeActionListener(this::actionPerformed5);
    }
    public void actionPerformed6(ActionEvent e)
    {
        if (counter%2==0) jButton6.setText("X");
        else jButton6.setText("O"); counter++;
        jButton6.removeActionListener(this::actionPerformed6);
    }
    public void actionPerformed7(ActionEvent e)
    {
        if (counter%2==0) jButton7.setText("X");
        else jButton7.setText("O"); counter++;
        jButton7.removeActionListener(this::actionPerformed7);
    }
    public void actionPerformed8(ActionEvent e)
    {
        if (counter%2==0) jButton8.setText("X");
        else jButton8.setText("O"); counter++;
        jButton8.removeActionListener(this::actionPerformed8);
    }
    public void actionPerformed9(ActionEvent e)
    {
        if (counter%2==0) jButton9.setText("X");
        else jButton9.setText("O"); counter++;
        jButton9.removeActionListener(this::actionPerformed9);
    }

}
