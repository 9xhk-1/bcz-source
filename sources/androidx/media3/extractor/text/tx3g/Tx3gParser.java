package androidx.media3.extractor.text.tx3g;

import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.common.C;
import androidx.media3.common.text.Cue;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class Tx3gParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 2;
    private static final int DEFAULT_COLOR = -1;
    private static final int DEFAULT_FONT_FACE = 0;
    private static final String DEFAULT_FONT_FAMILY = "sans-serif";
    private static final float DEFAULT_VERTICAL_PLACEMENT = 0.85f;
    private static final int FONT_FACE_BOLD = 1;
    private static final int FONT_FACE_ITALIC = 2;
    private static final int FONT_FACE_UNDERLINE = 4;
    private static final int SIZE_ATOM_HEADER = 8;
    private static final int SIZE_SHORT = 2;
    private static final int SIZE_STYLE_RECORD = 12;
    private static final int SPAN_PRIORITY_HIGH = 0;
    private static final int SPAN_PRIORITY_LOW = 16711680;
    private static final String TAG = "Tx3gParser";
    private static final String TX3G_SERIF = "Serif";
    private static final int TYPE_STYL = 1937013100;
    private static final int TYPE_TBOX = 1952608120;
    private final int calculatedVideoTrackHeight;
    private final boolean customVerticalPlacement;
    private final int defaultColorRgba;
    private final int defaultFontFace;
    private final String defaultFontFamily;
    private final float defaultVerticalPlacement;
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    public Tx3gParser(List<byte[]> list) {
        if (list.size() != 1 || (list.get(0).length != 48 && list.get(0).length != 53)) {
            this.defaultFontFace = 0;
            this.defaultColorRgba = -1;
            this.defaultFontFamily = "sans-serif";
            this.customVerticalPlacement = false;
            this.defaultVerticalPlacement = 0.85f;
            this.calculatedVideoTrackHeight = -1;
            return;
        }
        byte[] bArr = list.get(0);
        this.defaultFontFace = bArr[24];
        this.defaultColorRgba = ((bArr[26] & 255) << 24) | ((bArr[27] & 255) << 16) | ((bArr[28] & 255) << 8) | (bArr[29] & 255);
        this.defaultFontFamily = TX3G_SERIF.equals(Util.fromUtf8Bytes(bArr, 43, bArr.length - 43)) ? C.SERIF_NAME : "sans-serif";
        int i11 = bArr[25] * 20;
        this.calculatedVideoTrackHeight = i11;
        boolean z11 = (bArr[0] & 32) != 0;
        this.customVerticalPlacement = z11;
        if (z11) {
            this.defaultVerticalPlacement = Util.constrainValue(((bArr[11] & 255) | ((bArr[10] & 255) << 8)) / i11, 0.0f, 0.95f);
        } else {
            this.defaultVerticalPlacement = 0.85f;
        }
    }

    private void applyStyleRecord(ParsableByteArray parsableByteArray, SpannableStringBuilder spannableStringBuilder) {
        Assertions.checkArgument(parsableByteArray.bytesLeft() >= 12);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        int readUnsignedShort2 = parsableByteArray.readUnsignedShort();
        parsableByteArray.skipBytes(2);
        int readUnsignedByte = parsableByteArray.readUnsignedByte();
        parsableByteArray.skipBytes(1);
        int readInt = parsableByteArray.readInt();
        if (readUnsignedShort2 > spannableStringBuilder.length()) {
            Log.w(TAG, "Truncating styl end (" + readUnsignedShort2 + ") to cueText.length() (" + spannableStringBuilder.length() + ").");
            readUnsignedShort2 = spannableStringBuilder.length();
        }
        int i11 = readUnsignedShort2;
        if (readUnsignedShort < i11) {
            attachFontFace(spannableStringBuilder, readUnsignedByte, this.defaultFontFace, readUnsignedShort, i11, 0);
            attachColor(spannableStringBuilder, readInt, this.defaultColorRgba, readUnsignedShort, i11, 0);
            return;
        }
        Log.w(TAG, "Ignoring styl with start (" + readUnsignedShort + ") >= end (" + i11 + ").");
    }

    private static void attachColor(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan((i11 >>> 8) | ((i11 & 255) << 24)), i13, i14, i15 | 33);
        }
    }

    private static void attachFontFace(SpannableStringBuilder spannableStringBuilder, int i11, int i12, int i13, int i14, int i15) {
        if (i11 != i12) {
            int i16 = i15 | 33;
            boolean z11 = (i11 & 1) != 0;
            boolean z12 = (i11 & 2) != 0;
            if (z11) {
                if (z12) {
                    spannableStringBuilder.setSpan(new StyleSpan(3), i13, i14, i16);
                } else {
                    spannableStringBuilder.setSpan(new StyleSpan(1), i13, i14, i16);
                }
            } else if (z12) {
                spannableStringBuilder.setSpan(new StyleSpan(2), i13, i14, i16);
            }
            boolean z13 = (i11 & 4) != 0;
            if (z13) {
                spannableStringBuilder.setSpan(new UnderlineSpan(), i13, i14, i16);
            }
            if (z13 || z11 || z12) {
                return;
            }
            spannableStringBuilder.setSpan(new StyleSpan(0), i13, i14, i16);
        }
    }

    private static void attachFontFamily(SpannableStringBuilder spannableStringBuilder, String str, int i11, int i12) {
        if (str != "sans-serif") {
            spannableStringBuilder.setSpan(new TypefaceSpan(str), i11, i12, 16711713);
        }
    }

    private static String readSubtitleText(ParsableByteArray parsableByteArray) {
        Assertions.checkArgument(parsableByteArray.bytesLeft() >= 2);
        int readUnsignedShort = parsableByteArray.readUnsignedShort();
        if (readUnsignedShort == 0) {
            return "";
        }
        int position = parsableByteArray.getPosition();
        Charset readUtfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        int position2 = readUnsignedShort - (parsableByteArray.getPosition() - position);
        if (readUtfCharsetFromBom == null) {
            readUtfCharsetFromBom = StandardCharsets.UTF_8;
        }
        return parsableByteArray.readString(position2, readUtfCharsetFromBom);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 2;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i11, int i12, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        this.parsableByteArray.reset(bArr, i12 + i11);
        this.parsableByteArray.setPosition(i11);
        String readSubtitleText = readSubtitleText(this.parsableByteArray);
        if (readSubtitleText.isEmpty()) {
            consumer.accept(new CuesWithTiming(ImmutableList.of(), C.TIME_UNSET, C.TIME_UNSET));
            return;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(readSubtitleText);
        attachFontFace(spannableStringBuilder, this.defaultFontFace, 0, 0, spannableStringBuilder.length(), 16711680);
        attachColor(spannableStringBuilder, this.defaultColorRgba, -1, 0, spannableStringBuilder.length(), 16711680);
        attachFontFamily(spannableStringBuilder, this.defaultFontFamily, 0, spannableStringBuilder.length());
        float f11 = this.defaultVerticalPlacement;
        while (this.parsableByteArray.bytesLeft() >= 8) {
            int position = this.parsableByteArray.getPosition();
            int readInt = this.parsableByteArray.readInt();
            int readInt2 = this.parsableByteArray.readInt();
            if (readInt2 == TYPE_STYL) {
                Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 2);
                int readUnsignedShort = this.parsableByteArray.readUnsignedShort();
                for (int i13 = 0; i13 < readUnsignedShort; i13++) {
                    applyStyleRecord(this.parsableByteArray, spannableStringBuilder);
                }
            } else if (readInt2 == TYPE_TBOX && this.customVerticalPlacement) {
                Assertions.checkArgument(this.parsableByteArray.bytesLeft() >= 2);
                f11 = Util.constrainValue(this.parsableByteArray.readUnsignedShort() / this.calculatedVideoTrackHeight, 0.0f, 0.95f);
            }
            this.parsableByteArray.setPosition(position + readInt);
        }
        consumer.accept(new CuesWithTiming(ImmutableList.of(new Cue.Builder().setText(spannableStringBuilder).setLine(f11, 0).setLineAnchor(0).build()), C.TIME_UNSET, C.TIME_UNSET));
    }
}
