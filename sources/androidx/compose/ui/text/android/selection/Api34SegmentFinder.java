package androidx.compose.ui.text.android.selection;

import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(34)
/* loaded from: classes2.dex */
public final class Api34SegmentFinder {
    public static final int $stable = 0;

    @k
    public static final Api34SegmentFinder INSTANCE = new Api34SegmentFinder();

    private Api34SegmentFinder() {
    }

    @k
    public final android.text.SegmentFinder toAndroidSegmentFinder$ui_text_release(@k final SegmentFinder segmentFinder) {
        return androidx.compose.ui.text.android.a.a(new android.text.SegmentFinder() { // from class: androidx.compose.ui.text.android.selection.Api34SegmentFinder$toAndroidSegmentFinder$1
            public int nextEndBoundary(int i11) {
                return SegmentFinder.this.nextEndBoundary(i11);
            }

            public int nextStartBoundary(int i11) {
                return SegmentFinder.this.nextStartBoundary(i11);
            }

            public int previousEndBoundary(int i11) {
                return SegmentFinder.this.previousEndBoundary(i11);
            }

            public int previousStartBoundary(int i11) {
                return SegmentFinder.this.previousStartBoundary(i11);
            }
        });
    }
}
