package y10;

import java.util.Collection;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final g20.j f99107a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Collection<AnnotationQualifierApplicabilityType> f99108b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f99109c;

    /* JADX WARN: Multi-variable type inference failed */
    public t(@m80.k g20.j nullabilityQualifier, @m80.k Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z11) {
        kotlin.jvm.internal.g0.p(nullabilityQualifier, "nullabilityQualifier");
        kotlin.jvm.internal.g0.p(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        this.f99107a = nullabilityQualifier;
        this.f99108b = qualifierApplicabilityTypes;
        this.f99109c = z11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ t b(t tVar, g20.j jVar, Collection collection, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            jVar = tVar.f99107a;
        }
        if ((i11 & 2) != 0) {
            collection = tVar.f99108b;
        }
        if ((i11 & 4) != 0) {
            z11 = tVar.f99109c;
        }
        return tVar.a(jVar, collection, z11);
    }

    @m80.k
    public final t a(@m80.k g20.j nullabilityQualifier, @m80.k Collection<? extends AnnotationQualifierApplicabilityType> qualifierApplicabilityTypes, boolean z11) {
        kotlin.jvm.internal.g0.p(nullabilityQualifier, "nullabilityQualifier");
        kotlin.jvm.internal.g0.p(qualifierApplicabilityTypes, "qualifierApplicabilityTypes");
        return new t(nullabilityQualifier, qualifierApplicabilityTypes, z11);
    }

    public final boolean c() {
        return this.f99109c;
    }

    @m80.k
    public final g20.j d() {
        return this.f99107a;
    }

    @m80.k
    public final Collection<AnnotationQualifierApplicabilityType> e() {
        return this.f99108b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t)) {
            return false;
        }
        t tVar = (t) obj;
        return kotlin.jvm.internal.g0.g(this.f99107a, tVar.f99107a) && kotlin.jvm.internal.g0.g(this.f99108b, tVar.f99108b) && this.f99109c == tVar.f99109c;
    }

    public int hashCode() {
        return (((this.f99107a.hashCode() * 31) + this.f99108b.hashCode()) * 31) + Boolean.hashCode(this.f99109c);
    }

    @m80.k
    public String toString() {
        return "JavaDefaultQualifiers(nullabilityQualifier=" + this.f99107a + ", qualifierApplicabilityTypes=" + this.f99108b + ", definitelyNotNull=" + this.f99109c + ')';
    }

    public /* synthetic */ t(g20.j jVar, Collection collection, boolean z11, int i11, kotlin.jvm.internal.v vVar) {
        this(jVar, collection, (i11 & 4) != 0 ? jVar.c() == NullabilityQualifier.NOT_NULL : z11);
    }
}
