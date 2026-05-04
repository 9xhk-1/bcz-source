package androidx.compose.foundation.text.input.internal;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.text.LegacyTextFieldState;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextHighlightType;
import androidx.compose.foundation.text.input.internal.undo.TextFieldEditUndoBehavior;
import androidx.compose.foundation.text.selection.TextFieldSelectionManager;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.graphics.RectHelper_androidKt;
import androidx.compose.ui.platform.ViewConfiguration;
import androidx.compose.ui.text.AnnotatedString;
import androidx.compose.ui.text.TextGranularity;
import androidx.compose.ui.text.TextInclusionStrategy;
import androidx.compose.ui.text.TextLayoutInput;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.TextRangeKt;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.DeleteSurroundingTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.SetSelectionCommand;
import kotlin.jvm.internal.Ref;
import kotlin.text.Regex;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(34)
@kotlin.jvm.internal.u0({"SMAP\nHandwritingGesture.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TransformedTextFieldState.kt\nandroidx/compose/foundation/text/input/internal/TransformedTextFieldState\n+ 4 TextFieldState.kt\nandroidx/compose/foundation/text/input/TextFieldState\n*L\n1#1,1102:1\n1#2:1103\n316#3,6:1104\n324#3,3:1118\n327#3:1127\n316#3,6:1128\n324#3,3:1142\n327#3:1151\n316#3,6:1152\n324#3,3:1166\n327#3:1175\n254#4,8:1110\n263#4,6:1121\n254#4,8:1134\n263#4,6:1145\n254#4,8:1158\n263#4,6:1169\n*S KotlinDebug\n*F\n+ 1 HandwritingGesture.android.kt\nandroidx/compose/foundation/text/input/internal/HandwritingGestureApi34\n*L\n353#1:1104,6\n353#1:1118,3\n353#1:1127\n370#1:1128,6\n370#1:1142,3\n370#1:1151\n92#1:1152,6\n92#1:1166,3\n92#1:1175\n353#1:1110,8\n353#1:1121,6\n370#1:1134,8\n370#1:1145,6\n92#1:1158,8\n92#1:1169,6\n*E\n"})
/* loaded from: classes.dex */
public final class HandwritingGestureApi34 {
    public static final int $stable = 0;

    @m80.k
    public static final HandwritingGestureApi34 INSTANCE = new HandwritingGestureApi34();

    private HandwritingGestureApi34() {
    }

    private final int fallback(TransformedTextFieldState transformedTextFieldState, HandwritingGesture handwritingGesture) {
        String fallbackText;
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.clearHighlight$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        TransformedTextFieldState.replaceSelectedText$default(transformedTextFieldState, fallbackText, true, null, false, 12, null);
        return 5;
    }

