package ku;

import com.typesafe.config.ConfigException;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.math.BigInteger;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import ku.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class w1 extends ku.c implements Serializable {

    /* renamed from: f, reason: collision with root package name */
    public static final String f68856f = "empty config";

    /* renamed from: g, reason: collision with root package name */
    public static final w1 f68857g = v1(x1.w(f68856f));
    private static final long serialVersionUID = 2;

    /* renamed from: c, reason: collision with root package name */
    public final Map<String, d> f68858c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f68859d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f68860e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends d.b {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s0 f68861b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(s0 s0Var) {
            super();
            this.f68861b = s0Var;
        }

        @Override // ku.d.b
        public d b(String str, d dVar) {
            return dVar.I0(this.f68861b);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b implements Comparator<String>, Serializable {
        private static final long serialVersionUID = 1;

        public b() {
        }

        public static boolean b(String str) {
            int length = str.length();
            if (length == 0) {
                return false;
            }
            for (int i11 = 0; i11 < length; i11++) {
                if (!Character.isDigit(str.charAt(i11))) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(String str, String str2) {
            boolean b11 = b(str);
            boolean b12 = b(str2);
            if (b11 && b12) {
                return new BigInteger(str).compareTo(new BigInteger(str2));
            }
            if (b11) {
                return -1;
            }
            if (b12) {
                return 1;
            }
            return str.compareTo(str2);
        }

        public /* synthetic */ b(a aVar) {
            this();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class c implements d.a {

        /* renamed from: a, reason: collision with root package name */
        public final s0 f68863a;

        /* renamed from: b, reason: collision with root package name */
        public x0 f68864b;

        /* renamed from: c, reason: collision with root package name */
        public final a1 f68865c;

        public c(x0 x0Var, a1 a1Var) {
            this.f68864b = x0Var;
            this.f68865c = a1Var;
            this.f68863a = x0Var.n();
        }

        @Override // ku.d.a
        public d a(String str, d dVar) throws d.c {
            s0 j11;
            if (!this.f68864b.c()) {
                z0<? extends d> l11 = this.f68864b.p().l(dVar, this.f68865c);
                this.f68864b = l11.f68887a.p().m(this.f68863a);
                return l11.f68888b;
            }
            if (!str.equals(this.f68864b.n().b()) || (j11 = this.f68864b.n().j()) == null) {
                return dVar;
            }
            z0<? extends d> l12 = this.f68864b.m(j11).l(dVar, this.f68865c);
            this.f68864b = l12.f68887a.p().m(this.f68863a);
            return l12.f68888b;
        }
    }

    public w1(ju.m mVar, Map<String, d> map, b1 b1Var, boolean z11) {
        super(mVar);
        if (map == null) {
            throw new ConfigException.BugOrBroken("creating config object with null map");
        }
        this.f68858c = map;
        this.f68859d = b1Var == b1.RESOLVED;
        this.f68860e = z11;
        if (b1Var == b1.b(map.values())) {
            return;
        }
        throw new ConfigException.BugOrBroken("Wrong resolved status on " + this);
    }

    public static final w1 u1() {
        return f68857g;
    }

    public static final w1 v1(ju.m mVar) {
        return mVar == null ? u1() : new w1(mVar, Collections.EMPTY_MAP);
    }

    public static final w1 w1(ju.m mVar) {
        return new w1(x1.w(mVar.description() + " (not found)"), Collections.EMPTY_MAP);
    }

    private Object writeReplace() throws ObjectStreamException {
        return new c1(this);
    }

    public static boolean x1(Map<String, ju.t> map, Map<String, ju.t> map2) {
        if (map == map2) {
            return true;
        }
        Set<String> keySet = map.keySet();
        if (!keySet.equals(map2.keySet())) {
            return false;
        }
        for (String str : keySet) {
            if (!map.get(str).equals(map2.get(str))) {
                return false;
            }
        }
        return true;
    }

    public static int y1(Map<String, ju.t> map) {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(map.keySet());
        Collections.sort(arrayList);
        Iterator it = arrayList.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += map.get((String) it.next()).hashCode();
        }
        return ((arrayList.hashCode() + 41) * 41) + i11;
    }

    public final w1 A1(d.b bVar) {
        try {
            return B1(bVar);
        } catch (RuntimeException e11) {
            throw e11;
        } catch (Exception e12) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e12);
        }
    }

    public final w1 B1(d.a aVar) throws Exception {
        HashMap hashMap = null;
        for (String str : keySet()) {
            d dVar = this.f68858c.get(str);
            d a11 = aVar.a(str, dVar);
            if (a11 != dVar) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                hashMap.put(str, a11);
            }
        }
        if (hashMap == null) {
            return this;
        }
        HashMap hashMap2 = new HashMap();
        boolean z11 = false;
        for (String str2 : keySet()) {
            if (hashMap.containsKey(str2)) {
                d dVar2 = (d) hashMap.get(str2);
                if (dVar2 != null) {
                    hashMap2.put(str2, dVar2);
                    if (dVar2.N0() == b1.UNRESOLVED) {
                        z11 = true;
                    }
                }
            } else {
                d dVar3 = this.f68858c.get(str2);
                hashMap2.put(str2, dVar3);
                if (dVar3.N0() == b1.UNRESOLVED) {
                    z11 = true;
                }
            }
        }
        return new w1(g(), hashMap2, z11 ? b1.UNRESOLVED : b1.RESOLVED, w0());
    }

    @Override // ku.k0
    public boolean C(d dVar) {
        Iterator<d> it = this.f68858c.values().iterator();
        while (it.hasNext()) {
            if (it.next() == dVar) {
                return true;
            }
        }
        for (ju.t tVar : this.f68858c.values()) {
            if ((tVar instanceof k0) && ((k0) tVar).C(dVar)) {
                return true;
            }
        }
        return false;
    }

    @Override // ku.c
    /* renamed from: C1, reason: merged with bridge method [inline-methods] */
    public w1 b1(b1 b1Var, ju.m mVar) {
        return D1(b1Var, mVar, this.f68860e);
    }

    public final w1 D1(b1 b1Var, ju.m mVar, boolean z11) {
        return new w1(mVar, this.f68858c, b1Var, z11);
    }

    @Override // ku.c
    /* renamed from: E1, reason: merged with bridge method [inline-methods] */
    public w1 I0(s0 s0Var) {
        return A1(new a(s0Var));
    }

    @Override // ku.k0
    /* renamed from: F1, reason: merged with bridge method [inline-methods] */
    public w1 B(d dVar, d dVar2) {
        HashMap hashMap = new HashMap(this.f68858c);
        for (Map.Entry entry : hashMap.entrySet()) {
            if (entry.getValue() == dVar) {
                if (dVar2 != null) {
                    entry.setValue(dVar2);
                } else {
                    hashMap.remove(entry.getKey());
                }
                return new w1(g(), hashMap, b1.b(hashMap.values()), this.f68860e);
            }
        }
        throw new ConfigException.BugOrBroken("SimpleConfigObject.replaceChild did not find " + dVar + " in " + this);
    }

    @Override // ku.d
    /* renamed from: G1, reason: merged with bridge method [inline-methods] */
    public w1 S0() {
        return this.f68860e ? this : D1(N0(), g(), true);
    }

    @Override // ku.c
    /* renamed from: H1, reason: merged with bridge method [inline-methods] */
    public w1 m0(String str) {
        return n1(s0.f(str));
    }

    @Override // ku.c
    /* renamed from: I1, reason: merged with bridge method [inline-methods] */
    public w1 n1(s0 s0Var) {
        w1 o12 = o1(s0Var);
        return o12 == null ? new w1(g(), Collections.EMPTY_MAP, b1.RESOLVED, this.f68860e) : o12;
    }

    @Override // ku.c
    /* renamed from: J1, reason: merged with bridge method [inline-methods] */
    public w1 o1(s0 s0Var) {
        String b11 = s0Var.b();
        s0 j11 = s0Var.j();
        d dVar = this.f68858c.get(b11);
        if (j11 != null) {
            dVar = (dVar == null || !(dVar instanceof ku.c)) ? null : ((ku.c) dVar).o1(j11);
        }
        if (dVar == null) {
            return null;
        }
        return new w1(g(), Collections.singletonMap(b11, dVar), dVar.N0(), this.f68860e);
    }

    @Override // ku.c, ku.d
    public void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar) {
        int i12;
        if (isEmpty()) {
            sb2.append("{}");
        } else {
            boolean z12 = qVar.e() || !z11;
            if (z12) {
                int i13 = i11 + 1;
                sb2.append("{");
                if (qVar.d()) {
                    sb2.append('\n');
                }
                i12 = i13;
            } else {
                i12 = i11;
            }
            String[] strArr = (String[]) keySet().toArray(new String[size()]);
            Arrays.sort(strArr, new b(null));
            int i14 = 0;
            for (String str : strArr) {
                d dVar = this.f68858c.get(str);
                if (qVar.f()) {
                    String[] split = dVar.g().description().split("\n");
                    int length = split.length;
                    int i15 = 0;
                    while (i15 < length) {
                        String str2 = split[i15];
                        d dVar2 = dVar;
                        d.y0(sb2, i11 + 1, qVar);
                        sb2.append('#');
                        if (!str2.isEmpty()) {
                            sb2.append(' ');
                        }
                        sb2.append(str2);
                        sb2.append("\n");
                        i15++;
                        dVar = dVar2;
                    }
                }
                d dVar3 = dVar;
                if (qVar.c()) {
                    for (String str3 : dVar3.g().b()) {
                        d.y0(sb2, i12, qVar);
                        sb2.append("#");
                        if (!str3.startsWith(" ")) {
                            sb2.append(' ');
                        }
                        sb2.append(str3);
                        sb2.append("\n");
                    }
                }
                d.y0(sb2, i12, qVar);
                dVar3.J0(sb2, i12, false, str, qVar);
                if (qVar.d()) {
                    if (qVar.e()) {
                        sb2.append(",");
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                    sb2.append('\n');
                } else {
                    sb2.append(",");
                    i14 = 1;
                }
            }
            sb2.setLength(sb2.length() - i14);
            if (z12) {
                if (qVar.d()) {
                    sb2.append('\n');
                    if (z12) {
                        d.y0(sb2, i11, qVar);
                    }
                }
                sb2.append(com.alipay.sdk.m.u.i.f11099d);
            }
        }
        if (z11 && qVar.d()) {
            sb2.append('\n');
        }
    }

    @Override // ku.c
    /* renamed from: K1, reason: merged with bridge method [inline-methods] */
    public w1 f(String str, ju.t tVar) {
        Map map;
        if (tVar == null) {
            throw new ConfigException.BugOrBroken("Trying to store null ConfigValue in a ConfigObject");
        }
        if (this.f68858c.isEmpty()) {
            map = Collections.singletonMap(str, (d) tVar);
        } else {
            HashMap hashMap = new HashMap(this.f68858c);
            hashMap.put(str, (d) tVar);
            map = hashMap;
        }
        return new w1(g(), map, b1.b(map.values()), this.f68860e);
    }

    @Override // ku.c
    /* renamed from: L1, reason: merged with bridge method [inline-methods] */
    public w1 r1(s0 s0Var, ju.t tVar) {
        String b11 = s0Var.b();
        s0 j11 = s0Var.j();
        if (j11 == null) {
            return f(b11, tVar);
        }
        d dVar = this.f68858c.get(b11);
        if (dVar != null && (dVar instanceof ku.c)) {
            return f(b11, ((ku.c) dVar).r1(j11, tVar));
        }
        return f(b11, ((d) tVar).p0(x1.w("withValue(" + j11.k() + pn.j.f81007d), j11).root());
    }

    @Override // ku.c
    /* renamed from: M1, reason: merged with bridge method [inline-methods] */
    public w1 o0(String str) {
        return t1(s0.f(str));
    }

    @Override // ku.d
    public b1 N0() {
        return b1.a(this.f68859d);
    }

    @Override // ku.c
    /* renamed from: N1, reason: merged with bridge method [inline-methods] */
    public w1 t1(s0 s0Var) {
        String b11 = s0Var.b();
        s0 j11 = s0Var.j();
        d dVar = this.f68858c.get(b11);
        if (dVar != null && j11 != null && (dVar instanceof ku.c)) {
            ku.c t12 = ((ku.c) dVar).t1(j11);
            HashMap hashMap = new HashMap(this.f68858c);
            hashMap.put(b11, t12);
            return new w1(g(), hashMap, b1.b(hashMap.values()), this.f68860e);
        }
        if (j11 != null || dVar == null) {
            return this;
        }
        HashMap hashMap2 = new HashMap(this.f68858c.size() - 1);
        for (Map.Entry<String, d> entry : this.f68858c.entrySet()) {
            if (!entry.getKey().equals(b11)) {
                hashMap2.put(entry.getKey(), entry.getValue());
            }
        }
        return new w1(g(), hashMap2, b1.b(hashMap2.values()), this.f68860e);
    }

    @Override // ku.c, ku.d
    public z0<? extends ku.c> O0(x0 x0Var, a1 a1Var) throws d.c {
        if (N0() == b1.RESOLVED) {
            return z0.c(x0Var, this);
        }
        try {
            c cVar = new c(x0Var, a1Var.e(this));
            return z0.c(cVar.f68864b, B1(cVar)).a();
        } catch (RuntimeException e11) {
            throw e11;
        } catch (d.c e12) {
            throw e12;
        } catch (Exception e13) {
            throw new ConfigException.BugOrBroken("unexpected checked exception", e13);
        }
    }

    @Override // ku.c
    public d U0(String str) {
        return this.f68858c.get(str);
    }

    @Override // ku.c, ju.l, java.util.Map
    /* renamed from: W0 */
    public d get(Object obj) {
        return this.f68858c.get(obj);
    }

    @Override // java.util.Map
    public boolean containsKey(Object obj) {
        return this.f68858c.containsKey(obj);
    }

    @Override // java.util.Map
    public boolean containsValue(Object obj) {
        return this.f68858c.containsValue(obj);
    }

    @Override // java.util.Map
    public Set<Map.Entry<String, ju.t>> entrySet() {
        HashSet hashSet = new HashSet();
        for (Map.Entry<String, d> entry : this.f68858c.entrySet()) {
            hashSet.add(new AbstractMap.SimpleImmutableEntry(entry.getKey(), entry.getValue()));
        }
        return hashSet;
    }

    @Override // ku.d
    public boolean equals(Object obj) {
        return (obj instanceof ju.l) && q0(obj) && x1(this, (ju.l) obj);
    }

    @Override // ku.d
    public int hashCode() {
        return y1(this);
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return this.f68858c.isEmpty();
    }

    @Override // java.util.Map
    public Set<String> keySet() {
        return this.f68858c.keySet();
    }

    @Override // ku.d
    public boolean q0(Object obj) {
        return obj instanceof ju.l;
    }

    @Override // java.util.Map
    public int size() {
        return this.f68858c.size();
    }

    @Override // java.util.Map
    public Collection<ju.t> values() {
        return new HashSet(this.f68858c.values());
    }

    @Override // ku.d
    public boolean w0() {
        return this.f68860e;
    }

    @Override // ku.c
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public w1 C0(ku.c cVar) {
        M0();
        if (!(cVar instanceof w1)) {
            throw new ConfigException.BugOrBroken("should not be reached (merging non-SimpleConfigObject)");
        }
        w1 w1Var = (w1) cVar;
        HashMap hashMap = new HashMap();
        HashSet<String> hashSet = new HashSet();
        hashSet.addAll(keySet());
        hashSet.addAll(w1Var.keySet());
        boolean z11 = true;
        boolean z12 = false;
        for (String str : hashSet) {
            d dVar = this.f68858c.get(str);
            d dVar2 = w1Var.f68858c.get(str);
            if (dVar != null) {
                dVar2 = dVar2 == null ? dVar : dVar.a(dVar2);
            }
            hashMap.put(str, dVar2);
            if (dVar != dVar2) {
                z12 = true;
            }
            if (dVar2.N0() == b1.UNRESOLVED) {
                z11 = false;
            }
        }
        b1 a11 = b1.a(z11);
        boolean w02 = w1Var.w0();
        return z12 ? new w1(ku.c.Y0(this, w1Var), hashMap, a11, w02) : (a11 == N0() && w02 == w0()) ? this : D1(a11, g(), w02);
    }

    @Override // ju.t
    public Map<String, Object> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, d> entry : this.f68858c.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue().c());
        }
        return hashMap;
    }

    public w1(ju.m mVar, Map<String, d> map) {
        this(mVar, map, b1.b(map.values()), false);
    }
}
