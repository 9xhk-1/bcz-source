package q30;

import java.util.Collection;
import java.util.Iterator;
import yz.g2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j00.f
@y0(version = "1.3")
/* loaded from: classes8.dex */
public abstract class o<T> {
    @m80.l
    public abstract Object b(T t11, @m80.k j00.c<? super g2> cVar);

    @m80.l
    public final Object c(@m80.k Iterable<? extends T> iterable, @m80.k j00.c<? super g2> cVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return g2.f100423a;
        }
        Object d11 = d(iterable.iterator(), cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    @m80.l
    public abstract Object d(@m80.k Iterator<? extends T> it, @m80.k j00.c<? super g2> cVar);

    @m80.l
    public final Object f(@m80.k m<? extends T> mVar, @m80.k j00.c<? super g2> cVar) {
        Object d11 = d(mVar.iterator(), cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }
}
