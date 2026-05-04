package af;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.thrift.p;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public static final g f2637a = new g();

    /* renamed from: b, reason: collision with root package name */
    public static boolean f2638b = true;

    /* renamed from: c, reason: collision with root package name */
    public static final int f2639c = 8;

    public static final Boolean i(AdvertiseApiService.Client client) {
        return Boolean.valueOf(client.get_custom_ads_config() == 1);
    }

    public static final Boolean j(l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public static final g2 k(Boolean bool) {
        g0.m(bool);
        f2638b = bool.booleanValue();
        return g2.f100423a;
    }

    public static final void l(l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final Boolean n(boolean z11, AdvertiseApiService.Client client) {
        client.set_custom_ads_config(z11 ? 1 : 0);
        f2638b = z11;
        return Boolean.valueOf(z11);
    }

    public static final Boolean o(l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    public final boolean g() {
        return f2638b;
    }

    @k
    public final rx.c<Boolean> h() {
        rx.c a11 = p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise"));
        final l lVar = new l() { // from class: af.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean i11;
                i11 = g.i((AdvertiseApiService.Client) obj);
                return i11;
            }
        };
        rx.c c32 = a11.c3(new wb0.p() { // from class: af.b
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean j11;
                j11 = g.j(l.this, obj);
                return j11;
            }
        });
        final l lVar2 = new l() { // from class: af.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 k11;
                k11 = g.k((Boolean) obj);
                return k11;
            }
        };
        rx.c<Boolean> I3 = c32.L1(new wb0.b() { // from class: af.d
            @Override // wb0.b
            public final void call(Object obj) {
                g.l(l.this, obj);
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
        g0.o(I3, "observeOn(...)");
        return I3;
    }

    @k
    public final rx.c<Boolean> m(final boolean z11) {
        rx.c a11 = p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise"));
        final l lVar = new l() { // from class: af.e
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean n11;
                n11 = g.n(z11, (AdvertiseApiService.Client) obj);
                return n11;
            }
        };
        rx.c<Boolean> I3 = a11.c3(new wb0.p() { // from class: af.f
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean o11;
                o11 = g.o(l.this, obj);
                return o11;
            }
        }).w5(bc0.c.e()).I3(tb0.a.a());
        g0.o(I3, "observeOn(...)");
        return I3;
    }

    public final void p(boolean z11) {
        f2638b = z11;
    }
}
