package od;

import android.content.Context;
import android.text.TextUtils;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.RxFlowUtilsKt;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.activity.daka.datasource.g;
import com.baicizhan.main.activity.schedule_v2.mutimode.data.e;
import com.baicizhan.online.thrift.basic.LogicException;
import com.baicizhan.online.user_study_api.RecommendationDaka;
import com.baicizhan.online.user_study_api.UserDakaShareInfo;
import com.jiongji.andriod.card.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import q9.x;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@av.b
/* loaded from: classes4.dex */
public class n extends ViewModel implements ShareDelegate.b {
    public static final String D = "DakaViewModel";
    public static final int E = 1;
    public static final int F = 2;
    public static final int G = 3;
    public g.i B;

    /* renamed from: r, reason: collision with root package name */
    public Context f76818r;

    /* renamed from: s, reason: collision with root package name */
    public com.baicizhan.client.business.managers.winningstreak.a f76819s;

    /* renamed from: t, reason: collision with root package name */
    public u9.d f76820t;

    /* renamed from: u, reason: collision with root package name */
    public LearnRecordManager f76821u;

    /* renamed from: z, reason: collision with root package name */
    public qb0.h f76826z;

    /* renamed from: a, reason: collision with root package name */
    public ObservableField<String> f76801a = new ObservableField<>();

    /* renamed from: b, reason: collision with root package name */
    public ObservableField<String> f76802b = new ObservableField<>();

    /* renamed from: c, reason: collision with root package name */
    public ObservableField<String> f76803c = new ObservableField<>();

    /* renamed from: d, reason: collision with root package name */
    public ObservableField<ld.b> f76804d = new ObservableField<>();

    /* renamed from: e, reason: collision with root package name */
    public MutableLiveData<Boolean> f76805e = new MutableLiveData<>();

    /* renamed from: f, reason: collision with root package name */
    public MutableLiveData<String> f76806f = new ClickProtectedEvent();

    /* renamed from: g, reason: collision with root package name */
    public MutableLiveData<String> f76807g = new MutableLiveData<>();

    /* renamed from: h, reason: collision with root package name */
    public MutableLiveData<Boolean> f76808h = new MutableLiveData<>(Boolean.FALSE);

    /* renamed from: i, reason: collision with root package name */
    public ObservableInt f76809i = new ObservableInt(1);

    /* renamed from: j, reason: collision with root package name */
    public SingleLiveEvent<Void> f76810j = new SingleLiveEvent<>();

    /* renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<UserDakaShareInfo> f76811k = new SingleLiveEvent<>();

    /* renamed from: l, reason: collision with root package name */
    public SingleLiveEvent<Void> f76812l = new SingleLiveEvent<>();

    /* renamed from: m, reason: collision with root package name */
    public SingleLiveEvent<ShareChannel> f76813m = new SingleLiveEvent<>();

    /* renamed from: n, reason: collision with root package name */
    public SingleLiveEvent<Void> f76814n = new SingleLiveEvent<>();

    /* renamed from: o, reason: collision with root package name */
    public SingleLiveEvent<Void> f76815o = new SingleLiveEvent<>();

    /* renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<String> f76816p = new SingleLiveEvent<>();

    /* renamed from: q, reason: collision with root package name */
    public SingleLiveEvent<Void> f76817q = new SingleLiveEvent<>();

    /* renamed from: v, reason: collision with root package name */
    public SingleLiveEvent<Void> f76822v = new SingleLiveEvent<>();

    /* renamed from: w, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f76823w = new SingleLiveEvent<>();

    /* renamed from: x, reason: collision with root package name */
    public SingleLiveEvent<Integer> f76824x = new SingleLiveEvent<>();

