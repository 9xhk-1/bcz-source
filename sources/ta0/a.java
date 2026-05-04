package ta0;

import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public final class a<T> extends b<T> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k ra0.b<T> beanDefinition) {
        super(beanDefinition);
        g0.p(beanDefinition, "beanDefinition");
    }

    @Override // ta0.b
    public void b(@l cb0.b bVar) {
        x00.l<T, g2> d11 = f().b().d();
        if (d11 != null) {
            d11.invoke(null);
        }
    }

    @Override // ta0.b
    public T e(@k d context) {
        g0.p(context, "context");
        return a(context);
    }

    @Override // ta0.b
    public boolean g(@l d dVar) {
        return false;
    }

    @Override // ta0.b
    public void d() {
    }
}
