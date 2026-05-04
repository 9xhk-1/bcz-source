package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class EmptyExpression extends AstNode {
    public EmptyExpression() {
        this.type = 128;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11);
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public EmptyExpression(int i11) {
        super(i11);
        this.type = 128;
    }

    public EmptyExpression(int i11, int i12) {
        super(i11, i12);
        this.type = 128;
    }
}
