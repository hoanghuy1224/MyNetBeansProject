package View;

import Controller.PaymentController;
import Controller.OrderController;
import Model.Order;
import Model.Payment;
import java.awt.HeadlessException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class PaymentJFrame extends javax.swing.JFrame {

    PaymentController controller;
    OrderController controll;

    public PaymentJFrame() {
        controller = new PaymentController();
        controll = new OrderController();
        initComponents();
        LoadTable();
        loadOrder();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    private void LoadTable() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("order_id");
        model.addColumn("Payment_date");
        model.addColumn("Payment_method");
        model.addColumn("Amount_paid");

        double totalAmountPaid = 0;
        for (Payment pay : controller.getAllPayment()) {
            model.addRow(new Object[]{
                pay.getId(),
                pay.getOrder_id(),
                pay.getPayment_date(),
                pay.getPayment_method(),
                pay.getAmount_paid()
            });
            totalAmountPaid += pay.getAmount_paid();
        }
        model.addRow(new Object[]{
            null,
            null,
            null,
            "Total Amount:",
            totalAmountPaid
        });

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
        txtpayment_date = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtamount_paid = new javax.swing.JTextField();
        btnSave = new java.awt.Button();
        btnEdit = new java.awt.Button();
        btnDelete1 = new java.awt.Button();
        btnReset = new java.awt.Button();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        comboorder_id = new javax.swing.JComboBox<>();
        txtpayment_method = new javax.swing.JTextField();
        btnSearch = new java.awt.Button();
        txtSearch = new javax.swing.JTextField();
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
        jLabel1.setText("payment_date");

        txtpayment_date.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpayment_date.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayment_dateActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setText("amount_paid");

        txtamount_paid.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtamount_paid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtamount_paidActionPerformed(evt);
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

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("payment_method");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setText("order_id");

        txtpayment_method.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        txtpayment_method.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpayment_methodActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtpayment_date, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(3, 3, 3)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(57, 57, 57))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtamount_paid, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(btnDelete1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(43, 43, 43)
                                        .addComponent(jLabel2))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(56, 56, 56)
                                        .addComponent(jLabel4)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(comboorder_id, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpayment_method, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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
                    .addComponent(txtpayment_date, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(comboorder_id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtamount_paid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2)
                            .addComponent(txtpayment_method, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
            .addGap(0, 759, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 759, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 158, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 759, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtIDMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDMouseClicked

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtpayment_dateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayment_dateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayment_dateActionPerformed

    private void txtamount_paidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtamount_paidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtamount_paidActionPerformed
    private void loadOrder() {
        List<Order> oder = controll.getAlltOder();
        comboorder_id.removeAllItems();
        if (oder.isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this, "No order available");
            return;
        }
        for (Order i : oder) {
            comboorder_id.addItem(String.valueOf(i.getId()));
            System.out.println("Added category: " + i.getId());
        }
    }
    private void btnSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSaveMouseClicked
        try {
            String payment_date = txtpayment_date.getText();
            String payment_method = txtpayment_method.getText();
            float amount_paid = Float.parseFloat(txtamount_paid.getText());

            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            java.util.Date parsedDate = dateFormat.parse(payment_date);  // Chuyển chuỗi ngày thành java.util.Date

            int selectedIndex = comboorder_id.getSelectedIndex();

            if (selectedIndex == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "hãy chọn 1 order_id!");
            } else {
                int order_id = controll.getAlltOder().get(selectedIndex).getId();
                Payment pay = new Payment(WIDTH, order_id, parsedDate, payment_method, amount_paid);
                controller.addPayment(pay);
                LoadTable();
            }

            javax.swing.JOptionPane.showMessageDialog(this, "thêm thanh toán thành công!");

        } catch (ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ngày thanh toán không hợp lệ: " + e.getMessage());
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
            String payment_date = txtpayment_date.getText().trim();
            String payment_method = txtpayment_method.getText().trim();
            float amount_paid = Float.parseFloat(txtamount_paid.getText().trim());

            if (amount_paid < 0) {
                javax.swing.JOptionPane.showMessageDialog(this, "Số tiền không thể là số âm!");
                return;
            }
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            dateFormat.setLenient(false);
            java.util.Date parsedDate = dateFormat.parse(payment_date);

            int selectedIndex = comboorder_id.getSelectedIndex();

            if (selectedIndex == -1) {
                javax.swing.JOptionPane.showMessageDialog(this, "Hãy chọn một order_id!");
            } else {
                int order_id = controll.getAlltOder().get(selectedIndex).getId();
                int paymentId = Integer.parseInt(txtID.getText().trim());

                Payment pay = new Payment(paymentId, order_id, parsedDate, payment_method, amount_paid);
                controller.updatePayment(pay);
                LoadTable();
                javax.swing.JOptionPane.showMessageDialog(this, "Cập nhật thanh toán thành công!");
            }

        } catch (NumberFormatException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Số tiền không hợp lệ: " + e.getMessage());
        } catch (ParseException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Ngày thanh toán không hợp lệ: " + e.getMessage());
        } catch (HeadlessException e) {
            javax.swing.JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage());
        }
    }//GEN-LAST:event_btnEditMouseClicked

    private void btnDelete1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDelete1MouseClicked
        try {
            int id = Integer.parseInt(txtID.getText());
            controller.deletePayment(id);
            LoadTable();
        } catch (NumberFormatException e) {
        }
    }//GEN-LAST:event_btnDelete1MouseClicked

    private void btnResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnResetMouseClicked
        txtID.setText("");
        txtpayment_date.setText("");
        txtpayment_method.setText("");
        txtamount_paid.setText("");
        txtSearch.setText("");
        LoadTable();
    }//GEN-LAST:event_btnResetMouseClicked

    private void btnSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseClicked
        try {
            int id = Integer.parseInt(txtSearch.getText().trim());
            if (id > 0) {
                List<Payment> searchResults = controller.findPaymentById(id);
                DefaultTableModel model = new DefaultTableModel();
                model.addColumn("ID");
                model.addColumn("Order ID");
                model.addColumn("Payment Date");
                model.addColumn("Payment Method");
                model.addColumn("Amount Paid");

                if (!searchResults.isEmpty()) {
                    for (Payment pay : searchResults) {
                        model.addRow(new Object[]{
                            pay.getId(),
                            pay.getOrder_id(),
                            pay.getPayment_date(),
                            pay.getPayment_method(),
                            pay.getAmount_paid()
                        });
                    }
                    ds_sanpham.setModel(model); // Cập nhật bảng

                } else {
                    JOptionPane.showMessageDialog(this, "Không tìm thấy thanh toán nào với ID: " + id, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "ID phải lớn hơn 0!", "Lỗi", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập một số hợp lệ!", "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Đã xảy ra lỗi không mong muốn: " + e.getMessage(), "Lỗi", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnSearchMouseClicked

    private void ds_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ds_sanphamMouseClicked
        int row = ds_sanpham.getSelectedRow();
        txtID.setText(ds_sanpham.getValueAt(row, 0).toString());
        txtpayment_date.setText(ds_sanpham.getValueAt(row, 2).toString());
        txtpayment_method.setText(ds_sanpham.getValueAt(row, 3).toString());
        txtamount_paid.setText(ds_sanpham.getValueAt(row, 4).toString());

        int orderid = (int) ds_sanpham.getValueAt(row, 1);
        String customerName = getOrderNameById(orderid);
        if (customerName != null) {
            comboorder_id.setSelectedItem(customerName);
        } else {
            comboorder_id.setSelectedItem(null);
            System.out.println("Category not found for ID: " + orderid);
        }

        LoadTable();
    }//GEN-LAST:event_ds_sanphamMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.dispose(); // Đóng form hiện tại       
        HomeJFrame homeJFrame = new HomeJFrame();
        homeJFrame.setVisible(true);
    }//GEN-LAST:event_btnBackMouseClicked

    private void txtpayment_methodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpayment_methodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpayment_methodActionPerformed

    private String getOrderNameById(int id) {
        List<Order> orders = controll.getAlltOder();
        for (Order i : orders) {
            if (i.getId() == id) {
                return i.getStatus();
            }
        }
        return null;
    }

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentJFrame().setVisible(true);
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
    private javax.swing.JComboBox<String> comboorder_id;
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
    private javax.swing.JTextField txtamount_paid;
    private javax.swing.JTextField txtpayment_date;
    private javax.swing.JTextField txtpayment_method;
    // End of variables declaration//GEN-END:variables
}
