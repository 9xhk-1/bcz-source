package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.State;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLifecycleEffect.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,745:1\n77#2:746\n77#2:753\n77#2:760\n77#2:767\n77#2:774\n77#2:785\n77#2:792\n77#2:799\n77#2:806\n77#2:813\n77#2:824\n1225#3,6:747\n1225#3,6:754\n1225#3,6:761\n1225#3,6:768\n1225#3,6:779\n1225#3,6:786\n1225#3,6:793\n1225#3,6:800\n1225#3,6:807\n1225#3,6:818\n1225#3,6:825\n86#4,4:775\n86#4,4:814\n81#5:831\n*S KotlinDebug\n*F\n+ 1 LifecycleEffect.kt\nandroidx/lifecycle/compose/LifecycleEffectKt\n*L\n56#1:746\n134#1:753\n197#1:760\n262#1:767\n323#1:774\n349#1:785\n466#1:792\n529#1:799\n594#1:806\n655#1:813\n681#1:824\n67#1:747,6\n137#1:754,6\n200#1:761,6\n265#1:768,6\n326#1:779,6\n359#1:786,6\n469#1:793,6\n532#1:800,6\n597#1:807,6\n658#1:818,6\n691#1:825,6\n326#1:775,4\n658#1:814,4\n66#1:831\n*E\n"})
/* loaded from: classes2.dex */
public final class LifecycleEffectKt {

    @k
    private static final String LifecycleResumeEffectNoParamError = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    @k
    private static final String LifecycleStartEffectNoParamError = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key.";

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0070, code lost:
    
