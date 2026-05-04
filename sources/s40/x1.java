package s40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class x1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.k<Integer> f87805a;

    public x1(@m80.k h10.k<Integer> reference) {
        kotlin.jvm.internal.g0.p(reference, "reference");
        this.f87805a = reference;
    }

    @m80.l
    public final Integer a(@m80.l Object obj, @m80.k h10.n<?> property) {
        kotlin.jvm.internal.g0.p(property, "property");
        return this.f87805a.get();
    }

    public final void b(@m80.l Object obj, @m80.k h10.n<?> property, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(property, "property");
        if (num == null || new g10.l(0, 999).k(num.intValue())) {
            this.f87805a.set(num);
            return;
        }
        throw new IllegalArgumentException((property.getName() + " must be a three-digit number, got '" + num + '\'').toString());
    }
}
