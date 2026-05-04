package c30;

import c30.w;
import java.util.Set;

/* loaded from: classes8.dex */
public class l0 implements x00.a {

    /* renamed from: a, reason: collision with root package name */
    public final w.c f7704a;

    /* renamed from: b, reason: collision with root package name */
    public final w f7705b;

    public l0(w.c cVar, w wVar) {
        this.f7704a = cVar;
        this.f7705b = wVar;
    }

    @Override // x00.a
    public Object invoke() {
        Set u11;
        u11 = w.c.u(this.f7704a, this.f7705b);
        return u11;
    }
}
