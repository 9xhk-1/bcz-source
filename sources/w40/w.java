package w40;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nParserOperation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ParserOperation.kt\nkotlinx/datetime/internal/format/parser/PlainStringParserOperation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,557:1\n1#2:558\n*E\n"})
/* loaded from: classes8.dex */
public final class w<Output> implements q<Output> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f95290a;

    public w(@m80.k String string) {
        g0.p(string, "string");
        this.f95290a = string;
        if (string.length() <= 0) {
            throw new IllegalArgumentException("Empty string is not allowed");
        }
        if (t40.h.b(string.charAt(0))) {
            throw new IllegalArgumentException(("String '" + string + "' starts with a digit").toString());
        }
        if (t40.h.b(string.charAt(string.length() - 1))) {
            throw new IllegalArgumentException(("String '" + string + "' ends with a digit").toString());
        }
    }

    public static final String d(w wVar) {
        return "Unexpected end of input: yet to parse '" + wVar.f95290a + '\'';
    }

    public static final String e(w wVar, CharSequence charSequence, int i11, int i12) {
        return "Expected " + wVar.f95290a + " but got " + charSequence.subSequence(i11, i12 + i11 + 1).toString();
    }

    @Override // w40.q
    @m80.k
    public Object a(Output output, @m80.k final CharSequence input, final int i11) {
        g0.p(input, "input");
        if (this.f95290a.length() + i11 > input.length()) {
            return m.f95273b.a(i11, new x00.a() { // from class: w40.u
                @Override // x00.a
                public final Object invoke() {
                    String d11;
                    d11 = w.d(w.this);
                    return d11;
                }
            });
        }
        int length = this.f95290a.length();
        for (final int i12 = 0; i12 < length; i12++) {
            if (input.charAt(i11 + i12) != this.f95290a.charAt(i12)) {
                return m.f95273b.a(i11, new x00.a() { // from class: w40.v
                    @Override // x00.a
                    public final Object invoke() {
                        String e11;
                        e11 = w.e(w.this, input, i11, i12);
                        return e11;
                    }
                });
            }
        }
        return m.f95273b.b(i11 + this.f95290a.length());
    }

    @m80.k
    public final String f() {
        return this.f95290a;
    }

    @m80.k
    public String toString() {
        return '\'' + this.f95290a + '\'';
    }
}
