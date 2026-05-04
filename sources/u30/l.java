package u30;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f91681a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final g10.l f91682b;

    public l(@m80.k String value, @m80.k g10.l range) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(range, "range");
        this.f91681a = value;
        this.f91682b = range;
    }

    public static /* synthetic */ l d(l lVar, String str, g10.l lVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = lVar.f91681a;
        }
        if ((i11 & 2) != 0) {
            lVar2 = lVar.f91682b;
        }
        return lVar.c(str, lVar2);
    }

    @m80.k
    public final String a() {
        return this.f91681a;
    }

    @m80.k
    public final g10.l b() {
        return this.f91682b;
    }

    @m80.k
    public final l c(@m80.k String value, @m80.k g10.l range) {
        kotlin.jvm.internal.g0.p(value, "value");
        kotlin.jvm.internal.g0.p(range, "range");
        return new l(value, range);
    }

    @m80.k
    public final g10.l e() {
        return this.f91682b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return kotlin.jvm.internal.g0.g(this.f91681a, lVar.f91681a) && kotlin.jvm.internal.g0.g(this.f91682b, lVar.f91682b);
    }

    @m80.k
    public final String f() {
        return this.f91681a;
    }

    public int hashCode() {
        return (this.f91681a.hashCode() * 31) + this.f91682b.hashCode();
    }

    @m80.k
    public String toString() {
        return "MatchGroup(value=" + this.f91681a + ", range=" + this.f91682b + ')';
    }
}
