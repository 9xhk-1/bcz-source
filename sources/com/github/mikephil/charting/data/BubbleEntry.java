package com.github.mikephil.charting.data;

import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"ParcelCreator"})
/* loaded from: classes6.dex */
public class BubbleEntry extends Entry {

    /* renamed from: e, reason: collision with root package name */
    public float f30244e;

    public BubbleEntry(float f11, float f12, float f13) {
        super(f11, f12);
        this.f30244e = f13;
    }

    @Override // com.github.mikephil.charting.data.Entry
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public BubbleEntry h() {
        return new BubbleEntry(j(), c(), this.f30244e, a());
    }

    public float m() {
        return this.f30244e;
    }

    public void n(float f11) {
        this.f30244e = f11;
    }

    public BubbleEntry(float f11, float f12, float f13, Object obj) {
        super(f11, f12, obj);
        this.f30244e = f13;
    }

    public BubbleEntry(float f11, float f12, float f13, Drawable drawable) {
        super(f11, f12, drawable);
        this.f30244e = f13;
    }

    public BubbleEntry(float f11, float f12, float f13, Drawable drawable, Object obj) {
        super(f11, f12, drawable, obj);
        this.f30244e = f13;
    }
}
