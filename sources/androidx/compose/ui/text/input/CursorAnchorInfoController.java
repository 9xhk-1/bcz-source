package androidx.compose.ui.text.input;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.input.pointer.MatrixPositionCalculator;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@n(message = "Only exists to support the legacy TextInputService APIs. It is not used by any Compose code. A copy of this class in foundation is used by the legacy BasicTextField.")
/* loaded from: classes2.dex */
public final class CursorAnchorInfoController {
    public static final int $stable = 8;

    @l
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;

    @l
    private Rect innerTextFieldBounds;

    @k
    private final InputMethodManager inputMethodManager;
    private boolean monitorEnabled;

    @l
    private OffsetMapping offsetMapping;

    @k
    private final MatrixPositionCalculator rootPositionCalculator;

    @l
    private TextFieldValue textFieldValue;

    @l
    private TextLayoutResult textLayoutResult;

    @k
    private final Object lock = new Object();

    @k
    private x00.l<? super Matrix, g2> textFieldToRootTransform = new x00.l<Matrix, g2>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$textFieldToRootTransform$1
        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Matrix matrix) {
            m4718invoke58bKbWc(matrix.m2762unboximpl());
            return g2.f100423a;
        }

        /* renamed from: invoke-58bKbWc, reason: not valid java name */
        public final void m4718invoke58bKbWc(float[] fArr) {
        }
    };

    @k
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    @k
    private final float[] matrix = Matrix.m2739constructorimpl$default(null, 1, null);

    @k
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    public CursorAnchorInfoController(@k MatrixPositionCalculator matrixPositionCalculator, @k InputMethodManager inputMethodManager) {
        this.rootPositionCalculator = matrixPositionCalculator;
        this.inputMethodManager = inputMethodManager;
    }

    private final void updateCursorAnchorInfo() {
        if (this.inputMethodManager.isActive()) {
            this.textFieldToRootTransform.invoke(Matrix.m2737boximpl(this.matrix));
            this.rootPositionCalculator.mo3661localToScreen58bKbWc(this.matrix);
            AndroidMatrixConversions_androidKt.m2379setFromEL8BTi8(this.androidMatrix, this.matrix);
            InputMethodManager inputMethodManager = this.inputMethodManager;
            CursorAnchorInfo.Builder builder = this.builder;
            TextFieldValue textFieldValue = this.textFieldValue;
            g0.m(textFieldValue);
            OffsetMapping offsetMapping = this.offsetMapping;
            g0.m(offsetMapping);
            TextLayoutResult textLayoutResult = this.textLayoutResult;
            g0.m(textLayoutResult);
            android.graphics.Matrix matrix = this.androidMatrix;
            Rect rect = this.innerTextFieldBounds;
            g0.m(rect);
            Rect rect2 = this.decorationBoxBounds;
            g0.m(rect2);
            inputMethodManager.updateCursorAnchorInfo(CursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect, rect2, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
            this.hasPendingImmediateRequest = false;
        }
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
            this.textFieldToRootTransform = new x00.l<Matrix, g2>() { // from class: androidx.compose.ui.text.input.CursorAnchorInfoController$invalidate$1$1
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Matrix matrix) {
                    m4717invoke58bKbWc(matrix.m2762unboximpl());
                    return g2.f100423a;
                }

                /* renamed from: invoke-58bKbWc, reason: not valid java name */
                public final void m4717invoke58bKbWc(float[] fArr) {
                }
            };
            this.innerTextFieldBounds = null;
            this.decorationBoxBounds = null;
            g2 g2Var = g2.f100423a;
        }
    }

    public final void requestUpdate(boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        synchronized (this.lock) {
            try {
                this.includeInsertionMarker = z13;
                this.includeCharacterBounds = z14;
                this.includeEditorBounds = z15;
                this.includeLineBounds = z16;
                if (z11) {
                    this.hasPendingImmediateRequest = true;
                    if (this.textFieldValue != null) {
                        updateCursorAnchorInfo();
                    }
                }
                this.monitorEnabled = z12;
                g2 g2Var = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void updateTextLayoutResult(@k TextFieldValue textFieldValue, @k OffsetMapping offsetMapping, @k TextLayoutResult textLayoutResult, @k x00.l<? super Matrix, g2> lVar, @k Rect rect, @k Rect rect2) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
                this.textFieldToRootTransform = lVar;
                this.innerTextFieldBounds = rect;
                this.decorationBoxBounds = rect2;
                if (!this.hasPendingImmediateRequest) {
                    if (this.monitorEnabled) {
                    }
                    g2 g2Var = g2.f100423a;
                }
                updateCursorAnchorInfo();
                g2 g2Var2 = g2.f100423a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
