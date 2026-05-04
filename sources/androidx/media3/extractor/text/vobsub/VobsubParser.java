package androidx.media3.extractor.text.vobsub;

import android.graphics.Bitmap;
import android.graphics.Rect;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableBitArray;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.List;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class VobsubParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int DEFAULT_DURATION_US = 5000000;
    private static final String TAG = "VobsubParser";
    private final CueBuilder cueBuilder;

    @Nullable
    private Inflater inflater;
    private final ParsableByteArray scratch = new ParsableByteArray();
    private final ParsableByteArray inflatedScratch = new ParsableByteArray();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CueBuilder {
        private static final int CMD_ALPHA = 4;
        private static final int CMD_AREA = 5;
        private static final int CMD_COLORS = 3;
        private static final int CMD_END = 255;
        private static final int CMD_FORCE_START = 0;
        private static final int CMD_OFFSETS = 6;
        private static final int CMD_START = 1;
        private static final int CMD_STOP = 2;

        @Nullable
        private Rect boundingBox;
        private final int[] colors = new int[4];
        private int dataOffset0 = -1;
        private int dataOffset1 = -1;
        private boolean hasColors;
        private boolean hasPlane;
        private int[] palette;
        private int planeHeight;
        private int planeWidth;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public static final class Run {
            public int colorIndex;
            public int length;

            private Run() {
            }
        }

        private static int getColor(int[] iArr, int i11) {
            return (i11 < 0 || i11 >= iArr.length) ? iArr[0] : iArr[i11];
        }

        private static int parseColor(String str) {
            try {
                return Integer.parseInt(str, 16);
            } catch (RuntimeException unused) {
                return 0;
            }
        }

        private void parseControl(int[] iArr, ParsableByteArray parsableByteArray, int i11) {
            while (parsableByteArray.getPosition() < i11 && parsableByteArray.bytesLeft() > 0) {
                switch (parsableByteArray.readUnsignedByte()) {
                    case 0:
                    case 1:
                    case 2:
                        break;
                    case 3:
                        if (parseControlColors(iArr, parsableByteArray)) {
                            break;
                        } else {
                            return;
                        }
                    case 4:
                        if (parseControlAlpha(parsableByteArray)) {
                            break;
                        } else {
                            return;
                        }
                    case 5:
                        if (parseControlArea(parsableByteArray)) {
                            break;
                        } else {
                            return;
                        }
                    case 6:
                        if (parseControlOffsets(parsableByteArray)) {
                            break;
                        } else {
                            return;
                        }
                    default:
                        return;
                }
            }
        }

        private boolean parseControlAlpha(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 2 || !this.hasColors) {
                return false;
            }
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int[] iArr = this.colors;
            iArr[3] = setAlpha(iArr[3], readUnsignedByte >> 4);
            int[] iArr2 = this.colors;
            iArr2[2] = setAlpha(iArr2[2], readUnsignedByte & 15);
            int[] iArr3 = this.colors;
            iArr3[1] = setAlpha(iArr3[1], readUnsignedByte2 >> 4);
            int[] iArr4 = this.colors;
            iArr4[0] = setAlpha(iArr4[0], readUnsignedByte2 & 15);
            return true;
        }

        private boolean parseControlArea(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 6) {
                return false;
            }
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            int i11 = (readUnsignedByte << 4) | (readUnsignedByte2 >> 4);
            int readUnsignedByte3 = ((readUnsignedByte2 & 15) << 8) | parsableByteArray.readUnsignedByte();
            int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
            int readUnsignedByte5 = parsableByteArray.readUnsignedByte();
            this.boundingBox = new Rect(i11, (readUnsignedByte4 << 4) | (readUnsignedByte5 >> 4), readUnsignedByte3 + 1, (parsableByteArray.readUnsignedByte() | ((readUnsignedByte5 & 15) << 8)) + 1);
            return true;
        }

        private boolean parseControlColors(int[] iArr, ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 2) {
                return false;
            }
            int readUnsignedByte = parsableByteArray.readUnsignedByte();
            int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
            this.colors[3] = getColor(iArr, readUnsignedByte >> 4);
            this.colors[2] = getColor(iArr, readUnsignedByte & 15);
            this.colors[1] = getColor(iArr, readUnsignedByte2 >> 4);
            this.colors[0] = getColor(iArr, readUnsignedByte2 & 15);
            this.hasColors = true;
            return true;
        }

        private boolean parseControlOffsets(ParsableByteArray parsableByteArray) {
            if (parsableByteArray.bytesLeft() < 4) {
                return false;
            }
            this.dataOffset0 = parsableByteArray.readUnsignedShort();
            this.dataOffset1 = parsableByteArray.readUnsignedShort();
            return true;
        }

        private void parseRleData(ParsableBitArray parsableBitArray, boolean z11, Rect rect, int[] iArr) {
            int width = rect.width();
            int height = rect.height();
            int i11 = !z11 ? 1 : 0;
            int i12 = i11 * width;
            Run run = new Run();
            while (true) {
                int i13 = 0;
                do {
                    parseRun(parsableBitArray, width, run);
                    int min = Math.min(run.length, width - i13);
                    if (min > 0) {
                        int i14 = i12 + min;
                        Arrays.fill(iArr, i12, i14, this.colors[run.colorIndex]);
                        i13 += min;
                        i12 = i14;
                    }
                } while (i13 < width);
                i11 += 2;
                if (i11 >= height) {
                    return;
                }
                i12 = i11 * width;
                parsableBitArray.byteAlign();
            }
        }

        private static void parseRun(ParsableBitArray parsableBitArray, int i11, Run run) {
            int i12 = 0;
            for (int i13 = 1; i12 < i13 && i13 <= 64; i13 <<= 2) {
                if (parsableBitArray.bitsLeft() < 4) {
                    run.colorIndex = -1;
                    run.length = 0;
                    return;
                }
                i12 = (i12 << 4) | parsableBitArray.readBits(4);
            }
            run.colorIndex = i12 & 3;
            if (i12 >= 4) {
                i11 = i12 >> 2;
            }
            run.length = i11;
        }

        private static int setAlpha(int i11, int i12) {
            return (i11 & 16777215) | ((i12 * 17) << 24);
        }

        @Nullable
        public Cue build(ParsableByteArray parsableByteArray) {
            Rect rect;
            if (this.palette == null || !this.hasPlane || !this.hasColors || (rect = this.boundingBox) == null || this.dataOffset0 == -1 || this.dataOffset1 == -1 || rect.width() < 2 || this.boundingBox.height() < 2) {
                return null;
            }
            Rect rect2 = this.boundingBox;
            int[] iArr = new int[rect2.width() * rect2.height()];
            ParsableBitArray parsableBitArray = new ParsableBitArray();
            parsableByteArray.setPosition(this.dataOffset0);
            parsableBitArray.reset(parsableByteArray);
            parseRleData(parsableBitArray, true, rect2, iArr);
            parsableByteArray.setPosition(this.dataOffset1);
            parsableBitArray.reset(parsableByteArray);
            parseRleData(parsableBitArray, false, rect2, iArr);
            return new Cue.Builder().setBitmap(Bitmap.createBitmap(iArr, rect2.width(), rect2.height(), Bitmap.Config.ARGB_8888)).setPosition(rect2.left / this.planeWidth).setPositionAnchor(0).setLine(rect2.top / this.planeHeight, 0).setLineAnchor(0).setSize(rect2.width() / this.planeWidth).setBitmapHeight(rect2.height() / this.planeHeight).build();
        }

        public void parseIdx(String str) {
            for (String str2 : Util.split(str.trim(), "\\r?\\n")) {
                if (str2.startsWith("palette: ")) {
                    String[] split = Util.split(str2.substring(9), ",");
                    this.palette = new int[split.length];
                    for (int i11 = 0; i11 < split.length; i11++) {
                        this.palette[i11] = parseColor(split[i11].trim());
                    }
                } else if (str2.startsWith("size: ")) {
                    String[] split2 = Util.split(str2.substring(6).trim(), "x");
                    if (split2.length == 2) {
                        try {
                            this.planeWidth = Integer.parseInt(split2[0]);
                            this.planeHeight = Integer.parseInt(split2[1]);
                            this.hasPlane = true;
                        } catch (RuntimeException e11) {
                            Log.w(VobsubParser.TAG, "Parsing IDX failed", e11);
                        }
                    }
                }
            }
        }

        public void parseSpu(ParsableByteArray parsableByteArray) {
            int[] iArr = this.palette;
            if (iArr == null || !this.hasPlane) {
                return;
            }
            parsableByteArray.skipBytes(parsableByteArray.readUnsignedShort() - 2);
            parseControl(iArr, parsableByteArray, parsableByteArray.readUnsignedShort());
        }

        public void reset() {
            this.hasColors = false;
            this.boundingBox = null;
            this.dataOffset0 = -1;
            this.dataOffset1 = -1;
        }
    }

    public VobsubParser(List<byte[]> list) {
        CueBuilder cueBuilder = new CueBuilder();
        this.cueBuilder = cueBuilder;
        cueBuilder.parseIdx(new String(list.get(0), StandardCharsets.UTF_8));
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i11, int i12, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.scratch.reset(bArr, i12 + i11);
        this.scratch.setPosition(i11);
        Cue parse = parse();
        consumer.accept(new CuesWithTiming(parse != null ? ImmutableList.of(parse) : ImmutableList.of(), C.TIME_UNSET, 5000000L));
    }

    @Nullable
    private Cue parse() {
        if (this.inflater == null) {
            this.inflater = new Inflater();
        }
        if (Util.maybeInflate(this.scratch, this.inflatedScratch, this.inflater)) {
            this.scratch.reset(this.inflatedScratch.getData(), this.inflatedScratch.limit());
        }
        this.cueBuilder.reset();
        int bytesLeft = this.scratch.bytesLeft();
        if (bytesLeft < 2 || this.scratch.readUnsignedShort() != bytesLeft) {
            return null;
        }
        this.cueBuilder.parseSpu(this.scratch);
        return this.cueBuilder.build(this.scratch);
    }
}
