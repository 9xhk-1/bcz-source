package y10;

import a00.l1;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class u {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final List<AnnotationQualifierApplicabilityType> f99110a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final List<AnnotationQualifierApplicabilityType> f99111b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Map<n20.c, t> f99112c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Map<n20.c, t> f99113d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final Map<n20.c, t> f99114e;

    static {
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = AnnotationQualifierApplicabilityType.FIELD;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = AnnotationQualifierApplicabilityType.METHOD_RETURN_TYPE;
        AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType3 = AnnotationQualifierApplicabilityType.VALUE_PARAMETER;
        List<AnnotationQualifierApplicabilityType> Q = a00.h0.Q(annotationQualifierApplicabilityType, annotationQualifierApplicabilityType2, annotationQualifierApplicabilityType3, AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS, AnnotationQualifierApplicabilityType.TYPE_USE);
        f99110a = Q;
        List<AnnotationQualifierApplicabilityType> l11 = a00.g0.l(annotationQualifierApplicabilityType3);
        f99111b = l11;
        n20.c k11 = f0.k();
        NullabilityQualifier nullabilityQualifier = NullabilityQualifier.NOT_NULL;
        Map<n20.c, t> W = l1.W(h1.a(k11, new t(new g20.j(nullabilityQualifier, false, 2, null), Q, false)), h1.a(f0.i(), new t(new g20.j(nullabilityQualifier, false, 2, null), Q, false)), h1.a(f0.j(), new t(new g20.j(NullabilityQualifier.FORCE_FLEXIBILITY, false, 2, null), Q, false, 4, null)));
        f99112c = W;
        Map<n20.c, t> W2 = l1.W(h1.a(f0.d(), new t(new g20.j(nullabilityQualifier, false, 2, null), l11, false, 4, null)), h1.a(f0.e(), new t(new g20.j(NullabilityQualifier.NULLABLE, false, 2, null), l11, false, 4, null)));
        f99113d = W2;
        f99114e = l1.n0(W, W2);
    }

    @m80.k
    public static final Map<n20.c, t> a() {
        return f99114e;
    }

    @m80.k
    public static final Map<n20.c, t> b() {
        return f99112c;
    }
}
