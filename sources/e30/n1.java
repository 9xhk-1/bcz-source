package e30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class n1 {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final a f48631e = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final n1 f48632a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final p10.b1 f48633b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final List<a2> f48634c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final Map<p10.c1, a2> f48635d;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTypeAliasExpansion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,43:1\n1557#2:44\n1628#2,3:45\n*S KotlinDebug\n*F\n+ 1 TypeAliasExpansion.kt\norg/jetbrains/kotlin/types/TypeAliasExpansion$Companion\n*L\n34#1:44\n34#1:45,3\n*E\n"})
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final n1 a(@m80.l n1 n1Var, @m80.k p10.b1 typeAliasDescriptor, @m80.k List<? extends a2> arguments) {
            kotlin.jvm.internal.g0.p(typeAliasDescriptor, "typeAliasDescriptor");
            kotlin.jvm.internal.g0.p(arguments, "arguments");
            List<p10.c1> parameters = typeAliasDescriptor.o().getParameters();
            kotlin.jvm.internal.g0.o(parameters, "getParameters(...)");
            List<p10.c1> list = parameters;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((p10.c1) it.next()).a());
            }
            return new n1(n1Var, typeAliasDescriptor, arguments, a00.l1.B0(a00.r0.o6(arrayList, arguments)), null);
        }

        public a() {
        }
    }

    public /* synthetic */ n1(n1 n1Var, p10.b1 b1Var, List list, Map map, kotlin.jvm.internal.v vVar) {
        this(n1Var, b1Var, list, map);
    }

    @m80.k
    public final List<a2> a() {
        return this.f48634c;
    }

    @m80.k
    public final p10.b1 b() {
        return this.f48633b;
    }

    @m80.l
    public final a2 c(@m80.k u1 constructor) {
        kotlin.jvm.internal.g0.p(constructor, "constructor");
        p10.d r11 = constructor.r();
        if (r11 instanceof p10.c1) {
            return this.f48635d.get(r11);
        }
        return null;
    }

    public final boolean d(@m80.k p10.b1 descriptor) {
        kotlin.jvm.internal.g0.p(descriptor, "descriptor");
        if (kotlin.jvm.internal.g0.g(this.f48633b, descriptor)) {
            return true;
        }
        n1 n1Var = this.f48632a;
        return n1Var != null ? n1Var.d(descriptor) : false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n1(n1 n1Var, p10.b1 b1Var, List<? extends a2> list, Map<p10.c1, ? extends a2> map) {
        this.f48632a = n1Var;
        this.f48633b = b1Var;
        this.f48634c = list;
        this.f48635d = map;
    }
}
