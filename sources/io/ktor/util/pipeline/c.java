package io.ktor.util.pipeline;

import a00.h0;
import a00.i0;
import a00.r0;
import io.ktor.util.pipeline.i;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.x0;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nPipeline.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Pipeline.kt\nio/ktor/util/pipeline/Pipeline\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,513:1\n1557#2:514\n1628#2,3:515\n1863#2,2:518\n808#2,11:520\n295#2,2:531\n1863#2,2:533\n*S KotlinDebug\n*F\n+ 1 Pipeline.kt\nio/ktor/util/pipeline/Pipeline\n*L\n52#1:514\n52#1:515,3\n79#1:518,2\n179#1:520,11\n180#1:531,2\n220#1:533,2\n*E\n"})
/* loaded from: classes8.dex */
public class c<TSubject, TContext> {

    @m80.k
    private volatile /* synthetic */ Object _interceptors;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final xy.b f62051a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f62052b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<Object> f62053c;

    /* renamed from: d, reason: collision with root package name */
    public int f62054d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f62055e;

    /* renamed from: f, reason: collision with root package name */
    @m80.l
    public h f62056f;

    public c(@m80.k h... phases) {
        g0.p(phases, "phases");
        this.f62051a = xy.d.a(true);
        this.f62053c = h0.U(Arrays.copyOf(phases, phases.length));
        this._interceptors = null;
    }

    public final void A(@m80.k h reference, @m80.k h phase) {
        g0.p(reference, "reference");
        g0.p(phase, "phase");
        if (y(phase)) {
            return;
        }
        int t11 = t(reference);
        if (t11 != -1) {
            this.f62053c.add(t11, new b(phase, new i.b(reference)));
            return;
        }
        throw new InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
    }

