package com.baicizhan.main.customview.compose;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntRect;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.PopupPositionProvider;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nCommonWidget.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonWidget.kt\ncom/baicizhan/main/customview/compose/AlignmentOffsetPositionProvider\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n*L\n1#1,183:1\n32#2:184\n32#2:194\n32#2:196\n32#2:198\n80#3:185\n80#3:187\n85#3:189\n90#3:191\n80#3:193\n80#3:195\n80#3:197\n80#3:199\n30#4:186\n30#4:192\n54#5:188\n59#5:190\n*S KotlinDebug\n*F\n+ 1 CommonWidget.kt\ncom/baicizhan/main/customview/compose/AlignmentOffsetPositionProvider\n*L\n137#1:184\n153#1:194\n159#1:196\n162#1:198\n137#1:185\n142#1:187\n148#1:189\n148#1:191\n148#1:193\n153#1:195\n159#1:197\n162#1:199\n142#1:186\n148#1:192\n148#1:188\n148#1:190\n*E\n"})
/* loaded from: classes4.dex */
public final class a implements PopupPositionProvider {

    /* renamed from: c, reason: collision with root package name */
    public static final int f20265c = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Alignment f20266a;

    /* renamed from: b, reason: collision with root package name */
    public final long f20267b;

    public /* synthetic */ a(Alignment alignment, long j11, kotlin.jvm.internal.v vVar) {
        this(alignment, j11);
    }

    @m80.k
    public final Alignment a() {
        return this.f20266a;
    }

    public final long b() {
        return this.f20267b;
    }

    @Override // androidx.compose.ui.window.PopupPositionProvider
    /* renamed from: calculatePosition-llwVHH4 */
    public long mo346calculatePositionllwVHH4(@m80.k IntRect anchorBounds, long j11, @m80.k LayoutDirection layoutDirection, long j12) {
        g0.p(anchorBounds, "anchorBounds");
        g0.p(layoutDirection, "layoutDirection");
        long j13 = 0;
        long m5237constructorimpl = IntOffset.m5237constructorimpl((j13 & 4294967295L) | (j13 << 32));
        Alignment alignment = this.f20266a;
        IntSize.Companion companion = IntSize.Companion;
        long mo2085alignKFBX0sM = alignment.mo2085alignKFBX0sM(companion.m5291getZeroYbymL2g(), IntSize.m5281constructorimpl((anchorBounds.getHeight() & 4294967295L) | (anchorBounds.getWidth() << 32)), layoutDirection);
        long mo2085alignKFBX0sM2 = this.f20266a.mo2085alignKFBX0sM(companion.m5291getZeroYbymL2g(), IntSize.m5281constructorimpl((((int) (j12 & 4294967295L)) & 4294967295L) | (((int) (j12 >> 32)) << 32)), layoutDirection);
        return IntOffset.m5247plusqkQi6aY(IntOffset.m5246minusqkQi6aY(IntOffset.m5247plusqkQi6aY(IntOffset.m5247plusqkQi6aY(m5237constructorimpl, IntOffset.m5237constructorimpl((anchorBounds.getTop() & 4294967295L) | (anchorBounds.getLeft() << 32))), mo2085alignKFBX0sM), IntOffset.m5237constructorimpl((IntOffset.m5244getYimpl(mo2085alignKFBX0sM2) & 4294967295L) | (IntOffset.m5243getXimpl(mo2085alignKFBX0sM2) << 32))), IntOffset.m5237constructorimpl((IntOffset.m5244getYimpl(this.f20267b) & 4294967295L) | ((IntOffset.m5243getXimpl(this.f20267b) * (layoutDirection == LayoutDirection.Ltr ? 1 : -1)) << 32)));
    }

    public a(Alignment alignment, long j11) {
        g0.p(alignment, "alignment");
        this.f20266a = alignment;
        this.f20267b = j11;
    }
}
