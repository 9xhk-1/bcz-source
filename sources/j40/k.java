package j40;

import com.google.common.util.concurrent.s2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n1#1,251:1\n77#2:252\n77#2:253\n77#2:254\n77#2:257\n77#2:258\n1#3:255\n21#4:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueue\n*L\n91#1:252\n158#1:253\n181#1:254\n201#1:257\n245#1:258\n201#1:256\n*E\n"})
/* loaded from: classes8.dex */
public final class k {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f63204b = AtomicReferenceFieldUpdater.newUpdater(k.class, Object.class, "lastScheduledTask$volatile");

    /* renamed from: c, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63205c = AtomicIntegerFieldUpdater.newUpdater(k.class, "producerIndex$volatile");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63206d = AtomicIntegerFieldUpdater.newUpdater(k.class, "consumerIndex$volatile");

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63207e = AtomicIntegerFieldUpdater.newUpdater(k.class, "blockingTasksInBuffer$volatile");

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final AtomicReferenceArray<g> f63208a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ int blockingTasksInBuffer$volatile;
    private volatile /* synthetic */ int consumerIndex$volatile;
    private volatile /* synthetic */ Object lastScheduledTask$volatile;
    private volatile /* synthetic */ int producerIndex$volatile;

    public static /* synthetic */ g b(k kVar, g gVar, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return kVar.a(gVar, z11);
    }

    public final g A(int i11, boolean z11) {
        int i12 = i11 & 127;
        g gVar = this.f63208a.get(i12);
        if (gVar == null || gVar.f63193b != z11 || !s2.a(this.f63208a, i12, gVar, null)) {
            return null;
        }
        if (z11) {
            f63207e.decrementAndGet(this);
        }
        return gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long B(int i11, @m80.k Ref.ObjectRef<g> objectRef) {
        T r11 = i11 == 3 ? r() : z(i11);
        if (r11 == 0) {
            return C(i11, objectRef);
        }
        objectRef.element = r11;
        return -1L;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [T, j40.g, java.lang.Object] */
    public final long C(int i11, Ref.ObjectRef<g> objectRef) {
        ?? r02;
        do {
            r02 = (g) f63204b.get(this);
            if (r02 == 0) {
                return -2L;
            }
            if (((r02.f63193b ? 1 : 2) & i11) == 0) {
                return -2L;
            }
            long a11 = i.f63200f.a() - r02.f63192a;
            long j11 = i.f63196b;
            if (a11 < j11) {
                return j11 - a11;
            }
        } while (!androidx.concurrent.futures.a.a(f63204b, this, r02, null));
        objectRef.element = r02;
        return -1L;
    }

    @m80.l
    public final g a(@m80.k g gVar, boolean z11) {
        if (z11) {
            return c(gVar);
        }
        g gVar2 = (g) f63204b.getAndSet(this, gVar);
        if (gVar2 == null) {
            return null;
        }
        return c(gVar2);
    }

    public final g c(g gVar) {
        if (g() == 127) {
            return gVar;
        }
        if (gVar.f63193b) {
            f63207e.incrementAndGet(this);
        }
        int i11 = f63205c.get(this) & 127;
        while (this.f63208a.get(i11) != null) {
            Thread.yield();
        }
        this.f63208a.lazySet(i11, gVar);
        f63205c.incrementAndGet(this);
        return null;
    }

    public final void d(g gVar) {
        if (gVar == null || !gVar.f63193b) {
            return;
        }
        f63207e.decrementAndGet(this);
    }

    public final /* synthetic */ int e() {
        return this.blockingTasksInBuffer$volatile;
    }

    public final int g() {
        return f63205c.get(this) - f63206d.get(this);
    }

    public final /* synthetic */ int h() {
        return this.consumerIndex$volatile;
    }

    public final /* synthetic */ Object j() {
        return this.lastScheduledTask$volatile;
    }

    public final /* synthetic */ int l() {
        return this.producerIndex$volatile;
    }

    public final int n() {
        return f63204b.get(this) != null ? g() + 1 : g();
    }

    public final void o(@m80.k c cVar) {
        g gVar = (g) f63204b.getAndSet(this, null);
        if (gVar != null) {
            cVar.a(gVar);
        }
        while (t(cVar)) {
        }
    }

    @m80.l
    public final g p() {
        g gVar = (g) f63204b.getAndSet(this, null);
        return gVar == null ? r() : gVar;
    }

    @m80.l
    public final g q() {
        return u(true);
    }

    public final g r() {
        g andSet;
        while (true) {
            int i11 = f63206d.get(this);
            if (i11 - f63205c.get(this) == 0) {
                return null;
            }
            int i12 = i11 & 127;
            if (f63206d.compareAndSet(this, i11, i11 + 1) && (andSet = this.f63208a.getAndSet(i12, null)) != null) {
                d(andSet);
                return andSet;
            }
        }
    }

    @m80.l
    public final g s() {
        return u(false);
    }

    public final boolean t(c cVar) {
        g r11 = r();
        if (r11 == null) {
            return false;
        }
        cVar.a(r11);
        return true;
    }

    public final g u(boolean z11) {
        g gVar;
        do {
            gVar = (g) f63204b.get(this);
            if (gVar == null || gVar.f63193b != z11) {
                int i11 = f63206d.get(this);
                int i12 = f63205c.get(this);
                while (i11 != i12) {
                    if (z11 && f63207e.get(this) == 0) {
                        return null;
                    }
                    i12--;
                    g A = A(i12, z11);
                    if (A != null) {
                        return A;
                    }
                }
                return null;
            }
        } while (!androidx.concurrent.futures.a.a(f63204b, this, gVar, null));
        return gVar;
    }

    public final /* synthetic */ void v(int i11) {
        this.blockingTasksInBuffer$volatile = i11;
    }

    public final /* synthetic */ void w(int i11) {
        this.consumerIndex$volatile = i11;
    }

    public final /* synthetic */ void x(Object obj) {
        this.lastScheduledTask$volatile = obj;
    }

    public final /* synthetic */ void y(int i11) {
        this.producerIndex$volatile = i11;
    }

    public final g z(int i11) {
        int i12 = f63206d.get(this);
        int i13 = f63205c.get(this);
        boolean z11 = i11 == 1;
        while (i12 != i13) {
            if (z11 && f63207e.get(this) == 0) {
                return null;
            }
            int i14 = i12 + 1;
            g A = A(i12, z11);
            if (A != null) {
                return A;
            }
            i12 = i14;
        }
        return null;
    }
}
