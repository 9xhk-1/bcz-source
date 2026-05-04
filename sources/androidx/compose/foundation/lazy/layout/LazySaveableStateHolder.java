package androidx.compose.foundation.lazy.layout;

import androidx.collection.MutableScatterSet;
import androidx.collection.ScatterSetKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.saveable.SaveableStateHolder;
import androidx.compose.runtime.saveable.SaveableStateRegistry;
import androidx.compose.runtime.saveable.SaveableStateRegistryKt;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.runtime.saveable.SaverScope;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLazySaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n+ 2 ScatterSet.kt\nandroidx/collection/ScatterSet\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,97:1\n231#2,3:98\n200#2,7:101\n211#2,3:109\n214#2,9:113\n234#2:122\n1399#3:108\n1270#3:112\n1247#4,6:123\n*S KotlinDebug\n*F\n+ 1 LazySaveableStateHolder.kt\nandroidx/compose/foundation/lazy/layout/LazySaveableStateHolder\n*L\n70#1:98,3\n70#1:101,7\n70#1:109,3\n70#1:113,9\n70#1:122\n70#1:108\n70#1:112\n77#1:123,6\n*E\n"})
/* loaded from: classes.dex */
final class LazySaveableStateHolder implements SaveableStateRegistry, SaveableStateHolder {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private final MutableScatterSet<Object> previouslyComposedKeys;

    @k
    private final SaveableStateHolder wrappedHolder;

    @k
    private final SaveableStateRegistry wrappedRegistry;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<LazySaveableStateHolder, Map<String, List<Object>>> saver(@l final SaveableStateRegistry saveableStateRegistry, @k final SaveableStateHolder saveableStateHolder) {
            return SaverKt.Saver(new p<SaverScope, LazySaveableStateHolder, Map<String, ? extends List<? extends Object>>>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$1
                @Override // x00.p
                public final Map<String, List<Object>> invoke(SaverScope saverScope, LazySaveableStateHolder lazySaveableStateHolder) {
                    Map<String, List<Object>> performSave = lazySaveableStateHolder.performSave();
                    if (performSave.isEmpty()) {
                        return null;
                    }
                    return performSave;
                }
            }, new x00.l<Map<String, ? extends List<? extends Object>>, LazySaveableStateHolder>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$Companion$saver$2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final LazySaveableStateHolder invoke(Map<String, ? extends List<? extends Object>> map) {
                    return new LazySaveableStateHolder(SaveableStateRegistry.this, map, saveableStateHolder);
                }
            });
        }

        private Companion() {
        }
    }

    public LazySaveableStateHolder(@k SaveableStateRegistry saveableStateRegistry, @k SaveableStateHolder saveableStateHolder) {
        this.wrappedRegistry = saveableStateRegistry;
        this.wrappedHolder = saveableStateHolder;
        this.previouslyComposedKeys = ScatterSetKt.mutableScatterSetOf();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(@k final Object obj, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, int i11) {
        composer.startReplaceGroup(-697180401);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-697180401, i11, -1, "androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.SaveableStateProvider (LazySaveableStateHolder.kt:74)");
        }
        int i12 = i11 & 14;
        this.wrappedHolder.SaveableStateProvider(obj, pVar, composer, i11 & 126);
        boolean changedInstance = composer.changedInstance(this) | composer.changedInstance(obj);
        Object rememberedValue = composer.rememberedValue();
        if (changedInstance || rememberedValue == Composer.Companion.getEmpty()) {
            rememberedValue = new x00.l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    MutableScatterSet mutableScatterSet;
                    mutableScatterSet = LazySaveableStateHolder.this.previouslyComposedKeys;
                    mutableScatterSet.minusAssign((MutableScatterSet) obj);
                    final LazySaveableStateHolder lazySaveableStateHolder = LazySaveableStateHolder.this;
                    final Object obj2 = obj;
                    return new DisposableEffectResult() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder$SaveableStateProvider$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            MutableScatterSet mutableScatterSet2;
                            mutableScatterSet2 = LazySaveableStateHolder.this.previouslyComposedKeys;
                            mutableScatterSet2.plusAssign((MutableScatterSet) obj2);
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue);
        }
        EffectsKt.DisposableEffect(obj, (x00.l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue, composer, i12);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    public boolean canBeSaved(@k Object obj) {
        return this.wrappedRegistry.canBeSaved(obj);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @l
    public Object consumeRestored(@k String str) {
        return this.wrappedRegistry.consumeRestored(str);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @k
    public Map<String, List<Object>> performSave() {
        MutableScatterSet<Object> mutableScatterSet = this.previouslyComposedKeys;
        Object[] objArr = mutableScatterSet.elements;
        long[] jArr = mutableScatterSet.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            this.wrappedHolder.removeState(objArr[(i11 << 3) + i13]);
                        }
                        j11 >>= 8;
                    }
                    if (i12 != 8) {
                        break;
                    }
                }
                if (i11 == length) {
                    break;
                }
                i11++;
            }
        }
        return this.wrappedRegistry.performSave();
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateRegistry
    @k
    public SaveableStateRegistry.Entry registerProvider(@k String str, @k x00.a<? extends Object> aVar) {
        return this.wrappedRegistry.registerProvider(str, aVar);
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(@k Object obj) {
        this.wrappedHolder.removeState(obj);
    }

    public LazySaveableStateHolder(@l final SaveableStateRegistry saveableStateRegistry, @l Map<String, ? extends List<? extends Object>> map, @k SaveableStateHolder saveableStateHolder) {
        this(SaveableStateRegistryKt.SaveableStateRegistry(map, new x00.l<Object, Boolean>() { // from class: androidx.compose.foundation.lazy.layout.LazySaveableStateHolder.1
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(Object obj) {
                SaveableStateRegistry saveableStateRegistry2 = SaveableStateRegistry.this;
                return Boolean.valueOf(saveableStateRegistry2 != null ? saveableStateRegistry2.canBeSaved(obj) : true);
            }
        }), saveableStateHolder);
    }
}
