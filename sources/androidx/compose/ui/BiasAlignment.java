package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAbsoluteAlignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,279:1\n54#2:280\n59#2:282\n85#3:281\n90#3:283\n80#3:286\n26#4:284\n32#5:285\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment\n*L\n151#1:280\n152#1:282\n151#1:281\n152#1:283\n162#1:286\n162#1:284\n162#1:285\n*E\n"})
/* loaded from: classes.dex */
public final class BiasAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,279:1\n26#2:280\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Horizontal\n*L\n182#1:280\n*E\n"})
    @Immutable
    public static final class Horizontal implements Alignment.Horizontal {
        public static final int $stable = 0;
        private final float bias;

        public Horizontal(float f11) {
            this.bias = f11;
        }

        public static /* synthetic */ Horizontal copy$default(Horizontal horizontal, float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = horizontal.bias;
            }
            return horizontal.copy(f11);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        public int align(int i11, int i12, @k LayoutDirection layoutDirection) {
            return Math.round(((i12 - i11) / 2.0f) * (1 + (layoutDirection == LayoutDirection.Ltr ? this.bias : (-1) * this.bias)));
        }

        public final float component1() {
            return this.bias;
        }

        @k
        public final Horizontal copy(float f11) {
            return new Horizontal(f11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Horizontal) && Float.compare(this.bias, ((Horizontal) obj).bias) == 0;
        }

        public final float getBias() {
            return this.bias;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @Override // androidx.compose.ui.Alignment.Horizontal
        @k
        public Alignment plus(@k Alignment.Vertical vertical) {
            return vertical instanceof Vertical ? new BiasAlignment(this.bias, ((Vertical) vertical).getBias()) : super.plus(vertical);
        }

        @k
        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,279:1\n26#2:280\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAlignment$Vertical\n*L\n208#1:280\n*E\n"})
    @Immutable
    public static final class Vertical implements Alignment.Vertical {
        public static final int $stable = 0;
        private final float bias;

        public Vertical(float f11) {
            this.bias = f11;
        }

        public static /* synthetic */ Vertical copy$default(Vertical vertical, float f11, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                f11 = vertical.bias;
            }
            return vertical.copy(f11);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        public int align(int i11, int i12) {
            return Math.round(((i12 - i11) / 2.0f) * (1 + this.bias));
        }

        public final float component1() {
            return this.bias;
        }

        @k
        public final Vertical copy(float f11) {
            return new Vertical(f11);
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Vertical) && Float.compare(this.bias, ((Vertical) obj).bias) == 0;
        }

        public final float getBias() {
            return this.bias;
        }

        public int hashCode() {
            return Float.hashCode(this.bias);
        }

        @Override // androidx.compose.ui.Alignment.Vertical
        @k
        public Alignment plus(@k Alignment.Horizontal horizontal) {
            return horizontal instanceof Horizontal ? new BiasAlignment(((Horizontal) horizontal).getBias(), this.bias) : horizontal instanceof BiasAbsoluteAlignment.Horizontal ? new BiasAbsoluteAlignment(((BiasAbsoluteAlignment.Horizontal) horizontal).getBias(), this.bias) : super.plus(horizontal);
        }

        @k
        public String toString() {
            return "Vertical(bias=" + this.bias + ')';
        }
    }

    public BiasAlignment(float f11, float f12) {
        this.horizontalBias = f11;
        this.verticalBias = f12;
    }

    public static /* synthetic */ BiasAlignment copy$default(BiasAlignment biasAlignment, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = biasAlignment.horizontalBias;
        }
        if ((i11 & 2) != 0) {
            f12 = biasAlignment.verticalBias;
        }
        return biasAlignment.copy(f11, f12);
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo2085alignKFBX0sM(long j11, long j12, @k LayoutDirection layoutDirection) {
        float f11 = (((int) (j12 >> 32)) - ((int) (j11 >> 32))) / 2.0f;
        float f12 = (((int) (j12 & 4294967295L)) - ((int) (j11 & 4294967295L))) / 2.0f;
        float f13 = 1;
        return IntOffset.m5237constructorimpl((Math.round(f11 * ((layoutDirection == LayoutDirection.Ltr ? this.horizontalBias : (-1) * this.horizontalBias) + f13)) << 32) | (Math.round(f12 * (f13 + this.verticalBias)) & 4294967295L));
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    @k
    public final BiasAlignment copy(float f11, float f12) {
        return new BiasAlignment(f11, f12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAlignment)) {
            return false;
        }
        BiasAlignment biasAlignment = (BiasAlignment) obj;
        return Float.compare(this.horizontalBias, biasAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAlignment.verticalBias) == 0;
    }

    public final float getHorizontalBias() {
        return this.horizontalBias;
    }

    public final float getVerticalBias() {
        return this.verticalBias;
    }

    public int hashCode() {
        return (Float.hashCode(this.horizontalBias) * 31) + Float.hashCode(this.verticalBias);
    }

    @k
    public String toString() {
        return "BiasAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
