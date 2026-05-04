package androidx.media3.exoplayer;

import android.os.Handler;
import androidx.annotation.Nullable;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.audio.AudioRendererEventListener;
import androidx.media3.exoplayer.metadata.MetadataOutput;
import androidx.media3.exoplayer.text.TextOutput;
import androidx.media3.exoplayer.video.VideoRendererEventListener;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface RenderersFactory {
    Renderer[] createRenderers(Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput);

    @Nullable
    default Renderer createSecondaryRenderer(Renderer renderer, Handler handler, VideoRendererEventListener videoRendererEventListener, AudioRendererEventListener audioRendererEventListener, TextOutput textOutput, MetadataOutput metadataOutput) {
        return null;
    }
}
