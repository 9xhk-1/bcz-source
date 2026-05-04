package com.huawei.updatesdk.b.e;

import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, a> f36904a = new ConcurrentHashMap();

    public static a a(boolean z11) {
        String str = z11 ? "apptouch" : "default";
        if (TextUtils.isEmpty(str)) {
            return new c();
        }
        Map<String, a> map = f36904a;
        if (map.containsKey(str)) {
            return map.get(str);
        }
        map.put(str, "apptouch".equals(str) ? new b() : new c());
        return map.get(str);
    }
}
