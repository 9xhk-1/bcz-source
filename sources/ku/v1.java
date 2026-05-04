package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import ku.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class v1 extends ku.d implements ju.h, k0, Serializable {
    private static final long serialVersionUID = 2;

    /* renamed from: b, reason: collision with root package name */
    public final List<ku.d> f68846b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f68847c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends d.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0 f68848b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0 s0Var) {
            super();
            this.f68848b = s0Var;
        }

        @Override // ku.d.b
        public ku.d b(String str, ku.d dVar) {
            return dVar.I0(this.f68848b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Iterator<ju.t> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Iterator f68850a;

        public b(Iterator it) {
            this.f68850a = it;
        }

        @Override // java.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ju.t next() {
            return (ju.t) this.f68850a.next();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f68850a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            throw v1.g1("iterator().remove");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class c implements ListIterator<ju.t> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ ListIterator f68852a;

        public c(ListIterator listIterator) {
            this.f68852a = listIterator;
        }

        @Override // java.util.ListIterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void add(ju.t tVar) {
            throw v1.g1("listIterator().add");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ju.t next() {
            return (ju.t) this.f68852a.next();
        }

        @Override // java.util.ListIterator
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public ju.t previous() {
            return (ju.t) this.f68852a.previous();
        }

        @Override // java.util.ListIterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void set(ju.t tVar) {
            throw v1.g1("listIterator().set");
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public boolean hasNext() {
            return this.f68852a.hasNext();
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return this.f68852a.hasPrevious();
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return this.f68852a.nextIndex();
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return this.f68852a.previousIndex();
        }

        @Override // java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw v1.g1("listIterator().remove");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public x0 f68853a;

        /* renamed from: b, reason: collision with root package name */
        public final a1 f68854b;

        public d(x0 x0Var, a1 a1Var) {
            this.f68853a = x0Var;
            this.f68854b = a1Var;
        }

        @Override // ku.d.a
        public ku.d a(String str, ku.d dVar) throws d.c {
            z0<? extends ku.d> l11 = this.f68853a.l(dVar, this.f68854b);
            this.f68853a = l11.f68887a;
            return l11.f68888b;
        }
    }

    public v1(ju.m mVar, List<ku.d> list) {
        this(mVar, list, b1.b(list));
    }

    public static UnsupportedOperationException g1(String str) {
        return new UnsupportedOperationException("ConfigList is immutable, you can't call List.'" + str + "'");
    }

    public static ListIterator<ju.t> i1(ListIterator<ku.d> listIterator) {
        return new c(listIterator);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new c1(this);
    }

    @Override // ku.k0
    public boolean C(ku.d dVar) {
        return ku.d.u0(this.f68846b, dVar);
    }

    @Override // ku.d
    public void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar) {
        if (this.f68846b.isEmpty()) {
            sb2.append(okhttp3.i.f77289p);
            return;
        }
        sb2.append("[");
        if (qVar.d()) {
            sb2.append('\n');
        }
        for (ku.d dVar : this.f68846b) {
            if (qVar.f()) {
                for (String str : dVar.g().description().split("\n")) {
                    ku.d.y0(sb2, i11 + 1, qVar);
                    sb2.append('#');
                    if (!str.isEmpty()) {
                        sb2.append(' ');
                    }
                    sb2.append(str);
                    sb2.append("\n");
                }
            }
            if (qVar.c()) {
                for (String str2 : dVar.g().b()) {
                    ku.d.y0(sb2, i11 + 1, qVar);
                    sb2.append("# ");
                    sb2.append(str2);
                    sb2.append("\n");
                }
            }
            int i12 = i11 + 1;
            ku.d.y0(sb2, i12, qVar);
            dVar.K0(sb2, i12, z11, qVar);
            sb2.append(",");
            if (qVar.d()) {
                sb2.append('\n');
            }
        }
        sb2.setLength(sb2.length() - 1);
        if (qVar.d()) {
            sb2.setLength(sb2.length() - 1);
            sb2.append('\n');
            ku.d.y0(sb2, i11, qVar);
        }
        sb2.append("]");
    }

    @Override // ku.d
    public b1 N0() {
        return b1.a(this.f68847c);
    }

    @Override // ku.d
    public z0<? extends v1> O0(x0 x0Var, a1 a1Var) throws d.c {
        if (this.f68847c) {
            return z0.c(x0Var, this);
        }
        if (x0Var.c()) {
            return z0.c(x0Var, this);
        }
        try {
            d dVar = new d(x0Var, a1Var.e(this));
            return z0.c(dVar.f68853a, a1(dVar, x0Var.f().c() ? null : b1.RESOLVED));
        } catch (RuntimeException e11) {
            throw e11;
        } catch (d.c e12) {
            throw e12;
        } catch (Exception e13) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e13);
        }
    }

    @Override // java.util.List
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public void add(int i11, ju.t tVar) {
        throw g1("add");
    }

    @Override // java.util.List, java.util.Collection
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public boolean add(ju.t tVar) {
        throw g1("add");
    }

    public final v1 X0(v1 v1Var) {
        ju.m p11 = x1.p(g(), v1Var.g());
        ArrayList arrayList = new ArrayList(this.f68846b.size() + v1Var.f68846b.size());
        arrayList.addAll(this.f68846b);
        arrayList.addAll(v1Var.f68846b);
        return new v1(p11, arrayList);
    }

    @Override // java.util.List
    /* renamed from: Y0, reason: merged with bridge method [inline-methods] */
    public ku.d get(int i11) {
        return this.f68846b.get(i11);
    }

    public final v1 Z0(d.b bVar, b1 b1Var) {
        try {
            return a1(bVar, b1Var);
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e12);
        }
    }

    public final v1 a1(d.a aVar, b1 b1Var) throws Exception {
        ArrayList arrayList = null;
        int i11 = 0;
        for (ku.d dVar : this.f68846b) {
            ku.d a11 = aVar.a(null, dVar);
            if (arrayList == null && a11 != dVar) {
                arrayList = new ArrayList();
                for (int i12 = 0; i12 < i11; i12++) {
                    arrayList.add(this.f68846b.get(i12));
                }
            }
            if (arrayList != null && a11 != null) {
                arrayList.add(a11);
            }
            i11++;
        }
        return arrayList != null ? b1Var != null ? new v1(g(), arrayList, b1Var) : new v1(g(), arrayList) : this;
    }

    @Override // java.util.List, java.util.Collection
    public boolean addAll(Collection<? extends ju.t> collection) {
        throw g1("addAll");
    }

    @Override // ku.d
    /* renamed from: b1, reason: merged with bridge method [inline-methods] */
    public v1 G0(ju.m mVar) {
        return new v1(mVar, this.f68846b);
    }

    @Override // ku.d
    /* renamed from: c1, reason: merged with bridge method [inline-methods] */
    public v1 I0(s0 s0Var) {
        return Z0(new a(s0Var), N0());
    }

    @Override // java.util.List, java.util.Collection
    public void clear() {
        throw g1(kc.o.N);
    }

    @Override // java.util.List, java.util.Collection
    public boolean contains(Object obj) {
        return this.f68846b.contains(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean containsAll(Collection<?> collection) {
        return this.f68846b.containsAll(collection);
    }

    @Override // java.util.List
    /* renamed from: d1, reason: merged with bridge method [inline-methods] */
    public ju.t remove(int i11) {
        throw g1("remove");
    }

    @Override // ku.k0
    /* renamed from: e1, reason: merged with bridge method [inline-methods] */
    public v1 B(ku.d dVar, ku.d dVar2) {
        List<ku.d> L0 = ku.d.L0(this.f68846b, dVar, dVar2);
        if (L0 == null) {
            return null;
        }
        return new v1(g(), L0);
    }

    @Override // ku.d
    public boolean equals(Object obj) {
        List<ku.d> list;
        List<ku.d> list2;
        return (obj instanceof v1) && q0(obj) && ((list = this.f68846b) == (list2 = ((v1) obj).f68846b) || list.equals(list2));
    }

    @Override // java.util.List
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public ju.t set(int i11, ju.t tVar) {
        throw g1(ct.d.f46854h);
    }

    @Override // ku.d, ju.t
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public v1 e(ju.m mVar) {
        return (v1) super.e(mVar);
    }

    @Override // ku.d
    public int hashCode() {
        return this.f68846b.hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return this.f68846b.indexOf(obj);
    }

    @Override // java.util.List, java.util.Collection
    public boolean isEmpty() {
        return this.f68846b.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public Iterator<ju.t> iterator() {
        return new b(this.f68846b.iterator());
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return this.f68846b.lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<ju.t> listIterator() {
        return i1(this.f68846b.listIterator());
    }

    @Override // ku.d
    public boolean q0(Object obj) {
        return obj instanceof v1;
    }

    @Override // java.util.List, java.util.Collection
    public boolean removeAll(Collection<?> collection) {
        throw g1("removeAll");
    }

    @Override // java.util.List, java.util.Collection
    public boolean retainAll(Collection<?> collection) {
        throw g1("retainAll");
    }

    @Override // java.util.List, java.util.Collection
    public int size() {
        return this.f68846b.size();
    }

    @Override // java.util.List
    public List<ju.t> subList(int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        Iterator<ku.d> it = this.f68846b.subList(i11, i12).iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        return arrayList;
    }

    @Override // java.util.List, java.util.Collection
    public Object[] toArray() {
        return this.f68846b.toArray();
    }

    @Override // ju.t
    public ConfigValueType valueType() {
        return ConfigValueType.LIST;
    }

    @Override // java.util.List
    public boolean addAll(int i11, Collection<? extends ju.t> collection) {
        throw g1("addAll");
    }

    @Override // ju.t
    public List<Object> c() {
        ArrayList arrayList = new ArrayList();
        Iterator<ku.d> it = this.f68846b.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().c());
        }
        return arrayList;
    }

    @Override // java.util.List
    public ListIterator<ju.t> listIterator(int i11) {
        return i1(this.f68846b.listIterator(i11));
    }

    @Override // java.util.List, java.util.Collection
    public boolean remove(Object obj) {
        throw g1("remove");
    }

    @Override // java.util.List, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f68846b.toArray(tArr);
    }

    public v1(ju.m mVar, List<ku.d> list, b1 b1Var) {
        super(mVar);
        this.f68846b = list;
        this.f68847c = b1Var == b1.RESOLVED;
        if (b1Var == b1.b(list)) {
            return;
        }
        throw new ConfigException.BugOrBroken("SimpleConfigList created with wrong resolve status: " + this);
    }
}
