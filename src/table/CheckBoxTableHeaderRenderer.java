package table;

import com.formdev.flatlaf.FlatClientProperties;
import com.formdev.flatlaf.util.UIScale;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.geom.Rectangle2D;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.table.TableCellRenderer;


public class CheckBoxTableHeaderRenderer extends JCheckBox implements TableCellRenderer{
    private final JTable table;
    private final int column;

    public CheckBoxTableHeaderRenderer(JTable table, int column) {
        this.table = table;
        this.column = column;
        init();
    }
    
    private void init(){
        putClientProperty(FlatClientProperties.STYLE, ""
                + "background:$Table.background");
        setHorizontalAlignment(SwingConstants.CENTER);
        table.getTableHeader().addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent me) {
                 if(SwingUtilities.isLeftMouseButton(me)){
                     int col = table.columnAtPoint(me.getPoint());
                     if(col == column){
                         putClientProperty(FlatClientProperties.SELECTED_STATE, null);
                         setSelected(!isSelected());
                         selectedTableRow(isSelected());
                     }
                 }
            }
        });
        table.getModel().addTableModelListener((tme) -> {
            if(tme.getColumn() == column){
                checkRow();
            }
        }
        );
    }
    
    private void checkRow(){
        boolean initValue = table.getRowCount() == 0 ? false : (boolean)table.getValueAt(0, column);
        for (int i = 0; i < table.getRowCount(); i++) {
            boolean v = (boolean)table.getValueAt(i, column);
            if(initValue != v){
                putClientProperty(FlatClientProperties.SELECTED_STATE, FlatClientProperties.SELECTED_STATE_INDETERMINATE);
                table.getTableHeader().repaint();
                return;
            }
        }
        putClientProperty(FlatClientProperties.SELECTED_STATE, null);
        setSelected(initValue);
        table.getTableHeader().repaint();
    }
    
    private void selectedTableRow(boolean selected){
        for(int i = 0; i < table.getRowCount(); i++){
            table.setValueAt(selected, i, column);
        }
    }
    
    
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
        return this;
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D)g.create();
        g2.setColor(UIManager.getColor("TableHeader.bottomSeparatorColor"));
        float size = UIScale.scale(1f);
        g2.fill(new Rectangle2D.Float(0,getHeight() - size , getWidth(), size));
        g2.dispose();
        super.paintComponent(g);
    }
    
    
    
    
}
