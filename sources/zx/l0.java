package zx;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nPipelineCall.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PipelineCall.kt\nio/ktor/server/application/PipelineCallKt\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,128:1\n18#2:129\n58#3,16:130\n*S KotlinDebug\n*F\n+ 1 PipelineCall.kt\nio/ktor/server/application/PipelineCallKt\n*L\n19#1:129\n19#1:130,16\n*E\n"})
/* loaded from: classes8.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<gz.a> f103056a;

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(gz.a.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(gz.a.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f103056a = new xy.a<>("ReceiveType", new gz.a(d11, rVar));
    }

    @m80.k
    public static final <C extends b> C a(@m80.k io.ktor.util.pipeline.d<?, C> dVar) {
        kotlin.jvm.internal.g0.p(dVar, "<this>");
        return dVar.d();
    }

    @m80.k
    public static final gz.a b(@m80.k b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return (gz.a) bVar.getAttributes().g(f103056a);
    }

    public static final boolean c(@m80.k b bVar) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        return bVar.k().d();
    }

    public static final void d(@m80.k b bVar, @m80.k gz.a value) {
        kotlin.jvm.internal.g0.p(bVar, "<this>");
        kotlin.jvm.internal.g0.p(value, "value");
        bVar.getAttributes().e(f103056a, value);
    }
}
