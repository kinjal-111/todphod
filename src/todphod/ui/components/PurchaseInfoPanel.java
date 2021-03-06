
package todphod.ui.components;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JLabel;
import static todphod.ui.components.CustomerInfoPanel.HEIGHT;
import static todphod.ui.components.CustomerInfoPanel.WIDTH;


public class PurchaseInfoPanel extends javax.swing.JPanel {
    public static int WIDTH = 965;
    public static int HEIGHT = 50;
    
    private String supplier, product;
    int quantity,  id;
    private double rate;
    
    
    /**
     * Creates new form ProductOrderPanel
     */
    public PurchaseInfoPanel(int id, String supplier, String product, int quantity, double rate) {
        initComponents();
        
        this.id = id;
        this.supplier = supplier;
        this.product = product;
        this.quantity = quantity;
        this.rate = rate;
        
        /// Initializing the labels
        this.jlSupplier.setText(supplier);
        this.jlProduct.setText(product);
        this.jlQuantity.setText(quantity + "");
        this.jlPrice.setText(this.rate + "");
        
        this.setSize(WIDTH, HEIGHT);
        this.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        Color activeColor = new Color(68,151,255);
        Color inactiveColor = new Color(149, 160, 182);
    }

    public JLabel getJbDelete() {
        return jbDelete;
    }

    public void setJbDelete(JLabel jbDelete) {
        this.jbDelete = jbDelete;
    }

    public JLabel getJbEdit() {
        return jbEdit;
    }

    public void setJbEdit(JLabel jbEdit) {
        this.jbEdit = jbEdit;
    }

    public JLabel getJbView() {
        return jbView;
    }

    public void setJbView(JLabel jbView) {
        this.jbView = jbView;
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

        jlSupplier = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jlProduct = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jlQuantity = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jbEdit = new javax.swing.JLabel();
        jbView = new javax.swing.JLabel();
        jbDelete = new javax.swing.JLabel();
        jlPrice = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(253, 253, 253));
        setBorder(new javax.swing.border.LineBorder(new java.awt.Color(235, 238, 242), 1, true));
        setLayout(null);

        jlSupplier.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jlSupplier.setForeground(new java.awt.Color(149, 160, 182));
        jlSupplier.setText("Vinit");
        add(jlSupplier);
        jlSupplier.setBounds(20, 12, 220, 24);

        jSeparator2.setBackground(new java.awt.Color(235, 238, 242));
        jSeparator2.setForeground(new java.awt.Color(235, 238, 242));
        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator2);
        jSeparator2.setBounds(240, 0, 2, 60);

        jlProduct.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jlProduct.setForeground(new java.awt.Color(149, 160, 182));
        jlProduct.setText("882626218");
        add(jlProduct);
        jlProduct.setBounds(260, 12, 210, 24);

        jSeparator3.setBackground(new java.awt.Color(235, 238, 242));
        jSeparator3.setForeground(new java.awt.Color(235, 238, 242));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator3);
        jSeparator3.setBounds(470, 0, 2, 60);

        jlQuantity.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jlQuantity.setForeground(new java.awt.Color(149, 160, 182));
        jlQuantity.setText("1233");
        add(jlQuantity);
        jlQuantity.setBounds(490, 12, 110, 24);

        jSeparator4.setBackground(new java.awt.Color(235, 238, 242));
        jSeparator4.setForeground(new java.awt.Color(235, 238, 242));
        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator4);
        jSeparator4.setBounds(610, 0, 2, 60);

        jbEdit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/data tables/edit.png"))); // NOI18N
        jbEdit.setOpaque(true);
        add(jbEdit);
        jbEdit.setBounds(800, 10, 32, 32);

        jbView.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/data tables/view.png"))); // NOI18N
        jbView.setOpaque(true);
        add(jbView);
        jbView.setBounds(860, 10, 32, 32);

        jbDelete.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jbDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/data tables/delete.png"))); // NOI18N
        jbDelete.setOpaque(true);
        add(jbDelete);
        jbDelete.setBounds(920, 10, 32, 32);

        jlPrice.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jlPrice.setForeground(new java.awt.Color(149, 160, 182));
        jlPrice.setText("1233.000");
        add(jlPrice);
        jlPrice.setBounds(630, 12, 120, 24);

        jSeparator7.setBackground(new java.awt.Color(235, 238, 242));
        jSeparator7.setForeground(new java.awt.Color(235, 238, 242));
        jSeparator7.setOrientation(javax.swing.SwingConstants.VERTICAL);
        add(jSeparator7);
        jSeparator7.setBounds(770, 0, 2, 60);
    }// </editor-fold>//GEN-END:initComponents


    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JLabel jbDelete;
    private javax.swing.JLabel jbEdit;
    private javax.swing.JLabel jbView;
    private javax.swing.JLabel jlPrice;
    private javax.swing.JLabel jlProduct;
    private javax.swing.JLabel jlQuantity;
    private javax.swing.JLabel jlSupplier;
    // End of variables declaration//GEN-END:variables
}
