package com.mob.commons.a;

import com.mob.commons.v;
import com.mob.tools.MobLog;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes7.dex */
public class a extends c {

    /* renamed from: c, reason: collision with root package name */
    private static volatile long f40097c;

    /* renamed from: d, reason: collision with root package name */
    private static volatile HashMap<Long, Long> f40098d;

    public a() {
        super(com.mob.commons.i.a("002:fhJf"), 0L, com.mob.commons.i.a("0056fhCfYhhfh=g"), 900L);
        c();
        if (f40098d == null) {
            f40097c = System.currentTimeMillis();
            f40098d = v.a().c();
        }
    }

    private void n() {
        try {
            HashMap<String, Object> hashMap = new HashMap<>();
            for (Map.Entry<Long, Long> entry : f40098d.entrySet()) {
                if (entry != null) {
                    hashMap.put(com.mob.commons.i.a("008 gffhfefmfi-e-gl@f"), entry.getKey());
                    hashMap.put(com.mob.commons.i.a("008jNfefjfh!f)fggefm"), entry.getValue());
                }
            }
            a("ARSTAMT", hashMap);
            v.a().a(v.f40433j, System.currentTimeMillis());
            if (f40098d != null) {
                f40098d.clear();
            }
            v.a().a((HashMap<Long, Long>) null);
        } catch (Throwable th2) {
            MobLog.getInstance().w(th2);
        }
    }

    @Override // com.mob.commons.a.c
    public void a() {
        if (f40098d == null) {
            f40098d = new HashMap<>();
        }
        for (Map.Entry<Long, Long> entry : f40098d.entrySet()) {
            if (entry != null && entry.getKey().longValue() != f40097c) {
                n();
            }
        }
        long currentTimeMillis = System.currentTimeMillis() - f40097c;
        f40098d.put(Long.valueOf(f40097c), Long.valueOf(currentTimeMillis));
        v.a().a(f40098d);
        long b11 = v.a().b(v.f40433j, 0L);
        long k11 = k() * 1000;
        if (currentTimeMillis < k11 || System.currentTimeMillis() - b11 <= k11) {
            return;
        }
        n();
    }

    @Override // com.mob.commons.a.c
    public void b() {
        a(((Long) a(d(), (String) 0L)).longValue());
    }
}
