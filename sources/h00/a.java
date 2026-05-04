package h00;

import androidx.camera.view.q;
import com.google.common.util.concurrent.s2;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a {
    @y0(version = "2.1")
    @v0
    public static final int a(@k AtomicInteger atomicInteger, int i11, int i12) {
        g0.p(atomicInteger, "<this>");
        do {
            int i13 = atomicInteger.get();
            if (i11 != i13) {
                return i13;
            }
        } while (!atomicInteger.compareAndSet(i11, i12));
        return i11;
    }

    @y0(version = "2.1")
    @v0
    public static final int b(@k AtomicIntegerArray atomicIntegerArray, int i11, int i12, int i13) {
        g0.p(atomicIntegerArray, "<this>");
        do {
            int i14 = atomicIntegerArray.get(i11);
            if (i12 != i14) {
                return i14;
            }
        } while (!atomicIntegerArray.compareAndSet(i11, i12, i13));
        return i12;
    }

    @y0(version = "2.1")
    @v0
    public static final long c(@k AtomicLong atomicLong, long j11, long j12) {
        g0.p(atomicLong, "<this>");
        do {
            long j13 = atomicLong.get();
            if (j11 != j13) {
                return j13;
            }
        } while (!atomicLong.compareAndSet(j11, j12));
        return j11;
    }

    @y0(version = "2.1")
    @v0
    public static final long d(@k AtomicLongArray atomicLongArray, int i11, long j11, long j12) {
        g0.p(atomicLongArray, "<this>");
        do {
            long j13 = atomicLongArray.get(i11);
            if (j11 != j13) {
                return j13;
            }
        } while (!atomicLongArray.compareAndSet(i11, j11, j12));
        return j11;
    }

    @y0(version = "2.1")
    @v0
    public static final <T> T e(@k AtomicReference<T> atomicReference, T t11, T t12) {
        g0.p(atomicReference, "<this>");
        do {
            T t13 = atomicReference.get();
            if (t11 != t13) {
                return t13;
            }
        } while (!q.a(atomicReference, t11, t12));
        return t11;
    }

    @y0(version = "2.1")
    @v0
    public static final <T> T f(@k AtomicReferenceArray<T> atomicReferenceArray, int i11, T t11, T t12) {
        g0.p(atomicReferenceArray, "<this>");
        do {
            T t13 = atomicReferenceArray.get(i11);
            if (t11 != t13) {
                return t13;
            }
        } while (!s2.a(atomicReferenceArray, i11, t11, t12));
        return t11;
    }

    @y0(version = "2.1")
    @v0
    public static final boolean g(@k AtomicBoolean atomicBoolean, boolean z11, boolean z12) {
        g0.p(atomicBoolean, "<this>");
        do {
            boolean z13 = atomicBoolean.get();
            if (z11 != z13) {
                return z13;
            }
        } while (!atomicBoolean.compareAndSet(z11, z12));
        return z11;
    }
}
