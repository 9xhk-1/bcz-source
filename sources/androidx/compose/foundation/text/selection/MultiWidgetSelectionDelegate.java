package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.selection.Selection;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import g10.u;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nMultiWidgetSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n+ 2 Synchronization.android.kt\nandroidx/compose/foundation/platform/Synchronization_androidKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,366:1\n27#2:367\n32#2,2:368\n59#3:370\n59#3:372\n90#4:371\n90#4:373\n278#5:374\n*S KotlinDebug\n*F\n+ 1 MultiWidgetSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/MultiWidgetSelectionDelegate\n*L\n36#1:367\n52#1:368,2\n59#1:370\n68#1:372\n59#1:371\n68#1:373\n87#1:374\n*E\n"})
/* loaded from: classes.dex */
public final class MultiWidgetSelectionDelegate implements Selectable {
    public static final int $stable = 8;

    @l
    private TextLayoutResult _previousTextLayoutResult;

    @k
    private final x00.a<LayoutCoordinates> coordinatesCallback;

    @k
    private final x00.a<TextLayoutResult> layoutResultCallback;
    private final long selectableId;

    @k
    private final Object lock = this;
    private int _previousLastVisibleOffset = -1;

    /* JADX WARN: Multi-variable type inference failed */
    public MultiWidgetSelectionDelegate(long j11, @k x00.a<? extends LayoutCoordinates> aVar, @k x00.a<TextLayoutResult> aVar2) {
        this.selectableId = j11;
        this.coordinatesCallback = aVar;
        this.layoutResultCallback = aVar2;
    }

