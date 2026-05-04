package androidx.camera.core.impl.utils;

import androidx.annotation.Nullable;
import androidx.camera.core.resolutionselector.ResolutionSelector;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class ResolutionSelectorUtil {
    private ResolutionSelectorUtil() {
    }

    @Nullable
    public static ResolutionSelector overrideResolutionSelectors(@Nullable ResolutionSelector resolutionSelector, @Nullable ResolutionSelector resolutionSelector2) {
        if (resolutionSelector2 == null) {
            return resolutionSelector;
        }
        if (resolutionSelector == null) {
            return resolutionSelector2;
        }
        ResolutionSelector.Builder fromResolutionSelector = ResolutionSelector.Builder.fromResolutionSelector(resolutionSelector);
        if (resolutionSelector2.getAspectRatioStrategy() != null) {
            fromResolutionSelector.setAspectRatioStrategy(resolutionSelector2.getAspectRatioStrategy());
        }
        if (resolutionSelector2.getResolutionStrategy() != null) {
            fromResolutionSelector.setResolutionStrategy(resolutionSelector2.getResolutionStrategy());
        }
        if (resolutionSelector2.getResolutionFilter() != null) {
            fromResolutionSelector.setResolutionFilter(resolutionSelector2.getResolutionFilter());
        }
        if (resolutionSelector2.getAllowedResolutionMode() != 0) {
            fromResolutionSelector.setAllowedResolutionMode(resolutionSelector2.getAllowedResolutionMode());
        }
        return fromResolutionSelector.build();
    }
}
