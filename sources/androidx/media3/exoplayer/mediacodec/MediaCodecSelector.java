package androidx.media3.exoplayer.mediacodec;

import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public interface MediaCodecSelector {
    public static final MediaCodecSelector DEFAULT = new MediaCodecSelector() { // from class: androidx.media3.exoplayer.mediacodec.r
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z11, boolean z12) {
            return MediaCodecUtil.getDecoderInfos(str, z11, z12);
        }
    };
    public static final MediaCodecSelector PREFER_SOFTWARE = new MediaCodecSelector() { // from class: androidx.media3.exoplayer.mediacodec.s
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecSelector
        public final List getDecoderInfos(String str, boolean z11, boolean z12) {
            List decoderInfosSortedBySoftwareOnly;
            decoderInfosSortedBySoftwareOnly = MediaCodecUtil.getDecoderInfosSortedBySoftwareOnly(MediaCodecSelector.DEFAULT.getDecoderInfos(str, z11, z12));
            return decoderInfosSortedBySoftwareOnly;
        }
    };

    List<MediaCodecInfo> getDecoderInfos(String str, boolean z11, boolean z12) throws MediaCodecUtil.DecoderQueryException;
}