        if ((r12 & 2) != 0) goto L46;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleEventEffect(@m80.k final androidx.lifecycle.Lifecycle.Event r7, @m80.l androidx.lifecycle.LifecycleOwner r8, @m80.k final x00.a<yz.g2> r9, @m80.l androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleEventEffect(androidx.lifecycle.Lifecycle$Event, androidx.lifecycle.LifecycleOwner, x00.a, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x00.a<g2> LifecycleEventEffect$lambda$0(State<? extends x00.a<g2>> state) {
        return state.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if ((r12 & 2) != 0) goto L46;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(@m80.l final java.lang.Object r7, @m80.l androidx.lifecycle.LifecycleOwner r8, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r9, @m80.l androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void LifecycleResumeEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleResumePauseEffectScope lifecycleResumePauseEffectScope, final l<? super LifecycleResumePauseEffectScope, ? extends LifecyclePauseOrDisposeEffectResult> lVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(912823238);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(lifecycleResumePauseEffectScope) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(912823238, i12, -1, "androidx.lifecycle.compose.LifecycleResumeEffectImpl (LifecycleEffect.kt:689)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(lifecycleResumePauseEffectScope) | ((i12 & 896) == 256) | startRestartGroup.changedInstance(lifecycleOwner);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LifecycleEffectKt$LifecycleResumeEffectImpl$1$1(lifecycleOwner, lifecycleResumePauseEffectScope, lVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleResumePauseEffectScope, (l) rememberedValue, startRestartGroup, i12 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffectImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(@m80.l Composer composer2, int i13) {
                    LifecycleEffectKt.LifecycleResumeEffectImpl(LifecycleOwner.this, lifecycleResumePauseEffectScope, lVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if ((r12 & 2) != 0) goto L46;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(@m80.l final java.lang.Object r7, @m80.l androidx.lifecycle.LifecycleOwner r8, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r9, @m80.l androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    public static final void LifecycleStartEffectImpl(final LifecycleOwner lifecycleOwner, final LifecycleStartStopEffectScope lifecycleStartStopEffectScope, final l<? super LifecycleStartStopEffectScope, ? extends LifecycleStopOrDisposeEffectResult> lVar, Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(228371534);
        if ((i11 & 6) == 0) {
            i12 = (startRestartGroup.changedInstance(lifecycleOwner) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(lifecycleStartStopEffectScope) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= startRestartGroup.changedInstance(lVar) ? 256 : 128;
        }
        if ((i12 & 147) == 146 && startRestartGroup.getSkipping()) {
            startRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(228371534, i12, -1, "androidx.lifecycle.compose.LifecycleStartEffectImpl (LifecycleEffect.kt:357)");
            }
            boolean changedInstance = startRestartGroup.changedInstance(lifecycleStartStopEffectScope) | ((i12 & 896) == 256) | startRestartGroup.changedInstance(lifecycleOwner);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LifecycleEffectKt$LifecycleStartEffectImpl$1$1(lifecycleOwner, lifecycleStartStopEffectScope, lVar);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            EffectsKt.DisposableEffect(lifecycleOwner, lifecycleStartStopEffectScope, (l) rememberedValue, startRestartGroup, i12 & 126);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffectImpl$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(@m80.l Composer composer2, int i13) {
                    LifecycleEffectKt.LifecycleStartEffectImpl(LifecycleOwner.this, lifecycleStartStopEffectScope, lVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if ((r14 & 4) != 0) goto L56;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(@m80.l final java.lang.Object r8, @m80.l final java.lang.Object r9, @m80.l androidx.lifecycle.LifecycleOwner r10, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r11, @m80.l androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0086, code lost:
    
        if ((r14 & 4) != 0) goto L56;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(@m80.l final java.lang.Object r8, @m80.l final java.lang.Object r9, @m80.l androidx.lifecycle.LifecycleOwner r10, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r11, @m80.l androidx.compose.runtime.Composer r12, final int r13, final int r14) {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if ((r15 & 8) != 0) goto L66;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(@m80.l final java.lang.Object r8, @m80.l final java.lang.Object r9, @m80.l final java.lang.Object r10, @m80.l androidx.lifecycle.LifecycleOwner r11, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r12, @m80.l androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x009d, code lost:
    
        if ((r15 & 8) != 0) goto L66;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(@m80.l final java.lang.Object r8, @m80.l final java.lang.Object r9, @m80.l final java.lang.Object r10, @m80.l androidx.lifecycle.LifecycleOwner r11, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r12, @m80.l androidx.compose.runtime.Composer r13, final int r14, final int r15) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object, java.lang.Object, java.lang.Object, androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        if ((r12 & 2) != 0) goto L46;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(@m80.k final java.lang.Object[] r7, @m80.l androidx.lifecycle.LifecycleOwner r8, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r9, @m80.l androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0082, code lost:
    
        if ((r12 & 2) != 0) goto L46;
     */
    @androidx.compose.runtime.Composable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(@m80.k final java.lang.Object[] r7, @m80.l androidx.lifecycle.LifecycleOwner r8, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r9, @m80.l androidx.compose.runtime.Composer r10, final int r11, final int r12) {
        /*
            Method dump skipped, instructions count: 269
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(java.lang.Object[], androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if ((r7 & 1) != 0) goto L18;
     */
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.ERROR, message = androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffectNoParamError)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleResumeEffect(@m80.l final androidx.lifecycle.LifecycleOwner r3, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleResumePauseEffectScope, ? extends androidx.lifecycle.compose.LifecyclePauseOrDisposeEffectResult> r4, @m80.l androidx.compose.runtime.Composer r5, final int r6, final int r7) {
        /*
            r0 = -747476210(0xffffffffd3726b0e, float:-1.04117817E12)
            androidx.compose.runtime.Composer r5 = r5.startRestartGroup(r0)
            r1 = r6 & 1
            if (r1 != 0) goto L24
            boolean r2 = r5.getSkipping()
            if (r2 != 0) goto L12
            goto L24
        L12:
            r5.skipToGroupEnd()
            androidx.compose.runtime.ScopeUpdateScope r5 = r5.endRestartGroup()
            if (r5 == 0) goto L23
            androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffect$5 r0 = new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleResumeEffect$5
            r0.<init>()
            r5.updateScope(r0)
        L23:
            return
        L24:
            r5.startDefaults()
            if (r1 == 0) goto L3a
            boolean r3 = r5.getDefaultsInvalid()
            if (r3 == 0) goto L30
            goto L3a
        L30:
            r5.skipToGroupEnd()
            r3 = r7 & 1
            if (r3 == 0) goto L49
        L37:
            r6 = r6 & (-15)
            goto L49
        L3a:
            r3 = r7 & 1
            if (r3 == 0) goto L49
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner()
            java.lang.Object r3 = r5.consume(r3)
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
            goto L37
        L49:
            r5.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L58
            r3 = -1
            java.lang.String r4 = "androidx.lifecycle.compose.LifecycleResumeEffect (LifecycleEffect.kt:682)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r3, r4)
        L58:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "LifecycleResumeEffect must provide one or more 'key' parameters that define the identity of the LifecycleResumeEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleResumeEffect(androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0035, code lost:
    
        if ((r7 & 1) != 0) goto L18;
     */
    @androidx.compose.runtime.Composable
    @yz.n(level = kotlin.DeprecationLevel.ERROR, message = androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffectNoParamError)
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LifecycleStartEffect(@m80.l final androidx.lifecycle.LifecycleOwner r3, @m80.k final x00.l<? super androidx.lifecycle.compose.LifecycleStartStopEffectScope, ? extends androidx.lifecycle.compose.LifecycleStopOrDisposeEffectResult> r4, @m80.l androidx.compose.runtime.Composer r5, final int r6, final int r7) {
        /*
            r0 = -50807951(0xfffffffffcf8bb71, float:-1.0331931E37)
            androidx.compose.runtime.Composer r5 = r5.startRestartGroup(r0)
            r1 = r6 & 1
            if (r1 != 0) goto L24
            boolean r2 = r5.getSkipping()
            if (r2 != 0) goto L12
            goto L24
        L12:
            r5.skipToGroupEnd()
            androidx.compose.runtime.ScopeUpdateScope r5 = r5.endRestartGroup()
            if (r5 == 0) goto L23
            androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$5 r0 = new androidx.lifecycle.compose.LifecycleEffectKt$LifecycleStartEffect$5
            r0.<init>()
            r5.updateScope(r0)
        L23:
            return
        L24:
            r5.startDefaults()
            if (r1 == 0) goto L3a
            boolean r3 = r5.getDefaultsInvalid()
            if (r3 == 0) goto L30
            goto L3a
        L30:
            r5.skipToGroupEnd()
            r3 = r7 & 1
            if (r3 == 0) goto L49
        L37:
            r6 = r6 & (-15)
            goto L49
        L3a:
            r3 = r7 & 1
            if (r3 == 0) goto L49
            androidx.compose.runtime.ProvidableCompositionLocal r3 = androidx.lifecycle.compose.LocalLifecycleOwnerKt.getLocalLifecycleOwner()
            java.lang.Object r3 = r5.consume(r3)
            androidx.lifecycle.LifecycleOwner r3 = (androidx.lifecycle.LifecycleOwner) r3
            goto L37
        L49:
            r5.endDefaults()
            boolean r3 = androidx.compose.runtime.ComposerKt.isTraceInProgress()
            if (r3 == 0) goto L58
            r3 = -1
            java.lang.String r4 = "androidx.lifecycle.compose.LifecycleStartEffect (LifecycleEffect.kt:350)"
            androidx.compose.runtime.ComposerKt.traceEventStart(r0, r6, r3, r4)
        L58:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "LifecycleStartEffect must provide one or more 'key' parameters that define the identity of the LifecycleStartEffect and determine when its previous effect coroutine should be cancelled and a new effect launched for the new key."
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.LifecycleEffectKt.LifecycleStartEffect(androidx.lifecycle.LifecycleOwner, x00.l, androidx.compose.runtime.Composer, int, int):void");
    }
}
