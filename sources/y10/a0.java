package y10;

import java.util.EnumMap;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final EnumMap<AnnotationQualifierApplicabilityType, t> f99012a;

    public a0(@m80.k EnumMap<AnnotationQualifierApplicabilityType, t> defaultQualifiers) {
        kotlin.jvm.internal.g0.p(defaultQualifiers, "defaultQualifiers");
        this.f99012a = defaultQualifiers;
    }

    @m80.l
    public final t a(@m80.l AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType) {
        return this.f99012a.get(annotationQualifierApplicabilityType);
    }

    @m80.k
    public final EnumMap<AnnotationQualifierApplicabilityType, t> b() {
        return this.f99012a;
    }
}
