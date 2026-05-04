package androidx.compose.material;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ReadOnlyComposable;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nColors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n+ 2 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,352:1\n708#2:353\n696#2:354\n75#3:355\n*S KotlinDebug\n*F\n+ 1 Colors.kt\nandroidx/compose/material/ColorsKt\n*L\n312#1:353\n312#1:354\n312#1:355\n*E\n"})
/* loaded from: classes.dex */
public final class ColorsKt {

    @k
    private static final ProvidableCompositionLocal<Colors> LocalColors = CompositionLocalKt.staticCompositionLocalOf(new a<Colors>() { // from class: androidx.compose.material.ColorsKt$LocalColors$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final Colors invoke() {
            return ColorsKt.m1622lightColors2qZNXz8$default(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 4095, null);
        }
    });

    /* renamed from: contentColorFor-4WTKRHQ, reason: not valid java name */
    public static final long m1617contentColorFor4WTKRHQ(@k Colors colors, long j11) {
        return Color.m2510equalsimpl0(j11, colors.m1600getPrimary0d7_KjU()) ? colors.m1597getOnPrimary0d7_KjU() : Color.m2510equalsimpl0(j11, colors.m1601getPrimaryVariant0d7_KjU()) ? colors.m1597getOnPrimary0d7_KjU() : Color.m2510equalsimpl0(j11, colors.m1602getSecondary0d7_KjU()) ? colors.m1598getOnSecondary0d7_KjU() : Color.m2510equalsimpl0(j11, colors.m1603getSecondaryVariant0d7_KjU()) ? colors.m1598getOnSecondary0d7_KjU() : Color.m2510equalsimpl0(j11, colors.m1593getBackground0d7_KjU()) ? colors.m1595getOnBackground0d7_KjU() : Color.m2510equalsimpl0(j11, colors.m1604getSurface0d7_KjU()) ? colors.m1599getOnSurface0d7_KjU() : Color.m2510equalsimpl0(j11, colors.m1594getError0d7_KjU()) ? colors.m1596getOnError0d7_KjU() : Color.Companion.m2545getUnspecified0d7_KjU();
    }

    @Composable
    @ReadOnlyComposable
    /* renamed from: contentColorFor-ek8zF_U, reason: not valid java name */
    public static final long m1618contentColorForek8zF_U(long j11, @l Composer composer, int i11) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441849991, i11, -1, "androidx.compose.material.contentColorFor (Colors.kt:311)");
        }
        composer.startReplaceGroup(-702388415);
        long m1617contentColorFor4WTKRHQ = m1617contentColorFor4WTKRHQ(MaterialTheme.INSTANCE.getColors(composer, 6), j11);
        if (m1617contentColorFor4WTKRHQ == 16) {
            m1617contentColorFor4WTKRHQ = ((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl();
        }
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return m1617contentColorFor4WTKRHQ;
    }

    @k
    /* renamed from: darkColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1619darkColors2qZNXz8(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23) {
        return new Colors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, false, null);
    }

    /* renamed from: darkColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1620darkColors2qZNXz8$default(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, int i11, Object obj) {
        long Color = (i11 & 1) != 0 ? ColorKt.Color(4290479868L) : j11;
        long Color2 = (i11 & 2) != 0 ? ColorKt.Color(4281794739L) : j12;
        long Color3 = (i11 & 4) != 0 ? ColorKt.Color(4278442694L) : j13;
        long j24 = (i11 & 8) != 0 ? Color3 : j14;
        long Color4 = (i11 & 16) != 0 ? ColorKt.Color(4279374354L) : j15;
        long Color5 = (i11 & 32) != 0 ? ColorKt.Color(4279374354L) : j16;
        long Color6 = (i11 & 64) != 0 ? ColorKt.Color(4291782265L) : j17;
        long m2535getBlack0d7_KjU = (i11 & 128) != 0 ? Color.Companion.m2535getBlack0d7_KjU() : j18;
        long m2535getBlack0d7_KjU2 = (i11 & 256) != 0 ? Color.Companion.m2535getBlack0d7_KjU() : j19;
        long m2546getWhite0d7_KjU = (i11 & 512) != 0 ? Color.Companion.m2546getWhite0d7_KjU() : j21;
        long m2546getWhite0d7_KjU2 = (i11 & 1024) != 0 ? Color.Companion.m2546getWhite0d7_KjU() : j22;
        if ((i11 & 2048) != 0) {
            j23 = Color.Companion.m2535getBlack0d7_KjU();
        }
        return m1619darkColors2qZNXz8(Color, Color2, Color3, j24, Color4, Color5, Color6, m2535getBlack0d7_KjU, m2535getBlack0d7_KjU2, m2546getWhite0d7_KjU, m2546getWhite0d7_KjU2, j23);
    }

    @k
    public static final ProvidableCompositionLocal<Colors> getLocalColors() {
        return LocalColors;
    }

    public static final long getPrimarySurface(@k Colors colors) {
        return colors.isLight() ? colors.m1600getPrimary0d7_KjU() : colors.m1604getSurface0d7_KjU();
    }

    @k
    /* renamed from: lightColors-2qZNXz8, reason: not valid java name */
    public static final Colors m1621lightColors2qZNXz8(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23) {
        return new Colors(j11, j12, j13, j14, j15, j16, j17, j18, j19, j21, j22, j23, true, null);
    }

    /* renamed from: lightColors-2qZNXz8$default, reason: not valid java name */
    public static /* synthetic */ Colors m1622lightColors2qZNXz8$default(long j11, long j12, long j13, long j14, long j15, long j16, long j17, long j18, long j19, long j21, long j22, long j23, int i11, Object obj) {
        long Color = (i11 & 1) != 0 ? ColorKt.Color(4284612846L) : j11;
        long Color2 = (i11 & 2) != 0 ? ColorKt.Color(4281794739L) : j12;
        long Color3 = (i11 & 4) != 0 ? ColorKt.Color(4278442694L) : j13;
        long Color4 = (i11 & 8) != 0 ? ColorKt.Color(4278290310L) : j14;
        long m2546getWhite0d7_KjU = (i11 & 16) != 0 ? Color.Companion.m2546getWhite0d7_KjU() : j15;
        long m2546getWhite0d7_KjU2 = (i11 & 32) != 0 ? Color.Companion.m2546getWhite0d7_KjU() : j16;
        long Color5 = (i11 & 64) != 0 ? ColorKt.Color(4289724448L) : j17;
        long m2546getWhite0d7_KjU3 = (i11 & 128) != 0 ? Color.Companion.m2546getWhite0d7_KjU() : j18;
        long j24 = Color;
        long m2535getBlack0d7_KjU = (i11 & 256) != 0 ? Color.Companion.m2535getBlack0d7_KjU() : j19;
        long m2535getBlack0d7_KjU2 = (i11 & 512) != 0 ? Color.Companion.m2535getBlack0d7_KjU() : j21;
        long m2535getBlack0d7_KjU3 = (i11 & 1024) != 0 ? Color.Companion.m2535getBlack0d7_KjU() : j22;
        if ((i11 & 2048) != 0) {
            j23 = Color.Companion.m2546getWhite0d7_KjU();
        }
        return m1621lightColors2qZNXz8(j24, Color2, Color3, Color4, m2546getWhite0d7_KjU, m2546getWhite0d7_KjU2, Color5, m2546getWhite0d7_KjU3, m2535getBlack0d7_KjU, m2535getBlack0d7_KjU2, m2535getBlack0d7_KjU3, j23);
    }

    public static final void updateColorsFrom(@k Colors colors, @k Colors colors2) {
        colors.m1612setPrimary8_81llA$material_release(colors2.m1600getPrimary0d7_KjU());
        colors.m1613setPrimaryVariant8_81llA$material_release(colors2.m1601getPrimaryVariant0d7_KjU());
        colors.m1614setSecondary8_81llA$material_release(colors2.m1602getSecondary0d7_KjU());
        colors.m1615setSecondaryVariant8_81llA$material_release(colors2.m1603getSecondaryVariant0d7_KjU());
        colors.m1605setBackground8_81llA$material_release(colors2.m1593getBackground0d7_KjU());
        colors.m1616setSurface8_81llA$material_release(colors2.m1604getSurface0d7_KjU());
        colors.m1606setError8_81llA$material_release(colors2.m1594getError0d7_KjU());
        colors.m1609setOnPrimary8_81llA$material_release(colors2.m1597getOnPrimary0d7_KjU());
        colors.m1610setOnSecondary8_81llA$material_release(colors2.m1598getOnSecondary0d7_KjU());
        colors.m1607setOnBackground8_81llA$material_release(colors2.m1595getOnBackground0d7_KjU());
        colors.m1611setOnSurface8_81llA$material_release(colors2.m1599getOnSurface0d7_KjU());
        colors.m1608setOnError8_81llA$material_release(colors2.m1596getOnError0d7_KjU());
        colors.setLight$material_release(colors2.isLight());
    }
}
