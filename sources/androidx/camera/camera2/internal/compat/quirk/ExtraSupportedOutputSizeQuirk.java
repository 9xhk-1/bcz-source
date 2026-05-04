package androidx.camera.camera2.internal.compat.quirk;

import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import com.tencent.liteav.audio.TXEAudioDef;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ExtraSupportedOutputSizeQuirk implements Quirk {
    @NonNull
    private Size[] getMotoE5PlayExtraSupportedResolutions() {
        return new Size[]{new Size(1440, pd.a.f80340j), new Size(TXEAudioDef.TXE_OPUS_SAMPLE_NUM, 720)};
    }

    private static boolean isMotoE5Play() {
        return "motorola".equalsIgnoreCase(Build.BRAND) && "moto e5 play".equalsIgnoreCase(Build.MODEL);
    }

    public static boolean load() {
        return isMotoE5Play();
    }

    @NonNull
    public Size[] getExtraSupportedResolutions(int i11) {
        return (i11 == 34 && isMotoE5Play()) ? getMotoE5PlayExtraSupportedResolutions() : new Size[0];
    }

    @NonNull
    public <T> Size[] getExtraSupportedResolutions(@NonNull Class<T> cls) {
        if (StreamConfigurationMap.isOutputSupportedFor(cls) && isMotoE5Play()) {
            return getMotoE5PlayExtraSupportedResolutions();
        }
        return new Size[0];
    }
}
