package k50;

import kotlin.DeprecationLevel;
import kotlinx.serialization.json.ClassDiscriminatorMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65944a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65945b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f65946c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f65947d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f65948e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f65949f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final String f65950g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f65951h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f65952i;

    /* renamed from: j, reason: collision with root package name */
    @m80.k
    public final String f65953j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f65954k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f65955l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public final e0 f65956m;

    /* renamed from: n, reason: collision with root package name */
    public final boolean f65957n;

    /* renamed from: o, reason: collision with root package name */
    public final boolean f65958o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f65959p;

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public ClassDiscriminatorMode f65960q;

    public g() {
        this(false, false, false, false, false, false, null, false, false, null, false, false, null, false, false, false, null, 131071, null);
    }

    public final boolean a() {
        return this.f65959p;
    }

    public final boolean c() {
        return this.f65954k;
    }

    public final boolean d() {
        return this.f65947d;
    }

    public final boolean e() {
        return this.f65958o;
    }

    @m80.k
    public final String g() {
        return this.f65953j;
    }

    @m80.k
    public final ClassDiscriminatorMode h() {
        return this.f65960q;
    }

    public final boolean j() {
        return this.f65951h;
    }

    public final boolean k() {
        return this.f65957n;
    }

    public final boolean m() {
        return this.f65944a;
    }

    public final boolean n() {
        return this.f65949f;
    }

    public final boolean o() {
        return this.f65945b;
    }

    @m80.l
    public final e0 p() {
        return this.f65956m;
    }

    public final boolean r() {
        return this.f65948e;
    }

    @m80.k
    public final String s() {
        return this.f65950g;
    }

    @m80.k
    public String toString() {
        return "JsonConfiguration(encodeDefaults=" + this.f65944a + ", ignoreUnknownKeys=" + this.f65945b + ", isLenient=" + this.f65946c + ", allowStructuredMapKeys=" + this.f65947d + ", prettyPrint=" + this.f65948e + ", explicitNulls=" + this.f65949f + ", prettyPrintIndent='" + this.f65950g + "', coerceInputValues=" + this.f65951h + ", useArrayPolymorphism=" + this.f65952i + ", classDiscriminator='" + this.f65953j + "', allowSpecialFloatingPointValues=" + this.f65954k + ", useAlternativeNames=" + this.f65955l + ", namingStrategy=" + this.f65956m + ", decodeEnumsCaseInsensitive=" + this.f65957n + ", allowTrailingComma=" + this.f65958o + ", allowComments=" + this.f65959p + ", classDiscriminatorMode=" + this.f65960q + ')';
    }

    public final boolean u() {
        return this.f65955l;
    }

    public final boolean v() {
        return this.f65952i;
    }

    public final boolean w() {
        return this.f65946c;
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "JsonConfiguration is not meant to be mutable, and will be made read-only in a future release. The `Json(from = ...) {}` copy builder should be used instead.")
    public final void x(@m80.k ClassDiscriminatorMode classDiscriminatorMode) {
        kotlin.jvm.internal.g0.p(classDiscriminatorMode, "<set-?>");
        this.f65960q = classDiscriminatorMode;
    }

    public g(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, @m80.k String prettyPrintIndent, boolean z17, boolean z18, @m80.k String classDiscriminator, boolean z19, boolean z21, @m80.l e0 e0Var, boolean z22, boolean z23, boolean z24, @m80.k ClassDiscriminatorMode classDiscriminatorMode) {
        kotlin.jvm.internal.g0.p(prettyPrintIndent, "prettyPrintIndent");
        kotlin.jvm.internal.g0.p(classDiscriminator, "classDiscriminator");
        kotlin.jvm.internal.g0.p(classDiscriminatorMode, "classDiscriminatorMode");
        this.f65944a = z11;
        this.f65945b = z12;
        this.f65946c = z13;
        this.f65947d = z14;
        this.f65948e = z15;
        this.f65949f = z16;
        this.f65950g = prettyPrintIndent;
        this.f65951h = z17;
        this.f65952i = z18;
        this.f65953j = classDiscriminator;
        this.f65954k = z19;
        this.f65955l = z21;
        this.f65956m = e0Var;
        this.f65957n = z22;
        this.f65958o = z23;
        this.f65959p = z24;
        this.f65960q = classDiscriminatorMode;
    }

    @f50.f
    public static /* synthetic */ void b() {
    }

    @f50.f
    public static /* synthetic */ void f() {
    }

    @f50.f
    public static /* synthetic */ void i() {
    }

    @f50.f
    public static /* synthetic */ void l() {
    }

    @f50.f
    public static /* synthetic */ void q() {
    }

    @f50.f
    public static /* synthetic */ void t() {
    }

    public /* synthetic */ g(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, String str, boolean z17, boolean z18, String str2, boolean z19, boolean z21, e0 e0Var, boolean z22, boolean z23, boolean z24, ClassDiscriminatorMode classDiscriminatorMode, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? false : z11, (i11 & 2) != 0 ? false : z12, (i11 & 4) != 0 ? false : z13, (i11 & 8) != 0 ? false : z14, (i11 & 16) != 0 ? false : z15, (i11 & 32) != 0 ? true : z16, (i11 & 64) != 0 ? "    " : str, (i11 & 128) != 0 ? false : z17, (i11 & 256) != 0 ? false : z18, (i11 & 512) != 0 ? "type" : str2, (i11 & 1024) != 0 ? false : z19, (i11 & 2048) == 0 ? z21 : true, (i11 & 4096) != 0 ? null : e0Var, (i11 & 8192) != 0 ? false : z22, (i11 & 16384) != 0 ? false : z23, (i11 & 32768) != 0 ? false : z24, (i11 & 65536) != 0 ? ClassDiscriminatorMode.POLYMORPHIC : classDiscriminatorMode);
    }
}
