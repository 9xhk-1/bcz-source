package c30;

import c30.w;
import java.util.Set;

/* loaded from: classes8.dex */
public class f0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final w.b f7689a;

    /* renamed from: b, reason: collision with root package name */
    public final w f7690b;

    public f0(w.b bVar, w wVar) {
        this.f7689a = bVar;
        this.f7690b = wVar;
    }

    @Override // x00.a
    public Object invoke() {
        Set D;
        D = w.b.D(this.f7689a, this.f7690b);
        return D;
    }
}
