package mx;

import io.ktor.http.content.VersionCheckResult;
import ix.q0;
import ix.r0;
import ix.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.u0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nVersions.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Versions.kt\nio/ktor/http/content/LastModifiedVersion\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,261:1\n1755#2,3:262\n1734#2,3:265\n774#2:268\n865#2,2:269\n1611#2,9:271\n1863#2:280\n1864#2:282\n1620#2:283\n1#3:281\n1#3:284\n*S KotlinDebug\n*F\n+ 1 Versions.kt\nio/ktor/http/content/LastModifiedVersion\n*L\n96#1:262,3\n103#1:265,3\n111#1:268\n111#1:269,2\n112#1:271,9\n112#1:280\n112#1:282\n112#1:283\n112#1:281\n*E\n"})
/* loaded from: classes8.dex */
public final class q implements e0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final bz.b f73820a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final bz.b f73821b;

    public q(@m80.k bz.b lastModified) {
        kotlin.jvm.internal.g0.p(lastModified, "lastModified");
        this.f73820a = lastModified;
        this.f73821b = bz.a.e(lastModified);
    }

    public static /* synthetic */ q e(q qVar, bz.b bVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            bVar = qVar.f73820a;
        }
        return qVar.d(bVar);
    }

    @Override // mx.e0
    @m80.k
    public VersionCheckResult a(@m80.k q0 requestHeaders) {
        kotlin.jvm.internal.g0.p(requestHeaders, "requestHeaders");
        y0 y0Var = y0.f63006a;
        List<String> a11 = requestHeaders.a(y0Var.S());
        List<bz.b> i11 = a11 != null ? i(a11) : null;
        if (i11 != null && !g(i11)) {
            return VersionCheckResult.NOT_MODIFIED;
        }
        List<String> a12 = requestHeaders.a(y0Var.W());
        List<bz.b> i12 = a12 != null ? i(a12) : null;
        return (i12 == null || h(i12)) ? VersionCheckResult.OK : VersionCheckResult.PRECONDITION_FAILED;
    }

    @Override // mx.e0
    public void b(@m80.k r0 builder) {
        kotlin.jvm.internal.g0.p(builder, "builder");
        builder.d(y0.f63006a.X(), ix.e0.d(this.f73820a));
    }

    @m80.k
    public final bz.b c() {
        return this.f73820a;
    }

    @m80.k
    public final q d(@m80.k bz.b lastModified) {
        kotlin.jvm.internal.g0.p(lastModified, "lastModified");
        return new q(lastModified);
    }

    public boolean equals(@m80.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q) && kotlin.jvm.internal.g0.g(this.f73820a, ((q) obj).f73820a);
    }

    @m80.k
    public final bz.b f() {
        return this.f73820a;
    }

    public final boolean g(@m80.k List<bz.b> dates) {
        kotlin.jvm.internal.g0.p(dates, "dates");
        List<bz.b> list = dates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.f73821b.compareTo((bz.b) it.next()) > 0) {
                return true;
            }
        }
        return false;
    }

    public final boolean h(@m80.k List<bz.b> dates) {
        kotlin.jvm.internal.g0.p(dates, "dates");
        List<bz.b> list = dates;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (this.f73821b.compareTo((bz.b) it.next()) > 0) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.f73820a.hashCode();
    }

    public final List<bz.b> i(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!k0.O3((String) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            bz.b bVar = null;
            if (!it.hasNext()) {
                break;
            }
            try {
                bVar = ix.e0.b((String) it.next());
            } catch (Throwable unused) {
            }
            if (bVar != null) {
                arrayList2.add(bVar);
            }
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    @m80.k
    public String toString() {
        return "LastModifiedVersion(lastModified=" + this.f73820a + ')';
    }
}
