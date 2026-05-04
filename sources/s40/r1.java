package s40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class r1 extends u40.s<j3> {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final s1 f87763d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(@m80.k s1 names) {
        super(k3.f87706a.a(), names.c(), "monthName");
        kotlin.jvm.internal.g0.p(names, "names");
        this.f87763d = names;
    }

    @Override // u40.l
    @m80.k
    public String d() {
        String i11;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("monthName(");
        i11 = o3.i(this.f87763d);
        sb2.append(i11);
        sb2.append(')');
        return sb2.toString();
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof r1) && kotlin.jvm.internal.g0.g(this.f87763d.c(), ((r1) obj).f87763d.c());
    }

    public int hashCode() {
        return this.f87763d.c().hashCode();
    }
}
