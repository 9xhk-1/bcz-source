package com.google.android.material.circularreveal.coordinatorlayout;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.circularreveal.b;
import com.google.android.material.circularreveal.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class CircularRevealCoordinatorLayout extends CoordinatorLayout implements c {

    /* renamed from: a, reason: collision with root package name */
    @NonNull
    public final b f31077a;

    public CircularRevealCoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.circularreveal.c
    public void a() {
        this.f31077a.b();
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
        this.f31077a.a();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public void draw(Canvas canvas) {
        b bVar = this.f31077a;
        if (bVar != null) {
            bVar.c(canvas);
        } else {
            super.draw(canvas);
        }
    }

    @Override // com.google.android.material.circularreveal.c
    @Nullable
    public Drawable getCircularRevealOverlayDrawable() {
        return this.f31077a.g();
    }

    @Override // com.google.android.material.circularreveal.c
    public int getCircularRevealScrimColor() {
        return this.f31077a.h();
    }

    @Override // com.google.android.material.circularreveal.c
    @Nullable
    public c.e getRevealInfo() {
        return this.f31077a.j();
    }

    @Override // android.view.View, com.google.android.material.circularreveal.c
    public boolean isOpaque() {
        b bVar = this.f31077a;
        return bVar != null ? bVar.l() : super.isOpaque();
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealOverlayDrawable(@Nullable Drawable drawable) {
        this.f31077a.m(drawable);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setCircularRevealScrimColor(@ColorInt int i11) {
        this.f31077a.n(i11);
    }

    @Override // com.google.android.material.circularreveal.c
    public void setRevealInfo(@Nullable c.e eVar) {
        this.f31077a.o(eVar);
    }

    public CircularRevealCoordinatorLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31077a = new b(this);
    }
}
