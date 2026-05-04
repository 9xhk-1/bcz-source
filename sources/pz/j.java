package pz;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import pz.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/SingleInstancePool\n+ 2 AtomicFU.common.kt\nkotlinx/atomicfu/AtomicFU_commonKt\n*L\n1#1,163:1\n359#2,4:164\n*S KotlinDebug\n*F\n+ 1 Pool.kt\nio/ktor/utils/io/pool/SingleInstancePool\n*L\n69#1:164,4\n*E\n"})
/* loaded from: classes8.dex */
public abstract class j<T> implements h<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f81353a = AtomicIntegerFieldUpdater.newUpdater(j.class, "borrowed");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f81354b = AtomicIntegerFieldUpdater.newUpdater(j.class, "disposed");

    @k
    private volatile /* synthetic */ int borrowed = 0;

    @k
    private volatile /* synthetic */ int disposed = 0;

    @k
    private volatile /* synthetic */ Object instance = null;

    @Override // pz.h
    @k
    public final T U6() {
        int i11;
        do {
            i11 = this.borrowed;
            if (i11 != 0) {
                throw new IllegalStateException("Instance is already consumed");
            }
        } while (!f81353a.compareAndSet(this, i11, 1));
        T c11 = c();
        this.instance = c11;
        return c11;
    }

    public abstract void a(@k T t11);

    @Override // pz.h
    public final void b4(@k T instance) {
        g0.p(instance, "instance");
        if (this.instance != instance) {
            if (this.instance == null && this.borrowed != 0) {
                throw new IllegalStateException("Already recycled or an irrelevant instance tried to be recycled");
            }
            throw new IllegalStateException("Unable to recycle irrelevant instance");
        }
        this.instance = null;
        if (!f81354b.compareAndSet(this, 0, 1)) {
            throw new IllegalStateException("An instance is already disposed");
        }
        a(instance);
    }

    @k
    public abstract T c();

    @Override // pz.h, java.lang.AutoCloseable
    public void close() {
        h.a.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // pz.h
    public final void dispose() {
        Object obj;
        if (!f81354b.compareAndSet(this, 0, 1) || (obj = this.instance) == null) {
            return;
        }
        this.instance = null;
        a(obj);
    }

    @Override // pz.h
    public final int getCapacity() {
        return 1;
    }
}
