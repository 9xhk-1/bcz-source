package androidx.compose.foundation.text.input.internal;

import android.os.Build;
import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.foundation.text.input.TextFieldCharSequence;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import c40.l2;
import kotlinx.coroutines.CoroutineStart;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nCursorAnchorInfoController.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CursorAnchorInfoController.android.kt\nandroidx/compose/foundation/text/input/internal/CursorAnchorInfoController\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,204:1\n1#2:205\n*E\n"})
/* loaded from: classes.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;

    @m80.k
    private final ComposeInputMethodManager composeImm;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;
    private boolean monitorEnabled;

    @m80.l
    private l2 monitorJob;

    @m80.k
    private final c40.r0 monitorScope;

    @m80.k
    private final TransformedTextFieldState textFieldState;

    @m80.k
    private final TextLayoutState textLayoutState;

    @m80.k
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    @m80.k
    private final float[] matrix = Matrix.m2739constructorimpl$default(null, 1, null);

    @m80.k
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(@m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextLayoutState textLayoutState, @m80.k ComposeInputMethodManager composeInputMethodManager, @m80.k c40.r0 r0Var) {
        this.textFieldState = transformedTextFieldState;
        this.textLayoutState = textLayoutState;
        this.composeImm = composeInputMethodManager;
        this.monitorScope = r0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CursorAnchorInfo calculateCursorAnchorInfo() {
        LayoutCoordinates coreNodeCoordinates;
        LayoutCoordinates decoratorNodeCoordinates;
        TextLayoutResult layoutResult;
        LayoutCoordinates textLayoutNodeCoordinates = this.textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null && (coreNodeCoordinates = this.textLayoutState.getCoreNodeCoordinates()) != null) {
                if (!coreNodeCoordinates.isAttached()) {
                    coreNodeCoordinates = null;
                }
                if (coreNodeCoordinates != null && (decoratorNodeCoordinates = this.textLayoutState.getDecoratorNodeCoordinates()) != null) {
                    if (!decoratorNodeCoordinates.isAttached()) {
                        decoratorNodeCoordinates = null;
                    }
                    if (decoratorNodeCoordinates == null || (layoutResult = this.textLayoutState.getLayoutResult()) == null) {
                        return null;
                    }
                    TextFieldCharSequence visualText = this.textFieldState.getVisualText();
                    Matrix.m2748resetimpl(this.matrix);
                    textLayoutNodeCoordinates.mo3873transformToScreen58bKbWc(this.matrix);
                    AndroidMatrixConversions_androidKt.m2379setFromEL8BTi8(this.androidMatrix, this.matrix);
                    Rect visibleBounds = SelectionManagerKt.visibleBounds(coreNodeCoordinates);
                    Offset.Companion companion = Offset.Companion;
                    return CursorAnchorInfoBuilder_androidKt.m1227buildvxqZcH0(this.builder, visualText, visualText.m1189getSelectiond9O1mEE(), visualText.m1188getCompositionMzsxiRA(), layoutResult, this.androidMatrix, visibleBounds.m2305translatek4lQ0M(textLayoutNodeCoordinates.mo3866localPositionOfR5De75A(coreNodeCoordinates, companion.m2284getZeroF1C5BW0())), SelectionManagerKt.visibleBounds(decoratorNodeCoordinates).m2305translatek4lQ0M(textLayoutNodeCoordinates.mo3866localPositionOfR5De75A(decoratorNodeCoordinates, companion.m2284getZeroF1C5BW0())), this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds);
                }
            }
        }
        return null;
    }

    private final void startOrStopMonitoring() {
        l2 f11;
        if (!this.monitorEnabled) {
            l2 l2Var = this.monitorJob;
            if (l2Var != null) {
                l2.a.b(l2Var, null, 1, null);
            }
            this.monitorJob = null;
            return;
        }
        l2 l2Var2 = this.monitorJob;
        if (l2Var2 == null || !l2Var2.isActive()) {
            f11 = c40.k.f(this.monitorScope, null, CoroutineStart.UNDISPATCHED, new CursorAnchorInfoController$startOrStopMonitoring$1(this, null), 1, null);
            this.monitorJob = f11;
        }
    }

    public final void requestUpdates(int i11) {
        CursorAnchorInfoController cursorAnchorInfoController;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        boolean z16 = (i11 & 1) != 0;
        boolean z17 = (i11 & 2) != 0;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 33) {
            boolean z18 = (i11 & 16) != 0;
            boolean z19 = (i11 & 8) != 0;
            boolean z21 = (i11 & 4) != 0;
            if (i12 >= 34 && (i11 & 32) != 0) {
                z15 = true;
            }
            if (z18 || z19 || z21 || z15) {
                z12 = z15;
                z11 = z21;
                z14 = z19;
                z13 = z18;
                cursorAnchorInfoController = this;
            } else {
                cursorAnchorInfoController = this;
                if (i12 >= 34) {
                    z13 = true;
                    z14 = true;
                    z11 = true;
                    z12 = true;
                } else {
                    z12 = z15;
                    z13 = true;
                    z14 = true;
                    z11 = true;
                }
            }
        } else {
            cursorAnchorInfoController = this;
            z11 = false;
            z12 = false;
            z13 = true;
            z14 = true;
        }
        cursorAnchorInfoController.requestUpdates(z16, z17, z13, z14, z11, z12);
    }

    private final void requestUpdates(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        this.includeInsertionMarker = z13;
        this.includeCharacterBounds = z14;
        this.includeEditorBounds = z15;
        this.includeLineBounds = z16;
        if (z11) {
            this.hasPendingImmediateRequest = true;
            CursorAnchorInfo calculateCursorAnchorInfo = calculateCursorAnchorInfo();
            if (calculateCursorAnchorInfo != null) {
                this.composeImm.updateCursorAnchorInfo(calculateCursorAnchorInfo);
            }
        }
        this.monitorEnabled = z12;
        startOrStopMonitoring();
    }
}
