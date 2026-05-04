package e30;

import java.util.Set;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nErasureTypeAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ErasureTypeAttributes.kt\norg/jetbrains/kotlin/types/ErasureTypeAttributes\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,35:1\n1#2:36\n*E\n"})
/* loaded from: classes8.dex */
public class g0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final TypeUsage f48592a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final Set<p10.c1> f48593b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final c1 f48594c;

    /* JADX WARN: Multi-variable type inference failed */
    public g0(@m80.k TypeUsage howThisTypeIsUsed, @m80.l Set<? extends p10.c1> set, @m80.l c1 c1Var) {
        kotlin.jvm.internal.g0.p(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f48592a = howThisTypeIsUsed;
        this.f48593b = set;
        this.f48594c = c1Var;
    }

    @m80.l
    public c1 a() {
        return this.f48594c;
    }

    @m80.k
    public TypeUsage b() {
        return this.f48592a;
    }

    @m80.l
    public Set<p10.c1> c() {
        return this.f48593b;
    }

    @m80.k
    public g0 d(@m80.k p10.c1 typeParameter) {
        Set f11;
        kotlin.jvm.internal.g0.p(typeParameter, "typeParameter");
        TypeUsage b11 = b();
        Set<p10.c1> c11 = c();
        if (c11 == null || (f11 = a00.x1.D(c11, typeParameter)) == null) {
            f11 = a00.v1.f(typeParameter);
        }
        return new g0(b11, f11, a());
    }

    public boolean equals(@m80.l Object obj) {
        if (!(obj instanceof g0)) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return kotlin.jvm.internal.g0.g(g0Var.a(), a()) && g0Var.b() == b();
    }

    public int hashCode() {
        c1 a11 = a();
        int hashCode = a11 != null ? a11.hashCode() : 0;
        return hashCode + (hashCode * 31) + b().hashCode();
    }
}
