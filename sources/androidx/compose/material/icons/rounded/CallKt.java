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
@u0({"SMAP\nCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/rounded/CallKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,53:1\n212#2,12:54\n233#2,18:67\n253#2:104\n174#3:66\n705#4,2:85\n717#4,2:87\n719#4,11:93\n72#5,4:89\n*S KotlinDebug\n*F\n+ 1 Call.kt\nandroidx/compose/material/icons/rounded/CallKt\n*L\n29#1:54,12\n30#1:67,18\n30#1:104\n29#1:66\n30#1:85,2\n30#1:87,2\n30#1:93,11\n30#1:89,4\n*E\n"})
/* loaded from: classes.dex */
public final class CallKt {

    @l
    private static ImageVector _call;

    @k
    public static final ImageVector getCall(@k Icons.Rounded rounded) {
        ImageVector imageVector = _call;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Call", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(19.23f, 15.26f);
        pathBuilder.lineToRelative(-2.54f, -0.29f);
        pathBuilder.curveToRelative(-0.61f, -0.07f, -1.21f, 0.14f, -1.64f, 0.57f);
        pathBuilder.lineToRelative(-1.84f, 1.84f);
        pathBuilder.curveToRelative(-2.83f, -1.44f, -5.15f, -3.75f, -6.59f, -6.59f);
        pathBuilder.lineToRelative(1.85f, -1.85f);
        pathBuilder.curveToRelative(0.43f, -0.43f, 0.64f, -1.03f, 0.57f, -1.64f);
        pathBuilder.lineToRelative(-0.29f, -2.52f);
        pathBuilder.curveToRelative(-0.12f, -1.01f, -0.97f, -1.77f, -1.99f, -1.77f);
        pathBuilder.horizontalLineTo(5.03f);
        pathBuilder.curveToRelative(-1.13f, 0.0f, -2.07f, 0.94f, -2.0f, 2.07f);
        pathBuilder.curveToRelative(0.53f, 8.54f, 7.36f, 15.36f, 15.89f, 15.89f);
        pathBuilder.curveToRelative(1.13f, 0.07f, 2.07f, -0.87f, 2.07f, -2.0f);
        pathBuilder.verticalLineToRelative(-1.73f);
        pathBuilder.curveToRelative(0.01f, -1.01f, -0.75f, -1.86f, -1.76f, -1.98f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _call = build;
        g0.m(build);
        return build;
    }
}
