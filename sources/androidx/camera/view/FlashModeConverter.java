package androidx.camera.view;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class FlashModeConverter {
    private FlashModeConverter() {
    }

    @NonNull
    public static String nameOf(int i11) {
        if (i11 == 0) {
            return "AUTO";
        }
        if (i11 == 1) {
            return "ON";
        }
        if (i11 == 2) {
            return "OFF";
        }
        throw new IllegalArgumentException("Unknown flash mode " + i11);
    }

    public static int valueOf(@Nullable String str) {
        if (str == null) {
            throw new NullPointerException("name cannot be null");
        }
        switch (str) {
            case "ON":
                return 1;
            case "OFF":
                return 2;
            case "AUTO":
                return 0;
            default:
                throw new IllegalArgumentException("Unknown flash mode name " + str);
        }
    }
}
