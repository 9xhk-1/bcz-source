package androidx.camera.video.internal.compat.quirk;

import android.os.Build;
import android.util.Size;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.Quirk;
import com.tencent.liteav.audio.TXEAudioDef;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class StretchedVideoResolutionQuirk implements Quirk {
    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    @Nullable
    public Size getAlternativeResolution(int i11) {
        if (i11 == 4) {
            return new Size(640, 480);
        }
        if (i11 == 5) {
            return new Size(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 720);
        }
        if (i11 != 6) {
            return null;
        }
        return new Size(1440, pd.a.f80340j);
    }
}
