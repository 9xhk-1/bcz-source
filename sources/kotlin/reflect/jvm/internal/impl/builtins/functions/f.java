package kotlin.reflect.jvm.internal.impl.builtins.functions;

import a00.h0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import kotlin.reflect.jvm.internal.impl.builtins.functions.e;
import m80.k;
import m80.l;
import u30.f0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFunctionTypeKindExtractor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FunctionTypeKindExtractor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionTypeKindExtractor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,70:1\n1485#2:71\n1510#2,3:72\n1513#2,3:82\n1755#2,3:85\n381#3,7:75\n*S KotlinDebug\n*F\n+ 1 FunctionTypeKindExtractor.kt\norg/jetbrains/kotlin/builtins/functions/FunctionTypeKindExtractor\n*L\n32#1:71\n32#1:72,3\n32#1:82,3\n54#1:85,3\n32#1:75,7\n*E\n"})
/* loaded from: classes8.dex */
public final class f {

    /* renamed from: c, reason: collision with root package name */
    @k
    public static final a f67208c = new a(null);

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final f f67209d = new f(h0.Q(e.a.f67204e, e.d.f67207e, e.b.f67205e, e.c.f67206e));

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<e> f67210a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Map<n20.c, List<e>> f67211b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final f a() {
            return f.f67209d;
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @k
        public final e f67212a;

        /* renamed from: b, reason: collision with root package name */
        public final int f67213b;

        public b(@k e kind, int i11) {
            g0.p(kind, "kind");
            this.f67212a = kind;
            this.f67213b = i11;
        }

        @k
        public final e a() {
            return this.f67212a;
        }

        public final int b() {
            return this.f67213b;
        }

        @k
        public final e c() {
            return this.f67212a;
        }

        public boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return g0.g(this.f67212a, bVar.f67212a) && this.f67213b == bVar.f67213b;
        }

        public int hashCode() {
            return (this.f67212a.hashCode() * 31) + Integer.hashCode(this.f67213b);
        }

        @k
        public String toString() {
            return "KindWithArity(kind=" + this.f67212a + ", arity=" + this.f67213b + ')';
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(@k List<? extends e> kinds) {
        g0.p(kinds, "kinds");
        this.f67210a = kinds;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : kinds) {
            n20.c b11 = ((e) obj).b();
            Object obj2 = linkedHashMap.get(b11);
            if (obj2 == null) {
                obj2 = new ArrayList();
                linkedHashMap.put(b11, obj2);
            }
            ((List) obj2).add(obj);
        }
        this.f67211b = linkedHashMap;
    }

    @l
    public final e b(@k n20.c packageFqName, @k String className) {
        g0.p(packageFqName, "packageFqName");
        g0.p(className, "className");
        b c11 = c(packageFqName, className);
        if (c11 != null) {
            return c11.c();
        }
        return null;
    }

    @l
    public final b c(@k n20.c packageFqName, @k String className) {
        g0.p(packageFqName, "packageFqName");
        g0.p(className, "className");
        List<e> list = this.f67211b.get(packageFqName);
        if (list == null) {
            return null;
        }
        for (e eVar : list) {
            if (f0.J2(className, eVar.a(), false, 2, null)) {
                String substring = className.substring(eVar.a().length());
                g0.o(substring, "substring(...)");
                Integer d11 = d(substring);
                if (d11 != null) {
                    return new b(eVar, d11.intValue());
                }
            }
        }
        return null;
    }

    public final Integer d(String str) {
        if (str.length() == 0) {
            return null;
        }
        int length = str.length();
        int i11 = 0;
        for (int i12 = 0; i12 < length; i12++) {
            int charAt = str.charAt(i12) - '0';
            if (charAt < 0 || charAt >= 10) {
                return null;
            }
            i11 = (i11 * 10) + charAt;
        }
        return Integer.valueOf(i11);
    }
}
