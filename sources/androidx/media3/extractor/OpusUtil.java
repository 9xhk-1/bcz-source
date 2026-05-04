package androidx.media3.extractor;

import androidx.media3.common.C;
import androidx.media3.common.util.UnstableApi;
import com.huawei.hms.iap.entity.OrderStatusCode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public class OpusUtil {
    private static final int DEFAULT_SEEK_PRE_ROLL_SAMPLES = 3840;
    private static final int FULL_CODEC_INITIALIZATION_DATA_BUFFER_COUNT = 3;
    public static final int MAX_BYTES_PER_SECOND = 63750;
    public static final int SAMPLE_RATE = 48000;

    private OpusUtil() {
    }

    public static List<byte[]> buildInitializationData(byte[] bArr) {
        long sampleCountToNanoseconds = sampleCountToNanoseconds(getPreSkipSamples(bArr));
        long sampleCountToNanoseconds2 = sampleCountToNanoseconds(3840L);
        ArrayList arrayList = new ArrayList(3);
        arrayList.add(bArr);
        arrayList.add(buildNativeOrderByteArray(sampleCountToNanoseconds));
        arrayList.add(buildNativeOrderByteArray(sampleCountToNanoseconds2));
        return arrayList;
    }

    private static byte[] buildNativeOrderByteArray(long j11) {
        return ByteBuffer.allocate(8).order(ByteOrder.nativeOrder()).putLong(j11).array();
    }

    public static int getChannelCount(byte[] bArr) {
        return bArr[9] & 255;
    }

    private static long getPacketDurationUs(byte b11, byte b12) {
        int i11;
        int i12 = b11 & 255;
        int i13 = b11 & 3;
        if (i13 != 0) {
            i11 = 2;
            if (i13 != 1 && i13 != 2) {
                i11 = b12 & 63;
            }
        } else {
            i11 = 1;
        }
        int i14 = i12 >> 3;
        return i11 * (i14 >= 16 ? 2500 << r6 : i14 >= 12 ? 10000 << (i14 & 1) : (i14 & 3) == 3 ? OrderStatusCode.ORDER_STATE_CANCEL : 10000 << r6);
    }

    public static int getPreSkipSamples(byte[] bArr) {
        return (bArr[10] & 255) | ((bArr[11] & 255) << 8);
    }

    public static boolean needToDecodeOpusFrame(long j11, long j12) {
        return j11 - j12 <= sampleCountToNanoseconds(3840L) / 1000;
    }

    public static int parseOggPacketAudioSampleCount(ByteBuffer byteBuffer) {
        int parseOggPacketForPreAudioSampleByteCount = parseOggPacketForPreAudioSampleByteCount(byteBuffer);
        int i11 = byteBuffer.get(parseOggPacketForPreAudioSampleByteCount + 26) + ho.c.E + parseOggPacketForPreAudioSampleByteCount;
        return (int) ((getPacketDurationUs(byteBuffer.get(i11), byteBuffer.limit() - i11 > 1 ? byteBuffer.get(i11 + 1) : (byte) 0) * 48000) / 1000000);
    }

    public static int parseOggPacketForPreAudioSampleByteCount(ByteBuffer byteBuffer) {
        if ((byteBuffer.get(5) & 2) == 0) {
            return 0;
        }
        byte b11 = byteBuffer.get(26);
        int i11 = 28;
        int i12 = 28;
        for (int i13 = 0; i13 < b11; i13++) {
            i12 += byteBuffer.get(i13 + 27);
        }
        byte b12 = byteBuffer.get(i12 + 26);
        for (int i14 = 0; i14 < b12; i14++) {
            i11 += byteBuffer.get(i12 + 27 + i14);
        }
        return i12 + i11;
    }

    public static int parsePacketAudioSampleCount(ByteBuffer byteBuffer) {
        return (int) ((getPacketDurationUs(byteBuffer.get(0), byteBuffer.limit() > 1 ? byteBuffer.get(1) : (byte) 0) * 48000) / 1000000);
    }

    private static long sampleCountToNanoseconds(long j11) {
        return (j11 * C.NANOS_PER_SECOND) / 48000;
    }

    public static long getPacketDurationUs(byte[] bArr) {
        return getPacketDurationUs(bArr[0], bArr.length > 1 ? bArr[1] : (byte) 0);
    }
}
