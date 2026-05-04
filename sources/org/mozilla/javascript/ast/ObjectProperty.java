package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class ObjectProperty extends InfixExpression {
    public ObjectProperty() {
        this.type = 103;
    }

    public boolean isGetter() {
        return this.type == 151;
    }

    public boolean isSetter() {
        return this.type == 152;
    }

    public void setIsGetter() {
        this.type = 151;
    }

    public void setIsSetter() {
        this.type = 152;
    }

    public void setNodeType(int i11) {
        if (i11 == 103 || i11 == 151 || i11 == 152) {
            setType(i11);
            return;
        }
        throw new IllegalArgumentException("invalid node type: " + i11);
    }

    @Override // org.mozilla.javascript.ast.InfixExpression, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        if (isGetter()) {
            sb2.append("get ");
        } else if (isSetter()) {
            sb2.append("set ");
        }
        sb2.append(this.left.toSource(0));
        if (this.type == 103) {
            sb2.append(": ");
        }
        sb2.append(this.right.toSource(0));
        return sb2.toString();
    }

    public ObjectProperty(int i11) {
        super(i11);
        this.type = 103;
    }

    public ObjectProperty(int i11, int i12) {
        super(i11, i12);
        this.type = 103;
    }
}
