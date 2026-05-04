package sd;

import a00.l1;
import android.app.Application;
import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import c40.h1;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.util.FileUtils;
import com.baicizhan.client.business.util.KotlinExtKt;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.main.activity.daka.datasource.g;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.user_study_api.DakaBackgroundCategoryInfo;
import com.baicizhan.online.user_study_api.DakaShareBonusResult;
import com.baicizhan.online.user_study_api.UserStudyApiService;
import com.jiongji.andriod.card.R;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import k3.x2;
import kotlin.Result;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nImageDakaV2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDakaV2ViewModel.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/ImageDakaV2ViewModel\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 BizSdk.kt\ncom/baicizhan/app/biz/BizSdk\n+ 4 SdkContext.kt\ncom/baicizhan/app/biz/context/SdkContextKt\n+ 5 Koin.kt\norg/koin/core/Koin\n+ 6 Scope.kt\norg/koin/core/scope/Scope\n*L\n1#1,252:1\n1#2:253\n10#3:254\n43#4:255\n124#5,4:256\n142#6:260\n*S KotlinDebug\n*F\n+ 1 ImageDakaV2ViewModel.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/ImageDakaV2ViewModel\n*L\n79#1:254\n79#1:255\n79#1:256,4\n79#1:260\n*E\n"})
/* loaded from: classes4.dex */
public final class u0 extends AndroidViewModel {

    /* renamed from: q, reason: collision with root package name */
    @m80.k
    public static final a f88336q = new a(null);

    /* renamed from: r, reason: collision with root package name */
    public static final int f88337r = 8;

    /* renamed from: s, reason: collision with root package name */
    @m80.k
    public static final String f88338s = "ImageDakaV2ViewModel";

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ObservableInt f88339a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f88340b;

    /* renamed from: c, reason: collision with root package name */
    @m80.k
    public final LiveData<Boolean> f88341c;

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<List<Integer>> f88342d;

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public final LiveData<List<Integer>> f88343e;

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<String> f88344f;

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public final LiveData<String> f88345g;

    /* renamed from: h, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<DakaShareBonusResult> f88346h;

    /* renamed from: i, reason: collision with root package name */
    @m80.k
    public final LiveData<DakaShareBonusResult> f88347i;

    /* renamed from: j, reason: collision with root package name */
    @m80.l
    public qb0.h f88348j;

    /* renamed from: k, reason: collision with root package name */
    @m80.l
    public qb0.h f88349k;

    /* renamed from: l, reason: collision with root package name */
    @m80.l
    public qb0.h f88350l;

    /* renamed from: m, reason: collision with root package name */
    @m80.l
    public g.j f88351m;

    /* renamed from: n, reason: collision with root package name */
    @m80.l
    public pd.d f88352n;

    /* renamed from: o, reason: collision with root package name */
    @m80.l
    public String f88353o;

