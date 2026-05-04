package androidx.compose.runtime;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nComposer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Composer.kt\nandroidx/compose/runtime/ProvidedValue\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,4891:1\n1#2:4892\n*E\n"})
/* loaded from: classes.dex */
public final class ProvidedValue<T> {
    public static final int $stable = 8;
    private boolean canOverride = true;

    @k
    private final CompositionLocal<T> compositionLocal;

    @l
    private final x00.l<CompositionLocalAccessorScope, T> compute;
    private final boolean explicitNull;
    private final boolean isDynamic;

    @l
    private final SnapshotMutationPolicy<T> mutationPolicy;

    @l
    private final T providedValue;

    @l
    private final MutableState<T> state;

    /* JADX WARN: Multi-variable type inference failed */
    public ProvidedValue(@k CompositionLocal<T> compositionLocal, @l T t11, boolean z11, @l SnapshotMutationPolicy<T> snapshotMutationPolicy, @l MutableState<T> mutableState, @l x00.l<? super CompositionLocalAccessorScope, ? extends T> lVar, boolean z12) {
        this.compositionLocal = compositionLocal;
        this.explicitNull = z11;
        this.mutationPolicy = snapshotMutationPolicy;
        this.state = mutableState;
        this.compute = lVar;
        this.isDynamic = z12;
        this.providedValue = t11;
    }

    @j(name = "getCanOverride")
    public final boolean getCanOverride() {
        return this.canOverride;
    }

    @k
    public final CompositionLocal<T> getCompositionLocal() {
        return this.compositionLocal;
    }

    @l
    public final x00.l<CompositionLocalAccessorScope, T> getCompute$runtime_release() {
        return this.compute;
    }

    public final T getEffectiveValue$runtime_release() {
        if (this.explicitNull) {
            return null;
        }
        MutableState<T> mutableState = this.state;
        if (mutableState != null) {
            return mutableState.getValue();
        }
        T t11 = this.providedValue;
        if (t11 != null) {
            return t11;
        }
        ComposerKt.composeRuntimeError("Unexpected form of a provided value");
        throw new KotlinNothingValueException();
    }

    @l
    public final SnapshotMutationPolicy<T> getMutationPolicy$runtime_release() {
        return this.mutationPolicy;
    }

    @l
    public final MutableState<T> getState$runtime_release() {
        return this.state;
    }

    public final T getValue() {
        return this.providedValue;
    }

    @k
    public final ProvidedValue<T> ifNotAlreadyProvided$runtime_release() {
        this.canOverride = false;
        return this;
    }

    public final boolean isDynamic$runtime_release() {
        return this.isDynamic;
    }

    public final boolean isStatic$runtime_release() {
        return (this.explicitNull || getValue() != null) && !this.isDynamic;
    }

    public static /* synthetic */ void getEffectiveValue$runtime_release$annotations() {
    }

    public static /* synthetic */ void getValue$annotations() {
    }
}
