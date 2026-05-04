package androidx.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import m00.a;
import m80.k;
import yz.n;
import zz.c;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.METHOD})
@c(AnnotationRetention.SOURCE)
@d(allowedTargets = {AnnotationTarget.FUNCTION, AnnotationTarget.PROPERTY_GETTER, AnnotationTarget.PROPERTY_SETTER})
@Retention(RetentionPolicy.SOURCE)
@n(message = "Replaced by the androidx.resourceinpsection package.")
/* loaded from: classes.dex */
public @interface InspectableProperty {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @c(AnnotationRetention.SOURCE)
    @d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.SOURCE)
    public @interface EnumEntry {
        String name();

        int value();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @c(AnnotationRetention.SOURCE)
    @d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(RetentionPolicy.SOURCE)
    public @interface FlagEntry {
        int mask() default 0;

        String name();

        int target();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ValueType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ValueType[] $VALUES;
        public static final ValueType NONE = new ValueType("NONE", 0);
        public static final ValueType INFERRED = new ValueType("INFERRED", 1);
        public static final ValueType INT_ENUM = new ValueType("INT_ENUM", 2);
        public static final ValueType INT_FLAG = new ValueType("INT_FLAG", 3);
        public static final ValueType COLOR = new ValueType("COLOR", 4);
        public static final ValueType GRAVITY = new ValueType("GRAVITY", 5);
        public static final ValueType RESOURCE_ID = new ValueType("RESOURCE_ID", 6);

        private static final /* synthetic */ ValueType[] $values() {
            return new ValueType[]{NONE, INFERRED, INT_ENUM, INT_FLAG, COLOR, GRAVITY, RESOURCE_ID};
        }

        static {
            ValueType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private ValueType(String str, int i11) {
        }

        @k
        public static a<ValueType> getEntries() {
            return $ENTRIES;
        }

        public static ValueType valueOf(String str) {
            return (ValueType) Enum.valueOf(ValueType.class, str);
        }

        public static ValueType[] values() {
            return (ValueType[]) $VALUES.clone();
        }
    }

    int attributeId() default 0;

    EnumEntry[] enumMapping() default {};

    FlagEntry[] flagMapping() default {};

    boolean hasAttributeId() default true;

    String name() default "";

    ValueType valueType() default ValueType.INFERRED;
}
