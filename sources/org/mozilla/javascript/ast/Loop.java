package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class Loop extends Scope {
    protected AstNode body;

    /* renamed from: lp, reason: collision with root package name */
    protected int f78386lp;

    /* renamed from: rp, reason: collision with root package name */
    protected int f78387rp;

    public Loop() {
        this.f78386lp = -1;
        this.f78387rp = -1;
    }

    public AstNode getBody() {
        return this.body;
    }

    public int getLp() {
        return this.f78386lp;
    }

    public int getRp() {
        return this.f78387rp;
    }

    public void setBody(AstNode astNode) {
        this.body = astNode;
        setLength((astNode.getPosition() + astNode.getLength()) - getPosition());
        astNode.setParent(this);
    }

    public void setLp(int i11) {
        this.f78386lp = i11;
    }

    public void setParens(int i11, int i12) {
        this.f78386lp = i11;
        this.f78387rp = i12;
    }

    public void setRp(int i11) {
        this.f78387rp = i11;
    }

    public Loop(int i11) {
        super(i11);
        this.f78386lp = -1;
        this.f78387rp = -1;
    }

    public Loop(int i11, int i12) {
        super(i11, i12);
        this.f78386lp = -1;
        this.f78387rp = -1;
    }
}
