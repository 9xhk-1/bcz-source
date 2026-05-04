package s20;

import e30.c1;
import java.util.Arrays;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e extends r<Character> {
    public e(char c11) {
        super(Character.valueOf(c11));
    }

    public final String c(char c11) {
        switch (c11) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                return e(c11) ? String.valueOf(c11) : "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    @Override // s20.g
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public c1 a(@m80.k p10.a0 module) {
        g0.p(module, "module");
        c1 u11 = module.q().u();
        g0.o(u11, "getCharType(...)");
        return u11;
    }

    public final boolean e(char c11) {
        byte type = (byte) Character.getType(c11);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // s20.g
    @m80.k
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(b().charValue()), c(b().charValue())}, 2));
        g0.o(format, "format(...)");
        return format;
    }
}
