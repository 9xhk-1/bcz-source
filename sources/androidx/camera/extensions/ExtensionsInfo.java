package androidx.camera.extensions;

import android.content.Context;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraFilter;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.CameraProvider;
import androidx.camera.core.CameraSelector;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.CameraConfigProvider;
import androidx.camera.core.impl.ExtendedCameraConfigProviderStore;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.extensions.ExtensionsConfig;
import androidx.camera.extensions.internal.AdvancedVendorExtender;
import androidx.camera.extensions.internal.BasicVendorExtender;
import androidx.camera.extensions.internal.ClientVersion;
import androidx.camera.extensions.internal.ExtensionVersion;
import androidx.camera.extensions.internal.ExtensionsUseCaseConfigFactory;
import androidx.camera.extensions.internal.VendorExtender;
import androidx.camera.extensions.internal.Version;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class ExtensionsInfo {
    private static final String EXTENDED_CAMERA_CONFIG_PROVIDER_ID_PREFIX = ":camera:camera-extensions-";
    private final CameraProvider mCameraProvider;

    @NonNull
    private VendorExtenderFactory mVendorExtenderFactory = new VendorExtenderFactory() { // from class: androidx.camera.extensions.a
        @Override // androidx.camera.extensions.VendorExtenderFactory
        public final VendorExtender createVendorExtender(int i11) {
            VendorExtender vendorExtender;
            vendorExtender = ExtensionsInfo.getVendorExtender(i11);
            return vendorExtender;
        }
    };

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: androidx.camera.extensions.ExtensionsInfo$1, reason: invalid class name */
    public class AnonymousClass1 implements VendorExtender {
    }

    public ExtensionsInfo(@NonNull CameraProvider cameraProvider) {
        this.mCameraProvider = cameraProvider;
    }

    public static /* synthetic */ CameraConfig a(ExtensionsInfo extensionsInfo, int i11, Identifier identifier, CameraInfo cameraInfo, Context context) {
        VendorExtender createVendorExtender = extensionsInfo.mVendorExtenderFactory.createVendorExtender(i11);
        createVendorExtender.init(cameraInfo);
        ExtensionsConfig.Builder useCaseCombinationRequiredRule = new ExtensionsConfig.Builder().setExtensionMode(i11).setUseCaseConfigFactory((UseCaseConfigFactory) new ExtensionsUseCaseConfigFactory(createVendorExtender)).setCompatibilityId(identifier).setZslDisabled(true).setPostviewSupported(createVendorExtender.isPostviewAvailable()).setCaptureProcessProgressSupported(createVendorExtender.isCaptureProcessProgressAvailable()).setUseCaseCombinationRequiredRule(1);
        SessionProcessor createSessionProcessor = createVendorExtender.createSessionProcessor(context);
        if (createSessionProcessor != null) {
            useCaseCombinationRequiredRule.setSessionProcessor(createSessionProcessor);
        }
        return useCaseCombinationRequiredRule.build();
    }

    private static String getExtendedCameraConfigProviderId(int i11) {
        if (i11 == 0) {
            return ":camera:camera-extensions-EXTENSION_MODE_NONE";
        }
        if (i11 == 1) {
            return ":camera:camera-extensions-EXTENSION_MODE_BOKEH";
        }
        if (i11 == 2) {
            return ":camera:camera-extensions-EXTENSION_MODE_HDR";
        }
        if (i11 == 3) {
            return ":camera:camera-extensions-EXTENSION_MODE_NIGHT";
        }
        if (i11 == 4) {
            return ":camera:camera-extensions-EXTENSION_MODE_FACE_RETOUCH";
        }
        if (i11 == 5) {
            return ":camera:camera-extensions-EXTENSION_MODE_AUTO";
        }
        throw new IllegalArgumentException("Invalid extension mode!");
    }

    private CameraFilter getFilter(int i11) {
        return new ExtensionCameraFilter(getExtendedCameraConfigProviderId(i11), this.mVendorExtenderFactory.createVendorExtender(i11));
    }

    @NonNull
    public static VendorExtender getVendorExtender(int i11) {
        return isAdvancedExtenderSupported() ? new AdvancedVendorExtender(i11) : new BasicVendorExtender(i11);
    }

    private void injectExtensionCameraConfig(final int i11) {
        final Identifier create = Identifier.create(getExtendedCameraConfigProviderId(i11));
        if (ExtendedCameraConfigProviderStore.getConfigProvider(create) == CameraConfigProvider.EMPTY) {
            ExtendedCameraConfigProviderStore.addConfig(create, new CameraConfigProvider() { // from class: androidx.camera.extensions.b
                @Override // androidx.camera.core.impl.CameraConfigProvider
                public final CameraConfig getConfig(CameraInfo cameraInfo, Context context) {
                    return ExtensionsInfo.a(ExtensionsInfo.this, i11, create, cameraInfo, context);
                }
            });
        }
    }

    private static boolean isAdvancedExtenderSupported() {
        Version version = Version.VERSION_1_1;
        if (ClientVersion.isMaximumCompatibleVersion(version) || ExtensionVersion.isMaximumCompatibleVersion(version)) {
            return false;
        }
        return ExtensionVersion.isAdvancedExtenderSupported();
    }

    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRange(@NonNull CameraSelector cameraSelector, int i11, @Nullable Size size) {
        List<CameraInfo> filter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i11)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (filter.isEmpty()) {
            return null;
        }
        CameraInfo cameraInfo = filter.get(0);
        if (ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            VendorExtender createVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i11);
            createVendorExtender.init(cameraInfo);
            return createVendorExtender.getEstimatedCaptureLatencyRange(size);
        } catch (NoSuchMethodError unused) {
            return null;
        }
    }

    @NonNull
    public CameraSelector getExtensionCameraSelectorAndInjectCameraConfig(@NonNull CameraSelector cameraSelector, int i11) {
        if (!isExtensionAvailable(cameraSelector, i11)) {
            throw new IllegalArgumentException("No camera can be found to support the specified extensions mode! isExtensionAvailable should be checked first before calling getExtensionEnabledCameraSelector.");
        }
        Iterator<CameraFilter> it = cameraSelector.getCameraFilterSet().iterator();
        while (it.hasNext()) {
            if (it.next() instanceof ExtensionCameraFilter) {
                throw new IllegalArgumentException("An extension is already applied to the base CameraSelector.");
            }
        }
        injectExtensionCameraConfig(i11);
        CameraSelector.Builder fromSelector = CameraSelector.Builder.fromSelector(cameraSelector);
        fromSelector.addCameraFilter(getFilter(i11));
        return fromSelector.build();
    }

    public boolean isExtensionAvailable(@NonNull CameraSelector cameraSelector, int i11) {
        CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i11));
        return !r1.build().filter(this.mCameraProvider.getAvailableCameraInfos()).isEmpty();
    }

    public boolean isImageAnalysisSupported(@NonNull CameraSelector cameraSelector, int i11) {
        List<CameraInfo> filter = CameraSelector.Builder.fromSelector(cameraSelector).addCameraFilter(getFilter(i11)).build().filter(this.mCameraProvider.getAvailableCameraInfos());
        if (filter.isEmpty()) {
            return false;
        }
        CameraInfo cameraInfo = filter.get(0);
        VendorExtender createVendorExtender = this.mVendorExtenderFactory.createVendorExtender(i11);
        createVendorExtender.init(cameraInfo);
        Size[] supportedYuvAnalysisResolutions = createVendorExtender.getSupportedYuvAnalysisResolutions();
        return supportedYuvAnalysisResolutions != null && supportedYuvAnalysisResolutions.length > 0;
    }

    @VisibleForTesting
    public void setVendorExtenderFactory(@NonNull VendorExtenderFactory vendorExtenderFactory) {
        this.mVendorExtenderFactory = vendorExtenderFactory;
    }
}
