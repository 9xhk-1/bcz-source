package com.zx.a.I8b7;

import com.zx.a.I8b7.i1;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public ExecutorService f46736a;

    /* renamed from: b, reason: collision with root package name */
    public final Deque<i1.a> f46737b = new ArrayDeque();

    /* renamed from: c, reason: collision with root package name */
    public final Deque<i1.a> f46738c = new ArrayDeque();

    /* renamed from: d, reason: collision with root package name */
    public final Deque<i1> f46739d = new ArrayDeque();

    public final void a() {
        ExecutorService executorService;
        if (this.f46738c.size() < 64 && !this.f46737b.isEmpty()) {
            Iterator<i1.a> it = this.f46737b.iterator();
            while (it.hasNext()) {
                i1.a next = it.next();
                Iterator<i1.a> it2 = this.f46738c.iterator();
                if (it2.hasNext()) {
                    it2.next().getClass();
                    throw null;
                }
                it.remove();
                this.f46738c.add(next);
                synchronized (this) {
                    try {
                        if (this.f46736a == null) {
                            this.f46736a = new ThreadPoolExecutor(1, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new w(this));
                        }
                        executorService = this.f46736a;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                executorService.execute(next);
                if (this.f46738c.size() >= 64) {
                    return;
                }
            }
        }
    }

    public final <T> void a(Deque<T> deque, T t11, boolean z11) {
        synchronized (this) {
            try {
                if (!deque.remove(t11)) {
                    throw new AssertionError("Call wasn't in-flight!");
                }
                if (z11) {
                    a();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
