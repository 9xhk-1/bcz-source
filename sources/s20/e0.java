package s20;

import e30.c1;
import e30.r0;
import kotlin.jvm.internal.g0;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import n10.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class e0 extends f0<Short> {
    public e0(short s11) {
        super(Short.valueOf(s11));
    }

    @Override // s20.g
    @m80.k
    public r0 a(@m80.k p10.a0 module) {
        c1 s11;
        g0.p(module, "module");
        p10.b b11 = p10.t.b(module, o.a.E0);
        return (b11 == null || (s11 = b11.s()) == null) ? g30.i.d(ErrorTypeKind.NOT_FOUND_UNSIGNED_TYPE, "UShort") : s11;
    }

    @Override // s20.g
    @m80.k
    public String toString() {
        return b().intValue() + ".toUShort()";
    }
}
