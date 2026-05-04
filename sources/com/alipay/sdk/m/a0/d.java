package com.alipay.sdk.m.a0;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final Map<String, a> f10471a = new ConcurrentHashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f10472a;

        /* renamed from: b, reason: collision with root package name */
        public long f10473b;

        /* renamed from: c, reason: collision with root package name */
        public long f10474c;
    }

    public static String a(String str) {
        a aVar;
        String str2;
        Map<String, a> map = f10471a;
        if (map == null || (aVar = map.get(str)) == null) {
            return null;
        }
        if (System.currentTimeMillis() - aVar.f10473b < aVar.f10474c && (str2 = aVar.f10472a) != null) {
            return str2;
        }
        map.remove(str);
        return null;
    }

    public static void a(String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        Map<String, a> map = f10471a;
        a aVar = map.get(str);
        if (aVar == null) {
            aVar = new a();
        }
        aVar.f10472a = str2;
        aVar.f10474c = 86400000L;
        aVar.f10473b = System.currentTimeMillis();
        map.put(str, aVar);
    }
}
