package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class XingFrame {
    public final long dataSize;
    public final int encoderDelay;
    public final int encoderPadding;
    public final long frameCount;
    public final MpegAudioUtil.Header header;

    @Nullable
    public final long[] tableOfContents;

    private XingFrame(MpegAudioUtil.Header header, long j11, long j12, @Nullable long[] jArr, int i11, int i12) {
        this.header = new MpegAudioUtil.Header(header);
        this.frameCount = j11;
        this.dataSize = j12;
        this.tableOfContents = jArr;
        this.encoderDelay = i11;
        this.encoderPadding = i12;
    }

    public static XingFrame parse(MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        long[] jArr;
        int i11;
        int i12;
        int readInt = parsableByteArray.readInt();
        int readUnsignedIntToInt = (readInt & 1) != 0 ? parsableByteArray.readUnsignedIntToInt() : -1;
        long readUnsignedInt = (readInt & 2) != 0 ? parsableByteArray.readUnsignedInt() : -1L;
        if ((readInt & 4) == 4) {
            jArr = new long[100];
            for (int i13 = 0; i13 < 100; i13++) {
                jArr[i13] = parsableByteArray.readUnsignedByte();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((readInt & 8) != 0) {
            parsableByteArray.skipBytes(4);
        }
        if (parsableByteArray.bytesLeft() >= 24) {
            parsableByteArray.skipBytes(21);
            int readUnsignedInt24 = parsableByteArray.readUnsignedInt24();
            i12 = readUnsignedInt24 & 4095;
            i11 = (16773120 & readUnsignedInt24) >> 12;
        } else {
            i11 = -1;
            i12 = -1;
        }
        return new XingFrame(header, readUnsignedIntToInt, readUnsignedInt, jArr2, i11, i12);
    }

    public long computeDurationUs() {
        long j11 = this.frameCount;
        if (j11 == -1 || j11 == 0) {
            return C.TIME_UNSET;
        }
        return Util.sampleCountToDurationUs((j11 * r2.samplesPerFrame) - 1, this.header.sampleRate);
    }
}
