package androidx.constraintlayout.compose;

import android.util.Log;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.extractor.text.ttml.TtmlNode;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public final class AnchorFunctions {
    public static final int $stable = 0;

    @k
    public static final AnchorFunctions INSTANCE = new AnchorFunctions();

    private AnchorFunctions() {
    }

    @k
    public final String horizontalAnchorIndexToAnchorName(int i11) {
        if (i11 == 0) {
            return "top";
        }
        if (i11 == 1) {
            return "bottom";
        }
        Log.e("CCL", "horizontalAnchorIndexToAnchorName: Unknown horizontal index");
        return "top";
    }

    @k
    public final String verticalAnchorIndexToAnchorName(int i11) {
        if (i11 == -2) {
            return TtmlNode.START;
        }
        if (i11 == -1) {
            return TtmlNode.END;
        }
        if (i11 == 0) {
            return TtmlNode.LEFT;
        }
        if (i11 == 1) {
            return TtmlNode.RIGHT;
        }
        Log.e("CCL", "verticalAnchorIndexToAnchorName: Unknown vertical index");
        return TtmlNode.START;
    }
}
