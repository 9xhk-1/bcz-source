package androidx.compose.ui.text.android.selection;

import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class WordSegmentFinder implements SegmentFinder {
    public static final int $stable = 8;

    @k
    private final CharSequence text;

    @k
    private final WordIterator wordIterator;

    public WordSegmentFinder(@k CharSequence charSequence, @k WordIterator wordIterator) {
        this.text = charSequence;
        this.wordIterator = wordIterator;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextEndBoundary(int i11) {
        do {
            i11 = this.wordIterator.nextBoundary(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i11 - 1)));
        return i11;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int nextStartBoundary(int i11) {
        do {
            i11 = this.wordIterator.nextBoundary(i11);
            if (i11 == -1 || i11 == this.text.length()) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i11)));
        return i11;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousEndBoundary(int i11) {
        do {
            i11 = this.wordIterator.prevBoundary(i11);
            if (i11 == -1 || i11 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i11 - 1)));
        return i11;
    }

    @Override // androidx.compose.ui.text.android.selection.SegmentFinder
    public int previousStartBoundary(int i11) {
        do {
            i11 = this.wordIterator.prevBoundary(i11);
            if (i11 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(this.text.charAt(i11)));
        return i11;
    }
}
