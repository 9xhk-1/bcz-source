package io.ktor.server.plugins.calllogging;

import h10.r;
import h10.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Result;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import org.slf4j.MDC;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMDCEntryUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MDCEntryUtils.kt\nio/ktor/server/plugins/calllogging/MDCEntryUtilsKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Attributes.kt\nio/ktor/util/AttributesKt\n+ 5 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,54:1\n1#2:55\n1863#3,2:56\n18#4:58\n58#5,16:59\n*S KotlinDebug\n*F\n+ 1 MDCEntryUtils.kt\nio/ktor/server/plugins/calllogging/MDCEntryUtilsKt\n*L\n48#1:56,2\n53#1:58\n53#1:59,16\n*E\n"})
/* loaded from: classes8.dex */
public final class MDCEntryUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final xy.a<Map<String, String>> f61521a;

    static {
        r rVar;
        h10.d d11 = o0.d(Map.class);
        try {
            t.a aVar = t.f57954c;
            rVar = o0.i(o0.D(Map.class, aVar.e(o0.B(String.class)), aVar.e(o0.B(String.class))));
        } catch (Throwable unused) {
            rVar = null;
        }
        f61521a = new xy.a<>("io.ktor.MDCEntries", new gz.a(d11, rVar));
    }

    public static final void b(@m80.k List<j> list) {
        g0.p(list, "<this>");
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            MDC.remove(((j) it.next()).a());
        }
    }

    @m80.k
    public static final Map<String, String> c(@m80.k List<j> list, @m80.k zx.b call) {
        Object m6308constructorimpl;
        g0.p(list, "<this>");
        g0.p(call, "call");
        Map<String, String> copyOfContextMap = MDC.getCopyOfContextMap();
        if (copyOfContextMap == null) {
            copyOfContextMap = new LinkedHashMap<>();
        }
        Map map = (Map) call.getAttributes().i(f61521a, new x00.a() { // from class: io.ktor.server.plugins.calllogging.k
            @Override // x00.a
            public final Object invoke() {
                Map d11;
                d11 = MDCEntryUtilsKt.d();
                return d11;
            }
        });
        for (j jVar : list) {
            String str = (String) map.get(jVar.a());
            if (str != null) {
                copyOfContextMap.put(jVar.a(), str);
            } else {
                try {
                    Result.a aVar = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(jVar.b().invoke(call));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                if (Result.m6314isFailureimpl(m6308constructorimpl)) {
                    m6308constructorimpl = null;
                }
                String str2 = (String) m6308constructorimpl;
                if (str2 != null) {
                    copyOfContextMap.put(jVar.a(), str2);
                    map.put(jVar.a(), str2);
                }
            }
        }
        return copyOfContextMap;
    }

    public static final Map d() {
        return new LinkedHashMap();
    }

    @m80.l
    public static final Object e(@m80.k List<j> list, @m80.k zx.b bVar, @m80.k x00.l<? super j00.c<? super g2>, ? extends Object> lVar, @m80.k j00.c<? super g2> cVar) {
        Object h11 = c40.i.h(new l40.a(c(list, bVar)), new MDCEntryUtilsKt$withMDC$2(lVar, list, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }

    public static final Object f(List<j> list, zx.b bVar, x00.l<? super j00.c<? super g2>, ? extends Object> lVar, j00.c<? super g2> cVar) {
        l40.a aVar = new l40.a(c(list, bVar));
        MDCEntryUtilsKt$withMDC$2 mDCEntryUtilsKt$withMDC$2 = new MDCEntryUtilsKt$withMDC$2(lVar, list, null);
        d0.e(0);
        c40.i.h(aVar, mDCEntryUtilsKt$withMDC$2, cVar);
        d0.e(1);
        return g2.f100423a;
    }
}
