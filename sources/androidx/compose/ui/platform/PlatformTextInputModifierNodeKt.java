package androidx.compose.ui.platform;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.ProvidableCompositionLocal;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.ExperimentalComposeUiApi;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPlatformTextInputModifierNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,252:1\n1#2:253\n75#3:254\n1247#4,6:255\n*S KotlinDebug\n*F\n+ 1 PlatformTextInputModifierNode.kt\nandroidx/compose/ui/platform/PlatformTextInputModifierNodeKt\n*L\n157#1:254\n163#1:255,6\n*E\n"})
/* loaded from: classes2.dex */
public final class PlatformTextInputModifierNodeKt {

    @m80.k
    private static final ProvidableCompositionLocal<ChainedPlatformTextInputInterceptor> LocalChainedPlatformTextInputInterceptor = CompositionLocalKt.staticCompositionLocalOf(new x00.a<ChainedPlatformTextInputInterceptor>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$LocalChainedPlatformTextInputInterceptor$1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // x00.a
        public final ChainedPlatformTextInputInterceptor invoke() {
            return null;
        }
    });

    @Composable
    @ExperimentalComposeUiApi
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void InterceptPlatformTextInput(@m80.k final PlatformTextInputInterceptor platformTextInputInterceptor, @m80.k final x00.p<? super Composer, ? super Integer, g2> pVar, @m80.l Composer composer, final int i11) {
        int i12;
        Composer startRestartGroup = composer.startRestartGroup(1315007550);
        if ((i11 & 6) == 0) {
            i12 = ((i11 & 8) == 0 ? startRestartGroup.changed(platformTextInputInterceptor) : startRestartGroup.changedInstance(platformTextInputInterceptor) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1315007550, i12, -1, "androidx.compose.ui.platform.InterceptPlatformTextInput (PlatformTextInputModifierNode.kt:155)");
            }
            ProvidableCompositionLocal<ChainedPlatformTextInputInterceptor> providableCompositionLocal = LocalChainedPlatformTextInputInterceptor;
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor = (ChainedPlatformTextInputInterceptor) startRestartGroup.consume(providableCompositionLocal);
            boolean changed = startRestartGroup.changed(chainedPlatformTextInputInterceptor);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new ChainedPlatformTextInputInterceptor(platformTextInputInterceptor, chainedPlatformTextInputInterceptor);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            ChainedPlatformTextInputInterceptor chainedPlatformTextInputInterceptor2 = (ChainedPlatformTextInputInterceptor) rememberedValue;
            chainedPlatformTextInputInterceptor2.updateInterceptor(platformTextInputInterceptor);
            CompositionLocalKt.CompositionLocalProvider(providableCompositionLocal.provides(chainedPlatformTextInputInterceptor2), pVar, startRestartGroup, (i12 & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new x00.p<Composer, Integer, g2>() { // from class: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$InterceptPlatformTextInput$1
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

                public final void invoke(Composer composer2, int i13) {
                    PlatformTextInputModifierNodeKt.InterceptPlatformTextInput(PlatformTextInputInterceptor.this, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @m80.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object establishTextInputSession(@m80.k androidx.compose.ui.platform.PlatformTextInputModifierNode r4, @m80.k x00.p<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super j00.c<?>, ? extends java.lang.Object> r5, @m80.k j00.c<?> r6) {
        /*
            boolean r0 = r6 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$establishTextInputSession$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            kotlin.e.n(r6)
            goto L5b
        L31:
            kotlin.e.n(r6)
            androidx.compose.ui.Modifier$Node r6 = r4.getNode()
            boolean r6 = r6.isAttached()
            if (r6 == 0) goto L61
            androidx.compose.ui.node.Owner r6 = androidx.compose.ui.node.DelegatableNodeKt.requireOwner(r4)
            androidx.compose.ui.node.LayoutNode r4 = androidx.compose.ui.node.DelegatableNodeKt.requireLayoutNode(r4)
            androidx.compose.runtime.CompositionLocalMap r4 = r4.getCompositionLocalMap()
            androidx.compose.runtime.ProvidableCompositionLocal<androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor> r2 = androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.LocalChainedPlatformTextInputInterceptor
            java.lang.Object r4 = r4.get(r2)
            androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r4 = (androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor) r4
            r0.label = r3
            java.lang.Object r4 = interceptedTextInputSession(r6, r4, r5, r0)
            if (r4 != r1) goto L5b
            return r1
        L5b:
            kotlin.KotlinNothingValueException r4 = new kotlin.KotlinNothingValueException
            r4.<init>()
            throw r4
        L61:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "establishTextInputSession called from an unattached node"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.establishTextInputSession(androidx.compose.ui.platform.PlatformTextInputModifierNode, x00.p, j00.c):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r5.textInputSession(r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0052, code lost:
    
        if (r6.textInputSession(r5, r7, r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object interceptedTextInputSession(androidx.compose.ui.node.Owner r5, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor r6, x00.p<? super androidx.compose.ui.platform.PlatformTextInputSessionScope, ? super j00.c<?>, ? extends java.lang.Object> r7, j00.c<?> r8) {
        /*
            boolean r0 = r8 instanceof androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = (androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1 r0 = new androidx.compose.ui.platform.PlatformTextInputModifierNodeKt$interceptedTextInputSession$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.b.l()
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L38
            if (r2 == r4) goto L34
            if (r2 == r3) goto L30
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L30:
            kotlin.e.n(r8)
            goto L55
        L34:
            kotlin.e.n(r8)
            goto L46
        L38:
            kotlin.e.n(r8)
            if (r6 != 0) goto L4c
            r0.label = r4
            java.lang.Object r5 = r5.textInputSession(r7, r0)
            if (r5 != r1) goto L46
            goto L54
        L46:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        L4c:
            r0.label = r3
            java.lang.Object r5 = r6.textInputSession(r5, r7, r0)
            if (r5 != r1) goto L55
        L54:
            return r1
        L55:
            kotlin.KotlinNothingValueException r5 = new kotlin.KotlinNothingValueException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.PlatformTextInputModifierNodeKt.interceptedTextInputSession(androidx.compose.ui.node.Owner, androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor, x00.p, j00.c):java.lang.Object");
    }
}
