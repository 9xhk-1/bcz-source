package com.igexin.c.a.d;

import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentLinkedQueue<com.igexin.c.a.d.a.e> f37210a;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentLinkedQueue<com.igexin.c.a.d.a.e> f37211b;

    /* renamed from: c, reason: collision with root package name */
    private ConcurrentLinkedQueue<com.igexin.c.a.d.a.e> f37212c;

    public d() {
        ConcurrentLinkedQueue<com.igexin.c.a.d.a.e> concurrentLinkedQueue = new ConcurrentLinkedQueue<>();
        this.f37210a = concurrentLinkedQueue;
        this.f37211b = new ConcurrentLinkedQueue<>();
        this.f37212c = concurrentLinkedQueue;
    }

    private synchronized Iterator<com.igexin.c.a.d.a.e> e() {
        return this.f37212c.iterator();
    }

    public final synchronized void a() {
        this.f37212c = this.f37210a;
    }

    public final synchronized void b() {
        ConcurrentLinkedQueue<com.igexin.c.a.d.a.e> concurrentLinkedQueue = this.f37211b;
        this.f37212c = concurrentLinkedQueue;
        concurrentLinkedQueue.addAll(this.f37210a);
        this.f37210a.clear();
    }

    public final synchronized boolean c() {
        return this.f37212c.isEmpty();
    }

    public final synchronized com.igexin.c.a.d.a.e d() {
        return this.f37212c.poll();
    }

    public final synchronized void a(com.igexin.c.a.d.a.e eVar) {
        this.f37212c.offer(eVar);
    }
}
