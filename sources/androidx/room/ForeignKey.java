package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({})
@zz.c(AnnotationRetention.BINARY)
@zz.d(allowedTargets = {})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface ForeignKey {
    public static final int CASCADE = 5;

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int NO_ACTION = 1;
    public static final int RESTRICT = 2;
    public static final int SET_DEFAULT = 4;
    public static final int SET_NULL = 3;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @zz.c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface Action {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int CASCADE = 5;
        public static final int NO_ACTION = 1;
        public static final int RESTRICT = 2;
        public static final int SET_DEFAULT = 4;
        public static final int SET_NULL = 3;

        private Companion() {
        }
    }

    String[] childColumns();

    boolean deferred() default false;

    Class<?> entity();

    @Action
    int onDelete() default 1;

    @Action
    int onUpdate() default 1;

    String[] parentColumns();
}
