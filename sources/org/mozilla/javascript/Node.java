package org.mozilla.javascript;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.mozilla.javascript.ast.Comment;
import org.mozilla.javascript.ast.Jump;
import org.mozilla.javascript.ast.Name;
import org.mozilla.javascript.ast.NumberLiteral;
import org.mozilla.javascript.ast.Scope;
import org.mozilla.javascript.ast.ScriptNode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Node implements Iterable<Node> {
    public static final int ATTRIBUTE_FLAG = 2;
    public static final int BOTH = 0;
    public static final int CASEARRAY_PROP = 5;
    public static final int CATCH_SCOPE_PROP = 14;
    public static final int CONTROL_BLOCK_PROP = 18;
    public static final int DECR_FLAG = 1;
    public static final int DESCENDANTS_FLAG = 4;
    public static final int DESTRUCTURING_ARRAY_LENGTH = 21;
    public static final int DESTRUCTURING_NAMES = 22;
    public static final int DESTRUCTURING_PARAMS = 23;
    public static final int DESTRUCTURING_SHORTHAND = 26;
    public static final int DIRECTCALL_PROP = 9;
    public static final int END_DROPS_OFF = 1;
    public static final int END_RETURNS = 2;
    public static final int END_RETURNS_VALUE = 4;
    public static final int END_UNREACHED = 0;
    public static final int END_YIELDS = 8;
    public static final int EXPRESSION_CLOSURE_PROP = 25;
    public static final int FUNCTION_PROP = 1;
    public static final int GENERATOR_END_PROP = 20;
    public static final int INCRDECR_PROP = 13;
    public static final int ISNUMBER_PROP = 8;
    public static final int JSDOC_PROP = 24;
    public static final int LABEL_ID_PROP = 15;
    public static final int LAST_PROP = 26;
    public static final int LEFT = 1;
    public static final int LOCAL_BLOCK_PROP = 3;
    public static final int LOCAL_PROP = 2;
    public static final int MEMBER_TYPE_PROP = 16;
    public static final int NAME_PROP = 17;
    public static final int NON_SPECIALCALL = 0;
    private static final Node NOT_SET = new Node(-1);
    public static final int OBJECT_IDS_PROP = 12;
    public static final int PARENTHESIZED_PROP = 19;
    public static final int POST_FLAG = 2;
    public static final int PROPERTY_FLAG = 1;
    public static final int REGEXP_PROP = 4;
    public static final int RIGHT = 2;
    public static final int SKIP_INDEXES_PROP = 11;
    public static final int SPECIALCALL_EVAL = 1;
    public static final int SPECIALCALL_PROP = 10;
    public static final int SPECIALCALL_WITH = 2;
    public static final int TARGETBLOCK_PROP = 6;
    public static final int VARIABLE_PROP = 7;
    protected Node first;
    protected Node last;
    protected int lineno;
    protected Node next;
    protected PropListItem propListHead;
    protected int type;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class NodeIterator implements Iterator<Node> {
        private Node cursor;
        private Node prev2;
        private Node prev = Node.NOT_SET;
        private boolean removed = false;

        public NodeIterator() {
            this.cursor = Node.this.first;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.cursor != null;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (this.prev == Node.NOT_SET) {
                throw new IllegalStateException("next() has not been called");
            }
            if (this.removed) {
                throw new IllegalStateException("remove() already called for current element");
            }
            Node node = this.prev;
            Node node2 = Node.this;
            if (node == node2.first) {
                node2.first = node.next;
                return;
            }
            if (node != node2.last) {
                this.prev2.next = this.cursor;
            } else {
                Node node3 = this.prev2;
                node3.next = null;
                node2.last = node3;
            }
        }

        @Override // java.util.Iterator
        public Node next() {
            Node node = this.cursor;
            if (node == null) {
                throw new NoSuchElementException();
            }
            this.removed = false;
            this.prev2 = this.prev;
            this.prev = node;
            this.cursor = node.next;
            return node;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PropListItem {
        int intValue;
        PropListItem next;
        Object objectValue;
        int type;

        private PropListItem() {
        }
    }

    public Node(int i11) {
        this.lineno = -1;
        this.type = i11;
    }

    private int endCheck() {
        int i11 = this.type;
        if (i11 == 4) {
            return this.first != null ? 4 : 2;
        }
        if (i11 == 50) {
            return 0;
        }
        if (i11 == 72) {
            return 8;
        }
        if (i11 == 129 || i11 == 141) {
            Node node = this.first;
            if (node == null) {
                return 1;
            }
            int i12 = node.type;
            return i12 != 7 ? i12 != 81 ? i12 != 114 ? i12 != 130 ? endCheckBlock() : node.endCheckLabel() : node.endCheckSwitch() : node.endCheckTry() : node.endCheckIf();
        }
        if (i11 == 120) {
            return endCheckBreak();
        }
        if (i11 == 121) {
            return 0;
        }
        switch (i11) {
            case 131:
                Node node2 = this.next;
                if (node2 != null) {
                    return node2.endCheck();
                }
                return 1;
            case 132:
                return endCheckLoop();
            case 133:
                Node node3 = this.first;
                if (node3 != null) {
                    return node3.endCheck();
                }
                return 1;
            default:
                return 1;
        }
    }

    private int endCheckBlock() {
        int i11 = 1;
        for (Node node = this.first; (i11 & 1) != 0 && node != null; node = node.next) {
            i11 = (i11 & (-2)) | node.endCheck();
        }
        return i11;
    }

    private int endCheckBreak() {
        ((Jump) this).getJumpStatement().putIntProp(18, 1);
        return 0;
    }

    private int endCheckIf() {
        Node node = this.next;
        Node node2 = ((Jump) this).target;
        int endCheck = node.endCheck();
        return node2 != null ? endCheck | node2.endCheck() : endCheck | 1;
    }

    private int endCheckLabel() {
        return this.next.endCheck() | getIntProp(18, 0);
    }

    private int endCheckLoop() {
        Node node = this.first;
        while (true) {
            Node node2 = node.next;
            if (node2 == this.last) {
                break;
            }
            node = node2;
        }
        if (node.type != 6) {
            return 1;
        }
        int endCheck = ((Jump) node).target.next.endCheck();
        if (node.first.type == 45) {
            endCheck &= -2;
        }
        return getIntProp(18, 0) | endCheck;
    }

    private int endCheckSwitch() {
        return 0;
    }

    private int endCheckTry() {
        return 0;
    }

    private PropListItem ensureProperty(int i11) {
        PropListItem lookupProperty = lookupProperty(i11);
        if (lookupProperty != null) {
            return lookupProperty;
        }
        PropListItem propListItem = new PropListItem();
        propListItem.type = i11;
        propListItem.next = this.propListHead;
        this.propListHead = propListItem;
        return propListItem;
    }

    private PropListItem lookupProperty(int i11) {
        PropListItem propListItem = this.propListHead;
        while (propListItem != null && i11 != propListItem.type) {
            propListItem = propListItem.next;
        }
        return propListItem;
    }

    public static Node newNumber(double d11) {
        NumberLiteral numberLiteral = new NumberLiteral();
        numberLiteral.setNumber(d11);
        return numberLiteral;
    }

    public static Node newString(String str) {
        return newString(41, str);
    }

    public static Node newTarget() {
        return new Node(131);
    }

    private static final String propToString(int i11) {
        return null;
    }

    private void resetTargets_r() {
        int i11 = this.type;
        if (i11 == 131 || i11 == 72) {
            labelId(-1);
        }
        for (Node node = this.first; node != null; node = node.next) {
            node.resetTargets_r();
        }
    }

    private void toString(ObjToIntMap objToIntMap, StringBuffer stringBuffer) {
    }

    public void addChildAfter(Node node, Node node2) {
        if (node.next != null) {
            throw new RuntimeException("newChild had siblings in addChildAfter");
        }
        node.next = node2.next;
        node2.next = node;
        if (this.last == node2) {
            this.last = node;
        }
    }

    public void addChildBefore(Node node, Node node2) {
        if (node.next != null) {
            throw new RuntimeException("newChild had siblings in addChildBefore");
        }
        Node node3 = this.first;
        if (node3 != node2) {
            addChildAfter(node, getChildBefore(node2));
        } else {
            node.next = node3;
            this.first = node;
        }
    }

    public void addChildToBack(Node node) {
        node.next = null;
        Node node2 = this.last;
        if (node2 == null) {
            this.last = node;
            this.first = node;
        } else {
            node2.next = node;
            this.last = node;
        }
    }

    public void addChildToFront(Node node) {
        node.next = this.first;
        this.first = node;
        if (this.last == null) {
            this.last = node;
        }
    }

    public void addChildrenToBack(Node node) {
        Node node2 = this.last;
        if (node2 != null) {
            node2.next = node;
        }
        this.last = node.getLastSibling();
        if (this.first == null) {
            this.first = node;
        }
    }

    public void addChildrenToFront(Node node) {
        Node lastSibling = node.getLastSibling();
        lastSibling.next = this.first;
        this.first = node;
        if (this.last == null) {
            this.last = lastSibling;
        }
    }

    public Node getChildBefore(Node node) {
        Node node2 = this.first;
        if (node == node2) {
            return null;
        }
        while (true) {
            Node node3 = node2.next;
            if (node3 == node) {
                return node2;
            }
            if (node3 == null) {
                throw new RuntimeException("node is not a child");
            }
            node2 = node3;
        }
    }

    public final double getDouble() {
        return ((NumberLiteral) this).getNumber();
    }

    public int getExistingIntProp(int i11) {
        PropListItem lookupProperty = lookupProperty(i11);
        if (lookupProperty == null) {
            Kit.codeBug();
        }
        return lookupProperty.intValue;
    }

    public Node getFirstChild() {
        return this.first;
    }

    public int getIntProp(int i11, int i12) {
        PropListItem lookupProperty = lookupProperty(i11);
        return lookupProperty == null ? i12 : lookupProperty.intValue;
    }

    public String getJsDoc() {
        Comment jsDocNode = getJsDocNode();
        if (jsDocNode != null) {
            return jsDocNode.getValue();
        }
        return null;
    }

    public Comment getJsDocNode() {
        return (Comment) getProp(24);
    }

    public Node getLastChild() {
        return this.last;
    }

    public Node getLastSibling() {
        Node node = this;
        while (true) {
            Node node2 = node.next;
            if (node2 == null) {
                return node;
            }
            node = node2;
        }
    }

    public int getLineno() {
        return this.lineno;
    }

    public Node getNext() {
        return this.next;
    }

    public Object getProp(int i11) {
        PropListItem lookupProperty = lookupProperty(i11);
        if (lookupProperty == null) {
            return null;
        }
        return lookupProperty.objectValue;
    }

    public Scope getScope() {
        return ((Name) this).getScope();
    }

    public final String getString() {
        return ((Name) this).getIdentifier();
    }

    public int getType() {
        return this.type;
    }

    public boolean hasChildren() {
        return this.first != null;
    }

    public boolean hasConsistentReturnUsage() {
        int endCheck = endCheck();
        return (endCheck & 4) == 0 || (endCheck & 11) == 0;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:57:0x008a A[ADDED_TO_REGION, FALL_THROUGH, REMOVE, RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hasSideEffects() {
        /*
            r3 = this;
            int r0 = r3.type
            r1 = 30
            r2 = 1
            if (r0 == r1) goto L8a
            r1 = 31
            if (r0 == r1) goto L8a
            r1 = 37
            if (r0 == r1) goto L8a
            r1 = 38
            if (r0 == r1) goto L8a
            r1 = 50
            if (r0 == r1) goto L8a
            r1 = 51
            if (r0 == r1) goto L8a
            r1 = 56
            if (r0 == r1) goto L8a
            r1 = 57
            if (r0 == r1) goto L8a
            r1 = 81
            if (r0 == r1) goto L8a
            r1 = 82
            if (r0 == r1) goto L8a
            r1 = 0
            switch(r0) {
                case -1: goto L8a;
                case 35: goto L8a;
                case 64: goto L8a;
                case 72: goto L8a;
                case 89: goto L81;
                case 90: goto L8a;
                case 91: goto L8a;
                case 92: goto L8a;
                case 93: goto L8a;
                case 94: goto L8a;
                case 95: goto L8a;
                case 96: goto L8a;
                case 97: goto L8a;
                case 98: goto L8a;
                case 99: goto L8a;
                case 100: goto L8a;
                case 101: goto L8a;
                case 102: goto L5a;
                case 117: goto L8a;
                case 118: goto L8a;
                case 119: goto L8a;
                case 120: goto L8a;
                case 121: goto L8a;
                case 122: goto L8a;
                case 123: goto L8a;
                case 124: goto L8a;
                case 125: goto L8a;
                case 129: goto L8a;
                case 130: goto L8a;
                case 131: goto L8a;
                case 132: goto L8a;
                case 133: goto L81;
                case 134: goto L8a;
                case 135: goto L8a;
                case 139: goto L8a;
                case 140: goto L8a;
                case 141: goto L8a;
                case 142: goto L8a;
                case 153: goto L8a;
                case 154: goto L8a;
                case 158: goto L8a;
                case 159: goto L8a;
                default: goto L2f;
            }
        L2f:
            switch(r0) {
                case 2: goto L8a;
                case 3: goto L8a;
                case 4: goto L8a;
                case 5: goto L8a;
                case 6: goto L8a;
                case 7: goto L8a;
                case 8: goto L8a;
                default: goto L32;
            }
        L32:
            switch(r0) {
                case 68: goto L8a;
                case 69: goto L8a;
                case 70: goto L8a;
                default: goto L35;
            }
        L35:
            switch(r0) {
                case 104: goto L3c;
                case 105: goto L3c;
                case 106: goto L8a;
                case 107: goto L8a;
                default: goto L38;
            }
        L38:
            switch(r0) {
                case 112: goto L8a;
                case 113: goto L8a;
                case 114: goto L8a;
                default: goto L3b;
            }
        L3b:
            return r1
        L3c:
            org.mozilla.javascript.Node r0 = r3.first
            if (r0 == 0) goto L44
            org.mozilla.javascript.Node r0 = r3.last
            if (r0 != 0) goto L47
        L44:
            org.mozilla.javascript.Kit.codeBug()
        L47:
            org.mozilla.javascript.Node r0 = r3.first
            boolean r0 = r0.hasSideEffects()
            if (r0 != 0) goto L59
            org.mozilla.javascript.Node r0 = r3.last
            boolean r0 = r0.hasSideEffects()
            if (r0 == 0) goto L58
            goto L59
        L58:
            return r1
        L59:
            return r2
        L5a:
            org.mozilla.javascript.Node r0 = r3.first
            if (r0 == 0) goto L66
            org.mozilla.javascript.Node r0 = r0.next
            if (r0 == 0) goto L66
            org.mozilla.javascript.Node r0 = r0.next
            if (r0 != 0) goto L69
        L66:
            org.mozilla.javascript.Kit.codeBug()
        L69:
            org.mozilla.javascript.Node r0 = r3.first
            org.mozilla.javascript.Node r0 = r0.next
            boolean r0 = r0.hasSideEffects()
            if (r0 == 0) goto L80
            org.mozilla.javascript.Node r0 = r3.first
            org.mozilla.javascript.Node r0 = r0.next
            org.mozilla.javascript.Node r0 = r0.next
            boolean r0 = r0.hasSideEffects()
            if (r0 == 0) goto L80
            return r2
        L80:
            return r1
        L81:
            org.mozilla.javascript.Node r0 = r3.last
            if (r0 == 0) goto L8a
            boolean r0 = r0.hasSideEffects()
            return r0
        L8a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: org.mozilla.javascript.Node.hasSideEffects():boolean");
    }

    @Override // java.lang.Iterable
    public Iterator<Node> iterator() {
        return new NodeIterator();
    }

    public final int labelId() {
        int i11 = this.type;
        if (i11 != 131 && i11 != 72) {
            Kit.codeBug();
        }
        return getIntProp(15, -1);
    }

    public void putIntProp(int i11, int i12) {
        ensureProperty(i11).intValue = i12;
    }

    public void putProp(int i11, Object obj) {
        if (obj == null) {
            removeProp(i11);
        } else {
            ensureProperty(i11).objectValue = obj;
        }
    }

    public void removeChild(Node node) {
        Node childBefore = getChildBefore(node);
        if (childBefore == null) {
            this.first = this.first.next;
        } else {
            childBefore.next = node.next;
        }
        if (node == this.last) {
            this.last = childBefore;
        }
        node.next = null;
    }

    public void removeChildren() {
        this.last = null;
        this.first = null;
    }

    public void removeProp(int i11) {
        PropListItem propListItem = this.propListHead;
        if (propListItem != null) {
            PropListItem propListItem2 = null;
            while (propListItem.type != i11) {
                PropListItem propListItem3 = propListItem.next;
                if (propListItem3 == null) {
                    return;
                }
                propListItem2 = propListItem;
                propListItem = propListItem3;
            }
            if (propListItem2 == null) {
                this.propListHead = propListItem.next;
            } else {
                propListItem2.next = propListItem.next;
            }
        }
    }

    public void replaceChild(Node node, Node node2) {
        node2.next = node.next;
        if (node == this.first) {
            this.first = node2;
        } else {
            getChildBefore(node).next = node2;
        }
        if (node == this.last) {
            this.last = node2;
        }
        node.next = null;
    }

    public void replaceChildAfter(Node node, Node node2) {
        Node node3 = node.next;
        node2.next = node3.next;
        node.next = node2;
        if (node3 == this.last) {
            this.last = node2;
        }
        node3.next = null;
    }

    public void resetTargets() {
        if (this.type == 125) {
            resetTargets_r();
        } else {
            Kit.codeBug();
        }
    }

    public final void setDouble(double d11) {
        ((NumberLiteral) this).setNumber(d11);
    }

    public void setJsDocNode(Comment comment) {
        putProp(24, comment);
    }

    public void setLineno(int i11) {
        this.lineno = i11;
    }

    public void setScope(Scope scope) {
        if (scope == null) {
            Kit.codeBug();
        }
        if (!(this instanceof Name)) {
            throw Kit.codeBug();
        }
        ((Name) this).setScope(scope);
    }

    public final void setString(String str) {
        if (str == null) {
            Kit.codeBug();
        }
        ((Name) this).setIdentifier(str);
    }

    public Node setType(int i11) {
        this.type = i11;
        return this;
    }

    public String toStringTree(ScriptNode scriptNode) {
        return null;
    }

    public static Node newString(int i11, String str) {
        Name name = new Name();
        name.setIdentifier(str);
        name.setType(i11);
        return name;
    }

    public String toString() {
        return String.valueOf(this.type);
    }

    public void labelId(int i11) {
        int i12 = this.type;
        if (i12 != 131 && i12 != 72) {
            Kit.codeBug();
        }
        putIntProp(15, i11);
    }

    public Node(int i11, Node node) {
        this.lineno = -1;
        this.type = i11;
        this.last = node;
        this.first = node;
        node.next = null;
    }

    public Node(int i11, Node node, Node node2) {
        this.lineno = -1;
        this.type = i11;
        this.first = node;
        this.last = node2;
        node.next = node2;
        node2.next = null;
    }

    public Node(int i11, Node node, Node node2, Node node3) {
        this.lineno = -1;
        this.type = i11;
        this.first = node;
        this.last = node3;
        node.next = node2;
        node2.next = node3;
        node3.next = null;
    }

    public Node(int i11, int i12) {
        this.type = i11;
        this.lineno = i12;
    }

    public Node(int i11, Node node, int i12) {
        this(i11, node);
        this.lineno = i12;
    }

    public Node(int i11, Node node, Node node2, int i12) {
        this(i11, node, node2);
        this.lineno = i12;
    }

    public Node(int i11, Node node, Node node2, Node node3, int i12) {
        this(i11, node, node2, node3);
        this.lineno = i12;
    }

    private static void generatePrintIds(Node node, ObjToIntMap objToIntMap) {
    }

    private static void appendPrintId(Node node, ObjToIntMap objToIntMap, StringBuffer stringBuffer) {
    }

    private static void toStringTreeHelper(ScriptNode scriptNode, Node node, ObjToIntMap objToIntMap, int i11, StringBuffer stringBuffer) {
    }
}
