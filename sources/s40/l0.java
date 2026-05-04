package s40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l0 extends u40.s<j> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final m0 f87728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(@m80.k m0 names) {
        super(k.f87697a.c(), names.c(), "dayOfWeekName");
        kotlin.jvm.internal.g0.p(names, "names");
        this.f87728d = names;
    }

    @Override // u40.l
    @m80.k
    public String d() {
        String m11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("dayOfWeek(");
        m11 = b1.m(this.f87728d);
        sb2.append(m11);
        sb2.append(')');
        return sb2.toString();
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof l0) && kotlin.jvm.internal.g0.g(this.f87728d.c(), ((l0) obj).f87728d.c());
    }

    public int hashCode() {
        return this.f87728d.c().hashCode();
    }
}
