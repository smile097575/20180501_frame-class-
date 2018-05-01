import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class mainFrame extends JFrame {
        int count =0;
        JButton jbnLow = new JButton("Lower");
        JButton jbnAdd = new JButton("Add");
//        JLabel Jlb = new JLabel();

    public mainFrame(){
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

        this.add(jbnAdd);
        this.add(jbnLow);

        jbnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count++;
                mainFrame.this.setTitle(Integer.toString(count));
            }
        });
        jbnLow.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count--;
                mainFrame.this.setTitle(Integer.toString(count));
            }
        });


    }
}
