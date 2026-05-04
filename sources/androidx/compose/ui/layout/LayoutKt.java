package androidx.compose.ui.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposableTarget;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.ui.ComposedModifierKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.UiComposable;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;
import x00.a;
import x00.p;
import x00.q;
import yz.g2;
import yz.n;
import yz.v0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/Updater\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,415:1\n79#1,6:457\n86#1,3:472\n89#1,2:481\n93#1:486\n347#2,9:416\n356#2,3:431\n272#2,9:434\n281#2,2:449\n347#2,9:463\n356#2,3:483\n347#2,9:487\n356#2,3:502\n4206#3,6:425\n4206#3,6:443\n4206#3,6:475\n4206#3,6:496\n1247#4,6:451\n*S KotlinDebug\n*F\n+ 1 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n*L\n166#1:457,6\n166#1:472,3\n166#1:481,2\n166#1:486\n83#1:416,9\n83#1:431,3\n125#1:434,9\n125#1:449,2\n166#1:463,9\n166#1:483,3\n243#1:487,9\n243#1:502,3\n88#1:425,6\n131#1:443,6\n166#1:475,6\n250#1:496,6\n169#1:451,6\n*E\n"})
/* loaded from: classes.dex */
public final class LayoutKt {
    public static final int LargeDimension = 32767;

    @Composable
    @UiComposable
    public static final void Layout(@k p<? super Composer, ? super Integer, g2> pVar, @l Modifier modifier, @k MeasurePolicy measurePolicy, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        int i13 = ((i11 << 6) & 896) | 6;
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
        Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
        pVar.invoke(composer, Integer.valueOf((i13 >> 6) & 14));
        composer.endNode();
    }

