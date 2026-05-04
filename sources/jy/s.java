package jy;

import ix.z1;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nOriginConnectionPoint.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OriginConnectionPoint.kt\nio/ktor/server/plugins/OriginConnectionPointKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,134:1\n18#2:135\n58#3,16:136\n*S KotlinDebug\n*F\n+ 1 OriginConnectionPoint.kt\nio/ktor/server/plugins/OriginConnectionPointKt\n*L\n26#1:135\n26#1:136,16\n*E\n"})
/* loaded from: classes8.dex */
public final class s {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<p> f64751a;

    static {
        h10.r rVar;
        h10.d d11 = o0.d(p.class);
        try {
            rVar = o0.B(p.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f64751a = new xy.a<>("MutableOriginConnectionPointKey", new gz.a(d11, rVar));
    }

    public static final p b(zx.b bVar) {
        return new p(new q(bVar));
    }

    @m80.k
    public static final p c(@m80.k final zx.b bVar) {
        g0.p(bVar, "<this>");
        return (p) bVar.getAttributes().i(f64751a, new x00.a() { // from class: jy.r
            @Override // x00.a
            public final Object invoke() {
                p b11;
                b11 = s.b(zx.b.this);
                return b11;
            }
        });
    }

    @m80.k
    public static final xy.a<p> d() {
        return f64751a;
    }

    @m80.k
    public static final z1 f(@m80.k py.d dVar) {
        g0.p(dVar, "<this>");
        p pVar = (p) dVar.c().getAttributes().a(f64751a);
        return pVar != null ? pVar : dVar.h();
    }

    @yz.n(message = "This API will be redesigned as per https://youtrack.jetbrains.com/issue/KTOR-2657")
    public static /* synthetic */ void e() {
    }
}
