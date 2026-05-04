package org.mozilla.javascript.ast;

import n6.m;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class KeywordLiteral extends AstNode {
    public KeywordLiteral() {
    }

    public boolean isBooleanLiteral() {
        int i11 = this.type;
        return i11 == 45 || i11 == 44;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        int type = getType();
        if (type != 160) {
            switch (type) {
                case 42:
                    sb2.append("null");
                    break;
                case 43:
                    sb2.append("this");
                    break;
                case 44:
                    sb2.append("false");
                    break;
                case 45:
                    sb2.append(m.f74525c);
                    break;
                default:
                    throw new IllegalStateException("Invalid keyword literal type: " + getType());
            }
        } else {
            sb2.append("debugger;\n");
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public KeywordLiteral(int i11) {
        super(i11);
    }

    @Override // org.mozilla.javascript.Node
    public KeywordLiteral setType(int i11) {
        if (i11 == 43 || i11 == 42 || i11 == 45 || i11 == 44 || i11 == 160) {
            this.type = i11;
            return this;
        }
        throw new IllegalArgumentException("Invalid node type: " + i11);
    }

    public KeywordLiteral(int i11, int i12) {
        super(i11, i12);
    }

    public KeywordLiteral(int i11, int i12, int i13) {
        super(i11, i12);
        setType(i13);
    }
}
