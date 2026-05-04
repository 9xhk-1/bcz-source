package e30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r extends p1<r> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final q10.g f48650a;

    public r(@m80.k q10.g annotations) {
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        this.f48650a = annotations;
    }

    @Override // e30.p1
    @m80.k
    public h10.d<? extends r> b() {
        return kotlin.jvm.internal.o0.d(r.class);
    }

    @Override // e30.p1
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public r a(@m80.l r rVar) {
        return rVar == null ? this : new r(q10.i.a(this.f48650a, rVar.f48650a));
    }

    @m80.k
    public final q10.g e() {
        return this.f48650a;
    }

    public boolean equals(@m80.l Object obj) {
        if (obj instanceof r) {
            return kotlin.jvm.internal.g0.g(((r) obj).f48650a, this.f48650a);
        }
        return false;
    }

    @Override // e30.p1
    @m80.l
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public r c(@m80.l r rVar) {
        if (kotlin.jvm.internal.g0.g(rVar, this)) {
            return this;
        }
        return null;
    }

    public int hashCode() {
        return this.f48650a.hashCode();
    }
}
