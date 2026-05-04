package androidx.compose.foundation;

import android.view.View;
import android.widget.Magnifier;
import androidx.annotation.RequiresApi;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.IntSize;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
@RequiresApi(28)
/* loaded from: classes.dex */
public final class PlatformMagnifierFactoryApi28Impl implements PlatformMagnifierFactory {
    public static final int $stable = 0;

    @m80.k
    public static final PlatformMagnifierFactoryApi28Impl INSTANCE = new PlatformMagnifierFactoryApi28Impl();
    private static final boolean canUpdateZoom = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nPlatformMagnifier.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,189:1\n30#2:190\n80#3:191\n60#3:193\n70#3:196\n65#4:192\n69#4:195\n22#5:194\n*S KotlinDebug\n*F\n+ 1 PlatformMagnifier.android.kt\nandroidx/compose/foundation/PlatformMagnifierFactoryApi28Impl$PlatformMagnifierImpl\n*L\n107#1:190\n107#1:191\n114#1:193\n114#1:196\n114#1:192\n114#1:195\n114#1:194\n*E\n"})
    @RequiresApi(28)
    public static class PlatformMagnifierImpl implements PlatformMagnifier {
        public static final int $stable = 8;

        @m80.k
        private final Magnifier magnifier;

        public PlatformMagnifierImpl(@m80.k Magnifier magnifier) {
            this.magnifier = magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void dismiss() {
            this.magnifier.dismiss();
        }

        @m80.k
        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* renamed from: getSize-YbymL2g */
        public long mo325getSizeYbymL2g() {
            return IntSize.m5281constructorimpl((this.magnifier.getHeight() & 4294967295L) | (this.magnifier.getWidth() << 32));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        /* renamed from: update-Wko1d7g */
        public void mo326updateWko1d7g(long j11, long j12, float f11) {
            this.magnifier.show(Float.intBitsToFloat((int) (j11 >> 32)), Float.intBitsToFloat((int) (j11 & 4294967295L)));
        }

        @Override // androidx.compose.foundation.PlatformMagnifier
        public void updateContent() {
            this.magnifier.update();
        }
    }

    private PlatformMagnifierFactoryApi28Impl() {
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    public boolean getCanUpdateZoom() {
        return canUpdateZoom;
    }

    @Override // androidx.compose.foundation.PlatformMagnifierFactory
    @m80.k
    /* renamed from: create-nHHXs2Y */
    public PlatformMagnifierImpl mo327createnHHXs2Y(@m80.k View view, boolean z11, long j11, float f11, float f12, boolean z12, @m80.k Density density, float f13) {
        return new PlatformMagnifierImpl(new Magnifier(view));
    }
}
