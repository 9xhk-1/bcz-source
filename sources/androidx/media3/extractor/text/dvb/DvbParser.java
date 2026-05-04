package androidx.media3.extractor.text.dvb;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.SparseArray;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.trackselection.AdaptiveTrackSelection;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.alipay.sdk.m.n.a;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class DvbParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int DATA_TYPE_24_TABLE_DATA = 32;
    private static final int DATA_TYPE_28_TABLE_DATA = 33;
    private static final int DATA_TYPE_2BP_CODE_STRING = 16;
    private static final int DATA_TYPE_48_TABLE_DATA = 34;
    private static final int DATA_TYPE_4BP_CODE_STRING = 17;
    private static final int DATA_TYPE_8BP_CODE_STRING = 18;
    private static final int DATA_TYPE_END_LINE = 240;
    private static final int OBJECT_CODING_PIXELS = 0;
    private static final int OBJECT_CODING_STRING = 1;
    private static final int PAGE_STATE_NORMAL = 0;
    private static final int REGION_DEPTH_4_BIT = 2;
    private static final int REGION_DEPTH_8_BIT = 3;
    private static final int SEGMENT_TYPE_CLUT_DEFINITION = 18;
    private static final int SEGMENT_TYPE_DISPLAY_DEFINITION = 20;
    private static final int SEGMENT_TYPE_OBJECT_DATA = 19;
    private static final int SEGMENT_TYPE_PAGE_COMPOSITION = 16;
    private static final int SEGMENT_TYPE_REGION_COMPOSITION = 17;
    private static final String TAG = "DvbParser";
    private static final byte[] defaultMap2To4 = {0, 7, 8, 15};
    private static final byte[] defaultMap2To8 = {0, 119, -120, -1};
    private static final byte[] defaultMap4To8 = {0, 17, 34, 51, 68, 85, 102, 119, -120, -103, -86, -69, -52, -35, -18, -1};
    private Bitmap bitmap;
    private final Canvas canvas;
    private final ClutDefinition defaultClutDefinition;
    private final DisplayDefinition defaultDisplayDefinition;
    private final Paint defaultPaint;
    private final Paint fillRegionPaint;
    private final SubtitleService subtitleService;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ClutDefinition {
        public final int[] clutEntries2Bit;
        public final int[] clutEntries4Bit;
        public final int[] clutEntries8Bit;

        /* renamed from: id, reason: collision with root package name */
        public final int f5237id;

        public ClutDefinition(int i11, int[] iArr, int[] iArr2, int[] iArr3) {
            this.f5237id = i11;
            this.clutEntries2Bit = iArr;
            this.clutEntries4Bit = iArr2;
            this.clutEntries8Bit = iArr3;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class DisplayDefinition {
        public final int height;
        public final int horizontalPositionMaximum;
        public final int horizontalPositionMinimum;
        public final int verticalPositionMaximum;
        public final int verticalPositionMinimum;
        public final int width;

        public DisplayDefinition(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.width = i11;
            this.height = i12;
            this.horizontalPositionMinimum = i13;
            this.horizontalPositionMaximum = i14;
            this.verticalPositionMinimum = i15;
            this.verticalPositionMaximum = i16;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ObjectData {
        public final byte[] bottomFieldData;

        /* renamed from: id, reason: collision with root package name */
        public final int f5238id;
        public final boolean nonModifyingColorFlag;
        public final byte[] topFieldData;

        public ObjectData(int i11, boolean z11, byte[] bArr, byte[] bArr2) {
            this.f5238id = i11;
            this.nonModifyingColorFlag = z11;
            this.topFieldData = bArr;
            this.bottomFieldData = bArr2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PageComposition {
        public final SparseArray<PageRegion> regions;
        public final int state;
        public final int timeOutSecs;
        public final int version;

        public PageComposition(int i11, int i12, int i13, SparseArray<PageRegion> sparseArray) {
            this.timeOutSecs = i11;
            this.version = i12;
            this.state = i13;
            this.regions = sparseArray;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class PageRegion {
        public final int horizontalAddress;
        public final int verticalAddress;

        public PageRegion(int i11, int i12) {
            this.horizontalAddress = i11;
            this.verticalAddress = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class RegionComposition {
        public final int clutId;
        public final int depth;
        public final boolean fillFlag;
        public final int height;

        /* renamed from: id, reason: collision with root package name */
        public final int f5239id;
        public final int levelOfCompatibility;
        public final int pixelCode2Bit;
        public final int pixelCode4Bit;
        public final int pixelCode8Bit;
        public final SparseArray<RegionObject> regionObjects;
        public final int width;

        public RegionComposition(int i11, boolean z11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, SparseArray<RegionObject> sparseArray) {
            this.f5239id = i11;
            this.fillFlag = z11;
            this.width = i12;
            this.height = i13;
            this.levelOfCompatibility = i14;
            this.depth = i15;
            this.clutId = i16;
            this.pixelCode8Bit = i17;
            this.pixelCode4Bit = i18;
            this.pixelCode2Bit = i19;
            this.regionObjects = sparseArray;
        }

        public void mergeFrom(RegionComposition regionComposition) {
            SparseArray<RegionObject> sparseArray = regionComposition.regionObjects;
            for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                this.regionObjects.put(sparseArray.keyAt(i11), sparseArray.valueAt(i11));
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class RegionObject {
        public final int backgroundPixelCode;
        public final int foregroundPixelCode;
        public final int horizontalPosition;
        public final int provider;
        public final int type;
        public final int verticalPosition;

        public RegionObject(int i11, int i12, int i13, int i14, int i15, int i16) {
            this.type = i11;
            this.provider = i12;
            this.horizontalPosition = i13;
            this.verticalPosition = i14;
            this.foregroundPixelCode = i15;
            this.backgroundPixelCode = i16;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class SubtitleService {
        public final int ancillaryPageId;

        @Nullable
        public DisplayDefinition displayDefinition;

        @Nullable
        public PageComposition pageComposition;
        public final int subtitlePageId;
        public final SparseArray<RegionComposition> regions = new SparseArray<>();
        public final SparseArray<ClutDefinition> cluts = new SparseArray<>();
        public final SparseArray<ObjectData> objects = new SparseArray<>();
        public final SparseArray<ClutDefinition> ancillaryCluts = new SparseArray<>();
        public final SparseArray<ObjectData> ancillaryObjects = new SparseArray<>();

        public SubtitleService(int i11, int i12) {
            this.subtitlePageId = i11;
            this.ancillaryPageId = i12;
        }

        public void reset() {
            this.regions.clear();
            this.cluts.clear();
            this.objects.clear();
            this.ancillaryCluts.clear();
            this.ancillaryObjects.clear();
            this.displayDefinition = null;
            this.pageComposition = null;
        }
    }

    public DvbParser(List<byte[]> list) {
        ParsableByteArray parsableByteArray = new ParsableByteArray(list.get(0));
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        Paint paint = new Paint();
        this.defaultPaint = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        paint.setPathEffect(null);
        Paint paint2 = new Paint();
        this.fillRegionPaint = paint2;
        paint2.setStyle(Paint.Style.FILL);
        paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_OVER));
        paint2.setPathEffect(null);
        this.canvas = new Canvas();
        this.defaultDisplayDefinition = new DisplayDefinition(AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 575, 0, AdaptiveTrackSelection.DEFAULT_MAX_HEIGHT_TO_DISCARD, 0, 575);
        this.defaultClutDefinition = new ClutDefinition(0, generateDefault2BitClutEntries(), generateDefault4BitClutEntries(), generateDefault8BitClutEntries());
        this.subtitleService = new SubtitleService(readUnsignedShort, readUnsignedShort2);
    }

    private static byte[] buildClutMapTable(int i11, int i12, ParsableBitArray parsableBitArray) {
        byte[] bArr = new byte[i11];
        for (int i13 = 0; i13 < i11; i13++) {
            bArr[i13] = (byte) parsableBitArray.readBits(i12);
        }
        return bArr;
    }

    private static int[] generateDefault2BitClutEntries() {
        return new int[]{0, -1, -16777216, -8421505};
    }

    private static int[] generateDefault4BitClutEntries() {
        int[] iArr = new int[16];
        iArr[0] = 0;
        for (int i11 = 1; i11 < 16; i11++) {
            if (i11 < 8) {
                iArr[i11] = getColor(255, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) != 0 ? 255 : 0);
            } else {
                iArr[i11] = getColor(255, (i11 & 1) != 0 ? 127 : 0, (i11 & 2) != 0 ? 127 : 0, (i11 & 4) == 0 ? 0 : 127);
            }
        }
        return iArr;
    }

    private static int[] generateDefault8BitClutEntries() {
        int[] iArr = new int[256];
        iArr[0] = 0;
        for (int i11 = 0; i11 < 256; i11++) {
            if (i11 < 8) {
                iArr[i11] = getColor(63, (i11 & 1) != 0 ? 255 : 0, (i11 & 2) != 0 ? 255 : 0, (i11 & 4) == 0 ? 0 : 255);
            } else {
                int i12 = i11 & 136;
                if (i12 == 0) {
                    iArr[i11] = getColor(255, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 8) {
                    iArr[i11] = getColor(127, ((i11 & 1) != 0 ? 85 : 0) + ((i11 & 16) != 0 ? 170 : 0), ((i11 & 2) != 0 ? 85 : 0) + ((i11 & 32) != 0 ? 170 : 0), ((i11 & 4) == 0 ? 0 : 85) + ((i11 & 64) == 0 ? 0 : 170));
                } else if (i12 == 128) {
                    iArr[i11] = getColor(255, ((i11 & 1) != 0 ? 43 : 0) + 127 + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + 127 + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + 127 + ((i11 & 64) == 0 ? 0 : 85));
                } else if (i12 == 136) {
                    iArr[i11] = getColor(255, ((i11 & 1) != 0 ? 43 : 0) + ((i11 & 16) != 0 ? 85 : 0), ((i11 & 2) != 0 ? 43 : 0) + ((i11 & 32) != 0 ? 85 : 0), ((i11 & 4) == 0 ? 0 : 43) + ((i11 & 64) == 0 ? 0 : 85));
                }
            }
        }
        return iArr;
    }

    private static int getColor(int i11, int i12, int i13, int i14) {
        return (i11 << 24) | (i12 << 16) | (i13 << 8) | i14;
    }

    private static int paint2BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i11, int i12, @Nullable Paint paint, Canvas canvas) {
        boolean z11;
        int i13;
        int readBits;
        int readBits2;
        boolean z12 = false;
        while (true) {
            int readBits3 = parsableBitArray.readBits(2);
            if (readBits3 != 0) {
                z11 = z12;
                i13 = 1;
            } else {
                if (parsableBitArray.readBit()) {
                    readBits = parsableBitArray.readBits(3) + 3;
                    readBits2 = parsableBitArray.readBits(2);
                } else {
                    if (parsableBitArray.readBit()) {
                        z11 = z12;
                        i13 = 1;
                    } else {
                        int readBits4 = parsableBitArray.readBits(2);
                        if (readBits4 == 0) {
                            z11 = true;
                        } else if (readBits4 == 1) {
                            z11 = z12;
                            i13 = 2;
                        } else if (readBits4 == 2) {
                            readBits = parsableBitArray.readBits(4) + 12;
                            readBits2 = parsableBitArray.readBits(2);
                        } else if (readBits4 != 3) {
                            z11 = z12;
                        } else {
                            readBits = parsableBitArray.readBits(8) + 29;
                            readBits2 = parsableBitArray.readBits(2);
                        }
                        readBits3 = 0;
                        i13 = 0;
                    }
                    readBits3 = 0;
                }
                z11 = z12;
                i13 = readBits;
                readBits3 = readBits2;
            }
            if (i13 != 0 && paint != null) {
                if (bArr != null) {
                    readBits3 = bArr[readBits3];
                }
                paint.setColor(iArr[readBits3]);
                canvas.drawRect(i11, i12, i11 + i13, 1 + i12, paint);
            }
            i11 += i13;
            if (z11) {
                return i11;
            }
            z12 = z11;
        }
    }

    private static int paint4BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i11, int i12, @Nullable Paint paint, Canvas canvas) {
        boolean z11;
        int i13;
        int readBits;
        int readBits2;
        boolean z12 = false;
        while (true) {
            int readBits3 = parsableBitArray.readBits(4);
            if (readBits3 != 0) {
                z11 = z12;
                i13 = 1;
            } else if (parsableBitArray.readBit()) {
                if (parsableBitArray.readBit()) {
                    int readBits4 = parsableBitArray.readBits(2);
                    if (readBits4 == 0) {
                        z11 = z12;
                        i13 = 1;
                        readBits3 = 0;
                    } else if (readBits4 == 1) {
                        readBits3 = 0;
                        i13 = 2;
                        z11 = z12;
                    } else if (readBits4 == 2) {
                        readBits = parsableBitArray.readBits(4) + 9;
                        readBits2 = parsableBitArray.readBits(4);
                    } else if (readBits4 != 3) {
                        z11 = z12;
                        readBits3 = 0;
                        i13 = 0;
                    } else {
                        readBits = parsableBitArray.readBits(8) + 25;
                        readBits2 = parsableBitArray.readBits(4);
                    }
                } else {
                    readBits = parsableBitArray.readBits(2) + 4;
                    readBits2 = parsableBitArray.readBits(4);
                }
                z11 = z12;
                i13 = readBits;
                readBits3 = readBits2;
            } else {
                int readBits5 = parsableBitArray.readBits(3);
                if (readBits5 != 0) {
                    z11 = z12;
                    i13 = readBits5 + 2;
                    readBits3 = 0;
                } else {
                    z11 = true;
                    readBits3 = 0;
                    i13 = 0;
                }
            }
            if (i13 != 0 && paint != null) {
                if (bArr != null) {
                    readBits3 = bArr[readBits3];
                }
                paint.setColor(iArr[readBits3]);
                canvas.drawRect(i11, i12, i11 + i13, 1 + i12, paint);
            }
            i11 += i13;
            if (z11) {
                return i11;
            }
            z12 = z11;
        }
    }

    private static int paint8BitPixelCodeString(ParsableBitArray parsableBitArray, int[] iArr, @Nullable byte[] bArr, int i11, int i12, @Nullable Paint paint, Canvas canvas) {
        boolean z11;
        int readBits;
        boolean z12 = false;
        while (true) {
            int readBits2 = parsableBitArray.readBits(8);
            if (readBits2 != 0) {
                z11 = z12;
                readBits = 1;
            } else if (parsableBitArray.readBit()) {
                z11 = z12;
                readBits = parsableBitArray.readBits(7);
                readBits2 = parsableBitArray.readBits(8);
            } else {
                int readBits3 = parsableBitArray.readBits(7);
                if (readBits3 != 0) {
                    z11 = z12;
                    readBits = readBits3;
                    readBits2 = 0;
                } else {
                    z11 = true;
                    readBits2 = 0;
                    readBits = 0;
                }
            }
            if (readBits != 0 && paint != null) {
                if (bArr != null) {
                    readBits2 = bArr[readBits2];
                }
                paint.setColor(iArr[readBits2]);
                canvas.drawRect(i11, i12, i11 + readBits, 1 + i12, paint);
            }
            i11 += readBits;
            if (z11) {
                return i11;
            }
            z12 = z11;
        }
    }

    private static void paintPixelDataSubBlock(byte[] bArr, int[] iArr, int i11, int i12, int i13, @Nullable Paint paint, Canvas canvas) {
        int[] iArr2;
        Paint paint2;
        Canvas canvas2;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr);
        byte[] bArr5 = null;
        byte[] bArr6 = null;
        int i14 = i12;
        int i15 = i13;
        byte[] bArr7 = null;
        while (parsableBitArray.bitsLeft() != 0) {
            int readBits = parsableBitArray.readBits(8);
            if (readBits != 240) {
                switch (readBits) {
                    case 16:
                        iArr2 = iArr;
                        Paint paint3 = paint;
                        canvas2 = canvas;
                        if (i11 != 3) {
                            if (i11 != 2) {
                                bArr2 = null;
                                paint2 = paint3;
                                i14 = paint2BitPixelCodeString(parsableBitArray, iArr2, bArr2, i14, i15, paint2, canvas2);
                                parsableBitArray.byteAlign();
                                break;
                            } else {
                                bArr3 = bArr6 == null ? defaultMap2To4 : bArr6;
                            }
                        } else {
                            bArr3 = bArr7 == null ? defaultMap2To8 : bArr7;
                        }
                        paint2 = paint3;
                        bArr2 = bArr3;
                        i14 = paint2BitPixelCodeString(parsableBitArray, iArr2, bArr2, i14, i15, paint2, canvas2);
                        parsableBitArray.byteAlign();
                    case 17:
                        iArr2 = iArr;
                        Paint paint4 = paint;
                        canvas2 = canvas;
                        if (i11 == 3) {
                            bArr4 = bArr5 == null ? defaultMap4To8 : bArr5;
                        } else {
                            bArr4 = null;
                        }
                        paint2 = paint4;
                        i14 = paint4BitPixelCodeString(parsableBitArray, iArr2, bArr4, i14, i15, paint2, canvas2);
                        parsableBitArray.byteAlign();
                        break;
                    case 18:
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        i14 = paint8BitPixelCodeString(parsableBitArray, iArr2, null, i14, i15, paint2, canvas2);
                        break;
                    default:
                        switch (readBits) {
                            case 32:
                                bArr6 = buildClutMapTable(4, 4, parsableBitArray);
                                break;
                            case 33:
                                bArr7 = buildClutMapTable(4, 8, parsableBitArray);
                                break;
                            case 34:
                                bArr5 = buildClutMapTable(16, 8, parsableBitArray);
                                break;
                        }
                        iArr2 = iArr;
                        paint2 = paint;
                        canvas2 = canvas;
                        break;
                }
            } else {
                iArr2 = iArr;
                paint2 = paint;
                canvas2 = canvas;
                i15 += 2;
                i14 = i12;
            }
            iArr = iArr2;
            paint = paint2;
            canvas = canvas2;
        }
    }

    private static void paintPixelDataSubBlocks(ObjectData objectData, ClutDefinition clutDefinition, int i11, int i12, int i13, @Nullable Paint paint, Canvas canvas) {
        int[] iArr = i11 == 3 ? clutDefinition.clutEntries8Bit : i11 == 2 ? clutDefinition.clutEntries4Bit : clutDefinition.clutEntries2Bit;
        paintPixelDataSubBlock(objectData.topFieldData, iArr, i11, i12, i13, paint, canvas);
        paintPixelDataSubBlock(objectData.bottomFieldData, iArr, i11, i12, i13 + 1, paint, canvas);
    }

    private static ClutDefinition parseClutDefinition(ParsableBitArray parsableBitArray, int i11) {
        int readBits;
        int i12;
        int readBits2;
        int i13;
        int i14;
        int i15 = 8;
        int readBits3 = parsableBitArray.readBits(8);
        parsableBitArray.skipBits(8);
        int i16 = 2;
        int i17 = i11 - 2;
        int[] generateDefault2BitClutEntries = generateDefault2BitClutEntries();
        int[] generateDefault4BitClutEntries = generateDefault4BitClutEntries();
        int[] generateDefault8BitClutEntries = generateDefault8BitClutEntries();
        while (i17 > 0) {
            int readBits4 = parsableBitArray.readBits(i15);
            int readBits5 = parsableBitArray.readBits(i15);
            int[] iArr = (readBits5 & 128) != 0 ? generateDefault2BitClutEntries : (readBits5 & 64) != 0 ? generateDefault4BitClutEntries : generateDefault8BitClutEntries;
            if ((readBits5 & 1) != 0) {
                i13 = parsableBitArray.readBits(i15);
                i14 = parsableBitArray.readBits(i15);
                readBits = parsableBitArray.readBits(i15);
                readBits2 = parsableBitArray.readBits(i15);
                i12 = i17 - 6;
            } else {
                int readBits6 = parsableBitArray.readBits(6) << i16;
                int readBits7 = parsableBitArray.readBits(4) << 4;
                readBits = parsableBitArray.readBits(4) << 4;
                i12 = i17 - 4;
                readBits2 = parsableBitArray.readBits(i16) << 6;
                i13 = readBits6;
                i14 = readBits7;
            }
            if (i13 == 0) {
                readBits2 = 255;
                i14 = 0;
                readBits = 0;
            }
            double d11 = i13;
            double d12 = i14 + a.f10855g;
            double d13 = readBits + a.f10855g;
            iArr[readBits4] = getColor((byte) (255 - (readBits2 & 255)), Util.constrainValue((int) (d11 + (1.402d * d12)), 0, 255), Util.constrainValue((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255), Util.constrainValue((int) (d11 + (d13 * 1.772d)), 0, 255));
            i17 = i12;
            readBits3 = readBits3;
            i15 = 8;
            i16 = 2;
        }
        return new ClutDefinition(readBits3, generateDefault2BitClutEntries, generateDefault4BitClutEntries, generateDefault8BitClutEntries);
    }

    private static DisplayDefinition parseDisplayDefinition(ParsableBitArray parsableBitArray) {
        int i11;
        int i12;
        int i13;
        int i14;
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int readBits = parsableBitArray.readBits(16);
        int readBits2 = parsableBitArray.readBits(16);
        if (readBit) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            int readBits5 = parsableBitArray.readBits(16);
            i14 = parsableBitArray.readBits(16);
            i13 = readBits4;
            i12 = readBits5;
            i11 = readBits3;
        } else {
            i11 = 0;
            i12 = 0;
            i13 = readBits;
            i14 = readBits2;
        }
        return new DisplayDefinition(readBits, readBits2, i11, i13, i12, i14);
    }

    private static ObjectData parseObjectData(ParsableBitArray parsableBitArray) {
        byte[] bArr;
        int readBits = parsableBitArray.readBits(16);
        parsableBitArray.skipBits(4);
        int readBits2 = parsableBitArray.readBits(2);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(1);
        byte[] bArr2 = Util.EMPTY_BYTE_ARRAY;
        if (readBits2 == 1) {
            parsableBitArray.skipBits(parsableBitArray.readBits(8) * 16);
        } else if (readBits2 == 0) {
            int readBits3 = parsableBitArray.readBits(16);
            int readBits4 = parsableBitArray.readBits(16);
            if (readBits3 > 0) {
                bArr2 = new byte[readBits3];
                parsableBitArray.readBytes(bArr2, 0, readBits3);
            }
            if (readBits4 > 0) {
                bArr = new byte[readBits4];
                parsableBitArray.readBytes(bArr, 0, readBits4);
                return new ObjectData(readBits, readBit, bArr2, bArr);
            }
        }
        bArr = bArr2;
        return new ObjectData(readBits, readBit, bArr2, bArr);
    }

    private static PageComposition parsePageComposition(ParsableBitArray parsableBitArray, int i11) {
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(4);
        int readBits3 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i12 = i11 - 2;
        SparseArray sparseArray = new SparseArray();
        while (i12 > 0) {
            int readBits4 = parsableBitArray.readBits(8);
            parsableBitArray.skipBits(8);
            i12 -= 6;
            sparseArray.put(readBits4, new PageRegion(parsableBitArray.readBits(16), parsableBitArray.readBits(16)));
        }
        return new PageComposition(readBits, readBits2, readBits3, sparseArray);
    }

    private static RegionComposition parseRegionComposition(ParsableBitArray parsableBitArray, int i11) {
        int i12;
        int i13;
        int i14;
        char c11;
        int readBits = parsableBitArray.readBits(8);
        int i15 = 4;
        parsableBitArray.skipBits(4);
        boolean readBit = parsableBitArray.readBit();
        parsableBitArray.skipBits(3);
        int i16 = 16;
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int readBits4 = parsableBitArray.readBits(3);
        int readBits5 = parsableBitArray.readBits(3);
        int i17 = 2;
        parsableBitArray.skipBits(2);
        int readBits6 = parsableBitArray.readBits(8);
        int readBits7 = parsableBitArray.readBits(8);
        int readBits8 = parsableBitArray.readBits(4);
        int readBits9 = parsableBitArray.readBits(2);
        parsableBitArray.skipBits(2);
        int i18 = i11 - 10;
        SparseArray sparseArray = new SparseArray();
        while (i18 > 0) {
            int readBits10 = parsableBitArray.readBits(i16);
            int readBits11 = parsableBitArray.readBits(i17);
            int readBits12 = parsableBitArray.readBits(i17);
            int readBits13 = parsableBitArray.readBits(12);
            parsableBitArray.skipBits(i15);
            int readBits14 = parsableBitArray.readBits(12);
            int i19 = i18 - 6;
            if (readBits11 != 1) {
                i12 = 2;
                if (readBits11 != 2) {
                    i14 = 0;
                    i13 = 0;
                    i18 = i19;
                    c11 = '\b';
                    sparseArray.put(readBits10, new RegionObject(readBits11, readBits12, readBits13, readBits14, i14, i13));
                    i16 = 16;
                    i17 = i12;
                    i15 = 4;
                }
            } else {
                i12 = 2;
            }
            c11 = '\b';
            i18 -= 8;
            i14 = parsableBitArray.readBits(8);
            i13 = parsableBitArray.readBits(8);
            sparseArray.put(readBits10, new RegionObject(readBits11, readBits12, readBits13, readBits14, i14, i13));
            i16 = 16;
            i17 = i12;
            i15 = 4;
        }
        return new RegionComposition(readBits, readBit, readBits2, readBits3, readBits4, readBits5, readBits6, readBits7, readBits8, readBits9, sparseArray);
    }

    private static void parseSubtitlingSegment(ParsableBitArray parsableBitArray, SubtitleService subtitleService) {
        RegionComposition regionComposition;
        int readBits = parsableBitArray.readBits(8);
        int readBits2 = parsableBitArray.readBits(16);
        int readBits3 = parsableBitArray.readBits(16);
        int bytePosition = parsableBitArray.getBytePosition() + readBits3;
        if (readBits3 * 8 > parsableBitArray.bitsLeft()) {
            Log.w(TAG, "Data field length exceeds limit");
            parsableBitArray.skipBits(parsableBitArray.bitsLeft());
            return;
        }
        switch (readBits) {
            case 16:
                if (readBits2 == subtitleService.subtitlePageId) {
                    PageComposition pageComposition = subtitleService.pageComposition;
                    PageComposition parsePageComposition = parsePageComposition(parsableBitArray, readBits3);
                    if (parsePageComposition.state == 0) {
                        if (pageComposition != null && pageComposition.version != parsePageComposition.version) {
                            subtitleService.pageComposition = parsePageComposition;
                            break;
                        }
                    } else {
                        subtitleService.pageComposition = parsePageComposition;
                        subtitleService.regions.clear();
                        subtitleService.cluts.clear();
                        subtitleService.objects.clear();
                        break;
                    }
                }
                break;
            case 17:
                PageComposition pageComposition2 = subtitleService.pageComposition;
                if (readBits2 == subtitleService.subtitlePageId && pageComposition2 != null) {
                    RegionComposition parseRegionComposition = parseRegionComposition(parsableBitArray, readBits3);
                    if (pageComposition2.state == 0 && (regionComposition = subtitleService.regions.get(parseRegionComposition.f5239id)) != null) {
                        parseRegionComposition.mergeFrom(regionComposition);
                    }
                    subtitleService.regions.put(parseRegionComposition.f5239id, parseRegionComposition);
                    break;
                }
                break;
            case 18:
                if (readBits2 != subtitleService.subtitlePageId) {
                    if (readBits2 == subtitleService.ancillaryPageId) {
                        ClutDefinition parseClutDefinition = parseClutDefinition(parsableBitArray, readBits3);
                        subtitleService.ancillaryCluts.put(parseClutDefinition.f5237id, parseClutDefinition);
                        break;
                    }
                } else {
                    ClutDefinition parseClutDefinition2 = parseClutDefinition(parsableBitArray, readBits3);
                    subtitleService.cluts.put(parseClutDefinition2.f5237id, parseClutDefinition2);
                    break;
                }
                break;
            case 19:
                if (readBits2 != subtitleService.subtitlePageId) {
                    if (readBits2 == subtitleService.ancillaryPageId) {
                        ObjectData parseObjectData = parseObjectData(parsableBitArray);
                        subtitleService.ancillaryObjects.put(parseObjectData.f5238id, parseObjectData);
                        break;
                    }
                } else {
                    ObjectData parseObjectData2 = parseObjectData(parsableBitArray);
                    subtitleService.objects.put(parseObjectData2.f5238id, parseObjectData2);
                    break;
                }
                break;
            case 20:
                if (readBits2 == subtitleService.subtitlePageId) {
                    subtitleService.displayDefinition = parseDisplayDefinition(parsableBitArray);
                    break;
                }
                break;
        }
        parsableBitArray.skipBytes(bytePosition - parsableBitArray.getBytePosition());
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i11, int i12, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        ParsableBitArray parsableBitArray = new ParsableBitArray(bArr, i12 + i11);
        parsableBitArray.setPosition(i11);
        consumer.accept(parse(parsableBitArray));
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void reset() {
        this.subtitleService.reset();
    }

    private CuesWithTiming parse(ParsableBitArray parsableBitArray) {
        int i11;
        SparseArray<PageRegion> sparseArray;
        int i12;
        while (parsableBitArray.bitsLeft() >= 48 && parsableBitArray.readBits(8) == 15) {
            parseSubtitlingSegment(parsableBitArray, this.subtitleService);
        }
        SubtitleService subtitleService = this.subtitleService;
        PageComposition pageComposition = subtitleService.pageComposition;
        if (pageComposition == null) {
            return new CuesWithTiming(ImmutableList.of(), C.TIME_UNSET, C.TIME_UNSET);
        }
        DisplayDefinition displayDefinition = subtitleService.displayDefinition;
        if (displayDefinition == null) {
            displayDefinition = this.defaultDisplayDefinition;
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null || displayDefinition.width + 1 != bitmap.getWidth() || displayDefinition.height + 1 != this.bitmap.getHeight()) {
            Bitmap createBitmap = Bitmap.createBitmap(displayDefinition.width + 1, displayDefinition.height + 1, Bitmap.Config.ARGB_8888);
            this.bitmap = createBitmap;
            this.canvas.setBitmap(createBitmap);
        }
        ArrayList arrayList = new ArrayList();
        SparseArray<PageRegion> sparseArray2 = pageComposition.regions;
        int i13 = 0;
        while (i13 < sparseArray2.size()) {
            this.canvas.save();
            PageRegion valueAt = sparseArray2.valueAt(i13);
            RegionComposition regionComposition = this.subtitleService.regions.get(sparseArray2.keyAt(i13));
            int i14 = valueAt.horizontalAddress + displayDefinition.horizontalPositionMinimum;
            int i15 = valueAt.verticalAddress + displayDefinition.verticalPositionMinimum;
            this.canvas.clipRect(i14, i15, Math.min(regionComposition.width + i14, displayDefinition.horizontalPositionMaximum), Math.min(regionComposition.height + i15, displayDefinition.verticalPositionMaximum));
            ClutDefinition clutDefinition = this.subtitleService.cluts.get(regionComposition.clutId);
            if (clutDefinition == null && (clutDefinition = this.subtitleService.ancillaryCluts.get(regionComposition.clutId)) == null) {
                clutDefinition = this.defaultClutDefinition;
            }
            ClutDefinition clutDefinition2 = clutDefinition;
            SparseArray<RegionObject> sparseArray3 = regionComposition.regionObjects;
            int i16 = 0;
            while (i16 < sparseArray3.size()) {
                int keyAt = sparseArray3.keyAt(i16);
                RegionObject valueAt2 = sparseArray3.valueAt(i16);
                ObjectData objectData = this.subtitleService.objects.get(keyAt);
                if (objectData == null) {
                    objectData = this.subtitleService.ancillaryObjects.get(keyAt);
                }
                if (objectData != null) {
                    sparseArray = sparseArray2;
                    i12 = i16;
                    paintPixelDataSubBlocks(objectData, clutDefinition2, regionComposition.depth, valueAt2.horizontalPosition + i14, valueAt2.verticalPosition + i15, objectData.nonModifyingColorFlag ? null : this.defaultPaint, this.canvas);
                } else {
                    sparseArray = sparseArray2;
                    i12 = i16;
                }
                i16 = i12 + 1;
                sparseArray2 = sparseArray;
            }
            SparseArray<PageRegion> sparseArray4 = sparseArray2;
            if (regionComposition.fillFlag) {
                int i17 = regionComposition.depth;
                if (i17 == 3) {
                    i11 = clutDefinition2.clutEntries8Bit[regionComposition.pixelCode8Bit];
                } else if (i17 == 2) {
                    i11 = clutDefinition2.clutEntries4Bit[regionComposition.pixelCode4Bit];
                } else {
                    i11 = clutDefinition2.clutEntries2Bit[regionComposition.pixelCode2Bit];
                }
                this.fillRegionPaint.setColor(i11);
                this.canvas.drawRect(i14, i15, regionComposition.width + i14, regionComposition.height + i15, this.fillRegionPaint);
            }
            arrayList.add(new Cue.Builder().setBitmap(Bitmap.createBitmap(this.bitmap, i14, i15, regionComposition.width, regionComposition.height)).setPosition(i14 / displayDefinition.width).setPositionAnchor(0).setLine(i15 / displayDefinition.height, 0).setLineAnchor(0).setSize(regionComposition.width / displayDefinition.width).setBitmapHeight(regionComposition.height / displayDefinition.height).build());
            this.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
            this.canvas.restore();
            i13++;
            sparseArray2 = sparseArray4;
        }
        return new CuesWithTiming(arrayList, C.TIME_UNSET, C.TIME_UNSET);
    }
}
