package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ErrorNode extends AstNode {
    private String message;

    public ErrorNode() {
        this.type = -1;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String str) {
        this.message = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return "";
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public ErrorNode(int i11) {
        super(i11);
        this.type = -1;
    }

    public ErrorNode(int i11, int i12) {
        super(i11, i12);
        this.type = -1;
    }
}
