package androidx.camera.camera2.internal.compat.quirk;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.Quirk;
import androidx.camera.core.impl.QuirkSettings;
import androidx.camera.core.impl.QuirkSettingsHolder;
import androidx.camera.core.impl.Quirks;
import androidx.camera.core.impl.utils.executor.CameraXExecutors;
import androidx.core.util.Consumer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DeviceQuirks {
    private static final String TAG = "DeviceQuirks";

    @NonNull
    private static volatile Quirks sQuirks;

    static {
        QuirkSettingsHolder.instance().observe(CameraXExecutors.directExecutor(), new Consumer() { // from class: androidx.camera.camera2.internal.compat.quirk.a
            @Override // androidx.core.util.Consumer
            public final void accept(Object obj) {
                DeviceQuirks.a((QuirkSettings) obj);
            }
        });
    }

    private DeviceQuirks() {
    }

    public static /* synthetic */ void a(QuirkSettings quirkSettings) {
        sQuirks = new Quirks(DeviceQuirksLoader.loadQuirks(quirkSettings));
        Logger.d(TAG, "camera2 DeviceQuirks = " + Quirks.toString(sQuirks));
    }

    @Nullable
    public static <T extends Quirk> T get(@NonNull Class<T> cls) {
        return (T) sQuirks.get(cls);
    }

    @NonNull
    public static Quirks getAll() {
        return sQuirks;
    }
}
