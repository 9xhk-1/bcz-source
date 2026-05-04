package kotlin.coroutines;

import java.io.Serializable;
import kotlin.coroutines.d;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.p;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.3")
/* loaded from: classes8.dex */
public final class EmptyCoroutineContext implements d, Serializable {

    @k
    public static final EmptyCoroutineContext INSTANCE = new EmptyCoroutineContext();
    private static final long serialVersionUID = 0;

    private EmptyCoroutineContext() {
    }

    private final Object readResolve() {
        return INSTANCE;
    }

    @Override // kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> operation) {
        g0.p(operation, "operation");
        return r11;
    }

    @Override // kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> key) {
        g0.p(key, "key");
        return null;
    }

    public int hashCode() {
        return 0;
    }

    @Override // kotlin.coroutines.d
    @k
    public d minusKey(@k d.c<?> key) {
        g0.p(key, "key");
        return this;
    }

    @Override // kotlin.coroutines.d
    @k
    public d plus(@k d context) {
        g0.p(context, "context");
        return context;
    }

    @k
    public String toString() {
        return "EmptyCoroutineContext";
    }
}
