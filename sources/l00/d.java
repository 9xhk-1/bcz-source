package l00;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationTarget;
import yz.v0;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.TYPE})
@y0(version = "1.3")
@v0
@zz.d(allowedTargets = {AnnotationTarget.CLASS})
@Retention(RetentionPolicy.RUNTIME)
/* loaded from: classes8.dex */
public @interface d {
    @w00.j(name = "c")
    String c() default "";

    @w00.j(name = "f")
    String f() default "";

    @w00.j(name = "i")
    int[] i() default {};

    @w00.j(name = "l")
    int[] l() default {};

    @w00.j(name = "m")
    String m() default "";

    @w00.j(name = "n")
    String[] n() default {};

    @w00.j(name = "nl")
    int[] nl() default {};

    @w00.j(name = "s")
    String[] s() default {};

    @w00.j(name = "v")
    int v() default 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @y0(version = "2.2")
        public static /* synthetic */ void a() {
        }
    }
}
