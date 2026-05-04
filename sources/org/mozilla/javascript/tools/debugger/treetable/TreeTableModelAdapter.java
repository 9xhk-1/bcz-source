package org.mozilla.javascript.tools.debugger.treetable;

import javax.swing.JTree;
import javax.swing.SwingUtilities;
import javax.swing.event.TreeExpansionEvent;
import javax.swing.event.TreeExpansionListener;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.table.AbstractTableModel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class TreeTableModelAdapter extends AbstractTableModel {
    private static final long serialVersionUID = 48741114609209052L;
    JTree tree;
    TreeTableModel treeTableModel;

    public TreeTableModelAdapter(TreeTableModel treeTableModel, JTree jTree) {
        this.tree = jTree;
        this.treeTableModel = treeTableModel;
        jTree.addTreeExpansionListener(new TreeExpansionListener() { // from class: org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter.1
            public void treeCollapsed(TreeExpansionEvent treeExpansionEvent) {
                TreeTableModelAdapter.this.fireTableDataChanged();
            }

            public void treeExpanded(TreeExpansionEvent treeExpansionEvent) {
                TreeTableModelAdapter.this.fireTableDataChanged();
            }
        });
        treeTableModel.addTreeModelListener(new TreeModelListener() { // from class: org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter.2
            public void treeNodesChanged(TreeModelEvent treeModelEvent) {
                TreeTableModelAdapter.this.delayedFireTableDataChanged();
            }

            public void treeNodesInserted(TreeModelEvent treeModelEvent) {
                TreeTableModelAdapter.this.delayedFireTableDataChanged();
            }

            public void treeNodesRemoved(TreeModelEvent treeModelEvent) {
                TreeTableModelAdapter.this.delayedFireTableDataChanged();
            }

            public void treeStructureChanged(TreeModelEvent treeModelEvent) {
                TreeTableModelAdapter.this.delayedFireTableDataChanged();
            }
        });
    }

    public void delayedFireTableDataChanged() {
        SwingUtilities.invokeLater(new Runnable() { // from class: org.mozilla.javascript.tools.debugger.treetable.TreeTableModelAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                TreeTableModelAdapter.this.fireTableDataChanged();
            }
        });
    }

    public Class<?> getColumnClass(int i11) {
        return this.treeTableModel.getColumnClass(i11);
    }

    public int getColumnCount() {
        return this.treeTableModel.getColumnCount();
    }

    public String getColumnName(int i11) {
        return this.treeTableModel.getColumnName(i11);
    }

    public int getRowCount() {
        return this.tree.getRowCount();
    }

    public Object getValueAt(int i11, int i12) {
        return this.treeTableModel.getValueAt(nodeForRow(i11), i12);
    }

    public boolean isCellEditable(int i11, int i12) {
        return this.treeTableModel.isCellEditable(nodeForRow(i11), i12);
    }

    public Object nodeForRow(int i11) {
        return this.tree.getPathForRow(i11).getLastPathComponent();
    }

    public void setValueAt(Object obj, int i11, int i12) {
        this.treeTableModel.setValueAt(obj, nodeForRow(i11), i12);
    }
}
