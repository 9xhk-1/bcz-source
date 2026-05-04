package d20;

import a00.v1;
import a00.x1;
import e30.g0;
import java.util.Set;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.load.java.lazy.types.JavaTypeFlexibility;
import kotlin.reflect.jvm.internal.impl.types.TypeUsage;
import m80.k;
import m80.l;
import p10.c1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a extends g0 {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final TypeUsage f47062d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final JavaTypeFlexibility f47063e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f47064f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f47065g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Set<c1> f47066h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final e30.c1 f47067i;

    public /* synthetic */ a(TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z11, boolean z12, Set set, e30.c1 c1Var, int i11, v vVar) {
        this(typeUsage, (i11 & 2) != 0 ? JavaTypeFlexibility.INFLEXIBLE : javaTypeFlexibility, (i11 & 4) != 0 ? false : z11, (i11 & 8) != 0 ? false : z12, (i11 & 16) != 0 ? null : set, (i11 & 32) != 0 ? null : c1Var);
    }

    public static /* synthetic */ a f(a aVar, TypeUsage typeUsage, JavaTypeFlexibility javaTypeFlexibility, boolean z11, boolean z12, Set set, e30.c1 c1Var, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            typeUsage = aVar.f47062d;
        }
        if ((i11 & 2) != 0) {
            javaTypeFlexibility = aVar.f47063e;
        }
        if ((i11 & 4) != 0) {
            z11 = aVar.f47064f;
        }
        if ((i11 & 8) != 0) {
            z12 = aVar.f47065g;
        }
        if ((i11 & 16) != 0) {
            set = aVar.f47066h;
        }
        if ((i11 & 32) != 0) {
            c1Var = aVar.f47067i;
        }
        Set set2 = set;
        e30.c1 c1Var2 = c1Var;
        return aVar.e(typeUsage, javaTypeFlexibility, z11, z12, set2, c1Var2);
    }

    @Override // e30.g0
    @l
    public e30.c1 a() {
        return this.f47067i;
    }

    @Override // e30.g0
    @k
    public TypeUsage b() {
        return this.f47062d;
    }

    @Override // e30.g0
    @l
    public Set<c1> c() {
        return this.f47066h;
    }

    @k
    public final a e(@k TypeUsage howThisTypeIsUsed, @k JavaTypeFlexibility flexibility, boolean z11, boolean z12, @l Set<? extends c1> set, @l e30.c1 c1Var) {
        kotlin.jvm.internal.g0.p(howThisTypeIsUsed, "howThisTypeIsUsed");
        kotlin.jvm.internal.g0.p(flexibility, "flexibility");
        return new a(howThisTypeIsUsed, flexibility, z11, z12, set, c1Var);
    }

    @Override // e30.g0
    public boolean equals(@l Object obj) {
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.g0.g(aVar.a(), a()) && aVar.b() == b() && aVar.f47063e == this.f47063e && aVar.f47064f == this.f47064f && aVar.f47065g == this.f47065g;
    }

    @k
    public final JavaTypeFlexibility g() {
        return this.f47063e;
    }

    public final boolean h() {
        return this.f47065g;
    }

    @Override // e30.g0
    public int hashCode() {
        e30.c1 a11 = a();
        int hashCode = a11 != null ? a11.hashCode() : 0;
        int hashCode2 = hashCode + (hashCode * 31) + b().hashCode();
        int hashCode3 = hashCode2 + (hashCode2 * 31) + this.f47063e.hashCode();
        int i11 = hashCode3 + (hashCode3 * 31) + (this.f47064f ? 1 : 0);
        return i11 + (i11 * 31) + (this.f47065g ? 1 : 0);
    }

    public final boolean i() {
        return this.f47064f;
    }

    @k
    public final a j(boolean z11) {
        return f(this, null, null, z11, false, null, null, 59, null);
    }

    @k
    public a k(@l e30.c1 c1Var) {
        return f(this, null, null, false, false, null, c1Var, 31, null);
    }

    @k
    public final a l(@k JavaTypeFlexibility flexibility) {
        kotlin.jvm.internal.g0.p(flexibility, "flexibility");
        return f(this, null, flexibility, false, false, null, null, 61, null);
    }

    @Override // e30.g0
    @k
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public a d(@k c1 typeParameter) {
        kotlin.jvm.internal.g0.p(typeParameter, "typeParameter");
        return f(this, null, null, false, false, c() != null ? x1.D(c(), typeParameter) : v1.f(typeParameter), null, 47, null);
    }

    @k
    public String toString() {
        return "JavaTypeAttributes(howThisTypeIsUsed=" + this.f47062d + ", flexibility=" + this.f47063e + ", isRaw=" + this.f47064f + ", isForAnnotationParameter=" + this.f47065g + ", visitedTypeParameters=" + this.f47066h + ", defaultType=" + this.f47067i + ')';
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public a(@k TypeUsage howThisTypeIsUsed, @k JavaTypeFlexibility flexibility, boolean z11, boolean z12, @l Set<? extends c1> set, @l e30.c1 c1Var) {
        super(howThisTypeIsUsed, set, c1Var);
        kotlin.jvm.internal.g0.p(howThisTypeIsUsed, "howThisTypeIsUsed");
        kotlin.jvm.internal.g0.p(flexibility, "flexibility");
        this.f47062d = howThisTypeIsUsed;
        this.f47063e = flexibility;
        this.f47064f = z11;
        this.f47065g = z12;
        this.f47066h = set;
        this.f47067i = c1Var;
    }
}
