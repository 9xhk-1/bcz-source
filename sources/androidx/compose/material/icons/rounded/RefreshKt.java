package androidx.compose.material.icons.rounded;

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
@u0({"SMAP\nRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/rounded/RefreshKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n212#2,12:57\n233#2,18:70\n253#2:107\n174#3:69\n705#4,2:88\n717#4,2:90\n719#4,11:96\n72#5,4:92\n*S KotlinDebug\n*F\n+ 1 Refresh.kt\nandroidx/compose/material/icons/rounded/RefreshKt\n*L\n29#1:57,12\n30#1:70,18\n30#1:107\n29#1:69\n30#1:88,2\n30#1:90,2\n30#1:96,11\n30#1:92,4\n*E\n"})
/* loaded from: classes.dex */
public final class RefreshKt {

    @l
    private static ImageVector _refresh;

    @k
    public static final ImageVector getRefresh(@k Icons.Rounded rounded) {
        ImageVector imageVector = _refresh;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Refresh", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(17.65f, 6.35f);
        pathBuilder.curveToRelative(-1.63f, -1.63f, -3.94f, -2.57f, -6.48f, -2.31f);
        pathBuilder.curveToRelative(-3.67f, 0.37f, -6.69f, 3.35f, -7.1f, 7.02f);
        pathBuilder.curveTo(3.52f, 15.91f, 7.27f, 20.0f, 12.0f, 20.0f);
        pathBuilder.curveToRelative(3.19f, 0.0f, 5.93f, -1.87f, 7.21f, -4.56f);
        pathBuilder.curveToRelative(0.32f, -0.67f, -0.16f, -1.44f, -0.9f, -1.44f);
        pathBuilder.curveToRelative(-0.37f, 0.0f, -0.72f, 0.2f, -0.88f, 0.53f);
        pathBuilder.curveToRelative(-1.13f, 2.43f, -3.84f, 3.97f, -6.8f, 3.31f);
        pathBuilder.curveToRelative(-2.22f, -0.49f, -4.01f, -2.3f, -4.48f, -4.52f);
        pathBuilder.curveTo(5.31f, 9.44f, 8.26f, 6.0f, 12.0f, 6.0f);
        pathBuilder.curveToRelative(1.66f, 0.0f, 3.14f, 0.69f, 4.22f, 1.78f);
        pathBuilder.lineToRelative(-1.51f, 1.51f);
        pathBuilder.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        pathBuilder.horizontalLineTo(19.0f);
        pathBuilder.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        pathBuilder.verticalLineTo(6.41f);
        pathBuilder.curveToRelative(0.0f, -0.89f, -1.08f, -1.34f, -1.71f, -0.71f);
        pathBuilder.lineToRelative(-0.64f, 0.65f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _refresh = build;
        g0.m(build);
        return build;
    }
}
