package w40;

import a00.h0;
import com.xiaomi.mipush.sdk.Constants;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParserOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/ParserOperationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,557:1\n1#2:558\n*E\n"})
/* loaded from: classes8.dex */
public final class s {
    @m80.k
    public static final <Output> t<Output> b(int i11, int i12, @m80.k a<? super Output, Integer> setter, @m80.k String name) {
        g0.p(setter, "setter");
        g0.p(name, "name");
        return new t<>(h0.J(), h0.Q(new t(a00.g0.l(new k(a00.g0.l(new x(i11, setter, name, i12)))), h0.J()), new t(h0.Q(new w("+"), new k(a00.g0.l(new f0(null, null, setter, name, false)))), h0.J()), new t(h0.Q(new w(Constants.ACCEPT_TIME_SEPARATOR_SERVER), new k(a00.g0.l(new f0(null, null, setter, name, true)))), h0.J())));
    }

    @m80.k
    public static final <Output> t<Output> c(@m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.k a<? super Output, Integer> setter, @m80.k String name, @m80.l Integer num4) {
        g0.p(setter, "setter");
        g0.p(name, "name");
        List U = h0.U(g(num, num2, num3, setter, name, true));
        if (num4 != null) {
            U.add(h(num, num4, num3, setter, name, false, 32, null));
            U.add(new t(h0.Q(new w("+"), new k(a00.g0.l(new f0(Integer.valueOf(num4.intValue() + 1), num2, setter, name, false)))), h0.J()));
        } else {
            U.add(h(num, num2, num3, setter, name, false, 32, null));
        }
        return new t<>(h0.J(), U);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <Object, Type> Object e(final a<? super Object, Type> aVar, Object object, final Type type, int i11, int i12) {
        final Type d11 = aVar.d(object, type);
        return d11 == null ? m.f95273b.b(i12) : m.f95273b.a(i11, new x00.a() { // from class: w40.r
            @Override // x00.a
            public final Object invoke() {
                String f11;
                f11 = s.f(d11, type, aVar);
                return f11;
            }
        });
    }

    public static final String f(Object obj, Object obj2, a aVar) {
        return "Attempting to assign conflicting values '" + obj + "' and '" + obj2 + "' to field '" + aVar.getName() + '\'';
    }

    @m80.k
    public static final <Target> t<Target> g(@m80.l Integer num, @m80.l Integer num2, @m80.l Integer num3, @m80.k a<? super Target, Integer> setter, @m80.k String name, boolean z11) {
        int i11;
        g0.p(setter, "setter");
        g0.p(name, "name");
        int intValue = (num != null ? num.intValue() : 1) + (z11 ? 1 : 0);
        if (num2 != null) {
            i11 = num2.intValue();
            if (z11) {
                i11++;
            }
        } else {
            i11 = Integer.MAX_VALUE;
        }
        int intValue2 = num3 != null ? num3.intValue() : 0;
        int min = Math.min(i11, intValue2);
        if (intValue >= min) {
            return i(z11, setter, name, intValue, i11);
        }
        t<Target> i12 = i(z11, setter, name, intValue, intValue);
        while (intValue < min) {
            intValue++;
            i12 = new t<>(h0.J(), h0.Q(i(z11, setter, name, intValue, intValue), p.c(h0.Q(new t(a00.g0.l(new w(" ")), h0.J()), i12))));
        }
        return intValue2 > i11 ? p.c(h0.Q(new t(a00.g0.l(new w(u30.f0.v2(" ", intValue2 - i11))), h0.J()), i12)) : intValue2 == i11 ? i12 : new t<>(h0.J(), h0.Q(i(z11, setter, name, intValue2 + 1, i11), i12));
    }

    public static /* synthetic */ t h(Integer num, Integer num2, Integer num3, a aVar, String str, boolean z11, int i11, Object obj) {
        if ((i11 & 32) != 0) {
            z11 = false;
        }
        return g(num, num2, num3, aVar, str, z11);
    }

    public static final <Target> t<Target> i(boolean z11, a<? super Target, Integer> aVar, String str, int i11, int i12) {
        if (i12 < (z11 ? 1 : 0) + 1) {
            throw new IllegalStateException("Check failed.");
        }
        List j11 = a00.g0.j();
        if (z11) {
            j11.add(new w(Constants.ACCEPT_TIME_SEPARATOR_SERVER));
        }
        j11.add(new k(a00.g0.l(new f0(Integer.valueOf(i11 - (z11 ? 1 : 0)), Integer.valueOf(i12 - (z11 ? 1 : 0)), aVar, str, z11))));
        return new t<>(a00.g0.b(j11), h0.J());
    }
}
