package androidx.compose.ui;

import androidx.compose.runtime.Immutable;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.unit.IntOffset;
import androidx.compose.ui.unit.IntSize;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,279:1\n54#2:280\n59#2:282\n54#2:286\n59#2:288\n85#3:281\n90#3:283\n80#3:285\n85#3:287\n90#3:289\n80#3:292\n30#4:284\n26#5:290\n32#6:291\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment\n*L\n240#1:280\n240#1:282\n241#1:286\n242#1:288\n240#1:281\n240#1:283\n240#1:285\n241#1:287\n242#1:289\n246#1:292\n240#1:284\n246#1:290\n246#1:291\n*E\n"})
/* loaded from: classes.dex */
public final class BiasAbsoluteAlignment implements Alignment {
    public static final int $stable = 0;
    private final float horizontalBias;
    private final float verticalBias;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nAlignment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n+ 2 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,279:1\n26#2:280\n*S KotlinDebug\n*F\n+ 1 Alignment.kt\nandroidx/compose/ui/BiasAbsoluteAlignment$Horizontal\n*L\n268#1:280\n*E\n"})
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
            return Math.round(((i12 - i11) / 2.0f) * (1 + this.bias));
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
            return vertical instanceof BiasAlignment.Vertical ? new BiasAbsoluteAlignment(this.bias, ((BiasAlignment.Vertical) vertical).getBias()) : super.plus(vertical);
        }

        @k
        public String toString() {
            return "Horizontal(bias=" + this.bias + ')';
        }
    }

    public BiasAbsoluteAlignment(float f11, float f12) {
        this.horizontalBias = f11;
        this.verticalBias = f12;
    }

    public static /* synthetic */ BiasAbsoluteAlignment copy$default(BiasAbsoluteAlignment biasAbsoluteAlignment, float f11, float f12, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            f11 = biasAbsoluteAlignment.horizontalBias;
        }
        if ((i11 & 2) != 0) {
            f12 = biasAbsoluteAlignment.verticalBias;
        }
        return biasAbsoluteAlignment.copy(f11, f12);
    }

    @Override // androidx.compose.ui.Alignment
    /* renamed from: align-KFBX0sM */
    public long mo2085alignKFBX0sM(long j11, long j12, @k LayoutDirection layoutDirection) {
        long m5281constructorimpl = IntSize.m5281constructorimpl(((((int) (j12 >> 32)) - ((int) (j11 >> 32))) << 32) | ((((int) (j12 & 4294967295L)) - ((int) (j11 & 4294967295L))) & 4294967295L));
        float f11 = 1;
        float f12 = (((int) (m5281constructorimpl >> 32)) / 2.0f) * (this.horizontalBias + f11);
        float f13 = (((int) (m5281constructorimpl & 4294967295L)) / 2.0f) * (f11 + this.verticalBias);
        return IntOffset.m5237constructorimpl((Math.round(f12) << 32) | (Math.round(f13) & 4294967295L));
    }

    public final float component1() {
        return this.horizontalBias;
    }

    public final float component2() {
        return this.verticalBias;
    }

    @k
    public final BiasAbsoluteAlignment copy(float f11, float f12) {
        return new BiasAbsoluteAlignment(f11, f12);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BiasAbsoluteAlignment)) {
            return false;
        }
        BiasAbsoluteAlignment biasAbsoluteAlignment = (BiasAbsoluteAlignment) obj;
        return Float.compare(this.horizontalBias, biasAbsoluteAlignment.horizontalBias) == 0 && Float.compare(this.verticalBias, biasAbsoluteAlignment.verticalBias) == 0;
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
        return "BiasAbsoluteAlignment(horizontalBias=" + this.horizontalBias + ", verticalBias=" + this.verticalBias + ')';
    }
}
