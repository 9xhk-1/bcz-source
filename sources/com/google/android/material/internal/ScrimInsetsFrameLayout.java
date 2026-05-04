package com.google.android.material.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.view.OnApplyWindowInsetsListener;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.material.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
/* loaded from: classes7.dex */
public class ScrimInsetsFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public Drawable f31488a;

    /* renamed from: b, reason: collision with root package name */
    public Rect f31489b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f31490c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f31491d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f31492e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f31493f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f31494g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements OnApplyWindowInsetsListener {
        public a() {
        }

        @Override // androidx.core.view.OnApplyWindowInsetsListener
        public WindowInsetsCompat onApplyWindowInsets(View view, @NonNull WindowInsetsCompat windowInsetsCompat) {
            ScrimInsetsFrameLayout scrimInsetsFrameLayout = ScrimInsetsFrameLayout.this;
            if (scrimInsetsFrameLayout.f31489b == null) {
                scrimInsetsFrameLayout.f31489b = new Rect();
            }
            ScrimInsetsFrameLayout.this.f31489b.set(windowInsetsCompat.getSystemWindowInsetLeft(), windowInsetsCompat.getSystemWindowInsetTop(), windowInsetsCompat.getSystemWindowInsetRight(), windowInsetsCompat.getSystemWindowInsetBottom());
            ScrimInsetsFrameLayout.this.h(windowInsetsCompat);
            ScrimInsetsFrameLayout.this.setWillNotDraw(!windowInsetsCompat.hasSystemWindowInsets() || ScrimInsetsFrameLayout.this.f31488a == null);
            ViewCompat.postInvalidateOnAnimation(ScrimInsetsFrameLayout.this);
            return windowInsetsCompat.consumeSystemWindowInsets();
        }
    }

    public ScrimInsetsFrameLayout(@NonNull Context context) {
        this(context, null);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        int width = getWidth();
        int height = getHeight();
        if (this.f31489b == null || this.f31488a == null) {
            return;
        }
        int save = canvas.save();
        canvas.translate(getScrollX(), getScrollY());
        if (this.f31491d) {
            this.f31490c.set(0, 0, width, this.f31489b.top);
            this.f31488a.setBounds(this.f31490c);
            this.f31488a.draw(canvas);
        }
        if (this.f31492e) {
            this.f31490c.set(0, height - this.f31489b.bottom, width, height);
            this.f31488a.setBounds(this.f31490c);
            this.f31488a.draw(canvas);
        }
        if (this.f31493f) {
            Rect rect = this.f31490c;
            Rect rect2 = this.f31489b;
            rect.set(0, rect2.top, rect2.left, height - rect2.bottom);
            this.f31488a.setBounds(this.f31490c);
            this.f31488a.draw(canvas);
        }
        if (this.f31494g) {
            Rect rect3 = this.f31490c;
            Rect rect4 = this.f31489b;
            rect3.set(width - rect4.right, rect4.top, width, height - rect4.bottom);
            this.f31488a.setBounds(this.f31490c);
            this.f31488a.draw(canvas);
        }
        canvas.restoreToCount(save);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Drawable drawable = this.f31488a;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Drawable drawable = this.f31488a;
        if (drawable != null) {
            drawable.setCallback(null);
        }
    }

    public void setDrawBottomInsetForeground(boolean z11) {
        this.f31492e = z11;
    }

    public void setDrawLeftInsetForeground(boolean z11) {
        this.f31493f = z11;
    }

    public void setDrawRightInsetForeground(boolean z11) {
        this.f31494g = z11;
    }

    public void setDrawTopInsetForeground(boolean z11) {
        this.f31491d = z11;
    }

    public void setScrimInsetForeground(@Nullable Drawable drawable) {
        this.f31488a = drawable;
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ScrimInsetsFrameLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f31490c = new Rect();
        this.f31491d = true;
        this.f31492e = true;
        this.f31493f = true;
        this.f31494g = true;
        TypedArray k11 = d0.k(context, attributeSet, R.styleable.ScrimInsetsFrameLayout, i11, R.style.Widget_Design_ScrimInsetsFrameLayout, new int[0]);
        this.f31488a = k11.getDrawable(R.styleable.ScrimInsetsFrameLayout_insetForeground);
        k11.recycle();
        setWillNotDraw(true);
        ViewCompat.setOnApplyWindowInsetsListener(this, new a());
    }

    public void h(WindowInsetsCompat windowInsetsCompat) {
    }
}
