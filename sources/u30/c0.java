package u30;

import kotlin.DeprecationLevel;
import kotlin.NotImplementedError;
import yz.g2;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public class c0 extends b0 {
    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder A0(StringBuilder sb2, boolean z11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(z11);
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder B0(StringBuilder sb2, char[] value) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        sb2.append(value);
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.1")
    @o00.f
    public static final String C0(int i11, x00.l<? super StringBuilder, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        StringBuilder sb2 = new StringBuilder(i11);
        builderAction.invoke(sb2);
        return sb2.toString();
    }

    @o00.f
    public static final String D0(x00.l<? super StringBuilder, g2> builderAction) {
        kotlin.jvm.internal.g0.p(builderAction, "builderAction");
        StringBuilder sb2 = new StringBuilder();
        builderAction.invoke(sb2);
        return sb2.toString();
    }

    @yz.n(level = DeprecationLevel.WARNING, message = "Use append(value: Any?) instead", replaceWith = @yz.w0(expression = "append(value = obj)", imports = {}))
    @o00.f
    public static final StringBuilder r0(StringBuilder sb2, Object obj) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(obj);
        return sb2;
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "Use appendRange instead.", replaceWith = @yz.w0(expression = "this.appendRange(str, offset, offset + len)", imports = {}))
    @o00.f
    public static final StringBuilder s0(StringBuilder sb2, char[] str, int i11, int i12) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(str, "str");
        throw new NotImplementedError(null, 1, null);
    }

    @m80.k
    public static final StringBuilder t0(@m80.k StringBuilder sb2, @m80.k Object... value) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        for (Object obj : value) {
            sb2.append(obj);
        }
        return sb2;
    }

    @m80.k
    public static StringBuilder u0(@m80.k StringBuilder sb2, @m80.k String... value) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        for (String str : value) {
            sb2.append(str);
        }
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder v0(StringBuilder sb2) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder w0(StringBuilder sb2, char c11) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(c11);
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder x0(StringBuilder sb2, CharSequence charSequence) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(charSequence);
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder y0(StringBuilder sb2, Object obj) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(obj);
        sb2.append('\n');
        return sb2;
    }

    @y0(version = "1.4")
    @o00.f
    public static final StringBuilder z0(StringBuilder sb2, String str) {
        kotlin.jvm.internal.g0.p(sb2, "<this>");
        sb2.append(str);
        sb2.append('\n');
        return sb2;
    }
}
