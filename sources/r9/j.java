package r9;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import c40.h1;
import c40.l3;
import c40.r0;
import c40.s0;
import com.baicizhan.client.business.auth.WeixinAuthHelper;
import com.baicizhan.online.ad_property.AdExtraResp;
import com.baicizhan.online.ad_property.AdLunchWechatProgram;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import okhttp3.l;
import t50.q;
import u30.f0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final a f83727a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public static final int f83728b = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.client.business.managers.ad.AdReportHelper$Companion$reportAdHttpEvent$2", f = "AdReportHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        /* renamed from: r9.j$a$a, reason: collision with other inner class name */
        public static final class C1046a extends SuspendLambda implements x00.p<r0, j00.c<? super Result<? extends okhttp3.n>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f83729a;

            /* renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f83730b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f83731c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C1046a(String str, j00.c<? super C1046a> cVar) {
                super(2, cVar);
                this.f83731c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                C1046a c1046a = new C1046a(this.f83731c, cVar);
                c1046a.f83730b = obj;
                return c1046a;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final Object invoke2(r0 r0Var, j00.c<? super Result<okhttp3.n>> cVar) {
                return ((C1046a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f83729a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                String str = this.f83731c;
                try {
                    Result.a aVar = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(new q.a().f().b(new l.a().g().B(str).b()).execute());
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                if (Result.m6315isSuccessimpl(m6308constructorimpl)) {
                    qb.c.b("reportAdHttpEvent", "success:" + ((okhttp3.n) m6308constructorimpl), new Object[0]);
                }
                Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
                if (m6311exceptionOrNullimpl != null) {
                    qb.c.d("reportAdHttpEvent", "error:" + m6311exceptionOrNullimpl, new Object[0]);
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }

            @Override // x00.p
            public /* bridge */ /* synthetic */ Object invoke(r0 r0Var, j00.c<? super Result<? extends okhttp3.n>> cVar) {
                return invoke2(r0Var, (j00.c<? super Result<okhttp3.n>>) cVar);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.client.business.managers.ad.AdReportHelper$Companion$reportAdShow$1", f = "AdReportHelper.kt", i = {}, l = {74}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class b extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f83732a;

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f83733b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ String f83734c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(k kVar, String str, j00.c<? super b> cVar) {
                super(2, cVar);
                this.f83733b = kVar;
                this.f83734c = str;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new b(this.f83733b, this.f83734c, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i11 = this.f83732a;
                if (i11 == 0) {
                    kotlin.e.n(obj);
                    a aVar = j.f83727a;
                    k kVar = this.f83733b;
                    String str = this.f83734c;
                    this.f83732a = 1;
                    if (aVar.c(kVar, str, this) == l11) {
                        return l11;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.e.n(obj);
                }
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.client.business.managers.ad.AdReportHelper$Companion$resolveAdClickResp$1", f = "AdReportHelper.kt", i = {0, 0, 0, 0, 0}, l = {32}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-AdReportHelper$Companion$resolveAdClickResp$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nAdReportHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdReportHelper.kt\ncom/baicizhan/client/business/managers/ad/AdReportHelper$Companion$resolveAdClickResp$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1869#2,2:153\n*S KotlinDebug\n*F\n+ 1 AdReportHelper.kt\ncom/baicizhan/client/business/managers/ad/AdReportHelper$Companion$resolveAdClickResp$1\n*L\n31#1:153,2\n*E\n"})
        public static final class c extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f83735a;

            /* renamed from: b, reason: collision with root package name */
            public Object f83736b;

            /* renamed from: c, reason: collision with root package name */
            public Object f83737c;

            /* renamed from: d, reason: collision with root package name */
            public Object f83738d;

            /* renamed from: e, reason: collision with root package name */
            public Object f83739e;

            /* renamed from: f, reason: collision with root package name */
            public int f83740f;

            /* renamed from: g, reason: collision with root package name */
            public int f83741g;

            /* renamed from: h, reason: collision with root package name */
            public int f83742h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ AdExtraResp f83743i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ k f83744j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(AdExtraResp adExtraResp, k kVar, j00.c<? super c> cVar) {
                super(2, cVar);
                this.f83743i = adExtraResp;
                this.f83744j = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new c(this.f83743i, this.f83744j, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List<String> list;
                Iterator it;
                Iterable iterable;
                k kVar;
                int i11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i12 = this.f83742h;
                if (i12 == 0) {
                    kotlin.e.n(obj);
                    AdExtraResp adExtraResp = this.f83743i;
                    if (adExtraResp != null && (list = adExtraResp.click_trackers) != null) {
                        List<String> list2 = list;
                        k kVar2 = this.f83744j;
                        it = list2.iterator();
                        iterable = list2;
                        kVar = kVar2;
                        i11 = 0;
                    }
                    return g2.f100423a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f83740f;
                it = (Iterator) this.f83737c;
                kVar = (k) this.f83736b;
                iterable = (Iterable) this.f83735a;
                kotlin.e.n(obj);
                while (it.hasNext()) {
                    Object next = it.next();
                    String str = (String) next;
                    a aVar = j.f83727a;
                    g0.m(str);
                    this.f83735a = l00.k.a(iterable);
                    this.f83736b = kVar;
                    this.f83737c = it;
                    this.f83738d = l00.k.a(next);
                    this.f83739e = l00.k.a(str);
                    this.f83740f = i11;
                    this.f83741g = 0;
                    this.f83742h = 1;
                    if (aVar.c(kVar, str, this) == l11) {
                        return l11;
                    }
                }
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.client.business.managers.ad.AdReportHelper$Companion$resolveAdClickResp$2$1", f = "AdReportHelper.kt", i = {0, 0, 0, 0, 0}, l = {46}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-AdReportHelper$Companion$resolveAdClickResp$2$1$1"}, s = {"L$0", "L$4", "L$5", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nAdReportHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdReportHelper.kt\ncom/baicizhan/client/business/managers/ad/AdReportHelper$Companion$resolveAdClickResp$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1869#2,2:153\n*S KotlinDebug\n*F\n+ 1 AdReportHelper.kt\ncom/baicizhan/client/business/managers/ad/AdReportHelper$Companion$resolveAdClickResp$2$1\n*L\n45#1:153,2\n*E\n"})
        public static final class d extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f83745a;

            /* renamed from: b, reason: collision with root package name */
            public Object f83746b;

            /* renamed from: c, reason: collision with root package name */
            public Object f83747c;

            /* renamed from: d, reason: collision with root package name */
            public Object f83748d;

            /* renamed from: e, reason: collision with root package name */
            public Object f83749e;

            /* renamed from: f, reason: collision with root package name */
            public Object f83750f;

            /* renamed from: g, reason: collision with root package name */
            public int f83751g;

            /* renamed from: h, reason: collision with root package name */
            public int f83752h;

            /* renamed from: i, reason: collision with root package name */
            public int f83753i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ AdExtraResp f83754j;

            /* renamed from: k, reason: collision with root package name */
            public final /* synthetic */ a f83755k;

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ k f83756l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(AdExtraResp adExtraResp, a aVar, k kVar, j00.c<? super d> cVar) {
                super(2, cVar);
                this.f83754j = adExtraResp;
                this.f83755k = aVar;
                this.f83756l = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new d(this.f83754j, this.f83755k, this.f83756l, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((d) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                k kVar;
                Iterator it;
                Iterable iterable;
                a aVar;
                int i11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i12 = this.f83753i;
                if (i12 == 0) {
                    kotlin.e.n(obj);
                    List<String> list = this.f83754j.launch_app_trackers;
                    if (list != null) {
                        List<String> list2 = list;
                        a aVar2 = this.f83755k;
                        kVar = this.f83756l;
                        it = list2.iterator();
                        iterable = list2;
                        aVar = aVar2;
                        i11 = 0;
                    }
                    return g2.f100423a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f83751g;
                it = (Iterator) this.f83748d;
                kVar = (k) this.f83747c;
                aVar = (a) this.f83746b;
                iterable = (Iterable) this.f83745a;
                kotlin.e.n(obj);
                while (it.hasNext()) {
                    Object next = it.next();
                    String str = (String) next;
                    g0.m(str);
                    this.f83745a = l00.k.a(iterable);
                    this.f83746b = aVar;
                    this.f83747c = kVar;
                    this.f83748d = it;
                    this.f83749e = l00.k.a(next);
                    this.f83750f = l00.k.a(str);
                    this.f83751g = i11;
                    this.f83752h = 0;
                    this.f83753i = 1;
                    if (aVar.c(kVar, str, this) == l11) {
                        return l11;
                    }
                }
                return g2.f100423a;
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.client.business.managers.ad.AdReportHelper$Companion$resolveAdClickResp$4", f = "AdReportHelper.kt", i = {0, 0, 0, 0, 0}, l = {63}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-AdReportHelper$Companion$resolveAdClickResp$4$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
        @u0({"SMAP\nAdReportHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AdReportHelper.kt\ncom/baicizhan/client/business/managers/ad/AdReportHelper$Companion$resolveAdClickResp$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,152:1\n1869#2,2:153\n*S KotlinDebug\n*F\n+ 1 AdReportHelper.kt\ncom/baicizhan/client/business/managers/ad/AdReportHelper$Companion$resolveAdClickResp$4\n*L\n62#1:153,2\n*E\n"})
        public static final class e extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public Object f83757a;

            /* renamed from: b, reason: collision with root package name */
            public Object f83758b;

            /* renamed from: c, reason: collision with root package name */
            public Object f83759c;

            /* renamed from: d, reason: collision with root package name */
            public Object f83760d;

            /* renamed from: e, reason: collision with root package name */
            public Object f83761e;

            /* renamed from: f, reason: collision with root package name */
            public int f83762f;

            /* renamed from: g, reason: collision with root package name */
            public int f83763g;

            /* renamed from: h, reason: collision with root package name */
            public int f83764h;

            /* renamed from: i, reason: collision with root package name */
            public final /* synthetic */ AdExtraResp f83765i;

            /* renamed from: j, reason: collision with root package name */
            public final /* synthetic */ k f83766j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(AdExtraResp adExtraResp, k kVar, j00.c<? super e> cVar) {
                super(2, cVar);
                this.f83765i = adExtraResp;
                this.f83766j = kVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new e(this.f83765i, this.f83766j, cVar);
            }

            @Override // x00.p
            public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                return ((e) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Iterator it;
                Iterable iterable;
                k kVar;
                int i11;
                Object l11 = kotlin.coroutines.intrinsics.b.l();
                int i12 = this.f83764h;
                if (i12 == 0) {
                    kotlin.e.n(obj);
                    List<String> list = this.f83765i.launch_wechat_program_trackers;
                    if (list != null) {
                        List<String> list2 = list;
                        k kVar2 = this.f83766j;
                        it = list2.iterator();
                        iterable = list2;
                        kVar = kVar2;
                        i11 = 0;
                    }
                    return g2.f100423a;
                }
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i11 = this.f83762f;
                it = (Iterator) this.f83759c;
                kVar = (k) this.f83758b;
                iterable = (Iterable) this.f83757a;
                kotlin.e.n(obj);
                while (it.hasNext()) {
                    Object next = it.next();
                    String str = (String) next;
                    a aVar = j.f83727a;
                    g0.m(str);
                    this.f83757a = l00.k.a(iterable);
                    this.f83758b = kVar;
                    this.f83759c = it;
                    this.f83760d = l00.k.a(next);
                    this.f83761e = l00.k.a(str);
                    this.f83762f = i11;
                    this.f83763g = 0;
                    this.f83764h = 1;
                    if (aVar.c(kVar, str, this) == l11) {
                        return l11;
                    }
                }
                return g2.f100423a;
            }
        }

        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        @m80.k
        public final k b(float f11, float f12, float f13, float f14) {
            return new k(0L, 0L, 0, 0, f11, f12, f13, f14, null, null, 783, null);
        }

        public final Object c(k kVar, String str, j00.c<? super g2> cVar) {
            qb.c.b("reportAdHttpEvent", "adReportModel:" + kVar, new Object[0]);
            String z22 = f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(f0.z2(str, "__TS__", String.valueOf(kVar.p()), false, 4, null), "__TS__", String.valueOf(kVar.p()), false, 4, null), "__MS_EVENT_SEC__", String.valueOf(kVar.q()), false, 4, null), "__MS_EVENT_MSEC__", String.valueOf(kVar.p()), false, 4, null), "__PHEIGHT__", String.valueOf(kVar.u()), false, 4, null), "__PWIDTH__", String.valueOf(kVar.v()), false, 4, null), "__HEIGHT__", String.valueOf(kVar.u()), false, 4, null), "__WIDTH__", String.valueOf(kVar.v()), false, 4, null), "__DOWN_MX__", String.valueOf(kVar.m()), false, 4, null), "__DOWN_MY__", String.valueOf(kVar.n()), false, 4, null), "__UP_MX__", String.valueOf(kVar.s()), false, 4, null), "__UP_MY__", String.valueOf(kVar.t()), false, 4, null), "__DOWN_PX__", String.valueOf(kVar.m()), false, 4, null), "__DOWN_PY__", String.valueOf(kVar.n()), false, 4, null), "__UP_PX__", String.valueOf(kVar.s()), false, 4, null), "__UP_PY__", String.valueOf(kVar.t()), false, 4, null), "__AUCTION_DX__", String.valueOf(kVar.m()), false, 4, null), "__AUCTION_DY__", String.valueOf(kVar.n()), false, 4, null), "__AUCTION_UX__", String.valueOf(kVar.s()), false, 4, null), "__AUCTION_UY__", String.valueOf(kVar.t()), false, 4, null), "__UA__", kVar.r(), false, 4, null), "__TIMESTAMP__", String.valueOf(kVar.q()), false, 4, null), "__EVENTTIME__", String.valueOf(kVar.p()), false, 4, null), "__AUCTION_PRICE__", kVar.o(), false, 4, null), "${AUCTION_PRICE}", kVar.o(), false, 4, null);
            qb.c.b("reportAdHttpEvent", String.valueOf(z22), new Object[0]);
            Object h11 = c40.i.h(h1.c(), new C1046a(z22, null), cVar);
            return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : g2.f100423a;
        }

        public final void d(@m80.k k adReportModel, @m80.k String urlStr) {
            g0.p(adReportModel, "adReportModel");
            g0.p(urlStr, "urlStr");
            c40.k.f(s0.a(h1.c().plus(l3.c(null, 1, null))), null, null, new b(adReportModel, urlStr, null), 3, null);
        }

        public final boolean e(@m80.k Context context, int i11, @m80.l AdExtraResp adExtraResp, @m80.k k reportModel) {
            g0.p(context, "context");
            g0.p(reportModel, "reportModel");
            r0 a11 = s0.a(h1.c().plus(l3.c(null, 1, null)));
            c40.k.f(a11, null, null, new c(adExtraResp, reportModel, null), 3, null);
            if (i11 != 1 && i11 != 2) {
                if ((adExtraResp != null ? adExtraResp.launch_app : null) != null && adExtraResp.launch_app.deeplink != null) {
                    try {
                        Result.a aVar = Result.Companion;
                        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(adExtraResp.launch_app.deeplink));
                        intent.addFlags(268435456);
                        context.startActivity(intent);
                        c40.k.f(a11, null, null, new d(adExtraResp, this, reportModel, null), 3, null);
                        return true;
                    } catch (Throwable th2) {
                        Result.a aVar2 = Result.Companion;
                        if (Result.m6311exceptionOrNullimpl(Result.m6308constructorimpl(kotlin.e.a(th2))) != null) {
                            return false;
                        }
                    }
                }
                if ((adExtraResp != null ? adExtraResp.launch_wechat_program : null) != null) {
                    WeixinAuthHelper A = WeixinAuthHelper.A();
                    AdLunchWechatProgram adLunchWechatProgram = adExtraResp.launch_wechat_program;
                    A.D(context, adLunchWechatProgram.program_id, adLunchWechatProgram.program_path, Integer.valueOf(adLunchWechatProgram.program_type));
                    c40.k.f(a11, null, null, new e(adExtraResp, reportModel, null), 3, null);
                    return true;
                }
            }
            return false;
        }

        public a() {
        }
    }
}
