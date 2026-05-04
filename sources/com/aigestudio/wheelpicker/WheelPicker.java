package com.aigestudio.wheelpicker;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Camera;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class WheelPicker extends View implements v0.b, com.aigestudio.wheelpicker.a, Runnable {

    /* renamed from: s1, reason: collision with root package name */
    public static final int f9806s1 = 0;

    /* renamed from: t1, reason: collision with root package name */
    public static final int f9807t1 = 1;

    /* renamed from: u1, reason: collision with root package name */
    public static final int f9808u1 = 2;

    /* renamed from: v1, reason: collision with root package name */
    public static final int f9809v1 = 0;

    /* renamed from: w1, reason: collision with root package name */
    public static final int f9810w1 = 1;

    /* renamed from: x1, reason: collision with root package name */
    public static final int f9811x1 = 2;

    /* renamed from: y1, reason: collision with root package name */
    public static final String f9812y1 = "WheelPicker";

    /* renamed from: z1, reason: collision with root package name */
    public static final int f9813z1 = 16;
    public int A;
    public Drawable B;
    public int C;
    public Drawable D;
    public int E;
    public int F;
    public int G;
    public int H;
    public int I;
    public int J;
    public int K;
    public int L;
    public int M;
    public int N;
    public int O;
    public int P;
    public int Q;
    public int R;
    public int S;
    public int T;
    public int U;
    public int V;
    public int W;

    /* renamed from: a, reason: collision with root package name */
    public final Handler f9814a;

    /* renamed from: b, reason: collision with root package name */
    public Paint f9815b;

    /* renamed from: c, reason: collision with root package name */
    public Scroller f9816c;

    /* renamed from: d, reason: collision with root package name */
    public VelocityTracker f9817d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9818e;

    /* renamed from: f, reason: collision with root package name */
    public a f9819f;

    /* renamed from: f0, reason: collision with root package name */
    public int f9820f0;

    /* renamed from: f1, reason: collision with root package name */
    public int f9821f1;

    /* renamed from: g, reason: collision with root package name */
    public b f9822g;

    /* renamed from: h, reason: collision with root package name */
    public Rect f9823h;

    /* renamed from: h1, reason: collision with root package name */
    public int f9824h1;

    /* renamed from: i, reason: collision with root package name */
    public Rect f9825i;

    /* renamed from: i1, reason: collision with root package name */
    public boolean f9826i1;

    /* renamed from: j, reason: collision with root package name */
    public Rect f9827j;

    /* renamed from: j1, reason: collision with root package name */
    public boolean f9828j1;

    /* renamed from: k, reason: collision with root package name */
    public Rect f9829k;

    /* renamed from: k1, reason: collision with root package name */
    public boolean f9830k1;

    /* renamed from: l, reason: collision with root package name */
    public Rect f9831l;

    /* renamed from: l1, reason: collision with root package name */
    public boolean f9832l1;

    /* renamed from: m, reason: collision with root package name */
    public Camera f9833m;

    /* renamed from: m1, reason: collision with root package name */
    public boolean f9834m1;

    /* renamed from: n, reason: collision with root package name */
    public Matrix f9835n;

    /* renamed from: n1, reason: collision with root package name */
    public boolean f9836n1;

    /* renamed from: o, reason: collision with root package name */
    public Matrix f9837o;

    /* renamed from: o1, reason: collision with root package name */
    public boolean f9838o1;

    /* renamed from: p, reason: collision with root package name */
    public List f9839p;

    /* renamed from: p1, reason: collision with root package name */
    public boolean f9840p1;

    /* renamed from: q, reason: collision with root package name */
    public String f9841q;

    /* renamed from: q1, reason: collision with root package name */
    public String f9842q1;

    /* renamed from: r, reason: collision with root package name */
    public int f9843r;

    /* renamed from: r1, reason: collision with root package name */
    public boolean f9844r1;

    /* renamed from: s, reason: collision with root package name */
    public int f9845s;

    /* renamed from: t, reason: collision with root package name */
    public int f9846t;

    /* renamed from: u, reason: collision with root package name */
    public int f9847u;

    /* renamed from: v, reason: collision with root package name */
    public int f9848v;

    /* renamed from: w, reason: collision with root package name */
    public int f9849w;

    /* renamed from: x, reason: collision with root package name */
    public int f9850x;

    /* renamed from: y, reason: collision with root package name */
    public int f9851y;

    /* renamed from: z, reason: collision with root package name */
    public int f9852z;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void W(WheelPicker picker, Object data, int position);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface b {
        void a(int position);

        void b(int offset);

        void c(int state);
    }

    public WheelPicker(Context context) {
        this(context, null);
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean b() {
        return this.f9828j1;
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean c() {
        return this.f9826i1;
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean d() {
        return this.f9834m1;
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean e() {
        return this.f9832l1;
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean g() {
        return this.f9836n1;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getCurrentItemPosition() {
        return this.M;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getCurtainColor() {
        return this.F;
    }

    @Override // com.aigestudio.wheelpicker.a
    public List getData() {
        return this.f9839p;
    }

    public Drawable getIndicatorBackground() {
        return this.B;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getIndicatorColor() {
        return this.A;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getIndicatorSize() {
        return this.f9852z;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getItemAlign() {
        return this.H;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getItemSpace() {
        return this.G;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getItemTextColor() {
        return this.f9849w;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getItemTextSize() {
        return this.f9851y;
    }

    @Override // com.aigestudio.wheelpicker.a
    public String getMaximumWidthText() {
        return this.f9841q;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getMaximumWidthTextPosition() {
        return this.W;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getSelectedItemPosition() {
        return this.L;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getSelectedItemTextColor() {
        return this.f9850x;
    }

    @Override // com.aigestudio.wheelpicker.a
    public Typeface getTypeface() {
        Paint paint = this.f9815b;
        if (paint != null) {
            return paint.getTypeface();
        }
        return null;
    }

    @Override // com.aigestudio.wheelpicker.a
    public int getVisibleItemCount() {
        return this.f9843r;
    }

    @Override // com.aigestudio.wheelpicker.a
    public boolean h() {
        return this.f9830k1;
    }

    public final void i() {
        if (this.f9830k1 || this.f9850x != -1) {
            Rect rect = this.f9831l;
            Rect rect2 = this.f9823h;
            int i11 = rect2.left;
            int i12 = this.S;
            int i13 = this.J;
            rect.set(i11, i12 - i13, rect2.right, i12 + i13);
        }
    }

    public final int j(int degree) {
        return (int) (this.K - (Math.cos(Math.toRadians(degree)) * this.K));
    }

    public final int k(int remainder) {
        if (Math.abs(remainder) > this.J) {
            return (this.V < 0 ? -this.I : this.I) - remainder;
        }
        return -remainder;
    }

    public final void l() {
        int i11 = this.H;
        if (i11 == 1) {
            this.T = this.f9823h.left;
        } else if (i11 != 2) {
            this.T = this.R;
        } else {
            this.T = this.f9823h.right;
        }
        this.U = (int) (this.S - ((this.f9815b.ascent() + this.f9815b.descent()) / 2.0f));
    }

    public final void m() {
        int i11 = this.L;
        int i12 = this.I;
        int i13 = i11 * i12;
        this.N = this.f9834m1 ? Integer.MIN_VALUE : ((-i12) * (this.f9839p.size() - 1)) + i13;
        if (this.f9834m1) {
            i13 = Integer.MAX_VALUE;
        }
        this.O = i13;
    }

    public final void n() {
        if (this.f9828j1) {
            int i11 = this.f9852z / 2;
            int i12 = this.S;
            int i13 = this.J;
            int i14 = i12 + i13;
            int i15 = i12 - i13;
            Rect rect = this.f9825i;
            Rect rect2 = this.f9823h;
            rect.set(rect2.left, i14 - i11, rect2.right, i14 + i11);
            Rect rect3 = this.f9827j;
            Rect rect4 = this.f9823h;
            rect3.set(rect4.left, i15 - i11, rect4.right, i15 + i11);
            int min = Math.min(this.C, this.I);
            int i16 = min > 0 ? min / 2 : this.J;
            Rect rect5 = this.f9829k;
            Rect rect6 = this.f9823h;
            int i17 = rect6.left;
            int i18 = this.S;
            rect5.set(i17, i18 - i16, rect6.right, i18 + i16);
        }
    }

    public final int o(int degree) {
        return (int) (Math.sin(Math.toRadians(degree)) * this.K);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        String valueOf;
        float f11;
        int i11;
        Drawable drawable;
        Canvas canvas2 = canvas;
        b bVar = this.f9822g;
        if (bVar != null) {
            bVar.b(this.V);
        }
        if (this.f9839p.size() == 0) {
            return;
        }
        if (this.f9828j1 && (drawable = this.B) != null) {
            drawable.setBounds(this.f9829k);
            this.B.draw(canvas2);
        }
        int i12 = this.I;
        if (i12 == 0) {
            return;
        }
        int i13 = (-this.V) / i12;
        int i14 = this.f9846t;
        int i15 = i13 - i14;
        int i16 = -i14;
        int i17 = this.L + i15;
        while (i17 < this.L + i15 + this.f9845s) {
            if (this.f9834m1) {
                int size = i17 % this.f9839p.size();
                if (size < 0) {
                    size += this.f9839p.size();
                }
                valueOf = String.valueOf(this.f9839p.get(size));
            } else {
                valueOf = q(i17) ? String.valueOf(this.f9839p.get(i17)) : "";
            }
            this.f9815b.setColor(this.f9849w);
            this.f9815b.setStyle(Paint.Style.FILL);
            int i18 = this.U;
            int i19 = this.I;
            int i21 = (i16 * i19) + i18 + (this.V % i19);
            if (this.f9836n1) {
                int abs = i18 - Math.abs(i18 - i21);
                int i22 = this.f9823h.top;
                int i23 = this.U;
                float f12 = (-(1.0f - (((abs - i22) * 1.0f) / (i23 - i22)))) * 90.0f * (i21 > i23 ? 1 : i21 < i23 ? -1 : 0);
                if (f12 < -90.0f) {
                    f12 = -90.0f;
                }
                float f13 = f12 <= 90.0f ? f12 : 90.0f;
                i11 = o((int) f13);
                int i24 = this.R;
                f11 = 1.0f;
                int i25 = this.H;
                if (i25 == 1) {
                    i24 = this.f9823h.left;
                } else if (i25 == 2) {
                    i24 = this.f9823h.right;
                }
                int i26 = this.S - i11;
                this.f9833m.save();
                this.f9833m.rotateX(f13);
                this.f9833m.getMatrix(this.f9835n);
                this.f9833m.restore();
                float f14 = -i24;
                float f15 = -i26;
                this.f9835n.preTranslate(f14, f15);
                float f16 = i24;
                float f17 = i26;
                this.f9835n.postTranslate(f16, f17);
                this.f9833m.save();
                this.f9833m.translate(0.0f, 0.0f, j(r4));
                this.f9833m.getMatrix(this.f9837o);
                this.f9833m.restore();
                this.f9837o.preTranslate(f14, f15);
                this.f9837o.postTranslate(f16, f17);
                this.f9835n.postConcat(this.f9837o);
            } else {
                f11 = 1.0f;
                i11 = 0;
            }
            if (this.f9832l1) {
                int i27 = this.U;
                int abs2 = (int) ((((i27 - Math.abs(i27 - i21)) * f11) / this.U) * 255.0f);
                this.f9815b.setAlpha(abs2 < 0 ? 0 : abs2);
            }
            if (this.f9836n1) {
                i21 = this.U - i11;
            }
            if (this.f9850x != -1) {
                canvas2.save();
                if (this.f9836n1) {
                    canvas2.concat(this.f9835n);
                }
                canvas2.clipRect(this.f9831l, Region.Op.DIFFERENCE);
                float f18 = i21;
                canvas2.drawText(valueOf, this.T, f18, this.f9815b);
                canvas2.restore();
                this.f9815b.setColor(this.f9850x);
                canvas2.save();
                if (this.f9836n1) {
                    canvas2.concat(this.f9835n);
                }
                canvas2.clipRect(this.f9831l);
                canvas2.drawText(valueOf, this.T, f18, this.f9815b);
                canvas2.restore();
            } else {
                canvas2.save();
                canvas2.clipRect(this.f9823h);
                if (this.f9836n1) {
                    canvas2.concat(this.f9835n);
                }
                canvas2.drawText(valueOf, this.T, i21, this.f9815b);
                canvas2.restore();
            }
            if (this.f9844r1) {
                canvas2.save();
                canvas2.clipRect(this.f9823h);
                this.f9815b.setColor(-1166541);
                int i28 = this.S + (this.I * i16);
                Rect rect = this.f9823h;
                float f19 = i28;
                canvas2.drawLine(rect.left, f19, rect.right, f19, this.f9815b);
                this.f9815b.setColor(-13421586);
                this.f9815b.setStyle(Paint.Style.STROKE);
                int i29 = i28 - this.J;
                Rect rect2 = this.f9823h;
                canvas2 = canvas;
                canvas2.drawRect(rect2.left, i29, rect2.right, i29 + this.I, this.f9815b);
                canvas2.restore();
            }
            i17++;
            i16++;
        }
        if (this.f9830k1) {
            this.f9815b.setColor(this.F);
            this.f9815b.setStyle(Paint.Style.FILL);
            canvas2.drawRect(this.f9831l, this.f9815b);
        }
        if (this.f9828j1) {
            if (this.B == null) {
                this.f9815b.setColor(this.A);
                this.f9815b.setStyle(Paint.Style.FILL);
                canvas2.drawRect(this.f9825i, this.f9815b);
                canvas2.drawRect(this.f9827j, this.f9815b);
            }
            if (this.D != null) {
                canvas2.save();
                canvas2.translate((this.f9829k.width() - this.E) - this.D.getIntrinsicWidth(), this.S - (this.D.getIntrinsicHeight() / 2));
                this.D.draw(canvas2);
                canvas2.restore();
            }
        }
        if (this.f9844r1) {
            this.f9815b.setColor(1144254003);
            this.f9815b.setStyle(Paint.Style.FILL);
            canvas2.drawRect(0.0f, 0.0f, getPaddingLeft(), getHeight(), this.f9815b);
            canvas.drawRect(0.0f, 0.0f, getWidth(), getPaddingTop(), this.f9815b);
            canvas.drawRect(getWidth() - getPaddingRight(), 0.0f, getWidth(), getHeight(), this.f9815b);
            canvas.drawRect(0.0f, getHeight() - getPaddingBottom(), getWidth(), getHeight(), this.f9815b);
        }
    }

    @Override // android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int mode = View.MeasureSpec.getMode(widthMeasureSpec);
        int mode2 = View.MeasureSpec.getMode(heightMeasureSpec);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        int size2 = View.MeasureSpec.getSize(heightMeasureSpec);
        int i11 = this.f9847u;
        int i12 = this.f9848v;
        int i13 = this.f9843r;
        int i14 = (i12 * i13) + (this.G * (i13 - 1));
        if (this.f9836n1) {
            i14 = (int) ((i14 * 2) / 3.141592653589793d);
        }
        if (this.f9844r1) {
            Log.i(f9812y1, "Wheel's content size is (" + i11 + ":" + i14 + j.f81007d);
        }
        int paddingLeft = i11 + getPaddingLeft() + getPaddingRight();
        int paddingTop = i14 + getPaddingTop() + getPaddingBottom();
        if (this.f9844r1) {
            Log.i(f9812y1, "Wheel's size is (" + paddingLeft + ":" + paddingTop + j.f81007d);
        }
        setMeasuredDimension(r(mode, size, paddingLeft), r(mode2, size2, paddingTop));
    }

    @Override // android.view.View
    public void onSizeChanged(int w11, int h11, int oldW, int oldH) {
        this.f9823h.set(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
        if (this.f9844r1) {
            Log.i(f9812y1, "Wheel's drawn rect size is (" + this.f9823h.width() + ":" + this.f9823h.height() + ") and location is (" + this.f9823h.left + ":" + this.f9823h.top + j.f81007d);
        }
        this.R = this.f9823h.centerX();
        this.S = this.f9823h.centerY();
        l();
        this.K = this.f9823h.height() / 2;
        int height = this.f9823h.height() / this.f9843r;
        this.I = height;
        this.J = height / 2;
        m();
        n();
        i();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        int action = event.getAction();
        if (action == 0) {
            this.f9818e = true;
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(true);
            }
            VelocityTracker velocityTracker = this.f9817d;
            if (velocityTracker == null) {
                this.f9817d = VelocityTracker.obtain();
            } else {
                velocityTracker.clear();
            }
            this.f9817d.addMovement(event);
            if (!this.f9816c.isFinished()) {
                this.f9816c.abortAnimation();
                this.f9840p1 = true;
            }
            int y11 = (int) event.getY();
            this.f9820f0 = y11;
            this.f9821f1 = y11;
        } else if (action == 1) {
            if (getParent() != null) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
            if (!this.f9838o1 || this.f9840p1) {
                this.f9817d.addMovement(event);
                this.f9817d.computeCurrentVelocity(1000, this.Q);
                this.f9840p1 = false;
                int yVelocity = (int) this.f9817d.getYVelocity();
                if (Math.abs(yVelocity) > this.P) {
                    this.f9816c.fling(0, this.V, 0, yVelocity, 0, 0, this.N, this.O);
                    Scroller scroller = this.f9816c;
                    scroller.setFinalY(scroller.getFinalY() + k(this.f9816c.getFinalY() % this.I));
                } else {
                    Scroller scroller2 = this.f9816c;
                    int i11 = this.V;
                    scroller2.startScroll(0, i11, 0, k(i11 % this.I));
                }
                if (!this.f9834m1) {
                    int finalY = this.f9816c.getFinalY();
                    int i12 = this.O;
                    if (finalY > i12) {
                        this.f9816c.setFinalY(i12);
                    } else {
                        int finalY2 = this.f9816c.getFinalY();
                        int i13 = this.N;
                        if (finalY2 < i13) {
                            this.f9816c.setFinalY(i13);
                        }
                    }
                }
                this.f9814a.post(this);
                VelocityTracker velocityTracker2 = this.f9817d;
                if (velocityTracker2 != null) {
                    velocityTracker2.recycle();
                    this.f9817d = null;
                }
            }
        } else if (action != 2) {
            if (action == 3) {
                if (getParent() != null) {
                    getParent().requestDisallowInterceptTouchEvent(false);
                }
                VelocityTracker velocityTracker3 = this.f9817d;
                if (velocityTracker3 != null) {
                    velocityTracker3.recycle();
                    this.f9817d = null;
                }
            }
        } else if (Math.abs(this.f9821f1 - event.getY()) < this.f9824h1) {
            this.f9838o1 = true;
        } else {
            this.f9838o1 = false;
            this.f9817d.addMovement(event);
            b bVar = this.f9822g;
            if (bVar != null) {
                bVar.c(1);
            }
            float y12 = event.getY() - this.f9820f0;
            if (Math.abs(y12) >= 1.0f) {
                this.V = (int) (this.V + y12);
                this.f9820f0 = (int) event.getY();
                invalidate();
            }
        }
        return true;
    }

    public final void p() {
        this.f9848v = 0;
        this.f9847u = 0;
        if (this.f9826i1) {
            this.f9847u = (int) this.f9815b.measureText(String.valueOf(this.f9839p.get(0)));
        } else if (q(this.W)) {
            this.f9847u = (int) this.f9815b.measureText(String.valueOf(this.f9839p.get(this.W)));
        } else if (TextUtils.isEmpty(this.f9841q)) {
            Iterator it = this.f9839p.iterator();
            while (it.hasNext()) {
                this.f9847u = Math.max(this.f9847u, (int) this.f9815b.measureText(String.valueOf(it.next())));
            }
        } else {
            this.f9847u = (int) this.f9815b.measureText(this.f9841q);
        }
        Paint.FontMetrics fontMetrics = this.f9815b.getFontMetrics();
        this.f9848v = (int) (fontMetrics.bottom - fontMetrics.top);
    }

    public final boolean q(int position) {
        return position >= 0 && position < this.f9839p.size();
    }

    public final int r(int mode, int sizeExpect, int sizeActual) {
        return mode == 1073741824 ? sizeExpect : mode == Integer.MIN_VALUE ? Math.min(sizeActual, sizeExpect) : sizeActual;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list = this.f9839p;
        if (list == null || list.size() == 0) {
            return;
        }
        if (this.f9816c.isFinished() && !this.f9840p1) {
            int i11 = this.I;
            if (i11 == 0) {
                return;
            }
            int size = (((-this.V) / i11) + this.L) % this.f9839p.size();
            if (size < 0) {
                size += this.f9839p.size();
            }
            if (this.f9844r1) {
                Log.i(f9812y1, size + ":" + this.f9839p.get(size) + ":" + this.V);
            }
            this.M = size;
            a aVar = this.f9819f;
            if (aVar != null && this.f9818e) {
                aVar.W(this, this.f9839p.get(size), size);
            }
            b bVar = this.f9822g;
            if (bVar != null && this.f9818e) {
                bVar.a(size);
                this.f9822g.c(0);
            }
        }
        if (this.f9816c.computeScrollOffset()) {
            b bVar2 = this.f9822g;
            if (bVar2 != null) {
                bVar2.c(2);
            }
            this.V = this.f9816c.getCurrY();
            postInvalidate();
            this.f9814a.postDelayed(this, 16L);
        }
    }

    public void s(int position, final boolean animated) {
        this.f9818e = false;
        if (!animated || !this.f9816c.isFinished()) {
            if (!this.f9816c.isFinished()) {
                this.f9816c.abortAnimation();
            }
            int max = Math.max(Math.min(position, this.f9839p.size() - 1), 0);
            this.L = max;
            this.M = max;
            this.V = 0;
            m();
            requestLayout();
            invalidate();
            return;
        }
        int size = getData().size();
        int i11 = position - this.M;
        if (i11 == 0) {
            return;
        }
        if (this.f9834m1 && Math.abs(i11) > size / 2) {
            if (i11 > 0) {
                size = -size;
            }
            i11 += size;
        }
        Scroller scroller = this.f9816c;
        scroller.startScroll(0, scroller.getCurrY(), 0, (-i11) * this.I);
        this.f9814a.post(this);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setAtmospheric(boolean hasAtmospheric) {
        this.f9832l1 = hasAtmospheric;
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setCurtain(boolean hasCurtain) {
        this.f9830k1 = hasCurtain;
        i();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setCurtainColor(int color) {
        this.F = color;
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setCurved(boolean isCurved) {
        this.f9836n1 = isCurved;
        requestLayout();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setCyclic(boolean isCyclic) {
        this.f9834m1 = isCyclic;
        m();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setData(List data) {
        if (data == null) {
            throw new NullPointerException("WheelPicker's data can not be null!");
        }
        this.f9839p = data;
        if (this.L > data.size() - 1 || this.M > data.size() - 1) {
            int size = data.size() - 1;
            this.M = size;
            this.L = size;
        } else {
            this.L = this.M;
        }
        this.V = 0;
        p();
        m();
        requestLayout();
        invalidate();
    }

    @Override // v0.b
    public void setDebug(boolean isDebug) {
        this.f9844r1 = isDebug;
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setIndicator(boolean hasIndicator) {
        this.f9828j1 = hasIndicator;
        n();
        invalidate();
    }

    public void setIndicatorBackground(Drawable indicatorBackground) {
        this.B = indicatorBackground;
        invalidate();
    }

    public void setIndicatorCheck(Drawable indicatorCheck) {
        this.D = indicatorCheck;
        if (indicatorCheck != null) {
            indicatorCheck.setBounds(0, 0, indicatorCheck.getIntrinsicWidth(), this.D.getIntrinsicHeight());
        }
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setIndicatorColor(int color) {
        this.A = color;
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setIndicatorSize(int size) {
        this.f9852z = size;
        n();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setItemAlign(int align) {
        this.H = align;
        t();
        l();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setItemSpace(int space) {
        this.G = space;
        requestLayout();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setItemTextColor(int color) {
        this.f9849w = color;
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setItemTextSize(int size) {
        this.f9851y = size;
        this.f9815b.setTextSize(size);
        p();
        requestLayout();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setMaximumWidthText(String text) {
        if (text == null) {
            throw new NullPointerException("Maximum width text can not be null!");
        }
        this.f9841q = text;
        p();
        requestLayout();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setMaximumWidthTextPosition(int position) {
        if (q(position)) {
            this.W = position;
            p();
            requestLayout();
            invalidate();
            return;
        }
        throw new ArrayIndexOutOfBoundsException("Maximum width text Position must in [0, " + this.f9839p.size() + "), but current is " + position);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setOnItemSelectedListener(a listener) {
        this.f9819f = listener;
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setOnWheelChangeListener(b listener) {
        this.f9822g = listener;
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setSameWidth(boolean hasSameWidth) {
        this.f9826i1 = hasSameWidth;
        p();
        requestLayout();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setSelectedItemPosition(int position) {
        s(position, true);
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setSelectedItemTextColor(int color) {
        this.f9850x = color;
        i();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setTypeface(Typeface tf2) {
        Paint paint = this.f9815b;
        if (paint != null) {
            paint.setTypeface(tf2);
        }
        p();
        requestLayout();
        invalidate();
    }

    @Override // com.aigestudio.wheelpicker.a
    public void setVisibleItemCount(int count) {
        this.f9843r = count;
        u();
        requestLayout();
    }

    public final void t() {
        int i11 = this.H;
        if (i11 == 1) {
            this.f9815b.setTextAlign(Paint.Align.LEFT);
        } else if (i11 != 2) {
            this.f9815b.setTextAlign(Paint.Align.CENTER);
        } else {
            this.f9815b.setTextAlign(Paint.Align.RIGHT);
        }
    }

    public final void u() {
        int i11 = this.f9843r;
        if (i11 < 2) {
            throw new ArithmeticException("Wheel's visible item count can not be less than 2!");
        }
        if (i11 % 2 == 0) {
            this.f9843r = i11 + 1;
        }
        int i12 = this.f9843r + 2;
        this.f9845s = i12;
        this.f9846t = i12 / 2;
    }

    public WheelPicker(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.f9814a = new Handler();
        this.P = 50;
        this.Q = 8000;
        this.f9824h1 = 8;
        float f11 = context.getResources().getDisplayMetrics().density;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attrs, R.styleable.WheelPicker);
        int resourceId = obtainStyledAttributes.getResourceId(R.styleable.WheelPicker_wheel_data, 0);
        this.f9839p = Arrays.asList(getResources().getStringArray(resourceId == 0 ? R.array.WheelArrayDefault : resourceId));
        this.f9851y = obtainStyledAttributes.getDimensionPixelSize(R.styleable.WheelPicker_wheel_item_text_size, getResources().getDimensionPixelSize(R.dimen.WheelItemTextSize));
        this.f9843r = obtainStyledAttributes.getInt(R.styleable.WheelPicker_wheel_visible_item_count, 7);
        this.L = obtainStyledAttributes.getInt(R.styleable.WheelPicker_wheel_selected_item_position, 0);
        this.f9826i1 = obtainStyledAttributes.getBoolean(R.styleable.WheelPicker_wheel_same_width, false);
        this.W = obtainStyledAttributes.getInt(R.styleable.WheelPicker_wheel_maximum_width_text_position, -1);
        this.f9841q = obtainStyledAttributes.getString(R.styleable.WheelPicker_wheel_maximum_width_text);
        this.f9850x = obtainStyledAttributes.getColor(R.styleable.WheelPicker_wheel_selected_item_text_color, -1);
        this.f9849w = obtainStyledAttributes.getColor(R.styleable.WheelPicker_wheel_item_text_color, -7829368);
        this.G = obtainStyledAttributes.getDimensionPixelSize(R.styleable.WheelPicker_wheel_item_space, getResources().getDimensionPixelSize(R.dimen.WheelItemSpace));
        this.f9834m1 = obtainStyledAttributes.getBoolean(R.styleable.WheelPicker_wheel_cyclic, false);
        this.f9828j1 = obtainStyledAttributes.getBoolean(R.styleable.WheelPicker_wheel_indicator, false);
        this.A = obtainStyledAttributes.getColor(R.styleable.WheelPicker_wheel_indicator_color, -1166541);
        this.f9852z = obtainStyledAttributes.getDimensionPixelSize(R.styleable.WheelPicker_wheel_indicator_size, getResources().getDimensionPixelSize(R.dimen.WheelIndicatorSize));
        this.B = obtainStyledAttributes.getDrawable(R.styleable.WheelPicker_wheel_indicator_background);
        this.C = obtainStyledAttributes.getDimensionPixelSize(R.styleable.WheelPicker_wheel_indicator_background_size, 0);
        this.D = obtainStyledAttributes.getDrawable(R.styleable.WheelPicker_wheel_indicator_check);
        this.E = obtainStyledAttributes.getDimensionPixelSize(R.styleable.WheelPicker_wheel_indicator_check_margin, (int) ((f11 * 16.0f) + 0.5f));
        this.f9830k1 = obtainStyledAttributes.getBoolean(R.styleable.WheelPicker_wheel_curtain, false);
        this.F = obtainStyledAttributes.getColor(R.styleable.WheelPicker_wheel_curtain_color, -1996488705);
        this.f9832l1 = obtainStyledAttributes.getBoolean(R.styleable.WheelPicker_wheel_atmospheric, false);
        this.f9836n1 = obtainStyledAttributes.getBoolean(R.styleable.WheelPicker_wheel_curved, false);
        this.H = obtainStyledAttributes.getInt(R.styleable.WheelPicker_wheel_item_align, 0);
        this.f9842q1 = obtainStyledAttributes.getString(R.styleable.WheelPicker_wheel_font_path);
        obtainStyledAttributes.recycle();
        u();
        Paint paint = new Paint(69);
        this.f9815b = paint;
        paint.setTextSize(this.f9851y);
        if (this.f9842q1 != null) {
            setTypeface(Typeface.createFromAsset(context.getAssets(), this.f9842q1));
        }
        t();
        p();
        this.f9816c = new Scroller(getContext());
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.P = viewConfiguration.getScaledMinimumFlingVelocity();
        this.Q = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f9824h1 = viewConfiguration.getScaledTouchSlop();
        this.f9823h = new Rect();
        this.f9825i = new Rect();
        this.f9827j = new Rect();
        this.f9829k = new Rect();
        this.f9831l = new Rect();
        this.f9833m = new Camera();
        this.f9835n = new Matrix();
        this.f9837o = new Matrix();
        Drawable drawable = this.D;
        if (drawable != null) {
            drawable.setBounds(0, 0, drawable.getIntrinsicWidth(), this.D.getIntrinsicHeight());
        }
    }
}
