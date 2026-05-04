package s40;

import kotlinx.datetime.DateTimeFormatException;
import kotlinx.datetime.internal.format.parser.ParseException;
import w40.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDateTimeFormat.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DateTimeFormat.kt\nkotlinx/datetime/format/AbstractDateTimeFormat\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,172:1\n1#2:173\n*E\n"})
/* loaded from: classes8.dex */
public abstract class a<T, U extends w40.c<U>> implements e0<T> {
    public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
        this();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s40.e0
    @m80.l
    public T a(@m80.k CharSequence input) {
        kotlin.jvm.internal.g0.p(input, "input");
        w40.c i11 = w40.n.i(w40.n.b(e().b()), input, f(), 0, 4, null);
        if (i11 != null) {
            return (T) i(i11);
        }
        return null;
    }

    @Override // s40.e0
    @m80.k
    public <A extends Appendable> A b(@m80.k A appendable, T t11) {
        kotlin.jvm.internal.g0.p(appendable, "appendable");
        v40.e.a(e().a(), g(t11), appendable, false, 4, null);
        return appendable;
    }

    @Override // s40.e0
    @m80.k
    public String c(T t11) {
        StringBuilder sb2 = new StringBuilder();
        v40.e.a(e().a(), g(t11), sb2, false, 4, null);
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // s40.e0
    public T d(@m80.k CharSequence input) {
        CharSequence charSequence;
        String str;
        kotlin.jvm.internal.g0.p(input, "input");
        try {
            charSequence = input;
        } catch (ParseException e11) {
            e = e11;
            charSequence = input;
        }
        try {
            try {
                return (T) h(w40.n.g(w40.n.b(e().b()), charSequence, f(), 0, 4, null));
            } catch (IllegalArgumentException e12) {
                String message = e12.getMessage();
                if (message == null) {
                    str = "The value parsed from '" + ((Object) charSequence) + "' is invalid";
                } else {
                    str = message + " (when parsing '" + ((Object) charSequence) + "')";
                }
                throw new DateTimeFormatException(str, e12);
            }
        } catch (ParseException e13) {
            e = e13;
            throw new DateTimeFormatException("Failed to parse value from '" + ((Object) charSequence) + '\'', e);
        }
    }

    @m80.k
    public abstract u40.f<U> e();

    @m80.k
    public abstract U f();

    @m80.k
    public abstract U g(T t11);

    public abstract T h(@m80.k U u11);

    @m80.l
    public T i(@m80.k U intermediate) {
        kotlin.jvm.internal.g0.p(intermediate, "intermediate");
        try {
            return h(intermediate);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public a() {
    }
}
