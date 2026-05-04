package com.google.android.material.circularreveal;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.GridLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.material.circularreveal.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CircularRevealGridLayout extends GridLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final b f31049a;

    public CircularRevealGridLayout(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.c
    public void a() {
        this.f31049a.b();
    }

    @Override // com.google.android.material.circularreveal.b.a
    public void b(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // com.google.android.material.circularreveal.b.a
    public boolean c() {
        return super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void d() {
        this.f31049a.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(@NonNull Canvas canvas) {
        b bVar = this.f31049a;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f31049a.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.f31049a.h();
    }

    @Override // com.google.android.material.circularreveal.c
    @Nullable
    public c.e getRevealInfo() {
        return this.f31049a.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.f31049a;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f31049a.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(@ColorInt int i11) {
        this.f31049a.n(i11);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setRevealInfo(@Nullable c.e eVar) {
        this.f31049a.o(eVar);
    }

    public CircularRevealGridLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31049a = new b(this);
    }
}
