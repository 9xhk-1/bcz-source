package androidx.compose.foundation.text;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.text.TextLayoutResult;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nTextLayoutResultProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,133:1\n30#2:134\n53#3,3:135\n70#3:139\n70#3:142\n60#3:145\n60#3:148\n69#4:138\n69#4:141\n65#4:144\n65#4:147\n22#5:140\n22#5:143\n22#5:146\n22#5:149\n1#6:150\n*S KotlinDebug\n*F\n+ 1 TextLayoutResultProxy.kt\nandroidx/compose/foundation/text/TextLayoutResultProxy\n*L\n60#1:134\n60#1:135,3\n61#1:139\n75#1:142\n76#1:145\n77#1:148\n61#1:138\n75#1:141\n76#1:144\n77#1:147\n61#1:140\n75#1:143\n76#1:146\n77#1:149\n*E\n"})
/* loaded from: classes.dex */
public final class TextLayoutResultProxy {
    public static final int $stable = 8;

    @l
    private LayoutCoordinates decorationBoxCoordinates;

    @l
    private LayoutCoordinates innerTextFieldCoordinates;

    @k
    private final TextLayoutResult value;

    public TextLayoutResultProxy(@k TextLayoutResult textLayoutResult, @l LayoutCoordinates layoutCoordinates, @l LayoutCoordinates layoutCoordinates2) {
        this.value = textLayoutResult;
        this.innerTextFieldCoordinates = layoutCoordinates;
        this.decorationBoxCoordinates = layoutCoordinates2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if (r2 == null) goto L11;
     */
    /* renamed from: coercedInVisibleBoundsOfInputText-MK-Hz9U, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final long m1164coercedInVisibleBoundsOfInputTextMKHz9U(long r6) {
        /*
            r5 = this;
            androidx.compose.ui.layout.LayoutCoordinates r0 = r5.innerTextFieldCoordinates
            if (r0 == 0) goto L1e
            boolean r1 = r0.isAttached()
            if (r1 == 0) goto L16
            androidx.compose.ui.layout.LayoutCoordinates r1 = r5.decorationBoxCoordinates
            r2 = 0
            if (r1 == 0) goto L1c
            r3 = 0
            r4 = 2
            androidx.compose.ui.geometry.Rect r2 = androidx.compose.ui.layout.LayoutCoordinates.localBoundingBoxOf$default(r1, r0, r3, r4, r2)
            goto L1c
        L16:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L1c:
            if (r2 != 0) goto L24
        L1e:
            androidx.compose.ui.geometry.Rect$Companion r0 = androidx.compose.ui.geometry.Rect.Companion
            androidx.compose.ui.geometry.Rect r2 = r0.getZero()
        L24:
            long r6 = androidx.compose.foundation.text.TextLayoutResultProxyKt.m1170access$coerceIn3MmeM6k(r6, r2)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.TextLayoutResultProxy.m1164coercedInVisibleBoundsOfInputTextMKHz9U(long):long");
    }

    public static /* synthetic */ int getLineEnd$default(TextLayoutResultProxy textLayoutResultProxy, int i11, boolean z11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            z11 = false;
        }
        return textLayoutResultProxy.getLineEnd(i11, z11);
    }

    /* renamed from: getOffsetForPosition-3MmeM6k$default, reason: not valid java name */
    public static /* synthetic */ int m1165getOffsetForPosition3MmeM6k$default(TextLayoutResultProxy textLayoutResultProxy, long j11, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return textLayoutResultProxy.m1166getOffsetForPosition3MmeM6k(j11, z11);
    }

    @l
    public final LayoutCoordinates getDecorationBoxCoordinates() {
        return this.decorationBoxCoordinates;
    }

    @l
    public final LayoutCoordinates getInnerTextFieldCoordinates() {
        return this.innerTextFieldCoordinates;
    }

    public final int getLineEnd(int i11, boolean z11) {
        return this.value.getLineEnd(i11, z11);
    }

