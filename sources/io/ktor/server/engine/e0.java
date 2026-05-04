package io.ktor.server.engine;

import ix.q0;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBaseApplicationRequest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BaseApplicationRequest.kt\nio/ktor/server/engine/DelegateHeaders\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,86:1\n827#2:87\n855#2,2:88\n*S KotlinDebug\n*F\n+ 1 BaseApplicationRequest.kt\nio/ktor/server/engine/DelegateHeaders\n*L\n79#1:87\n79#1:88,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e0 implements ix.q0 {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final ix.q0 f61366d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final ix.r0 f61367e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final Set<String> f61368f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f61369g;

    public e0(@m80.k ix.q0 original) {
        kotlin.jvm.internal.g0.p(original, "original");
        this.f61366d = original;
        this.f61367e = new ix.r0(0, 1, null);
        this.f61368f = new LinkedHashSet();
        this.f61369g = original.b();
    }

    @Override // xy.u1
    @m80.l
    public List<String> a(@m80.k String name) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (this.f61368f.contains(name)) {
            return null;
        }
        return this.f61367e.contains(name) ? this.f61367e.a(name) : this.f61366d.a(name);
    }

    @Override // xy.u1
    public boolean b() {
        return this.f61369g;
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
    public void d(@m80.k x00.p<? super String, ? super List<String>, yz.g2> pVar) {
        q0.b.c(this, pVar);
    }

    public final void e(@m80.k String name, @m80.l List<String> list) {
        kotlin.jvm.internal.g0.p(name, "name");
        if (list == null) {
            this.f61368f.add(name);
            this.f61367e.remove(name);
        } else {
            this.f61367e.f(name, list);
            this.f61368f.remove(name);
        }
    }

    @Override // xy.u1
    @m80.k
    public Set<Map.Entry<String, List<String>>> entries() {
        Set C = a00.x1.C(this.f61366d.entries(), this.f61367e.build().entries());
        ArrayList arrayList = new ArrayList();
        for (Object obj : C) {
            if (!this.f61368f.contains(((Map.Entry) obj).getKey())) {
                arrayList.add(obj);
            }
        }
        return a00.r0.f6(arrayList);
    }

    @Override // xy.u1
    @m80.l
    public String get(@m80.k String str) {
        return q0.b.d(this, str);
    }

    @Override // xy.u1
    public boolean isEmpty() {
        return names().isEmpty();
    }

    @Override // xy.u1
    @m80.k
    public Set<String> names() {
        return a00.x1.x(a00.x1.C(this.f61366d.names(), this.f61367e.names()), this.f61368f);
    }
}
