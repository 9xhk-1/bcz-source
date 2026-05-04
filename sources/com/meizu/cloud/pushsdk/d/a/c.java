package com.meizu.cloud.pushsdk.d.a;

import com.meizu.cloud.pushsdk.d.f.e;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class c implements a {

    /* renamed from: a, reason: collision with root package name */
    private final String f39679a = c.class.getSimpleName();

    /* renamed from: b, reason: collision with root package name */
    private final HashMap<String, Object> f39680b = new HashMap<>();

    @Override // com.meizu.cloud.pushsdk.d.a.a
    public Map a() {
        return this.f39680b;
    }

    @Override // com.meizu.cloud.pushsdk.d.a.a
    public long b() {
        return e.a(toString());
    }

    public String toString() {
        return e.a((Map) this.f39680b).toString();
    }

    public void a(String str, Object obj) {
        if (obj != null) {
            this.f39680b.put(str, obj);
            return;
        }
        com.meizu.cloud.pushsdk.d.f.c.c(this.f39679a, "The keys value is empty, returning without adding key: " + str, new Object[0]);
    }

    @Override // com.meizu.cloud.pushsdk.d.a.a
    public void a(String str, String str2) {
        if (str2 != null && !str2.isEmpty()) {
            this.f39680b.put(str, str2);
            return;
        }
        com.meizu.cloud.pushsdk.d.f.c.c(this.f39679a, "The keys value is empty, returning without adding key: " + str, new Object[0]);
    }

    public void a(Map<String, Object> map) {
        if (map == null) {
            com.meizu.cloud.pushsdk.d.f.c.c(this.f39679a, "Map passed in is null, returning without adding map.", new Object[0]);
        } else {
            this.f39680b.putAll(map);
        }
    }
}
