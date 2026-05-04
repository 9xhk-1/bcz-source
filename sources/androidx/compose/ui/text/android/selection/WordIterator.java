package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.android.CharSequenceCharacterIterator;
import androidx.compose.ui.text.internal.InlineClassHelperKt;
import androidx.emoji2.text.EmojiCompat;
import java.lang.Character;
import java.text.BreakIterator;
import java.util.Locale;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import l50.b;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nWordIterator.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordIterator.android.kt\nandroidx/compose/ui/text/android/selection/WordIterator\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/text/internal/InlineClassHelperKt\n*L\n1#1,377:1\n114#2,8:378\n114#2,8:386\n114#2,8:394\n*S KotlinDebug\n*F\n+ 1 WordIterator.android.kt\nandroidx/compose/ui/text/android/selection/WordIterator\n*L\n44#1:378,8\n47#1:386,8\n323#1:394,8\n*E\n"})
/* loaded from: classes2.dex */
public final class WordIterator {
    private static final int WINDOW_WIDTH = 50;

    @k
    private final CharSequence charSequence;
    private final int end;

    @k
    private final BreakIterator iterator;
    private final int start;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        public final boolean isPunctuation$ui_text_release(int i11) {
            int type = Character.getType(i11);
            return type == 23 || type == 20 || type == 22 || type == 30 || type == 29 || type == 24 || type == 21;
        }

