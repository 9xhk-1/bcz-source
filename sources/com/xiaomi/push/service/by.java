package com.xiaomi.push.service;

import com.xiaomi.push.service.bx;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes8.dex */
class by implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bx f46345a;

    public by(bx bxVar) {
        this.f46345a = bxVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ConcurrentHashMap concurrentHashMap;
        try {
            concurrentHashMap = this.f46345a.f990a;
            Iterator it = concurrentHashMap.values().iterator();
            while (it.hasNext()) {
                ((bx.a) it.next()).run();
            }
        } catch (Exception e11) {
            com.xiaomi.channel.commonutils.logger.b.m5639a("Sync job exception :" + e11.getMessage());
        }
        this.f46345a.f991a = false;
    }
}
