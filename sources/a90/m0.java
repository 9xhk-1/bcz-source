package a90;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class m0 implements p80.u, p80.i0, p80.k {

    /* renamed from: a, reason: collision with root package name */
    public final k f2411a;

    public m0(k repetitionInfo) {
        this.f2411a = repetitionInfo;
    }

    @Override // p80.i0
    public void B(p80.n context, Throwable cause) {
        this.f2411a.f2399c.incrementAndGet();
    }

    @Override // p80.u
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public org.junit.jupiter.api.c3 u(p80.t parameterContext, p80.n extensionContext) {
        return this.f2411a;
    }

    @Override // p80.u
    public boolean a(p80.t parameterContext, p80.n extensionContext) {
        Class type;
        type = parameterContext.b().getType();
        return type == org.junit.jupiter.api.c3.class;
    }

    @Override // p80.k
    public p80.h h(p80.n context) {
        k kVar = this.f2411a;
        int i11 = kVar.f2400d;
        if (kVar.f2399c.get() < i11) {
            return p80.h.c("Failure threshold not exceeded");
        }
        return p80.h.a("Failure threshold [" + i11 + "] exceeded");
    }
}
