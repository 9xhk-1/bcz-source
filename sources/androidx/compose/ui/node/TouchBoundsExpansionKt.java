package androidx.compose.ui.node;

import androidx.compose.ui.internal.InlineClassHelperKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTouchBoundsExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/ui/internal/InlineClassHelperKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,248:1\n102#2,5:249\n102#2,5:254\n102#2,5:259\n102#2,5:264\n113#3:269\n113#3:270\n113#3:271\n113#3:272\n*S KotlinDebug\n*F\n+ 1 TouchBoundsExpansion.kt\nandroidx/compose/ui/node/TouchBoundsExpansionKt\n*L\n215#1:249,5\n218#1:254,5\n221#1:259,5\n224#1:264,5\n241#1:269\n242#1:270\n243#1:271\n244#1:272\n*E\n"})
/* loaded from: classes2.dex */
public final class TouchBoundsExpansionKt {
    @k
    /* renamed from: DpTouchBoundsExpansion-a9UjIt4, reason: not valid java name */
    public static final DpTouchBoundsExpansion m4214DpTouchBoundsExpansiona9UjIt4(float f11, float f12, float f13, float f14) {
        return new DpTouchBoundsExpansion(f11, f12, f13, f14, true, null);
    }

    /* renamed from: DpTouchBoundsExpansion-a9UjIt4$default, reason: not valid java name */
    public static /* synthetic */ DpTouchBoundsExpansion m4215DpTouchBoundsExpansiona9UjIt4$default(float f11, float f12, float f13, float f14, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 2) != 0) {
            f12 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 4) != 0) {
            f13 = Dp.m5115constructorimpl(0);
        }
        if ((i11 & 8) != 0) {
            f14 = Dp.m5115constructorimpl(0);
        }
        return m4214DpTouchBoundsExpansiona9UjIt4(f11, f12, f13, f14);
    }

    public static final long TouchBoundsExpansion(int i11, int i12, int i13, int i14) {
        if (!(i11 >= 0 && i11 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Start must be in the range of 0 .. 32767");
        }
        if (!(i12 >= 0 && i12 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Top must be in the range of 0 .. 32767");
        }
        if (!(i13 >= 0 && i13 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("End must be in the range of 0 .. 32767");
        }
        if (!(i14 >= 0 && i14 < 32768)) {
            InlineClassHelperKt.throwIllegalArgumentException("Bottom must be in the range of 0 .. 32767");
        }
        return TouchBoundsExpansion.m4200constructorimpl(TouchBoundsExpansion.Companion.pack$ui_release(i11, i12, i13, i14, true));
    }

    public static /* synthetic */ long TouchBoundsExpansion$default(int i11, int i12, int i13, int i14, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            i11 = 0;
        }
        if ((i15 & 2) != 0) {
            i12 = 0;
        }
        if ((i15 & 4) != 0) {
            i13 = 0;
        }
        if ((i15 & 8) != 0) {
            i14 = 0;
        }
        return TouchBoundsExpansion(i11, i12, i13, i14);
    }
}
