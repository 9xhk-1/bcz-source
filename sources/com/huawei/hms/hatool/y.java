package com.huawei.hms.hatool;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public final class y {

    /* renamed from: b, reason: collision with root package name */
    private static y f35934b;

    /* renamed from: a, reason: collision with root package name */
    private volatile Map<String, p0> f35935a = new HashMap();

    private y() {
    }

    private p0 a(String str) {
        if (!this.f35935a.containsKey(str)) {
            this.f35935a.put(str, new p0());
        }
        return this.f35935a.get(str);
    }

    private static synchronized void b() {
        synchronized (y.class) {
            if (f35934b == null) {
                f35934b = new y();
            }
        }
    }

    public p0 a(String str, long j11) {
        p0 a11 = a(str);
        a11.a(j11);
        return a11;
    }

    public static y a() {
        if (f35934b == null) {
            b();
        }
        return f35934b;
    }
}
