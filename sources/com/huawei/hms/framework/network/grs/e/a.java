package com.huawei.hms.framework.network.grs.e;

import android.content.Context;
import android.text.TextUtils;
import com.huawei.hms.framework.common.Logger;
import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.huawei.hms.framework.network.grs.g.d;
import com.huawei.hms.framework.network.grs.g.g;
import com.huawei.hms.framework.network.grs.h.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class a {

    /* renamed from: e, reason: collision with root package name */
    private static final String f35642e = "a";

    /* renamed from: f, reason: collision with root package name */
    private static final Map<String, Map<String, Map<String, String>>> f35643f = new ConcurrentHashMap(16);

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Long> f35644a = new ConcurrentHashMap(16);

    /* renamed from: b, reason: collision with root package name */
    private final c f35645b;

    /* renamed from: c, reason: collision with root package name */
    private final c f35646c;

    /* renamed from: d, reason: collision with root package name */
    private final g f35647d;

    public a(c cVar, c cVar2, g gVar) {
        this.f35646c = cVar2;
        this.f35645b = cVar;
        this.f35647d = gVar;
        gVar.a(this);
    }

    public c a() {
        return this.f35645b;
    }

    public g b() {
        return this.f35647d;
    }

    public c c() {
        return this.f35646c;
    }

    public Map<String, String> a(GrsBaseInfo grsBaseInfo, String str, b bVar, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        Map<String, Map<String, Map<String, String>>> map = f35643f;
        Map<String, Map<String, String>> map2 = map.get(grsParasKey);
        if (map2 != null && !map2.isEmpty()) {
            a(grsBaseInfo, bVar, context, str);
            return map2.get(str);
        }
        Logger.i(f35642e, "Cache size is: " + map.size());
        return new HashMap();
    }

    public void b(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        String a11 = this.f35645b.a(grsParasKey, "");
        String a12 = this.f35645b.a(grsParasKey + "time", "0");
        long j11 = 0;
        if (!TextUtils.isEmpty(a12) && a12.matches("\\d+")) {
            try {
                j11 = Long.parseLong(a12);
            } catch (NumberFormatException e11) {
                Logger.w(f35642e, "convert urlParamKey from String to Long catch NumberFormatException.", e11);
            }
        }
        Map<String, Map<String, Map<String, String>>> map = f35643f;
        map.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(a11));
        Logger.i(f35642e, "Cache size is: " + map.size());
        this.f35644a.put(grsParasKey, Long.valueOf(j11));
        a(grsBaseInfo, grsParasKey, context);
    }

    public void a(GrsBaseInfo grsBaseInfo, Context context) {
        String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
        this.f35645b.b(grsParasKey + "time", "0");
        this.f35644a.remove(grsParasKey + "time");
        Map<String, Map<String, Map<String, String>>> map = f35643f;
        map.remove(grsParasKey);
        Logger.i(f35642e, "Cache size is: " + map.size());
        this.f35647d.a(grsParasKey);
    }

    private void a(GrsBaseInfo grsBaseInfo, b bVar, Context context, String str) {
        Long l11 = this.f35644a.get(grsBaseInfo.getGrsParasKey(true, true, context));
        if (e.a(l11)) {
            bVar.a(2);
            return;
        }
        if (e.a(l11, 300000L)) {
            this.f35647d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, str, this.f35646c, -1);
        }
        bVar.a(1);
    }

    public void a(GrsBaseInfo grsBaseInfo, d dVar, Context context, com.huawei.hms.framework.network.grs.g.j.c cVar) {
        if (dVar.f() == 2) {
            Logger.w(f35642e, "update cache from server failed");
            return;
        }
        if (cVar.d().size() == 0) {
            String grsParasKey = grsBaseInfo.getGrsParasKey(true, true, context);
            if (dVar.m()) {
                f35643f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(this.f35645b.a(grsParasKey, "")));
            } else {
                this.f35645b.b(grsParasKey, dVar.j());
                f35643f.put(grsParasKey, com.huawei.hms.framework.network.grs.a.a(dVar.j()));
            }
            if (!TextUtils.isEmpty(dVar.e())) {
                this.f35645b.b(grsParasKey + "ETag", dVar.e());
            }
            this.f35645b.b(grsParasKey + "time", dVar.a());
            this.f35644a.put(grsParasKey, Long.valueOf(Long.parseLong(dVar.a())));
        } else {
            this.f35645b.b("geoipCountryCode", dVar.j());
            this.f35645b.b("geoipCountryCodetime", dVar.a());
        }
        Logger.i(f35642e, "Cache size is: " + f35643f.size());
    }

    private void a(GrsBaseInfo grsBaseInfo, String str, Context context) {
        if (e.a(this.f35644a.get(str), 300000L)) {
            this.f35647d.a(new com.huawei.hms.framework.network.grs.g.j.c(grsBaseInfo, context), null, null, this.f35646c, -1);
        }
    }
}
