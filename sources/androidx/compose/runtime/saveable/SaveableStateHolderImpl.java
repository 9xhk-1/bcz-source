package androidx.compose.runtime.saveable;

import androidx.collection.MutableScatterMap;
import androidx.collection.ScatterMapKt;
import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSaveableStateHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n+ 2 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ScatterMap.kt\nandroidx/collection/ScatterMap\n+ 5 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,125:1\n137#2,3:126\n140#2,2:141\n1247#3,6:129\n1247#3,6:135\n357#4,4:143\n329#4,6:147\n339#4,3:154\n342#4,9:158\n361#4:167\n1399#5:153\n1270#5:157\n1#6:168\n*S KotlinDebug\n*F\n+ 1 SaveableStateHolder.kt\nandroidx/compose/runtime/saveable/SaveableStateHolderImpl\n*L\n71#1:126,3\n71#1:141,2\n72#1:129,6\n83#1:135,6\n98#1:143,4\n98#1:147,6\n98#1:154,3\n98#1:158,9\n98#1:167\n98#1:153\n98#1:157\n*E\n"})
/* loaded from: classes.dex */
final class SaveableStateHolderImpl implements SaveableStateHolder {

    @k
    public static final Companion Companion = new Companion(null);

    @k
    private static final Saver<SaveableStateHolderImpl, ?> Saver = SaverKt.Saver(new p<SaverScope, SaveableStateHolderImpl, Map<Object, Map<String, ? extends List<? extends Object>>>>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$1
        @Override // x00.p
        public final Map<Object, Map<String, List<Object>>> invoke(SaverScope saverScope, SaveableStateHolderImpl saveableStateHolderImpl) {
            Map<Object, Map<String, List<Object>>> saveAll;
            saveAll = saveableStateHolderImpl.saveAll();
            return saveAll;
        }
    }, new l<Map<Object, Map<String, ? extends List<? extends Object>>>, SaveableStateHolderImpl>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$Companion$Saver$2
        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final SaveableStateHolderImpl invoke2(Map<Object, Map<String, List<Object>>> map) {
            return new SaveableStateHolderImpl(map);
        }

