package androidx.compose.ui.tooling.preview;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.jvm.internal.q0;
import zz.a;
import zz.b;
import zz.c;
import zz.d;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
@a
@b
@c(AnnotationRetention.BINARY)
@d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
@Documented
@Repeatable(Container.class)
/* loaded from: classes2.dex */
public @interface Preview {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.METHOD, ElementType.ANNOTATION_TYPE})
    @c(AnnotationRetention.BINARY)
    @d(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.FUNCTION})
    @Retention(RetentionPolicy.CLASS)
    @q0
    public @interface Container {
        Preview[] value();
    }

    int apiLevel() default -1;

    long backgroundColor() default 0;

    String device() default "";

    float fontScale() default 1.0f;

    String group() default "";

    int heightDp() default -1;

    String locale() default "";

    String name() default "";

    boolean showBackground() default false;

    boolean showSystemUi() default false;

    int uiMode() default 0;

    int wallpaper() default -1;

    int widthDp() default -1;
}
