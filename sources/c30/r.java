package c30;

import c30.n;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* loaded from: classes8.dex */
public class r implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final n f7755a;

    /* renamed from: b, reason: collision with root package name */
    public final ProtoBuf.EnumEntry f7756b;

    public r(n nVar, ProtoBuf.EnumEntry enumEntry) {
        this.f7755a = nVar;
        this.f7756b = enumEntry;
    }

    @Override // x00.a
    public Object invoke() {
        List g11;
        g11 = n.c.g(this.f7755a, this.f7756b);
        return g11;
    }
}
