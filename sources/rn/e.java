package rn;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.math.MathUtils;
import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.FloatPropertyCompat;
import androidx.dynamicanimation.animation.SpringAnimation;
import androidx.dynamicanimation.animation.SpringForce;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import rn.b;
import rn.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class e<S extends b> extends f {

    /* renamed from: w, reason: collision with root package name */
    public static final int f84357w = 10000;

    /* renamed from: x, reason: collision with root package name */
    public static final float f84358x = 50.0f;

    /* renamed from: y, reason: collision with root package name */
    public static final float f84359y = 0.01f;

    /* renamed from: z, reason: collision with root package name */
    public static final FloatPropertyCompat<e<?>> f84360z = new a("indicatorLevel");

    /* renamed from: r, reason: collision with root package name */
    public g<S> f84361r;

    /* renamed from: s, reason: collision with root package name */
    public final SpringForce f84362s;

    /* renamed from: t, reason: collision with root package name */
    public final SpringAnimation f84363t;

    /* renamed from: u, reason: collision with root package name */
    public final g.a f84364u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f84365v;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends FloatPropertyCompat<e<?>> {
        public a(String str) {
            super(str);
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public float getValue(e<?> eVar) {
            return eVar.D() * 10000.0f;
        }

        @Override // androidx.dynamicanimation.animation.FloatPropertyCompat
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void setValue(e<?> eVar, float f11) {
            eVar.G(f11 / 10000.0f);
        }
    }

    public e(@NonNull Context context, @NonNull b bVar, @NonNull g<S> gVar) {
        super(context, bVar);
        this.f84365v = false;
        F(gVar);
        this.f84364u = new g.a();
        SpringForce springForce = new SpringForce();
        this.f84362s = springForce;
        springForce.setDampingRatio(1.0f);
        springForce.setStiffness(50.0f);
        SpringAnimation springAnimation = new SpringAnimation(this, f84360z);
        this.f84363t = springAnimation;
        springAnimation.setSpring(springForce);
        n(1.0f);
    }

    @NonNull
    public static e<LinearProgressIndicatorSpec> A(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        return B(context, linearProgressIndicatorSpec, new j(linearProgressIndicatorSpec));
    }

    @NonNull
    public static e<LinearProgressIndicatorSpec> B(@NonNull Context context, @NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec, @NonNull j jVar) {
        return new e<>(context, linearProgressIndicatorSpec, jVar);
    }

    @NonNull
    public static e<CircularProgressIndicatorSpec> y(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        return z(context, circularProgressIndicatorSpec, new c(circularProgressIndicatorSpec));
    }

    @NonNull
    public static e<CircularProgressIndicatorSpec> z(@NonNull Context context, @NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec, @NonNull c cVar) {
        return new e<>(context, circularProgressIndicatorSpec, cVar);
    }

    @NonNull
    public g<S> C() {
        return this.f84361r;
    }

    public final float D() {
        return this.f84364u.f84387b;
    }

    public void E(@NonNull DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.f84363t.removeEndListener(onAnimationEndListener);
    }

    public void F(@NonNull g<S> gVar) {
        this.f84361r = gVar;
    }

    public final void G(float f11) {
        this.f84364u.f84387b = f11;
        invalidateSelf();
    }

    public void H(float f11) {
        setLevel((int) (f11 * 10000.0f));
    }

    @Override // rn.f, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            this.f84361r.g(canvas, getBounds(), h(), l(), k());
            this.f84381m.setStyle(Paint.Style.FILL);
            this.f84381m.setAntiAlias(true);
            g.a aVar = this.f84364u;
            b bVar = this.f84370b;
            aVar.f84388c = bVar.f84322c[0];
            int i11 = bVar.f84326g;
            if (i11 > 0) {
                if (!(this.f84361r instanceof j)) {
                    i11 = (int) ((i11 * MathUtils.clamp(D(), 0.0f, 0.01f)) / 0.01f);
                }
                this.f84361r.d(canvas, this.f84381m, D(), 1.0f, this.f84370b.f84323d, getAlpha(), i11);
            } else {
                this.f84361r.d(canvas, this.f84381m, 0.0f, 1.0f, bVar.f84323d, getAlpha(), 0);
            }
            this.f84361r.c(canvas, this.f84381m, this.f84364u, getAlpha());
            this.f84361r.b(canvas, this.f84381m, this.f84370b.f84322c[0], getAlpha());
            canvas.restore();
        }
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f84361r.e();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f84361r.f();
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    @Override // rn.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    @Override // rn.f
    public /* bridge */ /* synthetic */ boolean j() {
        return super.j();
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        this.f84363t.skipToEnd();
        G(getLevel() / 10000.0f);
    }

    @Override // rn.f
    public /* bridge */ /* synthetic */ boolean k() {
        return super.k();
    }

    @Override // rn.f
    public /* bridge */ /* synthetic */ boolean l() {
        return super.l();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onLevelChange(int i11) {
        if (this.f84365v) {
            this.f84363t.skipToEnd();
            G(i11 / 10000.0f);
            return true;
        }
        this.f84363t.setStartValue(D() * 10000.0f);
        this.f84363t.animateToFinalPosition(i11);
        return true;
    }

    @Override // rn.f, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setAlpha(@IntRange(from = 0, to = 255) int i11) {
        super.setAlpha(i11);
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(@Nullable ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    @Override // rn.f, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setVisible(boolean z11, boolean z12) {
        return super.setVisible(z11, z12);
    }

    @Override // rn.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    @Override // rn.f, android.graphics.drawable.Animatable
    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    @Override // rn.f
    public /* bridge */ /* synthetic */ boolean t(boolean z11, boolean z12, boolean z13) {
        return super.t(z11, z12, z13);
    }

    @Override // rn.f
    public boolean u(boolean z11, boolean z12, boolean z13) {
        boolean u11 = super.u(z11, z12, z13);
        float a11 = this.f84371c.a(this.f84369a.getContentResolver());
        if (a11 == 0.0f) {
            this.f84365v = true;
            return u11;
        }
        this.f84365v = false;
        this.f84362s.setStiffness(50.0f / a11);
        return u11;
    }

    @Override // rn.f, androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    public void x(@NonNull DynamicAnimation.OnAnimationEndListener onAnimationEndListener) {
        this.f84363t.addEndListener(onAnimationEndListener);
    }
}
