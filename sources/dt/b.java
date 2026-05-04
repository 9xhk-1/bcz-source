package dt;

import android.os.Build;
import android.view.View;
import android.view.animation.Interpolator;
import bt.a;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public static final WeakHashMap<View, b> f48110a = new WeakHashMap<>(0);

    public static b c(View view) {
        WeakHashMap<View, b> weakHashMap = f48110a;
        b bVar = weakHashMap.get(view);
        if (bVar == null) {
            int intValue = Integer.valueOf(Build.VERSION.SDK).intValue();
            bVar = intValue >= 14 ? new d(view) : intValue >= 11 ? new c(view) : new e(view);
            weakHashMap.put(view, bVar);
        }
        return bVar;
    }

    public abstract b A(float f11);

    public abstract b B(float f11);

    public abstract b C(float f11);

    public abstract b a(float f11);

    public abstract b b(float f11);

    public abstract void d();

    public abstract long e();

    public abstract long f();

    public abstract b g(float f11);

    public abstract b h(float f11);

    public abstract b i(float f11);

    public abstract b j(float f11);

    public abstract b k(float f11);

    public abstract b l(float f11);

    public abstract b m(float f11);

    public abstract b n(float f11);

    public abstract b o(float f11);

    public abstract b p(float f11);

    public abstract b q(long j11);

    public abstract b r(Interpolator interpolator);

    public abstract b s(a.InterfaceC0121a interfaceC0121a);

    public abstract b t(long j11);

    public abstract void u();

    public abstract b v(float f11);

    public abstract b w(float f11);

    public abstract b x(float f11);

    public abstract b y(float f11);

    public abstract b z(float f11);
}