    /* renamed from: y, reason: collision with root package name */
    public qb0.h f76825y = null;
    public qb0.h A = null;
    public boolean C = false;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends HashMap<String, Object> {
        public b() {
            put(ma.b.M1, com.baicizhan.main.activity.daka.datasource.k.d() ? "classic" : "image");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<Boolean> {
        public c() {
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }

    @Inject
    public n(@cv.b Context context, com.baicizhan.client.business.managers.winningstreak.a win, LearnRecordManager recordMgr, u9.d iExperienceRepo) {
        this.f76818r = context;
        this.f76819s = win;
        this.f76821u = recordMgr;
        this.f76820t = iExperienceRepo;
    }

    private void m() {
        qb0.h hVar = this.A;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.A.unsubscribe();
        }
        this.A = th.e.f().u5(new wb0.b() { // from class: od.l
            @Override // wb0.b
            public final void call(Object obj) {
                n.this.z((Boolean) obj);
            }
        }, new wb0.b() { // from class: od.m
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c(n.D, "", (Throwable) obj);
            }
        });
    }

    public final /* synthetic */ void A(g.i iVar) {
        m();
    }

    public void B() {
        if (this.f76809i.get() == 1) {
            return;
        }
        if (!this.C) {
            ma.l.a(ma.t.f73003b, ma.a.f72719c);
        }
        this.f76810j.call();
    }

    public final void C(g.i calendarDakaInfo) {
        this.B = calendarDakaInfo;
        this.f76805e.setValue(calendarDakaInfo.f18378d);
        ObservableField<String> observableField = this.f76801a;
        int i11 = calendarDakaInfo.f18375a.total_words;
        observableField.set(i11 == -1 ? String.valueOf(LearnRecordManager.A().I()) : String.valueOf(i11));
        this.f76802b.set(String.valueOf(calendarDakaInfo.f18375a.total_daka_days));
        this.f76803c.set(new SimpleDateFormat("MMMM, yyyy", Locale.ENGLISH).format(new Date(System.currentTimeMillis())));
        this.f76804d.set(calendarDakaInfo.f18376b);
        RecommendationDaka recommendationDaka = calendarDakaInfo.f18377c;
        if (recommendationDaka == null || TextUtils.isEmpty(recommendationDaka.banner_url)) {
            this.f76807g.setValue(null);
        } else {
            this.f76807g.setValue(calendarDakaInfo.f18377c.banner_url);
            HashMap hashMap = new HashMap();
            hashMap.put(ma.b.f72954w, this.B.f18377c.user_type);
            hashMap.put("adv_id", this.B.f18377c.user_type);
            ma.l.e(ma.t.f73018q, ma.a.U1, hashMap);
        }
        qb.c.i(D, "daka success", new Object[0]);
    }

    public void D() {
        G();
    }

    public void F(boolean fromMainTab) {
        this.C = fromMainTab;
    }

    public final void G() {
        qb0.h hVar = this.f76825y;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f76825y.unsubscribe();
        }
        this.f76809i.set(1);
        this.f76825y = rx.c.q7(new com.baicizhan.main.activity.daka.datasource.g().h(this.f76818r), RxFlowUtilsKt.asRxJava(this.f76819s.a()), RxFlowUtilsKt.asRxJava(this.f76820t.a()), new wb0.r() { // from class: od.j
            @Override // wb0.r
            public final Object i(Object obj, Object obj2, Object obj3) {
                return n.b((g.i) obj, (Boolean) obj2, (Boolean) obj3);
            }
        }).w5(bc0.c.e()).e6(30L, TimeUnit.SECONDS).L1(new wb0.b() { // from class: od.k
            @Override // wb0.b
            public final void call(Object obj) {
                n.this.A((g.i) obj);
            }
        }).I3(tb0.a.a()).r5(new a());
    }

    public final void H() {
        if (com.baicizhan.main.activity.daka.datasource.k.d() || !x.r().P() || !sd.x.a(System.currentTimeMillis())) {
            this.f76808h.setValue(Boolean.FALSE);
        } else {
            this.f76808h.setValue(Boolean.TRUE);
            sd.x.b(System.currentTimeMillis());
        }
    }

    public void n() {
        if (com.baicizhan.main.activity.daka.datasource.k.d()) {
            g.i iVar = this.B;
            if (iVar != null) {
                this.f76811k.setValue(iVar.f18375a);
            }
        } else {
            this.f76812l.call();
        }
        ma.l.a(ma.t.f73003b, ma.a.f72782l);
        ma.l.e(ma.t.f73023v, ma.a.f72816p5, new HashMap(new b()));
    }

