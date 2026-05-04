package androidx.compose.foundation.lazy.layout;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambdaKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class LazyLayoutItemContentFactoryKt {
    /* JADX INFO: Access modifiers changed from: private */
    @Composable
    /* renamed from: SkippableItem-JVlU9Rs, reason: not valid java name */
    public static final void m897SkippableItemJVlU9Rs(final LazyLayoutItemProvider lazyLayoutItemProvider, final Object obj, final int i11, final Object obj2, Composer composer, final int i12) {
        int i13;
        Composer startRestartGroup = composer.startRestartGroup(1439843069);
        if ((i12 & 6) == 0) {
            i13 = (startRestartGroup.changed(lazyLayoutItemProvider) ? 4 : 2) | i12;
        } else {
            i13 = i12;
        }
        if ((i12 & 48) == 0) {
            i13 |= startRestartGroup.changed(obj) ? 32 : 16;
        }
        if ((i12 & 384) == 0) {
            i13 |= startRestartGroup.changed(i11) ? 256 : 128;
        }
        if ((i12 & 3072) == 0) {
            i13 |= startRestartGroup.changed(obj2) ? 2048 : 1024;
        }
        if (startRestartGroup.shouldExecute((i13 & 1171) != 1170, i13 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1439843069, i13, -1, "androidx.compose.foundation.lazy.layout.SkippableItem (LazyLayoutItemContentFactory.kt:127)");
            }
            ((SaveableStateHolder) obj).SaveableStateProvider(obj2, ComposableLambdaKt.rememberComposableLambda(980966366, true, new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$SkippableItem$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                @Composable
                public final void invoke(Composer composer2, int i14) {
                    if (!composer2.shouldExecute((i14 & 3) != 2, i14 & 1)) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(980966366, i14, -1, "androidx.compose.foundation.lazy.layout.SkippableItem.<anonymous> (LazyLayoutItemContentFactory.kt:129)");
                    }
                    LazyLayoutItemProvider.this.Item(i11, obj2, composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, startRestartGroup, 54), startRestartGroup, 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.foundation.lazy.layout.LazyLayoutItemContentFactoryKt$SkippableItem$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // x00.p
                public /* bridge */ /* synthetic */ g2 invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return g2.f100423a;
                }

                public final void invoke(Composer composer2, int i14) {
                    LazyLayoutItemContentFactoryKt.m897SkippableItemJVlU9Rs(LazyLayoutItemProvider.this, obj, i11, obj2, composer2, RecomposeScopeImplKt.updateChangedFlags(i12 | 1));
                }
            });
        }
    }
}
