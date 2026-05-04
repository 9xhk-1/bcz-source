package com.baicizhan.client.framework.asynctask;

import android.os.Handler;
import android.os.Message;
import android.os.Process;
import android.util.SparseIntArray;
import com.baicizhan.client.framework.asynctask.LAsyncTaskParallel;
import java.security.InvalidParameterException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a implements Executor {

    /* renamed from: j, reason: collision with root package name */
    public static final int f17532j = 5;

    /* renamed from: k, reason: collision with root package name */
    public static final int f17533k = 256;

    /* renamed from: l, reason: collision with root package name */
    public static final int f17534l = 30;

    /* renamed from: m, reason: collision with root package name */
    public static final int f17535m = 180000;

    /* renamed from: n, reason: collision with root package name */
    public static final int f17536n = 1;

    /* renamed from: o, reason: collision with root package name */
    public static final int f17537o = 2;

    /* renamed from: p, reason: collision with root package name */
    public static a f17538p;

    /* renamed from: q, reason: collision with root package name */
    public static final ThreadFactory f17539q;

    /* renamed from: r, reason: collision with root package name */
    public static final BlockingQueue<Runnable> f17540r;

    /* renamed from: s, reason: collision with root package name */
    public static final Executor f17541s;

    /* renamed from: a, reason: collision with root package name */
    public volatile int f17542a = 0;

    /* renamed from: b, reason: collision with root package name */
    public volatile int f17543b = 0;

    /* renamed from: c, reason: collision with root package name */
    public volatile int f17544c = 0;

    /* renamed from: d, reason: collision with root package name */
    public volatile int f17545d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final SparseIntArray f17546e = new SparseIntArray();

    /* renamed from: f, reason: collision with root package name */
    public final LinkedList<d> f17547f = new LinkedList<>();

    /* renamed from: g, reason: collision with root package name */
    public final LinkedList<d> f17548g = new LinkedList<>();

    /* renamed from: h, reason: collision with root package name */
    public final LinkedList<d> f17549h = new LinkedList<>();

    /* renamed from: i, reason: collision with root package name */
    public final Handler f17550i = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.framework.asynctask.a$a, reason: collision with other inner class name */
    public class ThreadFactoryC0278a implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        public final AtomicInteger f17551a = new AtomicInteger(1);

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r11) {
            String str = "LAsyncTask #" + String.valueOf(this.f17551a.getAndIncrement());
            if (qb.d.b()) {
                qb.c.i("", str, new Object[0]);
            }
            return new Thread(r11, str);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends Handler {
        public b() {
        }

        @Override // android.os.Handler
        public void handleMessage(Message msg) {
            Object obj;
            super.handleMessage(msg);
            int i11 = msg.what;
            if (i11 == 1) {
                Object obj2 = msg.obj;
                if (obj2 == null || !(obj2 instanceof d)) {
                    return;
                }
                a.this.z((d) obj2);
                return;
            }
            if (i11 == 2 && (obj = msg.obj) != null && (obj instanceof d)) {
                a.this.p((d) obj);
                if (qb.d.b()) {
                    qb.c.b("", a.this.toString(), new Object[0]);
                }
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends d {
        public c(jb.a task) {
            super(task);
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                try {
                    if (f() == 4) {
                        Process.setThreadPriority(-2);
                    } else if (f() == 3) {
                        Process.setThreadPriority(-1);
                    } else if (f() == 2) {
                        Process.setThreadPriority(0);
                    } else {
                        Process.setThreadPriority(10);
                    }
                } catch (Exception e11) {
                    if (qb.d.b()) {
                        qb.c.d("", e11.getMessage(), new Object[0]);
                    }
                }
                k();
                if (j()) {
                    return;
                }
                a.this.f17550i.sendMessage(a.this.f17550i.obtainMessage(2, this));
            } catch (Throwable th2) {
                if (!j()) {
                    a.this.f17550i.sendMessage(a.this.f17550i.obtainMessage(2, this));
                }
                throw th2;
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public jb.a<?> f17554a;

        public d(jb.a<?> task) {
            this.f17554a = null;
            if (task == null || task.b() == null) {
                throw new InvalidParameterException("parameter is null");
            }
            this.f17554a = task;
        }

        public boolean a() {
            return this.f17554a.b().t();
        }

        public void b() {
            this.f17554a.a();
        }

        public String c() {
            return this.f17554a.b().m();
        }

        public int d() {
            if (this.f17554a.b().n() != null) {
                return this.f17554a.b().n().a();
            }
            return 0;
        }

        public LAsyncTaskParallel.LAsyncTaskParallelType e() {
            return this.f17554a.b().n() != null ? this.f17554a.b().n().b() : LAsyncTaskParallel.LAsyncTaskParallelType.MAX_PARALLEL;
        }

        public int f() {
            return this.f17554a.b().o();
        }

        public int g() {
            return this.f17554a.b().q();
        }

        public LAsyncTask<?, ?, ?> h() {
            return this.f17554a.b();
        }

        public boolean i() {
            return this.f17554a.isCancelled();
        }

        public boolean j() {
            return this.f17554a.b().s();
        }

        public void k() {
            try {
                this.f17554a.run();
            } catch (OutOfMemoryError unused) {
                System.gc();
            }
        }

        public void l(boolean isTimeout) {
            this.f17554a.b().S(isTimeout);
        }
    }

    static {
        ThreadFactoryC0278a threadFactoryC0278a = new ThreadFactoryC0278a();
        f17539q = threadFactoryC0278a;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        f17540r = synchronousQueue;
        f17541s = new ThreadPoolExecutor(5, 256, 30L, TimeUnit.SECONDS, synchronousQueue, threadFactoryC0278a, new ThreadPoolExecutor.DiscardPolicy());
    }

    public static a g() {
        if (f17538p == null) {
            synchronized (a.class) {
                try {
                    if (f17538p == null) {
                        f17538p = new a();
                    }
                } finally {
                }
            }
        }
        return f17538p;
    }

    public final boolean c(int activeNum, LAsyncTaskParallel.LAsyncTaskParallelType type) {
        return type == LAsyncTaskParallel.LAsyncTaskParallelType.SERIAL ? activeNum < 1 : type == LAsyncTaskParallel.LAsyncTaskParallelType.TWO_PARALLEL ? activeNum < 2 : type == LAsyncTaskParallel.LAsyncTaskParallelType.THREE_PARALLEL ? activeNum < 3 : type != LAsyncTaskParallel.LAsyncTaskParallelType.FOUR_PARALLEL || activeNum < 4;
    }

    public final synchronized void d(d task) {
        if (task == null) {
            return;
        }
        try {
            this.f17548g.add(task);
            this.f17547f.remove(task);
            f17541s.execute(task);
            Handler handler = this.f17550i;
            handler.sendMessageDelayed(handler.obtainMessage(1, task), 180000L);
            int f11 = task.f();
            if (f11 == 1) {
                this.f17545d++;
            } else if (f11 == 2) {
                this.f17544c++;
            } else if (f11 == 3) {
                this.f17543b++;
            } else if (f11 == 4) {
                this.f17542a++;
                if (this.f17542a >= 5 && qb.d.b()) {
                    qb.c.d("", "SuperHight Task too much num = " + this.f17542a, new Object[0]);
                }
            }
            int d11 = task.d();
            if (d11 != 0) {
                this.f17546e.put(d11, this.f17546e.get(d11, 0) + 1);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int e(int tag) {
        return f(this.f17547f, tag) + f(this.f17548g, tag) + f(this.f17549h, tag);
    }

    @Override // java.util.concurrent.Executor
    public synchronized void execute(Runnable r11) {
        if (r11 instanceof jb.a) {
            c cVar = new c((jb.a) r11);
            if (cVar.j()) {
                new Thread(cVar).start();
                return;
            }
            h(cVar);
            p(null);
            if (qb.d.b()) {
                qb.c.b("", toString(), new Object[0]);
            }
        }
    }

    public synchronized int f(LinkedList<d> list, int tag) {
        int i11 = 0;
        if (list == null) {
            return 0;
        }
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.g() == tag && next.h() != null && !next.h().r()) {
                i11++;
            }
        }
        return i11;
    }

    public final synchronized void h(d runnable) {
        if (runnable == null) {
            return;
        }
        try {
            int size = this.f17547f.size();
            int i11 = 0;
            while (i11 < size && this.f17547f.get(i11).f() >= runnable.f()) {
                i11++;
            }
            this.f17547f.add(i11, runnable);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized LinkedList<LAsyncTask<?, ?, ?>> i(int tag) {
        LinkedList<LAsyncTask<?, ?, ?>> n11;
        n11 = n(this.f17547f, true, tag, null);
        if (qb.d.b()) {
            qb.c.b("", g().toString(), new Object[0]);
        }
        return n11;
    }

    public synchronized LinkedList<LAsyncTask<?, ?, ?>> j(int tag, String key) {
        LinkedList<LAsyncTask<?, ?, ?>> n11;
        n11 = n(this.f17547f, true, tag, key);
        if (qb.d.b()) {
            qb.c.b("", g().toString(), new Object[0]);
        }
        return n11;
    }

    public synchronized LinkedList<LAsyncTask<?, ?, ?>> k(int tag) {
        return l(tag, null);
    }

    public synchronized LinkedList<LAsyncTask<?, ?, ?>> l(int tag, String key) {
        LinkedList<LAsyncTask<?, ?, ?>> linkedList;
        linkedList = new LinkedList<>();
        linkedList.addAll(j(tag, key));
        linkedList.addAll(n(this.f17548g, false, tag, key));
        linkedList.addAll(n(this.f17549h, false, tag, key));
        if (qb.d.b()) {
            qb.c.b("", g().toString(), new Object[0]);
        }
        return linkedList;
    }

    public final synchronized void m(d task) {
        if (task == null) {
            return;
        }
        try {
            if (task.a()) {
                this.f17549h.remove(task);
            } else {
                this.f17548g.remove(task);
                this.f17550i.removeMessages(1, task);
                int f11 = task.f();
                if (f11 == 1) {
                    this.f17545d--;
                } else if (f11 == 2) {
                    this.f17544c--;
                } else if (f11 == 3) {
                    this.f17543b--;
                } else if (f11 == 4) {
                    this.f17542a--;
                }
                int d11 = task.d();
                if (d11 != 0) {
                    int i11 = this.f17546e.get(d11) - 1;
                    if (i11 <= 0) {
                        this.f17546e.delete(d11);
                    } else {
                        this.f17546e.put(d11, i11);
                    }
                    if (i11 < 0 && qb.d.b()) {
                        qb.c.d("", "removeTask error < 0", new Object[0]);
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized LinkedList<LAsyncTask<?, ?, ?>> n(LinkedList<d> tasks, boolean remove, int tag, String key) {
        LinkedList<LAsyncTask<?, ?, ?>> linkedList;
        try {
            linkedList = new LinkedList<>();
            Iterator<d> it = tasks.iterator();
            while (it.hasNext()) {
                d next = it.next();
                int g11 = next.g();
                String c11 = next.c();
                if (g11 == tag) {
                    if (key != null && !key.equals(c11)) {
                    }
                    if (remove) {
                        it.remove();
                    }
                    next.b();
                    linkedList.add(next.h());
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return linkedList;
    }

    public synchronized void o(LAsyncTask<?, ?, ?> task) {
        try {
            Iterator<d> it = this.f17547f.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                d next = it.next();
                if (next != null && next.h() == task) {
                    it.remove();
                    break;
                }
            }
            if (qb.d.b()) {
                qb.c.b("", g().toString(), new Object[0]);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void p(d current) {
        m(current);
        for (int i11 = 0; i11 < this.f17547f.size(); i11++) {
            d dVar = this.f17547f.get(i11);
            int d11 = dVar.d();
            int f11 = dVar.f();
            if (f11 != 1) {
                if (f11 != 2) {
                    if (f11 != 3) {
                        if (f11 == 4 && d11 == 0) {
                            d(dVar);
                            return;
                        }
                    } else if (this.f17543b + this.f17544c + this.f17545d >= 5) {
                        return;
                    }
                } else if (this.f17543b + this.f17544c + this.f17545d >= 4) {
                    return;
                }
            } else if (this.f17543b + this.f17544c + this.f17545d >= 3) {
                return;
            }
            if (c(this.f17546e.get(d11), dVar.e())) {
                d(dVar);
                return;
            }
        }
    }

    public synchronized LAsyncTask<?, ?, ?> q(String key) {
        return w(this.f17548g, key);
    }

    public synchronized LinkedList<LAsyncTask<?, ?, ?>> r(int tag) {
        LinkedList<LAsyncTask<?, ?, ?>> linkedList;
        linkedList = new LinkedList<>();
        linkedList.addAll(t(this.f17547f, tag));
        linkedList.addAll(t(this.f17548g, tag));
        linkedList.addAll(t(this.f17549h, tag));
        return linkedList;
    }

    public synchronized LinkedList<LAsyncTask<?, ?, ?>> s(int tag, String key) {
        LinkedList<LAsyncTask<?, ?, ?>> linkedList;
        linkedList = new LinkedList<>();
        linkedList.addAll(u(this.f17547f, tag, key));
        linkedList.addAll(u(this.f17548g, tag, key));
        linkedList.addAll(u(this.f17549h, tag, key));
        return linkedList;
    }

    public synchronized LinkedList<LAsyncTask<?, ?, ?>> t(LinkedList<d> list, int tag) {
        if (list == null) {
            return null;
        }
        LinkedList<LAsyncTask<?, ?, ?>> linkedList = new LinkedList<>();
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            d next = it.next();
            if (next.g() == tag && next.h() != null && !next.h().r()) {
                linkedList.add(next.h());
            }
        }
        return linkedList;
    }

    public String toString() {
        return "mWaitingTasks = " + this.f17547f.size() + " mRunningTasks = " + this.f17548g.size() + " mTimeOutTasks = " + this.f17549h.size();
    }

    public synchronized LinkedList<LAsyncTask<?, ?, ?>> u(LinkedList<d> list, int tag, String key) {
        if (list == null) {
            return null;
        }
        LinkedList<LAsyncTask<?, ?, ?>> linkedList = new LinkedList<>();
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            d next = it.next();
            String c11 = next.c();
            if (c11 != null && c11.equals(key) && next.g() == tag && next.h() != null && !next.h().r()) {
                linkedList.add(next.h());
            }
        }
        return linkedList;
    }

    public synchronized LAsyncTask<?, ?, ?> v(String key) {
        LAsyncTask<?, ?, ?> w11;
        try {
            w11 = w(this.f17547f, key);
            if (w11 == null) {
                w11 = w(this.f17548g, key);
            }
            if (w11 == null) {
                w11 = w(this.f17549h, key);
            }
            if (w11 != null) {
                if (w11.r()) {
                    w11 = null;
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return w11;
    }

    public synchronized LAsyncTask<?, ?, ?> w(LinkedList<d> list, String key) {
        if (list == null) {
            return null;
        }
        Iterator<d> it = list.iterator();
        while (it.hasNext()) {
            d next = it.next();
            String c11 = next.c();
            if (c11 != null && c11.equals(key) && !next.h().r()) {
                return next.h();
            }
        }
        return null;
    }

    public synchronized LAsyncTask<?, ?, ?> x(String key) {
        return w(this.f17547f, key);
    }

    public synchronized LinkedList<LAsyncTask<?, ?, ?>> y(int tag) {
        LinkedList<LAsyncTask<?, ?, ?>> linkedList;
        linkedList = new LinkedList<>();
        linkedList.addAll(t(this.f17547f, tag));
        linkedList.addAll(t(this.f17549h, tag));
        return linkedList;
    }

    public final synchronized void z(d task) {
        d poll;
        try {
            m(task);
            if (!task.i()) {
                task.l(true);
                this.f17549h.add(task);
                if (this.f17549h.size() > 246 && (poll = this.f17549h.poll()) != null) {
                    poll.b();
                }
            } else if (qb.d.b()) {
                qb.c.d("", "task TimeOut but it's cancelled()", new Object[0]);
            }
            p(null);
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
