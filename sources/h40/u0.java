package h40;

import c40.z2;
import h40.u0;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nConcurrentLinkedList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n+ 2 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n*L\n1#1,265:1\n248#2,4:266\n*S KotlinDebug\n*F\n+ 1 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/Segment\n*L\n221#1:266,4\n*E\n"})
/* loaded from: classes8.dex */
public abstract class u0<S extends u0<S>> extends f<S> implements z2 {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f58275d = AtomicIntegerFieldUpdater.newUpdater(u0.class, "cleanedAndPointers$volatile");

    /* renamed from: c, reason: collision with root package name */
    @w00.g
    public final long f58276c;
    private volatile /* synthetic */ int cleanedAndPointers$volatile;

    public u0(long j11, @m80.l S s11, int i11) {
        super(s11);
        this.f58276c = j11;
        this.cleanedAndPointers$volatile = i11 << 16;
    }

    public final void A() {
        if (f58275d.incrementAndGet(this) == y()) {
            q();
        }
    }

    public final /* synthetic */ void B(int i11) {
        this.cleanedAndPointers$volatile = i11;
    }

    public final boolean C() {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f58275d;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 == y() && !n()) {
                return false;
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, 65536 + i11));
        return true;
    }

    @Override // h40.f
    public boolean m() {
        return f58275d.get(this) == y() && !n();
    }

    public final boolean v() {
        return f58275d.addAndGet(this, -65536) == y() && !n();
    }

    public final /* synthetic */ int w() {
        return this.cleanedAndPointers$volatile;
    }

    public abstract int y();

    public abstract void z(int i11, @m80.l Throwable th2, @m80.k kotlin.coroutines.d dVar);
}
