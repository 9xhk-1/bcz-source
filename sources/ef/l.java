package ef;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import ee.m;
import gf.r;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l extends AndroidViewModel {

    /* renamed from: w, reason: collision with root package name */
    public static final String f49766w = "UserInfoViewModel";

    /* renamed from: x, reason: collision with root package name */
    public static final String f49767x = "yyyy/MM/dd";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<String> f49768a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<String> f49769b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<String> f49770c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<String> f49771d;

    /* renamed from: e, reason: collision with root package name */
    public MutableLiveData<String> f49772e;

    /* renamed from: f, reason: collision with root package name */
    public MutableLiveData<String> f49773f;

    /* renamed from: g, reason: collision with root package name */
    public MutableLiveData<String> f49774g;

    /* renamed from: h, reason: collision with root package name */
    public MutableLiveData<String> f49775h;

    /* renamed from: i, reason: collision with root package name */
    public MutableLiveData<Boolean> f49776i;

    /* renamed from: j, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f49777j;

    /* renamed from: k, reason: collision with root package name */
    public ClickProtectedEvent<Void> f49778k;

    /* renamed from: l, reason: collision with root package name */
    public ClickProtectedEvent<Integer> f49779l;

    /* renamed from: m, reason: collision with root package name */
    public ClickProtectedEvent<Void> f49780m;

    /* renamed from: n, reason: collision with root package name */
    public ClickProtectedEvent<Long> f49781n;

    /* renamed from: o, reason: collision with root package name */
    public ClickProtectedEvent<Void> f49782o;

    /* renamed from: p, reason: collision with root package name */
    public ClickProtectedEvent<Void> f49783p;

    /* renamed from: q, reason: collision with root package name */
    public ClickProtectedEvent<Void> f49784q;

    /* renamed from: r, reason: collision with root package name */
    public ClickProtectedEvent<Void> f49785r;

    /* renamed from: s, reason: collision with root package name */
    public ClickProtectedEvent<Void> f49786s;

    /* renamed from: t, reason: collision with root package name */
    public SingleLiveEvent<String> f49787t;

    /* renamed from: u, reason: collision with root package name */
    public r f49788u;

    /* renamed from: v, reason: collision with root package name */
    public long f49789v;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Boolean> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            l.this.f49787t.setValue(va.g.d(e11));
            qb.c.c(l.f49766w, "", e11);
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            l lVar = l.this;
            lVar.f49770c.setValue(lVar.f49788u.z());
            l lVar2 = l.this;
            lVar2.f49787t.setValue(lVar2.getApplication().getString(R.string.userinfo_edit_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    public l(@NonNull Application application) {
        super(application);
        this.f49768a = new MutableLiveData<>();
        this.f49769b = new MutableLiveData<>();
        this.f49770c = new MutableLiveData<>();
        this.f49771d = new MutableLiveData<>();
        this.f49772e = new MutableLiveData<>();
        this.f49773f = new MutableLiveData<>();
        this.f49774g = new MutableLiveData<>();
        this.f49775h = new MutableLiveData<>();
        this.f49776i = new MutableLiveData<>();
        this.f49777j = new SingleLiveEvent<>();
        this.f49778k = new ClickProtectedEvent<>();
        this.f49779l = new ClickProtectedEvent<>();
        this.f49780m = new ClickProtectedEvent<>();
        this.f49781n = new ClickProtectedEvent<>();
        this.f49782o = new ClickProtectedEvent<>();
        this.f49783p = new ClickProtectedEvent<>();
        this.f49784q = new ClickProtectedEvent<>();
        this.f49785r = new ClickProtectedEvent<>();
        this.f49786s = new ClickProtectedEvent<>();
        this.f49787t = new SingleLiveEvent<>();
        this.f49789v = 0L;
        this.f49788u = new r();
    }

    public void c() {
        this.f49781n.setValue(Long.valueOf(this.f49789v));
    }

    public void d() {
        this.f49782o.call();
    }

    public void f() {
        this.f49779l.setValue(Integer.valueOf(this.f49788u.B()));
        this.f49777j.setValue(Boolean.TRUE);
    }

    public void g() {
        this.f49778k.call();
    }

    public void h() {
        this.f49785r.call();
        this.f49776i.postValue(Boolean.FALSE);
    }

    public void i() {
        this.f49786s.call();
    }

    public void j() {
        this.f49780m.call();
    }

    public void k() {
        if (TextUtils.isEmpty(this.f49773f.getValue())) {
            this.f49784q.call();
        } else {
            this.f49783p.call();
        }
    }

    public void l(final int pickSex) {
        this.f49777j.setValue(Boolean.FALSE);
        this.f49788u.u(getApplication(), pickSex).r5(new b());
    }

    public void m() {
        this.f49777j.setValue(Boolean.FALSE);
    }

    public void n(int y11, int m11, int d11) {
        qb.c.i(f49766w, "%d, %d, %d", Integer.valueOf(y11), Integer.valueOf(m11), Integer.valueOf(d11));
        this.f49788u.n(getApplication(), y11, m11, d11).r5(new c());
    }

    public void o(Context context) {
        this.f49768a.setValue(this.f49788u.w());
        this.f49769b.setValue(this.f49788u.y());
        this.f49770c.setValue(this.f49788u.z());
        String A = this.f49788u.A();
        if (!TextUtils.isEmpty(A)) {
            this.f49775h.setValue(A);
        }
        this.f49788u.v().r5(new a(context));
    }

    public final void p(long birthdayL) {
        this.f49789v = birthdayL;
        if (birthdayL == 0) {
            this.f49771d.setValue(null);
        } else {
            this.f49771d.setValue(new SimpleDateFormat(f49767x, Locale.getDefault()).format(new Date(this.f49789v)));
        }
    }

    public void q(Context context) {
        o(context);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<r.d> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f49790a;

        public a(final Context val$context) {
            this.f49790a = val$context;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(l.f49766w, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(r.d extraInfo) {
            l.this.f49772e.setValue(extraInfo.f53713b);
            l.this.f49773f.setValue(extraInfo.f53712a);
            l.this.p(extraInfo.f53716e);
            l.this.f49774g.setValue(m.c(extraInfo.f53719h, this.f49790a));
            if (hi.f.c()) {
                l.this.f49776i.setValue(Boolean.TRUE);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<Long> {
        public c() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            l.this.f49787t.setValue(va.g.d(e11));
            qb.c.c(l.f49766w, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Long aLong) {
            l.this.p(aLong.longValue());
            l lVar = l.this;
            lVar.f49787t.setValue(lVar.getApplication().getString(R.string.userinfo_edit_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
