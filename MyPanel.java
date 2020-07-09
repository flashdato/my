import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyPanel extends JPanel {
     private static int turn=0;
     JLabel label = new JLabel("End");
      JButton[] jButtons = new JButton[9];
//    JButton jButton1 = new JButton(" ");
//    JButton jButton2 = new JButton(" ");
//    JButton jButton3 = new JButton(" ");
//    JButton jButton4 = new JButton(" ");
//    JButton jButton5 = new JButton(" ");
//    JButton jButton6 = new JButton(" ");
//    JButton jButton7 = new JButton(" ");
//    JButton jButton8 = new JButton(" ");
//    JButton jButton9 = new JButton(" ");
    {
        for (int i = 0; i < 9 ; i++) {
            jButtons[i]= new JButton();
           jButtons[i].setFont(new Font("Arial",Font.BOLD,100));
        }
        int counter =0;
        setLayout(new GridBagLayout());
        for (int i = 0; i < 3; i++) {
        for (int j=0; j < 3; j++) {
            if(counter<9){
            add(j,i,jButtons[counter]);
            jButtons[counter].addActionListener(this::actionPerformed);
            jButtons[counter++].setPreferredSize(new Dimension(250,250));
            }
        }}

//        add(0,0,jButton1);
//        add(1,0,jButton2);
//        add(2,0,jButton3);
//        add(0,1,jButton4);
//        add(1,1,jButton5);
//        add(2,1,jButton6);
//        add(0,2,jButton7);
//        add(1,2,jButton8);
//        add(2,2,jButton9);
//        jButton1.addActionListener(this::actionPerformed1);
//        jButton2.addActionListener(this::actionPerformed2);
//        jButton3.addActionListener(this::actionPerformed3);
//        jButton4.addActionListener(this::actionPerformed4);
//        jButton5.addActionListener(this::actionPerformed5);
//        jButton6.addActionListener(this::actionPerformed6);
//        jButton7.addActionListener(this::actionPerformed7);
//        jButton8.addActionListener(this::actionPerformed8);
//        jButton9.addActionListener(this::actionPerformed9);
//        jButton1.setPreferredSize(new Dimension(250,250));
//        jButton2.setPreferredSize(new Dimension(250,250));
//        jButton3.setPreferredSize(new Dimension(250,250));
//        jButton4.setPreferredSize(new Dimension(250,250));
//        jButton5.setPreferredSize(new Dimension(250,250));
//        jButton6.setPreferredSize(new Dimension(250,250));
//        jButton7.setPreferredSize(new Dimension(250,250));
//        jButton8.setPreferredSize(new Dimension(250,250));
//        jButton9.setPreferredSize(new Dimension(250,250));


    }
    public void add(int x,int y,Component comp) {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = x;
        gbc.gridy = y;
        add(comp,gbc);
    }
        public void actionPerformed(ActionEvent e){
        JButton button = (JButton) e.getSource();
        if (turn%2==0) button.setText("X");
        else  button.setText("O");turn++;
            button.setEnabled(false);
            Check(ifwon(jButtons));
    }
    public boolean ifwon(JButton[] buttons)
    {
        for (int i = 0; i < 3; i++) {
            if (buttons[i] == buttons[i+1] && buttons[i+1] == buttons[i+2])
               return true;
        }
        return false;
    }
    public void Check(boolean b)
    {
        if(b) {
            label.setFont(new Font("Arial",Font.BOLD,100));
            add(label);

        }
    }
//    public void actionPerformed1(ActionEvent e)
//    {
//        if (counter%2==0) jButton1.setText("X");
//        else jButton1.setText("O");counter++;
//        jButton1.setEnabled(false);
//    }
//    public void actionPerformed2(ActionEvent e)
//    {
//        if (counter%2==0) jButton2.setText("X");
//        else jButton2.setText("O"); counter++;
//        jButton2.setEnabled(false);
//    }
//    public void actionPerformed3(ActionEvent e)
//    {
//        if (counter%2==0) jButton3.setText("X");
//        else jButton3.setText("O"); counter++;
//        jButton3.setEnabled(false);
//    }
//    public void actionPerformed4(ActionEvent e)
//    {
//        if (counter%2==0) jButton4.setText("X");
//        else jButton4.setText("O"); counter++;
//        jButton4.setEnabled(false);
//    }
//    public void actionPerformed5(ActionEvent e)
//    {
//        if (counter%2==0) jButton5.setText("X");
//        else jButton5.setText("O"); counter++;
//        jButton5.setEnabled(false);
//    }
//    public void actionPerformed6(ActionEvent e)
//    {
//        if (counter%2==0) jButton6.setText("X");
//        else jButton6.setText("O"); counter++;
//        jButton6.setEnabled(false);
//    }
//    public void actionPerformed7(ActionEvent e)
//    {
//        if (counter%2==0) jButton7.setText("X");
//        else jButton7.setText("O"); counter++;
//        jButton7.setEnabled(false);
//    }
//    public void actionPerformed8(ActionEvent e)
//    {
//        if (counter%2==0) jButton8.setText("X");
//        else jButton8.setText("O"); counter++;
//        jButton8.setEnabled(false);
//    }
//    public void actionPerformed9(ActionEvent e)
//    {
//        if (counter%2==0) jButton9.setText("X");
//        else jButton9.setText("O"); counter++;
//        jButton9.setEnabled(false);
//    }

}