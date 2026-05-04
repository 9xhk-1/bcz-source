package kotlin.annotation;

import m00.a;
import m00.c;
import m80.k;
import yz.y0;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class AnnotationTarget {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AnnotationTarget[] $VALUES;
    public static final AnnotationTarget CLASS = new AnnotationTarget("CLASS", 0);
    public static final AnnotationTarget ANNOTATION_CLASS = new AnnotationTarget("ANNOTATION_CLASS", 1);
    public static final AnnotationTarget TYPE_PARAMETER = new AnnotationTarget("TYPE_PARAMETER", 2);
    public static final AnnotationTarget PROPERTY = new AnnotationTarget("PROPERTY", 3);
    public static final AnnotationTarget FIELD = new AnnotationTarget("FIELD", 4);
    public static final AnnotationTarget LOCAL_VARIABLE = new AnnotationTarget("LOCAL_VARIABLE", 5);
    public static final AnnotationTarget VALUE_PARAMETER = new AnnotationTarget("VALUE_PARAMETER", 6);
    public static final AnnotationTarget CONSTRUCTOR = new AnnotationTarget("CONSTRUCTOR", 7);
    public static final AnnotationTarget FUNCTION = new AnnotationTarget("FUNCTION", 8);
    public static final AnnotationTarget PROPERTY_GETTER = new AnnotationTarget("PROPERTY_GETTER", 9);
    public static final AnnotationTarget PROPERTY_SETTER = new AnnotationTarget("PROPERTY_SETTER", 10);
    public static final AnnotationTarget TYPE = new AnnotationTarget("TYPE", 11);
    public static final AnnotationTarget EXPRESSION = new AnnotationTarget("EXPRESSION", 12);
    public static final AnnotationTarget FILE = new AnnotationTarget("FILE", 13);

    @y0(version = "1.1")
    public static final AnnotationTarget TYPEALIAS = new AnnotationTarget("TYPEALIAS", 14);

    private static final /* synthetic */ AnnotationTarget[] $values() {
        return new AnnotationTarget[]{CLASS, ANNOTATION_CLASS, TYPE_PARAMETER, PROPERTY, FIELD, LOCAL_VARIABLE, VALUE_PARAMETER, CONSTRUCTOR, FUNCTION, PROPERTY_GETTER, PROPERTY_SETTER, TYPE, EXPRESSION, FILE, TYPEALIAS};
    }

    static {
        AnnotationTarget[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private AnnotationTarget(String str, int i11) {
    }

    @k
    public static a<AnnotationTarget> getEntries() {
        return $ENTRIES;
    }

    public static AnnotationTarget valueOf(String str) {
        return (AnnotationTarget) Enum.valueOf(AnnotationTarget.class, str);
    }

    public static AnnotationTarget[] values() {
        return (AnnotationTarget[]) $VALUES.clone();
    }
}
