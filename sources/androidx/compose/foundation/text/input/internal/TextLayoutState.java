package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.relocation.BringIntoViewRequester;
import androidx.compose.foundation.relocation.BringIntoViewRequesterKt;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.Dp;
import androidx.compose.ui.unit.LayoutDirection;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nTextLayoutState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,250:1\n113#2:251\n85#3:252\n85#3:253\n113#3,2:254\n85#3:256\n113#3,2:257\n85#3:259\n113#3,2:260\n85#3:262\n113#3,2:263\n69#4:265\n65#4:268\n65#4:271\n70#5:266\n60#5:269\n60#5:272\n22#6:267\n22#6:270\n22#6:273\n*S KotlinDebug\n*F\n+ 1 TextLayoutState.kt\nandroidx/compose/foundation/text/input/internal/TextLayoutState\n*L\n71#1:251\n45#1:252\n66#1:253\n66#1:254,2\n67#1:256\n67#1:257,2\n68#1:259\n68#1:260,2\n71#1:262\n71#1:263,2\n174#1:265\n175#1:268\n176#1:271\n174#1:266\n175#1:269\n176#1:272\n174#1:267\n175#1:270\n176#1:273\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayoutState {
    public static final int $stable = 8;

    @m80.k
    private final BringIntoViewRequester bringIntoViewRequester;

    @m80.k
    private final MutableState coreNodeCoordinates$delegate;

    @m80.k
    private final MutableState decoratorNodeCoordinates$delegate;

    @m80.k
    private TextFieldLayoutStateCache layoutCache;

    @m80.k
    private final TextFieldLayoutStateCache layoutResult$delegate;

    @m80.k
    private final MutableState minHeightForSingleLineField$delegate;

    @m80.l
    private x00.p<? super Density, ? super x00.a<TextLayoutResult>, g2> onTextLayout;

    @m80.k
    private final MutableState textLayoutNodeCoordinates$delegate;

    public TextLayoutState() {
        TextFieldLayoutStateCache textFieldLayoutStateCache = new TextFieldLayoutStateCache();
        this.layoutCache = textFieldLayoutStateCache;
        this.layoutResult$delegate = textFieldLayoutStateCache;
        this.textLayoutNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.coreNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.decoratorNodeCoordinates$delegate = SnapshotStateKt.mutableStateOf(null, SnapshotStateKt.neverEqualPolicy());
        this.minHeightForSingleLineField$delegate = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Dp.m5113boximpl(Dp.m5115constructorimpl(0)), null, 2, null);
        this.bringIntoViewRequester = BringIntoViewRequesterKt.BringIntoViewRequester();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m1297getOffsetForPosition3MmeM6k$default(TextLayoutState textLayoutState, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return textLayoutState.m1300getOffsetForPosition3MmeM6k(j11, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0020, code lost:
    
        if (r2 == null) goto L11;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U$foundation_release, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long m1298coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.getTextLayoutNodeCoordinates()
            if (r0 == 0) goto L22
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L1a
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.getDecoratorNodeCoordinates()
            r2 = 0
            if (r1 == 0) goto L20
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L20
        L1a:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L20:
            if (r2 != 0) goto L28
        L22:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L28:
            long r6 = androidx.compose.foundation.text.input.internal.TextLayoutStateKt.m1304coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.input.internal.TextLayoutState.m1298coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(long):long");
    }

    @m80.k
    public final BringIntoViewRequester getBringIntoViewRequester() {
        return this.bringIntoViewRequester;
    }

    @m80.l
    public final LayoutCoordinates getCoreNodeCoordinates() {
        return (LayoutCoordinates) this.coreNodeCoordinates$delegate.getValue();
    }

    @m80.l
    public final LayoutCoordinates getDecoratorNodeCoordinates() {
        return (LayoutCoordinates) this.decoratorNodeCoordinates$delegate.getValue();
    }

    @m80.l
    public final TextLayoutResult getLayoutResult() {
        return this.layoutResult$delegate.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: getMinHeightForSingleLineField-D9Ej5fM, reason: not valid java name */
    public final float m1299getMinHeightForSingleLineFieldD9Ej5fM() {
        return ((Dp) this.minHeightForSingleLineField$delegate.getValue()).m5129unboximpl();
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m1300getOffsetForPosition3MmeM6k(long j11, boolean z11) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return -1;
        }
        if (z11) {
            j11 = m1298coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j11);
        }
        return layoutResult.m4529getOffsetForPositionk4lQ0M(TextLayoutStateKt.m1305fromDecorationToTextLayoutUv8p0NA(this, j11));
    }

    @m80.l
    public final x00.p<Density, x00.a<TextLayoutResult>, g2> getOnTextLayout() {
        return this.onTextLayout;
    }

    @m80.l
    public final LayoutCoordinates getTextLayoutNodeCoordinates() {
        return (LayoutCoordinates) this.textLayoutNodeCoordinates$delegate.getValue();
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m1301isPositionOnTextk4lQ0M(long j11) {
        TextLayoutResult layoutResult = getLayoutResult();
        if (layoutResult == null) {
            return false;
        }
        long m1305fromDecorationToTextLayoutUv8p0NA = TextLayoutStateKt.m1305fromDecorationToTextLayoutUv8p0NA(this, m1298coercedInVisibleBoundsOfInputTextMKHz9U$foundation_release(j11));
        int lineForVerticalPosition = layoutResult.getLineForVerticalPosition(Float.intBitsToFloat((int) (4294967295L & m1305fromDecorationToTextLayoutUv8p0NA)));
        int i11 = (int) (m1305fromDecorationToTextLayoutUv8p0NA >> 32);
        return Float.intBitsToFloat(i11) >= layoutResult.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i11) <= layoutResult.getLineRight(lineForVerticalPosition);
    }

    @m80.k
    /* renamed from: layoutWithNewMeasureInputs--hBUhpc, reason: not valid java name */
    public final TextLayoutResult m1302layoutWithNewMeasureInputshBUhpc(@m80.k Density density, @m80.k LayoutDirection layoutDirection, @m80.k FontFamily.Resolver resolver, long j11) {
        TextLayoutResult m1291layoutWithNewMeasureInputshBUhpc = this.layoutCache.m1291layoutWithNewMeasureInputshBUhpc(density, layoutDirection, resolver, j11);
        x00.p<? super Density, ? super x00.a<TextLayoutResult>, g2> pVar = this.onTextLayout;
        if (pVar != null) {
            pVar.invoke(density, new x00.a<TextLayoutResult>() { // from class: androidx.compose.foundation.text.input.internal.TextLayoutState$layoutWithNewMeasureInputs$1$textLayoutProvider$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // x00.a
                public final TextLayoutResult invoke() {
                    TextFieldLayoutStateCache textFieldLayoutStateCache;
                    textFieldLayoutStateCache = TextLayoutState.this.layoutCache;
                    return textFieldLayoutStateCache.getValue();
                }
            });
        }
        return m1291layoutWithNewMeasureInputshBUhpc;
    }

    public final void setCoreNodeCoordinates(@m80.l LayoutCoordinates layoutCoordinates) {
        this.coreNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void setDecoratorNodeCoordinates(@m80.l LayoutCoordinates layoutCoordinates) {
        this.decoratorNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    /* renamed from: setMinHeightForSingleLineField-0680j_4, reason: not valid java name */
    public final void m1303setMinHeightForSingleLineField0680j_4(float f11) {
        this.minHeightForSingleLineField$delegate.setValue(Dp.m5113boximpl(f11));
    }

    public final void setOnTextLayout(@m80.l x00.p<? super Density, ? super x00.a<TextLayoutResult>, g2> pVar) {
        this.onTextLayout = pVar;
    }

    public final void setTextLayoutNodeCoordinates(@m80.l LayoutCoordinates layoutCoordinates) {
        this.textLayoutNodeCoordinates$delegate.setValue(layoutCoordinates);
    }

    public final void updateNonMeasureInputs(@m80.k TransformedTextFieldState transformedTextFieldState, @m80.k TextStyle textStyle, boolean z11, boolean z12, @m80.k KeyboardOptions keyboardOptions) {
        this.layoutCache.updateNonMeasureInputs(transformedTextFieldState, textStyle, z11, z12, keyboardOptions);
    }
}
