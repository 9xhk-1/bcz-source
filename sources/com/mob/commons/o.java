package com.mob.commons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes7.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static o f40401a;

    /* renamed from: b, reason: collision with root package name */
    private HashMap<String, Object> f40402b;

    private o() {
        HashMap<String, Object> c11 = c();
        this.f40402b = c11;
        if (c11 == null) {
            this.f40402b = new HashMap<>();
        }
        ArrayList<MobProduct> b11 = u.b();
        if (b11 == null || b11.isEmpty()) {
            return;
        }
        Iterator<MobProduct> it = b11.iterator();
        while (it.hasNext()) {
            MobProduct next = it.next();
            if (!this.f40402b.containsKey(next.getProductTag())) {
                this.f40402b.put(next.getProductTag(), 0);
            }
        }
    }

    public static o a() {
        if (f40401a == null) {
            synchronized (o.class) {
                try {
                    if (f40401a == null) {
                        f40401a = new o();
                    }
                } finally {
                }
            }
        }
        return f40401a;
    }

    private HashMap<String, Object> c() {
        try {
            return v.a().d();
        } catch (Throwable unused) {
            return null;
        }
    }

    public synchronized HashMap<String, Object> b() {
        return this.f40402b;
    }

    public synchronized void a(MobProduct mobProduct, int i11) {
        if (mobProduct != null) {
            this.f40402b.put(mobProduct.getProductTag(), Integer.valueOf(i11));
            a(this.f40402b);
        }
    }

    private void a(HashMap<String, Object> hashMap) {
        try {
            v.a().b(hashMap);
        } catch (Throwable unused) {
        }
    }

    public static String a(String str) {
        return r.a(str, 99);
    }
}
