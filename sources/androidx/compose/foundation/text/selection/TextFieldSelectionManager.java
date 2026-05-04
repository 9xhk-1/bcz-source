package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextDelegate;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.foundation.text.TextFieldCursor_androidKt;
import androidx.compose.foundation.text.TextLayoutHelperKt;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.UndoManager;
import androidx.compose.foundation.text.ValidatingOffsetMappingKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.hapticfeedback.HapticFeedback;
import androidx.compose.ui.hapticfeedback.HapticFeedbackType;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.platform.Clipboard;
import androidx.compose.ui.platform.TextToolbar;
import androidx.compose.ui.platform.TextToolbarStatus;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import c40.l2;
import c40.r0;
import g10.u;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CoroutineStart;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextFieldSelectionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 8 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1123:1\n85#2:1124\n113#2,2:1125\n85#2:1127\n113#2,2:1128\n85#2:1130\n113#2,2:1131\n85#2:1133\n113#2,2:1134\n85#2:1136\n113#2,2:1137\n1#3:1139\n30#4:1140\n30#4:1144\n30#4:1151\n53#5,3:1141\n53#5,3:1145\n70#5:1149\n53#5,3:1152\n70#5:1156\n60#5:1159\n60#5:1162\n70#5:1165\n69#6:1148\n69#6:1155\n65#6:1158\n65#6:1161\n69#6:1164\n22#7:1150\n22#7:1157\n22#7:1160\n22#7:1163\n22#7:1166\n113#8:1167\n*S KotlinDebug\n*F\n+ 1 TextFieldSelectionManager.kt\nandroidx/compose/foundation/text/selection/TextFieldSelectionManager\n*L\n87#1:1124\n87#1:1125,2\n121#1:1127\n121#1:1128,2\n124#1:1130\n124#1:1131,2\n152#1:1133\n152#1:1134,2\n156#1:1136\n156#1:1137,2\n739#1:1140\n869#1:1144\n879#1:1151\n739#1:1141,3\n869#1:1145,3\n874#1:1149\n879#1:1152,3\n884#1:1156\n886#1:1159\n887#1:1162\n890#1:1165\n874#1:1148\n884#1:1155\n886#1:1158\n887#1:1161\n890#1:1164\n874#1:1150\n884#1:1157\n886#1:1160\n887#1:1163\n890#1:1166\n890#1:1167\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldSelectionManager {
    public static final int $stable = 8;

    @l
    private Clipboard clipboard;

    @l
    private r0 coroutineScope;

    @k
    private final MutableState currentDragPosition$delegate;

    @l
    private Integer dragBeginOffsetInText;
    private long dragBeginPosition;
    private long dragTotalDistance;

    @k
    private final MutableState draggingHandle$delegate;

    @k
    private final MutableState editable$delegate;

    @k
    private final MutableState enabled$delegate;

    @l
    private FocusRequester focusRequester;

    @l
    private HapticFeedback hapticFeedBack;

    @k
    private final MouseSelectionObserver mouseSelectionObserver;

    @k
    private OffsetMapping offsetMapping;

    @k
    private TextFieldValue oldValue;

    @k
    private x00.l<? super TextFieldValue, g2> onValueChange;
    private int previousRawDragOffset;

    @l
    private SelectionLayout previousSelectionLayout;

    @l
    private x00.a<g2> requestAutofillAction;

    @l
    private LegacyTextFieldState state;

    @l
    private TextToolbar textToolbar;

    @k
    private final TextDragObserver touchSelectionObserver;

    @l
    private final UndoManager undoManager;

    @k
    private final MutableState value$delegate;

    @k
    private VisualTransformation visualTransformation;

    /* JADX WARN: Multi-variable type inference failed */
    public TextFieldSelectionManager() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ l2 copy$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        return textFieldSelectionManager.copy$foundation_release(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: createTextFieldValue-FDrldGo, reason: not valid java name */
    public final TextFieldValue m1499createTextFieldValueFDrldGo(AnnotatedString annotatedString, long j11) {
        return new TextFieldValue(annotatedString, j11, (TextRange) null, 4, (v) null);
    }

    /* renamed from: deselect-_kEHs6E$foundation_release$default, reason: not valid java name */
    public static /* synthetic */ void m1500deselect_kEHs6E$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, Offset offset, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            offset = null;
        }
        textFieldSelectionManager.m1503deselect_kEHs6E$foundation_release(offset);
    }

    public static /* synthetic */ void enterSelectionMode$foundation_release$default(TextFieldSelectionManager textFieldSelectionManager, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = true;
        }
        textFieldSelectionManager.enterSelectionMode$foundation_release(z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect getContentRect() {
        char c11;
        long j11;
        float f11;
        LayoutCoordinates layoutCoordinates;
        TextLayoutResult value;
        Rect cursorRect;
        LayoutCoordinates layoutCoordinates2;
        TextLayoutResult value2;
        Rect cursorRect2;
        LayoutCoordinates layoutCoordinates3;
        LayoutCoordinates layoutCoordinates4;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.isLayoutResultStale()) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m4559getStartimpl(getValue$foundation_release().m4807getSelectiond9O1mEE()));
                int originalToTransformed2 = this.offsetMapping.originalToTransformed(TextRange.m4554getEndimpl(getValue$foundation_release().m4807getSelectiond9O1mEE()));
                LegacyTextFieldState legacyTextFieldState2 = this.state;
                long m2284getZeroF1C5BW0 = (legacyTextFieldState2 == null || (layoutCoordinates4 = legacyTextFieldState2.getLayoutCoordinates()) == null) ? Offset.Companion.m2284getZeroF1C5BW0() : layoutCoordinates4.mo3868localToRootMKHz9U(m1506getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState legacyTextFieldState3 = this.state;
                long m2284getZeroF1C5BW02 = (legacyTextFieldState3 == null || (layoutCoordinates3 = legacyTextFieldState3.getLayoutCoordinates()) == null) ? Offset.Companion.m2284getZeroF1C5BW0() : layoutCoordinates3.mo3868localToRootMKHz9U(m1506getHandlePositiontuRUvjQ$foundation_release(false));
                LegacyTextFieldState legacyTextFieldState4 = this.state;
                float f12 = 0.0f;
                if (legacyTextFieldState4 == null || (layoutCoordinates2 = legacyTextFieldState4.getLayoutCoordinates()) == null) {
                    c11 = ' ';
                    j11 = 4294967295L;
                    f11 = 0.0f;
                } else {
                    TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
                    c11 = ' ';
                    j11 = 4294967295L;
                    f11 = Float.intBitsToFloat((int) (layoutCoordinates2.mo3868localToRootMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits((layoutResult == null || (value2 = layoutResult.getValue()) == null || (cursorRect2 = value2.getCursorRect(originalToTransformed)) == null) ? 0.0f : cursorRect2.getTop()) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32))) & 4294967295L));
                }
                LegacyTextFieldState legacyTextFieldState5 = this.state;
                if (legacyTextFieldState5 != null && (layoutCoordinates = legacyTextFieldState5.getLayoutCoordinates()) != null) {
                    TextLayoutResultProxy layoutResult2 = legacyTextFieldState.getLayoutResult();
                    f12 = Float.intBitsToFloat((int) (layoutCoordinates.mo3868localToRootMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << c11) | (Float.floatToRawIntBits((layoutResult2 == null || (value = layoutResult2.getValue()) == null || (cursorRect = value.getCursorRect(originalToTransformed2)) == null) ? 0.0f : cursorRect.getTop()) & j11))) & j11));
                }
                int i11 = (int) (m2284getZeroF1C5BW0 >> c11);
                int i12 = (int) (m2284getZeroF1C5BW02 >> c11);
                return new Rect(Math.min(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.min(f11, f12), Math.max(Float.intBitsToFloat(i11), Float.intBitsToFloat(i12)), Math.max(Float.intBitsToFloat((int) (m2284getZeroF1C5BW0 & j11)), Float.intBitsToFloat((int) (m2284getZeroF1C5BW02 & j11))) + (Dp.m5115constructorimpl(25) * legacyTextFieldState.getTextDelegate().getDensity().getDensity()));
            }
        }
        return Rect.Companion.getZero();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: setCurrentDragPosition-_kEHs6E, reason: not valid java name */
    public final void m1501setCurrentDragPosition_kEHs6E(Offset offset) {
        this.currentDragPosition$delegate.setValue(offset);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setDraggingHandle(Handle handle) {
        this.draggingHandle$delegate.setValue(handle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHandleState(HandleState handleState) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            if (legacyTextFieldState.getHandleState() == handleState) {
                legacyTextFieldState = null;
            }
            if (legacyTextFieldState != null) {
                legacyTextFieldState.setHandleState(handleState);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void updateFloatingToolbar(boolean z11) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.setShowFloatingToolbar(z11);
        }
        if (z11) {
            showSelectionToolbar$foundation_release();
        } else {
            hideSelectionToolbar$foundation_release();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: updateSelection-8UEBfa8, reason: not valid java name */
    public final long m1502updateSelection8UEBfa8(TextFieldValue textFieldValue, long j11, boolean z11, boolean z12, SelectionAdjustment selectionAdjustment, boolean z13) {
        TextLayoutResultProxy layoutResult;
        int i11;
        HapticFeedback hapticFeedback;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null) {
            return TextRange.Companion.m4564getZerod9O1mEE();
        }
        long TextRange = TextRangeKt.TextRange(this.offsetMapping.originalToTransformed(TextRange.m4559getStartimpl(textFieldValue.m4807getSelectiond9O1mEE())), this.offsetMapping.originalToTransformed(TextRange.m4554getEndimpl(textFieldValue.m4807getSelectiond9O1mEE())));
        boolean z14 = false;
        int m1166getOffsetForPosition3MmeM6k = layoutResult.m1166getOffsetForPosition3MmeM6k(j11, false);
        int m4559getStartimpl = (z12 || z11) ? m1166getOffsetForPosition3MmeM6k : TextRange.m4559getStartimpl(TextRange);
        int m4554getEndimpl = (!z12 || z11) ? m1166getOffsetForPosition3MmeM6k : TextRange.m4554getEndimpl(TextRange);
        SelectionLayout selectionLayout = this.previousSelectionLayout;
        if (z11 || selectionLayout == null || (i11 = this.previousRawDragOffset) == -1) {
            i11 = -1;
        }
        SelectionLayout m1452getTextFieldSelectionLayoutRcvTLA = SelectionLayoutKt.m1452getTextFieldSelectionLayoutRcvTLA(layoutResult.getValue(), m4559getStartimpl, m4554getEndimpl, i11, TextRange, z11, z12);
        if (!m1452getTextFieldSelectionLayoutRcvTLA.shouldRecomputeSelection(selectionLayout)) {
            return textFieldValue.m4807getSelectiond9O1mEE();
        }
        this.previousSelectionLayout = m1452getTextFieldSelectionLayoutRcvTLA;
        this.previousRawDragOffset = m1166getOffsetForPosition3MmeM6k;
        Selection adjust = selectionAdjustment.adjust(m1452getTextFieldSelectionLayoutRcvTLA);
        long TextRange2 = TextRangeKt.TextRange(this.offsetMapping.transformedToOriginal(adjust.getStart().getOffset()), this.offsetMapping.transformedToOriginal(adjust.getEnd().getOffset()));
        if (TextRange.m4552equalsimpl0(TextRange2, textFieldValue.m4807getSelectiond9O1mEE())) {
            return textFieldValue.m4807getSelectiond9O1mEE();
        }
        boolean z15 = TextRange.m4558getReversedimpl(TextRange2) != TextRange.m4558getReversedimpl(textFieldValue.m4807getSelectiond9O1mEE()) && TextRange.m4552equalsimpl0(TextRangeKt.TextRange(TextRange.m4554getEndimpl(TextRange2), TextRange.m4559getStartimpl(TextRange2)), textFieldValue.m4807getSelectiond9O1mEE());
        boolean z16 = TextRange.m4553getCollapsedimpl(TextRange2) && TextRange.m4553getCollapsedimpl(textFieldValue.m4807getSelectiond9O1mEE());
        if (z13 && textFieldValue.getText().length() > 0 && !z15 && !z16 && (hapticFeedback = this.hapticFeedBack) != null) {
            hapticFeedback.mo3231performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3247getTextHandleMove5zf0vsI());
        }
        this.onValueChange.invoke(m1499createTextFieldValueFDrldGo(textFieldValue.getAnnotatedString(), TextRange2));
        if (!z13) {
            updateFloatingToolbar(!TextRange.m4553getCollapsedimpl(TextRange2));
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.setInTouchMode(z13);
        }
        LegacyTextFieldState legacyTextFieldState3 = this.state;
        if (legacyTextFieldState3 != null) {
            legacyTextFieldState3.setShowSelectionHandleStart(!TextRange.m4553getCollapsedimpl(TextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true));
        }
        LegacyTextFieldState legacyTextFieldState4 = this.state;
        if (legacyTextFieldState4 != null) {
            legacyTextFieldState4.setShowSelectionHandleEnd(!TextRange.m4553getCollapsedimpl(TextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, false));
        }
        LegacyTextFieldState legacyTextFieldState5 = this.state;
        if (legacyTextFieldState5 == null) {
            return TextRange2;
        }
        if (TextRange.m4553getCollapsedimpl(TextRange2) && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(this, true)) {
            z14 = true;
        }
        legacyTextFieldState5.setShowCursorHandle(z14);
        return TextRange2;
    }

    public final void autofill$foundation_release() {
        x00.a<g2> aVar = this.requestAutofillAction;
        if (aVar != null) {
            aVar.invoke();
        }
    }

    public final void clearPreviewHighlight$foundation_release() {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1073setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m4564getZerod9O1mEE());
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 == null) {
            return;
        }
        legacyTextFieldState2.m1076setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m4564getZerod9O1mEE());
    }

    @l
    public final l2 copy$foundation_release(boolean z11) {
        l2 f11;
        r0 r0Var = this.coroutineScope;
        if (r0Var == null) {
            return null;
        }
        f11 = c40.k.f(r0Var, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$copy$1(this, z11, null), 1, null);
        return f11;
    }

    @k
    public final TextDragObserver cursorDragObserver$foundation_release() {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$cursorDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1133onDragk4lQ0M(long j11) {
                long j12;
                TextLayoutResultProxy layoutResult;
                long j13;
                long j14;
                HapticFeedback hapticFeedBack;
                TextFieldValue m1499createTextFieldValueFDrldGo;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j12 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m2273plusMKHz9U(j12, j11);
                LegacyTextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j13 = textFieldSelectionManager2.dragBeginPosition;
                j14 = textFieldSelectionManager2.dragTotalDistance;
                textFieldSelectionManager2.m1501setCurrentDragPosition_kEHs6E(Offset.m2257boximpl(Offset.m2273plusMKHz9U(j13, j14)));
                OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                Offset m1504getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1504getCurrentDragPosition_m7T9E();
                g0.m(m1504getCurrentDragPosition_m7T9E);
                int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(TextLayoutResultProxy.m1165getOffsetForPosition3MmeM6k$default(layoutResult, m1504getCurrentDragPosition_m7T9E.m2278unboximpl(), false, 2, null));
                long TextRange = TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal);
                if (TextRange.m4552equalsimpl0(TextRange, textFieldSelectionManager2.getValue$foundation_release().m4807getSelectiond9O1mEE())) {
                    return;
                }
                LegacyTextFieldState state$foundation_release2 = textFieldSelectionManager2.getState$foundation_release();
                if ((state$foundation_release2 == null || state$foundation_release2.isInTouchMode()) && (hapticFeedBack = textFieldSelectionManager2.getHapticFeedBack()) != null) {
                    hapticFeedBack.mo3231performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3247getTextHandleMove5zf0vsI());
                }
                x00.l<TextFieldValue, g2> onValueChange$foundation_release = textFieldSelectionManager2.getOnValueChange$foundation_release();
                m1499createTextFieldValueFDrldGo = textFieldSelectionManager2.m1499createTextFieldValueFDrldGo(textFieldSelectionManager2.getValue$foundation_release().getAnnotatedString(), TextRange);
                onValueChange$foundation_release.invoke(m1499createTextFieldValueFDrldGo);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1134onStartk4lQ0M(long j11) {
                TextLayoutResultProxy layoutResult;
                long m1449getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1449getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m1506getHandlePositiontuRUvjQ$foundation_release(true));
                LegacyTextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                long m1169translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1169translateInnerToDecorationCoordinatesMKHz9U$foundation_release(m1449getAdjustedCoordinatesk4lQ0M);
                TextFieldSelectionManager.this.dragBeginPosition = m1169translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                TextFieldSelectionManager.this.m1501setCurrentDragPosition_kEHs6E(Offset.m2257boximpl(m1169translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m2284getZeroF1C5BW0();
                TextFieldSelectionManager.this.setDraggingHandle(Handle.Cursor);
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1501setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1501setCurrentDragPosition_kEHs6E(null);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1132onDownk4lQ0M(long j11) {
            }
        };
    }

    @l
    public final l2 cut$foundation_release() {
        l2 f11;
        r0 r0Var = this.coroutineScope;
        if (r0Var == null) {
            return null;
        }
        f11 = c40.k.f(r0Var, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$cut$1(this, null), 1, null);
        return f11;
    }

    /* renamed from: deselect-_kEHs6E$foundation_release, reason: not valid java name */
    public final void m1503deselect_kEHs6E$foundation_release(@l Offset offset) {
        if (!TextRange.m4553getCollapsedimpl(getValue$foundation_release().m4807getSelectiond9O1mEE())) {
            LegacyTextFieldState legacyTextFieldState = this.state;
            TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
            this.onValueChange.invoke(TextFieldValue.m4802copy3r_uNRQ$default(getValue$foundation_release(), (AnnotatedString) null, TextRangeKt.TextRange((offset == null || layoutResult == null) ? TextRange.m4556getMaximpl(getValue$foundation_release().m4807getSelectiond9O1mEE()) : this.offsetMapping.transformedToOriginal(TextLayoutResultProxy.m1165getOffsetForPosition3MmeM6k$default(layoutResult, offset.m2278unboximpl(), false, 2, null))), (TextRange) null, 5, (Object) null));
        }
        setHandleState((offset == null || getValue$foundation_release().getText().length() <= 0) ? HandleState.None : HandleState.Cursor);
        updateFloatingToolbar(false);
    }

    public final void enterSelectionMode$foundation_release(boolean z11) {
        FocusRequester focusRequester;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null && !legacyTextFieldState.getHasFocus() && (focusRequester = this.focusRequester) != null) {
            FocusRequester.m2179requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
        }
        this.oldValue = getValue$foundation_release();
        updateFloatingToolbar(z11);
        setHandleState(HandleState.Selection);
    }

    public final void exitSelectionMode$foundation_release() {
        updateFloatingToolbar(false);
        setHandleState(HandleState.None);
    }

    @l
    public final Clipboard getClipboard$foundation_release() {
        return this.clipboard;
    }

    @l
    public final r0 getCoroutineScope$foundation_release() {
        return this.coroutineScope;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    /* renamed from: getCurrentDragPosition-_m7T9-E, reason: not valid java name */
    public final Offset m1504getCurrentDragPosition_m7T9E() {
        return (Offset) this.currentDragPosition$delegate.getValue();
    }

    /* renamed from: getCursorPosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1505getCursorPositiontuRUvjQ$foundation_release(@k Density density) {
        int originalToTransformed = this.offsetMapping.originalToTransformed(TextRange.m4559getStartimpl(getValue$foundation_release().m4807getSelectiond9O1mEE()));
        LegacyTextFieldState legacyTextFieldState = this.state;
        TextLayoutResultProxy layoutResult = legacyTextFieldState != null ? legacyTextFieldState.getLayoutResult() : null;
        g0.m(layoutResult);
        TextLayoutResult value = layoutResult.getValue();
        Rect cursorRect = value.getCursorRect(u.I(originalToTransformed, 0, value.getLayoutInput().getText().length()));
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(cursorRect.getLeft() + (density.mo377toPx0680j_4(TextFieldCursor_androidKt.getDefaultCursorThickness()) / 2)) << 32) | (Float.floatToRawIntBits(cursorRect.getBottom()) & 4294967295L));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @l
    public final Handle getDraggingHandle() {
        return (Handle) this.draggingHandle$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEditable() {
        return ((Boolean) this.editable$delegate.getValue()).booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean getEnabled() {
        return ((Boolean) this.enabled$delegate.getValue()).booleanValue();
    }

    @l
    public final FocusRequester getFocusRequester() {
        return this.focusRequester;
    }

    public final float getHandleLineHeight$foundation_release(boolean z11) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        int m4559getStartimpl = z11 ? TextRange.m4559getStartimpl(getValue$foundation_release().m4807getSelectiond9O1mEE()) : TextRange.m4554getEndimpl(getValue$foundation_release().m4807getSelectiond9O1mEE());
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return 0.0f;
        }
        return TextLayoutHelperKt.getLineHeight(value, m4559getStartimpl);
    }

    /* renamed from: getHandlePosition-tuRUvjQ$foundation_release, reason: not valid java name */
    public final long m1506getHandlePositiontuRUvjQ$foundation_release(boolean z11) {
        TextLayoutResultProxy layoutResult;
        TextLayoutResult value;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || (value = layoutResult.getValue()) == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        AnnotatedString transformedText$foundation_release = getTransformedText$foundation_release();
        if (transformedText$foundation_release == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        if (!g0.g(transformedText$foundation_release.getText(), value.getLayoutInput().getText().getText())) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        long m4807getSelectiond9O1mEE = getValue$foundation_release().m4807getSelectiond9O1mEE();
        return TextSelectionDelegateKt.getSelectionHandleCoordinates(value, this.offsetMapping.originalToTransformed(z11 ? TextRange.m4559getStartimpl(m4807getSelectiond9O1mEE) : TextRange.m4554getEndimpl(m4807getSelectiond9O1mEE)), z11, TextRange.m4558getReversedimpl(getValue$foundation_release().m4807getSelectiond9O1mEE()));
    }

    @l
    public final HapticFeedback getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    @k
    public final MouseSelectionObserver getMouseSelectionObserver$foundation_release() {
        return this.mouseSelectionObserver;
    }

    @k
    public final OffsetMapping getOffsetMapping$foundation_release() {
        return this.offsetMapping;
    }

    @k
    public final x00.l<TextFieldValue, g2> getOnValueChange$foundation_release() {
        return this.onValueChange;
    }

    @l
    public final x00.a<g2> getRequestAutofillAction$foundation_release() {
        return this.requestAutofillAction;
    }

    @l
    public final LegacyTextFieldState getState$foundation_release() {
        return this.state;
    }

    @l
    public final TextToolbar getTextToolbar() {
        return this.textToolbar;
    }

    @k
    public final TextDragObserver getTouchSelectionObserver$foundation_release() {
        return this.touchSelectionObserver;
    }

    @l
    public final AnnotatedString getTransformedText$foundation_release() {
        TextDelegate textDelegate;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (textDelegate = legacyTextFieldState.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    @l
    public final UndoManager getUndoManager() {
        return this.undoManager;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public final TextFieldValue getValue$foundation_release() {
        return (TextFieldValue) this.value$delegate.getValue();
    }

    @k
    public final VisualTransformation getVisualTransformation$foundation_release() {
        return this.visualTransformation;
    }

    @k
    public final TextDragObserver handleDragObserver$foundation_release(final boolean z11) {
        return new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$handleDragObserver$1
            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1132onDownk4lQ0M(long j11) {
                TextLayoutResultProxy layoutResult;
                TextFieldSelectionManager.this.setDraggingHandle(z11 ? Handle.SelectionStart : Handle.SelectionEnd);
                long m1449getAdjustedCoordinatesk4lQ0M = SelectionHandlesKt.m1449getAdjustedCoordinatesk4lQ0M(TextFieldSelectionManager.this.m1506getHandlePositiontuRUvjQ$foundation_release(z11));
                LegacyTextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || (layoutResult = state$foundation_release.getLayoutResult()) == null) {
                    return;
                }
                long m1169translateInnerToDecorationCoordinatesMKHz9U$foundation_release = layoutResult.m1169translateInnerToDecorationCoordinatesMKHz9U$foundation_release(m1449getAdjustedCoordinatesk4lQ0M);
                TextFieldSelectionManager.this.dragBeginPosition = m1169translateInnerToDecorationCoordinatesMKHz9U$foundation_release;
                TextFieldSelectionManager.this.m1501setCurrentDragPosition_kEHs6E(Offset.m2257boximpl(m1169translateInnerToDecorationCoordinatesMKHz9U$foundation_release));
                TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m2284getZeroF1C5BW0();
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                LegacyTextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setInTouchMode(true);
                }
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1133onDragk4lQ0M(long j11) {
                long j12;
                long j13;
                long j14;
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j12 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m2273plusMKHz9U(j12, j11);
                TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                j13 = textFieldSelectionManager2.dragBeginPosition;
                j14 = TextFieldSelectionManager.this.dragTotalDistance;
                textFieldSelectionManager2.m1501setCurrentDragPosition_kEHs6E(Offset.m2257boximpl(Offset.m2273plusMKHz9U(j13, j14)));
                TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                TextFieldValue value$foundation_release = textFieldSelectionManager3.getValue$foundation_release();
                Offset m1504getCurrentDragPosition_m7T9E = TextFieldSelectionManager.this.m1504getCurrentDragPosition_m7T9E();
                g0.m(m1504getCurrentDragPosition_m7T9E);
                textFieldSelectionManager3.m1502updateSelection8UEBfa8(value$foundation_release, m1504getCurrentDragPosition_m7T9E.m2278unboximpl(), false, z11, SelectionAdjustment.Companion.getCharacterWithWordAccelerate(), true);
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1501setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1501setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1134onStartk4lQ0M(long j11) {
            }
        };
    }

    public final void hideSelectionToolbar$foundation_release() {
        TextToolbar textToolbar;
        TextToolbar textToolbar2 = this.textToolbar;
        if ((textToolbar2 != null ? textToolbar2.getStatus() : null) != TextToolbarStatus.Shown || (textToolbar = this.textToolbar) == null) {
            return;
        }
        textToolbar.hide();
    }

    public final boolean isTextChanged$foundation_release() {
        return !g0.g(this.oldValue.getText(), getValue$foundation_release().getText());
    }

    @l
    public final l2 paste$foundation_release() {
        l2 f11;
        r0 r0Var = this.coroutineScope;
        if (r0Var == null) {
            return null;
        }
        f11 = c40.k.f(r0Var, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$paste$1(this, null), 1, null);
        return f11;
    }

    public final void selectAll$foundation_release() {
        TextFieldValue m1499createTextFieldValueFDrldGo = m1499createTextFieldValueFDrldGo(getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(0, getValue$foundation_release().getText().length()));
        this.onValueChange.invoke(m1499createTextFieldValueFDrldGo);
        this.oldValue = TextFieldValue.m4802copy3r_uNRQ$default(this.oldValue, (AnnotatedString) null, m1499createTextFieldValueFDrldGo.m4807getSelectiond9O1mEE(), (TextRange) null, 5, (Object) null);
        enterSelectionMode$foundation_release(true);
    }

    /* renamed from: selectWordAtPositionIfNotAlreadySelected-k-4lQ0M, reason: not valid java name */
    public final void m1507selectWordAtPositionIfNotAlreadySelectedk4lQ0M(long j11) {
        TextLayoutResultProxy layoutResult;
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState == null || (layoutResult = legacyTextFieldState.getLayoutResult()) == null || TextLayoutHelperKt.m1163isPositionInsideSelectionuaM50fQ(layoutResult.getValue(), layoutResult.m1168translateDecorationToInnerCoordinatesMKHz9U$foundation_release(j11), TextRange.m4547boximpl(getValue$foundation_release().m4807getSelectiond9O1mEE()))) {
            return;
        }
        m1502updateSelection8UEBfa8(getValue$foundation_release(), j11, true, false, SelectionAdjustment.Companion.getWord(), false);
    }

    public final void setClipboard$foundation_release(@l Clipboard clipboard) {
        this.clipboard = clipboard;
    }

    public final void setCoroutineScope$foundation_release(@l r0 r0Var) {
        this.coroutineScope = r0Var;
    }

    /* renamed from: setDeletionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1508setDeletionPreviewHighlight5zctL8$foundation_release(long j11) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1073setDeletionPreviewHighlightRange5zctL8(j11);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1076setSelectionPreviewHighlightRange5zctL8(TextRange.Companion.m4564getZerod9O1mEE());
        }
        if (TextRange.m4553getCollapsedimpl(j11)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setEditable(boolean z11) {
        this.editable$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setEnabled(boolean z11) {
        this.enabled$delegate.setValue(Boolean.valueOf(z11));
    }

    public final void setFocusRequester(@l FocusRequester focusRequester) {
        this.focusRequester = focusRequester;
    }

    public final void setHapticFeedBack(@l HapticFeedback hapticFeedback) {
        this.hapticFeedBack = hapticFeedback;
    }

    public final void setOffsetMapping$foundation_release(@k OffsetMapping offsetMapping) {
        this.offsetMapping = offsetMapping;
    }

    public final void setOnValueChange$foundation_release(@k x00.l<? super TextFieldValue, g2> lVar) {
        this.onValueChange = lVar;
    }

    public final void setRequestAutofillAction$foundation_release(@l x00.a<g2> aVar) {
        this.requestAutofillAction = aVar;
    }

    /* renamed from: setSelectionPreviewHighlight-5zc-tL8$foundation_release, reason: not valid java name */
    public final void m1509setSelectionPreviewHighlight5zctL8$foundation_release(long j11) {
        LegacyTextFieldState legacyTextFieldState = this.state;
        if (legacyTextFieldState != null) {
            legacyTextFieldState.m1076setSelectionPreviewHighlightRange5zctL8(j11);
        }
        LegacyTextFieldState legacyTextFieldState2 = this.state;
        if (legacyTextFieldState2 != null) {
            legacyTextFieldState2.m1073setDeletionPreviewHighlightRange5zctL8(TextRange.Companion.m4564getZerod9O1mEE());
        }
        if (TextRange.m4553getCollapsedimpl(j11)) {
            return;
        }
        exitSelectionMode$foundation_release();
    }

    public final void setState$foundation_release(@l LegacyTextFieldState legacyTextFieldState) {
        this.state = legacyTextFieldState;
    }

    public final void setTextToolbar(@l TextToolbar textToolbar) {
        this.textToolbar = textToolbar;
    }

    public final void setValue$foundation_release(@k TextFieldValue textFieldValue) {
        this.value$delegate.setValue(textFieldValue);
    }

    public final void setVisualTransformation$foundation_release(@k VisualTransformation visualTransformation) {
        this.visualTransformation = visualTransformation;
    }

    @l
    public final l2 showSelectionToolbar$foundation_release() {
        l2 f11;
        r0 r0Var = this.coroutineScope;
        if (r0Var == null) {
            return null;
        }
        f11 = c40.k.f(r0Var, null, CoroutineStart.UNDISPATCHED, new TextFieldSelectionManager$showSelectionToolbar$1(this, null), 1, null);
        return f11;
    }

    public TextFieldSelectionManager(@l UndoManager undoManager) {
        this.undoManager = undoManager;
        this.offsetMapping = ValidatingOffsetMappingKt.getValidatingEmptyOffsetMappingIdentity();
        this.onValueChange = new x00.l<TextFieldValue, g2>() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$onValueChange$1
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(TextFieldValue textFieldValue) {
            }

            @Override // x00.l
            public /* bridge */ /* synthetic */ g2 invoke(TextFieldValue textFieldValue) {
                invoke2(textFieldValue);
                return g2.f100423a;
            }
        };
        this.value$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(new TextFieldValue((String) null, 0L, (TextRange) null, 7, (v) null), null, 2, null);
        this.visualTransformation = VisualTransformation.Companion.getNone();
        Boolean bool = Boolean.TRUE;
        this.editable$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        this.enabled$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(bool, null, 2, null);
        Offset.Companion companion = Offset.Companion;
        this.dragBeginPosition = companion.m2284getZeroF1C5BW0();
        this.dragTotalDistance = companion.m2284getZeroF1C5BW0();
        this.draggingHandle$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.currentDragPosition$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (TextRange) null, 7, (v) null);
        this.touchSelectionObserver = new TextDragObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$touchSelectionObserver$1
            private final void onEnd() {
                TextFieldSelectionManager.this.setDraggingHandle(null);
                TextFieldSelectionManager.this.m1501setCurrentDragPosition_kEHs6E(null);
                TextFieldSelectionManager.this.updateFloatingToolbar(true);
                TextFieldSelectionManager.this.dragBeginOffsetInText = null;
                boolean m4553getCollapsedimpl = TextRange.m4553getCollapsedimpl(TextFieldSelectionManager.this.getValue$foundation_release().m4807getSelectiond9O1mEE());
                TextFieldSelectionManager.this.setHandleState(m4553getCollapsedimpl ? HandleState.Cursor : HandleState.Selection);
                LegacyTextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null) {
                    state$foundation_release.setShowSelectionHandleStart(!m4553getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(TextFieldSelectionManager.this, true));
                }
                LegacyTextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release2 != null) {
                    state$foundation_release2.setShowSelectionHandleEnd(!m4553getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(TextFieldSelectionManager.this, false));
                }
                LegacyTextFieldState state$foundation_release3 = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release3 == null) {
                    return;
                }
                state$foundation_release3.setShowCursorHandle(m4553getCollapsedimpl && TextFieldSelectionManagerKt.isSelectionHandleInVisibleBound(TextFieldSelectionManager.this, true));
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onCancel() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDrag-k-4lQ0M */
            public void mo1133onDragk4lQ0M(long j11) {
                long j12;
                TextLayoutResultProxy layoutResult;
                long j13;
                long j14;
                Integer num;
                Integer num2;
                long j15;
                int m1166getOffsetForPosition3MmeM6k;
                Integer num3;
                long m1502updateSelection8UEBfa8;
                long j16;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                    return;
                }
                TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                j12 = textFieldSelectionManager.dragTotalDistance;
                textFieldSelectionManager.dragTotalDistance = Offset.m2273plusMKHz9U(j12, j11);
                LegacyTextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release != null && (layoutResult = state$foundation_release.getLayoutResult()) != null) {
                    TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                    j13 = textFieldSelectionManager2.dragBeginPosition;
                    j14 = textFieldSelectionManager2.dragTotalDistance;
                    textFieldSelectionManager2.m1501setCurrentDragPosition_kEHs6E(Offset.m2257boximpl(Offset.m2273plusMKHz9U(j13, j14)));
                    num = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num == null) {
                        Offset m1504getCurrentDragPosition_m7T9E = textFieldSelectionManager2.m1504getCurrentDragPosition_m7T9E();
                        g0.m(m1504getCurrentDragPosition_m7T9E);
                        if (!layoutResult.m1167isPositionOnTextk4lQ0M(m1504getCurrentDragPosition_m7T9E.m2278unboximpl())) {
                            OffsetMapping offsetMapping$foundation_release = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                            j16 = textFieldSelectionManager2.dragBeginPosition;
                            int transformedToOriginal = offsetMapping$foundation_release.transformedToOriginal(TextLayoutResultProxy.m1165getOffsetForPosition3MmeM6k$default(layoutResult, j16, false, 2, null));
                            OffsetMapping offsetMapping$foundation_release2 = textFieldSelectionManager2.getOffsetMapping$foundation_release();
                            Offset m1504getCurrentDragPosition_m7T9E2 = textFieldSelectionManager2.m1504getCurrentDragPosition_m7T9E();
                            g0.m(m1504getCurrentDragPosition_m7T9E2);
                            SelectionAdjustment none = transformedToOriginal == offsetMapping$foundation_release2.transformedToOriginal(TextLayoutResultProxy.m1165getOffsetForPosition3MmeM6k$default(layoutResult, m1504getCurrentDragPosition_m7T9E2.m2278unboximpl(), false, 2, null)) ? SelectionAdjustment.Companion.getNone() : SelectionAdjustment.Companion.getWord();
                            TextFieldValue value$foundation_release = textFieldSelectionManager2.getValue$foundation_release();
                            Offset m1504getCurrentDragPosition_m7T9E3 = textFieldSelectionManager2.m1504getCurrentDragPosition_m7T9E();
                            g0.m(m1504getCurrentDragPosition_m7T9E3);
                            m1502updateSelection8UEBfa8 = textFieldSelectionManager2.m1502updateSelection8UEBfa8(value$foundation_release, m1504getCurrentDragPosition_m7T9E3.m2278unboximpl(), false, false, none, true);
                            TextRange.m4547boximpl(m1502updateSelection8UEBfa8);
                        }
                    }
                    num2 = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num2 != null) {
                        m1166getOffsetForPosition3MmeM6k = num2.intValue();
                    } else {
                        j15 = textFieldSelectionManager2.dragBeginPosition;
                        m1166getOffsetForPosition3MmeM6k = layoutResult.m1166getOffsetForPosition3MmeM6k(j15, false);
                    }
                    Offset m1504getCurrentDragPosition_m7T9E4 = textFieldSelectionManager2.m1504getCurrentDragPosition_m7T9E();
                    g0.m(m1504getCurrentDragPosition_m7T9E4);
                    int m1166getOffsetForPosition3MmeM6k2 = layoutResult.m1166getOffsetForPosition3MmeM6k(m1504getCurrentDragPosition_m7T9E4.m2278unboximpl(), false);
                    num3 = textFieldSelectionManager2.dragBeginOffsetInText;
                    if (num3 == null && m1166getOffsetForPosition3MmeM6k == m1166getOffsetForPosition3MmeM6k2) {
                        return;
                    }
                    TextFieldValue value$foundation_release2 = textFieldSelectionManager2.getValue$foundation_release();
                    Offset m1504getCurrentDragPosition_m7T9E5 = textFieldSelectionManager2.m1504getCurrentDragPosition_m7T9E();
                    g0.m(m1504getCurrentDragPosition_m7T9E5);
                    m1502updateSelection8UEBfa8 = textFieldSelectionManager2.m1502updateSelection8UEBfa8(value$foundation_release2, m1504getCurrentDragPosition_m7T9E5.m2278unboximpl(), false, false, SelectionAdjustment.Companion.getWord(), true);
                    TextRange.m4547boximpl(m1502updateSelection8UEBfa8);
                }
                TextFieldSelectionManager.this.updateFloatingToolbar(false);
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onStart-k-4lQ0M */
            public void mo1134onStartk4lQ0M(long j11) {
                long j12;
                TextLayoutResultProxy layoutResult;
                TextFieldValue m1499createTextFieldValueFDrldGo;
                long j13;
                TextLayoutResultProxy layoutResult2;
                long m1502updateSelection8UEBfa8;
                if (TextFieldSelectionManager.this.getEnabled() && TextFieldSelectionManager.this.getDraggingHandle() == null) {
                    TextFieldSelectionManager.this.setDraggingHandle(Handle.SelectionEnd);
                    TextFieldSelectionManager.this.previousRawDragOffset = -1;
                    TextFieldSelectionManager.this.hideSelectionToolbar$foundation_release();
                    LegacyTextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                    if (state$foundation_release == null || (layoutResult2 = state$foundation_release.getLayoutResult()) == null || !layoutResult2.m1167isPositionOnTextk4lQ0M(j11)) {
                        j12 = j11;
                        LegacyTextFieldState state$foundation_release2 = TextFieldSelectionManager.this.getState$foundation_release();
                        if (state$foundation_release2 != null && (layoutResult = state$foundation_release2.getLayoutResult()) != null) {
                            TextFieldSelectionManager textFieldSelectionManager = TextFieldSelectionManager.this;
                            int transformedToOriginal = textFieldSelectionManager.getOffsetMapping$foundation_release().transformedToOriginal(TextLayoutResultProxy.m1165getOffsetForPosition3MmeM6k$default(layoutResult, j12, false, 2, null));
                            m1499createTextFieldValueFDrldGo = textFieldSelectionManager.m1499createTextFieldValueFDrldGo(textFieldSelectionManager.getValue$foundation_release().getAnnotatedString(), TextRangeKt.TextRange(transformedToOriginal, transformedToOriginal));
                            textFieldSelectionManager.enterSelectionMode$foundation_release(false);
                            HapticFeedback hapticFeedBack = textFieldSelectionManager.getHapticFeedBack();
                            if (hapticFeedBack != null) {
                                hapticFeedBack.mo3231performHapticFeedbackCdsT49E(HapticFeedbackType.Companion.m3247getTextHandleMove5zf0vsI());
                            }
                            textFieldSelectionManager.getOnValueChange$foundation_release().invoke(m1499createTextFieldValueFDrldGo);
                        }
                    } else {
                        if (TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0) {
                            return;
                        }
                        TextFieldSelectionManager.this.enterSelectionMode$foundation_release(false);
                        TextFieldSelectionManager textFieldSelectionManager2 = TextFieldSelectionManager.this;
                        m1502updateSelection8UEBfa8 = textFieldSelectionManager2.m1502updateSelection8UEBfa8(TextFieldValue.m4802copy3r_uNRQ$default(textFieldSelectionManager2.getValue$foundation_release(), (AnnotatedString) null, TextRange.Companion.m4564getZerod9O1mEE(), (TextRange) null, 5, (Object) null), j11, true, false, SelectionAdjustment.Companion.getWord(), true);
                        j12 = j11;
                        TextFieldSelectionManager.this.dragBeginOffsetInText = Integer.valueOf(TextRange.m4559getStartimpl(m1502updateSelection8UEBfa8));
                    }
                    TextFieldSelectionManager.this.setHandleState(HandleState.None);
                    TextFieldSelectionManager.this.dragBeginPosition = j12;
                    TextFieldSelectionManager textFieldSelectionManager3 = TextFieldSelectionManager.this;
                    j13 = textFieldSelectionManager3.dragBeginPosition;
                    textFieldSelectionManager3.m1501setCurrentDragPosition_kEHs6E(Offset.m2257boximpl(j13));
                    TextFieldSelectionManager.this.dragTotalDistance = Offset.Companion.m2284getZeroF1C5BW0();
                }
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onStop() {
                onEnd();
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            public void onUp() {
            }

            @Override // androidx.compose.foundation.text.TextDragObserver
            /* renamed from: onDown-k-4lQ0M */
            public void mo1132onDownk4lQ0M(long j11) {
            }
        };
        this.mouseSelectionObserver = new MouseSelectionObserver() { // from class: androidx.compose.foundation.text.selection.TextFieldSelectionManager$mouseSelectionObserver$1
            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onDrag-3MmeM6k */
            public boolean mo1369onDrag3MmeM6k(long j11, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState state$foundation_release;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(TextFieldSelectionManager.this.getValue$foundation_release(), j11, false, selectionAdjustment);
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtend-k-4lQ0M */
            public boolean mo1370onExtendk4lQ0M(long j11) {
                LegacyTextFieldState state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release();
                if (state$foundation_release == null || state$foundation_release.getLayoutResult() == null || !TextFieldSelectionManager.this.getEnabled()) {
                    return false;
                }
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                updateMouseSelection(TextFieldSelectionManager.this.getValue$foundation_release(), j11, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onExtendDrag-k-4lQ0M */
            public boolean mo1371onExtendDragk4lQ0M(long j11) {
                LegacyTextFieldState state$foundation_release;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                updateMouseSelection(TextFieldSelectionManager.this.getValue$foundation_release(), j11, false, SelectionAdjustment.Companion.getNone());
                return true;
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            /* renamed from: onStart-3MmeM6k */
            public boolean mo1372onStart3MmeM6k(long j11, SelectionAdjustment selectionAdjustment) {
                LegacyTextFieldState state$foundation_release;
                long j12;
                if (!TextFieldSelectionManager.this.getEnabled() || TextFieldSelectionManager.this.getValue$foundation_release().getText().length() == 0 || (state$foundation_release = TextFieldSelectionManager.this.getState$foundation_release()) == null || state$foundation_release.getLayoutResult() == null) {
                    return false;
                }
                FocusRequester focusRequester = TextFieldSelectionManager.this.getFocusRequester();
                if (focusRequester != null) {
                    FocusRequester.m2179requestFocus3ESFkO8$default(focusRequester, 0, 1, null);
                }
                TextFieldSelectionManager.this.dragBeginPosition = j11;
                TextFieldSelectionManager.this.previousRawDragOffset = -1;
                TextFieldSelectionManager.enterSelectionMode$foundation_release$default(TextFieldSelectionManager.this, false, 1, null);
                TextFieldValue value$foundation_release = TextFieldSelectionManager.this.getValue$foundation_release();
                j12 = TextFieldSelectionManager.this.dragBeginPosition;
                updateMouseSelection(value$foundation_release, j12, true, selectionAdjustment);
                return true;
            }

            public final void updateMouseSelection(TextFieldValue textFieldValue, long j11, boolean z11, SelectionAdjustment selectionAdjustment) {
                long m1502updateSelection8UEBfa8;
                m1502updateSelection8UEBfa8 = TextFieldSelectionManager.this.m1502updateSelection8UEBfa8(textFieldValue, j11, z11, false, selectionAdjustment, false);
                TextFieldSelectionManager.this.setHandleState(TextRange.m4553getCollapsedimpl(m1502updateSelection8UEBfa8) ? HandleState.Cursor : HandleState.Selection);
            }

            @Override // androidx.compose.foundation.text.selection.MouseSelectionObserver
            public void onDragDone() {
            }
        };
    }

    public /* synthetic */ TextFieldSelectionManager(UndoManager undoManager, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : undoManager);
    }
}
