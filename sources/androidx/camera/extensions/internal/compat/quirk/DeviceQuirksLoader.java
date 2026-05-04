package androidx.camera.extensions.internal.compat.quirk;

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
        if (quirkSettings.shouldEnableQuirk(ExtensionDisabledQuirk.class, ExtensionDisabledQuirk.load())) {
            arrayList.add(new ExtensionDisabledQuirk());
        }
        if (quirkSettings.shouldEnableQuirk(CrashWhenOnDisableTooSoon.class, CrashWhenOnDisableTooSoon.load())) {
            arrayList.add(new CrashWhenOnDisableTooSoon());
        }
        if (quirkSettings.shouldEnableQuirk(GetAvailableKeysNeedsOnInit.class, GetAvailableKeysNeedsOnInit.load())) {
            arrayList.add(new GetAvailableKeysNeedsOnInit());
        }
        if (quirkSettings.shouldEnableQuirk(CaptureOutputSurfaceOccupiedQuirk.class, CaptureOutputSurfaceOccupiedQuirk.load())) {
            arrayList.add(new CaptureOutputSurfaceOccupiedQuirk());
        }
        return arrayList;
    }
}
