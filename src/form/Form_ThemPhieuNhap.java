
package form;


public class Form_ThemPhieuNhap extends javax.swing.JPanel {

    public Form_ThemPhieuNhap() {
        initComponents();
        combobox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item1", "Item2", "Item3", "Item1", "Item2", "Item3", "Item1", "Item2", "Item3" }));
        combobox1.setSelectedIndex(-1);
        combobox1.setLabeText("Tên nhà cung cấp");
        combobox2.setLabeText("Nhân viên");
        combobox2.setSelectedIndex(-1);
        textField1.setLabelText("Mã phiếu nhập");
        textField2.setLabelText("Tên sản phẩm");
        textField3.setLabelText("Số lượng");
        textField4.setLabelText("Đơn giá");
        textField5.setLabelText("Chiết khấu");
        textField6.setLabelText("Thành tiền");
        textField6.setEditable(false);
        textField7.setLabelText("Ghi chú");
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textField1 = new swing.TextField();
        textField2 = new swing.TextField();
        textField3 = new swing.TextField();
        combobox1 = new swing.Combobox();
        textField4 = new swing.TextField();
        textField5 = new swing.TextField();
        textField6 = new swing.TextField();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        textField7 = new swing.TextField();
        uWPButton1 = new swing.UWPButton();
        uWPButton2 = new swing.UWPButton();
        uWPButton3 = new swing.UWPButton();
        jLabel1 = new javax.swing.JLabel();
        combobox2 = new swing.Combobox();

        setBackground(new java.awt.Color(255, 255, 255));

        textField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField1.setMinimumSize(new java.awt.Dimension(60, 45));
        textField1.setPreferredSize(new java.awt.Dimension(60, 45));

        textField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField2.setMinimumSize(new java.awt.Dimension(60, 45));
        textField2.setPreferredSize(new java.awt.Dimension(60, 45));

        textField3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField3.setMinimumSize(new java.awt.Dimension(60, 45));
        textField3.setPreferredSize(new java.awt.Dimension(60, 45));

        combobox1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textField4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField4.setMinimumSize(new java.awt.Dimension(60, 45));
        textField4.setPreferredSize(new java.awt.Dimension(60, 45));

        textField5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textField6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        textField6.setMinimumSize(new java.awt.Dimension(60, 45));
        textField6.setPreferredSize(new java.awt.Dimension(60, 45));

        jDateChooser1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        textField7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        uWPButton1.setText("Xóa rỗng");
        uWPButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        uWPButton2.setText("Thoát");
        uWPButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        uWPButton3.setText("Lưu");
        uWPButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 153, 153));
        jLabel1.setText("Ngày nhập");

        combobox2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textField1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                            .addComponent(textField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textField4, javax.swing.GroupLayout.DEFAULT_SIZE, 239, Short.MAX_VALUE)
                            .addComponent(textField3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(combobox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 100, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(uWPButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(uWPButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(uWPButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(92, 92, 92)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(combobox2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(textField5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(textField7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(textField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(textField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(textField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(6, 6, 6))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(uWPButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uWPButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uWPButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(combobox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.Combobox combobox1;
    private swing.Combobox combobox2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private swing.TextField textField1;
    private swing.TextField textField2;
    private swing.TextField textField3;
    private swing.TextField textField4;
    private swing.TextField textField5;
    private swing.TextField textField6;
    private swing.TextField textField7;
    private swing.UWPButton uWPButton1;
    private swing.UWPButton uWPButton2;
    private swing.UWPButton uWPButton3;
    // End of variables declaration//GEN-END:variables
}
