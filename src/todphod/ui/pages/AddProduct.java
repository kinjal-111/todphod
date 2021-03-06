
package todphod.ui.pages;

import ca.odell.glazedlists.GlazedLists;
import ca.odell.glazedlists.swing.AutoCompleteSupport;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import net.coobird.thumbnailator.Thumbnailator;
import todphod.core.Category;
import todphod.core.ImageUtils;
import todphod.core.Product;
import todphod.ui.UIUtils;

public class AddProduct extends javax.swing.JPanel {
    private Map<String, Integer> categories;
    private BufferedImage bufferedImage;
    
    /**
     * Creates new form AddCustomer
     */
    public AddProduct() {
        initComponents();
        this.setSize(1090, 750);
        
        this.getAllCategories();
        this.customInitComponents();
    }
    
    private void getAllCategories() {
        this.categories = new HashMap<>();
        Category category = new Category();
        Map<Integer, Category> categoryMap = category.getAllCategories();
        
        String categories[] = new String[categoryMap.keySet().size()];
        int index = 0;
        for(Map.Entry<Integer, Category> categoryEntry : categoryMap.entrySet()) {
            String name = categoryEntry.getValue().getCategoryName();
            int id = categoryEntry.getKey();
            
            categories[index++] = name;
            this.categories.put(name, id);
        }
        
        AutoCompleteSupport.install(this.jcbCategories, GlazedLists.eventListOf(categories));
    }
    