    /* renamed from: p, reason: collision with root package name */
    @m80.k
    public final yz.c0 f88354p;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.v vVar) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.ImageDakaV2ViewModel$shareSuccess$1", f = "ImageDakaV2ViewModel.kt", i = {}, l = {184}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    public static final class c extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f88357a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        @l00.d(c = "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.ImageDakaV2ViewModel$shareSuccess$1$shareResult$1", f = "ImageDakaV2ViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {}, v = 1)
        public static final class a extends SuspendLambda implements x00.p<c40.r0, j00.c<? super Result<? extends DakaShareBonusResult>>, Object> {

            /* renamed from: a, reason: collision with root package name */
            public int f88359a;

            public a(j00.c<? super a> cVar) {
                super(2, cVar);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                return new a(cVar);
            }

            @Override // x00.p
            public final Object invoke(c40.r0 r0Var, j00.c<? super Result<? extends DakaShareBonusResult>> cVar) {
                return ((a) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object m6308constructorimpl;
                kotlin.coroutines.intrinsics.b.l();
                if (this.f88359a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
                try {
                    DakaShareBonusResult share_bonus = ((UserStudyApiService.Client) new com.baicizhan.client.business.thrift.l("/rpc/user_study").a()).share_bonus(System.currentTimeMillis());
                    String str = share_bonus.actionUrl;
                    if (str != null && share_bonus.status == 1) {
                        Uri parse = Uri.parse(str);
                        String str2 = "bonus" + parse.getHost() + parse.getPath();
                        int i11 = nc.b.b().getInt(str2, 0);
                        if (i11 >= 3) {
                            share_bonus.actionUrl = null;
                            share_bonus.action = null;
                            share_bonus.extraTip = null;
                        } else {
                            nc.b.b().m(str2, i11 + 1);
                        }
                    }
                    if (share_bonus.action == null) {
                        share_bonus.action = KotlinExtKt.getString(R.string.bonus_dialog_default_action);
                    }
                    qb.c.b(u0.f88338s, "share result status is " + share_bonus.status + ", msg is " + share_bonus.message, new Object[0]);
                    Result.a aVar = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(share_bonus);
                } catch (Exception e11) {
                    qb.c.d(u0.f88338s, "share_bonus error : " + e11.getMessage(), new Object[0]);
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(e11));
                }
                return Result.m6307boximpl(m6308constructorimpl);
            }
        }

        public c(j00.c<? super c> cVar) {
            super(2, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return u0.this.new c(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((c) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = kotlin.coroutines.intrinsics.b.l();
            int i11 = this.f88357a;
            if (i11 == 0) {
                kotlin.e.n(obj);
                c40.m0 c11 = h1.c();
                a aVar = new a(null);
                this.f88357a = 1;
                obj = c40.i.h(c11, aVar, this);
                if (obj == l11) {
                    return l11;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.e.n(obj);
            }
            Object m6317unboximpl = ((Result) obj).m6317unboximpl();
            u0 u0Var = u0.this;
            if (Result.m6315isSuccessimpl(m6317unboximpl)) {
                u0Var.f88346h.postValue((DakaShareBonusResult) m6317unboximpl);
            }
            Throwable m6311exceptionOrNullimpl = Result.m6311exceptionOrNullimpl(m6317unboximpl);
            if (m6311exceptionOrNullimpl != null) {
                KotlinExtKt.showToast(m6311exceptionOrNullimpl);
            }
            return g2.f100423a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(@m80.k Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        this.f88339a = new ObservableInt(2);
        MutableLiveData<Boolean> mutableLiveData = new MutableLiveData<>();
        this.f88340b = mutableLiveData;
        this.f88341c = mutableLiveData;
        MutableLiveData<List<Integer>> mutableLiveData2 = new MutableLiveData<>();
        this.f88342d = mutableLiveData2;
        this.f88343e = mutableLiveData2;
        MutableLiveData<String> mutableLiveData3 = new MutableLiveData<>();
        this.f88344f = mutableLiveData3;
        this.f88345g = mutableLiveData3;
        MutableLiveData<DakaShareBonusResult> mutableLiveData4 = new MutableLiveData<>();
        this.f88346h = mutableLiveData4;
        this.f88347i = mutableLiveData4;
        this.f88354p = yz.e0.c(new x00.a() { // from class: sd.k0
            @Override // x00.a
            public final Object invoke() {
                k3.r0 N;
                N = u0.N(u0.this);
                return N;
            }
        });
    }

    public static final g2 J(u0 u0Var, String str) {
        u0Var.f88344f.postValue(str);
        return g2.f100423a;
    }

    public static final void K(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void L(Throwable th2) {
        qb.c.d(f88338s, "getSharedFilePath error : " + th2.getMessage(), new Object[0]);
    }

    public static final k3.r0 N(u0 u0Var) {
        dd.h.g(u0Var.getApplication());
        return (k3.r0) ((x2) c4.j.f7801a.a().P().h().i(kotlin.jvm.internal.o0.d(k3.r0.class), null, null));
    }

    public static final g2 S(Boolean bool) {
        return g2.f100423a;
    }

    public static final void T(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void U(Throwable th2) {
        qb.c.d(f88338s, "shareSuccess request error : " + th2.getMessage(), new Object[0]);
    }

    public static final g2 r(u0 u0Var, Boolean bool) {
        u0Var.f88340b.postValue(bool);
        return g2.f100423a;
    }

    public static final void s(x00.l lVar, Object obj) {
        lVar.invoke(obj);
    }

    public static final void t(Throwable th2) {
        qb.c.d(f88338s, "checkNewYear error : " + th2.getMessage(), new Object[0]);
    }

    @m80.l
    public final pd.d A() {
        return this.f88352n;
    }

    public final k3.r0 B() {
        return (k3.r0) this.f88354p.getValue();
    }

    @m80.k
    public final LiveData<DakaShareBonusResult> C() {
        return this.f88347i;
    }

    @m80.k
    public final LiveData<String> D() {
        return this.f88345g;
    }

    @m80.k
    public final LiveData<Boolean> F() {
        return this.f88341c;
    }

    @m80.k
    public final ObservableInt G() {
        return this.f88339a;
    }

    public final int H(@m80.k DakaBackgroundCategoryInfo dakaBackgroundCategoryInfo) {
        kotlin.jvm.internal.g0.p(dakaBackgroundCategoryInfo, "<this>");
        String name = dakaBackgroundCategoryInfo.getName();
        if (name == null) {
            return -1;
        }
        switch (name.hashCode()) {
            case -982450867:
                return name.equals(pd.a.f80334d) ? 1 : -1;
            case -178324674:
                return !name.equals("calendar") ? -1 : 3;
            case 106642994:
                return !name.equals("photo") ? -1 : 2;
            case 1349333177:
                return !name.equals(pd.a.f80338h) ? -1 : 5;
            case 1509946825:
                return !name.equals(pd.a.f80339i) ? -1 : 6;
            default:
                return -1;
        }
    }

    public final void I() {
        rx.c<String> c11;
        pd.d dVar = this.f88352n;
        if (dVar == null || (c11 = dVar.c()) == null) {
            return;
        }
        final x00.l lVar = new x00.l() { // from class: sd.o0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 J;
                J = u0.J(u0.this, (String) obj);
                return J;
            }
        };
        c11.u5(new wb0.b() { // from class: sd.p0
            @Override // wb0.b
            public final void call(Object obj) {
                u0.K(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: sd.q0
            @Override // wb0.b
            public final void call(Object obj) {
                u0.L((Throwable) obj);
            }
        });
    }

    public final void M() {
        y();
    }

    public final void O(@m80.l String str) {
        this.f88353o = str;
    }

    public final void P(@m80.l g.j jVar) {
        this.f88351m = jVar;
    }

    public final void Q(@m80.l pd.d dVar) {
        this.f88352n = dVar;
    }

    public final void R(@m80.k ShareChannel channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        pd.d dVar = this.f88352n;
        String d11 = dVar != null ? dVar.d() : null;
        qb.c.b(f88338s, "shareSuccess,type -> " + d11 + ",id -> " + this.f88353o, new Object[0]);
        pd.d dVar2 = this.f88352n;
        ma.l.e(ma.t.f73003b, ma.a.f72712b, l1.W(yz.h1.a(ma.b.X0, dVar2 != null ? dVar2.d() : null), yz.h1.a(ma.b.Y0, this.f88353o), yz.h1.a(ma.b.Z0, channel.toString())));
        if (channel == ShareChannel.SAVE_PHOTO) {
            KotlinExtKt.showToast(KotlinExtKt.getToStr(R.string.daka_share_save_image_success));
            return;
        }
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new c(null), 3, null);
        qb0.h hVar = this.f88350l;
        if (hVar != null) {
            qb0.h hVar2 = hVar.isUnsubscribed() ? null : hVar;
            if (hVar2 != null) {
                hVar2.unsubscribe();
            }
        }
        rx.c<Boolean> v11 = com.baicizhan.main.activity.daka.datasource.g.n().v(channel);
        final x00.l lVar = new x00.l() { // from class: sd.l0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 S;
                S = u0.S((Boolean) obj);
                return S;
            }
        };
        this.f88350l = v11.u5(new wb0.b() { // from class: sd.m0
            @Override // wb0.b
            public final void call(Object obj) {
                u0.T(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: sd.n0
            @Override // wb0.b
            public final void call(Object obj) {
                u0.U((Throwable) obj);
            }
        });
    }

    public final void V(@m80.k String contentId) {
        kotlin.jvm.internal.g0.p(contentId, "contentId");
        if (contentId.length() <= 0 || !kotlin.jvm.internal.g0.g(contentId, this.f88353o)) {
            this.f88353o = contentId;
            u();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        com.baicizhan.main.activity.daka.datasource.g.n().u();
    }

    public final void q() {
        qb0.h hVar = this.f88349k;
        if (hVar != null) {
            if (hVar.isUnsubscribed()) {
                hVar = null;
            }
            if (hVar != null) {
                hVar.unsubscribe();
            }
        }
        rx.c<Boolean> f11 = th.e.f();
        final x00.l lVar = new x00.l() { // from class: sd.r0
            @Override // x00.l
            public final Object invoke(Object obj) {
                g2 r11;
                r11 = u0.r(u0.this, (Boolean) obj);
                return r11;
            }
        };
        this.f88349k = f11.u5(new wb0.b() { // from class: sd.s0
            @Override // wb0.b
            public final void call(Object obj) {
                u0.s(x00.l.this, obj);
            }
        }, new wb0.b() { // from class: sd.t0
            @Override // wb0.b
            public final void call(Object obj) {
                u0.t((Throwable) obj);
            }
        });
    }

    public final void start() {
        y();
    }

    public final void u() {
        pd.d dVar = this.f88352n;
        String d11 = dVar != null ? dVar.d() : null;
        qb.c.b(f88338s, "exposure,type -> " + d11 + ",id -> " + this.f88353o, new Object[0]);
        pd.d dVar2 = this.f88352n;
        ma.l.e(ma.t.f73003b, ma.a.f72808o4, l1.W(yz.h1.a(ma.b.X0, dVar2 != null ? dVar2.d() : null), yz.h1.a(ma.b.Y0, this.f88353o)));
    }

    public final void v(@m80.k ShareChannel channel) {
        kotlin.jvm.internal.g0.p(channel, "channel");
        pd.d dVar = this.f88352n;
        String d11 = dVar != null ? dVar.d() : null;
        qb.c.b(f88338s, "doShareClickReport,type -> " + d11 + ",id -> " + this.f88353o, new Object[0]);
        pd.d dVar2 = this.f88352n;
        ma.l.e(ma.t.f73003b, ma.a.f72815p4, l1.W(yz.h1.a(ma.b.X0, dVar2 != null ? dVar2.d() : null), yz.h1.a(ma.b.Y0, this.f88353o), yz.h1.a(ma.b.Z0, channel.toString())));
    }

    @m80.l
    public final String w() {
        return this.f88353o;
    }

    @m80.k
    public final LiveData<List<Integer>> x() {
        return this.f88343e;
    }

    public final void y() {
        c40.k.f(ViewModelKt.getViewModelScope(this), null, null, new b(null), 3, null);
    }

    @m80.l
    public final g.j z() {
        return this.f88351m;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @l00.d(c = "com.baicizhan.main.activity.daka.imagedaka.imagedakav2.ImageDakaV2ViewModel$getData$1", f = "ImageDakaV2ViewModel.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {}, v = 1)
    @kotlin.jvm.internal.u0({"SMAP\nImageDakaV2ViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageDakaV2ViewModel.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/ImageDakaV2ViewModel$getData$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,252:1\n1#2:253\n35#3:254\n1563#4:255\n1634#4,3:256\n774#4:259\n865#4,2:260\n*S KotlinDebug\n*F\n+ 1 ImageDakaV2ViewModel.kt\ncom/baicizhan/main/activity/daka/imagedaka/imagedakav2/ImageDakaV2ViewModel$getData$1\n*L\n130#1:254\n142#1:255\n142#1:256,3\n144#1:259\n144#1:260,2\n*E\n"})
    public static final class b extends SuspendLambda implements x00.p<c40.r0, j00.c<? super g2>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f88355a;

        public b(j00.c<? super b> cVar) {
            super(2, cVar);
        }

        public static final Boolean D(String str) {
            File baicizhanFile = PathUtil.getBaicizhanFile(str);
            return baicizhanFile != null ? Boolean.valueOf(FileUtils.deleteContents(baicizhanFile)) : Boolean.FALSE;
        }

        public static final void F(x00.l lVar, Object obj) {
            lVar.invoke(obj);
        }

        public static final void G(u0 u0Var, Throwable th2) {
            String message;
            u0Var.G().set(3);
            Throwable cause = th2.getCause();
            if (cause != null) {
                if (!(cause instanceof LogicException)) {
                    cause = null;
                }
                if (cause != null && (message = cause.getMessage()) != null) {
                    KotlinExtKt.showToast(message);
                }
            }
            qb.c.d(u0.f88338s, "getData error : " + th2.getMessage(), new Object[0]);
        }

        public static final Boolean H(x00.l lVar, Object obj) {
            return (Boolean) lVar.invoke(obj);
        }

        public static final g.j J(x00.p pVar, Object obj, Object obj2) {
            return (g.j) pVar.invoke(obj, obj2);
        }

        public static final List K(u0 u0Var, g.j jVar) {
            u0Var.P(jVar);
            List<DakaBackgroundCategoryInfo> category_info = jVar.f18379a.category_info;
            kotlin.jvm.internal.g0.o(category_info, "category_info");
            List<DakaBackgroundCategoryInfo> list = category_info;
            ArrayList arrayList = new ArrayList(a00.i0.d0(list, 10));
            for (DakaBackgroundCategoryInfo dakaBackgroundCategoryInfo : list) {
                kotlin.jvm.internal.g0.m(dakaBackgroundCategoryInfo);
                arrayList.add(Integer.valueOf(u0Var.H(dakaBackgroundCategoryInfo)));
            }
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : arrayList) {
                int intValue = ((Number) obj).intValue();
                if (1 <= intValue && intValue < 7) {
                    arrayList2.add(obj);
                }
            }
            return arrayList2;
        }

        public static final List L(x00.l lVar, Object obj) {
            return (List) lVar.invoke(obj);
        }

        public static final g2 M(u0 u0Var, List list) {
            u0Var.q();
            return g2.f100423a;
        }

        public static final void N(x00.l lVar, Object obj) {
            lVar.invoke(obj);
        }

        public static final g2 O(u0 u0Var, List list) {
            u0Var.f88342d.postValue(list);
            u0Var.G().set(2);
            return g2.f100423a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
            return u0.this.new b(cVar);
        }

        @Override // x00.p
        public final Object invoke(c40.r0 r0Var, j00.c<? super g2> cVar) {
            return ((b) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:19:0x0082  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0047  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r4.f88355a
                r2 = 0
                r3 = 1
                if (r1 == 0) goto L18
                if (r1 != r3) goto L10
                kotlin.e.n(r5)
                goto L3b
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                kotlin.e.n(r5)
                sd.u0 r5 = sd.u0.this
                androidx.databinding.ObservableInt r5 = r5.G()
                r5.set(r3)
                com.baicizhan.main.home.experiment.q0 r5 = com.baicizhan.main.home.experiment.q0.f21394a
                boolean r5 = r5.b()
                if (r5 == 0) goto L3e
                sd.u0 r5 = sd.u0.this
                k3.r0 r5 = sd.u0.m(r5)
                r4.f88355a = r3
                java.lang.Object r5 = r5.t(r4)
                if (r5 != r0) goto L3b
                return r0
            L3b:
                k3.q0 r5 = (k3.q0) r5
                goto L3f
            L3e:
                r5 = r2
            L3f:
                sd.u0 r0 = sd.u0.this
                qb0.h r0 = sd.u0.l(r0)
                if (r0 == 0) goto L53
                boolean r1 = r0.isUnsubscribed()
                if (r1 != 0) goto L4e
                r2 = r0
            L4e:
                if (r2 == 0) goto L53
                r2.unsubscribe()
            L53:
                java.lang.String r0 = "imagedaka"
                rx.c r0 = rx.c.M2(r0)
                sd.v0 r1 = new sd.v0
                r1.<init>()
                sd.y0 r2 = new sd.y0
                r2.<init>()
                rx.c r0 = r0.c3(r2)
                rx.d r1 = bc0.c.e()
                rx.c r0 = r0.w5(r1)
                sd.u0 r1 = sd.u0.this
                com.baicizhan.main.activity.daka.datasource.g r2 = com.baicizhan.main.activity.daka.datasource.g.n()
                sd.u0 r3 = sd.u0.this
                android.app.Application r3 = r3.getApplication()
                if (r5 == 0) goto L82
                int r5 = r5.m()
                goto L83
            L82:
                r5 = 0
            L83:
                rx.c r5 = r2.m(r3, r5)
                sd.z0 r2 = new sd.z0
                r2.<init>()
                sd.a1 r3 = new sd.a1
                r3.<init>()
                rx.c r5 = rx.c.r7(r5, r0, r3)
                rx.d r0 = tb0.a.a()
                rx.c r5 = r5.I3(r0)
                r2 = 30
                java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.SECONDS
                rx.c r5 = r5.e6(r2, r0)
                sd.u0 r0 = sd.u0.this
                sd.b1 r2 = new sd.b1
                r2.<init>()
                sd.c1 r0 = new sd.c1
                r0.<init>()
                rx.c r5 = r5.c3(r0)
                sd.u0 r0 = sd.u0.this
                sd.d1 r2 = new sd.d1
                r2.<init>()
                sd.e1 r0 = new sd.e1
                r0.<init>()
                rx.c r5 = r5.L1(r0)
                sd.u0 r0 = sd.u0.this
                sd.f1 r2 = new sd.f1
                r2.<init>()
                sd.w0 r0 = new sd.w0
                r0.<init>()
                sd.u0 r2 = sd.u0.this
                sd.x0 r3 = new sd.x0
                r3.<init>()
                qb0.h r5 = r5.u5(r0, r3)
                sd.u0.p(r1, r5)
                yz.g2 r5 = yz.g2.f100423a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: sd.u0.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public static final g.j I(g.j jVar, Boolean bool) {
            return jVar;
        }
    }
}
