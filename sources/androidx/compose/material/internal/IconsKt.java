package androidx.compose.material.internal;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/IconsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 4 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,87:1\n169#2:88\n169#2:89\n710#3,2:90\n722#3,2:92\n724#3,11:98\n722#3,13:109\n72#4,4:94\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/internal/IconsKt\n*L\n59#1:88\n60#1:89\n73#1:90,2\n73#1:92,2\n73#1:98,11\n73#1:109,13\n73#1:94,4\n*E\n"})
/* loaded from: classes.dex */
public final class IconsKt {
    private static final float MaterialIconDimension = 24.0f;

    private static final ImageVector materialIcon(String str, l<? super ImageVector.Builder, ImageVector.Builder> lVar) {
        return lVar.invoke(new ImageVector.Builder(str, Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 224, null)).build();
    }

    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    private static final ImageVector.Builder m1852materialPathYwgOQQI(ImageVector.Builder builder, float f11, float f12, int i11, l<? super PathBuilder, g2> lVar) {
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), i11, "", solidColor, f11, null, f12, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1853materialPathYwgOQQI$default(ImageVector.Builder builder, float f11, float f12, int i11, l lVar, int i12, Object obj) {
        float f13 = (i12 & 1) != 0 ? 1.0f : f11;
        float f14 = (i12 & 2) != 0 ? 1.0f : f12;
        int defaultFillType = (i12 & 4) != 0 ? VectorKt.getDefaultFillType() : i11;
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), defaultFillType, "", solidColor, f13, null, f14, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }
}
