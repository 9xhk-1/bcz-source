package hi;

import android.content.Context;
import com.baicizhan.online.user_study_api.RoleInfo;
import ee.m;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRoleHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoleHelper.kt\ncom/baicizhan/main/utils/api/RoleHelperKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: classes4.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public static final int f59351a = 196608;

    /* renamed from: b, reason: collision with root package name */
    public static final int f59352b = 65280;

    /* renamed from: c, reason: collision with root package name */
    public static final int f59353c = 255;

    /* renamed from: d, reason: collision with root package name */
    public static final int f59354d = 131072;

    /* renamed from: e, reason: collision with root package name */
    public static final int f59355e = 65536;

    @l
    public static final Pair<Integer, Integer> a(@k Context context) {
        g0.p(context, "context");
        int d11 = i9.f.d(context, i9.f.f60381k0);
        if ((196608 & d11) == 65536) {
            return e(d11);
        }
        return null;
    }

    public static final void b(@k Context context, @l RoleInfo roleInfo) {
        g0.p(context, "context");
        int d11 = i9.f.d(context, i9.f.f60381k0);
        String num = Integer.toString(d11, kotlin.text.a.a(16));
        g0.o(num, "toString(...)");
        qb.c.b("RoleHelper", "current flags: " + num + ", role: " + roleInfo, new Object[0]);
        Integer d12 = d(d11, roleInfo != null ? roleInfo.role_up : 0, roleInfo != null ? roleInfo.grade : 0);
        if (d12 != null) {
            i9.f.k(context, i9.f.f60381k0, d12.intValue());
        }
    }

    public static final boolean c() {
        return !m.a();
    }

    @l
    public static final Integer d(int i11, int i12, int i13) {
        boolean z11 = (i11 & 196608) == 0;
        Boolean valueOf = Boolean.valueOf(z11);
        if (!z11) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int i14 = i12 != 0 ? 1 : 0;
        int i15 = i12 << 8;
        if (i13 != 0) {
            i14++;
        }
        g2 g2Var = g2.f100423a;
        return Integer.valueOf(i15 | i13 | (i14 == 2 ? 131072 : 65536));
    }

    @k
    public static final Pair<Integer, Integer> e(int i11) {
        return new Pair<>(Integer.valueOf((65280 & i11) >> 8), Integer.valueOf(i11 & 255));
    }

    public static final void f() {
        i9.f.j(pb.a.a(), i9.f.f60383l0, true);
    }

    public static final void g(@k Context context) {
        g0.p(context, "context");
        i9.f.k(context, i9.f.f60381k0, (i9.f.d(context, i9.f.f60381k0) & (-196609)) | 131072);
    }
}
