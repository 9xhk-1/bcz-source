package com.google.android.material.carousel;

import an.a;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.core.math.MathUtils;
import cn.j;
import cn.n;
import com.google.android.material.carousel.MaskableFrameLayout;
import vn.e;
import vn.p;
import vn.t;
import vn.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaskableFrameLayout extends FrameLayout implements j, t {

    /* renamed from: g, reason: collision with root package name */
    public static final int f30918g = -1;

    /* renamed from: a, reason: collision with root package name */
    public float f30919a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f30920b;

    /* renamed from: c, reason: collision with root package name */
    @Nullable
    public n f30921c;

    /* renamed from: d, reason: collision with root package name */
    @NonNull
    public p f30922d;

    /* renamed from: e, reason: collision with root package name */
    public final u f30923e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Boolean f30924f;

    public MaskableFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    public static /* synthetic */ e a(e eVar) {
        return eVar instanceof vn.a ? vn.c.b((vn.a) eVar) : eVar;
    }

    public final void c() {
        this.f30923e.f(this, this.f30920b);
        n nVar = this.f30921c;
        if (nVar != null) {
            nVar.a(this.f30920b);
        }
    }

    public final void d() {
        if (this.f30919a != -1.0f) {
            float b11 = vm.b.b(0.0f, getWidth() / 2.0f, 0.0f, 1.0f, this.f30919a);
            setMaskRectF(new RectF(b11, 0.0f, getWidth() - b11, getHeight()));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        this.f30923e.e(canvas, new a.InterfaceC0022a() { // from class: cn.l
            @Override // an.a.InterfaceC0022a
            public final void a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        RectF rectF = this.f30920b;
        rect.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
    }

    @Override // cn.j
    @NonNull
    public RectF getMaskRectF() {
        return this.f30920b;
    }

    @Override // cn.j
    @Deprecated
    public float getMaskXPercentage() {
        return this.f30919a;
    }

    @Override // vn.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f30922d;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.f30924f;
        if (bool != null) {
            this.f30923e.h(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f30924f = Boolean.valueOf(this.f30923e.c());
        this.f30923e.h(this, true);
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        if (this.f30919a != -1.0f) {
            d();
        }
    }

    @Override // android.view.View
    @SuppressLint({"ClickableViewAccessibility"})
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f30920b.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.f30920b.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    @VisibleForTesting
    public void setForceCompatClipping(boolean z11) {
        this.f30923e.h(this, z11);
    }

    @Override // cn.j
    public void setMaskRectF(@NonNull RectF rectF) {
        this.f30920b.set(rectF);
        c();
    }

    @Override // cn.j
    @Deprecated
    public void setMaskXPercentage(float f11) {
        float clamp = MathUtils.clamp(f11, 0.0f, 1.0f);
        if (this.f30919a != clamp) {
            this.f30919a = clamp;
            d();
        }
    }

    @Override // cn.j
    public void setOnMaskChangedListener(@Nullable n nVar) {
        this.f30921c = nVar;
    }

    @Override // vn.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        p y11 = pVar.y(new p.c() { // from class: cn.k
            @Override // vn.p.c
            public final vn.e a(vn.e eVar) {
                return MaskableFrameLayout.a(eVar);
            }
        });
        this.f30922d = y11;
        this.f30923e.g(this, y11);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f30919a = -1.0f;
        this.f30920b = new RectF();
        this.f30923e = u.a(this);
        this.f30924f = null;
        setShapeAppearanceModel(p.f(context, attributeSet, i11, 0, 0).m());
    }
}
