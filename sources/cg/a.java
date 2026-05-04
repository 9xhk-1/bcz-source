package cg;

import android.view.View;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class a implements ViewPager2.PageTransformer {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final C0149a f8611c = new C0149a(null);

    /* renamed from: d, reason: collision with root package name */
    public static final int f8612d = 8;

    /* renamed from: e, reason: collision with root package name */
    public static final float f8613e = 0.9f;

    /* renamed from: f, reason: collision with root package name */
    public static final float f8614f = 0.5f;

    /* renamed from: a, reason: collision with root package name */
    public float f8615a = 0.9f;

    /* renamed from: b, reason: collision with root package name */
    public float f8616b = 0.5f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: cg.a$a, reason: collision with other inner class name */
    public static final class C0149a {
        public /* synthetic */ C0149a(v vVar) {
            this();
        }

        public C0149a() {
        }
    }

    public final float a() {
        return this.f8615a;
    }

    public final float b() {
        return this.f8616b;
    }

    public final void c(float f11) {
        this.f8615a = f11;
    }

    public final void d(float f11) {
        this.f8616b = f11;
    }

    @Override // androidx.viewpager2.widget.ViewPager2.PageTransformer
    public void transformPage(@k View view, float f11) {
        g0.p(view, "view");
        view.setElevation(-Math.abs(f11));
        int width = view.getWidth();
        view.setPivotY(view.getHeight() / 2);
        view.setPivotX(width / 2);
        if (f11 < -1.0f) {
            view.setScaleX(this.f8615a);
            view.setScaleY(this.f8615a);
            view.setPivotX(width);
            return;
        }
        if (f11 < 0.0f) {
            float f12 = 1;
            float f13 = this.f8615a;
            float f14 = ((f12 + f11) * (f12 - f13)) + f13;
            view.setScaleX(f14);
            view.setScaleY(f14);
            float f15 = this.f8616b;
            view.setPivotX(width * (f15 + ((-f11) * f15)));
            return;
        }
        if (f11 > 1.0f) {
            view.setPivotX(0.0f);
            view.setScaleX(this.f8615a);
            view.setScaleY(this.f8615a);
            return;
        }
        float f16 = 1;
        float f17 = f16 - f11;
        float f18 = this.f8615a;
        float f19 = ((f16 - f18) * f17) + f18;
        view.setScaleX(f19);
        view.setScaleY(f19);
        view.setPivotX(width * f17 * this.f8616b);
    }
}
