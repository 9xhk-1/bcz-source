package com.google.android.material.appbar;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.widget.Toolbar;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.core.view.ViewCompat;
import com.google.android.material.R;
import com.google.android.material.internal.e0;
import kn.d;
import vn.k;
import vn.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class MaterialToolbar extends Toolbar {

    /* renamed from: f, reason: collision with root package name */
    public static final int f30507f = R.style.Widget_MaterialComponents_Toolbar;

    /* renamed from: g, reason: collision with root package name */
    public static final ImageView.ScaleType[] f30508g = {ImageView.ScaleType.MATRIX, ImageView.ScaleType.FIT_XY, ImageView.ScaleType.FIT_START, ImageView.ScaleType.FIT_CENTER, ImageView.ScaleType.FIT_END, ImageView.ScaleType.CENTER, ImageView.ScaleType.CENTER_CROP, ImageView.ScaleType.CENTER_INSIDE};

    /* renamed from: a, reason: collision with root package name */
    @Nullable
    public Integer f30509a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f30510b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f30511c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public ImageView.ScaleType f30512d;

    /* renamed from: e, reason: collision with root package name */
    @Nullable
    public Boolean f30513e;

    public MaterialToolbar(@NonNull Context context) {
        this(context, null);
    }

    public final Pair<Integer, Integer> a(@Nullable TextView textView, @Nullable TextView textView2) {
        int measuredWidth = getMeasuredWidth();
        int i11 = measuredWidth / 2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = measuredWidth - getPaddingRight();
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8 && childAt != textView && childAt != textView2) {
                if (childAt.getRight() < i11 && childAt.getRight() > paddingLeft) {
                    paddingLeft = childAt.getRight();
                }
                if (childAt.getLeft() > i11 && childAt.getLeft() < paddingRight) {
                    paddingRight = childAt.getLeft();
                }
            }
        }
        return new Pair<>(Integer.valueOf(paddingLeft), Integer.valueOf(paddingRight));
    }

    public void b() {
        this.f30509a = null;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            DrawableCompat.setTintList(DrawableCompat.wrap(navigationIcon.mutate()), null);
            setNavigationIcon(navigationIcon);
        }
    }

    public final void c(Context context) {
        Drawable background = getBackground();
        ColorStateList valueOf = background == null ? ColorStateList.valueOf(0) : d.g(background);
        if (valueOf != null) {
            k kVar = new k();
            kVar.p0(valueOf);
            kVar.a0(context);
            kVar.o0(ViewCompat.getElevation(this));
            ViewCompat.setBackground(this, kVar);
        }
    }

    public boolean d() {
        Boolean bool = this.f30513e;
        return bool != null && bool.booleanValue();
    }

    public boolean e() {
        return this.f30511c;
    }

    public boolean f() {
        return this.f30510b;
    }

    public final void g(View view, Pair<Integer, Integer> pair) {
        int measuredWidth = getMeasuredWidth();
        int measuredWidth2 = view.getMeasuredWidth();
        int i11 = (measuredWidth / 2) - (measuredWidth2 / 2);
        int i12 = measuredWidth2 + i11;
        int max = Math.max(Math.max(((Integer) pair.first).intValue() - i11, 0), Math.max(i12 - ((Integer) pair.second).intValue(), 0));
        if (max > 0) {
            i11 += max;
            i12 -= max;
            view.measure(View.MeasureSpec.makeMeasureSpec(i12 - i11, 1073741824), view.getMeasuredHeightAndState());
        }
        view.layout(i11, view.getTop(), i12, view.getBottom());
    }

    @Nullable
    public ImageView.ScaleType getLogoScaleType() {
        return this.f30512d;
    }

    @Nullable
    @ColorInt
    public Integer getNavigationIconTint() {
        return this.f30509a;
    }

    public final void h() {
        if (this.f30510b || this.f30511c) {
            TextView i11 = e0.i(this);
            TextView g11 = e0.g(this);
            if (i11 == null && g11 == null) {
                return;
            }
            Pair<Integer, Integer> a11 = a(i11, g11);
            if (this.f30510b && i11 != null) {
                g(i11, a11);
            }
            if (!this.f30511c || g11 == null) {
                return;
            }
            g(g11, a11);
        }
    }

    @Nullable
    public final Drawable i(@Nullable Drawable drawable) {
        if (drawable == null || this.f30509a == null) {
            return drawable;
        }
        Drawable wrap = DrawableCompat.wrap(drawable.mutate());
        DrawableCompat.setTint(wrap, this.f30509a.intValue());
        return wrap;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(int i11) {
        Menu menu = getMenu();
        boolean z11 = menu instanceof MenuBuilder;
        if (z11) {
            ((MenuBuilder) menu).stopDispatchingItemsChanged();
        }
        super.inflateMenu(i11);
        if (z11) {
            ((MenuBuilder) menu).startDispatchingItemsChanged();
        }
    }

    public final void j() {
        ImageView d11 = e0.d(this);
        if (d11 != null) {
            Boolean bool = this.f30513e;
            if (bool != null) {
                d11.setAdjustViewBounds(bool.booleanValue());
            }
            ImageView.ScaleType scaleType = this.f30512d;
            if (scaleType != null) {
                d11.setScaleType(scaleType);
            }
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z11, int i11, int i12, int i13, int i14) {
        super.onLayout(z11, i11, i12, i13, i14);
        h();
        j();
    }

    @Override // android.view.View
    @RequiresApi(21)
    public void setElevation(float f11) {
        super.setElevation(f11);
        l.d(this, f11);
    }

    public void setLogoAdjustViewBounds(boolean z11) {
        Boolean bool = this.f30513e;
        if (bool == null || bool.booleanValue() != z11) {
            this.f30513e = Boolean.valueOf(z11);
            requestLayout();
        }
    }

    public void setLogoScaleType(@NonNull ImageView.ScaleType scaleType) {
        if (this.f30512d != scaleType) {
            this.f30512d = scaleType;
            requestLayout();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@Nullable Drawable drawable) {
        super.setNavigationIcon(i(drawable));
    }

    public void setNavigationIconTint(@ColorInt int i11) {
        this.f30509a = Integer.valueOf(i11);
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            setNavigationIcon(navigationIcon);
        }
    }

    public void setSubtitleCentered(boolean z11) {
        if (this.f30511c != z11) {
            this.f30511c = z11;
            requestLayout();
        }
    }

    public void setTitleCentered(boolean z11) {
        if (this.f30510b != z11) {
            this.f30510b = z11;
            requestLayout();
        }
    }

    public MaterialToolbar(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.toolbarStyle);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public MaterialToolbar(@androidx.annotation.NonNull android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r4 = com.google.android.material.appbar.MaterialToolbar.f30507f
            android.content.Context r7 = zn.a.c(r7, r8, r9, r4)
            r6.<init>(r7, r8, r9)
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialToolbar
            r7 = 0
            int[] r5 = new int[r7]
            r1 = r8
            r3 = r9
            android.content.res.TypedArray r8 = com.google.android.material.internal.d0.k(r0, r1, r2, r3, r4, r5)
            int r9 = com.google.android.material.R.styleable.MaterialToolbar_navigationIconTint
            boolean r1 = r8.hasValue(r9)
            r2 = -1
            if (r1 == 0) goto L28
            int r9 = r8.getColor(r9, r2)
            r6.setNavigationIconTint(r9)
        L28:
            int r9 = com.google.android.material.R.styleable.MaterialToolbar_titleCentered
            boolean r9 = r8.getBoolean(r9, r7)
            r6.f30510b = r9
            int r9 = com.google.android.material.R.styleable.MaterialToolbar_subtitleCentered
            boolean r9 = r8.getBoolean(r9, r7)
            r6.f30511c = r9
            int r9 = com.google.android.material.R.styleable.MaterialToolbar_logoScaleType
            int r9 = r8.getInt(r9, r2)
            if (r9 < 0) goto L49
            android.widget.ImageView$ScaleType[] r1 = com.google.android.material.appbar.MaterialToolbar.f30508g
            int r2 = r1.length
            if (r9 >= r2) goto L49
            r9 = r1[r9]
            r6.f30512d = r9
        L49:
            int r9 = com.google.android.material.R.styleable.MaterialToolbar_logoAdjustViewBounds
            boolean r1 = r8.hasValue(r9)
            if (r1 == 0) goto L5b
            boolean r7 = r8.getBoolean(r9, r7)
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            r6.f30513e = r7
        L5b:
            r8.recycle()
            r6.c(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.appbar.MaterialToolbar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