        private Companion() {
        }
    }

    public WordIterator(@k CharSequence charSequence, int i11, int i12, @l Locale locale) {
        this.charSequence = charSequence;
        if (!(i11 >= 0 && i11 <= charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("input start index is outside the CharSequence");
        }
        if (!(i12 >= 0 && i12 <= charSequence.length())) {
            InlineClassHelperKt.throwIllegalArgumentException("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.iterator = wordInstance;
        this.start = Math.max(0, i11 - 50);
        this.end = Math.min(charSequence.length(), i12 + 50);
        wordInstance.setText(new CharSequenceCharacterIterator(charSequence, i11, i12));
    }

    private final void checkOffsetIsValid(int i11) {
        int i12 = this.start;
        boolean z11 = false;
        if (i11 <= this.end && i12 <= i11) {
            z11 = true;
        }
        if (z11) {
            return;
        }
        InlineClassHelperKt.throwIllegalArgumentException("Invalid offset: " + i11 + ". Valid range is [" + this.start + " , " + this.end + b.f69930l);
    }

    private final int getBeginning(int i11, boolean z11) {
        checkOffsetIsValid(i11);
        if (isOnLetterOrDigitOrEmoji(i11)) {
            return (!isBoundary(i11) || (isAfterLetterOrDigitOrEmoji(i11) && z11)) ? prevBoundary(i11) : i11;
        }
        if (isAfterLetterOrDigitOrEmoji(i11)) {
            return prevBoundary(i11);
        }
        return -1;
    }

    private final int getEnd(int i11, boolean z11) {
        checkOffsetIsValid(i11);
        if (isAfterLetterOrDigitOrEmoji(i11)) {
            return (!isBoundary(i11) || (isOnLetterOrDigitOrEmoji(i11) && z11)) ? nextBoundary(i11) : i11;
        }
        if (isOnLetterOrDigitOrEmoji(i11)) {
            return nextBoundary(i11);
        }
        return -1;
    }

    private final boolean isAfterLetterOrDigitOrEmoji(int i11) {
        int i12 = this.start + 1;
        if (i11 > this.end || i12 > i11) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointBefore(this.charSequence, i11))) {
            return true;
        }
        int i13 = i11 - 1;
        if (Character.isSurrogate(this.charSequence.charAt(i13))) {
            return true;
        }
        if (!EmojiCompat.isConfigured()) {
            return false;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, i13) != -1;
    }

    private final boolean isBoundary(int i11) {
        checkOffsetIsValid(i11);
        if (!this.iterator.isBoundary(i11)) {
            return false;
        }
        if (isOnLetterOrDigitOrEmoji(i11) && isOnLetterOrDigitOrEmoji(i11 - 1) && isOnLetterOrDigitOrEmoji(i11 + 1)) {
            return false;
        }
        return i11 <= 0 || i11 >= this.charSequence.length() - 1 || !(isHiraganaKatakanaBoundary(i11) || isHiraganaKatakanaBoundary(i11 + 1));
    }

    private final boolean isHiraganaKatakanaBoundary(int i11) {
        int i12 = i11 - 1;
        Character.UnicodeBlock of2 = Character.UnicodeBlock.of(this.charSequence.charAt(i12));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (g0.g(of2, unicodeBlock) && g0.g(Character.UnicodeBlock.of(this.charSequence.charAt(i11)), Character.UnicodeBlock.KATAKANA)) {
            return true;
        }
        return g0.g(Character.UnicodeBlock.of(this.charSequence.charAt(i11)), unicodeBlock) && g0.g(Character.UnicodeBlock.of(this.charSequence.charAt(i12)), Character.UnicodeBlock.KATAKANA);
    }

    private final boolean isOnLetterOrDigitOrEmoji(int i11) {
        int i12 = this.start;
        if (i11 >= this.end || i12 > i11) {
            return false;
        }
        if (Character.isLetterOrDigit(Character.codePointAt(this.charSequence, i11)) || Character.isSurrogate(this.charSequence.charAt(i11))) {
            return true;
        }
        if (!EmojiCompat.isConfigured()) {
            return false;
        }
        EmojiCompat emojiCompat = EmojiCompat.get();
        return emojiCompat.getLoadState() == 1 && emojiCompat.getEmojiStart(this.charSequence, i11) != -1;
    }

    private final boolean isPunctuationEndBoundary(int i11) {
        return !isOnPunctuation(i11) && isAfterPunctuation(i11);
    }

    private final boolean isPunctuationStartBoundary(int i11) {
        return isOnPunctuation(i11) && !isAfterPunctuation(i11);
    }

    @k
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    public final int getNextWordEndOnTwoWordBoundary(int i11) {
        return getEnd(i11, true);
    }

    public final int getPrevWordBeginningOnTwoWordsBoundary(int i11) {
        return getBeginning(i11, true);
    }

    public final int getPunctuationBeginning(int i11) {
        checkOffsetIsValid(i11);
        while (i11 != -1 && !isPunctuationStartBoundary(i11)) {
            i11 = prevBoundary(i11);
        }
        return i11;
    }

    public final int getPunctuationEnd(int i11) {
        checkOffsetIsValid(i11);
        while (i11 != -1 && !isPunctuationEndBoundary(i11)) {
            i11 = nextBoundary(i11);
        }
        return i11;
    }

    public final boolean isAfterPunctuation(int i11) {
        int i12 = this.start + 1;
        if (i11 > this.end || i12 > i11) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointBefore(this.charSequence, i11));
    }

    public final boolean isOnPunctuation(int i11) {
        int i12 = this.start;
        if (i11 >= this.end || i12 > i11) {
            return false;
        }
        return Companion.isPunctuation$ui_text_release(Character.codePointAt(this.charSequence, i11));
    }

    public final int nextBoundary(int i11) {
        checkOffsetIsValid(i11);
        int following = this.iterator.following(i11);
        return (isOnLetterOrDigitOrEmoji(following + (-1)) && isOnLetterOrDigitOrEmoji(following) && !isHiraganaKatakanaBoundary(following)) ? nextBoundary(following) : following;
    }

    public final int prevBoundary(int i11) {
        checkOffsetIsValid(i11);
        int preceding = this.iterator.preceding(i11);
        return (isOnLetterOrDigitOrEmoji(preceding) && isAfterLetterOrDigitOrEmoji(preceding) && !isHiraganaKatakanaBoundary(preceding)) ? prevBoundary(preceding) : preceding;
    }
}
