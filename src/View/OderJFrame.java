package View;

import Controller.OrderController;
import Model.Order;
import Model.Customer;
import Controller.CustomerController;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class OderJFrame extends javax.swing.JFrame {

    OrderController controller;
    CustomerController CustomerController;

    public OderJFrame() {
        controller = new OrderController();
        CustomerController = new CustomerController();
        initComponents();
        LoadTable();
        loadCustomer();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void LoadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("CustomerId");
        model.addColumn("OrderDate");
        model.addColumn("TotalAmount");
        model.addColumn("Status");

        for (Order oder : controller.getAlltOder()) {
            model.addRow(new Object[]{oder.getId(), oder.getCustomerId(), oder.getOrderDate(), oder.getTotalAmount(), oder.getStatus()});
        }
        ds_sanpham.setModel(model);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtorder_date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtstatus = new javax.swing.JTextField();
        btnSave = new java.awt.Button();
        btnEdit = new java.awt.Button();
        btnDelete1 = new java.awt.Button();
        btnReset = new java.awt.Button();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new java.awt.Button();
        txthire_date = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txttotal_amount = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        btnBack = new java.awt.Button();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ds_sanpham = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ID");

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

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setText("order_date");

        txtorder_date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtorder_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtorder_dateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("status");

        txtstatus.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstatusActionPerformed(evt);
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

        btnEdit.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnEdit.setLabel("Edit");
        btnEdit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEditMouseClicked(evt);
            }
        });

        btnDelete1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnDelete1.setLabel("Delete");
        btnDelete1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnDelete1MouseClicked(evt);
            }
        });

        btnReset.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnReset.setLabel("Reset");
        btnReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnResetMouseClicked(evt);
            }
        });

        txtSearch.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        btnSearch.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnSearch.setLabel("Search");
        btnSearch.setName(""); // NOI18N
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSearchMouseClicked(evt);
            }
        });

        txthire_date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txthire_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txthire_dateActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("total_amount");

        txttotal_amount.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("customer_id");

        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack.setLabel("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtorder_date, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)))))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(202, 202, 202))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(153, 153, 153))))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jLabel2)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txttotal_amount, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtorder_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtstatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(txttotal_amount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSave, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDelete1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtSearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnReset, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(20, 20, 20))
        );

        jPanel3.setBackground(new java.awt.Color(204, 153, 255));

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
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 759, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 40, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 173, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 746, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ds_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ds_sanphamMouseClicked
        int row = ds_sanpham.getSelectedRow();
        txtID.setText(ds_sanpham.getValueAt(row, 0).toString());
        txtorder_date.setText(ds_sanpham.getValueAt(row, 2).toString());
        txttotal_amount.setText(ds_sanpham.getValueAt(row, 3).toString());
        txtstatus.setText(ds_sanpham.getValueAt(row, 4).toString());
        int custommerid = (int) ds_sanpham.getValueAt(row, 1);
        String custommerName = getCustommerNameById(custommerid);

        if (custommerName != null) {
            combobox.setSelectedItem(custommerName);
        } else {
            combobox.setSelectedItem(null);
            System.out.println("Category not found for ID: " + custommerid);
        }
        LoadTable();
    }//GEN-LAST:event_ds_sanphamMouseClicked
    // Phương thức để lấy tên category từ ID 
    private String getCustommerNameById(int id) {
        List<Customer> customers = CustomerController.getAllCustomers();
        for (Customer i : customers) {
            if (i.getId() == id) {
                return i.getFull_name();
            }
        }
        return null;
    }
    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtorder_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtorder_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtorder_dateActionPerformed

    private void txtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstatusActionPerformed
    private void loadCustomer() {
        List<Customer> cus = CustomerController.getAllCustomers();
        combobox.removeAllItems();
        if (cus.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No custommer available");
            return;
        }
        for (Customer i : cus) {
            combobox.addItem(i.getFull_name());
            System.out.println("Added category: " + i.getId());
        }
    }

    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        try {

            String order_date = txtorder_date.getText();
            float total = Float.parseFloat(txttotal_amount.getText());
            String status = txtstatus.getText();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            java.util.Date parsedDate = dateFormat.parse(order_date);  // Chuyển chuỗi ngày thành java.util.Date

            // loadCustomer();
            int selectedIndex = combobox.getSelectedIndex();

            if (selectedIndex == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "hãy chọn 1 custommer_id!");
            } else {
                int custommer_id = CustomerController.getAllCustomers().get(selectedIndex).getId();
                Order oders = new Order(custommer_id, parsedDate, total, status, WIDTH);
                controller.addOrder(oders);
                LoadTable();
            }

            javax.swing.JOptionPane.showMessageDialog(this, "thêm đơn hàng thành công!");

        } catch (ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "order_date không hợp lệ: " + e.getMessage());
        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Tổng số tiền không hợp lệ: " + e.getMessage());
        } catch (HeadlessException e) {

            javax.swing.JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi khi thêm đơn hàng: " + e.getMessage());
        }
    }//GEN-LAST:event_btnSaveMouseClicked

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnEditMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEditMouseClicked
        try {
            String order_date = txtorder_date.getText().trim();
            float total = Float.parseFloat(txttotal_amount.getText().trim());
            String status = txtstatus.getText().trim();

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            java.util.Date parsedDate = dateFormat.parse(order_date);  // Chuyển chuỗi ngày thành java.util.Date

            // loadCustomer();
            int selectedIndex = combobox.getSelectedIndex();

            if (selectedIndex == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "hãy chọn 1 custommer_id!");
            } else {
                int custommer_id = CustomerController.getAllCustomers().get(selectedIndex).getId();
                Order oders = new Order(custommer_id, parsedDate, total, status, WIDTH);
                controller.updateOrder(oders);
                LoadTable();
            }
            javax.swing.JOptionPane.showMessageDialog(this, "Cập nhật nhân viên thành công!");

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Phone number không hợp lệ: " + e.getMessage());
        } catch (ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Hire date không hợp lệ: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnDelete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelete1MouseClicked
        try {
            int id = Integer.parseInt(txtID.getText());
            controller.deleteOrder(id);
            LoadTable();
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnDelete1MouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        txtID.setText("");
        //txtcustomer_id.setText("");
        txtorder_date.setText("");
        txttotal_amount.setText("");
        txtstatus.setText("");
        txthire_date.setText("");
        txtSearch.setText("");
        LoadTable();
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        try {
            int id = Integer.parseInt(txtSearch.getText().trim());
            if (id > 0) {
                List<Order> searchResults = controller.findOrderById(id);
                if (!searchResults.isEmpty()) {
                    DefaultTableModel model = new DefaultTableModel();
                    model.addColumn("id");
                    model.addColumn("CustomerId");
                    model.addColumn("OrderDate");
                    model.addColumn("TotalAmount");
                    model.addColumn("Status");

                    for (Order order : searchResults) {
                        model.addRow(new Object[]{order.getId(), order.getCustomerId(), order.getOrderDate(), order.getTotalAmount(), order.getStatus()});
                    }
                    ds_sanpham.setModel(model);

                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy đơn hàng nào!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }

            } else {
                JOptionPane.showMessageDialog(this, "ID phải lớn hơn 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập một số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void txthire_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txthire_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txthire_dateActionPerformed

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.dispose(); // Đóng form hiện tại       
        HomeJFrame homeJFrame = new HomeJFrame();
        homeJFrame.setVisible(true);
    }//GEN-LAST:event_btnBackMouseClicked

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OderJFrame().setVisible(true);
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
    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JTable ds_sanpham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txthire_date;
    private javax.swing.JTextField txtorder_date;
    private javax.swing.JTextField txtstatus;
    private javax.swing.JTextField txttotal_amount;
    // End of variables declaration//GEN-END:variables
}
