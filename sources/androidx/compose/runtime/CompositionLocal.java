package androidx.compose.runtime;

import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import w00.j;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public abstract class CompositionLocal<T> {
    public static final int $stable = 0;

    @k
    private final ValueHolder<T> defaultValueHolder;

    public /* synthetic */ CompositionLocal(x00.a aVar, v vVar) {
        this(aVar);
    }

    @j(name = "getCurrent")
    @Composable
    @ReadOnlyComposable
    public final T getCurrent(@l Composer composer, int i11) {
        return (T) composer.consume(this);
    }

    @k
    public ValueHolder<T> getDefaultValueHolder$runtime_release() {
        return this.defaultValueHolder;
    }

    @k
    public abstract ValueHolder<T> updatedStateOf$runtime_release(@k ProvidedValue<T> providedValue, @l ValueHolder<T> valueHolder);

    private CompositionLocal(x00.a<? extends T> aVar) {
        this.defaultValueHolder = new LazyValueHolder(aVar);
    }

    public static /* synthetic */ void getCurrent$annotations() {
    }
}
