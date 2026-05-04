package androidx.compose.ui.graphics;

import androidx.compose.runtime.Stable;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class RectangleShapeKt {

    @m80.k
    private static final Shape RectangleShape = new Shape() { // from class: androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1
        public String toString() {
            return "RectangleShape";
        }

        @Override // androidx.compose.ui.graphics.Shape
        /* renamed from: createOutline-Pq9zytI */
        public Outline.Rectangle mo291createOutlinePq9zytI(long j11, LayoutDirection layoutDirection, Density density) {
            return new Outline.Rectangle(SizeKt.m2358toRectuvyYCjk(j11));
        }
    };

    @m80.k
    public static final Shape getRectangleShape() {
        return RectangleShape;
    }

    @Stable
    public static /* synthetic */ void getRectangleShape$annotations() {
    }
}
