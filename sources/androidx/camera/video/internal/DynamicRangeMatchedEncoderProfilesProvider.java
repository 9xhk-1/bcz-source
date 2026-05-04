package androidx.camera.video.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.DynamicRange;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.video.internal.utils.DynamicRangeUtil;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class DynamicRangeMatchedEncoderProfilesProvider implements EncoderProfilesProvider {
    private final DynamicRange mDynamicRange;
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();
    private final EncoderProfilesProvider mEncoderProfilesProvider;

    public DynamicRangeMatchedEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull DynamicRange dynamicRange) {
        this.mEncoderProfilesProvider = encoderProfilesProvider;
        this.mDynamicRange = dynamicRange;
    }

    @Nullable
    private static EncoderProfilesProxy filterUnmatchedDynamicRange(@Nullable EncoderProfilesProxy encoderProfilesProxy, @NonNull DynamicRange dynamicRange) {
        if (encoderProfilesProxy == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (EncoderProfilesProxy.VideoProfileProxy videoProfileProxy : encoderProfilesProxy.getVideoProfiles()) {
            if (DynamicRangeUtil.isHdrSettingsMatched(videoProfileProxy, dynamicRange)) {
                arrayList.add(videoProfileProxy);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    @Nullable
    private EncoderProfilesProxy getProfilesInternal(int i11) {
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i11))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i11));
        }
        if (!this.mEncoderProfilesProvider.hasProfile(i11)) {
            return null;
        }
        EncoderProfilesProxy filterUnmatchedDynamicRange = filterUnmatchedDynamicRange(this.mEncoderProfilesProvider.getAll(i11), this.mDynamicRange);
        this.mEncoderProfilesCache.put(Integer.valueOf(i11), filterUnmatchedDynamicRange);
        return filterUnmatchedDynamicRange;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i11) {
        return getProfilesInternal(i11);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i11) {
        return this.mEncoderProfilesProvider.hasProfile(i11) && getProfilesInternal(i11) != null;
    }
}
