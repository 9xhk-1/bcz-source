package androidx.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;
import m80.k;
import zz.a;
import zz.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@a
@c(AnnotationRetention.BINARY)
@Documented
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes.dex */
public @interface VisibleForTesting {

    @k
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int NONE = 5;
    public static final int PACKAGE_PRIVATE = 3;
    public static final int PRIVATE = 2;
    public static final int PROTECTED = 4;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int NONE = 5;
        public static final int PACKAGE_PRIVATE = 3;
        public static final int PRIVATE = 2;
        public static final int PROTECTED = 4;

        private Companion() {
        }
    }

    int otherwise() default 2;
}
