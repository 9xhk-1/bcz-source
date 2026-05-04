package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Quirk;
import androidx.media3.common.MimeTypes;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class CodecStuckOnFlushQuirk implements Quirk {
    private static boolean isNokia1() {
        return "Nokia".equalsIgnoreCase(Build.BRAND) && "Nokia 1".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isNokia1();
    }

    public boolean isProblematicMimeType(@Nullable String str) {
        return MimeTypes.VIDEO_MP4V.equals(str);
    }
}
