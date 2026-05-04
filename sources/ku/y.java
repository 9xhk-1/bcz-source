package ku;

import com.typesafe.config.ConfigException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class y extends a {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList<a> f68880a;

    public y(Collection<a> collection) {
        this.f68880a = new ArrayList<>(collection);
    }

    @Override // ku.a
    public Collection<b2> a() {
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.f68880a.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().a());
        }
        return arrayList;
    }

    public List<String> c() {
        ArrayList arrayList = new ArrayList();
        Iterator<a> it = this.f68880a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if (next instanceof v) {
                arrayList.add(((v) next).d());
            }
        }
        return arrayList;
    }

    public b0 d() {
        for (int i11 = 0; i11 < this.f68880a.size(); i11++) {
            if (this.f68880a.get(i11) instanceof b0) {
                return (b0) this.f68880a.get(i11);
            }
        }
        throw new ConfigException.BugOrBroken("Field node doesn't have a path");
    }

    public y e(b bVar) {
        ArrayList arrayList = new ArrayList(this.f68880a);
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (arrayList.get(i11) instanceof b) {
                arrayList.set(i11, bVar);
                return new y(arrayList);
            }
        }
        throw new ConfigException.BugOrBroken("Field node doesn't have a value");
    }

    public b2 f() {
        b2 c11;
        Iterator<a> it = this.f68880a.iterator();
        while (it.hasNext()) {
            a next = it.next();
            if ((next instanceof e0) && ((c11 = ((e0) next).c()) == e2.f68710j || c11 == e2.f68705e || c11 == e2.f68704d)) {
                return c11;
            }
        }
        return null;
    }

    public b g() {
        for (int i11 = 0; i11 < this.f68880a.size(); i11++) {
            if (this.f68880a.get(i11) instanceof b) {
                return (b) this.f68880a.get(i11);
            }
        }
        throw new ConfigException.BugOrBroken("Field node doesn't have a value");
    }
}
