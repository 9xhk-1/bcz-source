package androidx.media3.extractor.text.ssa;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import androidx.annotation.ColorInt;
import androidx.annotation.Nullable;
import androidx.media3.common.util.Assertions;
import androidx.media3.common.util.Log;
import androidx.media3.common.util.Util;
import androidx.media3.extractor.text.ttml.TtmlNode;
import ho.c;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import ro.i;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
final class SsaStyle {
    public static final int SSA_ALIGNMENT_BOTTOM_CENTER = 2;
    public static final int SSA_ALIGNMENT_BOTTOM_LEFT = 1;
    public static final int SSA_ALIGNMENT_BOTTOM_RIGHT = 3;
    public static final int SSA_ALIGNMENT_MIDDLE_CENTER = 5;
    public static final int SSA_ALIGNMENT_MIDDLE_LEFT = 4;
    public static final int SSA_ALIGNMENT_MIDDLE_RIGHT = 6;
    public static final int SSA_ALIGNMENT_TOP_CENTER = 8;
    public static final int SSA_ALIGNMENT_TOP_LEFT = 7;
    public static final int SSA_ALIGNMENT_TOP_RIGHT = 9;
    public static final int SSA_ALIGNMENT_UNKNOWN = -1;
    public static final int SSA_BORDER_STYLE_BOX = 3;
    public static final int SSA_BORDER_STYLE_OUTLINE = 1;
    public static final int SSA_BORDER_STYLE_UNKNOWN = -1;
    private static final String TAG = "SsaStyle";
    public final int alignment;
    public final boolean bold;
    public final int borderStyle;
    public final float fontSize;
    public final boolean italic;
    public final String name;

    @Nullable
    @ColorInt
    public final Integer outlineColor;

