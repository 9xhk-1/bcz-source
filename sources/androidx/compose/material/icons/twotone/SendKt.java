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
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/twotone/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,71:1\n212#2,12:72\n233#2,18:85\n253#2:122\n233#2,18:123\n253#2:160\n174#3:84\n705#4,2:103\n717#4,2:105\n719#4,11:111\n705#4,2:141\n717#4,2:143\n719#4,11:149\n72#5,4:107\n72#5,4:145\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/twotone/SendKt\n*L\n35#1:72,12\n36#1:85,18\n36#1:122\n46#1:123,18\n46#1:160\n35#1:84\n36#1:103,2\n36#1:105,2\n36#1:111,11\n46#1:141,2\n46#1:143,2\n46#1:149,11\n36#1:107,4\n46#1:145,4\n*E\n"})
/* loaded from: classes.dex */
public final class SendKt {

    @l
    private static ImageVector _send;

    @k
    public static final ImageVector getSend(@k Icons.TwoTone twoTone) {
        ImageVector imageVector = _send;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Send", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m2535getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m2862getButtKaPHkGw = companion2.m2862getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m2872getBevelLxFBmk8 = companion3.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.0f, 8.25f);
        pathBuilder.lineToRelative(7.51f, 1.0f);
        pathBuilder.lineToRelative(-7.5f, -3.22f);
        pathBuilder.close();
        pathBuilder.moveTo(4.01f, 17.97f);
        pathBuilder.lineToRelative(7.5f, -3.22f);
        pathBuilder.lineToRelative(-7.51f, 1.0f);
        pathBuilder.close();
        ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw2 = companion2.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk82 = companion3.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder2 = new PathBuilder();
        pathBuilder2.moveTo(2.01f, 3.0f);
        pathBuilder2.lineTo(2.0f, 10.0f);
        pathBuilder2.lineToRelative(15.0f, 2.0f);
        pathBuilder2.lineToRelative(-15.0f, 2.0f);
        pathBuilder2.lineToRelative(0.01f, 7.0f);
        pathBuilder2.lineTo(23.0f, 12.0f);
        pathBuilder2.lineTo(2.01f, 3.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.0f, 8.25f);
        pathBuilder2.lineTo(4.0f, 6.03f);
        pathBuilder2.lineToRelative(7.51f, 3.22f);
        pathBuilder2.lineToRelative(-7.51f, -1.0f);
        pathBuilder2.close();
        pathBuilder2.moveTo(4.01f, 17.97f);
        pathBuilder2.verticalLineToRelative(-2.22f);
        pathBuilder2.lineToRelative(7.51f, -1.0f);
        pathBuilder2.lineToRelative(-7.51f, 3.22f);
        pathBuilder2.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw2, m2872getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = build;
        g0.m(build);
        return build;
    }

    @n(message = "Use the AutoMirrored version at Icons.AutoMirrored.TwoTone.Send", replaceWith = @w0(expression = "Icons.AutoMirrored.TwoTone.Send", imports = {"androidx.compose.material.icons.automirrored.twotone.Send"}))
    public static /* synthetic */ void getSend$annotations(Icons.TwoTone twoTone) {
    }
}
