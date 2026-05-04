package com.baicizhan.platform.base.widget;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.material.ContentAlphaKt;
import androidx.compose.material.ContentColorKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nBSurface.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BSurface.kt\ncom/baicizhan/platform/base/widget/BSurfaceKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,36:1\n75#2:37\n*S KotlinDebug\n*F\n+ 1 BSurface.kt\ncom/baicizhan/platform/base/widget/BSurfaceKt\n*L\n32#1:37\n*E\n"})
/* loaded from: classes6.dex */
public final class d {
    /* JADX WARN: Removed duplicated region for block: B:10:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0062  */
    @androidx.compose.runtime.Composable
    @androidx.compose.runtime.ComposableInferredTarget(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@m80.l androidx.compose.ui.Modifier r22, @m80.l androidx.compose.ui.graphics.Shape r23, long r24, long r26, @m80.l androidx.compose.foundation.BorderStroke r28, @m80.k final x00.p<? super androidx.compose.runtime.Composer, ? super java.lang.Integer, yz.g2> r29, @m80.l androidx.compose.runtime.Composer r30, final int r31, final int r32) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.d.d(androidx.compose.ui.Modifier, androidx.compose.ui.graphics.Shape, long, long, androidx.compose.foundation.BorderStroke, x00.p, androidx.compose.runtime.Composer, int, int):void");
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 e(final x00.p pVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1844266279, i11, -1, "com.baicizhan.platform.base.widget.BSurface.<anonymous> (BSurface.kt:31)");
            }
            CompositionLocalKt.CompositionLocalProvider(ContentAlphaKt.getLocalContentAlpha().provides(Float.valueOf(Color.m2511getAlphaimpl(((Color) composer.consume(ContentColorKt.getLocalContentColor())).m2519unboximpl()))), ComposableLambdaKt.rememberComposableLambda(-133445529, true, new x00.p() { // from class: com.baicizhan.platform.base.widget.c
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 f11;
                    f11 = d.f(x00.p.this, (Composer) obj, ((Integer) obj2).intValue());
                    return f11;
                }
            }, composer, 54), composer, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @Composable
    public static final yz.g2 f(x00.p pVar, Composer composer, int i11) {
        if (composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-133445529, i11, -1, "com.baicizhan.platform.base.widget.BSurface.<anonymous>.<anonymous> (BSurface.kt:32)");
            }
            pVar.invoke(composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composer.skipToGroupEnd();
        }
        return yz.g2.f100423a;
    }

    public static final yz.g2 g(Modifier modifier, Shape shape, long j11, long j12, BorderStroke borderStroke, x00.p pVar, int i11, int i12, Composer composer, int i13) {
        d(modifier, shape, j11, j12, borderStroke, pVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }
}
