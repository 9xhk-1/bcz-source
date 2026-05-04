package g00;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.jvm.internal.g0;
import m80.k;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e {
    @y0(version = "2.1")
    @g
    public static final int a(@k AtomicInteger atomicInteger) {
        g0.p(atomicInteger, "<this>");
        return atomicInteger.addAndGet(-1);
    }

    @y0(version = "2.1")
    @g
    public static final long b(@k AtomicLong atomicLong) {
        g0.p(atomicLong, "<this>");
        return atomicLong.addAndGet(-1L);
    }

    @y0(version = "2.1")
    @g
    public static final int c(@k AtomicInteger atomicInteger) {
        g0.p(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(-1);
    }

    @y0(version = "2.1")
    @g
    public static final long d(@k AtomicLong atomicLong) {
        g0.p(atomicLong, "<this>");
        return atomicLong.getAndAdd(-1L);
    }

    @y0(version = "2.1")
    @g
    public static final int e(@k AtomicInteger atomicInteger) {
        g0.p(atomicInteger, "<this>");
        return atomicInteger.getAndAdd(1);
    }

    @y0(version = "2.1")
    @g
    public static final long f(@k AtomicLong atomicLong) {
        g0.p(atomicLong, "<this>");
        return atomicLong.getAndAdd(1L);
    }

    @y0(version = "2.1")
    @g
    public static final int g(@k AtomicInteger atomicInteger) {
        g0.p(atomicInteger, "<this>");
        return atomicInteger.addAndGet(1);
    }

    @y0(version = "2.1")
    @g
    public static final long h(@k AtomicLong atomicLong) {
        g0.p(atomicLong, "<this>");
        return atomicLong.addAndGet(1L);
    }

    @y0(version = "2.1")
    @g
    public static final void i(@k AtomicInteger atomicInteger, int i11) {
        g0.p(atomicInteger, "<this>");
        atomicInteger.addAndGet(-i11);
    }

    @y0(version = "2.1")
    @g
    public static final void j(@k AtomicLong atomicLong, long j11) {
        g0.p(atomicLong, "<this>");
        atomicLong.addAndGet(-j11);
    }

    @y0(version = "2.1")
    @g
    public static final void k(@k AtomicInteger atomicInteger, int i11) {
        g0.p(atomicInteger, "<this>");
        atomicInteger.addAndGet(i11);
    }

    @y0(version = "2.1")
    @g
    public static final void l(@k AtomicLong atomicLong, long j11) {
        g0.p(atomicLong, "<this>");
        atomicLong.addAndGet(j11);
    }
}
