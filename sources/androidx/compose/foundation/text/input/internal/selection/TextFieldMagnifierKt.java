package androidx.compose.foundation.text.input.internal.selection;

import androidx.compose.foundation.text.Handle;
import androidx.compose.foundation.text.input.internal.TextLayoutState;
import androidx.compose.foundation.text.input.internal.TextLayoutStateKt;
import androidx.compose.foundation.text.input.internal.TransformedTextFieldState;
import androidx.compose.foundation.text.selection.SelectionManagerKt;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.unit.IntSize;
import g10.u;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTextFieldMagnifier.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,123:1\n278#2:124\n30#2:130\n65#3:125\n60#4:126\n85#4:129\n53#4,3:131\n22#5:127\n54#6:128\n1#7:134\n*S KotlinDebug\n*F\n+ 1 TextFieldMagnifier.kt\nandroidx/compose/foundation/text/input/internal/selection/TextFieldMagnifierKt\n*L\n73#1:124\n117#1:130\n89#1:125\n89#1:126\n107#1:129\n117#1:131,3\n89#1:127\n107#1:128\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldMagnifierKt {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Handle.values().length];
            try {
                iArr[Handle.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Handle.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Handle.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* renamed from: calculateSelectionMagnifierCenterAndroid-hUlJWOE, reason: not valid java name */
    public static final long m1342calculateSelectionMagnifierCenterAndroidhUlJWOE(@k TransformedTextFieldState transformedTextFieldState, @k TextFieldSelectionState textFieldSelectionState, @k TextLayoutState textLayoutState, long j11) {
        int m4559getStartimpl;
        long m1366getHandleDragPositionF1C5BW0 = textFieldSelectionState.m1366getHandleDragPositionF1C5BW0();
        if ((9223372034707292159L & m1366getHandleDragPositionF1C5BW0) == InlineClassHelperKt.UnspecifiedPackedFloats || transformedTextFieldState.getVisualText().length() == 0) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        long m1189getSelectiond9O1mEE = transformedTextFieldState.getVisualText().m1189getSelectiond9O1mEE();
        Handle draggingHandle = textFieldSelectionState.getDraggingHandle();
        int i11 = draggingHandle == null ? -1 : WhenMappings.$EnumSwitchMapping$0[draggingHandle.ordinal()];
        if (i11 == -1) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        if (i11 == 1 || i11 == 2) {
            m4559getStartimpl = TextRange.m4559getStartimpl(m1189getSelectiond9O1mEE);
        } else {
            if (i11 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            m4559getStartimpl = TextRange.m4554getEndimpl(m1189getSelectiond9O1mEE);
        }
        TextLayoutResult layoutResult = textLayoutState.getLayoutResult();
        if (layoutResult == null) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        float intBitsToFloat = Float.intBitsToFloat((int) (m1366getHandleDragPositionF1C5BW0 >> 32));
        int lineForOffset = layoutResult.getLineForOffset(m4559getStartimpl);
        float lineLeft = layoutResult.getLineLeft(lineForOffset);
        float lineRight = layoutResult.getLineRight(lineForOffset);
        float H = u.H(intBitsToFloat, Math.min(lineLeft, lineRight), Math.max(lineLeft, lineRight));
        if (!IntSize.m5284equalsimpl0(j11, IntSize.Companion.m5291getZeroYbymL2g()) && Math.abs(intBitsToFloat - H) > ((int) (j11 >> 32)) / 2) {
            return Offset.Companion.m2283getUnspecifiedF1C5BW0();
        }
        float lineTop = layoutResult.getLineTop(lineForOffset);
        long m2260constructorimpl = Offset.m2260constructorimpl((Float.floatToRawIntBits(((layoutResult.getLineBottom(lineForOffset) - lineTop) / 2) + lineTop) & 4294967295L) | (Float.floatToRawIntBits(H) << 32));
        LayoutCoordinates textLayoutNodeCoordinates = textLayoutState.getTextLayoutNodeCoordinates();
        if (textLayoutNodeCoordinates != null) {
            if (!textLayoutNodeCoordinates.isAttached()) {
                textLayoutNodeCoordinates = null;
            }
            if (textLayoutNodeCoordinates != null) {
                m2260constructorimpl = TextLayoutStateKt.m1304coerceIn3MmeM6k(m2260constructorimpl, SelectionManagerKt.visibleBounds(textLayoutNodeCoordinates));
            }
        }
        return TextLayoutStateKt.m1306fromTextLayoutToCoreUv8p0NA(textLayoutState, m2260constructorimpl);
    }
}
