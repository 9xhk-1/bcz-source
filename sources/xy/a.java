package xy;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nAttributes.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributeKey\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,114:1\n1#2:115\n58#3,16:116\n*S KotlinDebug\n*F\n+ 1 Attributes.kt\nio/ktor/util/AttributeKey\n*L\n28#1:116,16\n*E\n"})
/* loaded from: classes8.dex */
public final class a<T> {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final String f98485a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final gz.a f98486b;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @w00.k
    public a(@m80.k String name) {
        this(name, null, 2, 0 == true ? 1 : 0);
        kotlin.jvm.internal.g0.p(name, "name");
    }

    public static /* synthetic */ a d(a aVar, String str, gz.a aVar2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = aVar.f98485a;
        }
        if ((i11 & 2) != 0) {
            aVar2 = aVar.f98486b;
        }
        return aVar.c(str, aVar2);
    }

    @m80.k
    public final String a() {
        return this.f98485a;
    }

    public final gz.a b() {
        return this.f98486b;
    }

    @m80.k
    public final a<T> c(@m80.k String name, @m80.k gz.a type) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(type, "type");
        return new a<>(name, type);
    }

    @m80.k
    public final String e() {
        return this.f98485a;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return kotlin.jvm.internal.g0.g(this.f98485a, aVar.f98485a) && kotlin.jvm.internal.g0.g(this.f98486b, aVar.f98486b);
    }

    public int hashCode() {
        return (this.f98485a.hashCode() * 31) + this.f98486b.hashCode();
    }

    @m80.k
    public String toString() {
        return "AttributeKey: " + this.f98485a;
    }

    @w00.k
    public a(@m80.k String name, @m80.k gz.a type) {
        kotlin.jvm.internal.g0.p(name, "name");
        kotlin.jvm.internal.g0.p(type, "type");
        this.f98485a = name;
        this.f98486b = type;
        if (u30.k0.O3(name)) {
            throw new IllegalArgumentException("Name can't be blank");
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ a(java.lang.String r1, gz.a r2, int r3, kotlin.jvm.internal.v r4) {
        /*
            r0 = this;
            r3 = r3 & 2
            if (r3 == 0) goto L16
            java.lang.Class<java.lang.Object> r2 = java.lang.Object.class
            h10.d r3 = kotlin.jvm.internal.o0.d(r2)
            h10.r r2 = kotlin.jvm.internal.o0.B(r2)     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
            r2 = 0
        L10:
            gz.a r4 = new gz.a
            r4.<init>(r3, r2)
            r2 = r4
        L16:
            r0.<init>(r1, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: xy.a.<init>(java.lang.String, gz.a, int, kotlin.jvm.internal.v):void");
    }
}
