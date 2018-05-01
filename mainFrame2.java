import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame2 extends JFrame {
    private int x =50;

    private JButton jbnAdd = new JButton("<----");
    private JButton jbnLow = new JButton("---->");
    private JLabel jlb = new JLabel("^__^");
    private JTextField jtf = new JTextField();

    public mainFrame2(){
        Ex1();
    }
    private void Ex1(){

        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocation(100,50);
        this.setSize(800,600);
        jbnAdd.setLocation(50,60);
        jbnLow.setLocation(50,120);
        jbnAdd.setSize(120,30);
        jbnLow.setSize(120,30);
        jlb.setBounds(50,150,100,100);
        jtf.setBounds(100,200,100,50);

        this.add(jbnAdd);
        this.add(jbnLow);
        this.add(jlb);
        this.add(jtf);

        jbnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x-=Integer.parseInt(jtf.getText());
                jlb.setLocation(x,150);
            }
        });
        jbnLow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x+=Integer.parseInt(jtf.getText());
                jlb.setLocation(x,150);
            }
        });


    }
}
