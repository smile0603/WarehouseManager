
package form;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.extras.FlatSVGIcon;
import com.formdev.flatlaf.fonts.roboto.FlatRobotoFont;
import com.formdev.flatlaf.themes.FlatMacLightLaf;
import java.awt.Font;

import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import raven.popup.DefaultOption;
import raven.popup.GlassPanePopup;
import raven.popup.component.SimplePopupBorder;
import raven.toast.Notifications;
import table.CheckBoxTableHeaderRenderer;
import table.TableHeaderAligment;


public class DesignTable extends javax.swing.JFrame {

    public DesignTable() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        TestDataTable();
    }

    private void TestDataTable(){
        DefaultTableModel model = (DefaultTableModel)table.getModel();
        model.addRow(new Object[]{false,1,"Mike Bhand", "mikebhand@gmail.com", "Admin", "25 Apr,2018", "A"});
        model.addRow(new Object[]{false,2,"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018", "B"});
        model.addRow(new Object[]{false,3,"Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018", "C"});
        model.addRow(new Object[]{false,4,"Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018", "D"});
        model.addRow(new Object[]{false,5,"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", "E"});
        model.addRow(new Object[]{false,6,"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018", "F"});
        model.addRow(new Object[]{false,7,"Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018", "G"});
        model.addRow(new Object[]{false,8,"Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018", "H"});
        model.addRow(new Object[]{false,9,"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", "H"});
        model.addRow(new Object[]{false,10,"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", "H"});
        model.addRow(new Object[]{false,11,"Andrew Strauss", "andrewstrauss@gmail.com", "Editor", "25 Apr,2018", "H"});
        model.addRow(new Object[]{false,12,"Ross Kopelman", "rosskopelman@gmail.com", "Subscriber", "25 Apr,2018", "H"});
        model.addRow(new Object[]{false,13,"Mike Hussy", "mikehussy@gmail.com", "Admin", "25 Apr,2018", "H"});
        model.addRow(new Object[]{false,14,"Kevin Pietersen", "kevinpietersen@gmail.com", "Admin", "25 Apr,2018", "H"});
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        scroll = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        lbTitle = new javax.swing.JLabel();
        buttonAction1 = new swing.ButtonAction();
        buttonAction2 = new swing.ButtonAction();
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

        buttonAction1.setText("Xóa");

        buttonAction2.setText("Chỉnh sửa");

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
                        .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(buttonAction1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonAction2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void bntThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bntThemActionPerformed
        Form_ThemNhaCungCap2 formThemNCC = new Form_ThemNhaCungCap2();
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
            }else{
                pc.closePopup();
            }
        }), option);  
    }//GEN-LAST:event_bntThemActionPerformed

    public static void main(String args[]) {
        FlatRobotoFont.install();
        UIManager.put("defaultFont", new Font(FlatRobotoFont.FAMILY,Font.PLAIN, 13));
        FlatMacLightLaf.setup();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DesignTable().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private swing.ButtonAction bntThem;
    private swing.ButtonAction buttonAction1;
    private swing.ButtonAction buttonAction2;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JPanel panel;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
