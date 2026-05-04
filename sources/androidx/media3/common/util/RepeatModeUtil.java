package androidx.media3.common.util;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class RepeatModeUtil {
    public static final int REPEAT_TOGGLE_MODE_ALL = 2;
    public static final int REPEAT_TOGGLE_MODE_NONE = 0;
    public static final int REPEAT_TOGGLE_MODE_ONE = 1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER, ElementType.LOCAL_VARIABLE, ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface RepeatToggleModes {
    }

    private RepeatModeUtil() {
    }

    public static int getNextRepeatMode(int i11, int i12) {
        for (int i13 = 1; i13 <= 2; i13++) {
            int i14 = (i11 + i13) % 3;
            if (isRepeatModeEnabled(i14, i12)) {
                return i14;
            }
        }
        return i11;
    }

    public static boolean isRepeatModeEnabled(int i11, int i12) {
        if (i11 != 0) {
            return i11 != 1 ? i11 == 2 && (i12 & 2) != 0 : (i12 & 1) != 0;
        }
        return true;
    }
}
