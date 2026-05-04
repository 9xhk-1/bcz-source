package androidx.camera.view.internal.compat.quirk;

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
        if (quirkSettings.shouldEnableQuirk(SurfaceViewStretchedQuirk.class, SurfaceViewStretchedQuirk.load())) {
            arrayList.add(new SurfaceViewStretchedQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(SurfaceViewNotCroppedByParentQuirk.class, SurfaceViewNotCroppedByParentQuirk.load())) {
            arrayList.add(new SurfaceViewNotCroppedByParentQuirk());
        }
        return arrayList;
    }
}