    public void o() {
        if (!this.C) {
            ma.l.a(ma.t.f73003b, ma.a.f72719c);
        }
        ma.l.a(ma.t.f73003b, ma.a.f72789m);
        this.f76810j.call();
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareCancel() {
        this.f76817q.call();
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareError(ShareChannel media, Throwable throwable) {
        qb.c.h(D, "", throwable);
        va.g.g(R.string.daka_page_daka_failed, 0);
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareStart(ShareChannel media) {
        this.f76813m.setValue(media);
        HashMap hashMap = new HashMap();
        hashMap.put(ma.b.X0, "http_link");
        hashMap.put(ma.b.Y0, "");
        hashMap.put(ma.b.Z0, media.toString());
        ma.l.e(ma.t.f73003b, ma.a.f72815p4, hashMap);
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareSuccess(ShareChannel media) {
        qb.c.i(D, "%s", media);
        this.f76817q.call();
        HashMap hashMap = new HashMap();
        hashMap.put(ma.b.X0, "http_link");
        hashMap.put(ma.b.Y0, "");
        hashMap.put(ma.b.Z0, media.toString());
        ma.l.e(ma.t.f73003b, ma.a.f72712b, hashMap);
        if (x.r().O()) {
            this.f76814n.call();
        } else {
            this.f76815o.call();
        }
        qb0.h hVar = this.f76826z;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f76826z.unsubscribe();
        }
        this.f76826z = com.baicizhan.main.activity.daka.datasource.g.n().v(this.f76813m.getValue()).r5(new c());
    }

    public SingleLiveEvent<Void> p() {
        return this.f76810j;
    }

    public SingleLiveEvent<Void> q() {
        return this.f76817q;
    }

    public SingleLiveEvent<Void> r() {
        return this.f76814n;
    }

    public SingleLiveEvent<UserDakaShareInfo> s() {
        return this.f76811k;
    }

    public void start() {
        G();
        hi.d.e();
    }

    public SingleLiveEvent<ShareChannel> t() {
        return this.f76813m;
    }

    public SingleLiveEvent<Void> u() {
        return this.f76815o;
    }

    public SingleLiveEvent<String> v() {
        return this.f76816p;
    }

    public SingleLiveEvent<Void> w() {
        return this.f76812l;
    }

    public void x() {
        if (TextUtils.isEmpty(this.B.f18377c.jump_url)) {
            return;
        }
        this.f76806f.setValue(this.B.f18377c.jump_url);
        HashMap hashMap = new HashMap();
        hashMap.put(ma.b.f72954w, this.B.f18377c.user_type);
        hashMap.put("adv_id", this.B.f18377c.user_type);
        ma.l.e(ma.t.f73018q, ma.a.T1, hashMap);
    }

    public final void y() {
        this.f76824x.postValue(Integer.valueOf(this.f76821u.I()));
    }

    public final /* synthetic */ void z(Boolean bool) {
        this.f76823w.postValue(bool);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<g.i> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            n.this.f76809i.set(3);
            if (e11 != null && (e11.getCause() instanceof LogicException)) {
                n.this.f76816p.setValue(e11.getCause().getMessage());
            }
            qb.c.c(n.D, "daka failed", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(g.i calendarDakaInfo) {
            if (!n.this.f76819s.enable() || ch.m.f8648a.a() != e.d.f19308d || hi.e.e(n.this.f76818r) || n.this.C) {
                n.this.C(calendarDakaInfo);
                n.this.f76809i.set(2);
                n.this.H();
                if (com.baicizhan.main.activity.daka.datasource.g.n().o(n.this.f76818r)) {
                    n.this.f76822v.call();
                    ma.l.a(ma.t.f73008g, ma.a.f72741f0);
                }
            } else {
                n.this.y();
            }
            qb.c.i(n.D, "daka load finish", new Object[0]);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
    public void onShareSend(ShareChannel media) {
    }

    public static /* synthetic */ g.i b(g.i iVar, Boolean bool, Boolean bool2) {
        return iVar;
    }
}
