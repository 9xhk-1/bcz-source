package rn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.util.Property;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.interpolator.view.animation.FastOutSlowInInterpolator;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import com.google.android.material.progressindicator.LinearProgressIndicatorSpec;
import rn.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class k extends h<ObjectAnimator> {

    /* renamed from: i, reason: collision with root package name */
    public static final int f84400i = 667;

    /* renamed from: j, reason: collision with root package name */
    public static final int f84401j = 333;

    /* renamed from: k, reason: collision with root package name */
    public static final Property<k, Float> f84402k = new b(Float.class, "animationFraction");

    /* renamed from: c, reason: collision with root package name */
    public ObjectAnimator f84403c;

    /* renamed from: d, reason: collision with root package name */
    public FastOutSlowInInterpolator f84404d;

    /* renamed from: e, reason: collision with root package name */
    public final rn.b f84405e;

    /* renamed from: f, reason: collision with root package name */
    public int f84406f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84407g;

    /* renamed from: h, reason: collision with root package name */
    public float f84408h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            super.onAnimationRepeat(animator);
            k kVar = k.this;
            kVar.f84406f = (kVar.f84406f + 1) % k.this.f84405e.f84322c.length;
            k.this.f84407g = true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends Property<k, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(k kVar) {
            return Float.valueOf(kVar.p());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(k kVar, Float f11) {
            kVar.h(f11.floatValue());
        }
    }

    public k(@NonNull LinearProgressIndicatorSpec linearProgressIndicatorSpec) {
        super(3);
        this.f84406f = 1;
        this.f84405e = linearProgressIndicatorSpec;
        this.f84404d = new FastOutSlowInInterpolator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float p() {
        return this.f84408h;
    }

    private void q() {
        if (this.f84403c == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f84402k, 0.0f, 1.0f);
            this.f84403c = ofFloat;
            ofFloat.setDuration(333L);
            this.f84403c.setInterpolator(null);
            this.f84403c.setRepeatCount(-1);
            this.f84403c.addListener(new a());
        }
    }

    private void s(int i11) {
        this.f84391b.get(0).f84386a = 0.0f;
        float b11 = b(i11, 0, 667);
        g.a aVar = this.f84391b.get(0);
        g.a aVar2 = this.f84391b.get(1);
        float interpolation = this.f84404d.getInterpolation(b11);
        aVar2.f84386a = interpolation;
        aVar.f84387b = interpolation;
        g.a aVar3 = this.f84391b.get(1);
        g.a aVar4 = this.f84391b.get(2);
        float interpolation2 = this.f84404d.getInterpolation(b11 + 0.49925038f);
        aVar4.f84386a = interpolation2;
        aVar3.f84387b = interpolation2;
        this.f84391b.get(2).f84387b = 1.0f;
    }

    @Override // rn.h
    public void a() {
        ObjectAnimator objectAnimator = this.f84403c;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    @Override // rn.h
    public void c() {
        g();
    }

    @Override // rn.h
    @VisibleForTesting
    public void g() {
        this.f84407g = true;
        this.f84406f = 1;
        for (g.a aVar : this.f84391b) {
            rn.b bVar = this.f84405e;
            aVar.f84388c = bVar.f84322c[0];
            aVar.f84389d = bVar.f84326g / 2;
        }
    }

    @Override // rn.h
    @VisibleForTesting
    public void h(float f11) {
        this.f84408h = f11;
        s((int) (f11 * 333.0f));
        r();
        this.f84390a.invalidateSelf();
    }

    @Override // rn.h
    public void i() {
        q();
        g();
        this.f84403c.start();
    }

    public final void r() {
        if (!this.f84407g || this.f84391b.get(1).f84387b >= 1.0f) {
            return;
        }
        this.f84391b.get(2).f84388c = this.f84391b.get(1).f84388c;
        this.f84391b.get(1).f84388c = this.f84391b.get(0).f84388c;
        this.f84391b.get(0).f84388c = this.f84405e.f84322c[this.f84406f];
        this.f84407g = false;
    }

    @Override // rn.h
    public void f() {
    }

    @Override // rn.h
    public void j() {
    }

    @Override // rn.h
    public void d(@Nullable Animatable2Compat.AnimationCallback animationCallback) {
    }
}
