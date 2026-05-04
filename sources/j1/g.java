package j1;

import android.view.Choreographer;
import androidx.annotation.FloatRange;
import androidx.annotation.MainThread;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class g extends c implements Choreographer.FrameCallback {

    /* renamed from: j, reason: collision with root package name */
    @Nullable
    public com.airbnb.lottie.k f63117j;

    /* renamed from: c, reason: collision with root package name */
    public float f63110c = 1.0f;

    /* renamed from: d, reason: collision with root package name */
    public boolean f63111d = false;

    /* renamed from: e, reason: collision with root package name */
    public long f63112e = 0;

    /* renamed from: f, reason: collision with root package name */
    public float f63113f = 0.0f;

    /* renamed from: g, reason: collision with root package name */
    public int f63114g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f63115h = -2.14748365E9f;

    /* renamed from: i, reason: collision with root package name */
    public float f63116i = 2.14748365E9f;

    /* renamed from: k, reason: collision with root package name */
    @VisibleForTesting
    public boolean f63118k = false;

    public void A(float f11, float f12) {
        if (f11 > f12) {
            throw new IllegalArgumentException(String.format("minFrame (%s) must be <= maxFrame (%s)", Float.valueOf(f11), Float.valueOf(f12)));
        }
        com.airbnb.lottie.k kVar = this.f63117j;
        float r11 = kVar == null ? -3.4028235E38f : kVar.r();
        com.airbnb.lottie.k kVar2 = this.f63117j;
        float f13 = kVar2 == null ? Float.MAX_VALUE : kVar2.f();
        float c11 = i.c(f11, r11, f13);
        float c12 = i.c(f12, r11, f13);
        if (c11 == this.f63115h && c12 == this.f63116i) {
            return;
        }
        this.f63115h = c11;
        this.f63116i = c12;
        y((int) i.c(this.f63113f, c11, c12));
    }

    public void B(int i11) {
        A(i11, (int) this.f63116i);
    }

    public void E(float f11) {
        this.f63110c = f11;
    }

    public final void F() {
        if (this.f63117j == null) {
            return;
        }
        float f11 = this.f63113f;
        if (f11 < this.f63115h || f11 > this.f63116i) {
            throw new IllegalStateException(String.format("Frame must be [%f,%f]. It is %f", Float.valueOf(this.f63115h), Float.valueOf(this.f63116i), Float.valueOf(this.f63113f)));
        }
    }

    @Override // j1.c
    public void a() {
        super.a();
        b(o());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    @MainThread
    public void cancel() {
        a();
        t();
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j11) {
        s();
        if (this.f63117j == null || !isRunning()) {
            return;
        }
        com.airbnb.lottie.e.a("LottieValueAnimator#doFrame");
        float j12 = (this.f63112e != 0 ? j11 - r1 : 0L) / j();
        float f11 = this.f63113f;
        if (o()) {
            j12 = -j12;
        }
        float f12 = f11 + j12;
        this.f63113f = f12;
        boolean e11 = i.e(f12, m(), l());
        this.f63113f = i.c(this.f63113f, m(), l());
        this.f63112e = j11;
        e();
        if (!e11) {
            if (getRepeatCount() == -1 || this.f63114g < getRepeatCount()) {
                c();
                this.f63114g++;
                if (getRepeatMode() == 2) {
                    this.f63111d = !this.f63111d;
                    w();
                } else {
                    this.f63113f = o() ? l() : m();
                }
                this.f63112e = j11;
            } else {
                this.f63113f = this.f63110c < 0.0f ? m() : l();
                t();
                b(o());
            }
        }
        F();
        com.airbnb.lottie.e.b("LottieValueAnimator#doFrame");
    }

    public void f() {
        this.f63117j = null;
        this.f63115h = -2.14748365E9f;
        this.f63116i = 2.14748365E9f;
    }

    @MainThread
    public void g() {
        t();
        b(o());
    }

    @Override // android.animation.ValueAnimator
    @FloatRange(from = 0.0d, to = 1.0d)
    public float getAnimatedFraction() {
        float m11;
        float l11;
        float m12;
        if (this.f63117j == null) {
            return 0.0f;
        }
        if (o()) {
            m11 = l() - this.f63113f;
            l11 = l();
            m12 = m();
        } else {
            m11 = this.f63113f - m();
            l11 = l();
            m12 = m();
        }
        return m11 / (l11 - m12);
    }

    @Override // android.animation.ValueAnimator
    public Object getAnimatedValue() {
        return Float.valueOf(h());
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public long getDuration() {
        com.airbnb.lottie.k kVar = this.f63117j;
        if (kVar == null) {
            return 0L;
        }
        return (long) kVar.d();
    }

    @FloatRange(from = 0.0d, to = 1.0d)
    public float h() {
        com.airbnb.lottie.k kVar = this.f63117j;
        if (kVar == null) {
            return 0.0f;
        }
        return (this.f63113f - kVar.r()) / (this.f63117j.f() - this.f63117j.r());
    }

    public float i() {
        return this.f63113f;
    }

    @Override // android.animation.ValueAnimator, android.animation.Animator
    public boolean isRunning() {
        return this.f63118k;
    }

    public final float j() {
        com.airbnb.lottie.k kVar = this.f63117j;
        if (kVar == null) {
            return Float.MAX_VALUE;
        }
        return (1.0E9f / kVar.i()) / Math.abs(this.f63110c);
    }

    public float l() {
        com.airbnb.lottie.k kVar = this.f63117j;
        if (kVar == null) {
            return 0.0f;
        }
        float f11 = this.f63116i;
        return f11 == 2.14748365E9f ? kVar.f() : f11;
    }

    public float m() {
        com.airbnb.lottie.k kVar = this.f63117j;
        if (kVar == null) {
            return 0.0f;
        }
        float f11 = this.f63115h;
        return f11 == -2.14748365E9f ? kVar.r() : f11;
    }

    public float n() {
        return this.f63110c;
    }

    public final boolean o() {
        return n() < 0.0f;
    }

    @MainThread
    public void p() {
        t();
    }

    @MainThread
    public void q() {
        this.f63118k = true;
        d(o());
        y((int) (o() ? l() : m()));
        this.f63112e = 0L;
        this.f63114g = 0;
        s();
    }

    public void s() {
        if (isRunning()) {
            u(false);
            Choreographer.getInstance().postFrameCallback(this);
        }
    }

    @Override // android.animation.ValueAnimator
    public void setRepeatMode(int i11) {
        super.setRepeatMode(i11);
        if (i11 == 2 || !this.f63111d) {
            return;
        }
        this.f63111d = false;
        w();
    }

    @MainThread
    public void t() {
        u(true);
    }

    @MainThread
    public void u(boolean z11) {
        Choreographer.getInstance().removeFrameCallback(this);
        if (z11) {
            this.f63118k = false;
        }
    }

    @MainThread
    public void v() {
        this.f63118k = true;
        s();
        this.f63112e = 0L;
        if (o() && i() == m()) {
            this.f63113f = l();
        } else {
            if (o() || i() != l()) {
                return;
            }
            this.f63113f = m();
        }
    }

    public void w() {
        E(-n());
    }

    public void x(com.airbnb.lottie.k kVar) {
        boolean z11 = this.f63117j == null;
        this.f63117j = kVar;
        if (z11) {
            A(Math.max(this.f63115h, kVar.r()), Math.min(this.f63116i, kVar.f()));
        } else {
            A((int) kVar.r(), (int) kVar.f());
        }
        float f11 = this.f63113f;
        this.f63113f = 0.0f;
        y((int) f11);
        e();
    }

    public void y(float f11) {
        if (this.f63113f == f11) {
            return;
        }
        this.f63113f = i.c(f11, m(), l());
        this.f63112e = 0L;
        e();
    }

    public void z(float f11) {
        A(this.f63115h, f11);
    }
}
