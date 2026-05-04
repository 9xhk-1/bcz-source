package androidx.room;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import kotlin.annotation.AnnotationRetention;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@zz.c(AnnotationRetention.BINARY)
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface OnConflictStrategy {
    public static final int ABORT = 3;

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final int FAIL = 4;
    public static final int IGNORE = 5;
    public static final int NONE = 0;
    public static final int REPLACE = 1;
    public static final int ROLLBACK = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int ABORT = 3;
        public static final int FAIL = 4;
        public static final int IGNORE = 5;
        public static final int NONE = 0;
        public static final int REPLACE = 1;
        public static final int ROLLBACK = 2;

        private Companion() {
        }

        @yz.n(message = "Use ABORT instead.")
        public static /* synthetic */ void getFAIL$annotations() {
        }

        @yz.n(message = "Use ABORT instead.")
        public static /* synthetic */ void getROLLBACK$annotations() {
        }
    }
}
