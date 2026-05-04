package com.igexin.sdk.router.boatman;

import com.igexin.sdk.router.boatman.receive.IBoatResult;
import com.igexin.sdk.router.boatman.receive.Site;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes7.dex */
public final class ShipsManagerImpl implements IShips {
    private final ReentrantLock lock = new ReentrantLock();
    private final Map<String, Site> subMaps = new ConcurrentHashMap();
    private final Map<String, List<BoatBean>> cacheMaps = new HashMap();

    @Override // com.igexin.sdk.router.boatman.IShips
    public final boolean isRegistered(Site site) {
        return this.subMaps.containsKey(site.getTag());
    }

    public final <B, V> void postASync(Boater<B, V> boater, B b11, IBoatResult<V> iBoatResult) {
        Site site = this.subMaps.get(boater.getTag());
        if (site == null) {
            return;
        }
        site.onArrived(b11, iBoatResult);
    }

    public final <B, V> void postSticky(Boater<B, V> boater, B b11, IBoatResult<V> iBoatResult) {
        String tag = boater.getTag();
        this.lock.lock();
        try {
            boolean containsKey = this.subMaps.containsKey(boater.getTag());
            if (!containsKey) {
                if (this.cacheMaps.get(tag) == null) {
                    this.cacheMaps.put(tag, new ArrayList());
                }
                this.cacheMaps.get(tag).add(new BoatBean(b11, iBoatResult));
            }
            this.lock.unlock();
            if (containsKey) {
                postASync(boater, b11, iBoatResult);
            }
        } catch (Throwable th2) {
            this.lock.unlock();
            throw th2;
        }
    }

    public final <B, V> V postSync(Boater<B, V> boater, B b11) {
        Site site = this.subMaps.get(boater.getTag());
        if (site == null) {
            return null;
        }
        return (V) site.onArrived(b11);
    }

    @Override // com.igexin.sdk.router.boatman.IShips
    public final void register(Site site) {
        String tag = site.getTag();
        this.lock.lock();
        try {
            this.subMaps.put(tag, site);
            List<BoatBean> list = this.cacheMaps.get(tag);
            if (list != null && list.size() > 0) {
                Iterator<BoatBean> it = list.iterator();
                while (it.hasNext()) {
                    BoatBean next = it.next();
                    if (next.getListener() != null) {
                        site.onArrived(next.getBag(), next.getListener());
                    }
                    it.remove();
                }
            }
            this.lock.unlock();
        } catch (Throwable th2) {
            this.lock.unlock();
            throw th2;
        }
    }

    public final boolean removeSticky(Boater boater, Object obj) {
        String tag = boater.getTag();
        this.lock.lock();
        try {
            List<BoatBean> list = this.cacheMaps.get(tag);
            boolean z11 = false;
            if (list != null) {
                Iterator<BoatBean> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().getBag() == obj) {
                        it.remove();
                        z11 = true;
                    }
                }
            }
            return z11;
        } finally {
            this.lock.unlock();
        }
    }

    @Override // com.igexin.sdk.router.boatman.IShips
    public final void unRegister(Site site) {
        this.lock.lock();
        try {
            this.subMaps.remove(site.getTag());
        } finally {
            this.lock.unlock();
        }
    }
}
