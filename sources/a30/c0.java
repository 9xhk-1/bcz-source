package a30;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes8.dex */
public class c0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1744a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtoBuf.Property f1745b;

    /* renamed from: c, reason: collision with root package name */
    public final c30.n0 f1746c;

    public c0(j0 j0Var, ProtoBuf.Property property, c30.n0 n0Var) {
        this.f1744a = j0Var;
        this.f1745b = property;
        this.f1746c = n0Var;
    }

    @Override // x00.a
    public Object invoke() {
        d30.j x11;
        x11 = j0.x(this.f1744a, this.f1745b, this.f1746c);
        return x11;
    }
}
