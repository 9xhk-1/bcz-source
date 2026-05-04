package org.mozilla.javascript.tools.debugger;

import java.util.Arrays;
import java.util.Comparator;
import javax.swing.event.TreeModelListener;
import javax.swing.tree.TreePath;
import org.mozilla.javascript.tools.debugger.treetable.TreeTableModel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
class VariableModel implements TreeTableModel {
    private Dim debugger;
    private VariableNode root;
    private static final String[] cNames = {" Name", " Value"};
    private static final Class<?>[] cTypes = {TreeTableModel.class, String.class};
    private static final VariableNode[] CHILDLESS = new VariableNode[0];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VariableNode {
        private VariableNode[] children;

        /* renamed from: id, reason: collision with root package name */
        private Object f78409id;
        private Object object;

        public VariableNode(Object obj, Object obj2) {
            this.object = obj;
            this.f78409id = obj2;
        }

        public String toString() {
            Object obj = this.f78409id;
            if (obj instanceof String) {
                return (String) obj;
            }
            return "[" + ((Integer) this.f78409id).intValue() + "]";
        }
    }

    public VariableModel() {
    }

    private VariableNode[] children(VariableNode variableNode) {
        VariableNode[] variableNodeArr;
        if (variableNode.children != null) {
            return variableNode.children;
        }
        Object value = getValue(variableNode);
        Object[] objectIds = this.debugger.getObjectIds(value);
        if (objectIds == null || objectIds.length == 0) {
            variableNodeArr = CHILDLESS;
        } else {
            Arrays.sort(objectIds, new Comparator<Object>() { // from class: org.mozilla.javascript.tools.debugger.VariableModel.1
                @Override // java.util.Comparator
                public int compare(Object obj, Object obj2) {
                    if (obj instanceof String) {
                        if (obj2 instanceof Integer) {
                            return -1;
                        }
                        return ((String) obj).compareToIgnoreCase((String) obj2);
                    }
                    if (obj2 instanceof String) {
                        return 1;
                    }
                    return ((Integer) obj).intValue() - ((Integer) obj2).intValue();
                }
            });
            variableNodeArr = new VariableNode[objectIds.length];
            for (int i11 = 0; i11 != objectIds.length; i11++) {
                variableNodeArr[i11] = new VariableNode(value, objectIds[i11]);
            }
        }
        variableNode.children = variableNodeArr;
        return variableNodeArr;
    }

    public Object getChild(Object obj, int i11) {
        if (this.debugger == null) {
            return null;
        }
        return children((VariableNode) obj)[i11];
    }

    public int getChildCount(Object obj) {
        if (this.debugger == null) {
            return 0;
        }
        return children((VariableNode) obj).length;
    }

    @Override // org.mozilla.javascript.tools.debugger.treetable.TreeTableModel
    public Class<?> getColumnClass(int i11) {
        return cTypes[i11];
    }

    @Override // org.mozilla.javascript.tools.debugger.treetable.TreeTableModel
    public int getColumnCount() {
        return cNames.length;
    }

    @Override // org.mozilla.javascript.tools.debugger.treetable.TreeTableModel
    public String getColumnName(int i11) {
        return cNames[i11];
    }

    public int getIndexOfChild(Object obj, Object obj2) {
        if (this.debugger == null) {
            return -1;
        }
        VariableNode variableNode = (VariableNode) obj2;
        VariableNode[] children = children((VariableNode) obj);
        for (int i11 = 0; i11 != children.length; i11++) {
            if (children[i11] == variableNode) {
                return i11;
            }
        }
        return -1;
    }

    public Object getRoot() {
        if (this.debugger == null) {
            return null;
        }
        return this.root;
    }

    public Object getValue(VariableNode variableNode) {
        try {
            return this.debugger.getObjectProperty(variableNode.object, variableNode.f78409id);
        } catch (Exception unused) {
            return "undefined";
        }
    }

    @Override // org.mozilla.javascript.tools.debugger.treetable.TreeTableModel
    public Object getValueAt(Object obj, int i11) {
        String message;
        Dim dim = this.debugger;
        if (dim == null) {
            return null;
        }
        VariableNode variableNode = (VariableNode) obj;
        if (i11 == 0) {
            return variableNode.toString();
        }
        if (i11 != 1) {
            return null;
        }
        try {
            message = dim.objectToString(getValue(variableNode));
        } catch (RuntimeException e11) {
            message = e11.getMessage();
        }
        StringBuffer stringBuffer = new StringBuffer();
        int length = message.length();
        for (int i12 = 0; i12 < length; i12++) {
            char charAt = message.charAt(i12);
            if (Character.isISOControl(charAt)) {
                charAt = ' ';
            }
            stringBuffer.append(charAt);
        }
        return stringBuffer.toString();
    }

    @Override // org.mozilla.javascript.tools.debugger.treetable.TreeTableModel
    public boolean isCellEditable(Object obj, int i11) {
        return i11 == 0;
    }

    public boolean isLeaf(Object obj) {
        return this.debugger == null || children((VariableNode) obj).length == 0;
    }

    public VariableModel(Dim dim, Object obj) {
        this.debugger = dim;
        this.root = new VariableNode(obj, "this");
    }

    public void addTreeModelListener(TreeModelListener treeModelListener) {
    }

    public void removeTreeModelListener(TreeModelListener treeModelListener) {
    }

    public void valueForPathChanged(TreePath treePath, Object obj) {
    }

    @Override // org.mozilla.javascript.tools.debugger.treetable.TreeTableModel
    public void setValueAt(Object obj, Object obj2, int i11) {
    }
}
