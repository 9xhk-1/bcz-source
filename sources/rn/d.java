package rn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.CircularProgressIndicatorSpec;
import com.tencent.liteav.TXLiteAVCode;
import rn.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class d extends h<ObjectAnimator> {

    /* renamed from: k, reason: collision with root package name */
    public static final int f84333k = 4;

    /* renamed from: l, reason: collision with root package name */
    public static final int f84334l = 5400;

    /* renamed from: m, reason: collision with root package name */
    public static final int f84335m = 667;

    /* renamed from: n, reason: collision with root package name */
    public static final int f84336n = 667;

    /* renamed from: o, reason: collision with root package name */
    public static final int f84337o = 333;

    /* renamed from: p, reason: collision with root package name */
    public static final int f84338p = 333;

    /* renamed from: t, reason: collision with root package name */
    public static final int f84342t = -20;

    /* renamed from: u, reason: collision with root package name */
    public static final int f84343u = 250;

    /* renamed from: v, reason: collision with root package name */
    public static final int f84344v = 1520;

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f84347c;

    /* renamed from: d, reason: collision with root package name */
    public ObjectAnimator f84348d;

    /* renamed from: e, reason: collision with root package name */
    public final FastOutSlowInInterpolator f84349e;

    /* renamed from: f, reason: collision with root package name */
    public final rn.b f84350f;

    /* renamed from: g, reason: collision with root package name */
    public int f84351g;

    /* renamed from: h, reason: collision with root package name */
    public float f84352h;

    /* renamed from: i, reason: collision with root package name */
    public float f84353i;

    /* renamed from: j, reason: collision with root package name */
    public Animatable2Compat.AnimationCallback f84354j;

    /* renamed from: q, reason: collision with root package name */
    public static final int[] f84339q = {0, 1350, 2700, 4050};

    /* renamed from: r, reason: collision with root package name */
    public static final int[] f84340r = {667, TXLiteAVCode.EVT_VOD_PLAY_FIRST_VIDEO_PACKET, 3367, 4717};

    /* renamed from: s, reason: collision with root package name */
    public static final int[] f84341s = {1000, 2350, 3700, 5050};

    /* renamed from: w, reason: collision with root package name */
    public static final Property<d, Float> f84345w = new c(Float.class, "animationFraction");

    /* renamed from: x, reason: collision with root package name */
    public static final Property<d, Float> f84346x = new C1052d(Float.class, "completeEndFraction");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            d dVar = d.this;
            dVar.f84351g = (dVar.f84351g + 4) % d.this.f84350f.f84322c.length;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            d.this.a();
            d dVar = d.this;
            Animatable2Compat.AnimationCallback animationCallback = dVar.f84354j;
            if (animationCallback != null) {
                animationCallback.onAnimationEnd(dVar.f84390a);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends Property<d, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.q());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f11) {
            dVar.h(f11.floatValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rn.d$d, reason: collision with other inner class name */
    public class C1052d extends Property<d, Float> {
        public C1052d(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(d dVar) {
            return Float.valueOf(dVar.r());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Float f11) {
            dVar.u(f11.floatValue());
        }
    }

    public d(@NonNull CircularProgressIndicatorSpec circularProgressIndicatorSpec) {
        super(1);
        this.f84351g = 0;
        this.f84354j = null;
        this.f84350f = circularProgressIndicatorSpec;
        this.f84349e = new FastOutSlowInInterpolator();
    }

    @Override // rn.h
    public void a() {
        ObjectAnimator objectAnimator = this.f84347c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // rn.h
    public void c() {
        g();
    }

    @Override // rn.h
    public void d(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f84354j = animationCallback;
    }

    @Override // rn.h
    public void f() {
        ObjectAnimator objectAnimator = this.f84348d;
        if (objectAnimator == null || objectAnimator.isRunning()) {
            return;
        }
        if (this.f84390a.isVisible()) {
            this.f84348d.start();
        } else {
            a();
        }
    }

    @Override // rn.h
    @VisibleForTesting
    public void g() {
        this.f84351g = 0;
        this.f84391b.get(0).f84388c = this.f84350f.f84322c[0];
        this.f84353i = 0.0f;
    }

    @Override // rn.h
    @VisibleForTesting
    public void h(float f11) {
        this.f84352h = f11;
        int i11 = (int) (f11 * 5400.0f);
        v(i11);
        t(i11);
        this.f84390a.invalidateSelf();
    }

    @Override // rn.h
    public void i() {
        s();
        g();
        this.f84347c.start();
    }

    @Override // rn.h
    public void j() {
        this.f84354j = null;
    }

    public final float q() {
        return this.f84352h;
    }

    public final float r() {
        return this.f84353i;
    }

    public final void s() {
        if (this.f84347c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f84345w, 0.0f, 1.0f);
            this.f84347c = ofFloat;
            ofFloat.setDuration(5400L);
            this.f84347c.setInterpolator(null);
            this.f84347c.setRepeatCount(-1);
            this.f84347c.addListener(new a());
        }
        if (this.f84348d == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f84346x, 0.0f, 1.0f);
            this.f84348d = ofFloat2;
            ofFloat2.setDuration(333L);
            this.f84348d.setInterpolator(this.f84349e);
            this.f84348d.addListener(new b());
        }
    }

    public final void t(int i11) {
        for (int i12 = 0; i12 < 4; i12++) {
            float b11 = b(i11, f84341s[i12], 333);
            if (b11 >= 0.0f && b11 <= 1.0f) {
                int i13 = i12 + this.f84351g;
                int[] iArr = this.f84350f.f84322c;
                int length = i13 % iArr.length;
                int length2 = (length + 1) % iArr.length;
                int i14 = iArr[length];
                int i15 = iArr[length2];
                this.f84391b.get(0).f84388c = vm.d.b().evaluate(this.f84349e.getInterpolation(b11), Integer.valueOf(i14), Integer.valueOf(i15)).intValue();
                return;
            }
        }
    }

    public final void u(float f11) {
        this.f84353i = f11;
    }

    public final void v(int i11) {
        g.a aVar = this.f84391b.get(0);
        float f11 = this.f84352h;
        aVar.f84386a = (f11 * 1520.0f) - 20.0f;
        aVar.f84387b = f11 * 1520.0f;
        for (int i12 = 0; i12 < 4; i12++) {
            aVar.f84387b += this.f84349e.getInterpolation(b(i11, f84339q[i12], 667)) * 250.0f;
            aVar.f84386a += this.f84349e.getInterpolation(b(i11, f84340r[i12], 667)) * 250.0f;
        }
        float f12 = aVar.f84386a;
        float f13 = aVar.f84387b;
        aVar.f84386a = (f12 + ((f13 - f12) * this.f84353i)) / 360.0f;
        aVar.f84387b = f13 / 360.0f;
    }
}
