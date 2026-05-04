package com.baicizhan.main.home.plan;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.MutableLiveData;
import c40.l3;
import com.baicizhan.client.business.auth.WeixinAuthHelper;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.webview.BczWebExecutorKt;
import com.baicizhan.main.home.plan.data.WordBanner;
import com.baicizhan.online.ad_property.AdExtraResp;
import com.baicizhan.online.ad_property.AdLunchWechatProgram;
import com.baicizhan.online.advertise_api.BottomAdvInfos;
import com.baicizhan.online.advertise_api.MainViewBottomAdv;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import okhttp3.l;
import t50.q;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@kotlin.jvm.internal.u0({"SMAP\nWordPlanViewModelHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,381:1\n360#2,7:382\n1869#2,2:390\n360#2,7:392\n1878#2,3:399\n1573#2:403\n1604#2,4:404\n360#2,7:409\n808#2,11:416\n1573#2:427\n1604#2,4:428\n360#2,7:432\n1878#2,3:439\n360#2,7:442\n1869#2,2:449\n1878#2,3:451\n808#2,11:454\n1573#2:465\n1604#2,4:466\n1583#2,11:471\n1878#2,2:482\n1880#2:485\n1594#2:486\n1878#2,3:487\n1#3:389\n1#3:484\n35#4:402\n47#4:408\n35#4:470\n*S KotlinDebug\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt\n*L\n165#1:382,7\n168#1:390,2\n212#1:392,7\n223#1:399,3\n265#1:403\n265#1:404,4\n278#1:409,7\n291#1:416,11\n292#1:427\n292#1:428,4\n301#1:432,7\n304#1:439,3\n309#1:442,7\n313#1:449,2\n316#1:451,3\n326#1:454,11\n329#1:465\n329#1:466,4\n336#1:471,11\n336#1:482,2\n336#1:485\n336#1:486\n374#1:487,3\n336#1:484\n249#1:402\n274#1:408\n335#1:470\n*E\n"})
/* loaded from: classes4.dex */
public final class k3 {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModelHelperKt$reportAdHttpEvent$2", f = "WordPlanViewModelHelper.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Result<? extends okhttp3.n>>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22445a;

