package androidx.camera.extensions.internal;

import androidx.annotation.NonNull;
import androidx.camera.core.Preview;
import androidx.camera.core.impl.ConfigProvider;
import androidx.camera.core.impl.PreviewConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class PreviewConfigProvider implements ConfigProvider<PreviewConfig> {
    private static final String TAG = "PreviewConfigProvider";
    private final VendorExtender mVendorExtender;

    public PreviewConfigProvider(@NonNull VendorExtender vendorExtender) {
        this.mVendorExtender = vendorExtender;
    }

    public void updateBuilderConfig(@NonNull Preview.Builder builder, @NonNull VendorExtender vendorExtender) {
        builder.setSupportedResolutions(vendorExtender.getSupportedPreviewOutputResolutions());
        builder.setHighResolutionDisabled(true);
    }

    @Override // androidx.camera.core.impl.ConfigProvider
    @NonNull
    public PreviewConfig getConfig() {
        Preview.Builder builder = new Preview.Builder();
        updateBuilderConfig(builder, this.mVendorExtender);
        return builder.getUseCaseConfig();
    }
}
