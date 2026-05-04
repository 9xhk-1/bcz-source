package androidx.compose.material.icons;

import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nIcons.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 ImageVector.kt\nandroidx/compose/ui/graphics/vector/ImageVectorKt\n+ 4 Vector.kt\nandroidx/compose/ui/graphics/vector/VectorKt\n*L\n1#1,258:1\n223#1:259\n216#1,3:260\n219#1,4:264\n174#2:263\n174#2:268\n174#2:269\n174#2:270\n174#2:271\n705#3,2:272\n717#3,2:274\n719#3,11:280\n717#3,13:291\n72#4,4:276\n*S KotlinDebug\n*F\n+ 1 Icons.kt\nandroidx/compose/material/icons/IconsKt\n*L\n201#1:259\n201#1:260,3\n201#1:264,4\n201#1:263\n218#1:268\n219#1:269\n218#1:270\n219#1:271\n242#1:272,2\n242#1:274,2\n242#1:280,11\n242#1:291,13\n242#1:276,4\n*E\n"})
/* loaded from: classes.dex */
public final class IconsKt {
    public static final float MaterialIconDimension = 24.0f;

    @k
    public static final ImageVector materialIcon(@k String str, boolean z11, @k l<? super ImageVector.Builder, ImageVector.Builder> lVar) {
        return lVar.invoke(new ImageVector.Builder(str, Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z11, 96, null)).build();
    }

    public static /* synthetic */ ImageVector materialIcon$default(String str, boolean z11, l lVar, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        return ((ImageVector.Builder) lVar.invoke(new ImageVector.Builder(str, Dp.m5115constructorimpl(24.0f), Dp.m5115constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, z11, 96, null))).build();
    }

    @k
    /* renamed from: materialPath-YwgOQQI, reason: not valid java name */
    public static final ImageVector.Builder m1848materialPathYwgOQQI(@k ImageVector.Builder builder, float f11, float f12, int i11, @k l<? super PathBuilder, g2> lVar) {
        SolidColor solidColor = new SolidColor(Color.Companion.m2535getBlack0d7_KjU(), null);
        int m2862getButtKaPHkGw = StrokeCap.Companion.m2862getButtKaPHkGw();
        int m2872getBevelLxFBmk8 = StrokeJoin.Companion.m2872getBevelLxFBmk8();
        PathBuilder pathBuilder = new PathBuilder();
        lVar.invoke(pathBuilder);
        return ImageVector.Builder.m3194addPathoIyEayM$default(builder, pathBuilder.getNodes(), i11, "", solidColor, f11, null, f12, 1.0f, m2862getButtKaPHkGw, m2872getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
    }

    /* renamed from: materialPath-YwgOQQI$default, reason: not valid java name */
    public static /* synthetic */ ImageVector.Builder m1849materialPathYwgOQQI$default(ImageVector.Builder builder, float f11, float f12, int i11, l lVar, int i12, Object obj) {
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

    @v0
    public static /* synthetic */ void getMaterialIconDimension$annotations() {
    }
}
