package z10;

import a00.i0;
import a00.l1;
import a00.m0;
import a00.w1;
import e30.r0;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinRetention;
import kotlin.reflect.jvm.internal.impl.descriptors.annotations.KotlinTarget;
import kotlin.reflect.jvm.internal.impl.types.error.ErrorTypeKind;
import n10.o;
import p10.a0;
import p10.j1;
import yz.h1;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nJavaAnnotationMapper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,182:1\n808#2,11:183\n1368#2:194\n1454#2,5:195\n1557#2:200\n1628#2,3:201\n*S KotlinDebug\n*F\n+ 1 JavaAnnotationMapper.kt\norg/jetbrains/kotlin/load/java/components/JavaAnnotationTargetMapper\n*L\n153#1:183,11\n154#1:194\n154#1:195,5\n155#1:200\n155#1:201,3\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final f f100611a = new f();

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final Map<String, EnumSet<KotlinTarget>> f100612b = l1.W(h1.a("PACKAGE", EnumSet.noneOf(KotlinTarget.class)), h1.a("TYPE", EnumSet.of(KotlinTarget.CLASS, KotlinTarget.FILE)), h1.a("ANNOTATION_TYPE", EnumSet.of(KotlinTarget.ANNOTATION_CLASS)), h1.a("TYPE_PARAMETER", EnumSet.of(KotlinTarget.TYPE_PARAMETER)), h1.a("FIELD", EnumSet.of(KotlinTarget.FIELD)), h1.a("LOCAL_VARIABLE", EnumSet.of(KotlinTarget.LOCAL_VARIABLE)), h1.a("PARAMETER", EnumSet.of(KotlinTarget.VALUE_PARAMETER)), h1.a("CONSTRUCTOR", EnumSet.of(KotlinTarget.CONSTRUCTOR)), h1.a("METHOD", EnumSet.of(KotlinTarget.FUNCTION, KotlinTarget.PROPERTY_GETTER, KotlinTarget.PROPERTY_SETTER)), h1.a("TYPE_USE", EnumSet.of(KotlinTarget.TYPE)));

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final Map<String, KotlinRetention> f100613c = l1.W(h1.a("RUNTIME", KotlinRetention.RUNTIME), h1.a("CLASS", KotlinRetention.BINARY), h1.a("SOURCE", KotlinRetention.SOURCE));

    public static final r0 e(a0 module) {
        r0 type;
        g0.p(module, "module");
        j1 b11 = a.b(d.f100605a.d(), module.q().o(o.a.H));
        return (b11 == null || (type = b11.getType()) == null) ? g30.i.d(ErrorTypeKind.UNMAPPED_ANNOTATION_TARGET_TYPE, new String[0]) : type;
    }

    @m80.l
    public final s20.g<?> b(@m80.l f20.b bVar) {
        f20.m mVar = bVar instanceof f20.m ? (f20.m) bVar : null;
        if (mVar != null) {
            Map<String, KotlinRetention> map = f100613c;
            n20.f d11 = mVar.d();
            KotlinRetention kotlinRetention = map.get(d11 != null ? d11.b() : null);
            if (kotlinRetention != null) {
                n20.b c11 = n20.b.f74280d.c(o.a.K);
                n20.f f11 = n20.f.f(kotlinRetention.name());
                g0.o(f11, "identifier(...)");
                return new s20.k(c11, f11);
            }
        }
        return null;
    }

    @m80.k
    public final Set<KotlinTarget> c(@m80.l String str) {
        EnumSet<KotlinTarget> enumSet = f100612b.get(str);
        return enumSet != null ? enumSet : w1.k();
    }

    @m80.k
    public final s20.g<?> d(@m80.k List<? extends f20.b> arguments) {
        g0.p(arguments, "arguments");
        ArrayList<f20.m> arrayList = new ArrayList();
        for (Object obj : arguments) {
            if (obj instanceof f20.m) {
                arrayList.add(obj);
            }
        }
        ArrayList<KotlinTarget> arrayList2 = new ArrayList();
        for (f20.m mVar : arrayList) {
            f fVar = f100611a;
            n20.f d11 = mVar.d();
            m0.s0(arrayList2, fVar.c(d11 != null ? d11.b() : null));
        }
        ArrayList arrayList3 = new ArrayList(i0.d0(arrayList2, 10));
        for (KotlinTarget kotlinTarget : arrayList2) {
            n20.b c11 = n20.b.f74280d.c(o.a.J);
            n20.f f11 = n20.f.f(kotlinTarget.name());
            g0.o(f11, "identifier(...)");
            arrayList3.add(new s20.k(c11, f11));
        }
        return new s20.b(arrayList3, e.f100610a);
    }
}
