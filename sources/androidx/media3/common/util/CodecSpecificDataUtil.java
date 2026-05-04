package androidx.media3.common.util;

import android.annotation.SuppressLint;
import android.util.Pair;
import androidx.annotation.Nullable;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.common.ColorInfo;
import androidx.media3.common.MimeTypes;
import com.google.common.collect.ImmutableList;
import com.tencent.connect.common.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@SuppressLint({"InlinedApi"})
@UnstableApi
/* loaded from: classes2.dex */
public final class CodecSpecificDataUtil {
    private static final String CODEC_ID_AV01 = "av01";
    private static final String CODEC_ID_AVC1 = "avc1";
    private static final String CODEC_ID_AVC2 = "avc2";
    private static final String CODEC_ID_H263 = "s263";
    private static final String CODEC_ID_HEV1 = "hev1";
    private static final String CODEC_ID_HVC1 = "hvc1";
    private static final String CODEC_ID_MP4A = "mp4a";
    private static final String CODEC_ID_VP09 = "vp09";
    private static final int EXTENDED_PAR = 15;
    private static final int RECTANGULAR = 0;
    private static final String TAG = "CodecSpecificDataUtil";
    private static final int VISUAL_OBJECT_LAYER = 1;
    private static final int VISUAL_OBJECT_LAYER_START = 32;
    private static final byte[] NAL_START_CODE = {0, 0, 0, 1};
    private static final String[] HEVC_GENERAL_PROFILE_SPACE_STRINGS = {"", ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", "C"};
    private static final Pattern PROFILE_PATTERN = Pattern.compile("^\\D?(\\d+)$");

    private CodecSpecificDataUtil() {
    }

    private static int av1LevelNumberToConst(int i11) {
        switch (i11) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 1024;
            case 11:
                return 2048;
            case 12:
                return 4096;
            case 13:
                return 8192;
            case 14:
                return 16384;
            case 15:
                return 32768;
            case 16:
                return 65536;
            case 17:
                return 131072;
            case 18:
                return 262144;
            case 19:
                return 524288;
            case 20:
                return 1048576;
            case 21:
                return 2097152;
            case 22:
                return 4194304;
            case 23:
                return 8388608;
            default:
                return -1;
        }
    }

    private static int avcLevelNumberToConst(int i11) {
        switch (i11) {
            case 10:
                return 1;
            case 11:
                return 4;
            case 12:
                return 8;
            case 13:
                return 16;
            default:
                switch (i11) {
                    case 20:
                        return 32;
                    case 21:
                        return 64;
                    case 22:
                        return 128;
                    default:
                        switch (i11) {
                            case 30:
                                return 256;
                            case 31:
                                return 512;
                            case 32:
                                return 1024;
                            default:
                                switch (i11) {
                                    case 40:
                                        return 2048;
                                    case 41:
                                        return 4096;
                                    case 42:
                                        return 8192;
                                    default:
                                        switch (i11) {
                                            case 50:
                                                return 16384;
                                            case 51:
                                                return 32768;
                                            case 52:
                                                return 65536;
                                            default:
                                                return -1;
                                        }
                                }
                        }
                }
        }
    }

    private static int avcProfileNumberToConst(int i11) {
        if (i11 == 66) {
            return 1;
        }
        if (i11 == 77) {
            return 2;
        }
        if (i11 == 88) {
            return 4;
        }
        if (i11 == 100) {
            return 8;
        }
        if (i11 == 110) {
            return 16;
        }
        if (i11 != 122) {
            return i11 != 244 ? -1 : 64;
        }
        return 32;
    }

