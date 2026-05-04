package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/sharp/RefreshKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,52:1\n212#2,12:53\n233#2,18:66\n253#2:103\n174#3:65\n705#4,2:84\n717#4,2:86\n719#4,11:92\n72#5,4:88\n*S KotlinDebug\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/sharp/RefreshKt\n*L\n29#1:53,12\n30#1:66,18\n30#1:103\n29#1:65\n30#1:84,2\n30#1:86,2\n30#1:92,11\n30#1:88,4\n*E\n"})
/* loaded from: classes.dex */
public final class RefreshKt {

    @l
    private static ImageVector _refresh;

    @k
    public static final ImageVector getRefresh(@k Icons.Sharp sharp) {
        ImageVector imageVector = _refresh;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Refresh", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.65f, 6.35f);
        pathBuilder.curveTo(16.2f, 4.9f, 14.21f, 4.0f, 12.0f, 4.0f);
        pathBuilder.curveToRelative(-4.42f, 0.0f, -7.99f, 3.58f, -7.99f, 8.0f);
        pathBuilder.reflectiveCurveToRelative(3.57f, 8.0f, 7.99f, 8.0f);
        pathBuilder.curveToRelative(3.73f, 0.0f, 6.84f, -2.55f, 7.73f, -6.0f);
        pathBuilder.horizontalLineToRelative(-2.08f);
        pathBuilder.curveToRelative(-0.82f, 2.33f, -3.04f, 4.0f, -5.65f, 4.0f);
        pathBuilder.curveToRelative(-3.31f, 0.0f, -6.0f, -2.69f, -6.0f, -6.0f);
        pathBuilder.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        pathBuilder.lineTo(13.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(7.0f);
        pathBuilder.verticalLineTo(4.0f);
        pathBuilder.lineToRelative(-2.35f, 2.35f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _refresh = build;
        g0.m(build);
        return build;
    }
}
