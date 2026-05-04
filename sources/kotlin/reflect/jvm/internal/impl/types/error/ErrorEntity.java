package kotlin.reflect.jvm.internal.impl.types.error;

import m00.a;
import m00.c;
import m80.k;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class ErrorEntity {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ ErrorEntity[] $VALUES;

    @k
    private final String debugText;
    public static final ErrorEntity ERROR_CLASS = new ErrorEntity("ERROR_CLASS", 0, "<Error class: %s>");
    public static final ErrorEntity ERROR_FUNCTION = new ErrorEntity("ERROR_FUNCTION", 1, "<Error function>");
    public static final ErrorEntity ERROR_SCOPE = new ErrorEntity("ERROR_SCOPE", 2, "<Error scope>");
    public static final ErrorEntity ERROR_MODULE = new ErrorEntity("ERROR_MODULE", 3, "<Error module>");
    public static final ErrorEntity ERROR_PROPERTY = new ErrorEntity("ERROR_PROPERTY", 4, "<Error property>");
    public static final ErrorEntity ERROR_TYPE = new ErrorEntity("ERROR_TYPE", 5, "[Error type: %s]");
    public static final ErrorEntity PARENT_OF_ERROR_SCOPE = new ErrorEntity("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    private static final /* synthetic */ ErrorEntity[] $values() {
        return new ErrorEntity[]{ERROR_CLASS, ERROR_FUNCTION, ERROR_SCOPE, ERROR_MODULE, ERROR_PROPERTY, ERROR_TYPE, PARENT_OF_ERROR_SCOPE};
    }

    static {
        ErrorEntity[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private ErrorEntity(String str, int i11, String str2) {
        this.debugText = str2;
    }

    public static ErrorEntity valueOf(String str) {
        return (ErrorEntity) Enum.valueOf(ErrorEntity.class, str);
    }

    public static ErrorEntity[] values() {
        return (ErrorEntity[]) $VALUES.clone();
    }

    @k
    public final String getDebugText() {
        return this.debugText;
    }
}
