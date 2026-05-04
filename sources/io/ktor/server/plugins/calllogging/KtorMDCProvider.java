package io.ktor.server.plugins.calllogging;

import h10.r;
import java.util.List;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import kotlin.jvm.internal.u0;
import kotlin.jvm.internal.v;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMDCProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MDCProvider.kt\nio/ktor/server/plugins/calllogging/KtorMDCProvider\n+ 2 MDCEntryUtils.kt\nio/ktor/server/plugins/calllogging/MDCEntryUtilsKt\n+ 3 Attributes.kt\nio/ktor/util/AttributesKt\n+ 4 Type.kt\nio/ktor/util/reflect/TypeKt\n*L\n1#1,24:1\n20#2,8:25\n18#3:33\n58#4,16:34\n*S KotlinDebug\n*F\n+ 1 MDCProvider.kt\nio/ktor/server/plugins/calllogging/KtorMDCProvider\n*L\n17#1:25,8\n21#1:33\n21#1:34,16\n*E\n"})
/* loaded from: classes8.dex */
public final class KtorMDCProvider implements iy.c {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final a f61518b = new a(0 == true ? 1 : 0);

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public static final xy.a<KtorMDCProvider> f61519c;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final List<j> f61520a;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @m80.k
        public final xy.a<KtorMDCProvider> a() {
            return KtorMDCProvider.f61519c;
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        r rVar = null;
        h10.d d11 = o0.d(KtorMDCProvider.class);
        try {
            rVar = o0.B(KtorMDCProvider.class);
        } catch (Throwable unused) {
        }
        f61519c = new xy.a<>("KtorMDCProvider", new gz.a(d11, rVar));
    }

    public KtorMDCProvider(@m80.k List<j> entries) {
        g0.p(entries, "entries");
        this.f61520a = entries;
    }

    @Override // iy.c
    @m80.l
    public Object a(@m80.k zx.b bVar, @m80.k x00.l<? super j00.c<? super g2>, ? extends Object> lVar, @m80.k j00.c<? super g2> cVar) {
        List<j> list = this.f61520a;
        Object h11 = c40.i.h(new l40.a(MDCEntryUtilsKt.c(list, bVar)), new KtorMDCProvider$withMDCBlock$$inlined$withMDC$1(lVar, list, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
    }
}
