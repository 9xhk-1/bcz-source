package ix;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nCookieUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CookieUtils.kt\nio/ktor/http/StringLexer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,349:1\n1#2:350\n*E\n"})
/* loaded from: classes8.dex */
public final class a2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f62709a;

    /* renamed from: b, reason: collision with root package name */
    public int f62710b;

    public a2(@m80.k String source) {
        kotlin.jvm.internal.g0.p(source, "source");
        this.f62709a = source;
    }

    public final boolean a(@m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        boolean h11 = h(predicate);
        if (h11) {
            this.f62710b++;
        }
        return h11;
    }

    public final boolean b(@m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        if (!h(predicate)) {
            return false;
        }
        while (h(predicate)) {
            this.f62710b++;
        }
        return true;
    }

    @m80.k
    public final String c(@m80.k x00.l<? super a2, yz.g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        int e11 = e();
        block.invoke(this);
        String substring = f().substring(e11, e());
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        return substring;
    }

    public final boolean d() {
        return this.f62710b < this.f62709a.length();
    }

    public final int e() {
        return this.f62710b;
    }

    @m80.k
    public final String f() {
        return this.f62709a;
    }

    public final void g(int i11) {
        this.f62710b = i11;
    }

    public final boolean h(@m80.k x00.l<? super Character, Boolean> predicate) {
        kotlin.jvm.internal.g0.p(predicate, "predicate");
        return this.f62710b < this.f62709a.length() && predicate.invoke(Character.valueOf(this.f62709a.charAt(this.f62710b))).booleanValue();
    }
}
