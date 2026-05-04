package rw;

import az.c;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nDataConversion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DataConversion.kt\nio/ktor/client/plugins/DataConversion\n+ 2 Attributes.kt\nio/ktor/util/AttributesKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,26:1\n18#2:27\n58#3,16:28\n*S KotlinDebug\n*F\n+ 1 DataConversion.kt\nio/ktor/client/plugins/DataConversion\n*L\n15#1:27\n15#1:28,16\n*E\n"})
/* loaded from: classes8.dex */
public final class e implements y<c.a, az.c> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final e f84620a = new e();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final xy.a<az.c> f84621b;

    static {
        h10.r rVar;
        h10.d d11 = kotlin.jvm.internal.o0.d(az.c.class);
        try {
            rVar = kotlin.jvm.internal.o0.B(az.c.class);
        } catch (Throwable unused) {
            rVar = null;
        }
        f84621b = new xy.a<>("DataConversion", new gz.a(d11, rVar));
    }

    @Override // rw.y
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(@m80.k az.c plugin, @m80.k lw.c scope) {
        kotlin.jvm.internal.g0.p(plugin, "plugin");
        kotlin.jvm.internal.g0.p(scope, "scope");
    }

    @Override // rw.y
    @m80.k
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public az.c a(@m80.k x00.l<? super c.a, g2> block) {
        kotlin.jvm.internal.g0.p(block, "block");
        c.a aVar = new c.a();
        block.invoke(aVar);
        return new az.c(aVar);
    }

    @Override // rw.y
    @m80.k
    public xy.a<az.c> getKey() {
        return f84621b;
    }
}
