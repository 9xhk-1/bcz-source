package androidx.compose.foundation.layout;

import android.graphics.Insets;
import androidx.annotation.RequiresApi;
import androidx.compose.foundation.layout.WindowInsetsSides;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.Velocity;
import androidx.compose.ui.unit.VelocityKt;
import g10.u;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@RequiresApi(30)
/* loaded from: classes.dex */
interface SideCalculator {

    @m80.k
    public static final Companion Companion = Companion.$$INSTANCE;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @m80.k
        private static final SideCalculator$Companion$LeftSideCalculator$1 LeftSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$LeftSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i11) {
                int i12;
                int i13;
                int i14;
                Insets of2;
                i12 = insets.top;
                i13 = insets.right;
                i14 = insets.bottom;
                of2 = Insets.of(i11, i12, i13, i14);
                return of2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo754consumedOffsetsMKHz9U(long j11) {
                return Offset.m2260constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo755consumedVelocityQWom1Mo(long j11, float f11) {
                return VelocityKt.Velocity(Velocity.m5353getXimpl(j11) - f11, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i11;
                i11 = insets.left;
                return i11;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f11, float f12) {
                return f11;
            }
        };

        @m80.k
        private static final SideCalculator$Companion$TopSideCalculator$1 TopSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$TopSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i11) {
                int i12;
                int i13;
                int i14;
                Insets of2;
                i12 = insets.left;
                i13 = insets.right;
                i14 = insets.bottom;
                of2 = Insets.of(i12, i11, i13, i14);
                return of2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo754consumedOffsetsMKHz9U(long j11) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j11 & 4294967295L));
                return Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo755consumedVelocityQWom1Mo(long j11, float f11) {
                return VelocityKt.Velocity(0.0f, Velocity.m5354getYimpl(j11) - f11);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i11;
                i11 = insets.top;
                return i11;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f11, float f12) {
                return f12;
            }
        };

        @m80.k
        private static final SideCalculator$Companion$RightSideCalculator$1 RightSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$RightSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i11) {
                int i12;
                int i13;
                int i14;
                Insets of2;
                i12 = insets.left;
                i13 = insets.top;
                i14 = insets.bottom;
                of2 = Insets.of(i12, i13, i11, i14);
                return of2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo754consumedOffsetsMKHz9U(long j11) {
                return Offset.m2260constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32))) << 32) | (Float.floatToRawIntBits(0.0f) & 4294967295L));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo755consumedVelocityQWom1Mo(long j11, float f11) {
                return VelocityKt.Velocity(Velocity.m5353getXimpl(j11) + f11, 0.0f);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f11, float f12) {
                return -f11;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i11;
                i11 = insets.right;
                return i11;
            }
        };

        @m80.k
        private static final SideCalculator$Companion$BottomSideCalculator$1 BottomSideCalculator = new SideCalculator() { // from class: androidx.compose.foundation.layout.SideCalculator$Companion$BottomSideCalculator$1
            @Override // androidx.compose.foundation.layout.SideCalculator
            public Insets adjustInsets(Insets insets, int i11) {
                int i12;
                int i13;
                int i14;
                Insets of2;
                i12 = insets.left;
                i13 = insets.top;
                i14 = insets.right;
                of2 = Insets.of(i12, i13, i14, i11);
                return of2;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedOffsets-MK-Hz9U */
            public long mo754consumedOffsetsMKHz9U(long j11) {
                float intBitsToFloat = Float.intBitsToFloat((int) (j11 & 4294967295L));
                return Offset.m2260constructorimpl((Float.floatToRawIntBits(intBitsToFloat) & 4294967295L) | (Float.floatToRawIntBits(0.0f) << 32));
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            /* renamed from: consumedVelocity-QWom1Mo */
            public long mo755consumedVelocityQWom1Mo(long j11, float f11) {
                return VelocityKt.Velocity(0.0f, Velocity.m5354getYimpl(j11) + f11);
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public float motionOf(float f11, float f12) {
                return -f12;
            }

            @Override // androidx.compose.foundation.layout.SideCalculator
            public int valueOf(Insets insets) {
                int i11;
                i11 = insets.bottom;
                return i11;
            }
        };

        private Companion() {
        }

        @m80.k
        /* renamed from: chooseCalculator-ni1skBw, reason: not valid java name */
        public final SideCalculator m756chooseCalculatorni1skBw(int i11, @m80.k LayoutDirection layoutDirection) {
            WindowInsetsSides.Companion companion = WindowInsetsSides.Companion;
            if (WindowInsetsSides.m808equalsimpl0(i11, companion.m822getLeftJoeWqyM())) {
                return LeftSideCalculator;
            }
            if (WindowInsetsSides.m808equalsimpl0(i11, companion.m825getTopJoeWqyM())) {
                return TopSideCalculator;
            }
            if (WindowInsetsSides.m808equalsimpl0(i11, companion.m823getRightJoeWqyM())) {
                return RightSideCalculator;
            }
            if (WindowInsetsSides.m808equalsimpl0(i11, companion.m819getBottomJoeWqyM())) {
                return BottomSideCalculator;
            }
            if (WindowInsetsSides.m808equalsimpl0(i11, companion.m824getStartJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? LeftSideCalculator : RightSideCalculator;
            }
            if (WindowInsetsSides.m808equalsimpl0(i11, companion.m820getEndJoeWqyM())) {
                return layoutDirection == LayoutDirection.Ltr ? RightSideCalculator : LeftSideCalculator;
            }
            throw new IllegalStateException("Only Left, Top, Right, Bottom, Start and End are allowed");
        }
    }

    @m80.k
    Insets adjustInsets(@m80.k Insets insets, int i11);

    /* renamed from: consumedOffsets-MK-Hz9U, reason: not valid java name */
    long mo754consumedOffsetsMKHz9U(long j11);

    /* renamed from: consumedVelocity-QWom1Mo, reason: not valid java name */
    long mo755consumedVelocityQWom1Mo(long j11, float f11);

    default float hideMotion(float f11, float f12) {
        return u.A(motionOf(f11, f12), 0.0f);
    }

    float motionOf(float f11, float f12);

    default float showMotion(float f11, float f12) {
        return u.t(motionOf(f11, f12), 0.0f);
    }

    int valueOf(@m80.k Insets insets);
}
