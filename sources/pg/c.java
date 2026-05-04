package pg;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.util.AdCommonHelper;
import com.baicizhan.online.ad_property.AdDeviceInfo;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import com.baicizhan.online.advertise_api.BottomAdvInfos;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final c f80434a = new c();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f80435b = "AdModule";

    /* renamed from: c, reason: collision with root package name */
    public static final int f80436c = 0;

    public static final BottomAdvInfos d(AdvertiseApiService.Client client) {
        AdDeviceInfo buildAdDeviceInfoSync = AdCommonHelper.INSTANCE.buildAdDeviceInfoSync();
        qb.c.b("AdModule", "adDeviceInfo:" + buildAdDeviceInfoSync, new Object[0]);
        return client.get_main_view_bottom_advs_v3(buildAdDeviceInfoSync);
    }

    public static final BottomAdvInfos e(x00.l lVar, Object obj) {
        return (BottomAdvInfos) lVar.invoke(obj);
    }

    @m80.k
    public final rx.c<BottomAdvInfos> c() {
        rx.c w52 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise")).w5(bc0.c.e());
        final x00.l lVar = new x00.l() { // from class: pg.a
            @Override // x00.l
            public final Object invoke(Object obj) {
                BottomAdvInfos d11;
                d11 = c.d((AdvertiseApiService.Client) obj);
                return d11;
            }
        };
        rx.c<BottomAdvInfos> c32 = w52.c3(new wb0.p() { // from class: pg.b
            @Override // wb0.p
            public final Object call(Object obj) {
                BottomAdvInfos e11;
                e11 = c.e(x00.l.this, obj);
                return e11;
            }
        });
        kotlin.jvm.internal.g0.o(c32, "map(...)");
        return c32;
    }
}
