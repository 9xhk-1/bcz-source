package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.Config;
import androidx.core.util.Preconditions;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface ImageInputConfig extends ReadableConfig {
    public static final Config.Option<Integer> OPTION_INPUT_FORMAT = Config.Option.create("camerax.core.imageInput.inputFormat", Integer.TYPE);
    public static final Config.Option<DynamicRange> OPTION_INPUT_DYNAMIC_RANGE = Config.Option.create("camerax.core.imageInput.inputDynamicRange", DynamicRange.class);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Builder<B> {
        @NonNull
        B setDynamicRange(@NonNull DynamicRange dynamicRange);
    }

    @NonNull
    default DynamicRange getDynamicRange() {
        return (DynamicRange) Preconditions.checkNotNull((DynamicRange) retrieveOption(OPTION_INPUT_DYNAMIC_RANGE, DynamicRange.UNSPECIFIED));
    }

    default int getInputFormat() {
        return ((Integer) retrieveOption(OPTION_INPUT_FORMAT)).intValue();
    }

    default boolean hasDynamicRange() {
        return containsOption(OPTION_INPUT_DYNAMIC_RANGE);
    }
}
