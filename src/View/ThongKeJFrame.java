package View;

import Controller.CategoryController;
import Controller.ProductController;
import Controller.OrderController;
import Controller.EmployeeController;
import Controller.CustomerController;
import Controller.PaymentController;
import Model.Product;
import Model.Category;
import Model.Customer;
import Model.Employee;
import Model.Order;
import Model.Payment;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class ThongKeJFrame extends javax.swing.JFrame {

    CategoryController categoryController;
    ProductController productController;
    OrderController orderController;
    EmployeeController employeeController;
    CustomerController customerController;
    PaymentController PaymentController;

    public ThongKeJFrame() {
        categoryController = new CategoryController();
        productController = new ProductController();
        orderController = new OrderController();
        employeeController = new EmployeeController();
        customerController = new CustomerController();
        PaymentController = new PaymentController();
        initComponents();
        showTotalCategories();
        showTotalProduct();
        showTotalOrder();
        showTotalEmployee();
        showTotalCustommer();
        showTotalPayment();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        sanpham = new javax.swing.JPanel();
        lblsanpham = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        danhmuc = new javax.swing.JPanel();
        lbldanhmuc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Nhanvien = new javax.swing.JPanel();
        lblnhanvien = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Hoadon = new javax.swing.JPanel();
        lblkhoadon = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        khachhang = new javax.swing.JPanel();
        lblkhachhang = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        thanhtoan = new javax.swing.JPanel();
        lblthanhtoan = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        ds_sanpham = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        sanpham.setBackground(new java.awt.Color(153, 204, 255));

        lblsanpham.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblsanpham.setForeground(new java.awt.Color(0, 0, 0));
        lblsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblsanphamMouseClicked(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Sản Phẩm");

        javax.swing.GroupLayout sanphamLayout = new javax.swing.GroupLayout(sanpham);
        sanpham.setLayout(sanphamLayout);
        sanphamLayout.setHorizontalGroup(
            sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sanphamLayout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addGroup(sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblsanpham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        sanphamLayout.setVerticalGroup(
            sanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, sanphamLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        danhmuc.setBackground(new java.awt.Color(153, 204, 255));

        lbldanhmuc.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lbldanhmuc.setForeground(new java.awt.Color(0, 0, 0));
        lbldanhmuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbldanhmucMouseClicked(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Danh mục");

        javax.swing.GroupLayout danhmucLayout = new javax.swing.GroupLayout(danhmuc);
        danhmuc.setLayout(danhmucLayout);
        danhmucLayout.setHorizontalGroup(
            danhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(danhmucLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbldanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(danhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, danhmucLayout.createSequentialGroup()
                    .addContainerGap(43, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(26, 26, 26)))
        );
        danhmucLayout.setVerticalGroup(
            danhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(danhmucLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(lbldanhmuc, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(danhmucLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(danhmucLayout.createSequentialGroup()
                    .addGap(16, 16, 16)
                    .addComponent(jLabel2)
                    .addContainerGap(68, Short.MAX_VALUE)))
        );

        Nhanvien.setBackground(new java.awt.Color(153, 204, 255));

        lblnhanvien.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblnhanvien.setForeground(new java.awt.Color(0, 0, 0));
        lblnhanvien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblnhanvienMouseClicked(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Nhân Viên");

        javax.swing.GroupLayout NhanvienLayout = new javax.swing.GroupLayout(Nhanvien);
        Nhanvien.setLayout(NhanvienLayout);
        NhanvienLayout.setHorizontalGroup(
            NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NhanvienLayout.createSequentialGroup()
                .addContainerGap(32, Short.MAX_VALUE)
                .addGroup(NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );
        NhanvienLayout.setVerticalGroup(
            NhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NhanvienLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblnhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                .addContainerGap())
        );

        Hoadon.setBackground(new java.awt.Color(153, 204, 255));

        lblkhoadon.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblkhoadon.setForeground(new java.awt.Color(0, 0, 0));
        lblkhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblkhoadonMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Hóa Đơn");

        javax.swing.GroupLayout HoadonLayout = new javax.swing.GroupLayout(Hoadon);
        Hoadon.setLayout(HoadonLayout);
        HoadonLayout.setHorizontalGroup(
            HoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoadonLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(HoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoadonLayout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HoadonLayout.createSequentialGroup()
                        .addComponent(lblkhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );
        HoadonLayout.setVerticalGroup(
            HoadonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HoadonLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblkhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                .addContainerGap())
        );

        khachhang.setBackground(new java.awt.Color(153, 204, 255));

        lblkhachhang.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblkhachhang.setForeground(new java.awt.Color(0, 0, 0));
        lblkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblkhachhangMouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Khách Hàng");

        javax.swing.GroupLayout khachhangLayout = new javax.swing.GroupLayout(khachhang);
        khachhang.setLayout(khachhangLayout);
        khachhangLayout.setHorizontalGroup(
            khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, khachhangLayout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );
        khachhangLayout.setVerticalGroup(
            khachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(khachhangLayout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        thanhtoan.setBackground(new java.awt.Color(153, 204, 255));

        lblthanhtoan.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        lblthanhtoan.setForeground(new java.awt.Color(0, 0, 0));
        lblthanhtoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblthanhtoanMouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Thanh Toán");

        javax.swing.GroupLayout thanhtoanLayout = new javax.swing.GroupLayout(thanhtoan);
        thanhtoan.setLayout(thanhtoanLayout);
        thanhtoanLayout.setHorizontalGroup(
            thanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thanhtoanLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(thanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblthanhtoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 103, Short.MAX_VALUE))
                .addGap(20, 20, 20))
        );
        thanhtoanLayout.setVerticalGroup(
            thanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thanhtoanLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblthanhtoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
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

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Sản Phẩm");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 780, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 780, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(370, 370, 370)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(320, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(jLabel4)
                    .addContainerGap(84, Short.MAX_VALUE)))
        );

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnBack.setForeground(new java.awt.Color(0, 0, 0));
        btnBack.setText("Back");
        btnBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBackMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(danhmuc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(khachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(thanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(137, 137, 137))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(Hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBack)
                        .addContainerGap())))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Hoadon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(danhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(khachhang, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Nhanvien, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(thanhtoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    // hàm load dữ liệu categories

    private void loadcategory() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Category ID");
        model.addColumn("Category Name");
        model.addColumn("Category Description");

        for (Category category : categoryController.getCategories()) {
            model.addRow(new Object[]{category.getId(), category.getName(), category.getDescription()});
        }

        ds_sanpham.setModel(model);
    }

    // hàm load lại dữ liệu product
    private void loadProduct() {
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
            for (Product product : productController.GetProduct()) {
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

    // hàm load dữ liệu order
    private void LoadOrder() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("CustomerId");
        model.addColumn("OrderDate");
        model.addColumn("TotalAmount");
        model.addColumn("Status");

        for (Order oder : orderController.getAlltOder()) {
            model.addRow(new Object[]{oder.getId(), oder.getCustomerId(), oder.getOrderDate(), oder.getTotalAmount(), oder.getStatus()});
        }
        ds_sanpham.setModel(model);
    }

    // hàm load nhân viên
    private void LoadEmployee() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("full_name");
        model.addColumn("email");
        model.addColumn("phone_number");
        model.addColumn("position");
        model.addColumn("hire_date");

        for (Employee emp : employeeController.GetAllEmployee()) {
            model.addRow(new Object[]{emp.getId(), emp.getFull_name(), emp.getEmail(), emp.getPhone_number(), emp.getPosition(), emp.getHire_date()});
        }
        ds_sanpham.setModel(model);
    }

    // hàm load khách hàng
    private void LoadCustommer() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("full_name");
        model.addColumn("email");
        model.addColumn("phone_number");
        model.addColumn("address");

        for (Customer custom : customerController.getAllCustomers()) {
            model.addRow(new Object[]{custom.getId(), custom.getFull_name(), custom.getEmail(), custom.getPhone_number(), custom.getAddress()});
        }
        ds_sanpham.setModel(model);
    }

    private void LoadPayment() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("id");
        model.addColumn("order_id");
        model.addColumn("Payment_date");
        model.addColumn("Payment_method");
        model.addColumn("Amount_paid");

        double totalAmountPaid = 0;
        for (Payment pay : PaymentController.getAllPayment()) {
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
    private void lbldanhmucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbldanhmucMouseClicked
        loadcategory();
    }//GEN-LAST:event_lbldanhmucMouseClicked

    private void ds_sanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ds_sanphamMouseClicked

    }//GEN-LAST:event_ds_sanphamMouseClicked

    private void lblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblsanphamMouseClicked
        loadProduct();
    }//GEN-LAST:event_lblsanphamMouseClicked

    private void lblkhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblkhoadonMouseClicked
        LoadOrder();
    }//GEN-LAST:event_lblkhoadonMouseClicked

    private void lblnhanvienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblnhanvienMouseClicked
        LoadEmployee();
    }//GEN-LAST:event_lblnhanvienMouseClicked

    private void lblkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblkhachhangMouseClicked
        LoadCustommer();
    }//GEN-LAST:event_lblkhachhangMouseClicked

    private void lblthanhtoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblthanhtoanMouseClicked
        LoadPayment();
    }//GEN-LAST:event_lblthanhtoanMouseClicked

    private void btnBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBackMouseClicked
        this.dispose(); // Đóng form hiện tại       
        HomeJFrame homeJFrame = new HomeJFrame();
        homeJFrame.setVisible(true);
    }//GEN-LAST:event_btnBackMouseClicked
    // Phương thức để hiển thị tổng số danh mục lên label
    private void showTotalCategories() {
        int totalCategories = categoryController.getTotalCategories();
        lbldanhmuc.setText("Tổng: " + totalCategories);
    }

    // phuowng thức để hiển thị tổng số sản phẩm lên label
    private void showTotalProduct() {
        int totalProduct = 0;
        try {
            totalProduct = productController.getTotalProducts();
        } catch (SQLException ex) {
            Logger.getLogger(ThongKeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        lblsanpham.setText("Tổng: " + totalProduct);
    }

    // Phương thức để hiển thị tổng số hóa đơn lên label
    private void showTotalOrder() {
        int totalOrder = orderController.getTotalOrders();
        lblkhoadon.setText("Tổng: " + totalOrder);
    }

    // Phương thức để hiển thị tổng số nhân viên lên label
    private void showTotalEmployee() {
        int totalemployee = employeeController.getTotalEmployee();
        lblnhanvien.setText("Tổng: " + totalemployee);
    }

    // Phương thức để hiển thị tổng số khach hàng lên label
    private void showTotalCustommer() {
        int totalCustommer = customerController.getTotalCustomers();
        lblkhachhang.setText("Tổng: " + totalCustommer);
    }

    // Phương thức để hiển thị tổng số tiền đã thanh toán lên label
    private void showTotalPayment() {
        int totalPayment = (int) PaymentController.getTotalAmountPaid();
        lblthanhtoan.setText("Tổng: " + totalPayment);
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThongKeJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Hoadon;
    private javax.swing.JPanel Nhanvien;
    private javax.swing.JButton btnBack;
    private javax.swing.JPanel danhmuc;
    private javax.swing.JTable ds_sanpham;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel khachhang;
    private javax.swing.JLabel lbldanhmuc;
    private javax.swing.JLabel lblkhachhang;
    private javax.swing.JLabel lblkhoadon;
    private javax.swing.JLabel lblnhanvien;
    private javax.swing.JLabel lblsanpham;
    private javax.swing.JLabel lblthanhtoan;
    private javax.swing.JPanel sanpham;
    private javax.swing.JPanel thanhtoan;
    // End of variables declaration//GEN-END:variables
}
