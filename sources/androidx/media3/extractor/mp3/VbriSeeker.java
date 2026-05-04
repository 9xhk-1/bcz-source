package androidx.media3.extractor.mp3;

import androidx.annotation.Nullable;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.MpegAudioUtil;
import androidx.media3.extractor.SeekMap;
import androidx.media3.extractor.SeekPoint;
import org.junit.jupiter.api.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class VbriSeeker implements Seeker {
    private static final String TAG = "VbriSeeker";
    private final int bitrate;
    private final long dataEndPosition;
    private final long durationUs;
    private final long[] positions;
    private final long[] timesUs;

    private VbriSeeker(long[] jArr, long[] jArr2, long j11, long j12, int i11) {
        this.timesUs = jArr;
        this.positions = jArr2;
        this.durationUs = j11;
        this.dataEndPosition = j12;
        this.bitrate = i11;
    }

    @Nullable
    public static VbriSeeker create(long j11, long j12, MpegAudioUtil.Header header, ParsableByteArray parsableByteArray) {
        int readUnsignedByte;
        parsableByteArray.skipBytes(6);
        long readInt = j12 + header.frameSize + parsableByteArray.readInt();
        int readInt2 = parsableByteArray.readInt();
        if (readInt2 <= 0) {
            return null;
        }
        long sampleCountToDurationUs = Util.sampleCountToDurationUs((readInt2 * header.samplesPerFrame) - 1, header.sampleRate);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        long[] jArr = new long[readUnsignedShort];
        long[] jArr2 = new long[readUnsignedShort];
        int i11 = 0;
        long j13 = j12 + header.frameSize;
        while (i11 < readUnsignedShort) {
            long[] jArr3 = jArr;
            long[] jArr4 = jArr2;
            int i12 = i11;
            jArr3[i12] = (i11 * sampleCountToDurationUs) / readUnsignedShort;
            jArr4[i12] = j13;
            if (readUnsignedShort3 == 1) {
                readUnsignedByte = parsableByteArray.readUnsignedByte();
            } else if (readUnsignedShort3 == 2) {
                readUnsignedByte = parsableByteArray.readUnsignedShort();
            } else if (readUnsignedShort3 == 3) {
                readUnsignedByte = parsableByteArray.readUnsignedInt24();
            } else {
                if (readUnsignedShort3 != 4) {
                    return null;
                }
                readUnsignedByte = parsableByteArray.readUnsignedIntToInt();
            }
            j13 += readUnsignedByte * readUnsignedShort2;
            i11 = i12 + 1;
            jArr = jArr3;
            jArr2 = jArr4;
        }
        long[] jArr5 = jArr;
        long[] jArr6 = jArr2;
        if (j11 != -1 && j11 != readInt) {
            Log.w(TAG, "VBRI data size mismatch: " + j11 + j2.O + readInt);
        }
        if (readInt != j13) {
            Log.w(TAG, "VBRI bytes and ToC mismatch (using max): " + readInt + j2.O + j13 + "\nSeeking will be inaccurate.");
            readInt = Math.max(readInt, j13);
        }
        return new VbriSeeker(jArr5, jArr6, sampleCountToDurationUs, readInt, header.bitrate);
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public int getAverageBitrate() {
        return this.bitrate;
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getDataEndPosition() {
        return this.dataEndPosition;
    }

    @Override // androidx.media3.extractor.SeekMap
    public long getDurationUs() {
        return this.durationUs;
    }

    @Override // androidx.media3.extractor.SeekMap
    public SeekMap.SeekPoints getSeekPoints(long j11) {
        int binarySearchFloor = Util.binarySearchFloor(this.timesUs, j11, true, true);
        SeekPoint seekPoint = new SeekPoint(this.timesUs[binarySearchFloor], this.positions[binarySearchFloor]);
        if (seekPoint.timeUs >= j11 || binarySearchFloor == this.timesUs.length - 1) {
            return new SeekMap.SeekPoints(seekPoint);
        }
        int i11 = binarySearchFloor + 1;
        return new SeekMap.SeekPoints(seekPoint, new SeekPoint(this.timesUs[i11], this.positions[i11]));
    }

    @Override // androidx.media3.extractor.mp3.Seeker
    public long getTimeUs(long j11) {
        return this.timesUs[Util.binarySearchFloor(this.positions, j11, true, true)];
    }

    @Override // androidx.media3.extractor.SeekMap
    public boolean isSeekable() {
        return true;
    }
}
