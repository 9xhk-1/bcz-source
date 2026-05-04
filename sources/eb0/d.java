package eb0;

import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nKoinConfiguration.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KoinConfiguration.kt\norg/koin/dsl/KoinConfigurationKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,80:1\n13472#2,2:81\n13472#2,2:83\n*S KotlinDebug\n*F\n+ 1 KoinConfiguration.kt\norg/koin/dsl/KoinConfigurationKt\n*L\n67#1:81,2\n78#1:83,2\n*E\n"})
/* loaded from: classes9.dex */
public final class d {
    @k
    public static final na0.b a(@k na0.b bVar, @k c... configurations) {
        l<na0.b, g2> b11;
        g0.p(bVar, "<this>");
        g0.p(configurations, "configurations");
        for (c cVar : configurations) {
            if (cVar != null && (b11 = cVar.b()) != null) {
                b11.invoke(bVar);
            }
        }
        return bVar;
    }

    @k
    public static final na0.b b(@k na0.b bVar, @k l<? super na0.b, g2>... configurations) {
        g0.p(bVar, "<this>");
        g0.p(configurations, "configurations");
        for (l<? super na0.b, g2> lVar : configurations) {
            if (lVar != null) {
                lVar.invoke(bVar);
            }
        }
        return bVar;
    }

    @va0.a
    @k
    public static final c c(@k l<? super na0.b, g2> declaration) {
        g0.p(declaration, "declaration");
        return new c(declaration);
    }
}
