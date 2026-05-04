package androidx.compose.runtime;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nCompositionLocal.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,406:1\n125#2:407\n152#2,3:408\n37#3,2:411\n*S KotlinDebug\n*F\n+ 1 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocalKt\n*L\n402#1:407\n402#1:408,3\n402#1:411,2\n*E\n"})
/* loaded from: classes.dex */
public final class CompositionLocalKt {
    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@k final ProvidedValue<?>[] providedValueArr, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1390796515);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1390796515, i11, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:361)");
        }
        startRestartGroup.startProviders(providedValueArr);
        pVar.invoke(startRestartGroup, Integer.valueOf((i11 >> 3) & 14));
        startRestartGroup.endProviders();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$1
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

                public final void invoke(Composer composer2, int i12) {
                    ProvidedValue<?>[] providedValueArr2 = providedValueArr;
                    CompositionLocalKt.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr2, providedValueArr2.length), pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @k
    public static final <T> ProvidableCompositionLocal<T> compositionLocalOf(@k SnapshotMutationPolicy<T> snapshotMutationPolicy, @k x00.a<? extends T> aVar) {
        return new DynamicProvidableCompositionLocal(snapshotMutationPolicy, aVar);
    }

    public static /* synthetic */ ProvidableCompositionLocal compositionLocalOf$default(SnapshotMutationPolicy snapshotMutationPolicy, x00.a aVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            snapshotMutationPolicy = SnapshotStateKt.structuralEqualityPolicy();
        }
        return compositionLocalOf(snapshotMutationPolicy, aVar);
    }

    @k
    public static final <T> ProvidableCompositionLocal<T> compositionLocalWithComputedDefaultOf(@k x00.l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        return new ComputedProvidableCompositionLocal(lVar);
    }

    @k
    public static final <T> ProvidableCompositionLocal<T> staticCompositionLocalOf(@k x00.a<? extends T> aVar) {
        return new StaticProvidableCompositionLocal(aVar);
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@k final ProvidedValue<?> providedValue, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(-1350970552);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1350970552, i11, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:381)");
        }
        startRestartGroup.startProvider(providedValue);
        pVar.invoke(startRestartGroup, Integer.valueOf((i11 >> 3) & 14));
        startRestartGroup.endProvider();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$2
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

                public final void invoke(Composer composer2, int i12) {
                    CompositionLocalKt.CompositionLocalProvider(providedValue, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }

    @Composable
    @ComposableInferredTarget(scheme = "[0[0]]")
    public static final void CompositionLocalProvider(@k final CompositionLocalContext compositionLocalContext, @k final p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, final int i11) {
        Composer startRestartGroup = composer.startRestartGroup(1853897736);
        int i12 = (i11 & 6) == 0 ? (startRestartGroup.changed(compositionLocalContext) ? 4 : 2) | i11 : i11;
        if ((i11 & 48) == 0) {
            i12 |= startRestartGroup.changedInstance(pVar) ? 32 : 16;
        }
        if (startRestartGroup.shouldExecute((i12 & 19) != 18, i12 & 1)) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1853897736, i12, -1, "androidx.compose.runtime.CompositionLocalProvider (CompositionLocal.kt:399)");
            }
            PersistentCompositionLocalMap compositionLocals$runtime_release = compositionLocalContext.getCompositionLocals$runtime_release();
            ArrayList arrayList = new ArrayList(compositionLocals$runtime_release.size());
            for (Map.Entry<CompositionLocal<Object>, ValueHolder<Object>> entry : compositionLocals$runtime_release.entrySet()) {
                arrayList.add(entry.getValue().toProvided(entry.getKey()));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) arrayList.toArray(new ProvidedValue[0]);
            CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), pVar, startRestartGroup, i12 & 112);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            startRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope endRestartGroup = startRestartGroup.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.updateScope(new p<Composer, Integer, g2>() { // from class: androidx.compose.runtime.CompositionLocalKt$CompositionLocalProvider$4
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
                    CompositionLocalKt.CompositionLocalProvider(CompositionLocalContext.this, pVar, composer2, RecomposeScopeImplKt.updateChangedFlags(i11 | 1));
                }
            });
        }
    }
}
