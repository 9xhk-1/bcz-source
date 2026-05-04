package e30;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public abstract class v1 extends d2 {

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final a f48674c = new a(null);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @kotlin.jvm.internal.u0({"SMAP\nTypeSubstitution.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,207:1\n1557#2:208\n1628#2,3:209\n*S KotlinDebug\n*F\n+ 1 TypeSubstitution.kt\norg/jetbrains/kotlin/types/TypeConstructorSubstitution$Companion\n*L\n96#1:208\n96#1:209,3\n*E\n"})
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: e30.v1$a$a, reason: collision with other inner class name */
        public static final class C0585a extends v1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Map<u1, a2> f48675d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f48676e;

            /* JADX WARN: Multi-variable type inference failed */
            public C0585a(Map<u1, ? extends a2> map, boolean z11) {
                this.f48675d = map;
                this.f48676e = z11;
            }

            @Override // e30.d2
            public boolean a() {
                return this.f48676e;
            }

            @Override // e30.d2
            public boolean f() {
                return this.f48675d.isEmpty();
            }

            @Override // e30.v1
            public a2 k(u1 key) {
                kotlin.jvm.internal.g0.p(key, "key");
                return this.f48675d.get(key);
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public static /* synthetic */ v1 e(a aVar, Map map, boolean z11, int i11, Object obj) {
            if ((i11 & 2) != 0) {
                z11 = false;
            }
            return aVar.d(map, z11);
        }

        @w00.o
        @m80.k
        public final d2 a(@m80.k r0 kotlinType) {
            kotlin.jvm.internal.g0.p(kotlinType, "kotlinType");
            return b(kotlinType.I0(), kotlinType.G0());
        }

        @w00.o
        @m80.k
        public final d2 b(@m80.k u1 typeConstructor, @m80.k List<? extends a2> arguments) {
            kotlin.jvm.internal.g0.p(typeConstructor, "typeConstructor");
            kotlin.jvm.internal.g0.p(arguments, "arguments");
            List<p10.c1> parameters = typeConstructor.getParameters();
            kotlin.jvm.internal.g0.o(parameters, "getParameters(...)");
            p10.c1 c1Var = (p10.c1) a00.r0.A3(parameters);
            if (c1Var == null || !c1Var.G()) {
                return new m0(parameters, arguments);
            }
            List<p10.c1> parameters2 = typeConstructor.getParameters();
            kotlin.jvm.internal.g0.o(parameters2, "getParameters(...)");
            List<p10.c1> list = parameters2;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((p10.c1) it.next()).o());
            }
            return e(this, a00.l1.B0(a00.r0.o6(arrayList, arguments)), false, 2, null);
        }

        @w00.k
        @w00.o
        @m80.k
        public final v1 c(@m80.k Map<u1, ? extends a2> map) {
            kotlin.jvm.internal.g0.p(map, "map");
            return e(this, map, false, 2, null);
        }

        @w00.k
        @w00.o
        @m80.k
        public final v1 d(@m80.k Map<u1, ? extends a2> map, boolean z11) {
            kotlin.jvm.internal.g0.p(map, "map");
            return new C0585a(map, z11);
        }

        public a() {
        }
    }

    @w00.o
    @m80.k
    public static final d2 i(@m80.k u1 u1Var, @m80.k List<? extends a2> list) {
        return f48674c.b(u1Var, list);
    }

    @w00.k
    @w00.o
    @m80.k
    public static final v1 j(@m80.k Map<u1, ? extends a2> map) {
        return f48674c.c(map);
    }

    @Override // e30.d2
    @m80.l
    public a2 e(@m80.k r0 key) {
        kotlin.jvm.internal.g0.p(key, "key");
        return k(key.I0());
    }

    @m80.l
    public abstract a2 k(@m80.k u1 u1Var);
}
