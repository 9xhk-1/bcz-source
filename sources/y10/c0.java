package y10;

import a00.l1;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJsr305Settings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,26:1\n1#2:27\n216#3,2:28\n37#4,2:30\n*S KotlinDebug\n*F\n+ 1 Jsr305Settings.kt\norg/jetbrains/kotlin/load/java/Jsr305Settings\n*L\n19#1:28,2\n20#1:30,2\n*E\n"})
/* loaded from: classes8.dex */
public final class c0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ReportLevel f99018a;

    /* renamed from: b, reason: collision with root package name */
    @m80.l
    public final ReportLevel f99019b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<n20.c, ReportLevel> f99020c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final yz.c0 f99021d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f99022e;

    /* JADX WARN: Multi-variable type inference failed */
    public c0(@m80.k ReportLevel globalLevel, @m80.l ReportLevel reportLevel, @m80.k Map<n20.c, ? extends ReportLevel> userDefinedLevelForSpecificAnnotation) {
        kotlin.jvm.internal.g0.p(globalLevel, "globalLevel");
        kotlin.jvm.internal.g0.p(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f99018a = globalLevel;
        this.f99019b = reportLevel;
        this.f99020c = userDefinedLevelForSpecificAnnotation;
        this.f99021d = yz.e0.c(new b0(this));
        ReportLevel reportLevel2 = ReportLevel.IGNORE;
        this.f99022e = globalLevel == reportLevel2 && reportLevel == reportLevel2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public static final String[] b(c0 c0Var) {
        List j11 = a00.g0.j();
        j11.add(c0Var.f99018a.getDescription());
        ReportLevel reportLevel = c0Var.f99019b;
        if (reportLevel != null) {
            j11.add("under-migration:" + reportLevel.getDescription());
        }
        for (Map.Entry<n20.c, ReportLevel> entry : c0Var.f99020c.entrySet()) {
            j11.add('@' + entry.getKey() + ':' + entry.getValue().getDescription());
        }
        return (String[]) a00.g0.b(j11).toArray(new String[0]);
    }

    @m80.k
    public final ReportLevel c() {
        return this.f99018a;
    }

    @m80.l
    public final ReportLevel d() {
        return this.f99019b;
    }

    @m80.k
    public final Map<n20.c, ReportLevel> e() {
        return this.f99020c;
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return this.f99018a == c0Var.f99018a && this.f99019b == c0Var.f99019b && kotlin.jvm.internal.g0.g(this.f99020c, c0Var.f99020c);
    }

    public final boolean f() {
        return this.f99022e;
    }

    public int hashCode() {
        int hashCode = this.f99018a.hashCode() * 31;
        ReportLevel reportLevel = this.f99019b;
        return ((hashCode + (reportLevel == null ? 0 : reportLevel.hashCode())) * 31) + this.f99020c.hashCode();
    }

    @m80.k
    public String toString() {
        return "Jsr305Settings(globalLevel=" + this.f99018a + ", migrationLevel=" + this.f99019b + ", userDefinedLevelForSpecificAnnotation=" + this.f99020c + ')';
    }

    public /* synthetic */ c0(ReportLevel reportLevel, ReportLevel reportLevel2, Map map, int i11, kotlin.jvm.internal.v vVar) {
        this(reportLevel, (i11 & 2) != 0 ? null : reportLevel2, (i11 & 4) != 0 ? l1.z() : map);
    }
}
