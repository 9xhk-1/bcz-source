package ku;

import com.typesafe.config.ConfigException;
import com.typesafe.config.ConfigValueType;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import ku.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public abstract class c extends d implements ju.l, k0 {

    /* renamed from: b, reason: collision with root package name */
    public final t1 f68620b;

    public c(ju.m mVar) {
        super(mVar);
        this.f68620b = new t1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static ju.m X0(Collection<? extends d> collection) {
        if (collection.isEmpty()) {
            throw new ConfigException.BugOrBroken("can't merge origins on empty list");
        }
        ArrayList arrayList = new ArrayList();
        x1 x1Var = null;
        int i11 = 0;
        for (d dVar : collection) {
            if (x1Var == null) {
                x1Var = dVar.g();
            }
            if (!(dVar instanceof c) || ((c) dVar).N0() != b1.RESOLVED || !((ju.l) dVar).isEmpty()) {
                arrayList.add(dVar.g());
                i11++;
            }
        }
        if (i11 == 0) {
            arrayList.add(x1Var);
        }
        return x1.n(arrayList);
    }

    public static ju.m Y0(c... cVarArr) {
        return X0(Arrays.asList(cVarArr));
    }

    public static d d1(c cVar, s0 s0Var) {
        try {
            s0 j11 = s0Var.j();
            d U0 = cVar.U0(s0Var.b());
            if (j11 == null) {
                return U0;
            }
            if (U0 instanceof c) {
                return d1((c) U0, j11);
            }
            return null;
        } catch (ConfigException.NotResolved e11) {
            throw p.v(s0Var, e11);
        }
    }

    private static UnsupportedOperationException k1(String str) {
        return new UnsupportedOperationException("ConfigObject is immutable, you can't call Map." + str);
    }

    @Override // ku.d
    public abstract void K0(StringBuilder sb2, int i11, boolean z11, ju.q qVar);

    @Override // ku.d
    public abstract z0<? extends c> O0(x0 x0Var, a1 a1Var) throws d.c;

    public abstract d U0(String str);

    @Override // ku.d
    /* renamed from: V0, reason: merged with bridge method [inline-methods] */
    public c r0(ju.m mVar, List<d> list) {
        return new k(mVar, list);
    }

    @Override // ju.l, java.util.Map
    /* renamed from: W0, reason: merged with bridge method [inline-methods] */
    public abstract d get(Object obj);

    @Override // ku.d
    /* renamed from: Z0, reason: merged with bridge method [inline-methods] */
    public abstract c C0(c cVar);

    @Override // ku.d
    /* renamed from: a1, reason: merged with bridge method [inline-methods] */
    public c G0(ju.m mVar) {
        return b1(N0(), mVar);
    }

    public abstract c b1(b1 b1Var, ju.m mVar);

    public final d c1(String str, s0 s0Var) {
        try {
            return U0(str);
        } catch (ConfigException.NotResolved e11) {
            throw p.v(s0Var, e11);
        }
    }

    @Override // java.util.Map
    public void clear() {
        throw k1(kc.o.N);
    }

    public d e1(s0 s0Var) {
        return d1(this, s0Var);
    }

    @Override // java.util.Map
    /* renamed from: f1, reason: merged with bridge method [inline-methods] */
    public ju.t put(String str, ju.t tVar) {
        throw k1("put");
    }

    @Override // ku.d
    /* renamed from: g1, reason: merged with bridge method [inline-methods] */
    public abstract c I0(s0 s0Var);

    @Override // java.util.Map
    /* renamed from: h1, reason: merged with bridge method [inline-methods] */
    public ju.t remove(Object obj) {
        throw k1("remove");
    }

    @Override // ju.l
    /* renamed from: i1, reason: merged with bridge method [inline-methods] */
    public t1 f0() {
        return this.f68620b;
    }

    @Override // ku.d, ju.t, ju.k
    /* renamed from: l1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c R0(ju.k kVar) {
        return (c) super.a(kVar);
    }

    @Override // ju.l
    /* renamed from: m1, reason: merged with bridge method [inline-methods] */
    public abstract c m0(String str);

    public abstract c n1(s0 s0Var);

    public abstract c o1(s0 s0Var);

    @Override // ku.d, ju.t
    /* renamed from: p1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c e(ju.m mVar) {
        return (c) super.e(mVar);
    }

    @Override // java.util.Map
    public void putAll(Map<? extends String, ? extends ju.t> map) {
        throw k1("putAll");
    }

    @Override // ju.l
    /* renamed from: q1, reason: merged with bridge method [inline-methods] */
    public abstract c f(String str, ju.t tVar);

    public abstract c r1(s0 s0Var, ju.t tVar);

    @Override // ju.l
    /* renamed from: s1, reason: merged with bridge method [inline-methods] */
    public abstract c o0(String str);

    public abstract c t1(s0 s0Var);

    @Override // ju.t
    public ConfigValueType valueType() {
        return ConfigValueType.OBJECT;
    }

    @Override // ku.d, ku.p0
    /* renamed from: j1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public c Q() {
        return this;
    }
}
