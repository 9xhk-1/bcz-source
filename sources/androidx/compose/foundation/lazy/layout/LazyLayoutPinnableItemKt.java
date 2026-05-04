package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.ui.layout.PinnableContainer;
import androidx.compose.ui.layout.PinnableContainerKt;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazyLayoutPinnableItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,161:1\n1247#2,6:162\n1247#2,6:169\n75#3:168\n*S KotlinDebug\n*F\n+ 1 LazyLayoutPinnableItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutPinnableItemKt\n*L\n52#1:162,6\n55#1:169,6\n54#1:168\n*E\n"})
/* loaded from: classes.dex */
public final class LazyLayoutPinnableItemKt {
    @Composable
    public static final void LazyLayoutPinnableItem(@l final Object obj, final int i11, @k final LazyLayoutPinnedItemList lazyLayoutPinnedItemList, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(-2079116560);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changedInstance(obj) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changed(i11) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changedInstance(lazyLayoutPinnedItemList) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= startRestartGroup.changedInstance(pVar) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2079116560, i13, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean changed = startRestartGroup.changed(obj) | startRestartGroup.changed(lazyLayoutPinnedItemList);
            Object rememberedValue = startRestartGroup.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.getEmpty()) {
                rememberedValue = new LazyLayoutPinnableItem(obj, lazyLayoutPinnedItemList);
                startRestartGroup.updateRememberedValue(rememberedValue);
            }
            final LazyLayoutPinnableItem lazyLayoutPinnableItem = (LazyLayoutPinnableItem) rememberedValue;
            lazyLayoutPinnableItem.setIndex(i11);
            lazyLayoutPinnableItem.setParentPinnableContainer((PinnableContainer) startRestartGroup.consume(PinnableContainerKt.getLocalPinnableContainer()));
            boolean changed2 = startRestartGroup.changed(lazyLayoutPinnableItem);
            Object rememberedValue2 = startRestartGroup.rememberedValue();
            if (changed2 || rememberedValue2 == Composer.Companion.getEmpty()) {
                rememberedValue2 = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1
                    {
                        super(1);
                    }

                    @Override // x00.l
                    public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                        final LazyLayoutPinnableItem lazyLayoutPinnableItem2 = LazyLayoutPinnableItem.this;
                        return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$1$1$invoke$$inlined$onDispose$1
                            @Override // androidx.compose.runtime.DisposableEffectResult
                            public void dispose() {
                                LazyLayoutPinnableItem.this.onDisposed();
                            }
                        };
                    }
                };
                startRestartGroup.updateRememberedValue(rememberedValue2);
            }
            EffectsKt.DisposableEffect(lazyLayoutPinnableItem, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, startRestartGroup, 0);
            CompositionLocalKt.CompositionLocalProvider(PinnableContainerKt.getLocalPinnableContainer().provides(lazyLayoutPinnableItem), pVar, startRestartGroup, ((i13 >> 6) & 112) | ProvidedValue.$stable);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItemKt$LazyLayoutPinnableItem$2
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

                public final void invoke(Composer composer2, int i14) {
                    LazyLayoutPinnableItemKt.LazyLayoutPinnableItem(obj, i11, lazyLayoutPinnedItemList, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                }
            });
        }
    }
}
