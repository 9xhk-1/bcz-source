package androidx.media3.extractor;

import androidx.annotation.Nullable;
import androidx.media3.common.ParserException;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.NalUnitUtil;
import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class HevcConfig {
    public final int bitdepthChroma;
    public final int bitdepthLuma;

    @Nullable
    public final String codecs;
    public final int colorRange;
    public final int colorSpace;
    public final int colorTransfer;
    public final int height;
    public final List<byte[]> initializationData;
    public final int maxNumReorderPics;
    public final int maxSubLayers;
    public final int nalUnitLengthFieldLength;
    public final float pixelWidthHeightRatio;
    public final int stereoMode;

    @Nullable
    public final NalUnitUtil.H265VpsData vpsData;
    public final int width;

    private HevcConfig(List<byte[]> list, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, float f11, int i22, @Nullable String str, @Nullable NalUnitUtil.H265VpsData h265VpsData) {
        this.initializationData = list;
        this.nalUnitLengthFieldLength = i11;
        this.maxSubLayers = i12;
        this.width = i13;
        this.height = i14;
        this.bitdepthLuma = i15;
        this.bitdepthChroma = i16;
        this.colorSpace = i17;
        this.colorRange = i18;
        this.colorTransfer = i19;
        this.stereoMode = i21;
        this.pixelWidthHeightRatio = f11;
        this.maxNumReorderPics = i22;
        this.codecs = str;
        this.vpsData = h265VpsData;
    }

    public static HevcConfig parse(ParsableByteArray parsableByteArray) throws ParserException {
        return parseImpl(parsableByteArray, false, null);
    }

    private static HevcConfig parseImpl(ParsableByteArray parsableByteArray, boolean z11, @Nullable NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        boolean z12;
        int i11;
        NalUnitUtil.H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo;
        int i12;
        try {
            if (z11) {
                parsableByteArray.skipBytes(4);
            } else {
                parsableByteArray.skipBytes(21);
            }
            int readUnsignedByte = parsableByteArray.readUnsignedByte() & 3;
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int position = parsableByteArray.getPosition();
            int i13 = 0;
            int i14 = 0;
            int i15 = 0;
            while (true) {
                z12 = true;
                if (i14 >= readUnsignedByte2) {
                    break;
                }
                parsableByteArray.skipBytes(1);
                int readUnsignedShort = parsableByteArray.readUnsignedShort();
                for (int i16 = 0; i16 < readUnsignedShort; i16++) {
                    int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
                    i15 += readUnsignedShort2 + 4;
                    parsableByteArray.skipBytes(readUnsignedShort2);
                }
                i14++;
            }
            parsableByteArray.setPosition(position);
            byte[] bArr = new byte[i15];
            NalUnitUtil.H265VpsData h265VpsData2 = h265VpsData;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            int i25 = -1;
            int i26 = -1;
            int i27 = -1;
            float f11 = 1.0f;
            String str = null;
            int i28 = 0;
            int i29 = 0;
            while (i28 < readUnsignedByte2) {
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte() & 63;
                int readUnsignedShort3 = parsableByteArray.readUnsignedShort();
                int i31 = i13;
                NalUnitUtil.H265VpsData h265VpsData3 = h265VpsData2;
                while (i31 < readUnsignedShort3) {
                    int readUnsignedShort4 = parsableByteArray.readUnsignedShort();
                    boolean z13 = z12;
                    byte[] bArr2 = NalUnitUtil.NAL_START_CODE;
                    int i32 = readUnsignedByte;
                    System.arraycopy(bArr2, i13, bArr, i29, bArr2.length);
                    int length = i29 + bArr2.length;
                    System.arraycopy(parsableByteArray.getData(), parsableByteArray.getPosition(), bArr, length, readUnsignedShort4);
                    if (readUnsignedByte3 == 32 && i31 == 0) {
                        h265VpsData3 = NalUnitUtil.parseH265VpsNalUnit(bArr, length, length + readUnsignedShort4);
                        i11 = readUnsignedByte2;
                    } else {
                        if (readUnsignedByte3 == 33 && i31 == 0) {
                            NalUnitUtil.H265SpsData parseH265SpsNalUnit = NalUnitUtil.parseH265SpsNalUnit(bArr, length, length + readUnsignedShort4, h265VpsData3);
                            i17 = parseH265SpsNalUnit.maxSubLayersMinus1 + 1;
                            i18 = parseH265SpsNalUnit.width;
                            int i33 = parseH265SpsNalUnit.height;
                            i21 = parseH265SpsNalUnit.bitDepthLumaMinus8 + 8;
                            i22 = parseH265SpsNalUnit.bitDepthChromaMinus8 + 8;
                            int i34 = parseH265SpsNalUnit.colorSpace;
                            i11 = readUnsignedByte2;
                            int i35 = parseH265SpsNalUnit.colorRange;
                            int i36 = parseH265SpsNalUnit.colorTransfer;
                            float f12 = parseH265SpsNalUnit.pixelWidthHeightRatio;
                            int i37 = parseH265SpsNalUnit.maxNumReorderPics;
                            NalUnitUtil.H265ProfileTierLevel h265ProfileTierLevel = parseH265SpsNalUnit.profileTierLevel;
                            if (h265ProfileTierLevel != null) {
                                i12 = i37;
                                str = CodecSpecificDataUtil.buildHevcCodecString(h265ProfileTierLevel.generalProfileSpace, h265ProfileTierLevel.generalTierFlag, h265ProfileTierLevel.generalProfileIdc, h265ProfileTierLevel.generalProfileCompatibilityFlags, h265ProfileTierLevel.constraintBytes, h265ProfileTierLevel.generalLevelIdc);
                            } else {
                                i12 = i37;
                            }
                            f11 = f12;
                            i27 = i12;
                            i24 = i35;
                            i25 = i36;
                            i23 = i34;
                            i19 = i33;
                        } else {
                            i11 = readUnsignedByte2;
                            if (readUnsignedByte3 == 39 && i31 == 0 && (parseH265Sei3dRefDisplayInfo = NalUnitUtil.parseH265Sei3dRefDisplayInfo(bArr, length, length + readUnsignedShort4)) != null && h265VpsData3 != null) {
                                i13 = 0;
                                i26 = parseH265Sei3dRefDisplayInfo.leftViewId == h265VpsData3.layerInfos.get(0).viewId ? 4 : 5;
                            }
                        }
                        i13 = 0;
                    }
                    i29 = length + readUnsignedShort4;
                    parsableByteArray.skipBytes(readUnsignedShort4);
                    i31++;
                    z12 = z13;
                    readUnsignedByte = i32;
                    readUnsignedByte2 = i11;
                }
                i28++;
                h265VpsData2 = h265VpsData3;
            }
            return new HevcConfig(i15 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), readUnsignedByte + 1, i17, i18, i19, i21, i22, i23, i24, i25, i26, f11, i27, str, h265VpsData2);
        } catch (ArrayIndexOutOfBoundsException e11) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z11 ? "L-HEVC config" : "HEVC config");
            throw ParserException.createForMalformedContainer(sb2.toString(), e11);
        }
    }

    public static HevcConfig parseLayered(ParsableByteArray parsableByteArray, NalUnitUtil.H265VpsData h265VpsData) throws ParserException {
        return parseImpl(parsableByteArray, true, h265VpsData);
    }
}
