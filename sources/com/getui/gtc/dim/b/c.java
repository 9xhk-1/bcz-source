package com.getui.gtc.dim.b;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes6.dex */
public final class c {

    /* renamed from: b, reason: collision with root package name */
    private static final List<String> f29881b = Arrays.asList("dim-2-1-21-5", "dim-2-1-21-3", "dim-2-1-21-2", "dim-2-1-21-1");

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, h> f29882a;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final c f29883a = new c(0);
    }

    private c() {
        this.f29882a = new ConcurrentHashMap();
    }

    public static c a() {
        return a.f29883a;
    }

    public /* synthetic */ c(byte b11) {
        this();
    }

    public final h a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        h hVar = this.f29882a.get(str);
        if (hVar != null) {
            Object obj = hVar.f29919a;
            if (obj instanceof List) {
                List list = (List) obj;
                return new h(list.isEmpty() ? Collections.EMPTY_LIST : new ArrayList(list), hVar.f29920b);
            }
        }
        return hVar;
    }

    public final void a(String str, Object obj, long j11) {
        if (f.h(str)) {
            com.getui.gtc.dim.e.b.a(str + " skip dim ram cache = " + obj);
            return;
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (j11 <= 0) {
            j11 = System.currentTimeMillis();
        }
        h hVar = new h(obj, j11);
        com.getui.gtc.dim.e.b.a(str + " update dim ram cache = " + obj);
        this.f29882a.put(str, hVar);
    }
}
