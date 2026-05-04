package ly;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContentNegotiation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentNegotiation.kt\nio/ktor/server/plugins/contentnegotiation/ContentTypeWithQuality\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,68:1\n1#2:69\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ix.k f71685a;

    /* renamed from: b, reason: collision with root package name */
    public final double f71686b;

    public f(@k ix.k contentType, double d11) {
        g0.p(contentType, "contentType");
        this.f71685a = contentType;
        this.f71686b = d11;
        if (0.0d > d11 || d11 > 1.0d) {
            throw new IllegalArgumentException(("Quality should be in range [0, 1]: " + d11).toString());
        }
    }

    public static /* synthetic */ f d(f fVar, ix.k kVar, double d11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            kVar = fVar.f71685a;
        }
        if ((i11 & 2) != 0) {
            d11 = fVar.f71686b;
        }
        return fVar.c(kVar, d11);
    }

    @k
    public final ix.k a() {
        return this.f71685a;
    }

    public final double b() {
        return this.f71686b;
    }

    @k
    public final f c(@k ix.k contentType, double d11) {
        g0.p(contentType, "contentType");
        return new f(contentType, d11);
    }

    @k
    public final ix.k e() {
        return this.f71685a;
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return g0.g(this.f71685a, fVar.f71685a) && Double.compare(this.f71686b, fVar.f71686b) == 0;
    }

    public final double f() {
        return this.f71686b;
    }

    public int hashCode() {
        return (this.f71685a.hashCode() * 31) + Double.hashCode(this.f71686b);
    }

    @k
    public String toString() {
        return "ContentTypeWithQuality(contentType=" + this.f71685a + ", quality=" + this.f71686b + ')';
    }

    public /* synthetic */ f(ix.k kVar, double d11, int i11, v vVar) {
        this(kVar, (i11 & 2) != 0 ? 1.0d : d11);
    }
}
