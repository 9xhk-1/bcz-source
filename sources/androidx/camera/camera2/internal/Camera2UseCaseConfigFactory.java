package androidx.camera.camera2.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.camera.core.impl.CaptureConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.ImageOutputConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.SessionConfig;
import androidx.camera.core.impl.UseCaseConfig;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class Camera2UseCaseConfigFactory implements UseCaseConfigFactory {
    final DisplayInfoManager mDisplayInfoManager;

    public Camera2UseCaseConfigFactory(@NonNull Context context) {
        this.mDisplayInfoManager = DisplayInfoManager.getInstance(context);
    }

    @Override // androidx.camera.core.impl.UseCaseConfigFactory
    @NonNull
    public Config getConfig(@NonNull UseCaseConfigFactory.CaptureType captureType, int i11) {
        MutableOptionsBundle create = MutableOptionsBundle.create();
        SessionConfig.Builder builder = new SessionConfig.Builder();
        builder.setTemplateType(TemplateTypeUtil.getSessionConfigTemplateType(captureType, i11));
        create.insertOption(UseCaseConfig.OPTION_DEFAULT_SESSION_CONFIG, builder.build());
        create.insertOption(UseCaseConfig.OPTION_SESSION_CONFIG_UNPACKER, Camera2SessionOptionUnpacker.INSTANCE);
        CaptureConfig.Builder builder2 = new CaptureConfig.Builder();
        builder2.setTemplateType(TemplateTypeUtil.getCaptureConfigTemplateType(captureType, i11));
        create.insertOption(UseCaseConfig.OPTION_DEFAULT_CAPTURE_CONFIG, builder2.build());
        create.insertOption(UseCaseConfig.OPTION_CAPTURE_CONFIG_UNPACKER, captureType == UseCaseConfigFactory.CaptureType.IMAGE_CAPTURE ? ImageCaptureOptionUnpacker.INSTANCE : Camera2CaptureOptionUnpacker.INSTANCE);
        if (captureType == UseCaseConfigFactory.CaptureType.PREVIEW) {
            create.insertOption(ImageOutputConfig.OPTION_MAX_RESOLUTION, this.mDisplayInfoManager.getPreviewSize());
        }
        create.insertOption(ImageOutputConfig.OPTION_TARGET_ROTATION, Integer.valueOf(this.mDisplayInfoManager.getMaxSizeDisplay(true).getRotation()));
        if (captureType == UseCaseConfigFactory.CaptureType.VIDEO_CAPTURE || captureType == UseCaseConfigFactory.CaptureType.STREAM_SHARING) {
            create.insertOption(UseCaseConfig.OPTION_ZSL_DISABLED, Boolean.TRUE);
        }
        return OptionsBundle.from(create);
    }
}
