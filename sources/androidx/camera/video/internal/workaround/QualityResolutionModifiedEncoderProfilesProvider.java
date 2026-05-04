package androidx.camera.video.internal.workaround;

import android.util.Size;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.impl.EncoderProfilesProvider;
import androidx.camera.core.impl.EncoderProfilesProxy;
import androidx.camera.core.impl.Quirks;
import androidx.camera.video.internal.compat.quirk.StretchedVideoResolutionQuirk;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public class QualityResolutionModifiedEncoderProfilesProvider implements EncoderProfilesProvider {

    @NonNull
    private final Map<Integer, EncoderProfilesProxy> mEncoderProfilesCache = new HashMap();

    @NonNull
    private final EncoderProfilesProvider mProvider;

    @NonNull
    private final Quirks mQuirks;

    public QualityResolutionModifiedEncoderProfilesProvider(@NonNull EncoderProfilesProvider encoderProfilesProvider, @NonNull Quirks quirks) {
        this.mProvider = encoderProfilesProvider;
        this.mQuirks = quirks;
    }

    @Nullable
    private EncoderProfilesProxy createNewEncoderProfiles(@NonNull EncoderProfilesProxy encoderProfilesProxy, @NonNull Size size) {
        ArrayList arrayList = new ArrayList();
        Iterator<EncoderProfilesProxy.VideoProfileProxy> it = encoderProfilesProxy.getVideoProfiles().iterator();
        while (it.hasNext()) {
            arrayList.add(generateVideoProfile(it.next(), size));
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return EncoderProfilesProxy.ImmutableEncoderProfilesProxy.create(encoderProfilesProxy.getDefaultDurationSeconds(), encoderProfilesProxy.getRecommendedFileFormat(), encoderProfilesProxy.getAudioProfiles(), arrayList);
    }

    @NonNull
    private static EncoderProfilesProxy.VideoProfileProxy generateVideoProfile(@NonNull EncoderProfilesProxy.VideoProfileProxy videoProfileProxy, @NonNull Size size) {
        return EncoderProfilesProxy.VideoProfileProxy.create(videoProfileProxy.getCodec(), videoProfileProxy.getMediaType(), videoProfileProxy.getBitrate(), videoProfileProxy.getFrameRate(), size.getWidth(), size.getHeight(), videoProfileProxy.getProfile(), videoProfileProxy.getBitDepth(), videoProfileProxy.getChromaSubsampling(), videoProfileProxy.getHdrFormat());
    }

    @Nullable
    private Size getAlternativeResolution(int i11) {
        for (StretchedVideoResolutionQuirk stretchedVideoResolutionQuirk : this.mQuirks.getAll(StretchedVideoResolutionQuirk.class)) {
            if (stretchedVideoResolutionQuirk != null) {
                return stretchedVideoResolutionQuirk.getAlternativeResolution(i11);
            }
        }
        return null;
    }

    @Nullable
    private EncoderProfilesProxy getProfilesInternal(int i11) {
        EncoderProfilesProxy encoderProfilesProxy;
        if (this.mEncoderProfilesCache.containsKey(Integer.valueOf(i11))) {
            return this.mEncoderProfilesCache.get(Integer.valueOf(i11));
        }
        if (this.mProvider.hasProfile(i11)) {
            EncoderProfilesProxy all = this.mProvider.getAll(i11);
            Objects.requireNonNull(all);
            encoderProfilesProxy = all;
            Size alternativeResolution = getAlternativeResolution(i11);
            if (alternativeResolution != null) {
                encoderProfilesProxy = createNewEncoderProfiles(encoderProfilesProxy, alternativeResolution);
            }
        } else {
            encoderProfilesProxy = null;
        }
        this.mEncoderProfilesCache.put(Integer.valueOf(i11), encoderProfilesProxy);
        return encoderProfilesProxy;
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    @Nullable
    public EncoderProfilesProxy getAll(int i11) {
        return getProfilesInternal(i11);
    }

    @Override // androidx.camera.core.impl.EncoderProfilesProvider
    public boolean hasProfile(int i11) {
        return this.mProvider.hasProfile(i11) && getProfilesInternal(i11) != null;
    }
}