        /* renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22446b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f22447c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, j00.c<? super a> cVar) {
            super(2, cVar);
            this.f22447c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            a aVar = new a(this.f22447c, cVar);
            aVar.f22446b = obj;
            return aVar;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(c40.r0 r0Var, j00.c<? super Result<okhttp3.n>> cVar) {
            return ((a) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object m6308constructorimpl;
            kotlin.coroutines.intrinsics.b.l();
            if (this.f22445a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
            String str = this.f22447c;
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
        public /* bridge */ /* synthetic */ Object invoke(c40.r0 r0Var, j00.c<? super Result<? extends okhttp3.n>> cVar) {
            return invoke2(r0Var, (j00.c<? super Result<okhttp3.n>>) cVar);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModelHelperKt$reportAdShow$1", f = "WordPlanViewModelHelper.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f22448a;

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ mg.a f22449b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f22450c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(mg.a aVar, String str, j00.c<? super b> cVar) {
            super(2, cVar);
            this.f22449b = aVar;
            this.f22450c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new b(this.f22449b, this.f22450c, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f22448a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                mg.a aVar = this.f22449b;
                String str = this.f22450c;
                this.f22448a = 1;
                if (k3.r(aVar, str, this) == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModelHelperKt$resolveAdClickResp$1", f = "WordPlanViewModelHelper.kt", i = {0, 0, 0, 0, 0}, l = {113}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-WordPlanViewModelHelperKt$resolveAdClickResp$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordPlanViewModelHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt$resolveAdClickResp$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1869#2,2:382\n*S KotlinDebug\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt$resolveAdClickResp$1\n*L\n112#1:382,2\n*E\n"})
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22451a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22452b;

        /* renamed from: c, reason: collision with root package name */
        public Object f22453c;

        /* renamed from: d, reason: collision with root package name */
        public Object f22454d;

        /* renamed from: e, reason: collision with root package name */
        public Object f22455e;

        /* renamed from: f, reason: collision with root package name */
        public int f22456f;

        /* renamed from: g, reason: collision with root package name */
        public int f22457g;

        /* renamed from: h, reason: collision with root package name */
        public int f22458h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ AdExtraResp f22459i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ mg.a f22460j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AdExtraResp adExtraResp, mg.a aVar, j00.c<? super c> cVar) {
            super(2, cVar);
            this.f22459i = adExtraResp;
            this.f22460j = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new c(this.f22459i, this.f22460j, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<String> list;
            Iterator it;
            Iterable iterable;
            mg.a aVar;
            int i11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f22458h;
            if (i12 == 0) {
                kotlin.e.n(obj);
                AdExtraResp adExtraResp = this.f22459i;
                if (adExtraResp != null && (list = adExtraResp.click_trackers) != null) {
                    List<String> list2 = list;
                    mg.a aVar2 = this.f22460j;
                    it = list2.iterator();
                    iterable = list2;
                    aVar = aVar2;
                    i11 = 0;
                }
                return yz.g2.f100423a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f22456f;
            it = (Iterator) this.f22453c;
            aVar = (mg.a) this.f22452b;
            iterable = (Iterable) this.f22451a;
            kotlin.e.n(obj);
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                kotlin.jvm.internal.g0.m(str);
                this.f22451a = l00.k.a(iterable);
                this.f22452b = aVar;
                this.f22453c = it;
                this.f22454d = l00.k.a(next);
                this.f22455e = l00.k.a(str);
                this.f22456f = i11;
                this.f22457g = 0;
                this.f22458h = 1;
                if (k3.r(aVar, str, this) == l11) {
                    return l11;
                }
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModelHelperKt$resolveAdClickResp$2$1", f = "WordPlanViewModelHelper.kt", i = {0, 0, 0, 0, 0}, l = {124}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-WordPlanViewModelHelperKt$resolveAdClickResp$2$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordPlanViewModelHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt$resolveAdClickResp$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1869#2,2:382\n*S KotlinDebug\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt$resolveAdClickResp$2$1\n*L\n123#1:382,2\n*E\n"})
    public static final class d extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22461a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22462b;

        /* renamed from: c, reason: collision with root package name */
        public Object f22463c;

        /* renamed from: d, reason: collision with root package name */
        public Object f22464d;

        /* renamed from: e, reason: collision with root package name */
        public Object f22465e;

        /* renamed from: f, reason: collision with root package name */
        public int f22466f;

        /* renamed from: g, reason: collision with root package name */
        public int f22467g;

        /* renamed from: h, reason: collision with root package name */
        public int f22468h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ AdExtraResp f22469i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ mg.a f22470j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AdExtraResp adExtraResp, mg.a aVar, j00.c<? super d> cVar) {
            super(2, cVar);
            this.f22469i = adExtraResp;
            this.f22470j = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new d(this.f22469i, this.f22470j, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((d) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Iterable iterable;
            mg.a aVar;
            int i11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f22468h;
            if (i12 == 0) {
                kotlin.e.n(obj);
                List<String> list = this.f22469i.launch_app_trackers;
                if (list != null) {
                    List<String> list2 = list;
                    mg.a aVar2 = this.f22470j;
                    it = list2.iterator();
                    iterable = list2;
                    aVar = aVar2;
                    i11 = 0;
                }
                return yz.g2.f100423a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f22466f;
            it = (Iterator) this.f22463c;
            aVar = (mg.a) this.f22462b;
            iterable = (Iterable) this.f22461a;
            kotlin.e.n(obj);
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                kotlin.jvm.internal.g0.m(str);
                this.f22461a = l00.k.a(iterable);
                this.f22462b = aVar;
                this.f22463c = it;
                this.f22464d = l00.k.a(next);
                this.f22465e = l00.k.a(str);
                this.f22466f = i11;
                this.f22467g = 0;
                this.f22468h = 1;
                if (k3.r(aVar, str, this) == l11) {
                    return l11;
                }
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModelHelperKt$resolveAdClickResp$3$1", f = "WordPlanViewModelHelper.kt", i = {0, 0, 0, 0, 0}, l = {133}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-WordPlanViewModelHelperKt$resolveAdClickResp$3$1$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordPlanViewModelHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt$resolveAdClickResp$3$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1869#2,2:382\n*S KotlinDebug\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt$resolveAdClickResp$3$1\n*L\n132#1:382,2\n*E\n"})
    public static final class e extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22471a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22472b;

        /* renamed from: c, reason: collision with root package name */
        public Object f22473c;

        /* renamed from: d, reason: collision with root package name */
        public Object f22474d;

        /* renamed from: e, reason: collision with root package name */
        public Object f22475e;

        /* renamed from: f, reason: collision with root package name */
        public int f22476f;

        /* renamed from: g, reason: collision with root package name */
        public int f22477g;

        /* renamed from: h, reason: collision with root package name */
        public int f22478h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ AdExtraResp f22479i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ mg.a f22480j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(AdExtraResp adExtraResp, mg.a aVar, j00.c<? super e> cVar) {
            super(2, cVar);
            this.f22479i = adExtraResp;
            this.f22480j = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new e(this.f22479i, this.f22480j, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((e) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Iterable iterable;
            mg.a aVar;
            int i11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f22478h;
            if (i12 == 0) {
                kotlin.e.n(obj);
                List<String> list = this.f22479i.launch_app_trackers;
                if (list != null) {
                    List<String> list2 = list;
                    mg.a aVar2 = this.f22480j;
                    it = list2.iterator();
                    iterable = list2;
                    aVar = aVar2;
                    i11 = 0;
                }
                return yz.g2.f100423a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f22476f;
            it = (Iterator) this.f22473c;
            aVar = (mg.a) this.f22472b;
            iterable = (Iterable) this.f22471a;
            kotlin.e.n(obj);
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                kotlin.jvm.internal.g0.m(str);
                this.f22471a = l00.k.a(iterable);
                this.f22472b = aVar;
                this.f22473c = it;
                this.f22474d = l00.k.a(next);
                this.f22475e = l00.k.a(str);
                this.f22476f = i11;
                this.f22477g = 0;
                this.f22478h = 1;
                if (k3.r(aVar, str, this) == l11) {
                    return l11;
                }
            }
            return yz.g2.f100423a;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.home.plan.WordPlanViewModelHelperKt$resolveAdClickResp$4", f = "WordPlanViewModelHelper.kt", i = {0, 0, 0, 0, 0}, l = {147}, m = "invokeSuspend", n = {"$this$forEach$iv", "element$iv", "it", "$i$f$forEach", "$i$a$-forEach-WordPlanViewModelHelperKt$resolveAdClickResp$4$1"}, s = {"L$0", "L$3", "L$4", "I$0", "I$1"}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nWordPlanViewModelHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt$resolveAdClickResp$4\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,381:1\n1869#2,2:382\n*S KotlinDebug\n*F\n+ 1 WordPlanViewModelHelper.kt\ncom/baicizhan/main/home/plan/WordPlanViewModelHelperKt$resolveAdClickResp$4\n*L\n146#1:382,2\n*E\n"})
    public static final class f extends SuspendLambda implements x00.p<c40.r0, j00.c<? super yz.g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public Object f22481a;

        /* renamed from: b, reason: collision with root package name */
        public Object f22482b;

        /* renamed from: c, reason: collision with root package name */
        public Object f22483c;

        /* renamed from: d, reason: collision with root package name */
        public Object f22484d;

        /* renamed from: e, reason: collision with root package name */
        public Object f22485e;

        /* renamed from: f, reason: collision with root package name */
        public int f22486f;

        /* renamed from: g, reason: collision with root package name */
        public int f22487g;

        /* renamed from: h, reason: collision with root package name */
        public int f22488h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ AdExtraResp f22489i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ mg.a f22490j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AdExtraResp adExtraResp, mg.a aVar, j00.c<? super f> cVar) {
            super(2, cVar);
            this.f22489i = adExtraResp;
            this.f22490j = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<yz.g2> create(Object obj, j00.c<?> cVar) {
            return new f(this.f22489i, this.f22490j, cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super yz.g2> cVar) {
            return ((f) create(r0Var, cVar)).invokeSuspend(yz.g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Iterator it;
            Iterable iterable;
            mg.a aVar;
            int i11;
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i12 = this.f22488h;
            if (i12 == 0) {
                kotlin.e.n(obj);
                List<String> list = this.f22489i.launch_wechat_program_trackers;
                if (list != null) {
                    List<String> list2 = list;
                    mg.a aVar2 = this.f22490j;
                    it = list2.iterator();
                    iterable = list2;
                    aVar = aVar2;
                    i11 = 0;
                }
                return yz.g2.f100423a;
            }
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i11 = this.f22486f;
            it = (Iterator) this.f22483c;
            aVar = (mg.a) this.f22482b;
            iterable = (Iterable) this.f22481a;
            kotlin.e.n(obj);
            while (it.hasNext()) {
                Object next = it.next();
                String str = (String) next;
                kotlin.jvm.internal.g0.m(str);
                this.f22481a = l00.k.a(iterable);
                this.f22482b = aVar;
                this.f22483c = it;
                this.f22484d = l00.k.a(next);
                this.f22485e = l00.k.a(str);
                this.f22486f = i11;
                this.f22487g = 0;
                this.f22488h = 1;
                if (k3.r(aVar, str, this) == l11) {
                    return l11;
                }
            }
            return yz.g2.f100423a;
        }
    }

    public static final boolean g(@m80.k MutableLiveData<List<Object>> mutableLiveData, @m80.k List<mg.g> items) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<this>");
        kotlin.jvm.internal.g0.p(items, "items");
        List<Object> value = mutableLiveData.getValue();
        if (value == null) {
            qb.c.i(a3.f21907x, "error item null", new Object[0]);
            return false;
        }
        if (items.isEmpty()) {
            qb.c.i(a3.f21907x, "server ad is offline", new Object[0]);
            return a00.m0.N0(value, new x00.l() { // from class: com.baicizhan.main.home.plan.e3
                @Override // x00.l
                public final Object invoke(Object obj) {
                    boolean h11;
                    h11 = k3.h(obj);
                    return Boolean.valueOf(h11);
                }
            });
        }
        Iterator<Object> it = value.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next() instanceof mg.g) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        int intValue = valueOf.intValue();
        qb.c.i(a3.f21907x, "index of item ad ->%d", Integer.valueOf(intValue));
        Boolean bool = null;
        if (intValue == -1) {
            valueOf = null;
        }
        if (valueOf != null) {
            int intValue2 = valueOf.intValue();
            qb.c.i(a3.f21907x, "3 ->%d %d", Integer.valueOf(value.size()), Integer.valueOf(intValue2));
            if (value.size() - intValue2 != items.size()) {
                valueOf = null;
            }
            if (valueOf != null) {
                List<Object> subList = value.subList(valueOf.intValue(), value.size());
                kotlin.jvm.internal.g0.n(subList, "null cannot be cast to non-null type kotlin.collections.List<com.baicizhan.main.home.plan.data.WordAdCard>");
                if (subList != null) {
                    Iterator<T> it2 = subList.iterator();
                    int i12 = 0;
                    while (true) {
                        if (!it2.hasNext()) {
                            qb.c.i(a3.f21907x, "local ad and server ad is same", new Object[0]);
                            bool = Boolean.FALSE;
                            break;
                        }
                        Object next = it2.next();
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            a00.h0.b0();
                        }
                        mg.g gVar = (mg.g) next;
                        if (!kotlin.jvm.internal.g0.g(gVar.i(), items.get(i12).i())) {
                            qb.c.i(a3.f21907x, "replace local ad local %s, server %s", gVar.i(), items.get(i12).i());
                            break;
                        }
                        i12 = i13;
                    }
                    if (bool != null) {
                        return bool.booleanValue();
                    }
                }
            }
        }
        a00.m0.N0(value, new x00.l() { // from class: com.baicizhan.main.home.plan.f3
            @Override // x00.l
            public final Object invoke(Object obj) {
                boolean i14;
                i14 = k3.i(obj);
                return Boolean.valueOf(i14);
            }
        });
        value.addAll(items);
        qb.c.i(a3.f21907x, "replace ad", new Object[0]);
        return true;
    }

    public static final boolean h(Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it instanceof mg.g;
    }

    public static final boolean i(Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it instanceof mg.g;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v3, types: [T, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v4, types: [T, java.util.ArrayList, java.util.Collection] */
    public static final boolean j(@m80.k MutableLiveData<List<Object>> mutableLiveData, @m80.k BottomAdvInfos adInfo) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        Object obj;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        kotlin.jvm.internal.g0.p(mutableLiveData, "<this>");
        kotlin.jvm.internal.g0.p(adInfo, "adInfo");
        List<Object> value = mutableLiveData.getValue();
        if (value != null) {
            List<Object> list = value;
            if (com.baicizhan.base.a.a(KotlinExtKt.getGlobalApplicationContext())) {
                if (a00.m0.N0(list, new x00.l() { // from class: com.baicizhan.main.home.plan.g3
                    @Override // x00.l
                    public final Object invoke(Object obj2) {
                        boolean k11;
                        k11 = k3.k(obj2);
                        return Boolean.valueOf(k11);
                    }
                })) {
                    qb.c.i(a3.f21907x, "Care mode: removed all ads from home page", new Object[0]);
                }
                z12 = false;
                z13 = false;
                z14 = false;
                z11 = true;
            } else {
                List<Object> list2 = list;
                Iterator<T> it = list2.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (obj instanceof mg.b) {
                        break;
                    }
                }
                mg.b bVar = obj instanceof mg.b ? (mg.b) obj : null;
                List<mg.g> d11 = bVar != null ? bVar.d() : null;
                List<MainViewBottomAdv> list3 = adInfo.carousel_banner;
                if (list3 != null) {
                    List<MainViewBottomAdv> list4 = list3;
                    arrayList = new ArrayList(a00.i0.d0(list4, 10));
                    int i12 = 0;
                    for (Object obj2 : list4) {
                        int i13 = i12 + 1;
                        if (i12 < 0) {
                            a00.h0.b0();
                        }
                        MainViewBottomAdv mainViewBottomAdv = (MainViewBottomAdv) obj2;
                        String id2 = mainViewBottomAdv.f28141id;
                        kotlin.jvm.internal.g0.o(id2, "id");
                        String img_url = mainViewBottomAdv.img_url;
                        kotlin.jvm.internal.g0.o(img_url, "img_url");
                        arrayList.add(new mg.g(id2, img_url, mainViewBottomAdv.link, i13, mainViewBottomAdv.ad_resp));
                        i12 = i13;
                    }
                } else {
                    arrayList = null;
                }
                z11 = true;
                if (p(d11, arrayList)) {
                    z13 = false;
                } else {
                    qb.c.i(a3.f21907x, "update carousal ad", new Object[0]);
                    a00.m0.N0(list, new x00.l() { // from class: com.baicizhan.main.home.plan.h3
                        @Override // x00.l
                        public final Object invoke(Object obj3) {
                            boolean m11;
                            m11 = k3.m(obj3);
                            return Boolean.valueOf(m11);
                        }
                    });
                    if (arrayList != null && arrayList.size() > 0) {
                        mg.b bVar2 = new mg.b(arrayList);
                        Iterator<Object> it2 = list.iterator();
                        int i14 = 0;
                        while (true) {
                            if (!it2.hasNext()) {
                                i14 = -1;
                                break;
                            }
                            if (it2.next() instanceof mg.e) {
                                break;
                            }
                            i14++;
                        }
                        if (i14 < 0) {
                            list.add(bVar2);
                        } else {
                            list.add(i14, bVar2);
                        }
                    }
                    z13 = true;
                }
                ArrayList arrayList4 = new ArrayList();
                for (Object obj3 : list2) {
                    if (obj3 instanceof mg.g) {
                        arrayList4.add(obj3);
                    }
                }
                List<MainViewBottomAdv> list5 = adInfo.horizontal_banner;
                if (list5 != null) {
                    List<MainViewBottomAdv> list6 = list5;
                    arrayList2 = new ArrayList(a00.i0.d0(list6, 10));
                    int i15 = 0;
                    for (Object obj4 : list6) {
                        int i16 = i15 + 1;
                        if (i15 < 0) {
                            a00.h0.b0();
                        }
                        MainViewBottomAdv mainViewBottomAdv2 = (MainViewBottomAdv) obj4;
                        String id3 = mainViewBottomAdv2.f28141id;
                        kotlin.jvm.internal.g0.o(id3, "id");
                        String img_url2 = mainViewBottomAdv2.img_url;
                        kotlin.jvm.internal.g0.o(img_url2, "img_url");
                        arrayList2.add(new mg.g(id3, img_url2, mainViewBottomAdv2.link, i16, mainViewBottomAdv2.ad_resp));
                        i15 = i16;
                    }
                } else {
                    arrayList2 = null;
                }
                if (p(arrayList4, arrayList2)) {
                    z14 = false;
                } else {
                    qb.c.i(a3.f21907x, "update horizontal ad", new Object[0]);
                    a00.m0.N0(list, new x00.l() { // from class: com.baicizhan.main.home.plan.i3
                        @Override // x00.l
                        public final Object invoke(Object obj5) {
                            boolean n11;
                            n11 = k3.n(obj5);
                            return Boolean.valueOf(n11);
                        }
                    });
                    Iterator<Object> it3 = list.iterator();
                    int i17 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            i17 = -1;
                            break;
                        }
                        if (it3.next() instanceof mg.b) {
                            break;
                        }
                        i17++;
                    }
                    if (i17 <= 0) {
                        Iterator<Object> it4 = list.iterator();
                        int i18 = 0;
                        while (true) {
                            if (!it4.hasNext()) {
                                i11 = -1;
                                break;
                            }
                            if (it4.next() instanceof mg.e) {
                                i11 = i18;
                                break;
                            }
                            i18++;
                        }
                        if (i11 < 0) {
                            if (arrayList2 != null) {
                                Iterator it5 = arrayList2.iterator();
                                while (it5.hasNext()) {
                                    list.add((mg.g) it5.next());
                                }
                            }
                        } else if (arrayList2 != null) {
                            int i19 = 0;
                            for (Object obj5 : arrayList2) {
                                int i21 = i19 + 1;
                                if (i19 < 0) {
                                    a00.h0.b0();
                                }
                                list.add(i19 + i11, (mg.g) obj5);
                                i19 = i21;
                            }
                        }
                    } else if (arrayList2 != null) {
                        int i22 = 0;
                        for (Object obj6 : arrayList2) {
                            int i23 = i22 + 1;
                            if (i22 < 0) {
                                a00.h0.b0();
                            }
                            list.add(i22 + i17 + 1, (mg.g) obj6);
                            i22 = i23;
                        }
                    }
                    z14 = true;
                }
                ArrayList arrayList5 = new ArrayList();
                for (Object obj7 : list2) {
                    if (obj7 instanceof mg.c) {
                        arrayList5.add(obj7);
                    }
                }
                List<MainViewBottomAdv> list7 = adInfo.grid_ad;
                if (list7 != null) {
                    List<MainViewBottomAdv> list8 = list7;
                    arrayList3 = new ArrayList(a00.i0.d0(list8, 10));
                    int i24 = 0;
                    for (Object obj8 : list8) {
                        int i25 = i24 + 1;
                        if (i24 < 0) {
                            a00.h0.b0();
                        }
                        MainViewBottomAdv mainViewBottomAdv3 = (MainViewBottomAdv) obj8;
                        String id4 = mainViewBottomAdv3.f28141id;
                        kotlin.jvm.internal.g0.o(id4, "id");
                        String img_url3 = mainViewBottomAdv3.img_url;
                        kotlin.jvm.internal.g0.o(img_url3, "img_url");
                        arrayList3.add(new mg.g(id4, img_url3, mainViewBottomAdv3.link, i25, mainViewBottomAdv3.ad_resp));
                        i24 = i25;
                    }
                } else {
                    arrayList3 = null;
                }
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = a00.h0.J();
                if (arrayList3 != null) {
                    ?? arrayList6 = new ArrayList();
                    int i26 = 0;
                    for (Object obj9 : arrayList3) {
                        int i27 = i26 + 1;
                        if (i26 < 0) {
                            a00.h0.b0();
                        }
                        mg.c cVar = (i26 % 2 != 0 || i27 >= arrayList3.size()) ? null : new mg.c(a00.h0.Q((mg.g) obj9, arrayList3.get(i27)));
                        if (cVar != null) {
                            arrayList6.add(cVar);
                        }
                        i26 = i27;
                    }
                    objectRef.element = arrayList6;
                }
                if (p(arrayList5, (List) objectRef.element)) {
                    z12 = false;
                } else {
                    qb.c.i(a3.f21907x, "update grid ad", new Object[0]);
                    a00.m0.N0(list, new x00.l() { // from class: com.baicizhan.main.home.plan.j3
                        @Override // x00.l
                        public final Object invoke(Object obj10) {
                            boolean l11;
                            l11 = k3.l(obj10);
                            return Boolean.valueOf(l11);
                        }
                    });
                    list.addAll((Collection) objectRef.element);
                    z12 = true;
                }
            }
        } else {
            z11 = true;
            z12 = false;
            z13 = false;
            z14 = false;
        }
        if (z13 || z14 || z12) {
            return z11;
        }
        return false;
    }

