/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlythuvien;

import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author taitongg
 */
public class frm_QLSach extends javax.swing.JFrame {

    /**
     * Creates new form frm_QLSach
     */
    private DefaultTableModel dtmSach;
    private DSSACH dsSach;
    
    private void myInit(){
        dtmSach=(DefaultTableModel)tblSach.getModel();
        tblSach.setModel(dtmSach);
        setLocationRelativeTo(null);
        dsSach=new DSSACH();
    }
    private void XoaDuLieu(){
        while(dtmSach.getRowCount()>0){
            dtmSach.removeRow(0);
        }
    }
    private void ThemMotDong(SACH sc){
     dtmSach.addRow(new Object[]{
         sc.getMaSach(),sc.getNXB(),sc.getSoLuong(),sc.getDonGia(),sc.TinhThanhTien()
     });
    }
    private void NapDuLieu(){
        XoaDuLieu();
        for(SACH sc: dsSach.list){
            ThemMotDong(sc);
        }
    }
    public frm_QLSach() {
        initComponents();
        myInit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtMaSach = new javax.swing.JTextField();
        txtNXB = new javax.swing.JTextField();
        txtNgayNhap = new javax.swing.JTextField();
        txtDonGia = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtTienGiam = new javax.swing.JTextField();
        txtThanhTien = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtThueTT = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        ckbMoi = new javax.swing.JRadioButton();
        ckbCu = new javax.swing.JRadioButton();
        jPanel2 = new javax.swing.JPanel();
        ckbSGK = new javax.swing.JRadioButton();
        ckbSTK = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSach = new javax.swing.JTable();
        btncapnhat = new javax.swing.JButton();
        btnThem = new javax.swing.JButton();
        btnTim = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnRefect = new javax.swing.JButton();
        btnTongtien = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSGK = new javax.swing.JTextField();
        txtSTK = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, this, org.jdesktop.beansbinding.ELProperty.create("QU???N L?? S??CH"), this, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel1.setText("QU???N L?? T??I LI???U");

        jLabel2.setText("M?? s??ch");

        jLabel3.setText("NXB");

        jLabel4.setText("Ng??y nh???p");

        jLabel5.setText("????n gi??");

        jLabel6.setText("S??? l?????ng");

        jLabel7.setText("Ti???n gi???m");

        jLabel8.setText("Th??nh ti???n");

        txtTienGiam.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTienGiamActionPerformed(evt);
            }
        });

        jLabel9.setText("Thu???/T??nh tr???ng");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("T??nh tr???ng s??ch"));

        buttonGroup1.add(ckbMoi);
        ckbMoi.setText("M???i");
        ckbMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbMoiActionPerformed(evt);
            }
        });

        buttonGroup1.add(ckbCu);
        ckbCu.setText("C??");
        ckbCu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbCuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbCu)
                    .addComponent(ckbMoi))
                .addGap(0, 53, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(ckbMoi)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbCu)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Lo???i s??ch"));

        buttonGroup2.add(ckbSGK);
        ckbSGK.setText("SGK");
        ckbSGK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSGKActionPerformed(evt);
            }
        });

        buttonGroup2.add(ckbSTK);
        ckbSTK.setText("STK");
        ckbSTK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ckbSTKActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ckbSGK)
                    .addComponent(ckbSTK))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ckbSGK)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ckbSTK)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tblSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "M?? s??ch", "NXB", "S??? l?????ng", "????n gi??", "Th??nh ti???n"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSachMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSach);

        btncapnhat.setText("C???p nh???t");
        btncapnhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncapnhatActionPerformed(evt);
            }
        });

        btnThem.setText("Th??m");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnTim.setText("T??m");
        btnTim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTimActionPerformed(evt);
            }
        });

        btnXoa.setText("Xo??");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnRefect.setText("Refect");
        btnRefect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefectActionPerformed(evt);
            }
        });

        btnTongtien.setText("TTi???n");
        btnTongtien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTongtienActionPerformed(evt);
            }
        });

        jLabel10.setText("SGK");

        jLabel11.setText("STK");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDonGia)
                                .addComponent(txtSoLuong)
                                .addComponent(txtThueTT))
                            .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btncapnhat)
                                .addGap(18, 18, 18)
                                .addComponent(btnThem)
                                .addGap(18, 18, 18)
                                .addComponent(btnTim)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnTongtien, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnXoa))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnRefect)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel10)
                                            .addComponent(jLabel11))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtSGK, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addComponent(txtSTK)))))
                            .addComponent(jLabel1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNXB)
                            .addComponent(txtMaSach))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtTienGiam, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(295, 295, 295))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTienGiam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTongtien)
                    .addComponent(jLabel10)
                    .addComponent(txtSGK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNXB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txtThanhTien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(txtSTK, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtNgayNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btncapnhat)
                            .addComponent(btnThem)
                            .addComponent(btnTim)
                            .addComponent(btnXoa)
                            .addComponent(btnRefect))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtThueTT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ckbMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbMoiActionPerformed
        // TODO add your handling code here:
        if(ckbMoi.isSelected()){
            //ckbCu.setSelected(false);
            txtThueTT.setText("M???i");
            
        }
    }//GEN-LAST:event_ckbMoiActionPerformed

    private void ckbCuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbCuActionPerformed
        // TODO add your handling code here:
        if(ckbCu.isSelected()){
           // ckbMoi.setSelected(false);
            txtThueTT.setText("C??");
        }
    }//GEN-LAST:event_ckbCuActionPerformed

    private void ckbSGKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSGKActionPerformed
        // TODO add your handling code here:
        if(ckbSGK.isSelected()){
            //ckbSTK.setSelected(false);
            jLabel9.setText("T??nh tr???ng");
            ckbCu.setEnabled(true);
            ckbMoi.setEnabled(true);
        }
    }//GEN-LAST:event_ckbSGKActionPerformed

    private void ckbSTKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ckbSTKActionPerformed
        // TODO add your handling code here:
        if(ckbSTK.isSelected()){
            //ckbSGK.setSelected(false);
            jLabel9.setText("Thu???");
            ckbCu.setEnabled(false);
            ckbMoi.setEnabled(false);
            txtThueTT.setText("");
        }
    }//GEN-LAST:event_ckbSTKActionPerformed

    private void btncapnhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncapnhatActionPerformed
        // TODO add your handling code here:
        SACH sc;
        Date ngayNhap=new Date();
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        try{
            ngayNhap=df.parse(txtNgayNhap.getText());
        }catch(ParseException ex){
            Logger.getLogger(frm_QLSach.class.getName()).log(Level.SEVERE,null,ex);
        }
        if(ckbSGK.isSelected()){
            sc=new SACHGIAOKHOA(txtThueTT.getText(), txtMaSach.getText(),txtNXB.getText(), ngayNhap,Double.parseDouble(txtDonGia.getText()),Double.parseDouble( txtSoLuong.getText()));
        }
        else {
            sc=new SACHTHAMKHAO(Double.parseDouble(txtThueTT.getText()), txtMaSach.getText(),txtNXB.getText(), ngayNhap,Double.parseDouble(txtDonGia.getText()),Double.parseDouble( txtSoLuong.getText()));
        }
        this.dsSach.Capnhap(sc);
        NapDuLieu();
    }//GEN-LAST:event_btncapnhatActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        Date ngayVao=new Date();
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        try{
            ngayVao=df.parse(txtNgayNhap.getText());
        }catch(ParseException ex){
            Logger.getLogger(frm_QLSach.class.getName()).log(Level.SEVERE,null,ex);
        }
        if(ckbSGK.isSelected()){
            SACH sgk=new SACHGIAOKHOA(txtThueTT.getText(), txtMaSach.getText(),txtNXB.getText(), ngayVao,Double.parseDouble(txtDonGia.getText()),Double.parseDouble( txtSoLuong.getText()));
            dsSach.Them(sgk);
            NapDuLieu();
        }
        else{
            SACH stk= new SACHTHAMKHAO(Double.parseDouble(txtThueTT.getText()), txtMaSach.getText(),txtNXB.getText(), ngayVao,Double.parseDouble(txtDonGia.getText()),Double.parseDouble( txtSoLuong.getText()));
            dsSach.Them(stk);
            
            NapDuLieu();
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnTimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTimActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat df=new SimpleDateFormat("dd/MM/yyyy");
        SACH sc =dsSach.Tim(txtMaSach.getText());
        txtDonGia.setText(String.valueOf(sc.getDonGia()));
        txtMaSach.setText(sc.getMaSach());
        txtNgayNhap.setText(df.format(sc.getNgayNhap()));//canthan
        txtSoLuong.setText(String.valueOf(sc.getSoLuong()));
        txtNXB.setText(sc.getNXB());
        txtThanhTien.setText(String.valueOf(sc.TinhThanhTien()));
        txtTienGiam.setText(String.valueOf(sc.TinhTienGiam()));
       
        if(sc instanceof SACHGIAOKHOA){
            SACHGIAOKHOA sgk=(SACHGIAOKHOA)sc;
            txtThueTT.setText(sgk.getTinhTrang());
            jLabel9.setText("T??nh tr???ng");
            if (txtThueTT.getText().equalsIgnoreCase("M???i")) {
                ckbMoi.setSelected(true);
            }
            else 
            { 
                ckbCu.setSelected(true);
            }
            if(ckbMoi.isSelected())
            txtThueTT.setText("M???i");
            else 
            txtThueTT.setText("C??");
        
        }
        else{
            SACHTHAMKHAO tk=(SACHTHAMKHAO)sc;
            txtThueTT.setText(String.valueOf(tk.getThue()));
            jLabel9.setText("Thu???");
            ckbSTK.setSelected(true);
            ckbSGK.setSelected(false);
            
        }
    }//GEN-LAST:event_btnTimActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        this.dsSach.Xoa(this.txtMaSach.getText());
        NapDuLieu();
        Setvaluenull();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tblSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSachMouseClicked
        // TODO add your handling code here:
        SimpleDateFormat df= new SimpleDateFormat("dd/MM/yyyy");
        
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.ENGLISH);
        int row=tblSach.rowAtPoint(evt.getPoint());
        SACH sc= dsSach.Tim(String.valueOf(tblSach.getValueAt(row, 0)).trim());
      
        txtMaSach.setText(sc.getMaSach());
        txtNgayNhap.setText(df.format(sc.getNgayNhap()));
        //txtNgayVao.setText(nv.getNgayVao().toString());
        txtDonGia.setText(String.valueOf(sc.getDonGia()));
          txtNXB.setText(sc.getNXB());
          txtSoLuong.setText(String.valueOf(sc.getSoLuong()));
        txtThanhTien.setText(String.valueOf(sc.TinhThanhTien()));
        txtTienGiam.setText(String.valueOf(sc.TinhTienGiam()));
        if(sc instanceof  SACHGIAOKHOA)
        {
            SACHGIAOKHOA sgk=(SACHGIAOKHOA)sc;
            txtThueTT.setText(String.valueOf(sgk.getTinhTrang()));
        } 
        else{
           SACHTHAMKHAO stk=(SACHTHAMKHAO)sc;
            txtThueTT.setText(String.valueOf(stk.getThue()));
        }
    }//GEN-LAST:event_tblSachMouseClicked

    private void btnRefectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefectActionPerformed
        // TODO add your handling code here:
        txtDonGia.setText("");
        txtMaSach.setText("");
        txtNXB.setText("");
        txtNgayNhap.setText("");
        txtSoLuong.setText("");
        txtThanhTien.setText("");
        txtThueTT.setText("");
        txtTienGiam.setText("");
        
        txtMaSach.requestFocus();
        
    }//GEN-LAST:event_btnRefectActionPerformed

    private void txtTienGiamActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTienGiamActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTienGiamActionPerformed

    private void btnTongtienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTongtienActionPerformed
        // TODO add your handling code here:
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.ENGLISH);
     txtSGK.setText(nf.format(dsSach.TinhTongTienSGK()));
     txtSTK.setText(nf.format(dsSach.TinhTongTienSTK()));
        
        
    }//GEN-LAST:event_btnTongtienActionPerformed
