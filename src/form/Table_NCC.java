
package form;

import DAO.NhaCungCapDAO;
import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import entity.NhaCungCap;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JLabel;

import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import raven.popup.DefaultOption;
import raven.popup.GlassPanePopup;
import raven.popup.component.SimplePopupBorder;
import raven.toast.Notifications;
import table.CheckBoxTableHeaderRenderer;
import table.TableHeaderAligment;


public class Table_NCC extends javax.swing.JFrame {

    public Table_NCC() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        init();
    }
    private void init(){
        GlassPanePopup.install(this);
        Notifications.getInstance().setJFrame(this);
        panel.putClientProperty(FlatClientProperties.STYLE, ""
        + "arc:25;"
        + "background:$Table.background" );
        
        table.getTableHeader().putClientProperty(FlatClientProperties.STYLE, ""
        + "height:30;"
        + "hoverBackground:null;"
        + "pressedBackground:null;"
        + "separatorColor:$TableHeader.background;"
        + "font:bold;");
        
        table.putClientProperty(FlatClientProperties.STYLE, ""
                + "rowHeight:30;"
                + "showHorizontalLines:true;"
                + "intercellSpacing:0,1;"
                + "cellFocusColor:$TableHeader.hoverBackground;"
                + "selectionBackground:$TableHeader.hoverBackground;"
                + "selectionForeground:$Table.foreground;");
        scroll.getVerticalScrollBar().putClientProperty(FlatClientProperties.STYLE, ""
                + "trackArc:999;"
                + "trackInsets:3,3,3,3;"
                + "thumbInsets:3,3,3,3;"
                + "background:$Table.background;");
        
        lbTitle.putClientProperty(FlatClientProperties.STYLE, ""
                + "font:bold +5;");
        
        
        txtSearch.putClientProperty(FlatClientProperties.PLACEHOLDER_TEXT, "Tìm kiếm...");
        txtSearch.putClientProperty(FlatClientProperties.TEXT_FIELD_LEADING_ICON, new FlatSVGIcon("icon/Search.svg"));
        txtSearch.putClientProperty(FlatClientProperties.STYLE, ""
                + "arc:15;"
                + "borderWidth:0;"
                + "focusWidth:0;"
                + "innerFocusWidth:0;"
                + "margin: 5,20,5,20;"
                + "background:$Panel.background");
        
        table.getColumnModel().getColumn(0).setHeaderRenderer(new CheckBoxTableHeaderRenderer(table,0));
        table.getTableHeader().setDefaultRenderer(new TableHeaderAligment(table));
        try {
            config.JDBCUtil.getConnection();
            loadData();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();
        btnXoa = new swing.ButtonAction();
        btnChinhSua = new swing.ButtonAction();
        bntThem = new swing.ButtonAction();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        scroll.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Chọn", "#", "Mã NCC", "Tên NCC", "Địa chỉ", "Email", "Số điện thoại"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Boolean.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scroll.setViewportView(table);
        if (table.getColumnModel().getColumnCount() > 0) {
            table.getColumnModel().getColumn(0).setMaxWidth(50);
            table.getColumnModel().getColumn(1).setMaxWidth(40);
            table.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        lbTitle.setText("Tìm kiếm");

        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnChinhSua.setText("Chỉnh sửa");
        btnChinhSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChinhSuaActionPerformed(evt);
            }
        });

        bntThem.setText("Thêm");
        bntThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bntThemActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(scroll)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 344, Short.MAX_VALUE)
                        .addComponent(bntThem, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(lbTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnChinhSua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bntThem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 381, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Load Data From tb_NCC 

    
    
    private void bntThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThemActionPerformed
        Form_ThemNhaCungCap formThemNCC = new Form_ThemNhaCungCap();
        NhaCungCapDAO nccDAO = new NhaCungCapDAO();
        DefaultOption option = new DefaultOption(){
            @Override
            public boolean closeWhenClickOutside() {
                return true;
            }
            
        };
        String actions[] = new String[]{"Hủy", "Lưu"};
        GlassPanePopup.showPopup(new SimplePopupBorder(formThemNCC,"Thêm nhà cung cấp",actions,(pc,i) ->{
            if(i == 1){
                //Save
                try {
                    nccDAO.create(formThemNCC.getData());
                    pc.closePopup();
                    Notifications.getInstance().show(Notifications.Type.SUCCESS,"Thêm thành công!");
                    loadData();
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }else{
                pc.closePopup();
            }
        }), option);
    }//GEN-LAST:event_bntThemActionPerformed

    private void btnChinhSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChinhSuaActionPerformed
        // TODO add your handling code here:
        List<NhaCungCap> list = getSelectedData();
        if(!list.isEmpty()){
            if(list.size() == 1){
                NhaCungCap ncc = list.get(0);
                NhaCungCapDAO nccDAO = new NhaCungCapDAO();
                Form_ThemNhaCungCap formThemNCC = new Form_ThemNhaCungCap();
                formThemNCC.loadData(nccDAO, ncc);
                DefaultOption option = new DefaultOption(){
            @Override
            public boolean closeWhenClickOutside() {
                return true;
            }
            
        };
        String actions[] = new String[]{"Hủy", "Chỉnh sửa"};
        GlassPanePopup.showPopup(new SimplePopupBorder(formThemNCC,"Chỉnh sửa nhà cung cấp",actions,(pc,i) ->{
            if(i == 1){
                //Edit
                try {
                    NhaCungCap nccEdit = formThemNCC.getData();
                    nccEdit.setMaNCC(ncc.getMaNCC());
                    nccDAO.edit(nccEdit);
                    pc.closePopup();
                    Notifications.getInstance().show(Notifications.Type.SUCCESS,"Chỉnh sửa thành công!");
                    
                    
                } catch (Exception e) {
                    e.printStackTrace();
                }
                loadData();
            }else{
                pc.closePopup();
            }
        }), option);
            }else{
                Notifications.getInstance().show(Notifications.Type.WARNING, "Chỉ chọn một nhà cung cấp");
            }
        }else{
             Notifications.getInstance().show(Notifications.Type.WARNING, "Chọn dòng cần chỉnh sửa");
        }
    }//GEN-LAST:event_btnChinhSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        List<NhaCungCap> list = getSelectedData();
        if(!list.isEmpty()){
            DefaultOption option = new DefaultOption(){
            @Override
            public boolean closeWhenClickOutside() {
                return true;
            }
            
        };
        String actions[] = new String[]{"Hủy", "Xóa"};
        JLabel label = new JLabel("Bạn có muốn xóa "+list.size()+" nhà cung cấp");
        label.setBorder(new EmptyBorder(0,25,0,25));
        NhaCungCapDAO nccDAO = new NhaCungCapDAO();
        GlassPanePopup.showPopup(new SimplePopupBorder(label,"Xác nhận xóa",actions,(pc,i) ->{
            if(i == 1){
                //Delete
                try {
                    for(NhaCungCap ncc : list){
                        nccDAO.delete(ncc.getMaNCC());
                    }
                    pc.closePopup();
                    Notifications.getInstance().show(Notifications.Type.SUCCESS,"Xóa thành công!");
                } catch (Exception e) {
                    e.printStackTrace();
                }
                loadData();
            }else{
                pc.closePopup();
            }
        }), option);
            
        }else{
            Notifications.getInstance().show(Notifications.Type.WARNING, "Chọn dòng cần xoá");
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private List<NhaCungCap> getSelectedData(){
        List<NhaCungCap> list = new ArrayList<>();
        for (int i = 0; i < table.getRowCount(); i++) {
            if((boolean)table.getValueAt(i, 0)){
                NhaCungCap ncc = (NhaCungCap) table.getValueAt(i, 3); // Lien quan toi method toTableRow
                list.add(ncc);
                
            }
            
        }
        return list;
    }
//    public static void main(String args[]) {
//        FlatRobotoFont.install();
//        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY,Font.PLAIN, 13));
//        FlatMacLightLaf.setup();
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new DesignTable().setVisible(true);
//                
//            }
//        });
//    }
    private void loadData(){
        NhaCungCapDAO nccDAO = new NhaCungCapDAO();
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if(table.isEditing()){
                table.getCellEditor().stopCellEditing();
            }
            model.setRowCount(0);
            List<NhaCungCap> listNCC = nccDAO.getAllNhaCungCap();
            for(NhaCungCap ncc : listNCC){
                model.addRow(ncc.toTableRow(table.getRowCount() + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
        private void searchData(String txtSearch){
        NhaCungCapDAO nccDAO = new NhaCungCapDAO();
        try {
            DefaultTableModel model = (DefaultTableModel) table.getModel();
            if(table.isEditing()){
                table.getCellEditor().stopCellEditing();
            }
            model.setRowCount(0);
            List<NhaCungCap> listNCC = nccDAO.search(txtSearch);
            for(NhaCungCap ncc : listNCC){
                model.addRow(ncc.toTableRow(table.getRowCount() + 1));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonAction bntThem;
    private swing.ButtonAction btnChinhSua;
    private swing.ButtonAction btnXoa;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
