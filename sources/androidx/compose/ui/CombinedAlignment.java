package androidx.compose.ui;

import androidx.compose.ui.Alignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/CombinedAlignment\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,279:1\n54#2:280\n59#2:282\n85#3:281\n90#3:283\n80#3:285\n32#4:284\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/CombinedAlignment\n*L\n115#1:280\n116#1:282\n115#1:281\n116#1:283\n117#1:285\n117#1:284\n*E\n"})
/* loaded from: classes.dex */
final class CombinedAlignment implements Alignment {

    @k
    private final Alignment.Horizontal horizontal;

    @k
    private final Alignment.Vertical vertical;

    public CombinedAlignment(@k Alignment.Horizontal horizontal, @k Alignment.Vertical vertical) {
        this.horizontal = horizontal;
        this.vertical = vertical;
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo2085alignKFBX0sM(long j11, long j12, @k LayoutDirection layoutDirection) {
        return IntOffset.m5237constructorimpl((this.horizontal.align((int) (j11 >> 32), (int) (j12 >> 32), layoutDirection) << 32) | (this.vertical.align((int) (j11 & 4294967295L), (int) (j12 & 4294967295L)) & 4294967295L));
    }
}