    private final int fallbackOnLegacyTextField(HandwritingGesture handwritingGesture, x00.l<? super EditCommand, g2> lVar) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        lVar.invoke(new CommitTextCommand(fallbackText, 1));
        return 5;
    }

    /* renamed from: highlightRange-XJREzCE, reason: not valid java name */
    private final void m1231highlightRangeXJREzCE(TransformedTextFieldState transformedTextFieldState, long j11, int i11) {
        if (!TextRange.m4553getCollapsedimpl(j11)) {
            transformedTextFieldState.m1311highlightCharsIn7RAjNK8(i11, j11);
            return;
        }
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.clearHighlight$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    private final int performDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        int granularity;
        RectF deletionArea;
        long m1253getRangeForScreenRectOH9lIzo;
        granularity = deleteGesture.getGranularity();
        int m1235toTextGranularityNUwxegE = m1235toTextGranularityNUwxegE(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        m1253getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1253getRangeForScreenRectOH9lIzo(textLayoutState, RectHelper_androidKt.toComposeRect(deletionArea), m1235toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m4553getCollapsedimpl(m1253getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, a1.a(deleteGesture));
        }
        m1232performDeletionSbBc2M(transformedTextFieldState, m1253getRangeForScreenRectOH9lIzo, TextGranularity.m4517equalsimpl0(m1235toTextGranularityNUwxegE, TextGranularity.Companion.m4522getWordDRrd7Zo()));
        return 1;
    }

    private final int performDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        long m1255getRangeForScreenRectsO048IG0;
        granularity = deleteRangeGesture.getGranularity();
        int m1235toTextGranularityNUwxegE = m1235toTextGranularityNUwxegE(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        m1255getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1255getRangeForScreenRectsO048IG0(textLayoutState, composeRect, RectHelper_androidKt.toComposeRect(deletionEndArea), m1235toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m4553getCollapsedimpl(m1255getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, a1.a(deleteRangeGesture));
        }
        m1232performDeletionSbBc2M(transformedTextFieldState, m1255getRangeForScreenRectsO048IG0, TextGranularity.m4517equalsimpl0(m1235toTextGranularityNUwxegE, TextGranularity.Companion.m4522getWordDRrd7Zo()));
        return 1;
    }

    /* renamed from: performDeletion-Sb-Bc2M, reason: not valid java name */
    private final void m1232performDeletionSbBc2M(TransformedTextFieldState transformedTextFieldState, long j11, boolean z11) {
        if (z11) {
            j11 = HandwritingGesture_androidKt.m1244adjustHandwritingDeleteGestureRange72CqOWE(j11, transformedTextFieldState.getVisualText());
        }
        TransformedTextFieldState.m1310replaceTextM8tDOmk$default(transformedTextFieldState, "", j11, null, false, 12, null);
    }

    /* renamed from: performDeletionOnLegacyTextField-vJH6DeI, reason: not valid java name */
    private final void m1233performDeletionOnLegacyTextFieldvJH6DeI(long j11, AnnotatedString annotatedString, boolean z11, x00.l<? super EditCommand, g2> lVar) {
        EditCommand compoundEditCommand;
        if (z11) {
            j11 = HandwritingGesture_androidKt.m1244adjustHandwritingDeleteGestureRange72CqOWE(j11, annotatedString);
        }
        compoundEditCommand = HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(TextRange.m4554getEndimpl(j11), TextRange.m4554getEndimpl(j11)), new DeleteSurroundingTextCommand(TextRange.m4555getLengthimpl(j11), 0));
        lVar.invoke(compoundEditCommand);
    }

    private final int performInsertGesture(TransformedTextFieldState transformedTextFieldState, InsertGesture insertGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        PointF insertionPoint;
        long offset;
        int m1248getOffsetForHandwritingGestured4ec7I;
        String textToInsert;
        insertionPoint = insertGesture.getInsertionPoint();
        offset = HandwritingGesture_androidKt.toOffset(insertionPoint);
        m1248getOffsetForHandwritingGestured4ec7I = HandwritingGesture_androidKt.m1248getOffsetForHandwritingGestured4ec7I(textLayoutState, offset, viewConfiguration);
        if (m1248getOffsetForHandwritingGestured4ec7I == -1) {
            return fallback(transformedTextFieldState, a1.a(insertGesture));
        }
        textToInsert = insertGesture.getTextToInsert();
        TransformedTextFieldState.m1310replaceTextM8tDOmk$default(transformedTextFieldState, textToInsert, TextRangeKt.TextRange(m1248getOffsetForHandwritingGestured4ec7I), null, false, 12, null);
        return 1;
    }

    private final void performInsertionOnLegacyTextField(int i11, String str, x00.l<? super EditCommand, g2> lVar) {
        EditCommand compoundEditCommand;
        compoundEditCommand = HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(i11, i11), new CommitTextCommand(str, 1));
        lVar.invoke(compoundEditCommand);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0026, code lost:
    
        if (r12 == true) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int performJoinOrSplitGesture(androidx.compose.foundation.text.input.internal.TransformedTextFieldState r10, android.view.inputmethod.JoinOrSplitGesture r11, androidx.compose.foundation.text.input.internal.TextLayoutState r12, androidx.compose.ui.platform.ViewConfiguration r13) {
        /*
            r9 = this;
            androidx.compose.foundation.text.input.TextFieldCharSequence r0 = r10.getOutputText()
            androidx.compose.foundation.text.input.TextFieldCharSequence r1 = r10.getUntransformedText()
            if (r0 == r1) goto Lc
            r10 = 3
            return r10
        Lc:
            android.graphics.PointF r0 = androidx.compose.foundation.text.input.internal.v0.a(r11)
            long r0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(r0)
            int r13 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m1238access$getOffsetForHandwritingGestured4ec7I(r12, r0, r13)
            r0 = -1
            if (r13 == r0) goto L28
            androidx.compose.ui.text.TextLayoutResult r12 = r12.getLayoutResult()
            r0 = 1
            if (r12 == 0) goto L2a
            boolean r12 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$isBiDiBoundary(r12, r13)
            if (r12 != r0) goto L2a
        L28:
            r1 = r10
            goto L4a
        L2a:
            androidx.compose.foundation.text.input.TextFieldCharSequence r11 = r10.getVisualText()
            long r3 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$rangeOfWhitespaces(r11, r13)
            boolean r11 = androidx.compose.ui.text.TextRange.m4553getCollapsedimpl(r3)
            if (r11 == 0) goto L44
            r7 = 12
            r8 = 0
            java.lang.String r2 = " "
            r5 = 0
            r6 = 0
            r1 = r10
            androidx.compose.foundation.text.input.internal.TransformedTextFieldState.m1310replaceTextM8tDOmk$default(r1, r2, r3, r5, r6, r7, r8)
            goto L49
        L44:
            r1 = r10
            r10 = 0
            r9.m1232performDeletionSbBc2M(r1, r3, r10)
        L49:
            return r0
        L4a:
            android.view.inputmethod.HandwritingGesture r10 = androidx.compose.foundation.text.input.internal.a1.a(r11)
            int r10 = r9.fallback(r1, r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.performJoinOrSplitGesture(androidx.compose.foundation.text.input.internal.TransformedTextFieldState, android.view.inputmethod.JoinOrSplitGesture, androidx.compose.foundation.text.input.internal.TextLayoutState, androidx.compose.ui.platform.ViewConfiguration):int");
    }

    private final int performRemoveSpaceGesture(TransformedTextFieldState transformedTextFieldState, RemoveSpaceGesture removeSpaceGesture, TextLayoutState textLayoutState, ViewConfiguration viewConfiguration) {
        PointF startPoint;
        long offset;
        PointF endPoint;
        long offset2;
        long m1250getRangeForRemoveSpaceGesture5iVPX68;
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        startPoint = removeSpaceGesture.getStartPoint();
        offset = HandwritingGesture_androidKt.toOffset(startPoint);
        endPoint = removeSpaceGesture.getEndPoint();
        offset2 = HandwritingGesture_androidKt.toOffset(endPoint);
        m1250getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m1250getRangeForRemoveSpaceGesture5iVPX68(layoutResult, offset, offset2, textLayoutState.getTextLayoutNodeCoordinates(), viewConfiguration);
        if (TextRange.m4553getCollapsedimpl(m1250getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallback(transformedTextFieldState, a1.a(removeSpaceGesture));
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String replace = new Regex("\\s+").replace(TextRangeKt.m4566substringFDrldGo(transformedTextFieldState.getVisualText(), m1250getRangeForRemoveSpaceGesture5iVPX68), new x00.l<u30.o, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final CharSequence invoke(u30.o oVar) {
                Ref.IntRef intRef3 = Ref.IntRef.this;
                if (intRef3.element == -1) {
                    intRef3.element = oVar.d().d();
                }
                intRef2.element = oVar.d().f() + 1;
                return "";
            }
        });
        if (intRef.element == -1 || intRef2.element == -1) {
            return fallback(transformedTextFieldState, a1.a(removeSpaceGesture));
        }
        long TextRange = TextRangeKt.TextRange(TextRange.m4559getStartimpl(m1250getRangeForRemoveSpaceGesture5iVPX68) + intRef.element, TextRange.m4559getStartimpl(m1250getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element);
        String substring = replace.substring(intRef.element, replace.length() - (TextRange.m4555getLengthimpl(m1250getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
        kotlin.jvm.internal.g0.o(substring, "substring(...)");
        TransformedTextFieldState.m1310replaceTextM8tDOmk$default(transformedTextFieldState, substring, TextRange, null, false, 12, null);
        return 1;
    }

    private final int performSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState, x00.a<g2> aVar) {
        RectF selectionArea;
        int granularity;
        long m1253getRangeForScreenRectOH9lIzo;
        selectionArea = selectGesture.getSelectionArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionArea);
        granularity = selectGesture.getGranularity();
        m1253getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1253getRangeForScreenRectOH9lIzo(textLayoutState, composeRect, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m4553getCollapsedimpl(m1253getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallback(transformedTextFieldState, a1.a(selectGesture));
        }
        transformedTextFieldState.m1317selectCharsIn5zctL8(m1253getRangeForScreenRectOH9lIzo);
        if (aVar == null) {
            return 1;
        }
        aVar.invoke();
        return 1;
    }

    private final int performSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState, x00.a<g2> aVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        long m1255getRangeForScreenRectsO048IG0;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Rect composeRect2 = RectHelper_androidKt.toComposeRect(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        m1255getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1255getRangeForScreenRectsO048IG0(textLayoutState, composeRect, composeRect2, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m4553getCollapsedimpl(m1255getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallback(transformedTextFieldState, a1.a(selectRangeGesture));
        }
        transformedTextFieldState.m1317selectCharsIn5zctL8(m1255getRangeForScreenRectsO048IG0);
        if (aVar == null) {
            return 1;
        }
        aVar.invoke();
        return 1;
    }

    /* renamed from: performSelectionOnLegacyTextField-8ffj60Q, reason: not valid java name */
    private final void m1234performSelectionOnLegacyTextField8ffj60Q(long j11, TextFieldSelectionManager textFieldSelectionManager, x00.l<? super EditCommand, g2> lVar) {
        lVar.invoke(new SetSelectionCommand(TextRange.m4559getStartimpl(j11), TextRange.m4554getEndimpl(j11)));
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.enterSelectionMode$foundation_release(true);
        }
    }

    private final void previewDeleteGesture(TransformedTextFieldState transformedTextFieldState, DeleteGesture deleteGesture, TextLayoutState textLayoutState) {
        RectF deletionArea;
        int granularity;
        long m1253getRangeForScreenRectOH9lIzo;
        deletionArea = deleteGesture.getDeletionArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(deletionArea);
        granularity = deleteGesture.getGranularity();
        m1253getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1253getRangeForScreenRectOH9lIzo(textLayoutState, composeRect, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        m1231highlightRangeXJREzCE(transformedTextFieldState, m1253getRangeForScreenRectOH9lIzo, TextHighlightType.Companion.m1202getHandwritingDeletePreviewsxJuwY());
    }

    private final void previewDeleteRangeGesture(TransformedTextFieldState transformedTextFieldState, DeleteRangeGesture deleteRangeGesture, TextLayoutState textLayoutState) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        long m1255getRangeForScreenRectsO048IG0;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        Rect composeRect2 = RectHelper_androidKt.toComposeRect(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        m1255getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1255getRangeForScreenRectsO048IG0(textLayoutState, composeRect, composeRect2, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        m1231highlightRangeXJREzCE(transformedTextFieldState, m1255getRangeForScreenRectsO048IG0, TextHighlightType.Companion.m1202getHandwritingDeletePreviewsxJuwY());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$1(TransformedTextFieldState transformedTextFieldState) {
        TextFieldState textFieldState = transformedTextFieldState.textFieldState;
        InputTransformation inputTransformation = transformedTextFieldState.inputTransformation;
        TextFieldEditUndoBehavior textFieldEditUndoBehavior = TextFieldEditUndoBehavior.MergeIfPossible;
        textFieldState.getMainBuffer$foundation_release().getChangeTracker$foundation_release().clearChanges();
        TextFieldBuffer mainBuffer$foundation_release = textFieldState.getMainBuffer$foundation_release();
        mainBuffer$foundation_release.clearHighlight$foundation_release();
        transformedTextFieldState.updateWedgeAffinity(mainBuffer$foundation_release);
        textFieldState.commitEditAsUser(inputTransformation, true, textFieldEditUndoBehavior);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void previewHandwritingGesture$lambda$9(TextFieldSelectionManager textFieldSelectionManager) {
        if (textFieldSelectionManager != null) {
            textFieldSelectionManager.clearPreviewHighlight$foundation_release();
        }
    }

    private final void previewSelectGesture(TransformedTextFieldState transformedTextFieldState, SelectGesture selectGesture, TextLayoutState textLayoutState) {
        RectF selectionArea;
        int granularity;
        long m1253getRangeForScreenRectOH9lIzo;
        selectionArea = selectGesture.getSelectionArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionArea);
        granularity = selectGesture.getGranularity();
        m1253getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1253getRangeForScreenRectOH9lIzo(textLayoutState, composeRect, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        m1231highlightRangeXJREzCE(transformedTextFieldState, m1253getRangeForScreenRectOH9lIzo, TextHighlightType.Companion.m1203getHandwritingSelectPreviewsxJuwY());
    }

    private final void previewSelectRangeGesture(TransformedTextFieldState transformedTextFieldState, SelectRangeGesture selectRangeGesture, TextLayoutState textLayoutState) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        long m1255getRangeForScreenRectsO048IG0;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Rect composeRect2 = RectHelper_androidKt.toComposeRect(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        m1255getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1255getRangeForScreenRectsO048IG0(textLayoutState, composeRect, composeRect2, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        m1231highlightRangeXJREzCE(transformedTextFieldState, m1255getRangeForScreenRectsO048IG0, TextHighlightType.Companion.m1203getHandwritingSelectPreviewsxJuwY());
    }

    /* renamed from: toTextGranularity-NUwxegE, reason: not valid java name */
    private final int m1235toTextGranularityNUwxegE(int i11) {
        return i11 != 1 ? i11 != 2 ? TextGranularity.Companion.m4521getCharacterDRrd7Zo() : TextGranularity.Companion.m4521getCharacterDRrd7Zo() : TextGranularity.Companion.m4522getWordDRrd7Zo();
    }

    public final int performHandwritingGesture$foundation_release(@m80.k TransformedTextFieldState transformedTextFieldState, @m80.k HandwritingGesture handwritingGesture, @m80.k TextLayoutState textLayoutState, @m80.l x00.a<g2> aVar, @m80.l ViewConfiguration viewConfiguration) {
        if (b1.a(handwritingGesture)) {
            return performSelectGesture(transformedTextFieldState, c1.a(handwritingGesture), textLayoutState, aVar);
        }
        if (z.a(handwritingGesture)) {
            return performDeleteGesture(transformedTextFieldState, a0.a(handwritingGesture), textLayoutState);
        }
        if (b0.a(handwritingGesture)) {
            return performSelectRangeGesture(transformedTextFieldState, c0.a(handwritingGesture), textLayoutState, aVar);
        }
        if (d0.a(handwritingGesture)) {
            return performDeleteRangeGesture(transformedTextFieldState, e0.a(handwritingGesture), textLayoutState);
        }
        if (s0.a(handwritingGesture)) {
            return performJoinOrSplitGesture(transformedTextFieldState, t0.a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (o0.a(handwritingGesture)) {
            return performInsertGesture(transformedTextFieldState, p0.a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        if (q0.a(handwritingGesture)) {
            return performRemoveSpaceGesture(transformedTextFieldState, r0.a(handwritingGesture), textLayoutState, viewConfiguration);
        }
        return 2;
    }

    public final boolean previewHandwritingGesture$foundation_release(@m80.k final TransformedTextFieldState transformedTextFieldState, @m80.k PreviewableHandwritingGesture previewableHandwritingGesture, @m80.k TextLayoutState textLayoutState, @m80.l CancellationSignal cancellationSignal) {
        if (b1.a(previewableHandwritingGesture)) {
            previewSelectGesture(transformedTextFieldState, c1.a(previewableHandwritingGesture), textLayoutState);
        } else if (z.a(previewableHandwritingGesture)) {
            previewDeleteGesture(transformedTextFieldState, a0.a(previewableHandwritingGesture), textLayoutState);
        } else if (b0.a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(transformedTextFieldState, c0.a(previewableHandwritingGesture), textLayoutState);
        } else {
            if (!d0.a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(transformedTextFieldState, e0.a(previewableHandwritingGesture), textLayoutState);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.e1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$1(TransformedTextFieldState.this);
            }
        });
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r3 == true) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int performInsertGesture(androidx.compose.foundation.text.LegacyTextFieldState r3, android.view.inputmethod.InsertGesture r4, androidx.compose.ui.platform.ViewConfiguration r5, x00.l<? super androidx.compose.ui.text.input.EditCommand, yz.g2> r6) {
        /*
            r2 = this;
            if (r5 != 0) goto Lb
            android.view.inputmethod.HandwritingGesture r3 = androidx.compose.foundation.text.input.internal.a1.a(r4)
            int r3 = r2.fallbackOnLegacyTextField(r3, r6)
            return r3
        Lb:
            android.graphics.PointF r0 = androidx.compose.foundation.text.input.internal.k0.a(r4)
            long r0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(r0)
            int r5 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m1237access$getOffsetForHandwritingGestured4ec7I(r3, r0, r5)
            r0 = -1
            if (r5 == r0) goto L36
            androidx.compose.foundation.text.TextLayoutResultProxy r3 = r3.getLayoutResult()
            r0 = 1
            if (r3 == 0) goto L2e
            androidx.compose.ui.text.TextLayoutResult r3 = r3.getValue()
            if (r3 == 0) goto L2e
            boolean r3 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$isBiDiBoundary(r3, r5)
            if (r3 != r0) goto L2e
            goto L36
        L2e:
            java.lang.String r3 = androidx.compose.foundation.text.input.internal.l0.a(r4)
            r2.performInsertionOnLegacyTextField(r5, r3, r6)
            return r0
        L36:
            android.view.inputmethod.HandwritingGesture r3 = androidx.compose.foundation.text.input.internal.a1.a(r4)
            int r3 = r2.fallbackOnLegacyTextField(r3, r6)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.performInsertGesture(androidx.compose.foundation.text.LegacyTextFieldState, android.view.inputmethod.InsertGesture, androidx.compose.ui.platform.ViewConfiguration, x00.l):int");
    }

    public final boolean previewHandwritingGesture$foundation_release(@m80.k LegacyTextFieldState legacyTextFieldState, @m80.k PreviewableHandwritingGesture previewableHandwritingGesture, @m80.l final TextFieldSelectionManager textFieldSelectionManager, @m80.l CancellationSignal cancellationSignal) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return false;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!kotlin.jvm.internal.g0.g(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return false;
        }
        if (b1.a(previewableHandwritingGesture)) {
            previewSelectGesture(legacyTextFieldState, c1.a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (z.a(previewableHandwritingGesture)) {
            previewDeleteGesture(legacyTextFieldState, a0.a(previewableHandwritingGesture), textFieldSelectionManager);
        } else if (b0.a(previewableHandwritingGesture)) {
            previewSelectRangeGesture(legacyTextFieldState, c0.a(previewableHandwritingGesture), textFieldSelectionManager);
        } else {
            if (!d0.a(previewableHandwritingGesture)) {
                return false;
            }
            previewDeleteRangeGesture(legacyTextFieldState, e0.a(previewableHandwritingGesture), textFieldSelectionManager);
        }
        if (cancellationSignal == null) {
            return true;
        }
        cancellationSignal.setOnCancelListener(new CancellationSignal.OnCancelListener() { // from class: androidx.compose.foundation.text.input.internal.d1
            @Override // android.os.CancellationSignal.OnCancelListener
            public final void onCancel() {
                HandwritingGestureApi34.previewHandwritingGesture$lambda$9(TextFieldSelectionManager.this);
            }
        });
        return true;
    }

    private final void previewDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF deletionArea;
        int granularity;
        long m1252getRangeForScreenRectOH9lIzo;
        if (textFieldSelectionManager != null) {
            deletionArea = deleteGesture.getDeletionArea();
            Rect composeRect = RectHelper_androidKt.toComposeRect(deletionArea);
            granularity = deleteGesture.getGranularity();
            m1252getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1252getRangeForScreenRectOH9lIzo(legacyTextFieldState, composeRect, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
            textFieldSelectionManager.m1508setDeletionPreviewHighlight5zctL8$foundation_release(m1252getRangeForScreenRectOH9lIzo);
        }
    }

    private final void previewSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF selectionArea;
        int granularity;
        long m1252getRangeForScreenRectOH9lIzo;
        if (textFieldSelectionManager != null) {
            selectionArea = selectGesture.getSelectionArea();
            Rect composeRect = RectHelper_androidKt.toComposeRect(selectionArea);
            granularity = selectGesture.getGranularity();
            m1252getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1252getRangeForScreenRectOH9lIzo(legacyTextFieldState, composeRect, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
            textFieldSelectionManager.m1509setSelectionPreviewHighlight5zctL8$foundation_release(m1252getRangeForScreenRectOH9lIzo);
        }
    }

    private final int performDeleteGesture(LegacyTextFieldState legacyTextFieldState, DeleteGesture deleteGesture, AnnotatedString annotatedString, x00.l<? super EditCommand, g2> lVar) {
        int granularity;
        RectF deletionArea;
        long m1252getRangeForScreenRectOH9lIzo;
        granularity = deleteGesture.getGranularity();
        int m1235toTextGranularityNUwxegE = m1235toTextGranularityNUwxegE(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        m1252getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1252getRangeForScreenRectOH9lIzo(legacyTextFieldState, RectHelper_androidKt.toComposeRect(deletionArea), m1235toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m4553getCollapsedimpl(m1252getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(a1.a(deleteGesture), lVar);
        }
        m1233performDeletionOnLegacyTextFieldvJH6DeI(m1252getRangeForScreenRectOH9lIzo, annotatedString, TextGranularity.m4517equalsimpl0(m1235toTextGranularityNUwxegE, TextGranularity.Companion.m4522getWordDRrd7Zo()), lVar);
        return 1;
    }

    private final int performSelectGesture(LegacyTextFieldState legacyTextFieldState, SelectGesture selectGesture, TextFieldSelectionManager textFieldSelectionManager, x00.l<? super EditCommand, g2> lVar) {
        RectF selectionArea;
        int granularity;
        long m1252getRangeForScreenRectOH9lIzo;
        selectionArea = selectGesture.getSelectionArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionArea);
        granularity = selectGesture.getGranularity();
        m1252getRangeForScreenRectOH9lIzo = HandwritingGesture_androidKt.m1252getRangeForScreenRectOH9lIzo(legacyTextFieldState, composeRect, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m4553getCollapsedimpl(m1252getRangeForScreenRectOH9lIzo)) {
            return INSTANCE.fallbackOnLegacyTextField(a1.a(selectGesture), lVar);
        }
        m1234performSelectionOnLegacyTextField8ffj60Q(m1252getRangeForScreenRectOH9lIzo, textFieldSelectionManager, lVar);
        return 1;
    }

    private final void previewDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        long m1254getRangeForScreenRectsO048IG0;
        if (textFieldSelectionManager != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            Rect composeRect = RectHelper_androidKt.toComposeRect(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            Rect composeRect2 = RectHelper_androidKt.toComposeRect(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            m1254getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1254getRangeForScreenRectsO048IG0(legacyTextFieldState, composeRect, composeRect2, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
            textFieldSelectionManager.m1508setDeletionPreviewHighlight5zctL8$foundation_release(m1254getRangeForScreenRectsO048IG0);
        }
    }

    private final void previewSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        long m1254getRangeForScreenRectsO048IG0;
        if (textFieldSelectionManager != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            Rect composeRect = RectHelper_androidKt.toComposeRect(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            Rect composeRect2 = RectHelper_androidKt.toComposeRect(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            m1254getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1254getRangeForScreenRectsO048IG0(legacyTextFieldState, composeRect, composeRect2, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
            textFieldSelectionManager.m1509setSelectionPreviewHighlight5zctL8$foundation_release(m1254getRangeForScreenRectsO048IG0);
        }
    }

    private final int performDeleteRangeGesture(LegacyTextFieldState legacyTextFieldState, DeleteRangeGesture deleteRangeGesture, AnnotatedString annotatedString, x00.l<? super EditCommand, g2> lVar) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        long m1254getRangeForScreenRectsO048IG0;
        granularity = deleteRangeGesture.getGranularity();
        int m1235toTextGranularityNUwxegE = m1235toTextGranularityNUwxegE(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        m1254getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1254getRangeForScreenRectsO048IG0(legacyTextFieldState, composeRect, RectHelper_androidKt.toComposeRect(deletionEndArea), m1235toTextGranularityNUwxegE, TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m4553getCollapsedimpl(m1254getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(a1.a(deleteRangeGesture), lVar);
        }
        m1233performDeletionOnLegacyTextFieldvJH6DeI(m1254getRangeForScreenRectsO048IG0, annotatedString, TextGranularity.m4517equalsimpl0(m1235toTextGranularityNUwxegE, TextGranularity.Companion.m4522getWordDRrd7Zo()), lVar);
        return 1;
    }

    private final int performSelectRangeGesture(LegacyTextFieldState legacyTextFieldState, SelectRangeGesture selectRangeGesture, TextFieldSelectionManager textFieldSelectionManager, x00.l<? super EditCommand, g2> lVar) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        long m1254getRangeForScreenRectsO048IG0;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        Rect composeRect = RectHelper_androidKt.toComposeRect(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        Rect composeRect2 = RectHelper_androidKt.toComposeRect(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        m1254getRangeForScreenRectsO048IG0 = HandwritingGesture_androidKt.m1254getRangeForScreenRectsO048IG0(legacyTextFieldState, composeRect, composeRect2, m1235toTextGranularityNUwxegE(granularity), TextInclusionStrategy.Companion.getContainsCenter());
        if (TextRange.m4553getCollapsedimpl(m1254getRangeForScreenRectsO048IG0)) {
            return INSTANCE.fallbackOnLegacyTextField(a1.a(selectRangeGesture), lVar);
        }
        m1234performSelectionOnLegacyTextField8ffj60Q(m1254getRangeForScreenRectsO048IG0, textFieldSelectionManager, lVar);
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002b, code lost:
    
        if (r8 == true) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int performJoinOrSplitGesture(androidx.compose.foundation.text.LegacyTextFieldState r8, android.view.inputmethod.JoinOrSplitGesture r9, androidx.compose.ui.text.AnnotatedString r10, androidx.compose.ui.platform.ViewConfiguration r11, x00.l<? super androidx.compose.ui.text.input.EditCommand, yz.g2> r12) {
        /*
            r7 = this;
            if (r11 != 0) goto Lb
            android.view.inputmethod.HandwritingGesture r8 = androidx.compose.foundation.text.input.internal.a1.a(r9)
            int r8 = r7.fallbackOnLegacyTextField(r8, r12)
            return r8
        Lb:
            android.graphics.PointF r0 = androidx.compose.foundation.text.input.internal.v0.a(r9)
            long r0 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$toOffset(r0)
            int r11 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.m1237access$getOffsetForHandwritingGestured4ec7I(r8, r0, r11)
            r0 = -1
            if (r11 == r0) goto L2d
            androidx.compose.foundation.text.TextLayoutResultProxy r8 = r8.getLayoutResult()
            r0 = 1
            if (r8 == 0) goto L30
            androidx.compose.ui.text.TextLayoutResult r8 = r8.getValue()
            if (r8 == 0) goto L30
            boolean r8 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$isBiDiBoundary(r8, r11)
            if (r8 != r0) goto L30
        L2d:
            r1 = r7
            r6 = r12
            goto L4d
        L30:
            long r2 = androidx.compose.foundation.text.input.internal.HandwritingGesture_androidKt.access$rangeOfWhitespaces(r10, r11)
            boolean r8 = androidx.compose.ui.text.TextRange.m4553getCollapsedimpl(r2)
            if (r8 == 0) goto L45
            int r8 = androidx.compose.ui.text.TextRange.m4559getStartimpl(r2)
            java.lang.String r9 = " "
            r7.performInsertionOnLegacyTextField(r8, r9, r12)
            r1 = r7
            goto L4c
        L45:
            r5 = 0
            r1 = r7
            r4 = r10
            r6 = r12
            r1.m1233performDeletionOnLegacyTextFieldvJH6DeI(r2, r4, r5, r6)
        L4c:
            return r0
        L4d:
            android.view.inputmethod.HandwritingGesture r8 = androidx.compose.foundation.text.input.internal.a1.a(r9)
            int r8 = r7.fallbackOnLegacyTextField(r8, r6)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34.performJoinOrSplitGesture(androidx.compose.foundation.text.LegacyTextFieldState, android.view.inputmethod.JoinOrSplitGesture, androidx.compose.ui.text.AnnotatedString, androidx.compose.ui.platform.ViewConfiguration, x00.l):int");
    }

    public final int performHandwritingGesture$foundation_release(@m80.k LegacyTextFieldState legacyTextFieldState, @m80.k HandwritingGesture handwritingGesture, @m80.l TextFieldSelectionManager textFieldSelectionManager, @m80.l ViewConfiguration viewConfiguration, @m80.k x00.l<? super EditCommand, g2> lVar) {
        TextLayoutResult value;
        TextLayoutInput layoutInput;
        AnnotatedString untransformedText = legacyTextFieldState.getUntransformedText();
        if (untransformedText == null) {
            return 3;
        }
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        if (!kotlin.jvm.internal.g0.g(untransformedText, (layoutResult == null || (value = layoutResult.getValue()) == null || (layoutInput = value.getLayoutInput()) == null) ? null : layoutInput.getText())) {
            return 3;
        }
        if (b1.a(handwritingGesture)) {
            return performSelectGesture(legacyTextFieldState, c1.a(handwritingGesture), textFieldSelectionManager, lVar);
        }
        if (z.a(handwritingGesture)) {
            return performDeleteGesture(legacyTextFieldState, a0.a(handwritingGesture), untransformedText, lVar);
        }
        if (b0.a(handwritingGesture)) {
            return performSelectRangeGesture(legacyTextFieldState, c0.a(handwritingGesture), textFieldSelectionManager, lVar);
        }
        if (d0.a(handwritingGesture)) {
            return performDeleteRangeGesture(legacyTextFieldState, e0.a(handwritingGesture), untransformedText, lVar);
        }
        if (s0.a(handwritingGesture)) {
            return performJoinOrSplitGesture(legacyTextFieldState, t0.a(handwritingGesture), untransformedText, viewConfiguration, lVar);
        }
        if (o0.a(handwritingGesture)) {
            return performInsertGesture(legacyTextFieldState, p0.a(handwritingGesture), viewConfiguration, lVar);
        }
        if (q0.a(handwritingGesture)) {
            return performRemoveSpaceGesture(legacyTextFieldState, r0.a(handwritingGesture), untransformedText, viewConfiguration, lVar);
        }
        return 2;
    }

    private final int performRemoveSpaceGesture(LegacyTextFieldState legacyTextFieldState, RemoveSpaceGesture removeSpaceGesture, AnnotatedString annotatedString, ViewConfiguration viewConfiguration, x00.l<? super EditCommand, g2> lVar) {
        PointF startPoint;
        long offset;
        PointF endPoint;
        long offset2;
        long m1250getRangeForRemoveSpaceGesture5iVPX68;
        EditCommand compoundEditCommand;
        TextLayoutResultProxy layoutResult = legacyTextFieldState.getLayoutResult();
        TextLayoutResult value = layoutResult != null ? layoutResult.getValue() : null;
        startPoint = removeSpaceGesture.getStartPoint();
        offset = HandwritingGesture_androidKt.toOffset(startPoint);
        endPoint = removeSpaceGesture.getEndPoint();
        offset2 = HandwritingGesture_androidKt.toOffset(endPoint);
        m1250getRangeForRemoveSpaceGesture5iVPX68 = HandwritingGesture_androidKt.m1250getRangeForRemoveSpaceGesture5iVPX68(value, offset, offset2, legacyTextFieldState.getLayoutCoordinates(), viewConfiguration);
        if (TextRange.m4553getCollapsedimpl(m1250getRangeForRemoveSpaceGesture5iVPX68)) {
            return INSTANCE.fallbackOnLegacyTextField(a1.a(removeSpaceGesture), lVar);
        }
        final Ref.IntRef intRef = new Ref.IntRef();
        intRef.element = -1;
        final Ref.IntRef intRef2 = new Ref.IntRef();
        intRef2.element = -1;
        String replace = new Regex("\\s+").replace(TextRangeKt.m4566substringFDrldGo(annotatedString, m1250getRangeForRemoveSpaceGesture5iVPX68), new x00.l<u30.o, CharSequence>() { // from class: androidx.compose.foundation.text.input.internal.HandwritingGestureApi34$performRemoveSpaceGesture$newText$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final CharSequence invoke(u30.o oVar) {
                Ref.IntRef intRef3 = Ref.IntRef.this;
                if (intRef3.element == -1) {
                    intRef3.element = oVar.d().d();
                }
                intRef2.element = oVar.d().f() + 1;
                return "";
            }
        });
        if (intRef.element != -1 && intRef2.element != -1) {
            int m4559getStartimpl = TextRange.m4559getStartimpl(m1250getRangeForRemoveSpaceGesture5iVPX68) + intRef.element;
            int m4559getStartimpl2 = TextRange.m4559getStartimpl(m1250getRangeForRemoveSpaceGesture5iVPX68) + intRef2.element;
            String substring = replace.substring(intRef.element, replace.length() - (TextRange.m4555getLengthimpl(m1250getRangeForRemoveSpaceGesture5iVPX68) - intRef2.element));
            kotlin.jvm.internal.g0.o(substring, "substring(...)");
            compoundEditCommand = HandwritingGesture_androidKt.compoundEditCommand(new SetSelectionCommand(m4559getStartimpl, m4559getStartimpl2), new CommitTextCommand(substring, 1));
            lVar.invoke(compoundEditCommand);
            return 1;
        }
        return fallbackOnLegacyTextField(a1.a(removeSpaceGesture), lVar);
    }
}
