package s40;

import kotlinx.datetime.format.AmPmMarker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nLocalTimeFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LocalTimeFormat.kt\nkotlinx/datetime/format/TimeFieldContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,301:1\n1#2:302\n*E\n"})
/* loaded from: classes8.dex */
public interface y1 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @m80.l
        @Deprecated
        public static t40.c a(@m80.k y1 y1Var) {
            return y1.super.A();
        }

        @Deprecated
        public static void b(@m80.k y1 y1Var, @m80.l t40.c cVar) {
            y1.super.q(cVar);
        }
    }

    @m80.l
    default t40.c A() {
        Integer d11 = d();
        if (d11 != null) {
            return new t40.c(d11.intValue(), 9);
        }
        return null;
    }

    void H(@m80.l Integer num);

    @m80.l
    Integer d();

    @m80.l
    Integer e();

    void g(@m80.l Integer num);

    @m80.l
    AmPmMarker h();

    void j(@m80.l Integer num);

    void k(@m80.l Integer num);

    @m80.l
    Integer n();

    void o(@m80.l AmPmMarker amPmMarker);

    default void q(@m80.l t40.c cVar) {
        k(cVar != null ? Integer.valueOf(cVar.b(9)) : null);
    }

    @m80.l
    Integer u();

    @m80.l
    Integer y();

    void z(@m80.l Integer num);
}
