package androidx.compose.material;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.unit.Dp;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import m80.k;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAppBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,741:1\n590#1:744\n590#1:745\n590#1:746\n590#1:747\n590#1:748\n590#1:749\n75#2:742\n75#2:743\n149#3:750\n149#3:751\n149#3:752\n149#3:754\n149#3:756\n149#3:757\n149#3:758\n57#4:753\n57#4:755\n*S KotlinDebug\n*F\n+ 1 AppBar.kt\nandroidx/compose/material/AppBarKt\n*L\n615#1:744\n647#1:745\n648#1:746\n650#1:747\n657#1:748\n658#1:749\n343#1:742\n413#1:743\n727#1:750\n729#1:751\n731#1:752\n733#1:754\n736#1:756\n738#1:757\n740#1:758\n731#1:753\n733#1:755\n*E\n"})
/* loaded from: classes.dex */
public final class AppBarKt {
    private static final float AppBarHeight = Dp.m5115constructorimpl(56);
    private static final float AppBarHorizontalPadding;
    private static final float BottomAppBarCutoutOffset;
    private static final float BottomAppBarRoundedEdgeRadius;

    @k
    private static final Modifier TitleIconModifier;

    @k
    private static final Modifier TitleInsetWithoutIcon;

    @k
    private static final WindowInsets ZeroInsets;

