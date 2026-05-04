package com.kyleduo.switchbutton;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.CompoundButton;
import com.jiongji.andriod.card.R;
import com.kyleduo.switchbutton.a;
import com.kyleduo.switchbutton.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class SwitchButton extends CompoundButton {

    /* renamed from: s, reason: collision with root package name */
    public static boolean f39042s = false;

    /* renamed from: a, reason: collision with root package name */
    public boolean f39043a;

    /* renamed from: b, reason: collision with root package name */
    public b f39044b;

    /* renamed from: c, reason: collision with root package name */
    public Rect f39045c;

    /* renamed from: d, reason: collision with root package name */
    public Rect f39046d;

    /* renamed from: e, reason: collision with root package name */
    public Rect f39047e;

    /* renamed from: f, reason: collision with root package name */
    public RectF f39048f;

    /* renamed from: g, reason: collision with root package name */
    public com.kyleduo.switchbutton.a f39049g;

    /* renamed from: h, reason: collision with root package name */
    public a f39050h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f39051i;

    /* renamed from: j, reason: collision with root package name */
    public float f39052j;

    /* renamed from: k, reason: collision with root package name */
    public float f39053k;

    /* renamed from: l, reason: collision with root package name */
    public float f39054l;

    /* renamed from: m, reason: collision with root package name */
    public float f39055m;

    /* renamed from: n, reason: collision with root package name */
    public int f39056n;

    /* renamed from: o, reason: collision with root package name */
    public int f39057o;

    /* renamed from: p, reason: collision with root package name */
    public Paint f39058p;

    /* renamed from: q, reason: collision with root package name */
    public Rect f39059q;

    /* renamed from: r, reason: collision with root package name */
    public CompoundButton.OnCheckedChangeListener f39060r;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.b {
        public a() {
        }

        @Override // com.kyleduo.switchbutton.a.b
        public void a() {
            SwitchButton.this.f39051i = true;
        }

        @Override // com.kyleduo.switchbutton.a.b
        public void b(int frame) {
            SwitchButton.this.o(frame);
            SwitchButton.this.postInvalidate();
        }

        @Override // com.kyleduo.switchbutton.a.b
        public void c() {
            SwitchButton switchButton = SwitchButton.this;
            switchButton.setCheckedInClass(switchButton.getStatusBasedOnPos());
            SwitchButton.this.f39051i = false;
        }

        @Override // com.kyleduo.switchbutton.a.b
        public boolean d() {
            return SwitchButton.this.f39047e.right < SwitchButton.this.f39045c.right && SwitchButton.this.f39047e.left > SwitchButton.this.f39045c.left;
        }
    }

    @SuppressLint({"NewApi"})
    public SwitchButton(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f39043a = false;
        this.f39050h = new a();
        this.f39051i = false;
        this.f39059q = null;
        l();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.SwitchButton);
        b bVar = this.f39044b;
        bVar.f0(obtainStyledAttributes.getDimensionPixelSize(15, bVar.b()));
        b bVar2 = this.f39044b;
        bVar2.g0(obtainStyledAttributes.getDimensionPixelSize(19, bVar2.A()), obtainStyledAttributes.getDimensionPixelSize(16, this.f39044b.x()), obtainStyledAttributes.getDimensionPixelSize(17, this.f39044b.y()), obtainStyledAttributes.getDimensionPixelSize(18, this.f39044b.z()));
        this.f39044b.X(obtainStyledAttributes.getInt(10, b.a.f39096f));
        this.f39044b.j0(obtainStyledAttributes.getDimensionPixelSize(20, -1), obtainStyledAttributes.getDimensionPixelSize(14, -1));
        this.f39044b.P(obtainStyledAttributes.getFloat(5, -1.0f));
        this.f39044b.K(obtainStyledAttributes.getDimensionPixelSize(2, 0), obtainStyledAttributes.getDimensionPixelSize(4, 0), obtainStyledAttributes.getDimensionPixelSize(3, 0), obtainStyledAttributes.getDimensionPixelSize(1, 0));
        this.f39049g.i(obtainStyledAttributes.getInteger(0, -1));
        j(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        setLayerType(1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean getStatusBasedOnPos() {
        return ((float) this.f39047e.left) > this.f39055m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCheckedInClass(boolean checked) {
        s(checked, true);
    }

    private void setDrawableState(Drawable drawable) {
        if (drawable != null) {
            drawable.setState(getDrawableState());
            invalidate();
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        setDrawableState(this.f39044b.u());
        setDrawableState(this.f39044b.n());
        setDrawableState(this.f39044b.j());
    }

    public final int g() {
        int i11;
        Rect rect = this.f39045c;
        if (rect != null && (i11 = rect.right) != rect.left) {
            int B = i11 - this.f39044b.B();
            int i12 = this.f39045c.left;
            int i13 = B - i12;
            if (i13 > 0) {
                return ((this.f39047e.left - i12) * 255) / i13;
            }
        }
        return 255;
    }

    public b getConfiguration() {
        return this.f39044b;
    }

    public final void h() {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
    }

    public final Drawable i(TypedArray ta2, int attrId, int alterColorId, int defaultColor) {
        Drawable drawable = ta2.getDrawable(attrId);
        if (drawable != null) {
            return drawable;
        }
        int color = ta2.getColor(alterColorId, defaultColor);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f39044b.p());
        gradientDrawable.setColor(color);
        return gradientDrawable;
    }

    @Override // android.view.View
    public void invalidate() {
        if (this.f39059q == null || !this.f39044b.F()) {
            super.invalidate();
        } else {
            invalidate(this.f39059q);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public boolean isChecked() {
        return this.f39043a;
    }

    public final void j(TypedArray ta2) {
        b bVar = this.f39044b;
        if (bVar == null) {
            return;
        }
        bVar.R(i(ta2, 7, 6, b.a.f39091a));
        this.f39044b.W(i(ta2, 9, 8, b.a.f39092b));
        this.f39044b.Z(k(ta2));
    }

    public final Drawable k(TypedArray ta2) {
        Drawable drawable = ta2.getDrawable(12);
        if (drawable != null) {
            return drawable;
        }
        int color = ta2.getColor(11, b.a.f39093c);
        int color2 = ta2.getColor(13, b.a.f39094d);
        StateListDrawable stateListDrawable = new StateListDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(this.f39044b.p());
        gradientDrawable.setColor(color);
        GradientDrawable gradientDrawable2 = new GradientDrawable();
        gradientDrawable2.setCornerRadius(this.f39044b.p());
        gradientDrawable2.setColor(color2);
        stateListDrawable.addState(View.PRESSED_ENABLED_STATE_SET, gradientDrawable2);
        stateListDrawable.addState(new int[0], gradientDrawable);
        return stateListDrawable;
    }

    public final void l() {
        this.f39044b = b.a(getContext().getResources().getDisplayMetrics().density);
        this.f39056n = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        this.f39057o = ViewConfiguration.getPressedStateDuration() + ViewConfiguration.getTapTimeout();
        this.f39049g = com.kyleduo.switchbutton.a.g().h(this.f39050h);
        this.f39059q = new Rect();
        if (f39042s) {
            Paint paint = new Paint();
            this.f39058p = paint;
            paint.setStyle(Paint.Style.STROKE);
        }
    }

    public final int m(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        int w11 = this.f39044b.w() + getPaddingTop() + getPaddingBottom();
        int A = this.f39044b.A() + this.f39044b.x();
        if (A > 0) {
            w11 += A;
        }
        if (mode == 1073741824) {
            w11 = Math.max(size, w11);
        } else if (mode == Integer.MIN_VALUE) {
            w11 = Math.min(size, w11);
        }
        return w11 + this.f39044b.e().top + this.f39044b.e().bottom;
    }

    public final int n(int measureSpec) {
        int mode = View.MeasureSpec.getMode(measureSpec);
        int size = View.MeasureSpec.getSize(measureSpec);
        int B = (int) ((this.f39044b.B() * this.f39044b.h()) + getPaddingLeft() + getPaddingRight());
        int y11 = this.f39044b.y() + this.f39044b.z();
        if (y11 > 0) {
            B += y11;
        }
        if (mode == 1073741824) {
            B = Math.max(size, B);
        } else if (mode == Integer.MIN_VALUE) {
            B = Math.min(size, B);
        }
        return B + this.f39044b.e().left + this.f39044b.e().right;
    }

    public final void o(int delta) {
        Rect rect = this.f39047e;
        int i11 = rect.left + delta;
        int i12 = rect.right + delta;
        int i13 = this.f39045c.left;
        if (i11 < i13) {
            i12 = this.f39044b.B() + i13;
            i11 = i13;
        }
        int i14 = this.f39045c.right;
        if (i12 > i14) {
            i11 = i14 - this.f39044b.B();
            i12 = i14;
        }
        p(i11, i12);
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.getClipBounds(this.f39059q);
        if (this.f39059q != null && this.f39044b.F()) {
            this.f39059q.inset(this.f39044b.f(), this.f39044b.g());
            canvas.clipRect(this.f39059q, Region.Op.REPLACE);
            canvas.translate(this.f39044b.e().left, this.f39044b.e().top);
        }
        boolean z11 = !isEnabled() && q();
        if (z11) {
            canvas.saveLayerAlpha(this.f39048f, 127);
        }
        this.f39044b.j().draw(canvas);
        this.f39044b.n().setAlpha(g());
        this.f39044b.n().draw(canvas);
        this.f39044b.u().draw(canvas);
        if (z11) {
            canvas.restore();
        }
        if (f39042s) {
            this.f39058p.setColor(Color.parseColor("#AA0000"));
            canvas.drawRect(this.f39046d, this.f39058p);
            this.f39058p.setColor(Color.parseColor("#00FF00"));
            canvas.drawRect(this.f39045c, this.f39058p);
            this.f39058p.setColor(Color.parseColor("#0000FF"));
            canvas.drawRect(this.f39047e, this.f39058p);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(n(widthMeasureSpec), m(heightMeasureSpec));
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldw, int oldh) {
        super.onSizeChanged(w11, h11, oldw, oldh);
        t();
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        if (r0 != 3) goto L25;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean onTouchEvent(android.view.MotionEvent r10) {
        /*
            r9 = this;
            boolean r0 = r9.f39051i
            r1 = 0
            if (r0 != 0) goto L80
            boolean r0 = r9.isEnabled()
            if (r0 != 0) goto Ld
            goto L80
        Ld:
            int r0 = r10.getAction()
            float r2 = r10.getX()
            float r3 = r9.f39052j
            float r2 = r2 - r3
            float r3 = r10.getY()
            float r4 = r9.f39053k
            float r3 = r3 - r4
            r4 = 1
            if (r0 == 0) goto L66
            if (r0 == r4) goto L3a
            r5 = 2
            if (r0 == r5) goto L2b
            r5 = 3
            if (r0 == r5) goto L3a
            goto L7c
        L2b:
            float r10 = r10.getX()
            float r0 = r9.f39054l
            float r0 = r10 - r0
            int r0 = (int) r0
            r9.o(r0)
            r9.f39054l = r10
            goto L7c
        L3a:
            r9.setPressed(r1)
            boolean r0 = r9.getStatusBasedOnPos()
            long r5 = r10.getEventTime()
            long r7 = r10.getDownTime()
            long r5 = r5 - r7
            float r10 = (float) r5
            int r1 = r9.f39056n
            float r5 = (float) r1
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 >= 0) goto L62
            float r1 = (float) r1
            int r1 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r1 >= 0) goto L62
            int r1 = r9.f39057o
            float r1 = (float) r1
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 >= 0) goto L62
            r9.performClick()
            goto L7c
        L62:
            r9.y(r0)
            goto L7c
        L66:
            r9.h()
            float r0 = r10.getX()
            r9.f39052j = r0
            float r10 = r10.getY()
            r9.f39053k = r10
            float r10 = r9.f39052j
            r9.f39054l = r10
            r9.setPressed(r4)
        L7c:
            r9.invalidate()
            return r4
        L80:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kyleduo.switchbutton.SwitchButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public final void p(int newLeft, int newRight) {
        Rect rect = this.f39047e;
        rect.set(newLeft, rect.top, newRight, rect.bottom);
        this.f39044b.u().setBounds(this.f39047e);
    }

    @Override // android.widget.CompoundButton, android.view.View
    public boolean performClick() {
        return super.performClick();
    }

    public final boolean q() {
        return ((this.f39044b.u() instanceof StateListDrawable) && (this.f39044b.n() instanceof StateListDrawable) && (this.f39044b.j() instanceof StateListDrawable)) ? false : true;
    }

    public void r(final boolean checked, boolean trigger) {
        if (this.f39047e != null) {
            int measuredWidth = getMeasuredWidth();
            if (!checked) {
                measuredWidth = -measuredWidth;
            }
            o(measuredWidth);
        }
        s(checked, trigger);
    }

    public final void s(boolean checked, boolean trigger) {
        if (this.f39043a == checked) {
            return;
        }
        this.f39043a = checked;
        refreshDrawableState();
        CompoundButton.OnCheckedChangeListener onCheckedChangeListener = this.f39060r;
        if (onCheckedChangeListener == null || !trigger) {
            return;
        }
        onCheckedChangeListener.onCheckedChanged(this, this.f39043a);
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void setChecked(final boolean checked) {
        r(checked, true);
    }

    public void setConfiguration(b conf) {
        if (this.f39044b == null) {
            this.f39044b = b.a(conf.c());
        }
        this.f39044b.R(conf.l());
        this.f39044b.W(conf.o());
        this.f39044b.Z(conf.v());
        this.f39044b.g0(conf.A(), conf.x(), conf.y(), conf.z());
        this.f39044b.j0(conf.B(), conf.w());
        this.f39044b.l0(conf.E());
        this.f39044b.P(conf.h());
        this.f39049g.i(this.f39044b.E());
        requestLayout();
        t();
        setChecked(this.f39043a);
    }

    @Override // android.widget.CompoundButton
    public void setOnCheckedChangeListener(CompoundButton.OnCheckedChangeListener onCheckedChangeListener) {
        if (onCheckedChangeListener == null) {
            throw new IllegalArgumentException("onCheckedChangeListener can not be null");
        }
        this.f39060r = onCheckedChangeListener;
    }

    public final void t() {
        u();
        w();
        x();
        v();
        if (getMeasuredWidth() > 0 && getMeasuredHeight() > 0) {
            this.f39048f = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.setClipChildren(false);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.Checkable
    public void toggle() {
        z(true);
    }

    public final void u() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f39046d = null;
            return;
        }
        if (this.f39046d == null) {
            this.f39046d = new Rect();
        }
        int paddingLeft = getPaddingLeft() + (this.f39044b.y() > 0 ? 0 : -this.f39044b.y());
        int paddingRight = ((measuredWidth - getPaddingRight()) - (this.f39044b.z() > 0 ? 0 : -this.f39044b.z())) + (-this.f39044b.q());
        this.f39046d.set(paddingLeft, getPaddingTop() + (this.f39044b.A() > 0 ? 0 : -this.f39044b.A()), paddingRight, ((measuredHeight - getPaddingBottom()) - (this.f39044b.x() <= 0 ? -this.f39044b.x() : 0)) + (-this.f39044b.s()));
    }

    public final void v() {
        if (this.f39046d != null) {
            this.f39044b.n().setBounds(this.f39046d);
            this.f39044b.j().setBounds(this.f39046d);
        }
        if (this.f39047e != null) {
            this.f39044b.u().setBounds(this.f39047e);
        }
    }

    public final void w() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f39045c = null;
            return;
        }
        if (this.f39045c == null) {
            this.f39045c = new Rect();
        }
        this.f39045c.set(getPaddingLeft() + (this.f39044b.y() > 0 ? this.f39044b.y() : 0), getPaddingTop() + (this.f39044b.A() > 0 ? this.f39044b.A() : 0), ((measuredWidth - getPaddingRight()) - (this.f39044b.z() > 0 ? this.f39044b.z() : 0)) + (-this.f39044b.q()), ((measuredHeight - getPaddingBottom()) - (this.f39044b.x() > 0 ? this.f39044b.x() : 0)) + (-this.f39044b.s()));
        int i11 = this.f39045c.left;
        this.f39055m = i11 + (((r0.right - i11) - this.f39044b.B()) / 2);
    }

    public final void x() {
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        if (measuredWidth <= 0 || measuredHeight <= 0) {
            this.f39047e = null;
            return;
        }
        if (this.f39047e == null) {
            this.f39047e = new Rect();
        }
        int B = this.f39043a ? this.f39045c.right - this.f39044b.B() : this.f39045c.left;
        int B2 = this.f39044b.B() + B;
        int i11 = this.f39045c.top;
        this.f39047e.set(B, i11, B2, this.f39044b.w() + i11);
    }

    public void y(boolean checked) {
        if (this.f39051i) {
            return;
        }
        this.f39049g.j(this.f39047e.left, checked ? this.f39045c.right - this.f39044b.B() : this.f39045c.left);
    }

    public void z(boolean animated) {
        if (animated) {
            y(!this.f39043a);
        } else {
            setChecked(!this.f39043a);
        }
    }

    public SwitchButton(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public SwitchButton(Context context) {
        this(context, null);
    }
}
