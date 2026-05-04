package com.baicizhan.platform.base.widget;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public final class x {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void f(@m80.l final Modifier modifier, @m80.k final x00.q<? super Modifier, ? super Composer, ? super Integer, yz.g2> content, @m80.l Composer composer, final int i11, final int i12) {
        int i13;
        kotlin.jvm.internal.g0.p(content, "content");
        Composer startRestartGroup = composer.startRestartGroup(849015106);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(content) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i13 & 19) != 18, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(849015106, i13, -1, "com.baicizhan.platform.base.widget.Body (Common.kt:16)");
            }
            content.invoke(PaddingKt.m730paddingqDBjuR0$default(modifier2, bk.d.c(), 0.0f, bk.d.c(), 0.0f, 10, null), startRestartGroup, Integer.valueOf(i13 & 112));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p() { // from class: com.baicizhan.platform.base.widget.t
                @Override // x00.p
                public final Object invoke(Object obj, Object obj2) {
                    yz.g2 g11;
                    g11 = x.g(Modifier.this, content, i11, i12, (Composer) obj, ((Integer) obj2).intValue());
                    return g11;
                }
            });
        }
    }

    public static final yz.g2 g(Modifier modifier, x00.q qVar, int i11, int i12, Composer composer, int i13) {
        f(modifier, qVar, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void h(@m80.k final java.lang.String r25, @m80.l androidx.compose.ui.Modifier r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            r0 = r25
            java.lang.String r1 = "text"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = -1598247926(0xffffffffa0bcac0a, float:-3.1962285E-19)
            r2 = r27
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r1)
            r3 = r28 & 6
            if (r3 != 0) goto L20
            boolean r3 = r2.changed(r0)
            if (r3 == 0) goto L1c
            r3 = 4
            goto L1d
        L1c:
            r3 = 2
        L1d:
            r3 = r28 | r3
            goto L22
        L20:
            r3 = r28
        L22:
            r4 = r29 & 2
            if (r4 == 0) goto L2b
            r3 = r3 | 48
        L28:
            r5 = r26
            goto L3d
        L2b:
            r5 = r28 & 48
            if (r5 != 0) goto L28
            r5 = r26
            boolean r6 = r2.changed(r5)
            if (r6 == 0) goto L3a
            r6 = 32
            goto L3c
        L3a:
            r6 = 16
        L3c:
            r3 = r3 | r6
        L3d:
            r6 = r3 & 19
            r7 = 18
            if (r6 == r7) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            r7 = r3 & 1
            boolean r6 = r2.shouldExecute(r6, r7)
            if (r6 == 0) goto L99
            if (r4 == 0) goto L53
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            goto L54
        L53:
            r4 = r5
        L54:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L60
            r5 = -1
            java.lang.String r6 = "com.baicizhan.platform.base.widget.BodyText (Common.kt:48)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r3, r5, r6)
        L60:
            androidx.compose.material.MaterialTheme r1 = androidx.compose.material.MaterialTheme.INSTANCE
            int r5 = androidx.compose.material.MaterialTheme.$stable
            androidx.compose.material.Typography r1 = r1.getTypography(r2, r5)
            androidx.compose.ui.text.TextStyle r20 = r1.getBody2()
            r22 = r3 & 126(0x7e, float:1.77E-43)
            r23 = 0
            r24 = 65532(0xfffc, float:9.183E-41)
            r21 = r2
            r2 = 0
            r1 = r4
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.material.TextKt.m1845Text4IGK_g(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L9f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L9f
        L99:
            r21 = r2
            r21.skipToGroupEnd()
            r1 = r5
        L9f:
            androidx.compose.runtime.ScopeUpdateScope r2 = r21.endRestartGroup()
            if (r2 == 0) goto Lb1
            com.baicizhan.platform.base.widget.s r3 = new com.baicizhan.platform.base.widget.s
            r4 = r28
            r5 = r29
            r3.<init>()
            r2.updateScope(r3)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.x.h(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 i(String str, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        h(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:30:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0046  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void j(@m80.k final java.lang.String r26, @m80.l androidx.compose.ui.Modifier r27, @m80.l androidx.compose.runtime.Composer r28, final int r29, final int r30) {
        /*
            Method dump skipped, instructions count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.x.j(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 k(String str, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        j(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void l(@m80.k final java.lang.String r25, @m80.l androidx.compose.ui.Modifier r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            r0 = r25
            java.lang.String r1 = "text"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = -1324831332(0xffffffffb108ad9c, float:-1.988929E-9)
            r2 = r27
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r1)
            r3 = r28 & 6
            if (r3 != 0) goto L20
            boolean r3 = r2.changed(r0)
            if (r3 == 0) goto L1c
            r3 = 4
            goto L1d
        L1c:
            r3 = 2
        L1d:
            r3 = r28 | r3
            goto L22
        L20:
            r3 = r28
        L22:
            r4 = r29 & 2
            if (r4 == 0) goto L2b
            r3 = r3 | 48
        L28:
            r5 = r26
            goto L3d
        L2b:
            r5 = r28 & 48
            if (r5 != 0) goto L28
            r5 = r26
            boolean r6 = r2.changed(r5)
            if (r6 == 0) goto L3a
            r6 = 32
            goto L3c
        L3a:
            r6 = 16
        L3c:
            r3 = r3 | r6
        L3d:
            r6 = r3 & 19
            r7 = 18
            if (r6 == r7) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            r7 = r3 & 1
            boolean r6 = r2.shouldExecute(r6, r7)
            if (r6 == 0) goto L99
            if (r4 == 0) goto L53
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            goto L54
        L53:
            r4 = r5
        L54:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L60
            r5 = -1
            java.lang.String r6 = "com.baicizhan.platform.base.widget.SubTitle1 (Common.kt:30)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r3, r5, r6)
        L60:
            androidx.compose.material.MaterialTheme r1 = androidx.compose.material.MaterialTheme.INSTANCE
            int r5 = androidx.compose.material.MaterialTheme.$stable
            androidx.compose.material.Typography r1 = r1.getTypography(r2, r5)
            androidx.compose.ui.text.TextStyle r20 = r1.getSubtitle1()
            r22 = r3 & 126(0x7e, float:1.77E-43)
            r23 = 0
            r24 = 65532(0xfffc, float:9.183E-41)
            r21 = r2
            r2 = 0
            r1 = r4
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.material.TextKt.m1845Text4IGK_g(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L9f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L9f
        L99:
            r21 = r2
            r21.skipToGroupEnd()
            r1 = r5
        L9f:
            androidx.compose.runtime.ScopeUpdateScope r2 = r21.endRestartGroup()
            if (r2 == 0) goto Lb1
            com.baicizhan.platform.base.widget.u r3 = new com.baicizhan.platform.base.widget.u
            r4 = r28
            r5 = r29
            r3.<init>()
            r2.updateScope(r3)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.x.l(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 m(String str, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        l(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0045  */
    @androidx.compose.runtime.ComposableTarget(applier = "androidx.compose.ui.UiComposable")
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void n(@m80.k final java.lang.String r25, @m80.l androidx.compose.ui.Modifier r26, @m80.l androidx.compose.runtime.Composer r27, final int r28, final int r29) {
        /*
            r0 = r25
            java.lang.String r1 = "text"
            kotlin.jvm.internal.g0.p(r0, r1)
            r1 = -216016133(0xfffffffff31fdafb, float:-1.2665049E31)
            r2 = r27
            androidx.compose.runtime.Composer r2 = r2.startRestartGroup(r1)
            r3 = r28 & 6
            if (r3 != 0) goto L20
            boolean r3 = r2.changed(r0)
            if (r3 == 0) goto L1c
            r3 = 4
            goto L1d
        L1c:
            r3 = 2
        L1d:
            r3 = r28 | r3
            goto L22
        L20:
            r3 = r28
        L22:
            r4 = r29 & 2
            if (r4 == 0) goto L2b
            r3 = r3 | 48
        L28:
            r5 = r26
            goto L3d
        L2b:
            r5 = r28 & 48
            if (r5 != 0) goto L28
            r5 = r26
            boolean r6 = r2.changed(r5)
            if (r6 == 0) goto L3a
            r6 = 32
            goto L3c
        L3a:
            r6 = 16
        L3c:
            r3 = r3 | r6
        L3d:
            r6 = r3 & 19
            r7 = 18
            if (r6 == r7) goto L45
            r6 = 1
            goto L46
        L45:
            r6 = 0
        L46:
            r7 = r3 & 1
            boolean r6 = r2.shouldExecute(r6, r7)
            if (r6 == 0) goto L99
            if (r4 == 0) goto L53
            androidx.compose.ui.Modifier$Companion r4 = androidx.compose.ui.Modifier.Companion
            goto L54
        L53:
            r4 = r5
        L54:
            boolean r5 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r5 == 0) goto L60
            r5 = -1
            java.lang.String r6 = "com.baicizhan.platform.base.widget.SubTitle2 (Common.kt:39)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r1, r3, r5, r6)
        L60:
            androidx.compose.material.MaterialTheme r1 = androidx.compose.material.MaterialTheme.INSTANCE
            int r5 = androidx.compose.material.MaterialTheme.$stable
            androidx.compose.material.Typography r1 = r1.getTypography(r2, r5)
            androidx.compose.ui.text.TextStyle r20 = r1.getSubtitle2()
            r22 = r3 & 126(0x7e, float:1.77E-43)
            r23 = 0
            r24 = 65532(0xfffc, float:9.183E-41)
            r21 = r2
            r2 = 0
            r1 = r4
            r4 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            androidx.compose.material.TextKt.m1845Text4IGK_g(r0, r1, r2, r4, r6, r7, r8, r9, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            boolean r2 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r2 == 0) goto L9f
            androidx.compose.runtime.ComposerKt.traceEventEnd()
            goto L9f
        L99:
            r21 = r2
            r21.skipToGroupEnd()
            r1 = r5
        L9f:
            androidx.compose.runtime.ScopeUpdateScope r2 = r21.endRestartGroup()
            if (r2 == 0) goto Lb1
            com.baicizhan.platform.base.widget.v r3 = new com.baicizhan.platform.base.widget.v
            r4 = r28
            r5 = r29
            r3.<init>()
            r2.updateScope(r3)
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.platform.base.widget.x.n(java.lang.String, androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, int, int):void");
    }

    public static final yz.g2 o(String str, Modifier modifier, int i11, int i12, Composer composer, int i13) {
        n(str, modifier, composer, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
        return yz.g2.f100423a;
    }
}
