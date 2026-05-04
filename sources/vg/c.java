package vg;

import k50.a0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAnchor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Anchor.kt\ncom/baicizhan/main/home/player/data/animation2/AnchorKt\n+ 2 Json.kt\nkotlinx/serialization/json/Json\n*L\n1#1,88:1\n222#2:89\n*S KotlinDebug\n*F\n+ 1 Anchor.kt\ncom/baicizhan/main/home/player/data/animation2/AnchorKt\n*L\n87#1:89\n*E\n"})
/* loaded from: classes4.dex */
public final class c {
    @m80.k
    public static final d b(@m80.k String jsonString) {
        g0.p(jsonString, "jsonString");
        k50.a b11 = a0.b(null, new x00.l() { // from class: vg.b
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 c11;
                c11 = c.c((k50.e) obj);
                return c11;
            }
        }, 1, null);
        b11.getSerializersModule();
        return (d) b11.c(d.Companion.serializer(), jsonString);
    }

    public static final g2 c(k50.e Json) {
        g0.p(Json, "$this$Json");
        Json.J(true);
        return g2.f100423a;
    }
}
