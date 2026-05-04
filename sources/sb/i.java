package sb;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import okhttp3.l;
import t50.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class i implements n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ConcurrentHashMap<l, Pair<Integer, Integer>> f88258a = new ConcurrentHashMap<>();

    public static /* synthetic */ Pair b(i iVar, l lVar, int i11, int i12, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            i12 = 0;
        }
        return iVar.a(lVar, i11, i12);
    }

    @m80.l
    public final Pair<Integer, Integer> a(@m80.k l request, int i11, int i12) {
        g0.p(request, "request");
        return this.f88258a.put(request, new Pair<>(Integer.valueOf(i11), Integer.valueOf(i12)));
    }

    @Override // t50.n
    @m80.k
    public okhttp3.n intercept(@m80.k n.a chain) {
        n.a aVar;
        n.a e11;
        g0.p(chain, "chain");
        Pair<Integer, Integer> pair = this.f88258a.get(chain.request());
        if (pair == null) {
            aVar = chain;
        } else {
            Integer first = pair.getFirst();
            if (first.intValue() <= 0) {
                first = null;
            }
            Integer num = first;
            if (num == null || (aVar = chain.d(num.intValue(), TimeUnit.MILLISECONDS)) == null) {
                aVar = chain;
            }
            Integer second = pair.getSecond();
            Integer num2 = second.intValue() > 0 ? second : null;
            if (num2 != null && (e11 = aVar.e(num2.intValue(), TimeUnit.MILLISECONDS)) != null) {
                aVar = e11;
            }
        }
        this.f88258a.remove(chain.request());
        return aVar.c(chain.request());
    }
}
