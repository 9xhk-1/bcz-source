package androidx.compose.material.icons.filled;

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
@u0({"SMAP\nFavorite.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Favorite.kt\nandroidx/compose/material/icons/filled/FavoriteKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,47:1\n212#2,12:48\n233#2,18:61\n253#2:98\n174#3:60\n705#4,2:79\n717#4,2:81\n719#4,11:87\n72#5,4:83\n*S KotlinDebug\n*F\n+ 1 Favorite.kt\nandroidx/compose/material/icons/filled/FavoriteKt\n*L\n29#1:48,12\n30#1:61,18\n30#1:98\n29#1:60\n30#1:79,2\n30#1:81,2\n30#1:87,11\n30#1:83,4\n*E\n"})
/* loaded from: classes.dex */
public final class FavoriteKt {

    @l
    private static ImageVector _favorite;

    @k
    public static final ImageVector getFavorite(@k Icons.Filled filled) {
        ImageVector imageVector = _favorite;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Favorite", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 21.35f);
        pathBuilder.lineToRelative(-1.45f, -1.32f);
        pathBuilder.curveTo(5.4f, 15.36f, 2.0f, 12.28f, 2.0f, 8.5f);
        pathBuilder.curveTo(2.0f, 5.42f, 4.42f, 3.0f, 7.5f, 3.0f);
        pathBuilder.curveToRelative(1.74f, 0.0f, 3.41f, 0.81f, 4.5f, 2.09f);
        pathBuilder.curveTo(13.09f, 3.81f, 14.76f, 3.0f, 16.5f, 3.0f);
        pathBuilder.curveTo(19.58f, 3.0f, 22.0f, 5.42f, 22.0f, 8.5f);
        pathBuilder.curveToRelative(0.0f, 3.78f, -3.4f, 6.86f, -8.55f, 11.54f);
        pathBuilder.lineTo(12.0f, 21.35f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _favorite = build;
        g0.m(build);
        return build;
    }
}
