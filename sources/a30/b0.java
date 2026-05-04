package a30;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes8.dex */
public class b0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1736a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtoBuf.Property f1737b;

    /* renamed from: c, reason: collision with root package name */
    public final c30.n0 f1738c;

    public b0(j0 j0Var, ProtoBuf.Property property, c30.n0 n0Var) {
        this.f1736a = j0Var;
        this.f1737b = property;
        this.f1738c = n0Var;
    }

    @Override // x00.a
    public Object invoke() {
        d30.j v11;
        v11 = j0.v(this.f1736a, this.f1737b, this.f1738c);
        return v11;
    }
}
