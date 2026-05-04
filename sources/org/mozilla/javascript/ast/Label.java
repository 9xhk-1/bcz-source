package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Label extends Jump {
    private String name;

    public Label() {
        this.type = 130;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String str) {
        String trim = str == null ? null : str.trim();
        if (trim == null || "".equals(trim)) {
            throw new IllegalArgumentException("invalid label name");
        }
        this.name = trim;
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + this.name + ":\n";
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public Label(int i11) {
        this(i11, -1);
    }

    public Label(int i11, int i12) {
        this.type = 130;
        this.position = i11;
        this.length = i12;
    }

    public Label(int i11, int i12, String str) {
        this(i11, i12);
        setName(str);
    }
}
