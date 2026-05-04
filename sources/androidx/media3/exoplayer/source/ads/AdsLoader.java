package androidx.media3.exoplayer.source.ads;

import androidx.annotation.Nullable;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.AdViewProvider;
import androidx.media3.common.MediaItem;
import androidx.media3.common.Player;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.datasource.DataSpec;
import androidx.media3.exoplayer.source.ads.AdsMediaSource;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public interface AdsLoader {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface Provider {
        @Nullable
        AdsLoader getAdsLoader(MediaItem.AdsConfiguration adsConfiguration);
    }

    @UnstableApi
    void handlePrepareComplete(AdsMediaSource adsMediaSource, int i11, int i12);

    @UnstableApi
    void handlePrepareError(AdsMediaSource adsMediaSource, int i11, int i12, IOException iOException);

    void release();

    void setPlayer(@Nullable Player player);

    @UnstableApi
    void setSupportedContentTypes(int... iArr);

    @UnstableApi
    void start(AdsMediaSource adsMediaSource, DataSpec dataSpec, Object obj, AdViewProvider adViewProvider, EventListener eventListener);

    @UnstableApi
    void stop(AdsMediaSource adsMediaSource, EventListener eventListener);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @UnstableApi
    public interface EventListener {
        default void onAdClicked() {
        }

        default void onAdTapped() {
        }

        default void onAdPlaybackState(AdPlaybackState adPlaybackState) {
        }

        default void onAdLoadError(AdsMediaSource.AdLoadException adLoadException, DataSpec dataSpec) {
        }
    }

    @UnstableApi
    default void handleContentTimelineChanged(AdsMediaSource adsMediaSource, Timeline timeline) {
    }
}
