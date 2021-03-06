
package todphod.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import static jdk.nashorn.internal.objects.NativeMath.round;
import static todphod.ui.components.ProductInfoPanel.HEIGHT;
import static todphod.ui.components.ProductInfoPanel.WIDTH;

public class ReportInfoPanel extends javax.swing.JPanel {

    private int id;
    private String customerName;
    private int productCount;
    double price;
    private double GST ,totalPrice;
    
    DecimalFormat formatter;
    public static final int WIDTH = 965;
    private static final int HEIGHT = 50;
    /**
     * Creates new form ReportInfoPanel
     */
    public ReportInfoPanel(int id, String customer, int productCount, double totalPrice) {
        initComponents();
        this.id = id;
        this.customerName = customer;
        this.productCount = productCount;
        this.totalPrice = totalPrice;
        this.GST = totalPrice / 9.3;
        this.price = this.totalPrice - this.GST;
        formatter = new DecimalFormat("#0.00");

        this.jlCustomer.setText(this.customerName + "");
        this.jlCount.setText(this.productCount + "");
        this.jlGST.setText(formatter.format(GST)+ "");
        this.jlPrice.setText(formatter.format(this.price)+ "");
        this.jlTotalAmount.setText(formatter.format(totalPrice) + "");
        
        
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        Color activeColor = new Color(68,151,255);
        Color inactiveColor = new Color(149, 160, 182);
        this.setVisible(true);
        this.setSize(WIDTH, HEIGHT);
    }
    
    public int getId() {
        return id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCustomer = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jlCount = new javax.swing.JLabel();
        jlPrice = new javax.swing.JLabel();
        jlGST = new javax.swing.JLabel();
        jlTotalAmount = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(null);

        jlCustomer.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jlCustomer.setForeground(new java.awt.Color(149, 160, 182));
        jlCustomer.setText("Customer:Vinit");
        add(jlCustomer);
        jlCustomer.setBounds(10, 10, 210, 30);

        jSeparator3.setBackground(new java.awt.Color(235, 238, 242));
        jSeparator3.setForeground(new java.awt.Color(235, 238, 242));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3);
        jSeparator3.setBounds(240, 0, 2, 60);

        jSeparator4.setBackground(new java.awt.Color(235, 238, 242));
        jSeparator4.setForeground(new java.awt.Color(235, 238, 242));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4);
        jSeparator4.setBounds(550, 0, 10, 60);

        jSeparator5.setBackground(new java.awt.Color(235, 238, 242));
        jSeparator5.setForeground(new java.awt.Color(235, 238, 242));
        jSeparator5.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator5);
        jSeparator5.setBounds(360, 0, 10, 60);

        jSeparator6.setBackground(new java.awt.Color(235, 238, 242));
        jSeparator6.setForeground(new java.awt.Color(235, 238, 242));
        jSeparator6.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator6);
        jSeparator6.setBounds(680, 0, 10, 60);

        jlCount.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jlCount.setForeground(new java.awt.Color(149, 160, 182));
        jlCount.setText("Qty:99");
        add(jlCount);
        jlCount.setBounds(250, 10, 70, 30);

        jlPrice.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jlPrice.setForeground(new java.awt.Color(149, 160, 182));
        jlPrice.setText("Price:1233.00");
        add(jlPrice);
        jlPrice.setBounds(380, 10, 130, 30);

        jlGST.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jlGST.setForeground(new java.awt.Color(149, 160, 182));
        jlGST.setText("GST:129");
        add(jlGST);
        jlGST.setBounds(570, 10, 90, 30);

        jlTotalAmount.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jlTotalAmount.setForeground(new java.awt.Color(149, 160, 182));
        jlTotalAmount.setText("Total Amount :1.33");
        add(jlTotalAmount);
        jlTotalAmount.setBounds(700, 10, 190, 30);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel jlCount;
    private javax.swing.JLabel jlCustomer;
    private javax.swing.JLabel jlGST;
    private javax.swing.JLabel jlPrice;
    private javax.swing.JLabel jlTotalAmount;
    // End of variables declaration//GEN-END:variables
}
