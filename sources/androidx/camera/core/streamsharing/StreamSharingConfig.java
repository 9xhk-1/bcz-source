package androidx.camera.core.streamsharing;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;
import androidx.camera.core.internal.ThreadConfig;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class StreamSharingConfig implements UseCaseConfig<StreamSharing>, ImageOutputConfig, ThreadConfig {
    static final Config.Option<List<UseCaseConfigFactory.CaptureType>> OPTION_CAPTURE_TYPES = Config.Option.create("camerax.core.streamSharing.captureTypes", List.class);
    private final OptionsBundle mConfig;

    public StreamSharingConfig(@NonNull OptionsBundle optionsBundle) {
        this.mConfig = optionsBundle;
    }

    @NonNull
    public List<UseCaseConfigFactory.CaptureType> getCaptureTypes() {
        return (List) retrieveOption(OPTION_CAPTURE_TYPES);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @NonNull
    public Config getConfig() {
        return this.mConfig;
    }
}
