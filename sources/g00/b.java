package g00;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLongArray;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAtomicArrays.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AtomicArrays.common.kt\nkotlin/concurrent/atomics/AtomicArraysKt__AtomicArrays_commonKt\n*L\n1#1,768:1\n666#1:769\n*S KotlinDebug\n*F\n+ 1 AtomicArrays.common.kt\nkotlin/concurrent/atomics/AtomicArraysKt__AtomicArrays_commonKt\n*L\n678#1:769\n*E\n"})
/* loaded from: classes8.dex */
public class b {
    @y0(version = "2.1")
    @g
    public static final /* synthetic */ <T> AtomicReferenceArray<T> a(int i11, l<? super Integer, ? extends T> init) {
        g0.p(init, "init");
        g0.y(0, ExifInterface.GPS_DIRECTION_TRUE);
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = init.invoke(Integer.valueOf(i12));
        }
        return new AtomicReferenceArray<>(objArr);
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicIntegerArray b(int i11, @k l<? super Integer, Integer> init) {
        g0.p(init, "init");
        int[] iArr = new int[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            iArr[i12] = init.invoke(Integer.valueOf(i12)).intValue();
        }
        return new AtomicIntegerArray(iArr);
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicLongArray c(int i11, @k l<? super Integer, Long> init) {
        g0.p(init, "init");
        long[] jArr = new long[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            jArr[i12] = init.invoke(Integer.valueOf(i12)).longValue();
        }
        return new AtomicLongArray(jArr);
    }

    @y0(version = "2.2")
    @g
    public static final /* synthetic */ <T> AtomicReferenceArray<T> d(int i11) {
        g0.y(0, "T?");
        Object[] objArr = new Object[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            objArr[i12] = null;
        }
        return new AtomicReferenceArray<>(objArr);
    }

    @y0(version = "2.1")
    @g
    public static final int e(@k AtomicIntegerArray atomicIntegerArray, int i11) {
        g0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i11, -1);
    }

    @y0(version = "2.1")
    @g
    public static final long f(@k AtomicLongArray atomicLongArray, int i11) {
        g0.p(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i11, -1L);
    }

    @y0(version = "2.1")
    @g
    public static final int g(@k AtomicIntegerArray atomicIntegerArray, int i11) {
        g0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i11, -1);
    }

    @y0(version = "2.1")
    @g
    public static final long h(@k AtomicLongArray atomicLongArray, int i11) {
        g0.p(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i11, -1L);
    }

    @y0(version = "2.1")
    @g
    public static final int i(@k AtomicIntegerArray atomicIntegerArray, int i11) {
        g0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.getAndAdd(i11, 1);
    }

    @y0(version = "2.1")
    @g
    public static final long j(@k AtomicLongArray atomicLongArray, int i11) {
        g0.p(atomicLongArray, "<this>");
        return atomicLongArray.getAndAdd(i11, 1L);
    }

    @y0(version = "2.1")
    @g
    public static final int k(@k AtomicIntegerArray atomicIntegerArray, int i11) {
        g0.p(atomicIntegerArray, "<this>");
        return atomicIntegerArray.addAndGet(i11, 1);
    }

    @y0(version = "2.1")
    @g
    public static final long l(@k AtomicLongArray atomicLongArray, int i11) {
        g0.p(atomicLongArray, "<this>");
        return atomicLongArray.addAndGet(i11, 1L);
    }
}
