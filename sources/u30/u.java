package u30;

import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class u {
    @m80.k
    public static <T extends Appendable> T a(@m80.k T t11, @m80.k CharSequence... value) {
        kotlin.jvm.internal.g0.p(t11, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        for (CharSequence charSequence : value) {
            t11.append(charSequence);
        }
        return t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> void b(@m80.k Appendable appendable, T t11, @m80.l x00.l<? super T, ? extends CharSequence> lVar) {
        kotlin.jvm.internal.g0.p(appendable, "<this>");
        if (lVar != null) {
            appendable.append(lVar.invoke(t11));
            return;
        }
        if (t11 == 0 ? true : t11 instanceof CharSequence) {
            appendable.append((CharSequence) t11);
        } else if (t11 instanceof Character) {
            appendable.append(((Character) t11).charValue());
        } else {
            appendable.append(t11.toString());
        }
    }

    @y0(version = "1.4")
    @o00.f
    public static final Appendable c(Appendable appendable) {
        kotlin.jvm.internal.g0.p(appendable, "<this>");
        return appendable.append('\n');
    }

    @y0(version = "1.4")
    @o00.f
    public static final Appendable d(Appendable appendable, char c11) {
        kotlin.jvm.internal.g0.p(appendable, "<this>");
        return appendable.append(c11).append('\n');
    }

    @y0(version = "1.4")
    @o00.f
    public static final Appendable e(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(appendable, "<this>");
        return appendable.append(charSequence).append('\n');
    }

    @y0(version = "1.4")
    @m80.k
    public static final <T extends Appendable> T f(@m80.k T t11, @m80.k CharSequence value, int i11, int i12) {
        kotlin.jvm.internal.g0.p(t11, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        T t12 = (T) t11.append(value, i11, i12);
        kotlin.jvm.internal.g0.n(t12, "null cannot be cast to non-null type T of kotlin.text.StringsKt__AppendableKt.appendRange");
        return t12;
    }
}
