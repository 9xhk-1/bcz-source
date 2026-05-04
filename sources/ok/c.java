package ok;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final Map<d, Integer> f77093a;

    /* renamed from: b, reason: collision with root package name */
    public final List<d> f77094b;

    /* renamed from: c, reason: collision with root package name */
    public int f77095c;

    /* renamed from: d, reason: collision with root package name */
    public int f77096d;

    public c(Map<d, Integer> map) {
        this.f77093a = map;
        this.f77094b = new ArrayList(map.keySet());
        Iterator<Integer> it = map.values().iterator();
        while (it.hasNext()) {
            this.f77095c += it.next().intValue();
        }
    }

    public int a() {
        return this.f77095c;
    }

    public boolean b() {
        return this.f77095c == 0;
    }

    public d c() {
        d dVar = this.f77094b.get(this.f77096d);
        Integer num = this.f77093a.get(dVar);
        if (num.intValue() == 1) {
            this.f77093a.remove(dVar);
            this.f77094b.remove(this.f77096d);
        } else {
            this.f77093a.put(dVar, Integer.valueOf(num.intValue() - 1));
        }
        this.f77095c--;
        this.f77096d = this.f77094b.isEmpty() ? 0 : (this.f77096d + 1) % this.f77094b.size();
        return dVar;
    }
}
