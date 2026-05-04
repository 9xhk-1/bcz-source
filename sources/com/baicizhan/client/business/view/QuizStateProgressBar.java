package com.baicizhan.client.business.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.baicizhan.client.business.view.a;
import com.jiongji.andriod.card.R;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class QuizStateProgressBar extends View {
    public static final int A = 1;

    /* renamed from: y, reason: collision with root package name */
    public static final int f16721y = -1;

    /* renamed from: z, reason: collision with root package name */
    public static final int f16722z = 0;

    /* renamed from: a, reason: collision with root package name */
    public Drawable f16723a;

    /* renamed from: b, reason: collision with root package name */
    public Drawable f16724b;

    /* renamed from: c, reason: collision with root package name */
    public Drawable f16725c;

    /* renamed from: d, reason: collision with root package name */
    public Drawable f16726d;

    /* renamed from: e, reason: collision with root package name */
    public Drawable f16727e;

    /* renamed from: f, reason: collision with root package name */
    public Drawable f16728f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable f16729g;

    /* renamed from: h, reason: collision with root package name */
    public Drawable f16730h;

    /* renamed from: i, reason: collision with root package name */
    public Drawable f16731i;

    /* renamed from: j, reason: collision with root package name */
    public Drawable f16732j;

    /* renamed from: k, reason: collision with root package name */
    public Drawable f16733k;

    /* renamed from: l, reason: collision with root package name */
    public Drawable f16734l;

    /* renamed from: m, reason: collision with root package name */
    public Drawable f16735m;

    /* renamed from: n, reason: collision with root package name */
    public int f16736n;

    /* renamed from: o, reason: collision with root package name */
    public int f16737o;

    /* renamed from: p, reason: collision with root package name */
    public int f16738p;

    /* renamed from: q, reason: collision with root package name */
    public int[] f16739q;

    /* renamed from: r, reason: collision with root package name */
    public int f16740r;

    /* renamed from: s, reason: collision with root package name */
    public Rect f16741s;

    /* renamed from: t, reason: collision with root package name */
    public Rect[] f16742t;

    /* renamed from: u, reason: collision with root package name */
    public Rect f16743u;

    /* renamed from: v, reason: collision with root package name */
    public com.baicizhan.client.business.view.a f16744v;

    /* renamed from: w, reason: collision with root package name */
    public b f16745w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f16746x;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public QuizStateProgressBar f16747a;

        /* renamed from: b, reason: collision with root package name */
        public int[] f16748b;

        /* renamed from: c, reason: collision with root package name */
        public int f16749c = 0;

        public QuizStateProgressBar a() {
            int[] iArr;
            if (this.f16747a == null || (iArr = this.f16748b) == null) {
                return null;
            }
            int i11 = this.f16749c;
            if (i11 < 0 || i11 >= iArr.length) {
                throw new IndexOutOfBoundsException("QuizStateProgressBar initialize failed. transferred cursor index is: " + this.f16749c + "; valid range is 0 to " + (this.f16748b.length - 1));
            }
            for (int i12 : iArr) {
                if (!QuizStateProgressBar.t(i12)) {
                    throw new IllegalArgumentException("QuizStateProgressBar initialize failed for illegal quiz state.");
                }
            }
            this.f16747a.f16739q = this.f16748b;
            this.f16747a.f16736n = this.f16748b.length;
            this.f16747a.f16740r = this.f16749c;
            this.f16747a.requestLayout();
            this.f16747a.l(true);
            return this.f16747a;
        }

        public a b(int index) {
            this.f16749c = index;
            return this;
        }

        public a c(int[] states) {
            this.f16748b = states;
            return this;
        }

        public a d(QuizStateProgressBar target) {
            this.f16747a = target;
            return this;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements a.b {
        public b() {
        }

        @Override // com.baicizhan.client.business.view.a.b
        public void a() {
            QuizStateProgressBar.this.f16746x = true;
        }

        @Override // com.baicizhan.client.business.view.a.b
        public void b(int frame) {
            QuizStateProgressBar.this.u(frame);
        }

        @Override // com.baicizhan.client.business.view.a.b
        public void c() {
            QuizStateProgressBar.this.f16746x = false;
            QuizStateProgressBar.this.l(true);
        }

        @Override // com.baicizhan.client.business.view.a.b
        public boolean d() {
            return QuizStateProgressBar.this.f16743u.left != QuizStateProgressBar.this.f16742t[Math.min(QuizStateProgressBar.this.f16740r, QuizStateProgressBar.this.f16736n - 1)].left;
        }
    }

    public QuizStateProgressBar(Context context) {
        super(context);
        this.f16740r = 0;
        this.f16745w = new b();
        this.f16746x = false;
        s(null, R.style.DefaultQuizStateProgressBar);
    }

    public static boolean t(int state) {
        return state >= -1 && state <= 1;
    }

    public int getCursor() {
        return this.f16740r;
    }

    public int getQuantity() {
        return this.f16736n;
    }

    public final void l(boolean invalidate) {
        int i11 = this.f16740r;
        if (i11 == 0) {
            this.f16735m = this.f16732j;
        } else if (this.f16736n - 1 == i11) {
            this.f16735m = this.f16734l;
        } else {
            this.f16735m = this.f16733k;
        }
        if (invalidate) {
            postInvalidate();
        }
    }

    public final void m(TypedArray a11) {
        this.f16723a = a11.getDrawable(9);
        this.f16724b = a11.getDrawable(4);
        this.f16725c = a11.getDrawable(0);
        this.f16726d = a11.getDrawable(11);
        this.f16727e = a11.getDrawable(6);
        this.f16728f = a11.getDrawable(2);
        this.f16729g = a11.getDrawable(12);
        this.f16730h = a11.getDrawable(7);
        this.f16731i = a11.getDrawable(3);
        this.f16732j = a11.getDrawable(10);
        this.f16733k = a11.getDrawable(5);
        this.f16734l = a11.getDrawable(1);
        this.f16735m = this.f16732j;
        this.f16736n = a11.getInt(8, 3);
        o();
    }

    public final void n(int measureWidth, int measureHeight) {
        Rect rect = new Rect();
        this.f16741s = rect;
        rect.left = getPaddingLeft();
        this.f16741s.top = getPaddingTop();
        this.f16741s.right = measureWidth - getPaddingRight();
        this.f16741s.bottom = measureHeight - getPaddingBottom();
        this.f16742t = new Rect[this.f16736n];
        for (int i11 = 0; i11 < this.f16736n; i11++) {
            Rect rect2 = new Rect();
            Rect rect3 = this.f16741s;
            int i12 = rect3.left;
            int i13 = this.f16737o;
            int i14 = i12 + (i11 * i13);
            rect2.left = i14;
            rect2.top = rect3.top;
            rect2.right = i14 + i13;
            rect2.bottom = rect3.bottom;
            this.f16742t[i11] = rect2;
        }
        this.f16743u = new Rect(this.f16742t[this.f16740r]);
    }

    public final void o() {
        int min = Math.min(Math.min(Math.min(this.f16726d.getIntrinsicWidth(), this.f16729g.getIntrinsicWidth()), this.f16723a.getIntrinsicWidth()), this.f16732j.getIntrinsicWidth());
        int min2 = Math.min(Math.min(Math.min(this.f16727e.getIntrinsicWidth(), this.f16730h.getIntrinsicWidth()), this.f16724b.getIntrinsicWidth()), this.f16733k.getIntrinsicWidth());
        this.f16737o = Math.min(Math.min(min, min2), Math.min(Math.min(Math.min(this.f16728f.getIntrinsicWidth(), this.f16731i.getIntrinsicWidth()), this.f16725c.getIntrinsicWidth()), this.f16734l.getIntrinsicWidth()));
        int min3 = Math.min(Math.min(Math.min(this.f16726d.getIntrinsicHeight(), this.f16729g.getIntrinsicHeight()), this.f16723a.getIntrinsicHeight()), this.f16732j.getIntrinsicHeight());
        int min4 = Math.min(Math.min(Math.min(this.f16727e.getIntrinsicHeight(), this.f16730h.getIntrinsicHeight()), this.f16724b.getIntrinsicHeight()), this.f16733k.getIntrinsicHeight());
        this.f16738p = Math.min(Math.min(min3, min4), Math.min(Math.min(Math.min(this.f16728f.getIntrinsicHeight(), this.f16731i.getIntrinsicHeight()), this.f16725c.getIntrinsicHeight()), this.f16734l.getIntrinsicHeight()));
        this.f16739q = new int[this.f16736n];
        for (int i11 = 0; i11 < this.f16736n; i11++) {
            this.f16739q[i11] = -1;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        p(canvas);
        q(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        if (Integer.MIN_VALUE == View.MeasureSpec.getMode(widthMeasureSpec)) {
            size = getPaddingRight() + (this.f16737o * this.f16736n) + getPaddingLeft();
        } else {
            this.f16737o = ((size - getPaddingLeft()) - getPaddingRight()) / this.f16736n;
        }
        if (Integer.MIN_VALUE == View.MeasureSpec.getMode(heightMeasureSpec)) {
            size2 = this.f16738p + getPaddingBottom() + getPaddingTop();
        } else {
            this.f16738p = (size2 - getPaddingBottom()) - getPaddingTop();
        }
        setMeasuredDimension(size, size2);
        if (this.f16746x) {
            return;
        }
        n(size, size2);
    }

    public final void p(Canvas canvas) {
        int i11 = 0;
        while (true) {
            int i12 = this.f16736n;
            if (i11 >= i12) {
                return;
            }
            Drawable drawable = this.f16724b;
            int i13 = this.f16739q[i11];
            if (i13 == 0) {
                drawable = i11 == 0 ? this.f16729g : i12 + (-1) == i11 ? this.f16731i : this.f16730h;
            } else if (i13 == 1) {
                drawable = i11 == 0 ? this.f16726d : i12 + (-1) == i11 ? this.f16728f : this.f16727e;
            } else if (i11 == 0) {
                drawable = this.f16723a;
                c.b("whiz", "draw cell, start rect: " + this.f16742t[i11], new Object[0]);
            } else if (i12 - 1 == i11) {
                drawable = this.f16725c;
                c.b("whiz", "draw cell, end rect: " + this.f16742t[i11], new Object[0]);
            } else {
                c.b("whiz", "draw cell, normal rect: " + this.f16742t[i11], new Object[0]);
            }
            drawable.setBounds(this.f16742t[i11]);
            drawable.draw(canvas);
            i11++;
        }
    }

    public final void q(Canvas canvas) {
        this.f16735m.setBounds(this.f16743u);
        this.f16735m.draw(canvas);
    }

    public int r(int index) {
        if (index >= 0 && index < this.f16736n) {
            return this.f16739q[index];
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Cursor index is: ");
        sb2.append(index);
        sb2.append("; valid range is 0 to ");
        sb2.append(this.f16736n - 1);
        throw new IndexOutOfBoundsException(sb2.toString());
    }

    public final void s(AttributeSet attrs, int defStyleRes) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attrs, R.styleable.QuizStateProgressBar, 0, defStyleRes);
        m(obtainStyledAttributes);
        obtainStyledAttributes.recycle();
        com.baicizhan.client.business.view.a h11 = com.baicizhan.client.business.view.a.g().h(this.f16745w);
        this.f16744v = h11;
        h11.j(1);
    }

    public void setCursor(int index) {
        if (index < 0 || index >= this.f16736n) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Cursor index is: ");
            sb2.append(index);
            sb2.append("; valid range is 0 to ");
            sb2.append(this.f16736n - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        int i11 = this.f16740r;
        if (index == i11) {
            return;
        }
        this.f16744v.j(Math.abs(i11 - index));
        this.f16740r = index;
        this.f16744v.l();
        this.f16744v.k(this.f16743u.left, this.f16742t[this.f16740r].left);
    }

    public final void u(int delta) {
        Rect rect = this.f16743u;
        rect.left += delta;
        rect.right += delta;
        postInvalidate();
    }

    public void v(int state) {
        w(state, true);
    }

    public void w(int state, boolean skipRight) {
        int i11;
        int i12;
        if (!t(state) || (i11 = this.f16740r) >= (i12 = this.f16736n)) {
            return;
        }
        int i13 = 1;
        if (i11 < i12 - 1 || this.f16739q[i11] == -1) {
            this.f16739q[i11] = state;
            if (skipRight) {
                int i14 = i11 + 1;
                int i15 = 1;
                while (true) {
                    if (i14 < this.f16736n) {
                        if (1 != this.f16739q[i14]) {
                            this.f16740r = i14;
                            break;
                        } else {
                            i14++;
                            this.f16740r = i14;
                            i15++;
                        }
                    } else {
                        break;
                    }
                }
                i13 = i15;
            } else {
                this.f16740r = i11 + 1;
            }
            if (this.f16740r >= this.f16736n) {
                postInvalidate();
                return;
            }
            this.f16744v.j(i13);
            this.f16744v.l();
            this.f16744v.k(this.f16743u.left, this.f16742t[this.f16740r].left);
        }
    }

    public void x(int index, int state) {
        if (index < 0 || index >= this.f16736n) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Index is: ");
            sb2.append(index);
            sb2.append("; valid range is 0 to ");
            sb2.append(this.f16736n - 1);
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (state == this.f16739q[index] || !t(state)) {
            return;
        }
        this.f16739q[index] = state;
        postInvalidate();
    }

    public QuizStateProgressBar(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f16740r = 0;
        this.f16745w = new b();
        this.f16746x = false;
        s(attrs, R.style.DefaultQuizStateProgressBar);
    }

    public QuizStateProgressBar(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        this.f16740r = 0;
        this.f16745w = new b();
        this.f16746x = false;
        s(attrs, R.style.DefaultQuizStateProgressBar);
    }
}
