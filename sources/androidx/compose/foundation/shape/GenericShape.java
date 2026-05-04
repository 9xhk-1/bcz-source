package androidx.compose.foundation.shape;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.graphics.AndroidPath_androidKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import m80.k;
import m80.l;
import x00.q;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class GenericShape implements Shape {
    public static final int $stable = 0;

    @k
    private final q<Path, Size, LayoutDirection, g2> builder;

    /* JADX WARN: Multi-variable type inference failed */
    public GenericShape(@k q<? super Path, ? super Size, ? super LayoutDirection, g2> qVar) {
        this.builder = qVar;
    }

    @Override // androidx.compose.ui.graphics.Shape
    @k
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo291createOutlinePq9zytI(long j11, @k LayoutDirection layoutDirection, @k Density density) {
        Path Path = AndroidPath_androidKt.Path();
        this.builder.invoke(Path, Size.m2325boximpl(j11), layoutDirection);
        Path.close();
        return new Outline.Generic(Path);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        GenericShape genericShape = obj instanceof GenericShape ? (GenericShape) obj : null;
        return (genericShape != null ? genericShape.builder : null) == this.builder;
    }

    public int hashCode() {
        return this.builder.hashCode();
    }
}
