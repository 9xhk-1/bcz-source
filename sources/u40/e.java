package u40;

import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e<T> implements t<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final l<T> f91783a;

    /* JADX WARN: Multi-variable type inference failed */
    public e(@m80.k l<? super T> directive) {
        g0.p(directive, "directive");
        this.f91783a = directive;
    }

    @Override // u40.o
    @m80.k
    public v40.e<T> a() {
        return this.f91783a.a();
    }

    @Override // u40.o
    @m80.k
    public w40.t<T> b() {
        return this.f91783a.b();
    }

    @m80.k
    public final l<T> c() {
        return this.f91783a;
    }

    public boolean equals(@m80.l Object obj) {
        return (obj instanceof e) && g0.g(this.f91783a, ((e) obj).f91783a);
    }

    public int hashCode() {
        return this.f91783a.hashCode();
    }

    @m80.k
    public String toString() {
        return "BasicFormatStructure(" + this.f91783a + ')';
    }
}
