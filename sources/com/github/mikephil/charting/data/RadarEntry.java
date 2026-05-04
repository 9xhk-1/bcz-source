package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ParcelCreator"})
/* loaded from: classes6.dex */
public class RadarEntry extends Entry {
    public RadarEntry(float f11) {
        super(0.0f, f11);
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float j() {
        return super.j();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void k(float f11) {
        super.k(f11);
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public RadarEntry h() {
        return new RadarEntry(c(), a());
    }

    public float m() {
        return c();
    }

    public RadarEntry(float f11, Object obj) {
        super(0.0f, f11, obj);
    }
}
