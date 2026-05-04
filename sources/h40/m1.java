package h40;

import c40.m3;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class m1 {

    /* renamed from: a, reason: collision with root package name */
    @w00.g
    @m80.k
    public final kotlin.coroutines.d f58250a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final Object[] f58251b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final m3<Object>[] f58252c;

    /* renamed from: d, reason: collision with root package name */
    public int f58253d;

    public m1(@m80.k kotlin.coroutines.d dVar, int i11) {
        this.f58250a = dVar;
        this.f58251b = new Object[i11];
        this.f58252c = new m3[i11];
    }

    public final void a(@m80.k m3<?> m3Var, @m80.l Object obj) {
        Object[] objArr = this.f58251b;
        int i11 = this.f58253d;
        objArr[i11] = obj;
        m3<Object>[] m3VarArr = this.f58252c;
        this.f58253d = i11 + 1;
        kotlin.jvm.internal.g0.n(m3Var, "null cannot be cast to non-null type kotlinx.coroutines.ThreadContextElement<kotlin.Any?>");
        m3VarArr[i11] = m3Var;
    }

    public final void b(@m80.k kotlin.coroutines.d dVar) {
        int length = this.f58252c.length - 1;
        if (length < 0) {
            return;
        }
        while (true) {
            int i11 = length - 1;
            m3<Object> m3Var = this.f58252c[length];
            kotlin.jvm.internal.g0.m(m3Var);
            m3Var.restoreThreadContext(dVar, this.f58251b[length]);
            if (i11 < 0) {
                return;
            } else {
                length = i11;
            }
        }
    }
}
