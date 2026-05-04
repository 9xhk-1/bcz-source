package tf;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.online.bcz_system_api.BczAppSwitch;
import com.baicizhan.online.bcz_system_api.BczSystemApiService;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nOneKeySwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OneKeySwitch.kt\ncom/baicizhan/main/auth/onekey/OneKeySwitch\n+ 2 Delegates.kt\nkotlin/properties/Delegates\n*L\n1#1,53:1\n33#2,3:54\n*S KotlinDebug\n*F\n+ 1 OneKeySwitch.kt\ncom/baicizhan/main/auth/onekey/OneKeySwitch\n*L\n-1#1:54,3\n*E\n"})
/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final String f90533c = "OneKeySwitch";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final String f90534d = "key_one_key_switch";

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final d10.f f90535e;

    /* renamed from: f, reason: collision with root package name */
    public static boolean f90536f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f90537g;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ h10.n<Object>[] f90532b = {o0.k(new MutablePropertyReference1Impl(i0.class, "switchOne", "getSwitchOne()Z", 0))};

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final i0 f90531a = new i0();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nDelegates.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delegates.kt\nkotlin/properties/Delegates$observable$1\n+ 2 OneKeySwitch.kt\ncom/baicizhan/main/auth/onekey/OneKeySwitch\n*L\n1#1,73:1\n27#2,2:74\n*E\n"})
    public static final class a extends d10.c<Boolean> {
        public a(Object obj) {
            super(obj);
        }

        @Override // d10.c
        public void afterChange(h10.n<?> property, Boolean bool, Boolean bool2) {
            kotlin.jvm.internal.g0.p(property, "property");
            boolean booleanValue = bool2.booleanValue();
            bool.getClass();
            nc.b.b().j(i0.f90534d, booleanValue);
        }
    }

    static {
        d10.a aVar = d10.a.f47010a;
        f90535e = new a(Boolean.valueOf(nc.b.b().getBoolean(f90534d, false)));
        f90537g = 8;
    }

    public static final BczAppSwitch h(BczSystemApiService.Client client) {
        BczAppSwitch bczAppSwitch = client.get_switches();
        if (bczAppSwitch == null) {
            return null;
        }
        f90531a.m(bczAppSwitch.allow_fast_login);
        return bczAppSwitch;
    }

    public static final BczAppSwitch i(x00.l lVar, Object obj) {
        return (BczAppSwitch) lVar.invoke(obj);
    }

    public static final g2 j(BczAppSwitch bczAppSwitch) {
        f90536f = true;
        qb.c.i(f90533c, "get switch result:" + (bczAppSwitch != null ? bczAppSwitch.toString() : null), new Object[0]);
        return g2.f100423a;
    }

    public static final void k(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void l(Throwable th2) {
        qb.c.d(f90533c, "get switch error:" + th2.getMessage(), new Object[0]);
    }

    public final boolean f() {
        return ((Boolean) f90535e.getValue(this, f90532b[0])).booleanValue();
    }

    public final void g() {
        if (f90536f) {
            return;
        }
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/bcz_system").e(false));
        final x00.l lVar = new x00.l() { // from class: tf.d0
            @Override // x00.l
            public final Object invoke(Object obj) {
                BczAppSwitch h11;
                h11 = i0.h((BczSystemApiService.Client) obj);
                return h11;
            }
        };
        rx.c w52 = a11.c3(new wb0.p() { // from class: tf.e0
            @Override // wb0.p
            public final Object call(Object obj) {
                BczAppSwitch i11;
                i11 = i0.i(x00.l.this, obj);
                return i11;
            }
        }).w5(bc0.c.e());
        final x00.l lVar2 = new x00.l() { // from class: tf.f0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 j11;
                j11 = i0.j((BczAppSwitch) obj);
                return j11;
            }
        };
        w52.u5(new wb0.b() { // from class: tf.g0
            @Override // wb0.b
            public final void call(Object obj) {
                i0.k(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: tf.h0
            @Override // wb0.b
            public final void call(Object obj) {
                i0.l((Throwable) obj);
            }
        });
    }

    public final void m(boolean z11) {
        f90535e.setValue(this, f90532b[0], Boolean.valueOf(z11));
    }
}
