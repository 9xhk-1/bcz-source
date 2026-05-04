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
@u0({"SMAP\nPlayArrow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/rounded/PlayArrowKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,45:1\n212#2,12:46\n233#2,18:59\n253#2:96\n174#3:58\n705#4,2:77\n717#4,2:79\n719#4,11:85\n72#5,4:81\n*S KotlinDebug\n*F\n+ 1 PlayArrow.kt\nandroidx/compose/material/icons/rounded/PlayArrowKt\n*L\n29#1:46,12\n30#1:59,18\n30#1:96\n29#1:58\n30#1:77,2\n30#1:79,2\n30#1:85,11\n30#1:81,4\n*E\n"})
/* loaded from: classes.dex */
public final class PlayArrowKt {

    @l
    private static ImageVector _playArrow;

    @k
    public static final ImageVector getPlayArrow(@k Icons.Rounded rounded) {
        ImageVector imageVector = _playArrow;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PlayArrow", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(8.0f, 6.82f);
        pathBuilder.verticalLineToRelative(10.36f);
        pathBuilder.curveToRelative(0.0f, 0.79f, 0.87f, 1.27f, 1.54f, 0.84f);
        pathBuilder.lineToRelative(8.14f, -5.18f);
        pathBuilder.curveToRelative(0.62f, -0.39f, 0.62f, -1.29f, 0.0f, -1.69f);
        pathBuilder.lineTo(9.54f, 5.98f);
        pathBuilder.curveTo(8.87f, 5.55f, 8.0f, 6.03f, 8.0f, 6.82f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _playArrow = build;
        g0.m(build);
        return build;
    }
}
