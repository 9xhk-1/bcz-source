package kotlin.reflect.jvm.internal.impl.load.java;

import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class AnnotationQualifierApplicabilityType {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] $VALUES;

    @k
    private final String javaTarget;
    public static final AnnotationQualifierApplicabilityType METHOD_RETURN_TYPE = new AnnotationQualifierApplicabilityType("METHOD_RETURN_TYPE", 0, "METHOD");
    public static final AnnotationQualifierApplicabilityType VALUE_PARAMETER = new AnnotationQualifierApplicabilityType("VALUE_PARAMETER", 1, "PARAMETER");
    public static final AnnotationQualifierApplicabilityType FIELD = new AnnotationQualifierApplicabilityType("FIELD", 2, "FIELD");
    public static final AnnotationQualifierApplicabilityType TYPE_USE = new AnnotationQualifierApplicabilityType("TYPE_USE", 3, "TYPE_USE");
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER_BOUNDS = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");
    public static final AnnotationQualifierApplicabilityType TYPE_PARAMETER = new AnnotationQualifierApplicabilityType("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    private static final /* synthetic */ AnnotationQualifierApplicabilityType[] $values() {
        return new AnnotationQualifierApplicabilityType[]{METHOD_RETURN_TYPE, VALUE_PARAMETER, FIELD, TYPE_USE, TYPE_PARAMETER_BOUNDS, TYPE_PARAMETER};
    }

    static {
        AnnotationQualifierApplicabilityType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = m00.c.c($values);
    }

    private AnnotationQualifierApplicabilityType(String str, int i11, String str2) {
        this.javaTarget = str2;
    }

    public static AnnotationQualifierApplicabilityType valueOf(String str) {
        return (AnnotationQualifierApplicabilityType) Enum.valueOf(AnnotationQualifierApplicabilityType.class, str);
    }

    public static AnnotationQualifierApplicabilityType[] values() {
        return (AnnotationQualifierApplicabilityType[]) $VALUES.clone();
    }

    @k
    public final String getJavaTarget() {
        return this.javaTarget;
    }
}
