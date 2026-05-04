package e30;

import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class c1 extends k2 implements i30.h, i30.j {
    public c1() {
        super(null);
    }

    @m80.k
    public abstract c1 P0(boolean z11);

    @m80.k
    public abstract c1 Q0(@m80.k r1 r1Var);

    @m80.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        Iterator<q10.c> it = getAnnotations().iterator();
        while (it.hasNext()) {
            u30.c0.u0(sb2, "[", p20.m.S(p20.m.f78750k, it.next(), null, 2, null), "] ");
        }
        sb2.append(I0());
        if (!G0().isEmpty()) {
            a00.r0.p3(G0(), sb2, org.junit.jupiter.api.j2.O, "<", ">", 0, null, null, 112, null);
        }
        if (J0()) {
            sb2.append("?");
        }
        String sb3 = sb2.toString();
        kotlin.jvm.internal.g0.o(sb3, "toString(...)");
        return sb3;
    }
}
