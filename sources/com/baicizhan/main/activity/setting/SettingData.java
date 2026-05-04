package com.baicizhan.main.activity.setting;

import android.content.Context;
import c9.a;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.main.activity.setting.SettingData;
import com.baicizhan.main.activity.userinfo.data.AccountBindingMgr;
import gi.e;
import java.util.Map;
import q9.x;
import qb0.g;
import rx.c;
import wb0.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class SettingData {

    /* renamed from: a, reason: collision with root package name */
    public static final String f19535a = "SettingData";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CanceledException extends RuntimeException {
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements a.b {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ g f19536a;

        public a(final g val$subscriber) {
            this.f19536a = val$subscriber;
        }

        @Override // c9.a.b
        public void onCancel() {
            this.f19536a.onError(new CanceledException());
        }

        @Override // c9.a.b
        public void onComplete() {
            this.f19536a.onNext(Boolean.TRUE);
            this.f19536a.onCompleted();
        }

        @Override // c9.a.b
        public void onError(Throwable throwable) {
            this.f19536a.onError(throwable);
            this.f19536a.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements c.a<UserRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f19538a;

        public b(final Context val$context) {
            this.f19538a = val$context;
        }

        @Override // wb0.b
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void call(g<? super UserRecord> subscriber) {
            subscriber.onStart();
            UserRecord p11 = x.r().p();
            try {
                e.q(this.f19538a);
                if (p11 != null) {
                    if (p11.getLoginType() != 0) {
                        if (6 == p11.getLoginType()) {
                        }
                    }
                    ia.a.m(ia.a.f60464o, p11.getUser());
                }
                subscriber.onNext(p11);
            } catch (Exception e11) {
                subscriber.onError(e11);
            }
            subscriber.onCompleted();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements p<Map<String, AccountBindingMgr.BindInfo>, d> {
        public c() {
        }

        @Override // wb0.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d call(Map<String, AccountBindingMgr.BindInfo> stringBindInfoMap) {
            d dVar = new d();
            dVar.f19543c = stringBindInfoMap.keySet().contains("phone");
            dVar.f19542b = stringBindInfoMap.keySet().contains("weixin");
            dVar.f19541a = stringBindInfoMap.keySet().contains("qq");
            return dVar;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class d {

        /* renamed from: a, reason: collision with root package name */
        public boolean f19541a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f19542b;

        /* renamed from: c, reason: collision with root package name */
        public boolean f19543c;
    }

    public final rx.c<UserRecord> c(final Context context) {
        return rx.c.j1(new b(context)).w5(bc0.c.a()).I3(tb0.a.a());
    }

    public final /* synthetic */ rx.c d(Context context, Boolean bool) {
        return c(context);
    }

    public final /* synthetic */ void e(int i11, Context context, g gVar) {
        c9.a.k(context, i11 == 4 ? ShareChannel.WEIXIN : i11 == 5 ? ShareChannel.QQ : ShareChannel.WEIBO, new a(gVar));
    }

    public rx.c<UserRecord> f(final Context context) {
        return i(context).b2(new p() { // from class: te.a
            @Override // wb0.p
            public final Object call(Object obj) {
                rx.c d11;
                d11 = SettingData.this.d(context, (Boolean) obj);
                return d11;
            }
        });
    }

    public rx.c<d> g() {
        if (!AccountBindingMgr.inst().isLoaded()) {
            return AccountBindingMgr.inst().bindInfo().c3(new c()).I3(tb0.a.a());
        }
        d dVar = new d();
        dVar.f19543c = AccountBindingMgr.inst().getAllBindInfos().keySet().contains("phone");
        dVar.f19542b = AccountBindingMgr.inst().getAllBindInfos().keySet().contains("weixin");
        dVar.f19541a = AccountBindingMgr.inst().getAllBindInfos().keySet().contains("qq");
        return rx.c.M2(dVar);
    }

    public void h() {
        AccountBindingMgr.inst().clear();
    }

    public final rx.c<Boolean> i(final Context context) {
        UserRecord p11 = x.r().p();
        if (p11 == null) {
            return rx.c.M2(Boolean.FALSE);
        }
        final int loginType = p11.getLoginType();
        return (loginType == 4 || loginType == 1 || loginType == 5) ? rx.c.j1(new c.a() { // from class: te.b
            @Override // wb0.b
            public final void call(Object obj) {
                SettingData.this.e(loginType, context, (qb0.g) obj);
            }
        }) : rx.c.M2(Boolean.FALSE);
    }
}
