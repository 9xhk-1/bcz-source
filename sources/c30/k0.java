package c30;

import c30.w;
import java.util.Set;

/* loaded from: classes8.dex */
public class k0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final w.c f7701a;

    /* renamed from: b, reason: collision with root package name */
    public final w f7702b;

    public k0(w.c cVar, w wVar) {
        this.f7701a = cVar;
        this.f7702b = wVar;
    }

    @Override // x00.a
    public Object invoke() {
        Set p11;
        p11 = w.c.p(this.f7701a, this.f7702b);
        return p11;
    }
}
