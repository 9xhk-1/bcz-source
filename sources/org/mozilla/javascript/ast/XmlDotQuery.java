package org.mozilla.javascript.ast;

import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class XmlDotQuery extends InfixExpression {

    /* renamed from: rp, reason: collision with root package name */
    private int f78392rp;

    public XmlDotQuery() {
        this.f78392rp = -1;
        this.type = 146;
    }

    public int getRp() {
        return this.f78392rp;
    }

    public void setRp(int i11) {
        this.f78392rp = i11;
    }

    @Override // org.mozilla.javascript.ast.InfixExpression, org.mozilla.javascript.ast.AstNode
    public String toSource(int i11) {
        return makeIndent(i11) + getLeft().toSource(0) + ".(" + getRight().toSource(0) + j.f81007d;
    }

    public XmlDotQuery(int i11) {
        super(i11);
        this.f78392rp = -1;
        this.type = 146;
    }

    public XmlDotQuery(int i11, int i12) {
        super(i11, i12);
        this.f78392rp = -1;
        this.type = 146;
    }
}
