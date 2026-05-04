package com.mob.commons.a;

import java.util.HashMap;

/* loaded from: classes7.dex */
public class j extends c {

    /* renamed from: c, reason: collision with root package name */
    private static com.mob.commons.h f40133c;

    public j() {
        super("p", 0L, null, 0L);
        a(0);
        c();
    }

    private static synchronized boolean n() {
        synchronized (j.class) {
            if (f40133c != null) {
                return false;
            }
            f40133c = new com.mob.commons.h() { // from class: com.mob.commons.a.j.1
                @Override // com.mob.commons.h
                public void a(boolean z11, boolean z12, long j11) {
                    if (z11) {
                        l.a().a(0L, j.class, new Object[]{-1, Long.valueOf(System.currentTimeMillis())}, 0);
                    }
                }
            };
            com.mob.commons.i.a().a(f40133c);
            return true;
        }
    }

    @Override // com.mob.commons.a.c
    public void a() {
        if (f()) {
            n();
            return;
        }
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put(com.mob.commons.j.a("004b'bgNcg"), "PVMT");
        hashMap.put(com.mob.commons.j.a("008fDbdObgbAbc3jg"), this.f40115a);
        com.mob.commons.d.a().a(System.currentTimeMillis(), hashMap);
    }
}
