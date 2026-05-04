package androidx.camera.extensions.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.Logger;
import androidx.camera.extensions.impl.ExtensionVersionImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public abstract class ExtensionVersion {
    private static final String TAG = "ExtenderVersion";
    private static volatile ExtensionVersion sExtensionVersion;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DefaultExtenderVersioning extends ExtensionVersion {
        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public Version getVersionObject() {
            return null;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public boolean isAdvancedExtenderSupportedInternal() {
            return false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class VendorExtenderVersioning extends ExtensionVersion {
        private static ExtensionVersionImpl sImpl;
        private Version mRuntimeVersion;

        public VendorExtenderVersioning() {
            if (sImpl == null) {
                sImpl = new ExtensionVersionImpl();
            }
            Version parse = Version.parse(sImpl.checkApiVersion(ClientVersion.getCurrentVersion().toVersionString()));
            if (parse != null && ClientVersion.getCurrentVersion().getVersion().getMajor() == parse.getMajor()) {
                this.mRuntimeVersion = parse;
            }
            Logger.d(ExtensionVersion.TAG, "Selected vendor runtime: " + this.mRuntimeVersion);
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public Version getVersionObject() {
            return this.mRuntimeVersion;
        }

        @Override // androidx.camera.extensions.internal.ExtensionVersion
        public boolean isAdvancedExtenderSupportedInternal() {
            try {
                return sImpl.isAdvancedExtenderImplemented();
            } catch (NoSuchMethodError unused) {
                return false;
            }
        }
    }

    private static ExtensionVersion getInstance() {
        if (sExtensionVersion != null) {
            return sExtensionVersion;
        }
        synchronized (ExtensionVersion.class) {
            if (sExtensionVersion == null) {
                try {
                    sExtensionVersion = new VendorExtenderVersioning();
                } catch (NoClassDefFoundError unused) {
                    Logger.d(TAG, "No versioning extender found. Falling back to default.");
                    sExtensionVersion = new DefaultExtenderVersioning();
                }
            }
        }
        return sExtensionVersion;
    }

    @Nullable
    public static Version getRuntimeVersion() {
        return getInstance().getVersionObject();
    }

    @VisibleForTesting
    public static void injectInstance(@Nullable ExtensionVersion extensionVersion) {
        sExtensionVersion = extensionVersion;
    }

    public static boolean isAdvancedExtenderSupported() {
        return getInstance().isAdvancedExtenderSupportedInternal();
    }

    public static boolean isExtensionVersionSupported() {
        return getInstance().getVersionObject() != null;
    }

    public static boolean isMaximumCompatibleVersion(@NonNull Version version) {
        return getRuntimeVersion().compareTo(version.getMajor(), version.getMinor()) <= 0;
    }

    public static boolean isMinimumCompatibleVersion(@NonNull Version version) {
        return getRuntimeVersion().compareTo(version.getMajor(), version.getMinor()) >= 0;
    }

    public abstract Version getVersionObject();

    public abstract boolean isAdvancedExtenderSupportedInternal();
}
