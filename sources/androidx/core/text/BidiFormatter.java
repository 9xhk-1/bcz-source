package androidx.core.text;

import android.text.SpannableStringBuilder;
import java.util.Locale;
import u30.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class BidiFormatter {
    private static final int DEFAULT_FLAGS = 2;
    static final BidiFormatter DEFAULT_LTR_INSTANCE;
    static final BidiFormatter DEFAULT_RTL_INSTANCE;
    static final TextDirectionHeuristicCompat DEFAULT_TEXT_DIRECTION_HEURISTIC;
    private static final int DIR_LTR = -1;
    private static final int DIR_RTL = 1;
    private static final int DIR_UNKNOWN = 0;
    private static final String EMPTY_STRING = "";
    private static final int FLAG_STEREO_RESET = 2;
    private static final char LRE = 8234;
    private static final char LRM = 8206;
    private static final String LRM_STRING;
    private static final char PDF = 8236;
    private static final char RLE = 8235;
    private static final char RLM = 8207;
    private static final String RLM_STRING;
    private final TextDirectionHeuristicCompat mDefaultTextDirectionHeuristicCompat;
    private final int mFlags;
    private final boolean mIsRtlContext;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class DirectionalityEstimator {
        private int charIndex;
        private final boolean isHtml;
        private char lastChar;
        private final int length;
        private final CharSequence text;
        private static final int DIR_TYPE_CACHE_SIZE = 1792;
        private static final byte[] DIR_TYPE_CACHE = new byte[DIR_TYPE_CACHE_SIZE];

        static {
            for (int i11 = 0; i11 < DIR_TYPE_CACHE_SIZE; i11++) {
                DIR_TYPE_CACHE[i11] = Character.getDirectionality(i11);
            }
        }

        public DirectionalityEstimator(CharSequence charSequence, boolean z11) {
            this.text = charSequence;
            this.isHtml = z11;
            this.length = charSequence.length();
        }

        private static byte getCachedDirectionality(char c11) {
            return c11 < DIR_TYPE_CACHE_SIZE ? DIR_TYPE_CACHE[c11] : Character.getDirectionality(c11);
        }

        private byte skipEntityBackward() {
            char charAt;
            int i11 = this.charIndex;
            do {
                int i12 = this.charIndex;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.text;
                int i13 = i12 - 1;
                this.charIndex = i13;
                charAt = charSequence.charAt(i13);
                this.lastChar = charAt;
                if (charAt == '&') {
                    return (byte) 12;
                }
            } while (charAt != ';');
            this.charIndex = i11;
            this.lastChar = l70.f.f70689d;
            return (byte) 13;
        }

        private byte skipEntityForward() {
            char charAt;
            do {
                int i11 = this.charIndex;
                if (i11 >= this.length) {
                    return (byte) 12;
                }
                CharSequence charSequence = this.text;
                this.charIndex = i11 + 1;
                charAt = charSequence.charAt(i11);
                this.lastChar = charAt;
            } while (charAt != ';');
            return (byte) 12;
        }

        private byte skipTagBackward() {
            char charAt;
            int i11 = this.charIndex;
            while (true) {
                int i12 = this.charIndex;
                if (i12 <= 0) {
                    break;
                }
                CharSequence charSequence = this.text;
                int i13 = i12 - 1;
                this.charIndex = i13;
                char charAt2 = charSequence.charAt(i13);
                this.lastChar = charAt2;
                if (charAt2 == '<') {
                    return (byte) 12;
                }
                if (charAt2 == '>') {
                    break;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i14 = this.charIndex;
                        if (i14 > 0) {
                            CharSequence charSequence2 = this.text;
                            int i15 = i14 - 1;
                            this.charIndex = i15;
                            charAt = charSequence2.charAt(i15);
                            this.lastChar = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
            this.charIndex = i11;
            this.lastChar = u0.f91710f;
            return (byte) 13;
        }

        private byte skipTagForward() {
            char charAt;
            int i11 = this.charIndex;
            while (true) {
                int i12 = this.charIndex;
                if (i12 >= this.length) {
                    this.charIndex = i11;
                    this.lastChar = u0.f91709e;
                    return (byte) 13;
                }
                CharSequence charSequence = this.text;
                this.charIndex = i12 + 1;
                char charAt2 = charSequence.charAt(i12);
                this.lastChar = charAt2;
                if (charAt2 == '>') {
                    return (byte) 12;
                }
                if (charAt2 == '\"' || charAt2 == '\'') {
                    do {
                        int i13 = this.charIndex;
                        if (i13 < this.length) {
                            CharSequence charSequence2 = this.text;
                            this.charIndex = i13 + 1;
                            charAt = charSequence2.charAt(i13);
                            this.lastChar = charAt;
                        }
                    } while (charAt != charAt2);
                }
            }
        }

        public byte dirTypeBackward() {
            char charAt = this.text.charAt(this.charIndex - 1);
            this.lastChar = charAt;
            if (Character.isLowSurrogate(charAt)) {
                int codePointBefore = Character.codePointBefore(this.text, this.charIndex);
                this.charIndex -= Character.charCount(codePointBefore);
                return Character.getDirectionality(codePointBefore);
            }
            this.charIndex--;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            if (!this.isHtml) {
                return cachedDirectionality;
            }
            char c11 = this.lastChar;
            return c11 == '>' ? skipTagBackward() : c11 == ';' ? skipEntityBackward() : cachedDirectionality;
        }

        public byte dirTypeForward() {
            char charAt = this.text.charAt(this.charIndex);
            this.lastChar = charAt;
            if (Character.isHighSurrogate(charAt)) {
                int codePointAt = Character.codePointAt(this.text, this.charIndex);
                this.charIndex += Character.charCount(codePointAt);
                return Character.getDirectionality(codePointAt);
            }
            this.charIndex++;
            byte cachedDirectionality = getCachedDirectionality(this.lastChar);
            if (!this.isHtml) {
                return cachedDirectionality;
            }
            char c11 = this.lastChar;
            return c11 == '<' ? skipTagForward() : c11 == '&' ? skipEntityForward() : cachedDirectionality;
        }

        public int getEntryDir() {
            this.charIndex = 0;
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (this.charIndex < this.length && i11 == 0) {
                byte dirTypeForward = dirTypeForward();
                if (dirTypeForward != 0) {
                    if (dirTypeForward == 1 || dirTypeForward == 2) {
                        if (i13 == 0) {
                            return 1;
                        }
                    } else if (dirTypeForward != 9) {
                        switch (dirTypeForward) {
                            case 14:
                            case 15:
                                i13++;
                                i12 = -1;
                                continue;
                            case 16:
                            case 17:
                                i13++;
                                i12 = 1;
                                continue;
                            case 18:
                                i13--;
                                i12 = 0;
                                continue;
                        }
                    }
                } else if (i13 == 0) {
                    return -1;
                }
                i11 = i13;
            }
            if (i11 == 0) {
                return 0;
            }
            if (i12 != 0) {
                return i12;
            }
            while (this.charIndex > 0) {
                switch (dirTypeBackward()) {
                    case 14:
                    case 15:
                        if (i11 == i13) {
                            return -1;
                        }
                        break;
                    case 16:
                    case 17:
                        if (i11 == i13) {
                            return 1;
                        }
                        break;
                    case 18:
                        i13++;
                        continue;
                }
                i13--;
            }
            return 0;
        }

        public int getExitDir() {
            this.charIndex = this.length;
            int i11 = 0;
            while (true) {
                int i12 = i11;
                while (this.charIndex > 0) {
                    byte dirTypeBackward = dirTypeBackward();
                    if (dirTypeBackward != 0) {
                        if (dirTypeBackward == 1 || dirTypeBackward == 2) {
                            if (i11 == 0) {
                                return 1;
                            }
                            if (i12 == 0) {
                                break;
                            }
                        } else if (dirTypeBackward != 9) {
                            switch (dirTypeBackward) {
                                case 14:
                                case 15:
                                    if (i12 == i11) {
                                        return -1;
                                    }
                                    i11--;
                                    break;
                                case 16:
                                case 17:
                                    if (i12 == i11) {
                                        return 1;
                                    }
                                    i11--;
                                    break;
                                case 18:
                                    i11++;
                                    break;
                                default:
                                    if (i12 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        } else {
                            continue;
                        }
                    } else {
                        if (i11 == 0) {
                            return -1;
                        }
                        if (i12 == 0) {
                            break;
                        }
                    }
                }
                return 0;
            }
        }
    }

    static {
        TextDirectionHeuristicCompat textDirectionHeuristicCompat = TextDirectionHeuristicsCompat.FIRSTSTRONG_LTR;
        DEFAULT_TEXT_DIRECTION_HEURISTIC = textDirectionHeuristicCompat;
        LRM_STRING = Character.toString(LRM);
        RLM_STRING = Character.toString(RLM);
        DEFAULT_LTR_INSTANCE = new BidiFormatter(false, 2, textDirectionHeuristicCompat);
        DEFAULT_RTL_INSTANCE = new BidiFormatter(true, 2, textDirectionHeuristicCompat);
    }

    public BidiFormatter(boolean z11, int i11, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        this.mIsRtlContext = z11;
        this.mFlags = i11;
        this.mDefaultTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
    }

    private static int getEntryDir(CharSequence charSequence) {
        return new DirectionalityEstimator(charSequence, false).getEntryDir();
    }

    private static int getExitDir(CharSequence charSequence) {
        return new DirectionalityEstimator(charSequence, false).getExitDir();
    }

    public static BidiFormatter getInstance() {
        return new Builder().build();
    }

    public static boolean isRtlLocale(Locale locale) {
        return TextUtilsCompat.getLayoutDirectionFromLocale(locale) == 1;
    }

    private String markAfter(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        return (this.mIsRtlContext || !(isRtl || getExitDir(charSequence) == 1)) ? this.mIsRtlContext ? (!isRtl || getExitDir(charSequence) == -1) ? RLM_STRING : "" : "" : LRM_STRING;
    }

    private String markBefore(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        return (this.mIsRtlContext || !(isRtl || getEntryDir(charSequence) == 1)) ? this.mIsRtlContext ? (!isRtl || getEntryDir(charSequence) == -1) ? RLM_STRING : "" : "" : LRM_STRING;
    }

    public boolean getStereoReset() {
        return (this.mFlags & 2) != 0;
    }

    public boolean isRtl(String str) {
        return isRtl((CharSequence) str);
    }

    public boolean isRtlContext() {
        return this.mIsRtlContext;
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z11) {
        if (str == null) {
            return null;
        }
        return unicodeWrap((CharSequence) str, textDirectionHeuristicCompat, z11).toString();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Builder {
        private int mFlags;
        private boolean mIsRtlContext;
        private TextDirectionHeuristicCompat mTextDirectionHeuristicCompat;

        public Builder() {
            initialize(BidiFormatter.isRtlLocale(Locale.getDefault()));
        }

        private static BidiFormatter getDefaultInstanceFromContext(boolean z11) {
            return z11 ? BidiFormatter.DEFAULT_RTL_INSTANCE : BidiFormatter.DEFAULT_LTR_INSTANCE;
        }

        private void initialize(boolean z11) {
            this.mIsRtlContext = z11;
            this.mTextDirectionHeuristicCompat = BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC;
            this.mFlags = 2;
        }

        public BidiFormatter build() {
            return (this.mFlags == 2 && this.mTextDirectionHeuristicCompat == BidiFormatter.DEFAULT_TEXT_DIRECTION_HEURISTIC) ? getDefaultInstanceFromContext(this.mIsRtlContext) : new BidiFormatter(this.mIsRtlContext, this.mFlags, this.mTextDirectionHeuristicCompat);
        }

        public Builder setTextDirectionHeuristic(TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
            this.mTextDirectionHeuristicCompat = textDirectionHeuristicCompat;
            return this;
        }

        public Builder stereoReset(boolean z11) {
            if (z11) {
                this.mFlags |= 2;
                return this;
            }
            this.mFlags &= -3;
            return this;
        }

        public Builder(boolean z11) {
            initialize(z11);
        }

        public Builder(Locale locale) {
            initialize(BidiFormatter.isRtlLocale(locale));
        }
    }

    public static BidiFormatter getInstance(boolean z11) {
        return new Builder(z11).build();
    }

    public boolean isRtl(CharSequence charSequence) {
        return this.mDefaultTextDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat, boolean z11) {
        if (charSequence == null) {
            return null;
        }
        boolean isRtl = textDirectionHeuristicCompat.isRtl(charSequence, 0, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (getStereoReset() && z11) {
            spannableStringBuilder.append((CharSequence) markBefore(charSequence, isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        if (isRtl != this.mIsRtlContext) {
            spannableStringBuilder.append(isRtl ? RLE : LRE);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append(PDF);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (z11) {
            spannableStringBuilder.append((CharSequence) markAfter(charSequence, isRtl ? TextDirectionHeuristicsCompat.RTL : TextDirectionHeuristicsCompat.LTR));
        }
        return spannableStringBuilder;
    }

    public static BidiFormatter getInstance(Locale locale) {
        return new Builder(locale).build();
    }

    public String unicodeWrap(String str, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(str, textDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, TextDirectionHeuristicCompat textDirectionHeuristicCompat) {
        return unicodeWrap(charSequence, textDirectionHeuristicCompat, true);
    }

    public String unicodeWrap(String str, boolean z11) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, z11);
    }

    public CharSequence unicodeWrap(CharSequence charSequence, boolean z11) {
        return unicodeWrap(charSequence, this.mDefaultTextDirectionHeuristicCompat, z11);
    }

    public String unicodeWrap(String str) {
        return unicodeWrap(str, this.mDefaultTextDirectionHeuristicCompat, true);
    }

    public CharSequence unicodeWrap(CharSequence charSequence) {
        return unicodeWrap(charSequence, this.mDefaultTextDirectionHeuristicCompat, true);
    }
}
