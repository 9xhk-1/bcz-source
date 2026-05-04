package org.mozilla.javascript.ast;

import com.baicizhan.client.framework.network.http.HttpRequest;
import com.bumptech.glide.load.engine.GlideException;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.xiaomi.mipush.sdk.Constants;
import java.io.Serializable;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.j2;
import org.mozilla.javascript.Kit;
import org.mozilla.javascript.Node;
import org.mozilla.javascript.Token;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class AstNode extends Node implements Comparable<AstNode> {
    private static Map<Integer, String> operatorNames;
    protected int length;
    protected AstNode parent;
    protected int position;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DebugPrintVisitor implements NodeVisitor {
        private static final int DEBUG_INDENT = 2;
        private StringBuilder buffer;

        public DebugPrintVisitor(StringBuilder sb2) {
            this.buffer = sb2;
        }

        private String makeIndent(int i11) {
            int i12 = i11 * 2;
            StringBuilder sb2 = new StringBuilder(i12);
            for (int i13 = 0; i13 < i12; i13++) {
                sb2.append(" ");
            }
            return sb2.toString();
        }

        public String toString() {
            return this.buffer.toString();
        }

        @Override // org.mozilla.javascript.ast.NodeVisitor
        public boolean visit(AstNode astNode) {
            int type = astNode.getType();
            String typeToName = Token.typeToName(type);
            StringBuilder sb2 = this.buffer;
            sb2.append(astNode.getAbsolutePosition());
            sb2.append("\t");
            this.buffer.append(makeIndent(astNode.depth()));
            StringBuilder sb3 = this.buffer;
            sb3.append(typeToName);
            sb3.append(" ");
            StringBuilder sb4 = this.buffer;
            sb4.append(astNode.getPosition());
            sb4.append(" ");
            this.buffer.append(astNode.getLength());
            if (type == 39) {
                StringBuilder sb5 = this.buffer;
                sb5.append(" ");
                sb5.append(((Name) astNode).getIdentifier());
            }
            this.buffer.append("\n");
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class PositionComparator implements Comparator<AstNode>, Serializable {
        private static final long serialVersionUID = 1;

        @Override // java.util.Comparator
        public int compare(AstNode astNode, AstNode astNode2) {
            return astNode.position - astNode2.position;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        operatorNames = hashMap;
        hashMap.put(52, "in");
        operatorNames.put(32, "typeof");
        operatorNames.put(53, "instanceof");
        operatorNames.put(31, "delete");
        operatorNames.put(89, ",");
        operatorNames.put(103, ":");
        operatorNames.put(104, "||");
        operatorNames.put(105, "&&");
        operatorNames.put(106, "++");
        operatorNames.put(107, HttpRequest.f17578o);
        operatorNames.put(9, HiAnalyticsConstant.REPORT_VAL_SEPARATOR);
        operatorNames.put(10, "^");
        operatorNames.put(11, "&");
        operatorNames.put(12, "==");
        operatorNames.put(13, "!=");
        operatorNames.put(14, "<");
        operatorNames.put(16, ">");
        operatorNames.put(15, "<=");
        operatorNames.put(17, ">=");
        operatorNames.put(18, "<<");
        operatorNames.put(19, ">>");
        operatorNames.put(20, ">>>");
        operatorNames.put(21, "+");
        operatorNames.put(22, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        operatorNames.put(23, "*");
        operatorNames.put(24, "/");
        operatorNames.put(25, "%");
        operatorNames.put(26, "!");
        operatorNames.put(27, Constants.WAVE_SEPARATOR);
        operatorNames.put(28, "+");
        operatorNames.put(29, Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        operatorNames.put(46, "===");
        operatorNames.put(47, "!==");
        operatorNames.put(90, ContainerUtils.KEY_VALUE_DELIMITER);
        operatorNames.put(91, "|=");
        operatorNames.put(93, "&=");
        operatorNames.put(94, "<<=");
        operatorNames.put(95, ">>=");
        operatorNames.put(96, ">>>=");
        operatorNames.put(97, "+=");
        operatorNames.put(98, "-=");
        operatorNames.put(99, "*=");
        operatorNames.put(100, "/=");
        operatorNames.put(101, "%=");
        operatorNames.put(92, "^=");
        operatorNames.put(126, "void");
    }

    public AstNode() {
        super(-1);
        this.position = -1;
        this.length = 1;
    }

    public static RuntimeException codeBug() throws RuntimeException {
        throw Kit.codeBug();
    }

    public static String operatorToString(int i11) {
        String str = operatorNames.get(Integer.valueOf(i11));
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException("Invalid operator: " + i11);
    }

    public void addChild(AstNode astNode) {
        assertNotNull(astNode);
        setLength((astNode.getPosition() + astNode.getLength()) - getPosition());
        addChildToBack(astNode);
        astNode.setParent(this);
    }

    public void assertNotNull(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException("arg cannot be null");
        }
    }

    public String debugPrint() {
        DebugPrintVisitor debugPrintVisitor = new DebugPrintVisitor(new StringBuilder(1000));
        visit(debugPrintVisitor);
        return debugPrintVisitor.toString();
    }

    public int depth() {
        AstNode astNode = this.parent;
        if (astNode == null) {
            return 0;
        }
        return astNode.depth() + 1;
    }

    public int getAbsolutePosition() {
        int i11 = this.position;
        for (AstNode astNode = this.parent; astNode != null; astNode = astNode.getParent()) {
            i11 += astNode.getPosition();
        }
        return i11;
    }

    public AstRoot getAstRoot() {
        AstNode astNode = this;
        while (astNode != null && !(astNode instanceof AstRoot)) {
            astNode = astNode.getParent();
        }
        return (AstRoot) astNode;
    }

    public FunctionNode getEnclosingFunction() {
        AstNode parent = getParent();
        while (parent != null && !(parent instanceof FunctionNode)) {
            parent = parent.getParent();
        }
        return (FunctionNode) parent;
    }

    public Scope getEnclosingScope() {
        AstNode parent = getParent();
        while (parent != null && !(parent instanceof Scope)) {
            parent = parent.getParent();
        }
        return (Scope) parent;
    }

    public int getLength() {
        return this.length;
    }

    @Override // org.mozilla.javascript.Node
    public int getLineno() {
        int i11 = this.lineno;
        if (i11 != -1) {
            return i11;
        }
        AstNode astNode = this.parent;
        if (astNode != null) {
            return astNode.getLineno();
        }
        return -1;
    }

    public AstNode getParent() {
        return this.parent;
    }

    public int getPosition() {
        return this.position;
    }

    @Override // org.mozilla.javascript.Node
    public boolean hasSideEffects() {
        int type = getType();
        if (type == 30 || type == 31 || type == 37 || type == 38 || type == 50 || type == 51 || type == 56 || type == 57 || type == 81 || type == 82 || type == 106 || type == 107) {
            return true;
        }
        switch (type) {
            case -1:
            case 35:
            case 64:
            case 72:
            case 90:
            case 91:
            case 92:
            case 93:
            case 94:
            case 95:
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
            case 117:
            case 118:
            case 119:
            case 120:
            case 121:
            case 122:
            case 123:
            case 124:
            case 125:
            case 129:
            case 130:
            case 131:
            case 132:
            case 134:
            case 135:
            case 139:
            case 140:
            case 141:
            case 142:
            case 153:
            case 154:
            case 158:
            case 159:
                return true;
            default:
                switch (type) {
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                        return true;
                    default:
                        switch (type) {
                            case 68:
                            case 69:
                            case 70:
                                return true;
                            default:
                                switch (type) {
                                    case 109:
                                    case 110:
                                    case 111:
                                    case 112:
                                    case 113:
                                    case 114:
                                        return true;
                                    default:
                                        return false;
                                }
                        }
                }
        }
    }

    public String makeIndent(int i11) {
        StringBuilder sb2 = new StringBuilder();
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append(GlideException.a.f28776d);
        }
        return sb2.toString();
    }

    public <T extends AstNode> void printList(List<T> list, StringBuilder sb2) {
        int size = list.size();
        int i11 = 0;
        for (T t11 : list) {
            sb2.append(t11.toSource(0));
            int i12 = i11 + 1;
            if (i11 < size - 1) {
                sb2.append(j2.O);
            } else if (t11 instanceof EmptyExpression) {
                sb2.append(",");
            }
            i11 = i12;
        }
    }

    public void setBounds(int i11, int i12) {
        setPosition(i11);
        setLength(i12 - i11);
    }

    public void setLength(int i11) {
        this.length = i11;
    }

    public void setParent(AstNode astNode) {
        AstNode astNode2 = this.parent;
        if (astNode == astNode2) {
            return;
        }
        if (astNode2 != null) {
            setRelative(-astNode2.getPosition());
        }
        this.parent = astNode;
        if (astNode != null) {
            setRelative(astNode.getPosition());
        }
    }

    public void setPosition(int i11) {
        this.position = i11;
    }

    public void setRelative(int i11) {
        this.position -= i11;
    }

    public String shortName() {
        String name = getClass().getName();
        return name.substring(name.lastIndexOf(".") + 1);
    }

    public String toSource() {
        return toSource(0);
    }

    public abstract String toSource(int i11);

    public abstract void visit(NodeVisitor nodeVisitor);

    @Override // java.lang.Comparable
    public int compareTo(AstNode astNode) {
        if (equals(astNode)) {
            return 0;
        }
        int absolutePosition = getAbsolutePosition();
        int absolutePosition2 = astNode.getAbsolutePosition();
        if (absolutePosition < absolutePosition2) {
            return -1;
        }
        if (absolutePosition2 < absolutePosition) {
            return 1;
        }
        int length = getLength();
        int length2 = astNode.getLength();
        if (length < length2) {
            return -1;
        }
        if (length2 < length) {
            return 1;
        }
        return hashCode() - astNode.hashCode();
    }

    public AstNode(int i11) {
        this();
        this.position = i11;
    }

    public AstNode(int i11, int i12) {
        this();
        this.position = i11;
        this.length = i12;
    }
}
