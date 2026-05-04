package t7;

import k3.l4;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import z8.j2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConvert.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Convert.kt\ncom/baicizhan/app/biz/wordlist/ConvertKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,28:1\n1#2:29\n*E\n"})
/* loaded from: classes3.dex */
public final class a {
    @m80.k
    public static final l4 a(@m80.k k record, @m80.k j2 state, boolean z11, @m80.k o7.c cdn) {
        g0.p(record, "record");
        g0.p(state, "state");
        g0.p(cdn, "cdn");
        int k11 = (int) record.k();
        String l11 = record.l();
        String j11 = record.j();
        String a11 = cdn.a(record.h());
        int i11 = state.f101672b;
        int i12 = (int) (state.f101673c / 1000);
        boolean z12 = state.f101674d;
        Integer valueOf = Integer.valueOf(state.f101675e);
        if (valueOf.intValue() == 0) {
            valueOf = null;
        }
        return new l4(k11, l11, j11, a11, i11, i12, z12, valueOf != null ? w3.g.k(w3.g.c(valueOf.intValue())) : 0, z11, state.f101676f);
    }
}
