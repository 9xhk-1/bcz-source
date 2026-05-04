package la;

import android.content.Context;
import android.os.Build;
import java.math.BigDecimal;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.d0;
import u30.f0;
import u30.k0;
import xb.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nNetworkMonitor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkMonitor.kt\ncom/baicizhan/client/business/stats/network/NetworkMonitorKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,258:1\n1#2:259\n*E\n"})
/* loaded from: classes4.dex */
public final class g {
    public static final String c(long j11, long j12) {
        String valueOf;
        Long valueOf2 = Long.valueOf(j12 - j11);
        if (valueOf2.longValue() < 0) {
            valueOf2 = null;
        }
        return (valueOf2 == null || (valueOf = String.valueOf(valueOf2.longValue())) == null) ? "N" : valueOf;
    }

    public static final a d(t50.b bVar) {
        a aVar = new a();
        aVar.x(System.currentTimeMillis());
        aVar.G(bVar.request().q().x());
        aVar.F(bVar.request().m());
        aVar.C(bVar.request().q().F());
        return aVar;
    }

    public static final c e(a aVar, Context context) {
        String str;
        String str2;
        BigDecimal P0;
        c cVar = new c();
        cVar.D(c(aVar.f(), aVar.e()));
        cVar.B(c(aVar.d(), aVar.c()));
        cVar.R(c(aVar.t(), aVar.s()));
        cVar.X(c(aVar.o(), aVar.m()));
        cVar.W(c(aVar.m(), aVar.r()));
        cVar.O(c(aVar.r(), aVar.p()));
        cVar.V(c(aVar.b(), aVar.a()));
        cVar.S(String.valueOf(aVar.u()));
        cVar.F(aVar.h());
        Long valueOf = Long.valueOf(aVar.n());
        if (!(valueOf.longValue() >= 0)) {
            valueOf = null;
        }
        String str3 = "N";
        if (valueOf == null || (str = String.valueOf(valueOf.longValue())) == null) {
            str = "N";
        }
        cVar.P(str);
        Long valueOf2 = Long.valueOf(aVar.q());
        if (!(valueOf2.longValue() >= 0)) {
            valueOf2 = null;
        }
        if (valueOf2 == null || (str2 = String.valueOf(valueOf2.longValue())) == null) {
            str2 = "N";
        }
        cVar.Q(str2);
        cVar.E(aVar.g());
        cVar.N(aVar.l());
        cVar.U(aVar.v());
        String k11 = aVar.k();
        List o52 = k0.o5(k11, new String[]{"/"}, false, 0, 6, null);
        List list = o52.isEmpty() ? null : o52;
        if (list != null && (P0 = d0.P0((String) list.get(list.size() - 1))) != null) {
            String z22 = f0.z2(k11, "/" + P0, "", false, 4, null);
            if (z22 != null) {
                k11 = z22;
            }
        }
        cVar.M(k11);
        cVar.I(aVar.j());
        cVar.G(aVar.i());
        cVar.T(String.valueOf(aVar.b()));
        String c11 = rb.d.c(context);
        g0.o(c11, "getDnsServerIps(...)");
        cVar.C(c11);
        String e11 = rb.d.e(context);
        g0.o(e11, "getMNC(...)");
        cVar.z(e11);
        int b11 = rb.d.b(context);
        if (b11 == 0) {
            str3 = "WIFI";
        } else if (b11 == 1) {
            str3 = "4G";
        } else if (b11 == 2) {
            str3 = "3G";
        } else if (b11 == 3) {
            str3 = "2G";
        } else if (b11 == 4) {
            str3 = "5G";
        }
        cVar.K(str3);
        cVar.A(String.valueOf(o.g(context)));
        String INCREMENTAL = Build.VERSION.INCREMENTAL;
        g0.o(INCREMENTAL, "INCREMENTAL");
        cVar.L(INCREMENTAL);
        String MODEL = Build.MODEL;
        g0.o(MODEL, "MODEL");
        cVar.J(MODEL);
        String MANUFACTURER = Build.MANUFACTURER;
        g0.o(MANUFACTURER, "MANUFACTURER");
        cVar.H(MANUFACTURER);
        return cVar;
    }
}
