package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ReturnStatement extends AstNode {
    private AstNode returnValue;

    public ReturnStatement() {
        this.type = 4;
    }

    public AstNode getReturnValue() {
        return this.returnValue;
    }

    public void setReturnValue(AstNode astNode) {
        this.returnValue = astNode;
        if (astNode != null) {
            astNode.setParent(this);
        }
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("return");
        if (this.returnValue != null) {
            sb2.append(" ");
            sb2.append(this.returnValue.toSource(0));
        }
        sb2.append(";\n");
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        AstNode astNode;
        if (!nodeVisitor.visit(this) || (astNode = this.returnValue) == null) {
            return;
        }
        astNode.visit(nodeVisitor);
    }

    public ReturnStatement(int i11) {
        super(i11);
        this.type = 4;
    }

    public ReturnStatement(int i11, int i12) {
        super(i11, i12);
        this.type = 4;
    }

    public ReturnStatement(int i11, int i12, AstNode astNode) {
        super(i11, i12);
        this.type = 4;
        setReturnValue(astNode);
    }
}
