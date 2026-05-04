package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.ComposablesKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotMutationPolicy;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotMutableState;
import java.util.Arrays;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.a;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRememberSaveable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,264:1\n75#2:265\n1247#3,3:266\n1250#3,3:270\n1247#3,6:273\n1#4:269\n*S KotlinDebug\n*F\n+ 1 RememberSaveable.kt\nandroidx/compose/runtime/saveable/RememberSaveableKt\n*L\n82#1:265\n84#1:266,3\n84#1:270,3\n92#1:273,6\n*E\n"})
/* loaded from: classes.dex */
public final class RememberSaveableKt {
    private static final int MaxSupportedRadix = 36;

    @k
    public static final String generateCannotBeSavedErrorMessage(@k Object obj) {
        return obj + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it to rememberSaveable().";
    }

    private static final <T> Saver<MutableState<T>, MutableState<Object>> mutableStateSaver(final Saver<T, ? extends Object> saver) {
        g0.n(saver, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver, kotlin.Any>");
        return SaverKt.Saver(new p<SaverScope, MutableState<T>, MutableState<Object>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // x00.p
            public final MutableState<Object> invoke(SaverScope saverScope, MutableState<T> mutableState) {
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("If you use a custom MutableState implementation you have to write a custom Saver and pass it as a saver param to rememberSaveable()");
                }
                Object save = saver.save(saverScope, mutableState.getValue());
                if (save == null) {
                    return null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) mutableState).getPolicy();
                g0.n(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<kotlin.Any?>");
                return SnapshotStateKt.mutableStateOf(save, policy);
            }
        }, new l<MutableState<Object>, MutableState<T>>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$mutableStateSaver$1$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // x00.l
            public final MutableState<T> invoke(MutableState<Object> mutableState) {
                T t11;
                if (!(mutableState instanceof SnapshotMutableState)) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if (mutableState.getValue() != null) {
                    Saver<T, Object> saver2 = saver;
                    Object value = mutableState.getValue();
                    g0.m(value);
                    t11 = saver2.restore(value);
                } else {
                    t11 = null;
                }
                SnapshotMutationPolicy<T> policy = ((SnapshotMutableState) mutableState).getPolicy();
                g0.n(policy, "null cannot be cast to non-null type androidx.compose.runtime.SnapshotMutationPolicy<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver?>");
                MutableState<T> mutableStateOf = SnapshotStateKt.mutableStateOf(t11, policy);
                g0.n(mutableStateOf, "null cannot be cast to non-null type androidx.compose.runtime.MutableState<T of androidx.compose.runtime.saveable.RememberSaveableKt.mutableStateSaver>");
                return mutableStateOf;
            }
        });
    }

    @Composable
    @k
    /* renamed from: rememberSaveable, reason: collision with other method in class */
    public static final <T> T m2066rememberSaveable(@k Object[] objArr, @m80.l Saver<T, ? extends Object> saver, @m80.l String str, @k a<? extends T> aVar, @m80.l Composer composer, int i11, int i12) {
        Object[] objArr2;
        final T t11;
        Object consumeRestored;
        if ((i12 & 2) != 0) {
            saver = SaverKt.autoSaver();
        }
        final Saver<T, ? extends Object> saver2 = saver;
        int i13 = i12 & 4;
        T t12 = null;
        if (i13 != 0) {
            str = null;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(441892779, i11, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:70)");
        }
        int currentCompositeKeyHash = ComposablesKt.getCurrentCompositeKeyHash(composer, 0);
        if (str == null || str.length() == 0) {
            str = Integer.toString(currentCompositeKeyHash, kotlin.text.a.a(MaxSupportedRadix));
            g0.o(str, "toString(...)");
        }
        final String str2 = str;
        g0.n(saver2, "null cannot be cast to non-null type androidx.compose.runtime.saveable.Saver<T of androidx.compose.runtime.saveable.RememberSaveableKt.rememberSaveable, kotlin.Any>");
        final SaveableStateRegistry saveableStateRegistry = (SaveableStateRegistry) composer.consume(SaveableStateRegistryKt.getLocalSaveableStateRegistry());
        Object rememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.Companion;
        if (rememberedValue == companion.getEmpty()) {
            if (saveableStateRegistry != null && (consumeRestored = saveableStateRegistry.consumeRestored(str2)) != null) {
                t12 = saver2.restore(consumeRestored);
            }
            if (t12 == null) {
                t12 = aVar.invoke();
            }
            objArr2 = objArr;
            Object saveableHolder = new SaveableHolder(saver2, saveableStateRegistry, str2, t12, objArr2);
            composer.updateRememberedValue(saveableHolder);
            rememberedValue = saveableHolder;
        } else {
            objArr2 = objArr;
        }
        final SaveableHolder saveableHolder2 = (SaveableHolder) rememberedValue;
        Object valueIfInputsDidntChange = saveableHolder2.getValueIfInputsDidntChange(objArr2);
        if (valueIfInputsDidntChange == null) {
            valueIfInputsDidntChange = aVar.invoke();
        }
        boolean changedInstance = composer.changedInstance(saveableHolder2) | ((((i11 & 112) ^ 48) > 32 && composer.changedInstance(saver2)) || (i11 & 48) == 32) | composer.changedInstance(saveableStateRegistry) | composer.changed(str2) | composer.changedInstance(valueIfInputsDidntChange) | composer.changedInstance(objArr2);
        Object rememberedValue2 = composer.rememberedValue();
        if (changedInstance || rememberedValue2 == companion.getEmpty()) {
            final Object[] objArr3 = objArr2;
            t11 = (T) valueIfInputsDidntChange;
            Object obj = new a<g2>() { // from class: androidx.compose.runtime.saveable.RememberSaveableKt$rememberSaveable$1$1
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
                    saveableHolder2.update(saver2, saveableStateRegistry, str2, t11, objArr3);
                }
            };
            composer.updateRememberedValue(obj);
            rememberedValue2 = obj;
        } else {
            t11 = (T) valueIfInputsDidntChange;
        }
        EffectsKt.SideEffect((a) rememberedValue2, composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return t11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void requireCanBeSaved(SaveableStateRegistry saveableStateRegistry, Object obj) {
        String generateCannotBeSavedErrorMessage;
        if (obj == null || saveableStateRegistry.canBeSaved(obj)) {
            return;
        }
        if (obj instanceof SnapshotMutableState) {
            SnapshotMutableState snapshotMutableState = (SnapshotMutableState) obj;
            if (snapshotMutableState.getPolicy() == SnapshotStateKt.neverEqualPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.structuralEqualityPolicy() || snapshotMutableState.getPolicy() == SnapshotStateKt.referentialEqualityPolicy()) {
                generateCannotBeSavedErrorMessage = "MutableState containing " + snapshotMutableState.getValue() + " cannot be saved using the current SaveableStateRegistry. The default implementation only supports types which can be stored inside the Bundle. Please consider implementing a custom Saver for this class and pass it as a stateSaver parameter to rememberSaveable().";
            } else {
                generateCannotBeSavedErrorMessage = "If you use a custom SnapshotMutationPolicy for your MutableState you have to write a custom Saver";
            }
        } else {
            generateCannotBeSavedErrorMessage = generateCannotBeSavedErrorMessage(obj);
        }
        throw new IllegalArgumentException(generateCannotBeSavedErrorMessage);
    }

    @Composable
    @k
    public static final <T> MutableState<T> rememberSaveable(@k Object[] objArr, @k Saver<T, ? extends Object> saver, @m80.l String str, @k a<? extends MutableState<T>> aVar, @m80.l Composer composer, int i11, int i12) {
        if ((i12 & 4) != 0) {
            str = null;
        }
        String str2 = str;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-202053668, i11, -1, "androidx.compose.runtime.saveable.rememberSaveable (RememberSaveable.kt:124)");
        }
        MutableState<T> mutableState = (MutableState) m2066rememberSaveable(Arrays.copyOf(objArr, objArr.length), mutableStateSaver(saver), str2, (a) aVar, composer, i11 & 8064, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return mutableState;
    }
}
