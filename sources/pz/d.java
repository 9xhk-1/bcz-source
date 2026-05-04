package pz;

import com.google.common.util.concurrent.s2;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import pz.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDefaultPool.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultPool.kt\nio/ktor/utils/io/pool/DefaultPool\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,111:1\n1#2:112\n*E\n"})
/* loaded from: classes8.dex */
public abstract class d<T> implements h<T> {

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ AtomicLongFieldUpdater f81342f = AtomicLongFieldUpdater.newUpdater(d.class, "top");

    /* renamed from: a, reason: collision with root package name */
    public final int f81343a;

    /* renamed from: b, reason: collision with root package name */
    public final int f81344b;

    /* renamed from: c, reason: collision with root package name */
    public final int f81345c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final AtomicReferenceArray<T> f81346d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final int[] f81347e;

    @k
    private volatile /* synthetic */ long top;

    public d(int i11) {
        this.f81343a = i11;
        if (i11 <= 0) {
            throw new IllegalArgumentException(("capacity should be positive but it is " + i11).toString());
        }
        if (i11 > 536870911) {
            throw new IllegalArgumentException(("capacity should be less or equal to 536870911 but it is " + i11).toString());
        }
        this.top = 0L;
        int highestOneBit = Integer.highestOneBit((i11 * 4) - 1) * 2;
        this.f81344b = highestOneBit;
        this.f81345c = Integer.numberOfLeadingZeros(highestOneBit) + 1;
        this.f81346d = new AtomicReferenceArray<>(highestOneBit + 1);
        this.f81347e = new int[highestOneBit + 1];
    }

    @Override // pz.h
    @k
    public final T U6() {
        T a11;
        T j11 = j();
        return (j11 == null || (a11 = a(j11)) == null) ? f() : a11;
    }

    @k
    public T a(@k T instance) {
        g0.p(instance, "instance");
        return instance;
    }

    @Override // pz.h
    public final void b4(@k T instance) {
        g0.p(instance, "instance");
        q(instance);
        if (k(instance)) {
            return;
        }
        c(instance);
    }

    public void c(@k T instance) {
        g0.p(instance, "instance");
    }

    @Override // pz.h, java.lang.AutoCloseable
    public void close() {
        h.a.a(this);
    }

    @Override // pz.h
    public final void dispose() {
        while (true) {
            T j11 = j();
            if (j11 == null) {
                return;
            } else {
                c(j11);
            }
        }
    }

    public final int e() {
        long j11;
        long j12;
        int i11;
        do {
            j11 = this.top;
            if (j11 == 0) {
                return 0;
            }
            j12 = ((j11 >> 32) & 4294967295L) + 1;
            i11 = (int) (4294967295L & j11);
            if (i11 == 0) {
                return 0;
            }
        } while (!f81342f.compareAndSet(this, j11, (j12 << 32) | this.f81347e[i11]));
        return i11;
    }

    @k
    public abstract T f();

    @Override // pz.h
    public final int getCapacity() {
        return this.f81343a;
    }

    public final void i(int i11) {
        long j11;
        if (i11 <= 0) {
            throw new IllegalArgumentException("index should be positive");
        }
        do {
            j11 = this.top;
            this.f81347e[i11] = (int) (4294967295L & j11);
        } while (!f81342f.compareAndSet(this, j11, ((((j11 >> 32) & 4294967295L) + 1) << 32) | i11));
    }

    public final T j() {
        int e11 = e();
        if (e11 == 0) {
            return null;
        }
        return this.f81346d.getAndSet(e11, null);
    }

    public final boolean k(T t11) {
        int identityHashCode = ((System.identityHashCode(t11) * (-1640531527)) >>> this.f81345c) + 1;
        for (int i11 = 0; i11 < 8; i11++) {
            if (s2.a(this.f81346d, identityHashCode, null, t11)) {
                i(identityHashCode);
                return true;
            }
            identityHashCode--;
            if (identityHashCode == 0) {
                identityHashCode = this.f81344b;
            }
        }
        return false;
    }

    public void q(@k T instance) {
        g0.p(instance, "instance");
    }
}
