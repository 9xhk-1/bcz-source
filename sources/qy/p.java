package qy;

import a00.i0;
import a00.l1;
import androidx.collection.SieveCacheKt;
import io.ktor.http.CookieEncoding;
import ix.c0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.DeprecationLevel;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nResponseCookies.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResponseCookies.kt\nio/ktor/server/response/ResponseCookies\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,76:1\n1557#2:77\n1628#2,3:78\n295#2,2:81\n*S KotlinDebug\n*F\n+ 1 ResponseCookies.kt\nio/ktor/server/response/ResponseCookies\n*L\n20#1:77\n20#1:78,3\n21#1:81,2\n*E\n"})
/* loaded from: classes8.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final o f82755a;

    public p(@m80.k o response) {
        g0.p(response, "response");
        this.f82755a = response;
    }

    public static /* synthetic */ void c(p pVar, String str, String str2, CookieEncoding cookieEncoding, Long l11, bz.b bVar, String str3, String str4, boolean z11, boolean z12, Map map, int i11, Object obj) {
        pVar.b(str, str2, (i11 & 4) != 0 ? CookieEncoding.URI_ENCODING : cookieEncoding, (i11 & 8) != 0 ? null : l11, (i11 & 16) != 0 ? null : bVar, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & 128) != 0 ? false : z11, (i11 & 256) != 0 ? false : z12, (i11 & 512) != 0 ? l1.z() : map);
    }

    public static /* synthetic */ void e(p pVar, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        if ((i11 & 4) != 0) {
            str3 = null;
        }
        pVar.d(str, str2, str3);
    }

    public final void a(@m80.k ix.n item) {
        g0.p(item, "item");
        q.c(this.f82755a.a(), "Set-Cookie", c0.r(item), false, 4, null);
    }

    public final void b(@m80.k String name, @m80.k String value, @m80.k CookieEncoding encoding, @m80.l Long l11, @m80.l bz.b bVar, @m80.l String str, @m80.l String str2, boolean z11, boolean z12, @m80.k Map<String, String> extensions) {
        g0.p(name, "name");
        g0.p(value, "value");
        g0.p(encoding, "encoding");
        g0.p(extensions, "extensions");
        a(new ix.n(name, value, encoding, l11 != null ? Integer.valueOf((int) g10.u.C(l11.longValue(), SieveCacheKt.NodeLinkMask)) : null, bVar, str, str2, z11, z12, extensions));
    }

    @yz.n(level = DeprecationLevel.ERROR, message = "This method doesn't bypass all flags and extensions so it will be removed in future major release. Please consider using append with expires parameter instead.", replaceWith = @w0(expression = "append(name, \"\", CookieEncoding.URI_ENCODING, 0, GMTDate(), domain, path, secure, httpOnly, extensions)", imports = {}))
    public final void d(@m80.k String name, @m80.l String str, @m80.l String str2) {
        g0.p(name, "name");
        c(this, name, "", null, null, bz.b.Companion.a(), str, str2, false, false, null, 908, null);
    }

    @m80.l
    public final ix.n f(@m80.k String name) {
        Object obj;
        g0.p(name, "name");
        List<String> j11 = this.f82755a.a().j("Set-Cookie");
        ArrayList arrayList = new ArrayList(i0.d0(j11, 10));
        Iterator<T> it = j11.iterator();
        while (it.hasNext()) {
            arrayList.add(c0.p((String) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (g0.g(((ix.n) obj).t(), name)) {
                break;
            }
        }
        return (ix.n) obj;
    }
}
