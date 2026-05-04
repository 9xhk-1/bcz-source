package androidx.media3.extractor.text.ttml;

import android.text.Layout;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.common.util.Util;
import androidx.media3.common.util.XmlPullParserUtil;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.LegacySubtitleUtil;
import androidx.media3.extractor.text.Subtitle;
import androidx.media3.extractor.text.SubtitleDecoderException;
import androidx.media3.extractor.text.SubtitleParser;
import ho.c;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class TtmlParser implements SubtitleParser {
    private static final String ATTR_BEGIN = "begin";
    private static final String ATTR_DURATION = "dur";
    private static final String ATTR_END = "end";
    private static final String ATTR_IMAGE = "backgroundImage";
    private static final String ATTR_REGION = "region";
    private static final String ATTR_STYLE = "style";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final int DEFAULT_CELL_ROWS = 15;
    private static final int DEFAULT_FRAME_RATE = 30;
    private static final String TAG = "TtmlParser";
    private static final String TTP = "http://www.w3.org/ns/ttml#parameter";
    private final XmlPullParserFactory xmlParserFactory;
    private static final Pattern CLOCK_TIME = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");
    private static final Pattern OFFSET_TIME = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");
    private static final Pattern FONT_SIZE = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");
    static final Pattern SIGNED_PERCENTAGE = Pattern.compile("^([-+]?\\d+\\.?\\d*?)%$");
    static final Pattern PERCENTAGE_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)% ([-+]?\\d+\\.?\\d*?)%$");
    private static final Pattern PIXEL_COORDINATES = Pattern.compile("^([-+]?\\d+\\.?\\d*?)px ([-+]?\\d+\\.?\\d*?)px$");
    private static final Pattern CELL_RESOLUTION = Pattern.compile("^(\\d+) (\\d+)$");
    private static final FrameAndTickRate DEFAULT_FRAME_AND_TICK_RATE = new FrameAndTickRate(30.0f, 1, 1);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class FrameAndTickRate {
        final float effectiveFrameRate;
        final int subFrameRate;
        final int tickRate;

        public FrameAndTickRate(float f11, int i11, int i12) {
            this.effectiveFrameRate = f11;
            this.subFrameRate = i11;
            this.tickRate = i12;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class TtsExtent {
        final int height;
        final int width;

        public TtsExtent(int i11, int i12) {
            this.width = i11;
            this.height = i12;
        }
    }

    public TtmlParser() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.xmlParserFactory = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e11) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e11);
        }
    }

    private static TtmlStyle createIfNull(@Nullable TtmlStyle ttmlStyle) {
        return ttmlStyle == null ? new TtmlStyle() : ttmlStyle;
    }

    private static boolean isSupportedTag(String str) {
        return str.equals("tt") || str.equals(TtmlNode.TAG_HEAD) || str.equals(TtmlNode.TAG_BODY) || str.equals(TtmlNode.TAG_DIV) || str.equals("p") || str.equals(TtmlNode.TAG_SPAN) || str.equals("br") || str.equals("style") || str.equals(TtmlNode.TAG_STYLING) || str.equals("layout") || str.equals("region") || str.equals(TtmlNode.TAG_METADATA) || str.equals("image") || str.equals("data") || str.equals(TtmlNode.TAG_INFORMATION);
    }

    @Nullable
    private static Layout.Alignment parseAlignment(String str) {
        String g11 = c.g(str);
        g11.getClass();
        switch (g11) {
            case "center":
                return Layout.Alignment.ALIGN_CENTER;
            case "end":
            case "right":
                return Layout.Alignment.ALIGN_OPPOSITE;
            case "left":
            case "start":
                return Layout.Alignment.ALIGN_NORMAL;
            default:
                return null;
        }
    }

    private static int parseCellRows(XmlPullParser xmlPullParser, int i11) {
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "cellResolution");
        if (attributeValue == null) {
            return i11;
        }
        Matcher matcher = CELL_RESOLUTION.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return i11;
        }
        boolean z11 = true;
        try {
            int parseInt = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1)));
            int parseInt2 = Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2)));
            if (parseInt == 0 || parseInt2 == 0) {
                z11 = false;
            }
            Assertions.checkArgument(z11, "Invalid cell resolution " + parseInt + " " + parseInt2);
            return parseInt2;
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed cell resolution: " + attributeValue);
            return i11;
        }
    }

    private static void parseFontSize(String str, TtmlStyle ttmlStyle) throws SubtitleDecoderException {
        Matcher matcher;
        String str2;
        String[] split = Util.split(str, "\\s+");
        if (split.length == 1) {
            matcher = FONT_SIZE.matcher(str);
        } else {
            if (split.length != 2) {
                throw new SubtitleDecoderException("Invalid number of entries for fontSize: " + split.length + ".");
            }
            matcher = FONT_SIZE.matcher(split[1]);
            Log.w(TAG, "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first.");
        }
        if (!matcher.matches()) {
            throw new SubtitleDecoderException("Invalid expression for fontSize: '" + str + "'.");
        }
        str2 = (String) Assertions.checkNotNull(matcher.group(3));
        str2.getClass();
        switch (str2) {
            case "%":
                ttmlStyle.setFontSizeUnit(3);
                break;
            case "em":
                ttmlStyle.setFontSizeUnit(2);
                break;
            case "px":
                ttmlStyle.setFontSizeUnit(1);
                break;
            default:
                throw new SubtitleDecoderException("Invalid unit for fontSize: '" + str2 + "'.");
        }
        ttmlStyle.setFontSize(Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1))));
    }

    private static FrameAndTickRate parseFrameAndTickRates(XmlPullParser xmlPullParser) {
        float f11;
        String attributeValue = xmlPullParser.getAttributeValue(TTP, "frameRate");
        int parseInt = attributeValue != null ? Integer.parseInt(attributeValue) : 30;
        String attributeValue2 = xmlPullParser.getAttributeValue(TTP, "frameRateMultiplier");
        if (attributeValue2 != null) {
            Assertions.checkArgument(Util.split(attributeValue2, " ").length == 2, "frameRateMultiplier doesn't have 2 parts");
            f11 = Integer.parseInt(r2[0]) / Integer.parseInt(r2[1]);
        } else {
            f11 = 1.0f;
        }
        FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
        int i11 = frameAndTickRate.subFrameRate;
        String attributeValue3 = xmlPullParser.getAttributeValue(TTP, "subFrameRate");
        if (attributeValue3 != null) {
            i11 = Integer.parseInt(attributeValue3);
        }
        int i12 = frameAndTickRate.tickRate;
        String attributeValue4 = xmlPullParser.getAttributeValue(TTP, "tickRate");
        if (attributeValue4 != null) {
            i12 = Integer.parseInt(attributeValue4);
        }
        return new FrameAndTickRate(parseInt * f11, i11, i12);
    }

    private static Map<String, TtmlStyle> parseHeader(XmlPullParser xmlPullParser, Map<String, TtmlStyle> map, int i11, @Nullable TtsExtent ttsExtent, Map<String, TtmlRegion> map2, Map<String, String> map3) throws IOException, XmlPullParserException {
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "style")) {
                String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "style");
                TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser, new TtmlStyle());
                if (attributeValue != null) {
                    for (String str : parseStyleIds(attributeValue)) {
                        parseStyleAttributes.chain(map.get(str));
                    }
                }
                String id2 = parseStyleAttributes.getId();
                if (id2 != null) {
                    map.put(id2, parseStyleAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, "region")) {
                TtmlRegion parseRegionAttributes = parseRegionAttributes(xmlPullParser, i11, ttsExtent, map);
                if (parseRegionAttributes != null) {
                    map2.put(parseRegionAttributes.f5243id, parseRegionAttributes);
                }
            } else if (XmlPullParserUtil.isStartTag(xmlPullParser, TtmlNode.TAG_METADATA)) {
                parseMetadata(xmlPullParser, map3);
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_HEAD));
        return map;
    }

    private static void parseMetadata(XmlPullParser xmlPullParser, Map<String, String> map) throws IOException, XmlPullParserException {
        String attributeValue;
        do {
            xmlPullParser.next();
            if (XmlPullParserUtil.isStartTag(xmlPullParser, "image") && (attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, "id")) != null) {
                map.put(attributeValue, xmlPullParser.nextText());
            }
        } while (!XmlPullParserUtil.isEndTag(xmlPullParser, TtmlNode.TAG_METADATA));
    }

    private static TtmlNode parseNode(XmlPullParser xmlPullParser, @Nullable TtmlNode ttmlNode, Map<String, TtmlRegion> map, FrameAndTickRate frameAndTickRate) throws SubtitleDecoderException {
        String attributeValue;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        int attributeCount = xmlPullParser2.getAttributeCount();
        String str = null;
        TtmlStyle parseStyleAttributes = parseStyleAttributes(xmlPullParser2, null);
        long j11 = -9223372036854775807L;
        long j12 = -9223372036854775807L;
        long j13 = -9223372036854775807L;
        String[] strArr = null;
        String str2 = "";
        int i11 = 0;
        while (i11 < attributeCount) {
            String attributeName = xmlPullParser2.getAttributeName(i11);
            int i12 = attributeCount;
            attributeValue = xmlPullParser2.getAttributeValue(i11);
            attributeName.getClass();
            switch (attributeName) {
                case "region":
                    if (!map.containsKey(attributeValue)) {
                        break;
                    } else {
                        str2 = attributeValue;
                        continue;
                    }
                case "dur":
                    j13 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "end":
                    j12 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "begin":
                    j11 = parseTimeExpression(attributeValue, frameAndTickRate);
                    break;
                case "style":
                    String[] parseStyleIds = parseStyleIds(attributeValue);
                    if (parseStyleIds.length > 0) {
                        strArr = parseStyleIds;
                        break;
                    }
                    break;
                case "backgroundImage":
                    if (attributeValue.startsWith("#")) {
                        str = attributeValue.substring(1);
                        break;
                    }
                    break;
            }
            i11++;
            xmlPullParser2 = xmlPullParser;
            attributeCount = i12;
        }
        if (ttmlNode != null) {
            long j14 = ttmlNode.startTimeUs;
            if (j14 != C.TIME_UNSET) {
                if (j11 != C.TIME_UNSET) {
                    j11 += j14;
                }
                if (j12 != C.TIME_UNSET) {
                    j12 += j14;
                }
            }
        }
        long j15 = j11;
        if (j12 == C.TIME_UNSET) {
            if (j13 != C.TIME_UNSET) {
                j12 = j15 + j13;
            } else if (ttmlNode != null) {
                long j16 = ttmlNode.endTimeUs;
                if (j16 != C.TIME_UNSET) {
                    j12 = j16;
                }
            }
        }
        return TtmlNode.buildNode(xmlPullParser.getName(), j15, j12, parseStyleAttributes, strArr, str2, str, ttmlNode);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0232, code lost:
    
        if (r0.equals("tb") == false) goto L74;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0205  */
    @androidx.annotation.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.text.ttml.TtmlRegion parseRegionAttributes(org.xmlpull.v1.XmlPullParser r17, int r18, @androidx.annotation.Nullable androidx.media3.extractor.text.ttml.TtmlParser.TtsExtent r19, java.util.Map<java.lang.String, androidx.media3.extractor.text.ttml.TtmlStyle> r20) {
        /*
            Method dump skipped, instructions count: 612
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.parseRegionAttributes(org.xmlpull.v1.XmlPullParser, int, androidx.media3.extractor.text.ttml.TtmlParser$TtsExtent, java.util.Map):androidx.media3.extractor.text.ttml.TtmlRegion");
    }

    private static float parseShear(String str) {
        Matcher matcher = SIGNED_PERCENTAGE.matcher(str);
        if (!matcher.matches()) {
            Log.w(TAG, "Invalid value for shear: " + str);
            return Float.MAX_VALUE;
        }
        try {
            return Math.min(100.0f, Math.max(-100.0f, Float.parseFloat((String) Assertions.checkNotNull(matcher.group(1)))));
        } catch (NumberFormatException e11) {
            Log.w(TAG, "Failed to parse shear: " + str, e11);
            return Float.MAX_VALUE;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x01fd, code lost:
    
        if (r3.equals("text") == false) goto L108;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static androidx.media3.extractor.text.ttml.TtmlStyle parseStyleAttributes(org.xmlpull.v1.XmlPullParser r12, androidx.media3.extractor.text.ttml.TtmlStyle r13) {
        /*
            Method dump skipped, instructions count: 986
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.parseStyleAttributes(org.xmlpull.v1.XmlPullParser, androidx.media3.extractor.text.ttml.TtmlStyle):androidx.media3.extractor.text.ttml.TtmlStyle");
    }

    private static String[] parseStyleIds(String str) {
        String trim = str.trim();
        return trim.isEmpty() ? new String[0] : Util.split(trim, "\\s+");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00bc, code lost:
    
        if (r13.equals("ms") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long parseTimeExpression(java.lang.String r13, androidx.media3.extractor.text.ttml.TtmlParser.FrameAndTickRate r14) throws androidx.media3.extractor.text.SubtitleDecoderException {
        /*
            Method dump skipped, instructions count: 326
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.ttml.TtmlParser.parseTimeExpression(java.lang.String, androidx.media3.extractor.text.ttml.TtmlParser$FrameAndTickRate):long");
    }

    @Nullable
    private static TtsExtent parseTtsExtent(XmlPullParser xmlPullParser) {
        String attributeValue = XmlPullParserUtil.getAttributeValue(xmlPullParser, TtmlNode.ATTR_TTS_EXTENT);
        if (attributeValue == null) {
            return null;
        }
        Matcher matcher = PIXEL_COORDINATES.matcher(attributeValue);
        if (!matcher.matches()) {
            Log.w(TAG, "Ignoring non-pixel tts extent: " + attributeValue);
            return null;
        }
        try {
            return new TtsExtent(Integer.parseInt((String) Assertions.checkNotNull(matcher.group(1))), Integer.parseInt((String) Assertions.checkNotNull(matcher.group(2))));
        } catch (NumberFormatException unused) {
            Log.w(TAG, "Ignoring malformed tts extent: " + attributeValue);
            return null;
        }
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i11, int i12, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        LegacySubtitleUtil.toCuesWithTiming(parseToLegacySubtitle(bArr, i11, i12), outputOptions, consumer);
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public Subtitle parseToLegacySubtitle(byte[] bArr, int i11, int i12) {
        char c11;
        try {
            XmlPullParser newPullParser = this.xmlParserFactory.newPullParser();
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            hashMap2.put("", new TtmlRegion(""));
            TtmlSubtitle ttmlSubtitle = null;
            newPullParser.setInput(new ByteArrayInputStream(bArr, i11, i12), null);
            ArrayDeque arrayDeque = new ArrayDeque();
            int i13 = 0;
            int i14 = 15;
            FrameAndTickRate frameAndTickRate = DEFAULT_FRAME_AND_TICK_RATE;
            TtsExtent ttsExtent = null;
            for (int eventType = newPullParser.getEventType(); eventType != 1; eventType = newPullParser.getEventType()) {
                TtmlNode ttmlNode = (TtmlNode) arrayDeque.peek();
                if (i13 == 0) {
                    String name = newPullParser.getName();
                    if (eventType == 2) {
                        if ("tt".equals(name)) {
                            frameAndTickRate = parseFrameAndTickRates(newPullParser);
                            c11 = 15;
                            i14 = parseCellRows(newPullParser, 15);
                            ttsExtent = parseTtsExtent(newPullParser);
                        } else {
                            c11 = 15;
                        }
                        FrameAndTickRate frameAndTickRate2 = frameAndTickRate;
                        TtsExtent ttsExtent2 = ttsExtent;
                        int i15 = i14;
                        if (isSupportedTag(name)) {
                            if (TtmlNode.TAG_HEAD.equals(name)) {
                                parseHeader(newPullParser, hashMap, i15, ttsExtent2, hashMap2, hashMap3);
                            } else {
                                try {
                                    TtmlNode parseNode = parseNode(newPullParser, ttmlNode, hashMap2, frameAndTickRate2);
                                    arrayDeque.push(parseNode);
                                    if (ttmlNode != null) {
                                        ttmlNode.addChild(parseNode);
                                    }
                                } catch (SubtitleDecoderException e11) {
                                    Log.w(TAG, "Suppressing parser error", e11);
                                }
                            }
                            i14 = i15;
                            ttsExtent = ttsExtent2;
                            frameAndTickRate = frameAndTickRate2;
                        } else {
                            Log.i(TAG, "Ignoring unsupported tag: " + newPullParser.getName());
                        }
                        i13++;
                        i14 = i15;
                        ttsExtent = ttsExtent2;
                        frameAndTickRate = frameAndTickRate2;
                    } else {
                        c11 = 15;
                        if (eventType == 4) {
                            ((TtmlNode) Assertions.checkNotNull(ttmlNode)).addChild(TtmlNode.buildTextNode(newPullParser.getText()));
                        } else if (eventType == 3) {
                            if (newPullParser.getName().equals("tt")) {
                                ttmlSubtitle = new TtmlSubtitle((TtmlNode) Assertions.checkNotNull((TtmlNode) arrayDeque.peek()), hashMap, hashMap2, hashMap3);
                            }
                            arrayDeque.pop();
                        }
                    }
                } else if (eventType == 2) {
                    i13++;
                } else if (eventType == 3) {
                    i13--;
                }
                newPullParser.next();
            }
            return (Subtitle) Assertions.checkNotNull(ttmlSubtitle);
        } catch (IOException e12) {
            throw new IllegalStateException("Unexpected error when reading input.", e12);
        } catch (XmlPullParserException e13) {
            throw new IllegalStateException("Unable to decode source", e13);
        }
    }
}
