package bb0;

import a00.m;
import a00.n0;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.g0;
import m80.k;
import oa0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class b {
    @g
    @k
    public static final Set<cb0.b> a(@k List<cb0.b> scopes) {
        g0.p(scopes, "scopes");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        m mVar = new m(n0.c1(scopes));
        while (!mVar.isEmpty()) {
            cb0.b bVar = (cb0.b) mVar.removeLast();
            if (linkedHashSet.add(bVar)) {
                Iterator<cb0.b> it = bVar.r().iterator();
                g0.o(it, "iterator(...)");
                while (it.hasNext()) {
                    cb0.b next = it.next();
                    g0.o(next, "next(...)");
                    cb0.b bVar2 = next;
                    if (!linkedHashSet.contains(bVar2)) {
                        mVar.add(bVar2);
                    }
                }
            }
        }
        return linkedHashSet;
    }
}
