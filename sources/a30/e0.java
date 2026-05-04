package a30;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes8.dex */
public class e0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final j0 f1751a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f1752b;

    /* renamed from: c, reason: collision with root package name */
    public final ProtoBuf.Property f1753c;

    public e0(j0 j0Var, boolean z11, ProtoBuf.Property property) {
        this.f1751a = j0Var;
        this.f1752b = z11;
        this.f1753c = property;
    }

    @Override // x00.a
    public Object invoke() {
        List n11;
        n11 = j0.n(this.f1751a, this.f1752b, this.f1753c);
        return n11;
    }
}
