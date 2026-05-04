package androidx.compose.material.internal;

import androidx.compose.runtime.internal.StabilityInferred;
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
@StabilityInferred(parameters = 1)
/* loaded from: classes.dex */
public final class Icons {
    public static final int $stable = 0;

    @k
    public static final Icons INSTANCE = new Icons();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @StabilityInferred(parameters = 0)
    @u0({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/Icons$Filled\n+ 2 Icons.kt\nandroidx/compose/material/internal/IconsKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 5 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n64#2:88\n57#2,3:89\n60#2,3:93\n67#2,15:96\n84#2:130\n65#2:131\n169#3:92\n710#4,2:111\n722#4,2:113\n724#4,11:119\n72#5,4:115\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/Icons$Filled\n*L\n38#1:88\n38#1:89,3\n38#1:93,3\n39#1:96,15\n39#1:130\n38#1:131\n38#1:92\n39#1:111,2\n39#1:113,2\n39#1:119,11\n39#1:115,4\n*E\n"})
    public static final class Filled {

        @l
        private static ImageVector _arrowDropDown;

        @k
        public static final Filled INSTANCE = new Filled();
        public static final int $stable = 8;

        private Filled() {
        }

        @k
        public final ImageVector getArrowDropDown$material_release() {
            ImageVector imageVector = _arrowDropDown;
            if (imageVector != null) {
                g0.m(imageVector);
                return imageVector;
            }
            ImageVector.Builder builder = new ImageVector.Builder("Filled.ArrowDropDown", Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null);
            int defaultFillType = VectorKt.getDefaultFillType();
            SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
            int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
            int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
            PathBuilder pathBuilder = new PathBuilder();
            pathBuilder.moveTo(7.0f, 10.0f);
            pathBuilder.lineToRelative(5.0f, 5.0f);
            pathBuilder.lineToRelative(5.0f, -5.0f);
            pathBuilder.close();
            ImageVector build = ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
            _arrowDropDown = build;
            g0.m(build);
            return build;
        }
    }

    private Icons() {
    }
}