    public final int getLineForVerticalPosition(float f11) {
        return this.value.getLineForVerticalPosition(Float.intBitsToFloat((int) (m1168translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m1164coercedInVisibleBoundsOfInputTextMKHz9U(Offset.m2260constructorimpl((Float.floatToRawIntBits(0.0f) << 32) | (Float.floatToRawIntBits(f11) & 4294967295L)))) & 4294967295L)));
    }

    /* renamed from: getOffsetForPosition-3MmeM6k, reason: not valid java name */
    public final int m1166getOffsetForPosition3MmeM6k(long j11, boolean z11) {
        if (z11) {
            j11 = m1164coercedInVisibleBoundsOfInputTextMKHz9U(j11);
        }
        return this.value.m4529getOffsetForPositionk4lQ0M(m1168translateDecorationToInnerCoordinatesMKHz9U$foundation_release(j11));
    }

    @k
    public final TextLayoutResult getValue() {
        return this.value;
    }

    /* renamed from: isPositionOnText-k-4lQ0M, reason: not valid java name */
    public final boolean m1167isPositionOnTextk4lQ0M(long j11) {
        long m1168translateDecorationToInnerCoordinatesMKHz9U$foundation_release = m1168translateDecorationToInnerCoordinatesMKHz9U$foundation_release(m1164coercedInVisibleBoundsOfInputTextMKHz9U(j11));
        int lineForVerticalPosition = this.value.getLineForVerticalPosition(Float.intBitsToFloat((int) (4294967295L & m1168translateDecorationToInnerCoordinatesMKHz9U$foundation_release)));
        int i11 = (int) (m1168translateDecorationToInnerCoordinatesMKHz9U$foundation_release >> 32);
        return Float.intBitsToFloat(i11) >= this.value.getLineLeft(lineForVerticalPosition) && Float.intBitsToFloat(i11) <= this.value.getLineRight(lineForVerticalPosition);
    }

    public final void setDecorationBoxCoordinates(@l LayoutCoordinates layoutCoordinates) {
        this.decorationBoxCoordinates = layoutCoordinates;
    }

    public final void setInnerTextFieldCoordinates(@l LayoutCoordinates layoutCoordinates) {
        this.innerTextFieldCoordinates = layoutCoordinates;
    }

    /* renamed from: translateDecorationToInnerCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m1168translateDecorationToInnerCoordinatesMKHz9U$foundation_release(long j11) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return j11;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return j11;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j11 : layoutCoordinates2.mo3866localPositionOfR5De75A(layoutCoordinates3, j11);
    }

    /* renamed from: translateInnerToDecorationCoordinates-MK-Hz9U$foundation_release, reason: not valid java name */
    public final long m1169translateInnerToDecorationCoordinatesMKHz9U$foundation_release(long j11) {
        LayoutCoordinates layoutCoordinates;
        LayoutCoordinates layoutCoordinates2 = this.innerTextFieldCoordinates;
        if (layoutCoordinates2 == null) {
            return j11;
        }
        if (!layoutCoordinates2.isAttached()) {
            layoutCoordinates2 = null;
        }
        if (layoutCoordinates2 == null || (layoutCoordinates = this.decorationBoxCoordinates) == null) {
            return j11;
        }
        LayoutCoordinates layoutCoordinates3 = layoutCoordinates.isAttached() ? layoutCoordinates : null;
        return layoutCoordinates3 == null ? j11 : layoutCoordinates3.mo3866localPositionOfR5De75A(layoutCoordinates2, j11);
    }

    public /* synthetic */ TextLayoutResultProxy(TextLayoutResult textLayoutResult, LayoutCoordinates layoutCoordinates, LayoutCoordinates layoutCoordinates2, int i11, v vVar) {
        this(textLayoutResult, (i11 & 2) != 0 ? null : layoutCoordinates, (i11 & 4) != 0 ? null : layoutCoordinates2);
    }
}
