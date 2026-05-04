package ll;

import com.esotericsoftware.spine.Animation;
import com.esotericsoftware.spine.h;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import jl.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public class e implements b {

    /* renamed from: a, reason: collision with root package name */
    public final List<String> f71505a;

    /* renamed from: b, reason: collision with root package name */
    public final String f71506b;

    /* renamed from: c, reason: collision with root package name */
    public final double f71507c;

    public e(List<String> list, String str, double d11) {
        this.f71505a = (list == null || list.isEmpty()) ? Collections.singletonList("default") : list;
        this.f71506b = str;
        this.f71507c = d11;
    }

    @Override // ll.b
    public a a(kl.b bVar) {
        double d11;
        double d12;
        double d13;
        double d14;
        i h11 = bVar.h();
        h u11 = bVar.g().u();
        h hVar = new h("custom-skin");
        Iterator<String> it = this.f71505a.iterator();
        while (it.hasNext()) {
            h g11 = h11.g(it.next());
            if (g11 != null) {
                hVar.a(g11);
            }
        }
        bVar.g().M(hVar);
        bVar.g().Q();
        String str = this.f71506b;
        Animation a11 = str != null ? h11.a(str) : null;
        if (a11 == null) {
            a aVar = new a(bVar.g());
            double c11 = aVar.c();
            double d15 = aVar.d();
            d13 = aVar.b() + c11;
            d14 = aVar.a() + d15;
            d11 = c11;
            d12 = d15;
        } else {
            bVar.d().w(0, a11, false);
            int max = (int) Math.max(a11.b() / this.f71507c, 1.0d);
            double d16 = Double.POSITIVE_INFINITY;
            double d17 = Double.NEGATIVE_INFINITY;
            double d18 = Double.NEGATIVE_INFINITY;
            int i11 = 0;
            double d19 = Double.POSITIVE_INFINITY;
            while (i11 < max) {
                double d21 = d19;
                bVar.i(i11 > 0 ? (float) this.f71507c : 0.0f);
                a aVar2 = new a(bVar.g());
                double min = Math.min(d21, aVar2.c());
                d16 = Math.min(d16, aVar2.d());
                d17 = Math.max(d17, min + aVar2.b());
                d18 = Math.max(d18, aVar2.a() + d16);
                i11++;
                d19 = min;
            }
            d11 = d19;
            d12 = d16;
            d13 = d17;
            d14 = d18;
        }
        bVar.g().N("default");
        bVar.d().n();
        if (u11 != null) {
            bVar.g().M(u11);
        }
        bVar.g().Q();
        bVar.i(0.0f);
        return new a(d11, d12, d13 - d11, d14 - d12);
    }

    public e(List<String> list, String str) {
        this(list, str, 0.1d);
    }

    public e(String str) {
        this(Collections.EMPTY_LIST, str, 0.1d);
    }
}
