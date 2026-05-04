package h20;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class o implements a30.i {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final v f58129a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final n f58130b;

    public o(@m80.k v kotlinClassFinder, @m80.k n deserializedDescriptorResolver) {
        kotlin.jvm.internal.g0.p(kotlinClassFinder, "kotlinClassFinder");
        kotlin.jvm.internal.g0.p(deserializedDescriptorResolver, "deserializedDescriptorResolver");
        this.f58129a = kotlinClassFinder;
        this.f58130b = deserializedDescriptorResolver;
    }

    @Override // a30.i
    @m80.l
    public a30.h a(@m80.k n20.b classId) {
        kotlin.jvm.internal.g0.p(classId, "classId");
        x b11 = w.b(this.f58129a, classId, o30.c.a(this.f58130b.f().g()));
        if (b11 == null) {
            return null;
        }
        kotlin.jvm.internal.g0.g(b11.a(), classId);
        return this.f58130b.l(b11);
    }
}
