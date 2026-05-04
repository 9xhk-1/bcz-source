package dt;

import android.animation.Animator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import bt.a;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class d extends b {

    /* renamed from: c, reason: collision with root package name */
    public static final long f48142c = -1;

    /* renamed from: b, reason: collision with root package name */
    public final WeakReference<ViewPropertyAnimator> f48143b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Animator.AnimatorListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a.InterfaceC0121a f48145b;

        public a(a.InterfaceC0121a interfaceC0121a) {
            this.f48145b = interfaceC0121a;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f48145b.d(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f48145b.e(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            this.f48145b.b(null);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f48145b.c(null);
        }
    }

    public d(View view) {
        this.f48143b = new WeakReference<>(view.animate());
    }

    @Override // dt.b
    public b A(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.xBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public b B(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.y(f11);
        }
        return this;
    }

    @Override // dt.b
    public b C(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.yBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public b a(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alpha(f11);
        }
        return this;
    }

    @Override // dt.b
    public b b(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.alphaBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public void d() {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    @Override // dt.b
    public long e() {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            return viewPropertyAnimator.getDuration();
        }
        return -1L;
    }

    @Override // dt.b
    public long f() {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            return viewPropertyAnimator.getStartDelay();
        }
        return -1L;
    }

    @Override // dt.b
    public b g(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotation(f11);
        }
        return this;
    }

    @Override // dt.b
    public b h(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public b i(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationX(f11);
        }
        return this;
    }

    @Override // dt.b
    public b j(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationXBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public b k(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationY(f11);
        }
        return this;
    }

    @Override // dt.b
    public b l(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.rotationYBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public b m(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleX(f11);
        }
        return this;
    }

    @Override // dt.b
    public b n(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleXBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public b o(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleY(f11);
        }
        return this;
    }

    @Override // dt.b
    public b p(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.scaleYBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public b q(long j11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setDuration(j11);
        }
        return this;
    }

    @Override // dt.b
    public b r(Interpolator interpolator) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setInterpolator(interpolator);
        }
        return this;
    }

    @Override // dt.b
    public b s(a.InterfaceC0121a interfaceC0121a) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            if (interfaceC0121a == null) {
                viewPropertyAnimator.setListener(null);
                return this;
            }
            viewPropertyAnimator.setListener(new a(interfaceC0121a));
        }
        return this;
    }

    @Override // dt.b
    public b t(long j11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.setStartDelay(j11);
        }
        return this;
    }

    @Override // dt.b
    public void u() {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.start();
        }
    }

    @Override // dt.b
    public b v(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationX(f11);
        }
        return this;
    }

    @Override // dt.b
    public b w(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationXBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public b x(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationY(f11);
        }
        return this;
    }

    @Override // dt.b
    public b y(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.translationYBy(f11);
        }
        return this;
    }

    @Override // dt.b
    public b z(float f11) {
        ViewPropertyAnimator viewPropertyAnimator = this.f48143b.get();
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.x(f11);
        }
        return this;
    }
}
