package r9;

import android.content.Context;
import com.baicizhan.online.advertise_api.AdEvent;
import com.baicizhan.online.advertise_api.AdvertiseApiService;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i {
    public static /* synthetic */ Boolean a(String str, int i11, AdvertiseApiService.Client client) {
        AdEvent adEvent = new AdEvent();
        adEvent.ext_ad_id = str;
        adEvent.event_type = i11;
        try {
            client.report_startup_ad_event(Collections.singletonList(adEvent));
        } catch (Exception e11) {
            qb.c.c("AdReport", "", e11);
        }
        return Boolean.TRUE;
    }

    public static void d(Context context, String id2) {
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        treeMap.put("id", id2);
        treeMap.put("adv_id", String.valueOf(id2));
        hashMap.put("extra_info", new com.google.gson.d().z(treeMap));
        ma.l.b(ma.t.f73010i, ma.a.A0, hashMap);
        g(id2, 2);
    }

    public static void e(Context context, String id2) {
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        treeMap.put("id", id2);
        treeMap.put("adv_id", String.valueOf(id2));
        hashMap.put("extra_info", new com.google.gson.d().z(treeMap));
        ma.l.b(ma.t.f73010i, ma.a.f72881z0, hashMap);
        g(id2, 1);
    }

    public static void f(Context context, String id2) {
        HashMap hashMap = new HashMap();
        TreeMap treeMap = new TreeMap();
        treeMap.put("id", id2);
        treeMap.put("adv_id", String.valueOf(id2));
        hashMap.put("extra_info", new com.google.gson.d().z(treeMap));
        ma.l.b(ma.t.f73010i, ma.a.B0, hashMap);
    }

    public static void g(final String id2, final int eventType) {
        com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/advertise")).c3(new wb0.p() { // from class: r9.f
            @Override // wb0.p
            public final Object call(Object obj) {
                return i.a(id2, eventType, (AdvertiseApiService.Client) obj);
            }
        }).w5(bc0.c.e()).u5(new wb0.b() { // from class: r9.g
            @Override // wb0.b
            public final void call(Object obj) {
                i.b((Boolean) obj);
            }
        }, new wb0.b() { // from class: r9.h
            @Override // wb0.b
            public final void call(Object obj) {
                i.c((Throwable) obj);
            }
        });
    }

    public static /* synthetic */ void b(Boolean bool) {
    }

    public static /* synthetic */ void c(Throwable th2) {
    }
}
