package rn;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.Property;
import androidx.annotation.FloatRange;
import androidx.annotation.IntRange;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public abstract class f extends Drawable implements Animatable2Compat {

    /* renamed from: o, reason: collision with root package name */
    public static final boolean f84366o = false;

    /* renamed from: p, reason: collision with root package name */
    public static final int f84367p = 500;

    /* renamed from: q, reason: collision with root package name */
    public static final Property<f, Float> f84368q = new c(Float.class, "growFraction");

    /* renamed from: a, reason: collision with root package name */
    public final Context f84369a;

    /* renamed from: b, reason: collision with root package name */
    public final rn.b f84370b;

    /* renamed from: d, reason: collision with root package name */
    public ValueAnimator f84372d;

    /* renamed from: e, reason: collision with root package name */
    public ValueAnimator f84373e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f84374f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f84375g;

    /* renamed from: h, reason: collision with root package name */
    public float f84376h;

    /* renamed from: i, reason: collision with root package name */
    public List<Animatable2Compat.AnimationCallback> f84377i;

    /* renamed from: j, reason: collision with root package name */
    public Animatable2Compat.AnimationCallback f84378j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f84379k;

    /* renamed from: l, reason: collision with root package name */
    public float f84380l;

    /* renamed from: n, reason: collision with root package name */
    @IntRange(from = 0, to = 255)
    public int f84382n;

    /* renamed from: m, reason: collision with root package name */
    public final Paint f84381m = new Paint();

    /* renamed from: c, reason: collision with root package name */
    public rn.a f84371c = new rn.a();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            f.this.f();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends AnimatorListenerAdapter {
        public b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            f.super.setVisible(false, false);
            f.this.e();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends Property<f, Float> {
        public c(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(f fVar) {
            return Float.valueOf(fVar.h());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(f fVar, Float f11) {
            fVar.n(f11.floatValue());
        }
    }

    public f(@NonNull Context context, @NonNull rn.b bVar) {
        this.f84369a = context;
        this.f84370b = bVar;
        setAlpha(255);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() {
        Animatable2Compat.AnimationCallback animationCallback = this.f84378j;
        if (animationCallback != null) {
            animationCallback.onAnimationEnd(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.f84377i;
        if (list == null || this.f84379k) {
            return;
        }
        Iterator<Animatable2Compat.AnimationCallback> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationEnd(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        Animatable2Compat.AnimationCallback animationCallback = this.f84378j;
        if (animationCallback != null) {
            animationCallback.onAnimationStart(this);
        }
        List<Animatable2Compat.AnimationCallback> list = this.f84377i;
        if (list == null || this.f84379k) {
            return;
        }
        Iterator<Animatable2Compat.AnimationCallback> it = list.iterator();
        while (it.hasNext()) {
            it.next().onAnimationStart(this);
        }
    }

    public void clearAnimationCallbacks() {
        this.f84377i.clear();
        this.f84377i = null;
    }

    public final void d(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z11 = this.f84379k;
        this.f84379k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.cancel();
        }
        this.f84379k = z11;
    }

    public final void g(@NonNull ValueAnimator... valueAnimatorArr) {
        boolean z11 = this.f84379k;
        this.f84379k = true;
        for (ValueAnimator valueAnimator : valueAnimatorArr) {
            valueAnimator.end();
        }
        this.f84379k = z11;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f84382n;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    public float h() {
        if (this.f84370b.b() || this.f84370b.a()) {
            return (this.f84375g || this.f84374f) ? this.f84376h : this.f84380l;
        }
        return 1.0f;
    }

    @NonNull
    public ValueAnimator i() {
        return this.f84373e;
    }

    public boolean isRunning() {
        return l() || k();
    }

    public boolean j() {
        return t(false, false, false);
    }

    public boolean k() {
        ValueAnimator valueAnimator = this.f84373e;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f84375g;
    }

    public boolean l() {
        ValueAnimator valueAnimator = this.f84372d;
        return (valueAnimator != null && valueAnimator.isRunning()) || this.f84374f;
    }

    public final void m() {
        if (this.f84372d == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f84368q, 0.0f, 1.0f);
            this.f84372d = ofFloat;
            ofFloat.setDuration(500L);
            this.f84372d.setInterpolator(vm.b.f94061b);
            s(this.f84372d);
        }
        if (this.f84373e == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, f84368q, 1.0f, 0.0f);
            this.f84373e = ofFloat2;
            ofFloat2.setDuration(500L);
            this.f84373e.setInterpolator(vm.b.f94061b);
            o(this.f84373e);
        }
    }

    public void n(@FloatRange(from = 0.0d, to = 1.0d) float f11) {
        if (this.f84380l != f11) {
            this.f84380l = f11;
            invalidateSelf();
        }
    }

    public final void o(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f84373e;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set hideAnimator while the current hideAnimator is running.");
        }
        this.f84373e = valueAnimator;
        valueAnimator.addListener(new b());
    }

    public void p(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        this.f84378j = animationCallback;
    }

    @VisibleForTesting
    public void q(boolean z11, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f84375g = z11;
        this.f84376h = f11;
    }

    @VisibleForTesting
    public void r(boolean z11, @FloatRange(from = 0.0d, to = 1.0d) float f11) {
        this.f84374f = z11;
        this.f84376h = f11;
    }

    public void registerAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        if (this.f84377i == null) {
            this.f84377i = new ArrayList();
        }
        if (this.f84377i.contains(animationCallback)) {
            return;
        }
        this.f84377i.add(animationCallback);
    }

    public final void s(@NonNull ValueAnimator valueAnimator) {
        ValueAnimator valueAnimator2 = this.f84372d;
        if (valueAnimator2 != null && valueAnimator2.isRunning()) {
            throw new IllegalArgumentException("Cannot set showAnimator while the current showAnimator is running.");
        }
        this.f84372d = valueAnimator;
        valueAnimator.addListener(new a());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(@IntRange(from = 0, to = 255) int i11) {
        this.f84382n = i11;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f84381m.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z11, boolean z12) {
        return t(z11, z12, true);
    }

    public void start() {
        u(true, true, false);
    }

    public void stop() {
        u(false, true, false);
    }

    public boolean t(boolean z11, boolean z12, boolean z13) {
        return u(z11, z12, z13 && this.f84371c.a(this.f84369a.getContentResolver()) > 0.0f);
    }

    public boolean u(boolean z11, boolean z12, boolean z13) {
        m();
        if (!isVisible() && !z11) {
            return false;
        }
        ValueAnimator valueAnimator = z11 ? this.f84372d : this.f84373e;
        ValueAnimator valueAnimator2 = z11 ? this.f84373e : this.f84372d;
        if (!z13) {
            if (valueAnimator2.isRunning()) {
                d(valueAnimator2);
            }
            if (valueAnimator.isRunning()) {
                valueAnimator.end();
            } else {
                g(valueAnimator);
            }
            return super.setVisible(z11, false);
        }
        if (valueAnimator.isRunning()) {
            return false;
        }
        boolean z14 = !z11 || super.setVisible(z11, false);
        if (!(z11 ? this.f84370b.b() : this.f84370b.a())) {
            g(valueAnimator);
            return z14;
        }
        if (z12 || !valueAnimator.isPaused()) {
            valueAnimator.start();
            return z14;
        }
        valueAnimator.resume();
        return z14;
    }

    public boolean unregisterAnimationCallback(@NonNull Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.f84377i;
        if (list == null || !list.contains(animationCallback)) {
            return false;
        }
        this.f84377i.remove(animationCallback);
        if (!this.f84377i.isEmpty()) {
            return true;
        }
        this.f84377i = null;
        return true;
    }
}
