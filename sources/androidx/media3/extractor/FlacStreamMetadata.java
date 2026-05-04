package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class FlacStreamMetadata {
    public static final int NOT_IN_LOOKUP_TABLE = -1;
    private static final String TAG = "FlacStreamMetadata";
    public final int bitsPerSample;
    public final int bitsPerSampleLookupKey;
    public final int channels;
    public final int maxBlockSizeSamples;
    public final int maxFrameSize;

    @Nullable
    private final Metadata metadata;
    public final int minBlockSizeSamples;
    public final int minFrameSize;
    public final int sampleRate;
    public final int sampleRateLookupKey;

    @Nullable
    public final SeekTable seekTable;
    public final long totalSamples;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SeekTable {
        public final long[] pointOffsets;
        public final long[] pointSampleNumbers;

        public SeekTable(long[] jArr, long[] jArr2) {
            this.pointSampleNumbers = jArr;
            this.pointOffsets = jArr2;
        }
    }

    public FlacStreamMetadata(byte[] bArr, int i11) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.setPosition(i11 * 8);
        this.minBlockSizeSamples = parsableBitArray.readBits(16);
        this.maxBlockSizeSamples = parsableBitArray.readBits(16);
        this.minFrameSize = parsableBitArray.readBits(24);
        this.maxFrameSize = parsableBitArray.readBits(24);
        int readBits = parsableBitArray.readBits(20);
        this.sampleRate = readBits;
        this.sampleRateLookupKey = getSampleRateLookupKey(readBits);
        this.channels = parsableBitArray.readBits(3) + 1;
        int readBits2 = parsableBitArray.readBits(5) + 1;
        this.bitsPerSample = readBits2;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(readBits2);
        this.totalSamples = parsableBitArray.readBitsToLong(36);
        this.seekTable = null;
        this.metadata = null;
    }

    @Nullable
    private static Metadata concatenateVorbisMetadata(List<String> list, List<PictureFrame> list2) {
        Metadata parseVorbisComments = VorbisUtil.parseVorbisComments(list);
        if (parseVorbisComments == null && list2.isEmpty()) {
            return null;
        }
        return new Metadata(list2).copyWithAppendedEntriesFrom(parseVorbisComments);
    }

    private static int getBitsPerSampleLookupKey(int i11) {
        if (i11 == 8) {
            return 1;
        }
        if (i11 == 12) {
            return 2;
        }
        if (i11 == 16) {
            return 4;
        }
        if (i11 == 20) {
            return 5;
        }
        if (i11 != 24) {
            return i11 != 32 ? -1 : 7;
        }
        return 6;
    }

    private static int getSampleRateLookupKey(int i11) {
        switch (i11) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case 24000:
                return 7;
            case 32000:
                return 8;
            case 44100:
                return 9;
            case 48000:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public FlacStreamMetadata copyWithPictureFrames(List<PictureFrame> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(new Metadata(list)));
    }

    public FlacStreamMetadata copyWithSeekTable(@Nullable SeekTable seekTable) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, seekTable, this.metadata);
    }

    public FlacStreamMetadata copyWithVorbisComments(List<String> list) {
        return new FlacStreamMetadata(this.minBlockSizeSamples, this.maxBlockSizeSamples, this.minFrameSize, this.maxFrameSize, this.sampleRate, this.channels, this.bitsPerSample, this.totalSamples, this.seekTable, getMetadataCopyWithAppendedEntriesFrom(VorbisUtil.parseVorbisComments(list)));
    }

    public long getApproxBytesPerFrame() {
        long j11;
        long j12;
        int i11 = this.maxFrameSize;
        if (i11 > 0) {
            j11 = (i11 + this.minFrameSize) / 2;
            j12 = 1;
        } else {
            int i12 = this.minBlockSizeSamples;
            j11 = ((((i12 != this.maxBlockSizeSamples || i12 <= 0) ? 4096L : i12) * this.channels) * this.bitsPerSample) / 8;
            j12 = 64;
        }
        return j11 + j12;
    }

    public int getDecodedBitrate() {
        return this.bitsPerSample * this.sampleRate * this.channels;
    }

    public long getDurationUs() {
        long j11 = this.totalSamples;
        return j11 == 0 ? C.TIME_UNSET : (j11 * 1000000) / this.sampleRate;
    }

    public Format getFormat(byte[] bArr, @Nullable Metadata metadata) {
        bArr[4] = Byte.MIN_VALUE;
        int i11 = this.maxFrameSize;
        if (i11 <= 0) {
            i11 = -1;
        }
        return new Format.Builder().setSampleMimeType(MimeTypes.AUDIO_FLAC).setMaxInputSize(i11).setChannelCount(this.channels).setSampleRate(this.sampleRate).setPcmEncoding(Util.getPcmEncoding(this.bitsPerSample)).setInitializationData(Collections.singletonList(bArr)).setMetadata(getMetadataCopyWithAppendedEntriesFrom(metadata)).build();
    }

    public int getMaxDecodedFrameSize() {
        return this.maxBlockSizeSamples * this.channels * (this.bitsPerSample / 8);
    }

    @Nullable
    public Metadata getMetadataCopyWithAppendedEntriesFrom(@Nullable Metadata metadata) {
        Metadata metadata2 = this.metadata;
        return metadata2 == null ? metadata : metadata2.copyWithAppendedEntriesFrom(metadata);
    }

    public long getSampleNumber(long j11) {
        return Util.constrainValue((j11 * this.sampleRate) / 1000000, 0L, this.totalSamples - 1);
    }

    public FlacStreamMetadata(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, ArrayList<String> arrayList, ArrayList<PictureFrame> arrayList2) {
        this(i11, i12, i13, i14, i15, i16, i17, j11, (SeekTable) null, concatenateVorbisMetadata(arrayList, arrayList2));
    }

    private FlacStreamMetadata(int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j11, @Nullable SeekTable seekTable, @Nullable Metadata metadata) {
        this.minBlockSizeSamples = i11;
        this.maxBlockSizeSamples = i12;
        this.minFrameSize = i13;
        this.maxFrameSize = i14;
        this.sampleRate = i15;
        this.sampleRateLookupKey = getSampleRateLookupKey(i15);
        this.channels = i16;
        this.bitsPerSample = i17;
        this.bitsPerSampleLookupKey = getBitsPerSampleLookupKey(i17);
        this.totalSamples = j11;
        this.seekTable = seekTable;
        this.metadata = metadata;
    }
}
