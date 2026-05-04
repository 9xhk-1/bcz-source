package ij;

import java.util.List;
import java.util.Map;
import java.util.Set;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public interface v extends u, m, g {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
    }

    static /* synthetic */ Object Y(v vVar, long j11, int i11, long j12, j00.c cVar, int i12, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateBookWordCount");
        }
        if ((i12 & 4) != 0) {
            j12 = 0;
        }
        return vVar.n(j11, i11, j12, cVar);
    }

    static /* synthetic */ Object g0(v vVar, long j11, List list, boolean z11, j00.c cVar, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addWords");
        }
        if ((i11 & 4) != 0) {
            z11 = false;
        }
        return vVar.e0(j11, list, z11, cVar);
    }

    @m80.l
    Object G(long j11, long j12, int i11, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object H(@m80.k j00.c<? super List<Integer>> cVar);

    @m80.l
    Object J(@m80.k z zVar, @m80.k Set<Long> set, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object N(long j11, @m80.k j00.c<? super kj.a> cVar);

    @m80.l
    Object R(@m80.k kj.a aVar, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object T(long j11, @m80.k j00.c<? super kj.b> cVar);

    @m80.l
    Object U(@m80.k kj.c[] cVarArr, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object a(long j11, @m80.k j00.c<? super List<kj.b>> cVar);

    @m80.l
    Object d(@m80.k j00.c<? super List<kj.a>> cVar);

    @m80.l
    Object e(@m80.k Set<Long> set, @m80.k List<z> list, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object e0(long j11, @m80.k List<z> list, boolean z11, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object f0(@m80.k Map<Long, ? extends List<z>> map, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object g(long j11, @m80.k List<Long> list, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object h(long j11, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object i0(@m80.k kj.a aVar, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object j(long j11, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object l(int i11, @m80.k j00.c<? super List<kj.b>> cVar);

    @m80.l
    Object l0(@m80.k kj.b[] bVarArr, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object n(long j11, int i11, long j12, @m80.k j00.c<? super g2> cVar);

    @m80.l
    Object s(@m80.k j00.c<? super List<kj.b>> cVar);

    @m80.l
    Object x(long j11, @m80.k j00.c<? super Integer> cVar);
}
