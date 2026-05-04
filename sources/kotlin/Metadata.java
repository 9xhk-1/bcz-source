package kotlin;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import w00.j;
import yz.n;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE})
@y0(version = "1.3")
@zz.c(AnnotationRetention.RUNTIME)
@zz.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface Metadata {
    @j(name = "bv")
    int[] bv() default {1, 0, 3};

    @j(name = "d1")
    String[] d1() default {};

    @j(name = "d2")
    String[] d2() default {};

    @j(name = "k")
    int k() default 1;

    @j(name = "mv")
    int[] mv() default {};

    @j(name = "pn")
    String pn() default "";

    @j(name = "xi")
    int xi() default 0;

    @j(name = "xs")
    String xs() default "";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @n(level = DeprecationLevel.WARNING, message = "Bytecode version had no significant use in Kotlin metadata and it will be removed in a future version.")
        public static /* synthetic */ void a() {
        }

        @y0(version = "1.2")
        public static /* synthetic */ void b() {
        }

        @y0(version = "1.1")
        public static /* synthetic */ void c() {
        }
    }
}
