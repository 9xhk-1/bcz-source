package q30;

import java.util.Iterator;
import yz.c2;
import yz.o1;
import yz.s1;
import yz.w1;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class v0 {
    @w00.j(name = "sumOfUByte")
    @y0(version = "1.5")
    public static final int a(@m80.k m<o1> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<o1> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = s1.i(i11 + s1.i(it.next().k0() & 255));
        }
        return i11;
    }

    @w00.j(name = "sumOfUInt")
    @y0(version = "1.5")
    public static final int b(@m80.k m<s1> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<s1> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = s1.i(i11 + it.next().m0());
        }
        return i11;
    }

    @w00.j(name = "sumOfULong")
    @y0(version = "1.5")
    public static final long c(@m80.k m<w1> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<w1> it = mVar.iterator();
        long j11 = 0;
        while (it.hasNext()) {
            j11 = w1.i(j11 + it.next().m0());
        }
        return j11;
    }

    @w00.j(name = "sumOfUShort")
    @y0(version = "1.5")
    public static final int d(@m80.k m<c2> mVar) {
        kotlin.jvm.internal.g0.p(mVar, "<this>");
        Iterator<c2> it = mVar.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 = s1.i(i11 + s1.i(it.next().k0() & c2.f100412d));
        }
        return i11;
    }
}
