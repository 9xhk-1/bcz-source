package k10;

import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;

/* loaded from: classes8.dex */
public class a1 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final KDeclarationContainerImpl f64909a;

    public a1(KDeclarationContainerImpl kDeclarationContainerImpl) {
        this.f64909a = kDeclarationContainerImpl;
    }

    @Override // x00.a
    public Object invoke() {
        u10.k c11;
        c11 = KDeclarationContainerImpl.b.c(this.f64909a);
        return c11;
    }
}
