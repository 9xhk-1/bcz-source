package u30;

import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nStringBuilderJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringBuilderJVM.kt\nkotlin/text/StringsKt__StringBuilderJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,417:1\n1#2:418\n*E\n"})
/* loaded from: classes8.dex */
public class b0 extends a0 {
    @y0(version = "1.9")
    @o00.f
    public static final StringBuilder C(StringBuilder sb2, byte b11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append((int) b11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return sb2;
    }

    @y0(version = "1.9")
    @o00.f
    public static final StringBuilder D(StringBuilder sb2, short s11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append((int) s11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder E(StringBuilder sb2, byte b11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append((int) b11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder F(StringBuilder sb2, double d11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(d11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder G(StringBuilder sb2, float f11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(f11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder H(StringBuilder sb2, int i11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(i11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder I(StringBuilder sb2, long j11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(j11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder J(StringBuilder sb2, StringBuffer stringBuffer) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(stringBuffer);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder K(StringBuilder sb2, StringBuilder sb3) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder L(StringBuilder sb2, short s11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append((int) s11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder M(StringBuilder sb2, CharSequence value, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        sb2.append(value, i11, i12);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder N(StringBuilder sb2, char[] value, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        sb2.append(value, i11, i12 - i11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return sb2;
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine()", imports = {}))
    @m80.k
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final Appendable O(@m80.k Appendable appendable) {
        kotlin.jvm.internal.g0.p(appendable, "<this>");
        Appendable append = appendable.append(s0.f91704b);
        kotlin.jvm.internal.g0.o(append, "append(...)");
        return append;
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final Appendable P(Appendable appendable, char c11) {
        kotlin.jvm.internal.g0.p(appendable, "<this>");
        Appendable append = appendable.append(c11);
        kotlin.jvm.internal.g0.o(append, "append(...)");
        return O(append);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final Appendable Q(Appendable appendable, CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(appendable, "<this>");
        Appendable append = appendable.append(charSequence);
        kotlin.jvm.internal.g0.o(append, "append(...)");
        return O(append);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine()", imports = {}))
    @m80.k
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder R(@m80.k StringBuilder sb2) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(s0.f91704b);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return sb2;
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder S(StringBuilder sb2, byte b11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append((int) b11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder T(StringBuilder sb2, char c11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(c11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder U(StringBuilder sb2, double d11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(d11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder V(StringBuilder sb2, float f11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(f11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder W(StringBuilder sb2, int i11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(i11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder X(StringBuilder sb2, long j11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(j11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder Y(StringBuilder sb2, CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(charSequence);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder Z(StringBuilder sb2, Object obj) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(obj);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder a0(StringBuilder sb2, String str) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(str);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder b0(StringBuilder sb2, StringBuffer stringBuffer) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(stringBuffer);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder c0(StringBuilder sb2, StringBuilder sb3) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append((CharSequence) sb3);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder d0(StringBuilder sb2, short s11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append((int) s11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder e0(StringBuilder sb2, boolean z11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(z11);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @yz.n(message = "Use appendLine instead. Note that the new method always appends the line feed character '\\n' regardless of the system line separator.", replaceWith = @yz.w0(expression = "appendLine(value)", imports = {}))
    @o00.f
    @yz.o(errorSince = "2.1", warningSince = "1.4")
    public static final StringBuilder f0(StringBuilder sb2, char[] value) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        sb2.append(value);
        kotlin.jvm.internal.g0.o(sb2, "append(...)");
        return R(sb2);
    }

    @y0(version = "1.3")
    @m80.k
    public static StringBuilder g0(@m80.k StringBuilder sb2) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.setLength(0);
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder h0(StringBuilder sb2, int i11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        StringBuilder deleteCharAt = sb2.deleteCharAt(i11);
        kotlin.jvm.internal.g0.o(deleteCharAt, "deleteCharAt(...)");
        return deleteCharAt;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder i0(StringBuilder sb2, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        StringBuilder delete = sb2.delete(i11, i12);
        kotlin.jvm.internal.g0.o(delete, "delete(...)");
        return delete;
    }

    @y0(version = "1.9")
    @o00.f
    public static final StringBuilder j0(StringBuilder sb2, int i11, byte b11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        StringBuilder insert = sb2.insert(i11, (int) b11);
        kotlin.jvm.internal.g0.o(insert, "insert(...)");
        return insert;
    }

    @y0(version = "1.9")
    @o00.f
    public static final StringBuilder k0(StringBuilder sb2, int i11, short s11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        StringBuilder insert = sb2.insert(i11, (int) s11);
        kotlin.jvm.internal.g0.o(insert, "insert(...)");
        return insert;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder l0(StringBuilder sb2, int i11, CharSequence value, int i12, int i13) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        StringBuilder insert = sb2.insert(i11, value, i12, i13);
        kotlin.jvm.internal.g0.o(insert, "insert(...)");
        return insert;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder m0(StringBuilder sb2, int i11, char[] value, int i12, int i13) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        StringBuilder insert = sb2.insert(i11, value, i12, i13 - i12);
        kotlin.jvm.internal.g0.o(insert, "insert(...)");
        return insert;
    }

    @o00.f
    public static final void n0(StringBuilder sb2, int i11, char c11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.setCharAt(i11, c11);
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder o0(StringBuilder sb2, int i11, int i12, String value) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        StringBuilder replace = sb2.replace(i11, i12, value);
        kotlin.jvm.internal.g0.o(replace, "replace(...)");
        return replace;
    }

    @y0(version = "1.4")
    @o00.f
    public static final void p0(StringBuilder sb2, char[] destination, int i11, int i12, int i13) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        sb2.getChars(i12, i13, destination, i11);
    }

    public static /* synthetic */ void q0(StringBuilder sb2, char[] destination, int i11, int i12, int i13, int i14, Object obj) {
        if ((i14 & 2) != 0) {
            i11 = 0;
        }
        if ((i14 & 4) != 0) {
            i12 = 0;
        }
        if ((i14 & 8) != 0) {
            i13 = sb2.length();
        }
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(destination, "destination");
        sb2.getChars(i12, i13, destination, i11);
    }
}
