package kotlinx.serialization;

import f50.f;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import m00.c;
import m80.k;
import zz.a;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({})
@a
@d(allowedTargets = {AnnotationTarget.PROPERTY})
@f
@Documented
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface EncodeDefault {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @f
    public static final class Mode {
        private static final /* synthetic */ m00.a $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ALWAYS = new Mode("ALWAYS", 0);
        public static final Mode NEVER = new Mode("NEVER", 1);

        private static final /* synthetic */ Mode[] $values() {
            return new Mode[]{ALWAYS, NEVER};
        }

        static {
            Mode[] $values = $values();
            $VALUES = $values;
            $ENTRIES = c.c($values);
        }

        private Mode(String str, int i11) {
        }

        @k
        public static m00.a<Mode> getEntries() {
            return $ENTRIES;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    Mode mode() default Mode.ALWAYS;
}
