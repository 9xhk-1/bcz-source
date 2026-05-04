package co;

import an.a;
import android.R;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.transition.ArcMotion;
import android.transition.PathMotion;
import android.transition.Transition;
import android.transition.TransitionValues;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.annotation.ColorInt;
import androidx.annotation.FloatRange;
import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import com.google.android.material.internal.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public final class l extends Transition {
    public static final int A = 1;
    public static final int B = 2;
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;
    public static final int G = 0;
    public static final int H = 1;
    public static final int I = 2;
    public static final String J = "l";
    public static final String K = "materialContainerTransition:bounds";
    public static final String L = "materialContainerTransition:shapeAppearance";
    public static final String[] M = {"materialContainerTransition:bounds", "materialContainerTransition:shapeAppearance"};
    public static final f N = new f(new e(0.0f, 0.25f), new e(0.0f, 1.0f), new e(0.0f, 1.0f), new e(0.0f, 0.75f), null);
    public static final f O = new f(new e(0.6f, 0.9f), new e(0.0f, 1.0f), new e(0.0f, 0.9f), new e(0.3f, 0.9f), null);
    public static final f P = new f(new e(0.1f, 0.4f), new e(0.1f, 1.0f), new e(0.1f, 1.0f), new e(0.1f, 0.9f), null);
    public static final f Q = new f(new e(0.6f, 0.9f), new e(0.0f, 0.9f), new e(0.0f, 0.9f), new e(0.2f, 0.9f), null);
    public static final float R = -1.0f;

    /* renamed from: z, reason: collision with root package name */
    public static final int f9400z = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f9401a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f9402b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9403c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9404d;

    /* renamed from: e, reason: collision with root package name */
    @IdRes
    public int f9405e;

    /* renamed from: f, reason: collision with root package name */
    @IdRes
    public int f9406f;

    /* renamed from: g, reason: collision with root package name */
    @IdRes
    public int f9407g;

    /* renamed from: h, reason: collision with root package name */
    @ColorInt
    public int f9408h;

    /* renamed from: i, reason: collision with root package name */
    @ColorInt
    public int f9409i;

    /* renamed from: j, reason: collision with root package name */
    @ColorInt
    public int f9410j;

    /* renamed from: k, reason: collision with root package name */
    @ColorInt
    public int f9411k;

    /* renamed from: l, reason: collision with root package name */
    public int f9412l;

    /* renamed from: m, reason: collision with root package name */
    public int f9413m;

    /* renamed from: n, reason: collision with root package name */
    public int f9414n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public View f9415o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public View f9416p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public vn.p f9417q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public vn.p f9418r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public e f9419s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public e f9420t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public e f9421u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public e f9422v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f9423w;

    /* renamed from: x, reason: collision with root package name */
    public float f9424x;

    /* renamed from: y, reason: collision with root package name */
    public float f9425y;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f9426a;

        public a(h hVar) {
            this.f9426a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f9426a.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends u {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9428a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f9429b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f9430c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f9431d;

        public b(View view, h hVar, View view2, View view3) {
            this.f9428a = view;
            this.f9429b = hVar;
            this.f9430c = view2;
            this.f9431d = view3;
        }

        @Override // co.u, android.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            l.this.removeListener(this);
            if (l.this.f9402b) {
                return;
            }
            this.f9430c.setAlpha(1.0f);
            this.f9431d.setAlpha(1.0f);
            m0.o(this.f9428a).a(this.f9429b);
        }

        @Override // co.u, android.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
            m0.o(this.f9428a).b(this.f9429b);
            this.f9430c.setAlpha(0.0f);
            this.f9431d.setAlpha(0.0f);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface c {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface d {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public final float f9433a;

        /* renamed from: b, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public final float f9434b;

        public e(@FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
            this.f9433a = f11;
            this.f9434b = f12;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float c() {
            return this.f9434b;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float d() {
            return this.f9433a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final e f9435a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public final e f9436b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public final e f9437c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        public final e f9438d;

        public /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        public f(@NonNull e eVar, @NonNull e eVar2, @NonNull e eVar3, @NonNull e eVar4) {
            this.f9435a = eVar;
            this.f9436b = eVar2;
            this.f9437c = eVar3;
            this.f9438d = eVar4;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public @interface g {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class h extends Drawable {
        public static final int M = 754974720;
        public static final int N = -7829368;
        public static final float O = 0.3f;
        public static final float P = 1.5f;
        public final f A;
        public final co.a B;
        public final co.f C;
        public final boolean D;
        public final Paint E;
        public final Path F;
        public co.c G;
        public co.h H;
        public RectF I;
        public float J;
        public float K;
        public float L;

        /* renamed from: a, reason: collision with root package name */
        public final View f9439a;

        /* renamed from: b, reason: collision with root package name */
        public final RectF f9440b;

        /* renamed from: c, reason: collision with root package name */
        public final vn.p f9441c;

        /* renamed from: d, reason: collision with root package name */
        public final float f9442d;

        /* renamed from: e, reason: collision with root package name */
        public final View f9443e;

        /* renamed from: f, reason: collision with root package name */
        public final RectF f9444f;

        /* renamed from: g, reason: collision with root package name */
        public final vn.p f9445g;

        /* renamed from: h, reason: collision with root package name */
        public final float f9446h;

        /* renamed from: i, reason: collision with root package name */
        public final Paint f9447i;

        /* renamed from: j, reason: collision with root package name */
        public final Paint f9448j;

        /* renamed from: k, reason: collision with root package name */
        public final Paint f9449k;

        /* renamed from: l, reason: collision with root package name */
        public final Paint f9450l;

        /* renamed from: m, reason: collision with root package name */
        public final Paint f9451m;

        /* renamed from: n, reason: collision with root package name */
        public final j f9452n;

        /* renamed from: o, reason: collision with root package name */
        public final PathMeasure f9453o;

        /* renamed from: p, reason: collision with root package name */
        public final float f9454p;

        /* renamed from: q, reason: collision with root package name */
        public final float[] f9455q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f9456r;

        /* renamed from: s, reason: collision with root package name */
        public final float f9457s;

        /* renamed from: t, reason: collision with root package name */
        public final float f9458t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f9459u;

        /* renamed from: v, reason: collision with root package name */
        public final vn.k f9460v;

        /* renamed from: w, reason: collision with root package name */
        public final RectF f9461w;

        /* renamed from: x, reason: collision with root package name */
        public final RectF f9462x;

        /* renamed from: y, reason: collision with root package name */
        public final RectF f9463y;

        /* renamed from: z, reason: collision with root package name */
        public final RectF f9464z;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements a.InterfaceC0022a {
            public a() {
            }

            @Override // an.a.InterfaceC0022a
            public void a(Canvas canvas) {
                h.this.f9439a.draw(canvas);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements a.InterfaceC0022a {
            public b() {
            }

            @Override // an.a.InterfaceC0022a
            public void a(Canvas canvas) {
                h.this.f9443e.draw(canvas);
            }
        }

        public /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, vn.p pVar, float f11, View view2, RectF rectF2, vn.p pVar2, float f12, int i11, int i12, int i13, int i14, boolean z11, boolean z12, co.a aVar, co.f fVar, f fVar2, boolean z13, a aVar2) {
            this(pathMotion, view, rectF, pVar, f11, view2, rectF2, pVar2, f12, i11, i12, i13, i14, z11, z12, aVar, fVar, fVar2, z13);
        }

        public static float d(RectF rectF, float f11) {
            return ((rectF.centerX() / (f11 / 2.0f)) - 1.0f) * 0.3f;
        }

        public static float e(RectF rectF, float f11) {
            return (rectF.centerY() / f11) * 1.5f;
        }

        public static PointF m(RectF rectF) {
            return new PointF(rectF.centerX(), rectF.top);
        }

        @Override // android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f9451m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f9451m);
            }
            int save = this.D ? canvas.save() : -1;
            if (this.f9459u && this.J > 0.0f) {
                h(canvas);
            }
            this.f9452n.a(canvas);
            n(canvas, this.f9447i);
            if (this.G.f9369c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(save);
                f(canvas, this.f9461w, this.F, -65281);
                g(canvas, this.f9462x, -256);
                g(canvas, this.f9461w, -16711936);
                g(canvas, this.f9464z, -16711681);
                g(canvas, this.f9463y, -16776961);
            }
        }

        public final void f(Canvas canvas, RectF rectF, Path path, @ColorInt int i11) {
            PointF m11 = m(rectF);
            if (this.L == 0.0f) {
                path.reset();
                path.moveTo(m11.x, m11.y);
            } else {
                path.lineTo(m11.x, m11.y);
                this.E.setColor(i11);
                canvas.drawPath(path, this.E);
            }
        }

        public final void g(Canvas canvas, RectF rectF, @ColorInt int i11) {
            this.E.setColor(i11);
            canvas.drawRect(rectF, this.E);
        }

        @Override // android.graphics.drawable.Drawable
        public int getOpacity() {
            return -3;
        }

        public final void h(Canvas canvas) {
            canvas.save();
            canvas.clipPath(this.f9452n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        public final void i(Canvas canvas) {
            vn.k kVar = this.f9460v;
            RectF rectF = this.I;
            kVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f9460v.o0(this.J);
            this.f9460v.C0((int) this.K);
            this.f9460v.setShapeAppearanceModel(this.f9452n.c());
            this.f9460v.draw(canvas);
        }

        public final void j(Canvas canvas) {
            vn.p c11 = this.f9452n.c();
            if (!c11.u(this.I)) {
                canvas.drawPath(this.f9452n.d(), this.f9450l);
            } else {
                float a11 = c11.r().a(this.I);
                canvas.drawRoundRect(this.I, a11, a11, this.f9450l);
            }
        }

        public final void k(Canvas canvas) {
            n(canvas, this.f9449k);
            Rect bounds = getBounds();
            RectF rectF = this.f9463y;
            w.x(canvas, bounds, rectF.left, rectF.top, this.H.f9390b, this.G.f9368b, new b());
        }

        public final void l(Canvas canvas) {
            n(canvas, this.f9448j);
            Rect bounds = getBounds();
            RectF rectF = this.f9461w;
            w.x(canvas, bounds, rectF.left, rectF.top, this.H.f9389a, this.G.f9367a, new a());
        }

        public final void n(Canvas canvas, Paint paint) {
            if (paint.getColor() == 0 || paint.getAlpha() <= 0) {
                return;
            }
            canvas.drawRect(getBounds(), paint);
        }

        public final void o(float f11) {
            if (this.L != f11) {
                p(f11);
            }
        }

        public final void p(float f11) {
            float f12;
            float f13;
            this.L = f11;
            this.f9451m.setAlpha((int) (this.f9456r ? w.l(0.0f, 255.0f, f11) : w.l(255.0f, 0.0f, f11)));
            this.f9453o.getPosTan(this.f9454p * f11, this.f9455q, null);
            float[] fArr = this.f9455q;
            float f14 = fArr[0];
            float f15 = fArr[1];
            if (f11 > 1.0f || f11 < 0.0f) {
                if (f11 > 1.0f) {
                    f13 = (f11 - 1.0f) / 0.00999999f;
                    f12 = 0.99f;
                } else {
                    f12 = 0.01f;
                    f13 = (f11 / 0.01f) * (-1.0f);
                }
                this.f9453o.getPosTan(this.f9454p * f12, fArr, null);
                float[] fArr2 = this.f9455q;
                f14 += (f14 - fArr2[0]) * f13;
                f15 += (f15 - fArr2[1]) * f13;
            }
            float f16 = f14;
            float f17 = f15;
            co.h a11 = this.C.a(f11, ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f9436b.f9433a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f9436b.f9434b))).floatValue(), this.f9440b.width(), this.f9440b.height(), this.f9444f.width(), this.f9444f.height());
            this.H = a11;
            RectF rectF = this.f9461w;
            float f18 = a11.f9391c;
            rectF.set(f16 - (f18 / 2.0f), f17, (f18 / 2.0f) + f16, a11.f9392d + f17);
            RectF rectF2 = this.f9463y;
            co.h hVar = this.H;
            float f19 = hVar.f9393e;
            rectF2.set(f16 - (f19 / 2.0f), f17, f16 + (f19 / 2.0f), hVar.f9394f + f17);
            this.f9462x.set(this.f9461w);
            this.f9464z.set(this.f9463y);
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f9437c.f9433a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f9437c.f9434b))).floatValue();
            boolean b11 = this.C.b(this.H);
            RectF rectF3 = b11 ? this.f9462x : this.f9464z;
            float m11 = w.m(0.0f, 1.0f, floatValue, floatValue2, f11);
            if (!b11) {
                m11 = 1.0f - m11;
            }
            this.C.c(rectF3, m11, this.H);
            this.I = new RectF(Math.min(this.f9462x.left, this.f9464z.left), Math.min(this.f9462x.top, this.f9464z.top), Math.max(this.f9462x.right, this.f9464z.right), Math.max(this.f9462x.bottom, this.f9464z.bottom));
            this.f9452n.b(f11, this.f9441c, this.f9445g, this.f9461w, this.f9462x, this.f9464z, this.A.f9438d);
            this.J = w.l(this.f9442d, this.f9446h, f11);
            float d11 = d(this.I, this.f9457s);
            float e11 = e(this.I, this.f9458t);
            float f21 = this.J;
            float f22 = (int) (e11 * f21);
            this.K = f22;
            this.f9450l.setShadowLayer(f21, (int) (d11 * f21), f22, 754974720);
            this.G = this.B.a(f11, ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f9435a.f9433a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f9435a.f9434b))).floatValue(), 0.35f);
            if (this.f9448j.getColor() != 0) {
                this.f9448j.setAlpha(this.G.f9367a);
            }
            if (this.f9449k.getColor() != 0) {
                this.f9449k.setAlpha(this.G.f9368b);
            }
            invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable
        public void setAlpha(int i11) {
            throw new UnsupportedOperationException("Setting alpha on is not supported");
        }

        @Override // android.graphics.drawable.Drawable
        public void setColorFilter(@Nullable ColorFilter colorFilter) {
            throw new UnsupportedOperationException("Setting a color filter is not supported");
        }

        public h(PathMotion pathMotion, View view, RectF rectF, vn.p pVar, float f11, View view2, RectF rectF2, vn.p pVar2, float f12, @ColorInt int i11, @ColorInt int i12, @ColorInt int i13, int i14, boolean z11, boolean z12, co.a aVar, co.f fVar, f fVar2, boolean z13) {
            Paint paint = new Paint();
            this.f9447i = paint;
            Paint paint2 = new Paint();
            this.f9448j = paint2;
            Paint paint3 = new Paint();
            this.f9449k = paint3;
            this.f9450l = new Paint();
            Paint paint4 = new Paint();
            this.f9451m = paint4;
            this.f9452n = new j();
            this.f9455q = new float[]{rectF.centerX(), rectF.top};
            vn.k kVar = new vn.k();
            this.f9460v = kVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f9439a = view;
            this.f9440b = rectF;
            this.f9441c = pVar;
            this.f9442d = f11;
            this.f9443e = view2;
            this.f9444f = rectF2;
            this.f9445g = pVar2;
            this.f9446h = f12;
            this.f9456r = z11;
            this.f9459u = z12;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z13;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f9457s = r9.widthPixels;
            this.f9458t = r9.heightPixels;
            paint.setColor(i11);
            paint2.setColor(i12);
            paint3.setColor(i13);
            kVar.p0(ColorStateList.valueOf(0));
            kVar.y0(2);
            kVar.v0(false);
            kVar.w0(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f9461w = rectF3;
            this.f9462x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f9463y = rectF4;
            this.f9464z = new RectF(rectF4);
            PointF m11 = m(rectF);
            PointF m12 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m11.x, m11.y, m12.x, m12.y), false);
            this.f9453o = pathMeasure;
            this.f9454p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(w.d(i14));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public l() {
        this.f9401a = false;
        this.f9402b = false;
        this.f9403c = false;
        this.f9404d = false;
        this.f9405e = R.id.content;
        this.f9406f = -1;
        this.f9407g = -1;
        this.f9408h = 0;
        this.f9409i = 0;
        this.f9410j = 0;
        this.f9411k = 1375731712;
        this.f9412l = 0;
        this.f9413m = 0;
        this.f9414n = 0;
        this.f9423w = Build.VERSION.SDK_INT >= 28;
        this.f9424x = -1.0f;
        this.f9425y = -1.0f;
    }

    @StyleRes
    public static int G(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    public static RectF c(View view, @Nullable View view2, float f11, float f12) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF h11 = w.h(view2);
        h11.offset(f11, f12);
        return h11;
    }

    public static vn.p d(@NonNull View view, @NonNull RectF rectF, @Nullable vn.p pVar) {
        return w.c(v(view, pVar), rectF);
    }

    public static void e(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i11, @Nullable vn.p pVar) {
        if (i11 != -1) {
            transitionValues.view = w.g(transitionValues.view, i11);
        } else if (view != null) {
            transitionValues.view = view;
        } else {
            View view2 = transitionValues.view;
            int i12 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
            if (view2.getTag(i12) instanceof View) {
                View view3 = (View) transitionValues.view.getTag(i12);
                transitionValues.view.setTag(i12, null);
                transitionValues.view = view3;
            }
        }
        View view4 = transitionValues.view;
        if (!ViewCompat.isLaidOut(view4) && view4.getWidth() == 0 && view4.getHeight() == 0) {
            return;
        }
        RectF i13 = view4.getParent() == null ? w.i(view4) : w.h(view4);
        transitionValues.values.put("materialContainerTransition:bounds", i13);
        transitionValues.values.put("materialContainerTransition:shapeAppearance", d(view4, i13, pVar));
    }

    public static float h(float f11, View view) {
        return f11 != -1.0f ? f11 : ViewCompat.getElevation(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vn.p v(@NonNull View view, @Nullable vn.p pVar) {
        if (pVar != null) {
            return pVar;
        }
        int i11 = com.google.android.material.R.id.mtrl_motion_snapshot_view;
        if (view.getTag(i11) instanceof vn.p) {
            return (vn.p) view.getTag(i11);
        }
        Context context = view.getContext();
        int G2 = G(context);
        return G2 != -1 ? vn.p.b(context, G2, 0).m() : view instanceof vn.t ? ((vn.t) view).getShapeAppearanceModel() : vn.p.a().m();
    }

    @Nullable
    public View A() {
        return this.f9415o;
    }

    @IdRes
    public int B() {
        return this.f9406f;
    }

    public final f E(boolean z11, f fVar, f fVar2) {
        if (!z11) {
            fVar = fVar2;
        }
        return new f((e) w.e(this.f9419s, fVar.f9435a), (e) w.e(this.f9420t, fVar.f9436b), (e) w.e(this.f9421u, fVar.f9437c), (e) w.e(this.f9422v, fVar.f9438d), null);
    }

    public int F() {
        return this.f9412l;
    }

    public boolean J() {
        return this.f9401a;
    }

    public boolean K() {
        return this.f9423w;
    }

    public final boolean M(@NonNull RectF rectF, @NonNull RectF rectF2) {
        int i11 = this.f9412l;
        if (i11 == 0) {
            return w.b(rectF2) > w.b(rectF);
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f9412l);
    }

    public boolean N() {
        return this.f9402b;
    }

    public final void O(Context context, boolean z11) {
        w.s(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, vm.b.f94061b);
        w.r(this, context, z11 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.f9403c) {
            return;
        }
        w.t(this, context, com.google.android.material.R.attr.motionPath);
    }

    public void P(@ColorInt int i11) {
        this.f9408h = i11;
        this.f9409i = i11;
        this.f9410j = i11;
    }

    public void Q(@ColorInt int i11) {
        this.f9408h = i11;
    }

    public void R(boolean z11) {
        this.f9401a = z11;
    }

    public void T(@IdRes int i11) {
        this.f9405e = i11;
    }

    public void W(boolean z11) {
        this.f9423w = z11;
    }

    public void X(@ColorInt int i11) {
        this.f9410j = i11;
    }

    public void Y(float f11) {
        this.f9425y = f11;
    }

    public void Z(@Nullable vn.p pVar) {
        this.f9418r = pVar;
    }

    public void a0(@Nullable View view) {
        this.f9416p = view;
    }

    public final f b(boolean z11) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof k)) ? E(z11, P, Q) : E(z11, N, O);
    }

    public void b0(@IdRes int i11) {
        this.f9407g = i11;
    }

    public void c0(int i11) {
        this.f9413m = i11;
    }

    @Override // android.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f9416p, this.f9407g, this.f9418r);
    }

    @Override // android.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f9415o, this.f9406f, this.f9417q);
    }

    @Override // android.transition.Transition
    @Nullable
    public Animator createAnimator(@NonNull ViewGroup viewGroup, @Nullable TransitionValues transitionValues, @Nullable TransitionValues transitionValues2) {
        View f11;
        View view = null;
        if (transitionValues != null && transitionValues2 != null) {
            RectF rectF = (RectF) transitionValues.values.get("materialContainerTransition:bounds");
            vn.p pVar = (vn.p) transitionValues.values.get("materialContainerTransition:shapeAppearance");
            if (rectF != null && pVar != null) {
                RectF rectF2 = (RectF) transitionValues2.values.get("materialContainerTransition:bounds");
                vn.p pVar2 = (vn.p) transitionValues2.values.get("materialContainerTransition:shapeAppearance");
                if (rectF2 == null || pVar2 == null) {
                    Log.w(J, "Skipping due to null end bounds. Ensure end view is laid out and measured.");
                    return null;
                }
                View view2 = transitionValues.view;
                View view3 = transitionValues2.view;
                View view4 = view3.getParent() != null ? view3 : view2;
                if (this.f9405e == view4.getId()) {
                    f11 = (View) view4.getParent();
                    view = view4;
                } else {
                    f11 = w.f(view4, this.f9405e);
                }
                RectF h11 = w.h(f11);
                float f12 = -h11.left;
                float f13 = -h11.top;
                RectF c11 = c(f11, view, f12, f13);
                rectF.offset(f12, f13);
                rectF2.offset(f12, f13);
                boolean M2 = M(rectF, rectF2);
                if (!this.f9404d) {
                    O(view4.getContext(), M2);
                }
                h hVar = new h(getPathMotion(), view2, rectF, pVar, h(this.f9424x, view2), view3, rectF2, pVar2, h(this.f9425y, view3), this.f9408h, this.f9409i, this.f9410j, this.f9411k, M2, this.f9423w, co.b.a(this.f9413m, M2), co.g.a(this.f9414n, M2, rectF, rectF2), b(M2), this.f9401a, null);
                hVar.setBounds(Math.round(c11.left), Math.round(c11.top), Math.round(c11.right), Math.round(c11.bottom));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new a(hVar));
                addListener(new b(f11, hVar, view2, view3));
                return ofFloat;
            }
            Log.w(J, "Skipping due to null start bounds. Ensure start view is laid out and measured.");
        }
        return null;
    }

    public void e0(@Nullable e eVar) {
        this.f9419s = eVar;
    }

    @ColorInt
    public int f() {
        return this.f9408h;
    }

    public void f0(int i11) {
        this.f9414n = i11;
    }

    @IdRes
    public int g() {
        return this.f9405e;
    }

    public void g0(boolean z11) {
        this.f9402b = z11;
    }

    @Override // android.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return M;
    }

    public void h0(@Nullable e eVar) {
        this.f9421u = eVar;
    }

    @ColorInt
    public int i() {
        return this.f9410j;
    }

    public float j() {
        return this.f9425y;
    }

    public void j0(@Nullable e eVar) {
        this.f9420t = eVar;
    }

    @Nullable
    public vn.p l() {
        return this.f9418r;
    }

    public void l0(@ColorInt int i11) {
        this.f9411k = i11;
    }

    @Nullable
    public View m() {
        return this.f9416p;
    }

    public void m0(@Nullable e eVar) {
        this.f9422v = eVar;
    }

    @IdRes
    public int n() {
        return this.f9407g;
    }

    public void n0(@ColorInt int i11) {
        this.f9409i = i11;
    }

    public int o() {
        return this.f9413m;
    }

    public void o0(float f11) {
        this.f9424x = f11;
    }

    @Nullable
    public e p() {
        return this.f9419s;
    }

    public void p0(@Nullable vn.p pVar) {
        this.f9417q = pVar;
    }

    public int q() {
        return this.f9414n;
    }

    public void q0(@Nullable View view) {
        this.f9415o = view;
    }

    public void r0(@IdRes int i11) {
        this.f9406f = i11;
    }

    @Nullable
    public e s() {
        return this.f9421u;
    }

    public void s0(int i11) {
        this.f9412l = i11;
    }

    @Override // android.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f9403c = true;
    }

    @Nullable
    public e t() {
        return this.f9420t;
    }

    @ColorInt
    public int u() {
        return this.f9411k;
    }

    @Nullable
    public e w() {
        return this.f9422v;
    }

    @ColorInt
    public int x() {
        return this.f9409i;
    }

    public float y() {
        return this.f9424x;
    }

    @Nullable
    public vn.p z() {
        return this.f9417q;
    }

    public l(@NonNull Context context, boolean z11) {
        this.f9401a = false;
        this.f9402b = false;
        this.f9403c = false;
        this.f9404d = false;
        this.f9405e = R.id.content;
        this.f9406f = -1;
        this.f9407g = -1;
        this.f9408h = 0;
        this.f9409i = 0;
        this.f9410j = 0;
        this.f9411k = 1375731712;
        this.f9412l = 0;
        this.f9413m = 0;
        this.f9414n = 0;
        this.f9423w = Build.VERSION.SDK_INT >= 28;
        this.f9424x = -1.0f;
        this.f9425y = -1.0f;
        O(context, z11);
        this.f9404d = true;
    }
}
