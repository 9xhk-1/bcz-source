package vw;

import a00.r0;
import ix.b2;
import ix.n;
import ix.t2;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nConstantCookiesStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ConstantCookiesStorage.kt\nio/ktor/client/plugins/cookies/ConstantCookiesStorage\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,21:1\n11165#2:22\n11500#2,3:23\n774#3:26\n865#3,2:27\n*S KotlinDebug\n*F\n+ 1 ConstantCookiesStorage.kt\nio/ktor/client/plugins/cookies/ConstantCookiesStorage\n*L\n13#1:22\n13#1:23,3\n15#1:26\n15#1:27,2\n*E\n"})
/* loaded from: classes8.dex */
public final class e implements f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<n> f94293a;

    public e(@k n... cookies) {
        g0.p(cookies, "cookies");
        ArrayList arrayList = new ArrayList(cookies.length);
        for (n nVar : cookies) {
            arrayList.add(g.b(nVar, new b2(null, null, 0, null, null, null, null, null, false, 511, null).b()));
        }
        this.f94293a = r0.a6(arrayList);
    }

    @Override // vw.f
    @l
    public Object U2(@k t2 t2Var, @k n nVar, @k j00.c<? super g2> cVar) {
        return g2.f100423a;
    }

    @Override // vw.f
    @l
    public Object e7(@k t2 t2Var, @k j00.c<? super List<n>> cVar) {
        List<n> list = this.f94293a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (g.c((n) obj, t2Var)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
    }
}
