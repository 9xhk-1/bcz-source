package r1;

import a3.a0;
import a3.b1;
import a3.d0;
import a3.q;
import com.badlogic.gdx.Application;
import com.badlogic.gdx.graphics.Cubemap;
import com.badlogic.gdx.graphics.Pixmap;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.utils.GdxRuntimeException;
import com.badlogic.gdx.utils.a;
import com.badlogic.gdx.utils.k;
import com.badlogic.gdx.utils.l;
import com.badlogic.gdx.utils.m;
import com.badlogic.gdx.utils.s;
import e2.f;
import n2.w;
import org.junit.jupiter.api.j2;
import pn.j;
import q1.g;
import r1.c;
import s1.h;
import s1.i;
import s1.o;
import s1.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public class e implements q {

    /* renamed from: a, reason: collision with root package name */
    public final l<Class, l<String, a>> f82839a;

    /* renamed from: b, reason: collision with root package name */
    public final l<String, Class> f82840b;

    /* renamed from: c, reason: collision with root package name */
    public final l<String, com.badlogic.gdx.utils.a<String>> f82841c;

    /* renamed from: d, reason: collision with root package name */
    public final m<String> f82842d;

    /* renamed from: e, reason: collision with root package name */
    public final l<Class, l<String, s1.a>> f82843e;

    /* renamed from: f, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<r1.a> f82844f;

    /* renamed from: g, reason: collision with root package name */
    public final b3.a f82845g;

    /* renamed from: h, reason: collision with root package name */
    public final com.badlogic.gdx.utils.a<d> f82846h;

    /* renamed from: i, reason: collision with root package name */
    public b f82847i;

    /* renamed from: j, reason: collision with root package name */
    public int f82848j;

    /* renamed from: k, reason: collision with root package name */
    public int f82849k;

    /* renamed from: l, reason: collision with root package name */
    public int f82850l;

    /* renamed from: m, reason: collision with root package name */
    public final s1.e f82851m;

    /* renamed from: n, reason: collision with root package name */
    public a0 f82852n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public Object f82853a;

        /* renamed from: b, reason: collision with root package name */
        public int f82854b = 1;
    }

    public e() {
        this(new t1.d());
    }

    public synchronized <T, P extends c<T>> void A1(Class<T> cls, String str, s1.a<T, P> aVar) {
        try {
            if (cls == null) {
                throw new IllegalArgumentException("type cannot be null.");
            }
            if (aVar == null) {
                throw new IllegalArgumentException("loader cannot be null.");
            }
            this.f82852n.a("Loader set: " + g3.c.t(cls) + " -> " + g3.c.t(aVar.getClass()));
            l<String, s1.a> k11 = this.f82843e.k(cls);
            if (k11 == null) {
                l<Class, l<String, s1.a>> lVar = this.f82843e;
                l<String, s1.a> lVar2 = new l<>();
                lVar.r(cls, lVar2);
                k11 = lVar2;
            }
            if (str == null) {
                str = "";
            }
            k11.r(str, aVar);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized <T, P extends c<T>> void B1(Class<T> cls, s1.a<T, P> aVar) {
        A1(cls, null, aVar);
    }

    @d0
    public synchronized <T> T C0(String str, Class<T> cls, boolean z11) {
        a k11;
        l<String, a> k12 = this.f82839a.k(cls);
        if (k12 != null && (k11 = k12.k(str)) != null) {
            return (T) k11.f82853a;
        }
        if (!z11) {
            return null;
        }
        throw new GdxRuntimeException("Asset not loaded: " + str);
    }

    public void C1(a0 a0Var) {
        this.f82852n = a0Var;
    }

    public synchronized boolean D(String str) {
        com.badlogic.gdx.utils.a<d> aVar = this.f82846h;
        if (aVar.f13179b > 0 && aVar.first().f82828b.f82822a.equals(str)) {
            return true;
        }
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<r1.a> aVar2 = this.f82844f;
            if (i11 >= aVar2.f13179b) {
                return s1(str);
            }
            if (aVar2.get(i11).f82822a.equals(str)) {
                return true;
            }
            i11++;
        }
    }

    public synchronized void D1(String str, int i11) {
        Class k11 = this.f82840b.k(str);
        if (k11 == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        this.f82839a.k(k11).k(str).f82854b = i11;
    }

    public synchronized void F1(String str) {
        c cVar;
        c.a aVar;
        com.badlogic.gdx.utils.a<d> aVar2 = this.f82846h;
        if (aVar2.f13179b > 0) {
            d first = aVar2.first();
            if (first.f82828b.f82822a.equals(str)) {
                this.f82852n.f("Unload (from tasks): " + str);
                first.f82838l = true;
                first.f();
                return;
            }
        }
        Class k11 = this.f82840b.k(str);
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<r1.a> aVar3 = this.f82844f;
            if (i11 >= aVar3.f13179b) {
                i11 = -1;
                break;
            } else if (aVar3.get(i11).f82822a.equals(str)) {
                break;
            } else {
                i11++;
            }
        }
        if (i11 != -1) {
            this.f82849k--;
            r1.a A = this.f82844f.A(i11);
            this.f82852n.f("Unload (from queue): " + str);
            if (k11 != null && (cVar = A.f82824c) != null && (aVar = cVar.f82826a) != null) {
                aVar.a(this, A.f82822a, A.f82823b);
            }
            return;
        }
        if (k11 == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        a k12 = this.f82839a.k(k11).k(str);
        int i12 = k12.f82854b - 1;
        k12.f82854b = i12;
        if (i12 <= 0) {
            this.f82852n.f("Unload (dispose): " + str);
            Object obj = k12.f82853a;
            if (obj instanceof q) {
                ((q) obj).dispose();
            }
            this.f82840b.u(str);
            this.f82839a.k(k11).u(str);
        } else {
            this.f82852n.f("Unload (decrement): " + str);
        }
        com.badlogic.gdx.utils.a<String> k13 = this.f82841c.k(str);
        if (k13 != null) {
            a.b<String> it = k13.iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (s1(next)) {
                    F1(next);
                }
            }
        }
        if (k12.f82854b <= 0) {
            this.f82841c.u(str);
        }
    }

    public synchronized boolean G1() {
        boolean z11 = false;
        try {
            if (this.f82846h.f13179b == 0) {
                while (this.f82844f.f13179b != 0 && this.f82846h.f13179b == 0) {
                    y1();
                }
                if (this.f82846h.f13179b == 0) {
                    return true;
                }
            }
            if (I1() && this.f82844f.f13179b == 0) {
                if (this.f82846h.f13179b == 0) {
                    z11 = true;
                }
            }
            return z11;
        } catch (Throwable th2) {
            n1(th2);
            return this.f82844f.f13179b == 0;
        }
    }

    public boolean H1(int i11) {
        boolean G1;
        if (g.f81378a.getType() == Application.ApplicationType.WebGL) {
            return G1();
        }
        long a11 = b1.a() + i11;
        while (true) {
            G1 = G1();
            if (G1 || b1.a() > a11) {
                break;
            }
            b3.d.a();
        }
        return G1;
    }

    public synchronized boolean I(String str, Class cls) {
        com.badlogic.gdx.utils.a<d> aVar = this.f82846h;
        if (aVar.f13179b > 0) {
            r1.a aVar2 = aVar.first().f82828b;
            if (aVar2.f82823b == cls && aVar2.f82822a.equals(str)) {
                return true;
            }
        }
        int i11 = 0;
        while (true) {
            com.badlogic.gdx.utils.a<r1.a> aVar3 = this.f82844f;
            if (i11 >= aVar3.f13179b) {
                return t1(str, cls);
            }
            r1.a aVar4 = aVar3.get(i11);
            if (aVar4.f82823b == cls && aVar4.f82822a.equals(str)) {
                return true;
            }
            i11++;
        }
    }

    public final boolean I1() {
        c.a aVar;
        d peek = this.f82846h.peek();
        try {
            if (!peek.f82838l) {
                if (!peek.g()) {
                    return false;
                }
            }
        } catch (RuntimeException e11) {
            peek.f82838l = true;
            E1(peek.f82828b, e11);
        }
        com.badlogic.gdx.utils.a<d> aVar2 = this.f82846h;
        if (aVar2.f13179b == 1) {
            this.f82848j++;
            this.f82850l = 0;
        }
        aVar2.pop();
        if (peek.f82838l) {
            return true;
        }
        r1.a aVar3 = peek.f82828b;
        b(aVar3.f82822a, aVar3.f82823b, peek.f82837k);
        r1.a aVar4 = peek.f82828b;
        c cVar = aVar4.f82824c;
        if (cVar != null && (aVar = cVar.f82826a) != null) {
            aVar.a(this, aVar4.f82822a, aVar4.f82823b);
        }
        long c11 = b1.c();
        this.f82852n.a("Loaded: " + ((c11 - peek.f82831e) / 1000000.0f) + "ms " + peek.f82828b);
        return true;
    }

    @d0
    public synchronized <T> T J0(String str, boolean z11) {
        l<String, a> k11;
        a k12;
        Class k13 = this.f82840b.k(str);
        if (k13 != null && (k11 = this.f82839a.k(k13)) != null && (k12 = k11.k(str)) != null) {
            return (T) k12.f82853a;
        }
        if (!z11) {
            return null;
        }
        throw new GdxRuntimeException("Asset not loaded: " + str);
    }

    public synchronized <T> T Q0(r1.a<T> aVar) {
        return (T) C0(aVar.f82822a, aVar.f82823b, true);
    }

    public synchronized <T> boolean R(T t11) {
        l<String, a> k11 = this.f82839a.k(t11.getClass());
        if (k11 == null) {
            return false;
        }
        l.e<a> it = k11.z().iterator();
        while (it.hasNext()) {
            Object obj = it.next().f82853a;
            if (obj == t11 || t11.equals(obj)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized <T> com.badlogic.gdx.utils.a<T> V0(Class<T> cls, com.badlogic.gdx.utils.a<T> aVar) {
        l<String, a> k11 = this.f82839a.k(cls);
        if (k11 != null) {
            l.e<a> it = k11.z().iterator();
            while (it.hasNext()) {
                aVar.a(it.next().f82853a);
            }
        }
        return aVar;
    }

    public void X() {
        this.f82852n.a("Waiting for loading to complete...");
        while (!G1()) {
            b3.d.a();
        }
        this.f82852n.a("Loading complete.");
    }

    public <T> T Z(String str) {
        l<String, a> k11;
        a k12;
        this.f82852n.a("Waiting for asset to be loaded: " + str);
        while (true) {
            synchronized (this) {
                try {
                    Class k13 = this.f82840b.k(str);
                    if (k13 != null && (k11 = this.f82839a.k(k13)) != null && (k12 = k11.k(str)) != null) {
                        this.f82852n.a("Asset loaded: " + str);
                        return (T) k12.f82853a;
                    }
                    G1();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            b3.d.a();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized <T> String a1(T t11) {
        try {
            l.c<Class> it = this.f82839a.n().iterator();
            while (it.hasNext()) {
                l.a<String, a> it2 = this.f82839a.k(it.next()).iterator();
                while (it2.hasNext()) {
                    l.b next = it2.next();
                    Object obj = ((a) next.f13395b).f82853a;
                    if (obj != t11 && !t11.equals(obj)) {
                    }
                    return (String) next.f13394a;
                }
            }
            return null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public <T> void b(String str, Class<T> cls, T t11) {
        this.f82840b.r(str, cls);
        l<String, a> k11 = this.f82839a.k(cls);
        if (k11 == null) {
            k11 = new l<>();
            this.f82839a.r(cls, k11);
        }
        a aVar = new a();
        aVar.f82853a = t11;
        k11.r(str, aVar);
    }

    public synchronized com.badlogic.gdx.utils.a<String> b1() {
        return this.f82840b.n().f();
    }

    public synchronized Class c1(String str) {
        return this.f82840b.k(str);
    }

    public synchronized com.badlogic.gdx.utils.a<String> d1(String str) {
        return this.f82841c.k(str);
    }

    @Override // a3.q
    public void dispose() {
        this.f82852n.a("Disposing.");
        z();
        this.f82845g.dispose();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public synchronized String e1() {
        StringBuilder sb2;
        try {
            sb2 = new StringBuilder(256);
            l.a<String, Class> it = this.f82840b.iterator();
            while (it.hasNext()) {
                l.b next = it.next();
                String str = (String) next.f13394a;
                Class cls = (Class) next.f13395b;
                if (sb2.length() > 0) {
                    sb2.append('\n');
                }
                sb2.append(str);
                sb2.append(j2.O);
                sb2.append(g3.c.t(cls));
                sb2.append(", refs: ");
                sb2.append(this.f82839a.k(cls).k(str).f82854b);
                com.badlogic.gdx.utils.a<String> k11 = this.f82841c.k(str);
                if (k11 != null) {
                    sb2.append(", deps: [");
                    a.b<String> it2 = k11.iterator();
                    while (it2.hasNext()) {
                        sb2.append(it2.next());
                        sb2.append(',');
                    }
                    sb2.append(l50.b.f69930l);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return sb2.toString();
    }

    public s1.e f1() {
        return this.f82851m;
    }

    public synchronized int g1() {
        return this.f82840b.f13380a;
    }

    public <T> s1.a h1(Class<T> cls) {
        return i1(cls, null);
    }

    public <T> T i0(r1.a aVar) {
        return (T) Z(aVar.f82822a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> s1.a i1(Class<T> cls, String str) {
        l<String, s1.a> k11 = this.f82843e.k(cls);
        s1.a aVar = null;
        if (k11 != null && k11.f13380a >= 1) {
            if (str == null) {
                return k11.k("");
            }
            l.a<String, s1.a> it = k11.g().iterator();
            int i11 = -1;
            while (it.hasNext()) {
                l.b next = it.next();
                if (((String) next.f13394a).length() > i11 && str.endsWith((String) next.f13394a)) {
                    aVar = (s1.a) next.f13395b;
                    i11 = ((String) next.f13394a).length();
                }
            }
        }
        return aVar;
    }

    public a0 j1() {
        return this.f82852n;
    }

    public synchronized float k1() {
        try {
            int i11 = this.f82849k;
            if (i11 == 0) {
                return 1.0f;
            }
            float f11 = this.f82848j;
            int i12 = this.f82850l;
            if (i12 > 0) {
                f11 += (i12 - this.f82846h.f13179b) / i12;
            }
            return Math.min(1.0f, f11 / i11);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized int l1() {
        return this.f82844f.f13179b + this.f82846h.f13179b;
    }

    public synchronized int m1(String str) {
        Class k11;
        k11 = this.f82840b.k(str);
        if (k11 == null) {
            throw new GdxRuntimeException("Asset not loaded: " + str);
        }
        return this.f82839a.k(k11).k(str).f82854b;
    }

    public synchronized <T> T n0(String str) {
        return (T) J0(str, true);
    }

    public final void n1(Throwable th2) {
        this.f82852n.d("Error loading asset.", th2);
        if (this.f82846h.isEmpty()) {
            throw new GdxRuntimeException(th2);
        }
        d pop = this.f82846h.pop();
        r1.a aVar = pop.f82828b;
        if (pop.f82833g && pop.f82834h != null) {
            a.b<r1.a> it = pop.f82834h.iterator();
            while (it.hasNext()) {
                F1(it.next().f82822a);
            }
        }
        this.f82846h.clear();
        b bVar = this.f82847i;
        if (bVar == null) {
            throw new GdxRuntimeException(th2);
        }
        bVar.a(aVar, th2);
    }

    public final void o(r1.a aVar) {
        s1.a i12 = i1(aVar.f82823b, aVar.f82822a);
        if (i12 != null) {
            this.f82846h.a(new d(this, aVar, i12, this.f82845g));
            this.f82850l++;
        } else {
            throw new GdxRuntimeException("No loader for type: " + g3.c.t(aVar.f82823b));
        }
    }

    public final void o1(String str) {
        com.badlogic.gdx.utils.a<String> k11 = this.f82841c.k(str);
        if (k11 == null) {
            return;
        }
        a.b<String> it = k11.iterator();
        while (it.hasNext()) {
            String next = it.next();
            this.f82839a.k(this.f82840b.k(next)).k(next).f82854b++;
            o1(next);
        }
    }

    public synchronized void p1(String str, com.badlogic.gdx.utils.a<r1.a> aVar) {
        try {
            m<String> mVar = this.f82842d;
            a.b<r1.a> it = aVar.iterator();
            while (it.hasNext()) {
                r1.a next = it.next();
                if (!mVar.contains(next.f82822a)) {
                    mVar.add(next.f82822a);
                    q1(str, next);
                }
            }
            mVar.j(32);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void q1(String str, r1.a aVar) {
        try {
            com.badlogic.gdx.utils.a<String> k11 = this.f82841c.k(str);
            if (k11 == null) {
                k11 = new com.badlogic.gdx.utils.a<>();
                this.f82841c.r(str, k11);
            }
            k11.a(aVar.f82822a);
            if (s1(aVar.f82822a)) {
                this.f82852n.a("Dependency already loaded: " + aVar);
                a k12 = this.f82839a.k(this.f82840b.k(aVar.f82822a)).k(aVar.f82822a);
                k12.f82854b = k12.f82854b + 1;
                o1(aVar.f82822a);
            } else {
                this.f82852n.f("Loading dependency: " + aVar);
                o(aVar);
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized boolean r1() {
        boolean z11;
        if (this.f82844f.f13179b == 0) {
            z11 = this.f82846h.f13179b == 0;
        }
        return z11;
    }

    public synchronized boolean s1(String str) {
        if (str == null) {
            return false;
        }
        return this.f82840b.b(str);
    }

    public synchronized boolean t1(String str, Class cls) {
        l<String, a> k11 = this.f82839a.k(cls);
        if (k11 == null) {
            return false;
        }
        return k11.k(str) != null;
    }

    public synchronized boolean u1(r1.a aVar) {
        return s1(aVar.f82822a);
    }

    public synchronized <T> void v1(String str, Class<T> cls) {
        w1(str, cls, null);
    }

    public synchronized <T> T w0(String str, Class<T> cls) {
        return (T) C0(str, cls, true);
    }

    public synchronized <T> void w1(String str, Class<T> cls, c<T> cVar) {
        try {
            if (i1(cls, str) == null) {
                throw new GdxRuntimeException("No loader for type: " + g3.c.t(cls));
            }
            int i11 = 0;
            if (this.f82844f.f13179b == 0) {
                this.f82848j = 0;
                this.f82849k = 0;
                this.f82850l = 0;
            }
            int i12 = 0;
            while (true) {
                com.badlogic.gdx.utils.a<r1.a> aVar = this.f82844f;
                if (i12 < aVar.f13179b) {
                    r1.a aVar2 = aVar.get(i12);
                    if (aVar2.f82822a.equals(str) && !aVar2.f82823b.equals(cls)) {
                        throw new GdxRuntimeException("Asset with name '" + str + "' already in preload queue, but has different type (expected: " + g3.c.t(cls) + ", found: " + g3.c.t(aVar2.f82823b) + j.f81007d);
                    }
                    i12++;
                } else {
                    while (true) {
                        com.badlogic.gdx.utils.a<d> aVar3 = this.f82846h;
                        if (i11 < aVar3.f13179b) {
                            r1.a aVar4 = aVar3.get(i11).f82828b;
                            if (aVar4.f82822a.equals(str) && !aVar4.f82823b.equals(cls)) {
                                throw new GdxRuntimeException("Asset with name '" + str + "' already in task list, but has different type (expected: " + g3.c.t(cls) + ", found: " + g3.c.t(aVar4.f82823b) + j.f81007d);
                            }
                            i11++;
                        } else {
                            Class k11 = this.f82840b.k(str);
                            if (k11 != null && !k11.equals(cls)) {
                                throw new GdxRuntimeException("Asset with name '" + str + "' already loaded, but has different type (expected: " + g3.c.t(cls) + ", found: " + g3.c.t(k11) + j.f81007d);
                            }
                            this.f82849k++;
                            r1.a aVar5 = new r1.a(str, cls, cVar);
                            this.f82844f.a(aVar5);
                            this.f82852n.a("Queued: " + aVar5);
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void x1(r1.a aVar) {
        w1(aVar.f82822a, aVar.f82823b, aVar.f82824c);
    }

    public final void y1() {
        c.a aVar;
        r1.a A = this.f82844f.A(0);
        if (!s1(A.f82822a)) {
            this.f82852n.f("Loading: " + A);
            o(A);
            return;
        }
        this.f82852n.a("Already loaded: " + A);
        a k11 = this.f82839a.k(this.f82840b.k(A.f82822a)).k(A.f82822a);
        k11.f82854b = k11.f82854b + 1;
        o1(A.f82822a);
        c cVar = A.f82824c;
        if (cVar != null && (aVar = cVar.f82826a) != null) {
            aVar.a(this, A.f82822a, A.f82823b);
        }
        this.f82848j++;
    }

    public void z() {
        synchronized (this) {
            this.f82844f.clear();
        }
        X();
        synchronized (this) {
            try {
                k kVar = new k();
                while (this.f82840b.f13380a > 0) {
                    kVar.a(51);
                    com.badlogic.gdx.utils.a<String> f11 = this.f82840b.n().f();
                    a.b<String> it = f11.iterator();
                    while (it.hasNext()) {
                        com.badlogic.gdx.utils.a<String> k11 = this.f82841c.k(it.next());
                        if (k11 != null) {
                            a.b<String> it2 = k11.iterator();
                            while (it2.hasNext()) {
                                kVar.k(it2.next(), 0, 1);
                            }
                        }
                    }
                    a.b<String> it3 = f11.iterator();
                    while (it3.hasNext()) {
                        String next = it3.next();
                        if (kVar.j(next, 0) == 0) {
                            F1(next);
                        }
                    }
                }
                this.f82839a.a(51);
                this.f82840b.a(51);
                this.f82841c.a(51);
                this.f82848j = 0;
                this.f82849k = 0;
                this.f82850l = 0;
                this.f82844f.clear();
                this.f82846h.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void z1(b bVar) {
        this.f82847i = bVar;
    }

    public e(s1.e eVar) {
        this(eVar, true);
    }

    public e(s1.e eVar, boolean z11) {
        this.f82839a = new l<>();
        this.f82840b = new l<>();
        this.f82841c = new l<>();
        this.f82842d = new m<>();
        this.f82843e = new l<>();
        this.f82844f = new com.badlogic.gdx.utils.a<>();
        this.f82846h = new com.badlogic.gdx.utils.a<>();
        this.f82852n = new a0("AssetManager", 0);
        this.f82851m = eVar;
        if (z11) {
            B1(com.badlogic.gdx.graphics.g2d.a.class, new s1.c(eVar));
            B1(u1.c.class, new h(eVar));
            B1(Pixmap.class, new s1.j(eVar));
            B1(u1.d.class, new s1.m(eVar));
            B1(com.badlogic.gdx.graphics.g2d.e.class, new o(eVar));
            B1(Texture.class, new p(eVar));
            B1(com.badlogic.gdx.scenes.scene2d.ui.q.class, new s1.l(eVar));
            B1(w1.d.class, new i(eVar));
            B1(e2.e.class, new f(eVar));
            B1(w1.g.class, new w1.h(eVar));
            B1(com.badlogic.gdx.utils.c.class, new s1.f(eVar));
            A1(x1.e.class, ".g3dj", new b2.a(new com.badlogic.gdx.utils.g(), eVar));
            A1(x1.e.class, ".g3db", new b2.a(new s(), eVar));
            A1(x1.e.class, ".obj", new b2.c(eVar));
            B1(w.class, new s1.k(eVar));
            B1(Cubemap.class, new s1.d(eVar));
        }
        this.f82845g = new b3.a(1, "AssetManager");
    }

    public void E1(r1.a aVar, RuntimeException runtimeException) {
        throw runtimeException;
    }
}
