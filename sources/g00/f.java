package g00;

import androidx.camera.view.q;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class f extends e {
    @y0(version = "2.2")
    @g
    @o00.f
    public static final int A(AtomicInteger atomicInteger, l<? super Integer, Integer> transform) {
        int i11;
        int intValue;
        g0.p(atomicInteger, "<this>");
        g0.p(transform, "transform");
        do {
            i11 = atomicInteger.get();
            intValue = transform.invoke(Integer.valueOf(i11)).intValue();
        } while (!atomicInteger.compareAndSet(i11, intValue));
        return intValue;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final long B(AtomicLong atomicLong, l<? super Long, Long> transform) {
        long j11;
        long longValue;
        g0.p(atomicLong, "<this>");
        g0.p(transform, "transform");
        do {
            j11 = atomicLong.get();
            longValue = transform.invoke(Long.valueOf(j11)).longValue();
        } while (!atomicLong.compareAndSet(j11, longValue));
        return longValue;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final <T> T C(AtomicReference<T> atomicReference, l<? super T, ? extends T> transform) {
        T t11;
        T invoke;
        g0.p(atomicReference, "<this>");
        g0.p(transform, "transform");
        do {
            t11 = atomicReference.get();
            invoke = transform.invoke(t11);
        } while (!q.a(atomicReference, t11, invoke));
        return invoke;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicBoolean m(@k AtomicBoolean atomicBoolean) {
        g0.p(atomicBoolean, "<this>");
        return atomicBoolean;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicInteger n(@k AtomicInteger atomicInteger) {
        g0.p(atomicInteger, "<this>");
        return atomicInteger;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicLong o(@k AtomicLong atomicLong) {
        g0.p(atomicLong, "<this>");
        return atomicLong;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final <T> AtomicReference<T> p(@k AtomicReference<T> atomicReference) {
        g0.p(atomicReference, "<this>");
        return atomicReference;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicBoolean q(@k AtomicBoolean atomicBoolean) {
        g0.p(atomicBoolean, "<this>");
        return atomicBoolean;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicInteger r(@k AtomicInteger atomicInteger) {
        g0.p(atomicInteger, "<this>");
        return atomicInteger;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final AtomicLong s(@k AtomicLong atomicLong) {
        g0.p(atomicLong, "<this>");
        return atomicLong;
    }

    @y0(version = "2.1")
    @g
    @k
    public static final <T> AtomicReference<T> t(@k AtomicReference<T> atomicReference) {
        g0.p(atomicReference, "<this>");
        return atomicReference;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final int u(AtomicInteger atomicInteger, l<? super Integer, Integer> transform) {
        int i11;
        g0.p(atomicInteger, "<this>");
        g0.p(transform, "transform");
        do {
            i11 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i11, transform.invoke(Integer.valueOf(i11)).intValue()));
        return i11;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final long v(AtomicLong atomicLong, l<? super Long, Long> transform) {
        long j11;
        g0.p(atomicLong, "<this>");
        g0.p(transform, "transform");
        do {
            j11 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j11, transform.invoke(Long.valueOf(j11)).longValue()));
        return j11;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final <T> T w(AtomicReference<T> atomicReference, l<? super T, ? extends T> transform) {
        T t11;
        g0.p(atomicReference, "<this>");
        g0.p(transform, "transform");
        do {
            t11 = atomicReference.get();
        } while (!q.a(atomicReference, t11, transform.invoke(t11)));
        return t11;
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final void x(AtomicInteger atomicInteger, l<? super Integer, Integer> transform) {
        int i11;
        g0.p(atomicInteger, "<this>");
        g0.p(transform, "transform");
        do {
            i11 = atomicInteger.get();
        } while (!atomicInteger.compareAndSet(i11, transform.invoke(Integer.valueOf(i11)).intValue()));
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final void y(AtomicLong atomicLong, l<? super Long, Long> transform) {
        long j11;
        g0.p(atomicLong, "<this>");
        g0.p(transform, "transform");
        do {
            j11 = atomicLong.get();
        } while (!atomicLong.compareAndSet(j11, transform.invoke(Long.valueOf(j11)).longValue()));
    }

    @y0(version = "2.2")
    @g
    @o00.f
    public static final <T> void z(AtomicReference<T> atomicReference, l<? super T, ? extends T> transform) {
        T t11;
        g0.p(atomicReference, "<this>");
        g0.p(transform, "transform");
        do {
            t11 = atomicReference.get();
        } while (!q.a(atomicReference, t11, transform.invoke(t11)));
    }
}
