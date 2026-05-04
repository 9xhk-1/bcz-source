package androidx.camera.extensions;

import androidx.annotation.NonNull;
import androidx.camera.core.impl.CameraConfig;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.Identifier;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.SessionProcessor;
import androidx.camera.core.impl.UseCaseConfigFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
class ExtensionsConfig implements CameraConfig {
    public static final Config.Option<Integer> OPTION_EXTENSION_MODE = Config.Option.create("camerax.extensions.extensionMode", Integer.TYPE);
    private final Config mConfig;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder implements CameraConfig.Builder<Builder> {
        private final MutableOptionsBundle mConfig = MutableOptionsBundle.create();

        public ExtensionsConfig build() {
            return new ExtensionsConfig(this.mConfig);
        }

        public Builder setExtensionMode(int i11) {
            this.mConfig.insertOption(ExtensionsConfig.OPTION_EXTENSION_MODE, Integer.valueOf(i11));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setCaptureProcessProgressSupported(boolean z11) {
            this.mConfig.insertOption(CameraConfig.OPTION_CAPTURE_PROCESS_PROGRESS_SUPPORTED, Boolean.valueOf(z11));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setCompatibilityId(@NonNull Identifier identifier) {
            this.mConfig.insertOption(CameraConfig.OPTION_COMPATIBILITY_ID, identifier);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setPostviewSupported(boolean z11) {
            this.mConfig.insertOption(CameraConfig.OPTION_POSTVIEW_SUPPORTED, Boolean.valueOf(z11));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setSessionProcessor(@NonNull SessionProcessor sessionProcessor) {
            this.mConfig.insertOption(CameraConfig.OPTION_SESSION_PROCESSOR, sessionProcessor);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setUseCaseCombinationRequiredRule(int i11) {
            this.mConfig.insertOption(CameraConfig.OPTION_USE_CASE_COMBINATION_REQUIRED_RULE, Integer.valueOf(i11));
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setUseCaseConfigFactory(@NonNull UseCaseConfigFactory useCaseConfigFactory) {
            this.mConfig.insertOption(CameraConfig.OPTION_USECASE_CONFIG_FACTORY, useCaseConfigFactory);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.impl.CameraConfig.Builder
        @NonNull
        public Builder setZslDisabled(boolean z11) {
            this.mConfig.insertOption(CameraConfig.OPTION_ZSL_DISABLED, Boolean.valueOf(z11));
            return this;
        }
    }

    public ExtensionsConfig(Config config) {
        this.mConfig = config;
    }

    @Override // androidx.camera.core.impl.CameraConfig
    @NonNull
    public Identifier getCompatibilityId() {
        return (Identifier) retrieveOption(CameraConfig.OPTION_COMPATIBILITY_ID);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @NonNull
    public Config getConfig() {
        return this.mConfig;
    }

    public int getExtensionMode() {
        return ((Integer) retrieveOption(OPTION_EXTENSION_MODE)).intValue();
    }
}
