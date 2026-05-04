package androidx.media3.extractor.mp4;

import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.collection.SieveCacheKt;
import androidx.media3.common.C;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.DrmInitData;
import androidx.media3.common.Format;
import androidx.media3.common.Metadata;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.container.MdtaMetadataEntry;
import androidx.media3.container.Mp4AlternateGroupData;
import androidx.media3.container.Mp4Box;
import androidx.media3.container.Mp4LocationData;
import androidx.media3.container.Mp4TimestampData;
import androidx.media3.container.NalUnitUtil;
import androidx.media3.extractor.AacUtil;
import androidx.media3.extractor.Ac3Util;
import androidx.media3.extractor.Ac4Util;
import androidx.media3.extractor.AvcConfig;
import androidx.media3.extractor.DolbyVisionConfig;
import androidx.media3.extractor.ExtractorUtil;
import androidx.media3.extractor.GaplessInfoHolder;
import androidx.media3.extractor.HevcConfig;
import androidx.media3.extractor.OpusUtil;
import androidx.media3.extractor.VorbisUtil;
import androidx.media3.extractor.mp4.FixedSampleSizeRechunker;
import com.google.common.collect.ImmutableList;
import ho.r;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import ro.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class BoxParser {
    private static final int MAX_GAPLESS_TRIM_SIZE_SAMPLES = 4;
    private static final int SAMPLE_RATE_AMR_NB = 8000;
    private static final int SAMPLE_RATE_AMR_WB = 16000;
    private static final String TAG = "BoxParsers";
    private static final int TYPE_clcp = 1668047728;
    private static final int TYPE_mdta = 1835299937;
    private static final int TYPE_meta = 1835365473;
    private static final int TYPE_nclc = 1852009571;
    private static final int TYPE_nclx = 1852009592;
    private static final int TYPE_sbtl = 1935832172;
    private static final int TYPE_soun = 1936684398;
    private static final int TYPE_subt = 1937072756;
    private static final int TYPE_text = 1952807028;
    private static final int TYPE_vide = 1986618469;
    private static final byte[] opusMagic = Util.getUtf8Bytes("OpusHead");

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class BtrtData {
        private final long avgBitrate;
        private final long maxBitrate;

        public BtrtData(long j11, long j12) {
            this.avgBitrate = j11;
            this.maxBitrate = j12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ChunkIterator {
        private final ParsableByteArray chunkOffsets;
        private final boolean chunkOffsetsAreLongs;
        public int index;
        public final int length;
        private int nextSamplesPerChunkChangeIndex;
        public int numSamples;
        public long offset;
        private int remainingSamplesPerChunkChanges;
        private final ParsableByteArray stsc;

        public ChunkIterator(ParsableByteArray parsableByteArray, ParsableByteArray parsableByteArray2, boolean z11) throws ParserException {
            this.stsc = parsableByteArray;
            this.chunkOffsets = parsableByteArray2;
            this.chunkOffsetsAreLongs = z11;
            parsableByteArray2.setPosition(12);
            this.length = parsableByteArray2.readUnsignedIntToInt();
            parsableByteArray.setPosition(12);
            this.remainingSamplesPerChunkChanges = parsableByteArray.readUnsignedIntToInt();
            ExtractorUtil.checkContainerInput(parsableByteArray.readInt() == 1, "first_chunk must be 1");
            this.index = -1;
        }

        public boolean moveNext() {
            int i11 = this.index + 1;
            this.index = i11;
            if (i11 == this.length) {
                return false;
            }
            this.offset = this.chunkOffsetsAreLongs ? this.chunkOffsets.readUnsignedLongToLong() : this.chunkOffsets.readUnsignedInt();
            if (this.index == this.nextSamplesPerChunkChangeIndex) {
                this.numSamples = this.stsc.readUnsignedIntToInt();
                this.stsc.skipBytes(4);
                int i12 = this.remainingSamplesPerChunkChanges - 1;
                this.remainingSamplesPerChunkChanges = i12;
                this.nextSamplesPerChunkChangeIndex = i12 > 0 ? this.stsc.readUnsignedIntToInt() - 1 : -1;
            }
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EsdsData {
        private final long bitrate;
        private final byte[] initializationData;
        private final String mimeType;
        private final long peakBitrate;

        public EsdsData(String str, byte[] bArr, long j11, long j12) {
            this.mimeType = str;
            this.initializationData = bArr;
            this.bitrate = j11;
            this.peakBitrate = j12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class EyesData {
        private final StriData striData;

        public EyesData(StriData striData) {
            this.striData = striData;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class MdhdData {

        @Nullable
        private final String language;
        private final long mediaDurationUs;
        private final long timescale;

        public MdhdData(long j11, long j12, @Nullable String str) {
            this.timescale = j11;
            this.mediaDurationUs = j12;
            this.language = str;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface SampleSizeBox {
        int getFixedSampleSize();

        int getSampleCount();

        int readNextSampleSize();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StriData {
        private final boolean eyeViewsReversed;
        private final boolean hasLeftEyeView;
        private final boolean hasRightEyeView;

        public StriData(boolean z11, boolean z12, boolean z13) {
            this.hasLeftEyeView = z11;
            this.hasRightEyeView = z12;
            this.eyeViewsReversed = z13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StsdData {
        public static final int STSD_HEADER_SIZE = 8;

        @Nullable
        public Format format;
        public int nalUnitLengthFieldLength;
        public int requiredSampleTransformation = 0;
        public final TrackEncryptionBox[] trackEncryptionBoxes;

        public StsdData(int i11) {
            this.trackEncryptionBoxes = new TrackEncryptionBox[i11];
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class StszSampleSizeBox implements SampleSizeBox {
        private final ParsableByteArray data;
        private final int fixedSampleSize;
        private final int sampleCount;

        public StszSampleSizeBox(Mp4Box.LeafBox leafBox, Format format) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            if (MimeTypes.AUDIO_RAW.equals(format.sampleMimeType)) {
                int pcmFrameSize = Util.getPcmFrameSize(format.pcmEncoding, format.channelCount);
                if (readUnsignedIntToInt == 0 || readUnsignedIntToInt % pcmFrameSize != 0) {
                    Log.w(BoxParser.TAG, "Audio sample size mismatch. stsd sample size: " + pcmFrameSize + ", stsz sample size: " + readUnsignedIntToInt);
                    readUnsignedIntToInt = pcmFrameSize;
                }
            }
            this.fixedSampleSize = readUnsignedIntToInt == 0 ? -1 : readUnsignedIntToInt;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return this.fixedSampleSize;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i11 = this.fixedSampleSize;
            return i11 == -1 ? this.data.readUnsignedIntToInt() : i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Stz2SampleSizeBox implements SampleSizeBox {
        private int currentByte;
        private final ParsableByteArray data;
        private final int fieldSize;
        private final int sampleCount;
        private int sampleIndex;

        public Stz2SampleSizeBox(Mp4Box.LeafBox leafBox) {
            ParsableByteArray parsableByteArray = leafBox.data;
            this.data = parsableByteArray;
            parsableByteArray.setPosition(12);
            this.fieldSize = parsableByteArray.readUnsignedIntToInt() & 255;
            this.sampleCount = parsableByteArray.readUnsignedIntToInt();
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getFixedSampleSize() {
            return -1;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int getSampleCount() {
            return this.sampleCount;
        }

        @Override // androidx.media3.extractor.mp4.BoxParser.SampleSizeBox
        public int readNextSampleSize() {
            int i11 = this.fieldSize;
            if (i11 == 8) {
                return this.data.readUnsignedByte();
            }
            if (i11 == 16) {
                return this.data.readUnsignedShort();
            }
            int i12 = this.sampleIndex;
            this.sampleIndex = i12 + 1;
            if (i12 % 2 != 0) {
                return this.currentByte & 15;
            }
            int readUnsignedByte = this.data.readUnsignedByte();
            this.currentByte = readUnsignedByte;
            return (readUnsignedByte & 240) >> 4;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TkhdData {
        private final int alternateGroup;
        private final long duration;

        /* renamed from: id, reason: collision with root package name */
        private final int f5228id;
        private final int rotationDegrees;

        public TkhdData(int i11, long j11, int i12, int i13) {
            this.f5228id = i11;
            this.duration = j11;
            this.alternateGroup = i12;
            this.rotationDegrees = i13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class VexuData {

        @Nullable
        private final EyesData eyesData;

        public VexuData(EyesData eyesData) {
            this.eyesData = eyesData;
        }

        public boolean hasBothEyeViews() {
            EyesData eyesData = this.eyesData;
            return eyesData != null && eyesData.striData.hasLeftEyeView && this.eyesData.striData.hasRightEyeView;
        }
    }

    private BoxParser() {
    }

    private static ByteBuffer allocateHdrStaticInfo() {
        return ByteBuffer.allocate(25).order(ByteOrder.LITTLE_ENDIAN);
    }

    private static boolean canApplyEditWithGaplessInfo(long[] jArr, long j11, long j12, long j13) {
        int length = jArr.length - 1;
        return jArr[0] <= j12 && j12 < jArr[Util.constrainValue(4, 0, length)] && jArr[Util.constrainValue(jArr.length - 4, 0, length)] < j13 && j13 <= j11;
    }

    private static int findBoxPosition(ParsableByteArray parsableByteArray, int i11, int i12, int i13) throws ParserException {
        int position = parsableByteArray.getPosition();
        ExtractorUtil.checkContainerInput(position >= i12, null);
        while (position - i12 < i13) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == i11) {
                return position;
            }
            position += readInt;
        }
        return -1;
    }

    @Nullable
    private static String getLanguageFromCode(int i11) {
        char[] cArr = {(char) (((i11 >> 10) & 31) + 96), (char) (((i11 >> 5) & 31) + 96), (char) ((i11 & 31) + 96)};
        for (int i12 = 0; i12 < 3; i12++) {
            char c11 = cArr[i12];
            if (c11 < 'a' || c11 > 'z') {
                return null;
            }
        }
        return new String(cArr);
    }

    private static int getTrackTypeForHdlr(int i11) {
        if (i11 == TYPE_soun) {
            return 1;
        }
        if (i11 == TYPE_vide) {
            return 2;
        }
        if (i11 == TYPE_text || i11 == TYPE_sbtl || i11 == TYPE_subt || i11 == TYPE_clcp) {
            return 3;
        }
        return i11 == 1835365473 ? 5 : -1;
    }

    public static void maybeSkipRemainingMetaBoxHeaderBytes(ParsableByteArray parsableByteArray) {
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(4);
        if (parsableByteArray.readInt() != 1751411826) {
            position += 4;
        }
        parsableByteArray.setPosition(position);
    }

    private static ColorInfo parseApvc(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int readBits = parsableBitArray.readBits(8);
        for (int i11 = 0; i11 < readBits; i11++) {
            parsableBitArray.skipBytes(1);
            int readBits2 = parsableBitArray.readBits(8);
            for (int i12 = 0; i12 < readBits2; i12++) {
                parsableBitArray.skipBits(6);
                boolean readBit = parsableBitArray.readBit();
                parsableBitArray.skipBit();
                parsableBitArray.skipBytes(11);
                parsableBitArray.skipBits(4);
                int readBits3 = parsableBitArray.readBits(4) + 8;
                builder.setLumaBitdepth(readBits3);
                builder.setChromaBitdepth(readBits3);
                parsableBitArray.skipBytes(1);
                if (readBit) {
                    int readBits4 = parsableBitArray.readBits(8);
                    int readBits5 = parsableBitArray.readBits(8);
                    parsableBitArray.skipBytes(1);
                    builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(readBits4)).setColorRange(parsableBitArray.readBit() ? 1 : 2).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits5));
                }
            }
        }
        return builder.build();
    }

    private static void parseAudioSampleEntry(ParsableByteArray parsableByteArray, int i11, int i12, int i13, int i14, @Nullable String str, boolean z11, @Nullable DrmInitData drmInitData, StsdData stsdData, int i15) throws ParserException {
        int i16;
        int i17;
        int i18;
        int readUnsignedShort;
        int readUnsignedFixedPoint1616;
        int readInt;
        int i19;
        String str2;
        String str3;
        int i21;
        int i22 = i11;
        int i23 = i13;
        DrmInitData drmInitData2 = drmInitData;
        parsableByteArray.setPosition(i12 + 16);
        if (z11) {
            i16 = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
        } else {
            parsableByteArray.skipBytes(8);
            i16 = 0;
        }
        if (i16 == 0 || i16 == 1) {
            i17 = 2;
            i18 = 4;
            readUnsignedShort = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(6);
            readUnsignedFixedPoint1616 = parsableByteArray.readUnsignedFixedPoint1616();
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 4);
            readInt = parsableByteArray.readInt();
            if (i16 == 1) {
                parsableByteArray.skipBytes(16);
            }
            i19 = -1;
        } else {
            if (i16 != 2) {
                return;
            }
            parsableByteArray.skipBytes(16);
            i17 = 2;
            readUnsignedFixedPoint1616 = (int) Math.round(parsableByteArray.readDouble());
            int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
            parsableByteArray.skipBytes(4);
            int readUnsignedIntToInt2 = parsableByteArray.readUnsignedIntToInt();
            int readUnsignedIntToInt3 = parsableByteArray.readUnsignedIntToInt();
            boolean z12 = (readUnsignedIntToInt3 & 1) != 0;
            boolean z13 = (readUnsignedIntToInt3 & 2) != 0;
            i18 = 4;
            if (z12) {
                if (readUnsignedIntToInt2 == 32) {
                    i19 = 4;
                    parsableByteArray.skipBytes(8);
                    readUnsignedShort = readUnsignedIntToInt;
                    readInt = 0;
                }
                i19 = -1;
                parsableByteArray.skipBytes(8);
                readUnsignedShort = readUnsignedIntToInt;
                readInt = 0;
            } else {
                if (readUnsignedIntToInt2 == 8) {
                    i19 = 3;
                } else if (readUnsignedIntToInt2 == 16) {
                    i19 = z13 ? 268435456 : 2;
                } else if (readUnsignedIntToInt2 == 24) {
                    i19 = z13 ? C.ENCODING_PCM_24BIT_BIG_ENDIAN : 21;
                } else {
                    if (readUnsignedIntToInt2 == 32) {
                        i19 = z13 ? C.ENCODING_PCM_32BIT_BIG_ENDIAN : 22;
                    }
                    i19 = -1;
                }
                parsableByteArray.skipBytes(8);
                readUnsignedShort = readUnsignedIntToInt;
                readInt = 0;
            }
        }
        if (i22 == 1767992678) {
            readUnsignedFixedPoint1616 = -1;
            readUnsignedShort = -1;
        } else {
            if (i22 != 1935764850) {
                readUnsignedFixedPoint1616 = i22 == 1935767394 ? 16000 : 8000;
            }
            readUnsignedShort = 1;
        }
        int position = parsableByteArray.getPosition();
        if (i22 == 1701733217) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i12, i23);
            if (parseSampleEntryEncryptionData != null) {
                i22 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData2 = drmInitData2 == null ? null : drmInitData2.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData.trackEncryptionBoxes[i15] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str4 = MimeTypes.AUDIO_MPEGH_MHM1;
        if (i22 == 1633889587) {
            str2 = MimeTypes.AUDIO_AC3;
        } else if (i22 == 1700998451) {
            str2 = MimeTypes.AUDIO_E_AC3;
        } else if (i22 == 1633889588) {
            str2 = MimeTypes.AUDIO_AC4;
        } else if (i22 == 1685353315) {
            str2 = MimeTypes.AUDIO_DTS;
        } else if (i22 == 1685353320 || i22 == 1685353324) {
            str2 = MimeTypes.AUDIO_DTS_HD;
        } else if (i22 == 1685353317) {
            str2 = MimeTypes.AUDIO_DTS_EXPRESS;
        } else if (i22 == 1685353336) {
            str2 = MimeTypes.AUDIO_DTS_X;
        } else if (i22 == 1935764850) {
            str2 = MimeTypes.AUDIO_AMR_NB;
        } else if (i22 == 1935767394) {
            str2 = MimeTypes.AUDIO_AMR_WB;
        } else {
            if (i22 != 1936684916) {
                if (i22 == 1953984371) {
                    str2 = MimeTypes.AUDIO_RAW;
                    i19 = 268435456;
                } else if (i22 != 1819304813) {
                    str2 = (i22 == 778924082 || i22 == 778924083) ? MimeTypes.AUDIO_MPEG : i22 == 1835557169 ? MimeTypes.AUDIO_MPEGH_MHA1 : i22 == 1835560241 ? MimeTypes.AUDIO_MPEGH_MHM1 : i22 == 1634492771 ? MimeTypes.AUDIO_ALAC : i22 == 1634492791 ? MimeTypes.AUDIO_ALAW : i22 == 1970037111 ? MimeTypes.AUDIO_MLAW : i22 == 1332770163 ? MimeTypes.AUDIO_OPUS : i22 == 1716281667 ? MimeTypes.AUDIO_FLAC : i22 == 1835823201 ? MimeTypes.AUDIO_TRUEHD : i22 == 1767992678 ? MimeTypes.AUDIO_IAMF : null;
                } else if (i19 != -1) {
                    str2 = MimeTypes.AUDIO_RAW;
                }
            }
            str2 = MimeTypes.AUDIO_RAW;
            i19 = i17;
        }
        String str5 = null;
        List<byte[]> list = null;
        EsdsData esdsData = null;
        BtrtData btrtData = null;
        while (position - i12 < i23) {
            parsableByteArray.setPosition(position);
            int readInt2 = parsableByteArray.readInt();
            int i24 = i19;
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1835557187) {
                parsableByteArray.setPosition(position + 8);
                parsableByteArray.skipBytes(1);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                parsableByteArray.skipBytes(1);
                String format = Objects.equals(str2, str4) ? String.format("mhm1.%02X", Integer.valueOf(readUnsignedByte)) : String.format("mha1.%02X", Integer.valueOf(readUnsignedByte));
                int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                byte[] bArr = new byte[readUnsignedShort2];
                parsableByteArray.readBytes(bArr, 0, readUnsignedShort2);
                list = list == null ? ImmutableList.of(bArr) : ImmutableList.of(bArr, list.get(0));
                str5 = format;
            } else {
                if (readInt3 == 1835557200) {
                    parsableByteArray.setPosition(position + 8);
                    int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                    if (readUnsignedByte2 > 0) {
                        byte[] bArr2 = new byte[readUnsignedByte2];
                        str3 = str4;
                        parsableByteArray.readBytes(bArr2, 0, readUnsignedByte2);
                        list = list == null ? ImmutableList.of(bArr2) : ImmutableList.of(list.get(0), bArr2);
                    }
                } else {
                    str3 = str4;
                    if (readInt3 == 1702061171 || (z11 && readInt3 == 2002876005)) {
                        i21 = i18;
                        int findBoxPosition = readInt3 == 1702061171 ? position : findBoxPosition(parsableByteArray, Mp4Box.TYPE_esds, position, readInt2);
                        if (findBoxPosition != -1) {
                            esdsData = parseEsdsFromParent(parsableByteArray, findBoxPosition);
                            str2 = esdsData.mimeType;
                            byte[] bArr3 = esdsData.initializationData;
                            if (bArr3 != null) {
                                if (MimeTypes.AUDIO_VORBIS.equals(str2)) {
                                    list = VorbisUtil.parseVorbisCsdFromEsdsInitializationData(bArr3);
                                } else {
                                    if (MimeTypes.AUDIO_AAC.equals(str2)) {
                                        AacUtil.Config parseAudioSpecificConfig = AacUtil.parseAudioSpecificConfig(bArr3);
                                        int i25 = parseAudioSpecificConfig.sampleRateHz;
                                        int i26 = parseAudioSpecificConfig.channelCount;
                                        str5 = parseAudioSpecificConfig.codecs;
                                        readUnsignedFixedPoint1616 = i25;
                                        readUnsignedShort = i26;
                                    }
                                    list = ImmutableList.of(bArr3);
                                }
                            }
                        }
                    } else if (readInt3 == 1651798644) {
                        btrtData = parseBtrtFromParent(parsableByteArray, position);
                    } else {
                        if (readInt3 == 1684103987) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseAc3AnnexFFormat(parsableByteArray, Integer.toString(i14), str, drmInitData2);
                        } else if (readInt3 == 1684366131) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac3Util.parseEAc3AnnexFFormat(parsableByteArray, Integer.toString(i14), str, drmInitData2);
                        } else if (readInt3 == 1684103988) {
                            parsableByteArray.setPosition(position + 8);
                            stsdData.format = Ac4Util.parseAc4AnnexEFormat(parsableByteArray, Integer.toString(i14), str, drmInitData2);
                        } else if (readInt3 == 1684892784) {
                            if (readInt <= 0) {
                                throw ParserException.createForMalformedContainer("Invalid sample rate for Dolby TrueHD MLP stream: " + readInt, null);
                            }
                            readUnsignedFixedPoint1616 = readInt;
                            i21 = i18;
                            readUnsignedShort = i17;
                        } else if (readInt3 == 1684305011 || readInt3 == 1969517683) {
                            i21 = i18;
                            stsdData.format = new Format.Builder().setId(i14).setSampleMimeType(str2).setChannelCount(readUnsignedShort).setSampleRate(readUnsignedFixedPoint1616).setDrmInitData(drmInitData2).setLanguage(str).build();
                        } else if (readInt3 == 1682927731) {
                            int i27 = readInt2 - 8;
                            byte[] bArr4 = opusMagic;
                            byte[] copyOf = Arrays.copyOf(bArr4, bArr4.length + i27);
                            parsableByteArray.setPosition(position + 8);
                            parsableByteArray.readBytes(copyOf, bArr4.length, i27);
                            list = OpusUtil.buildInitializationData(copyOf);
                        } else if (readInt3 == 1684425825) {
                            byte[] bArr5 = new byte[readInt2 - 8];
                            bArr5[0] = 102;
                            bArr5[1] = 76;
                            bArr5[i17] = 97;
                            bArr5[3] = 67;
                            parsableByteArray.setPosition(position + 12);
                            i21 = i18;
                            parsableByteArray.readBytes(bArr5, i21, readInt2 - 12);
                            list = ImmutableList.of(bArr5);
                        } else {
                            i21 = i18;
                            if (readInt3 == 1634492771) {
                                int i28 = readInt2 - 12;
                                byte[] bArr6 = new byte[i28];
                                parsableByteArray.setPosition(position + 12);
                                parsableByteArray.readBytes(bArr6, 0, i28);
                                Pair<Integer, Integer> parseAlacAudioSpecificConfig = CodecSpecificDataUtil.parseAlacAudioSpecificConfig(bArr6);
                                int intValue = ((Integer) parseAlacAudioSpecificConfig.first).intValue();
                                int intValue2 = ((Integer) parseAlacAudioSpecificConfig.second).intValue();
                                list = ImmutableList.of(bArr6);
                                readUnsignedFixedPoint1616 = intValue;
                                readUnsignedShort = intValue2;
                            } else if (readInt3 == 1767990114) {
                                parsableByteArray.setPosition(position + 9);
                                int readUnsignedLeb128ToInt = parsableByteArray.readUnsignedLeb128ToInt();
                                byte[] bArr7 = new byte[readUnsignedLeb128ToInt];
                                parsableByteArray.readBytes(bArr7, 0, readUnsignedLeb128ToInt);
                                list = ImmutableList.of(bArr7);
                            }
                        }
                        i21 = i18;
                    }
                    position += readInt2;
                    i23 = i13;
                    i18 = i21;
                    i19 = i24;
                    str4 = str3;
                }
                i21 = i18;
                position += readInt2;
                i23 = i13;
                i18 = i21;
                i19 = i24;
                str4 = str3;
            }
            str3 = str4;
            i21 = i18;
            position += readInt2;
            i23 = i13;
            i18 = i21;
            i19 = i24;
            str4 = str3;
        }
        int i29 = i19;
        if (stsdData.format != null || str2 == null) {
            return;
        }
        Format.Builder language = new Format.Builder().setId(i14).setSampleMimeType(str2).setCodecs(str5).setChannelCount(readUnsignedShort).setSampleRate(readUnsignedFixedPoint1616).setPcmEncoding(i29).setInitializationData(list).setDrmInitData(drmInitData2).setLanguage(str);
        if (esdsData != null) {
            language.setAverageBitrate(i.A(esdsData.bitrate)).setPeakBitrate(i.A(esdsData.peakBitrate));
        } else if (btrtData != null) {
            language.setAverageBitrate(i.A(btrtData.avgBitrate)).setPeakBitrate(i.A(btrtData.maxBitrate));
        }
        stsdData.format = language.build();
    }

    private static ColorInfo parseAv1c(ParsableByteArray parsableByteArray) {
        ColorInfo.Builder builder = new ColorInfo.Builder();
        ParsableBitArray parsableBitArray = new ParsableBitArray(parsableByteArray.getData());
        parsableBitArray.setPosition(parsableByteArray.getPosition() * 8);
        parsableBitArray.skipBytes(1);
        int readBits = parsableBitArray.readBits(3);
        parsableBitArray.skipBits(6);
        boolean readBit = parsableBitArray.readBit();
        boolean readBit2 = parsableBitArray.readBit();
        if (readBits == 2 && readBit) {
            builder.setLumaBitdepth(readBit2 ? 12 : 10);
            builder.setChromaBitdepth(readBit2 ? 12 : 10);
        } else if (readBits <= 2) {
            builder.setLumaBitdepth(readBit ? 10 : 8);
            builder.setChromaBitdepth(readBit ? 10 : 8);
        }
        parsableBitArray.skipBits(13);
        parsableBitArray.skipBit();
        int readBits2 = parsableBitArray.readBits(4);
        if (readBits2 != 1) {
            Log.i(TAG, "Unsupported obu_type: " + readBits2);
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported obu_extension_flag");
            return builder.build();
        }
        boolean readBit3 = parsableBitArray.readBit();
        parsableBitArray.skipBit();
        if (readBit3 && parsableBitArray.readBits(8) > 127) {
            Log.i(TAG, "Excessive obu_size");
            return builder.build();
        }
        int readBits3 = parsableBitArray.readBits(3);
        parsableBitArray.skipBit();
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported reduced_still_picture_header");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported timing_info_present_flag");
            return builder.build();
        }
        if (parsableBitArray.readBit()) {
            Log.i(TAG, "Unsupported initial_display_delay_present_flag");
            return builder.build();
        }
        int readBits4 = parsableBitArray.readBits(5);
        boolean z11 = false;
        for (int i11 = 0; i11 <= readBits4; i11++) {
            parsableBitArray.skipBits(12);
            if (parsableBitArray.readBits(5) > 7) {
                parsableBitArray.skipBit();
            }
        }
        int readBits5 = parsableBitArray.readBits(4);
        int readBits6 = parsableBitArray.readBits(4);
        parsableBitArray.skipBits(readBits5 + 1);
        parsableBitArray.skipBits(readBits6 + 1);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(7);
        }
        parsableBitArray.skipBits(7);
        boolean readBit4 = parsableBitArray.readBit();
        if (readBit4) {
            parsableBitArray.skipBits(2);
        }
        if ((parsableBitArray.readBit() ? 2 : parsableBitArray.readBits(1)) > 0 && !parsableBitArray.readBit()) {
            parsableBitArray.skipBits(1);
        }
        if (readBit4) {
            parsableBitArray.skipBits(3);
        }
        parsableBitArray.skipBits(3);
        boolean readBit5 = parsableBitArray.readBit();
        if (readBits3 == 2 && readBit5) {
            parsableBitArray.skipBit();
        }
        if (readBits3 != 1 && parsableBitArray.readBit()) {
            z11 = true;
        }
        if (parsableBitArray.readBit()) {
            int readBits7 = parsableBitArray.readBits(8);
            int readBits8 = parsableBitArray.readBits(8);
            builder.setColorSpace(ColorInfo.isoColorPrimariesToColorSpace(readBits7)).setColorRange(((z11 || readBits7 != 1 || readBits8 != 13 || parsableBitArray.readBits(8) != 0) ? parsableBitArray.readBits(1) : 1) != 1 ? 2 : 1).setColorTransfer(ColorInfo.isoTransferCharacteristicsToColorTransfer(readBits8));
        }
        return builder.build();
    }

    private static BtrtData parseBtrtFromParent(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.setPosition(i11 + 8);
        parsableByteArray.skipBytes(4);
        return new BtrtData(parsableByteArray.readUnsignedInt(), parsableByteArray.readUnsignedInt());
    }

    @Nullable
    public static Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent(ParsableByteArray parsableByteArray, int i11, int i12) throws ParserException {
        int i13 = i11 + 8;
        int i14 = -1;
        int i15 = 0;
        String str = null;
        Integer num = null;
        while (i13 - i11 < i12) {
            parsableByteArray.setPosition(i13);
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1718775137) {
                num = Integer.valueOf(parsableByteArray.readInt());
            } else if (readInt2 == 1935894637) {
                parsableByteArray.skipBytes(4);
                str = parsableByteArray.readString(4);
            } else if (readInt2 == 1935894633) {
                i14 = i13;
                i15 = readInt;
            }
            i13 += readInt;
        }
        if (!C.CENC_TYPE_cenc.equals(str) && !C.CENC_TYPE_cbc1.equals(str) && !C.CENC_TYPE_cens.equals(str) && !C.CENC_TYPE_cbcs.equals(str)) {
            return null;
        }
        ExtractorUtil.checkContainerInput(num != null, "frma atom is mandatory");
        ExtractorUtil.checkContainerInput(i14 != -1, "schi atom is mandatory");
        TrackEncryptionBox parseSchiFromParent = parseSchiFromParent(parsableByteArray, i14, i15, str);
        ExtractorUtil.checkContainerInput(parseSchiFromParent != null, "tenc atom is mandatory");
        return Pair.create(num, (TrackEncryptionBox) Util.castNonNull(parseSchiFromParent));
    }

    @Nullable
    private static Pair<long[], long[]> parseEdts(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_elst);
        if (leafBoxOfType == null) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType.data;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        int readUnsignedIntToInt = parsableByteArray.readUnsignedIntToInt();
        long[] jArr = new long[readUnsignedIntToInt];
        long[] jArr2 = new long[readUnsignedIntToInt];
        for (int i11 = 0; i11 < readUnsignedIntToInt; i11++) {
            jArr[i11] = parseFullBoxVersion == 1 ? parsableByteArray.readUnsignedLongToLong() : parsableByteArray.readUnsignedInt();
            jArr2[i11] = parseFullBoxVersion == 1 ? parsableByteArray.readLong() : parsableByteArray.readInt();
            if (parsableByteArray.readShort() != 1) {
                throw new IllegalArgumentException("Unsupported media rate.");
            }
            parsableByteArray.skipBytes(2);
        }
        return Pair.create(jArr, jArr2);
    }

    private static EsdsData parseEsdsFromParent(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.setPosition(i11 + 12);
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        if ((readUnsignedByte & 128) != 0) {
            parsableByteArray.skipBytes(2);
        }
        if ((readUnsignedByte & 64) != 0) {
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedByte());
        }
        if ((readUnsignedByte & 32) != 0) {
            parsableByteArray.skipBytes(2);
        }
        parsableByteArray.skipBytes(1);
        parseExpandableClassSize(parsableByteArray);
        String mimeTypeFromMp4ObjectType = MimeTypes.getMimeTypeFromMp4ObjectType(parsableByteArray.readUnsignedByte());
        if (MimeTypes.AUDIO_MPEG.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS.equals(mimeTypeFromMp4ObjectType) || MimeTypes.AUDIO_DTS_HD.equals(mimeTypeFromMp4ObjectType)) {
            return new EsdsData(mimeTypeFromMp4ObjectType, null, -1L, -1L);
        }
        parsableByteArray.skipBytes(4);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
        parsableByteArray.skipBytes(1);
        int parseExpandableClassSize = parseExpandableClassSize(parsableByteArray);
        long j11 = readUnsignedInt2;
        byte[] bArr = new byte[parseExpandableClassSize];
        parsableByteArray.readBytes(bArr, 0, parseExpandableClassSize);
        if (j11 <= 0) {
            j11 = -1;
        }
        return new EsdsData(mimeTypeFromMp4ObjectType, bArr, j11, readUnsignedInt > 0 ? readUnsignedInt : -1L);
    }

    private static int parseExpandableClassSize(ParsableByteArray parsableByteArray) {
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int i11 = readUnsignedByte & 127;
        while ((readUnsignedByte & 128) == 128) {
            readUnsignedByte = parsableByteArray.readUnsignedByte();
            i11 = (i11 << 7) | (readUnsignedByte & 127);
        }
        return i11;
    }

    public static int parseFullBoxFlags(int i11) {
        return i11 & 16777215;
    }

    public static int parseFullBoxVersion(int i11) {
        return (i11 >> 24) & 255;
    }

    private static int parseHdlr(ParsableByteArray parsableByteArray) {
        parsableByteArray.setPosition(16);
        return parsableByteArray.readInt();
    }

    @Nullable
    private static Metadata parseIlst(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.skipBytes(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray.getPosition() < i11) {
            Metadata.Entry parseIlstElement = MetadataUtil.parseIlstElement(parsableByteArray);
            if (parseIlstElement != null) {
                arrayList.add(parseIlstElement);
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static MdhdData parseMdhd(ParsableByteArray parsableByteArray) {
        long j11;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullBoxVersion == 0 ? 8 : 16);
        long readUnsignedInt = parsableByteArray.readUnsignedInt();
        int position = parsableByteArray.getPosition();
        int i11 = parseFullBoxVersion == 0 ? 4 : 8;
        int i12 = 0;
        while (true) {
            j11 = C.TIME_UNSET;
            if (i12 >= i11) {
                parsableByteArray.skipBytes(i11);
                break;
            }
            if (parsableByteArray.getData()[position + i12] != -1) {
                long readUnsignedInt2 = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (readUnsignedInt2 != 0) {
                    long scaleLargeTimestamp = Util.scaleLargeTimestamp(readUnsignedInt2, 1000000L, readUnsignedInt);
                    readUnsignedInt = readUnsignedInt;
                    j11 = scaleLargeTimestamp;
                }
            } else {
                i12++;
            }
        }
        return new MdhdData(readUnsignedInt, j11, getLanguageFromCode(parsableByteArray.readUnsignedShort()));
    }

    @Nullable
    public static Metadata parseMdtaFromMeta(Mp4Box.ContainerBox containerBox) {
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_hdlr);
        Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_keys);
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ilst);
        if (leafBoxOfType == null || leafBoxOfType2 == null || leafBoxOfType3 == null || parseHdlr(leafBoxOfType.data) != TYPE_mdta) {
            return null;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType2.data;
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        String[] strArr = new String[readInt];
        for (int i11 = 0; i11 < readInt; i11++) {
            int readInt2 = parsableByteArray.readInt();
            parsableByteArray.skipBytes(4);
            strArr[i11] = parsableByteArray.readString(readInt2 - 8);
        }
        ParsableByteArray parsableByteArray2 = leafBoxOfType3.data;
        parsableByteArray2.setPosition(8);
        ArrayList arrayList = new ArrayList();
        while (parsableByteArray2.bytesLeft() > 8) {
            int position = parsableByteArray2.getPosition();
            int readInt3 = parsableByteArray2.readInt();
            int readInt4 = parsableByteArray2.readInt() - 1;
            if (readInt4 < 0 || readInt4 >= readInt) {
                Log.w(TAG, "Skipped metadata with unknown key index: " + readInt4);
            } else {
                MdtaMetadataEntry parseMdtaMetadataEntryFromIlst = MetadataUtil.parseMdtaMetadataEntryFromIlst(parsableByteArray2, position + readInt3, strArr[readInt4]);
                if (parseMdtaMetadataEntryFromIlst != null) {
                    arrayList.add(parseMdtaMetadataEntryFromIlst);
                }
            }
            parsableByteArray2.setPosition(position + readInt3);
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    private static void parseMetaDataSampleEntry(ParsableByteArray parsableByteArray, int i11, int i12, int i13, StsdData stsdData) {
        parsableByteArray.setPosition(i12 + 16);
        if (i11 == 1835365492) {
            parsableByteArray.readNullTerminatedString();
            String readNullTerminatedString = parsableByteArray.readNullTerminatedString();
            if (readNullTerminatedString != null) {
                stsdData.format = new Format.Builder().setId(i13).setSampleMimeType(readNullTerminatedString).build();
            }
        }
    }

    public static Mp4TimestampData parseMvhd(ParsableByteArray parsableByteArray) {
        long readLong;
        long readLong2;
        parsableByteArray.setPosition(8);
        if (parseFullBoxVersion(parsableByteArray.readInt()) == 0) {
            readLong = parsableByteArray.readUnsignedInt();
            readLong2 = parsableByteArray.readUnsignedInt();
        } else {
            readLong = parsableByteArray.readLong();
            readLong2 = parsableByteArray.readLong();
        }
        return new Mp4TimestampData(readLong, readLong2, parsableByteArray.readUnsignedInt());
    }

    private static float parsePaspFromParent(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.setPosition(i11 + 8);
        return parsableByteArray.readUnsignedIntToInt() / parsableByteArray.readUnsignedIntToInt();
    }

    @Nullable
    private static byte[] parseProjFromParent(ParsableByteArray parsableByteArray, int i11, int i12) {
        int i13 = i11 + 8;
        while (i13 - i11 < i12) {
            parsableByteArray.setPosition(i13);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1886547818) {
                return Arrays.copyOfRange(parsableByteArray.getData(), i13, readInt + i13);
            }
            i13 += readInt;
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData(ParsableByteArray parsableByteArray, int i11, int i12) throws ParserException {
        Pair<Integer, TrackEncryptionBox> parseCommonEncryptionSinfFromParent;
        int position = parsableByteArray.getPosition();
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1936289382 && (parseCommonEncryptionSinfFromParent = parseCommonEncryptionSinfFromParent(parsableByteArray, position, readInt)) != null) {
                return parseCommonEncryptionSinfFromParent;
            }
            position += readInt;
        }
        return null;
    }

    @Nullable
    private static TrackEncryptionBox parseSchiFromParent(ParsableByteArray parsableByteArray, int i11, int i12, String str) {
        int i13;
        int i14;
        int i15 = i11 + 8;
        while (true) {
            byte[] bArr = null;
            if (i15 - i11 >= i12) {
                return null;
            }
            parsableByteArray.setPosition(i15);
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1952804451) {
                int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
                parsableByteArray.skipBytes(1);
                if (parseFullBoxVersion == 0) {
                    parsableByteArray.skipBytes(1);
                    i14 = 0;
                    i13 = 0;
                } else {
                    int readUnsignedByte = parsableByteArray.readUnsignedByte();
                    i13 = readUnsignedByte & 15;
                    i14 = (readUnsignedByte & 240) >> 4;
                }
                boolean z11 = parsableByteArray.readUnsignedByte() == 1;
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                byte[] bArr2 = new byte[16];
                parsableByteArray.readBytes(bArr2, 0, 16);
                if (z11 && readUnsignedByte2 == 0) {
                    int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                    bArr = new byte[readUnsignedByte3];
                    parsableByteArray.readBytes(bArr, 0, readUnsignedByte3);
                }
                return new TrackEncryptionBox(z11, str, readUnsignedByte2, bArr2, i14, i13, bArr);
            }
            i15 += readInt;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v7 */
    /* JADX WARN: Type inference failed for: r1v8, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15, types: [boolean] */
    public static TrackSampleTable parseStbl(Track track, Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder) throws ParserException {
        SampleSizeBox stz2SampleSizeBox;
        boolean z11;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int[] iArr;
        int i18;
        int i19;
        long[] jArr;
        int[] iArr2;
        long j11;
        long j12;
        int i21;
        long[] jArr2;
        int[] iArr3;
        int[] iArr4;
        int i22;
        int[] iArr5;
        int i23;
        ?? r82;
        int i24;
        Track track2 = track;
        Mp4Box.LeafBox leafBoxOfType = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsz);
        if (leafBoxOfType != null) {
            stz2SampleSizeBox = new StszSampleSizeBox(leafBoxOfType, track2.format);
        } else {
            Mp4Box.LeafBox leafBoxOfType2 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stz2);
            if (leafBoxOfType2 == null) {
                throw ParserException.createForMalformedContainer("Track has no sample table size information", null);
            }
            stz2SampleSizeBox = new Stz2SampleSizeBox(leafBoxOfType2);
        }
        int sampleCount = stz2SampleSizeBox.getSampleCount();
        if (sampleCount == 0) {
            return new TrackSampleTable(track2, new long[0], new int[0], 0, new long[0], new int[0], 0L);
        }
        if (track2.type == 2) {
            long j13 = track2.mediaDurationUs;
            if (j13 > 0) {
                track2 = track2.copyWithFormat(track2.format.buildUpon().setFrameRate(sampleCount / (j13 / 1000000.0f)).build());
            }
        }
        Mp4Box.LeafBox leafBoxOfType3 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stco);
        if (leafBoxOfType3 == null) {
            leafBoxOfType3 = (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_co64));
            z11 = true;
        } else {
            z11 = false;
        }
        ParsableByteArray parsableByteArray = leafBoxOfType3.data;
        ParsableByteArray parsableByteArray2 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stsc))).data;
        ParsableByteArray parsableByteArray3 = ((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_stts))).data;
        Mp4Box.LeafBox leafBoxOfType4 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_stss);
        ParsableByteArray parsableByteArray4 = leafBoxOfType4 != null ? leafBoxOfType4.data : null;
        Mp4Box.LeafBox leafBoxOfType5 = containerBox.getLeafBoxOfType(Mp4Box.TYPE_ctts);
        ParsableByteArray parsableByteArray5 = leafBoxOfType5 != null ? leafBoxOfType5.data : null;
        ChunkIterator chunkIterator = new ChunkIterator(parsableByteArray2, parsableByteArray, z11);
        parsableByteArray3.setPosition(12);
        int readUnsignedIntToInt = parsableByteArray3.readUnsignedIntToInt() - 1;
        int readUnsignedIntToInt2 = parsableByteArray3.readUnsignedIntToInt();
        int readUnsignedIntToInt3 = parsableByteArray3.readUnsignedIntToInt();
        if (parsableByteArray5 != null) {
            parsableByteArray5.setPosition(12);
            i11 = parsableByteArray5.readUnsignedIntToInt();
        } else {
            i11 = 0;
        }
        if (parsableByteArray4 != null) {
            parsableByteArray4.setPosition(12);
            i13 = parsableByteArray4.readUnsignedIntToInt();
            if (i13 > 0) {
                i12 = parsableByteArray4.readUnsignedIntToInt() - 1;
                i14 = 0;
            } else {
                i12 = -1;
                i14 = 0;
                parsableByteArray4 = null;
            }
        } else {
            i12 = -1;
            i13 = 0;
            i14 = 0;
        }
        int fixedSampleSize = stz2SampleSizeBox.getFixedSampleSize();
        String str = track2.format.sampleMimeType;
        if (((fixedSampleSize == -1 || !((MimeTypes.AUDIO_RAW.equals(str) || MimeTypes.AUDIO_MLAW.equals(str) || MimeTypes.AUDIO_ALAW.equals(str)) && readUnsignedIntToInt == 0 && i11 == 0 && i13 == 0)) ? i14 : 1) != 0) {
            int i25 = chunkIterator.length;
            long[] jArr3 = new long[i25];
            int[] iArr6 = new int[i25];
            while (chunkIterator.moveNext()) {
                int i26 = chunkIterator.index;
                jArr3[i26] = chunkIterator.offset;
                iArr6[i26] = chunkIterator.numSamples;
            }
            FixedSampleSizeRechunker.Results rechunk = FixedSampleSizeRechunker.rechunk(fixedSampleSize, jArr3, iArr6, readUnsignedIntToInt3);
            long[] jArr4 = rechunk.offsets;
            int[] iArr7 = rechunk.sizes;
            int i27 = rechunk.maximumSize;
            long[] jArr5 = rechunk.timestamps;
            int[] iArr8 = rechunk.flags;
            long j14 = rechunk.duration;
            j12 = rechunk.totalSize;
            j11 = j14;
            i15 = 1;
            jArr = jArr5;
            iArr2 = iArr8;
            i21 = i27;
            iArr3 = iArr7;
            jArr2 = jArr4;
        } else {
            long[] jArr6 = new long[sampleCount];
            int[] iArr9 = new int[sampleCount];
            long[] jArr7 = new long[sampleCount];
            i15 = 1;
            int[] iArr10 = new int[sampleCount];
            ParsableByteArray parsableByteArray6 = parsableByteArray5;
            SampleSizeBox sampleSizeBox = stz2SampleSizeBox;
            int i28 = readUnsignedIntToInt3;
            ParsableByteArray parsableByteArray7 = parsableByteArray4;
            long j15 = 0;
            long j16 = 0;
            int i29 = i11;
            int i31 = i12;
            int i32 = i14;
            int i33 = i32;
            int i34 = i33;
            int i35 = i34;
            int i36 = readUnsignedIntToInt2;
            long j17 = 0;
            int i37 = readUnsignedIntToInt;
            int i38 = i13;
            int i39 = i35;
            while (true) {
                if (i32 >= sampleCount) {
                    i16 = i37;
                    i17 = i36;
                    iArr = iArr9;
                    i18 = i34;
                    break;
                }
                long j18 = j16;
                int i41 = i34;
                boolean z12 = true;
                while (i41 == 0) {
                    z12 = chunkIterator.moveNext();
                    if (!z12) {
                        break;
                    }
                    int i42 = i37;
                    long j19 = chunkIterator.offset;
                    i41 = chunkIterator.numSamples;
                    j18 = j19;
                    i37 = i42;
                    i36 = i36;
                    sampleCount = sampleCount;
                }
                int i43 = sampleCount;
                i16 = i37;
                i17 = i36;
                if (!z12) {
                    Log.w(TAG, "Unexpected end of chunk data");
                    long[] copyOf = Arrays.copyOf(jArr6, i32);
                    int[] copyOf2 = Arrays.copyOf(iArr9, i32);
                    jArr7 = Arrays.copyOf(jArr7, i32);
                    iArr10 = Arrays.copyOf(iArr10, i32);
                    jArr6 = copyOf;
                    iArr = copyOf2;
                    sampleCount = i32;
                    i18 = i41;
                    break;
                }
                if (parsableByteArray6 != null) {
                    int i44 = i35;
                    while (i44 == 0 && i29 > 0) {
                        i44 = parsableByteArray6.readUnsignedIntToInt();
                        i33 = parsableByteArray6.readInt();
                        i29--;
                    }
                    i35 = i44 - 1;
                }
                jArr6[i32] = j18;
                int readNextSampleSize = sampleSizeBox.readNextSampleSize();
                iArr9[i32] = readNextSampleSize;
                j17 += readNextSampleSize;
                if (readNextSampleSize > i39) {
                    i39 = readNextSampleSize;
                }
                jArr7[i32] = j15 + i33;
                iArr10[i32] = parsableByteArray7 == null ? 1 : i14;
                if (i32 == i31) {
                    iArr10[i32] = 1;
                    i38--;
                    if (i38 > 0) {
                        i31 = ((ParsableByteArray) Assertions.checkNotNull(parsableByteArray7)).readUnsignedIntToInt() - 1;
                    }
                }
                j15 += i28;
                i36 = i17 - 1;
                if (i36 != 0 || i16 <= 0) {
                    i37 = i16;
                } else {
                    i37 = i16 - 1;
                    i36 = parsableByteArray3.readUnsignedIntToInt();
                    i28 = parsableByteArray3.readInt();
                }
                long j21 = j18 + iArr9[i32];
                i34 = i41 - 1;
                i32++;
                j16 = j21;
                sampleCount = i43;
            }
            long j22 = j15 + i33;
            if (parsableByteArray6 != null) {
                while (i29 > 0) {
                    if (parsableByteArray6.readUnsignedIntToInt() != 0) {
                        i19 = i14;
                        break;
                    }
                    parsableByteArray6.readInt();
                    i29--;
                }
            }
            i19 = 1;
            if (i38 != 0 || i17 != 0 || i18 != 0 || i16 != 0 || i35 != 0 || i19 == 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Inconsistent stbl box for track ");
                sb2.append(track2.f5229id);
                sb2.append(": remainingSynchronizationSamples ");
                sb2.append(i38);
                sb2.append(", remainingSamplesAtTimestampDelta ");
                sb2.append(i17);
                sb2.append(", remainingSamplesInChunk ");
                sb2.append(i18);
                sb2.append(", remainingTimestampDeltaChanges ");
                sb2.append(i16);
                sb2.append(", remainingSamplesAtTimestampOffset ");
                sb2.append(i35);
                sb2.append(i19 == 0 ? ", ctts invalid" : "");
                Log.w(TAG, sb2.toString());
            }
            jArr = jArr7;
            iArr2 = iArr10;
            j11 = j22;
            j12 = j17;
            i21 = i39;
            jArr2 = jArr6;
            iArr3 = iArr;
        }
        long j23 = track2.mediaDurationUs;
        if (j23 > 0) {
            long scaleLargeValue = Util.scaleLargeValue(j12 * 8, 1000000L, j23, RoundingMode.HALF_DOWN);
            if (scaleLargeValue > 0 && scaleLargeValue < SieveCacheKt.NodeLinkMask) {
                track2 = track2.copyWithFormat(track2.format.buildUpon().setAverageBitrate((int) scaleLargeValue).build());
            }
        }
        Track track3 = track2;
        long scaleLargeTimestamp = Util.scaleLargeTimestamp(j11, 1000000L, track3.timescale);
        long[] jArr8 = track3.editListDurations;
        if (jArr8 == null) {
            Util.scaleLargeTimestampsInPlace(jArr, 1000000L, track3.timescale);
            return new TrackSampleTable(track3, jArr2, iArr3, i21, jArr, iArr2, scaleLargeTimestamp);
        }
        int[] iArr11 = iArr2;
        int i45 = i15;
        if (jArr8.length == i45 && track3.type == i45 && jArr.length >= 2) {
            long j24 = ((long[]) Assertions.checkNotNull(track3.editListMediaTimes))[i14];
            long scaleLargeTimestamp2 = j24 + Util.scaleLargeTimestamp(track3.editListDurations[i14], track3.timescale, track3.movieTimescale);
            if (canApplyEditWithGaplessInfo(jArr, j11, j24, scaleLargeTimestamp2)) {
                long scaleLargeTimestamp3 = Util.scaleLargeTimestamp(j24 - jArr[i14], track3.format.sampleRate, track3.timescale);
                long scaleLargeTimestamp4 = Util.scaleLargeTimestamp(j11 - scaleLargeTimestamp2, track3.format.sampleRate, track3.timescale);
                if ((scaleLargeTimestamp3 != 0 || scaleLargeTimestamp4 != 0) && scaleLargeTimestamp3 <= SieveCacheKt.NodeLinkMask && scaleLargeTimestamp4 <= SieveCacheKt.NodeLinkMask) {
                    gaplessInfoHolder.encoderDelay = (int) scaleLargeTimestamp3;
                    gaplessInfoHolder.encoderPadding = (int) scaleLargeTimestamp4;
                    Util.scaleLargeTimestampsInPlace(jArr, 1000000L, track3.timescale);
                    return new TrackSampleTable(track3, jArr2, iArr3, i21, jArr, iArr11, Util.scaleLargeTimestamp(track3.editListDurations[i14], 1000000L, track3.movieTimescale));
                }
            }
        }
        long[] jArr9 = track3.editListDurations;
        if (jArr9.length == 1 && jArr9[i14] == 0) {
            long j25 = ((long[]) Assertions.checkNotNull(track3.editListMediaTimes))[i14];
            for (int i46 = i14; i46 < jArr.length; i46++) {
                jArr[i46] = Util.scaleLargeTimestamp(jArr[i46] - j25, 1000000L, track3.timescale);
            }
            return new TrackSampleTable(track3, jArr2, iArr3, i21, jArr, iArr11, Util.scaleLargeTimestamp(j11 - j25, 1000000L, track3.timescale));
        }
        ?? r12 = track3.type == 1 ? 1 : i14;
        int[] iArr12 = new int[jArr9.length];
        int[] iArr13 = new int[jArr9.length];
        long[] jArr10 = (long[]) Assertions.checkNotNull(track3.editListMediaTimes);
        int i47 = i14;
        int i48 = i47;
        int i49 = i48;
        int i51 = i49;
        while (true) {
            long[] jArr11 = track3.editListDurations;
            iArr4 = iArr13;
            if (i47 >= jArr11.length) {
                break;
            }
            int i52 = i47;
            int i53 = i48;
            long j26 = jArr10[i52];
            if (j26 != -1) {
                long j27 = jArr11[i52];
                iArr5 = iArr3;
                i23 = i21;
                long scaleLargeTimestamp5 = Util.scaleLargeTimestamp(j27, track3.timescale, track3.movieTimescale);
                i22 = i52;
                iArr12[i22] = Util.binarySearchFloor(jArr, j26, true, true);
                long j28 = j26 + scaleLargeTimestamp5;
                r82 = i14;
                iArr4[i22] = Util.binarySearchCeil(jArr, j28, (boolean) r12, (boolean) r82);
                int i54 = iArr12[i22];
                while (true) {
                    i24 = iArr12[i22];
                    if (i24 < 0 || (iArr11[i24] & 1) != 0) {
                        break;
                    }
                    iArr12[i22] = i24 - 1;
                }
                if (i24 < 0) {
                    iArr12[i22] = i54;
                    while (true) {
                        int i55 = iArr12[i22];
                        if (i55 >= iArr4[i22] || (iArr11[i55] & 1) != 0) {
                            break;
                        }
                        iArr12[i22] = i55 + 1;
                    }
                }
                if (track3.type == 2 && iArr12[i22] != iArr4[i22]) {
                    while (true) {
                        int i56 = iArr4[i22];
                        if (i56 >= jArr.length - 1 || jArr[i56 + 1] > j28) {
                            break;
                        }
                        iArr4[i22] = i56 + 1;
                    }
                }
                int i57 = iArr4[i22];
                int i58 = iArr12[i22];
                i49 += i57 - i58;
                i48 = i53 | (i51 != i58 ? 1 : r82 == true ? 1 : 0);
                i51 = i57;
            } else {
                i22 = i52;
                iArr5 = iArr3;
                i23 = i21;
                r82 = i14;
                i48 = i53;
            }
            i47 = i22 + 1;
            i14 = r82;
            iArr3 = iArr5;
            iArr13 = iArr4;
            i21 = i23;
        }
        int[] iArr14 = iArr3;
        int i59 = i21;
        int i61 = i14;
        int i62 = i48 | (i49 != sampleCount ? 1 : i61);
        long[] jArr12 = i62 != 0 ? new long[i49] : jArr2;
        int[] iArr15 = i62 != 0 ? new int[i49] : iArr14;
        int i63 = i62 != 0 ? i61 : i59;
        int[] iArr16 = i62 != 0 ? new int[i49] : iArr11;
        long[] jArr13 = new long[i49];
        int i64 = i63;
        int i65 = i61;
        int i66 = i65;
        long j29 = 0;
        while (i61 < track3.editListDurations.length) {
            long j31 = track3.editListMediaTimes[i61];
            int i67 = iArr12[i61];
            int i68 = iArr4[i61];
            int i69 = i62;
            if (i62 != 0) {
                int i71 = i68 - i67;
                System.arraycopy(jArr2, i67, jArr12, i66, i71);
                System.arraycopy(iArr14, i67, iArr15, i66, i71);
                System.arraycopy(iArr11, i67, iArr16, i66, i71);
            }
            int i72 = i64;
            while (i67 < i68) {
                long[] jArr14 = jArr12;
                int[] iArr17 = iArr12;
                long scaleLargeTimestamp6 = Util.scaleLargeTimestamp(j29, 1000000L, track3.movieTimescale);
                long scaleLargeTimestamp7 = Util.scaleLargeTimestamp(jArr[i67] - j31, 1000000L, track3.timescale);
                if (scaleLargeTimestamp7 < 0) {
                    i65 = 1;
                }
                jArr13[i66] = scaleLargeTimestamp6 + scaleLargeTimestamp7;
                if (i69 != 0 && iArr15[i66] > i72) {
                    i72 = iArr14[i67];
                }
                i66++;
                i67++;
                iArr12 = iArr17;
                jArr12 = jArr14;
            }
            j29 += track3.editListDurations[i61];
            i61++;
            i64 = i72;
            jArr12 = jArr12;
            i62 = i69;
        }
        long[] jArr15 = jArr12;
        long scaleLargeTimestamp8 = Util.scaleLargeTimestamp(j29, 1000000L, track3.movieTimescale);
        if (i65 != 0) {
            track3 = track3.copyWithFormat(track3.format.buildUpon().setHasPrerollSamples(true).build());
        }
        return new TrackSampleTable(track3, jArr15, iArr15, i64, jArr13, iArr16, scaleLargeTimestamp8);
    }

    @Nullable
    private static EyesData parseStereoViewBox(ParsableByteArray parsableByteArray, int i11, int i12) throws ParserException {
        parsableByteArray.setPosition(i11 + 8);
        int position = parsableByteArray.getPosition();
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1937011305) {
                parsableByteArray.skipBytes(4);
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                return new EyesData(new StriData((readUnsignedByte & 1) == 1, (readUnsignedByte & 2) == 2, (readUnsignedByte & 8) == 8));
            }
            position += readInt;
        }
        return null;
    }

    private static StsdData parseStsd(ParsableByteArray parsableByteArray, int i11, int i12, @Nullable String str, @Nullable DrmInitData drmInitData, boolean z11) throws ParserException {
        parsableByteArray.setPosition(12);
        int readInt = parsableByteArray.readInt();
        StsdData stsdData = new StsdData(readInt);
        for (int i13 = 0; i13 < readInt; i13++) {
            int position = parsableByteArray.getPosition();
            int readInt2 = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt2 > 0, "childAtomSize must be positive");
            int readInt3 = parsableByteArray.readInt();
            if (readInt3 == 1635148593 || readInt3 == 1635148595 || readInt3 == 1701733238 || readInt3 == 1831958048 || readInt3 == 1836070006 || readInt3 == 1752589105 || readInt3 == 1751479857 || readInt3 == 1932670515 || readInt3 == 1211250227 || readInt3 == 1748121139 || readInt3 == 1987063864 || readInt3 == 1987063865 || readInt3 == 1635135537 || readInt3 == 1685479798 || readInt3 == 1685479729 || readInt3 == 1685481573 || readInt3 == 1685481521 || readInt3 == 1634760241) {
                parseVideoSampleEntry(parsableByteArray, readInt3, position, readInt2, i11, str, i12, drmInitData, stsdData, i13);
            } else if (readInt3 == 1836069985 || readInt3 == 1701733217 || readInt3 == 1633889587 || readInt3 == 1700998451 || readInt3 == 1633889588 || readInt3 == 1835823201 || readInt3 == 1685353315 || readInt3 == 1685353317 || readInt3 == 1685353320 || readInt3 == 1685353324 || readInt3 == 1685353336 || readInt3 == 1935764850 || readInt3 == 1935767394 || readInt3 == 1819304813 || readInt3 == 1936684916 || readInt3 == 1953984371 || readInt3 == 778924082 || readInt3 == 778924083 || readInt3 == 1835557169 || readInt3 == 1835560241 || readInt3 == 1634492771 || readInt3 == 1634492791 || readInt3 == 1970037111 || readInt3 == 1332770163 || readInt3 == 1716281667 || readInt3 == 1767992678) {
                parseAudioSampleEntry(parsableByteArray, readInt3, position, readInt2, i11, str, z11, drmInitData, stsdData, i13);
            } else if (readInt3 == 1414810956 || readInt3 == 1954034535 || readInt3 == 2004251764 || readInt3 == 1937010800 || readInt3 == 1664495672) {
                StsdData stsdData2 = stsdData;
                parseTextSampleEntry(parsableByteArray, readInt3, position, readInt2, i11, str, stsdData2);
                stsdData = stsdData2;
            } else if (readInt3 == 1835365492) {
                parseMetaDataSampleEntry(parsableByteArray, readInt3, position, i11, stsdData);
            } else if (readInt3 == 1667329389) {
                stsdData.format = new Format.Builder().setId(i11).setSampleMimeType(MimeTypes.APPLICATION_CAMERA_MOTION).build();
            }
            parsableByteArray.setPosition(position + readInt2);
        }
        return stsdData;
    }

    private static void parseTextSampleEntry(ParsableByteArray parsableByteArray, int i11, int i12, int i13, int i14, @Nullable String str, StsdData stsdData) {
        parsableByteArray.setPosition(i12 + 16);
        String str2 = MimeTypes.APPLICATION_TTML;
        ImmutableList immutableList = null;
        long j11 = Long.MAX_VALUE;
        if (i11 != 1414810956) {
            if (i11 == 1954034535) {
                int i15 = i13 - 16;
                byte[] bArr = new byte[i15];
                parsableByteArray.readBytes(bArr, 0, i15);
                immutableList = ImmutableList.of(bArr);
                str2 = MimeTypes.APPLICATION_TX3G;
            } else if (i11 == 2004251764) {
                str2 = MimeTypes.APPLICATION_MP4VTT;
            } else if (i11 == 1937010800) {
                j11 = 0;
            } else {
                if (i11 != 1664495672) {
                    throw new IllegalStateException();
                }
                stsdData.requiredSampleTransformation = 1;
                str2 = MimeTypes.APPLICATION_MP4CEA608;
            }
        }
        stsdData.format = new Format.Builder().setId(i14).setSampleMimeType(str2).setLanguage(str).setSubsampleOffsetUs(j11).setInitializationData(immutableList).build();
    }

    private static TkhdData parseTkhd(ParsableByteArray parsableByteArray) {
        long j11;
        int i11;
        int i12;
        parsableByteArray.setPosition(8);
        int parseFullBoxVersion = parseFullBoxVersion(parsableByteArray.readInt());
        parsableByteArray.skipBytes(parseFullBoxVersion == 0 ? 8 : 16);
        int readInt = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int position = parsableByteArray.getPosition();
        int i13 = parseFullBoxVersion == 0 ? 4 : 8;
        int i14 = 0;
        while (true) {
            j11 = C.TIME_UNSET;
            if (i14 >= i13) {
                parsableByteArray.skipBytes(i13);
                break;
            }
            if (parsableByteArray.getData()[position + i14] != -1) {
                long readUnsignedInt = parseFullBoxVersion == 0 ? parsableByteArray.readUnsignedInt() : parsableByteArray.readUnsignedLongToLong();
                if (readUnsignedInt != 0) {
                    j11 = readUnsignedInt;
                }
            } else {
                i14++;
            }
        }
        parsableByteArray.skipBytes(10);
        long j12 = j11;
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(4);
        int readInt2 = parsableByteArray.readInt();
        int readInt3 = parsableByteArray.readInt();
        parsableByteArray.skipBytes(4);
        int readInt4 = parsableByteArray.readInt();
        int readInt5 = parsableByteArray.readInt();
        if (readInt2 == 0 && readInt3 == 65536 && readInt4 == -65536 && readInt5 == 0) {
            i12 = 90;
        } else if (readInt2 == 0 && readInt3 == -65536 && readInt4 == 65536 && readInt5 == 0) {
            i12 = 270;
        } else {
            if (readInt2 != -65536 || readInt3 != 0 || readInt4 != 0 || readInt5 != -65536) {
                i11 = 0;
                return new TkhdData(readInt, j12, readUnsignedShort, i11);
            }
            i12 = 180;
        }
        i11 = i12;
        return new TkhdData(readInt, j12, readUnsignedShort, i11);
    }

    @Nullable
    public static Track parseTrak(Mp4Box.ContainerBox containerBox, Mp4Box.LeafBox leafBox, long j11, @Nullable DrmInitData drmInitData, boolean z11, boolean z12) throws ParserException {
        long[] jArr;
        long[] jArr2;
        Format format;
        Mp4Box.ContainerBox containerBoxOfType;
        Pair<long[], long[]> parseEdts;
        Mp4Box.ContainerBox containerBox2 = (Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox.getContainerBoxOfType(Mp4Box.TYPE_mdia));
        int trackTypeForHdlr = getTrackTypeForHdlr(parseHdlr(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_hdlr))).data));
        if (trackTypeForHdlr == -1) {
            return null;
        }
        TkhdData parseTkhd = parseTkhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_tkhd))).data);
        long j12 = C.TIME_UNSET;
        long j13 = j11 == C.TIME_UNSET ? parseTkhd.duration : j11;
        long j14 = parseMvhd(leafBox.data).timescale;
        if (j13 != C.TIME_UNSET) {
            j12 = Util.scaleLargeTimestamp(j13, 1000000L, j14);
        }
        long j15 = j12;
        Mp4Box.ContainerBox containerBox3 = (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl));
        MdhdData parseMdhd = parseMdhd(((Mp4Box.LeafBox) Assertions.checkNotNull(containerBox2.getLeafBoxOfType(Mp4Box.TYPE_mdhd))).data);
        Mp4Box.LeafBox leafBoxOfType = containerBox3.getLeafBoxOfType(Mp4Box.TYPE_stsd);
        if (leafBoxOfType == null) {
            throw ParserException.createForMalformedContainer("Malformed sample table (stbl) missing sample description (stsd)", null);
        }
        StsdData parseStsd = parseStsd(leafBoxOfType.data, parseTkhd.f5228id, parseTkhd.rotationDegrees, parseMdhd.language, drmInitData, z12);
        if (z11 || (containerBoxOfType = containerBox.getContainerBoxOfType(Mp4Box.TYPE_edts)) == null || (parseEdts = parseEdts(containerBoxOfType)) == null) {
            jArr = null;
            jArr2 = null;
        } else {
            long[] jArr3 = (long[]) parseEdts.first;
            jArr2 = (long[]) parseEdts.second;
            jArr = jArr3;
        }
        if (parseStsd.format == null) {
            return null;
        }
        if (parseTkhd.alternateGroup != 0) {
            Mp4AlternateGroupData mp4AlternateGroupData = new Mp4AlternateGroupData(parseTkhd.alternateGroup);
            Format.Builder buildUpon = parseStsd.format.buildUpon();
            Metadata metadata = parseStsd.format.metadata;
            format = buildUpon.setMetadata(metadata != null ? metadata.copyWithAppendedEntries(mp4AlternateGroupData) : new Metadata(mp4AlternateGroupData)).build();
        } else {
            format = parseStsd.format;
        }
        return new Track(parseTkhd.f5228id, trackTypeForHdlr, parseMdhd.timescale, j14, j15, parseMdhd.mediaDurationUs, format, parseStsd.requiredSampleTransformation, parseStsd.trackEncryptionBoxes, parseStsd.nalUnitLengthFieldLength, jArr, jArr2);
    }

    public static List<TrackSampleTable> parseTraks(Mp4Box.ContainerBox containerBox, GaplessInfoHolder gaplessInfoHolder, long j11, @Nullable DrmInitData drmInitData, boolean z11, boolean z12, r<Track, Track> rVar) throws ParserException {
        Track apply;
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < containerBox.containerChildren.size(); i11++) {
            Mp4Box.ContainerBox containerBox2 = containerBox.containerChildren.get(i11);
            if (containerBox2.type == 1953653099 && (apply = rVar.apply(parseTrak(containerBox2, (Mp4Box.LeafBox) Assertions.checkNotNull(containerBox.getLeafBoxOfType(Mp4Box.TYPE_mvhd)), j11, drmInitData, z11, z12))) != null) {
                arrayList.add(parseStbl(apply, (Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(((Mp4Box.ContainerBox) Assertions.checkNotNull(containerBox2.getContainerBoxOfType(Mp4Box.TYPE_mdia))).getContainerBoxOfType(Mp4Box.TYPE_minf))).getContainerBoxOfType(Mp4Box.TYPE_stbl)), gaplessInfoHolder));
            }
        }
        return arrayList;
    }

    public static Metadata parseUdta(Mp4Box.LeafBox leafBox) {
        ParsableByteArray parsableByteArray = leafBox.data;
        parsableByteArray.setPosition(8);
        Metadata metadata = new Metadata(new Metadata.Entry[0]);
        while (parsableByteArray.bytesLeft() >= 8) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1835365473) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(parseUdtaMeta(parsableByteArray, position + readInt));
            } else if (readInt2 == 1936553057) {
                parsableByteArray.setPosition(position);
                metadata = metadata.copyWithAppendedEntriesFrom(SmtaAtomUtil.parseSmta(parsableByteArray, position + readInt));
            } else if (readInt2 == -1451722374) {
                metadata = metadata.copyWithAppendedEntriesFrom(parseXyz(parsableByteArray));
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return metadata;
    }

    @Nullable
    private static Metadata parseUdtaMeta(ParsableByteArray parsableByteArray, int i11) {
        parsableByteArray.skipBytes(8);
        maybeSkipRemainingMetaBoxHeaderBytes(parsableByteArray);
        while (parsableByteArray.getPosition() < i11) {
            int position = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (parsableByteArray.readInt() == 1768715124) {
                parsableByteArray.setPosition(position);
                return parseIlst(parsableByteArray, position + readInt);
            }
            parsableByteArray.setPosition(position + readInt);
        }
        return null;
    }

    @Nullable
    public static VexuData parseVideoExtendedUsageBox(ParsableByteArray parsableByteArray, int i11, int i12) throws ParserException {
        parsableByteArray.setPosition(i11 + 8);
        int position = parsableByteArray.getPosition();
        EyesData eyesData = null;
        while (position - i11 < i12) {
            parsableByteArray.setPosition(position);
            int readInt = parsableByteArray.readInt();
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            if (parsableByteArray.readInt() == 1702454643) {
                eyesData = parseStereoViewBox(parsableByteArray, position, readInt);
            }
            position += readInt;
        }
        if (eyesData == null) {
            return null;
        }
        return new VexuData(eyesData);
    }

    private static void parseVideoSampleEntry(ParsableByteArray parsableByteArray, int i11, int i12, int i13, int i14, @Nullable String str, int i15, @Nullable DrmInitData drmInitData, StsdData stsdData, int i16) throws ParserException {
        int i17;
        String str2;
        int i18;
        DrmInitData drmInitData2;
        List<byte[]> list;
        int i19;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        NalUnitUtil.H265VpsData h265VpsData;
        int i26;
        int i27;
        int i28;
        int i29 = i12;
        int i31 = i13;
        DrmInitData drmInitData3 = drmInitData;
        StsdData stsdData2 = stsdData;
        parsableByteArray.setPosition(i29 + 16);
        parsableByteArray.skipBytes(16);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(50);
        int position = parsableByteArray.getPosition();
        int i32 = i11;
        if (i32 == 1701733238) {
            Pair<Integer, TrackEncryptionBox> parseSampleEntryEncryptionData = parseSampleEntryEncryptionData(parsableByteArray, i29, i31);
            if (parseSampleEntryEncryptionData != null) {
                i32 = ((Integer) parseSampleEntryEncryptionData.first).intValue();
                drmInitData3 = drmInitData3 == null ? null : drmInitData3.copyWithSchemeType(((TrackEncryptionBox) parseSampleEntryEncryptionData.second).schemeType);
                stsdData2.trackEncryptionBoxes[i16] = (TrackEncryptionBox) parseSampleEntryEncryptionData.second;
            }
            parsableByteArray.setPosition(position);
        }
        String str3 = MimeTypes.VIDEO_H263;
        String str4 = i32 == 1831958048 ? MimeTypes.VIDEO_MPEG : i32 == 1211250227 ? MimeTypes.VIDEO_H263 : null;
        float f11 = 1.0f;
        int i33 = 8;
        int i34 = 8;
        List<byte[]> list2 = null;
        String str5 = null;
        byte[] bArr = null;
        int i35 = -1;
        int i36 = -1;
        int i37 = -1;
        int i38 = -1;
        int i39 = -1;
        int i41 = -1;
        ByteBuffer byteBuffer = null;
        BtrtData btrtData = null;
        EsdsData esdsData = null;
        NalUnitUtil.H265VpsData h265VpsData2 = null;
        boolean z11 = false;
        while (position - i29 < i31) {
            parsableByteArray.setPosition(position);
            int position2 = parsableByteArray.getPosition();
            int readInt = parsableByteArray.readInt();
            if (readInt == 0 && parsableByteArray.getPosition() - i12 == i31) {
                break;
            }
            ExtractorUtil.checkContainerInput(readInt > 0, "childAtomSize must be positive");
            int readInt2 = parsableByteArray.readInt();
            if (readInt2 == 1635148611) {
                ExtractorUtil.checkContainerInput(str4 == null, null);
                parsableByteArray.setPosition(position2 + 8);
                AvcConfig parse = AvcConfig.parse(parsableByteArray);
                List<byte[]> list3 = parse.initializationData;
                stsdData2.nalUnitLengthFieldLength = parse.nalUnitLengthFieldLength;
                if (!z11) {
                    f11 = parse.pixelWidthHeightRatio;
                }
                String str6 = parse.codecs;
                int i42 = parse.maxNumReorderFrames;
                int i43 = parse.colorSpace;
                int i44 = parse.colorRange;
                list2 = list3;
                int i45 = parse.colorTransfer;
                int i46 = parse.bitdepthLuma;
                NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData2;
                drmInitData2 = drmInitData3;
                h265VpsData = h265VpsData3;
                i17 = position;
                i19 = i32;
                str2 = str3;
                i38 = i43;
                i18 = i44;
                i41 = i45;
                i34 = parse.bitdepthChroma;
                i33 = i46;
                str5 = str6;
                str4 = MimeTypes.VIDEO_H264;
                i36 = i42;
            } else {
                i17 = position;
                if (readInt2 == 1752589123) {
                    ExtractorUtil.checkContainerInput(str4 == null, null);
                    parsableByteArray.setPosition(position2 + 8);
                    HevcConfig parse2 = HevcConfig.parse(parsableByteArray);
                    List<byte[]> list4 = parse2.initializationData;
                    stsdData2.nalUnitLengthFieldLength = parse2.nalUnitLengthFieldLength;
                    if (!z11) {
                        f11 = parse2.pixelWidthHeightRatio;
                    }
                    int i47 = parse2.maxNumReorderPics;
                    int i48 = parse2.maxSubLayers;
                    String str7 = parse2.codecs;
                    int i49 = parse2.stereoMode;
                    list2 = list4;
                    if (i49 != -1) {
                        i35 = i49;
                    }
                    int i51 = parse2.colorSpace;
                    int i52 = parse2.colorRange;
                    int i53 = parse2.colorTransfer;
                    int i54 = parse2.bitdepthLuma;
                    int i55 = parse2.bitdepthChroma;
                    drmInitData2 = drmInitData3;
                    i19 = i32;
                    str2 = str3;
                    i18 = i52;
                    i38 = i51;
                    i41 = i53;
                    i33 = i54;
                    h265VpsData = parse2.vpsData;
                    i36 = i47;
                    i37 = i48;
                    str5 = str7;
                    i34 = i55;
                    str4 = MimeTypes.VIDEO_H265;
                } else {
                    str2 = str3;
                    if (readInt2 == 1818785347) {
                        ExtractorUtil.checkContainerInput(MimeTypes.VIDEO_H265.equals(str4), "lhvC must follow hvcC atom");
                        NalUnitUtil.H265VpsData h265VpsData4 = h265VpsData2;
                        ExtractorUtil.checkContainerInput(h265VpsData4 != null && h265VpsData4.layerInfos.size() >= 2, "must have at least two layers");
                        parsableByteArray.setPosition(position2 + 8);
                        HevcConfig parseLayered = HevcConfig.parseLayered(parsableByteArray, (NalUnitUtil.H265VpsData) Assertions.checkNotNull(h265VpsData4));
                        ExtractorUtil.checkContainerInput(stsdData2.nalUnitLengthFieldLength == parseLayered.nalUnitLengthFieldLength, "nalUnitLengthFieldLength must be same for both hvcC and lhvC atoms");
                        int i56 = parseLayered.colorSpace;
                        int i57 = i38;
                        if (i56 != -1) {
                            ExtractorUtil.checkContainerInput(i57 == i56, "colorSpace must be the same for both views");
                        }
                        int i58 = parseLayered.colorRange;
                        int i59 = i39;
                        if (i58 != -1) {
                            ExtractorUtil.checkContainerInput(i59 == i58, "colorRange must be the same for both views");
                        }
                        int i61 = parseLayered.colorTransfer;
                        if (i61 != -1) {
                            int i62 = i41;
                            i27 = i62;
                            ExtractorUtil.checkContainerInput(i62 == i61, "colorTransfer must be the same for both views");
                        } else {
                            i27 = i41;
                        }
                        ExtractorUtil.checkContainerInput(i33 == parseLayered.bitdepthLuma, "bitdepthLuma must be the same for both views");
                        ExtractorUtil.checkContainerInput(i34 == parseLayered.bitdepthChroma, "bitdepthChroma must be the same for both views");
                        List<byte[]> list5 = list2;
                        if (list5 != null) {
                            list5 = ImmutableList.builder().c(list5).c(parseLayered.initializationData).e();
                            i28 = i57;
                        } else {
                            i28 = i57;
                            ExtractorUtil.checkContainerInput(false, "initializationData must be already set from hvcC atom");
                        }
                        String str8 = parseLayered.codecs;
                        str4 = MimeTypes.VIDEO_MV_HEVC;
                        drmInitData2 = drmInitData3;
                        i19 = i32;
                        i18 = i59;
                        i38 = i28;
                        i41 = i27;
                        str5 = str8;
                        h265VpsData = h265VpsData4;
                        list2 = list5;
                    } else {
                        List<byte[]> list6 = list2;
                        int i63 = i38;
                        i18 = i39;
                        int i64 = i41;
                        NalUnitUtil.H265VpsData h265VpsData5 = h265VpsData2;
                        if (readInt2 == 1986361461) {
                            VexuData parseVideoExtendedUsageBox = parseVideoExtendedUsageBox(parsableByteArray, position2, readInt);
                            if (parseVideoExtendedUsageBox != null && parseVideoExtendedUsageBox.eyesData != null) {
                                if (h265VpsData5 == null || h265VpsData5.layerInfos.size() < 2) {
                                    i26 = i35;
                                    if (i26 == -1) {
                                        i35 = parseVideoExtendedUsageBox.eyesData.striData.eyeViewsReversed ? 5 : 4;
                                        drmInitData2 = drmInitData3;
                                        list2 = list6;
                                        i19 = i32;
                                        i38 = i63;
                                        i41 = i64;
                                        h265VpsData = h265VpsData5;
                                    }
                                    i35 = i26;
                                    drmInitData2 = drmInitData3;
                                    list2 = list6;
                                    i19 = i32;
                                    i38 = i63;
                                    i41 = i64;
                                    h265VpsData = h265VpsData5;
                                } else {
                                    ExtractorUtil.checkContainerInput(parseVideoExtendedUsageBox.hasBothEyeViews(), "both eye views must be marked as available");
                                    ExtractorUtil.checkContainerInput(!parseVideoExtendedUsageBox.eyesData.striData.eyeViewsReversed, "for MV-HEVC, eye_views_reversed must be set to false");
                                }
                            }
                            i26 = i35;
                            i35 = i26;
                            drmInitData2 = drmInitData3;
                            list2 = list6;
                            i19 = i32;
                            i38 = i63;
                            i41 = i64;
                            h265VpsData = h265VpsData5;
                        } else {
                            int i65 = i35;
                            if (readInt2 == 1685480259 || readInt2 == 1685485123) {
                                drmInitData2 = drmInitData3;
                                list = list6;
                                i19 = i32;
                                i21 = i65;
                                i22 = i34;
                                i23 = i33;
                                i24 = i63;
                                i25 = i64;
                                DolbyVisionConfig parse3 = DolbyVisionConfig.parse(parsableByteArray);
                                if (parse3 != null) {
                                    String str9 = parse3.codecs;
                                    str4 = MimeTypes.VIDEO_DOLBY_VISION;
                                    str5 = str9;
                                }
                            } else if (readInt2 == 1987076931) {
                                ExtractorUtil.checkContainerInput(str4 == null, null);
                                String str10 = i32 == 1987063864 ? MimeTypes.VIDEO_VP8 : MimeTypes.VIDEO_VP9;
                                parsableByteArray.setPosition(position2 + 12);
                                byte readUnsignedByte = (byte) parsableByteArray.readUnsignedByte();
                                byte readUnsignedByte2 = (byte) parsableByteArray.readUnsignedByte();
                                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                                i33 = readUnsignedByte3 >> 4;
                                i19 = i32;
                                byte b11 = (byte) ((readUnsignedByte3 >> 1) & 7);
                                if (str10.equals(MimeTypes.VIDEO_VP9)) {
                                    list6 = CodecSpecificDataUtil.buildVp9CodecPrivateInitializationData(readUnsignedByte, readUnsignedByte2, (byte) i33, b11);
                                }
                                boolean z12 = (readUnsignedByte3 & 1) != 0;
                                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                                int readUnsignedByte5 = parsableByteArray.readUnsignedByte();
                                i38 = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedByte4);
                                int i66 = z12 ? 1 : 2;
                                i41 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedByte5);
                                str4 = str10;
                                drmInitData2 = drmInitData3;
                                i34 = i33;
                                i18 = i66;
                                h265VpsData = h265VpsData5;
                                list2 = list6;
                                i35 = i65;
                            } else {
                                i19 = i32;
                                if (readInt2 == 1635135811) {
                                    int i67 = readInt - 8;
                                    byte[] bArr2 = new byte[i67];
                                    parsableByteArray.readBytes(bArr2, 0, i67);
                                    list2 = ImmutableList.of(bArr2);
                                    parsableByteArray.setPosition(position2 + 8);
                                    ColorInfo parseAv1c = parseAv1c(parsableByteArray);
                                    int i68 = parseAv1c.lumaBitdepth;
                                    int i69 = parseAv1c.chromaBitdepth;
                                    int i71 = parseAv1c.colorSpace;
                                    int i72 = parseAv1c.colorRange;
                                    i41 = parseAv1c.colorTransfer;
                                    i33 = i68;
                                    drmInitData2 = drmInitData3;
                                    i34 = i69;
                                    i38 = i71;
                                    i18 = i72;
                                    str4 = MimeTypes.VIDEO_AV1;
                                    h265VpsData = h265VpsData5;
                                } else if (readInt2 == 1668050025) {
                                    if (byteBuffer == null) {
                                        byteBuffer = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer2 = byteBuffer;
                                    byteBuffer2.position(21);
                                    byteBuffer2.putShort(parsableByteArray.readShort());
                                    byteBuffer2.putShort(parsableByteArray.readShort());
                                    byteBuffer = byteBuffer2;
                                    drmInitData2 = drmInitData3;
                                    list2 = list6;
                                    h265VpsData = h265VpsData5;
                                    i38 = i63;
                                    i41 = i64;
                                } else if (readInt2 == 1835295606) {
                                    if (byteBuffer == null) {
                                        byteBuffer = allocateHdrStaticInfo();
                                    }
                                    ByteBuffer byteBuffer3 = byteBuffer;
                                    short readShort = parsableByteArray.readShort();
                                    short readShort2 = parsableByteArray.readShort();
                                    short readShort3 = parsableByteArray.readShort();
                                    short readShort4 = parsableByteArray.readShort();
                                    int i73 = i34;
                                    short readShort5 = parsableByteArray.readShort();
                                    int i74 = i33;
                                    short readShort6 = parsableByteArray.readShort();
                                    drmInitData2 = drmInitData3;
                                    short readShort7 = parsableByteArray.readShort();
                                    short readShort8 = parsableByteArray.readShort();
                                    long readUnsignedInt = parsableByteArray.readUnsignedInt();
                                    long readUnsignedInt2 = parsableByteArray.readUnsignedInt();
                                    byteBuffer3.position(1);
                                    byteBuffer3.putShort(readShort5);
                                    byteBuffer3.putShort(readShort6);
                                    byteBuffer3.putShort(readShort);
                                    byteBuffer3.putShort(readShort2);
                                    byteBuffer3.putShort(readShort3);
                                    byteBuffer3.putShort(readShort4);
                                    byteBuffer3.putShort(readShort7);
                                    byteBuffer3.putShort(readShort8);
                                    byteBuffer3.putShort((short) (readUnsignedInt / 10000));
                                    byteBuffer3.putShort((short) (readUnsignedInt2 / 10000));
                                    byteBuffer = byteBuffer3;
                                    h265VpsData = h265VpsData5;
                                    i34 = i73;
                                    i33 = i74;
                                    i38 = i63;
                                    i41 = i64;
                                    list2 = list6;
                                    i35 = i65;
                                } else {
                                    drmInitData2 = drmInitData3;
                                    list = list6;
                                    i21 = i65;
                                    i22 = i34;
                                    i23 = i33;
                                    if (readInt2 == 1681012275) {
                                        ExtractorUtil.checkContainerInput(str4 == null, null);
                                        h265VpsData = h265VpsData5;
                                        i34 = i22;
                                        i33 = i23;
                                        str4 = str2;
                                    } else if (readInt2 == 1702061171) {
                                        ExtractorUtil.checkContainerInput(str4 == null, null);
                                        esdsData = parseEsdsFromParent(parsableByteArray, position2);
                                        String str11 = esdsData.mimeType;
                                        byte[] bArr3 = esdsData.initializationData;
                                        list2 = bArr3 != null ? ImmutableList.of(bArr3) : list;
                                        str4 = str11;
                                        h265VpsData = h265VpsData5;
                                        i34 = i22;
                                        i33 = i23;
                                        i38 = i63;
                                        i41 = i64;
                                        i35 = i21;
                                    } else {
                                        if (readInt2 == 1651798644) {
                                            btrtData = parseBtrtFromParent(parsableByteArray, position2);
                                        } else if (readInt2 == 1885434736) {
                                            f11 = parsePaspFromParent(parsableByteArray, position2);
                                            h265VpsData = h265VpsData5;
                                            i34 = i22;
                                            i33 = i23;
                                            i38 = i63;
                                            i41 = i64;
                                            list2 = list;
                                            i35 = i21;
                                            z11 = true;
                                        } else if (readInt2 == 1937126244) {
                                            bArr = parseProjFromParent(parsableByteArray, position2, readInt);
                                        } else if (readInt2 == 1936995172) {
                                            int readUnsignedByte6 = parsableByteArray.readUnsignedByte();
                                            parsableByteArray.skipBytes(3);
                                            if (readUnsignedByte6 == 0) {
                                                int readUnsignedByte7 = parsableByteArray.readUnsignedByte();
                                                if (readUnsignedByte7 == 0) {
                                                    i21 = 0;
                                                } else if (readUnsignedByte7 == 1) {
                                                    i21 = 1;
                                                } else if (readUnsignedByte7 == 2) {
                                                    i21 = 2;
                                                } else if (readUnsignedByte7 == 3) {
                                                    i21 = 3;
                                                }
                                            }
                                        } else {
                                            if (readInt2 == 1634760259) {
                                                int i75 = readInt - 12;
                                                byte[] bArr4 = new byte[i75];
                                                parsableByteArray.setPosition(position2 + 12);
                                                parsableByteArray.readBytes(bArr4, 0, i75);
                                                list2 = ImmutableList.of(bArr4);
                                                ColorInfo parseApvc = parseApvc(new ParsableByteArray(bArr4));
                                                int i76 = parseApvc.lumaBitdepth;
                                                int i77 = parseApvc.chromaBitdepth;
                                                int i78 = parseApvc.colorSpace;
                                                int i79 = parseApvc.colorRange;
                                                i41 = parseApvc.colorTransfer;
                                                i33 = i76;
                                                i34 = i77;
                                                i38 = i78;
                                                i18 = i79;
                                                str4 = MimeTypes.VIDEO_APV;
                                                h265VpsData = h265VpsData5;
                                                i35 = i21;
                                            } else {
                                                i24 = i63;
                                                if (readInt2 == 1668246642) {
                                                    i25 = i64;
                                                    if (i24 == -1 && i25 == -1) {
                                                        int readInt3 = parsableByteArray.readInt();
                                                        if (readInt3 == TYPE_nclx || readInt3 == TYPE_nclc) {
                                                            int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                                                            int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                                                            parsableByteArray.skipBytes(2);
                                                            boolean z13 = readInt == 19 && (parsableByteArray.readUnsignedByte() & 128) != 0;
                                                            int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(readUnsignedShort3);
                                                            i18 = z13 ? 1 : 2;
                                                            i34 = i22;
                                                            i33 = i23;
                                                            list2 = list;
                                                            i38 = isoColorPrimariesToColorSpace;
                                                            i41 = ColorInfo.isoTransferCharacteristicsToColorTransfer(readUnsignedShort4);
                                                            h265VpsData = h265VpsData5;
                                                            i35 = i21;
                                                        } else {
                                                            Log.w(TAG, "Unsupported color type: " + Mp4Box.getBoxTypeString(readInt3));
                                                        }
                                                    }
                                                } else {
                                                    i25 = i64;
                                                }
                                            }
                                        }
                                        h265VpsData = h265VpsData5;
                                        i34 = i22;
                                        i33 = i23;
                                    }
                                    i38 = i63;
                                    i41 = i64;
                                    list2 = list;
                                    i35 = i21;
                                }
                                i35 = i65;
                            }
                            i34 = i22;
                            i33 = i23;
                            list2 = list;
                            i41 = i25;
                            i38 = i24;
                            h265VpsData = h265VpsData5;
                            i35 = i21;
                        }
                    }
                }
            }
            DrmInitData drmInitData4 = drmInitData2;
            h265VpsData2 = h265VpsData;
            drmInitData3 = drmInitData4;
            i29 = i12;
            i31 = i13;
            position = i17 + readInt;
            i32 = i19;
            str3 = str2;
            i39 = i18;
            stsdData2 = stsdData;
        }
        DrmInitData drmInitData5 = drmInitData3;
        List<byte[]> list7 = list2;
        int i81 = i35;
        int i82 = i38;
        int i83 = i39;
        int i84 = i41;
        int i85 = i34;
        int i86 = i33;
        if (str4 == null) {
            return;
        }
        Format.Builder colorInfo = new Format.Builder().setId(i14).setSampleMimeType(str4).setCodecs(str5).setWidth(readUnsignedShort).setHeight(readUnsignedShort2).setPixelWidthHeightRatio(f11).setRotationDegrees(i15).setProjectionData(bArr).setStereoMode(i81).setInitializationData(list7).setMaxNumReorderSamples(i36).setMaxSubLayers(i37).setDrmInitData(drmInitData5).setLanguage(str).setColorInfo(new ColorInfo.Builder().setColorSpace(i82).setColorRange(i83).setColorTransfer(i84).setHdrStaticInfo(byteBuffer != null ? byteBuffer.array() : null).setLumaBitdepth(i86).setChromaBitdepth(i85).build());
        if (btrtData != null) {
            colorInfo.setAverageBitrate(i.A(btrtData.avgBitrate)).setPeakBitrate(i.A(btrtData.maxBitrate));
        } else if (esdsData != null) {
            colorInfo.setAverageBitrate(i.A(esdsData.bitrate)).setPeakBitrate(i.A(esdsData.peakBitrate));
        }
        stsdData.format = colorInfo.build();
    }

    @Nullable
    private static Metadata parseXyz(ParsableByteArray parsableByteArray) {
        short readShort = parsableByteArray.readShort();
        parsableByteArray.skipBytes(2);
        String readString = parsableByteArray.readString(readShort);
        int max = Math.max(readString.lastIndexOf(43), readString.lastIndexOf(45));
        try {
            return new Metadata(new Mp4LocationData(Float.parseFloat(readString.substring(0, max)), Float.parseFloat(readString.substring(max, readString.length() - 1))));
        } catch (IndexOutOfBoundsException | NumberFormatException unused) {
            return null;
        }
    }
}
