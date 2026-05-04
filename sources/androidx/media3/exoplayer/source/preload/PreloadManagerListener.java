package androidx.media3.exoplayer.source.preload;

import androidx.media3.common.MediaItem;
import androidx.media3.common.util.UnstableApi;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface PreloadManagerListener {
    default void onCompleted(MediaItem mediaItem) {
    }

    default void onError(PreloadException preloadException) {
    }
}
