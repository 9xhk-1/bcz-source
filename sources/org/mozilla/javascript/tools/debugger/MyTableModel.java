package org.mozilla.javascript.tools.debugger;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class MyTableModel extends AbstractTableModel {
    private static final long serialVersionUID = 2971618907207577000L;
    private SwingGui debugGui;
    private List<String> expressions = Collections.synchronizedList(new ArrayList());
    private List<String> values = Collections.synchronizedList(new ArrayList());

    public MyTableModel(SwingGui swingGui) {
        this.debugGui = swingGui;
        this.expressions.add("");
        this.values.add("");
    }

    public int getColumnCount() {
        return 2;
    }

    public String getColumnName(int i11) {
        if (i11 == 0) {
            return "Expression";
        }
        if (i11 != 1) {
            return null;
        }
        return "Value";
    }

    public int getRowCount() {
        return this.expressions.size();
    }

    public Object getValueAt(int i11, int i12) {
        return i12 != 0 ? i12 != 1 ? "" : this.values.get(i11) : this.expressions.get(i11);
    }

    public boolean isCellEditable(int i11, int i12) {
        return true;
    }

    public void setValueAt(Object obj, int i11, int i12) {
        String str;
        if (i12 != 0) {
            if (i12 != 1) {
                return;
            }
            fireTableDataChanged();
            return;
        }
        String obj2 = obj.toString();
        this.expressions.set(i11, obj2);
        if (obj2.length() <= 0 || (str = this.debugGui.dim.eval(obj2)) == null) {
            str = "";
        }
        this.values.set(i11, str);
        updateModel();
        int i13 = i11 + 1;
        if (i13 == this.expressions.size()) {
            this.expressions.add("");
            this.values.add("");
            fireTableRowsInserted(i13, i13);
        }
    }

    public void updateModel() {
        String eval;
        for (int i11 = 0; i11 < this.expressions.size(); i11++) {
            String str = this.expressions.get(i11);
            String str2 = "";
            if (str.length() > 0 && (eval = this.debugGui.dim.eval(str)) != null) {
                str2 = eval;
            }
            this.values.set(i11, str2.replace('\n', ' '));
        }
        fireTableDataChanged();
    }
}
