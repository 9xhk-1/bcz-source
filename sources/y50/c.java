package y50;

import a00.r0;
import com.squareup.picasso.h0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.RejectedExecutionException;
import java.util.logging.Level;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u50.f;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 Util.kt\nokhttp3/internal/Util\n*L\n1#1,218:1\n1#2:219\n25#3,4:220\n25#3,4:224\n25#3,4:228\n25#3,4:232\n25#3,4:251\n350#4,7:236\n615#5,4:243\n615#5,4:247\n*S KotlinDebug\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue\n*L\n65#1:220,4\n68#1:224,4\n153#1:228,4\n159#1:232,4\n208#1:251,4\n165#1:236,7\n179#1:243,4\n189#1:247,4\n*E\n"})
/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final d f99381a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f99382b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f99383c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public y50.a f99384d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<y50.a> f99385e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f99386f;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        @k
        public final CountDownLatch f99387e;

        public a() {
            super(f.f91854i + " awaitIdle", false);
            this.f99387e = new CountDownLatch(1);
        }

        @Override // y50.a
        public long f() {
            this.f99387e.countDown();
            return -1L;
        }

        @k
        public final CountDownLatch i() {
            return this.f99387e;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$execute$1\n*L\n1#1,218:1\n*E\n"})
    public static final class b extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.a<g2> f99388e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, boolean z11, x00.a<g2> aVar) {
            super(str, z11);
            this.f99388e = aVar;
        }

        @Override // y50.a
        public long f() {
            this.f99388e.invoke();
            return -1L;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nTaskQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskQueue.kt\nokhttp3/internal/concurrent/TaskQueue$schedule$2\n*L\n1#1,218:1\n*E\n"})
    /* renamed from: y50.c$c, reason: collision with other inner class name */
    public static final class C1345c extends y50.a {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ x00.a<Long> f99389e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1345c(String str, x00.a<Long> aVar) {
            super(str, false, 2, null);
            this.f99389e = aVar;
        }

        @Override // y50.a
        public long f() {
            return this.f99389e.invoke().longValue();
        }
    }

    public c(@k d taskRunner, @k String name) {
        g0.p(taskRunner, "taskRunner");
        g0.p(name, "name");
        this.f99381a = taskRunner;
        this.f99382b = name;
        this.f99385e = new ArrayList();
    }

    public static /* synthetic */ void d(c cVar, String name, long j11, boolean z11, x00.a block, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        if ((i11 & 4) != 0) {
            z11 = true;
        }
        g0.p(name, "name");
        g0.p(block, "block");
        cVar.n(new b(name, z11, block), j11);
    }

    public static /* synthetic */ void o(c cVar, String name, long j11, x00.a block, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        g0.p(name, "name");
        g0.p(block, "block");
        cVar.n(new C1345c(name, block), j11);
    }

    public static /* synthetic */ void p(c cVar, y50.a aVar, long j11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            j11 = 0;
        }
        cVar.n(aVar, j11);
    }

    public final void a() {
        if (f.f91853h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f99381a) {
            try {
                if (b()) {
                    this.f99381a.i(this);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean b() {
        y50.a aVar = this.f99384d;
        if (aVar != null) {
            g0.m(aVar);
            if (aVar.a()) {
                this.f99386f = true;
            }
        }
        boolean z11 = false;
        for (int size = this.f99385e.size() - 1; -1 < size; size--) {
            if (this.f99385e.get(size).a()) {
                y50.a aVar2 = this.f99385e.get(size);
                if (d.f99390h.a().isLoggable(Level.FINE)) {
                    y50.b.c(aVar2, this, h0.f41875q);
                }
                this.f99385e.remove(size);
                z11 = true;
            }
        }
        return z11;
    }

    public final void c(@k String name, long j11, boolean z11, @k x00.a<g2> block) {
        g0.p(name, "name");
        g0.p(block, "block");
        n(new b(name, z11, block), j11);
    }

    @l
    public final y50.a e() {
        return this.f99384d;
    }

    public final boolean f() {
        return this.f99386f;
    }

    @k
    public final List<y50.a> g() {
        return this.f99385e;
    }

    @k
    public final String h() {
        return this.f99382b;
    }

    @k
    public final List<y50.a> i() {
        List<y50.a> a62;
        synchronized (this.f99381a) {
            a62 = r0.a6(this.f99385e);
        }
        return a62;
    }

    public final boolean j() {
        return this.f99383c;
    }

    @k
    public final d k() {
        return this.f99381a;
    }

    @k
    public final CountDownLatch l() {
        synchronized (this.f99381a) {
            if (this.f99384d == null && this.f99385e.isEmpty()) {
                return new CountDownLatch(0);
            }
            y50.a aVar = this.f99384d;
            if (aVar instanceof a) {
                return ((a) aVar).i();
            }
            for (y50.a aVar2 : this.f99385e) {
                if (aVar2 instanceof a) {
                    return ((a) aVar2).i();
                }
            }
            a aVar3 = new a();
            if (q(aVar3, 0L, false)) {
                this.f99381a.i(this);
            }
            return aVar3.i();
        }
    }

    public final void m(@k String name, long j11, @k x00.a<Long> block) {
        g0.p(name, "name");
        g0.p(block, "block");
        n(new C1345c(name, block), j11);
    }

    public final void n(@k y50.a task, long j11) {
        g0.p(task, "task");
        synchronized (this.f99381a) {
            if (!this.f99383c) {
                if (q(task, j11, false)) {
                    this.f99381a.i(this);
                }
                g2 g2Var = g2.f100423a;
            } else if (task.a()) {
                if (d.f99390h.a().isLoggable(Level.FINE)) {
                    y50.b.c(task, this, "schedule canceled (queue is shutdown)");
                }
            } else {
                if (d.f99390h.a().isLoggable(Level.FINE)) {
                    y50.b.c(task, this, "schedule failed (queue is shutdown)");
                }
                throw new RejectedExecutionException();
            }
        }
    }

    public final boolean q(@k y50.a task, long j11, boolean z11) {
        String str;
        g0.p(task, "task");
        task.e(this);
        long nanoTime = this.f99381a.h().nanoTime();
        long j12 = nanoTime + j11;
        int indexOf = this.f99385e.indexOf(task);
        if (indexOf != -1) {
            if (task.c() <= j12) {
                if (d.f99390h.a().isLoggable(Level.FINE)) {
                    y50.b.c(task, this, "already scheduled");
                }
                return false;
            }
            this.f99385e.remove(indexOf);
        }
        task.g(j12);
        if (d.f99390h.a().isLoggable(Level.FINE)) {
            if (z11) {
                str = "run again after " + y50.b.b(j12 - nanoTime);
            } else {
                str = "scheduled after " + y50.b.b(j12 - nanoTime);
            }
            y50.b.c(task, this, str);
        }
        Iterator<y50.a> it = this.f99385e.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().c() - nanoTime > j11) {
                break;
            }
            i11++;
        }
        if (i11 == -1) {
            i11 = this.f99385e.size();
        }
        this.f99385e.add(i11, task);
        return i11 == 0;
    }

    public final void r(@l y50.a aVar) {
        this.f99384d = aVar;
    }

    public final void s(boolean z11) {
        this.f99386f = z11;
    }

    public final void t(boolean z11) {
        this.f99383c = z11;
    }

    @k
    public String toString() {
        return this.f99382b;
    }

    public final void u() {
        if (f.f91853h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this.f99381a) {
            try {
                this.f99383c = true;
                if (b()) {
                    this.f99381a.i(this);
                }
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
