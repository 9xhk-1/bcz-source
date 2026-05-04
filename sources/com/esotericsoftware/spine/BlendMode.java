package com.esotericsoftware.spine;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public enum BlendMode {
    normal(com.badlogic.gdx.graphics.f.f11653r, 1, com.badlogic.gdx.graphics.f.f11659s, 1),
    additive(com.badlogic.gdx.graphics.f.f11653r, 1, 1, 1),
    multiply(com.badlogic.gdx.graphics.f.f11677v, com.badlogic.gdx.graphics.f.f11677v, com.badlogic.gdx.graphics.f.f11659s, com.badlogic.gdx.graphics.f.f11659s),
    screen(1, 1, com.badlogic.gdx.graphics.f.f11647q, com.badlogic.gdx.graphics.f.f11647q);

    public static final BlendMode[] values = values();
    public final int destColor;
    public final int source;
    public final int sourceAlpha;
    public final int sourcePMA;

    BlendMode(int i11, int i12, int i13, int i14) {
        this.source = i11;
        this.sourcePMA = i12;
        this.destColor = i13;
        this.sourceAlpha = i14;
    }

    public void apply(w1.a aVar, boolean z11) {
        int i11 = z11 ? this.sourcePMA : this.source;
        int i12 = this.destColor;
        aVar.k0(i11, i12, this.sourceAlpha, i12);
    }
}
