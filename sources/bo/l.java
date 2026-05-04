package bo;

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
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import androidx.transition.ArcMotion;
import androidx.transition.PathMotion;
import androidx.transition.Transition;
import androidx.transition.TransitionValues;
import com.google.android.material.internal.m0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
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
    public static final int f7039z = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f7040a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f7041b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7042c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7043d;

    /* renamed from: e, reason: collision with root package name */
    @IdRes
    public int f7044e;

    /* renamed from: f, reason: collision with root package name */
    @IdRes
    public int f7045f;

    /* renamed from: g, reason: collision with root package name */
    @IdRes
    public int f7046g;

    /* renamed from: h, reason: collision with root package name */
    @ColorInt
    public int f7047h;

    /* renamed from: i, reason: collision with root package name */
    @ColorInt
    public int f7048i;

    /* renamed from: j, reason: collision with root package name */
    @ColorInt
    public int f7049j;

    /* renamed from: k, reason: collision with root package name */
    @ColorInt
    public int f7050k;

    /* renamed from: l, reason: collision with root package name */
    public int f7051l;

    /* renamed from: m, reason: collision with root package name */
    public int f7052m;

    /* renamed from: n, reason: collision with root package name */
    public int f7053n;

    /* renamed from: o, reason: collision with root package name */
    @Nullable
    public View f7054o;

    /* renamed from: p, reason: collision with root package name */
    @Nullable
    public View f7055p;

    /* renamed from: q, reason: collision with root package name */
    @Nullable
    public vn.p f7056q;

    /* renamed from: r, reason: collision with root package name */
    @Nullable
    public vn.p f7057r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public e f7058s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public e f7059t;

    /* renamed from: u, reason: collision with root package name */
    @Nullable
    public e f7060u;

    /* renamed from: v, reason: collision with root package name */
    @Nullable
    public e f7061v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f7062w;

    /* renamed from: x, reason: collision with root package name */
    public float f7063x;

    /* renamed from: y, reason: collision with root package name */
    public float f7064y;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ h f7065a;

        public a(h hVar) {
            this.f7065a = hVar;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            this.f7065a.o(valueAnimator.getAnimatedFraction());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends t {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7067a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ h f7068b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ View f7069c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ View f7070d;

        public b(View view, h hVar, View view2, View view3) {
            this.f7067a = view;
            this.f7068b = hVar;
            this.f7069c = view2;
            this.f7070d = view3;
        }

        @Override // bo.t, androidx.transition.Transition.TransitionListener
        public void onTransitionEnd(@NonNull Transition transition) {
            l.this.removeListener(this);
            if (l.this.f7041b) {
                return;
            }
            this.f7069c.setAlpha(1.0f);
            this.f7070d.setAlpha(1.0f);
            m0.o(this.f7067a).a(this.f7068b);
        }

        @Override // bo.t, androidx.transition.Transition.TransitionListener
        public void onTransitionStart(@NonNull Transition transition) {
            m0.o(this.f7067a).b(this.f7068b);
            this.f7069c.setAlpha(0.0f);
            this.f7070d.setAlpha(0.0f);
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
        public final float f7072a;

        /* renamed from: b, reason: collision with root package name */
        @FloatRange(from = 0.0d, to = 1.0d)
        public final float f7073b;

        public e(@FloatRange(from = 0.0d, to = 1.0d) float f11, @FloatRange(from = 0.0d, to = 1.0d) float f12) {
            this.f7072a = f11;
            this.f7073b = f12;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float c() {
            return this.f7073b;
        }

        @FloatRange(from = 0.0d, to = 1.0d)
        public float d() {
            return this.f7072a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class f {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public final e f7074a;

        /* renamed from: b, reason: collision with root package name */
        @NonNull
        public final e f7075b;

        /* renamed from: c, reason: collision with root package name */
        @NonNull
        public final e f7076c;

        /* renamed from: d, reason: collision with root package name */
        @NonNull
        public final e f7077d;

        public /* synthetic */ f(e eVar, e eVar2, e eVar3, e eVar4, a aVar) {
            this(eVar, eVar2, eVar3, eVar4);
        }

        public f(@NonNull e eVar, @NonNull e eVar2, @NonNull e eVar3, @NonNull e eVar4) {
            this.f7074a = eVar;
            this.f7075b = eVar2;
            this.f7076c = eVar3;
            this.f7077d = eVar4;
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
        public final bo.a B;
        public final bo.f C;
        public final boolean D;
        public final Paint E;
        public final Path F;
        public bo.c G;
        public bo.h H;
        public RectF I;
        public float J;
        public float K;
        public float L;

        /* renamed from: a, reason: collision with root package name */
        public final View f7078a;

        /* renamed from: b, reason: collision with root package name */
        public final RectF f7079b;

        /* renamed from: c, reason: collision with root package name */
        public final vn.p f7080c;

        /* renamed from: d, reason: collision with root package name */
        public final float f7081d;

        /* renamed from: e, reason: collision with root package name */
        public final View f7082e;

        /* renamed from: f, reason: collision with root package name */
        public final RectF f7083f;

        /* renamed from: g, reason: collision with root package name */
        public final vn.p f7084g;

        /* renamed from: h, reason: collision with root package name */
        public final float f7085h;

        /* renamed from: i, reason: collision with root package name */
        public final Paint f7086i;

        /* renamed from: j, reason: collision with root package name */
        public final Paint f7087j;

        /* renamed from: k, reason: collision with root package name */
        public final Paint f7088k;

        /* renamed from: l, reason: collision with root package name */
        public final Paint f7089l;

        /* renamed from: m, reason: collision with root package name */
        public final Paint f7090m;

        /* renamed from: n, reason: collision with root package name */
        public final j f7091n;

        /* renamed from: o, reason: collision with root package name */
        public final PathMeasure f7092o;

        /* renamed from: p, reason: collision with root package name */
        public final float f7093p;

        /* renamed from: q, reason: collision with root package name */
        public final float[] f7094q;

        /* renamed from: r, reason: collision with root package name */
        public final boolean f7095r;

        /* renamed from: s, reason: collision with root package name */
        public final float f7096s;

        /* renamed from: t, reason: collision with root package name */
        public final float f7097t;

        /* renamed from: u, reason: collision with root package name */
        public final boolean f7098u;

        /* renamed from: v, reason: collision with root package name */
        public final vn.k f7099v;

        /* renamed from: w, reason: collision with root package name */
        public final RectF f7100w;

        /* renamed from: x, reason: collision with root package name */
        public final RectF f7101x;

        /* renamed from: y, reason: collision with root package name */
        public final RectF f7102y;

        /* renamed from: z, reason: collision with root package name */
        public final RectF f7103z;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements a.InterfaceC0022a {
            public a() {
            }

            @Override // an.a.InterfaceC0022a
            public void a(Canvas canvas) {
                h.this.f7078a.draw(canvas);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements a.InterfaceC0022a {
            public b() {
            }

            @Override // an.a.InterfaceC0022a
            public void a(Canvas canvas) {
                h.this.f7082e.draw(canvas);
            }
        }

        public /* synthetic */ h(PathMotion pathMotion, View view, RectF rectF, vn.p pVar, float f11, View view2, RectF rectF2, vn.p pVar2, float f12, int i11, int i12, int i13, int i14, boolean z11, boolean z12, bo.a aVar, bo.f fVar, f fVar2, boolean z13, a aVar2) {
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
            if (this.f7090m.getAlpha() > 0) {
                canvas.drawRect(getBounds(), this.f7090m);
            }
            int save = this.D ? canvas.save() : -1;
            if (this.f7098u && this.J > 0.0f) {
                h(canvas);
            }
            this.f7091n.a(canvas);
            n(canvas, this.f7086i);
            if (this.G.f7008c) {
                l(canvas);
                k(canvas);
            } else {
                k(canvas);
                l(canvas);
            }
            if (this.D) {
                canvas.restoreToCount(save);
                f(canvas, this.f7100w, this.F, -65281);
                g(canvas, this.f7101x, -256);
                g(canvas, this.f7100w, -16711936);
                g(canvas, this.f7103z, -16711681);
                g(canvas, this.f7102y, -16776961);
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
            canvas.clipPath(this.f7091n.d(), Region.Op.DIFFERENCE);
            if (Build.VERSION.SDK_INT > 28) {
                j(canvas);
            } else {
                i(canvas);
            }
            canvas.restore();
        }

        public final void i(Canvas canvas) {
            vn.k kVar = this.f7099v;
            RectF rectF = this.I;
            kVar.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
            this.f7099v.o0(this.J);
            this.f7099v.C0((int) this.K);
            this.f7099v.setShapeAppearanceModel(this.f7091n.c());
            this.f7099v.draw(canvas);
        }

        public final void j(Canvas canvas) {
            vn.p c11 = this.f7091n.c();
            if (!c11.u(this.I)) {
                canvas.drawPath(this.f7091n.d(), this.f7089l);
            } else {
                float a11 = c11.r().a(this.I);
                canvas.drawRoundRect(this.I, a11, a11, this.f7089l);
            }
        }

        public final void k(Canvas canvas) {
            n(canvas, this.f7088k);
            Rect bounds = getBounds();
            RectF rectF = this.f7102y;
            v.x(canvas, bounds, rectF.left, rectF.top, this.H.f7029b, this.G.f7007b, new b());
        }

        public final void l(Canvas canvas) {
            n(canvas, this.f7087j);
            Rect bounds = getBounds();
            RectF rectF = this.f7100w;
            v.x(canvas, bounds, rectF.left, rectF.top, this.H.f7028a, this.G.f7006a, new a());
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
            this.f7090m.setAlpha((int) (this.f7095r ? v.l(0.0f, 255.0f, f11) : v.l(255.0f, 0.0f, f11)));
            this.f7092o.getPosTan(this.f7093p * f11, this.f7094q, null);
            float[] fArr = this.f7094q;
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
                this.f7092o.getPosTan(this.f7093p * f12, fArr, null);
                float[] fArr2 = this.f7094q;
                f14 += (f14 - fArr2[0]) * f13;
                f15 += (f15 - fArr2[1]) * f13;
            }
            float f16 = f14;
            float f17 = f15;
            bo.h a11 = this.C.a(f11, ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f7075b.f7072a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f7075b.f7073b))).floatValue(), this.f7079b.width(), this.f7079b.height(), this.f7083f.width(), this.f7083f.height());
            this.H = a11;
            RectF rectF = this.f7100w;
            float f18 = a11.f7030c;
            rectF.set(f16 - (f18 / 2.0f), f17, (f18 / 2.0f) + f16, a11.f7031d + f17);
            RectF rectF2 = this.f7102y;
            bo.h hVar = this.H;
            float f19 = hVar.f7032e;
            rectF2.set(f16 - (f19 / 2.0f), f17, f16 + (f19 / 2.0f), hVar.f7033f + f17);
            this.f7101x.set(this.f7100w);
            this.f7103z.set(this.f7102y);
            float floatValue = ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f7076c.f7072a))).floatValue();
            float floatValue2 = ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f7076c.f7073b))).floatValue();
            boolean c11 = this.C.c(this.H);
            RectF rectF3 = c11 ? this.f7101x : this.f7103z;
            float m11 = v.m(0.0f, 1.0f, floatValue, floatValue2, f11);
            if (!c11) {
                m11 = 1.0f - m11;
            }
            this.C.b(rectF3, m11, this.H);
            this.I = new RectF(Math.min(this.f7101x.left, this.f7103z.left), Math.min(this.f7101x.top, this.f7103z.top), Math.max(this.f7101x.right, this.f7103z.right), Math.max(this.f7101x.bottom, this.f7103z.bottom));
            this.f7091n.b(f11, this.f7080c, this.f7084g, this.f7100w, this.f7101x, this.f7103z, this.A.f7077d);
            this.J = v.l(this.f7081d, this.f7085h, f11);
            float d11 = d(this.I, this.f7096s);
            float e11 = e(this.I, this.f7097t);
            float f21 = this.J;
            float f22 = (int) (e11 * f21);
            this.K = f22;
            this.f7089l.setShadowLayer(f21, (int) (d11 * f21), f22, 754974720);
            this.G = this.B.a(f11, ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f7074a.f7072a))).floatValue(), ((Float) Preconditions.checkNotNull(Float.valueOf(this.A.f7074a.f7073b))).floatValue(), 0.35f);
            if (this.f7087j.getColor() != 0) {
                this.f7087j.setAlpha(this.G.f7006a);
            }
            if (this.f7088k.getColor() != 0) {
                this.f7088k.setAlpha(this.G.f7007b);
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

        public h(PathMotion pathMotion, View view, RectF rectF, vn.p pVar, float f11, View view2, RectF rectF2, vn.p pVar2, float f12, @ColorInt int i11, @ColorInt int i12, @ColorInt int i13, int i14, boolean z11, boolean z12, bo.a aVar, bo.f fVar, f fVar2, boolean z13) {
            Paint paint = new Paint();
            this.f7086i = paint;
            Paint paint2 = new Paint();
            this.f7087j = paint2;
            Paint paint3 = new Paint();
            this.f7088k = paint3;
            this.f7089l = new Paint();
            Paint paint4 = new Paint();
            this.f7090m = paint4;
            this.f7091n = new j();
            this.f7094q = new float[]{rectF.centerX(), rectF.top};
            vn.k kVar = new vn.k();
            this.f7099v = kVar;
            Paint paint5 = new Paint();
            this.E = paint5;
            this.F = new Path();
            this.f7078a = view;
            this.f7079b = rectF;
            this.f7080c = pVar;
            this.f7081d = f11;
            this.f7082e = view2;
            this.f7083f = rectF2;
            this.f7084g = pVar2;
            this.f7085h = f12;
            this.f7095r = z11;
            this.f7098u = z12;
            this.B = aVar;
            this.C = fVar;
            this.A = fVar2;
            this.D = z13;
            WindowManager windowManager = (WindowManager) view.getContext().getSystemService("window");
            windowManager.getDefaultDisplay().getMetrics(new DisplayMetrics());
            this.f7096s = r9.widthPixels;
            this.f7097t = r9.heightPixels;
            paint.setColor(i11);
            paint2.setColor(i12);
            paint3.setColor(i13);
            kVar.p0(ColorStateList.valueOf(0));
            kVar.y0(2);
            kVar.v0(false);
            kVar.w0(-7829368);
            RectF rectF3 = new RectF(rectF);
            this.f7100w = rectF3;
            this.f7101x = new RectF(rectF3);
            RectF rectF4 = new RectF(rectF3);
            this.f7102y = rectF4;
            this.f7103z = new RectF(rectF4);
            PointF m11 = m(rectF);
            PointF m12 = m(rectF2);
            PathMeasure pathMeasure = new PathMeasure(pathMotion.getPath(m11.x, m11.y, m12.x, m12.y), false);
            this.f7092o = pathMeasure;
            this.f7093p = pathMeasure.getLength();
            paint4.setStyle(Paint.Style.FILL);
            paint4.setShader(v.d(i14));
            paint5.setStyle(Paint.Style.STROKE);
            paint5.setStrokeWidth(10.0f);
            p(0.0f);
        }
    }

    public l() {
        this.f7040a = false;
        this.f7041b = false;
        this.f7042c = false;
        this.f7043d = false;
        this.f7044e = R.id.content;
        this.f7045f = -1;
        this.f7046g = -1;
        this.f7047h = 0;
        this.f7048i = 0;
        this.f7049j = 0;
        this.f7050k = 1375731712;
        this.f7051l = 0;
        this.f7052m = 0;
        this.f7053n = 0;
        this.f7062w = Build.VERSION.SDK_INT >= 28;
        this.f7063x = -1.0f;
        this.f7064y = -1.0f;
    }

    @StyleRes
    public static int G(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(new int[]{com.google.android.material.R.attr.transitionShapeAppearance});
        int resourceId = obtainStyledAttributes.getResourceId(0, -1);
        obtainStyledAttributes.recycle();
        return resourceId;
    }

    private void O(Context context, boolean z11) {
        v.s(this, context, com.google.android.material.R.attr.motionEasingEmphasizedInterpolator, vm.b.f94061b);
        v.r(this, context, z11 ? com.google.android.material.R.attr.motionDurationLong2 : com.google.android.material.R.attr.motionDurationMedium4);
        if (this.f7042c) {
            return;
        }
        v.t(this, context, com.google.android.material.R.attr.motionPath);
    }

    public static RectF c(View view, @Nullable View view2, float f11, float f12) {
        if (view2 == null) {
            return new RectF(0.0f, 0.0f, view.getWidth(), view.getHeight());
        }
        RectF h11 = v.h(view2);
        h11.offset(f11, f12);
        return h11;
    }

    public static vn.p d(@NonNull View view, @NonNull RectF rectF, @Nullable vn.p pVar) {
        return v.c(v(view, pVar), rectF);
    }

    public static void e(@NonNull TransitionValues transitionValues, @Nullable View view, @IdRes int i11, @Nullable vn.p pVar) {
        if (i11 != -1) {
            transitionValues.view = v.g(transitionValues.view, i11);
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
        RectF i13 = view4.getParent() == null ? v.i(view4) : v.h(view4);
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
        return this.f7054o;
    }

    @IdRes
    public int B() {
        return this.f7045f;
    }

    public final f E(boolean z11, f fVar, f fVar2) {
        if (!z11) {
            fVar = fVar2;
        }
        return new f((e) v.e(this.f7058s, fVar.f7074a), (e) v.e(this.f7059t, fVar.f7075b), (e) v.e(this.f7060u, fVar.f7076c), (e) v.e(this.f7061v, fVar.f7077d), null);
    }

    public int F() {
        return this.f7051l;
    }

    public boolean J() {
        return this.f7040a;
    }

    public boolean K() {
        return this.f7062w;
    }

    public final boolean M(@NonNull RectF rectF, @NonNull RectF rectF2) {
        int i11 = this.f7051l;
        if (i11 == 0) {
            return v.b(rectF2) > v.b(rectF);
        }
        if (i11 == 1) {
            return true;
        }
        if (i11 == 2) {
            return false;
        }
        throw new IllegalArgumentException("Invalid transition direction: " + this.f7051l);
    }

    public boolean N() {
        return this.f7041b;
    }

    public void P(@ColorInt int i11) {
        this.f7047h = i11;
        this.f7048i = i11;
        this.f7049j = i11;
    }

    public void Q(@ColorInt int i11) {
        this.f7047h = i11;
    }

    public void R(boolean z11) {
        this.f7040a = z11;
    }

    public void T(@IdRes int i11) {
        this.f7044e = i11;
    }

    public void W(boolean z11) {
        this.f7062w = z11;
    }

    public void X(@ColorInt int i11) {
        this.f7049j = i11;
    }

    public void Y(float f11) {
        this.f7064y = f11;
    }

    public void Z(@Nullable vn.p pVar) {
        this.f7057r = pVar;
    }

    public void a0(@Nullable View view) {
        this.f7055p = view;
    }

    public final f b(boolean z11) {
        PathMotion pathMotion = getPathMotion();
        return ((pathMotion instanceof ArcMotion) || (pathMotion instanceof k)) ? E(z11, P, Q) : E(z11, N, O);
    }

    public void b0(@IdRes int i11) {
        this.f7046g = i11;
    }

    public void c0(int i11) {
        this.f7052m = i11;
    }

    @Override // androidx.transition.Transition
    public void captureEndValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f7055p, this.f7046g, this.f7057r);
    }

    @Override // androidx.transition.Transition
    public void captureStartValues(@NonNull TransitionValues transitionValues) {
        e(transitionValues, this.f7054o, this.f7045f, this.f7056q);
    }

    @Override // androidx.transition.Transition
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
                if (this.f7044e == view4.getId()) {
                    f11 = (View) view4.getParent();
                    view = view4;
                } else {
                    f11 = v.f(view4, this.f7044e);
                }
                RectF h11 = v.h(f11);
                float f12 = -h11.left;
                float f13 = -h11.top;
                RectF c11 = c(f11, view, f12, f13);
                rectF.offset(f12, f13);
                rectF2.offset(f12, f13);
                boolean M2 = M(rectF, rectF2);
                if (!this.f7043d) {
                    O(view4.getContext(), M2);
                }
                h hVar = new h(getPathMotion(), view2, rectF, pVar, h(this.f7063x, view2), view3, rectF2, pVar2, h(this.f7064y, view3), this.f7047h, this.f7048i, this.f7049j, this.f7050k, M2, this.f7062w, bo.b.a(this.f7052m, M2), bo.g.a(this.f7053n, M2, rectF, rectF2), b(M2), this.f7040a, null);
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
        this.f7058s = eVar;
    }

    @ColorInt
    public int f() {
        return this.f7047h;
    }

    public void f0(int i11) {
        this.f7053n = i11;
    }

    @IdRes
    public int g() {
        return this.f7044e;
    }

    public void g0(boolean z11) {
        this.f7041b = z11;
    }

    @Override // androidx.transition.Transition
    @Nullable
    public String[] getTransitionProperties() {
        return M;
    }

    public void h0(@Nullable e eVar) {
        this.f7060u = eVar;
    }

    @ColorInt
    public int i() {
        return this.f7049j;
    }

    public float j() {
        return this.f7064y;
    }

    public void j0(@Nullable e eVar) {
        this.f7059t = eVar;
    }

    @Nullable
    public vn.p l() {
        return this.f7057r;
    }

    public void l0(@ColorInt int i11) {
        this.f7050k = i11;
    }

    @Nullable
    public View m() {
        return this.f7055p;
    }

    public void m0(@Nullable e eVar) {
        this.f7061v = eVar;
    }

    @IdRes
    public int n() {
        return this.f7046g;
    }

    public void n0(@ColorInt int i11) {
        this.f7048i = i11;
    }

    public int o() {
        return this.f7052m;
    }

    public void o0(float f11) {
        this.f7063x = f11;
    }

    @Nullable
    public e p() {
        return this.f7058s;
    }

    public void p0(@Nullable vn.p pVar) {
        this.f7056q = pVar;
    }

    public int q() {
        return this.f7053n;
    }

    public void q0(@Nullable View view) {
        this.f7054o = view;
    }

    public void r0(@IdRes int i11) {
        this.f7045f = i11;
    }

    @Nullable
    public e s() {
        return this.f7060u;
    }

    public void s0(int i11) {
        this.f7051l = i11;
    }

    @Override // androidx.transition.Transition
    public void setPathMotion(@Nullable PathMotion pathMotion) {
        super.setPathMotion(pathMotion);
        this.f7042c = true;
    }

    @Nullable
    public e t() {
        return this.f7059t;
    }

    @ColorInt
    public int u() {
        return this.f7050k;
    }

    @Nullable
    public e w() {
        return this.f7061v;
    }

    @ColorInt
    public int x() {
        return this.f7048i;
    }

    public float y() {
        return this.f7063x;
    }

    @Nullable
    public vn.p z() {
        return this.f7056q;
    }

    public l(@NonNull Context context, boolean z11) {
        this.f7040a = false;
        this.f7041b = false;
        this.f7042c = false;
        this.f7043d = false;
        this.f7044e = R.id.content;
        this.f7045f = -1;
        this.f7046g = -1;
        this.f7047h = 0;
        this.f7048i = 0;
        this.f7049j = 0;
        this.f7050k = 1375731712;
        this.f7051l = 0;
        this.f7052m = 0;
        this.f7053n = 0;
        this.f7062w = Build.VERSION.SDK_INT >= 28;
        this.f7063x = -1.0f;
        this.f7064y = -1.0f;
        O(context, z11);
        this.f7043d = true;
    }
}
