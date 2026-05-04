package androidx.compose.foundation.text.modifiers;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.style.TextOverflow;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public class StaticTextSelectionParams {

    @l
    private final LayoutCoordinates layoutCoordinates;

    @l
    private final TextLayoutResult textLayoutResult;

    @k
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @k
    private static final StaticTextSelectionParams Empty = new StaticTextSelectionParams(null, null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final StaticTextSelectionParams getEmpty() {
            return StaticTextSelectionParams.Empty;
        }

        private Companion() {
        }
    }

    public StaticTextSelectionParams(@l LayoutCoordinates layoutCoordinates, @l TextLayoutResult textLayoutResult) {
        this.layoutCoordinates = layoutCoordinates;
        this.textLayoutResult = textLayoutResult;
    }

    public static /* synthetic */ StaticTextSelectionParams copy$default(StaticTextSelectionParams staticTextSelectionParams, LayoutCoordinates layoutCoordinates, TextLayoutResult textLayoutResult, int i11, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: copy");
        }
        if ((i11 & 1) != 0) {
            layoutCoordinates = staticTextSelectionParams.layoutCoordinates;
        }
        if ((i11 & 2) != 0) {
            textLayoutResult = staticTextSelectionParams.textLayoutResult;
        }
        return staticTextSelectionParams.copy(layoutCoordinates, textLayoutResult);
    }

    @k
    public final StaticTextSelectionParams copy(@l LayoutCoordinates layoutCoordinates, @l TextLayoutResult textLayoutResult) {
        return new StaticTextSelectionParams(layoutCoordinates, textLayoutResult);
    }

    @l
    public final LayoutCoordinates getLayoutCoordinates() {
        return this.layoutCoordinates;
    }

    @l
    public Path getPathForRange(int i11, int i12) {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        if (textLayoutResult != null) {
            return textLayoutResult.getPathForRange(i11, i12);
        }
        return null;
    }

    public boolean getShouldClip() {
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        return (textLayoutResult == null || TextOverflow.m5019equalsimpl0(textLayoutResult.getLayoutInput().m4526getOverflowgIe3tQ8(), TextOverflow.Companion.m5032getVisiblegIe3tQ8()) || !textLayoutResult.getHasVisualOverflow()) ? false : true;
    }

    @l
    public final TextLayoutResult getTextLayoutResult() {
        return this.textLayoutResult;
    }
}
