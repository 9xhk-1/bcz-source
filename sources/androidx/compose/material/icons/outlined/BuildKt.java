package androidx.compose.material.icons.outlined;

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
@u0({"SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/outlined/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,65:1\n212#2,12:66\n233#2,18:79\n253#2:116\n174#3:78\n705#4,2:97\n717#4,2:99\n719#4,11:105\n72#5,4:101\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/outlined/BuildKt\n*L\n29#1:66,12\n30#1:79,18\n30#1:116\n29#1:78\n30#1:97,2\n30#1:99,2\n30#1:105,11\n30#1:101,4\n*E\n"})
/* loaded from: classes.dex */
public final class BuildKt {

    @l
    private static ImageVector _build;

    @k
    public static final ImageVector getBuild(@k Icons.Outlined outlined) {
        ImageVector imageVector = _build;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Build", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.61f, 18.99f);
        pathBuilder.lineToRelative(-9.08f, -9.08f);
        pathBuilder.curveToRelative(0.93f, -2.34f, 0.45f, -5.1f, -1.44f, -7.0f);
        pathBuilder.curveTo(9.79f, 0.61f, 6.21f, 0.4f, 3.66f, 2.26f);
        pathBuilder.lineTo(7.5f, 6.11f);
        pathBuilder.lineTo(6.08f, 7.52f);
        pathBuilder.lineTo(2.25f, 3.69f);
        pathBuilder.curveTo(0.39f, 6.23f, 0.6f, 9.82f, 2.9f, 12.11f);
        pathBuilder.curveToRelative(1.86f, 1.86f, 4.57f, 2.35f, 6.89f, 1.48f);
        pathBuilder.lineToRelative(9.11f, 9.11f);
        pathBuilder.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        pathBuilder.lineToRelative(2.3f, -2.3f);
        pathBuilder.curveToRelative(0.4f, -0.38f, 0.4f, -1.01f, 0.0f, -1.41f);
        pathBuilder.close();
        pathBuilder.moveTo(19.61f, 20.59f);
        pathBuilder.lineToRelative(-9.46f, -9.46f);
        pathBuilder.curveToRelative(-0.61f, 0.45f, -1.29f, 0.72f, -2.0f, 0.82f);
        pathBuilder.curveToRelative(-1.36f, 0.2f, -2.79f, -0.21f, -3.83f, -1.25f);
        pathBuilder.curveTo(3.37f, 9.76f, 2.93f, 8.5f, 3.0f, 7.26f);
        pathBuilder.lineToRelative(3.09f, 3.09f);
        pathBuilder.lineToRelative(4.24f, -4.24f);
        pathBuilder.lineToRelative(-3.09f, -3.09f);
        pathBuilder.curveToRelative(1.24f, -0.07f, 2.49f, 0.37f, 3.44f, 1.31f);
        pathBuilder.curveToRelative(1.08f, 1.08f, 1.49f, 2.57f, 1.24f, 3.96f);
        pathBuilder.curveToRelative(-0.12f, 0.71f, -0.42f, 1.37f, -0.88f, 1.96f);
        pathBuilder.lineToRelative(9.45f, 9.45f);
        pathBuilder.lineToRelative(-0.88f, 0.89f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _build = build;
        g0.m(build);
        return build;
    }
}
