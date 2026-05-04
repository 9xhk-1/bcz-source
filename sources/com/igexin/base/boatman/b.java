package com.igexin.base.boatman;

import com.igexin.base.boatman.receive.IBoatResult;
import com.igexin.base.boatman.receive.Site;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ReentrantLock f37059a = new ReentrantLock();

    /* renamed from: b, reason: collision with root package name */
    public final Map<String, Site> f37060b = new ConcurrentHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, List<a>> f37061c = new HashMap();

    public final <B, V> void a(Boater<B, V> boater, B b11, IBoatResult<V> iBoatResult) {
        Site site = this.f37060b.get(boater.getTag());
        if (site == null) {
            return;
        }
        site.onArrived(b11, iBoatResult);
    }

    public final boolean a(Boater boater, Object obj) {
        String tag = boater.getTag();
        this.f37059a.lock();
        try {
            List<a> list = this.f37061c.get(tag);
            boolean z11 = false;
            if (list != null) {
                Iterator<a> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().f37057a == obj) {
                        it.remove();
                        z11 = true;
                    }
                }
            }
            return z11;
        } finally {
            this.f37059a.unlock();
        }
    }
}
