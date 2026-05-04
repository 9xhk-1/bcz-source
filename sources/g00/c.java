package g00;

import com.google.common.util.concurrent.s2;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c extends b {
    @y0(version = "2.2")
    @g
    @o00.f
    public static final <T> void A(AtomicReferenceArray<T> atomicReferenceArray, int i11, l<? super T, ? extends T> transform) {
        T t11;
        g0.p(atomicReferenceArray, "<this>");
        g0.p(transform, "transform");
        do {
            t11 = atomicReferenceArray.get(i11);
        } while (!s2.a(atomicReferenceArray, i11, t11, transform.invoke(t11)));
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicIntegerArray m(@k AtomicIntegerArray atomicIntegerArray) {
        g0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicLongArray n(@k AtomicLongArray atomicLongArray) {
        g0.p(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final <T> AtomicReferenceArray<T> o(@k AtomicReferenceArray<T> atomicReferenceArray) {
        g0.p(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicIntegerArray p(@k AtomicIntegerArray atomicIntegerArray) {
        g0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicLongArray q(@k AtomicLongArray atomicLongArray) {
        g0.p(atomicLongArray, "<this>");
        return atomicLongArray;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final <T> AtomicReferenceArray<T> r(@k AtomicReferenceArray<T> atomicReferenceArray) {
        g0.p(atomicReferenceArray, "<this>");
        return atomicReferenceArray;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final int s(AtomicIntegerArray atomicIntegerArray, int i11, l<? super Integer, Integer> transform) {
        int i12;
        g0.p(atomicIntegerArray, "<this>");
        g0.p(transform, "transform");
        do {
            i12 = atomicIntegerArray.get(i11);
        } while (!atomicIntegerArray.compareAndSet(i11, i12, transform.invoke(Integer.valueOf(i12)).intValue()));
        return i12;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final long t(AtomicLongArray atomicLongArray, int i11, l<? super Long, Long> transform) {
        g0.p(atomicLongArray, "<this>");
        g0.p(transform, "transform");
        while (true) {
            long j11 = atomicLongArray.get(i11);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i12 = i11;
            if (atomicLongArray2.compareAndSet(i12, j11, transform.invoke(Long.valueOf(j11)).longValue())) {
                return j11;
            }
            atomicLongArray = atomicLongArray2;
            i11 = i12;
        }
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final <T> T u(AtomicReferenceArray<T> atomicReferenceArray, int i11, l<? super T, ? extends T> transform) {
        T t11;
        g0.p(atomicReferenceArray, "<this>");
        g0.p(transform, "transform");
        do {
            t11 = atomicReferenceArray.get(i11);
        } while (!s2.a(atomicReferenceArray, i11, t11, transform.invoke(t11)));
        return t11;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final int v(AtomicIntegerArray atomicIntegerArray, int i11, l<? super Integer, Integer> transform) {
        int i12;
        int intValue;
        g0.p(atomicIntegerArray, "<this>");
        g0.p(transform, "transform");
        do {
            i12 = atomicIntegerArray.get(i11);
            intValue = transform.invoke(Integer.valueOf(i12)).intValue();
        } while (!atomicIntegerArray.compareAndSet(i11, i12, intValue));
        return intValue;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final long w(AtomicLongArray atomicLongArray, int i11, l<? super Long, Long> transform) {
        g0.p(atomicLongArray, "<this>");
        g0.p(transform, "transform");
        while (true) {
            long j11 = atomicLongArray.get(i11);
            long longValue = transform.invoke(Long.valueOf(j11)).longValue();
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i12 = i11;
            if (atomicLongArray2.compareAndSet(i12, j11, longValue)) {
                return longValue;
            }
            atomicLongArray = atomicLongArray2;
            i11 = i12;
        }
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final <T> T x(AtomicReferenceArray<T> atomicReferenceArray, int i11, l<? super T, ? extends T> transform) {
        T t11;
        T invoke;
        g0.p(atomicReferenceArray, "<this>");
        g0.p(transform, "transform");
        do {
            t11 = atomicReferenceArray.get(i11);
            invoke = transform.invoke(t11);
        } while (!s2.a(atomicReferenceArray, i11, t11, invoke));
        return invoke;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final void y(AtomicIntegerArray atomicIntegerArray, int i11, l<? super Integer, Integer> transform) {
        int i12;
        g0.p(atomicIntegerArray, "<this>");
        g0.p(transform, "transform");
        do {
            i12 = atomicIntegerArray.get(i11);
        } while (!atomicIntegerArray.compareAndSet(i11, i12, transform.invoke(Integer.valueOf(i12)).intValue()));
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final void z(AtomicLongArray atomicLongArray, int i11, l<? super Long, Long> transform) {
        g0.p(atomicLongArray, "<this>");
        g0.p(transform, "transform");
        while (true) {
            long j11 = atomicLongArray.get(i11);
            AtomicLongArray atomicLongArray2 = atomicLongArray;
            int i12 = i11;
            if (atomicLongArray2.compareAndSet(i12, j11, transform.invoke(Long.valueOf(j11)).longValue())) {
                return;
            }
            atomicLongArray = atomicLongArray2;
            i11 = i12;
        }
    }
}
