package y10;

import a00.l1;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import y10.y;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJavaNullabilityAnnotationSettings.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaNullabilityAnnotationSettings.kt\norg/jetbrains/kotlin/load/java/JavaNullabilityAnnotationSettingsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,119:1\n1#2:120\n*E\n"})
/* loaded from: classes8.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final n20.c f99119a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final n20.c f99120b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final n20.c f99121c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final n20.c f99122d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f99123e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final n20.c[] f99124f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final g0<y> f99125g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public static final y f99126h;

    static {
        n20.c cVar = new n20.c("org.jspecify.nullness");
        f99119a = cVar;
        n20.c cVar2 = new n20.c("org.jspecify.annotations");
        f99120b = cVar2;
        n20.c cVar3 = new n20.c("io.reactivex.rxjava3.annotations");
        f99121c = cVar3;
        n20.c cVar4 = new n20.c("org.checkerframework.checker.nullness.compatqual");
        f99122d = cVar4;
        String b11 = cVar3.b();
        kotlin.jvm.internal.g0.o(b11, "asString(...)");
        f99123e = b11;
        f99124f = new n20.c[]{new n20.c(b11 + ".Nullable"), new n20.c(b11 + ".NonNull")};
        n20.c cVar5 = new n20.c("org.jetbrains.annotations");
        y.a aVar = y.f99127d;
        Pair a11 = h1.a(cVar5, aVar.a());
        Pair a12 = h1.a(new n20.c("androidx.annotation"), aVar.a());
        Pair a13 = h1.a(new n20.c("android.support.annotation"), aVar.a());
        Pair a14 = h1.a(new n20.c("android.annotation"), aVar.a());
        Pair a15 = h1.a(new n20.c("com.android.annotations"), aVar.a());
        Pair a16 = h1.a(new n20.c("org.eclipse.jdt.annotation"), aVar.a());
        Pair a17 = h1.a(new n20.c("org.checkerframework.checker.nullness.qual"), aVar.a());
        Pair a18 = h1.a(cVar4, aVar.a());
        Pair a19 = h1.a(new n20.c("javax.annotation"), aVar.a());
        Pair a21 = h1.a(new n20.c("edu.umd.cs.findbugs.annotations"), aVar.a());
        Pair a22 = h1.a(new n20.c("io.reactivex.annotations"), aVar.a());
        n20.c cVar6 = new n20.c("androidx.annotation.RecentlyNullable");
        ReportLevel reportLevel = ReportLevel.WARN;
        Pair a23 = h1.a(cVar6, new y(reportLevel, null, null, 4, null));
        Pair a24 = h1.a(new n20.c("androidx.annotation.RecentlyNonNull"), new y(reportLevel, null, null, 4, null));
        Pair a25 = h1.a(new n20.c("lombok"), aVar.a());
        yz.z zVar = new yz.z(2, 1);
        ReportLevel reportLevel2 = ReportLevel.STRICT;
        f99125g = new i0(l1.W(a11, a12, a13, a14, a15, a16, a17, a18, a19, a21, a22, a23, a24, a25, h1.a(cVar, new y(reportLevel, zVar, reportLevel2)), h1.a(cVar2, new y(reportLevel, new yz.z(2, 1), reportLevel2)), h1.a(cVar3, new y(reportLevel, new yz.z(1, 8), reportLevel2))));
        f99126h = new y(reportLevel, null, null, 4, null);
    }

    @m80.k
    public static final c0 a(@m80.k yz.z configuredKotlinVersion) {
        kotlin.jvm.internal.g0.p(configuredKotlinVersion, "configuredKotlinVersion");
        y yVar = f99126h;
        ReportLevel c11 = (yVar.d() == null || yVar.d().compareTo(configuredKotlinVersion) > 0) ? yVar.c() : yVar.b();
        return new c0(c11, c(c11), null, 4, null);
    }

    public static /* synthetic */ c0 b(yz.z zVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            zVar = yz.z.f100469g;
        }
        return a(zVar);
    }

    @m80.l
    public static final ReportLevel c(@m80.k ReportLevel globalReportLevel) {
        kotlin.jvm.internal.g0.p(globalReportLevel, "globalReportLevel");
        if (globalReportLevel == ReportLevel.WARN) {
            return null;
        }
        return globalReportLevel;
    }

    @m80.k
    public static final ReportLevel d(@m80.k n20.c annotationFqName) {
        kotlin.jvm.internal.g0.p(annotationFqName, "annotationFqName");
        return h(annotationFqName, g0.f99085a.a(), null, 4, null);
    }

    @m80.k
    public static final n20.c e() {
        return f99120b;
    }

    @m80.k
    public static final n20.c[] f() {
        return f99124f;
    }

    @m80.k
    public static final ReportLevel g(@m80.k n20.c annotation, @m80.k g0<? extends ReportLevel> configuredReportLevels, @m80.k yz.z configuredKotlinVersion) {
        kotlin.jvm.internal.g0.p(annotation, "annotation");
        kotlin.jvm.internal.g0.p(configuredReportLevels, "configuredReportLevels");
        kotlin.jvm.internal.g0.p(configuredKotlinVersion, "configuredKotlinVersion");
        ReportLevel a11 = configuredReportLevels.a(annotation);
        if (a11 != null) {
            return a11;
        }
        y a12 = f99125g.a(annotation);
        return a12 == null ? ReportLevel.IGNORE : (a12.d() == null || a12.d().compareTo(configuredKotlinVersion) > 0) ? a12.c() : a12.b();
    }

    public static /* synthetic */ ReportLevel h(n20.c cVar, g0 g0Var, yz.z zVar, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            zVar = new yz.z(1, 7, 20);
        }
        return g(cVar, g0Var, zVar);
    }
}
