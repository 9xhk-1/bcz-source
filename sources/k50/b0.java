package k50;

import kotlin.jvm.internal.u0;
import l50.q1;
import l50.r1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJsonElement.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonElement.kt\nkotlinx/serialization/json/JsonLiteral\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,350:1\n1#2:351\n*E\n"})
/* loaded from: classes8.dex */
public final class b0 extends l0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65908a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final h50.f f65909b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final String f65910c;

    public /* synthetic */ b0(Object obj, boolean z11, h50.f fVar, int i11, kotlin.jvm.internal.v vVar) {
        this(obj, z11, (i11 & 4) != 0 ? null : fVar);
    }

    @Override // k50.l0
    @m80.k
    public String b() {
        return this.f65910c;
    }

    @Override // k50.l0
    public boolean d() {
        return this.f65908a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b0.class != obj.getClass()) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return d() == b0Var.d() && kotlin.jvm.internal.g0.g(b(), b0Var.b());
    }

    @m80.l
    public final h50.f g() {
        return this.f65909b;
    }

    @r1
    public int hashCode() {
        return (Boolean.hashCode(d()) * 31) + b().hashCode();
    }

    @Override // k50.l0
    @m80.k
    public String toString() {
        if (!d()) {
            return b();
        }
        StringBuilder sb2 = new StringBuilder();
        q1.d(sb2, b());
        return sb2.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(@m80.k Object body, boolean z11, @m80.l h50.f fVar) {
        super(null);
        kotlin.jvm.internal.g0.p(body, "body");
        this.f65908a = z11;
        this.f65909b = fVar;
        this.f65910c = body.toString();
        if (fVar != null && !fVar.isInline()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
    }
}
