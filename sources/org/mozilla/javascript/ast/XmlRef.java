package org.mozilla.javascript.ast;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public abstract class XmlRef extends AstNode {
    protected int atPos;
    protected int colonPos;
    protected Name namespace;

    public XmlRef() {
        this.atPos = -1;
        this.colonPos = -1;
    }

    public int getAtPos() {
        return this.atPos;
    }

    public int getColonPos() {
        return this.colonPos;
    }

    public Name getNamespace() {
        return this.namespace;
    }

    public boolean isAttributeAccess() {
        return this.atPos >= 0;
    }

    public void setAtPos(int i11) {
        this.atPos = i11;
    }

    public void setColonPos(int i11) {
        this.colonPos = i11;
    }

    public void setNamespace(Name name) {
        this.namespace = name;
        if (name != null) {
            name.setParent(this);
        }
    }

    public XmlRef(int i11) {
        super(i11);
        this.atPos = -1;
        this.colonPos = -1;
    }

    public XmlRef(int i11, int i12) {
        super(i11, i12);
        this.atPos = -1;
        this.colonPos = -1;
    }
}
