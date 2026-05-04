package v10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class v extends h implements f20.m {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Enum<?> f92868c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(@m80.l n20.f fVar, @m80.k Enum<?> value) {
        super(fVar, null);
        kotlin.jvm.internal.g0.p(value, "value");
        this.f92868c = value;
    }

    @Override // f20.m
    @m80.l
    public n20.b c() {
        Class<?> cls = this.f92868c.getClass();
        if (!cls.isEnum()) {
            cls = cls.getEnclosingClass();
        }
        kotlin.jvm.internal.g0.m(cls);
        return f.e(cls);
    }

    @Override // f20.m
    @m80.l
    public n20.f d() {
        return n20.f.f(this.f92868c.name());
    }
}
