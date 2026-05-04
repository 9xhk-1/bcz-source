package c20;

import kotlin.jvm.internal.Ref;

/* loaded from: classes8.dex */
public class i0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f7562a;

    /* renamed from: b, reason: collision with root package name */
    public final f20.n f7563b;

    /* renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef f7564c;

    public i0(t0 t0Var, f20.n nVar, Ref.ObjectRef objectRef) {
        this.f7562a = t0Var;
        this.f7563b = nVar;
        this.f7564c = objectRef;
    }

    @Override // x00.a
    public Object invoke() {
        d30.j c02;
        c02 = t0.c0(this.f7562a, this.f7563b, this.f7564c);
        return c02;
    }
}
