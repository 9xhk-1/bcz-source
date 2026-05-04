package androidx.camera.extensions.internal;

import android.util.Pair;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.core.ImageAnalysis;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.ImageAnalysisConfig;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ImageAnalysisConfigProvider implements ConfigProvider<ImageAnalysisConfig> {
    private final VendorExtender mVendorExtender;

    public ImageAnalysisConfigProvider(@NonNull VendorExtender vendorExtender) {
        this.mVendorExtender = vendorExtender;
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    @NonNull
    public ImageAnalysisConfig getConfig() {
        ImageAnalysis.Builder builder = new ImageAnalysis.Builder();
        Size[] supportedYuvAnalysisResolutions = this.mVendorExtender.getSupportedYuvAnalysisResolutions();
        ArrayList arrayList = new ArrayList();
        if (supportedYuvAnalysisResolutions != null && supportedYuvAnalysisResolutions.length > 0) {
            arrayList.add(new Pair<>(35, supportedYuvAnalysisResolutions));
        }
        builder.setSupportedResolutions((List<Pair<Integer, Size[]>>) arrayList);
        return builder.getUseCaseConfig();
    }
}
