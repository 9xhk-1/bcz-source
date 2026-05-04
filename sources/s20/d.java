package s20;

import e30.c1;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class d extends r<Byte> {
    public d(byte b11) {
        super(Byte.valueOf(b11));
    }

    @Override // s20.g
    @m80.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public c1 a(@m80.k p10.a0 module) {
        g0.p(module, "module");
        c1 t11 = module.q().t();
        g0.o(t11, "getByteType(...)");
        return t11;
    }

    @Override // s20.g
    @m80.k
    public String toString() {
        return b().intValue() + ".toByte()";
    }
}
