package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ContinueStatement extends Jump {
    private Name label;
    private Loop target;

    public ContinueStatement() {
        this.type = 121;
    }

    public Name getLabel() {
        return this.label;
    }

    public Loop getTarget() {
        return this.target;
    }

    public void setLabel(Name name) {
        this.label = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    public void setTarget(Loop loop) {
        assertNotNull(loop);
        this.target = loop;
        setJumpStatement(loop);
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        sb2.append("continue");
        if (this.label != null) {
            sb2.append(" ");
            sb2.append(this.label.toSource(0));
        }
        sb2.append(";\n");
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.Jump, org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        Name name;
        if (!nodeVisitor.visit(this) || (name = this.label) == null) {
            return;
        }
        name.visit(nodeVisitor);
    }

    public ContinueStatement(int i11) {
        this(i11, -1);
    }

    public ContinueStatement(int i11, int i12) {
        this.type = 121;
        this.position = i11;
        this.length = i12;
    }

    public ContinueStatement(Name name) {
        this.type = 121;
        setLabel(name);
    }

    public ContinueStatement(int i11, Name name) {
        this(i11);
        setLabel(name);
    }

    public ContinueStatement(int i11, int i12, Name name) {
        this(i11, i12);
        setLabel(name);
    }
}
