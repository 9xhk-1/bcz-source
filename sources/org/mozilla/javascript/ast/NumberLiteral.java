package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class NumberLiteral extends AstNode {
    private double number;
    private String value;

    public NumberLiteral() {
        this.type = 40;
    }

    public double getNumber() {
        return this.number;
    }

    public String getValue() {
        return this.value;
    }

    public void setNumber(double d11) {
        this.number = d11;
    }

    public void setValue(String str) {
        assertNotNull(str);
        this.value = str;
    }

    @Override // org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(makeIndent(i11));
        String str = this.value;
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

    public NumberLiteral(int i11) {
        super(i11);
        this.type = 40;
    }

    public NumberLiteral(int i11, int i12) {
        super(i11, i12);
        this.type = 40;
    }

    public NumberLiteral(int i11, String str) {
        super(i11);
        this.type = 40;
        setValue(str);
        setLength(str.length());
    }

    public NumberLiteral(int i11, String str, double d11) {
        this(i11, str);
        setDouble(d11);
    }

    public NumberLiteral(double d11) {
        this.type = 40;
        setDouble(d11);
        setValue(Double.toString(d11));
    }
}
