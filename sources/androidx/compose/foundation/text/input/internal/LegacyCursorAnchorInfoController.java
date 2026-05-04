package androidx.compose.foundation.text.input.internal;

import android.view.inputmethod.CursorAnchorInfo;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.AndroidMatrixConversions_androidKt;
import androidx.compose.ui.graphics.Matrix;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.TextFieldValue;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public final class LegacyCursorAnchorInfoController {
    public static final int $stable = 8;

    @m80.l
    private Rect decorationBoxBounds;
    private boolean hasPendingImmediateRequest;
    private boolean includeCharacterBounds;
    private boolean includeEditorBounds;
    private boolean includeInsertionMarker;
    private boolean includeLineBounds;

    @m80.l
    private Rect innerTextFieldBounds;

    @m80.k
    private final InputMethodManager inputMethodManager;

    @m80.k
    private final x00.l<Matrix, g2> localToScreen;
    private boolean monitorEnabled;

    @m80.l
    private OffsetMapping offsetMapping;

    @m80.l
    private TextFieldValue textFieldValue;

    @m80.l
    private TextLayoutResult textLayoutResult;

    @m80.k
    private final Object lock = new Object();

    @m80.k
    private final CursorAnchorInfo.Builder builder = new CursorAnchorInfo.Builder();

    @m80.k
    private final float[] matrix = Matrix.m2739constructorimpl$default(null, 1, null);

    @m80.k
    private final android.graphics.Matrix androidMatrix = new android.graphics.Matrix();

    /* JADX WARN: Multi-variable type inference failed */
    public LegacyCursorAnchorInfoController(@m80.k x00.l<? super Matrix, g2> lVar, @m80.k InputMethodManager inputMethodManager) {
        this.localToScreen = lVar;
        this.inputMethodManager = inputMethodManager;
    }

    private final void updateCursorAnchorInfo() {
        if (!this.inputMethodManager.isActive() || this.textFieldValue == null || this.offsetMapping == null || this.textLayoutResult == null || this.innerTextFieldBounds == null || this.decorationBoxBounds == null) {
            return;
        }
        Matrix.m2748resetimpl(this.matrix);
        this.localToScreen.invoke(Matrix.m2737boximpl(this.matrix));
        float[] fArr = this.matrix;
        Rect rect = this.decorationBoxBounds;
        kotlin.jvm.internal.g0.m(rect);
        float f11 = -rect.getLeft();
        Rect rect2 = this.decorationBoxBounds;
        kotlin.jvm.internal.g0.m(rect2);
        Matrix.m2760translateimpl(fArr, f11, -rect2.getTop(), 0.0f);
        AndroidMatrixConversions_androidKt.m2379setFromEL8BTi8(this.androidMatrix, this.matrix);
        InputMethodManager inputMethodManager = this.inputMethodManager;
        CursorAnchorInfo.Builder builder = this.builder;
        TextFieldValue textFieldValue = this.textFieldValue;
        kotlin.jvm.internal.g0.m(textFieldValue);
        OffsetMapping offsetMapping = this.offsetMapping;
        kotlin.jvm.internal.g0.m(offsetMapping);
        TextLayoutResult textLayoutResult = this.textLayoutResult;
        kotlin.jvm.internal.g0.m(textLayoutResult);
        android.graphics.Matrix matrix = this.androidMatrix;
        Rect rect3 = this.innerTextFieldBounds;
        kotlin.jvm.internal.g0.m(rect3);
        Rect rect4 = this.decorationBoxBounds;
        kotlin.jvm.internal.g0.m(rect4);
        inputMethodManager.updateCursorAnchorInfo(LegacyCursorAnchorInfoBuilder_androidKt.build(builder, textFieldValue, offsetMapping, textLayoutResult, matrix, rect3, rect4, this.includeInsertionMarker, this.includeCharacterBounds, this.includeEditorBounds, this.includeLineBounds));
        this.hasPendingImmediateRequest = false;
    }

    public final void invalidate() {
        synchronized (this.lock) {
            this.textFieldValue = null;
            this.offsetMapping = null;
            this.textLayoutResult = null;
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

    public final void updateTextLayoutResult(@m80.k TextFieldValue textFieldValue, @m80.k OffsetMapping offsetMapping, @m80.k TextLayoutResult textLayoutResult, @m80.k Rect rect, @m80.k Rect rect2) {
        synchronized (this.lock) {
            try {
                this.textFieldValue = textFieldValue;
                this.offsetMapping = offsetMapping;
                this.textLayoutResult = textLayoutResult;
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
