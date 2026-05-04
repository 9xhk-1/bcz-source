package androidx.camera.camera2.internal;

import androidx.annotation.OptIn;
import androidx.camera.core.ExperimentalLensFacing;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class LensFacingUtil {
    private LensFacingUtil() {
    }

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    public static int getCameraSelectorLensFacing(int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing integer: " + i11 + " can not be recognized.");
    }

    @OptIn(markerClass = {ExperimentalLensFacing.class})
    public static int getLensFacingInt(int i11) {
        if (i11 == 0) {
            return 0;
        }
        if (i11 == 1) {
            return 1;
        }
        if (i11 == 2) {
            return 2;
        }
        throw new IllegalArgumentException("The given lens facing: " + i11 + " can not be recognized.");
    }
}
