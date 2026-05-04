package androidx.compose.ui.platform;

import android.view.View;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.nestedscroll.NestedScrollConnection;
import androidx.compose.ui.input.nestedscroll.NestedScrollSource;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "NestedScrollInteropConnectionKt")
@kotlin.jvm.internal.u0({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,233:1\n65#2:234\n65#2:237\n65#2:240\n69#2:243\n69#2:246\n69#2:249\n65#2:256\n69#2:259\n60#3:235\n60#3:238\n60#3:241\n70#3:244\n70#3:247\n70#3:250\n53#3,3:253\n60#3:257\n70#3:260\n22#4:236\n22#4:239\n22#4:242\n22#4:245\n22#4:248\n22#4:251\n22#4:258\n22#4:261\n30#5:252\n75#6:262\n1247#7,6:263\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n171#1:234\n172#1:237\n174#1:240\n178#1:243\n179#1:246\n181#1:249\n203#1:256\n206#1:259\n171#1:235\n172#1:238\n174#1:241\n178#1:244\n179#1:247\n181#1:250\n184#1:253,3\n203#1:257\n206#1:260\n171#1:236\n172#1:239\n174#1:242\n178#1:245\n179#1:248\n181#1:251\n203#1:258\n206#1:261\n184#1:252\n231#1:262\n232#1:263,6\n*E\n"})
/* loaded from: classes2.dex */
public final class NestedScrollInteropConnectionKt {
    private static final float ScrollingAxesThreshold = 0.5f;

    private static final float ceilAwayFromZero(float f11) {
        return (float) (f11 >= 0.0f ? Math.ceil(f11) : Math.floor(f11));
    }

    public static final int composeToViewOffset(float f11) {
        return ((int) ceilAwayFromZero(f11)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getScrollAxes-k-4lQ0M, reason: not valid java name */
    public static final int m4293getScrollAxesk4lQ0M(long j11) {
        int i11 = Math.abs(Float.intBitsToFloat((int) (j11 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j11 & 4294967295L))) >= 0.5f ? i11 | 2 : i11;
    }

    @Composable
    @m80.k
    public static final NestedScrollConnection rememberNestedScrollInteropConnection(@m80.l View view, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            view = (View) composer.consume(AndroidCompositionLocals_androidKt.getLocalView());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1075877987, i11, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:231)");
        }
        boolean changed = composer.changed(view);
        Object rememberedValue = composer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new NestedScrollInteropConnection(view);
            composer.updateRememberedValue(rememberedValue);
        }
        NestedScrollInteropConnection nestedScrollInteropConnection = (NestedScrollInteropConnection) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return nestedScrollInteropConnection;
    }

    private static final float reverseAxis(int i11) {
        return i11 * (-1.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toOffset-Uv8p0NA, reason: not valid java name */
    public static final long m4294toOffsetUv8p0NA(int[] iArr, long j11) {
        return Offset.m2260constructorimpl((Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 >> 32)) >= 0.0f ? g10.u.A(reverseAxis(iArr[0]), Float.intBitsToFloat(r1)) : g10.u.t(reverseAxis(iArr[0]), Float.intBitsToFloat(r1))) << 32) | (Float.floatToRawIntBits(Float.intBitsToFloat((int) (j11 & 4294967295L)) >= 0.0f ? g10.u.A(reverseAxis(iArr[1]), Float.intBitsToFloat(r7)) : g10.u.t(reverseAxis(iArr[1]), Float.intBitsToFloat(r7))) & 4294967295L));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: toViewType-GyEprt8, reason: not valid java name */
    public static final int m4295toViewTypeGyEprt8(int i11) {
        return !NestedScrollSource.m3613equalsimpl0(i11, NestedScrollSource.Companion.m3625getUserInputWNlRxjI()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float toViewVelocity(float f11) {
        return f11 * (-1.0f);
    }
}
