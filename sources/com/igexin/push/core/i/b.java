package com.igexin.push.core.i;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    private static b f38310b;

    /* renamed from: a, reason: collision with root package name */
    private Map<Long, a> f38311a = new HashMap();

    private b() {
    }

    private void b(a aVar) {
        if (aVar != null) {
            a(aVar);
        }
    }

    private void c(a aVar) {
        if (aVar != null) {
            this.f38311a.put(aVar.a(), aVar);
        }
    }

    public final a a(Long l11) {
        return this.f38311a.get(l11);
    }

    public static b a() {
        if (f38310b == null) {
            f38310b = new b();
        }
        return f38310b;
    }

    public final void a(a aVar) {
        if (aVar != null) {
            this.f38311a.remove(aVar.a());
        }
    }
}
