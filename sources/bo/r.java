package bo;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class r implements w {

    /* renamed from: a, reason: collision with root package name */
    public float f7127a;

    /* renamed from: b, reason: collision with root package name */
    public float f7128b;

    /* renamed from: c, reason: collision with root package name */
    public float f7129c;

    /* renamed from: d, reason: collision with root package name */
    public float f7130d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7131e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7132f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f7133a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f7134b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f7135c;

        public a(View view, float f11, float f12) {
            this.f7133a = view;
            this.f7134b = f11;
            this.f7135c = f12;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f7133a.setScaleX(this.f7134b);
            this.f7133a.setScaleY(this.f7135c);
        }
    }

    public r() {
        this(true);
    }

    public static Animator c(View view, float f11, float f12) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f11, scaleX * f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f11 * scaleY, f12 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // bo.w
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f7132f) {
            return this.f7131e ? c(view, this.f7127a, this.f7128b) : c(view, this.f7130d, this.f7129c);
        }
        return null;
    }

    @Override // bo.w
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f7131e ? c(view, this.f7129c, this.f7130d) : c(view, this.f7128b, this.f7127a);
    }

    public float d() {
        return this.f7130d;
    }

    public float e() {
        return this.f7129c;
    }

    public float f() {
        return this.f7128b;
    }

    public float g() {
        return this.f7127a;
    }

    public boolean h() {
        return this.f7131e;
    }

    public boolean i() {
        return this.f7132f;
    }

    public void j(boolean z11) {
        this.f7131e = z11;
    }

    public void k(float f11) {
        this.f7130d = f11;
    }

    public void l(float f11) {
        this.f7129c = f11;
    }

    public void m(float f11) {
        this.f7128b = f11;
    }

    public void n(float f11) {
        this.f7127a = f11;
    }

    public void o(boolean z11) {
        this.f7132f = z11;
    }

    public r(boolean z11) {
        this.f7127a = 1.0f;
        this.f7128b = 1.1f;
        this.f7129c = 0.8f;
        this.f7130d = 1.0f;
        this.f7132f = true;
        this.f7131e = z11;
    }
}