    public static final boolean k(Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return (it instanceof mg.b) || (it instanceof mg.d) || (it instanceof mg.c) || (it instanceof mg.g);
    }

    public static final boolean l(Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it instanceof mg.c;
    }

    public static final boolean m(Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it instanceof mg.b;
    }

    public static final boolean n(Object it) {
        kotlin.jvm.internal.g0.p(it, "it");
        return it instanceof mg.g;
    }

    public static final boolean o(@m80.k MutableLiveData<List<Object>> mutableLiveData, @m80.l WordBanner wordBanner) {
        Object obj;
        kotlin.jvm.internal.g0.p(mutableLiveData, "<this>");
        List<Object> value = mutableLiveData.getValue();
        if (value != null) {
            Iterator<T> it = value.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (obj instanceof WordBanner) {
                    break;
                }
            }
            if (obj != null) {
                WordBanner wordBanner2 = (WordBanner) obj;
                if (wordBanner != null) {
                    if ((kotlin.jvm.internal.g0.g(wordBanner2.getId(), wordBanner.getId()) ? wordBanner : null) != null) {
                        return false;
                    }
                }
                value.remove(wordBanner2);
                if (wordBanner != null) {
                    value.add(0, wordBanner);
                }
                return true;
            }
            if (wordBanner != null) {
                value.add(0, wordBanner);
                return true;
            }
        }
        return false;
    }

    public static final boolean p(@m80.l List<?> list, @m80.l List<?> list2) {
        List<?> list3;
        List<?> list4;
        List<?> list5 = list;
        if ((list5 == null || list5.isEmpty()) && ((list3 = list2) == null || list3.isEmpty())) {
            return true;
        }
        if (list5 == null || list5.isEmpty() || (list4 = list2) == null || list4.isEmpty() || list.size() != list2.size()) {
            return false;
        }
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                a00.h0.b0();
            }
            if (!kotlin.jvm.internal.g0.g(obj, list.get(i11))) {
                return false;
            }
            i11 = i12;
        }
        return true;
    }

    public static final void q(@m80.k mg.g item) {
        kotlin.jvm.internal.g0.p(item, "item");
        HashMap hashMap = new HashMap();
        hashMap.put("id", item.i());
        hashMap.put("adv_id", item.i());
        hashMap.put("idx", Integer.valueOf(item.k()));
        yz.g2 g2Var = yz.g2.f100423a;
        ma.l.e(ma.t.f73010i, ma.a.f72757h2, hashMap);
    }

    @m80.l
    public static final Object r(@m80.k mg.a aVar, @m80.k String str, @m80.k j00.c<? super yz.g2> cVar) {
        qb.c.b("reportAdHttpEvent", "adReportModel:" + aVar, new Object[0]);
        String z22 = u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(u30.f0.z2(str, "__TS__", String.valueOf(aVar.p()), false, 4, null), "__TS__", String.valueOf(aVar.p()), false, 4, null), "__MS_EVENT_SEC__", String.valueOf(aVar.q()), false, 4, null), "__MS_EVENT_MSEC__", String.valueOf(aVar.p()), false, 4, null), "__PHEIGHT__", String.valueOf(aVar.u()), false, 4, null), "__PWIDTH__", String.valueOf(aVar.v()), false, 4, null), "__HEIGHT__", String.valueOf(aVar.u()), false, 4, null), "__WIDTH__", String.valueOf(aVar.v()), false, 4, null), "__DOWN_MX__", String.valueOf(aVar.m()), false, 4, null), "__DOWN_MY__", String.valueOf(aVar.n()), false, 4, null), "__UP_MX__", String.valueOf(aVar.s()), false, 4, null), "__UP_MY__", String.valueOf(aVar.t()), false, 4, null), "__DOWN_PX__", String.valueOf(aVar.m()), false, 4, null), "__DOWN_PY__", String.valueOf(aVar.n()), false, 4, null), "__UP_PX__", String.valueOf(aVar.s()), false, 4, null), "__UP_PY__", String.valueOf(aVar.t()), false, 4, null), "__AUCTION_DX__", String.valueOf(aVar.m()), false, 4, null), "__AUCTION_DY__", String.valueOf(aVar.n()), false, 4, null), "__AUCTION_UX__", String.valueOf(aVar.s()), false, 4, null), "__AUCTION_UY__", String.valueOf(aVar.t()), false, 4, null), "__UA__", aVar.r(), false, 4, null), "__TIMESTAMP__", String.valueOf(aVar.q()), false, 4, null), "__EVENTTIME__", String.valueOf(aVar.p()), false, 4, null), "__AUCTION_PRICE__", aVar.o(), false, 4, null), "${AUCTION_PRICE}", aVar.o(), false, 4, null);
        qb.c.b("reportAdHttpEvent", String.valueOf(z22), new Object[0]);
        Object h11 = c40.i.h(c40.h1.c(), new a(z22, null), cVar);
        return h11 == kotlin.coroutines.intrinsics.b.l() ? h11 : yz.g2.f100423a;
    }

    public static final void s(@m80.k mg.a adReportModel, @m80.k String urlStr) {
        kotlin.jvm.internal.g0.p(adReportModel, "adReportModel");
        kotlin.jvm.internal.g0.p(urlStr, "urlStr");
        c40.k.f(c40.s0.a(c40.h1.c().plus(l3.c(null, 1, null))), null, null, new b(adReportModel, urlStr, null), 3, null);
    }

    public static final void t(@m80.k MutableLiveData<List<Object>> mutableLiveData) {
        Object obj;
        kotlin.jvm.internal.g0.p(mutableLiveData, "<this>");
        List<Object> value = mutableLiveData.getValue();
        if (value == null || (obj = value.get(0)) == null) {
            return;
        }
        if (!(obj instanceof WordBanner)) {
            obj = null;
        }
        if (obj != null) {
            v((WordBanner) obj);
        }
    }

    public static final void u(@m80.k WordBanner banner) {
        kotlin.jvm.internal.g0.p(banner, "banner");
        HashMap hashMap = new HashMap();
        hashMap.put("id", banner.getId());
        hashMap.put("adv_id", banner.getId());
        yz.g2 g2Var = yz.g2.f100423a;
        ma.l.e(ma.t.f73010i, ma.a.f72743f2, hashMap);
    }

    public static final void v(@m80.k WordBanner banner) {
        kotlin.jvm.internal.g0.p(banner, "banner");
        HashMap hashMap = new HashMap();
        hashMap.put("id", banner.getId());
        hashMap.put("adv_id", banner.getId());
        yz.g2 g2Var = yz.g2.f100423a;
        ma.l.e(ma.t.f73010i, ma.a.f72736e2, hashMap);
    }

    public static final void w(@m80.k MutableLiveData<List<Object>> mutableLiveData) {
        kotlin.jvm.internal.g0.p(mutableLiveData, "<this>");
        List<Object> value = mutableLiveData.getValue();
        if (value != null) {
            Iterator<Object> it = value.iterator();
            int i11 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i11 = -1;
                    break;
                } else if (it.next() instanceof mg.g) {
                    break;
                } else {
                    i11++;
                }
            }
            Integer valueOf = Integer.valueOf(i11);
            if (valueOf.intValue() == -1) {
                valueOf = null;
            }
            if (valueOf != null) {
                List<Object> subList = value.subList(valueOf.intValue(), value.size());
                kotlin.jvm.internal.g0.n(subList, "null cannot be cast to non-null type kotlin.collections.List<com.baicizhan.main.home.plan.data.WordAdCard>");
                if (subList != null) {
                    Iterator<T> it2 = subList.iterator();
                    while (it2.hasNext()) {
                        x((mg.g) it2.next());
                    }
                }
            }
        }
    }

    public static final void x(@m80.k mg.g wordAdCard) {
        kotlin.jvm.internal.g0.p(wordAdCard, "wordAdCard");
        HashMap hashMap = new HashMap();
        hashMap.put("id", wordAdCard.i());
        hashMap.put("adv_id", wordAdCard.i());
        yz.g2 g2Var = yz.g2.f100423a;
        ma.l.e(ma.t.f73010i, ma.a.f72750g2, hashMap);
    }

    public static final void y(@m80.k Context context, @m80.l AdExtraResp adExtraResp, @m80.l String str, @m80.k mg.a reportModel) {
        Object m6308constructorimpl;
        c40.l2 f11;
        kotlin.jvm.internal.g0.p(context, "context");
        kotlin.jvm.internal.g0.p(reportModel, "reportModel");
        c40.r0 a11 = c40.s0.a(c40.h1.c().plus(l3.c(null, 1, null)));
        c40.k.f(a11, null, null, new c(adExtraResp, reportModel, null), 3, null);
        if ((adExtraResp != null ? adExtraResp.launch_app : null) == null || adExtraResp.launch_app.deeplink == null) {
            if ((adExtraResp != null ? adExtraResp.launch_wechat_program : null) == null) {
                BczWebExecutorKt.startNormalWeb$default(context, str, null, false, 0, null, 60, null);
                return;
            }
            WeixinAuthHelper A = WeixinAuthHelper.A();
            AdLunchWechatProgram adLunchWechatProgram = adExtraResp.launch_wechat_program;
            A.D(context, adLunchWechatProgram.program_id, adLunchWechatProgram.program_path, null);
            c40.k.f(a11, null, null, new f(adExtraResp, reportModel, null), 3, null);
            return;
        }
        try {
            Result.a aVar = Result.Companion;
            Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(adExtraResp.launch_app.deeplink));
            intent.addFlags(268435456);
            context.startActivity(intent);
            f11 = c40.k.f(a11, null, null, new d(adExtraResp, reportModel, null), 3, null);
            m6308constructorimpl = Result.m6308constructorimpl(f11);
        } catch (Throwable th2) {
            Result.a aVar2 = Result.Companion;
            m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
        }
        Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6308constructorimpl);
        if (m6311exceptionOrNullimpl != null) {
            Intent intent2 = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(str));
            intent2.addFlags(268435456);
            context.startActivity(intent2);
            c40.k.f(a11, null, null, new e(adExtraResp, reportModel, null), 3, null);
            qb.c.q("resolveAdClickResp", "startActivity error:" + m6311exceptionOrNullimpl.getMessage(), new Object[0]);
        }
        Result.m6307boximpl(m6308constructorimpl);
    }
}
