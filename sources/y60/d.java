package y60;

import c80.a0;
import c80.b0;
import c80.c0;
import c80.d0;
import c80.f0;
import c80.i;
import c80.j;
import c80.k;
import c80.m;
import c80.n;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import javax.net.ServerSocketFactory;
import javax.net.ssl.SSLContext;
import org.apache.http.q;
import org.apache.http.r;
import org.apache.http.s;
import x60.h;
import x60.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f99436a;

    /* renamed from: b, reason: collision with root package name */
    public InetAddress f99437b;

    /* renamed from: c, reason: collision with root package name */
    public v60.f f99438c;

    /* renamed from: d, reason: collision with root package name */
    public v60.a f99439d;

    /* renamed from: e, reason: collision with root package name */
    public LinkedList<q> f99440e;

    /* renamed from: f, reason: collision with root package name */
    public LinkedList<q> f99441f;

    /* renamed from: g, reason: collision with root package name */
    public LinkedList<s> f99442g;

    /* renamed from: h, reason: collision with root package name */
    public LinkedList<s> f99443h;

    /* renamed from: i, reason: collision with root package name */
    public String f99444i;

    /* renamed from: j, reason: collision with root package name */
    public j f99445j;

    /* renamed from: k, reason: collision with root package name */
    public org.apache.http.a f99446k;

    /* renamed from: l, reason: collision with root package name */
    public r f99447l;

    /* renamed from: m, reason: collision with root package name */
    public n f99448m;

    /* renamed from: n, reason: collision with root package name */
    public Map<String, m> f99449n;

    /* renamed from: o, reason: collision with root package name */
    public i f99450o;

    /* renamed from: p, reason: collision with root package name */
    public ServerSocketFactory f99451p;

    /* renamed from: q, reason: collision with root package name */
    public SSLContext f99452q;

    /* renamed from: r, reason: collision with root package name */
    public c f99453r;

    /* renamed from: s, reason: collision with root package name */
    public org.apache.http.j<? extends x60.g> f99454s;

    /* renamed from: t, reason: collision with root package name */
    public org.apache.http.c f99455t;

    public static d e() {
        return new d();
    }

    public final d a(q qVar) {
        if (qVar == null) {
            return this;
        }
        if (this.f99440e == null) {
            this.f99440e = new LinkedList<>();
        }
        this.f99440e.addFirst(qVar);
        return this;
    }

    public final d b(s sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f99442g == null) {
            this.f99442g = new LinkedList<>();
        }
        this.f99442g.addFirst(sVar);
        return this;
    }

    public final d c(q qVar) {
        if (qVar == null) {
            return this;
        }
        if (this.f99441f == null) {
            this.f99441f = new LinkedList<>();
        }
        this.f99441f.addLast(qVar);
        return this;
    }

    public final d d(s sVar) {
        if (sVar == null) {
            return this;
        }
        if (this.f99443h == null) {
            this.f99443h = new LinkedList<>();
        }
        this.f99443h.addLast(sVar);
        return this;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [c80.n] */
    /* JADX WARN: Type inference failed for: r1v27, types: [c80.f0] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public a f() {
        j jVar = this.f99445j;
        if (jVar == null) {
            k n11 = k.n();
            LinkedList<q> linkedList = this.f99440e;
            if (linkedList != null) {
                Iterator<q> it = linkedList.iterator();
                while (it.hasNext()) {
                    n11.i(it.next());
                }
            }
            LinkedList<s> linkedList2 = this.f99442g;
            if (linkedList2 != null) {
                Iterator<s> it2 = linkedList2.iterator();
                while (it2.hasNext()) {
                    n11.j(it2.next());
                }
            }
            String str = this.f99444i;
            if (str == null) {
                str = "Apache-HttpCore/1.1";
            }
            n11.d(new c0(), new d0(str), new b0(), new a0());
            LinkedList<q> linkedList3 = this.f99441f;
            if (linkedList3 != null) {
                Iterator<q> it3 = linkedList3.iterator();
                while (it3.hasNext()) {
                    n11.k(it3.next());
                }
            }
            LinkedList<s> linkedList4 = this.f99443h;
            if (linkedList4 != null) {
                Iterator<s> it4 = linkedList4.iterator();
                while (it4.hasNext()) {
                    n11.l(it4.next());
                }
            }
            jVar = n11.m();
        }
        j jVar2 = jVar;
        ?? r12 = this.f99448m;
        if (r12 == 0) {
            r12 = new f0();
            Map<String, m> map = this.f99449n;
            if (map != null) {
                for (Map.Entry<String, m> entry : map.entrySet()) {
                    r12.c(entry.getKey(), entry.getValue());
                }
            }
        }
        n nVar = r12;
        org.apache.http.a aVar = this.f99446k;
        if (aVar == null) {
            aVar = x60.i.f97640a;
        }
        org.apache.http.a aVar2 = aVar;
        r rVar = this.f99447l;
        if (rVar == null) {
            rVar = l.f97646b;
        }
        c80.s sVar = new c80.s(jVar2, aVar2, rVar, nVar, this.f99450o);
        ServerSocketFactory serverSocketFactory = this.f99451p;
        if (serverSocketFactory == null) {
            SSLContext sSLContext = this.f99452q;
            serverSocketFactory = sSLContext != null ? sSLContext.getServerSocketFactory() : ServerSocketFactory.getDefault();
        }
        ServerSocketFactory serverSocketFactory2 = serverSocketFactory;
        org.apache.http.j jVar3 = this.f99454s;
        if (jVar3 == null) {
            jVar3 = this.f99439d != null ? new h(this.f99439d) : h.f97634f;
        }
        org.apache.http.j jVar4 = jVar3;
        org.apache.http.c cVar = this.f99455t;
        if (cVar == null) {
            cVar = org.apache.http.c.f77710a;
        }
        org.apache.http.c cVar2 = cVar;
        int i11 = this.f99436a;
        int i12 = i11 > 0 ? i11 : 0;
        InetAddress inetAddress = this.f99437b;
        v60.f fVar = this.f99438c;
        if (fVar == null) {
            fVar = v60.f.f93136i;
        }
        return new a(i12, inetAddress, fVar, serverSocketFactory2, sVar, jVar4, this.f99453r, cVar2);
    }

    public final d g(String str, m mVar) {
        if (str != null && mVar != null) {
            if (this.f99449n == null) {
                this.f99449n = new HashMap();
            }
            this.f99449n.put(str, mVar);
        }
        return this;
    }

    public final d h(v60.a aVar) {
        this.f99439d = aVar;
        return this;
    }

    public final d i(org.apache.http.j<? extends x60.g> jVar) {
        this.f99454s = jVar;
        return this;
    }

    public final d j(org.apache.http.a aVar) {
        this.f99446k = aVar;
        return this;
    }

    public final d k(org.apache.http.c cVar) {
        this.f99455t = cVar;
        return this;
    }

    public final d l(i iVar) {
        this.f99450o = iVar;
        return this;
    }

    public final d m(n nVar) {
        this.f99448m = nVar;
        return this;
    }

    public final d n(j jVar) {
        this.f99445j = jVar;
        return this;
    }

    public final d o(int i11) {
        this.f99436a = i11;
        return this;
    }

    public final d p(InetAddress inetAddress) {
        this.f99437b = inetAddress;
        return this;
    }

    public final d q(r rVar) {
        this.f99447l = rVar;
        return this;
    }

    public final d r(String str) {
        this.f99444i = str;
        return this;
    }

    public final d s(ServerSocketFactory serverSocketFactory) {
        this.f99451p = serverSocketFactory;
        return this;
    }

    public final d t(v60.f fVar) {
        this.f99438c = fVar;
        return this;
    }

    public final d u(SSLContext sSLContext) {
        this.f99452q = sSLContext;
        return this;
    }

    public final d v(c cVar) {
        this.f99453r = cVar;
        return this;
    }
}
