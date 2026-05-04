package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class AvcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderFrames;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int width;

    private AvcConfig(List<byte[]> list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f11, @Nullable String str) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i11;
        this.width = i12;
        this.height = i13;
        this.bitdepthLuma = i14;
        this.bitdepthChroma = i15;
        this.colorSpace = i16;
        this.colorRange = i17;
        this.colorTransfer = i18;
        this.maxNumReorderFrames = i19;
        this.pixelWidthHeightRatio = f11;
        this.codecs = str;
    }

    private static byte[] buildNalUnitForChild(ParsableByteArray parsableByteArray) {
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition();
        parsableByteArray.skipBytes(readUnsignedShort);
        return CodecSpecificDataUtil.buildNalUnit(parsableByteArray.getData(), position, readUnsignedShort);
    }

    public static AvcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        String str;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        float f11;
        int i17;
        int i18;
        try {
            parsableByteArray.skipBytes(4);
            int readUnsignedByte = (parsableByteArray.readUnsignedByte() & 3) + 1;
            if (readUnsignedByte == 3) {
                throw new IllegalStateException();
            }
            ArrayList arrayList = new ArrayList();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte() & 31;
            for (int i19 = 0; i19 < readUnsignedByte2; i19++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
            for (int i21 = 0; i21 < readUnsignedByte3; i21++) {
                arrayList.add(buildNalUnitForChild(parsableByteArray));
            }
            if (readUnsignedByte2 > 0) {
                NalUnitUtil.SpsData parseSpsNalUnit = NalUnitUtil.parseSpsNalUnit((byte[]) arrayList.get(0), NalUnitUtil.NAL_START_CODE.length, ((byte[]) arrayList.get(0)).length);
                int i22 = parseSpsNalUnit.width;
                int i23 = parseSpsNalUnit.height;
                int i24 = parseSpsNalUnit.bitDepthLumaMinus8 + 8;
                int i25 = parseSpsNalUnit.bitDepthChromaMinus8 + 8;
                int i26 = parseSpsNalUnit.colorSpace;
                int i27 = parseSpsNalUnit.colorRange;
                int i28 = parseSpsNalUnit.colorTransfer;
                int i29 = parseSpsNalUnit.maxNumReorderFrames;
                float f12 = parseSpsNalUnit.pixelWidthHeightRatio;
                str = CodecSpecificDataUtil.buildAvcCodecString(parseSpsNalUnit.profileIdc, parseSpsNalUnit.constraintsFlagsAndReservedZero2Bits, parseSpsNalUnit.levelIdc);
                i15 = i28;
                i16 = i29;
                f11 = f12;
                i14 = i25;
                i17 = i26;
                i18 = i27;
                i11 = i22;
                i12 = i23;
                i13 = i24;
            } else {
                str = null;
                i11 = -1;
                i12 = -1;
                i13 = -1;
                i14 = -1;
                i15 = -1;
                i16 = 16;
                f11 = 1.0f;
                i17 = -1;
                i18 = -1;
            }
            return new AvcConfig(arrayList, readUnsignedByte, i11, i12, i13, i14, i17, i18, i15, i16, f11, str);
        } catch (ArrayIndexOutOfBoundsException e11) {
            throw ParserException.createForMalformedContainer("Error parsing AVC config", e11);
        }
    }
}
