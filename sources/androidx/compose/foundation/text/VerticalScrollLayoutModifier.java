package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.text.input.TransformedText;
import androidx.compose.ui.unit.Constraints;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class VerticalScrollLayoutModifier implements LayoutModifier {
    private final int cursorOffset;

    @k
    private final TextFieldScrollerPosition scrollerPosition;

    @k
    private final x00.a<TextLayoutResultProxy> textLayoutResultProvider;

    @k
    private final TransformedText transformedText;

    public VerticalScrollLayoutModifier(@k TextFieldScrollerPosition textFieldScrollerPosition, int i11, @k TransformedText transformedText, @k x00.a<TextLayoutResultProxy> aVar) {
        this.scrollerPosition = textFieldScrollerPosition;
        this.cursorOffset = i11;
        this.transformedText = transformedText;
        this.textLayoutResultProvider = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VerticalScrollLayoutModifier copy$default(VerticalScrollLayoutModifier verticalScrollLayoutModifier, TextFieldScrollerPosition textFieldScrollerPosition, int i11, TransformedText transformedText, x00.a aVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            textFieldScrollerPosition = verticalScrollLayoutModifier.scrollerPosition;
        }
        if ((i12 & 2) != 0) {
            i11 = verticalScrollLayoutModifier.cursorOffset;
        }
        if ((i12 & 4) != 0) {
            transformedText = verticalScrollLayoutModifier.transformedText;
        }
        if ((i12 & 8) != 0) {
            aVar = verticalScrollLayoutModifier.textLayoutResultProvider;
        }
        return verticalScrollLayoutModifier.copy(textFieldScrollerPosition, i11, transformedText, aVar);
    }

    @k
    public final TextFieldScrollerPosition component1() {
        return this.scrollerPosition;
    }

    public final int component2() {
        return this.cursorOffset;
    }

    @k
    public final TransformedText component3() {
        return this.transformedText;
    }

    @k
    public final x00.a<TextLayoutResultProxy> component4() {
        return this.textLayoutResultProvider;
    }

    @k
    public final VerticalScrollLayoutModifier copy(@k TextFieldScrollerPosition textFieldScrollerPosition, int i11, @k TransformedText transformedText, @k x00.a<TextLayoutResultProxy> aVar) {
        return new VerticalScrollLayoutModifier(textFieldScrollerPosition, i11, transformedText, aVar);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerticalScrollLayoutModifier)) {
            return false;
        }
        VerticalScrollLayoutModifier verticalScrollLayoutModifier = (VerticalScrollLayoutModifier) obj;
        return g0.g(this.scrollerPosition, verticalScrollLayoutModifier.scrollerPosition) && this.cursorOffset == verticalScrollLayoutModifier.cursorOffset && g0.g(this.transformedText, verticalScrollLayoutModifier.transformedText) && g0.g(this.textLayoutResultProvider, verticalScrollLayoutModifier.textLayoutResultProvider);
    }

    public final int getCursorOffset() {
        return this.cursorOffset;
    }

    @k
    public final TextFieldScrollerPosition getScrollerPosition() {
        return this.scrollerPosition;
    }

    @k
    public final x00.a<TextLayoutResultProxy> getTextLayoutResultProvider() {
        return this.textLayoutResultProvider;
    }

    @k
    public final TransformedText getTransformedText() {
        return this.transformedText;
    }

    public int hashCode() {
        return (((((this.scrollerPosition.hashCode() * 31) + Integer.hashCode(this.cursorOffset)) * 31) + this.transformedText.hashCode()) * 31) + this.textLayoutResultProvider.hashCode();
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    @k
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo646measure3p2s80s(@k final MeasureScope measureScope, @k Measurable measurable, long j11) {
        final Placeable mo3857measureBRTryo0 = measurable.mo3857measureBRTryo0(Constraints.m5058copyZbe2FdA$default(j11, 0, 0, 0, Integer.MAX_VALUE, 7, null));
        final int min = Math.min(mo3857measureBRTryo0.getHeight(), Constraints.m5067getMaxHeightimpl(j11));
        return MeasureScope.layout$default(measureScope, mo3857measureBRTryo0.getWidth(), min, null, new x00.l<Placeable.PlacementScope, g2>() { // from class: androidx.compose.foundation.text.VerticalScrollLayoutModifier$measure$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(Placeable.PlacementScope placementScope) {
                invoke2(placementScope);
                return g2.f100423a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Placeable.PlacementScope placementScope) {
                Rect cursorRectInScroller;
                MeasureScope measureScope2 = MeasureScope.this;
                int cursorOffset = this.getCursorOffset();
                TransformedText transformedText = this.getTransformedText();
                TextLayoutResultProxy invoke = this.getTextLayoutResultProvider().invoke();
                cursorRectInScroller = TextFieldScrollKt.getCursorRectInScroller(measureScope2, cursorOffset, transformedText, invoke != null ? invoke.getValue() : null, false, mo3857measureBRTryo0.getWidth());
                this.getScrollerPosition().update(Orientation.Vertical, cursorRectInScroller, min, mo3857measureBRTryo0.getHeight());
                Placeable.PlacementScope.placeRelative$default(placementScope, mo3857measureBRTryo0, 0, Math.round(-this.getScrollerPosition().getOffset()), 0.0f, 4, null);
            }
        }, 4, null);
    }

    @k
    public String toString() {
        return "VerticalScrollLayoutModifier(scrollerPosition=" + this.scrollerPosition + ", cursorOffset=" + this.cursorOffset + ", transformedText=" + this.transformedText + ", textLayoutResultProvider=" + this.textLayoutResultProvider + ')';
    }
}
