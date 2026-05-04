package g20;

import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final NullabilityQualifier f52617a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f52618b;

    public j(@m80.k NullabilityQualifier qualifier, boolean z11) {
        kotlin.jvm.internal.g0.p(qualifier, "qualifier");
        this.f52617a = qualifier;
        this.f52618b = z11;
    }

    public static /* synthetic */ j b(j jVar, NullabilityQualifier nullabilityQualifier, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            nullabilityQualifier = jVar.f52617a;
        }
        if ((i11 & 2) != 0) {
            z11 = jVar.f52618b;
        }
        return jVar.a(nullabilityQualifier, z11);
    }

    @m80.k
    public final j a(@m80.k NullabilityQualifier qualifier, boolean z11) {
        kotlin.jvm.internal.g0.p(qualifier, "qualifier");
        return new j(qualifier, z11);
    }

    @m80.k
    public final NullabilityQualifier c() {
        return this.f52617a;
    }

    public final boolean d() {
        return this.f52618b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return this.f52617a == jVar.f52617a && this.f52618b == jVar.f52618b;
    }

    public int hashCode() {
        return (this.f52617a.hashCode() * 31) + Boolean.hashCode(this.f52618b);
    }

    @m80.k
    public String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f52617a + ", isForWarningOnly=" + this.f52618b + ')';
    }

    public /* synthetic */ j(NullabilityQualifier nullabilityQualifier, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(nullabilityQualifier, (i11 & 2) != 0 ? false : z11);
    }
}
