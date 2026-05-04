package com.igexin.push.core.i.a;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* loaded from: classes7.dex */
public abstract class b<T extends Drawable> implements l, m<T> {

    /* renamed from: a, reason: collision with root package name */
    protected final T f38191a;

    public b(T t11) {
        this.f38191a = (T) k.a(t11);
    }

    @Override // com.igexin.push.core.i.a.m
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final T c() {
        Drawable.ConstantState constantState = this.f38191a.getConstantState();
        return constantState == null ? this.f38191a : (T) constantState.newDrawable();
    }

    @Override // com.igexin.push.core.i.a.l
    public void b() {
        Bitmap a11;
        T t11 = this.f38191a;
        if (t11 instanceof BitmapDrawable) {
            a11 = ((BitmapDrawable) t11).getBitmap();
        } else if (!(t11 instanceof e)) {
            return;
        } else {
            a11 = ((e) t11).a();
        }
        a11.prepareToDraw();
    }
}
