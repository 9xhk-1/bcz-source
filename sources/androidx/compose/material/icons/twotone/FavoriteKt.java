package androidx.compose.material.icons.twotone;

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
@u0({"SMAP\nFavorite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Favorite.kt\nandroidx/compose/material/icons/twotone/FavoriteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n233#2,18:123\n253#2:160\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:107\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 Favorite.kt\nandroidx/compose/material/icons/twotone/FavoriteKt\n*L\n29#1:72,12\n30#1:85,18\n30#1:122\n43#1:123,18\n43#1:160\n29#1:84\n30#1:103,2\n30#1:105,2\n30#1:111,11\n43#1:141,2\n43#1:143,2\n43#1:149,11\n30#1:107,4\n43#1:145,4\n*E\n"})
/* loaded from: classes.dex */
public final class FavoriteKt {

    @l
    private static ImageVector _favorite;

    @k
    public static final ImageVector getFavorite(@k Icons.TwoTone twoTone) {
        ImageVector imageVector = _favorite;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Favorite", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2535getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m2862getButtKaPHkGw = companion2.m2862getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m2872getBevelLxFBmk8 = companion3.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(16.5f, 5.0f);
        pathBuilder.curveToRelative(-1.54f, 0.0f, -3.04f, 0.99f, -3.56f, 2.36f);
        pathBuilder.horizontalLineToRelative(-1.87f);
        pathBuilder.curveTo(10.54f, 5.99f, 9.04f, 5.0f, 7.5f, 5.0f);
        pathBuilder.curveTo(5.5f, 5.0f, 4.0f, 6.5f, 4.0f, 8.5f);
        pathBuilder.curveToRelative(0.0f, 2.89f, 3.14f, 5.74f, 7.9f, 10.05f);
        pathBuilder.lineToRelative(0.1f, 0.1f);
        pathBuilder.lineToRelative(0.1f, -0.1f);
        pathBuilder.curveTo(16.86f, 14.24f, 20.0f, 11.39f, 20.0f, 8.5f);
        pathBuilder.curveToRelative(0.0f, -2.0f, -1.5f, -3.5f, -3.5f, -3.5f);
        pathBuilder.close();
        ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw2 = companion2.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk82 = companion3.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(16.5f, 3.0f);
        pathBuilder2.curveToRelative(-1.74f, 0.0f, -3.41f, 0.81f, -4.5f, 2.09f);
        pathBuilder2.curveTo(10.91f, 3.81f, 9.24f, 3.0f, 7.5f, 3.0f);
        pathBuilder2.curveTo(4.42f, 3.0f, 2.0f, 5.42f, 2.0f, 8.5f);
        pathBuilder2.curveToRelative(0.0f, 3.78f, 3.4f, 6.86f, 8.55f, 11.54f);
        pathBuilder2.lineTo(12.0f, 21.35f);
        pathBuilder2.lineToRelative(1.45f, -1.32f);
        pathBuilder2.curveTo(18.6f, 15.36f, 22.0f, 12.28f, 22.0f, 8.5f);
        pathBuilder2.curveTo(22.0f, 5.42f, 19.58f, 3.0f, 16.5f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(12.1f, 18.55f);
        pathBuilder2.lineToRelative(-0.1f, 0.1f);
        pathBuilder2.lineToRelative(-0.1f, -0.1f);
        pathBuilder2.curveTo(7.14f, 14.24f, 4.0f, 11.39f, 4.0f, 8.5f);
        pathBuilder2.curveTo(4.0f, 6.5f, 5.5f, 5.0f, 7.5f, 5.0f);
        pathBuilder2.curveToRelative(1.54f, 0.0f, 3.04f, 0.99f, 3.57f, 2.36f);
        pathBuilder2.horizontalLineToRelative(1.87f);
        pathBuilder2.curveTo(13.46f, 5.99f, 14.96f, 5.0f, 16.5f, 5.0f);
        pathBuilder2.curveToRelative(2.0f, 0.0f, 3.5f, 1.5f, 3.5f, 3.5f);
        pathBuilder2.curveToRelative(0.0f, 2.89f, -3.14f, 5.74f, -7.9f, 10.05f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw2, m2872getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favorite = build;
        g0.m(build);
        return build;
    }
}
