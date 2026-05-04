package com.baicizhan.main.activity.setting;

import android.app.Application;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.main.activity.daka.datasource.k;
import com.baicizhan.main.activity.setting.SettingData;
import com.baicizhan.main.home.experiment.q0;
import q9.x;
import qb.c;
import qb0.g;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends AndroidViewModel {

    /* renamed from: z, reason: collision with root package name */
    public static String f19563z = "SettingsViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<Boolean> f19564a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<Boolean> f19565b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<Boolean> f19566c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<Boolean> f19567d;

    /* renamed from: e, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19568e;

    /* renamed from: f, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19569f;

    /* renamed from: g, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19570g;

    /* renamed from: h, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19571h;

    /* renamed from: i, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19572i;

    /* renamed from: j, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19573j;

    /* renamed from: k, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19574k;

    /* renamed from: l, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19575l;

    /* renamed from: m, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19576m;

    /* renamed from: n, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19577n;

    /* renamed from: o, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19578o;

    /* renamed from: p, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19579p;

    /* renamed from: q, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19580q;

    /* renamed from: r, reason: collision with root package name */
    public ClickProtectedEvent<Void> f19581r;

    /* renamed from: s, reason: collision with root package name */
    public ClickProtectedEvent<Boolean> f19582s;

    /* renamed from: t, reason: collision with root package name */
    public ClickProtectedEvent<UserRecord> f19583t;

    /* renamed from: u, reason: collision with root package name */
    public MutableLiveData<Boolean> f19584u;

    /* renamed from: v, reason: collision with root package name */
    public MutableLiveData<Boolean> f19585v;

    /* renamed from: w, reason: collision with root package name */
    public SettingData f19586w;

    /* renamed from: x, reason: collision with root package name */
    public h f19587x;

    /* renamed from: y, reason: collision with root package name */
    public h f19588y;

    public a(@NonNull Application application) {
        super(application);
        this.f19564a = new MutableLiveData<>();
        this.f19565b = new MutableLiveData<>();
        this.f19566c = new MutableLiveData<>();
        this.f19567d = new MutableLiveData<>();
        this.f19568e = new ClickProtectedEvent<>();
        this.f19569f = new ClickProtectedEvent<>();
        this.f19570g = new ClickProtectedEvent<>();
        this.f19571h = new ClickProtectedEvent<>();
        this.f19572i = new ClickProtectedEvent<>();
        this.f19573j = new ClickProtectedEvent<>();
        this.f19574k = new ClickProtectedEvent<>();
        this.f19575l = new ClickProtectedEvent<>();
        this.f19576m = new ClickProtectedEvent<>();
        this.f19577n = new ClickProtectedEvent<>();
        this.f19578o = new ClickProtectedEvent<>();
        this.f19579p = new ClickProtectedEvent<>();
        this.f19580q = new ClickProtectedEvent<>();
        this.f19581r = new ClickProtectedEvent<>();
        this.f19582s = new ClickProtectedEvent<>();
        this.f19583t = new ClickProtectedEvent<>();
        this.f19584u = new MutableLiveData<>();
        this.f19585v = new MutableLiveData<>();
        this.f19586w = new SettingData();
    }

    private void o() {
        h hVar = this.f19587x;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f19587x.unsubscribe();
        }
        this.f19587x = this.f19586w.g().r5(new C0297a());
    }

    public void a() {
        this.f19579p.call();
    }

    public void b(Context context) {
        this.f19582s.setValue(Boolean.TRUE);
        h hVar = this.f19588y;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f19588y.unsubscribe();
        }
        this.f19588y = this.f19586w.f(context).r5(new b());
    }

    public void c() {
        this.f19577n.call();
    }

    public void d() {
        this.f19568e.call();
    }

    public void f() {
        this.f19574k.call();
    }

    public void g() {
        this.f19571h.call();
    }

    public void h() {
        this.f19573j.call();
    }

    public void i() {
        this.f19569f.call();
    }

    public void j() {
        this.f19570g.call();
    }

    public void k() {
        this.f19575l.call();
    }

    public void l() {
        this.f19576m.call();
    }

    public void m() {
        this.f19572i.call();
    }

    public void n() {
        if (LearnRecordManager.N(getApplication(), x.r().l()) == 0) {
            this.f19581r.call();
        } else {
            this.f19580q.call();
        }
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        h hVar = this.f19587x;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f19587x.unsubscribe();
        }
        h hVar2 = this.f19588y;
        if (hVar2 != null && !hVar2.isUnsubscribed()) {
            this.f19588y.unsubscribe();
        }
        this.f19586w.h();
        this.f19586w = null;
    }

    public void start() {
        o();
        this.f19584u.setValue(Boolean.valueOf(q0.f21394a.b()));
        this.f19567d.setValue(Boolean.valueOf(k.d()));
        this.f19585v.setValue(Boolean.valueOf(com.baicizhan.base.a.a(getApplication())));
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.main.activity.setting.a$a, reason: collision with other inner class name */
    public class C0297a extends g<SettingData.d> {
        public C0297a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            c.c(a.f19563z, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(SettingData.d bindInfo) {
            a.this.f19566c.setValue(Boolean.valueOf(bindInfo.f19543c));
            a.this.f19565b.setValue(Boolean.valueOf(bindInfo.f19542b));
            a.this.f19564a.setValue(Boolean.valueOf(bindInfo.f19541a));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends g<UserRecord> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            a.this.f19582s.setValue(Boolean.FALSE);
            c.c(a.f19563z, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(UserRecord lastAccount) {
            c.b(a.f19563z, "lastAccount " + lastAccount, new Object[0]);
            a.this.f19582s.setValue(Boolean.FALSE);
            a.this.f19583t.setValue(lastAccount);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
