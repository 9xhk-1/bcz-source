package androidx.room;

import androidx.annotation.RequiresApi;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Target({ElementType.FIELD, ElementType.METHOD})
@zz.c(AnnotationRetention.BINARY)
@zz.d(allowedTargets = {AnnotationTarget.FIELD, AnnotationTarget.FUNCTION})
@Retention(RetentionPolicy.CLASS)
/* loaded from: classes3.dex */
public @interface ColumnInfo {
    public static final int BINARY = 2;
    public static final int BLOB = 5;

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    @m80.k
    public static final String INHERIT_FIELD_NAME = "[field-name]";
    public static final int INTEGER = 3;

    @RequiresApi(21)
    public static final int LOCALIZED = 5;
    public static final int NOCASE = 3;
    public static final int REAL = 4;
    public static final int RTRIM = 4;
    public static final int TEXT = 2;
    public static final int UNDEFINED = 1;

    @RequiresApi(21)
    public static final int UNICODE = 6;
    public static final int UNSPECIFIED = 1;

    @m80.k
    public static final String VALUE_UNSPECIFIED = "[value-unspecified]";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @zz.c(AnnotationRetention.BINARY)
    @RequiresApi(21)
    @Retention(RetentionPolicy.CLASS)
    public @interface Collate {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final int BINARY = 2;
        public static final int BLOB = 5;

        @m80.k
        public static final String INHERIT_FIELD_NAME = "[field-name]";
        public static final int INTEGER = 3;

        @RequiresApi(21)
        public static final int LOCALIZED = 5;
        public static final int NOCASE = 3;
        public static final int REAL = 4;
        public static final int RTRIM = 4;
        public static final int TEXT = 2;
        public static final int UNDEFINED = 1;

        @RequiresApi(21)
        public static final int UNICODE = 6;
        public static final int UNSPECIFIED = 1;

        @m80.k
        public static final String VALUE_UNSPECIFIED = "[value-unspecified]";

        private Companion() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @zz.c(AnnotationRetention.BINARY)
    @Retention(RetentionPolicy.CLASS)
    public @interface SQLiteTypeAffinity {
    }

    @Collate
    int collate() default 1;

    String defaultValue() default "[value-unspecified]";

    boolean index() default false;

    String name() default "[field-name]";

    @SQLiteTypeAffinity
    int typeAffinity() default 1;
}