    public static String buildAvcCodecString(int i11, int i12, int i13) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i11), Integer.valueOf(i12), Integer.valueOf(i13));
    }

    public static List<byte[]> buildCea708InitializationData(boolean z11) {
        return Collections.singletonList(z11 ? new byte[]{1} : new byte[]{0});
    }

    public static String buildH263CodecString(int i11, int i12) {
        return Util.formatInvariant("s263.%d.%d", Integer.valueOf(i11), Integer.valueOf(i12));
    }

    public static String buildHevcCodecString(int i11, boolean z11, int i12, int i13, int[] iArr, int i14) {
        StringBuilder sb2 = new StringBuilder(Util.formatInvariant("hvc1.%s%d.%X.%c%d", HEVC_GENERAL_PROFILE_SPACE_STRINGS[i11], Integer.valueOf(i12), Integer.valueOf(i13), Character.valueOf(z11 ? 'H' : 'L'), Integer.valueOf(i14)));
        int length = iArr.length;
        while (length > 0 && iArr[length - 1] == 0) {
            length--;
        }
        for (int i15 = 0; i15 < length; i15++) {
            sb2.append(String.format(".%02X", Integer.valueOf(iArr[i15])));
        }
        return sb2.toString();
    }

    public static byte[] buildNalUnit(byte[] bArr, int i11, int i12) {
        byte[] bArr2 = NAL_START_CODE;
        byte[] bArr3 = new byte[bArr2.length + i12];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i11, bArr3, bArr2.length, i12);
        return bArr3;
    }

    public static ImmutableList<byte[]> buildVp9CodecPrivateInitializationData(byte b11, byte b12, byte b13, byte b14) {
        return ImmutableList.of(new byte[]{1, 1, b11, 2, 1, b12, 3, 1, b13, 4, 1, b14});
    }

    @Nullable
    private static Integer dolbyVisionStringToLevel(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    @Nullable
    private static Integer dolbyVisionStringToProfile(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static int findNalStartCode(byte[] bArr, int i11) {
        int length = bArr.length - NAL_START_CODE.length;
        while (i11 <= length) {
            if (isNalStartCode(bArr, i11)) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    @Nullable
    private static Pair<Integer, Integer> getAacCodecProfileAndLevel(String str, String[] strArr) {
        int mp4aAudioObjectTypeToProfile;
        if (strArr.length != 3) {
            Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
            return null;
        }
        try {
            if (MimeTypes.AUDIO_AAC.equals(MimeTypes.getMimeTypeFromMp4ObjectType(Integer.parseInt(strArr[1], 16))) && (mp4aAudioObjectTypeToProfile = mp4aAudioObjectTypeToProfile(Integer.parseInt(strArr[2]))) != -1) {
                return new Pair<>(Integer.valueOf(mp4aAudioObjectTypeToProfile), 0);
            }
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed MP4A codec string: " + str);
        }
        return null;
    }

    @Nullable
    private static Pair<Integer, Integer> getAv1ProfileAndLevel(String str, String[] strArr, @Nullable ColorInfo colorInfo) {
        int i11;
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2].substring(0, 2));
            int parseInt3 = Integer.parseInt(strArr[3]);
            if (parseInt != 0) {
                Log.w(TAG, "Unknown AV1 profile: " + parseInt);
                return null;
            }
            if (parseInt3 != 8 && parseInt3 != 10) {
                Log.w(TAG, "Unknown AV1 bit depth: " + parseInt3);
                return null;
            }
            int i12 = parseInt3 != 8 ? (colorInfo == null || !(colorInfo.hdrStaticInfo != null || (i11 = colorInfo.colorTransfer) == 7 || i11 == 6)) ? 2 : 4096 : 1;
            int av1LevelNumberToConst = av1LevelNumberToConst(parseInt2);
            if (av1LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(i12), Integer.valueOf(av1LevelNumberToConst));
            }
            Log.w(TAG, "Unknown AV1 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed AV1 codec string: " + str);
            return null;
        }
    }

    @Nullable
    private static Pair<Integer, Integer> getAvcProfileAndLevel(String str, String[] strArr) {
        int parseInt;
        int i11;
        if (strArr.length < 2) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                i11 = Integer.parseInt(strArr[1].substring(0, 2), 16);
                parseInt = Integer.parseInt(strArr[1].substring(4), 16);
            } else {
                if (strArr.length < 3) {
                    Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
                    return null;
                }
                int parseInt2 = Integer.parseInt(strArr[1]);
                parseInt = Integer.parseInt(strArr[2]);
                i11 = parseInt2;
            }
            int avcProfileNumberToConst = avcProfileNumberToConst(i11);
            if (avcProfileNumberToConst == -1) {
                Log.w(TAG, "Unknown AVC profile: " + i11);
                return null;
            }
            int avcLevelNumberToConst = avcLevelNumberToConst(parseInt);
            if (avcLevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(avcProfileNumberToConst), Integer.valueOf(avcLevelNumberToConst));
            }
            Log.w(TAG, "Unknown AVC level: " + parseInt);
            return null;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed AVC codec string: " + str);
            return null;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0080, code lost:
    
        if (r3.equals(androidx.media3.common.util.CodecSpecificDataUtil.CODEC_ID_AV01) == false) goto L11;
     */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> getCodecProfileAndLevel(androidx.media3.common.Format r6) {
        /*
            java.lang.String r0 = r6.codecs
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            java.lang.String r2 = "\\."
            java.lang.String[] r0 = r0.split(r2)
            java.lang.String r2 = "video/dolby-vision"
            java.lang.String r3 = r6.sampleMimeType
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L1d
            java.lang.String r6 = r6.codecs
            android.util.Pair r6 = getDolbyVisionProfileAndLevel(r6, r0)
            return r6
        L1d:
            r2 = 0
            r3 = r0[r2]
            r3.getClass()
            int r4 = r3.hashCode()
            r5 = -1
            switch(r4) {
                case 3004662: goto L7a;
                case 3006243: goto L6f;
                case 3006244: goto L64;
                case 3199032: goto L59;
                case 3214780: goto L4e;
                case 3356560: goto L43;
                case 3475740: goto L38;
                case 3624515: goto L2d;
                default: goto L2b;
            }
        L2b:
            r2 = r5
            goto L83
        L2d:
            java.lang.String r2 = "vp09"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L36
            goto L2b
        L36:
            r2 = 7
            goto L83
        L38:
            java.lang.String r2 = "s263"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L41
            goto L2b
        L41:
            r2 = 6
            goto L83
        L43:
            java.lang.String r2 = "mp4a"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L4c
            goto L2b
        L4c:
            r2 = 5
            goto L83
        L4e:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L57
            goto L2b
        L57:
            r2 = 4
            goto L83
        L59:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L62
            goto L2b
        L62:
            r2 = 3
            goto L83
        L64:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L6d
            goto L2b
        L6d:
            r2 = 2
            goto L83
        L6f:
            java.lang.String r2 = "avc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L78
            goto L2b
        L78:
            r2 = 1
            goto L83
        L7a:
            java.lang.String r4 = "av01"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L83
            goto L2b
        L83:
            switch(r2) {
                case 0: goto Lac;
                case 1: goto La5;
                case 2: goto La5;
                case 3: goto L9c;
                case 4: goto L9c;
                case 5: goto L95;
                case 6: goto L8e;
                case 7: goto L87;
                default: goto L86;
            }
        L86:
            return r1
        L87:
            java.lang.String r6 = r6.codecs
            android.util.Pair r6 = getVp9ProfileAndLevel(r6, r0)
            return r6
        L8e:
            java.lang.String r6 = r6.codecs
            android.util.Pair r6 = getH263ProfileAndLevel(r6, r0)
            return r6
        L95:
            java.lang.String r6 = r6.codecs
            android.util.Pair r6 = getAacCodecProfileAndLevel(r6, r0)
            return r6
        L9c:
            java.lang.String r1 = r6.codecs
            androidx.media3.common.ColorInfo r6 = r6.colorInfo
            android.util.Pair r6 = getHevcProfileAndLevel(r1, r0, r6)
            return r6
        La5:
            java.lang.String r6 = r6.codecs
            android.util.Pair r6 = getAvcProfileAndLevel(r6, r0)
            return r6
        Lac:
            java.lang.String r1 = r6.codecs
            androidx.media3.common.ColorInfo r6 = r6.colorInfo
            android.util.Pair r6 = getAv1ProfileAndLevel(r1, r0, r6)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.common.util.CodecSpecificDataUtil.getCodecProfileAndLevel(androidx.media3.common.Format):android.util.Pair");
    }

    @Nullable
    private static Pair<Integer, Integer> getDolbyVisionProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed Dolby Vision codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        Integer dolbyVisionStringToProfile = dolbyVisionStringToProfile(group);
        if (dolbyVisionStringToProfile == null) {
            Log.w(TAG, "Unknown Dolby Vision profile string: " + group);
            return null;
        }
        String str2 = strArr[2];
        Integer dolbyVisionStringToLevel = dolbyVisionStringToLevel(str2);
        if (dolbyVisionStringToLevel != null) {
            return new Pair<>(dolbyVisionStringToProfile, dolbyVisionStringToLevel);
        }
        Log.w(TAG, "Unknown Dolby Vision level string: " + str2);
        return null;
    }

    private static Pair<Integer, Integer> getH263ProfileAndLevel(String str, String[] strArr) {
        Pair<Integer, Integer> pair = new Pair<>(1, 1);
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
        try {
            return new Pair<>(Integer.valueOf(Integer.parseInt(strArr[1])), Integer.valueOf(Integer.parseInt(strArr[2])));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed H263 codec string: " + str);
            return pair;
        }
    }

    @Nullable
    public static Pair<Integer, Integer> getHevcProfileAndLevel(String str, String[] strArr, @Nullable ColorInfo colorInfo) {
        if (strArr.length < 4) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        int i11 = 1;
        Matcher matcher = PROFILE_PATTERN.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed HEVC codec string: " + str);
            return null;
        }
        String group = matcher.group(1);
        if (!"1".equals(group)) {
            i11 = 6;
            if ("2".equals(group)) {
                i11 = (colorInfo == null || colorInfo.colorTransfer != 6) ? 2 : 4096;
            } else if (!Constants.VIA_SHARE_TYPE_INFO.equals(group)) {
                Log.w(TAG, "Unknown HEVC profile string: " + group);
                return null;
            }
        }
        String str2 = strArr[3];
        Integer hevcCodecStringToProfileLevel = hevcCodecStringToProfileLevel(str2);
        if (hevcCodecStringToProfileLevel != null) {
            return new Pair<>(Integer.valueOf(i11), hevcCodecStringToProfileLevel);
        }
        Log.w(TAG, "Unknown HEVC level string: " + str2);
        return null;
    }

    public static Pair<Integer, Integer> getVideoResolutionFromMpeg4VideoConfig(byte[] bArr) {
        boolean z11;
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = i12 + 3;
            if (i13 >= bArr.length) {
                z11 = false;
                break;
            }
            if (parsableByteArray.readUnsignedInt24() == 1 && (bArr[i13] & 240) == 32) {
                z11 = true;
                break;
            }
            parsableByteArray.setPosition(parsableByteArray.getPosition() - 2);
            i12++;
        }
        Assertions.checkArgument(z11, "Invalid input: VOL not found.");
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        parsableBitArray.skipBits((i12 + 4) * 8);
        parsableBitArray.skipBits(1);
        parsableBitArray.skipBits(8);
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(4);
            parsableBitArray.skipBits(3);
        }
        if (parsableBitArray.readBits(4) == 15) {
            parsableBitArray.skipBits(8);
            parsableBitArray.skipBits(8);
        }
        if (parsableBitArray.readBit()) {
            parsableBitArray.skipBits(2);
            parsableBitArray.skipBits(1);
            if (parsableBitArray.readBit()) {
                parsableBitArray.skipBits(79);
            }
        }
        Assertions.checkArgument(parsableBitArray.readBits(2) == 0, "Only supports rectangular video object layer shape.");
        Assertions.checkArgument(parsableBitArray.readBit());
        int readBits = parsableBitArray.readBits(16);
        Assertions.checkArgument(parsableBitArray.readBit());
        if (parsableBitArray.readBit()) {
            Assertions.checkArgument(readBits > 0);
            for (int i14 = readBits - 1; i14 > 0; i14 >>= 1) {
                i11++;
            }
            parsableBitArray.skipBits(i11);
        }
        Assertions.checkArgument(parsableBitArray.readBit());
        int readBits2 = parsableBitArray.readBits(13);
        Assertions.checkArgument(parsableBitArray.readBit());
        int readBits3 = parsableBitArray.readBits(13);
        Assertions.checkArgument(parsableBitArray.readBit());
        parsableBitArray.skipBits(1);
        return Pair.create(Integer.valueOf(readBits2), Integer.valueOf(readBits3));
    }

    @Nullable
    private static Pair<Integer, Integer> getVp9ProfileAndLevel(String str, String[] strArr) {
        if (strArr.length < 3) {
            Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
        try {
            int parseInt = Integer.parseInt(strArr[1]);
            int parseInt2 = Integer.parseInt(strArr[2]);
            int vp9ProfileNumberToConst = vp9ProfileNumberToConst(parseInt);
            if (vp9ProfileNumberToConst == -1) {
                Log.w(TAG, "Unknown VP9 profile: " + parseInt);
                return null;
            }
            int vp9LevelNumberToConst = vp9LevelNumberToConst(parseInt2);
            if (vp9LevelNumberToConst != -1) {
                return new Pair<>(Integer.valueOf(vp9ProfileNumberToConst), Integer.valueOf(vp9LevelNumberToConst));
            }
            Log.w(TAG, "Unknown VP9 level: " + parseInt2);
            return null;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed VP9 codec string: " + str);
            return null;
        }
    }

    @Nullable
    private static Integer hevcCodecStringToProfileLevel(@Nullable String str) {
        if (str == null) {
            return null;
        }
        switch (str) {
        }
        return null;
    }

    private static boolean isNalStartCode(byte[] bArr, int i11) {
        if (bArr.length - i11 <= NAL_START_CODE.length) {
            return false;
        }
        int i12 = 0;
        while (true) {
            byte[] bArr2 = NAL_START_CODE;
            if (i12 >= bArr2.length) {
                return true;
            }
            if (bArr[i11 + i12] != bArr2[i12]) {
                return false;
            }
            i12++;
        }
    }

    private static int mp4aAudioObjectTypeToProfile(int i11) {
        int i12 = 17;
        if (i11 != 17) {
            i12 = 20;
            if (i11 != 20) {
                i12 = 23;
                if (i11 != 23) {
                    i12 = 29;
                    if (i11 != 29) {
                        i12 = 39;
                        if (i11 != 39) {
                            i12 = 42;
                            if (i11 != 42) {
                                switch (i11) {
                                    case 1:
                                        return 1;
                                    case 2:
                                        return 2;
                                    case 3:
                                        return 3;
                                    case 4:
                                        return 4;
                                    case 5:
                                        return 5;
                                    case 6:
                                        return 6;
                                    default:
                                        return -1;
                                }
                            }
                        }
                    }
                }
            }
        }
        return i12;
    }

    public static Pair<Integer, Integer> parseAlacAudioSpecificConfig(byte[] bArr) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(bArr);
        parsableByteArray.setPosition(9);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.setPosition(20);
        return Pair.create(Integer.valueOf(parsableByteArray.readUnsignedIntToInt()), Integer.valueOf(readUnsignedByte));
    }

    public static boolean parseCea708InitializationData(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    @Nullable
    public static byte[][] splitNalUnits(byte[] bArr) {
        if (!isNalStartCode(bArr, 0)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        do {
            arrayList.add(Integer.valueOf(i11));
            i11 = findNalStartCode(bArr, i11 + NAL_START_CODE.length);
        } while (i11 != -1);
        byte[][] bArr2 = new byte[arrayList.size()][];
        int i12 = 0;
        while (i12 < arrayList.size()) {
            int intValue = ((Integer) arrayList.get(i12)).intValue();
            int intValue2 = (i12 < arrayList.size() + (-1) ? ((Integer) arrayList.get(i12 + 1)).intValue() : bArr.length) - intValue;
            byte[] bArr3 = new byte[intValue2];
            System.arraycopy(bArr, intValue, bArr3, 0, intValue2);
            bArr2[i12] = bArr3;
            i12++;
        }
        return bArr2;
    }

    private static int vp9LevelNumberToConst(int i11) {
        if (i11 == 10) {
            return 1;
        }
        if (i11 == 11) {
            return 2;
        }
        if (i11 == 20) {
            return 4;
        }
        if (i11 == 21) {
            return 8;
        }
        if (i11 == 30) {
            return 16;
        }
        if (i11 == 31) {
            return 32;
        }
        if (i11 == 40) {
            return 64;
        }
        if (i11 == 41) {
            return 128;
        }
        if (i11 == 50) {
            return 256;
        }
        if (i11 == 51) {
            return 512;
        }
        switch (i11) {
            case 60:
                return 2048;
            case 61:
                return 4096;
            case 62:
                return 8192;
            default:
                return -1;
        }
    }

    private static int vp9ProfileNumberToConst(int i11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 2;
        }
        if (i11 != 2) {
            return i11 != 3 ? -1 : 8;
        }
        return 4;
    }
}
