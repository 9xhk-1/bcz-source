package co;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(21)
/* loaded from: classes7.dex */
public final class s implements x {

    /* renamed from: a, reason: collision with root package name */
    public float f9500a;

    /* renamed from: b, reason: collision with root package name */
    public float f9501b;

    /* renamed from: c, reason: collision with root package name */
    public float f9502c;

    /* renamed from: d, reason: collision with root package name */
    public float f9503d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f9504e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f9505f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends AnimatorListenerAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f9506a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f9507b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f9508c;

        public a(View view, float f11, float f12) {
            this.f9506a = view;
            this.f9507b = f11;
            this.f9508c = f12;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f9506a.setScaleX(this.f9507b);
            this.f9506a.setScaleY(this.f9508c);
        }
    }

    public s() {
        this(true);
    }

    public static Animator c(View view, float f11, float f12) {
        float scaleX = view.getScaleX();
        float scaleY = view.getScaleY();
        ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_X, scaleX * f11, scaleX * f12), PropertyValuesHolder.ofFloat((Property<?, Float>) View.SCALE_Y, f11 * scaleY, f12 * scaleY));
        ofPropertyValuesHolder.addListener(new a(view, scaleX, scaleY));
        return ofPropertyValuesHolder;
    }

    @Override // co.x
    @Nullable
    public Animator a(@NonNull ViewGroup viewGroup, @NonNull View view) {
        if (this.f9505f) {
            return this.f9504e ? c(view, this.f9500a, this.f9501b) : c(view, this.f9503d, this.f9502c);
        }
        return null;
    }

    @Override // co.x
    @Nullable
    public Animator b(@NonNull ViewGroup viewGroup, @NonNull View view) {
        return this.f9504e ? c(view, this.f9502c, this.f9503d) : c(view, this.f9501b, this.f9500a);
    }

    public float d() {
        return this.f9503d;
    }

    public float e() {
        return this.f9502c;
    }

    public float f() {
        return this.f9501b;
    }

    public float g() {
        return this.f9500a;
    }

    public boolean h() {
        return this.f9504e;
    }

    public boolean i() {
        return this.f9505f;
    }

    public void j(boolean z11) {
        this.f9504e = z11;
    }

    public void k(float f11) {
        this.f9503d = f11;
    }

    public void l(float f11) {
        this.f9502c = f11;
    }

    public void m(float f11) {
        this.f9501b = f11;
    }

    public void n(float f11) {
        this.f9500a = f11;
    }

    public void o(boolean z11) {
        this.f9505f = z11;
    }

    public s(boolean z11) {
        this.f9500a = 1.0f;
        this.f9501b = 1.1f;
        this.f9502c = 0.8f;
        this.f9503d = 1.0f;
        this.f9505f = true;
        this.f9504e = z11;
    }
}
