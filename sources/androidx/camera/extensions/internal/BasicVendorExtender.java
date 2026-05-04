package androidx.camera.extensions.internal;

import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.CameraInfo;
import androidx.camera.core.Logger;
import androidx.camera.core.impl.CameraInfoInternal;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.extensions.impl.AutoImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.AutoPreviewExtenderImpl;
import androidx.camera.extensions.impl.BeautyImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BeautyPreviewExtenderImpl;
import androidx.camera.extensions.impl.BokehImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.BokehPreviewExtenderImpl;
import androidx.camera.extensions.impl.HdrImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.HdrPreviewExtenderImpl;
import androidx.camera.extensions.impl.ImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightImageCaptureExtenderImpl;
import androidx.camera.extensions.impl.NightPreviewExtenderImpl;
import androidx.camera.extensions.impl.PreviewExtenderImpl;
import androidx.camera.extensions.internal.compat.workaround.AvailableKeysRetriever;
import androidx.camera.extensions.internal.compat.workaround.ExtensionDisabledValidator;
import androidx.camera.extensions.internal.sessionprocessor.BasicExtenderSessionProcessor;
import androidx.core.util.Preconditions;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class BasicVendorExtender implements VendorExtender {
    private static final String TAG = "BasicVendorExtender";
    static final List<CaptureRequest.Key> sBaseSupportedKeys;
    private CameraCharacteristics mCameraCharacteristics;
    private String mCameraId;
    private CameraInfoInternal mCameraInfo;
    private ImageCaptureExtenderImpl mImageCaptureExtenderImpl;
    private PreviewExtenderImpl mPreviewExtenderImpl;
    private final ExtensionDisabledValidator mExtensionDisabledValidator = new ExtensionDisabledValidator();
    private AvailableKeysRetriever mAvailableKeysRetriever = new AvailableKeysRetriever();

    static {
        CaptureRequest.Key key;
        ArrayList arrayList = new ArrayList(Arrays.asList(CaptureRequest.SCALER_CROP_REGION, CaptureRequest.CONTROL_AF_MODE, CaptureRequest.CONTROL_AF_TRIGGER, CaptureRequest.CONTROL_AF_REGIONS, CaptureRequest.CONTROL_AE_REGIONS, CaptureRequest.CONTROL_AWB_REGIONS, CaptureRequest.CONTROL_AE_MODE, CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, CaptureRequest.FLASH_MODE, CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION));
        sBaseSupportedKeys = arrayList;
        if (Build.VERSION.SDK_INT >= 30) {
            key = CaptureRequest.CONTROL_ZOOM_RATIO;
            arrayList.add(key);
        }
    }

    public BasicVendorExtender(int i11) {
        this.mPreviewExtenderImpl = null;
        this.mImageCaptureExtenderImpl = null;
        try {
            if (i11 == 1) {
                this.mPreviewExtenderImpl = new BokehPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new BokehImageCaptureExtenderImpl();
                return;
            }
            if (i11 == 2) {
                this.mPreviewExtenderImpl = new HdrPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new HdrImageCaptureExtenderImpl();
                return;
            }
            if (i11 == 3) {
                this.mPreviewExtenderImpl = new NightPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new NightImageCaptureExtenderImpl();
            } else if (i11 == 4) {
                this.mPreviewExtenderImpl = new BeautyPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new BeautyImageCaptureExtenderImpl();
            } else {
                if (i11 != 5) {
                    throw new IllegalArgumentException("Should not activate ExtensionMode.NONE");
                }
                this.mPreviewExtenderImpl = new AutoPreviewExtenderImpl();
                this.mImageCaptureExtenderImpl = new AutoImageCaptureExtenderImpl();
            }
        } catch (NoClassDefFoundError unused) {
            Logger.e(TAG, "OEM implementation for extension mode " + i11 + "does not exist!");
        }
    }

    private int getCaptureInputImageFormat() {
        ImageCaptureExtenderImpl imageCaptureExtenderImpl = this.mImageCaptureExtenderImpl;
        return (imageCaptureExtenderImpl == null || imageCaptureExtenderImpl.getCaptureProcessor() == null) ? 256 : 35;
    }

    private Size[] getOutputSizes(int i11) {
        return ((StreamConfigurationMap) this.mCameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP)).getOutputSizes(i11);
    }

    private int getPreviewInputImageFormat() {
        PreviewExtenderImpl previewExtenderImpl = this.mPreviewExtenderImpl;
        return (previewExtenderImpl == null || previewExtenderImpl.getProcessorType() != PreviewExtenderImpl.ProcessorType.PROCESSOR_TYPE_IMAGE_PROCESSOR) ? 34 : 35;
    }

    @NonNull
    private List<CaptureRequest.Key> getSupportedParameterKeys(Context context) {
        if (!ExtensionVersion.isMinimumCompatibleVersion(Version.VERSION_1_3)) {
            return Collections.unmodifiableList(sBaseSupportedKeys);
        }
        try {
            List<CaptureRequest.Key> availableCaptureRequestKeys = this.mAvailableKeysRetriever.getAvailableCaptureRequestKeys(this.mImageCaptureExtenderImpl, this.mCameraId, this.mCameraCharacteristics, context);
            if (availableCaptureRequestKeys != null) {
                return Collections.unmodifiableList(availableCaptureRequestKeys);
            }
        } catch (Exception e11) {
            Logger.e(TAG, "ImageCaptureExtenderImpl.getAvailableCaptureRequestKeys throws exceptions", e11);
        }
        return Collections.EMPTY_LIST;
    }

    private List<Pair<Integer, Size[]>> getSupportedResolutionsOfFormat(List<Pair<Integer, Size[]>> list, int i11, int i12) {
        ArrayList arrayList = new ArrayList();
        for (Pair<Integer, Size[]> pair : list) {
            if (((Integer) pair.first).intValue() == i11) {
                arrayList.add(new Pair(Integer.valueOf(i11), (Size[]) pair.second));
                return arrayList;
            }
        }
        for (Pair<Integer, Size[]> pair2 : list) {
            if (((Integer) pair2.first).intValue() == i12) {
                arrayList.add(new Pair(Integer.valueOf(i11), (Size[]) pair2.second));
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        throw new IllegalArgumentException("Supported resolution should contain " + i11 + " format.");
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @Nullable
    public SessionProcessor createSessionProcessor(@NonNull Context context) {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        return new BasicExtenderSessionProcessor(this.mPreviewExtenderImpl, this.mImageCaptureExtenderImpl, getSupportedParameterKeys(context), this, context);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @Nullable
    public Range<Long> getEstimatedCaptureLatencyRange(@Nullable Size size) {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mImageCaptureExtenderImpl == null || ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_2) < 0) {
            return null;
        }
        try {
            return this.mImageCaptureExtenderImpl.getEstimatedCaptureLatencyRange(size);
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public List<Pair<Integer, Size[]>> getSupportedCaptureOutputResolutions() {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mImageCaptureExtenderImpl != null && ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_1) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.mImageCaptureExtenderImpl.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return this.mImageCaptureExtenderImpl.getCaptureProcessor() != null ? getSupportedResolutionsOfFormat(supportedResolutions, 35, 256) : supportedResolutions;
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        int captureInputImageFormat = getCaptureInputImageFormat();
        return Arrays.asList(new Pair(Integer.valueOf(captureInputImageFormat), getOutputSizes(captureInputImageFormat)));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public List<CaptureResult.Key> getSupportedCaptureResultKeys() {
        if (ExtensionVersion.isMinimumCompatibleVersion(Version.VERSION_1_3)) {
            try {
                List availableCaptureResultKeys = this.mImageCaptureExtenderImpl.getAvailableCaptureResultKeys();
                if (availableCaptureResultKeys != null) {
                    return Collections.unmodifiableList(availableCaptureResultKeys);
                }
            } catch (Exception e11) {
                Logger.e(TAG, "ImageCaptureExtenderImpl.getAvailableCaptureResultKeys throws exceptions", e11);
            }
        }
        return Collections.EMPTY_LIST;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public Map<Integer, List<Size>> getSupportedPostviewResolutions(@NonNull Size size) {
        Version version = Version.VERSION_1_4;
        if (!ClientVersion.isMinimumCompatibleVersion(version) || !ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return Collections.EMPTY_MAP;
        }
        List<Pair> supportedPostviewResolutions = this.mImageCaptureExtenderImpl.getSupportedPostviewResolutions(size);
        HashMap hashMap = new HashMap();
        for (Pair pair : supportedPostviewResolutions) {
            Integer num = (Integer) pair.first;
            num.intValue();
            hashMap.put(num, Arrays.asList((Size[]) pair.second));
        }
        return Collections.unmodifiableMap(hashMap);
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public List<Pair<Integer, Size[]>> getSupportedPreviewOutputResolutions() {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        if (this.mPreviewExtenderImpl != null && ExtensionVersion.getRuntimeVersion().compareTo(Version.VERSION_1_1) >= 0) {
            try {
                List<Pair<Integer, Size[]>> supportedResolutions = this.mPreviewExtenderImpl.getSupportedResolutions();
                if (supportedResolutions != null) {
                    return getSupportedResolutionsOfFormat(supportedResolutions, 34, 35);
                }
            } catch (NoSuchMethodError unused) {
            }
        }
        return Arrays.asList(new Pair(34, getOutputSizes(getPreviewInputImageFormat())));
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    @NonNull
    public Size[] getSupportedYuvAnalysisResolutions() {
        Preconditions.checkNotNull(this.mCameraInfo, "VendorExtender#init() must be called first");
        return new Size[0];
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public void init(@NonNull CameraInfo cameraInfo) {
        CameraInfoInternal cameraInfoInternal = (CameraInfoInternal) cameraInfo;
        this.mCameraInfo = cameraInfoInternal;
        if (this.mPreviewExtenderImpl == null || this.mImageCaptureExtenderImpl == null) {
            return;
        }
        this.mCameraId = cameraInfoInternal.getCameraId();
        CameraCharacteristics cameraCharacteristics = (CameraCharacteristics) this.mCameraInfo.getCameraCharacteristics();
        this.mCameraCharacteristics = cameraCharacteristics;
        this.mPreviewExtenderImpl.init(this.mCameraId, cameraCharacteristics);
        this.mImageCaptureExtenderImpl.init(this.mCameraId, this.mCameraCharacteristics);
        Logger.d(TAG, "PreviewExtender processorType= " + this.mPreviewExtenderImpl.getProcessorType());
        Logger.d(TAG, "ImageCaptureExtender processor= " + this.mImageCaptureExtenderImpl.getCaptureProcessor());
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isCaptureProcessProgressAvailable() {
        Version version = Version.VERSION_1_4;
        if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mImageCaptureExtenderImpl.isCaptureProcessProgressAvailable();
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionAvailable(@NonNull String str, @NonNull Map<String, CameraCharacteristics> map) {
        if (!this.mExtensionDisabledValidator.shouldDisableExtension() && this.mPreviewExtenderImpl != null && this.mImageCaptureExtenderImpl != null) {
            CameraCharacteristics cameraCharacteristics = map.get(str);
            if (this.mPreviewExtenderImpl.isExtensionAvailable(str, cameraCharacteristics) && this.mImageCaptureExtenderImpl.isExtensionAvailable(str, cameraCharacteristics)) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isExtensionStrengthAvailable() {
        return false;
    }

    @Override // androidx.camera.extensions.internal.VendorExtender
    public boolean isPostviewAvailable() {
        Version version = Version.VERSION_1_4;
        if (ClientVersion.isMinimumCompatibleVersion(version) && ExtensionVersion.isMinimumCompatibleVersion(version)) {
            return this.mImageCaptureExtenderImpl.isPostviewAvailable();
        }
        return false;
    }

    @VisibleForTesting
    public BasicVendorExtender(@Nullable ImageCaptureExtenderImpl imageCaptureExtenderImpl, @Nullable PreviewExtenderImpl previewExtenderImpl) {
        this.mPreviewExtenderImpl = null;
        this.mImageCaptureExtenderImpl = null;
        this.mPreviewExtenderImpl = previewExtenderImpl;
        this.mImageCaptureExtenderImpl = imageCaptureExtenderImpl;
    }
}
