package b7;

import k3.a0;
import k3.f;
import k3.n3;
import kotlin.jvm.internal.g0;
import m80.k;
import q8.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class a {
    @k
    public static final f a(@k q8.b bVar) {
        g0.p(bVar, "<this>");
        q8.c cVar = bVar.f81845a;
        g0.m(cVar);
        a0 b11 = b(cVar);
        q8.c cVar2 = bVar.f81846b;
        a0 b12 = cVar2 != null ? b(cVar2) : null;
        q8.c cVar3 = bVar.f81847c;
        return new f(b11, b12, cVar3 != null ? b(cVar3) : null);
    }

    @k
    public static final a0 b(@k q8.c cVar) {
        g0.p(cVar, "<this>");
        return new a0(cVar.f81855a, cVar.f81856b, cVar.f81857c, cVar.f81858d);
    }

    @k
    public static final n3 c(@k q8.f fVar) {
        g0.p(fVar, "<this>");
        int i11 = fVar.f81879a;
        String str = fVar.f81880b;
        String str2 = fVar.f81881c;
        a0 b11 = b(fVar.f81882d);
        a0 b12 = b(fVar.f81883e);
        q8.c cVar = fVar.f81884f;
        return new n3(i11, str, str2, b11, b12, cVar != null ? b(cVar) : null, fVar.f81885g, fVar.f81886h);
    }

    @k
    public static final g d(@k k3.g gVar) {
        g0.p(gVar, "<this>");
        return new g(gVar.p(), gVar.r(), gVar.q(), gVar.s(), gVar.m(), gVar.o(), gVar.n(), gVar.t(), gVar.l());
    }
}
