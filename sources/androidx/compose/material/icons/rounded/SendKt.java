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
import yz.n;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSend.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/rounded/SendKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,56:1\n212#2,12:57\n233#2,18:70\n253#2:107\n174#3:69\n705#4,2:88\n717#4,2:90\n719#4,11:96\n72#5,4:92\n*S KotlinDebug\n*F\n+ 1 Send.kt\nandroidx/compose/material/icons/rounded/SendKt\n*L\n35#1:57,12\n36#1:70,18\n36#1:107\n35#1:69\n36#1:88,2\n36#1:90,2\n36#1:96,11\n36#1:92,4\n*E\n"})
/* loaded from: classes.dex */
public final class SendKt {

    @l
    private static ImageVector _send;

    @k
    public static final ImageVector getSend(@k Icons.Rounded rounded) {
        ImageVector imageVector = _send;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Send", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(3.4f, 20.4f);
        pathBuilder.lineToRelative(17.45f, -7.48f);
        pathBuilder.curveToRelative(0.81f, -0.35f, 0.81f, -1.49f, 0.0f, -1.84f);
        pathBuilder.lineTo(3.4f, 3.6f);
        pathBuilder.curveToRelative(-0.66f, -0.29f, -1.39f, 0.2f, -1.39f, 0.91f);
        pathBuilder.lineTo(2.0f, 9.12f);
        pathBuilder.curveToRelative(0.0f, 0.5f, 0.37f, 0.93f, 0.87f, 0.99f);
        pathBuilder.lineTo(17.0f, 12.0f);
        pathBuilder.lineTo(2.87f, 13.88f);
        pathBuilder.curveToRelative(-0.5f, 0.07f, -0.87f, 0.5f, -0.87f, 1.0f);
        pathBuilder.lineToRelative(0.01f, 4.61f);
        pathBuilder.curveToRelative(0.0f, 0.71f, 0.73f, 1.2f, 1.39f, 0.91f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _send = build;
        g0.m(build);
        return build;
    }

    @n(message = "Use the AutoMirrored version at Icons.AutoMirrored.Rounded.Send", replaceWith = @w0(expression = "Icons.AutoMirrored.Rounded.Send", imports = {"androidx.compose.material.icons.automirrored.rounded.Send"}))
    public static /* synthetic */ void getSend$annotations(Icons.Rounded rounded) {
    }
}
