package org.mozilla.javascript.ast;

import org.mozilla.javascript.Token;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class UnaryExpression extends AstNode {
    private boolean isPostfix;
    private AstNode operand;

    public UnaryExpression() {
    }

    public AstNode getOperand() {
        return this.operand;
    }

    public int getOperator() {
        return this.type;
    }

    public boolean isPostfix() {
        return this.isPostfix;
    }

    public boolean isPrefix() {
        return !this.isPostfix;
    }

    public void setIsPostfix(boolean z11) {
        this.isPostfix = z11;
    }

    public void setOperand(AstNode astNode) {
        assertNotNull(astNode);
        this.operand = astNode;
        astNode.setParent(this);
    }

    public void setOperator(int i11) {
        if (Token.isValidToken(i11)) {
            setType(i11);
            return;
        }
        throw new IllegalArgumentException("Invalid token: " + i11);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        int type = getType();
        if (!this.isPostfix) {
            sb2.append(AstNode.operatorToString(type));
            if (type == 32 || type == 31 || type == 126) {
                sb2.append(" ");
            }
        }
        sb2.append(this.operand.toSource());
        if (this.isPostfix) {
            sb2.append(AstNode.operatorToString(type));
        }
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        if (nodeVisitor.visit(this)) {
            this.operand.visit(nodeVisitor);
        }
    }

    public UnaryExpression(int i11) {
        super(i11);
    }

    public UnaryExpression(int i11, int i12) {
        super(i11, i12);
    }

    public UnaryExpression(int i11, int i12, AstNode astNode) {
        this(i11, i12, astNode, false);
    }

    public UnaryExpression(int i11, int i12, AstNode astNode, boolean z11) {
        assertNotNull(astNode);
        setBounds(z11 ? astNode.getPosition() : i12, z11 ? i12 + 2 : astNode.getPosition() + astNode.getLength());
        setOperator(i11);
        setOperand(astNode);
        this.isPostfix = z11;
    }
}
