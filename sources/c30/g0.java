package c30;

import c30.w;
import java.util.Set;

/* loaded from: classes8.dex */
public class g0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final w.b f7692a;

    /* renamed from: b, reason: collision with root package name */
    public final w f7693b;

    public g0(w.b bVar, w wVar) {
        this.f7692a = bVar;
        this.f7693b = wVar;
    }

    @Override // x00.a
    public Object invoke() {
        Set P;
        P = w.b.P(this.f7692a, this.f7693b);
        return P;
    }
}
