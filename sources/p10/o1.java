package p10;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class o1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f78603a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f78604b;

    public o1(@m80.k String name, boolean z11) {
        kotlin.jvm.internal.g0.p(name, "name");
        this.f78603a = name;
        this.f78604b = z11;
    }

    @m80.l
    public Integer a(@m80.k o1 visibility) {
        kotlin.jvm.internal.g0.p(visibility, "visibility");
        return n1.f78574a.a(this, visibility);
    }

    @m80.k
    public String b() {
        return this.f78603a;
    }

    public final boolean c() {
        return this.f78604b;
    }

    @m80.k
    public final String toString() {
        return b();
    }

    @m80.k
    public o1 d() {
        return this;
    }
}
