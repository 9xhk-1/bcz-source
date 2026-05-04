package a30;

import kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class m0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final k20.c f1813a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final k20.g f1814b;

    /* renamed from: c, reason: collision with root package name */
    @m80.l
    public final p10.x0 f1815c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a extends m0 {

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final ProtoBuf.Class f1816d;

        /* renamed from: e, reason: collision with root package name */
        @m80.l
        public final a f1817e;

        /* renamed from: f, reason: collision with root package name */
        @m80.k
        public final n20.b f1818f;

        /* renamed from: g, reason: collision with root package name */
        @m80.k
        public final ProtoBuf.Class.Kind f1819g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f1820h;

        /* renamed from: i, reason: collision with root package name */
        public final boolean f1821i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(@m80.k ProtoBuf.Class classProto, @m80.k k20.c nameResolver, @m80.k k20.g typeTable, @m80.l p10.x0 x0Var, @m80.l a aVar) {
            super(nameResolver, typeTable, x0Var, null);
            kotlin.jvm.internal.g0.p(classProto, "classProto");
            kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
            kotlin.jvm.internal.g0.p(typeTable, "typeTable");
            this.f1816d = classProto;
            this.f1817e = aVar;
            this.f1818f = k0.a(nameResolver, classProto.getFqName());
            ProtoBuf.Class.Kind d11 = k20.b.f65168f.d(classProto.getFlags());
            this.f1819g = d11 == null ? ProtoBuf.Class.Kind.CLASS : d11;
            Boolean d12 = k20.b.f65169g.d(classProto.getFlags());
            kotlin.jvm.internal.g0.o(d12, "get(...)");
            this.f1820h = d12.booleanValue();
            Boolean d13 = k20.b.f65170h.d(classProto.getFlags());
            kotlin.jvm.internal.g0.o(d13, "get(...)");
            this.f1821i = d13.booleanValue();
        }

        @Override // a30.m0
        @m80.k
        public n20.c a() {
            return this.f1818f.a();
        }

        @m80.k
        public final n20.b e() {
            return this.f1818f;
        }

        @m80.k
        public final ProtoBuf.Class f() {
            return this.f1816d;
        }

        @m80.k
        public final ProtoBuf.Class.Kind g() {
            return this.f1819g;
        }

        @m80.l
        public final a h() {
            return this.f1817e;
        }

        public final boolean i() {
            return this.f1820h;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b extends m0 {

        /* renamed from: d, reason: collision with root package name */
        @m80.k
        public final n20.c f1822d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@m80.k n20.c fqName, @m80.k k20.c nameResolver, @m80.k k20.g typeTable, @m80.l p10.x0 x0Var) {
            super(nameResolver, typeTable, x0Var, null);
            kotlin.jvm.internal.g0.p(fqName, "fqName");
            kotlin.jvm.internal.g0.p(nameResolver, "nameResolver");
            kotlin.jvm.internal.g0.p(typeTable, "typeTable");
            this.f1822d = fqName;
        }

        @Override // a30.m0
        @m80.k
        public n20.c a() {
            return this.f1822d;
        }
    }

    public /* synthetic */ m0(k20.c cVar, k20.g gVar, p10.x0 x0Var, kotlin.jvm.internal.v vVar) {
        this(cVar, gVar, x0Var);
    }

    @m80.k
    public abstract n20.c a();

    @m80.k
    public final k20.c b() {
        return this.f1813a;
    }

    @m80.l
    public final p10.x0 c() {
        return this.f1815c;
    }

    @m80.k
    public final k20.g d() {
        return this.f1814b;
    }

    @m80.k
    public String toString() {
        return getClass().getSimpleName() + ": " + a();
    }

    public m0(k20.c cVar, k20.g gVar, p10.x0 x0Var) {
        this.f1813a = cVar;
        this.f1814b = gVar;
        this.f1815c = x0Var;
    }
}
