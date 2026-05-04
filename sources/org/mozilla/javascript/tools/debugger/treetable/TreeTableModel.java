package org.mozilla.javascript.tools.debugger.treetable;

import javax.swing.tree.TreeModel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public interface TreeTableModel extends TreeModel {
    Class<?> getColumnClass(int i11);

    int getColumnCount();

    String getColumnName(int i11);

    Object getValueAt(Object obj, int i11);

    boolean isCellEditable(Object obj, int i11);

    void setValueAt(Object obj, Object obj2, int i11);
}
