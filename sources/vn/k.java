package vn;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Log;
import androidx.annotation.AttrRes;
import androidx.annotation.ColorInt;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;
import androidx.core.graphics.drawable.TintAwareDrawable;
import androidx.core.util.ObjectsCompat;
import com.google.android.material.R;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.BitSet;
import vn.p;
import vn.q;
import vn.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class k extends Drawable implements TintAwareDrawable, t {
    public static final int A = 0;
    public static final int B = 1;
    public static final int C = 2;
    public static final Paint D;

    /* renamed from: x, reason: collision with root package name */
    public static final String f94099x = "k";

    /* renamed from: y, reason: collision with root package name */
    public static final float f94100y = 0.75f;

    /* renamed from: z, reason: collision with root package name */
    public static final float f94101z = 0.25f;

    /* renamed from: a, reason: collision with root package name */
    public d f94102a;

    /* renamed from: b, reason: collision with root package name */
    public final r.j[] f94103b;

    /* renamed from: c, reason: collision with root package name */
    public final r.j[] f94104c;

    /* renamed from: d, reason: collision with root package name */
    public final BitSet f94105d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f94106e;

    /* renamed from: f, reason: collision with root package name */
    public final Matrix f94107f;

    /* renamed from: g, reason: collision with root package name */
    public final Path f94108g;

    /* renamed from: h, reason: collision with root package name */
    public final Path f94109h;

    /* renamed from: i, reason: collision with root package name */
    public final RectF f94110i;

    /* renamed from: j, reason: collision with root package name */
    public final RectF f94111j;

    /* renamed from: k, reason: collision with root package name */
    public final Region f94112k;

    /* renamed from: l, reason: collision with root package name */
    public final Region f94113l;

    /* renamed from: m, reason: collision with root package name */
    public p f94114m;

    /* renamed from: n, reason: collision with root package name */
    public final Paint f94115n;

    /* renamed from: o, reason: collision with root package name */
    public final Paint f94116o;

    /* renamed from: p, reason: collision with root package name */
    public final un.b f94117p;

    /* renamed from: q, reason: collision with root package name */
    @NonNull
    public final q.b f94118q;

    /* renamed from: r, reason: collision with root package name */
    public final q f94119r;

    /* renamed from: s, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f94120s;

    /* renamed from: t, reason: collision with root package name */
    @Nullable
    public PorterDuffColorFilter f94121t;

    /* renamed from: u, reason: collision with root package name */
    public int f94122u;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    public final RectF f94123v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f94124w;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements q.b {
        public a() {
        }

        @Override // vn.q.b
        public void a(@NonNull r rVar, Matrix matrix, int i11) {
            k.this.f94105d.set(i11 + 4, rVar.e());
            k.this.f94104c[i11] = rVar.f(matrix);
        }

        @Override // vn.q.b
        public void b(@NonNull r rVar, Matrix matrix, int i11) {
            k.this.f94105d.set(i11, rVar.e());
            k.this.f94103b[i11] = rVar.f(matrix);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements p.c {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ float f94126a;

        public b(float f11) {
            this.f94126a = f11;
        }

        @Override // vn.p.c
        @NonNull
        public e a(@NonNull e eVar) {
            return eVar instanceof n ? eVar : new vn.b(this.f94126a, eVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Retention(RetentionPolicy.SOURCE)
    public @interface c {
    }

    static {
        Paint paint = new Paint(1);
        D = paint;
        paint.setColor(-1);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OUT));
    }

    public k() {
        this(new p());
    }

    public static int i0(int i11, int i12) {
        return (i11 * (i12 + (i12 >>> 7))) >>> 8;
    }

    @NonNull
    public static k m(Context context) {
        return n(context, 0.0f);
    }

    @NonNull
    public static k n(@NonNull Context context, float f11) {
        return o(context, f11, null);
    }

    @NonNull
    public static k o(@NonNull Context context, float f11, @Nullable ColorStateList colorStateList) {
        if (colorStateList == null) {
            colorStateList = ColorStateList.valueOf(en.u.c(context, R.attr.colorSurface, k.class.getSimpleName()));
        }
        k kVar = new k();
        kVar.a0(context);
        kVar.p0(colorStateList);
        kVar.o0(f11);
        return kVar;
    }

    public float A() {
        return this.f94102a.f94138k;
    }

    @Deprecated
    public void A0(boolean z11) {
        y0(!z11 ? 1 : 0);
    }

    public Paint.Style B() {
        return this.f94102a.f94149v;
    }

    @Deprecated
    public void B0(int i11) {
        this.f94102a.f94145r = i11;
    }

    public float C() {
        return this.f94102a.f94141n;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void C0(int i11) {
        d dVar = this.f94102a;
        if (dVar.f94146s != i11) {
            dVar.f94146s = i11;
            b0();
        }
    }

    @Deprecated
    public void D(int i11, int i12, @NonNull Path path) {
        h(new RectF(0.0f, 0.0f, i11, i12), path);
    }

    @Deprecated
    public void D0(@NonNull s sVar) {
        setShapeAppearanceModel(sVar);
    }

    @ColorInt
    public int E() {
        return this.f94122u;
    }

    public void E0(float f11, @ColorInt int i11) {
        J0(f11);
        G0(ColorStateList.valueOf(i11));
    }

    public float F() {
        return this.f94102a.f94137j;
    }

    public void F0(float f11, @Nullable ColorStateList colorStateList) {
        J0(f11);
        G0(colorStateList);
    }

    public int G() {
        return this.f94102a.f94147t;
    }

    public void G0(@Nullable ColorStateList colorStateList) {
        d dVar = this.f94102a;
        if (dVar.f94132e != colorStateList) {
            dVar.f94132e = colorStateList;
            onStateChange(getState());
        }
    }

    public int H() {
        return this.f94102a.f94144q;
    }

    public void H0(@ColorInt int i11) {
        I0(ColorStateList.valueOf(i11));
    }

    @Deprecated
    public int I() {
        return (int) y();
    }

    public void I0(ColorStateList colorStateList) {
        this.f94102a.f94133f = colorStateList;
        O0();
        b0();
    }

    public int J() {
        d dVar = this.f94102a;
        return (int) (dVar.f94146s * Math.sin(Math.toRadians(dVar.f94147t)));
    }

    public void J0(float f11) {
        this.f94102a.f94139l = f11;
        invalidateSelf();
    }

    public int K() {
        d dVar = this.f94102a;
        return (int) (dVar.f94146s * Math.cos(Math.toRadians(dVar.f94147t)));
    }

    public void K0(float f11) {
        d dVar = this.f94102a;
        if (dVar.f94143p != f11) {
            dVar.f94143p = f11;
            P0();
        }
    }

    public int L() {
        return this.f94102a.f94145r;
    }

    public void L0(boolean z11) {
        d dVar = this.f94102a;
        if (dVar.f94148u != z11) {
            dVar.f94148u = z11;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int M() {
        return this.f94102a.f94146s;
    }

    public void M0(float f11) {
        K0(f11 - y());
    }

    @Nullable
    @Deprecated
    public s N() {
        p shapeAppearanceModel = getShapeAppearanceModel();
        if (shapeAppearanceModel instanceof s) {
            return (s) shapeAppearanceModel;
        }
        return null;
    }

    public final boolean N0(int[] iArr) {
        boolean z11;
        int color;
        int colorForState;
        int color2;
        int colorForState2;
        if (this.f94102a.f94131d == null || color2 == (colorForState2 = this.f94102a.f94131d.getColorForState(iArr, (color2 = this.f94115n.getColor())))) {
            z11 = false;
        } else {
            this.f94115n.setColor(colorForState2);
            z11 = true;
        }
        if (this.f94102a.f94132e == null || color == (colorForState = this.f94102a.f94132e.getColorForState(iArr, (color = this.f94116o.getColor())))) {
            return z11;
        }
        this.f94116o.setColor(colorForState);
        return true;
    }

    @Nullable
    public ColorStateList O() {
        return this.f94102a.f94132e;
    }

    public final boolean O0() {
        PorterDuffColorFilter porterDuffColorFilter = this.f94120s;
        PorterDuffColorFilter porterDuffColorFilter2 = this.f94121t;
        d dVar = this.f94102a;
        this.f94120s = k(dVar.f94134g, dVar.f94135h, this.f94115n, true);
        d dVar2 = this.f94102a;
        this.f94121t = k(dVar2.f94133f, dVar2.f94135h, this.f94116o, false);
        d dVar3 = this.f94102a;
        if (dVar3.f94148u) {
            this.f94117p.e(dVar3.f94134g.getColorForState(getState(), 0));
        }
        return (ObjectsCompat.equals(porterDuffColorFilter, this.f94120s) && ObjectsCompat.equals(porterDuffColorFilter2, this.f94121t)) ? false : true;
    }

    public final float P() {
        if (Z()) {
            return this.f94116o.getStrokeWidth() / 2.0f;
        }
        return 0.0f;
    }

    public final void P0() {
        float W = W();
        this.f94102a.f94145r = (int) Math.ceil(0.75f * W);
        this.f94102a.f94146s = (int) Math.ceil(W * 0.25f);
        O0();
        b0();
    }

    @Nullable
    public ColorStateList Q() {
        return this.f94102a.f94133f;
    }

    public float R() {
        return this.f94102a.f94139l;
    }

    @Nullable
    public ColorStateList S() {
        return this.f94102a.f94134g;
    }

    public float T() {
        return this.f94102a.f94128a.r().a(w());
    }

    public float U() {
        return this.f94102a.f94128a.t().a(w());
    }

    public float V() {
        return this.f94102a.f94143p;
    }

    public float W() {
        return y() + V();
    }

    public final boolean X() {
        d dVar = this.f94102a;
        int i11 = dVar.f94144q;
        if (i11 == 1 || dVar.f94145r <= 0) {
            return false;
        }
        return i11 == 2 || k0();
    }

    public final boolean Y() {
        Paint.Style style = this.f94102a.f94149v;
        return style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.FILL;
    }

    public final boolean Z() {
        Paint.Style style = this.f94102a.f94149v;
        return (style == Paint.Style.FILL_AND_STROKE || style == Paint.Style.STROKE) && this.f94116o.getStrokeWidth() > 0.0f;
    }

    public void a0(Context context) {
        this.f94102a.f94129b = new ln.a(context);
        P0();
    }

    public final void b0() {
        super.invalidateSelf();
    }

    public boolean c0() {
        ln.a aVar = this.f94102a.f94129b;
        return aVar != null && aVar.l();
    }

    public boolean d0() {
        return this.f94102a.f94129b != null;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        this.f94115n.setColorFilter(this.f94120s);
        int alpha = this.f94115n.getAlpha();
        this.f94115n.setAlpha(i0(alpha, this.f94102a.f94140m));
        this.f94116o.setColorFilter(this.f94121t);
        this.f94116o.setStrokeWidth(this.f94102a.f94139l);
        int alpha2 = this.f94116o.getAlpha();
        this.f94116o.setAlpha(i0(alpha2, this.f94102a.f94140m));
        if (this.f94106e) {
            i();
            g(w(), this.f94108g);
            this.f94106e = false;
        }
        h0(canvas);
        if (Y()) {
            q(canvas);
        }
        if (Z()) {
            t(canvas);
        }
        this.f94115n.setAlpha(alpha);
        this.f94116o.setAlpha(alpha2);
    }

    public boolean e0(int i11, int i12) {
        return getTransparentRegion().contains(i11, i12);
    }

    @Nullable
    public final PorterDuffColorFilter f(@NonNull Paint paint, boolean z11) {
        if (!z11) {
            return null;
        }
        int color = paint.getColor();
        int l11 = l(color);
        this.f94122u = l11;
        if (l11 != color) {
            return new PorterDuffColorFilter(l11, PorterDuff.Mode.SRC_IN);
        }
        return null;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public boolean f0() {
        return this.f94102a.f94128a.u(w());
    }

    public final void g(@NonNull RectF rectF, @NonNull Path path) {
        h(rectF, path);
        if (this.f94102a.f94137j != 1.0f) {
            this.f94107f.reset();
            Matrix matrix = this.f94107f;
            float f11 = this.f94102a.f94137j;
            matrix.setScale(f11, f11, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.f94107f);
        }
        path.computeBounds(this.f94123v, true);
    }

    @Deprecated
    public boolean g0() {
        int i11 = this.f94102a.f94144q;
        return i11 == 0 || i11 == 2;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f94102a.f94140m;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f94102a;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    @TargetApi(21)
    public void getOutline(@NonNull Outline outline) {
        if (this.f94102a.f94144q == 2) {
            return;
        }
        if (f0()) {
            outline.setRoundRect(getBounds(), T() * this.f94102a.f94138k);
        } else {
            g(w(), this.f94108g);
            kn.d.l(outline, this.f94108g);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean getPadding(@NonNull Rect rect) {
        Rect rect2 = this.f94102a.f94136i;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    @Override // vn.t
    @NonNull
    public p getShapeAppearanceModel() {
        return this.f94102a.f94128a;
    }

    @Override // android.graphics.drawable.Drawable
    public Region getTransparentRegion() {
        this.f94112k.set(getBounds());
        g(w(), this.f94108g);
        this.f94113l.setPath(this.f94108g, this.f94112k);
        this.f94112k.op(this.f94113l, Region.Op.DIFFERENCE);
        return this.f94112k;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public final void h(@NonNull RectF rectF, @NonNull Path path) {
        q qVar = this.f94119r;
        d dVar = this.f94102a;
        qVar.e(dVar.f94128a, dVar.f94138k, rectF, this.f94118q, path);
    }

    public final void h0(@NonNull Canvas canvas) {
        if (X()) {
            canvas.save();
            j0(canvas);
            if (!this.f94124w) {
                p(canvas);
                canvas.restore();
                return;
            }
            int width = (int) (this.f94123v.width() - getBounds().width());
            int height = (int) (this.f94123v.height() - getBounds().height());
            if (width < 0 || height < 0) {
                throw new IllegalStateException("Invalid shadow bounds. Check that the treatments result in a valid path.");
            }
            Bitmap createBitmap = Bitmap.createBitmap(((int) this.f94123v.width()) + (this.f94102a.f94145r * 2) + width, ((int) this.f94123v.height()) + (this.f94102a.f94145r * 2) + height, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f11 = (getBounds().left - this.f94102a.f94145r) - width;
            float f12 = (getBounds().top - this.f94102a.f94145r) - height;
            canvas2.translate(-f11, -f12);
            p(canvas2);
            canvas.drawBitmap(createBitmap, f11, f12, (Paint) null);
            createBitmap.recycle();
            canvas.restore();
        }
    }

    public final void i() {
        p y11 = getShapeAppearanceModel().y(new b(-P()));
        this.f94114m = y11;
        this.f94119r.d(y11, this.f94102a.f94138k, x(), this.f94109h);
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        this.f94106e = true;
        super.invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        if (super.isStateful()) {
            return true;
        }
        ColorStateList colorStateList = this.f94102a.f94134g;
        if (colorStateList != null && colorStateList.isStateful()) {
            return true;
        }
        ColorStateList colorStateList2 = this.f94102a.f94133f;
        if (colorStateList2 != null && colorStateList2.isStateful()) {
            return true;
        }
        ColorStateList colorStateList3 = this.f94102a.f94132e;
        if (colorStateList3 != null && colorStateList3.isStateful()) {
            return true;
        }
        ColorStateList colorStateList4 = this.f94102a.f94131d;
        return colorStateList4 != null && colorStateList4.isStateful();
    }

    @NonNull
    public final PorterDuffColorFilter j(@NonNull ColorStateList colorStateList, @NonNull PorterDuff.Mode mode, boolean z11) {
        int colorForState = colorStateList.getColorForState(getState(), 0);
        if (z11) {
            colorForState = l(colorForState);
        }
        this.f94122u = colorForState;
        return new PorterDuffColorFilter(colorForState, mode);
    }

    public final void j0(@NonNull Canvas canvas) {
        canvas.translate(J(), K());
    }

    @NonNull
    public final PorterDuffColorFilter k(@Nullable ColorStateList colorStateList, @Nullable PorterDuff.Mode mode, @NonNull Paint paint, boolean z11) {
        return (colorStateList == null || mode == null) ? f(paint, z11) : j(colorStateList, mode, z11);
    }

    public boolean k0() {
        return (f0() || this.f94108g.isConvex() || Build.VERSION.SDK_INT >= 29) ? false : true;
    }

    @ColorInt
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public int l(@ColorInt int i11) {
        float W = W() + C();
        ln.a aVar = this.f94102a.f94129b;
        return aVar != null ? aVar.e(i11, W) : i11;
    }

    public void l0(float f11) {
        setShapeAppearanceModel(this.f94102a.f94128a.w(f11));
    }

    public void m0(@NonNull e eVar) {
        setShapeAppearanceModel(this.f94102a.f94128a.x(eVar));
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        this.f94102a = new d(this.f94102a);
        return this;
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void n0(boolean z11) {
        this.f94119r.n(z11);
    }

    public void o0(float f11) {
        d dVar = this.f94102a;
        if (dVar.f94142o != f11) {
            dVar.f94142o = f11;
            P0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        this.f94106e = true;
        super.onBoundsChange(rect);
    }

    @Override // android.graphics.drawable.Drawable, com.google.android.material.internal.a0.b
    public boolean onStateChange(int[] iArr) {
        boolean z11 = N0(iArr) || O0();
        if (z11) {
            invalidateSelf();
        }
        return z11;
    }

    public final void p(@NonNull Canvas canvas) {
        if (this.f94105d.cardinality() > 0) {
            Log.w(f94099x, "Compatibility shadow requested but can't be drawn for all operations in this shape.");
        }
        if (this.f94102a.f94146s != 0) {
            canvas.drawPath(this.f94108g, this.f94117p.d());
        }
        for (int i11 = 0; i11 < 4; i11++) {
            this.f94103b[i11].b(this.f94117p, this.f94102a.f94145r, canvas);
            this.f94104c[i11].b(this.f94117p, this.f94102a.f94145r, canvas);
        }
        if (this.f94124w) {
            int J = J();
            int K = K();
            canvas.translate(-J, -K);
            canvas.drawPath(this.f94108g, D);
            canvas.translate(J, K);
        }
    }

    public void p0(@Nullable ColorStateList colorStateList) {
        d dVar = this.f94102a;
        if (dVar.f94131d != colorStateList) {
            dVar.f94131d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void q(@NonNull Canvas canvas) {
        s(canvas, this.f94115n, this.f94108g, this.f94102a.f94128a, w());
    }

    public void q0(float f11) {
        d dVar = this.f94102a;
        if (dVar.f94138k != f11) {
            dVar.f94138k = f11;
            this.f94106e = true;
            invalidateSelf();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void r(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull RectF rectF) {
        s(canvas, paint, path, this.f94102a.f94128a, rectF);
    }

    public void r0(int i11, int i12, int i13, int i14) {
        d dVar = this.f94102a;
        if (dVar.f94136i == null) {
            dVar.f94136i = new Rect();
        }
        this.f94102a.f94136i.set(i11, i12, i13, i14);
        invalidateSelf();
    }

    public final void s(@NonNull Canvas canvas, @NonNull Paint paint, @NonNull Path path, @NonNull p pVar, @NonNull RectF rectF) {
        if (!pVar.u(rectF)) {
            canvas.drawPath(path, paint);
        } else {
            float a11 = pVar.t().a(rectF) * this.f94102a.f94138k;
            canvas.drawRoundRect(rectF, a11, a11, paint);
        }
    }

    public void s0(Paint.Style style) {
        this.f94102a.f94149v = style;
        b0();
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i11) {
        d dVar = this.f94102a;
        if (dVar.f94140m != i11) {
            dVar.f94140m = i11;
            b0();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f94102a.f94130c = colorFilter;
        b0();
    }

    @Override // vn.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        this.f94102a.f94128a = pVar;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTint(@ColorInt int i11) {
        setTintList(ColorStateList.valueOf(i11));
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintList(@Nullable ColorStateList colorStateList) {
        this.f94102a.f94134g = colorStateList;
        O0();
        b0();
    }

    @Override // android.graphics.drawable.Drawable, androidx.core.graphics.drawable.TintAwareDrawable
    public void setTintMode(@Nullable PorterDuff.Mode mode) {
        d dVar = this.f94102a;
        if (dVar.f94135h != mode) {
            dVar.f94135h = mode;
            O0();
            b0();
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void t(@NonNull Canvas canvas) {
        s(canvas, this.f94116o, this.f94109h, this.f94114m, x());
    }

    public void t0(float f11) {
        d dVar = this.f94102a;
        if (dVar.f94141n != f11) {
            dVar.f94141n = f11;
            P0();
        }
    }

    public float u() {
        return this.f94102a.f94128a.j().a(w());
    }

    public void u0(float f11) {
        d dVar = this.f94102a;
        if (dVar.f94137j != f11) {
            dVar.f94137j = f11;
            invalidateSelf();
        }
    }

    public float v() {
        return this.f94102a.f94128a.l().a(w());
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public void v0(boolean z11) {
        this.f94124w = z11;
    }

    @NonNull
    public RectF w() {
        this.f94110i.set(getBounds());
        return this.f94110i;
    }

    public void w0(int i11) {
        this.f94117p.e(i11);
        this.f94102a.f94148u = false;
        b0();
    }

    @NonNull
    public final RectF x() {
        this.f94111j.set(w());
        float P = P();
        this.f94111j.inset(P, P);
        return this.f94111j;
    }

    public void x0(int i11) {
        d dVar = this.f94102a;
        if (dVar.f94147t != i11) {
            dVar.f94147t = i11;
            b0();
        }
    }

    public float y() {
        return this.f94102a.f94142o;
    }

    public void y0(int i11) {
        d dVar = this.f94102a;
        if (dVar.f94144q != i11) {
            dVar.f94144q = i11;
            b0();
        }
    }

    @Nullable
    public ColorStateList z() {
        return this.f94102a.f94131d;
    }

    @Deprecated
    public void z0(int i11) {
        o0(i11);
    }

    public k(@NonNull Context context, @Nullable AttributeSet attributeSet, @AttrRes int i11, @StyleRes int i12) {
        this(p.e(context, attributeSet, i11, i12).m());
    }

    @Deprecated
    public k(@NonNull s sVar) {
        this((p) sVar);
    }

    public k(@NonNull p pVar) {
        this(new d(pVar, null));
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public k(@NonNull d dVar) {
        q qVar;
        this.f94103b = new r.j[4];
        this.f94104c = new r.j[4];
        this.f94105d = new BitSet(8);
        this.f94107f = new Matrix();
        this.f94108g = new Path();
        this.f94109h = new Path();
        this.f94110i = new RectF();
        this.f94111j = new RectF();
        this.f94112k = new Region();
        this.f94113l = new Region();
        Paint paint = new Paint(1);
        this.f94115n = paint;
        Paint paint2 = new Paint(1);
        this.f94116o = paint2;
        this.f94117p = new un.b();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            qVar = q.k();
        } else {
            qVar = new q();
        }
        this.f94119r = qVar;
        this.f94123v = new RectF();
        this.f94124w = true;
        this.f94102a = dVar;
        paint2.setStyle(Paint.Style.STROKE);
        paint.setStyle(Paint.Style.FILL);
        O0();
        N0(getState());
        this.f94118q = new a();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
    public static class d extends Drawable.ConstantState {

        /* renamed from: a, reason: collision with root package name */
        @NonNull
        public p f94128a;

        /* renamed from: b, reason: collision with root package name */
        @Nullable
        public ln.a f94129b;

        /* renamed from: c, reason: collision with root package name */
        @Nullable
        public ColorFilter f94130c;

        /* renamed from: d, reason: collision with root package name */
        @Nullable
        public ColorStateList f94131d;

        /* renamed from: e, reason: collision with root package name */
        @Nullable
        public ColorStateList f94132e;

        /* renamed from: f, reason: collision with root package name */
        @Nullable
        public ColorStateList f94133f;

        /* renamed from: g, reason: collision with root package name */
        @Nullable
        public ColorStateList f94134g;

        /* renamed from: h, reason: collision with root package name */
        @Nullable
        public PorterDuff.Mode f94135h;

        /* renamed from: i, reason: collision with root package name */
        @Nullable
        public Rect f94136i;

        /* renamed from: j, reason: collision with root package name */
        public float f94137j;

        /* renamed from: k, reason: collision with root package name */
        public float f94138k;

        /* renamed from: l, reason: collision with root package name */
        public float f94139l;

        /* renamed from: m, reason: collision with root package name */
        public int f94140m;

        /* renamed from: n, reason: collision with root package name */
        public float f94141n;

        /* renamed from: o, reason: collision with root package name */
        public float f94142o;

        /* renamed from: p, reason: collision with root package name */
        public float f94143p;

        /* renamed from: q, reason: collision with root package name */
        public int f94144q;

        /* renamed from: r, reason: collision with root package name */
        public int f94145r;

        /* renamed from: s, reason: collision with root package name */
        public int f94146s;

        /* renamed from: t, reason: collision with root package name */
        public int f94147t;

        /* renamed from: u, reason: collision with root package name */
        public boolean f94148u;

        /* renamed from: v, reason: collision with root package name */
        public Paint.Style f94149v;

        public d(@NonNull p pVar, @Nullable ln.a aVar) {
            this.f94131d = null;
            this.f94132e = null;
            this.f94133f = null;
            this.f94134g = null;
            this.f94135h = PorterDuff.Mode.SRC_IN;
            this.f94136i = null;
            this.f94137j = 1.0f;
            this.f94138k = 1.0f;
            this.f94140m = 255;
            this.f94141n = 0.0f;
            this.f94142o = 0.0f;
            this.f94143p = 0.0f;
            this.f94144q = 0;
            this.f94145r = 0;
            this.f94146s = 0;
            this.f94147t = 0;
            this.f94148u = false;
            this.f94149v = Paint.Style.FILL_AND_STROKE;
            this.f94128a = pVar;
            this.f94129b = aVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            k kVar = new k(this);
            kVar.f94106e = true;
            return kVar;
        }

        public d(@NonNull d dVar) {
            this.f94131d = null;
            this.f94132e = null;
            this.f94133f = null;
            this.f94134g = null;
            this.f94135h = PorterDuff.Mode.SRC_IN;
            this.f94136i = null;
            this.f94137j = 1.0f;
            this.f94138k = 1.0f;
            this.f94140m = 255;
            this.f94141n = 0.0f;
            this.f94142o = 0.0f;
            this.f94143p = 0.0f;
            this.f94144q = 0;
            this.f94145r = 0;
            this.f94146s = 0;
            this.f94147t = 0;
            this.f94148u = false;
            this.f94149v = Paint.Style.FILL_AND_STROKE;
            this.f94128a = dVar.f94128a;
            this.f94129b = dVar.f94129b;
            this.f94139l = dVar.f94139l;
            this.f94130c = dVar.f94130c;
            this.f94131d = dVar.f94131d;
            this.f94132e = dVar.f94132e;
            this.f94135h = dVar.f94135h;
            this.f94134g = dVar.f94134g;
            this.f94140m = dVar.f94140m;
            this.f94137j = dVar.f94137j;
            this.f94146s = dVar.f94146s;
            this.f94144q = dVar.f94144q;
            this.f94148u = dVar.f94148u;
            this.f94138k = dVar.f94138k;
            this.f94141n = dVar.f94141n;
            this.f94142o = dVar.f94142o;
            this.f94143p = dVar.f94143p;
            this.f94145r = dVar.f94145r;
            this.f94147t = dVar.f94147t;
            this.f94133f = dVar.f94133f;
            this.f94149v = dVar.f94149v;
            if (dVar.f94136i != null) {
                this.f94136i = new Rect(dVar.f94136i);
            }
        }
    }
}
