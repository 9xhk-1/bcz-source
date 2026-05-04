package ow;

import c40.a0;
import c40.l2;
import c40.n2;
import c40.q0;
import cx.z;
import io.ktor.http.UnsafeHeaderException;
import ix.y0;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import ow.n;
import ow.u;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHttpClientEngine.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngineKt\n+ 2 Utils.kt\nio/ktor/client/engine/UtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,163:1\n95#2,11:164\n774#3:175\n865#3,2:176\n18#4:178\n58#5,16:179\n*S KotlinDebug\n*F\n+ 1 HttpClientEngine.kt\nio/ktor/client/engine/HttpClientEngineKt\n*L\n146#1:164,11\n156#1:175\n156#1:176,2\n19#1:178\n19#1:179,16\n*E\n"})
/* loaded from: classes8.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final q0 f78455a = new q0("call-context");

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final xy.a<lw.j<?>> f78456b;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a<T> implements l<T> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ l<T> f78457a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ x00.l<T, g2> f78458b;

        /* JADX WARN: Multi-variable type inference failed */
        public a(l<? extends T> lVar, x00.l<? super T, g2> lVar2) {
            this.f78457a = lVar;
            this.f78458b = lVar2;
        }

        public static final g2 c(x00.l lVar, x00.l lVar2, j create) {
            g0.p(create, "$this$create");
            lVar.invoke(create);
            lVar2.invoke(create);
            return g2.f100423a;
        }

        @Override // ow.l
        public ow.a a(final x00.l<? super T, g2> block) {
            g0.p(block, "block");
            l<T> lVar = this.f78457a;
            final x00.l<T, g2> lVar2 = this.f78458b;
            return lVar.a(new x00.l() { // from class: ow.m
                @Override // x00.l
                public final Object invoke(Object obj) {
                    g2 c11;
                    c11 = n.a.c(x00.l.this, block, (j) obj);
                    return c11;
                }
            });
        }
    }

    static {
        h10.r rVar;
        h10.d d11 = o0.d(lw.j.class);
        try {
            rVar = o0.C(lw.j.class, h10.t.f57954c.c());
        } catch (Throwable unused) {
            rVar = null;
        }
        f78456b = new xy.a<>("client-config", new gz.a(d11, rVar));
    }

    @m80.k
    public static final <T extends j> l<T> b(@m80.k l<? extends T> lVar, @m80.k x00.l<? super T, g2> nested) {
        g0.p(lVar, "<this>");
        g0.p(nested, "nested");
        return new a(lVar, nested);
    }

    @m80.l
    public static final Object c(@m80.k ow.a aVar, @m80.k l2 l2Var, @m80.k j00.c<? super kotlin.coroutines.d> cVar) {
        a0 a11 = n2.a(l2Var);
        kotlin.coroutines.d plus = aVar.getCoroutineContext().plus(a11).plus(f78455a);
        l2 l2Var2 = (l2) cVar.getContext().get(l2.f7886e0);
        if (l2Var2 == null) {
            return plus;
        }
        a11.z0(new u.a(l2.a.g(l2Var2, true, false, new u.b(a11), 2, null)));
        return plus;
    }

    @m80.k
    public static final q0 d() {
        return f78455a;
    }

    @m80.k
    public static final xy.a<lw.j<?>> e() {
        return f78456b;
    }

    public static final void f(z zVar) {
        Set<String> names = zVar.e().names();
        ArrayList arrayList = new ArrayList();
        for (Object obj : names) {
            if (y0.f63006a.J0().contains((String) obj)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            throw new UnsafeHeaderException(arrayList.toString());
        }
    }
}
