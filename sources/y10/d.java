package y10;

import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;

/* loaded from: classes8.dex */
public class d implements x00.l {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.g f99023a;

    public d(kotlin.reflect.jvm.internal.impl.descriptors.g gVar) {
        this.f99023a = gVar;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        boolean l11;
        l11 = kotlin.reflect.jvm.internal.impl.load.java.a.l(this.f99023a, (CallableMemberDescriptor) obj);
        return Boolean.valueOf(l11);
    }
}
