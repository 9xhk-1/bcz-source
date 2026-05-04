package mt;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class i extends a {
    public i(f fVar) {
        super(fVar);
    }

    @Override // mt.a, mt.b
    public /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // mt.a, mt.b
    public /* bridge */ /* synthetic */ d b() {
        return super.b();
    }

    @Override // mt.b
    public void c(List<String> list) {
        HashSet hashSet = new HashSet(this.f73674b.f73697k);
        hashSet.addAll(list);
        this.f73674b.k(hashSet, this);
    }

    @Override // mt.a, mt.b
    public /* bridge */ /* synthetic */ c d() {
        return super.d();
    }

    @Override // mt.b
    public void request() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.f73674b.f73690d) {
            if (jt.c.c(this.f73674b.f73687a, str)) {
                this.f73674b.f73697k.add(str);
            } else {
                arrayList.add(str);
            }
        }
        if (arrayList.isEmpty()) {
            a();
            return;
        }
        f fVar = this.f73674b;
        if (!fVar.f73693g || (fVar.f73703q == null && fVar.f73704r == null)) {
            fVar.k(fVar.f73690d, this);
            return;
        }
        fVar.f73693g = false;
        fVar.f73698l.addAll(arrayList);
        f fVar2 = this.f73674b;
        kt.b bVar = fVar2.f73704r;
        if (bVar != null) {
            bVar.a(this.f73675c, arrayList, true);
        } else {
            fVar2.f73703q.a(this.f73675c, arrayList);
        }
    }
}