    @Composable
    @UiComposable
    @n(message = "This API is unsafe for UI performance at scale - using it incorrectly will lead to exponential performance issues. This API should be avoided whenever possible.")
    public static final void MultiMeasureLayout(@l Modifier modifier, @k final p<? super Composer, ? super Integer, g2> pVar, @k final MeasurePolicy measurePolicy, @l Composer composer, final int i11, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1949933075);
        int i14 = i12 & 1;
        if (i14 != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (startRestartGroup.changed(modifier) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        if ((i12 & 2) != 0) {
            i13 |= 48;
        } else if ((i11 & 48) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if ((i12 & 4) != 0) {
            i13 |= 384;
        } else if ((i11 & 384) == 0) {
            i13 |= startRestartGroup.changed(measurePolicy) ? 256 : 128;
        }
        if (startRestartGroup.shouldExecute((i13 & 147) != 146, i13 & 1)) {
            if (i14 != 0) {
                modifier = Modifier.Companion;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1949933075, i13, -1, "androidx.compose.ui.layout.MultiMeasureLayout (Layout.kt:237)");
            }
            int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(startRestartGroup, 0);
            Modifier materializeModifier = ComposedModifierKt.materializeModifier(startRestartGroup, modifier);
            CompositionLocalMap currentCompositionLocalMap = startRestartGroup.getCurrentCompositionLocalMap();
            a<LayoutNode> constructor$ui_release = LayoutNode.Companion.getConstructor$ui_release();
            int i15 = ((i13 << 3) & 896) | 6;
            if (startRestartGroup.getApplier() == null) {
                ComposablesKt.invalidApplier();
            }
            startRestartGroup.startReusableNode();
            if (startRestartGroup.getInserting()) {
                startRestartGroup.createNode(constructor$ui_release);
            } else {
                startRestartGroup.useNode();
            }
            Composer m1951constructorimpl = Updater.m1951constructorimpl(startRestartGroup);
            ComposeUiNode.Companion companion = ComposeUiNode.Companion;
            Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
            Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Updater.m1955initimpl(m1951constructorimpl, new x00.l<LayoutNode, g2>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$1$1
                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(LayoutNode layoutNode) {
                    invoke2(layoutNode);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(LayoutNode layoutNode) {
                    layoutNode.setCanMultiMeasure$ui_release(true);
                }
            });
            Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
            p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            pVar.invoke(startRestartGroup, Integer.valueOf((i15 >> 6) & 14));
            startRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.layout.LayoutKt$MultiMeasureLayout$2
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

                public final void invoke(Composer composer2, int i16) {
                    LayoutKt.MultiMeasureLayout(Modifier.this, pVar, measurePolicy, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1), i12);
                }
            });
        }
    }

    @v0
    @k
    public static final p<Composer, Integer, g2> combineAsVirtualLayouts(@k final List<? extends p<? super Composer, ? super Integer, g2>> list) {
        return ComposableLambdaKt.composableLambdaInstance(-1953651383, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.ui.layout.LayoutKt$combineAsVirtualLayouts$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return g2.f100423a;
            }

            @ComposableTarget(applier = "androidx.compose.ui.UiComposable")
            @Composable
            public final void invoke(Composer composer, int i11) {
                if (!composer.shouldExecute((i11 & 3) != 2, i11 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1953651383, i11, -1, "androidx.compose.ui.layout.combineAsVirtualLayouts.<anonymous> (Layout.kt:176)");
                }
                List<p<Composer, Integer, g2>> list2 = list;
                int size = list2.size();
                for (int i12 = 0; i12 < size; i12++) {
                    p<Composer, Integer, g2> pVar = list2.get(i12);
                    int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
                    ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                    a<ComposeUiNode> virtualConstructor = companion.getVirtualConstructor();
                    if (composer.getApplier() == null) {
                        ComposablesKt.invalidApplier();
                    }
                    composer.startReusableNode();
                    if (composer.getInserting()) {
                        composer.createNode(virtualConstructor);
                    } else {
                        composer.useNode();
                    }
                    Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
                    p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                    if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    pVar.invoke(composer, 0);
                    composer.endNode();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @j(name = "materializerOf")
    @k
    @v0
    @n(level = DeprecationLevel.WARNING, message = "Needed only for backwards compatibility. Do not use.")
    public static final q<SkippableUpdater<ComposeUiNode>, Composer, Integer, g2> materializerOf(@k final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-55743822, true, new q<SkippableUpdater<ComposeUiNode>, Composer, Integer, g2>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOfWithCompositionLocalInjection$1
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m3882invokeDeg8D_g(skippableUpdater.m1931unboximpl(), composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            /* renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m3882invokeDeg8D_g(Composer composer, Composer composer2, int i11) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-55743822, i11, -1, "androidx.compose.ui.layout.materializerOfWithCompositionLocalInjection.<anonymous> (Layout.kt:218)");
                }
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                Modifier materializeWithCompositionLocalInjectionInternal = ComposedModifierKt.materializeWithCompositionLocalInjectionInternal(composer2, Modifier.this);
                composer.startReplaceableGroup(509942095);
                Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Updater.m1958setimpl(m1951constructorimpl, materializeWithCompositionLocalInjectionInternal, companion.getSetModifier());
                p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @j(name = "modifierMaterializerOf")
    @v0
    @k
    public static final q<SkippableUpdater<ComposeUiNode>, Composer, Integer, g2> modifierMaterializerOf(@k final Modifier modifier) {
        return ComposableLambdaKt.composableLambdaInstance(-1586257396, true, new q<SkippableUpdater<ComposeUiNode>, Composer, Integer, g2>() { // from class: androidx.compose.ui.layout.LayoutKt$materializerOf$1
            {
                super(3);
            }

            @Override // x00.q
            public /* bridge */ /* synthetic */ g2 invoke(SkippableUpdater<ComposeUiNode> skippableUpdater, Composer composer, Integer num) {
                m3881invokeDeg8D_g(skippableUpdater.m1931unboximpl(), composer, num.intValue());
                return g2.f100423a;
            }

            @Composable
            /* renamed from: invoke-Deg8D_g, reason: not valid java name */
            public final void m3881invokeDeg8D_g(Composer composer, Composer composer2, int i11) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1586257396, i11, -1, "androidx.compose.ui.layout.materializerOf.<anonymous> (Layout.kt:196)");
                }
                int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer2, 0);
                Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer2, Modifier.this);
                composer.startReplaceableGroup(509942095);
                Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
                ComposeUiNode.Companion companion = ComposeUiNode.Companion;
                Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
                p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                composer.endReplaceableGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        });
    }

    @Composable
    @UiComposable
    public static final void Layout(@l Modifier modifier, @k MeasurePolicy measurePolicy, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            modifier = Modifier.Companion;
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
        Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        composer.endNode();
    }

    @Composable
    @UiComposable
    public static final void Layout(@k List<? extends p<? super Composer, ? super Integer, g2>> list, @l Modifier modifier, @k MultiContentMeasurePolicy multiContentMeasurePolicy, @l Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            modifier = Modifier.Companion;
        }
        p<Composer, Integer, g2> combineAsVirtualLayouts = combineAsVirtualLayouts(list);
        boolean z11 = (((i11 & 896) ^ 384) > 256 && composer.changed(multiContentMeasurePolicy)) || (i11 & 384) == 256;
        Object rememberedValue = composer.rememberedValue();
        if (z11 || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = MultiContentMeasurePolicyKt.createMeasurePolicy(multiContentMeasurePolicy);
            composer.updateRememberedValue(rememberedValue);
        }
        MeasurePolicy measurePolicy = (MeasurePolicy) rememberedValue;
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
        Modifier materializeModifier = ComposedModifierKt.materializeModifier(composer, modifier);
        ComposeUiNode.Companion companion = ComposeUiNode.Companion;
        a<ComposeUiNode> constructor = companion.getConstructor();
        if (composer.getApplier() == null) {
            ComposablesKt.invalidApplier();
        }
        composer.startReusableNode();
        if (composer.getInserting()) {
            composer.createNode(constructor);
        } else {
            composer.useNode();
        }
        Composer m1951constructorimpl = Updater.m1951constructorimpl(composer);
        Updater.m1958setimpl(m1951constructorimpl, measurePolicy, companion.getSetMeasurePolicy());
        Updater.m1958setimpl(m1951constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
        p<ComposeUiNode, Integer, g2> setCompositeKeyHash = companion.getSetCompositeKeyHash();
        if (m1951constructorimpl.getInserting() || !g0.g(m1951constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            m1951constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            m1951constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        Updater.m1958setimpl(m1951constructorimpl, materializeModifier, companion.getSetModifier());
        combineAsVirtualLayouts.invoke(composer, 0);
        composer.endNode();
    }
}
