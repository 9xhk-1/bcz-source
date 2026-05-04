package wi;

import a00.a0;
import android.os.Build;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleOwner;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import xi.r;
import xi.t;
import xi.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes3.dex */
public final class o extends p50.h {

    /* renamed from: g, reason: collision with root package name */
    public static final int f96395g = 8;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final n f96396d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final LifecycleOwner f96397e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final FragmentActivity f96398f;

    public o(@m80.k n vm2, @m80.k LifecycleOwner lifeOwner, @m80.k FragmentActivity activity) {
        g0.p(vm2, "vm");
        g0.p(lifeOwner, "lifeOwner");
        g0.p(activity, "activity");
        this.f96396d = vm2;
        this.f96397e = lifeOwner;
        this.f96398f = activity;
        String MODEL = Build.MODEL;
        g0.o(MODEL, "MODEL");
        String upperCase = MODEL.toUpperCase(Locale.ROOT);
        g0.o(upperCase, "toUpperCase(...)");
        if (a0.B8(new String[]{"M2105K81AC", "21051182C", "M2105K81C"}, upperCase)) {
            i(com.baicizhan.main.wikiv2.study.model.c.class, new xi.m(lifeOwner, vm2, activity));
        } else {
            i(com.baicizhan.main.wikiv2.study.model.c.class, new xi.f(lifeOwner, vm2, activity));
        }
        i(com.baicizhan.main.wikiv2.study.model.d.class, new xi.p(lifeOwner, vm2));
        i(com.baicizhan.main.wikiv2.study.model.h.class, new xi.a0(lifeOwner, vm2));
        i(com.baicizhan.main.wikiv2.study.model.g.class, new u(lifeOwner, vm2));
        i(com.baicizhan.main.wikiv2.study.model.a.class, new xi.n(lifeOwner, vm2));
        i(com.baicizhan.main.wikiv2.study.model.f.class, new t(lifeOwner, vm2));
        i(com.baicizhan.main.wikiv2.study.model.b.class, new r(lifeOwner, vm2));
    }
}
