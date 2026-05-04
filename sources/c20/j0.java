package c20;

import kotlin.jvm.internal.Ref;

/* loaded from: classes8.dex */
public class j0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final t0 f7574a;

    /* renamed from: b, reason: collision with root package name */
    public final f20.n f7575b;

    /* renamed from: c, reason: collision with root package name */
    public final Ref.ObjectRef f7576c;

    public j0(t0 t0Var, f20.n nVar, Ref.ObjectRef objectRef) {
        this.f7574a = t0Var;
        this.f7575b = nVar;
        this.f7576c = objectRef;
    }

    @Override // x00.a
    public Object invoke() {
        s20.g d02;
        d02 = t0.d0(this.f7574a, this.f7575b, this.f7576c);
        return d02;
    }
}
