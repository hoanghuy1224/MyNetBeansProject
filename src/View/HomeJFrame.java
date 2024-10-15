package View;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class HomeJFrame extends javax.swing.JFrame {

    public HomeJFrame() {
        initComponents();
        //setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        navbar = new javax.swing.JPanel();
        LblHome = new javax.swing.JLabel();
        Lblsanpham = new javax.swing.JLabel();
        Lblhoadon = new javax.swing.JLabel();
        Lbldanhmuc = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Lblkhachhang = new javax.swing.JLabel();
        LblNhanVien = new javax.swing.JLabel();
        Lblthanhtoan = new javax.swing.JLabel();
        Lblthongke = new javax.swing.JLabel();
        Home = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jlogout = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        navbar.setBackground(new java.awt.Color(204, 204, 255));
        navbar.setPreferredSize(new java.awt.Dimension(67, 338));

        LblHome.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LblHome.setForeground(new java.awt.Color(0, 0, 0));
        LblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/UI/Icon/home.png"))); // NOI18N
        LblHome.setText("Home");
        LblHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblHomeMouseClicked(evt);
            }
        });

        Lblsanpham.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lblsanpham.setForeground(new java.awt.Color(0, 0, 0));
        Lblsanpham.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lblsanpham.setText("Product");
        Lblsanpham.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblsanphamMouseClicked(evt);
            }
        });

        Lblhoadon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lblhoadon.setForeground(new java.awt.Color(0, 0, 0));
        Lblhoadon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lblhoadon.setText("Order");
        Lblhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblhoadonMouseClicked(evt);
            }
        });

        Lbldanhmuc.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lbldanhmuc.setForeground(new java.awt.Color(0, 0, 0));
        Lbldanhmuc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lbldanhmuc.setText("Categoies");
        Lbldanhmuc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbldanhmucMouseClicked(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/UI/Icon/cross.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });

        Lblkhachhang.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lblkhachhang.setForeground(new java.awt.Color(0, 0, 0));
        Lblkhachhang.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lblkhachhang.setText("Custommer");
        Lblkhachhang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblkhachhangMouseClicked(evt);
            }
        });

        LblNhanVien.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        LblNhanVien.setForeground(new java.awt.Color(0, 0, 0));
        LblNhanVien.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LblNhanVien.setText("Employee");
        LblNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblNhanVienMouseClicked(evt);
            }
        });

        Lblthanhtoan.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lblthanhtoan.setForeground(new java.awt.Color(0, 0, 0));
        Lblthanhtoan.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lblthanhtoan.setText("Payment");
        Lblthanhtoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblthanhtoanMouseClicked(evt);
            }
        });

        Lblthongke.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Lblthongke.setForeground(new java.awt.Color(0, 0, 0));
        Lblthongke.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Lblthongke.setText("Report");
        Lblthongke.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LblthongkeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Lblthongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(navbarLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Lbldanhmuc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Lblhoadon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(navbarLayout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(Lblthanhtoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addComponent(Lblsanpham, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(LblNhanVien, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LblHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(navbarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Lblkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LblNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lblsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lblkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lbldanhmuc, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lblhoadon, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lblthanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Lblthongke, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Home.setBackground(new java.awt.Color(255, 204, 204));
        Home.setRequestFocusEnabled(false);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/UI/Icon/menu-burger (2).png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Computer Management");

        jlogout.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jlogout.setForeground(new java.awt.Color(0, 0, 0));
        jlogout.setText("Logout");
        jlogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlogoutMouseClicked(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Com/UI/Icon/anhnen.jpg"))); // NOI18N

        javax.swing.GroupLayout HomeLayout = new javax.swing.GroupLayout(Home);
        Home.setLayout(HomeLayout);
        HomeLayout.setHorizontalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(221, 221, 221)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(jlogout, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HomeLayout.createSequentialGroup()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 791, Short.MAX_VALUE)
                .addContainerGap())
        );
        HomeLayout.setVerticalGroup(
            HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HomeLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(HomeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlogout))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, 451, Short.MAX_VALUE)
                    .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    @SuppressWarnings("unchecked")
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        openMenubar();
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        CloseMenubar();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void LblsanphamMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblsanphamMouseClicked
        this.dispose(); // Đóng form hiện tại
        SanPhamJFrame jFrame = new SanPhamJFrame();
        jFrame.setVisible(true);
    }//GEN-LAST:event_LblsanphamMouseClicked

    private void LbldanhmucMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbldanhmucMouseClicked
        this.dispose(); // Đóng form hiện tại
        ProductJFrame productJFrame = new ProductJFrame();
        productJFrame.setVisible(true);
    }//GEN-LAST:event_LbldanhmucMouseClicked

    private void LblkhachhangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblkhachhangMouseClicked
        this.dispose(); // Đóng form hiện tại
        CustomerJFrame jFrame = new CustomerJFrame();
        jFrame.setVisible(true);
    }//GEN-LAST:event_LblkhachhangMouseClicked

    private void LblNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblNhanVienMouseClicked
        this.dispose(); // Đóng form hiện tại
        EmployeeJFrame emp = new EmployeeJFrame();
        emp.setVisible(true);
    }//GEN-LAST:event_LblNhanVienMouseClicked

    private void LblhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblhoadonMouseClicked
        this.dispose(); // Đóng form hiện tại
        OderJFrame oderJFrame = new OderJFrame();
        oderJFrame.setVisible(true);
    }//GEN-LAST:event_LblhoadonMouseClicked

    private void LblthanhtoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblthanhtoanMouseClicked
        this.dispose(); // Đóng form hiện tại
        PaymentJFrame pay = new PaymentJFrame();
        pay.setVisible(true);
    }//GEN-LAST:event_LblthanhtoanMouseClicked

    private void jlogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlogoutMouseClicked
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc chắn muốn đăng xuất?", "Xác nhận đăng xuất", JOptionPane.YES_NO_OPTION);
        if (confirm == JOptionPane.YES_OPTION) {
            LoginJFrame loginFrame = new LoginJFrame();
            loginFrame.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_jlogoutMouseClicked

    private void LblthongkeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblthongkeMouseClicked
        this.dispose(); // Đóng form hiện tại
        ThongKeJFrame thongKeJFrame = new ThongKeJFrame();
        thongKeJFrame.setVisible(true);
    }//GEN-LAST:event_LblthongkeMouseClicked

    private void LblHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LblHomeMouseClicked
        this.dispose();
        HomeJFrame homeJFrame = new HomeJFrame();
        homeJFrame.setVisible(true);
    }//GEN-LAST:event_LblHomeMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Home;
    private javax.swing.JLabel LblHome;
    private javax.swing.JLabel LblNhanVien;
    private javax.swing.JLabel Lbldanhmuc;
    private javax.swing.JLabel Lblhoadon;
    private javax.swing.JLabel Lblkhachhang;
    private javax.swing.JLabel Lblsanpham;
    private javax.swing.JLabel Lblthanhtoan;
    private javax.swing.JLabel Lblthongke;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jlogout;
    private javax.swing.JPanel navbar;
    // End of variables declaration//GEN-END:variables
    int with = 222;
    int hieght = 685;

    private void openMenubar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < with; i++) {
                    navbar.setSize(i, hieght);

                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
            }
        }).start();
    }

    private void CloseMenubar() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = with; i > 0; i--) {
                    navbar.setSize(i, hieght);

                    try {
                        Thread.sleep(2);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(HomeJFrame.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }).start();
    }
}
