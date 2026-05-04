package kotlin.jvm.internal;

import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class Lambda<R> implements c0<R>, Serializable {
    private final int arity;

    public Lambda(int i11) {
        this.arity = i11;
    }

    @Override // kotlin.jvm.internal.c0
    public int getArity() {
        return this.arity;
    }

    @m80.k
    public String toString() {
        String x11 = o0.x(this);
        g0.o(x11, "renderLambdaToString(...)");
        return x11;
    }
}
