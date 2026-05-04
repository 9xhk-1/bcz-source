package zj;

import a00.r0;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Stable;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
@u0({"SMAP\nGuideController.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GuideController.kt\ncom/baicizhan/platform/base/guide/GuideController\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,94:1\n1869#2,2:95\n*S KotlinDebug\n*F\n+ 1 GuideController.kt\ncom/baicizhan/platform/base/guide/GuideController\n*L\n56#1:95,2\n*E\n"})
/* loaded from: classes6.dex */
public final class f {

    /* renamed from: d, reason: collision with root package name */
    public static final int f102721d = 0;

    /* renamed from: a, reason: collision with root package name */
    @m80.l
    public final a f102722a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public SnapshotStateList<d> f102723b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final Map<d, j00.c<g2>> f102724c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface a {
        void a(@m80.k d dVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final void a() {
        Iterator<T> it = this.f102724c.values().iterator();
        while (it.hasNext()) {
            j00.c cVar = (j00.c) it.next();
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(kotlin.e.a(new CancellationException("Hint was dismissed"))));
        }
        this.f102724c.clear();
        this.f102723b.clear();
    }

    @m80.l
    public final d b() {
        return (d) r0.L2(this.f102723b);
    }

    public final void c(@m80.k d hint) {
        g0.p(hint, "hint");
        j00.c<g2> cVar = this.f102724c.get(hint);
        if (cVar != null) {
            Result.a aVar = Result.Companion;
            cVar.resumeWith(Result.m6308constructorimpl(g2.f100423a));
            this.f102724c.remove(hint);
        }
        this.f102723b.remove(hint);
        a aVar2 = this.f102722a;
        if (aVar2 != null) {
            aVar2.a(hint);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @m80.l
    public final Object d(@m80.k List<d> list, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        this.f102724c.put(r0.u3(list), gVar);
        this.f102723b.addAll(list);
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @m80.l
    public final Object e(@m80.k d dVar, @m80.k j00.c<? super g2> cVar) {
        j00.g gVar = new j00.g(IntrinsicsKt__IntrinsicsJvmKt.e(cVar));
        this.f102724c.put(dVar, gVar);
        this.f102723b.add(dVar);
        Object b11 = gVar.b();
        if (b11 == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return b11 == kotlin.coroutines.intrinsics.b.l() ? b11 : g2.f100423a;
    }

    @m80.l
    public final Object f(@m80.k d[] dVarArr, @m80.k j00.c<? super g2> cVar) {
        Object d11 = d(a00.a0.dz(dVarArr), cVar);
        return d11 == kotlin.coroutines.intrinsics.b.l() ? d11 : g2.f100423a;
    }

    public f(@m80.l a aVar) {
        this.f102722a = aVar;
        this.f102723b = SnapshotStateKt.mutableStateListOf();
        this.f102724c = new LinkedHashMap();
    }

    public /* synthetic */ f(a aVar, int i11, kotlin.jvm.internal.v vVar) {
        this((i11 & 1) != 0 ? null : aVar);
    }
}
