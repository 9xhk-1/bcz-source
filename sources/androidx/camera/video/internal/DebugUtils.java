package androidx.camera.video.internal;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.camera.core.Logger;
import androidx.camera.video.internal.compat.Api28Impl;
import androidx.camera.video.internal.compat.Api31Impl;
import androidx.core.util.Preconditions;
import com.tencent.ijk.media.player.misc.IMediaFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.junit.jupiter.api.j2;
import pn.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class DebugUtils {
    private static final String AUDIO_CAPS_PREFIX = "[AudioCaps] ";
    private static final String CODEC_CAPS_PREFIX = "[CodecCaps] ";
    private static final String ENCODER_CAPS_PREFIX = "[EncoderCaps] ";
    private static final String TAG = "DebugUtils";
    private static final String VIDEO_CAPS_PREFIX = "[VideoCaps] ";

    private DebugUtils() {
    }

    private static void dumpAudioCapabilities(@NonNull StringBuilder sb2, @NonNull MediaCodecInfo.AudioCapabilities audioCapabilities, @NonNull MediaFormat mediaFormat) {
        logToString(sb2, "[AudioCaps] getBitrateRange = " + audioCapabilities.getBitrateRange());
        logToString(sb2, "[AudioCaps] getMaxInputChannelCount = " + audioCapabilities.getMaxInputChannelCount());
        if (Build.VERSION.SDK_INT >= 31) {
            logToString(sb2, "[AudioCaps] getMinInputChannelCount = " + Api31Impl.getMinInputChannelCount(audioCapabilities));
            logToString(sb2, "[AudioCaps] getInputChannelCountRanges = " + Arrays.toString(Api31Impl.getInputChannelCountRanges(audioCapabilities)));
        }
        logToString(sb2, "[AudioCaps] getSupportedSampleRateRanges = " + Arrays.toString(audioCapabilities.getSupportedSampleRateRanges()));
        logToString(sb2, "[AudioCaps] getSupportedSampleRates = " + Arrays.toString(audioCapabilities.getSupportedSampleRates()));
        try {
            int integer = mediaFormat.getInteger("sample-rate");
            logToString(sb2, "[AudioCaps] isSampleRateSupported for " + integer + " = " + audioCapabilities.isSampleRateSupported(integer));
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb2, "[AudioCaps] mediaFormat does not contain sample rate");
        }
    }

    @NonNull
    public static String dumpCodecCapabilities(@NonNull String str, @NonNull MediaCodec mediaCodec, @NonNull MediaFormat mediaFormat) {
        StringBuilder sb2 = new StringBuilder();
        try {
            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodec.getCodecInfo().getCapabilitiesForType(str);
            Preconditions.checkArgument(capabilitiesForType != null);
            dumpCodecCapabilities(sb2, capabilitiesForType, mediaFormat);
        } catch (IllegalArgumentException unused) {
            logToString(sb2, "[" + mediaCodec.getName() + "] does not support mime " + str);
        }
        return sb2.toString();
    }

    private static void dumpEncoderCapabilities(@NonNull StringBuilder sb2, @NonNull MediaCodecInfo.EncoderCapabilities encoderCapabilities, @NonNull MediaFormat mediaFormat) {
        logToString(sb2, "[EncoderCaps] getComplexityRange = " + encoderCapabilities.getComplexityRange());
        if (Build.VERSION.SDK_INT >= 28) {
            logToString(sb2, "[EncoderCaps] getQualityRange = " + Api28Impl.getQualityRange(encoderCapabilities));
        }
        try {
            logToString(sb2, "[EncoderCaps] isBitrateModeSupported = " + encoderCapabilities.isBitrateModeSupported(mediaFormat.getInteger("bitrate-mode")));
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb2, "[EncoderCaps] mediaFormat does not contain bitrate mode");
        }
    }

    @NonNull
    public static String dumpMediaCodecListForFormat(@NonNull MediaCodecList mediaCodecList, @NonNull MediaFormat mediaFormat) {
        StringBuilder sb2 = new StringBuilder();
        logToString(sb2, "[Start] Dump MediaCodecList for mediaFormat " + mediaFormat);
        String string = mediaFormat.getString(IMediaFormat.KEY_MIME);
        for (MediaCodecInfo mediaCodecInfo : mediaCodecList.getCodecInfos()) {
            if (mediaCodecInfo.isEncoder()) {
                boolean z11 = true;
                try {
                    Preconditions.checkArgument(string != null);
                    MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string);
                    if (capabilitiesForType == null) {
                        z11 = false;
                    }
                    Preconditions.checkArgument(z11);
                    logToString(sb2, "[Start] [" + mediaCodecInfo.getName() + "]");
                    dumpCodecCapabilities(sb2, capabilitiesForType, mediaFormat);
                    logToString(sb2, "[End] [" + mediaCodecInfo.getName() + "]");
                } catch (IllegalArgumentException unused) {
                    logToString(sb2, "[" + mediaCodecInfo.getName() + "] does not support mime " + string);
                }
            }
        }
        logToString(sb2, "[End] Dump MediaCodecList");
        String sb3 = sb2.toString();
        stringToLog(sb3);
        return sb3;
    }

    private static void dumpVideoCapabilities(@NonNull StringBuilder sb2, @NonNull MediaCodecInfo.VideoCapabilities videoCapabilities, @NonNull MediaFormat mediaFormat) {
        int i11;
        int i12;
        boolean z11;
        logToString(sb2, "[VideoCaps] getBitrateRange = " + videoCapabilities.getBitrateRange());
        logToString(sb2, "[VideoCaps] getSupportedWidths = " + videoCapabilities.getSupportedWidths() + ", getWidthAlignment = " + videoCapabilities.getWidthAlignment());
        logToString(sb2, "[VideoCaps] getSupportedHeights = " + videoCapabilities.getSupportedHeights() + ", getHeightAlignment = " + videoCapabilities.getHeightAlignment());
        int i13 = 0;
        boolean z12 = true;
        try {
            i11 = mediaFormat.getInteger("width");
            i12 = mediaFormat.getInteger("height");
            Preconditions.checkArgument(i11 > 0 && i12 > 0);
            z11 = true;
        } catch (IllegalArgumentException | NullPointerException unused) {
            logToString(sb2, "[VideoCaps] mediaFormat does not contain valid width and height");
            i11 = 0;
            i12 = 0;
            z11 = false;
        }
        if (z11) {
            try {
                logToString(sb2, "[VideoCaps] getSupportedHeightsFor " + i11 + " = " + videoCapabilities.getSupportedHeightsFor(i11));
            } catch (IllegalArgumentException unused2) {
                logToString(sb2, "[VideoCaps] could not getSupportedHeightsFor " + i11);
            }
            try {
                logToString(sb2, "[VideoCaps] getSupportedWidthsFor " + i12 + " = " + videoCapabilities.getSupportedWidthsFor(i12));
            } catch (IllegalArgumentException unused3) {
                logToString(sb2, "[VideoCaps] could not getSupportedWidthsFor " + i12);
            }
            logToString(sb2, "[VideoCaps] isSizeSupported for " + i11 + "x" + i12 + " = " + videoCapabilities.isSizeSupported(i11, i12));
        }
        logToString(sb2, "[VideoCaps] getSupportedFrameRates = " + videoCapabilities.getSupportedFrameRates());
        try {
            int integer = mediaFormat.getInteger("frame-rate");
            if (integer <= 0) {
                z12 = false;
            }
            Preconditions.checkArgument(z12);
            i13 = integer;
        } catch (IllegalArgumentException | NullPointerException unused4) {
            logToString(sb2, "[VideoCaps] mediaFormat does not contain frame rate");
        }
        if (z11) {
            logToString(sb2, "[VideoCaps] getSupportedFrameRatesFor " + i11 + "x" + i12 + " = " + videoCapabilities.getSupportedFrameRatesFor(i11, i12));
        }
        if (!z11 || i13 <= 0) {
            return;
        }
        logToString(sb2, "[VideoCaps] areSizeAndRateSupported for " + i11 + "x" + i12 + j2.O + i13 + " = " + videoCapabilities.areSizeAndRateSupported(i11, i12, i13));
    }

    private static String formatInterval(long j11) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long hours = timeUnit.toHours(j11);
        TimeUnit timeUnit2 = TimeUnit.HOURS;
        long minutes = timeUnit.toMinutes(j11 - timeUnit2.toMillis(hours));
        long millis = j11 - timeUnit2.toMillis(hours);
        TimeUnit timeUnit3 = TimeUnit.MINUTES;
        long seconds = timeUnit.toSeconds(millis - timeUnit3.toMillis(minutes));
        return String.format(Locale.US, "%02d:%02d:%02d.%03d", Long.valueOf(hours), Long.valueOf(minutes), Long.valueOf(seconds), Long.valueOf(((j11 - timeUnit2.toMillis(hours)) - timeUnit3.toMillis(minutes)) - TimeUnit.SECONDS.toMillis(seconds)));
    }

    private static void logToString(@NonNull StringBuilder sb2, @NonNull String str) {
        sb2.append(str);
        sb2.append("\n");
    }

    @NonNull
    public static String readableBufferInfo(@NonNull MediaCodec.BufferInfo bufferInfo) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Dump BufferInfo: " + bufferInfo.toString() + "\n");
        sb2.append("\toffset: " + bufferInfo.offset + "\n");
        sb2.append("\tsize: " + bufferInfo.size + "\n");
        StringBuilder sb3 = new StringBuilder();
        sb3.append("\tflag: ");
        sb3.append(bufferInfo.flags);
        sb2.append(sb3.toString());
        ArrayList arrayList = new ArrayList();
        if ((bufferInfo.flags & 4) != 0) {
            arrayList.add("EOS");
        }
        if ((bufferInfo.flags & 2) != 0) {
            arrayList.add("CODEC_CONFIG");
        }
        if ((bufferInfo.flags & 1) != 0) {
            arrayList.add("KEY_FRAME");
        }
        if ((bufferInfo.flags & 8) != 0) {
            arrayList.add("PARTIAL_FRAME");
        }
        if (!arrayList.isEmpty()) {
            sb2.append(" (");
            sb2.append(TextUtils.join(" | ", arrayList));
            sb2.append(j.f81007d);
        }
        sb2.append("\n");
        sb2.append("\tpresentationTime: " + bufferInfo.presentationTimeUs + " (" + readableUs(bufferInfo.presentationTimeUs) + ")\n");
        return sb2.toString();
    }

    @NonNull
    public static String readableMs(long j11) {
        return formatInterval(j11);
    }

    @NonNull
    public static String readableUs(long j11) {
        return readableMs(TimeUnit.MICROSECONDS.toMillis(j11));
    }

    private static void stringToLog(@NonNull String str) {
        if (Logger.isInfoEnabled(TAG)) {
            Scanner scanner = new Scanner(str);
            while (scanner.hasNextLine()) {
                Logger.i(TAG, scanner.nextLine());
            }
        }
    }

    @NonNull
    private static String toString(@Nullable MediaCodecInfo.CodecProfileLevel codecProfileLevel) {
        return codecProfileLevel == null ? "null" : String.format("{level=%d, profile=%d}", Integer.valueOf(codecProfileLevel.level), Integer.valueOf(codecProfileLevel.profile));
    }

    private static void dumpCodecCapabilities(@NonNull StringBuilder sb2, @NonNull MediaCodecInfo.CodecCapabilities codecCapabilities, @NonNull MediaFormat mediaFormat) {
        try {
            logToString(sb2, "[CodecCaps] isFormatSupported = " + codecCapabilities.isFormatSupported(mediaFormat));
        } catch (ClassCastException unused) {
            logToString(sb2, "[CodecCaps] isFormatSupported=false");
        }
        logToString(sb2, "[CodecCaps] getDefaultFormat = " + codecCapabilities.getDefaultFormat());
        if (codecCapabilities.profileLevels != null) {
            StringBuilder sb3 = new StringBuilder("[");
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecCapabilities.profileLevels) {
                arrayList.add(toString(codecProfileLevel));
            }
            sb3.append(TextUtils.join(j2.O, arrayList));
            sb3.append("]");
            logToString(sb2, "[CodecCaps] profileLevels = " + ((Object) sb3));
        }
        if (codecCapabilities.colorFormats != null) {
            logToString(sb2, "[CodecCaps] colorFormats = " + Arrays.toString(codecCapabilities.colorFormats));
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities != null) {
            dumpVideoCapabilities(sb2, videoCapabilities, mediaFormat);
        }
        MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
        if (audioCapabilities != null) {
            dumpAudioCapabilities(sb2, audioCapabilities, mediaFormat);
        }
        MediaCodecInfo.EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
        if (encoderCapabilities != null) {
            dumpEncoderCapabilities(sb2, encoderCapabilities, mediaFormat);
        }
    }
}
