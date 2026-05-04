package y10;

import a00.r0;
import a00.x1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.load.java.AnnotationQualifierApplicabilityType;
import kotlin.reflect.jvm.internal.impl.load.java.ReportLevel;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.MutabilityQualifier;
import n10.o;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nAbstractAnnotationTypeQualifierResolver.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 5 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,234:1\n1#2:235\n1#2:241\n1#2:246\n1#2:268\n1755#3,3:236\n295#3,2:242\n1619#3:244\n1863#3:245\n1864#3:247\n1620#3:248\n1755#3,3:249\n1797#3,3:252\n1797#3,3:255\n1611#3,9:258\n1863#3:267\n1864#3:269\n1620#3:270\n72#4,2:239\n381#5,7:271\n*S KotlinDebug\n*F\n+ 1 AbstractAnnotationTypeQualifierResolver.kt\norg/jetbrains/kotlin/load/java/AbstractAnnotationTypeQualifierResolver\n*L\n42#1:241\n83#1:246\n164#1:268\n30#1:236,3\n81#1:242,2\n83#1:244\n83#1:245\n83#1:247\n83#1:248\n90#1:249,3\n126#1:252,3\n138#1:255,3\n164#1:258,9\n164#1:267\n164#1:269\n164#1:270\n42#1:239,2\n229#1:271,7\n*E\n"})
/* loaded from: classes8.dex */
public abstract class b<TAnnotation> {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f99013c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final Map<String, AnnotationQualifierApplicabilityType> f99014d;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final z f99015a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ConcurrentHashMap<Object, TAnnotation> f99016b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : AnnotationQualifierApplicabilityType.values()) {
            String javaTarget = annotationQualifierApplicabilityType.getJavaTarget();
            if (linkedHashMap.get(javaTarget) == null) {
                linkedHashMap.put(javaTarget, annotationQualifierApplicabilityType);
            }
        }
        f99014d = linkedHashMap;
    }

    public b(@m80.k z javaTypeEnhancementState) {
        kotlin.jvm.internal.g0.p(javaTypeEnhancementState, "javaTypeEnhancementState");
        this.f99015a = javaTypeEnhancementState;
        this.f99016b = new ConcurrentHashMap<>();
    }

    public static final boolean f(Object extractNullability) {
        kotlin.jvm.internal.g0.p(extractNullability, "$this$extractNullability");
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Set<AnnotationQualifierApplicabilityType> b(Set<? extends AnnotationQualifierApplicabilityType> set) {
        return set.contains(AnnotationQualifierApplicabilityType.TYPE_USE) ? x1.C(x1.y(a00.a0.Fz(AnnotationQualifierApplicabilityType.values()), AnnotationQualifierApplicabilityType.TYPE_PARAMETER_BOUNDS), set) : set;
    }

    @m80.k
    public abstract Iterable<String> c(@m80.k TAnnotation tannotation, boolean z11);

    @m80.l
    public final a0 d(@m80.l a0 a0Var, @m80.k Iterable<? extends TAnnotation> annotations) {
        EnumMap<AnnotationQualifierApplicabilityType, t> b11;
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        if (!this.f99015a.b()) {
            ArrayList<t> arrayList = new ArrayList();
            Iterator<? extends TAnnotation> it = annotations.iterator();
            while (it.hasNext()) {
                t e11 = e(it.next());
                if (e11 != null) {
                    arrayList.add(e11);
                }
            }
            if (!arrayList.isEmpty()) {
                EnumMap enumMap = new EnumMap(AnnotationQualifierApplicabilityType.class);
                for (t tVar : arrayList) {
                    for (AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType : tVar.e()) {
                        if (enumMap.containsKey(annotationQualifierApplicabilityType) && o()) {
                            t tVar2 = (t) enumMap.get(annotationQualifierApplicabilityType);
                            if (tVar2 != null) {
                                g20.j d11 = tVar2.d();
                                g20.j d12 = tVar.d();
                                if (!kotlin.jvm.internal.g0.g(d12, d11) && (!d12.d() || d11.d())) {
                                    tVar2 = (d12.d() || !d11.d()) ? null : tVar;
                                }
                                enumMap.put((EnumMap) annotationQualifierApplicabilityType, (AnnotationQualifierApplicabilityType) tVar2);
                            }
                        } else {
                            enumMap.put((EnumMap) annotationQualifierApplicabilityType, (AnnotationQualifierApplicabilityType) tVar);
                        }
                    }
                }
                EnumMap enumMap2 = (a0Var == null || (b11 = a0Var.b()) == null) ? new EnumMap(AnnotationQualifierApplicabilityType.class) : new EnumMap((EnumMap) b11);
                boolean z11 = false;
                for (Map.Entry entry : enumMap.entrySet()) {
                    AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType2 = (AnnotationQualifierApplicabilityType) entry.getKey();
                    t tVar3 = (t) entry.getValue();
                    if (tVar3 != null) {
                        enumMap2.put((EnumMap) annotationQualifierApplicabilityType2, (AnnotationQualifierApplicabilityType) tVar3);
                        z11 = true;
                    }
                }
                if (z11) {
                    return new a0(enumMap2);
                }
            }
        }
        return a0Var;
    }

    public final t e(TAnnotation tannotation) {
        g20.j i11;
        t u11 = u(tannotation);
        if (u11 != null) {
            return u11;
        }
        Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> w11 = w(tannotation);
        if (w11 == null) {
            return null;
        }
        TAnnotation component1 = w11.component1();
        Set<AnnotationQualifierApplicabilityType> component2 = w11.component2();
        ReportLevel t11 = t(tannotation);
        if (t11 == null) {
            t11 = s(component1);
        }
        if (t11.isIgnore() || (i11 = i(component1, y10.a.f99011a)) == null) {
            return null;
        }
        return new t(g20.j.b(i11, null, t11.isWarning(), 1, null), component2, false, 4, null);
    }

    @m80.l
    public final MutabilityQualifier g(@m80.k Iterable<? extends TAnnotation> annotations) {
        MutabilityQualifier mutabilityQualifier;
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        MutabilityQualifier mutabilityQualifier2 = null;
        while (it.hasNext()) {
            n20.c k11 = k(it.next());
            if (r0.a2(f0.o(), k11)) {
                mutabilityQualifier = MutabilityQualifier.READ_ONLY;
            } else if (r0.a2(f0.l(), k11)) {
                mutabilityQualifier = MutabilityQualifier.MUTABLE;
            } else {
                continue;
            }
            if (mutabilityQualifier2 != null && mutabilityQualifier2 != mutabilityQualifier) {
                return null;
            }
            mutabilityQualifier2 = mutabilityQualifier;
        }
        return mutabilityQualifier2;
    }

    @m80.l
    public final g20.j h(@m80.k Iterable<? extends TAnnotation> annotations, @m80.k x00.l<? super TAnnotation, Boolean> forceWarning) {
        kotlin.jvm.internal.g0.p(annotations, "annotations");
        kotlin.jvm.internal.g0.p(forceWarning, "forceWarning");
        Iterator<? extends TAnnotation> it = annotations.iterator();
        g20.j jVar = null;
        while (it.hasNext()) {
            g20.j i11 = i(it.next(), forceWarning);
            if (jVar != null) {
                if (i11 != null && !kotlin.jvm.internal.g0.g(i11, jVar) && (!i11.d() || jVar.d())) {
                    if (i11.d() || !jVar.d()) {
                        return null;
                    }
                }
            }
            jVar = i11;
        }
        return jVar;
    }

    public final g20.j i(TAnnotation tannotation, x00.l<? super TAnnotation, Boolean> lVar) {
        g20.j q11;
        g20.j q12 = q(tannotation, lVar.invoke(tannotation).booleanValue());
        if (q12 != null) {
            return q12;
        }
        TAnnotation v11 = v(tannotation);
        if (v11 == null) {
            return null;
        }
        ReportLevel s11 = s(tannotation);
        if (s11.isIgnore() || (q11 = q(v11, lVar.invoke(v11).booleanValue())) == null) {
            return null;
        }
        return g20.j.b(q11, null, s11.isWarning(), 1, null);
    }

    public final TAnnotation j(TAnnotation tannotation, n20.c cVar) {
        for (TAnnotation tannotation2 : m(tannotation)) {
            if (kotlin.jvm.internal.g0.g(k(tannotation2), cVar)) {
                return tannotation2;
            }
        }
        return null;
    }

    @m80.l
    public abstract n20.c k(@m80.k TAnnotation tannotation);

    @m80.k
    public abstract Object l(@m80.k TAnnotation tannotation);

    @m80.k
    public abstract Iterable<TAnnotation> m(@m80.k TAnnotation tannotation);

    public final boolean n(TAnnotation tannotation, n20.c cVar) {
        Iterable<TAnnotation> m11 = m(tannotation);
        if ((m11 instanceof Collection) && ((Collection) m11).isEmpty()) {
            return false;
        }
        Iterator<TAnnotation> it = m11.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.g0.g(k(it.next()), cVar)) {
                return true;
            }
        }
        return false;
    }

    public abstract boolean o();

    public final boolean p(@m80.k TAnnotation annotation) {
        kotlin.jvm.internal.g0.p(annotation, "annotation");
        TAnnotation j11 = j(annotation, o.a.H);
        if (j11 == null) {
            return false;
        }
        Iterable<String> c11 = c(j11, false);
        if ((c11 instanceof Collection) && ((Collection) c11).isEmpty()) {
            return false;
        }
        Iterator<String> it = c11.iterator();
        while (it.hasNext()) {
            if (kotlin.jvm.internal.g0.g(it.next(), "TYPE")) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0067, code lost:
    
        if (r6.equals("ALWAYS") != false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007c, code lost:
    
        if (r6.equals("NEVER") == false) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0088, code lost:
    
        r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0085, code lost:
    
        if (r6.equals("MAYBE") == false) goto L36;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final g20.j q(TAnnotation r6, boolean r7) {
        /*
            r5 = this;
            n20.c r0 = r5.k(r6)
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            y10.z r2 = r5.f99015a
            x00.l r2 = r2.c()
            java.lang.Object r2 = r2.invoke(r0)
            kotlin.reflect.jvm.internal.impl.load.java.ReportLevel r2 = (kotlin.reflect.jvm.internal.impl.load.java.ReportLevel) r2
            boolean r3 = r2.isIgnore()
            if (r3 == 0) goto L1b
            return r1
        L1b:
            java.util.Set r3 = y10.f0.m()
            boolean r3 = r3.contains(r0)
            r4 = 0
            if (r3 == 0) goto L29
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
            goto L8d
        L29:
            java.util.Set r3 = y10.f0.n()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L36
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L8d
        L36:
            java.util.Set r3 = y10.f0.b()
            boolean r3 = r3.contains(r0)
            if (r3 == 0) goto L43
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L8d
        L43:
            n20.c r3 = y10.f0.c()
            boolean r0 = kotlin.jvm.internal.g0.g(r0, r3)
            if (r0 == 0) goto L9c
            java.lang.Iterable r6 = r5.c(r6, r4)
            java.lang.Object r6 = a00.r0.J2(r6)
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L8b
            int r0 = r6.hashCode()
            switch(r0) {
                case 73135176: goto L7f;
                case 74175084: goto L76;
                case 433141802: goto L6a;
                case 1933739535: goto L61;
                default: goto L60;
            }
        L60:
            goto L87
        L61:
            java.lang.String r0 = "ALWAYS"
            boolean r6 = r6.equals(r0)
            if (r6 == 0) goto L87
            goto L8b
        L6a:
            java.lang.String r0 = "UNKNOWN"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L73
            goto L87
        L73:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.FORCE_FLEXIBILITY
            goto L8d
        L76:
            java.lang.String r0 = "NEVER"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
            goto L87
        L7f:
            java.lang.String r0 = "MAYBE"
            boolean r6 = r6.equals(r0)
            if (r6 != 0) goto L88
        L87:
            return r1
        L88:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NULLABLE
            goto L8d
        L8b:
            kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier r6 = kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.NullabilityQualifier.NOT_NULL
        L8d:
            g20.j r0 = new g20.j
            boolean r1 = r2.isWarning()
            if (r1 != 0) goto L97
            if (r7 == 0) goto L98
        L97:
            r4 = 1
        L98:
            r0.<init>(r6, r4)
            return r0
        L9c:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: y10.b.q(java.lang.Object, boolean):g20.j");
    }

    public final ReportLevel r(TAnnotation tannotation) {
        n20.c k11 = k(tannotation);
        return (k11 == null || !u.b().containsKey(k11)) ? s(tannotation) : this.f99015a.c().invoke(k11);
    }

    public final ReportLevel s(TAnnotation tannotation) {
        ReportLevel t11 = t(tannotation);
        return t11 != null ? t11 : this.f99015a.d().c();
    }

    public final ReportLevel t(TAnnotation tannotation) {
        Iterable<String> c11;
        String str;
        ReportLevel reportLevel = this.f99015a.d().e().get(k(tannotation));
        if (reportLevel != null) {
            return reportLevel;
        }
        TAnnotation j11 = j(tannotation, f0.p());
        if (j11 == null || (c11 = c(j11, false)) == null || (str = (String) r0.J2(c11)) == null) {
            return null;
        }
        ReportLevel d11 = this.f99015a.d().d();
        if (d11 != null) {
            return d11;
        }
        int hashCode = str.hashCode();
        if (hashCode != -2137067054) {
            if (hashCode != -1838656823) {
                if (hashCode == 2656902 && str.equals("WARN")) {
                    return ReportLevel.WARN;
                }
            } else if (str.equals("STRICT")) {
                return ReportLevel.STRICT;
            }
        } else if (str.equals("IGNORE")) {
            return ReportLevel.IGNORE;
        }
        return null;
    }

    public final t u(TAnnotation tannotation) {
        t tVar;
        if (this.f99015a.b() || (tVar = u.a().get(k(tannotation))) == null) {
            return null;
        }
        ReportLevel r11 = r(tannotation);
        if (r11 == ReportLevel.IGNORE) {
            r11 = null;
        }
        if (r11 == null) {
            return null;
        }
        return t.b(tVar, g20.j.b(tVar.d(), null, r11.isWarning(), 1, null), null, false, 6, null);
    }

    @m80.l
    public final TAnnotation v(@m80.k TAnnotation annotation) {
        TAnnotation tannotation;
        kotlin.jvm.internal.g0.p(annotation, "annotation");
        if (this.f99015a.d().f()) {
            return null;
        }
        if (r0.a2(f0.a(), k(annotation)) || n(annotation, f0.f())) {
            return annotation;
        }
        if (!n(annotation, f0.h())) {
            return null;
        }
        ConcurrentHashMap<Object, TAnnotation> concurrentHashMap = this.f99016b;
        Object l11 = l(annotation);
        TAnnotation tannotation2 = concurrentHashMap.get(l11);
        if (tannotation2 != null) {
            return tannotation2;
        }
        Iterator<TAnnotation> it = m(annotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation = null;
                break;
            }
            tannotation = v(it.next());
            if (tannotation != null) {
                break;
            }
        }
        if (tannotation == null) {
            return null;
        }
        TAnnotation putIfAbsent = concurrentHashMap.putIfAbsent(l11, tannotation);
        return putIfAbsent == null ? tannotation : putIfAbsent;
    }

    public final Pair<TAnnotation, Set<AnnotationQualifierApplicabilityType>> w(TAnnotation tannotation) {
        TAnnotation j11;
        TAnnotation tannotation2;
        if (this.f99015a.d().f() || (j11 = j(tannotation, f0.g())) == null) {
            return null;
        }
        Iterator<TAnnotation> it = m(tannotation).iterator();
        while (true) {
            if (!it.hasNext()) {
                tannotation2 = null;
                break;
            }
            tannotation2 = it.next();
            if (v(tannotation2) != null) {
                break;
            }
        }
        if (tannotation2 == null) {
            return null;
        }
        Iterable<String> c11 = c(j11, true);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<String> it2 = c11.iterator();
        while (it2.hasNext()) {
            AnnotationQualifierApplicabilityType annotationQualifierApplicabilityType = f99014d.get(it2.next());
            if (annotationQualifierApplicabilityType != null) {
                linkedHashSet.add(annotationQualifierApplicabilityType);
            }
        }
        return new Pair<>(tannotation2, b(linkedHashSet));
    }
}
