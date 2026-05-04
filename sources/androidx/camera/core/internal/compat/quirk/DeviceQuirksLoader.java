package androidx.camera.core.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DeviceQuirksLoader {
    private DeviceQuirksLoader() {
    }

    @NonNull
    public static List<Quirk> loadQuirks(@NonNull QuirkSettings quirkSettings) {
        ArrayList arrayList = new ArrayList();
        if (quirkSettings.shouldEnableQuirk(ImageCaptureRotationOptionQuirk.class, ImageCaptureRotationOptionQuirk.load())) {
            arrayList.add(new ImageCaptureRotationOptionQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(SurfaceOrderQuirk.class, SurfaceOrderQuirk.load())) {
            arrayList.add(new SurfaceOrderQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(CaptureFailedRetryQuirk.class, CaptureFailedRetryQuirk.load())) {
            arrayList.add(new CaptureFailedRetryQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(LowMemoryQuirk.class, LowMemoryQuirk.load())) {
            arrayList.add(new LowMemoryQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(LargeJpegImageQuirk.class, LargeJpegImageQuirk.load())) {
            arrayList.add(new LargeJpegImageQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(IncorrectJpegMetadataQuirk.class, IncorrectJpegMetadataQuirk.load())) {
            arrayList.add(new IncorrectJpegMetadataQuirk());
        }
        return arrayList;
    }
}
