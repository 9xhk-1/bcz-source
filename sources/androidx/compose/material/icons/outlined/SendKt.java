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
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/outlined/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,59:1\n212#2,12:60\n233#2,18:73\n253#2:110\n174#3:72\n705#4,2:91\n717#4,2:93\n719#4,11:99\n72#5,4:95\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/outlined/SendKt\n*L\n35#1:60,12\n36#1:73,18\n36#1:110\n35#1:72\n36#1:91,2\n36#1:93,2\n36#1:99,11\n36#1:95,4\n*E\n"})
/* loaded from: classes.dex */
public final class SendKt {

    @l
    private static ImageVector _send;

    @k
    public static final ImageVector getSend(@k Icons.Outlined outlined) {
        ImageVector imageVector = _send;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Send", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(4.01f, 6.03f);
        pathBuilder.lineToRelative(7.51f, 3.22f);
        pathBuilder.lineToRelative(-7.52f, -1.0f);
        pathBuilder.lineToRelative(0.01f, -2.22f);
        pathBuilder.moveToRelative(7.5f, 8.72f);
        pathBuilder.lineTo(4.0f, 17.97f);
        pathBuilder.verticalLineToRelative(-2.22f);
        pathBuilder.lineToRelative(7.51f, -1.0f);
        pathBuilder.moveTo(2.01f, 3.0f);
        pathBuilder.lineTo(2.0f, 10.0f);
        pathBuilder.lineToRelative(15.0f, 2.0f);
        pathBuilder.lineToRelative(-15.0f, 2.0f);
        pathBuilder.lineToRelative(0.01f, 7.0f);
        pathBuilder.lineTo(23.0f, 12.0f);
        pathBuilder.lineTo(2.01f, 3.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = build;
        g0.m(build);
        return build;
    }

    @n(message = "Use the AutoMirrored version at Icons.AutoMirrored.Outlined.Send", replaceWith = @w0(expression = "Icons.AutoMirrored.Outlined.Send", imports = {"androidx.compose.material.icons.automirrored.outlined.Send"}))
    public static /* synthetic */ void getSend$annotations(Icons.Outlined outlined) {
    }
}
