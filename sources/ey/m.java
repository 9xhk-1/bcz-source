package ey;

import a00.h0;
import a00.l1;
import a00.r0;
import a00.x1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import u30.f0;
import yz.c0;
import yz.e0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMergedApplicationConfig.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MergedApplicationConfig.kt\nio/ktor/server/config/MergedApplicationConfig\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,74:1\n2632#2,3:75\n2632#2,3:78\n*S KotlinDebug\n*F\n+ 1 MergedApplicationConfig.kt\nio/ktor/server/config/MergedApplicationConfig\n*L\n59#1:75,3\n60#1:78,3\n*E\n"})
/* loaded from: classes8.dex */
public final class m implements a {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final a f50240a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final a f50241b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final c0 f50242c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final c0 f50243d;

    public m(@m80.k a first, @m80.k a second) {
        g0.p(first, "first");
        g0.p(second, "second");
        this.f50240a = first;
        this.f50241b = second;
        this.f50242c = e0.c(new x00.a() { // from class: ey.k
            @Override // x00.a
            public final Object invoke() {
                Set h11;
                h11 = m.h(m.this);
                return h11;
            }
        });
        this.f50243d = e0.c(new x00.a() { // from class: ey.l
            @Override // x00.a
            public final Object invoke() {
                Set m11;
                m11 = m.m(m.this);
                return m11;
            }
        });
    }

    public static final Set h(m mVar) {
        return mVar.f50240a.keys();
    }

    public static final Set m(m mVar) {
        return mVar.f50241b.keys();
    }

    @Override // ey.a
    @m80.k
    public List<a> a(@m80.k String path) {
        g0.p(path, "path");
        return r0.I4(j().contains(path) ? this.f50240a.a(path) : h0.J(), l().contains(path) ? this.f50241b.a(path) : h0.J());
    }

    @Override // ey.a
    @m80.k
    public a b(@m80.k String path) {
        g0.p(path, "path");
        Set<String> j11 = j();
        if (!(j11 instanceof Collection) || !j11.isEmpty()) {
            Iterator<T> it = j11.iterator();
            while (it.hasNext()) {
                if (f0.J2((String) it.next(), path + '.', false, 2, null)) {
                    Set<String> l11 = l();
                    if (!(l11 instanceof Collection) || !l11.isEmpty()) {
                        Iterator<T> it2 = l11.iterator();
                        while (it2.hasNext()) {
                            if (f0.J2((String) it2.next(), path + '.', false, 2, null)) {
                                return new m(this.f50240a.b(path), this.f50241b.b(path));
                            }
                        }
                    }
                    return this.f50240a.b(path);
                }
            }
        }
        return this.f50241b.b(path);
    }

    @Override // ey.a
    @m80.k
    public Map<String, Object> c() {
        return l1.n0(this.f50241b.c(), this.f50240a.c());
    }

    @Override // ey.a
    @m80.l
    public c d(@m80.k String path) {
        g0.p(path, "path");
        return j().contains(path) ? this.f50240a.d(path) : this.f50241b.d(path);
    }

    @Override // ey.a
    @m80.k
    public c e(@m80.k String path) {
        g0.p(path, "path");
        return j().contains(path) ? this.f50240a.e(path) : this.f50241b.e(path);
    }

    @m80.k
    public final a i() {
        return this.f50240a;
    }

    public final Set<String> j() {
        return (Set) this.f50242c.getValue();
    }

    @m80.k
    public final a k() {
        return this.f50241b;
    }

    @Override // ey.a
    @m80.k
    public Set<String> keys() {
        return x1.C(j(), l());
    }

    public final Set<String> l() {
        return (Set) this.f50243d.getValue();
    }
}
