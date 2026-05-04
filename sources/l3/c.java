package l3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final b f69282a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final q f69283b;

    public c(@m80.k b bookSale, @m80.k q memberShip) {
        kotlin.jvm.internal.g0.p(bookSale, "bookSale");
        kotlin.jvm.internal.g0.p(memberShip, "memberShip");
        this.f69282a = bookSale;
        this.f69283b = memberShip;
    }

    public static /* synthetic */ c d(c cVar, b bVar, q qVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = cVar.f69282a;
        }
        if ((i11 & 2) != 0) {
            qVar = cVar.f69283b;
        }
        return cVar.c(bVar, qVar);
    }

    @m80.k
    public final b a() {
        return this.f69282a;
    }

    @m80.k
    public final q b() {
        return this.f69283b;
    }

    @m80.k
    public final c c(@m80.k b bookSale, @m80.k q memberShip) {
        kotlin.jvm.internal.g0.p(bookSale, "bookSale");
        kotlin.jvm.internal.g0.p(memberShip, "memberShip");
        return new c(bookSale, memberShip);
    }

    @m80.k
    public final b e() {
        return this.f69282a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.g0.g(this.f69282a, cVar.f69282a) && kotlin.jvm.internal.g0.g(this.f69283b, cVar.f69283b);
    }

    @m80.k
    public final q f() {
        return this.f69283b;
    }

    public int hashCode() {
        return (this.f69282a.hashCode() * 31) + this.f69283b.hashCode();
    }

    @m80.k
    public String toString() {
        return "BookSaleWithMember(bookSale=" + this.f69282a + ", memberShip=" + this.f69283b + ')';
    }
}