private void Setvaluenull(){
    txtMaSach.setText(null);
    txtDonGia.setText(null);
    txtNgayNhap.setText(null);
    txtThueTT.setText(null);
    txtNXB.setText(null);
    txtSoLuong.setText(null);
     txtThanhTien.setText(null);
      txtTienGiam.setText(null);
    ckbSGK.setSelected(false);
    ckbSTK.setSelected(false);
    ckbCu.setSelected(false);
    ckbMoi.setSelected(false);
}
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
            java.util.logging.Logger.getLogger(frm_QLSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_QLSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_QLSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_QLSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_QLSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRefect;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnTim;
    private javax.swing.JButton btnTongtien;
    private javax.swing.JButton btnXoa;
    private javax.swing.JButton btncapnhat;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JRadioButton ckbCu;
    private javax.swing.JRadioButton ckbMoi;
    private javax.swing.JRadioButton ckbSGK;
    private javax.swing.JRadioButton ckbSTK;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblSach;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaSach;
    private javax.swing.JTextField txtNXB;
    private javax.swing.JTextField txtNgayNhap;
    private javax.swing.JTextField txtSGK;
    private javax.swing.JTextField txtSTK;
    private javax.swing.JTextField txtSoLuong;
    private javax.swing.JTextField txtThanhTien;
    private javax.swing.JTextField txtThueTT;
    private javax.swing.JTextField txtTienGiam;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
