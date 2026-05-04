package kx;

import a00.d1;
import a00.g0;
import a00.i0;
import a00.r0;
import ix.q0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.u0;
import q30.k0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCIOHeaders.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CIOHeaders.kt\nio/ktor/http/cio/CIOHeaders\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,41:1\n1#2:42\n1557#3:43\n1628#3,3:44\n*S KotlinDebug\n*F\n+ 1 CIOHeaders.kt\nio/ktor/http/cio/CIOHeaders\n*L\n33#1:43\n33#1:44,3\n*E\n"})
/* loaded from: classes8.dex */
public final class c implements q0 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final s f68952d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final yz.c0 f68953e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a implements Map.Entry<String, List<? extends String>>, y00.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f68954a;

        public a(int i11) {
            this.f68954a = i11;
        }

        @Override // java.util.Map.Entry
        @m80.k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public String getKey() {
            return c.this.f68952d.n(this.f68954a).toString();
        }

        @Override // java.util.Map.Entry
        @m80.k
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public List<String> getValue() {
            return g0.l(c.this.f68952d.q(this.f68954a).toString());
        }

        public List<String> c(List<String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.Map.Entry
        public /* bridge */ /* synthetic */ List<? extends String> setValue(List<? extends String> list) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public c(@m80.k s headers) {
        kotlin.jvm.internal.g0.p(headers, "headers");
        this.f68952d = headers;
        this.f68953e = yz.e0.b(LazyThreadSafetyMode.NONE, new x00.a() { // from class: kx.a
            @Override // x00.a
            public final Object invoke() {
                LinkedHashSet j11;
                j11 = c.j(c.this);
                return j11;
            }
        });
    }

    public static final String h(CharSequence it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it.toString();
    }

    public static final LinkedHashSet j(c cVar) {
        LinkedHashSet linkedHashSet = new LinkedHashSet(cVar.f68952d.m());
        int m11 = cVar.f68952d.m();
        for (int i11 = 0; i11 < m11; i11++) {
            linkedHashSet.add(cVar.f68952d.n(i11).toString());
        }
        return linkedHashSet;
    }

    @Override // xy.u1
    @m80.l
    public List<String> a(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        List<String> I3 = k0.I3(k0.N1(this.f68952d.h(name), new x00.l() { // from class: kx.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                String h11;
                h11 = c.h((CharSequence) obj);
                return h11;
            }
        }));
        if (I3.isEmpty()) {
            return null;
        }
        return I3;
    }

    @Override // xy.u1
    public boolean b() {
        return true;
    }

    @Override // xy.u1
    public boolean c(@m80.k String str, @m80.k String str2) {
        return q0.b.b(this, str, str2);
    }

    @Override // xy.u1
    public boolean contains(@m80.k String str) {
        return q0.b.a(this, str);
    }

    @Override // xy.u1
    public void d(@m80.k x00.p<? super String, ? super List<String>, g2> pVar) {
        q0.b.c(this, pVar);
    }

    @Override // xy.u1
    @m80.k
    public Set<Map.Entry<String, List<String>>> entries() {
        g10.l W1 = g10.u.W1(0, this.f68952d.m());
        ArrayList arrayList = new ArrayList(i0.d0(W1, 10));
        Iterator<Integer> it = W1.iterator();
        while (it.hasNext()) {
            arrayList.add(new a(((d1) it).nextInt()));
        }
        return r0.f6(arrayList);
    }

    @Override // xy.u1
    @m80.l
    public String get(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        CharSequence g11 = this.f68952d.g(name);
        if (g11 != null) {
            return g11.toString();
        }
        return null;
    }

    public final Set<String> i() {
        return (Set) this.f68953e.getValue();
    }

    @Override // xy.u1
    public boolean isEmpty() {
        return this.f68952d.m() == 0;
    }

    @Override // xy.u1
    @m80.k
    public Set<String> names() {
        return i();
    }
}
