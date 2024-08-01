package Component;

import swing.ButtonOutLine;
import java.awt.Color;
import java.awt.Font;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
public class PanelCover extends javax.swing.JPanel {

    private final DecimalFormat df = new DecimalFormat("##0.###", DecimalFormatSymbols.getInstance(Locale.US)); 
    private ActionListener event;
    private MigLayout layout;
    private JLabel title;
    private JLabel description;
    private JLabel description1;
    private JLabel description2;
    private JLabel description3;
    private ButtonOutLine button;
    private boolean isLogin;
    
    public PanelCover() {
        initComponents();
        setOpaque(false);
        layout = new MigLayout("wrap, fill", "[center]", "push[]push");
        setLayout(layout);
         init();
    }
     private void init() {
        title = new JLabel("Welcome Back!");
        title.setFont(new Font("Times new roman", 1, 30));
        title.setForeground(new Color(245, 245, 245));
        add(title,"y 25%");
        
        description = new JLabel("To keep connected with us please");
        description.setForeground(new Color(245, 245, 245));
        add(description, "y  40%");
        description1 = new JLabel("login with your personal info");
        description1.setForeground(new Color(245, 245, 245));
        add(description1, "y 47%");
        
        description2 = new JLabel("Thank You!");
        description2.setForeground(new Color(245, 245, 245));
        add(description2, "y 54%");
        
        button = new ButtonOutLine();
        button.setBackground(new Color(255, 255, 255));
        button.setForeground(new Color(255, 255, 255));
        button.setText("SIGN IN");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                event.actionPerformed(ae);
            }
        });
        add(button, "w 40%, y 64%");
        description3 = new JLabel("Softwarica");
        description3.setForeground(new Color(245, 245, 245));
        add(description3,"y 93%");
//        title = new JLabel("Softwarica");
//        title.setFont(new Font("Times new roman", 1, 30));
//        title.setForeground(new Color(245, 245, 245));
//        add(title,"w 50% , h 50");
    }
     

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 361, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 307, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    @Override
    protected void paintComponent (Graphics grphcs){
        Graphics2D g2 = (Graphics2D) grphcs;
        GradientPaint gra = new GradientPaint(0 , 0 , new Color(100, 20, 201) , 0 , getHeight() , new Color(100, 20, 201));
        g2.setPaint(gra);
        g2.fillRect(0, 0, getWidth(), getHeight());
        super.paintComponent (grphcs);
    }
    public void addEvent (ActionListener event){
        this.event = event;
    }
    
    public void registerLeft(double v){
        v = Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(title, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0");
       layout.setComponentConstraints(description1, "pad 0 -" + v + "% 0 0");
       layout.setComponentConstraints(description2, "pad 0 " + v + "% 0 " + v + "%");

    }
     public void registerRight(double v) {
        v = Double.valueOf(df.format(v));
        login(false);
        layout.setComponentConstraints(title, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description1, "pad 0 -" + v + "% 0 0");
        layout.setComponentConstraints(description2, "pad 0 " + v + "% 0 " + v + "%");

     
     }

    public void loginLeft(double v) {
        v = Double.valueOf(df.format(v));
        login(true);
        layout.setComponentConstraints(title, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description1, "pad 0 " + v + "% 0 " + v + "%");
                layout.setComponentConstraints(description2, "pad 0 " + v + "% 0 " + v + "%");

    }

    public void loginRight(double v) {
        v = Double.valueOf(df.format(v));
        login(true);
        layout.setComponentConstraints(title, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description1, "pad 0 " + v + "% 0 " + v + "%");
        layout.setComponentConstraints(description2, "pad 0 " + v + "% 0 " + v + "%");
    }

    
    public void login(boolean login) {
        if (this.isLogin != login) {
            if (login) {
                title.setText("New here?");
            
                description.setText("Start journey with us");
                description1.setText("For more information contact:");
                description2.setText("9863039493");
                button.setText("SIGN UP");
            } else {
                title.setText("Welcome Back!");
                description.setText("To keep connected with us please");
                description1.setText("login with your personal info");
                description2.setText("Thank You!!");
                button.setText("SIGN IN");
            }
            this.isLogin = login;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
