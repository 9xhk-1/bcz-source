package androidx.camera.video.internal.utils;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.util.LruCache;
import androidx.annotation.GuardedBy;
import androidx.annotation.NonNull;
import androidx.camera.video.internal.encoder.EncoderConfig;
import androidx.camera.video.internal.encoder.InvalidConfigException;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class CodecUtil {
    private static final int MAX_CODEC_INFO_CACHE_COUNT = 10;

    @GuardedBy("sCodecInfoCache")
    private static final LruCache<String, MediaCodecInfo> sCodecInfoCache = new LruCache<>(10);

    private CodecUtil() {
    }

    @NonNull
    public static MediaCodec createCodec(@NonNull EncoderConfig encoderConfig) throws InvalidConfigException {
        return createCodec(encoderConfig.getMimeType());
    }

    @NonNull
    public static MediaCodecInfo findCodecAndGetCodecInfo(@NonNull EncoderConfig encoderConfig) throws InvalidConfigException {
        MediaCodecInfo mediaCodecInfo;
        MediaCodec mediaCodec;
        String mimeType = encoderConfig.getMimeType();
        LruCache<String, MediaCodecInfo> lruCache = sCodecInfoCache;
        synchronized (lruCache) {
            mediaCodecInfo = lruCache.get(mimeType);
        }
        if (mediaCodecInfo != null) {
            return mediaCodecInfo;
        }
        try {
            mediaCodec = createCodec(mimeType);
            try {
                MediaCodecInfo codecInfo = mediaCodec.getCodecInfo();
                synchronized (lruCache) {
                    lruCache.put(mimeType, codecInfo);
                }
                mediaCodec.release();
                return codecInfo;
            } catch (Throwable th2) {
                th = th2;
                if (mediaCodec != null) {
                    mediaCodec.release();
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            mediaCodec = null;
        }
    }

    @NonNull
    private static MediaCodec createCodec(@NonNull String str) throws InvalidConfigException {
        try {
            return MediaCodec.createEncoderByType(str);
        } catch (IOException | IllegalArgumentException e11) {
            throw new InvalidConfigException(e11);
        }
    }
}