    private final int getLastVisibleOffset(TextLayoutResult textLayoutResult) {
        int i11;
        int lineCount;
        synchronized (this.lock) {
            try {
                if (this._previousTextLayoutResult != textLayoutResult) {
                    if (textLayoutResult.getDidOverflowHeight() && !textLayoutResult.getMultiParagraph().getDidExceedMaxLines()) {
                        int B = u.B(textLayoutResult.getLineForVerticalPosition((int) (textLayoutResult.m4530getSizeYbymL2g() & 4294967295L)), textLayoutResult.getLineCount() - 1);
                        while (B >= 0 && textLayoutResult.getLineTop(B) >= ((int) (textLayoutResult.m4530getSizeYbymL2g() & 4294967295L))) {
                            B--;
                        }
                        lineCount = u.u(B, 0);
                        this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                        this._previousTextLayoutResult = textLayoutResult;
                    }
                    lineCount = textLayoutResult.getLineCount() - 1;
                    this._previousLastVisibleOffset = textLayoutResult.getLineEnd(lineCount, true);
                    this._previousTextLayoutResult = textLayoutResult;
                }
                i11 = this._previousLastVisibleOffset;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return i11;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public void appendSelectableInfoToBuilder(@k SelectionLayoutBuilder selectionLayoutBuilder) {
        TextLayoutResult invoke;
        LayoutCoordinates layoutCoordinates = getLayoutCoordinates();
        if (layoutCoordinates == null || (invoke = this.layoutResultCallback.invoke()) == null) {
            return;
        }
        LayoutCoordinates containerCoordinates = selectionLayoutBuilder.getContainerCoordinates();
        Offset.Companion companion = Offset.Companion;
        long mo3866localPositionOfR5De75A = containerCoordinates.mo3866localPositionOfR5De75A(layoutCoordinates, companion.m2284getZeroF1C5BW0());
        MultiWidgetSelectionDelegateKt.m1437appendSelectableInfoParwq6A(selectionLayoutBuilder, invoke, Offset.m2272minusMKHz9U(selectionLayoutBuilder.m1450getCurrentPositionF1C5BW0(), mo3866localPositionOfR5De75A), (selectionLayoutBuilder.m1451getPreviousHandlePositionF1C5BW0() & 9223372034707292159L) == InlineClassHelperKt.UnspecifiedPackedFloats ? companion.m2283getUnspecifiedF1C5BW0() : Offset.m2272minusMKHz9U(selectionLayoutBuilder.m1451getPreviousHandlePositionF1C5BW0(), mo3866localPositionOfR5De75A), getSelectableId());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @k
    public Rect getBoundingBox(int i11) {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return Rect.Companion.getZero();
        }
        int length = invoke.getLayoutInput().getText().length();
        return length < 1 ? Rect.Companion.getZero() : invoke.getBoundingBox(u.I(i11, 0, length - 1));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getCenterYForOffset(int i11) {
        int lineForOffset;
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null || (lineForOffset = invoke.getLineForOffset(i11)) >= invoke.getLineCount()) {
            return -1.0f;
        }
        float lineTop = invoke.getLineTop(lineForOffset);
        return ((invoke.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getHandlePosition-dBAh8RU, reason: not valid java name */
    public long mo1435getHandlePositiondBAh8RU(@k Selection selection, boolean z11) {
        if ((z11 && selection.getStart().getSelectableId() != getSelectableId()) || (!z11 && selection.getEnd().getSelectableId() != getSelectableId())) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        if (getLayoutCoordinates() == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(invoke, u.I((z11 ? selection.getStart() : selection.getEnd()).getOffset(), 0, getLastVisibleOffset(invoke)), z11, selection.getHandlesCrossed());
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @l
    public LayoutCoordinates getLayoutCoordinates() {
        LayoutCoordinates invoke = this.coordinatesCallback.invoke();
        if (invoke == null || !invoke.isAttached()) {
            return null;
        }
        return invoke;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineHeight(int i11) {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke != null) {
            return TextLayoutHelperKt.getLineHeight(invoke, i11);
        }
        return 0.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineLeft(int i11) {
        int lineForOffset;
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke != null && (lineForOffset = invoke.getLineForOffset(i11)) < invoke.getLineCount()) {
            return invoke.getLineLeft(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public float getLineRight(int i11) {
        int lineForOffset;
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke != null && (lineForOffset = invoke.getLineForOffset(i11)) < invoke.getLineCount()) {
            return invoke.getLineRight(lineForOffset);
        }
        return -1.0f;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    /* renamed from: getRangeOfLineContaining--jx7JFs, reason: not valid java name */
    public long mo1436getRangeOfLineContainingjx7JFs(int i11) {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return TextRange.Companion.m4564getZerod9O1mEE();
        }
        int lastVisibleOffset = getLastVisibleOffset(invoke);
        if (lastVisibleOffset < 1) {
            return TextRange.Companion.m4564getZerod9O1mEE();
        }
        int lineForOffset = invoke.getLineForOffset(u.I(i11, 0, lastVisibleOffset - 1));
        return TextRangeKt.TextRange(invoke.getLineStart(lineForOffset), invoke.getLineEnd(lineForOffset, true));
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @l
    public Selection getSelectAllSelection() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return null;
        }
        int length = invoke.getLayoutInput().getText().length();
        return new Selection(new Selection.AnchorInfo(invoke.getBidiRunDirection(0), 0, getSelectableId()), new Selection.AnchorInfo(invoke.getBidiRunDirection(Math.max(length - 1, 0)), length, getSelectableId()), false);
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public long getSelectableId() {
        return this.selectableId;
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @k
    public AnnotatedString getText() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        return invoke == null ? new AnnotatedString("", null, 2, null) : invoke.getLayoutInput().getText();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    @l
    public TextLayoutResult textLayoutResult() {
        return this.layoutResultCallback.invoke();
    }

    @Override // androidx.compose.foundation.text.selection.Selectable
    public int getLastVisibleOffset() {
        TextLayoutResult invoke = this.layoutResultCallback.invoke();
        if (invoke == null) {
            return 0;
        }
        return getLastVisibleOffset(invoke);
    }
}
