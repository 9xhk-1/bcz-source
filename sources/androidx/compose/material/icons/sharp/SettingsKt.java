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
@u0({"SMAP\nSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/sharp/SettingsKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,86:1\n212#2,12:87\n233#2,18:100\n253#2:137\n174#3:99\n705#4,2:118\n717#4,2:120\n719#4,11:126\n72#5,4:122\n*S KotlinDebug\n*F\n+ 1 Settings.kt\nandroidx/compose/material/icons/sharp/SettingsKt\n*L\n29#1:87,12\n30#1:100,18\n30#1:137\n29#1:99\n30#1:118,2\n30#1:120,2\n30#1:126,11\n30#1:122,4\n*E\n"})
/* loaded from: classes.dex */
public final class SettingsKt {

    @l
    private static ImageVector _settings;

    @k
    public static final ImageVector getSettings(@k Icons.Sharp sharp) {
        ImageVector imageVector = _settings;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Settings", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.44f, 12.99f);
        pathBuilder.lineToRelative(-0.01f, 0.02f);
        pathBuilder.curveToRelative(0.04f, -0.33f, 0.08f, -0.67f, 0.08f, -1.01f);
        pathBuilder.curveToRelative(0.0f, -0.34f, -0.03f, -0.66f, -0.07f, -0.99f);
        pathBuilder.lineToRelative(0.01f, 0.02f);
        pathBuilder.lineToRelative(2.44f, -1.92f);
        pathBuilder.lineToRelative(-2.43f, -4.22f);
        pathBuilder.lineToRelative(-2.87f, 1.16f);
        pathBuilder.lineToRelative(0.01f, 0.01f);
        pathBuilder.curveToRelative(-0.52f, -0.4f, -1.09f, -0.74f, -1.71f, -1.0f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.lineTo(14.44f, 2.0f);
        pathBuilder.horizontalLineTo(9.57f);
        pathBuilder.lineToRelative(-0.44f, 3.07f);
        pathBuilder.horizontalLineToRelative(0.01f);
        pathBuilder.curveToRelative(-0.62f, 0.26f, -1.19f, 0.6f, -1.71f, 1.0f);
        pathBuilder.lineToRelative(0.01f, -0.01f);
        pathBuilder.lineToRelative(-2.88f, -1.17f);
        pathBuilder.lineToRelative(-2.44f, 4.22f);
        pathBuilder.lineToRelative(2.44f, 1.92f);
        pathBuilder.lineToRelative(0.01f, -0.02f);
        pathBuilder.curveToRelative(-0.04f, 0.33f, -0.07f, 0.65f, -0.07f, 0.99f);
        pathBuilder.curveToRelative(0.0f, 0.34f, 0.03f, 0.68f, 0.08f, 1.01f);
        pathBuilder.lineToRelative(-0.01f, -0.02f);
        pathBuilder.lineToRelative(-2.1f, 1.65f);
        pathBuilder.lineToRelative(-0.33f, 0.26f);
        pathBuilder.lineToRelative(2.43f, 4.2f);
        pathBuilder.lineToRelative(2.88f, -1.15f);
        pathBuilder.lineToRelative(-0.02f, -0.04f);
        pathBuilder.curveToRelative(0.53f, 0.41f, 1.1f, 0.75f, 1.73f, 1.01f);
        pathBuilder.horizontalLineToRelative(-0.03f);
        pathBuilder.lineTo(9.58f, 22.0f);
        pathBuilder.horizontalLineToRelative(4.85f);
        pathBuilder.reflectiveCurveToRelative(0.03f, -0.18f, 0.06f, -0.42f);
        pathBuilder.lineToRelative(0.38f, -2.65f);
        pathBuilder.horizontalLineToRelative(-0.01f);
        pathBuilder.curveToRelative(0.62f, -0.26f, 1.2f, -0.6f, 1.73f, -1.01f);
        pathBuilder.lineToRelative(-0.02f, 0.04f);
        pathBuilder.lineToRelative(2.88f, 1.15f);
        pathBuilder.lineToRelative(2.43f, -4.2f);
        pathBuilder.reflectiveCurveToRelative(-0.14f, -0.12f, -0.33f, -0.26f);
        pathBuilder.lineToRelative(-2.11f, -1.66f);
        pathBuilder.close();
        pathBuilder.moveTo(12.0f, 15.5f);
        pathBuilder.curveToRelative(-1.93f, 0.0f, -3.5f, -1.57f, -3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(1.57f, -3.5f, 3.5f, -3.5f);
        pathBuilder.reflectiveCurveToRelative(3.5f, 1.57f, 3.5f, 3.5f);
        pathBuilder.reflectiveCurveToRelative(-1.57f, 3.5f, -3.5f, 3.5f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _settings = build;
        g0.m(build);
        return build;
    }
}
