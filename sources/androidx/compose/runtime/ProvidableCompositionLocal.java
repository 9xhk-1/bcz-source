package androidx.compose.runtime;

import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public abstract class ProvidableCompositionLocal<T> extends CompositionLocal<T> {
    public static final int $stable = 0;

    public ProvidableCompositionLocal(@k x00.a<? extends T> aVar) {
        super(aVar, null);
    }

    private final ValueHolder<T> valueHolderOf(ProvidedValue<T> providedValue) {
        if (!providedValue.isDynamic$runtime_release()) {
            return providedValue.getCompute$runtime_release() != null ? new ComputedValueHolder(providedValue.getCompute$runtime_release()) : providedValue.getState$runtime_release() != null ? new DynamicValueHolder(providedValue.getState$runtime_release()) : new StaticValueHolder(providedValue.getEffectiveValue$runtime_release());
        }
        MutableState<T> state$runtime_release = providedValue.getState$runtime_release();
        if (state$runtime_release == null) {
            T value = providedValue.getValue();
            SnapshotMutationPolicy<T> mutationPolicy$runtime_release = providedValue.getMutationPolicy$runtime_release();
            if (mutationPolicy$runtime_release == null) {
                mutationPolicy$runtime_release = SnapshotStateKt.structuralEqualityPolicy();
            }
            state$runtime_release = SnapshotStateKt.mutableStateOf(value, mutationPolicy$runtime_release);
        }
        return new DynamicValueHolder(state$runtime_release);
    }

    @k
    public abstract ProvidedValue<T> defaultProvidedValue$runtime_release(T t11);

    @k
    public final ProvidedValue<T> provides(T t11) {
        return defaultProvidedValue$runtime_release(t11);
    }

    @k
    public final ProvidedValue<T> providesComputed(@k l<? super CompositionLocalAccessorScope, ? extends T> lVar) {
        return new ProvidedValue<>(this, null, false, null, null, lVar, false);
    }

    @k
    public final ProvidedValue<T> providesDefault(T t11) {
        return defaultProvidedValue$runtime_release(t11).ifNotAlreadyProvided$runtime_release();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0032, code lost:
    
        if (r0 != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0034, code lost:
    
        r1 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0044, code lost:
    
        if (r0 == r2) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.CompositionLocal
    @m80.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public androidx.compose.runtime.ValueHolder<T> updatedStateOf$runtime_release(@m80.k androidx.compose.runtime.ProvidedValue<T> r4, @m80.l androidx.compose.runtime.ValueHolder<T> r5) {
        /*
            r3 = this;
            boolean r0 = r5 instanceof androidx.compose.runtime.DynamicValueHolder
            r1 = 0
            if (r0 == 0) goto L1a
            boolean r0 = r4.isDynamic$runtime_release()
            if (r0 == 0) goto L47
            r1 = r5
            androidx.compose.runtime.DynamicValueHolder r1 = (androidx.compose.runtime.DynamicValueHolder) r1
            androidx.compose.runtime.MutableState r5 = r1.getState()
            java.lang.Object r0 = r4.getEffectiveValue$runtime_release()
            r5.setValue(r0)
            goto L47
        L1a:
            boolean r0 = r5 instanceof androidx.compose.runtime.StaticValueHolder
            if (r0 == 0) goto L36
            boolean r0 = r4.isStatic$runtime_release()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r4.getEffectiveValue$runtime_release()
            androidx.compose.runtime.StaticValueHolder r5 = (androidx.compose.runtime.StaticValueHolder) r5
            java.lang.Object r2 = r5.getValue()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r2)
            if (r0 == 0) goto L47
        L34:
            r1 = r5
            goto L47
        L36:
            boolean r0 = r5 instanceof androidx.compose.runtime.ComputedValueHolder
            if (r0 == 0) goto L47
            x00.l r0 = r4.getCompute$runtime_release()
            androidx.compose.runtime.ComputedValueHolder r5 = (androidx.compose.runtime.ComputedValueHolder) r5
            x00.l r2 = r5.getCompute()
            if (r0 != r2) goto L47
            goto L34
        L47:
            if (r1 != 0) goto L4e
            androidx.compose.runtime.ValueHolder r4 = r3.valueHolderOf(r4)
            return r4
        L4e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.ProvidableCompositionLocal.updatedStateOf$runtime_release(androidx.compose.runtime.ProvidedValue, androidx.compose.runtime.ValueHolder):androidx.compose.runtime.ValueHolder");
    }
}
