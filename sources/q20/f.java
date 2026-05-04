package q20;

/* loaded from: classes8.dex */
public class f implements x00.p {

    /* renamed from: a, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.a f81467a;

    /* renamed from: b, reason: collision with root package name */
    public final kotlin.reflect.jvm.internal.impl.descriptors.a f81468b;

    public f(kotlin.reflect.jvm.internal.impl.descriptors.a aVar, kotlin.reflect.jvm.internal.impl.descriptors.a aVar2) {
        this.f81467a = aVar;
        this.f81468b = aVar2;
    }

    @Override // x00.p
    public Object invoke(Object obj, Object obj2) {
        boolean i11;
        i11 = kotlin.reflect.jvm.internal.impl.resolve.a.i(this.f81467a, this.f81468b, (p10.h) obj, (p10.h) obj2);
        return Boolean.valueOf(i11);
    }
}
