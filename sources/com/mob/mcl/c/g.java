package com.mob.mcl.c;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: a, reason: collision with root package name */
    private static g f40507a;

    /* renamed from: b, reason: collision with root package name */
    private List<Map<String, Object>> f40508b;

    private g() {
    }

    public static g a() {
        if (f40507a == null) {
            synchronized (g.class) {
                try {
                    if (f40507a == null) {
                        f40507a = new g();
                    }
                } finally {
                }
            }
        }
        return f40507a;
    }

    public boolean b() {
        List<Map<String, Object>> list = this.f40508b;
        return (list == null || list.isEmpty()) ? false : true;
    }

    public List<Map<String, Object>> c() {
        return this.f40508b;
    }

    public void b(Map<String, Object> map) {
        List<Map<String, Object>> list = this.f40508b;
        if (list == null || !list.contains(map)) {
            return;
        }
        this.f40508b.remove(map);
    }

    public void a(Map<String, Object> map) {
        if (this.f40508b == null) {
            this.f40508b = new ArrayList();
        }
        this.f40508b.add(map);
    }
}
