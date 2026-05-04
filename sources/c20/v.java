package c20;

import java.util.Collection;

/* loaded from: classes8.dex */
public class v implements x00.l {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.g f7639a;

    /* renamed from: b, reason: collision with root package name */
    public final z f7640b;

    public v(kotlin.reflect.jvm.internal.impl.descriptors.g gVar, z zVar) {
        this.f7639a = gVar;
        this.f7640b = zVar;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        Collection h12;
        h12 = z.h1(this.f7639a, this.f7640b, (n20.f) obj);
        return h12;
    }
}
