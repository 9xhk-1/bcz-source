package y10;

import kotlin.jvm.internal.FunctionReference;
import kotlin.jvm.internal.o0;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class z {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final b f99132d = new b(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final z f99133e = new z(x.b(null, 1, null), a.f99137a);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final c0 f99134a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final x00.l<n20.c, ReportLevel> f99135b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f99136c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a extends FunctionReference implements x00.l<n20.c, ReportLevel> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f99137a = new a();

        public a() {
            super(1);
        }

        @Override // x00.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ReportLevel invoke(n20.c p02) {
            kotlin.jvm.internal.g0.p(p02, "p0");
            return x.d(p02);
        }

        @Override // kotlin.jvm.internal.CallableReference, h10.c
        public final String getName() {
            return "getDefaultReportLevelForAnnotation";
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final h10.h getOwner() {
            return o0.h(x.class, "compiler.common.jvm");
        }

        @Override // kotlin.jvm.internal.CallableReference
        public final String getSignature() {
            return "getDefaultReportLevelForAnnotation(Lorg/jetbrains/kotlin/name/FqName;)Lorg/jetbrains/kotlin/load/java/ReportLevel;";
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {
        public /* synthetic */ b(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final z a() {
            return z.f99133e;
        }

        public b() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@m80.k c0 jsr305, @m80.k x00.l<? super n20.c, ? extends ReportLevel> getReportLevelForAnnotation) {
        kotlin.jvm.internal.g0.p(jsr305, "jsr305");
        kotlin.jvm.internal.g0.p(getReportLevelForAnnotation, "getReportLevelForAnnotation");
        this.f99134a = jsr305;
        this.f99135b = getReportLevelForAnnotation;
        this.f99136c = jsr305.f() || getReportLevelForAnnotation.invoke(x.e()) == ReportLevel.IGNORE;
    }

    public final boolean b() {
        return this.f99136c;
    }

    @m80.k
    public final x00.l<n20.c, ReportLevel> c() {
        return this.f99135b;
    }

    @m80.k
    public final c0 d() {
        return this.f99134a;
    }

    @m80.k
    public String toString() {
        return "JavaTypeEnhancementState(jsr305=" + this.f99134a + ", getReportLevelForAnnotation=" + this.f99135b + ')';
    }
}