    private void customInitComponents() {
        UIUtils.configureTextField(jtfProductSellingPrice);
        UIUtils.configureTextField(jtfProductQuantity);
        UIUtils.configureTextField(jtfProductName);
        UIUtils.configureTextField(jtfProductEOQLevel);
        UIUtils.configureTextField(jtfProductSize);
        
        UIUtils.setIcon(this.jLabel2, "save");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jtfProductQuantity = new org.uikit.MaterialJTextField();
        jtfProductName = new org.uikit.MaterialJTextField();
        jtfProductEOQLevel = new org.uikit.MaterialJTextField();
        jtfProductSize = new org.uikit.MaterialJTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jcbCategories = new org.uikit.KeyValueJComboBox();
        jtfProductSellingPrice = new org.uikit.MaterialJTextField();
        jbBrowse2 = new javax.swing.JButton();
        jlImage = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Raleway", 0, 32)); // NOI18N
        jLabel1.setText("Add Product");

        jtfProductQuantity.setLabelText("Product Quantity : ");
        jtfProductQuantity.setPlaceholderText("Enter the product quantity : ");
        jtfProductQuantity.setPreferredSize(new java.awt.Dimension(961, 81));

        jtfProductName.setLabelText("Product Name : ");
        jtfProductName.setPlaceholderText("Enter the product name : ");
        jtfProductName.setPreferredSize(new java.awt.Dimension(435, 81));

        jtfProductEOQLevel.setLabelText("Product EOQ Level : ");
        jtfProductEOQLevel.setPlaceholderText("Enter the product EOQ Level : ");
        jtfProductEOQLevel.setPreferredSize(new java.awt.Dimension(435, 81));

        jtfProductSize.setLabelText("Product Size : ");
        jtfProductSize.setPlaceholderText("Enter the product's size : ");
        jtfProductSize.setPreferredSize(new java.awt.Dimension(435, 81));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/buttons/save.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Raleway", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(149, 160, 182));
        jLabel3.setText("Select Category of Product : ");

        jtfProductSellingPrice.setLabelText("Product Selling Price : ");
        jtfProductSellingPrice.setPlaceholderText("Enter the product selling price : ");

        jbBrowse2.setBackground(new java.awt.Color(255, 255, 255));
        jbBrowse2.setFont(new java.awt.Font("Open Sans", 0, 18)); // NOI18N
        jbBrowse2.setForeground(new java.awt.Color(6, 207, 255));
        jbBrowse2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/buttons/select_image.png"))); // NOI18N
        jbBrowse2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jbBrowse2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/buttons/select_image_hover.png"))); // NOI18N
        jbBrowse2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jbBrowse2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jbBrowse2MouseExited(evt);
            }
        });
        jbBrowse2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBrowse2ActionPerformed(evt);
            }
        });

        jlImage.setBackground(new java.awt.Color(187, 187, 187));
        jlImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlImage.setText("Select a image");
        jlImage.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jtfProductEOQLevel, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(92, 92, 92)
                                .addComponent(jtfProductSize, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jlImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbBrowse2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jtfProductQuantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbCategories, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jtfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(92, 92, 92)
                                        .addComponent(jtfProductSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE)))))
                        .addGap(74, 74, 74))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtfProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jcbCategories, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtfProductQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfProductEOQLevel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtfProductSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtfProductSellingPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jlImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbBrowse2)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MousePressed
        int categoryId = (this.categories.get(this.jcbCategories.getSelectedItem().toString()) == null ? -1 : this.categories.get(this.jcbCategories.getSelectedItem().toString()) );
        String name = this.jtfProductName.getjTextField().getText();
        String quantity = this.jtfProductQuantity.getjTextField().getText();
        String sellingPrice =  this.jtfProductSellingPrice.getjTextField().getText();
        String eoqLevel = this.jtfProductEOQLevel.getjTextField().getText();
        String size = this.jtfProductSize.getjTextField().getText();
        
        
        if(categoryId == -1) {
            JOptionPane.showMessageDialog(this, "Please select the correct category");
            return;
        } 
        if(name.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the name of the product");
            return;
        }
        if(quantity.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the quantity of the product.");
            return;
        }
        if(sellingPrice.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the selling price of the product");
            return;
        }
        if(eoqLevel.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the EOQ Level of the product.");
            return;
        }
        if(size.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please provide the size of the product");
            return;
        }
        if(!quantity.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "The quantity should be numeric.");
            return;
        }
        if(!sellingPrice.matches("[\\d\\.]+")) {
            JOptionPane.showMessageDialog(this, "The selling price should be decimal only.");
            return;
        }
        if(!eoqLevel.matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "The EOQ Level should be numeric.");
            return;
        }
        
        Product product = new Product();
        
        ArrayList<String> values = new ArrayList<>();
        values.add(categoryId + "");
        values.add(name);
        values.add(quantity);
        values.add(sellingPrice);
        values.add(eoqLevel);
        values.add(size);
        

        int id = product.insert(values, ImageUtils.toBytes(this.bufferedImage));
        if(id != -1) {
            JOptionPane.showMessageDialog(this, "Product Added successfully");
        }
    }//GEN-LAST:event_jLabel2MousePressed

    private void jbBrowse2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBrowse2ActionPerformed
        JFileChooser jfc = new JFileChooser();
        FileFilter imageFilter = new FileNameExtensionFilter("Image files", ImageIO.getReaderFileSuffixes());
        jfc.addChoosableFileFilter(imageFilter);
        jfc.setAcceptAllFileFilterUsed(false);
        jfc.showOpenDialog(this);
        File selectedFile = jfc.getSelectedFile();
        if(selectedFile != null) {
            try {
                BufferedImage bufferedImage = ImageIO.read(selectedFile);
                this.bufferedImage = bufferedImage;
                this.bufferedImage = Thumbnailator.createThumbnail(this.bufferedImage, 150, 180);
                this.jlImage.setIcon(new ImageIcon(bufferedImage));
                this.jlImage.setText("");
                this.jlImage.setBackground(Color.white);
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            this.jlImage.setIcon(null);
            this.jlImage.setText("Select a Image");
            this.jlImage.setBackground(new Color(233,233,233));
        }
    }//GEN-LAST:event_jbBrowse2ActionPerformed

    private void jbBrowse2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBrowse2MouseEntered
        // TODO add your handling code here:
        jbBrowse2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/buttons/select_image_hover.png")));
    }//GEN-LAST:event_jbBrowse2MouseEntered

    private void jbBrowse2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbBrowse2MouseExited
        // TODO add your handling code here:
        jbBrowse2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/buttons/select_image.png")));
    }//GEN-LAST:event_jbBrowse2MouseExited

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        // TODO add your handling code here:
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/buttons/save_hover.png")));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        // TODO add your handling code here:
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendor/images/buttons/save.png")));
    }//GEN-LAST:event_jLabel2MouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton jbBrowse2;
    private org.uikit.KeyValueJComboBox jcbCategories;
    private javax.swing.JLabel jlImage;
    private org.uikit.MaterialJTextField jtfProductEOQLevel;
    private org.uikit.MaterialJTextField jtfProductName;
    private org.uikit.MaterialJTextField jtfProductQuantity;
    private org.uikit.MaterialJTextField jtfProductSellingPrice;
    private org.uikit.MaterialJTextField jtfProductSize;
    // End of variables declaration//GEN-END:variables
}
