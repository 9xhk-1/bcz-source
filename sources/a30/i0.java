package a30;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes8.dex */
public class i0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1773a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtoBuf.Property f1774b;

    /* renamed from: c, reason: collision with root package name */
    public final c30.n0 f1775c;

    public i0(j0 j0Var, ProtoBuf.Property property, c30.n0 n0Var) {
        this.f1773a = j0Var;
        this.f1774b = property;
        this.f1775c = n0Var;
    }

    @Override // x00.a
    public Object invoke() {
        s20.g y11;
        y11 = j0.y(this.f1773a, this.f1774b, this.f1775c);
        return y11;
    }
}
