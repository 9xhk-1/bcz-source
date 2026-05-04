package androidx.lifecycle.compose;

import androidx.annotation.CheckResult;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nDropUnlessLifecycle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,108:1\n77#2:109\n77#2:116\n77#2:117\n1225#3,6:110\n*S KotlinDebug\n*F\n+ 1 DropUnlessLifecycle.kt\nandroidx/lifecycle/compose/DropUnlessLifecycleKt\n*L\n49#1:109\n81#1:116\n105#1:117\n57#1:110,6\n*E\n"})
/* loaded from: classes2.dex */
public final class DropUnlessLifecycleKt {
    @CheckResult
    @Composable
    @k
    public static final x00.a<g2> dropUnlessResumed(@l LifecycleOwner lifecycleOwner, @k x00.a<g2> aVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1331131589, i11, -1, "androidx.lifecycle.compose.dropUnlessResumed (DropUnlessLifecycle.kt:106)");
        }
        int i13 = i11 << 3;
        x00.a<g2> dropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.RESUMED, lifecycleOwner2, aVar, composer, (i13 & 112) | 6 | (i13 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dropUnlessStateIsAtLeast;
    }

    @CheckResult
    @Composable
    @k
    public static final x00.a<g2> dropUnlessStarted(@l LifecycleOwner lifecycleOwner, @k x00.a<g2> aVar, @l Composer composer, int i11, int i12) {
        if ((i12 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1207869935, i11, -1, "androidx.lifecycle.compose.dropUnlessStarted (DropUnlessLifecycle.kt:82)");
        }
        int i13 = i11 << 3;
        x00.a<g2> dropUnlessStateIsAtLeast = dropUnlessStateIsAtLeast(Lifecycle.State.STARTED, lifecycleOwner2, aVar, composer, (i13 & 112) | 6 | (i13 & 896), 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return dropUnlessStateIsAtLeast;
    }

    @CheckResult
    @Composable
    private static final x00.a<g2> dropUnlessStateIsAtLeast(final Lifecycle.State state, final LifecycleOwner lifecycleOwner, final x00.a<g2> aVar, Composer composer, int i11, int i12) {
        if ((i12 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(LocalLifecycleOwnerKt.getLocalLifecycleOwner());
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-2057956404, i11, -1, "androidx.lifecycle.compose.dropUnlessStateIsAtLeast (DropUnlessLifecycle.kt:50)");
        }
        if (state == Lifecycle.State.DESTROYED) {
            throw new IllegalArgumentException("Target state is not allowed to be `Lifecycle.State.DESTROYED` because Compose disposes of the composition before `Lifecycle.Event.ON_DESTROY` observers are invoked.");
        }
        boolean changedInstance = composer.changedInstance(lifecycleOwner) | ((((i11 & 14) ^ 6) > 4 && composer.changed(state)) || (i11 & 6) == 4) | ((((i11 & 896) ^ 384) > 256 && composer.changed(aVar)) || (i11 & 384) == 256);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.a<g2>() { // from class: androidx.lifecycle.compose.DropUnlessLifecycleKt$dropUnlessStateIsAtLeast$2$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                @Override // x00.a
                public /* bridge */ /* synthetic */ g2 invoke() {
                    invoke2();
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                    if (LifecycleOwner.this.getLifecycle().getCurrentState().isAtLeast(state)) {
                        aVar.invoke();
                    }
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        x00.a<g2> aVar2 = (x00.a) rememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return aVar2;
    }
}
