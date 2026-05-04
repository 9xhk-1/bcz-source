package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class EmptyStatement extends AstNode {
    public EmptyStatement() {
        this.type = 128;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + ";\n";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public EmptyStatement(int i11) {
        super(i11);
        this.type = 128;
    }

    public EmptyStatement(int i11, int i12) {
        super(i11, i12);
        this.type = 128;
    }
}
