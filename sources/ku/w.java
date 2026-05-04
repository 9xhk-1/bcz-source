package ku;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class w extends b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f68855a;

    public w(Collection<a> collection) {
        this.f68855a = new ArrayList<>(collection);
    }

    @Override // ku.a
    public Collection<b2> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.f68855a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().a());
        }
        return arrayList;
    }

    public final Collection<a> c() {
        return this.f68855a;
    }

    public w d(a aVar) {
        ArrayList arrayList = new ArrayList(this.f68855a);
        int i11 = 0;
        while (i11 < arrayList.size()) {
            a aVar2 = (a) arrayList.get(i11);
            if ((aVar2 instanceof e0) && e2.l(((e0) aVar2).c())) {
                i11++;
                arrayList.add(i11, aVar);
            } else if (aVar2 instanceof y) {
                y yVar = (y) aVar2;
                b g11 = yVar.g();
                if (g11 instanceof w) {
                    arrayList.set(i11, yVar.e(((w) g11).d(aVar)));
                }
            } else if (aVar2 instanceof w) {
                arrayList.set(i11, ((w) aVar2).d(aVar));
            }
            i11++;
        }
        return e(arrayList);
    }

    public abstract w e(Collection<a> collection);
}
