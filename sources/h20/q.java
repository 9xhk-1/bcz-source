package h20;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class q<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final t<T> f58132a;

    /* renamed from: b, reason: collision with root package name */
    public int f58133b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public T f58134c;

    public void b() {
        if (this.f58134c == null) {
            this.f58133b++;
        }
    }

    public void c(@m80.k T objectType) {
        kotlin.jvm.internal.g0.p(objectType, "objectType");
        d(objectType);
    }

    public final void d(@m80.k T type) {
        kotlin.jvm.internal.g0.p(type, "type");
        if (this.f58134c == null) {
            if (this.f58133b > 0) {
                type = this.f58132a.a(u30.f0.v2("[", this.f58133b) + this.f58132a.e(type));
            }
            this.f58134c = type;
        }
    }

    public void e(@m80.k n20.f name, @m80.k T type) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(type, "type");
        d(type);
    }

    public void a() {
    }
}
