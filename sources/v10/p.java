package v10;

import java.lang.reflect.Method;

/* loaded from: classes8.dex */
public class p implements x00.l {

    /* renamed from: a, reason: collision with root package name */
    public final q f92857a;

    public p(q qVar) {
        this.f92857a = qVar;
    }

    @Override // x00.l
    public Object invoke(Object obj) {
        boolean Q;
        Q = q.Q(this.f92857a, (Method) obj);
        return Boolean.valueOf(Q);
    }
}
