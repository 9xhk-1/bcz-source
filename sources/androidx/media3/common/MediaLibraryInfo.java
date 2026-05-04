package androidx.media3.common;

import androidx.media3.common.util.UnstableApi;
import java.util.HashSet;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaLibraryInfo {
    public static final boolean ASSERTIONS_ENABLED = true;
    public static final String TAG = "AndroidXMedia3";
    public static final boolean TRACE_ENABLED = true;
    public static final String VERSION = "1.6.1";
    public static final int VERSION_INT = 1006001300;
    public static final String VERSION_SLASHY = "AndroidXMedia3/1.6.1";
    private static final HashSet<String> registeredModules = new HashSet<>();
    private static String registeredModulesString = "media3.common";

    private MediaLibraryInfo() {
    }

    public static synchronized void registerModule(String str) {
        synchronized (MediaLibraryInfo.class) {
            if (registeredModules.add(str)) {
                registeredModulesString += org.junit.jupiter.api.j2.O + str;
            }
        }
    }

    public static synchronized String registeredModules() {
        String str;
        synchronized (MediaLibraryInfo.class) {
            str = registeredModulesString;
        }
        return str;
    }
}
