package p6;

import java.util.Iterator;
import java.util.List;
import m3.g1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@oa0.r
/* loaded from: classes3.dex */
public final class f {
    public final int a(@m80.k h5.m roundModel, @m80.k List<g1> result) {
        int b11;
        kotlin.jvm.internal.g0.p(roundModel, "roundModel");
        kotlin.jvm.internal.g0.p(result, "result");
        Iterator<T> it = result.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            b11 = g.b((g1) it.next());
            i11 += b11;
        }
        return i11;
    }
}
