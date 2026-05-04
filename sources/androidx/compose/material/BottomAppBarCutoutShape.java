package androidx.compose.material;

import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.ui.geometry.OffsetKt;
import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.OutlineKt;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.PathOperation;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n1#1,741:1\n1#2:742\n615#3:743\n590#3:744\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/BottomAppBarCutoutShape\n*L\n546#1:743\n546#1:744\n*E\n"})
/* loaded from: classes.dex */
final class BottomAppBarCutoutShape implements Shape {

    @k
    private final Shape cutoutShape;

    @k
    private final FabPlacement fabPlacement;

    public BottomAppBarCutoutShape(@k Shape shape, @k FabPlacement fabPlacement) {
        this.cutoutShape = shape;
        this.fabPlacement = fabPlacement;
    }

    private final void addCutoutShape(Path path, LayoutDirection layoutDirection, Density density) {
        float f11;
        float f12;
        f11 = AppBarKt.BottomAppBarCutoutOffset;
        float mo377toPx0680j_4 = density.mo377toPx0680j_4(f11);
        float f13 = 2 * mo377toPx0680j_4;
        long Size = SizeKt.Size(this.fabPlacement.getWidth() + f13, this.fabPlacement.getHeight() + f13);
        float left = this.fabPlacement.getLeft() - mo377toPx0680j_4;
        float m2337getWidthimpl = left + Size.m2337getWidthimpl(Size);
        float m2334getHeightimpl = Size.m2334getHeightimpl(Size) / 2.0f;
        OutlineKt.addOutline(path, this.cutoutShape.mo291createOutlinePq9zytI(Size, layoutDirection, density));
        path.mo2404translatek4lQ0M(OffsetKt.Offset(left, -m2334getHeightimpl));
        if (g0.g(this.cutoutShape, RoundedCornerShapeKt.getCircleShape())) {
            f12 = AppBarKt.BottomAppBarRoundedEdgeRadius;
            addRoundedEdges(path, left, m2337getWidthimpl, m2334getHeightimpl, density.mo377toPx0680j_4(f12), 0.0f);
        }
    }

    private final void addRoundedEdges(Path path, float f11, float f12, float f13, float f14, float f15) {
        float f16 = -((float) Math.sqrt((f13 * f13) - (f15 * f15)));
        float f17 = f13 + f16;
        float f18 = f11 + f17;
        float f19 = f12 - f17;
        Pair<Float, Float> calculateRoundedEdgeIntercept = AppBarKt.calculateRoundedEdgeIntercept(f16 - 1.0f, f15, f13);
        float floatValue = calculateRoundedEdgeIntercept.component1().floatValue() + f13;
        float floatValue2 = calculateRoundedEdgeIntercept.component2().floatValue() - f15;
        path.moveTo(f18 - f14, 0.0f);
        path.quadraticTo(f18 - 1.0f, 0.0f, f11 + floatValue, floatValue2);
        path.lineTo(f12 - floatValue, floatValue2);
        path.quadraticTo(f19 + 1.0f, 0.0f, f14 + f19, 0.0f);
        path.close();
    }

    public static /* synthetic */ BottomAppBarCutoutShape copy$default(BottomAppBarCutoutShape bottomAppBarCutoutShape, Shape shape, FabPlacement fabPlacement, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            shape = bottomAppBarCutoutShape.cutoutShape;
        }
        if ((i11 & 2) != 0) {
            fabPlacement = bottomAppBarCutoutShape.fabPlacement;
        }
        return bottomAppBarCutoutShape.copy(shape, fabPlacement);
    }

    @k
    public final Shape component1() {
        return this.cutoutShape;
    }

    @k
    public final FabPlacement component2() {
        return this.fabPlacement;
    }

    @k
    public final BottomAppBarCutoutShape copy(@k Shape shape, @k FabPlacement fabPlacement) {
        return new BottomAppBarCutoutShape(shape, fabPlacement);
    }

    @Override // androidx.compose.ui.graphics.Shape
    @k
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo291createOutlinePq9zytI(long j11, @k LayoutDirection layoutDirection, @k Density density) {
        Path Path = AndroidPath_androidKt.Path();
        Path.addRect$default(Path, new Rect(0.0f, 0.0f, Size.m2337getWidthimpl(j11), Size.m2334getHeightimpl(j11)), null, 2, null);
        Path Path2 = AndroidPath_androidKt.Path();
        addCutoutShape(Path2, layoutDirection, density);
        Path2.mo2401opN5in7k0(Path, Path2, PathOperation.Companion.m2801getDifferenceb3I0S0c());
        return new Outline.Generic(Path2);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomAppBarCutoutShape)) {
            return false;
        }
        BottomAppBarCutoutShape bottomAppBarCutoutShape = (BottomAppBarCutoutShape) obj;
        return g0.g(this.cutoutShape, bottomAppBarCutoutShape.cutoutShape) && g0.g(this.fabPlacement, bottomAppBarCutoutShape.fabPlacement);
    }

    @k
    public final Shape getCutoutShape() {
        return this.cutoutShape;
    }

    @k
    public final FabPlacement getFabPlacement() {
        return this.fabPlacement;
    }

    public int hashCode() {
        return (this.cutoutShape.hashCode() * 31) + this.fabPlacement.hashCode();
    }

    @k
    public String toString() {
        return "BottomAppBarCutoutShape(cutoutShape=" + this.cutoutShape + ", fabPlacement=" + this.fabPlacement + ')';
    }
}
