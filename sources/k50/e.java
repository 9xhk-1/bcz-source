package k50;

import kotlin.jvm.internal.u0;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJson.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n+ 2 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,724:1\n1069#2,2:725\n*S KotlinDebug\n*F\n+ 1 Json.kt\nkotlinx/serialization/json/JsonBuilder\n*L\n687#1:725,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public boolean f65920a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f65921b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f65922c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f65923d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f65924e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public String f65925f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f65926g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public String f65927h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public ClassDiscriminatorMode f65928i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f65929j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public e0 f65930k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f65931l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f65932m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f65933n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f65934o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f65935p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f65936q;

    /* renamed from: r, reason: collision with root package name */
    @m80.k
    public o50.f f65937r;

    public e(@m80.k a json) {
        kotlin.jvm.internal.g0.p(json, "json");
        this.f65920a = json.i().m();
        this.f65921b = json.i().n();
        this.f65922c = json.i().o();
        this.f65923d = json.i().w();
        this.f65924e = json.i().r();
        this.f65925f = json.i().s();
        this.f65926g = json.i().j();
        this.f65927h = json.i().g();
        this.f65928i = json.i().h();
        this.f65929j = json.i().u();
        this.f65930k = json.i().p();
        this.f65931l = json.i().k();
        this.f65932m = json.i().e();
        this.f65933n = json.i().a();
        this.f65934o = json.i().c();
        this.f65935p = json.i().d();
        this.f65936q = json.i().v();
        this.f65937r = json.getSerializersModule();
    }

    public final void A(boolean z11) {
        this.f65934o = z11;
    }

    public final void B(boolean z11) {
        this.f65935p = z11;
    }

    public final void C(boolean z11) {
        this.f65932m = z11;
    }

    public final void D(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f65927h = str;
    }

    public final void E(@m80.k ClassDiscriminatorMode classDiscriminatorMode) {
        kotlin.jvm.internal.g0.p(classDiscriminatorMode, "<set-?>");
        this.f65928i = classDiscriminatorMode;
    }

    public final void F(boolean z11) {
        this.f65926g = z11;
    }

    public final void G(boolean z11) {
        this.f65931l = z11;
    }

    public final void H(boolean z11) {
        this.f65920a = z11;
    }

    public final void I(boolean z11) {
        this.f65921b = z11;
    }

    public final void J(boolean z11) {
        this.f65922c = z11;
    }

    public final void K(boolean z11) {
        this.f65923d = z11;
    }

    public final void L(@m80.l e0 e0Var) {
        this.f65930k = e0Var;
    }

    public final void M(boolean z11) {
        this.f65924e = z11;
    }

    public final void N(@m80.k String str) {
        kotlin.jvm.internal.g0.p(str, "<set-?>");
        this.f65925f = str;
    }

    public final void O(@m80.k o50.f fVar) {
        kotlin.jvm.internal.g0.p(fVar, "<set-?>");
        this.f65937r = fVar;
    }

    public final void P(boolean z11) {
        this.f65929j = z11;
    }

    public final void Q(boolean z11) {
        this.f65936q = z11;
    }

    @m80.k
    public final g a() {
        if (this.f65936q) {
            if (!kotlin.jvm.internal.g0.g(this.f65927h, "type")) {
                throw new IllegalArgumentException("Class discriminator should not be specified when array polymorphism is specified");
            }
            if (this.f65928i != ClassDiscriminatorMode.POLYMORPHIC) {
                throw new IllegalArgumentException("useArrayPolymorphism option can only be used if classDiscriminatorMode in a default POLYMORPHIC state.");
            }
        }
        if (this.f65924e) {
            if (!kotlin.jvm.internal.g0.g(this.f65925f, "    ")) {
                String str = this.f65925f;
                for (int i11 = 0; i11 < str.length(); i11++) {
                    char charAt = str.charAt(i11);
                    if (charAt != ' ' && charAt != '\t' && charAt != '\r' && charAt != '\n') {
                        throw new IllegalArgumentException(("Only whitespace, tab, newline and carriage return are allowed as pretty print symbols. Had " + this.f65925f).toString());
                    }
                }
            }
        } else if (!kotlin.jvm.internal.g0.g(this.f65925f, "    ")) {
            throw new IllegalArgumentException("Indent should not be specified when default printing mode is used");
        }
        return new g(this.f65920a, this.f65922c, this.f65923d, this.f65935p, this.f65924e, this.f65921b, this.f65925f, this.f65926g, this.f65936q, this.f65927h, this.f65934o, this.f65929j, this.f65930k, this.f65931l, this.f65932m, this.f65933n, this.f65928i);
    }

    public final boolean b() {
        return this.f65933n;
    }

    public final boolean d() {
        return this.f65934o;
    }

    public final boolean e() {
        return this.f65935p;
    }

    public final boolean f() {
        return this.f65932m;
    }

    @m80.k
    public final String h() {
        return this.f65927h;
    }

    @m80.k
    public final ClassDiscriminatorMode i() {
        return this.f65928i;
    }

    public final boolean k() {
        return this.f65926g;
    }

    public final boolean l() {
        return this.f65931l;
    }

    public final boolean n() {
        return this.f65920a;
    }

    public final boolean o() {
        return this.f65921b;
    }

    public final boolean p() {
        return this.f65922c;
    }

    @m80.l
    public final e0 q() {
        return this.f65930k;
    }

    public final boolean s() {
        return this.f65924e;
    }

    @m80.k
    public final String t() {
        return this.f65925f;
    }

    @m80.k
    public final o50.f v() {
        return this.f65937r;
    }

    public final boolean w() {
        return this.f65929j;
    }

    public final boolean x() {
        return this.f65936q;
    }

    public final boolean y() {
        return this.f65923d;
    }

    public final void z(boolean z11) {
        this.f65933n = z11;
    }

    @f50.f
    public static /* synthetic */ void c() {
    }

    @f50.f
    public static /* synthetic */ void g() {
    }

    @f50.f
    public static /* synthetic */ void j() {
    }

    @f50.f
    public static /* synthetic */ void m() {
    }

    @f50.f
    public static /* synthetic */ void r() {
    }

    @f50.f
    public static /* synthetic */ void u() {
    }
}
