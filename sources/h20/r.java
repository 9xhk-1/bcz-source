package h20;

import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;
import kotlin.reflect.jvm.internal.impl.metadata.jvm.JvmProtoBuf;
import kotlin.reflect.jvm.internal.impl.protobuf.GeneratedMessageLite;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import p10.y0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJvmPackagePartSource.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JvmPackagePartSource.kt\norg/jetbrains/kotlin/load/kotlin/JvmPackagePartSource\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,67:1\n1#2:68\n*E\n"})
/* loaded from: classes8.dex */
public final class r implements c30.s {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final v20.d f58135b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final v20.d f58136c;

    /* renamed from: d, reason: collision with root package name */
    @m80.l
    public final a30.x<m20.e> f58137d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f58138e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final DeserializedContainerAbiStability f58139f;

    /* renamed from: g, reason: collision with root package name */
    @m80.l
    public final x f58140g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final String f58141h;

    public r(@m80.k v20.d className, @m80.l v20.d dVar, @m80.k ProtoBuf.Package packageProto, @m80.k k20.c nameResolver, @m80.l a30.x<m20.e> xVar, boolean z11, @m80.k DeserializedContainerAbiStability abiStability, @m80.l x xVar2) {
        String string;
        kotlin.jvm.internal.g0.p(className, "className");
        kotlin.jvm.internal.g0.p(packageProto, "packageProto");
        kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
        kotlin.jvm.internal.g0.p(abiStability, "abiStability");
        this.f58135b = className;
        this.f58136c = dVar;
        this.f58137d = xVar;
        this.f58138e = z11;
        this.f58139f = abiStability;
        this.f58140g = xVar2;
        GeneratedMessageLite.f<ProtoBuf.Package, Integer> packageModuleName = JvmProtoBuf.f67483m;
        kotlin.jvm.internal.g0.o(packageModuleName, "packageModuleName");
        Integer num = (Integer) k20.e.a(packageProto, packageModuleName);
        this.f58141h = (num == null || (string = nameResolver.getString(num.intValue())) == null) ? "main" : string;
    }

    @Override // c30.s
    @m80.k
    public String a() {
        return "Class '" + d().a().b() + '\'';
    }

    @Override // p10.x0
    @m80.k
    public y0 b() {
        y0 NO_SOURCE_FILE = y0.f78623a;
        kotlin.jvm.internal.g0.o(NO_SOURCE_FILE, "NO_SOURCE_FILE");
        return NO_SOURCE_FILE;
    }

    @m80.k
    public final n20.b d() {
        n20.c g11 = e().g();
        kotlin.jvm.internal.g0.o(g11, "getPackageFqName(...)");
        return new n20.b(g11, h());
    }

    @m80.k
    public v20.d e() {
        return this.f58135b;
    }

    @m80.l
    public v20.d f() {
        return this.f58136c;
    }

    @m80.l
    public final x g() {
        return this.f58140g;
    }

    @m80.k
    public final n20.f h() {
        String f11 = e().f();
        kotlin.jvm.internal.g0.o(f11, "getInternalName(...)");
        n20.f f12 = n20.f.f(k0.P5(f11, '/', null, 2, null));
        kotlin.jvm.internal.g0.o(f12, "identifier(...)");
        return f12;
    }

    @m80.k
    public String toString() {
        return r.class.getSimpleName() + ": " + e();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public r(@m80.k h20.x r11, @m80.k kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf.Package r12, @m80.k k20.c r13, @m80.l a30.x<m20.e> r14, boolean r15, @m80.k kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability r16) {
        /*
            r10 = this;
            java.lang.String r0 = "kotlinClass"
            kotlin.jvm.internal.g0.p(r11, r0)
            java.lang.String r0 = "packageProto"
            kotlin.jvm.internal.g0.p(r12, r0)
            java.lang.String r0 = "nameResolver"
            kotlin.jvm.internal.g0.p(r13, r0)
            java.lang.String r0 = "abiStability"
            r8 = r16
            kotlin.jvm.internal.g0.p(r8, r0)
            n20.b r0 = r11.a()
            v20.d r2 = v20.d.b(r0)
            java.lang.String r0 = "byClassId(...)"
            kotlin.jvm.internal.g0.o(r2, r0)
            kotlin.reflect.jvm.internal.impl.load.kotlin.header.KotlinClassHeader r0 = r11.b()
            java.lang.String r0 = r0.e()
            r1 = 0
            if (r0 == 0) goto L38
            int r3 = r0.length()
            if (r3 <= 0) goto L38
            v20.d r1 = v20.d.d(r0)
        L38:
            r9 = r11
            r4 = r12
            r5 = r13
            r6 = r14
            r7 = r15
            r3 = r1
            r1 = r10
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h20.r.<init>(h20.x, kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf$Package, k20.c, a30.x, boolean, kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability):void");
    }
}
