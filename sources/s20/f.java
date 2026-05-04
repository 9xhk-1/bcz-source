package s20;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nClassLiteralValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ClassLiteralValue.kt\norg/jetbrains/kotlin/resolve/constants/ClassLiteralValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,17:1\n1#2:18\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final n20.b f87440a;

    /* renamed from: b, reason: collision with root package name */
    public final int f87441b;

    public f(@m80.k n20.b classId, int i11) {
        g0.p(classId, "classId");
        this.f87440a = classId;
        this.f87441b = i11;
    }

    @m80.k
    public final n20.b a() {
        return this.f87440a;
    }

    public final int b() {
        return this.f87441b;
    }

    public final int c() {
        return this.f87441b;
    }

    @m80.k
    public final n20.b d() {
        return this.f87440a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return g0.g(this.f87440a, fVar.f87440a) && this.f87441b == fVar.f87441b;
    }

    public int hashCode() {
        return (this.f87440a.hashCode() * 31) + Integer.hashCode(this.f87441b);
    }

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        int i11 = this.f87441b;
        for (int i12 = 0; i12 < i11; i12++) {
            sb2.append("kotlin/Array<");
        }
        sb2.append(this.f87440a);
        int i13 = this.f87441b;
        for (int i14 = 0; i14 < i13; i14++) {
            sb2.append(">");
        }
        String sb3 = sb2.toString();
        g0.o(sb3, "toString(...)");
        return sb3;
    }
}
