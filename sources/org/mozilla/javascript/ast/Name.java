package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Name extends AstNode {
    private String identifier;
    private Scope scope;

    public Name() {
        this.type = 39;
    }

    public Scope getDefiningScope() {
        Scope enclosingScope = getEnclosingScope();
        String identifier = getIdentifier();
        if (enclosingScope == null) {
            return null;
        }
        return enclosingScope.getDefiningScope(identifier);
    }

    public String getIdentifier() {
        return this.identifier;
    }

    @Override // org.mozilla.javascript.Node
    public Scope getScope() {
        return this.scope;
    }

    public boolean isLocalName() {
        Scope definingScope = getDefiningScope();
        return (definingScope == null || definingScope.getParentScope() == null) ? false : true;
    }

    public int length() {
        String str = this.identifier;
        if (str == null) {
            return 0;
        }
        return str.length();
    }

    public void setIdentifier(String str) {
        assertNotNull(str);
        this.identifier = str;
        setLength(str.length());
    }

    @Override // org.mozilla.javascript.Node
    public void setScope(Scope scope) {
        this.scope = scope;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        String str = this.identifier;
        if (str == null) {
            str = "<null>";
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public void visit(NodeVisitor nodeVisitor) {
        nodeVisitor.visit(this);
    }

    public Name(int i11) {
        super(i11);
        this.type = 39;
    }

    public Name(int i11, int i12) {
        super(i11, i12);
        this.type = 39;
    }

    public Name(int i11, int i12, String str) {
        super(i11, i12);
        this.type = 39;
        setIdentifier(str);
    }

    public Name(int i11, String str) {
        super(i11);
        this.type = 39;
        setIdentifier(str);
        setLength(str.length());
    }
}
