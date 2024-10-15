package View;

import Model.Product;
import Model.Category;
import Controller.CategoryController;
import Controller.ProductController;
import java.awt.HeadlessException;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class SanPhamJFrame extends javax.swing.JFrame {

    ProductController Controller;
    CategoryController controller;

    public SanPhamJFrame() {
        controller = new CategoryController();
        Controller = new ProductController();
        initComponents();
        loadTable();
        loadCategories();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtbrand = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtproduct_name = new javax.swing.JTextField();
        btnSearch = new java.awt.Button();
        txtSearch = new javax.swing.JTextField();
        btnBack = new java.awt.Button();
        btnDelete1 = new java.awt.Button();
        btnEdit = new java.awt.Button();
        btnSave = new java.awt.Button();
        txtmodel = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtproduct_type = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtID = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        txtcondition = new javax.swing.JTextField();
        txtdescription = new javax.swing.JTextField();
        combocategory_id = new javax.swing.JComboBox<>();
        btnReset = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ds_sanpham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(790, 430));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ID");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("product_type");

        txtbrand.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtbrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbrandActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("product_name");

        txtproduct_name.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch.setLabel("Search");
        btnSearch.setName(""); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack.setLabel("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDelete1.setLabel("Delete");
        btnDelete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelete1MouseClicked(evt);
            }
        });

        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEdit.setLabel("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

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

        txtmodel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtmodel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtmodelMouseClicked(evt);
            }
        });
        txtmodel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmodelActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("brand");

        txtproduct_type.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtproduct_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtproduct_typeActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setText("model");

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("price");

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setText("quantity_in_stock");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("description");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel9.setText("category_id");

        jLabel10.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel10.setText("condition");

        txtprice.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtprice.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtpriceMouseClicked(evt);
            }
        });
        txtprice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpriceActionPerformed(evt);
            }
        });

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

        txtquantity.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtquantity.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtquantityMouseClicked(evt);
            }
        });
        txtquantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtquantityActionPerformed(evt);
            }
        });

        txtcondition.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtcondition.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtconditionMouseClicked(evt);
            }
        });
        txtcondition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtconditionActionPerformed(evt);
            }
        });

        txtdescription.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtdescription.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtdescriptionMouseClicked(evt);
            }
        });
        txtdescription.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtdescriptionActionPerformed(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReset.setLabel("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jLabel2))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtproduct_type, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtproduct_name, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(combocategory_id, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel8)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtdescription, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel2Layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtcondition, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel2)
                        .addComponent(txtproduct_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel4)
                            .addComponent(txtproduct_type, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8)
                            .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtdescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel10)
                            .addComponent(txtprice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcondition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(txtquantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combocategory_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

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

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 768, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 157, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 2, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 770, 435));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // hàm load lại dữ liệu 
    private void loadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("product_name");
        model.addColumn("product_type");
        model.addColumn("brand");
        model.addColumn("model");
        model.addColumn("price");
        model.addColumn("quantity_in_stock");
        model.addColumn("description");
        model.addColumn("condition");
        model.addColumn("category_id");

        try {
            for (Product product : Controller.GetProduct()) {
                model.addRow(new Object[]{
                    product.getId(),
                    product.getProductName(),
                    product.getProductType(),
                    product.getBrand(),
                    product.getModel(),
                    product.getPrice(),
                    product.getQuantityInStock(),
                    product.getDescription(),
                    product.getCondition(),
                    product.getCategoryId()});
            }
        } catch (SQLException ex) {
            Logger.getLogger(SanPhamJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        ds_sanpham.setModel(model);
    }
    private void ds_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ds_sanphamMouseClicked
        int row = ds_sanpham.getSelectedRow();
        try {
            txtID.setText(ds_sanpham.getValueAt(row, 0) != null ? ds_sanpham.getValueAt(row, 0).toString() : "");
            txtproduct_name.setText(ds_sanpham.getValueAt(row, 1) != null ? ds_sanpham.getValueAt(row, 1).toString() : "");
            txtproduct_type.setText(ds_sanpham.getValueAt(row, 2) != null ? ds_sanpham.getValueAt(row, 2).toString() : "");
            txtbrand.setText(ds_sanpham.getValueAt(row, 3) != null ? ds_sanpham.getValueAt(row, 3).toString() : "");
            txtmodel.setText(ds_sanpham.getValueAt(row, 4) != null ? ds_sanpham.getValueAt(row, 4).toString() : "");
            txtprice.setText(ds_sanpham.getValueAt(row, 5) != null ? ds_sanpham.getValueAt(row, 5).toString() : "");
            txtquantity.setText(ds_sanpham.getValueAt(row, 6) != null ? ds_sanpham.getValueAt(row, 6).toString() : "");
            txtdescription.setText(ds_sanpham.getValueAt(row, 7) != null ? ds_sanpham.getValueAt(row, 7).toString() : "");
            txtcondition.setText(ds_sanpham.getValueAt(row, 8) != null ? ds_sanpham.getValueAt(row, 8).toString() : "");

            int categoryId = (int) ds_sanpham.getValueAt(row, 9);
            System.out.println("Selected Category ID: " + categoryId);
            String categoryName = getCategoryNameById(categoryId);

            if (categoryName != null) {
                combocategory_id.setSelectedItem(categoryName);
            } else {
                combocategory_id.setSelectedItem(null);
                System.out.println("Category not found for ID: " + categoryId);
            }

        } catch (Exception e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Error retrieving data: " + e.getMessage());
        }
    }

    // Phương thức để lấy tên category từ ID 
    private String getCategoryNameById(int id) {
        List<Category> categories = controller.getCategories();
        for (Category category : categories) {
            if (category.getId() == id) {
                return category.getName();
            }
        }
        return null;
    }//GEN-LAST:event_ds_sanphamMouseClicked

    private void txtbrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbrandActionPerformed
    // phương thức tìm kiếm 
    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        String keyword = txtSearch.getText().trim();
        if (!keyword.isEmpty()) {
            List<Product> searchResults = Controller.searchProductByName(keyword);
            if (!searchResults.isEmpty()) {
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("id");
                model.addColumn("product_name");
                model.addColumn("product_type");
                model.addColumn("brand");
                model.addColumn("model");
                model.addColumn("price");
                model.addColumn("quantity_in_stock");
                model.addColumn("description");
                model.addColumn("condition");
                model.addColumn("category_id");

                for (Product product : searchResults) {
                    model.addRow(new Object[]{
                        product.getId(),
                        product.getProductName(),
                        product.getProductType(),
                        product.getBrand(),
                        product.getModel(),
                        product.getPrice(),
                        product.getQuantityInStock(),
                        product.getDescription(),
                        product.getCondition(),
                        product.getCategoryId()});
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
    //phương thức xóa 
    private void btnDelete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelete1MouseClicked
        try {
            int id = Integer.parseInt(txtID.getText());
            Controller.deleteProduct(id);
            loadTable();
        } catch (NumberFormatException e) {
        }

    }//GEN-LAST:event_btnDelete1MouseClicked
    // phương thức sửa sản phẩm 
    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        try {
            String productName = txtproduct_name.getText().trim();
            String productType = txtproduct_type.getText().trim();
            String brand = txtbrand.getText().trim();
            String model = txtmodel.getText().trim();

            if (txtprice.getText().isEmpty()) {
                throw new NumberFormatException("Price không tồn tại");
            }
            float price = Float.parseFloat(txtprice.getText());

            if (txtquantity.getText().isEmpty()) {
                throw new NumberFormatException("Quantity không tồn tại");
            }
            int quantity = Integer.parseInt(txtquantity.getText());

            String description = txtdescription.getText().trim();
            String condition = txtcondition.getText().trim();

            loadCategories();

            int selectedIndex = combocategory_id.getSelectedIndex();
            if (selectedIndex == -1) {
                throw new IllegalArgumentException("Làm ơn hãy chọn một category_id bất kỳ");
            }
            int categoryID = controller.getCategories().get(selectedIndex).getId();

            if (productName.isEmpty()) {
                throw new IllegalArgumentException("Product Name không tồn tại");
            }

            int id = Integer.parseInt(txtID.getText().trim());
            Product product = new Product(id, productName, productType, brand, model, price, quantity, description, condition, categoryID);

            Controller.updateProduct(product);
            loadTable();
            javax.swing.JOptionPane.showMessageDialog(this, "Sửa sản phẩm thành công!");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid input: " + e.getMessage(), "Lỗi định dạng", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage(), "Lỗi", javax.swing.JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "An error occurred while editing the product.", "Lỗi không xác định", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnEditMouseClicked

    // Phương thức để tải danh sách category vào combobox
    private void loadCategories() {
        List<Category> categories = controller.getCategories();
        //combocategory_id.removeAllItems();
        if (categories.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No categories available");
            return;
        }
        for (Category category : categories) {
            combocategory_id.addItem(category.getName());
            System.out.println("Added category: " + category.getId());
        }
    }

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        try {
            String productname = txtproduct_name.getText();
            String producttype = txtproduct_type.getText();
            String br = txtbrand.getText();
            String model = txtmodel.getText();

            if (txtprice.getText().isEmpty()) {
                throw new NumberFormatException("Price không tồn tại ");
            }
            float price = Float.parseFloat(txtprice.getText());

            if (txtquantity.getText().isEmpty()) {
                throw new NumberFormatException("Quantity không tồn tại ");
            }
            int quantity = Integer.parseInt(txtquantity.getText());

            String description = txtdescription.getText();
            String condition = txtcondition.getText();

            //loadCategories();
            int selectedIndex = combocategory_id.getSelectedIndex();
            if (selectedIndex != -1) {
                int categoryID = controller.getCategories().get(selectedIndex).getId();

                Product product = new Product(WIDTH, productname, producttype, br, model, price, quantity, description, condition, categoryID);

                Controller.addProduct(product);
                loadTable();
                javax.swing.JOptionPane.showMessageDialog(this, "thêm sản phẩm thành công!");
            } else {
                throw new IllegalArgumentException("làm ơn hãy chọn 1 category_id bất kì ");
            }

            if (productname.isEmpty()) {
                throw new IllegalArgumentException("Product Name không tồn tại ");
            }

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Invalid input: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            javax.swing.JOptionPane.showMessageDialog(this, e.getMessage());
        } catch (HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "An error occurred while saving the product.");
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    }//GEN-LAST:event_btnSaveActionPerformed

    private void txtmodelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtmodelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodelMouseClicked

    private void txtmodelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmodelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmodelActionPerformed

    private void txtproduct_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtproduct_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtproduct_typeActionPerformed

    private void txtpriceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtpriceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceMouseClicked

    private void txtpriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpriceActionPerformed

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtquantityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtquantityMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantityMouseClicked

    private void txtquantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtquantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtquantityActionPerformed

    private void txtconditionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtconditionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconditionMouseClicked

    private void txtconditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtconditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtconditionActionPerformed

    private void txtdescriptionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtdescriptionMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescriptionMouseClicked

    private void txtdescriptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtdescriptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtdescriptionActionPerformed

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        txtID.setText("");
        txtproduct_name.setText("");
        txtproduct_type.setText("");
        txtbrand.setText("");
        txtmodel.setText("");
        txtprice.setText("");
        txtquantity.setText("");
        txtdescription.setText("");
        txtcondition.setText("");
        txtSearch.setText("");
        loadTable();
    }//GEN-LAST:event_btnResetMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SanPhamJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SanPhamJFrame().setVisible(true);
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
    private javax.swing.JComboBox<String> combocategory_id;
    private javax.swing.JTable ds_sanpham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtbrand;
    private javax.swing.JTextField txtcondition;
    private javax.swing.JTextField txtdescription;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtproduct_name;
    private javax.swing.JTextField txtproduct_type;
    private javax.swing.JTextField txtquantity;
    // End of variables declaration//GEN-END:variables

}
