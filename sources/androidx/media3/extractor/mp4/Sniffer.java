package androidx.media3.extractor.mp4;

import androidx.annotation.Nullable;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.ExtractorInput;
import androidx.media3.extractor.SniffFailure;
import java.io.IOException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Sniffer {
    public static final int BRAND_HEIC = 1751476579;
    public static final int BRAND_QUICKTIME = 1903435808;
    private static final int[] COMPATIBLE_BRANDS = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};
    private static final int SEARCH_LENGTH = 4096;

    private Sniffer() {
    }

    private static boolean isCompatibleBrand(int i11, boolean z11) {
        if ((i11 >>> 8) == 3368816) {
            return true;
        }
        if (i11 == 1751476579 && z11) {
            return true;
        }
        for (int i12 : COMPATIBLE_BRANDS) {
            if (i12 == i11) {
                return true;
            }
        }
        return false;
    }

    @Nullable
    public static SniffFailure sniffFragmented(ExtractorInput extractorInput) throws IOException {
        return sniffInternal(extractorInput, true, false);
    }

    @Nullable
    private static SniffFailure sniffInternal(ExtractorInput extractorInput, boolean z11, boolean z12) throws IOException {
        SniffFailure sniffFailure;
        int i11;
        long j11;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        long length = extractorInput.getLength();
        long j12 = -1;
        long j13 = 4096;
        if (length != -1 && length <= 4096) {
            j13 = length;
        }
        int i15 = (int) j13;
        ParsableByteArray parsableByteArray = new ParsableByteArray(64);
        int i16 = 0;
        int i17 = 0;
        boolean z13 = false;
        while (i17 < i15) {
            parsableByteArray.reset(8);
            boolean z14 = true;
            if (!extractorInput.peekFully(parsableByteArray.getData(), i16, 8, true)) {
                break;
            }
            long readUnsignedInt = parsableByteArray.readUnsignedInt();
            int readInt = parsableByteArray.readInt();
            if (readUnsignedInt == 1) {
                j11 = j12;
                extractorInput.peekFully(parsableByteArray.getData(), 8, 8);
                i13 = 16;
                parsableByteArray.setLimit(16);
                readUnsignedInt = parsableByteArray.readLong();
                i12 = i17;
            } else {
                j11 = j12;
                if (readUnsignedInt == 0) {
                    long length2 = extractorInput.getLength();
                    if (length2 != j11) {
                        i12 = i17;
                        readUnsignedInt = (length2 - extractorInput.getPeekPosition()) + 8;
                        i13 = 8;
                    }
                }
                i12 = i17;
                i13 = 8;
            }
            long j14 = readUnsignedInt;
            long j15 = i13;
            if (j14 < j15) {
                return new AtomSizeTooSmallSniffFailure(readInt, j14, i13);
            }
            int i18 = i12 + i13;
            sniffFailure = null;
            if (readInt == 1836019574) {
                i15 += (int) j14;
                if (length != -1 && i15 > length) {
                    i15 = (int) length;
                }
                i17 = i18;
                j12 = j11;
                i16 = 0;
            } else {
                if (readInt == 1836019558 || readInt == 1836475768) {
                    i11 = 1;
                    break;
                }
                if (readInt == 1835295092) {
                    z13 = true;
                }
                long j16 = length;
                if ((i18 + j14) - j15 >= i15) {
                    i11 = 0;
                    break;
                }
                int i19 = (int) (j14 - j15);
                i17 = i18 + i19;
                if (readInt != 1718909296) {
                    i14 = 0;
                    if (i19 != 0) {
                        extractorInput.advancePeekPosition(i19);
                    }
                } else {
                    if (i19 < 8) {
                        return new AtomSizeTooSmallSniffFailure(readInt, i19, 8);
                    }
                    parsableByteArray.reset(i19);
                    i14 = 0;
                    extractorInput.peekFully(parsableByteArray.getData(), 0, i19);
                    int readInt2 = parsableByteArray.readInt();
                    if (isCompatibleBrand(readInt2, z12)) {
                        z13 = true;
                    }
                    parsableByteArray.skipBytes(4);
                    int bytesLeft = parsableByteArray.bytesLeft() / 4;
                    if (!z13 && bytesLeft > 0) {
                        iArr = new int[bytesLeft];
                        int i21 = 0;
                        while (true) {
                            if (i21 >= bytesLeft) {
                                z14 = z13;
                                break;
                            }
                            int readInt3 = parsableByteArray.readInt();
                            iArr[i21] = readInt3;
                            if (isCompatibleBrand(readInt3, z12)) {
                                break;
                            }
                            i21++;
                        }
                    } else {
                        z14 = z13;
                        iArr = null;
                    }
                    if (!z14) {
                        return new UnsupportedBrandsSniffFailure(readInt2, iArr);
                    }
                    z13 = z14;
                }
                i16 = i14;
                j12 = j11;
                length = j16;
            }
        }
        sniffFailure = null;
        i11 = i16;
        return !z13 ? NoDeclaredBrandSniffFailure.INSTANCE : z11 != i11 ? i11 != 0 ? IncorrectFragmentationSniffFailure.FILE_FRAGMENTED : IncorrectFragmentationSniffFailure.FILE_NOT_FRAGMENTED : sniffFailure;
    }

    @Nullable
    public static SniffFailure sniffUnfragmented(ExtractorInput extractorInput, boolean z11) throws IOException {
        return sniffInternal(extractorInput, false, z11);
    }
}
