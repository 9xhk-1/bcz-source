package n10;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* loaded from: classes8.dex */
public class k implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final PrimitiveType f73987a;

    public k(PrimitiveType primitiveType) {
        this.f73987a = primitiveType;
    }

    @Override // x00.a
    public Object invoke() {
        n20.c typeFqName_delegate$lambda$0;
        typeFqName_delegate$lambda$0 = PrimitiveType.typeFqName_delegate$lambda$0(this.f73987a);
        return typeFqName_delegate$lambda$0;
    }
}
