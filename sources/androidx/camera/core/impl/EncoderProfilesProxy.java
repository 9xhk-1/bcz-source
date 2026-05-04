package androidx.camera.core.impl;

import androidx.annotation.NonNull;
import androidx.media3.common.MimeTypes;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface EncoderProfilesProxy {
    public static final int CODEC_PROFILE_NONE = -1;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class AudioProfileProxy {
        public static final String MEDIA_TYPE_NONE = "audio/none";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        public @interface AudioEncoder {
        }

        @NonNull
        public static AudioProfileProxy create(int i11, @NonNull String str, int i12, int i13, int i14, int i15) {
            return new AutoValue_EncoderProfilesProxy_AudioProfileProxy(i11, str, i12, i13, i14, i15);
        }

        public abstract int getBitrate();

        public abstract int getChannels();

        public abstract int getCodec();

        @NonNull
        public abstract String getMediaType();

        public abstract int getProfile();

        public abstract int getSampleRate();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class ImmutableEncoderProfilesProxy implements EncoderProfilesProxy {
        @NonNull
        public static ImmutableEncoderProfilesProxy create(int i11, int i12, @NonNull List<AudioProfileProxy> list, @NonNull List<VideoProfileProxy> list2) {
            return new AutoValue_EncoderProfilesProxy_ImmutableEncoderProfilesProxy(i11, i12, Collections.unmodifiableList(new ArrayList(list)), Collections.unmodifiableList(new ArrayList(list2)));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @eo.c
    public static abstract class VideoProfileProxy {
        public static final int BIT_DEPTH_10 = 10;
        public static final int BIT_DEPTH_8 = 8;
        public static final String MEDIA_TYPE_NONE = "video/none";

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @Retention(RetentionPolicy.SOURCE)
        public @interface VideoEncoder {
        }

        @NonNull
        public static VideoProfileProxy create(int i11, @NonNull String str, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            return new AutoValue_EncoderProfilesProxy_VideoProfileProxy(i11, str, i12, i13, i14, i15, i16, i17, i18, i19);
        }

        public abstract int getBitDepth();

        public abstract int getBitrate();

        public abstract int getChromaSubsampling();

        public abstract int getCodec();

        public abstract int getFrameRate();

        public abstract int getHdrFormat();

        public abstract int getHeight();

        @NonNull
        public abstract String getMediaType();

        public abstract int getProfile();

        public abstract int getWidth();
    }

    @NonNull
    static String getAudioCodecMimeType(int i11) {
        switch (i11) {
            case 1:
                return MimeTypes.AUDIO_AMR_NB;
            case 2:
                return MimeTypes.AUDIO_AMR_WB;
            case 3:
            case 4:
            case 5:
                return MimeTypes.AUDIO_AAC;
            case 6:
                return MimeTypes.AUDIO_VORBIS;
            case 7:
                return MimeTypes.AUDIO_OPUS;
            default:
                return AudioProfileProxy.MEDIA_TYPE_NONE;
        }
    }

    static int getRequiredAudioProfile(int i11) {
        if (i11 == 3) {
            return 2;
        }
        if (i11 != 4) {
            return i11 != 5 ? -1 : 39;
        }
        return 5;
    }

    @NonNull
    static String getVideoCodecMimeType(int i11) {
        switch (i11) {
            case 1:
                return MimeTypes.VIDEO_H263;
            case 2:
                return MimeTypes.VIDEO_H264;
            case 3:
                return MimeTypes.VIDEO_MP4V;
            case 4:
                return MimeTypes.VIDEO_VP8;
            case 5:
                return MimeTypes.VIDEO_H265;
            case 6:
                return MimeTypes.VIDEO_VP9;
            case 7:
                return MimeTypes.VIDEO_DOLBY_VISION;
            case 8:
                return MimeTypes.VIDEO_AV1;
            default:
                return VideoProfileProxy.MEDIA_TYPE_NONE;
        }
    }

    @NonNull
    List<AudioProfileProxy> getAudioProfiles();

    int getDefaultDurationSeconds();

    int getRecommendedFileFormat();

    @NonNull
    List<VideoProfileProxy> getVideoProfiles();
}
