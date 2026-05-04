package a00;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e2 {
    @w00.j(name = "sumOfUByte")
    @yz.y0(version = "1.5")
    public static final int a(@m80.k Iterable<yz.o1> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<yz.o1> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = yz.s1.i(i11 + yz.s1.i(it.next().k0() & 255));
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @yz.y0(version = "1.5")
    public static final int b(@m80.k Iterable<yz.s1> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<yz.s1> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = yz.s1.i(i11 + it.next().m0());
        }
        return i11;
    }

    @w00.j(name = "sumOfULong")
    @yz.y0(version = "1.5")
    public static final long c(@m80.k Iterable<yz.w1> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<yz.w1> it = iterable.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 = yz.w1.i(j11 + it.next().m0());
        }
        return j11;
    }

    @w00.j(name = "sumOfUShort")
    @yz.y0(version = "1.5")
    public static final int d(@m80.k Iterable<yz.c2> iterable) {
        kotlin.jvm.internal.g0.p(iterable, "<this>");
        Iterator<yz.c2> it = iterable.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = yz.s1.i(i11 + yz.s1.i(it.next().k0() & yz.c2.f100412d));
        }
        return i11;
    }

    @yz.y0(version = "1.3")
    @kotlin.d
    @m80.k
    public static final byte[] e(@m80.k Collection<yz.o1> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        byte[] d11 = yz.p1.d(collection.size());
        Iterator<yz.o1> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            yz.p1.u(d11, i11, it.next().k0());
            i11++;
        }
        return d11;
    }

    @yz.y0(version = "1.3")
    @kotlin.d
    @m80.k
    public static final int[] f(@m80.k Collection<yz.s1> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        int[] d11 = yz.t1.d(collection.size());
        Iterator<yz.s1> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            yz.t1.u(d11, i11, it.next().m0());
            i11++;
        }
        return d11;
    }

    @yz.y0(version = "1.3")
    @kotlin.d
    @m80.k
    public static final long[] g(@m80.k Collection<yz.w1> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        long[] d11 = yz.x1.d(collection.size());
        Iterator<yz.w1> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            yz.x1.u(d11, i11, it.next().m0());
            i11++;
        }
        return d11;
    }

    @yz.y0(version = "1.3")
    @kotlin.d
    @m80.k
    public static final short[] h(@m80.k Collection<yz.c2> collection) {
        kotlin.jvm.internal.g0.p(collection, "<this>");
        short[] d11 = yz.d2.d(collection.size());
        Iterator<yz.c2> it = collection.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            yz.d2.u(d11, i11, it.next().k0());
            i11++;
        }
        return d11;
    }
}
