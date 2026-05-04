package pg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.TimeUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class x0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f80514c = "key_auto_show_off";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final x0 f80512a = new x0();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final yz.c0 f80513b = yz.e0.c(new x00.a() { // from class: pg.w0
        @Override // x00.a
        public final Object invoke() {
            nc.a d11;
            d11 = x0.d();
            return d11;
        }
    });

    /* renamed from: d, reason: collision with root package name */
    public static final int f80515d = 8;

    public static final nc.a d() {
        return nc.b.b();
    }

    public final String b(int i11) {
        return "key_auto_show_off_" + TimeUtil.getTodayDateString() + "_" + i11;
    }

    public final nc.a c() {
        return (nc.a) f80513b.getValue();
    }

    public final boolean e(int i11) {
        return c().getBoolean(b(i11), true);
    }

    public final void f(int i11) {
        c().j(b(i11), true);
    }

    public final void g(int i11) {
        c().j(b(i11), false);
    }
}
