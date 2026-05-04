package com.meizu.cloud.pushsdk.d.e;

import android.content.Context;
import com.meizu.cloud.pushsdk.d.f.e;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes7.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final String f39813a = "b";

    /* renamed from: b, reason: collision with root package name */
    private String f39814b;

    /* renamed from: c, reason: collision with root package name */
    private String f39815c;

    /* renamed from: d, reason: collision with root package name */
    private String f39816d;

    /* renamed from: e, reason: collision with root package name */
    private int f39817e;

    /* renamed from: f, reason: collision with root package name */
    private final String f39818f = "SQLITE";

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f39819g = new AtomicBoolean(false);

    /* renamed from: h, reason: collision with root package name */
    private long f39820h;

    /* renamed from: i, reason: collision with root package name */
    private final long f39821i;

    /* renamed from: j, reason: collision with root package name */
    private final long f39822j;

    /* renamed from: k, reason: collision with root package name */
    private final Context f39823k;

    public b(long j11, long j12, TimeUnit timeUnit, Context context) {
        this.f39815c = null;
        this.f39817e = 0;
        this.f39821i = timeUnit.toMillis(j11);
        this.f39822j = timeUnit.toMillis(j12);
        this.f39823k = context;
        Map f11 = f();
        if (f11 != null) {
            try {
                String obj = f11.get("userId").toString();
                String obj2 = f11.get("sessionId").toString();
                int intValue = ((Integer) f11.get("sessionIndex")).intValue();
                this.f39814b = obj;
                this.f39817e = intValue;
                this.f39815c = obj2;
            } catch (Exception e11) {
                com.meizu.cloud.pushsdk.d.f.c.a(f39813a, "Exception occurred retrieving session info from file: %s", e11.getMessage());
            }
            d();
            g();
            com.meizu.cloud.pushsdk.d.f.c.c(f39813a, "Tracker Session Object created.", new Object[0]);
        }
        this.f39814b = e.b();
        d();
        g();
        com.meizu.cloud.pushsdk.d.f.c.c(f39813a, "Tracker Session Object created.", new Object[0]);
    }

    private void d() {
        this.f39816d = this.f39815c;
        this.f39815c = e.b();
        this.f39817e++;
        String str = f39813a;
        com.meizu.cloud.pushsdk.d.f.c.b(str, "Session information is updated:", new Object[0]);
        com.meizu.cloud.pushsdk.d.f.c.b(str, " + Session ID: %s", this.f39815c);
        com.meizu.cloud.pushsdk.d.f.c.b(str, " + Previous Session ID: %s", this.f39816d);
        com.meizu.cloud.pushsdk.d.f.c.b(str, " + Session Index: %s", Integer.valueOf(this.f39817e));
        e();
    }

    private boolean e() {
        return com.meizu.cloud.pushsdk.d.f.a.a("snowplow_session_vars", c(), this.f39823k);
    }

    private Map f() {
        return com.meizu.cloud.pushsdk.d.f.a.a("snowplow_session_vars", this.f39823k);
    }

    private void g() {
        this.f39820h = System.currentTimeMillis();
    }

    public com.meizu.cloud.pushsdk.d.a.b a() {
        com.meizu.cloud.pushsdk.d.f.c.c(f39813a, "Getting session context...", new Object[0]);
        g();
        return new com.meizu.cloud.pushsdk.d.a.b("client_session", c());
    }

    public void b() {
        com.meizu.cloud.pushsdk.d.f.c.b(f39813a, "Checking and updating session information.", new Object[0]);
        if (e.a(this.f39820h, System.currentTimeMillis(), this.f39819g.get() ? this.f39822j : this.f39821i)) {
            return;
        }
        d();
        g();
    }

    public Map c() {
        HashMap hashMap = new HashMap(8);
        hashMap.put("userId", this.f39814b);
        hashMap.put("sessionId", this.f39815c);
        hashMap.put("previousSessionId", this.f39816d);
        hashMap.put("sessionIndex", Integer.valueOf(this.f39817e));
        hashMap.put("storageMechanism", "SQLITE");
        return hashMap;
    }
}
