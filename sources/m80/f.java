package m80;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class f {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.CLASS)
    public @interface a {
        @l80.d(prefix = "class Renderer{Object[] $childrenArray(){return ", suffix = ";}}", value = "JAVA")
        @j
        String childrenArray() default "";

        @l80.d(prefix = "class Renderer{boolean $hasChildren(){return ", suffix = ";}}", value = "JAVA")
        @j
        String hasChildren() default "";

        @l80.d(prefix = "class Renderer{String $text(){return ", suffix = ";}}", value = "JAVA")
        @j
        String text() default "";
    }

    public f() {
        throw new AssertionError("Debug should not be instantiated");
    }
}
