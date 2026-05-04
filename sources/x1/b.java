package x1;

import java.util.Comparator;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class b implements Iterable<a>, Comparator<a>, Comparable<b> {

    /* renamed from: a, reason: collision with root package name */
    public long f97004a;

    /* renamed from: b, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<a> f97005b = new com.badlogic.gdx.utils.a<>();

    /* renamed from: c, reason: collision with root package name */
    public boolean f97006c = true;

    public final void A() {
        if (this.f97006c) {
            return;
        }
        this.f97005b.sort(this);
        this.f97006c = true;
    }

    public int a() {
        A();
        int i11 = this.f97005b.f13179b;
        long j11 = this.f97004a + 71;
        int i12 = 1;
        for (int i13 = 0; i13 < i11; i13++) {
            i12 = (i12 * 7) & 65535;
            j11 += this.f97004a * this.f97005b.get(i13).hashCode() * i12;
        }
        return (int) ((j11 >> 32) ^ j11);
    }

    @Override // java.util.Comparator
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final int compare(a aVar, a aVar2) {
        return (int) (aVar.f97002a - aVar2.f97002a);
    }

    public void clear() {
        this.f97004a = 0L;
        this.f97005b.clear();
    }

    @Override // java.lang.Comparable
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public int compareTo(b bVar) {
        if (bVar == this) {
            return 0;
        }
        long j11 = this.f97004a;
        long j12 = bVar.f97004a;
        if (j11 != j12) {
            return j11 < j12 ? -1 : 1;
        }
        A();
        bVar.A();
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<a> aVar = this.f97005b;
            if (i11 >= aVar.f13179b) {
                return 0;
            }
            int compareTo = aVar.get(i11).compareTo(bVar.f97005b.get(i11));
            if (compareTo != 0) {
                if (compareTo < 0) {
                    return -1;
                }
                return compareTo > 0 ? 1 : 0;
            }
            i11++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return t((b) obj, true);
    }

    public final void f(long j11) {
        this.f97004a = (~j11) & this.f97004a;
    }

    public final void g(long j11) {
        this.f97004a = j11 | this.f97004a;
    }

    public int hashCode() {
        return a();
    }

    @Override // java.lang.Iterable
    public final Iterator<a> iterator() {
        return this.f97005b.iterator();
    }

    public final com.badlogic.gdx.utils.a<a> k(com.badlogic.gdx.utils.a<a> aVar, long j11) {
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<a> aVar2 = this.f97005b;
            if (i11 >= aVar2.f13179b) {
                return aVar;
            }
            if ((aVar2.get(i11).f97002a & j11) != 0) {
                aVar.a(this.f97005b.get(i11));
            }
            i11++;
        }
    }

    public final a l(long j11) {
        if (!p(j11)) {
            return null;
        }
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<a> aVar = this.f97005b;
            if (i11 >= aVar.f13179b) {
                return null;
            }
            if (aVar.get(i11).f97002a == j11) {
                return this.f97005b.get(i11);
            }
            i11++;
        }
    }

    public final <T extends a> T m(Class<T> cls, long j11) {
        return (T) l(j11);
    }

    public final long o() {
        return this.f97004a;
    }

    public final boolean p(long j11) {
        return j11 != 0 && (this.f97004a & j11) == j11;
    }

    public int q(long j11) {
        if (!p(j11)) {
            return -1;
        }
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<a> aVar = this.f97005b;
            if (i11 >= aVar.f13179b) {
                return -1;
            }
            if (aVar.get(i11).f97002a == j11) {
                return i11;
            }
            i11++;
        }
    }

    public final void r(long j11) {
        for (int i11 = this.f97005b.f13179b - 1; i11 >= 0; i11--) {
            long j12 = this.f97005b.get(i11).f97002a;
            if ((j11 & j12) == j12) {
                this.f97005b.A(i11);
                f(j12);
                this.f97006c = false;
            }
        }
        A();
    }

    public final boolean s(b bVar) {
        return t(bVar, false);
    }

    public int size() {
        return this.f97005b.f13179b;
    }

    public final boolean t(b bVar, boolean z11) {
        if (bVar == this) {
            return true;
        }
        if (bVar == null || this.f97004a != bVar.f97004a) {
            return false;
        }
        if (!z11) {
            return true;
        }
        A();
        bVar.A();
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<a> aVar = this.f97005b;
            if (i11 >= aVar.f13179b) {
                return true;
            }
            if (!aVar.get(i11).b(bVar.f97005b.get(i11))) {
                return false;
            }
            i11++;
        }
    }

    public final void u(Iterable<a> iterable) {
        Iterator<a> it = iterable.iterator();
        while (it.hasNext()) {
            v(it.next());
        }
    }

    public final void v(a aVar) {
        int q11 = q(aVar.f97002a);
        if (q11 < 0) {
            g(aVar.f97002a);
            this.f97005b.a(aVar);
            this.f97006c = false;
        } else {
            this.f97005b.K(q11, aVar);
        }
        A();
    }

    public final void w(a aVar, a aVar2) {
        v(aVar);
        v(aVar2);
    }

    public final void x(a aVar, a aVar2, a aVar3) {
        v(aVar);
        v(aVar2);
        v(aVar3);
    }

    public final void y(a aVar, a aVar2, a aVar3, a aVar4) {
        v(aVar);
        v(aVar2);
        v(aVar3);
        v(aVar4);
    }

    public final void z(a... aVarArr) {
        for (a aVar : aVarArr) {
            v(aVar);
        }
    }
}
