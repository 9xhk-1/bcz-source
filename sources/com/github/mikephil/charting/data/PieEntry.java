package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.util.Log;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ParcelCreator"})
/* loaded from: classes6.dex */
public class PieEntry extends Entry {

    /* renamed from: e, reason: collision with root package name */
    public String f30258e;

    public PieEntry(float f11) {
        super(0.0f, f11);
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public float j() {
        Log.i("DEPRECATED", "Pie entries do not have x values");
        return super.j();
    }

    @Override // com.github.mikephil.charting.data.Entry
    @Deprecated
    public void k(float f11) {
        super.k(f11);
        Log.i("DEPRECATED", "Pie entries do not have x values");
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public PieEntry h() {
        return new PieEntry(c(), this.f30258e, a());
    }

    public String m() {
        return this.f30258e;
    }

    public float n() {
        return c();
    }

    public void o(String str) {
        this.f30258e = str;
    }

    public PieEntry(float f11, Object obj) {
        super(0.0f, f11, obj);
    }

    public PieEntry(float f11, Drawable drawable) {
        super(0.0f, f11, drawable);
    }

    public PieEntry(float f11, Drawable drawable, Object obj) {
        super(0.0f, f11, drawable, obj);
    }

    public PieEntry(float f11, String str) {
        super(0.0f, f11);
        this.f30258e = str;
    }

    public PieEntry(float f11, String str, Object obj) {
        super(0.0f, f11, obj);
        this.f30258e = str;
    }

    public PieEntry(float f11, String str, Drawable drawable) {
        super(0.0f, f11, drawable);
        this.f30258e = str;
    }

    public PieEntry(float f11, String str, Drawable drawable, Object obj) {
        super(0.0f, f11, drawable, obj);
        this.f30258e = str;
    }
}
