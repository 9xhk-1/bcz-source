package g20;

import a00.k1;
import androidx.exifinterface.media.ExifInterface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.resolve.jvm.JvmPrimitiveType;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Map<String, v0> f52576a = new LinkedHashMap();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public final class a {

        /* renamed from: a, reason: collision with root package name */
        @m80.k
        public final String f52577a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ c1 f52578b;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @kotlin.jvm.internal.u0({"SMAP\npredefinedEnhancementInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,315:1\n1216#2,2:316\n1246#2,4:318\n1216#2,2:322\n1246#2,4:324\n1557#2:328\n1628#2,3:329\n1557#2:332\n1628#2,3:333\n*S KotlinDebug\n*F\n+ 1 predefinedEnhancementInfo.kt\norg/jetbrains/kotlin/load/java/typeEnhancement/SignatureEnhancementBuilder$ClassEnhancementBuilder$FunctionEnhancementBuilder\n*L\n287#1:316,2\n287#1:318,4\n298#1:322,2\n298#1:324,4\n306#1:328\n306#1:329,3\n307#1:332\n307#1:333,3\n*E\n"})
        /* renamed from: g20.c1$a$a, reason: collision with other inner class name */
        public final class C0623a {

            /* renamed from: a, reason: collision with root package name */
            @m80.k
            public final String f52579a;

            /* renamed from: b, reason: collision with root package name */
            @m80.l
            public final String f52580b;

            /* renamed from: c, reason: collision with root package name */
            @m80.k
            public final List<Pair<String, f1>> f52581c;

            /* renamed from: d, reason: collision with root package name */
            @m80.k
            public Pair<String, f1> f52582d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ a f52583e;

            public C0623a(@m80.k a aVar, @m80.l String functionName, String str) {
                kotlin.jvm.internal.g0.p(functionName, "functionName");
                this.f52583e = aVar;
                this.f52579a = functionName;
                this.f52580b = str;
                this.f52581c = new ArrayList();
                this.f52582d = yz.h1.a(ExifInterface.GPS_MEASUREMENT_INTERRUPTED, null);
            }

            @m80.k
            public final Pair<String, v0> a() {
                h20.f0 f0Var = h20.f0.f58067a;
                String c11 = this.f52583e.c();
                String str = this.f52579a;
                List<Pair<String, f1>> list = this.f52581c;
                ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((String) ((Pair) it.next()).getFirst());
                }
                String l11 = f0Var.l(c11, f0Var.j(str, arrayList, this.f52582d.getFirst()));
                f1 second = this.f52582d.getSecond();
                List<Pair<String, f1>> list2 = this.f52581c;
                ArrayList arrayList2 = new ArrayList(a00.i0.d0(list2, 10));
                Iterator<T> it2 = list2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add((f1) ((Pair) it2.next()).getSecond());
                }
                return yz.h1.a(l11, new v0(second, arrayList2, this.f52580b));
            }

            public final void b(@m80.k String type, @m80.k h... qualifiers) {
                f1 f1Var;
                kotlin.jvm.internal.g0.p(type, "type");
                kotlin.jvm.internal.g0.p(qualifiers, "qualifiers");
                List<Pair<String, f1>> list = this.f52581c;
                if (qualifiers.length == 0) {
                    f1Var = null;
                } else {
                    Iterable<a00.a1> Yz = a00.a0.Yz(qualifiers);
                    LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(Yz, 10)), 16));
                    for (a00.a1 a1Var : Yz) {
                        linkedHashMap.put(Integer.valueOf(a1Var.e()), (h) a1Var.f());
                    }
                    f1Var = new f1(linkedHashMap);
                }
                list.add(yz.h1.a(type, f1Var));
            }

            public final void c(@m80.k String type, @m80.k h... qualifiers) {
                kotlin.jvm.internal.g0.p(type, "type");
                kotlin.jvm.internal.g0.p(qualifiers, "qualifiers");
                Iterable<a00.a1> Yz = a00.a0.Yz(qualifiers);
                LinkedHashMap linkedHashMap = new LinkedHashMap(g10.u.u(k1.j(a00.i0.d0(Yz, 10)), 16));
                for (a00.a1 a1Var : Yz) {
                    linkedHashMap.put(Integer.valueOf(a1Var.e()), (h) a1Var.f());
                }
                this.f52582d = yz.h1.a(type, new f1(linkedHashMap));
            }

            public final void d(@m80.k JvmPrimitiveType type) {
                kotlin.jvm.internal.g0.p(type, "type");
                String desc = type.getDesc();
                kotlin.jvm.internal.g0.o(desc, "getDesc(...)");
                this.f52582d = yz.h1.a(desc, null);
            }
        }

        public a(@m80.k c1 c1Var, String className) {
            kotlin.jvm.internal.g0.p(className, "className");
            this.f52578b = c1Var;
            this.f52577a = className;
        }

        public static /* synthetic */ void b(a aVar, String str, String str2, x00.l lVar, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                str2 = null;
            }
            aVar.a(str, str2, lVar);
        }

        public final void a(@m80.k String name, @m80.l String str, @m80.k x00.l<? super C0623a, g2> block) {
            kotlin.jvm.internal.g0.p(name, "name");
            kotlin.jvm.internal.g0.p(block, "block");
            Map map = this.f52578b.f52576a;
            C0623a c0623a = new C0623a(this, name, str);
            block.invoke(c0623a);
            Pair<String, v0> a11 = c0623a.a();
            map.put(a11.getFirst(), a11.getSecond());
        }

        @m80.k
        public final String c() {
            return this.f52577a;
        }
    }

    @m80.k
    public final Map<String, v0> b() {
        return this.f52576a;
    }
}
