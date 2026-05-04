package androidx.compose.ui.text.android.selection;

import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class WordBoundary_androidKt {
    public static final int getWordEnd(@k WordIterator wordIterator, int i11) {
        int punctuationEnd = wordIterator.isAfterPunctuation(wordIterator.nextBoundary(i11)) ? wordIterator.getPunctuationEnd(i11) : wordIterator.getNextWordEndOnTwoWordBoundary(i11);
        return punctuationEnd == -1 ? i11 : punctuationEnd;
    }

    public static final int getWordStart(@k WordIterator wordIterator, int i11) {
        int punctuationBeginning = wordIterator.isOnPunctuation(wordIterator.prevBoundary(i11)) ? wordIterator.getPunctuationBeginning(i11) : wordIterator.getPrevWordBeginningOnTwoWordsBoundary(i11);
        return punctuationBeginning == -1 ? i11 : punctuationBeginning;
    }
}
