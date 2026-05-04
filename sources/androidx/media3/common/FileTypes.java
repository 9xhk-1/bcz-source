package androidx.media3.common;

import android.net.Uri;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.util.UnstableApi;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.List;
import java.util.Map;
import org.fusesource.jansi.Ansi;
import to.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class FileTypes {
    public static final int AC3 = 0;
    public static final int AC4 = 1;
    public static final int ADTS = 2;
    public static final int AMR = 3;
    public static final int AVI = 16;
    public static final int AVIF = 21;
    public static final int BMP = 19;
    private static final String EXTENSION_AAC = ".aac";
    private static final String EXTENSION_AC3 = ".ac3";
    private static final String EXTENSION_AC4 = ".ac4";
    private static final String EXTENSION_ADTS = ".adts";
    private static final String EXTENSION_AMR = ".amr";
    private static final String EXTENSION_AVI = ".avi";
    private static final String EXTENSION_AVIF = ".avif";
    private static final String EXTENSION_BMP = ".bmp";
    private static final String EXTENSION_DIB = ".dib";
    private static final String EXTENSION_EC3 = ".ec3";
    private static final String EXTENSION_FLAC = ".flac";
    private static final String EXTENSION_FLV = ".flv";
    private static final String EXTENSION_HEIC = ".heic";
    private static final String EXTENSION_HEIF = ".heif";
    private static final String EXTENSION_JPEG = ".jpeg";
    private static final String EXTENSION_JPG = ".jpg";
    private static final String EXTENSION_M2P = ".m2p";
    private static final String EXTENSION_MID = ".mid";
    private static final String EXTENSION_MIDI = ".midi";
    private static final String EXTENSION_MP3 = ".mp3";
    private static final String EXTENSION_MP4 = ".mp4";
    private static final String EXTENSION_MPEG = ".mpeg";
    private static final String EXTENSION_MPG = ".mpg";
    private static final String EXTENSION_OPUS = ".opus";
    private static final String EXTENSION_PNG = ".png";
    private static final String EXTENSION_PREFIX_CMF = ".cmf";
    private static final String EXTENSION_PREFIX_M4 = ".m4";
    private static final String EXTENSION_PREFIX_MK = ".mk";
    private static final String EXTENSION_PREFIX_MP4 = ".mp4";
    private static final String EXTENSION_PREFIX_OG = ".og";
    private static final String EXTENSION_PREFIX_TS = ".ts";
    private static final String EXTENSION_PS = ".ps";
    private static final String EXTENSION_SMF = ".smf";
    private static final String EXTENSION_TS = ".ts";
    private static final String EXTENSION_VTT = ".vtt";
    private static final String EXTENSION_WAV = ".wav";
    private static final String EXTENSION_WAVE = ".wave";
    private static final String EXTENSION_WEBM = ".webm";
    private static final String EXTENSION_WEBP = ".webp";
    private static final String EXTENSION_WEBVTT = ".webvtt";
    public static final int FLAC = 4;
    public static final int FLV = 5;

    @VisibleForTesting
    static final String HEADER_CONTENT_TYPE = "Content-Type";
    public static final int HEIF = 20;
    public static final int JPEG = 14;
    public static final int MATROSKA = 6;
    public static final int MIDI = 15;
    public static final int MP3 = 7;
    public static final int MP4 = 8;
    public static final int OGG = 9;
    public static final int PNG = 17;
    public static final int PS = 10;
    public static final int TS = 11;
    public static final int UNKNOWN = -1;
    public static final int WAV = 12;
    public static final int WEBP = 18;
    public static final int WEBVTT = 13;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface Type {
    }

    private FileTypes() {
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int inferFileTypeFromMimeType(@Nullable String str) {
        char c11;
        if (str == null) {
            return -1;
        }
        String normalizeMimeType = MimeTypes.normalizeMimeType(str);
        normalizeMimeType.getClass();
        switch (normalizeMimeType.hashCode()) {
            case -2123537834:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_E_AC3_JOC)) {
                    c11 = 0;
                    break;
                }
                c11 = 65535;
                break;
            case -1662384011:
                if (normalizeMimeType.equals(MimeTypes.VIDEO_PS)) {
                    c11 = 1;
                    break;
                }
                c11 = 65535;
                break;
            case -1662384007:
                if (normalizeMimeType.equals(MimeTypes.VIDEO_MP2T)) {
                    c11 = 2;
                    break;
                }
                c11 = 65535;
                break;
            case -1662095187:
                if (normalizeMimeType.equals("video/webm")) {
                    c11 = 3;
                    break;
                }
                c11 = 65535;
                break;
            case -1606874997:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_AMR_WB)) {
                    c11 = 4;
                    break;
                }
                c11 = 65535;
                break;
            case -1487656890:
                if (normalizeMimeType.equals(MimeTypes.IMAGE_AVIF)) {
                    c11 = 5;
                    break;
                }
                c11 = 65535;
                break;
            case -1487464693:
                if (normalizeMimeType.equals("image/heic")) {
                    c11 = 6;
                    break;
                }
                c11 = 65535;
                break;
            case -1487464690:
                if (normalizeMimeType.equals("image/heif")) {
                    c11 = 7;
                    break;
                }
                c11 = 65535;
                break;
            case -1487394660:
                if (normalizeMimeType.equals("image/jpeg")) {
                    c11 = '\b';
                    break;
                }
                c11 = 65535;
                break;
            case -1487018032:
                if (normalizeMimeType.equals("image/webp")) {
                    c11 = '\t';
                    break;
                }
                c11 = 65535;
                break;
            case -1248337486:
                if (normalizeMimeType.equals(MimeTypes.APPLICATION_MP4)) {
                    c11 = '\n';
                    break;
                }
                c11 = 65535;
                break;
            case -1079884372:
                if (normalizeMimeType.equals(MimeTypes.VIDEO_AVI)) {
                    c11 = 11;
                    break;
                }
                c11 = 65535;
                break;
            case -1004728940:
                if (normalizeMimeType.equals(MimeTypes.TEXT_VTT)) {
                    c11 = '\f';
                    break;
                }
                c11 = 65535;
                break;
            case -879272239:
                if (normalizeMimeType.equals(MimeTypes.IMAGE_BMP)) {
                    c11 = '\r';
                    break;
                }
                c11 = 65535;
                break;
            case -879258763:
                if (normalizeMimeType.equals(MimeTypes.IMAGE_PNG)) {
                    c11 = 14;
                    break;
                }
                c11 = 65535;
                break;
            case -387023398:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_MATROSKA)) {
                    c11 = 15;
                    break;
                }
                c11 = 65535;
                break;
            case -43467528:
                if (normalizeMimeType.equals(MimeTypes.APPLICATION_WEBM)) {
                    c11 = 16;
                    break;
                }
                c11 = 65535;
                break;
            case 13915911:
                if (normalizeMimeType.equals(MimeTypes.VIDEO_FLV)) {
                    c11 = 17;
                    break;
                }
                c11 = 65535;
                break;
            case 187078296:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_AC3)) {
                    c11 = 18;
                    break;
                }
                c11 = 65535;
                break;
            case 187078297:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_AC4)) {
                    c11 = 19;
                    break;
                }
                c11 = 65535;
                break;
            case 187078669:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_AMR)) {
                    c11 = 20;
                    break;
                }
                c11 = 65535;
                break;
            case 187090232:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_MP4)) {
                    c11 = 21;
                    break;
                }
                c11 = 65535;
                break;
            case 187091926:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_OGG)) {
                    c11 = 22;
                    break;
                }
                c11 = 65535;
                break;
            case 187099443:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_WAV)) {
                    c11 = 23;
                    break;
                }
                c11 = 65535;
                break;
            case 1331848029:
                if (normalizeMimeType.equals(MimeTypes.VIDEO_MP4)) {
                    c11 = 24;
                    break;
                }
                c11 = 65535;
                break;
            case 1503095341:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_AMR_NB)) {
                    c11 = 25;
                    break;
                }
                c11 = 65535;
                break;
            case 1504578661:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_E_AC3)) {
                    c11 = 26;
                    break;
                }
                c11 = 65535;
                break;
            case 1504619009:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_FLAC)) {
                    c11 = Ansi.f77778c;
                    break;
                }
                c11 = 65535;
                break;
            case 1504824762:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_MIDI)) {
                    c11 = sp.b.f88892n;
                    break;
                }
                c11 = 65535;
                break;
            case 1504831518:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_MPEG)) {
                    c11 = sp.b.f88893o;
                    break;
                }
                c11 = 65535;
                break;
            case 1505118770:
                if (normalizeMimeType.equals(MimeTypes.AUDIO_WEBM)) {
                    c11 = sp.b.f88894p;
                    break;
                }
                c11 = 65535;
                break;
            case 2039520277:
                if (normalizeMimeType.equals(MimeTypes.VIDEO_MATROSKA)) {
                    c11 = c.f90845b;
                    break;
                }
                c11 = 65535;
                break;
            default:
                c11 = 65535;
                break;
        }
        switch (c11) {
        }
        return -1;
    }

    public static int inferFileTypeFromResponseHeaders(Map<String, List<String>> map) {
        List<String> list = map.get("Content-Type");
        return inferFileTypeFromMimeType((list == null || list.isEmpty()) ? null : list.get(0));
    }

    public static int inferFileTypeFromUri(Uri uri) {
        String lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment == null) {
            return -1;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC3) || lastPathSegment.endsWith(EXTENSION_EC3)) {
            return 0;
        }
        if (lastPathSegment.endsWith(EXTENSION_AC4)) {
            return 1;
        }
        if (lastPathSegment.endsWith(EXTENSION_ADTS) || lastPathSegment.endsWith(EXTENSION_AAC)) {
            return 2;
        }
        if (lastPathSegment.endsWith(EXTENSION_AMR)) {
            return 3;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLAC)) {
            return 4;
        }
        if (lastPathSegment.endsWith(EXTENSION_FLV)) {
            return 5;
        }
        if (lastPathSegment.endsWith(EXTENSION_MID) || lastPathSegment.endsWith(EXTENSION_MIDI) || lastPathSegment.endsWith(EXTENSION_SMF)) {
            return 15;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_MK, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_WEBM)) {
            return 6;
        }
        if (lastPathSegment.endsWith(EXTENSION_MP3)) {
            return 7;
        }
        if (lastPathSegment.endsWith(".mp4") || lastPathSegment.startsWith(EXTENSION_PREFIX_M4, lastPathSegment.length() - 4) || lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) || lastPathSegment.startsWith(EXTENSION_PREFIX_CMF, lastPathSegment.length() - 5)) {
            return 8;
        }
        if (lastPathSegment.startsWith(EXTENSION_PREFIX_OG, lastPathSegment.length() - 4) || lastPathSegment.endsWith(EXTENSION_OPUS)) {
            return 9;
        }
        if (lastPathSegment.endsWith(EXTENSION_PS) || lastPathSegment.endsWith(EXTENSION_MPEG) || lastPathSegment.endsWith(EXTENSION_MPG) || lastPathSegment.endsWith(EXTENSION_M2P)) {
            return 10;
        }
        if (lastPathSegment.endsWith(".ts") || lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
            return 11;
        }
        if (lastPathSegment.endsWith(EXTENSION_WAV) || lastPathSegment.endsWith(EXTENSION_WAVE)) {
            return 12;
        }
        if (lastPathSegment.endsWith(EXTENSION_VTT) || lastPathSegment.endsWith(EXTENSION_WEBVTT)) {
            return 13;
        }
        if (lastPathSegment.endsWith(".jpg") || lastPathSegment.endsWith(EXTENSION_JPEG)) {
            return 14;
        }
        if (lastPathSegment.endsWith(EXTENSION_AVI)) {
            return 16;
        }
        if (lastPathSegment.endsWith(".png")) {
            return 17;
        }
        if (lastPathSegment.endsWith(EXTENSION_WEBP)) {
            return 18;
        }
        if (lastPathSegment.endsWith(EXTENSION_BMP) || lastPathSegment.endsWith(EXTENSION_DIB)) {
            return 19;
        }
        if (lastPathSegment.endsWith(EXTENSION_HEIC) || lastPathSegment.endsWith(EXTENSION_HEIF)) {
            return 20;
        }
        return lastPathSegment.endsWith(EXTENSION_AVIF) ? 21 : -1;
    }
}
