package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import m80.k;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.ANNOTATION_TYPE})
@y0(version = "1.3")
@zz.c(AnnotationRetention.BINARY)
@zz.d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes8.dex */
public @interface RequiresOptIn {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Level {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Level[] $VALUES;
        public static final Level WARNING = new Level("WARNING", 0);
        public static final Level ERROR = new Level("ERROR", 1);

        private static final /* synthetic */ Level[] $values() {
            return new Level[]{WARNING, ERROR};
        }

        static {
            Level[] $values = $values();
            $VALUES = $values;
            $ENTRIES = m00.c.c($values);
        }

        private Level(String str, int i11) {
        }

        @k
        public static m00.a<Level> getEntries() {
            return $ENTRIES;
        }

        public static Level valueOf(String str) {
            return (Level) Enum.valueOf(Level.class, str);
        }

        public static Level[] values() {
            return (Level[]) $VALUES.clone();
        }
    }

    Level level() default Level.ERROR;

    String message() default "";
}
