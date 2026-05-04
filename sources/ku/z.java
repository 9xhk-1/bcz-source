package ku;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class z extends a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f68884a;

    /* renamed from: b, reason: collision with root package name */
    public final r f68885b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f68886c;

    public z(Collection<a> collection, r rVar, boolean z11) {
        this.f68884a = new ArrayList<>(collection);
        this.f68885b = rVar;
        this.f68886c = z11;
    }

    @Override // ku.a
    public Collection<b2> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.f68884a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().a());
        }
        return arrayList;
    }

    public final Collection<a> c() {
        return this.f68884a;
    }

    public boolean d() {
        return this.f68886c;
    }

    public r e() {
        return this.f68885b;
    }

    public String f() {
        Iterator<a> it = this.f68884a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next instanceof d0) {
                return (String) e2.i(((d0) next).c()).c();
            }
        }
        return null;
    }
}
