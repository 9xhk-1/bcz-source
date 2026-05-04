package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.InlineClassHelperKt;
import androidx.compose.ui.unit.Density;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@u0({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n+ 2 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,189:1\n148#2:190\n57#3:191\n61#3:194\n60#4:192\n70#4:195\n22#5:193\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl\n*L\n153#1:190\n154#1:191\n154#1:194\n154#1:192\n154#1:195\n154#1:193\n*E\n"})
@RequiresApi(29)
/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi29Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;

    @m80.k
    public static final PlatformMagnifierFactoryApi29Impl INSTANCE = new PlatformMagnifierFactoryApi29Impl();
    private static final boolean canUpdateZoom = true;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 1)
    @u0({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,189:1\n273#2:190\n65#3:191\n69#3:194\n65#3:196\n69#3:199\n60#4:192\n70#4:195\n60#4:197\n70#4:200\n22#5:193\n22#5:198\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi29Impl$PlatformMagnifierImpl\n*L\n180#1:190\n181#1:191\n181#1:194\n184#1:196\n184#1:199\n181#1:192\n181#1:195\n184#1:197\n184#1:200\n181#1:193\n184#1:198\n*E\n"})
    @RequiresApi(29)
    public static final class PlatformMagnifierImpl extends PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl {
        public static final int $stable = 0;

        public PlatformMagnifierImpl(@m80.k Magnifier magnifier) {
            super(magnifier);
        }

        @Override // androidx.compose.foundation.PlatformMagnifierFactoryApi28Impl.PlatformMagnifierImpl, androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo326updateWko1d7g(long j11, long j12, float f11) {
            if (!Float.isNaN(f11)) {
                getMagnifier().setZoom(f11);
            }
            if ((9223372034707292159L & j12) != InlineClassHelperKt.UnspecifiedPackedFloats) {
                getMagnifier().show(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)), Float.intBitsToFloat((int) (j12 >> 32)), Float.intBitsToFloat((int) (j12 & 4294967295L)));
            } else {
                getMagnifier().show(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
            }
        }
    }

    private PlatformMagnifierFactoryApi29Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    @m80.k
    /* renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo327createnHHXs2Y(@m80.k View view, boolean z11, long j11, float f11, float f12, boolean z12, @m80.k Density density, float f13) {
        if (z11) {
            return new PlatformMagnifierImpl(new Magnifier(view));
        }
        long mo378toSizeXkaWNTQ = density.mo378toSizeXkaWNTQ(j11);
        float mo377toPx0680j_4 = density.mo377toPx0680j_4(f11);
        float mo377toPx0680j_42 = density.mo377toPx0680j_4(f12);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (mo378toSizeXkaWNTQ != InlineClassHelperKt.UnspecifiedPackedFloats) {
            builder.setSize(c10.d.L0(Float.intBitsToFloat((int) (mo378toSizeXkaWNTQ >> 32))), c10.d.L0(Float.intBitsToFloat((int) (mo378toSizeXkaWNTQ & 4294967295L))));
        }
        if (!Float.isNaN(mo377toPx0680j_4)) {
            builder.setCornerRadius(mo377toPx0680j_4);
        }
        if (!Float.isNaN(mo377toPx0680j_42)) {
            builder.setElevation(mo377toPx0680j_42);
        }
        if (!Float.isNaN(f13)) {
            builder.setInitialZoom(f13);
        }
        builder.setClippingEnabled(z12);
        return new PlatformMagnifierImpl(builder.build());
    }
}
