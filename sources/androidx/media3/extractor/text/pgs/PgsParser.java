package androidx.media3.extractor.text.pgs;

import android.graphics.Bitmap;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.alipay.sdk.m.n.a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.zip.Inflater;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class PgsParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int SECTION_TYPE_BITMAP_PICTURE = 21;
    private static final int SECTION_TYPE_END = 128;
    private static final int SECTION_TYPE_IDENTIFIER = 22;
    private static final int SECTION_TYPE_PALETTE = 20;

    @Nullable
    private Inflater inflater;
    private final ParsableByteArray buffer = new ParsableByteArray();
    private final ParsableByteArray inflatedBuffer = new ParsableByteArray();
    private final CueBuilder cueBuilder = new CueBuilder();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class CueBuilder {
        private int bitmapHeight;
        private int bitmapWidth;
        private int bitmapX;
        private int bitmapY;
        private boolean colorsSet;
        private int planeHeight;
        private int planeWidth;
        private final ParsableByteArray bitmapData = new ParsableByteArray();
        private final int[] colors = new int[256];

        /* JADX INFO: Access modifiers changed from: private */
        public void parseBitmapSection(ParsableByteArray parsableByteArray, int i11) {
            int readUnsignedInt24;
            if (i11 < 4) {
                return;
            }
            parsableByteArray.skipBytes(3);
            int i12 = i11 - 4;
            if ((parsableByteArray.readUnsignedByte() & 128) != 0) {
                if (i12 < 7 || (readUnsignedInt24 = parsableByteArray.readUnsignedInt24()) < 4) {
                    return;
                }
                this.bitmapWidth = parsableByteArray.readUnsignedShort();
                this.bitmapHeight = parsableByteArray.readUnsignedShort();
                this.bitmapData.reset(readUnsignedInt24 - 4);
                i12 = i11 - 11;
            }
            int position = this.bitmapData.getPosition();
            int limit = this.bitmapData.limit();
            if (position >= limit || i12 <= 0) {
                return;
            }
            int min = Math.min(i12, limit - position);
            parsableByteArray.readBytes(this.bitmapData.getData(), position, min);
            this.bitmapData.setPosition(position + min);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parseIdentifierSection(ParsableByteArray parsableByteArray, int i11) {
            if (i11 < 19) {
                return;
            }
            this.planeWidth = parsableByteArray.readUnsignedShort();
            this.planeHeight = parsableByteArray.readUnsignedShort();
            parsableByteArray.skipBytes(11);
            this.bitmapX = parsableByteArray.readUnsignedShort();
            this.bitmapY = parsableByteArray.readUnsignedShort();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void parsePaletteSection(ParsableByteArray parsableByteArray, int i11) {
            if (i11 % 5 != 2) {
                return;
            }
            parsableByteArray.skipBytes(2);
            Arrays.fill(this.colors, 0);
            int i12 = i11 / 5;
            for (int i13 = 0; i13 < i12; i13++) {
                int readUnsignedByte = parsableByteArray.readUnsignedByte();
                int readUnsignedByte2 = parsableByteArray.readUnsignedByte();
                int readUnsignedByte3 = parsableByteArray.readUnsignedByte();
                int readUnsignedByte4 = parsableByteArray.readUnsignedByte();
                int readUnsignedByte5 = parsableByteArray.readUnsignedByte();
                double d11 = readUnsignedByte2;
                double d12 = readUnsignedByte3 + a.f10855g;
                double d13 = readUnsignedByte4 + a.f10855g;
                this.colors[readUnsignedByte] = (Util.constrainValue((int) ((d11 - (0.34414d * d13)) - (d12 * 0.71414d)), 0, 255) << 8) | (readUnsignedByte5 << 24) | (Util.constrainValue((int) ((1.402d * d12) + d11), 0, 255) << 16) | Util.constrainValue((int) (d11 + (d13 * 1.772d)), 0, 255);
            }
            this.colorsSet = true;
        }

        @Nullable
        public Cue build() {
            int i11;
            if (this.planeWidth == 0 || this.planeHeight == 0 || this.bitmapWidth == 0 || this.bitmapHeight == 0 || this.bitmapData.limit() == 0 || this.bitmapData.getPosition() != this.bitmapData.limit() || !this.colorsSet) {
                return null;
            }
            this.bitmapData.setPosition(0);
            int i12 = this.bitmapWidth * this.bitmapHeight;
            int[] iArr = new int[i12];
            int i13 = 0;
            while (i13 < i12) {
                int readUnsignedByte = this.bitmapData.readUnsignedByte();
                if (readUnsignedByte != 0) {
                    i11 = i13 + 1;
                    iArr[i13] = this.colors[readUnsignedByte];
                } else {
                    int readUnsignedByte2 = this.bitmapData.readUnsignedByte();
                    if (readUnsignedByte2 != 0) {
                        i11 = ((readUnsignedByte2 & 64) == 0 ? readUnsignedByte2 & 63 : ((readUnsignedByte2 & 63) << 8) | this.bitmapData.readUnsignedByte()) + i13;
                        Arrays.fill(iArr, i13, i11, (readUnsignedByte2 & 128) == 0 ? this.colors[0] : this.colors[this.bitmapData.readUnsignedByte()]);
                    }
                }
                i13 = i11;
            }
            return new Cue.Builder().setBitmap(Bitmap.createBitmap(iArr, this.bitmapWidth, this.bitmapHeight, Bitmap.Config.ARGB_8888)).setPosition(this.bitmapX / this.planeWidth).setPositionAnchor(0).setLine(this.bitmapY / this.planeHeight, 0).setLineAnchor(0).setSize(this.bitmapWidth / this.planeWidth).setBitmapHeight(this.bitmapHeight / this.planeHeight).build();
        }

        public void reset() {
            this.planeWidth = 0;
            this.planeHeight = 0;
            this.bitmapX = 0;
            this.bitmapY = 0;
            this.bitmapWidth = 0;
            this.bitmapHeight = 0;
            this.bitmapData.reset(0);
            this.colorsSet = false;
        }
    }

    @Nullable
    private static Cue readNextSection(ParsableByteArray parsableByteArray, CueBuilder cueBuilder) {
        int limit = parsableByteArray.limit();
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int position = parsableByteArray.getPosition() + readUnsignedShort;
        Cue cue = null;
        if (position > limit) {
            parsableByteArray.setPosition(limit);
            return null;
        }
        if (readUnsignedByte != 128) {
            switch (readUnsignedByte) {
                case 20:
                    cueBuilder.parsePaletteSection(parsableByteArray, readUnsignedShort);
                    break;
                case 21:
                    cueBuilder.parseBitmapSection(parsableByteArray, readUnsignedShort);
                    break;
                case 22:
                    cueBuilder.parseIdentifierSection(parsableByteArray, readUnsignedShort);
                    break;
            }
        } else {
            cue = cueBuilder.build();
            cueBuilder.reset();
        }
        parsableByteArray.setPosition(position);
        return cue;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i11, int i12, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.buffer.reset(bArr, i12 + i11);
        this.buffer.setPosition(i11);
        if (this.inflater == null) {
            this.inflater = new Inflater();
        }
        if (Util.maybeInflate(this.buffer, this.inflatedBuffer, this.inflater)) {
            this.buffer.reset(this.inflatedBuffer.getData(), this.inflatedBuffer.limit());
        }
        this.cueBuilder.reset();
        ArrayList arrayList = new ArrayList();
        while (this.buffer.bytesLeft() >= 3) {
            Cue readNextSection = readNextSection(this.buffer, this.cueBuilder);
            if (readNextSection != null) {
                arrayList.add(readNextSection);
            }
        }
        consumer.accept(new CuesWithTiming(arrayList, C.TIME_UNSET, C.TIME_UNSET));
    }
}