        @Override // x00.l
        public /* bridge */ /* synthetic */ SaveableStateHolderImpl invoke(Map<Object, Map<String, ? extends List<? extends Object>>> map) {
            return invoke2((Map<Object, Map<String, List<Object>>>) map);
        }
    });

    @k
    private final l<Object, Boolean> canBeSaved;

    @m80.l
    private SaveableStateRegistry parentSaveableStateRegistry;

    @k
    private final MutableScatterMap<Object, SaveableStateRegistry> registries;

    @k
    private final Map<Object, Map<String, List<Object>>> savedStates;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        @k
        public final Saver<SaveableStateHolderImpl, ?> getSaver() {
            return SaveableStateHolderImpl.Saver;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SaveableStateHolderImpl() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<Object, Map<String, List<Object>>> saveAll() {
        Map<Object, Map<String, List<Object>>> map = this.savedStates;
        MutableScatterMap<Object, SaveableStateRegistry> mutableScatterMap = this.registries;
        Object[] objArr = mutableScatterMap.keys;
        Object[] objArr2 = mutableScatterMap.values;
        long[] jArr = mutableScatterMap.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i11 = 0;
            while (true) {
                long j11 = jArr[i11];
                if ((((~j11) << 7) & j11 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i12 = 8 - ((~(i11 - length)) >>> 31);
                    for (int i13 = 0; i13 < i12; i13++) {
                        if ((255 & j11) < 128) {
                            int i14 = (i11 << 3) + i13;
                            saveTo((SaveableStateRegistry) objArr2[i14], map, objArr[i14]);
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
        if (map.isEmpty()) {
            return null;
        }
        return map;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveTo(SaveableStateRegistry saveableStateRegistry, Map<Object, Map<String, List<Object>>> map, Object obj) {
        Map<String, List<Object>> performSave = saveableStateRegistry.performSave();
        if (performSave.isEmpty()) {
            map.remove(obj);
        } else {
            map.put(obj, performSave);
        }
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    @Composable
    public void SaveableStateProvider(@k final Object obj, @k p<? super Composer, ? super Integer, g2> pVar, @m80.l Composer composer, int i11) {
        composer.startReplaceGroup(-1198538093);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1198538093, i11, -1, "androidx.compose.runtime.saveable.SaveableStateHolderImpl.SaveableStateProvider (SaveableStateHolder.kt:69)");
        }
        composer.startReusableGroup(207, obj);
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            if (!this.canBeSaved.invoke(obj).booleanValue()) {
                throw new IllegalArgumentException(("Type of the key " + obj + " is not supported. On Android you can only use types which can be stored inside the Bundle.").toString());
            }
            rememberedValue = SaveableStateRegistryKt.SaveableStateRegistry(this.savedStates.get(obj), this.canBeSaved);
            composer.updateRememberedValue(rememberedValue);
        }
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) rememberedValue;
        CompositionLocalKt.CompositionLocalProvider(SaveableStateRegistryKt.getLocalSaveableStateRegistry().provides(saveableStateRegistry), pVar, composer, (i11 & 112) | ProvidedValue.$stable);
        g2 g2Var = g2.f100423a;
        boolean changedInstance = composer.changedInstance(this) | composer.changedInstance(obj) | composer.changedInstance(saveableStateRegistry);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            rememberedValue2 = new l<DisposableEffectScope, DisposableEffectResult>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public final DisposableEffectResult invoke(DisposableEffectScope disposableEffectScope) {
                    MutableScatterMap mutableScatterMap;
                    Map map;
                    MutableScatterMap mutableScatterMap2;
                    mutableScatterMap = SaveableStateHolderImpl.this.registries;
                    boolean contains = mutableScatterMap.contains(obj);
                    Object obj2 = obj;
                    if (contains) {
                        throw new IllegalArgumentException(("Key " + obj2 + " was used multiple times ").toString());
                    }
                    map = SaveableStateHolderImpl.this.savedStates;
                    map.remove(obj);
                    mutableScatterMap2 = SaveableStateHolderImpl.this.registries;
                    mutableScatterMap2.set(obj, saveableStateRegistry);
                    final SaveableStateHolderImpl saveableStateHolderImpl = SaveableStateHolderImpl.this;
                    final Object obj3 = obj;
                    final SaveableStateRegistry saveableStateRegistry2 = saveableStateRegistry;
                    return new DisposableEffectResult() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$SaveableStateProvider$1$1$1$invoke$$inlined$onDispose$1
                        @Override // androidx.compose.runtime.DisposableEffectResult
                        public void dispose() {
                            MutableScatterMap mutableScatterMap3;
                            Map map2;
                            mutableScatterMap3 = SaveableStateHolderImpl.this.registries;
                            Object remove = mutableScatterMap3.remove(obj3);
                            SaveableStateRegistry saveableStateRegistry3 = saveableStateRegistry2;
                            if (remove == saveableStateRegistry3) {
                                SaveableStateHolderImpl saveableStateHolderImpl2 = SaveableStateHolderImpl.this;
                                map2 = saveableStateHolderImpl2.savedStates;
                                saveableStateHolderImpl2.saveTo(saveableStateRegistry3, map2, obj3);
                            }
                        }
                    };
                }
            };
            composer.updateRememberedValue(rememberedValue2);
        }
        EffectsKt.DisposableEffect(g2Var, (l<? super DisposableEffectScope, ? extends DisposableEffectResult>) rememberedValue2, composer, 6);
        composer.endReusableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
    }

    @m80.l
    public final SaveableStateRegistry getParentSaveableStateRegistry() {
        return this.parentSaveableStateRegistry;
    }

    @Override // androidx.compose.runtime.saveable.SaveableStateHolder
    public void removeState(@k Object obj) {
        if (this.registries.remove(obj) == null) {
            this.savedStates.remove(obj);
        }
    }

    public final void setParentSaveableStateRegistry(@m80.l SaveableStateRegistry saveableStateRegistry) {
        this.parentSaveableStateRegistry = saveableStateRegistry;
    }

    public SaveableStateHolderImpl(@k Map<Object, Map<String, List<Object>>> map) {
        this.savedStates = map;
        this.registries = ScatterMapKt.mutableScatterMapOf();
        this.canBeSaved = new l<Object, Boolean>() { // from class: androidx.compose.runtime.saveable.SaveableStateHolderImpl$canBeSaved$1
            {
                super(1);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // x00.l
            public final Boolean invoke(Object obj) {
                SaveableStateRegistry parentSaveableStateRegistry = SaveableStateHolderImpl.this.getParentSaveableStateRegistry();
                return Boolean.valueOf(parentSaveableStateRegistry != null ? parentSaveableStateRegistry.canBeSaved(obj) : true);
            }
        };
    }

    public /* synthetic */ SaveableStateHolderImpl(Map map, int i11, v vVar) {
        this((i11 & 1) != 0 ? new LinkedHashMap() : map);
    }
}
