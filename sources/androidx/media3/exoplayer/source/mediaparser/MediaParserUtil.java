package androidx.media3.exoplayer.source.mediaparser;

import android.media.MediaFormat;
import android.media.MediaParser;
import android.media.metrics.LogSessionId;
import androidx.annotation.RequiresApi;
import androidx.media3.common.Format;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.exoplayer.analytics.PlayerId;
import com.tencent.ijk.media.player.misc.IMediaFormat;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class MediaParserUtil {
    public static final String PARAMETER_EAGERLY_EXPOSE_TRACK_TYPE = "android.media.mediaparser.eagerlyExposeTrackType";
    public static final String PARAMETER_EXPOSE_CAPTION_FORMATS = "android.media.mediaParser.exposeCaptionFormats";
    public static final String PARAMETER_EXPOSE_CHUNK_INDEX_AS_MEDIA_FORMAT = "android.media.mediaParser.exposeChunkIndexAsMediaFormat";
    public static final String PARAMETER_EXPOSE_DUMMY_SEEK_MAP = "android.media.mediaparser.exposeDummySeekMap";
    public static final String PARAMETER_IGNORE_TIMESTAMP_OFFSET = "android.media.mediaparser.ignoreTimestampOffset";
    public static final String PARAMETER_INCLUDE_SUPPLEMENTAL_DATA = "android.media.mediaparser.includeSupplementalData";
    public static final String PARAMETER_IN_BAND_CRYPTO_INFO = "android.media.mediaparser.inBandCryptoInfo";
    public static final String PARAMETER_OVERRIDE_IN_BAND_CAPTION_DECLARATIONS = "android.media.mediaParser.overrideInBandCaptionDeclarations";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @RequiresApi(31)
    public static final class Api31 {
        private Api31() {
        }

        public static void setLogSessionIdOnMediaParser(MediaParser mediaParser, PlayerId playerId) {
            LogSessionId logSessionId;
            boolean equals;
            LogSessionId logSessionId2 = playerId.getLogSessionId();
            logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
            equals = logSessionId2.equals(logSessionId);
            if (equals) {
                return;
            }
            mediaParser.setLogSessionId(logSessionId2);
        }
    }

    private MediaParserUtil() {
    }

    @RequiresApi(31)
    public static void setLogSessionIdOnMediaParser(MediaParser mediaParser, PlayerId playerId) {
        Api31.setLogSessionIdOnMediaParser(mediaParser, playerId);
    }

    public static MediaFormat toCaptionsMediaFormat(Format format) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString(IMediaFormat.KEY_MIME, format.sampleMimeType);
        int i11 = format.accessibilityChannel;
        if (i11 != -1) {
            mediaFormat.setInteger("caption-service-number", i11);
        }
        return mediaFormat;
    }
}
