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
@u0({"SMAP\nLocationOn.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/outlined/LocationOnKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,55:1\n212#2,12:56\n233#2,18:69\n253#2:106\n233#2,18:107\n253#2:144\n174#3:68\n705#4,2:87\n717#4,2:89\n719#4,11:95\n705#4,2:125\n717#4,2:127\n719#4,11:133\n72#5,4:91\n72#5,4:129\n*S KotlinDebug\n*F\n+ 1 LocationOn.kt\nandroidx/compose/material/icons/outlined/LocationOnKt\n*L\n29#1:56,12\n30#1:69,18\n30#1:106\n44#1:107,18\n44#1:144\n29#1:68\n30#1:87,2\n30#1:89,2\n30#1:95,11\n44#1:125,2\n44#1:127,2\n44#1:133,11\n30#1:91,4\n44#1:129,4\n*E\n"})
/* loaded from: classes.dex */
public final class LocationOnKt {

    @l
    private static ImageVector _locationOn;

    @k
    public static final ImageVector getLocationOn(@k Icons.Outlined outlined) {
        ImageVector imageVector = _locationOn;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.LocationOn", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2535getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m2862getButtKaPHkGw = companion2.m2862getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m2872getBevelLxFBmk8 = companion3.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(12.0f, 2.0f);
        pathBuilder.curveTo(8.13f, 2.0f, 5.0f, 5.13f, 5.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, 5.25f, 7.0f, 13.0f, 7.0f, 13.0f);
        pathBuilder.reflectiveCurveToRelative(7.0f, -7.75f, 7.0f, -13.0f);
        pathBuilder.curveToRelative(0.0f, -3.87f, -3.13f, -7.0f, -7.0f, -7.0f);
        pathBuilder.close();
        pathBuilder.moveTo(7.0f, 9.0f);
        pathBuilder.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        pathBuilder.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        pathBuilder.curveToRelative(0.0f, 2.88f, -2.88f, 7.19f, -5.0f, 9.88f);
        pathBuilder.curveTo(9.92f, 16.21f, 7.0f, 11.85f, 7.0f, 9.0f);
        pathBuilder.close();
        ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw2 = companion2.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk82 = companion3.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(12.0f, 9.0f);
        pathBuilder2.moveToRelative(-2.5f, 0.0f);
        pathBuilder2.arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f);
        pathBuilder2.arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw2, m2872getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _locationOn = build;
        g0.m(build);
        return build;
    }
}