    static {
        float f11 = 4;
        float m5115constructorimpl = Dp.m5115constructorimpl(f11);
        AppBarHorizontalPadding = m5115constructorimpl;
        Modifier.Companion companion = Modifier.Companion;
        TitleInsetWithoutIcon = SizeKt.m778width3ABfNKs(companion, Dp.m5115constructorimpl(Dp.m5115constructorimpl(16) - m5115constructorimpl));
        TitleIconModifier = SizeKt.m778width3ABfNKs(SizeKt.fillMaxHeight$default(companion, 0.0f, 1, null), Dp.m5115constructorimpl(Dp.m5115constructorimpl(72) - m5115constructorimpl));
        BottomAppBarCutoutOffset = Dp.m5115constructorimpl(8);
        BottomAppBarRoundedEdgeRadius = Dp.m5115constructorimpl(f11);
        ZeroInsets = WindowInsetsKt.m798WindowInsetsa9UjIt4$default(Dp.m5115constructorimpl(0), 0.0f, 0.0f, 0.0f, 14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006e  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: AppBar-HkEspTQ, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1526AppBarHkEspTQ(final long r25, final long r27, final float r29, final androidx.compose.foundation.layout.PaddingValues r30, final androidx.compose.ui.graphics.Shape r31, final androidx.compose.foundation.layout.WindowInsets r32, androidx.compose.ui.Modifier r33, final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r34, androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 374
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1526AppBarHkEspTQ(long, long, float, androidx.compose.foundation.layout.PaddingValues, androidx.compose.ui.graphics.Shape, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00dc  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-DanWW-k, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1527BottomAppBarDanWWk(@m80.k final androidx.compose.foundation.layout.WindowInsets r26, @m80.l androidx.compose.ui.Modifier r27, long r28, long r30, @m80.l androidx.compose.ui.graphics.Shape r32, float r33, @m80.l androidx.compose.foundation.layout.PaddingValues r34, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r35, @m80.l androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1527BottomAppBarDanWWk(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.Shape, float, androidx.compose.foundation.layout.PaddingValues, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:71:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x00a1  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: BottomAppBar-Y1yfwus, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1528BottomAppBarY1yfwus(@m80.l androidx.compose.ui.Modifier r24, long r25, long r27, @m80.l androidx.compose.ui.graphics.Shape r29, float r30, @m80.l androidx.compose.foundation.layout.PaddingValues r31, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r32, @m80.l androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1528BottomAppBarY1yfwus(androidx.compose.ui.Modifier, long, long, androidx.compose.ui.graphics.Shape, float, androidx.compose.foundation.layout.PaddingValues, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0083  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-HsRjFd4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1529TopAppBarHsRjFd4(@m80.l androidx.compose.ui.Modifier r23, long r24, long r26, float r28, @m80.l androidx.compose.foundation.layout.PaddingValues r29, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r30, @m80.l androidx.compose.runtime.Composer r31, final int r32, final int r33) {
        /*
            Method dump skipped, instructions count: 409
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1529TopAppBarHsRjFd4(androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00c7  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-Rx1qByU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1530TopAppBarRx1qByU(@m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r26, @m80.k final androidx.compose.foundation.layout.WindowInsets r27, @m80.l androidx.compose.ui.Modifier r28, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r30, long r31, long r33, float r35, @m80.l androidx.compose.runtime.Composer r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1530TopAppBarRx1qByU(x00.p, androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, x00.p, x00.q, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0083  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-afqeVBk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1531TopAppBarafqeVBk(@m80.k final androidx.compose.foundation.layout.WindowInsets r24, @m80.l androidx.compose.ui.Modifier r25, long r26, long r28, float r30, @m80.l androidx.compose.foundation.layout.PaddingValues r31, @m80.k final x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r32, @m80.l androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 438
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1531TopAppBarafqeVBk(androidx.compose.foundation.layout.WindowInsets, androidx.compose.ui.Modifier, long, long, float, androidx.compose.foundation.layout.PaddingValues, x00.q, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0065  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* renamed from: TopAppBar-xWeB9-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1532TopAppBarxWeB9s(@m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r24, @m80.l androidx.compose.ui.Modifier r25, @m80.l x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r26, @m80.l x00.q<? super androidx.compose.foundation.layout.RowScope, ? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r27, long r28, long r30, float r32, @m80.l androidx.compose.runtime.Composer r33, final int r34, final int r35) {
        /*
            Method dump skipped, instructions count: 439
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.AppBarKt.m1532TopAppBarxWeB9s(x00.p, androidx.compose.ui.Modifier, x00.p, x00.q, long, long, float, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final float calculateCutoutCircleYIntercept(float f11, float f12) {
        return -((float) Math.sqrt((f11 * f11) - (f12 * f12)));
    }

    @k
    public static final Pair<Float, Float> calculateRoundedEdgeIntercept(float f11, float f12, float f13) {
        Float valueOf;
        Float valueOf2;
        Pair a11;
        Float valueOf3;
        Float valueOf4;
        float f14 = f12 * f12;
        float f15 = f13 * f13;
        float f16 = (f11 * f11) + f14;
        float f17 = f14 * f15 * (f16 - f15);
        float f18 = f11 * f15;
        double d11 = f17;
        float sqrt = (f18 - ((float) Math.sqrt(d11))) / f16;
        float sqrt2 = (f18 + ((float) Math.sqrt(d11))) / f16;
        float sqrt3 = (float) Math.sqrt(f15 - (sqrt * sqrt));
        float sqrt4 = (float) Math.sqrt(f15 - (sqrt2 * sqrt2));
        if (f12 > 0.0f) {
            if (sqrt3 > sqrt4) {
                valueOf3 = Float.valueOf(sqrt);
                valueOf4 = Float.valueOf(sqrt3);
            } else {
                valueOf3 = Float.valueOf(sqrt2);
                valueOf4 = Float.valueOf(sqrt4);
            }
            a11 = h1.a(valueOf3, valueOf4);
        } else {
            if (sqrt3 < sqrt4) {
                valueOf = Float.valueOf(sqrt);
                valueOf2 = Float.valueOf(sqrt3);
            } else {
                valueOf = Float.valueOf(sqrt2);
                valueOf2 = Float.valueOf(sqrt4);
            }
            a11 = h1.a(valueOf, valueOf2);
        }
        float floatValue = ((Number) a11.component1()).floatValue();
        float floatValue2 = ((Number) a11.component2()).floatValue();
        if (floatValue < f11) {
            floatValue2 = -floatValue2;
        }
        return h1.a(Float.valueOf(floatValue), Float.valueOf(floatValue2));
    }

    private static final float square(float f11) {
        return f11 * f11;
    }
}
