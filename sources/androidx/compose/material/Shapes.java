package androidx.compose.material;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Immutable;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
@u0({"SMAP\nShapes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,91:1\n149#2:92\n149#2:93\n149#2:94\n*S KotlinDebug\n*F\n+ 1 Shapes.kt\nandroidx/compose/material/Shapes\n*L\n52#1:92\n54#1:93\n56#1:94\n*E\n"})
/* loaded from: classes.dex */
public final class Shapes {
    public static final int $stable = 0;

    @k
    private final CornerBasedShape large;

    @k
    private final CornerBasedShape medium;

    @k
    private final CornerBasedShape small;

    public Shapes() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ Shapes copy$default(Shapes shapes, CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cornerBasedShape = shapes.small;
        }
        if ((i11 & 2) != 0) {
            cornerBasedShape2 = shapes.medium;
        }
        if ((i11 & 4) != 0) {
            cornerBasedShape3 = shapes.large;
        }
        return shapes.copy(cornerBasedShape, cornerBasedShape2, cornerBasedShape3);
    }

    @k
    public final Shapes copy(@k CornerBasedShape cornerBasedShape, @k CornerBasedShape cornerBasedShape2, @k CornerBasedShape cornerBasedShape3) {
        return new Shapes(cornerBasedShape, cornerBasedShape2, cornerBasedShape3);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Shapes)) {
            return false;
        }
        Shapes shapes = (Shapes) obj;
        return g0.g(this.small, shapes.small) && g0.g(this.medium, shapes.medium) && g0.g(this.large, shapes.large);
    }

    @k
    public final CornerBasedShape getLarge() {
        return this.large;
    }

    @k
    public final CornerBasedShape getMedium() {
        return this.medium;
    }

    @k
    public final CornerBasedShape getSmall() {
        return this.small;
    }

    public int hashCode() {
        return (((this.small.hashCode() * 31) + this.medium.hashCode()) * 31) + this.large.hashCode();
    }

    @k
    public String toString() {
        return "Shapes(small=" + this.small + ", medium=" + this.medium + ", large=" + this.large + ')';
    }

    public Shapes(@k CornerBasedShape cornerBasedShape, @k CornerBasedShape cornerBasedShape2, @k CornerBasedShape cornerBasedShape3) {
        this.small = cornerBasedShape;
        this.medium = cornerBasedShape2;
        this.large = cornerBasedShape3;
    }

    public /* synthetic */ Shapes(CornerBasedShape cornerBasedShape, CornerBasedShape cornerBasedShape2, CornerBasedShape cornerBasedShape3, int i11, v vVar) {
        this((i11 & 1) != 0 ? RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4)) : cornerBasedShape, (i11 & 2) != 0 ? RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(4)) : cornerBasedShape2, (i11 & 4) != 0 ? RoundedCornerShapeKt.m1019RoundedCornerShape0680j_4(Dp.m5115constructorimpl(0)) : cornerBasedShape3);
    }
}
