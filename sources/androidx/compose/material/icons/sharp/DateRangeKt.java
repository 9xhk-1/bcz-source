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
@u0({"SMAP\nDateRange.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateRange.kt\nandroidx/compose/material/icons/sharp/DateRangeKt\n+ 2 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,75:1\n212#2,12:76\n233#2,18:89\n253#2:126\n174#3:88\n705#4,2:107\n717#4,2:109\n719#4,11:115\n72#5,4:111\n*S KotlinDebug\n*F\n+ 1 DateRange.kt\nandroidx/compose/material/icons/sharp/DateRangeKt\n*L\n29#1:76,12\n30#1:89,18\n30#1:126\n29#1:88\n30#1:107,2\n30#1:109,2\n30#1:115,11\n30#1:111,4\n*E\n"})
/* loaded from: classes.dex */
public final class DateRangeKt {

    @l
    private static ImageVector _dateRange;

    @k
    public static final ImageVector getDateRange(@k Icons.Sharp sharp) {
        ImageVector imageVector = _dateRange;
        if (imageVector != null) {
            g0.m(imageVector);
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DateRange", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        pathBuilder.moveTo(9.0f, 11.0f);
        pathBuilder.lineTo(7.0f, 11.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(13.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(17.0f, 11.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.horizontalLineToRelative(2.0f);
        pathBuilder.verticalLineToRelative(-2.0f);
        pathBuilder.close();
        pathBuilder.moveTo(21.0f, 4.0f);
        pathBuilder.horizontalLineToRelative(-3.0f);
        pathBuilder.lineTo(18.0f, 2.0f);
        pathBuilder.horizontalLineToRelative(-2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(8.0f, 4.0f);
        pathBuilder.lineTo(8.0f, 2.0f);
        pathBuilder.lineTo(6.0f, 2.0f);
        pathBuilder.verticalLineToRelative(2.0f);
        pathBuilder.lineTo(3.0f, 4.0f);
        pathBuilder.verticalLineToRelative(18.0f);
        pathBuilder.horizontalLineToRelative(18.0f);
        pathBuilder.lineTo(21.0f, 4.0f);
        pathBuilder.close();
        pathBuilder.moveTo(19.0f, 20.0f);
        pathBuilder.lineTo(5.0f, 20.0f);
        pathBuilder.lineTo(5.0f, 9.0f);
        pathBuilder.horizontalLineToRelative(14.0f);
        pathBuilder.verticalLineToRelative(11.0f);
        pathBuilder.close();
        ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dateRange = build;
        g0.m(build);
        return build;
    }
}