    public final boolean B(Object obj, h hVar) {
        i h11;
        if (obj == hVar) {
            h11 = i.c.f62062a;
        } else {
            g0.n(obj, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
            h11 = ((b) obj).h();
        }
        if (h11 instanceof i.c) {
            l(hVar);
            return true;
        }
        if (h11 instanceof i.b) {
            i.b bVar = (i.b) h11;
            if (y(bVar.a())) {
                A(bVar.a(), hVar);
                return true;
            }
        }
        if (!(h11 instanceof i.a)) {
            return false;
        }
        z(((i.a) h11).a(), hVar);
        return true;
    }

    public final void C(@m80.k h phase, @m80.k q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object> block) {
        g0.p(phase, "phase");
        g0.p(block, "block");
        b<TSubject, TContext> s11 = s(phase);
        if (s11 == null) {
            throw new InvalidPhaseException("Phase " + phase + " was not registered for this pipeline");
        }
        if (V(phase, block)) {
            this.f62054d++;
            return;
        }
        s11.b(block);
        this.f62054d++;
        P();
        m();
    }

    @m80.k
    public final List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> D(@m80.k h phase) {
        Object obj;
        g0.p(phase, "phase");
        List<Object> list = this.f62053c;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof b) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (g0.g(((b) obj).g(), phase)) {
                break;
            }
        }
        b bVar = (b) obj;
        List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> m11 = bVar != null ? bVar.m() : null;
        return m11 == null ? h0.J() : m11;
    }

    @m80.k
    public final List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> F() {
        List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> v11 = v();
        return v11 == null ? n() : v11;
    }

    public final boolean G() {
        return this.f62054d == 0;
    }

    public final void H(@m80.k c<TSubject, TContext> from) {
        g0.p(from, "from");
        if (r(from)) {
            return;
        }
        K(from);
        J(from);
    }

    public final void J(c<TSubject, TContext> cVar) {
        if (this.f62054d == 0) {
            R(cVar);
        } else {
            P();
        }
        for (Object obj : cVar.f62053c) {
            h hVar = obj instanceof h ? (h) obj : null;
            if (hVar == null) {
                g0.n(obj, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                hVar = ((b) obj).g();
            }
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (!bVar.k()) {
                    b<TSubject, TContext> s11 = s(hVar);
                    g0.m(s11);
                    bVar.c(s11);
                    this.f62054d += bVar.j();
                }
            }
        }
    }

    public final void K(@m80.k c<TSubject, TContext> from) {
        g0.p(from, "from");
        List d62 = r0.d6(from.f62053c);
        while (!d62.isEmpty()) {
            Iterator it = d62.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                h hVar = next instanceof h ? (h) next : null;
                if (hVar == null) {
                    g0.n(next, "null cannot be cast to non-null type io.ktor.util.pipeline.PhaseContent<*, *>");
                    hVar = ((b) next).g();
                }
                if (y(hVar)) {
                    it.remove();
                } else if (B(next, hVar)) {
                    it.remove();
                }
            }
        }
    }

    public final void M(List<? extends q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object>> list) {
        Q(list);
        this.f62055e = false;
        this.f62056f = null;
    }

    @m80.k
    public final List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> N(@m80.k h phase) {
        List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> m11;
        g0.p(phase, "phase");
        b<TSubject, TContext> s11 = s(phase);
        return (s11 == null || (m11 = s11.m()) == null) ? h0.J() : m11;
    }

    public final void O(@m80.k c<TSubject, TContext> from) {
        g0.p(from, "from");
        this.f62053c.clear();
        if (this.f62054d != 0) {
            throw new IllegalStateException("Check failed.");
        }
        r(from);
    }

    public final void P() {
        Q(null);
        this.f62055e = false;
        this.f62056f = null;
    }

    public final void Q(List<? extends q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object>> list) {
        this._interceptors = list;
    }

    public final void R(c<TSubject, TContext> cVar) {
        Q(cVar.T());
        this.f62055e = true;
        this.f62056f = null;
    }

    public final void S(b<TSubject, TContext> bVar) {
        Q(bVar.m());
        this.f62055e = false;
        this.f62056f = bVar.g();
    }

    public final List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> T() {
        if (v() == null) {
            n();
        }
        this.f62055e = true;
        List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> v11 = v();
        g0.m(v11);
        return v11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean V(h hVar, q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object> qVar) {
        List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> v11 = v();
        if (this.f62053c.isEmpty() || v11 == null || this.f62055e || !x0.F(v11)) {
            return false;
        }
        if (g0.g(this.f62056f, hVar)) {
            v11.add(qVar);
            return true;
        }
        if (!g0.g(hVar, r0.u3(this.f62053c)) && t(hVar) != h0.L(this.f62053c)) {
            return false;
        }
        b<TSubject, TContext> s11 = s(hVar);
        g0.m(s11);
        s11.b(qVar);
        v11.add(qVar);
        return true;
    }

    @m80.k
    public final xy.b getAttributes() {
        return this.f62051a;
    }

    public final void l(@m80.k h phase) {
        g0.p(phase, "phase");
        if (y(phase)) {
            return;
        }
        this.f62053c.add(phase);
    }

    public final List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> n() {
        int L;
        int i11 = this.f62054d;
        if (i11 == 0) {
            M(h0.J());
            return h0.J();
        }
        List<Object> list = this.f62053c;
        int i12 = 0;
        if (i11 == 1 && (L = h0.L(list)) >= 0) {
            int i13 = 0;
            while (true) {
                Object obj = list.get(i13);
                b<TSubject, TContext> bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null && !bVar.k()) {
                    List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> m11 = bVar.m();
                    S(bVar);
                    return m11;
                }
                if (i13 == L) {
                    break;
                }
                i13++;
            }
        }
        ArrayList arrayList = new ArrayList();
        int L2 = h0.L(list);
        if (L2 >= 0) {
            while (true) {
                Object obj2 = list.get(i12);
                b bVar2 = obj2 instanceof b ? (b) obj2 : null;
                if (bVar2 != null) {
                    bVar2.d(arrayList);
                }
                if (i12 == L2) {
                    break;
                }
                i12++;
            }
        }
        M(arrayList);
        return arrayList;
    }

    public final d<TSubject, TContext> o(TContext tcontext, TSubject tsubject, kotlin.coroutines.d dVar) {
        return e.a(tcontext, T(), tsubject, dVar, u());
    }

    @m80.l
    public final Object p(@m80.k TContext tcontext, @m80.k TSubject tsubject, @m80.k j00.c<? super TSubject> cVar) {
        return o(tcontext, tsubject, cVar.getContext()).a(tsubject, cVar);
    }

    public final boolean r(c<TSubject, TContext> cVar) {
        if (cVar.f62053c.isEmpty()) {
            return true;
        }
        int i11 = 0;
        if (!this.f62053c.isEmpty()) {
            return false;
        }
        List<Object> list = cVar.f62053c;
        int L = h0.L(list);
        if (L >= 0) {
            while (true) {
                Object obj = list.get(i11);
                if (obj instanceof h) {
                    this.f62053c.add(obj);
                } else if (obj instanceof b) {
                    b bVar = (b) obj;
                    this.f62053c.add(new b(bVar.g(), bVar.h(), bVar.m()));
                }
                if (i11 == L) {
                    break;
                }
                i11++;
            }
        }
        this.f62054d += cVar.f62054d;
        R(cVar);
        return true;
    }

    public final b<TSubject, TContext> s(h hVar) {
        List<Object> list = this.f62053c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj == hVar) {
                b<TSubject, TContext> bVar = new b<>(hVar, i.c.f62062a);
                list.set(i11, bVar);
                return bVar;
            }
            if (obj instanceof b) {
                b<TSubject, TContext> bVar2 = (b) obj;
                if (bVar2.g() == hVar) {
                    return bVar2;
                }
            }
        }
        return null;
    }

    public final int t(h hVar) {
        List<Object> list = this.f62053c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj == hVar || ((obj instanceof b) && ((b) obj).g() == hVar)) {
                return i11;
            }
        }
        return -1;
    }

    @m80.k
    public String toString() {
        return super.toString();
    }

    public boolean u() {
        return this.f62052b;
    }

    public final List<q<d<TSubject, TContext>, TSubject, j00.c<? super g2>, Object>> v() {
        return (List) this._interceptors;
    }

    @m80.k
    public final List<h> x() {
        List<Object> list = this.f62053c;
        ArrayList arrayList = new ArrayList(i0.d0(list, 10));
        for (Object obj : list) {
            h hVar = obj instanceof h ? (h) obj : null;
            if (hVar == null) {
                b bVar = obj instanceof b ? (b) obj : null;
                h g11 = bVar != null ? bVar.g() : null;
                g0.m(g11);
                hVar = g11;
            }
            arrayList.add(hVar);
        }
        return arrayList;
    }

    public final boolean y(h hVar) {
        List<Object> list = this.f62053c;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            Object obj = list.get(i11);
            if (obj == hVar) {
                return true;
            }
            if ((obj instanceof b) && ((b) obj).g() == hVar) {
                return true;
            }
        }
        return false;
    }

    public final void z(@m80.k h reference, @m80.k h phase) {
        i h11;
        h a11;
        g0.p(reference, "reference");
        g0.p(phase, "phase");
        if (y(phase)) {
            return;
        }
        int t11 = t(reference);
        if (t11 == -1) {
            throw new InvalidPhaseException("Phase " + reference + " was not registered for this pipeline");
        }
        int i11 = t11 + 1;
        int L = h0.L(this.f62053c);
        if (i11 <= L) {
            while (true) {
                Object obj = this.f62053c.get(i11);
                b bVar = obj instanceof b ? (b) obj : null;
                if (bVar != null && (h11 = bVar.h()) != null) {
                    i.a aVar = h11 instanceof i.a ? (i.a) h11 : null;
                    if (aVar != null && (a11 = aVar.a()) != null && g0.g(a11, reference)) {
                        t11 = i11;
                    }
                    if (i11 == L) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    break;
                }
            }
        }
        this.f62053c.add(t11 + 1, new b(phase, new i.a(reference)));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public c(@m80.k h phase, @m80.k List<? extends q<? super d<TSubject, TContext>, ? super TSubject, ? super j00.c<? super g2>, ? extends Object>> interceptors) {
        this(phase);
        g0.p(phase, "phase");
        g0.p(interceptors, "interceptors");
        Iterator<T> it = interceptors.iterator();
        while (it.hasNext()) {
            C(phase, (q) it.next());
        }
    }

    public void m() {
    }
}
