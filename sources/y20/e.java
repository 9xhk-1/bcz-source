package y20;

import e30.c1;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class e implements g, j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final p10.b f99221a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final e f99222b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final p10.b f99223c;

    public e(@m80.k p10.b classDescriptor, @l e eVar) {
        g0.p(classDescriptor, "classDescriptor");
        this.f99221a = classDescriptor;
        this.f99222b = eVar == null ? this : eVar;
        this.f99223c = classDescriptor;
    }

    @Override // y20.h
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public c1 getType() {
        c1 s11 = this.f99221a.s();
        g0.o(s11, "getDefaultType(...)");
        return s11;
    }

    public boolean equals(@l Object obj) {
        p10.b bVar = this.f99221a;
        e eVar = obj instanceof e ? (e) obj : null;
        return g0.g(bVar, eVar != null ? eVar.f99221a : null);
    }

    public int hashCode() {
        return this.f99221a.hashCode();
    }

    @Override // y20.j
    @m80.k
    public final p10.b l() {
        return this.f99221a;
    }

    @m80.k
    public String toString() {
        return "Class{" + getType() + l50.b.f69928j;
    }
}
