package mk;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map<String, a> f73427a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final b f73428b = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final Lock f73429a = new ReentrantLock();

        /* renamed from: b, reason: collision with root package name */
        public int f73430b;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class b {

        /* renamed from: b, reason: collision with root package name */
        public static final int f73431b = 10;

        /* renamed from: a, reason: collision with root package name */
        public final Queue<a> f73432a = new ArrayDeque();

        public a a() {
            a poll;
            synchronized (this.f73432a) {
                poll = this.f73432a.poll();
            }
            return poll == null ? new a() : poll;
        }

        public void b(a aVar) {
            synchronized (this.f73432a) {
                try {
                    if (this.f73432a.size() < 10) {
                        this.f73432a.offer(aVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public void a(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = this.f73427a.get(str);
                if (aVar == null) {
                    aVar = this.f73428b.a();
                    this.f73427a.put(str, aVar);
                }
                aVar.f73430b++;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f73429a.lock();
    }

    public void b(String str) {
        a aVar;
        synchronized (this) {
            try {
                aVar = (a) fl.m.e(this.f73427a.get(str));
                int i11 = aVar.f73430b;
                if (i11 < 1) {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + aVar.f73430b);
                }
                int i12 = i11 - 1;
                aVar.f73430b = i12;
                if (i12 == 0) {
                    a remove = this.f73427a.remove(str);
                    if (!remove.equals(aVar)) {
                        throw new IllegalStateException("Removed the wrong lock, expected to remove: " + aVar + ", but actually removed: " + remove + ", safeKey: " + str);
                    }
                    this.f73428b.b(remove);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        aVar.f73429a.unlock();
    }
}
