package androidx.core.text;

import java.nio.CharBuffer;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class TextDirectionHeuristicsCompat {
    public static final TextDirectionHeuristicCompat ANYRTL_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_LTR;
    public static final TextDirectionHeuristicCompat FIRSTSTRONG_RTL;
    public static final TextDirectionHeuristicCompat LOCALE;
    public static final TextDirectionHeuristicCompat LTR = new TextDirectionHeuristicInternal(null, false);
    public static final TextDirectionHeuristicCompat RTL = new TextDirectionHeuristicInternal(null, true);
    private static final int STATE_FALSE = 1;
    private static final int STATE_TRUE = 0;
    private static final int STATE_UNKNOWN = 2;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class AnyStrong implements TextDirectionAlgorithm {
        static final AnyStrong INSTANCE_RTL = new AnyStrong(true);
        private final boolean mLookForRtl;

        private AnyStrong(boolean z11) {
            this.mLookForRtl = z11;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            boolean z11 = false;
            while (i11 < i13) {
                int isRtlText = TextDirectionHeuristicsCompat.isRtlText(Character.getDirectionality(charSequence.charAt(i11)));
                if (isRtlText != 0) {
                    if (isRtlText != 1) {
                        continue;
                        i11++;
                        z11 = z11;
                    } else if (!this.mLookForRtl) {
                        return 1;
                    }
                } else if (this.mLookForRtl) {
                    return 0;
                }
                z11 = true;
                i11++;
                z11 = z11;
            }
            if (z11) {
                return this.mLookForRtl ? 1 : 0;
            }
            return 2;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FirstStrong implements TextDirectionAlgorithm {
        static final FirstStrong INSTANCE = new FirstStrong();

        private FirstStrong() {
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionAlgorithm
        public int checkRtl(CharSequence charSequence, int i11, int i12) {
            int i13 = i12 + i11;
            int i14 = 2;
            while (i11 < i13 && i14 == 2) {
                i14 = TextDirectionHeuristicsCompat.isRtlTextOrFormat(Character.getDirectionality(charSequence.charAt(i11)));
                i11++;
            }
            return i14;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface TextDirectionAlgorithm {
        int checkRtl(CharSequence charSequence, int i11, int i12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static abstract class TextDirectionHeuristicImpl implements TextDirectionHeuristicCompat {
        private final TextDirectionAlgorithm mAlgorithm;

        public TextDirectionHeuristicImpl(TextDirectionAlgorithm textDirectionAlgorithm) {
            this.mAlgorithm = textDirectionAlgorithm;
        }

        private boolean doCheck(CharSequence charSequence, int i11, int i12) {
            int checkRtl = this.mAlgorithm.checkRtl(charSequence, i11, i12);
            if (checkRtl == 0) {
                return true;
            }
            if (checkRtl != 1) {
                return defaultIsRtl();
            }
            return false;
        }

        public abstract boolean defaultIsRtl();

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(char[] cArr, int i11, int i12) {
            return isRtl(CharBuffer.wrap(cArr), i11, i12);
        }

        @Override // androidx.core.text.TextDirectionHeuristicCompat
        public boolean isRtl(CharSequence charSequence, int i11, int i12) {
            if (charSequence == null || i11 < 0 || i12 < 0 || charSequence.length() - i12 < i11) {
                throw new IllegalArgumentException();
            }
            return this.mAlgorithm == null ? defaultIsRtl() : doCheck(charSequence, i11, i12);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TextDirectionHeuristicInternal extends TextDirectionHeuristicImpl {
        private final boolean mDefaultIsRtl;

        public TextDirectionHeuristicInternal(TextDirectionAlgorithm textDirectionAlgorithm, boolean z11) {
            super(textDirectionAlgorithm);
            this.mDefaultIsRtl = z11;
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public boolean defaultIsRtl() {
            return this.mDefaultIsRtl;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class TextDirectionHeuristicLocale extends TextDirectionHeuristicImpl {
        static final TextDirectionHeuristicLocale INSTANCE = new TextDirectionHeuristicLocale();

        public TextDirectionHeuristicLocale() {
            super(null);
        }

        @Override // androidx.core.text.TextDirectionHeuristicsCompat.TextDirectionHeuristicImpl
        public boolean defaultIsRtl() {
            return TextUtilsCompat.getLayoutDirectionFromLocale(Locale.getDefault()) == 1;
        }
    }

    static {
        FirstStrong firstStrong = FirstStrong.INSTANCE;
        FIRSTSTRONG_LTR = new TextDirectionHeuristicInternal(firstStrong, false);
        FIRSTSTRONG_RTL = new TextDirectionHeuristicInternal(firstStrong, true);
        ANYRTL_LTR = new TextDirectionHeuristicInternal(AnyStrong.INSTANCE_RTL, false);
        LOCALE = TextDirectionHeuristicLocale.INSTANCE;
    }

    private TextDirectionHeuristicsCompat() {
    }

    public static int isRtlText(int i11) {
        if (i11 != 0) {
            return (i11 == 1 || i11 == 2) ? 0 : 2;
        }
        return 1;
    }

    public static int isRtlTextOrFormat(int i11) {
        if (i11 != 0) {
            if (i11 == 1 || i11 == 2) {
                return 0;
            }
            switch (i11) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
