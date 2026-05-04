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
@u0({"SMAP\nBuild.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/filled/BuildKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,51:1\n212#2,12:52\n233#2,18:65\n253#2:102\n174#3:64\n705#4,2:83\n717#4,2:85\n719#4,11:91\n72#5,4:87\n*S KotlinDebug\n*F\n+ 1 Build.kt\nandroidx/compose/material/icons/filled/BuildKt\n*L\n29#1:52,12\n30#1:65,18\n30#1:102\n29#1:64\n30#1:83,2\n30#1:85,2\n30#1:91,11\n30#1:87,4\n*E\n"})
/* loaded from: classes.dex */
public final class BuildKt {

    @l
    private static ImageVector _build;

    @k
    public static final ImageVector getBuild(@k Icons.Filled filled) {
        ImageVector imageVector = _build;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Build", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(22.7f, 19.0f);
        pathBuilder.lineToRelative(-9.1f, -9.1f);
        pathBuilder.curveToRelative(0.9f, -2.3f, 0.4f, -5.0f, -1.5f, -6.9f);
        pathBuilder.curveToRelative(-2.0f, -2.0f, -5.0f, -2.4f, -7.4f, -1.3f);
        pathBuilder.lineTo(9.0f, 6.0f);
        pathBuilder.lineTo(6.0f, 9.0f);
        pathBuilder.lineTo(1.6f, 4.7f);
        pathBuilder.curveTo(0.4f, 7.1f, 0.9f, 10.1f, 2.9f, 12.1f);
        pathBuilder.curveToRelative(1.9f, 1.9f, 4.6f, 2.4f, 6.9f, 1.5f);
        pathBuilder.lineToRelative(9.1f, 9.1f);
        pathBuilder.curveToRelative(0.4f, 0.4f, 1.0f, 0.4f, 1.4f, 0.0f);
        pathBuilder.lineToRelative(2.3f, -2.3f);
        pathBuilder.curveToRelative(0.5f, -0.4f, 0.5f, -1.1f, 0.1f, -1.4f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _build = build;
        g0.m(build);
        return build;
    }
}
