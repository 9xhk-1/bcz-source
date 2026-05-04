package androidx.compose.foundation.text.selection;

import a00.g0;
import a00.h0;
import androidx.compose.foundation.text.TextLayoutResultProxy;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.text.TextRange;
import androidx.compose.ui.text.input.CommitTextCommand;
import androidx.compose.ui.text.input.EditCommand;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.SetSelectionCommand;
import androidx.compose.ui.text.input.TextFieldValue;
import java.util.List;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextPreparedSelection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/BaseTextPreparedSelection\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,401:1\n1#2:402\n74#3,7:403\n74#3,7:410\n61#4:417\n70#5:418\n53#5,3:421\n22#6:419\n30#7:420\n*S KotlinDebug\n*F\n+ 1 TextPreparedSelection.kt\nandroidx/compose/foundation/text/selection/TextFieldPreparedSelection\n*L\n380#1:403,7\n383#1:410,7\n397#1:417\n397#1:418\n398#1:421,3\n397#1:419\n398#1:420\n*E\n"})
/* loaded from: classes.dex */
public final class TextFieldPreparedSelection extends BaseTextPreparedSelection<TextFieldPreparedSelection> {
    public static final int $stable = 8;

    @k
    private final TextFieldValue currentValue;

    @l
    private final TextLayoutResultProxy layoutResultProxy;

    public /* synthetic */ TextFieldPreparedSelection(TextFieldValue textFieldValue, OffsetMapping offsetMapping, TextLayoutResultProxy textLayoutResultProxy, TextPreparedSelectionState textPreparedSelectionState, int i11, v vVar) {
        this(textFieldValue, (i11 & 2) != 0 ? OffsetMapping.Companion.getIdentity() : offsetMapping, textLayoutResultProxy, (i11 & 8) != 0 ? new TextPreparedSelectionState() : textPreparedSelectionState);
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0013, code lost:
    
        if (r2 == null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy r9, int r10) {
        /*
            r8 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r9.getInnerTextFieldCoordinates()
            if (r0 == 0) goto L15
            androidx.compose.ui.layout.LayoutCoordinates r1 = r9.getDecorationBoxCoordinates()
            r2 = 0
            if (r1 == 0) goto L13
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
        L13:
            if (r2 != 0) goto L1b
        L15:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1b:
            androidx.compose.ui.text.input.OffsetMapping r0 = r8.getOffsetMapping()
            androidx.compose.ui.text.input.TextFieldValue r1 = r8.currentValue
            long r3 = r1.m4807getSelectiond9O1mEE()
            int r1 = androidx.compose.ui.text.TextRange.m4554getEndimpl(r3)
            int r0 = r0.originalToTransformed(r1)
            androidx.compose.ui.text.TextLayoutResult r1 = r9.getValue()
            androidx.compose.ui.geometry.Rect r0 = r1.getCursorRect(r0)
            float r1 = r0.getLeft()
            float r0 = r0.getTop()
            long r2 = r2.m2301getSizeNHjbRc()
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            float r10 = (float) r10
            float r2 = r2 * r10
            float r0 = r0 + r2
            androidx.compose.ui.text.input.OffsetMapping r10 = r8.getOffsetMapping()
            androidx.compose.ui.text.TextLayoutResult r9 = r9.getValue()
            int r1 = java.lang.Float.floatToRawIntBits(r1)
            long r1 = (long) r1
            int r0 = java.lang.Float.floatToRawIntBits(r0)
            long r6 = (long) r0
            r0 = 32
            long r0 = r1 << r0
            long r2 = r6 & r4
            long r0 = r0 | r2
            long r0 = androidx.compose.ui.geometry.Offset.m2260constructorimpl(r0)
            int r9 = r9.m4529getOffsetForPositionk4lQ0M(r0)
            int r9 = r10.transformedToOriginal(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.selection.TextFieldPreparedSelection.jumpByPagesOffset(androidx.compose.foundation.text.TextLayoutResultProxy, int):int");
    }

    @l
    public final List<EditCommand> deleteIfSelectedOr(@k x00.l<? super TextFieldPreparedSelection, ? extends EditCommand> lVar) {
        if (!TextRange.m4553getCollapsedimpl(m1432getSelectiond9O1mEE())) {
            return h0.Q(new CommitTextCommand("", 0), new SetSelectionCommand(TextRange.m4557getMinimpl(m1432getSelectiond9O1mEE()), TextRange.m4557getMinimpl(m1432getSelectiond9O1mEE())));
        }
        EditCommand invoke = lVar.invoke(this);
        if (invoke != null) {
            return g0.l(invoke);
        }
        return null;
    }

    @k
    public final TextFieldValue getCurrentValue() {
        return this.currentValue;
    }

    @l
    public final TextLayoutResultProxy getLayoutResultProxy() {
        return this.layoutResultProxy;
    }

    @k
    public final TextFieldValue getValue() {
        return TextFieldValue.m4802copy3r_uNRQ$default(this.currentValue, getAnnotatedString(), m1432getSelectiond9O1mEE(), (TextRange) null, 4, (Object) null);
    }

    @k
    public final TextFieldPreparedSelection moveCursorDownByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, 1));
        }
        kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    @k
    public final TextFieldPreparedSelection moveCursorUpByPage() {
        TextLayoutResultProxy textLayoutResultProxy;
        if (getText$foundation_release().length() > 0 && (textLayoutResultProxy = this.layoutResultProxy) != null) {
            setCursor(jumpByPagesOffset(textLayoutResultProxy, -1));
        }
        kotlin.jvm.internal.g0.n(this, "null cannot be cast to non-null type T of androidx.compose.foundation.text.selection.BaseTextPreparedSelection");
        return this;
    }

    public TextFieldPreparedSelection(@k TextFieldValue textFieldValue, @k OffsetMapping offsetMapping, @l TextLayoutResultProxy textLayoutResultProxy, @k TextPreparedSelectionState textPreparedSelectionState) {
        super(textFieldValue.getAnnotatedString(), textFieldValue.m4807getSelectiond9O1mEE(), textLayoutResultProxy != null ? textLayoutResultProxy.getValue() : null, offsetMapping, textPreparedSelectionState, null);
        this.currentValue = textFieldValue;
        this.layoutResultProxy = textLayoutResultProxy;
    }
}
