package s40;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDateTimeComponents.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeComponents.kt\nkotlinx/datetime/format/TwoDigitNumber\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,673:1\n1#2:674\n*E\n"})
/* loaded from: classes8.dex */
public final class b2 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final h10.k<Integer> f87579a;

    public b2(@m80.k h10.k<Integer> reference) {
        kotlin.jvm.internal.g0.p(reference, "reference");
        this.f87579a = reference;
    }

    @m80.l
    public final Integer a(@m80.l Object obj, @m80.k h10.n<?> property) {
        kotlin.jvm.internal.g0.p(property, "property");
        return this.f87579a.get();
    }

    public final void b(@m80.l Object obj, @m80.k h10.n<?> property, @m80.l Integer num) {
        kotlin.jvm.internal.g0.p(property, "property");
        if (num == null || new g10.l(0, 99).k(num.intValue())) {
            this.f87579a.set(num);
            return;
        }
        throw new IllegalArgumentException((property.getName() + " must be a two-digit number, got '" + num + '\'').toString());
    }
}
