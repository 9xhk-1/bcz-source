package n10;

import kotlin.reflect.jvm.internal.impl.builtins.PrimitiveType;

/* loaded from: classes8.dex */
public class l implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final PrimitiveType f73988a;

    public l(PrimitiveType primitiveType) {
        this.f73988a = primitiveType;
    }

    @Override // x00.a
    public Object invoke() {
        n20.c arrayTypeFqName_delegate$lambda$1;
        arrayTypeFqName_delegate$lambda$1 = PrimitiveType.arrayTypeFqName_delegate$lambda$1(this.f73988a);
        return arrayTypeFqName_delegate$lambda$1;
    }
}
