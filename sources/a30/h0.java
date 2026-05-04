package a30;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes8.dex */
public class h0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1770a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtoBuf.Property f1771b;

    /* renamed from: c, reason: collision with root package name */
    public final c30.n0 f1772c;

    public h0(j0 j0Var, ProtoBuf.Property property, c30.n0 n0Var) {
        this.f1770a = j0Var;
        this.f1771b = property;
        this.f1772c = n0Var;
    }

    @Override // x00.a
    public Object invoke() {
        s20.g w11;
        w11 = j0.w(this.f1770a, this.f1771b, this.f1772c);
        return w11;
    }
}
