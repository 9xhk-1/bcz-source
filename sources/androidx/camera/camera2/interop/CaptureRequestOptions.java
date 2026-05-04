package androidx.camera.camera2.interop;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.camera.camera2.impl.Camera2ImplConfig;
import androidx.camera.camera2.interop.CaptureRequestOptions;
import androidx.camera.core.ExtendableBuilder;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableConfig;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@ExperimentalCamera2Interop
/* loaded from: classes.dex */
public class CaptureRequestOptions implements ReadableConfig {
    private final Config mConfig;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder implements ExtendableBuilder<CaptureRequestOptions> {
        private final MutableOptionsBundle mMutableOptionsBundle = MutableOptionsBundle.create();

        public static /* synthetic */ boolean a(Builder builder, Config config, Config.Option option) {
            builder.getMutableConfig().insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
            return true;
        }

        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public static Builder from(@NonNull final Config config) {
            final Builder builder = new Builder();
            config.findOptions(Camera2ImplConfig.CAPTURE_REQUEST_ID_STEM, new Config.OptionMatcher() { // from class: androidx.camera.camera2.interop.i
                @Override // androidx.camera.core.impl.Config.OptionMatcher
                public final boolean onOptionMatched(Config.Option option) {
                    return CaptureRequestOptions.Builder.a(CaptureRequestOptions.Builder.this, config, option);
                }
            });
            return builder;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> Builder clearCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key) {
            this.mMutableOptionsBundle.removeOption(Camera2ImplConfig.createCaptureRequestOption(key));
            return this;
        }

        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        @RestrictTo({RestrictTo.Scope.LIBRARY})
        public MutableConfig getMutableConfig() {
            return this.mMutableOptionsBundle;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> Builder setCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key, @NonNull ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(Camera2ImplConfig.createCaptureRequestOption(key), valuet);
            return this;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // androidx.camera.core.ExtendableBuilder
        @NonNull
        public CaptureRequestOptions build() {
            return new CaptureRequestOptions(OptionsBundle.from(this.mMutableOptionsBundle));
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public CaptureRequestOptions(@NonNull Config config) {
        this.mConfig = config;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    public <ValueT> ValueT getCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key) {
        return (ValueT) this.mConfig.retrieveOption(Camera2ImplConfig.createCaptureRequestOption(key), null);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @NonNull
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Config getConfig() {
        return this.mConfig;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public <ValueT> ValueT getCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key, @Nullable ValueT valuet) {
        return (ValueT) this.mConfig.retrieveOption(Camera2ImplConfig.createCaptureRequestOption(key), valuet);
    }
}
