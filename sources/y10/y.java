package y10;

import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class y {

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final a f99127d = new a(null);

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final y f99128e = new y(ReportLevel.STRICT, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ReportLevel f99129a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final yz.z f99130b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final ReportLevel f99131c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final y a() {
            return y.f99128e;
        }

        public a() {
        }
    }

    public y(@m80.k ReportLevel reportLevelBefore, @m80.l yz.z zVar, @m80.k ReportLevel reportLevelAfter) {
        kotlin.jvm.internal.g0.p(reportLevelBefore, "reportLevelBefore");
        kotlin.jvm.internal.g0.p(reportLevelAfter, "reportLevelAfter");
        this.f99129a = reportLevelBefore;
        this.f99130b = zVar;
        this.f99131c = reportLevelAfter;
    }

    @m80.k
    public final ReportLevel b() {
        return this.f99131c;
    }

    @m80.k
    public final ReportLevel c() {
        return this.f99129a;
    }

    @m80.l
    public final yz.z d() {
        return this.f99130b;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        return this.f99129a == yVar.f99129a && kotlin.jvm.internal.g0.g(this.f99130b, yVar.f99130b) && this.f99131c == yVar.f99131c;
    }

    public int hashCode() {
        int hashCode = this.f99129a.hashCode() * 31;
        yz.z zVar = this.f99130b;
        return ((hashCode + (zVar == null ? 0 : zVar.hashCode())) * 31) + this.f99131c.hashCode();
    }

    @m80.k
    public String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f99129a + ", sinceVersion=" + this.f99130b + ", reportLevelAfter=" + this.f99131c + ')';
    }

    public /* synthetic */ y(ReportLevel reportLevel, yz.z zVar, ReportLevel reportLevel2, int i11, kotlin.jvm.internal.v vVar) {
        this(reportLevel, (i11 & 2) != 0 ? new yz.z(1, 0) : zVar, (i11 & 4) != 0 ? reportLevel : reportLevel2);
    }
}
