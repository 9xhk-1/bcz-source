package androidx.compose.ui.text;

import androidx.compose.ui.geometry.CornerRadius;
import androidx.compose.ui.geometry.RoundRectKt;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.geometry.SizeKt;
import androidx.compose.ui.graphics.Outline;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.u0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBullet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Bullet.kt\nandroidx/compose/ui/text/CircleShape\n+ 2 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,122:1\n33#2:123\n53#3,3:124\n*S KotlinDebug\n*F\n+ 1 Bullet.kt\nandroidx/compose/ui/text/CircleShape\n*L\n110#1:123\n110#1:124,3\n*E\n"})
/* loaded from: classes2.dex */
final class CircleShape implements Shape {

    @k
    public static final CircleShape INSTANCE = new CircleShape();

    private CircleShape() {
    }

    @Override // androidx.compose.ui.graphics.Shape
    @k
    /* renamed from: createOutline-Pq9zytI */
    public Outline mo291createOutlinePq9zytI(long j11, @k LayoutDirection layoutDirection, @k Density density) {
        long m2222constructorimpl = CornerRadius.m2222constructorimpl((Float.floatToRawIntBits(r12) & 4294967295L) | (Float.floatToRawIntBits(Size.m2336getMinDimensionimpl(j11) / 2.0f) << 32));
        return new Outline.Rounded(RoundRectKt.m2320RoundRectZAM2FJo(SizeKt.m2358toRectuvyYCjk(j11), m2222constructorimpl, m2222constructorimpl, m2222constructorimpl, m2222constructorimpl));
    }
}