    @Nullable
    @ColorInt
    public final Integer primaryColor;
    public final boolean strikeout;
    public final boolean underline;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Format {
        public final int alignmentIndex;
        public final int boldIndex;
        public final int borderStyleIndex;
        public final int fontSizeIndex;
        public final int italicIndex;
        public final int length;
        public final int nameIndex;
        public final int outlineColorIndex;
        public final int primaryColorIndex;
        public final int strikeoutIndex;
        public final int underlineIndex;

        private Format(int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i21, int i22) {
            this.nameIndex = i11;
            this.alignmentIndex = i12;
            this.primaryColorIndex = i13;
            this.outlineColorIndex = i14;
            this.fontSizeIndex = i15;
            this.boldIndex = i16;
            this.italicIndex = i17;
            this.underlineIndex = i18;
            this.strikeoutIndex = i19;
            this.borderStyleIndex = i21;
            this.length = i22;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        @Nullable
        public static Format fromFormatLine(String str) {
            char c11;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i11 = -1;
            int i12 = -1;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i21 = -1;
            for (int i22 = 0; i22 < split.length; i22++) {
                String g11 = c.g(split[i22].trim());
                g11.getClass();
                switch (g11.hashCode()) {
                    case -1178781136:
                        if (g11.equals(TtmlNode.ITALIC)) {
                            c11 = 0;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -1026963764:
                        if (g11.equals(TtmlNode.UNDERLINE)) {
                            c11 = 1;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -192095652:
                        if (g11.equals("strikeout")) {
                            c11 = 2;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case -70925746:
                        if (g11.equals("primarycolour")) {
                            c11 = 3;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3029637:
                        if (g11.equals(TtmlNode.BOLD)) {
                            c11 = 4;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 3373707:
                        if (g11.equals("name")) {
                            c11 = 5;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 366554320:
                        if (g11.equals("fontsize")) {
                            c11 = 6;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 767321349:
                        if (g11.equals("borderstyle")) {
                            c11 = 7;
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1767875043:
                        if (g11.equals("alignment")) {
                            c11 = '\b';
                            break;
                        }
                        c11 = 65535;
                        break;
                    case 1988365454:
                        if (g11.equals("outlinecolour")) {
                            c11 = '\t';
                            break;
                        }
                        c11 = 65535;
                        break;
                    default:
                        c11 = 65535;
                        break;
                }
                switch (c11) {
                    case 0:
                        i17 = i22;
                        break;
                    case 1:
                        i18 = i22;
                        break;
                    case 2:
                        i19 = i22;
                        break;
                    case 3:
                        i13 = i22;
                        break;
                    case 4:
                        i16 = i22;
                        break;
                    case 5:
                        i11 = i22;
                        break;
                    case 6:
                        i15 = i22;
                        break;
                    case 7:
                        i21 = i22;
                        break;
                    case '\b':
                        i12 = i22;
                        break;
                    case '\t':
                        i14 = i22;
                        break;
                }
            }
            if (i11 != -1) {
                return new Format(i11, i12, i13, i14, i15, i16, i17, i18, i19, i21, split.length);
            }
            return null;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Overrides {
        private static final String TAG = "SsaStyle.Overrides";
        public final int alignment;

        @Nullable
        public final PointF position;
        private static final Pattern BRACES_PATTERN = Pattern.compile("\\{([^}]*)\\}");
        private static final String PADDED_DECIMAL_PATTERN = "\\s*\\d+(?:\\.\\d+)?\\s*";
        private static final Pattern POSITION_PATTERN = Pattern.compile(Util.formatInvariant("\\\\pos\\((%1$s),(%1$s)\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern MOVE_PATTERN = Pattern.compile(Util.formatInvariant("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", PADDED_DECIMAL_PATTERN));
        private static final Pattern ALIGNMENT_OVERRIDE_PATTERN = Pattern.compile("\\\\an(\\d+)");

        private Overrides(int i11, @Nullable PointF pointF) {
            this.alignment = i11;
            this.position = pointF;
        }

        private static int parseAlignmentOverride(String str) {
            Matcher matcher = ALIGNMENT_OVERRIDE_PATTERN.matcher(str);
            if (matcher.find()) {
                return SsaStyle.parseAlignment((String) Assertions.checkNotNull(matcher.group(1)));
            }
            return -1;
        }

        public static Overrides parseFromDialogue(String str) {
            Matcher matcher = BRACES_PATTERN.matcher(str);
            PointF pointF = null;
            int i11 = -1;
            while (matcher.find()) {
                String str2 = (String) Assertions.checkNotNull(matcher.group(1));
                try {
                    PointF parsePosition = parsePosition(str2);
                    if (parsePosition != null) {
                        pointF = parsePosition;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    int parseAlignmentOverride = parseAlignmentOverride(str2);
                    if (parseAlignmentOverride != -1) {
                        i11 = parseAlignmentOverride;
                    }
                } catch (RuntimeException unused2) {
                }
            }
            return new Overrides(i11, pointF);
        }

        @Nullable
        private static PointF parsePosition(String str) {
            String group;
            String group2;
            Matcher matcher = POSITION_PATTERN.matcher(str);
            Matcher matcher2 = MOVE_PATTERN.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    Log.i(TAG, "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) Assertions.checkNotNull(group)).trim()), Float.parseFloat(((String) Assertions.checkNotNull(group2)).trim()));
        }

        public static String stripStyleOverrides(String str) {
            return BRACES_PATTERN.matcher(str).replaceAll("");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaAlignment {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @Target({ElementType.TYPE_USE})
    @Documented
    @Retention(RetentionPolicy.SOURCE)
    public @interface SsaBorderStyle {
    }

    private SsaStyle(String str, int i11, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2, float f11, boolean z11, boolean z12, boolean z13, boolean z14, int i12) {
        this.name = str;
        this.alignment = i11;
        this.primaryColor = num;
        this.outlineColor = num2;
        this.fontSize = f11;
        this.bold = z11;
        this.italic = z12;
        this.underline = z13;
        this.strikeout = z14;
        this.borderStyle = i12;
    }

    @Nullable
    public static SsaStyle fromStyleLine(String str, Format format) {
        boolean z11;
        boolean z12;
        Assertions.checkArgument(str.startsWith("Style:"));
        String[] split = TextUtils.split(str.substring(6), ",");
        int length = split.length;
        int i11 = format.length;
        if (length != i11) {
            Log.w(TAG, Util.formatInvariant("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(i11), Integer.valueOf(split.length), str));
            return null;
        }
        try {
            String trim = split[format.nameIndex].trim();
            int i12 = format.alignmentIndex;
            int parseAlignment = i12 != -1 ? parseAlignment(split[i12].trim()) : -1;
            int i13 = format.primaryColorIndex;
            Integer parseColor = i13 != -1 ? parseColor(split[i13].trim()) : null;
            int i14 = format.outlineColorIndex;
            Integer parseColor2 = i14 != -1 ? parseColor(split[i14].trim()) : null;
            int i15 = format.fontSizeIndex;
            float parseFontSize = i15 != -1 ? parseFontSize(split[i15].trim()) : -3.4028235E38f;
            int i16 = format.boldIndex;
            boolean z13 = false;
            boolean z14 = true;
            if (i16 == -1 || !parseBooleanValue(split[i16].trim())) {
                z11 = false;
            } else {
                z11 = false;
                z13 = true;
            }
            int i17 = format.italicIndex;
            if (i17 == -1 || !parseBooleanValue(split[i17].trim())) {
                z12 = true;
                z14 = z11;
            } else {
                z12 = true;
            }
            int i18 = format.underlineIndex;
            if (i18 == -1 || !parseBooleanValue(split[i18].trim())) {
                z12 = false;
            }
            int i19 = format.strikeoutIndex;
            boolean z15 = i19 != -1 && parseBooleanValue(split[i19].trim());
            int i21 = format.borderStyleIndex;
            return new SsaStyle(trim, parseAlignment, parseColor, parseColor2, parseFontSize, z13, z14, z12, z15, i21 != -1 ? parseBorderStyle(split[i21].trim()) : -1);
        } catch (RuntimeException e11) {
            Log.w(TAG, "Skipping malformed 'Style:' line: '" + str + "'", e11);
            return null;
        }
    }

    private static boolean isValidAlignment(int i11) {
        switch (i11) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    private static boolean isValidBorderStyle(int i11) {
        return i11 == 1 || i11 == 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int parseAlignment(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (isValidAlignment(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w(TAG, "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static boolean parseBooleanValue(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e11) {
            Log.w(TAG, "Failed to parse boolean value: '" + str + "'", e11);
            return false;
        }
    }

    private static int parseBorderStyle(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (isValidBorderStyle(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        Log.w(TAG, "Ignoring unknown BorderStyle: " + str);
        return -1;
    }

    @Nullable
    @ColorInt
    public static Integer parseColor(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            Assertions.checkArgument(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(i.e(((parseLong >> 24) & 255) ^ 255), i.e(parseLong & 255), i.e((parseLong >> 8) & 255), i.e((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e11) {
            Log.w(TAG, "Failed to parse color expression: '" + str + "'", e11);
            return null;
        }
    }

    private static float parseFontSize(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e11) {
            Log.w(TAG, "Failed to parse font size: '" + str + "'", e11);
            return -3.4028235E38f;
        }
    }
}
