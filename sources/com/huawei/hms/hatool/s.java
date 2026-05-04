package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class s {

    /* renamed from: b, reason: collision with root package name */
    static Map<String, l1> f35898b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private static s f35899c;

    /* renamed from: a, reason: collision with root package name */
    private g1 f35900a = new g1();

    private s() {
    }

    public static s c() {
        if (f35899c == null) {
            d();
        }
        return f35899c;
    }

    private static synchronized void d() {
        synchronized (s.class) {
            if (f35899c == null) {
                f35899c = new s();
            }
        }
    }

    public l1 a(String str) {
        return f35898b.get(str);
    }

    public g1 b() {
        return this.f35900a;
    }

    public Set<String> a() {
        return f35898b.keySet();
    }

    public void a(String str, l1 l1Var) {
        f35898b.put(str, l1Var);
    }
}
