package IdoAtalakito;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author Anastasia
 */
public class IdoAtalakito extends JFrame implements  ActionListener{

    JLabel nap1;
    JLabel ora1;
    JLabel perc1;
    JLabel mperc1;
    
    JTextField beirtnap1;
    JTextField beirtperc1;
    JTextField beirtora1;
    JTextField beirtmp1;
    
    JLabel nap2;
    JLabel ora2;
    JLabel perc2;
    JLabel mperc2;
    
    JTextField beirtnap2;
    JTextField beirtperc2;
    JTextField beirtora2;
    JTextField beirtmp2;
    
    JButton button;
    
    JLabel nap3;
    JLabel ora3;
    JLabel perc3;
    JLabel mperc3;
    
    JTextField beirtnap3;
    JTextField beirtperc3;
    JTextField beirtora3;
    JTextField beirtmp3;
    
    JPanel p1;
    JPanel p2;
    JPanel p3;
    JPanel p4;
    
    
    public IdoAtalakito(String title){
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        nap1 = new JLabel("nap");
        ora1 = new JLabel("óra");
        perc1 = new JLabel("perc");
        mperc1 = new JLabel("másodperc");
        
        beirtnap1 = new JTextField(2);
        beirtora1 = new JTextField(2);
        beirtperc1 = new JTextField(2);
        beirtmp1 = new JTextField(2);
        
        nap2 = new JLabel("nap");
        ora2 = new JLabel("óra");
        perc2 = new JLabel("perc");
        mperc2 = new JLabel("másodperc");
        
        beirtnap2 = new JTextField(2);
        beirtora2 = new JTextField(2);
        beirtperc2 = new JTextField(2);
        beirtmp2 = new JTextField(2);
        
        button = new JButton("Számol");
        button.addActionListener(this);
        
        nap3 = new JLabel("nap");
        ora3 = new JLabel("óra");
        perc3 = new JLabel("perc");
        mperc3 = new JLabel("másodperc");
        
        beirtnap3 = new JTextField(2);
        beirtora3 = new JTextField(2);
        beirtperc3 = new JTextField(2);
        beirtmp3 = new JTextField(2);
        
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        
        GridLayout glsor = new GridLayout(1,8);
        GridLayout glbutton = new GridLayout(1,1);
        GridLayout glmain = new GridLayout(4,1);
        
        p1.setLayout(glsor);
        p2.setLayout(glsor);
        p3.setLayout(glbutton);
        p4.setLayout(glsor);
        this.setLayout(glmain);
        
        p1.add(beirtnap1);
        p1.add(nap1);
        p1.add(beirtora1);
        p1.add(ora1);
        p1.add(beirtperc1);
        p1.add(perc1);
        p1.add(beirtmp1);
        p1.add(mperc1);
        
        p2.add(beirtnap2);
        p2.add(nap2);
        p2.add(beirtora2);
        p2.add(ora2);
        p2.add(beirtperc2);
        p2.add(perc2);
        p2.add(beirtmp2);
        p2.add(mperc2);
        
        p3.add(button);
        
        p4.add(beirtnap3);
        p4.add(nap3);
        p4.add(beirtora3);
        p4.add(ora3);
        p4.add(beirtperc3);
        p4.add(perc3);
        p4.add(beirtmp3);
        p4.add(mperc3);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        
        pack();
    }
    
    
        public static void main(String[] args) {
        IdoAtalakito atalakito = new IdoAtalakito("Ido Atalakito");
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        int nap = Integer.parseInt(beirtnap1.getText()) + Integer.parseInt(beirtnap2.getText()); 
        int ora = Integer.parseInt(beirtora1.getText()) + Integer.parseInt(beirtora2.getText()); 
        int perc = Integer.parseInt(beirtperc1.getText()) + Integer.parseInt(beirtperc2.getText()); 
        int mp = Integer.parseInt(beirtmp1.getText()) + Integer.parseInt(beirtmp2.getText());
        
        while(ora>=24 || perc >= 60 || mp >= 60){
            if(mp>=60){
                int plus = mp / 60;
                mp = mp - (60*plus);
                perc++;
            }
            if(perc>=60){
                int plus = perc / 60;
                perc = perc - (60*plus);
                ora++;
            }
            if(ora>=24){
                int plus = ora / 24;
                ora = ora - (24*plus);
                nap++;
            }
        }
        
        beirtnap3.setText(nap + "");
        beirtora3.setText(ora + "");
        beirtperc3.setText(perc + "");
        beirtmp3.setText(mp + "");
    }
    
}
