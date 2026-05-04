package androidx.camera.extensions.internal;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.VisibleForTesting;
import androidx.camera.core.impl.Config;
import androidx.camera.core.impl.MutableOptionsBundle;
import androidx.camera.core.impl.OptionsBundle;
import androidx.camera.core.impl.ReadableConfig;
import androidx.camera.extensions.internal.RequestOptionConfig;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class RequestOptionConfig implements ReadableConfig {
    static final String CAPTURE_REQUEST_ID_STEM = "camera2.captureRequest.option.";

    @NonNull
    private Config mConfig;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Builder {
        private MutableOptionsBundle mMutableOptionsBundle = MutableOptionsBundle.create();

        public static /* synthetic */ boolean a(Builder builder, Config config, Config.Option option) {
            builder.mMutableOptionsBundle.insertOption(option, config.getOptionPriority(option), config.retrieveOption(option));
            return true;
        }

        @NonNull
        public static Builder from(@NonNull final Config config) {
            final Builder builder = new Builder();
            config.findOptions("camera2.captureRequest.option.", new Config.OptionMatcher() { // from class: androidx.camera.extensions.internal.c
                @Override // androidx.camera.core.impl.Config.OptionMatcher
                public final boolean onOptionMatched(Config.Option option) {
                    return RequestOptionConfig.Builder.a(RequestOptionConfig.Builder.this, config, option);
                }
            });
            return builder;
        }

        @NonNull
        public RequestOptionConfig build() {
            return new RequestOptionConfig(OptionsBundle.from(this.mMutableOptionsBundle));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NonNull
        public <ValueT> Builder setCaptureRequestOption(@NonNull CaptureRequest.Key<ValueT> key, @NonNull ValueT valuet) {
            this.mMutableOptionsBundle.insertOption(RequestOptionConfig.createOptionFromKey(key), valuet);
            return this;
        }
    }

    @NonNull
    @VisibleForTesting
    public static Config.Option<Object> createOptionFromKey(@NonNull CaptureRequest.Key<?> key) {
        return Config.Option.create("camera2.captureRequest.option." + key.getName(), Object.class, key);
    }

    @Override // androidx.camera.core.impl.ReadableConfig
    @NonNull
    public Config getConfig() {
        return this.mConfig;
    }

    private RequestOptionConfig(@NonNull Config config) {
        this.mConfig = config;
    }
}
