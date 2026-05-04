package androidx.media3.extractor;

import android.util.Base64;
import androidx.annotation.Nullable;
import androidx.media3.common.Metadata;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.metadata.flac.PictureFrame;
import androidx.media3.extractor.metadata.vorbis.VorbisComment;
import com.google.common.collect.ImmutableList;
import com.huawei.hms.framework.common.ContainerUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class VorbisUtil {
    private static final String TAG = "VorbisUtil";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CommentHeader {
        public final String[] comments;
        public final int length;
        public final String vendor;

        public CommentHeader(String str, String[] strArr, int i11) {
            this.vendor = str;
            this.comments = strArr;
            this.length = i11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Mode {
        public final boolean blockFlag;
        public final int mapping;
        public final int transformType;
        public final int windowType;

        public Mode(boolean z11, int i11, int i12, int i13) {
            this.blockFlag = z11;
            this.windowType = i11;
            this.transformType = i12;
            this.mapping = i13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class VorbisIdHeader {
        public final int bitrateMaximum;
        public final int bitrateMinimum;
        public final int bitrateNominal;
        public final int blockSize0;
        public final int blockSize1;
        public final int channels;
        public final byte[] data;
        public final boolean framingFlag;
        public final int sampleRate;
        public final int version;

        public VorbisIdHeader(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, boolean z11, byte[] bArr) {
            this.version = i11;
            this.channels = i12;
            this.sampleRate = i13;
            this.bitrateMaximum = i14;
            this.bitrateNominal = i15;
            this.bitrateMinimum = i16;
            this.blockSize0 = i17;
            this.blockSize1 = i18;
            this.framingFlag = z11;
            this.data = bArr;
        }
    }

    private VorbisUtil() {
    }

    @Nullable
    public static int[] getVorbisToAndroidChannelLayoutMapping(int i11) {
        if (i11 == 3) {
            return new int[]{0, 2, 1};
        }
        if (i11 == 5) {
            return new int[]{0, 2, 1, 3, 4};
        }
        if (i11 == 6) {
            return new int[]{0, 2, 1, 5, 3, 4};
        }
        if (i11 == 7) {
            return new int[]{0, 2, 1, 6, 5, 3, 4};
        }
        if (i11 != 8) {
            return null;
        }
        return new int[]{0, 2, 1, 7, 5, 6, 3, 4};
    }

    public static int iLog(int i11) {
        int i12 = 0;
        while (i11 > 0) {
            i12++;
            i11 >>>= 1;
        }
        return i12;
    }

    private static long mapType1QuantValues(long j11, long j12) {
        return (long) Math.floor(Math.pow(j11, 1.0d / j12));
    }

    @Nullable
    public static Metadata parseVorbisComments(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < list.size(); i11++) {
            String str = list.get(i11);
            String[] splitAtFirst = Util.splitAtFirst(str, ContainerUtils.KEY_VALUE_DELIMITER);
            if (splitAtFirst.length != 2) {
                Log.w(TAG, "Failed to parse Vorbis comment: " + str);
            } else if (splitAtFirst[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    arrayList.add(PictureFrame.fromPictureBlock(new ParsableByteArray(Base64.decode(splitAtFirst[1], 0))));
                } catch (RuntimeException e11) {
                    Log.w(TAG, "Failed to parse vorbis picture", e11);
                }
            } else {
                arrayList.add(new VorbisComment(splitAtFirst[0], splitAtFirst[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    public static ImmutableList<byte[]> parseVorbisCsdFromEsdsInitializationData(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.skipBytes(1);
        int i11 = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i11 += 255;
            parsableByteArray.skipBytes(1);
        }
        int readUnsignedByte = i11 + parsableByteArray.readUnsignedByte();
        int i12 = 0;
        while (parsableByteArray.bytesLeft() > 0 && parsableByteArray.peekUnsignedByte() == 255) {
            i12 += 255;
            parsableByteArray.skipBytes(1);
        }
        int readUnsignedByte2 = i12 + parsableByteArray.readUnsignedByte();
        byte[] bArr2 = new byte[readUnsignedByte];
        int position = parsableByteArray.getPosition();
        System.arraycopy(bArr, position, bArr2, 0, readUnsignedByte);
        int i13 = position + readUnsignedByte + readUnsignedByte2;
        int length = bArr.length - i13;
        byte[] bArr3 = new byte[length];
        System.arraycopy(bArr, i13, bArr3, 0, length);
        return ImmutableList.of(bArr2, bArr3);
    }

    private static void readFloors(VorbisBitArray vorbisBitArray) throws ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i11 = 0; i11 < readBits; i11++) {
            int readBits2 = vorbisBitArray.readBits(16);
            if (readBits2 == 0) {
                vorbisBitArray.skipBits(8);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(16);
                vorbisBitArray.skipBits(6);
                vorbisBitArray.skipBits(8);
                int readBits3 = vorbisBitArray.readBits(4) + 1;
                for (int i12 = 0; i12 < readBits3; i12++) {
                    vorbisBitArray.skipBits(8);
                }
            } else {
                if (readBits2 != 1) {
                    throw ParserException.createForMalformedContainer("floor type greater than 1 not decodable: " + readBits2, null);
                }
                int readBits4 = vorbisBitArray.readBits(5);
                int[] iArr = new int[readBits4];
                int i13 = -1;
                for (int i14 = 0; i14 < readBits4; i14++) {
                    int readBits5 = vorbisBitArray.readBits(4);
                    iArr[i14] = readBits5;
                    if (readBits5 > i13) {
                        i13 = readBits5;
                    }
                }
                int i15 = i13 + 1;
                int[] iArr2 = new int[i15];
                for (int i16 = 0; i16 < i15; i16++) {
                    iArr2[i16] = vorbisBitArray.readBits(3) + 1;
                    int readBits6 = vorbisBitArray.readBits(2);
                    if (readBits6 > 0) {
                        vorbisBitArray.skipBits(8);
                    }
                    for (int i17 = 0; i17 < (1 << readBits6); i17++) {
                        vorbisBitArray.skipBits(8);
                    }
                }
                vorbisBitArray.skipBits(2);
                int readBits7 = vorbisBitArray.readBits(4);
                int i18 = 0;
                int i19 = 0;
                for (int i21 = 0; i21 < readBits4; i21++) {
                    i18 += iArr2[iArr[i21]];
                    while (i19 < i18) {
                        vorbisBitArray.skipBits(readBits7);
                        i19++;
                    }
                }
            }
        }
    }

    private static void readMappings(int i11, VorbisBitArray vorbisBitArray) throws ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i12 = 0; i12 < readBits; i12++) {
            int readBits2 = vorbisBitArray.readBits(16);
            if (readBits2 != 0) {
                Log.e(TAG, "mapping type other than 0 not supported: " + readBits2);
            } else {
                int readBits3 = vorbisBitArray.readBit() ? vorbisBitArray.readBits(4) + 1 : 1;
                if (vorbisBitArray.readBit()) {
                    int readBits4 = vorbisBitArray.readBits(8) + 1;
                    for (int i13 = 0; i13 < readBits4; i13++) {
                        int i14 = i11 - 1;
                        vorbisBitArray.skipBits(iLog(i14));
                        vorbisBitArray.skipBits(iLog(i14));
                    }
                }
                if (vorbisBitArray.readBits(2) != 0) {
                    throw ParserException.createForMalformedContainer("to reserved bits must be zero after mapping coupling steps", null);
                }
                if (readBits3 > 1) {
                    for (int i15 = 0; i15 < i11; i15++) {
                        vorbisBitArray.skipBits(4);
                    }
                }
                for (int i16 = 0; i16 < readBits3; i16++) {
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                    vorbisBitArray.skipBits(8);
                }
            }
        }
    }

    private static Mode[] readModes(VorbisBitArray vorbisBitArray) {
        int readBits = vorbisBitArray.readBits(6) + 1;
        Mode[] modeArr = new Mode[readBits];
        for (int i11 = 0; i11 < readBits; i11++) {
            modeArr[i11] = new Mode(vorbisBitArray.readBit(), vorbisBitArray.readBits(16), vorbisBitArray.readBits(16), vorbisBitArray.readBits(8));
        }
        return modeArr;
    }

    private static void readResidues(VorbisBitArray vorbisBitArray) throws ParserException {
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i11 = 0; i11 < readBits; i11++) {
            if (vorbisBitArray.readBits(16) > 2) {
                throw ParserException.createForMalformedContainer("residueType greater than 2 is not decodable", null);
            }
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            vorbisBitArray.skipBits(24);
            int readBits2 = vorbisBitArray.readBits(6) + 1;
            vorbisBitArray.skipBits(8);
            int[] iArr = new int[readBits2];
            for (int i12 = 0; i12 < readBits2; i12++) {
                iArr[i12] = ((vorbisBitArray.readBit() ? vorbisBitArray.readBits(5) : 0) * 8) + vorbisBitArray.readBits(3);
            }
            for (int i13 = 0; i13 < readBits2; i13++) {
                for (int i14 = 0; i14 < 8; i14++) {
                    if ((iArr[i13] & (1 << i14)) != 0) {
                        vorbisBitArray.skipBits(8);
                    }
                }
            }
        }
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsableByteArray) throws ParserException {
        return readVorbisCommentHeader(parsableByteArray, true, true);
    }

    public static VorbisIdHeader readVorbisIdentificationHeader(ParsableByteArray parsableByteArray) throws ParserException {
        verifyVorbisHeaderCapturePattern(1, parsableByteArray, false);
        int readLittleEndianUnsignedIntToInt = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readLittleEndianUnsignedIntToInt2 = parsableByteArray.readLittleEndianUnsignedIntToInt();
        int readLittleEndianInt = parsableByteArray.readLittleEndianInt();
        if (readLittleEndianInt <= 0) {
            readLittleEndianInt = -1;
        }
        int readLittleEndianInt2 = parsableByteArray.readLittleEndianInt();
        if (readLittleEndianInt2 <= 0) {
            readLittleEndianInt2 = -1;
        }
        int readLittleEndianInt3 = parsableByteArray.readLittleEndianInt();
        if (readLittleEndianInt3 <= 0) {
            readLittleEndianInt3 = -1;
        }
        int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
        return new VorbisIdHeader(readLittleEndianUnsignedIntToInt, readUnsignedByte, readLittleEndianUnsignedIntToInt2, readLittleEndianInt, readLittleEndianInt2, readLittleEndianInt3, (int) Math.pow(2.0d, readUnsignedByte2 & 15), (int) Math.pow(2.0d, (readUnsignedByte2 & 240) >> 4), (parsableByteArray.readUnsignedByte() & 1) > 0, Arrays.copyOf(parsableByteArray.getData(), parsableByteArray.limit()));
    }

    public static Mode[] readVorbisModes(ParsableByteArray parsableByteArray, int i11) throws ParserException {
        verifyVorbisHeaderCapturePattern(5, parsableByteArray, false);
        int readUnsignedByte = parsableByteArray.readUnsignedByte() + 1;
        VorbisBitArray vorbisBitArray = new VorbisBitArray(parsableByteArray.getData());
        vorbisBitArray.skipBits(parsableByteArray.getPosition() * 8);
        for (int i12 = 0; i12 < readUnsignedByte; i12++) {
            skipBook(vorbisBitArray);
        }
        int readBits = vorbisBitArray.readBits(6) + 1;
        for (int i13 = 0; i13 < readBits; i13++) {
            if (vorbisBitArray.readBits(16) != 0) {
                throw ParserException.createForMalformedContainer("placeholder of time domain transforms not zeroed out", null);
            }
        }
        readFloors(vorbisBitArray);
        readResidues(vorbisBitArray);
        readMappings(i11, vorbisBitArray);
        Mode[] readModes = readModes(vorbisBitArray);
        if (vorbisBitArray.readBit()) {
            return readModes;
        }
        throw ParserException.createForMalformedContainer("framing bit after modes not set as expected", null);
    }

    private static void skipBook(VorbisBitArray vorbisBitArray) throws ParserException {
        if (vorbisBitArray.readBits(24) != 5653314) {
            throw ParserException.createForMalformedContainer("expected code book to start with [0x56, 0x43, 0x42] at " + vorbisBitArray.getPosition(), null);
        }
        int readBits = vorbisBitArray.readBits(16);
        int readBits2 = vorbisBitArray.readBits(24);
        int i11 = 0;
        if (vorbisBitArray.readBit()) {
            vorbisBitArray.skipBits(5);
            while (i11 < readBits2) {
                i11 += vorbisBitArray.readBits(iLog(readBits2 - i11));
            }
        } else {
            boolean readBit = vorbisBitArray.readBit();
            while (i11 < readBits2) {
                if (!readBit) {
                    vorbisBitArray.skipBits(5);
                } else if (vorbisBitArray.readBit()) {
                    vorbisBitArray.skipBits(5);
                }
                i11++;
            }
        }
        int readBits3 = vorbisBitArray.readBits(4);
        if (readBits3 > 2) {
            throw ParserException.createForMalformedContainer("lookup type greater than 2 not decodable: " + readBits3, null);
        }
        if (readBits3 == 1 || readBits3 == 2) {
            vorbisBitArray.skipBits(32);
            vorbisBitArray.skipBits(32);
            int readBits4 = vorbisBitArray.readBits(4) + 1;
            vorbisBitArray.skipBits(1);
            vorbisBitArray.skipBits((int) ((readBits3 == 1 ? readBits != 0 ? mapType1QuantValues(readBits2, readBits) : 0L : readBits * readBits2) * readBits4));
        }
    }

    public static boolean verifyVorbisHeaderCapturePattern(int i11, ParsableByteArray parsableByteArray, boolean z11) throws ParserException {
        if (parsableByteArray.bytesLeft() < 7) {
            if (z11) {
                return false;
            }
            throw ParserException.createForMalformedContainer("too short header: " + parsableByteArray.bytesLeft(), null);
        }
        if (parsableByteArray.readUnsignedByte() != i11) {
            if (z11) {
                return false;
            }
            throw ParserException.createForMalformedContainer("expected header type " + Integer.toHexString(i11), null);
        }
        if (parsableByteArray.readUnsignedByte() == 118 && parsableByteArray.readUnsignedByte() == 111 && parsableByteArray.readUnsignedByte() == 114 && parsableByteArray.readUnsignedByte() == 98 && parsableByteArray.readUnsignedByte() == 105 && parsableByteArray.readUnsignedByte() == 115) {
            return true;
        }
        if (z11) {
            return false;
        }
        throw ParserException.createForMalformedContainer("expected characters 'vorbis'", null);
    }

    public static CommentHeader readVorbisCommentHeader(ParsableByteArray parsableByteArray, boolean z11, boolean z12) throws ParserException {
        if (z11) {
            verifyVorbisHeaderCapturePattern(3, parsableByteArray, false);
        }
        String readString = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
        int length = readString.length();
        long readLittleEndianUnsignedInt = parsableByteArray.readLittleEndianUnsignedInt();
        String[] strArr = new String[(int) readLittleEndianUnsignedInt];
        int i11 = length + 15;
        for (int i12 = 0; i12 < readLittleEndianUnsignedInt; i12++) {
            String readString2 = parsableByteArray.readString((int) parsableByteArray.readLittleEndianUnsignedInt());
            strArr[i12] = readString2;
            i11 = i11 + 4 + readString2.length();
        }
        if (z12 && (parsableByteArray.readUnsignedByte() & 1) == 0) {
            throw ParserException.createForMalformedContainer("framing bit expected to be set", null);
        }
        return new CommentHeader(readString, strArr, i11 + 1);
    }
}
