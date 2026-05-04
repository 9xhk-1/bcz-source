package com.google.android.material.imageview;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.Dimension;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.material.R;
import vn.k;
import vn.p;
import vn.q;
import vn.t;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class ShapeableImageView extends AppCompatImageView implements t {

    /* renamed from: s, reason: collision with root package name */
    public static final int f31434s = R.style.Widget_MaterialComponents_ShapeableImageView;

    /* renamed from: t, reason: collision with root package name */
    public static final int f31435t = Integer.MIN_VALUE;

    /* renamed from: a, reason: collision with root package name */
    public final q f31436a;

    /* renamed from: b, reason: collision with root package name */
    public final RectF f31437b;

    /* renamed from: c, reason: collision with root package name */
    public final RectF f31438c;

    /* renamed from: d, reason: collision with root package name */
    public final Paint f31439d;

    /* renamed from: e, reason: collision with root package name */
    public final Paint f31440e;

    /* renamed from: f, reason: collision with root package name */
    public final Path f31441f;

    /* renamed from: g, reason: collision with root package name */
    @Nullable
    public ColorStateList f31442g;

    /* renamed from: h, reason: collision with root package name */
    @Nullable
    public k f31443h;

    /* renamed from: i, reason: collision with root package name */
    public p f31444i;

    /* renamed from: j, reason: collision with root package name */
    @Dimension
    public float f31445j;

    /* renamed from: k, reason: collision with root package name */
    public Path f31446k;

    /* renamed from: l, reason: collision with root package name */
    @Dimension
    public int f31447l;

    /* renamed from: m, reason: collision with root package name */
    @Dimension
    public int f31448m;

    /* renamed from: n, reason: collision with root package name */
    @Dimension
    public int f31449n;

    /* renamed from: o, reason: collision with root package name */
    @Dimension
    public int f31450o;

    /* renamed from: p, reason: collision with root package name */
    @Dimension
    public int f31451p;

    /* renamed from: q, reason: collision with root package name */
    @Dimension
    public int f31452q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f31453r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @TargetApi(21)
    public class a extends ViewOutlineProvider {

        /* renamed from: a, reason: collision with root package name */
        public final Rect f31454a = new Rect();

        public a() {
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            if (ShapeableImageView.this.f31444i == null) {
                return;
            }
            if (ShapeableImageView.this.f31443h == null) {
                ShapeableImageView.this.f31443h = new k(ShapeableImageView.this.f31444i);
            }
            ShapeableImageView.this.f31437b.round(this.f31454a);
            ShapeableImageView.this.f31443h.setBounds(this.f31454a);
            ShapeableImageView.this.f31443h.getOutline(outline);
        }
    }

    public ShapeableImageView(Context context) {
        this(context, null, 0);
    }

    private boolean g() {
        return getLayoutDirection() == 1;
    }

    public final void e(Canvas canvas) {
        if (this.f31442g == null) {
            return;
        }
        this.f31439d.setStrokeWidth(this.f31445j);
        int colorForState = this.f31442g.getColorForState(getDrawableState(), this.f31442g.getDefaultColor());
        if (this.f31445j <= 0.0f || colorForState == 0) {
            return;
        }
        this.f31439d.setColor(colorForState);
        canvas.drawPath(this.f31441f, this.f31439d);
    }

    public final boolean f() {
        return (this.f31451p == Integer.MIN_VALUE && this.f31452q == Integer.MIN_VALUE) ? false : true;
    }

    @Dimension
    public int getContentPaddingBottom() {
        return this.f31450o;
    }

    @Dimension
    public final int getContentPaddingEnd() {
        int i11 = this.f31452q;
        return i11 != Integer.MIN_VALUE ? i11 : g() ? this.f31447l : this.f31449n;
    }

    @Dimension
    public int getContentPaddingLeft() {
        int i11;
        int i12;
        if (f()) {
            if (g() && (i12 = this.f31452q) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!g() && (i11 = this.f31451p) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f31447l;
    }

    @Dimension
    public int getContentPaddingRight() {
        int i11;
        int i12;
        if (f()) {
            if (g() && (i12 = this.f31451p) != Integer.MIN_VALUE) {
                return i12;
            }
            if (!g() && (i11 = this.f31452q) != Integer.MIN_VALUE) {
                return i11;
            }
        }
        return this.f31449n;
    }

    @Dimension
    public final int getContentPaddingStart() {
        int i11 = this.f31451p;
        return i11 != Integer.MIN_VALUE ? i11 : g() ? this.f31449n : this.f31447l;
    }

    @Dimension
    public int getContentPaddingTop() {
        return this.f31448m;
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingBottom() {
        return super.getPaddingBottom() - getContentPaddingBottom();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingEnd() {
        return super.getPaddingEnd() - getContentPaddingEnd();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingLeft() {
        return super.getPaddingLeft() - getContentPaddingLeft();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingRight() {
        return super.getPaddingRight() - getContentPaddingRight();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingStart() {
        return super.getPaddingStart() - getContentPaddingStart();
    }

    @Override // android.view.View
    @Dimension
    public int getPaddingTop() {
        return super.getPaddingTop() - getContentPaddingTop();
    }

    @Override // vn.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f31444i;
    }

    @Nullable
    public ColorStateList getStrokeColor() {
        return this.f31442g;
    }

    @Dimension
    public float getStrokeWidth() {
        return this.f31445j;
    }

    public void h(@Dimension int i11, @Dimension int i12, @Dimension int i13, @Dimension int i14) {
        this.f31451p = Integer.MIN_VALUE;
        this.f31452q = Integer.MIN_VALUE;
        super.setPadding((super.getPaddingLeft() - this.f31447l) + i11, (super.getPaddingTop() - this.f31448m) + i12, (super.getPaddingRight() - this.f31449n) + i13, (super.getPaddingBottom() - this.f31450o) + i14);
        this.f31447l = i11;
        this.f31448m = i12;
        this.f31449n = i13;
        this.f31450o = i14;
    }

    @RequiresApi(17)
    public void i(@Dimension int i11, @Dimension int i12, @Dimension int i13, @Dimension int i14) {
        super.setPaddingRelative((super.getPaddingStart() - getContentPaddingStart()) + i11, (super.getPaddingTop() - this.f31448m) + i12, (super.getPaddingEnd() - getContentPaddingEnd()) + i13, (super.getPaddingBottom() - this.f31450o) + i14);
        this.f31447l = g() ? i13 : i11;
        this.f31448m = i12;
        if (!g()) {
            i11 = i13;
        }
        this.f31449n = i11;
        this.f31450o = i14;
    }

    public final void j(int i11, int i12) {
        this.f31437b.set(getPaddingLeft(), getPaddingTop(), i11 - getPaddingRight(), i12 - getPaddingBottom());
        this.f31436a.d(this.f31444i, 1.0f, this.f31437b, this.f31441f);
        this.f31446k.rewind();
        this.f31446k.addPath(this.f31441f);
        this.f31438c.set(0.0f, 0.0f, i11, i12);
        this.f31446k.addRect(this.f31438c, Path.Direction.CCW);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.f31446k, this.f31440e);
        e(canvas);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i11, int i12) {
        super.onMeasure(i11, i12);
        if (!this.f31453r && isLayoutDirectionResolved()) {
            this.f31453r = true;
            if (isPaddingRelative() || f()) {
                setPaddingRelative(super.getPaddingStart(), super.getPaddingTop(), super.getPaddingEnd(), super.getPaddingBottom());
            } else {
                setPadding(super.getPaddingLeft(), super.getPaddingTop(), super.getPaddingRight(), super.getPaddingBottom());
            }
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i11, int i12, int i13, int i14) {
        super.onSizeChanged(i11, i12, i13, i14);
        j(i11, i12);
    }

    @Override // android.view.View
    public void setPadding(@Dimension int i11, @Dimension int i12, @Dimension int i13, @Dimension int i14) {
        super.setPadding(i11 + getContentPaddingLeft(), i12 + getContentPaddingTop(), i13 + getContentPaddingRight(), i14 + getContentPaddingBottom());
    }

    @Override // android.view.View
    public void setPaddingRelative(@Dimension int i11, @Dimension int i12, @Dimension int i13, @Dimension int i14) {
        super.setPaddingRelative(i11 + getContentPaddingStart(), i12 + getContentPaddingTop(), i13 + getContentPaddingEnd(), i14 + getContentPaddingBottom());
    }

    @Override // vn.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        this.f31444i = pVar;
        k kVar = this.f31443h;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(pVar);
        }
        j(getWidth(), getHeight());
        invalidate();
        invalidateOutline();
    }

    public void setStrokeColor(@Nullable ColorStateList colorStateList) {
        this.f31442g = colorStateList;
        invalidate();
    }

    public void setStrokeColorResource(@ColorRes int i11) {
        setStrokeColor(AppCompatResources.getColorStateList(getContext(), i11));
    }

    public void setStrokeWidth(@Dimension float f11) {
        if (this.f31445j != f11) {
            this.f31445j = f11;
            invalidate();
        }
    }

    public void setStrokeWidthResource(@DimenRes int i11) {
        setStrokeWidth(getResources().getDimensionPixelSize(i11));
    }

    public ShapeableImageView(Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public ShapeableImageView(android.content.Context r7, @androidx.annotation.Nullable android.util.AttributeSet r8, int r9) {
        /*
            r6 = this;
            int r0 = com.google.android.material.imageview.ShapeableImageView.f31434s
            android.content.Context r7 = zn.a.c(r7, r8, r9, r0)
            r6.<init>(r7, r8, r9)
            vn.q r7 = vn.q.k()
            r6.f31436a = r7
            android.graphics.Path r7 = new android.graphics.Path
            r7.<init>()
            r6.f31441f = r7
            r7 = 0
            r6.f31453r = r7
            android.content.Context r1 = r6.getContext()
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            r6.f31440e = r2
            r3 = 1
            r2.setAntiAlias(r3)
            r4 = -1
            r2.setColor(r4)
            android.graphics.PorterDuffXfermode r4 = new android.graphics.PorterDuffXfermode
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.DST_OUT
            r4.<init>(r5)
            r2.setXfermode(r4)
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f31437b = r2
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            r6.f31438c = r2
            android.graphics.Path r2 = new android.graphics.Path
            r2.<init>()
            r6.f31446k = r2
            int[] r2 = com.google.android.material.R.styleable.ShapeableImageView
            android.content.res.TypedArray r2 = r1.obtainStyledAttributes(r8, r2, r9, r0)
            r4 = 2
            r5 = 0
            r6.setLayerType(r4, r5)
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_strokeColor
            android.content.res.ColorStateList r4 = sn.c.a(r1, r2, r4)
            r6.f31442g = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_strokeWidth
            int r4 = r2.getDimensionPixelSize(r4, r7)
            float r4 = (float) r4
            r6.f31445j = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPadding
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f31447l = r7
            r6.f31448m = r7
            r6.f31449n = r7
            r6.f31450o = r7
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingLeft
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f31447l = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingTop
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f31448m = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingRight
            int r4 = r2.getDimensionPixelSize(r4, r7)
            r6.f31449n = r4
            int r4 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingBottom
            int r7 = r2.getDimensionPixelSize(r4, r7)
            r6.f31450o = r7
            int r7 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingStart
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f31451p = r7
            int r7 = com.google.android.material.R.styleable.ShapeableImageView_contentPaddingEnd
            int r7 = r2.getDimensionPixelSize(r7, r4)
            r6.f31452q = r7
            r2.recycle()
            android.graphics.Paint r7 = new android.graphics.Paint
            r7.<init>()
            r6.f31439d = r7
            android.graphics.Paint$Style r2 = android.graphics.Paint.Style.STROKE
            r7.setStyle(r2)
            r7.setAntiAlias(r3)
            vn.p$b r7 = vn.p.e(r1, r8, r9, r0)
            vn.p r7 = r7.m()
            r6.f31444i = r7
            com.google.android.material.imageview.ShapeableImageView$a r7 = new com.google.android.material.imageview.ShapeableImageView$a
            r7.<init>()
            r6.setOutlineProvider(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.imageview.ShapeableImageView.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
