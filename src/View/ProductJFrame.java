package View;

import Controller.CategoryController;
import Model.Category;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ProductJFrame extends javax.swing.JFrame {

    private CategoryController Controller;

    public ProductJFrame() {
        initComponents();
        Controller = new CategoryController();
        loadTable();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        productPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ds_sanpham = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtDescription = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        btnReset = new java.awt.Button();
        btnSave = new java.awt.Button();
        btnEdit = new java.awt.Button();
        txtName = new javax.swing.JTextField();
        btnDelete1 = new java.awt.Button();
        btnSearch = new java.awt.Button();
        btnBack = new java.awt.Button();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        productPanel.setBackground(new java.awt.Color(255, 255, 255));
        productPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ds_sanpham.setBackground(new java.awt.Color(255, 255, 255));
        ds_sanpham.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        ds_sanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ds_sanphamMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ds_sanpham);

        productPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 790, 220));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("Category_Description");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, -1));

        txtDescription.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtDescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescriptionActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescription, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 180, -1));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Category_Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 20, -1, -1));

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 140, 170, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("Category_ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, -1, -1));

        txtID.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtIDMouseClicked(evt);
            }
        });
        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });
        jPanel1.add(txtID, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 170, -1));

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReset.setLabel("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });
        jPanel1.add(btnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 140, 80, 30));

        btnSave.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSave.setLabel("Save");
        btnSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSaveMouseClicked(evt);
            }
        });
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 80, 30));

        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEdit.setLabel("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });
        jPanel1.add(btnEdit, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, 80, 30));

        txtName.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 170, -1));

        btnDelete1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDelete1.setLabel("Delete");
        btnDelete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelete1MouseClicked(evt);
            }
        });
        jPanel1.add(btnDelete1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 140, 80, 30));

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch.setLabel("Search");
        btnSearch.setName(""); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 100, 80, 30));

        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack.setLabel("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 10, 80, 30));

        productPanel.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 210));

        getContentPane().add(productPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 430));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtDescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDescriptionActionPerformed
    // hàm load lại dữ liệu 
    private void loadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Category ID");
        model.addColumn("Category Name");
        model.addColumn("Category Description");

        for (Category category : Controller.getCategories()) {
            model.addRow(new Object[]{category.getId(), category.getName(), category.getDescription()});
        }

        ds_sanpham.setModel(model);
    }


    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed
    // sử lý cho chức năng save 
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        try {
//            if (txtID.getText().isEmpty()) {
//                throw new NumberFormatException("Category ID cannot be empty");
//            }

            //  int id = Integer.parseInt(txtID.getText());
            String name = txtName.getText();
            String description = txtDescription.getText();

            if (name.isEmpty() || description.isEmpty()) {
                throw new IllegalArgumentException("Category Name and Description cannot be empty");
            }

            Category category = new Category(WIDTH, name, description);
            Controller.addCategory(category);
            loadTable();
            // } catch (NumberFormatException e) {
            // javax.swing.JOptionPane.showMessageDialog(this, "Invalid Category ID: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (Exception e) {
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        try {
            int id = Integer.parseInt(txtID.getText());
            String name = txtName.getText();
            String description = txtDescription.getText();

            Controller.editCategory(id, name, description);
            loadTable();
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnEditMouseClicked
    // sử lí cho chức năng reset
    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        txtID.setText("");
        txtName.setText("");
        txtDescription.setText("");
        txtSearch.setText("");
    }//GEN-LAST:event_btnResetMouseClicked

    // hiển thị danh sách categories    
    private void ds_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ds_sanphamMouseClicked
        int row = ds_sanpham.getSelectedRow();
        txtID.setText(ds_sanpham.getValueAt(row, 0).toString());
        txtName.setText(ds_sanpham.getValueAt(row, 1).toString());
        txtDescription.setText(ds_sanpham.getValueAt(row, 2).toString());
    }//GEN-LAST:event_ds_sanphamMouseClicked

    private void btnDelete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelete1MouseClicked
        try {
            int id = Integer.parseInt(txtID.getText());
            Controller.deleteCategory(id);
            loadTable();
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnDelete1MouseClicked

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        String keyword = txtSearch.getText().trim();
        if (!keyword.isEmpty()) {
            List<Category> searchResults = Controller.searchCategory(keyword);
            if (!searchResults.isEmpty()) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("Category ID");
                model.addColumn("Category Name");
                model.addColumn("Category Description");

                for (Category category : searchResults) {
                    model.addRow(new Object[]{category.getId(), category.getName(), category.getDescription()});
                }
                ds_sanpham.setModel(model);
            } else {
                JOptionPane.showMessageDialog(this, "Không tìm thấy danh mục nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập từ khóa tìm kiếm!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_btnSearchMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.dispose(); // Đóng form hiện tại       
        HomeJFrame homeJFrame = new HomeJFrame();
        homeJFrame.setVisible(true);
    }//GEN-LAST:event_btnBackMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.Button btnBack;
    private java.awt.Button btnDelete1;
    private java.awt.Button btnEdit;
    private java.awt.Button btnReset;
    private java.awt.Button btnSave;
    private java.awt.Button btnSearch;
    private javax.swing.JTable ds_sanpham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel productPanel;
    private javax.swing.JTextField txtDescription;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

}
