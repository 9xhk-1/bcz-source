package androidx.compose.material;

import androidx.compose.foundation.BackgroundKt;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.ShadowKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,488:1\n149#2:489\n149#2:492\n149#2:495\n149#2:498\n75#3:490\n75#3:493\n75#3:496\n75#3:499\n51#4:491\n51#4:494\n51#4:497\n51#4:500\n*S KotlinDebug\n*F\n+ 1 Surface.kt\nandroidx/compose/material/SurfaceKt\n*L\n101#1:489\n206#1:492\n316#1:495\n427#1:498\n104#1:490\n210#1:493\n320#1:496\n431#1:499\n104#1:491\n210#1:494\n320#1:497\n431#1:500\n*E\n"})
/* loaded from: classes.dex */
public final class SurfaceKt {
    /* JADX WARN: Removed duplicated region for block: B:106:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0081  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-F-jzlyU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1784SurfaceFjzlyU(@m80.l androidx.compose.ui.Modifier r26, @m80.l androidx.compose.ui.graphics.Shape r27, long r28, long r30, @m80.l androidx.compose.foundation.BorderStroke r32, float r33, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r34, @m80.l androidx.compose.runtime.Composer r35, final int r36, final int r37) {
        /*
            Method dump skipped, instructions count: 482
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1784SurfaceFjzlyU(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-LPr_se0, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1785SurfaceLPr_se0(@m80.k final x00.a<yz.g2> r27, @m80.l androidx.compose.ui.Modifier r28, boolean r29, @m80.l androidx.compose.ui.graphics.Shape r30, long r31, long r33, @m80.l androidx.compose.foundation.BorderStroke r35, float r36, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r37, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r38, @m80.l androidx.compose.runtime.Composer r39, final int r40, final int r41) {
        /*
            Method dump skipped, instructions count: 624
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1785SurfaceLPr_se0(x00.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1786SurfaceNy5ogXk(final boolean r29, @m80.k final x00.a<yz.g2> r30, @m80.l androidx.compose.ui.Modifier r31, boolean r32, @m80.l androidx.compose.ui.graphics.Shape r33, long r34, long r36, @m80.l androidx.compose.foundation.BorderStroke r38, float r39, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r40, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r41, @m80.l androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1786SurfaceNy5ogXk(boolean, x00.a, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, x00.p, androidx.compose.runtime.Composer, int, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: surface-8ww4TTg, reason: not valid java name */
    public static final Modifier m1790surface8ww4TTg(Modifier modifier, Shape shape, long j11, BorderStroke borderStroke, float f11) {
        Modifier m2144shadows4CzXII$default = ShadowKt.m2144shadows4CzXII$default(modifier, f11, shape, false, 0L, 0L, 24, null);
        Modifier modifier2 = Modifier.Companion;
        if (borderStroke != null) {
            modifier2 = BorderKt.border(modifier2, borderStroke, shape);
        }
        return ClipKt.clip(BackgroundKt.m234backgroundbw27NRU(m2144shadows4CzXII$default.then(modifier2), j11, shape), shape);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    /* renamed from: surfaceColorAtElevation-cq6XJ1M, reason: not valid java name */
    public static final long m1791surfaceColorAtElevationcq6XJ1M(long j11, ElevationOverlay elevationOverlay, float f11, Composer composer, int i11) {
        long j12;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1561611256, i11, -1, "androidx.compose.material.surfaceColorAtElevation (Surface.kt:480)");
        }
        if (!Color.m2510equalsimpl0(j11, MaterialTheme.INSTANCE.getColors(composer, 6).m1604getSurface0d7_KjU()) || elevationOverlay == null) {
            composer.startReplaceGroup(1082990783);
            composer.endReplaceGroup();
            j12 = j11;
        } else {
            composer.startReplaceGroup(1082922676);
            j12 = elevationOverlay.mo1641apply7g2Lkgo(j11, f11, composer, (i11 & 14) | ((i11 >> 3) & 112) | ((i11 << 3) & 896));
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:10:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.Composable
    @androidx.compose.material.ExperimentalMaterialApi
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /* renamed from: Surface-Ny5ogXk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void m1787SurfaceNy5ogXk(final boolean r29, @m80.k final x00.l<? super java.lang.Boolean, yz.g2> r30, @m80.l androidx.compose.ui.Modifier r31, boolean r32, @m80.l androidx.compose.ui.graphics.Shape r33, long r34, long r36, @m80.l androidx.compose.foundation.BorderStroke r38, float r39, @m80.l androidx.compose.foundation.interaction.MutableInteractionSource r40, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r41, @m80.l androidx.compose.runtime.Composer r42, final int r43, final int r44, final int r45) {
        /*
            Method dump skipped, instructions count: 675
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.SurfaceKt.m1787SurfaceNy5ogXk(boolean, x00.l, androidx.compose.ui.Modifier, boolean, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, float, androidx.compose.foundation.interaction.MutableInteractionSource, x00.p, androidx.compose.runtime.Composer, int, int, int):void");
    }
}
