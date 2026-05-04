package com.huawei.hms.framework.network.grs.h;

import android.os.SystemClock;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f35732a = new ConcurrentHashMap(16);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final long f35733a;

        /* renamed from: b, reason: collision with root package name */
        private final long f35734b;

        public a(long j11, long j12) {
            this.f35733a = j11;
            this.f35734b = j12;
        }

        public boolean a() {
            return SystemClock.elapsedRealtime() - this.f35734b <= this.f35733a;
        }
    }

    public static a a(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("map size of get is before: ");
        Map<String, a> map = f35732a;
        sb2.append(map.size());
        Logger.v("RequestUtil", sb2.toString());
        a aVar = map.get(str);
        Logger.v("RequestUtil", "map size of get is after: " + map.size());
        return aVar;
    }

    public static void a(String str, a aVar) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("map size of put is before: ");
        Map<String, a> map = f35732a;
        sb2.append(map.size());
        Logger.v("RequestUtil", sb2.toString());
        map.put(str, aVar);
        Logger.v("RequestUtil", "map size of put is after: " + map.size());
    }
}
