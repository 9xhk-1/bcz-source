package androidx.media3.container;

import androidx.annotation.Nullable;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.CodecSpecificDataUtil;
import androidx.media3.common.util.UnstableApi;
import com.google.common.collect.ImmutableList;
import com.google.common.math.c;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class NalUnitUtil {
    public static final int EXTENDED_SAR = 255;
    public static final int H264_NAL_UNIT_TYPE_AUD = 9;
    public static final int H264_NAL_UNIT_TYPE_IDR = 5;
    public static final int H264_NAL_UNIT_TYPE_NON_IDR = 1;
    public static final int H264_NAL_UNIT_TYPE_PARTITION_A = 2;
    public static final int H264_NAL_UNIT_TYPE_PPS = 8;
    public static final int H264_NAL_UNIT_TYPE_PREFIX = 14;
    public static final int H264_NAL_UNIT_TYPE_SEI = 6;
    public static final int H264_NAL_UNIT_TYPE_SPS = 7;
    public static final int H264_NAL_UNIT_TYPE_UNSPECIFIED = 24;
    public static final int H265_NAL_UNIT_TYPE_AUD = 35;
    public static final int H265_NAL_UNIT_TYPE_BLA_W_LP = 16;
    public static final int H265_NAL_UNIT_TYPE_CRA = 21;
    public static final int H265_NAL_UNIT_TYPE_PPS = 34;
    public static final int H265_NAL_UNIT_TYPE_PREFIX_SEI = 39;
    public static final int H265_NAL_UNIT_TYPE_RASL_R = 9;
    public static final int H265_NAL_UNIT_TYPE_SPS = 33;
    public static final int H265_NAL_UNIT_TYPE_SUFFIX_SEI = 40;
    public static final int H265_NAL_UNIT_TYPE_UNSPECIFIED = 48;
    public static final int H265_NAL_UNIT_TYPE_VPS = 32;
    private static final int INVALID_ID = -1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_AUD = 9;

    @Deprecated
    public static final int NAL_UNIT_TYPE_IDR = 5;

    @Deprecated
    public static final int NAL_UNIT_TYPE_NON_IDR = 1;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PARTITION_A = 2;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PPS = 8;

    @Deprecated
    public static final int NAL_UNIT_TYPE_PREFIX = 14;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SEI = 6;

    @Deprecated
    public static final int NAL_UNIT_TYPE_SPS = 7;
    private static final String TAG = "NalUnitUtil";
    public static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    public static final float[] ASPECT_RATIO_IDC_VALUES = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};
    private static final Object scratchEscapePositionsLock = new Object();
    private static int[] scratchEscapePositions = new int[10];

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265LayerInfo {
        public final int layerIdInVps;
        public final int viewId;

        public H265LayerInfo(int i11, int i12) {
            this.layerIdInVps = i11;
            this.viewId = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265NalHeader {
        public final int layerId;
        public final int nalUnitType;
        public final int temporalId;

        public H265NalHeader(int i11, int i12, int i13) {
            this.nalUnitType = i11;
            this.layerId = i12;
            this.temporalId = i13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265ProfileTierLevel {
        public final int[] constraintBytes;
        public final int generalLevelIdc;
        public final int generalProfileCompatibilityFlags;
        public final int generalProfileIdc;
        public final int generalProfileSpace;
        public final boolean generalTierFlag;

        public H265ProfileTierLevel(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
            this.generalProfileSpace = i11;
            this.generalTierFlag = z11;
            this.generalProfileIdc = i12;
            this.generalProfileCompatibilityFlags = i13;
            this.constraintBytes = iArr;
            this.generalLevelIdc = i14;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265ProfileTierLevelsAndIndices {
        public final int[] indices;
        public final ImmutableList<H265ProfileTierLevel> profileTierLevels;

        public H265ProfileTierLevelsAndIndices(List<H265ProfileTierLevel> list, int[] iArr) {
            this.profileTierLevels = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265RepFormat {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int height;
        public final int width;

        public H265RepFormat(int i11, int i12, int i13, int i14, int i15) {
            this.chromaFormatIdc = i11;
            this.bitDepthLumaMinus8 = i12;
            this.bitDepthChromaMinus8 = i13;
            this.width = i14;
            this.height = i15;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265RepFormatsAndIndices {
        public final int[] indices;
        public final ImmutableList<H265RepFormat> repFormats;

        public H265RepFormatsAndIndices(List<H265RepFormat> list, int[] iArr) {
            this.repFormats = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265Sei3dRefDisplayInfoData {
        public final int exponentRefDisplayWidth;
        public final int exponentRefViewingDist;
        public final int leftViewId;
        public final int mantissaRefDisplayWidth;
        public final int mantissaRefViewingDist;
        public final int numRefDisplays;
        public final int precRefDisplayWidth;
        public final int precRefViewingDist;
        public final int rightViewId;

        public H265Sei3dRefDisplayInfoData(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
            this.precRefDisplayWidth = i11;
            this.precRefViewingDist = i12;
            this.numRefDisplays = i13;
            this.leftViewId = i14;
            this.rightViewId = i15;
            this.exponentRefDisplayWidth = i16;
            this.mantissaRefDisplayWidth = i17;
            this.exponentRefViewingDist = i18;
            this.mantissaRefViewingDist = i19;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int chromaFormatIdc;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int height;
        public final int maxNumReorderPics;
        public final int maxSubLayersMinus1;
        public final H265NalHeader nalHeader;
        public final float pixelWidthHeightRatio;

        @Nullable
        public final H265ProfileTierLevel profileTierLevel;
        public final int seqParameterSetId;
        public final int width;

        public H265SpsData(H265NalHeader h265NalHeader, int i11, @Nullable H265ProfileTierLevel h265ProfileTierLevel, int i12, int i13, int i14, int i15, int i16, int i17, float f11, int i18, int i19, int i21, int i22) {
            this.nalHeader = h265NalHeader;
            this.maxSubLayersMinus1 = i11;
            this.profileTierLevel = h265ProfileTierLevel;
            this.chromaFormatIdc = i12;
            this.bitDepthLumaMinus8 = i13;
            this.bitDepthChromaMinus8 = i14;
            this.seqParameterSetId = i15;
            this.width = i16;
            this.height = i17;
            this.pixelWidthHeightRatio = f11;
            this.maxNumReorderPics = i18;
            this.colorSpace = i19;
            this.colorRange = i21;
            this.colorTransfer = i22;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265VideoSignalInfo {
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;

        public H265VideoSignalInfo(int i11, int i12, int i13) {
            this.colorSpace = i11;
            this.colorRange = i12;
            this.colorTransfer = i13;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265VideoSignalInfosAndIndices {
        public final int[] indices;
        public final ImmutableList<H265VideoSignalInfo> videoSignalInfos;

        public H265VideoSignalInfosAndIndices(List<H265VideoSignalInfo> list, int[] iArr) {
            this.videoSignalInfos = ImmutableList.copyOf((Collection) list);
            this.indices = iArr;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class H265VpsData {
        public final ImmutableList<H265LayerInfo> layerInfos;
        public final H265NalHeader nalHeader;
        public final H265ProfileTierLevelsAndIndices profileTierLevelsAndIndices;

        @Nullable
        public final H265RepFormatsAndIndices repFormatsAndIndices;

        @Nullable
        public final H265VideoSignalInfosAndIndices videoSignalInfosAndIndices;

        public H265VpsData(H265NalHeader h265NalHeader, @Nullable List<H265LayerInfo> list, H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices, @Nullable H265RepFormatsAndIndices h265RepFormatsAndIndices, @Nullable H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices) {
            this.nalHeader = h265NalHeader;
            this.layerInfos = list != null ? ImmutableList.copyOf((Collection) list) : ImmutableList.of();
            this.profileTierLevelsAndIndices = h265ProfileTierLevelsAndIndices;
            this.repFormatsAndIndices = h265RepFormatsAndIndices;
            this.videoSignalInfosAndIndices = h265VideoSignalInfosAndIndices;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PpsData {
        public final boolean bottomFieldPicOrderInFramePresentFlag;
        public final int picParameterSetId;
        public final int seqParameterSetId;

        public PpsData(int i11, int i12, boolean z11) {
            this.picParameterSetId = i11;
            this.seqParameterSetId = i12;
            this.bottomFieldPicOrderInFramePresentFlag = z11;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SpsData {
        public final int bitDepthChromaMinus8;
        public final int bitDepthLumaMinus8;
        public final int colorRange;
        public final int colorSpace;
        public final int colorTransfer;
        public final int constraintsFlagsAndReservedZero2Bits;
        public final boolean deltaPicOrderAlwaysZeroFlag;
        public final boolean frameMbsOnlyFlag;
        public final int frameNumLength;
        public final int height;
        public final int levelIdc;
        public final int maxNumRefFrames;
        public final int maxNumReorderFrames;
        public final int picOrderCntLsbLength;
        public final int picOrderCountType;
        public final float pixelWidthHeightRatio;
        public final int profileIdc;
        public final boolean separateColorPlaneFlag;
        public final int seqParameterSetId;
        public final int width;

        public SpsData(int i11, int i12, int i13, int i14, int i15, int i16, int i17, float f11, int i18, int i19, boolean z11, boolean z12, int i21, int i22, int i23, boolean z13, int i24, int i25, int i26, int i27) {
            this.profileIdc = i11;
            this.constraintsFlagsAndReservedZero2Bits = i12;
            this.levelIdc = i13;
            this.seqParameterSetId = i14;
            this.maxNumRefFrames = i15;
            this.width = i16;
            this.height = i17;
            this.pixelWidthHeightRatio = f11;
            this.bitDepthLumaMinus8 = i18;
            this.bitDepthChromaMinus8 = i19;
            this.separateColorPlaneFlag = z11;
            this.frameMbsOnlyFlag = z12;
            this.frameNumLength = i21;
            this.picOrderCountType = i22;
            this.picOrderCntLsbLength = i23;
            this.deltaPicOrderAlwaysZeroFlag = z13;
            this.colorSpace = i24;
            this.colorRange = i25;
            this.colorTransfer = i26;
            this.maxNumReorderFrames = i27;
        }
    }

    private NalUnitUtil() {
    }

    private static int applyConformanceWindowToHeight(int i11, int i12, int i13, int i14) {
        return i11 - ((i12 == 1 ? 2 : 1) * (i13 + i14));
    }

    private static int applyConformanceWindowToWidth(int i11, int i12, int i13, int i14) {
        int i15 = 2;
        if (i12 != 1 && i12 != 2) {
            i15 = 1;
        }
        return i11 - (i15 * (i13 + i14));
    }

    public static void clearPrefixFlags(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    @Nullable
    private static String createCodecStringFromH265SpsPalyoad(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(4);
        int readBits = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBit();
        H265ProfileTierLevel parseH265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, readBits, null);
        return CodecSpecificDataUtil.buildHevcCodecString(parseH265ProfileTierLevel.generalProfileSpace, parseH265ProfileTierLevel.generalTierFlag, parseH265ProfileTierLevel.generalProfileIdc, parseH265ProfileTierLevel.generalProfileCompatibilityFlags, parseH265ProfileTierLevel.constraintBytes, parseH265ProfileTierLevel.generalLevelIdc);
    }

    public static void discardToSps(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i11 + 1;
            if (i13 >= position) {
                byteBuffer.clear();
                return;
            }
            int i14 = byteBuffer.get(i11) & 255;
            if (i12 == 3) {
                if (i14 == 1 && (byteBuffer.get(i13) & 31) == 7) {
                    ByteBuffer duplicate = byteBuffer.duplicate();
                    duplicate.position(i11 - 3);
                    duplicate.limit(position);
                    byteBuffer.position(0);
                    byteBuffer.put(duplicate);
                    return;
                }
            } else if (i14 == 0) {
                i12++;
            }
            if (i14 != 0) {
                i12 = 0;
            }
            i11 = i13;
        }
    }

    public static int findNalUnit(byte[] bArr, int i11, int i12, boolean[] zArr) {
        int i13 = i12 - i11;
        Assertions.checkState(i13 >= 0);
        if (i13 == 0) {
            return i12;
        }
        if (zArr[0]) {
            clearPrefixFlags(zArr);
            return i11 - 3;
        }
        if (i13 > 1 && zArr[1] && bArr[i11] == 1) {
            clearPrefixFlags(zArr);
            return i11 - 2;
        }
        if (i13 > 2 && zArr[2] && bArr[i11] == 0 && bArr[i11 + 1] == 1) {
            clearPrefixFlags(zArr);
            return i11 - 1;
        }
        int i14 = i12 - 1;
        int i15 = i11 + 2;
        while (i15 < i14) {
            byte b11 = bArr[i15];
            if ((b11 & 254) == 0) {
                int i16 = i15 - 2;
                if (bArr[i16] == 0 && bArr[i15 - 1] == 0 && b11 == 1) {
                    clearPrefixFlags(zArr);
                    return i16;
                }
                i15 -= 2;
            }
            i15 += 3;
        }
        zArr[0] = i13 <= 2 ? !(i13 != 2 ? !(zArr[1] && bArr[i14] == 1) : !(zArr[2] && bArr[i12 + (-2)] == 0 && bArr[i14] == 1)) : bArr[i12 + (-3)] == 0 && bArr[i12 + (-2)] == 0 && bArr[i14] == 1;
        zArr[1] = i13 <= 1 ? zArr[2] && bArr[i14] == 0 : bArr[i12 + (-2)] == 0 && bArr[i14] == 0;
        zArr[2] = bArr[i14] == 0;
        return i12;
    }

    private static ImmutableList<Integer> findNalUnitPositions(byte[] bArr) {
        boolean[] zArr = new boolean[3];
        ImmutableList.a builder = ImmutableList.builder();
        int i11 = 0;
        while (i11 < bArr.length) {
            int findNalUnit = findNalUnit(bArr, i11, bArr.length, zArr);
            if (findNalUnit != bArr.length) {
                builder.g(Integer.valueOf(findNalUnit));
            }
            i11 = findNalUnit + 3;
        }
        return builder.e();
    }

    private static int findNextUnescapeIndex(byte[] bArr, int i11, int i12) {
        while (i11 < i12 - 2) {
            if (bArr[i11] == 0 && bArr[i11 + 1] == 0 && bArr[i11 + 2] == 3) {
                return i11;
            }
            i11++;
        }
        return i12;
    }

    @Nullable
    public static String getH265BaseLayerCodecsString(List<byte[]> list) {
        for (int i11 = 0; i11 < list.size(); i11++) {
            byte[] bArr = list.get(i11);
            int length = bArr.length;
            if (length > 3) {
                ImmutableList<Integer> findNalUnitPositions = findNalUnitPositions(bArr);
                for (int i12 = 0; i12 < findNalUnitPositions.size(); i12++) {
                    if (findNalUnitPositions.get(i12).intValue() + 3 < length) {
                        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, findNalUnitPositions.get(i12).intValue() + 3, length);
                        H265NalHeader parseH265NalHeader = parseH265NalHeader(parsableNalUnitBitArray);
                        if (parseH265NalHeader.nalUnitType == 33 && parseH265NalHeader.layerId == 0) {
                            return createCodecStringFromH265SpsPalyoad(parsableNalUnitBitArray);
                        }
                    }
                }
            }
        }
        return null;
    }

    public static int getH265NalUnitType(byte[] bArr, int i11) {
        return (bArr[i11 + 3] & 126) >> 1;
    }

    public static int getNalUnitType(byte[] bArr, int i11) {
        return bArr[i11 + 3] & 31;
    }

    public static boolean isDependedOn(byte[] bArr, int i11, int i12, Format format) {
        if (Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H264)) {
            return isH264NalUnitDependedOn(bArr[i11]);
        }
        if (Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265)) {
            return isH265NalUnitDependedOn(bArr, i11, i12, format);
        }
        return true;
    }

    public static boolean isH264NalUnitDependedOn(byte b11) {
        if (((b11 & 96) >> 5) != 0) {
            return true;
        }
        int i11 = b11 & 31;
        return (i11 == 1 || i11 == 9 || i11 == 14) ? false : true;
    }

    private static boolean isH265NalUnitDependedOn(byte[] bArr, int i11, int i12, Format format) {
        H265NalHeader parseH265NalHeader = parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i11, i12 + i11));
        int i13 = parseH265NalHeader.nalUnitType;
        if (i13 == 35) {
            return false;
        }
        return (i13 <= 14 && i13 % 2 == 0 && parseH265NalHeader.temporalId == format.maxSubLayers - 1) ? false : true;
    }

    @Deprecated
    public static boolean isNalUnitSei(@Nullable String str, byte b11) {
        return (MimeTypes.VIDEO_H264.equals(str) && (b11 & 31) == 6) || (MimeTypes.VIDEO_H265.equals(str) && ((b11 & 126) >> 1) == 39);
    }

    public static int numberOfBytesInNalUnitHeader(Format format) {
        if (Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H264)) {
            return 1;
        }
        return (Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265) || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, MimeTypes.VIDEO_H265)) ? 2 : 0;
    }

    private static H265NalHeader parseH265NalHeader(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBit();
        return new H265NalHeader(parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(6), parsableNalUnitBitArray.readBits(3) - 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.container.NalUnitUtil.H265ProfileTierLevel parseH265ProfileTierLevel(androidx.media3.container.ParsableNalUnitBitArray r19, boolean r20, int r21, @androidx.annotation.Nullable androidx.media3.container.NalUnitUtil.H265ProfileTierLevel r22) {
        /*
            r0 = r19
            r1 = r21
            r2 = r22
            r3 = 6
            int[] r4 = new int[r3]
            r5 = 2
            r6 = 8
            r7 = 0
            if (r20 == 0) goto L42
            int r2 = r0.readBits(r5)
            boolean r8 = r0.readBit()
            r9 = 5
            int r9 = r0.readBits(r9)
            r10 = r7
            r11 = r10
        L1e:
            r12 = 32
            if (r10 >= r12) goto L2e
            boolean r12 = r0.readBit()
            if (r12 == 0) goto L2b
            r12 = 1
            int r12 = r12 << r10
            r11 = r11 | r12
        L2b:
            int r10 = r10 + 1
            goto L1e
        L2e:
            r10 = r7
        L2f:
            if (r10 >= r3) goto L3a
            int r12 = r0.readBits(r6)
            r4[r10] = r12
            int r10 = r10 + 1
            goto L2f
        L3a:
            r13 = r2
        L3b:
            r17 = r4
            r14 = r8
            r15 = r9
            r16 = r11
            goto L57
        L42:
            if (r2 == 0) goto L50
            int r3 = r2.generalProfileSpace
            boolean r8 = r2.generalTierFlag
            int r9 = r2.generalProfileIdc
            int r11 = r2.generalProfileCompatibilityFlags
            int[] r4 = r2.constraintBytes
            r13 = r3
            goto L3b
        L50:
            r17 = r4
            r13 = r7
            r14 = r13
            r15 = r14
            r16 = r15
        L57:
            int r18 = r0.readBits(r6)
            r2 = r7
        L5c:
            if (r7 >= r1) goto L71
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L66
            int r2 = r2 + 88
        L66:
            boolean r3 = r0.readBit()
            if (r3 == 0) goto L6e
            int r2 = r2 + 8
        L6e:
            int r7 = r7 + 1
            goto L5c
        L71:
            r0.skipBits(r2)
            if (r1 <= 0) goto L7b
            int r6 = r6 - r1
            int r6 = r6 * r5
            r0.skipBits(r6)
        L7b:
            androidx.media3.container.NalUnitUtil$H265ProfileTierLevel r12 = new androidx.media3.container.NalUnitUtil$H265ProfileTierLevel
            r12.<init>(r13, r14, r15, r16, r17, r18)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseH265ProfileTierLevel(androidx.media3.container.ParsableNalUnitBitArray, boolean, int, androidx.media3.container.NalUnitUtil$H265ProfileTierLevel):androidx.media3.container.NalUnitUtil$H265ProfileTierLevel");
    }

    private static H265RepFormat parseH265RepFormat(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int i11;
        int i12;
        int i13;
        int readBits = parsableNalUnitBitArray.readBits(16);
        int readBits2 = parsableNalUnitBitArray.readBits(16);
        if (parsableNalUnitBitArray.readBit()) {
            int readBits3 = parsableNalUnitBitArray.readBits(2);
            if (readBits3 == 3) {
                parsableNalUnitBitArray.skipBit();
            }
            int readBits4 = parsableNalUnitBitArray.readBits(4);
            i13 = parsableNalUnitBitArray.readBits(4);
            i12 = readBits4;
            i11 = readBits3;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = 0;
        }
        if (parsableNalUnitBitArray.readBit()) {
            int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            readBits = applyConformanceWindowToWidth(readBits, i11, readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2);
            readBits2 = applyConformanceWindowToHeight(readBits2, i11, readUnsignedExpGolombCodedInt3, readUnsignedExpGolombCodedInt4);
        }
        return new H265RepFormat(i11, i12, i13, readBits, readBits2);
    }

    private static H265RepFormatsAndIndices parseH265RepFormatsAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int i12 = readUnsignedExpGolombCodedInt + 1;
        ImmutableList.a builderWithExpectedSize = ImmutableList.builderWithExpectedSize(i12);
        int[] iArr = new int[i11];
        for (int i13 = 0; i13 < i12; i13++) {
            builderWithExpectedSize.g(parseH265RepFormat(parsableNalUnitBitArray));
        }
        int i14 = 1;
        if (i12 <= 1 || !parsableNalUnitBitArray.readBit()) {
            while (i14 < i11) {
                iArr[i14] = Math.min(i14, readUnsignedExpGolombCodedInt);
                i14++;
            }
        } else {
            int h11 = c.h(i12, RoundingMode.CEILING);
            while (i14 < i11) {
                iArr[i14] = parsableNalUnitBitArray.readBits(h11);
                i14++;
            }
        }
        return new H265RepFormatsAndIndices(builderWithExpectedSize.e(), iArr);
    }

    @Nullable
    public static H265Sei3dRefDisplayInfoData parseH265Sei3dRefDisplayInfo(byte[] bArr, int i11, int i12) {
        byte b11;
        int i13 = i11 + 2;
        do {
            i12--;
            b11 = bArr[i12];
            if (b11 != 0) {
                break;
            }
        } while (i12 > i13);
        if (b11 != 0 && i12 > i13) {
            ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i13, i12 + 1);
            while (parsableNalUnitBitArray.canReadBits(16)) {
                int readBits = parsableNalUnitBitArray.readBits(8);
                int i14 = 0;
                while (readBits == 255) {
                    i14 += 255;
                    readBits = parsableNalUnitBitArray.readBits(8);
                }
                int i15 = i14 + readBits;
                int readBits2 = parsableNalUnitBitArray.readBits(8);
                int i16 = 0;
                while (readBits2 == 255) {
                    i16 += 255;
                    readBits2 = parsableNalUnitBitArray.readBits(8);
                }
                int i17 = i16 + readBits2;
                if (i17 == 0 || !parsableNalUnitBitArray.canReadBits(i17)) {
                    break;
                }
                if (i15 == 176) {
                    int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    boolean readBit = parsableNalUnitBitArray.readBit();
                    int readUnsignedExpGolombCodedInt2 = readBit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
                    int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    int i18 = -1;
                    int i19 = -1;
                    int i21 = -1;
                    int i22 = -1;
                    int i23 = -1;
                    int i24 = -1;
                    for (int i25 = 0; i25 <= readUnsignedExpGolombCodedInt3; i25++) {
                        i18 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i19 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        i21 = parsableNalUnitBitArray.readBits(6);
                        if (i21 == 63) {
                            return null;
                        }
                        i22 = parsableNalUnitBitArray.readBits(i21 == 0 ? Math.max(0, readUnsignedExpGolombCodedInt - 30) : Math.max(0, (i21 + readUnsignedExpGolombCodedInt) - 31));
                        if (readBit) {
                            int readBits3 = parsableNalUnitBitArray.readBits(6);
                            if (readBits3 == 63) {
                                return null;
                            }
                            i23 = readBits3;
                            i24 = parsableNalUnitBitArray.readBits(readBits3 == 0 ? Math.max(0, readUnsignedExpGolombCodedInt2 - 30) : Math.max(0, (readBits3 + readUnsignedExpGolombCodedInt2) - 31));
                        }
                        if (parsableNalUnitBitArray.readBit()) {
                            parsableNalUnitBitArray.skipBits(10);
                        }
                    }
                    return new H265Sei3dRefDisplayInfoData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, readUnsignedExpGolombCodedInt3 + 1, i18, i19, i21, i22, i23, i24);
                }
            }
        }
        return null;
    }

    public static H265SpsData parseH265SpsNalUnit(byte[] bArr, int i11, int i12, @Nullable H265VpsData h265VpsData) {
        return parseH265SpsNalUnitPayload(bArr, i11 + 2, i12, parseH265NalHeader(new ParsableNalUnitBitArray(bArr, i11, i12)), h265VpsData);
    }

    /* JADX WARN: Removed duplicated region for block: B:83:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x023c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.NalUnitUtil.H265SpsData parseH265SpsNalUnitPayload(byte[] r17, int r18, int r19, androidx.media3.container.NalUnitUtil.H265NalHeader r20, @androidx.annotation.Nullable androidx.media3.container.NalUnitUtil.H265VpsData r21) {
        /*
            Method dump skipped, instructions count: 603
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseH265SpsNalUnitPayload(byte[], int, int, androidx.media3.container.NalUnitUtil$H265NalHeader, androidx.media3.container.NalUnitUtil$H265VpsData):androidx.media3.container.NalUnitUtil$H265SpsData");
    }

    private static H265VideoSignalInfo parseH265VideoSignalInfo(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        parsableNalUnitBitArray.skipBits(3);
        int i11 = parsableNalUnitBitArray.readBit() ? 1 : 2;
        int isoColorPrimariesToColorSpace = ColorInfo.isoColorPrimariesToColorSpace(parsableNalUnitBitArray.readBits(8));
        int isoTransferCharacteristicsToColorTransfer = ColorInfo.isoTransferCharacteristicsToColorTransfer(parsableNalUnitBitArray.readBits(8));
        parsableNalUnitBitArray.skipBits(8);
        return new H265VideoSignalInfo(isoColorPrimariesToColorSpace, i11, isoTransferCharacteristicsToColorTransfer);
    }

    private static H265VideoSignalInfosAndIndices parseH265VideoSignalInfosAndIndices(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11, int i12, int[] iArr) {
        if (!parsableNalUnitBitArray.readBit() ? parsableNalUnitBitArray.readBit() : true) {
            parsableNalUnitBitArray.skipBit();
        }
        boolean readBit = parsableNalUnitBitArray.readBit();
        boolean readBit2 = parsableNalUnitBitArray.readBit();
        if (readBit || readBit2) {
            for (int i13 = 0; i13 < i12; i13++) {
                for (int i14 = 0; i14 < iArr[i13]; i14++) {
                    boolean readBit3 = readBit ? parsableNalUnitBitArray.readBit() : false;
                    boolean readBit4 = readBit2 ? parsableNalUnitBitArray.readBit() : false;
                    if (readBit3) {
                        parsableNalUnitBitArray.skipBits(32);
                    }
                    if (readBit4) {
                        parsableNalUnitBitArray.skipBits(18);
                    }
                }
            }
        }
        boolean readBit5 = parsableNalUnitBitArray.readBit();
        int readBits = readBit5 ? parsableNalUnitBitArray.readBits(4) + 1 : i11;
        ImmutableList.a builderWithExpectedSize = ImmutableList.builderWithExpectedSize(readBits);
        int[] iArr2 = new int[i11];
        for (int i15 = 0; i15 < readBits; i15++) {
            builderWithExpectedSize.g(parseH265VideoSignalInfo(parsableNalUnitBitArray));
        }
        if (readBit5 && readBits > 1) {
            for (int i16 = 0; i16 < i11; i16++) {
                iArr2[i16] = parsableNalUnitBitArray.readBits(4);
            }
        }
        return new H265VideoSignalInfosAndIndices(builderWithExpectedSize.e(), iArr2);
    }

    public static H265VpsData parseH265VpsNalUnit(byte[] bArr, int i11, int i12) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i11, i12);
        return parseH265VpsNalUnitPayload(parsableNalUnitBitArray, parseH265NalHeader(parsableNalUnitBitArray));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static H265VpsData parseH265VpsNalUnitPayload(ParsableNalUnitBitArray parsableNalUnitBitArray, H265NalHeader h265NalHeader) {
        int[] iArr;
        int i11;
        int i12;
        int[] iArr2;
        H265VideoSignalInfosAndIndices h265VideoSignalInfosAndIndices;
        int i13;
        int i14;
        int i15;
        int[] iArr3;
        ImmutableList immutableList;
        int i16;
        boolean[][] zArr;
        int[] iArr4;
        int i17;
        int i18;
        parsableNalUnitBitArray.skipBits(4);
        boolean readBit = parsableNalUnitBitArray.readBit();
        boolean readBit2 = parsableNalUnitBitArray.readBit();
        int readBits = parsableNalUnitBitArray.readBits(6);
        int i19 = readBits + 1;
        int readBits2 = parsableNalUnitBitArray.readBits(3);
        parsableNalUnitBitArray.skipBits(17);
        H265ProfileTierLevel parseH265ProfileTierLevel = parseH265ProfileTierLevel(parsableNalUnitBitArray, true, readBits2, null);
        boolean z11 = false;
        for (int i21 = parsableNalUnitBitArray.readBit() ? 0 : readBits2; i21 <= readBits2; i21++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        }
        int readBits3 = parsableNalUnitBitArray.readBits(6);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        H265ProfileTierLevelsAndIndices h265ProfileTierLevelsAndIndices = new H265ProfileTierLevelsAndIndices(ImmutableList.of(parseH265ProfileTierLevel), new int[1]);
        Object[] objArr = i19 >= 2 && readUnsignedExpGolombCodedInt >= 2;
        Object[] objArr2 = readBit && readBit2;
        int i22 = readBits3 + 1;
        Object[] objArr3 = i22 >= i19;
        if (objArr != true || objArr2 != true || objArr3 != true) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr5 = (int[][]) Array.newInstance((Class<?>) cls, readUnsignedExpGolombCodedInt, i22);
        int i23 = 1;
        int[] iArr6 = new int[readUnsignedExpGolombCodedInt];
        int[] iArr7 = new int[readUnsignedExpGolombCodedInt];
        iArr5[0][0] = 0;
        iArr6[0] = 1;
        iArr7[0] = 0;
        for (int i24 = 1; i24 < readUnsignedExpGolombCodedInt; i24++) {
            int i25 = 0;
            for (int i26 = 0; i26 <= readBits3; i26++) {
                if (parsableNalUnitBitArray.readBit()) {
                    iArr5[i24][i25] = i26;
                    iArr7[i24] = i26;
                    i25++;
                }
                iArr6[i24] = i25;
            }
        }
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(64);
            if (parsableNalUnitBitArray.readBit()) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            }
            int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            int i27 = 0;
            while (i27 < readUnsignedExpGolombCodedInt2) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                if (i27 == 0 || parsableNalUnitBitArray.readBit()) {
                    z11 = true;
                }
                skipH265HrdParameters(parsableNalUnitBitArray, z11, readBits2);
                i27++;
                z11 = false;
            }
        }
        if (!parsableNalUnitBitArray.readBit()) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        parsableNalUnitBitArray.byteAlign();
        H265ProfileTierLevel parseH265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, false, readBits2, parseH265ProfileTierLevel);
        boolean readBit3 = parsableNalUnitBitArray.readBit();
        int i28 = 6;
        boolean[] zArr2 = new boolean[16];
        int i29 = 0;
        for (int i31 = 0; i31 < 16; i31++) {
            boolean readBit4 = parsableNalUnitBitArray.readBit();
            zArr2[i31] = readBit4;
            if (readBit4) {
                i29++;
            }
        }
        if (i29 == 0 || !zArr2[1]) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr8 = new int[i29];
        for (int i32 = 0; i32 < i29 - (readBit3 ? 1 : 0); i32++) {
            iArr8[i32] = parsableNalUnitBitArray.readBits(3);
        }
        int[] iArr9 = new int[i29 + 1];
        if (readBit3) {
            int i33 = 1;
            while (i33 < i29) {
                int[] iArr10 = iArr9;
                for (int i34 = 0; i34 < i33; i34++) {
                    iArr10[i33] = iArr10[i33] + iArr8[i34] + 1;
                }
                i33++;
                iArr9 = iArr10;
            }
            iArr = iArr9;
            iArr[i29] = 6;
        } else {
            iArr = iArr9;
        }
        int[][] iArr11 = (int[][]) Array.newInstance((Class<?>) cls, i19, i29);
        int[] iArr12 = new int[i19];
        iArr12[0] = 0;
        boolean readBit5 = parsableNalUnitBitArray.readBit();
        int i35 = 1;
        while (i35 < i19) {
            if (readBit5) {
                i18 = i35;
                iArr12[i18] = parsableNalUnitBitArray.readBits(i28);
            } else {
                i18 = i35;
                iArr12[i18] = i18;
            }
            if (readBit3) {
                for (int i36 = 0; i36 < i29; i36++) {
                    iArr11[i18][i36] = (iArr12[i18] & ((1 << iArr[r33]) - 1)) >> iArr[i36];
                }
            } else {
                int i37 = 0;
                while (i37 < i29) {
                    int i38 = i37;
                    iArr11[i18][i38] = parsableNalUnitBitArray.readBits(iArr8[i37] + 1);
                    i37 = i38 + 1;
                }
            }
            i35 = i18 + 1;
            i28 = 6;
        }
        int[] iArr13 = new int[i22];
        int i39 = 1;
        int i41 = 0;
        while (i41 < i19) {
            iArr13[iArr12[i41]] = -1;
            int[] iArr14 = iArr13;
            int i42 = 0;
            int i43 = 0;
            while (i42 < 16) {
                if (zArr2[i42]) {
                    if (i42 == i23) {
                        iArr14[iArr12[i41]] = iArr11[i41][i43];
                    }
                    i43++;
                }
                i42++;
                i23 = 1;
            }
            if (i41 > 0) {
                int i44 = 0;
                while (true) {
                    if (i44 >= i41) {
                        i39++;
                        break;
                    }
                    int i45 = i44;
                    if (iArr14[iArr12[i41]] == iArr14[iArr12[i44]]) {
                        break;
                    }
                    i44 = i45 + 1;
                }
            }
            i41++;
            iArr13 = iArr14;
            i23 = 1;
        }
        int[] iArr15 = iArr13;
        int readBits4 = parsableNalUnitBitArray.readBits(4);
        if (i39 < 2 || readBits4 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr16 = new int[i39];
        for (int i46 = 0; i46 < i39; i46++) {
            iArr16[i46] = parsableNalUnitBitArray.readBits(readBits4);
        }
        int[] iArr17 = new int[i22];
        int i47 = 0;
        while (i47 < i19) {
            int[] iArr18 = iArr17;
            iArr18[Math.min(iArr12[i47], readBits3)] = i47;
            i47++;
            iArr17 = iArr18;
        }
        int[] iArr19 = iArr17;
        ImmutableList.a builder = ImmutableList.builder();
        int i48 = 0;
        while (i48 <= readBits3) {
            int i49 = i39;
            int[] iArr20 = iArr7;
            int min = Math.min(iArr15[i48], i49 - 1);
            builder.g(new H265LayerInfo(iArr19[i48], min >= 0 ? iArr16[min] : -1));
            i48++;
            i39 = i49;
            iArr7 = iArr20;
            iArr16 = iArr16;
        }
        int[] iArr21 = iArr7;
        ImmutableList e11 = builder.e();
        if (((H265LayerInfo) e11.get(0)).viewId == -1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int i51 = 1;
        while (true) {
            if (i51 > readBits3) {
                i11 = -1;
                i12 = -1;
                break;
            }
            i11 = -1;
            if (((H265LayerInfo) e11.get(i51)).viewId != -1) {
                i12 = i51;
                break;
            }
            i51++;
        }
        if (i12 == i11) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr3 = (boolean[][]) Array.newInstance((Class<?>) cls2, i19, i19);
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i19, i19);
        int i52 = 1;
        while (i52 < i19) {
            boolean[][] zArr5 = zArr4;
            for (int i53 = 0; i53 < i52; i53++) {
                boolean[] zArr6 = zArr3[i52];
                boolean[] zArr7 = zArr5[i52];
                boolean readBit6 = parsableNalUnitBitArray.readBit();
                zArr7[i53] = readBit6;
                zArr6[i53] = readBit6;
            }
            i52++;
            zArr4 = zArr5;
        }
        boolean[][] zArr8 = zArr4;
        for (int i54 = 1; i54 < i19; i54++) {
            int i55 = 0;
            while (i55 < readBits) {
                int[] iArr22 = iArr12;
                int i56 = 0;
                while (true) {
                    if (i56 < i54) {
                        boolean[] zArr9 = zArr8[i54];
                        if (zArr9[i56] && zArr8[i56][i55]) {
                            zArr9[i55] = true;
                            break;
                        }
                        i56++;
                    }
                }
                i55++;
                iArr12 = iArr22;
            }
        }
        int[] iArr23 = iArr12;
        int[] iArr24 = new int[i22];
        for (int i57 = 0; i57 < i19; i57++) {
            int i58 = 0;
            for (int i59 = 0; i59 < i57; i59++) {
                i58 += zArr3[i57][i59] ? 1 : 0;
            }
            iArr24[iArr23[i57]] = i58;
        }
        int i61 = 0;
        for (int i62 = 0; i62 < i19; i62++) {
            if (iArr24[iArr23[i62]] == 0) {
                i61++;
            }
        }
        if (i61 > 1) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int[] iArr25 = new int[i19];
        int[] iArr26 = new int[readUnsignedExpGolombCodedInt];
        if (parsableNalUnitBitArray.readBit()) {
            iArr2 = iArr24;
            int i63 = 0;
            while (i63 < i19) {
                int i64 = i63;
                iArr25[i64] = parsableNalUnitBitArray.readBits(3);
                i63 = i64 + 1;
            }
        } else {
            iArr2 = iArr24;
            Arrays.fill(iArr25, 0, i19, readBits2);
        }
        int i65 = 0;
        while (i65 < readUnsignedExpGolombCodedInt) {
            int i66 = i65;
            boolean[][] zArr10 = zArr3;
            int[] iArr27 = iArr25;
            int i67 = 0;
            for (int i68 = 0; i68 < iArr6[i66]; i68++) {
                i67 = Math.max(i67, iArr27[((H265LayerInfo) e11.get(iArr5[i66][i68])).layerIdInVps]);
            }
            iArr26[i66] = i67 + 1;
            i65 = i66 + 1;
            iArr25 = iArr27;
            zArr3 = zArr10;
        }
        boolean[][] zArr11 = zArr3;
        if (parsableNalUnitBitArray.readBit()) {
            int i69 = 0;
            while (i69 < readBits) {
                int i71 = i69 + 1;
                int i72 = i71;
                while (i72 < i19) {
                    if (zArr11[i72][i69]) {
                        i17 = i69;
                        parsableNalUnitBitArray.skipBits(3);
                    } else {
                        i17 = i69;
                    }
                    i72++;
                    i69 = i17;
                }
                i69 = i71;
            }
        }
        parsableNalUnitBitArray.skipBit();
        int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        ImmutableList.a builder2 = ImmutableList.builder();
        builder2.g(parseH265ProfileTierLevel);
        if (readUnsignedExpGolombCodedInt3 > 1) {
            builder2.g(parseH265ProfileTierLevel2);
            for (int i73 = 2; i73 < readUnsignedExpGolombCodedInt3; i73++) {
                parseH265ProfileTierLevel2 = parseH265ProfileTierLevel(parsableNalUnitBitArray, parsableNalUnitBitArray.readBit(), readBits2, parseH265ProfileTierLevel2);
                builder2.g(parseH265ProfileTierLevel2);
            }
        }
        ImmutableList e12 = builder2.e();
        int readUnsignedExpGolombCodedInt4 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + readUnsignedExpGolombCodedInt;
        if (readUnsignedExpGolombCodedInt4 > readUnsignedExpGolombCodedInt) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        int readBits5 = parsableNalUnitBitArray.readBits(2);
        boolean[][] zArr12 = (boolean[][]) Array.newInstance((Class<?>) cls2, readUnsignedExpGolombCodedInt4, i22);
        int[] iArr28 = new int[readUnsignedExpGolombCodedInt4];
        int i74 = 0;
        int[] iArr29 = new int[readUnsignedExpGolombCodedInt4];
        int i75 = 0;
        while (i75 < readUnsignedExpGolombCodedInt) {
            iArr28[i75] = i74;
            iArr29[i75] = iArr21[i75];
            if (readBits5 == 0) {
                i16 = i75;
                zArr = zArr12;
                immutableList = e12;
                iArr4 = iArr28;
                Arrays.fill(zArr12[i16], i74, iArr6[i16], true);
                iArr4[i16] = iArr6[i16];
            } else {
                immutableList = e12;
                i16 = i75;
                zArr = zArr12;
                iArr4 = iArr28;
                if (readBits5 == 1) {
                    int i76 = iArr21[i16];
                    for (int i77 = 0; i77 < iArr6[i16]; i77++) {
                        zArr[i16][i77] = iArr5[i16][i77] == i76;
                    }
                    iArr4[i16] = 1;
                } else {
                    i74 = 0;
                    zArr[0][0] = true;
                    iArr4[0] = 1;
                    i75 = i16 + 1;
                    zArr12 = zArr;
                    iArr28 = iArr4;
                    e12 = immutableList;
                }
            }
            i74 = 0;
            i75 = i16 + 1;
            zArr12 = zArr;
            iArr28 = iArr4;
            e12 = immutableList;
        }
        ImmutableList immutableList2 = e12;
        boolean[][] zArr13 = zArr12;
        int[] iArr30 = iArr28;
        int[] iArr31 = new int[i22];
        int i78 = 2;
        int[] iArr32 = new int[2];
        iArr32[1] = i22;
        iArr32[i74] = readUnsignedExpGolombCodedInt4;
        boolean[][] zArr14 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr32);
        int i79 = 1;
        int i81 = 0;
        while (i79 < readUnsignedExpGolombCodedInt4) {
            if (readBits5 == i78) {
                for (int i82 = 0; i82 < iArr6[i79]; i82++) {
                    zArr13[i79][i82] = parsableNalUnitBitArray.readBit();
                    int i83 = iArr30[i79];
                    boolean z12 = zArr13[i79][i82];
                    iArr30[i79] = i83 + (z12 ? 1 : 0);
                    if (z12) {
                        iArr29[i79] = iArr5[i79][i82];
                    }
                }
            }
            if (i81 == 0) {
                i13 = 0;
                if (iArr5[i79][0] == 0 && zArr13[i79][0]) {
                    for (int i84 = 1; i84 < iArr6[i79]; i84++) {
                        if (iArr5[i79][i84] == i12 && zArr13[i79][i12]) {
                            i81 = i79;
                        }
                    }
                }
            } else {
                i13 = 0;
            }
            int i85 = i13;
            while (i85 < iArr6[i79]) {
                if (readUnsignedExpGolombCodedInt3 > 1) {
                    zArr14[i79][i85] = zArr13[i79][i85];
                    i15 = i12;
                    iArr3 = iArr31;
                    i14 = readUnsignedExpGolombCodedInt3;
                    int h11 = c.h(readUnsignedExpGolombCodedInt3, RoundingMode.CEILING);
                    if (!zArr14[i79][i85]) {
                        int i86 = ((H265LayerInfo) e11.get(iArr5[i79][i85])).layerIdInVps;
                        int i87 = i13;
                        while (true) {
                            if (i87 >= i85) {
                                break;
                            }
                            int i88 = i86;
                            if (zArr8[i88][((H265LayerInfo) e11.get(iArr5[i79][i87])).layerIdInVps]) {
                                zArr14[i79][i85] = true;
                                break;
                            }
                            i87++;
                            i86 = i88;
                        }
                    }
                    if (zArr14[i79][i85]) {
                        if (i81 <= 0 || i79 != i81) {
                            parsableNalUnitBitArray.skipBits(h11);
                        } else {
                            iArr3[i85] = parsableNalUnitBitArray.readBits(h11);
                        }
                    }
                } else {
                    i14 = readUnsignedExpGolombCodedInt3;
                    i15 = i12;
                    iArr3 = iArr31;
                }
                i85++;
                i12 = i15;
                iArr31 = iArr3;
                readUnsignedExpGolombCodedInt3 = i14;
            }
            int i89 = readUnsignedExpGolombCodedInt3;
            int i91 = i12;
            int[] iArr33 = iArr31;
            if (iArr30[i79] == 1 && iArr2[iArr29[i79]] > 0) {
                parsableNalUnitBitArray.skipBit();
            }
            i79++;
            i12 = i91;
            iArr31 = iArr33;
            readUnsignedExpGolombCodedInt3 = i89;
            i78 = 2;
        }
        int[] iArr34 = iArr31;
        if (i81 == 0) {
            return new H265VpsData(h265NalHeader, null, h265ProfileTierLevelsAndIndices, null, null);
        }
        H265RepFormatsAndIndices parseH265RepFormatsAndIndices = parseH265RepFormatsAndIndices(parsableNalUnitBitArray, i19);
        parsableNalUnitBitArray.skipBits(2);
        for (int i92 = 1; i92 < i19; i92++) {
            if (iArr2[iArr23[i92]] == 0) {
                parsableNalUnitBitArray.skipBit();
            }
        }
        skipH265DpbSize(parsableNalUnitBitArray, readUnsignedExpGolombCodedInt4, iArr26, iArr6, zArr14);
        skipToH265VuiPresentFlagAfterDpbSize(parsableNalUnitBitArray, i19, zArr11);
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.byteAlign();
            h265VideoSignalInfosAndIndices = parseH265VideoSignalInfosAndIndices(parsableNalUnitBitArray, i19, readUnsignedExpGolombCodedInt, iArr26);
        } else {
            h265VideoSignalInfosAndIndices = null;
        }
        return new H265VpsData(h265NalHeader, e11, new H265ProfileTierLevelsAndIndices(immutableList2, iArr34), parseH265RepFormatsAndIndices, h265VideoSignalInfosAndIndices);
    }

    public static PpsData parsePpsNalUnit(byte[] bArr, int i11, int i12) {
        return parsePpsNalUnitPayload(bArr, i11 + 1, i12);
    }

    public static PpsData parsePpsNalUnitPayload(byte[] bArr, int i11, int i12) {
        ParsableNalUnitBitArray parsableNalUnitBitArray = new ParsableNalUnitBitArray(bArr, i11, i12);
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        parsableNalUnitBitArray.skipBit();
        return new PpsData(readUnsignedExpGolombCodedInt, readUnsignedExpGolombCodedInt2, parsableNalUnitBitArray.readBit());
    }

    public static SpsData parseSpsNalUnit(byte[] bArr, int i11, int i12) {
        return parseSpsNalUnitPayload(bArr, i11 + 1, i12);
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.media3.container.NalUnitUtil.SpsData parseSpsNalUnitPayload(byte[] r32, int r33, int r34) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.container.NalUnitUtil.parseSpsNalUnitPayload(byte[], int, int):androidx.media3.container.NalUnitUtil$SpsData");
    }

    private static void skipH265DpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11, int[] iArr, int[] iArr2, boolean[][] zArr) {
        for (int i12 = 1; i12 < i11; i12++) {
            boolean readBit = parsableNalUnitBitArray.readBit();
            int i13 = 0;
            while (i13 < iArr[i12]) {
                if ((i13 <= 0 || !readBit) ? i13 == 0 : parsableNalUnitBitArray.readBit()) {
                    for (int i14 = 0; i14 < iArr2[i12]; i14++) {
                        if (zArr[i12][i14]) {
                            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        }
                    }
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                i13++;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v2, types: [int] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    private static void skipH265HrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray, boolean z11, int i11) {
        ?? r92;
        ?? r12;
        boolean z12;
        boolean readBit;
        if (z11) {
            boolean readBit2 = parsableNalUnitBitArray.readBit();
            boolean readBit3 = parsableNalUnitBitArray.readBit();
            if (readBit2 || readBit3) {
                z12 = parsableNalUnitBitArray.readBit();
                if (z12) {
                    parsableNalUnitBitArray.skipBits(19);
                }
                parsableNalUnitBitArray.skipBits(8);
                if (z12) {
                    parsableNalUnitBitArray.skipBits(4);
                }
                parsableNalUnitBitArray.skipBits(15);
                r12 = readBit3;
                r92 = readBit2;
            } else {
                z12 = false;
                r12 = readBit3;
                r92 = readBit2;
            }
        } else {
            r92 = 0;
            r12 = 0;
            z12 = false;
        }
        for (int i12 = 0; i12 <= i11; i12++) {
            boolean readBit4 = parsableNalUnitBitArray.readBit();
            if (!readBit4) {
                readBit4 = parsableNalUnitBitArray.readBit();
            }
            if (readBit4) {
                parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                readBit = false;
            } else {
                readBit = parsableNalUnitBitArray.readBit();
            }
            int readUnsignedExpGolombCodedInt = !readBit ? parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() : 0;
            int i13 = r92 + r12;
            for (int i14 = 0; i14 < i13; i14++) {
                for (int i15 = 0; i15 <= readUnsignedExpGolombCodedInt; i15++) {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    if (z12) {
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                        parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                    }
                    parsableNalUnitBitArray.skipBit();
                }
            }
        }
    }

    private static void skipH265ScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        for (int i11 = 0; i11 < 4; i11++) {
            int i12 = 0;
            while (i12 < 6) {
                int i13 = 1;
                if (parsableNalUnitBitArray.readBit()) {
                    int min = Math.min(64, 1 << ((i11 << 1) + 4));
                    if (i11 > 1) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                    for (int i14 = 0; i14 < min; i14++) {
                        parsableNalUnitBitArray.readSignedExpGolombCodedInt();
                    }
                } else {
                    parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                }
                if (i11 == 3) {
                    i13 = 3;
                }
                i12 += i13;
            }
        }
    }

    private static void skipH265ShortTermReferencePictureSets(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        int[] iArr = new int[0];
        int[] iArr2 = new int[0];
        int i11 = -1;
        int i12 = -1;
        for (int i13 = 0; i13 < readUnsignedExpGolombCodedInt; i13++) {
            if (i13 == 0 || !parsableNalUnitBitArray.readBit()) {
                int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int readUnsignedExpGolombCodedInt3 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
                int[] iArr3 = new int[readUnsignedExpGolombCodedInt2];
                int i14 = 0;
                while (i14 < readUnsignedExpGolombCodedInt2) {
                    iArr3[i14] = (i14 > 0 ? iArr3[i14 - 1] : 0) - (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                    parsableNalUnitBitArray.skipBit();
                    i14++;
                }
                int[] iArr4 = new int[readUnsignedExpGolombCodedInt3];
                int i15 = 0;
                while (i15 < readUnsignedExpGolombCodedInt3) {
                    iArr4[i15] = (i15 > 0 ? iArr4[i15 - 1] : 0) + parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
                    parsableNalUnitBitArray.skipBit();
                    i15++;
                }
                i11 = readUnsignedExpGolombCodedInt2;
                iArr = iArr3;
                i12 = readUnsignedExpGolombCodedInt3;
                iArr2 = iArr4;
            } else {
                int i16 = i11 + i12;
                int readUnsignedExpGolombCodedInt4 = (1 - ((parsableNalUnitBitArray.readBit() ? 1 : 0) * 2)) * (parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1);
                int i17 = i16 + 1;
                boolean[] zArr = new boolean[i17];
                for (int i18 = 0; i18 <= i16; i18++) {
                    if (parsableNalUnitBitArray.readBit()) {
                        zArr[i18] = true;
                    } else {
                        zArr[i18] = parsableNalUnitBitArray.readBit();
                    }
                }
                int[] iArr5 = new int[i17];
                int[] iArr6 = new int[i17];
                int i19 = 0;
                for (int i21 = i12 - 1; i21 >= 0; i21--) {
                    int i22 = iArr2[i21] + readUnsignedExpGolombCodedInt4;
                    if (i22 < 0 && zArr[i11 + i21]) {
                        iArr5[i19] = i22;
                        i19++;
                    }
                }
                if (readUnsignedExpGolombCodedInt4 < 0 && zArr[i16]) {
                    iArr5[i19] = readUnsignedExpGolombCodedInt4;
                    i19++;
                }
                for (int i23 = 0; i23 < i11; i23++) {
                    int i24 = iArr[i23] + readUnsignedExpGolombCodedInt4;
                    if (i24 < 0 && zArr[i23]) {
                        iArr5[i19] = i24;
                        i19++;
                    }
                }
                int[] copyOf = Arrays.copyOf(iArr5, i19);
                int i25 = 0;
                for (int i26 = i11 - 1; i26 >= 0; i26--) {
                    int i27 = iArr[i26] + readUnsignedExpGolombCodedInt4;
                    if (i27 > 0 && zArr[i26]) {
                        iArr6[i25] = i27;
                        i25++;
                    }
                }
                if (readUnsignedExpGolombCodedInt4 > 0 && zArr[i16]) {
                    iArr6[i25] = readUnsignedExpGolombCodedInt4;
                    i25++;
                }
                for (int i28 = 0; i28 < i12; i28++) {
                    int i29 = iArr2[i28] + readUnsignedExpGolombCodedInt4;
                    if (i29 > 0 && zArr[i11 + i28]) {
                        iArr6[i25] = i29;
                        i25++;
                    }
                }
                iArr2 = Arrays.copyOf(iArr6, i25);
                iArr = copyOf;
                i11 = i19;
                i12 = i25;
            }
        }
    }

    private static void skipHrdParameters(ParsableNalUnitBitArray parsableNalUnitBitArray) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 1;
        parsableNalUnitBitArray.skipBits(8);
        for (int i11 = 0; i11 < readUnsignedExpGolombCodedInt; i11++) {
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
            parsableNalUnitBitArray.skipBit();
        }
        parsableNalUnitBitArray.skipBits(20);
    }

    private static void skipScalingList(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11) {
        int i12 = 8;
        int i13 = 8;
        for (int i14 = 0; i14 < i11; i14++) {
            if (i12 != 0) {
                i12 = ((parsableNalUnitBitArray.readSignedExpGolombCodedInt() + i13) + 256) % 256;
            }
            if (i12 != 0) {
                i13 = i12;
            }
        }
    }

    private static void skipToH265VuiPresentFlagAfterDpbSize(ParsableNalUnitBitArray parsableNalUnitBitArray, int i11, boolean[][] zArr) {
        int readUnsignedExpGolombCodedInt = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt() + 2;
        if (parsableNalUnitBitArray.readBit()) {
            parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt);
        } else {
            for (int i12 = 1; i12 < i11; i12++) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (zArr[i12][i13]) {
                        parsableNalUnitBitArray.skipBits(readUnsignedExpGolombCodedInt);
                    }
                }
            }
        }
        int readUnsignedExpGolombCodedInt2 = parsableNalUnitBitArray.readUnsignedExpGolombCodedInt();
        for (int i14 = 1; i14 <= readUnsignedExpGolombCodedInt2; i14++) {
            parsableNalUnitBitArray.skipBits(8);
        }
    }

    public static int unescapeStream(byte[] bArr, int i11) {
        int i12;
        synchronized (scratchEscapePositionsLock) {
            int i13 = 0;
            int i14 = 0;
            while (i13 < i11) {
                try {
                    i13 = findNextUnescapeIndex(bArr, i13, i11);
                    if (i13 < i11) {
                        int[] iArr = scratchEscapePositions;
                        if (iArr.length <= i14) {
                            scratchEscapePositions = Arrays.copyOf(iArr, iArr.length * 2);
                        }
                        scratchEscapePositions[i14] = i13;
                        i13 += 3;
                        i14++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i12 = i11 - i14;
            int i15 = 0;
            int i16 = 0;
            for (int i17 = 0; i17 < i14; i17++) {
                int i18 = scratchEscapePositions[i17] - i16;
                System.arraycopy(bArr, i16, bArr, i15, i18);
                int i19 = i15 + i18;
                int i21 = i19 + 1;
                bArr[i19] = 0;
                i15 = i19 + 2;
                bArr[i21] = 0;
                i16 += i18 + 3;
            }
            System.arraycopy(bArr, i16, bArr, i15, i12 - i15);
        }
        return i12;
    }

    public static boolean isNalUnitSei(Format format, byte b11) {
        return ((Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H264) || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, MimeTypes.VIDEO_H264)) && (b11 & 31) == 6) || ((Objects.equals(format.sampleMimeType, MimeTypes.VIDEO_H265) || MimeTypes.containsCodecsCorrespondingToMimeType(format.codecs, MimeTypes.VIDEO_H265)) && ((b11 & 126) >> 1) == 39);
    }
}
