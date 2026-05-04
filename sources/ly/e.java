package ly;

import a00.i0;
import io.ktor.http.BadContentTypeFormatException;
import io.ktor.server.plugins.BadRequestException;
import ix.m0;
import ix.x0;
import ix.y0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nContentNegotiationUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContentNegotiationUtils.kt\nio/ktor/server/plugins/contentnegotiation/ContentNegotiationUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,37:1\n1557#2:38\n1628#2,3:39\n1755#2,3:42\n*S KotlinDebug\n*F\n+ 1 ContentNegotiationUtils.kt\nio/ktor/server/plugins/contentnegotiation/ContentNegotiationUtilsKt\n*L\n24#1:38\n24#1:39,3\n35#1:42,3\n*E\n"})
/* loaded from: classes8.dex */
public final class e {
    public static final boolean a(@k List<f> acceptItems, @l ix.k kVar) {
        g0.p(acceptItems, "acceptItems");
        if (acceptItems.isEmpty() || kVar == null) {
            return true;
        }
        List<f> list = acceptItems;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (kVar.h(((f) it.next()).e())) {
                return true;
            }
        }
        return false;
    }

    @k
    public static final List<f> b(@k zx.b bVar) {
        g0.p(bVar, "<this>");
        String r11 = py.e.r(bVar.f(), y0.f63006a.d());
        try {
            List<m0> f11 = x0.f(r11);
            ArrayList arrayList = new ArrayList(i0.d0(f11, 10));
            for (m0 m0Var : f11) {
                arrayList.add(new f(ix.k.f62843f.b(m0Var.g()), m0Var.f()));
            }
            return arrayList;
        } catch (BadContentTypeFormatException e11) {
            throw new BadRequestException("Illegal Accept header format: " + r11, e11);
        }
    }
}
