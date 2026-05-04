package androidx.media3.extractor.text.ssa;

import android.graphics.PointF;
import android.text.Layout;
import android.text.SpannableString;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.annotation.Nullable;
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
import androidx.media3.extractor.text.ssa.SsaStyle;
import ho.c;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SsaParser implements SubtitleParser {
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float DEFAULT_MARGIN = 0.05f;
    private static final String DIALOGUE_LINE_PREFIX = "Dialogue:";
    static final String FORMAT_LINE_PREFIX = "Format:";
    private static final Pattern SSA_TIMECODE_PATTERN = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    static final String STYLE_LINE_PREFIX = "Style:";
    private static final String TAG = "SsaParser";

    @Nullable
    private final SsaDialogueFormat dialogueFormatFromInitializationData;
    private final boolean haveInitializationData;
    private final ParsableByteArray parsableByteArray;
    private float screenHeight;
    private float screenWidth;
    private Map<String, SsaStyle> styles;

    public SsaParser() {
        this(null);
    }

    private static int addCuePlacerholderByTime(long j11, List<Long> list, List<List<Cue>> list2) {
        int i11;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i11 = 0;
                break;
            }
            if (list.get(size).longValue() == j11) {
                return size;
            }
            if (list.get(size).longValue() < j11) {
                i11 = size + 1;
                break;
            }
            size--;
        }
        list.add(i11, Long.valueOf(j11));
        list2.add(i11, i11 == 0 ? new ArrayList() : new ArrayList(list2.get(i11 - 1)));
        return i11;
    }

    private static float computeDefaultLineOrPosition(int i11) {
        if (i11 == 0) {
            return 0.05f;
        }
        if (i11 != 1) {
            return i11 != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    private static Cue createCue(String str, @Nullable SsaStyle ssaStyle, SsaStyle.Overrides overrides, float f11, float f12) {
        SpannableString spannableString = new SpannableString(str);
        Cue.Builder text = new Cue.Builder().setText(spannableString);
        if (ssaStyle != null) {
            if (ssaStyle.primaryColor != null) {
                spannableString.setSpan(new ForegroundColorSpan(ssaStyle.primaryColor.intValue()), 0, spannableString.length(), 33);
            }
            if (ssaStyle.borderStyle == 3 && ssaStyle.outlineColor != null) {
                spannableString.setSpan(new BackgroundColorSpan(ssaStyle.outlineColor.intValue()), 0, spannableString.length(), 33);
            }
            float f13 = ssaStyle.fontSize;
            if (f13 != -3.4028235E38f && f12 != -3.4028235E38f) {
                text.setTextSize(f13 / f12, 1);
            }
            boolean z11 = ssaStyle.bold;
            if (z11 && ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(3), 0, spannableString.length(), 33);
            } else if (z11) {
                spannableString.setSpan(new StyleSpan(1), 0, spannableString.length(), 33);
            } else if (ssaStyle.italic) {
                spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 33);
            }
            if (ssaStyle.underline) {
                spannableString.setSpan(new UnderlineSpan(), 0, spannableString.length(), 33);
            }
            if (ssaStyle.strikeout) {
                spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
            }
        }
        int i11 = overrides.alignment;
        if (i11 == -1) {
            i11 = ssaStyle != null ? ssaStyle.alignment : -1;
        }
        text.setTextAlignment(toTextAlignment(i11)).setPositionAnchor(toPositionAnchor(i11)).setLineAnchor(toLineAnchor(i11));
        PointF pointF = overrides.position;
        if (pointF == null || f12 == -3.4028235E38f || f11 == -3.4028235E38f) {
            text.setPosition(computeDefaultLineOrPosition(text.getPositionAnchor()));
            text.setLine(computeDefaultLineOrPosition(text.getLineAnchor()), 0);
        } else {
            text.setPosition(pointF.x / f11);
            text.setLine(overrides.position.y / f12, 0);
        }
        return text.build();
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset readUtfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return readUtfCharsetFromBom != null ? readUtfCharsetFromBom : StandardCharsets.UTF_8;
    }

    private void parseDialogueLine(String str, SsaDialogueFormat ssaDialogueFormat, List<List<Cue>> list, List<Long> list2) {
        int i11;
        Assertions.checkArgument(str.startsWith(DIALOGUE_LINE_PREFIX));
        String[] split = str.substring(9).split(",", ssaDialogueFormat.length);
        if (split.length != ssaDialogueFormat.length) {
            Log.w(TAG, "Skipping dialogue line with fewer columns than format: " + str);
            return;
        }
        long parseTimecodeUs = parseTimecodeUs(split[ssaDialogueFormat.startTimeIndex]);
        if (parseTimecodeUs == C.TIME_UNSET) {
            Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        long parseTimecodeUs2 = parseTimecodeUs(split[ssaDialogueFormat.endTimeIndex]);
        if (parseTimecodeUs2 == C.TIME_UNSET || parseTimecodeUs2 <= parseTimecodeUs) {
            Log.w(TAG, "Skipping invalid timing: " + str);
            return;
        }
        Map<String, SsaStyle> map = this.styles;
        SsaStyle ssaStyle = (map == null || (i11 = ssaDialogueFormat.styleIndex) == -1) ? null : map.get(split[i11].trim());
        String str2 = split[ssaDialogueFormat.textIndex];
        Cue createCue = createCue(SsaStyle.Overrides.stripStyleOverrides(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), ssaStyle, SsaStyle.Overrides.parseFromDialogue(str2), this.screenWidth, this.screenHeight);
        int addCuePlacerholderByTime = addCuePlacerholderByTime(parseTimecodeUs2, list2, list);
        for (int addCuePlacerholderByTime2 = addCuePlacerholderByTime(parseTimecodeUs, list2, list); addCuePlacerholderByTime2 < addCuePlacerholderByTime; addCuePlacerholderByTime2++) {
            list.get(addCuePlacerholderByTime2).add(createCue);
        }
    }

    private void parseEventBody(ParsableByteArray parsableByteArray, List<List<Cue>> list, List<Long> list2, Charset charset) {
        SsaDialogueFormat ssaDialogueFormat = this.haveInitializationData ? this.dialogueFormatFromInitializationData : null;
        while (true) {
            String readLine = parsableByteArray.readLine(charset);
            if (readLine == null) {
                return;
            }
            if (readLine.startsWith(FORMAT_LINE_PREFIX)) {
                ssaDialogueFormat = SsaDialogueFormat.fromFormatLine(readLine);
            } else if (readLine.startsWith(DIALOGUE_LINE_PREFIX)) {
                if (ssaDialogueFormat == null) {
                    Log.w(TAG, "Skipping dialogue line before complete format: " + readLine);
                } else {
                    parseDialogueLine(readLine, ssaDialogueFormat, list, list2);
                }
            }
        }
    }

    private void parseHeader(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String readLine = parsableByteArray.readLine(charset);
            if (readLine == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(readLine)) {
                parseScriptInfo(parsableByteArray, charset);
            } else if ("[V4+ Styles]".equalsIgnoreCase(readLine)) {
                this.styles = parseStyles(parsableByteArray, charset);
            } else if ("[V4 Styles]".equalsIgnoreCase(readLine)) {
                Log.i(TAG, "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(readLine)) {
                return;
            }
        }
    }

    private void parseScriptInfo(ParsableByteArray parsableByteArray, Charset charset) {
        while (true) {
            String readLine = parsableByteArray.readLine(charset);
            if (readLine == null) {
                return;
            }
            if (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekChar(charset) == '[') {
                return;
            }
            String[] split = readLine.split(":");
            if (split.length == 2) {
                String g11 = c.g(split[0].trim());
                g11.getClass();
                if (g11.equals("playresx")) {
                    this.screenWidth = Float.parseFloat(split[1].trim());
                } else if (g11.equals("playresy")) {
                    try {
                        this.screenHeight = Float.parseFloat(split[1].trim());
                    } catch (NumberFormatException unused) {
                    }
                }
            }
        }
    }

    private static Map<String, SsaStyle> parseStyles(ParsableByteArray parsableByteArray, Charset charset) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        SsaStyle.Format format = null;
        while (true) {
            String readLine = parsableByteArray.readLine(charset);
            if (readLine == null || (parsableByteArray.bytesLeft() != 0 && parsableByteArray.peekChar(charset) == '[')) {
                break;
            }
            if (readLine.startsWith(FORMAT_LINE_PREFIX)) {
                format = SsaStyle.Format.fromFormatLine(readLine);
            } else if (readLine.startsWith(STYLE_LINE_PREFIX)) {
                if (format == null) {
                    Log.w(TAG, "Skipping 'Style:' line before 'Format:' line: " + readLine);
                } else {
                    SsaStyle fromStyleLine = SsaStyle.fromStyleLine(readLine, format);
                    if (fromStyleLine != null) {
                        linkedHashMap.put(fromStyleLine.name, fromStyleLine);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static long parseTimecodeUs(String str) {
        Matcher matcher = SSA_TIMECODE_PATTERN.matcher(str.trim());
        return !matcher.matches() ? C.TIME_UNSET : (Long.parseLong((String) Util.castNonNull(matcher.group(1))) * 3600000000L) + (Long.parseLong((String) Util.castNonNull(matcher.group(2))) * 60000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(3))) * 1000000) + (Long.parseLong((String) Util.castNonNull(matcher.group(4))) * 10000);
    }

    private static int toLineAnchor(int i11) {
        switch (i11) {
            case -1:
                break;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i11);
                break;
            case 1:
            case 2:
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                break;
            case 7:
            case 8:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    private static int toPositionAnchor(int i11) {
        switch (i11) {
            case -1:
                break;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i11);
                break;
            case 1:
            case 4:
            case 7:
                break;
            case 2:
            case 5:
            case 8:
                break;
            case 3:
            case 6:
            case 9:
                break;
        }
        return Integer.MIN_VALUE;
    }

    @Nullable
    private static Layout.Alignment toTextAlignment(int i11) {
        switch (i11) {
            case -1:
                return null;
            case 0:
            default:
                Log.w(TAG, "Unknown alignment: " + i11);
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i11, int i12, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        long j11;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        this.parsableByteArray.reset(bArr, i11 + i12);
        this.parsableByteArray.setPosition(i11);
        Charset detectUtfCharset = detectUtfCharset(this.parsableByteArray);
        if (!this.haveInitializationData) {
            parseHeader(this.parsableByteArray, detectUtfCharset);
        }
        parseEventBody(this.parsableByteArray, arrayList, arrayList2, detectUtfCharset);
        long j12 = outputOptions.startTimeUs;
        long j13 = C.TIME_UNSET;
        ArrayList arrayList3 = (j12 == C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new ArrayList();
        int i13 = 0;
        while (i13 < arrayList.size()) {
            List<Cue> list = arrayList.get(i13);
            if (list.isEmpty() && i13 != 0) {
                j11 = j13;
            } else {
                if (i13 == arrayList.size() - 1) {
                    throw new IllegalStateException();
                }
                long longValue = arrayList2.get(i13).longValue();
                long longValue2 = arrayList2.get(i13 + 1).longValue() - arrayList2.get(i13).longValue();
                j11 = j13;
                long j14 = outputOptions.startTimeUs;
                if (j14 == j11 || longValue >= j14) {
                    consumer.accept(new CuesWithTiming(list, longValue, longValue2));
                } else if (arrayList3 != null) {
                    arrayList3.add(new CuesWithTiming(list, longValue, longValue2));
                }
            }
            i13++;
            j13 = j11;
        }
        if (arrayList3 != null) {
            Iterator it = arrayList3.iterator();
            while (it.hasNext()) {
                consumer.accept((CuesWithTiming) it.next());
            }
        }
    }

    public SsaParser(@Nullable List<byte[]> list) {
        this.screenWidth = -3.4028235E38f;
        this.screenHeight = -3.4028235E38f;
        this.parsableByteArray = new ParsableByteArray();
        if (list == null || list.isEmpty()) {
            this.haveInitializationData = false;
            this.dialogueFormatFromInitializationData = null;
            return;
        }
        this.haveInitializationData = true;
        String fromUtf8Bytes = Util.fromUtf8Bytes(list.get(0));
        Assertions.checkArgument(fromUtf8Bytes.startsWith(FORMAT_LINE_PREFIX));
        this.dialogueFormatFromInitializationData = (SsaDialogueFormat) Assertions.checkNotNull(SsaDialogueFormat.fromFormatLine(fromUtf8Bytes));
        parseHeader(new ParsableByteArray(list.get(1)), StandardCharsets.UTF_8);
    }
}
