package s40;

import java.util.ArrayList;
import kotlinx.datetime.internal.format.OptionalFormatStructure;
import s40.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDateTimeFormatBuilder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeFormatBuilder.kt\nkotlinx/datetime/format/AbstractDateTimeFormatBuilder\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,566:1\n11228#2:567\n11563#2,2:568\n11565#2:571\n1#3:570\n*S KotlinDebug\n*F\n+ 1 DateTimeFormatBuilder.kt\nkotlinx/datetime/format/AbstractDateTimeFormatBuilder\n*L\n460#1:567\n460#1:568,2\n460#1:571\n*E\n"})
/* loaded from: classes8.dex */
public interface b<Target, ActualSelf extends b<Target, ActualSelf>> extends g0 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        @Deprecated
        public static <Target, ActualSelf extends b<Target, ActualSelf>> void a(@m80.k b<Target, ActualSelf> bVar, @m80.k x00.l<? super ActualSelf, yz.g2>[] otherFormats, @m80.k x00.l<? super ActualSelf, yz.g2> mainFormat) {
            kotlin.jvm.internal.g0.p(otherFormats, "otherFormats");
            kotlin.jvm.internal.g0.p(mainFormat, "mainFormat");
            b.super.s0(otherFormats, mainFormat);
        }

        @Deprecated
        public static <Target, ActualSelf extends b<Target, ActualSelf>> void b(@m80.k b<Target, ActualSelf> bVar, @m80.k String onZero, @m80.k x00.l<? super ActualSelf, yz.g2> format) {
            kotlin.jvm.internal.g0.p(onZero, "onZero");
            kotlin.jvm.internal.g0.p(format, "format");
            b.super.M(onZero, format);
        }

        @Deprecated
        @m80.k
        public static <Target, ActualSelf extends b<Target, ActualSelf>> u40.f<Target> c(@m80.k b<Target, ActualSelf> bVar) {
            return b.super.build();
        }

        @Deprecated
        public static <Target, ActualSelf extends b<Target, ActualSelf>> void d(@m80.k b<Target, ActualSelf> bVar, @m80.k String value) {
            kotlin.jvm.internal.g0.p(value, "value");
            b.super.i(value);
        }
    }

    @m80.k
    ActualSelf G0();

    default void M(@m80.k String onZero, @m80.k x00.l<? super ActualSelf, yz.g2> format) {
        kotlin.jvm.internal.g0.p(onZero, "onZero");
        kotlin.jvm.internal.g0.p(format, "format");
        u40.d<Target> p02 = p0();
        ActualSelf G0 = G0();
        format.invoke(G0);
        yz.g2 g2Var = yz.g2.f100423a;
        p02.a(new OptionalFormatStructure(onZero, G0.p0().b()));
    }

    @m80.k
    default u40.f<Target> build() {
        return new u40.f<>(p0().b().c());
    }

    @Override // s40.g0
    default void i(@m80.k String value) {
        kotlin.jvm.internal.g0.p(value, "value");
        p0().a(new u40.j(value));
    }

    @m80.k
    u40.d<Target> p0();

    default void s0(@m80.k x00.l<? super ActualSelf, yz.g2>[] otherFormats, @m80.k x00.l<? super ActualSelf, yz.g2> mainFormat) {
        kotlin.jvm.internal.g0.p(otherFormats, "otherFormats");
        kotlin.jvm.internal.g0.p(mainFormat, "mainFormat");
        ArrayList arrayList = new ArrayList(otherFormats.length);
        for (x00.l<? super ActualSelf, yz.g2> lVar : otherFormats) {
            ActualSelf G0 = G0();
            lVar.invoke(G0);
            arrayList.add(G0.p0().b());
        }
        ActualSelf G02 = G0();
        mainFormat.invoke(G02);
        p0().a(new u40.c(G02.p0().b(), arrayList));
    }
}
