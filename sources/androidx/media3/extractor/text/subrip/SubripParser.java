package androidx.media3.extractor.text.subrip;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.C;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Consumer;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.ParsableByteArray;
import androidx.media3.common.util.UnstableApi;
import androidx.media3.extractor.text.CuesWithTiming;
import androidx.media3.extractor.text.SubtitleParser;
import com.google.common.collect.ImmutableList;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UnstableApi
/* loaded from: classes2.dex */
public final class SubripParser implements SubtitleParser {
    private static final String ALIGN_BOTTOM_LEFT = "{\\an1}";
    private static final String ALIGN_BOTTOM_MID = "{\\an2}";
    private static final String ALIGN_BOTTOM_RIGHT = "{\\an3}";
    private static final String ALIGN_MID_LEFT = "{\\an4}";
    private static final String ALIGN_MID_MID = "{\\an5}";
    private static final String ALIGN_MID_RIGHT = "{\\an6}";
    private static final String ALIGN_TOP_LEFT = "{\\an7}";
    private static final String ALIGN_TOP_MID = "{\\an8}";
    private static final String ALIGN_TOP_RIGHT = "{\\an9}";
    public static final int CUE_REPLACEMENT_BEHAVIOR = 1;
    private static final float END_FRACTION = 0.92f;
    private static final float MID_FRACTION = 0.5f;
    private static final float START_FRACTION = 0.08f;
    private static final String SUBRIP_ALIGNMENT_TAG = "\\{\\\\an[1-9]\\}";
    private static final String SUBRIP_TIMECODE = "(?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?";
    private static final String TAG = "SubripParser";
    private static final Pattern SUBRIP_TIMING_LINE = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d{3}))?)\\s*");
    private static final Pattern SUBRIP_TAG_PATTERN = Pattern.compile("\\{\\\\.*?\\}");
    private final StringBuilder textBuilder = new StringBuilder();
    private final ArrayList<String> tags = new ArrayList<>();
    private final ParsableByteArray parsableByteArray = new ParsableByteArray();

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x0059, code lost:
    
        r14.setPositionAnchor(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x007b, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_RIGHT) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x008b, code lost:
    
        r14.setLineAnchor(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0082, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_MID) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0089, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_LEFT) != false) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a2, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_RIGHT) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00b2, code lost:
    
        r14.setLineAnchor(2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a9, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_MID) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b0, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_LEFT) != false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003d, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_LEFT) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0068, code lost:
    
        r14.setPositionAnchor(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0044, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_MID_RIGHT) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0050, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_MID_LEFT) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0057, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_RIGHT) != false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0066, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_BOTTOM_LEFT) != false) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if (r15.equals(androidx.media3.extractor.text.subrip.SubripParser.ALIGN_TOP_RIGHT) != false) goto L25;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private androidx.media3.common.text.Cue buildCue(android.text.Spanned r14, @androidx.annotation.Nullable java.lang.String r15) {
        /*
            r13 = this;
            androidx.media3.common.text.Cue$Builder r0 = new androidx.media3.common.text.Cue$Builder
            r0.<init>()
            androidx.media3.common.text.Cue$Builder r14 = r0.setText(r14)
            if (r15 != 0) goto L10
            androidx.media3.common.text.Cue r14 = r14.build()
            return r14
        L10:
            int r0 = r15.hashCode()
            r1 = 2
            r2 = 1
            java.lang.String r3 = "{\\an1}"
            java.lang.String r4 = "{\\an2}"
            java.lang.String r5 = "{\\an3}"
            java.lang.String r6 = "{\\an4}"
            java.lang.String r7 = "{\\an5}"
            java.lang.String r8 = "{\\an6}"
            java.lang.String r9 = "{\\an7}"
            java.lang.String r10 = "{\\an8}"
            java.lang.String r11 = "{\\an9}"
            r12 = 0
            switch(r0) {
                case -685620710: goto L62;
                case -685620679: goto L5d;
                case -685620648: goto L53;
                case -685620617: goto L4c;
                case -685620586: goto L47;
                case -685620555: goto L40;
                case -685620524: goto L39;
                case -685620493: goto L34;
                case -685620462: goto L2d;
                default: goto L2c;
            }
        L2c:
            goto L6c
        L2d:
            boolean r0 = r15.equals(r11)
            if (r0 == 0) goto L6c
            goto L59
        L34:
            boolean r0 = r15.equals(r10)
            goto L6c
        L39:
            boolean r0 = r15.equals(r9)
            if (r0 == 0) goto L6c
            goto L68
        L40:
            boolean r0 = r15.equals(r8)
            if (r0 == 0) goto L6c
            goto L59
        L47:
            boolean r0 = r15.equals(r7)
            goto L6c
        L4c:
            boolean r0 = r15.equals(r6)
            if (r0 == 0) goto L6c
            goto L68
        L53:
            boolean r0 = r15.equals(r5)
            if (r0 == 0) goto L6c
        L59:
            r14.setPositionAnchor(r1)
            goto L6f
        L5d:
            boolean r0 = r15.equals(r4)
            goto L6c
        L62:
            boolean r0 = r15.equals(r3)
            if (r0 == 0) goto L6c
        L68:
            r14.setPositionAnchor(r12)
            goto L6f
        L6c:
            r14.setPositionAnchor(r2)
        L6f:
            int r0 = r15.hashCode()
            switch(r0) {
                case -685620710: goto Lac;
                case -685620679: goto La5;
                case -685620648: goto L9e;
                case -685620617: goto L99;
                case -685620586: goto L94;
                case -685620555: goto L8f;
                case -685620524: goto L85;
                case -685620493: goto L7e;
                case -685620462: goto L77;
                default: goto L76;
            }
        L76:
            goto Lb6
        L77:
            boolean r15 = r15.equals(r11)
            if (r15 == 0) goto Lb6
            goto L8b
        L7e:
            boolean r15 = r15.equals(r10)
            if (r15 == 0) goto Lb6
            goto L8b
        L85:
            boolean r15 = r15.equals(r9)
            if (r15 == 0) goto Lb6
        L8b:
            r14.setLineAnchor(r12)
            goto Lb9
        L8f:
            boolean r15 = r15.equals(r8)
            goto Lb6
        L94:
            boolean r15 = r15.equals(r7)
            goto Lb6
        L99:
            boolean r15 = r15.equals(r6)
            goto Lb6
        L9e:
            boolean r15 = r15.equals(r5)
            if (r15 == 0) goto Lb6
            goto Lb2
        La5:
            boolean r15 = r15.equals(r4)
            if (r15 == 0) goto Lb6
            goto Lb2
        Lac:
            boolean r15 = r15.equals(r3)
            if (r15 == 0) goto Lb6
        Lb2:
            r14.setLineAnchor(r1)
            goto Lb9
        Lb6:
            r14.setLineAnchor(r2)
        Lb9:
            int r15 = r14.getPositionAnchor()
            float r15 = getFractionalPositionForAnchorType(r15)
            androidx.media3.common.text.Cue$Builder r15 = r14.setPosition(r15)
            int r14 = r14.getLineAnchor()
            float r14 = getFractionalPositionForAnchorType(r14)
            androidx.media3.common.text.Cue$Builder r14 = r15.setLine(r14, r12)
            androidx.media3.common.text.Cue r14 = r14.build()
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.text.subrip.SubripParser.buildCue(android.text.Spanned, java.lang.String):androidx.media3.common.text.Cue");
    }

    private Charset detectUtfCharset(ParsableByteArray parsableByteArray) {
        Charset readUtfCharsetFromBom = parsableByteArray.readUtfCharsetFromBom();
        return readUtfCharsetFromBom != null ? readUtfCharsetFromBom : StandardCharsets.UTF_8;
    }

    @VisibleForTesting(otherwise = 2)
    public static float getFractionalPositionForAnchorType(int i11) {
        if (i11 == 0) {
            return 0.08f;
        }
        if (i11 == 1) {
            return 0.5f;
        }
        if (i11 == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    private static long parseTimecode(Matcher matcher, int i11) {
        String group = matcher.group(i11 + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 3600000 : 0L) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i11 + 2))) * 60000) + (Long.parseLong((String) Assertions.checkNotNull(matcher.group(i11 + 3))) * 1000);
        String group2 = matcher.group(i11 + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    private String processLine(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb2 = new StringBuilder(trim);
        Matcher matcher = SUBRIP_TAG_PATTERN.matcher(trim);
        int i11 = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i11;
            int length = group.length();
            sb2.replace(start, start + length, "");
            i11 += length;
        }
        return sb2.toString();
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public int getCueReplacementBehavior() {
        return 1;
    }

    @Override // androidx.media3.extractor.text.SubtitleParser
    public void parse(byte[] bArr, int i11, int i12, SubtitleParser.OutputOptions outputOptions, Consumer<CuesWithTiming> consumer) {
        long j11;
        String readLine;
        String str;
        this.parsableByteArray.reset(bArr, i11 + i12);
        this.parsableByteArray.setPosition(i11);
        Charset detectUtfCharset = detectUtfCharset(this.parsableByteArray);
        long j12 = outputOptions.startTimeUs;
        long j13 = C.TIME_UNSET;
        ArrayList arrayList = (j12 == C.TIME_UNSET || !outputOptions.outputAllCues) ? null : new ArrayList();
        while (true) {
            String readLine2 = this.parsableByteArray.readLine(detectUtfCharset);
            if (readLine2 == null) {
                break;
            }
            if (readLine2.length() != 0) {
                try {
                    Integer.parseInt(readLine2);
                    readLine = this.parsableByteArray.readLine(detectUtfCharset);
                } catch (NumberFormatException unused) {
                    j11 = j13;
                    Log.w(TAG, "Skipping invalid index: " + readLine2);
                }
                if (readLine == null) {
                    Log.w(TAG, "Unexpected end");
                    break;
                }
                Matcher matcher = SUBRIP_TIMING_LINE.matcher(readLine);
                if (matcher.matches()) {
                    long parseTimecode = parseTimecode(matcher, 1);
                    long parseTimecode2 = parseTimecode(matcher, 6);
                    int i13 = 0;
                    this.textBuilder.setLength(0);
                    this.tags.clear();
                    String readLine3 = this.parsableByteArray.readLine(detectUtfCharset);
                    while (!TextUtils.isEmpty(readLine3)) {
                        if (this.textBuilder.length() > 0) {
                            this.textBuilder.append("<br>");
                        }
                        this.textBuilder.append(processLine(readLine3, this.tags));
                        readLine3 = this.parsableByteArray.readLine(detectUtfCharset);
                    }
                    Spanned fromHtml = Html.fromHtml(this.textBuilder.toString());
                    while (true) {
                        if (i13 >= this.tags.size()) {
                            str = null;
                            break;
                        }
                        str = this.tags.get(i13);
                        if (str.matches(SUBRIP_ALIGNMENT_TAG)) {
                            break;
                        } else {
                            i13++;
                        }
                    }
                    j11 = j13;
                    long j14 = outputOptions.startTimeUs;
                    if (j14 == j11 || parseTimecode >= j14) {
                        consumer.accept(new CuesWithTiming(ImmutableList.of(buildCue(fromHtml, str)), parseTimecode, parseTimecode2 - parseTimecode));
                    } else if (arrayList != null) {
                        arrayList.add(new CuesWithTiming(ImmutableList.of(buildCue(fromHtml, str)), parseTimecode, parseTimecode2 - parseTimecode));
                    }
                } else {
                    j11 = j13;
                    Log.w(TAG, "Skipping invalid timing: " + readLine);
                }
                j13 = j11;
            }
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                consumer.accept((CuesWithTiming) it.next());
            }
        }
    }
}
