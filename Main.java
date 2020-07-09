package ge.itvet;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] arg)
    {
        MyPanel myPanel = new MyPanel();
        JFrame jframe = new JFrame();
        jframe.add(myPanel);
        jframe.setSize(180,300);
        jframe.setTitle("TicTacToe");
        jframe.doLayout();
        jframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jframe.setResizable(false);
        jframe.setVisible(true);
    }
}

