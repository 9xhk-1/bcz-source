package he;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.thrift.ThriftRequest;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.client.business.util.SystemUtil;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class w extends AndroidViewModel {

    /* renamed from: u, reason: collision with root package name */
    public static final String f59207u = "MyTabViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<String> f59208a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<Integer> f59209b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<String> f59210c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<String> f59211d;

    /* renamed from: e, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59212e;

    /* renamed from: f, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59213f;

    /* renamed from: g, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59214g;

    /* renamed from: h, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59215h;

    /* renamed from: i, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59216i;

    /* renamed from: j, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59217j;

    /* renamed from: k, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59218k;

    /* renamed from: l, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59219l;

    /* renamed from: m, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59220m;

    /* renamed from: n, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59221n;

    /* renamed from: o, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59222o;

    /* renamed from: p, reason: collision with root package name */
    public SingleLiveEvent<String> f59223p;

    /* renamed from: q, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59224q;

    /* renamed from: r, reason: collision with root package name */
    public ClickProtectedEvent<Void> f59225r;

    /* renamed from: s, reason: collision with root package name */
    public g f59226s;

    /* renamed from: t, reason: collision with root package name */
    public qb0.h f59227t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends ThriftRequest<UnifiedUserService.Client, Long> {
        public b(String domain) {
            super(domain);
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Long doInBackground(UnifiedUserService.Client client) throws Exception {
            return Long.valueOf(client.get_profile().getUnique_id());
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onResult(Long id2) {
            qb.c.b(w.f59207u, "refreshed bcz_id: " + id2, new Object[0]);
            if (id2.longValue() == 0) {
                w.this.f59223p.setValue("ID异常");
                return;
            }
            int intValue = id2.intValue();
            i9.f.k(w.this.getApplication(), i9.f.R, intValue);
            q9.x.r().p().setUniqueId(intValue);
            w.this.f59209b.setValue(Integer.valueOf(intValue));
            w.this.d();
        }

        @Override // com.baicizhan.client.business.thrift.ThriftRequest
        public void onError(Exception exception) {
            qb.c.c(w.f59207u, "copyId: ", exception);
            va.g.j(exception, 0);
        }
    }

    public w(@NonNull Application application) {
        super(application);
        this.f59208a = new MutableLiveData<>();
        this.f59209b = new MutableLiveData<>();
        this.f59210c = new MutableLiveData<>();
        this.f59211d = new MutableLiveData<>();
        this.f59212e = new ClickProtectedEvent<>();
        this.f59213f = new ClickProtectedEvent<>();
        this.f59214g = new ClickProtectedEvent<>();
        this.f59215h = new ClickProtectedEvent<>();
        this.f59216i = new ClickProtectedEvent<>();
        this.f59217j = new ClickProtectedEvent<>();
        this.f59218k = new ClickProtectedEvent<>();
        this.f59219l = new ClickProtectedEvent<>();
        this.f59220m = new ClickProtectedEvent<>();
        this.f59221n = new ClickProtectedEvent<>();
        this.f59222o = new ClickProtectedEvent<>();
        this.f59223p = new SingleLiveEvent<>();
        this.f59224q = new ClickProtectedEvent<>();
        this.f59225r = new ClickProtectedEvent<>();
        this.f59226s = new g();
    }

    public void A() {
        this.f59217j.call();
    }

    public void B() {
        this.f59218k.call();
    }

    public void C() {
        this.f59215h.call();
    }

    public void D() {
        this.f59214g.call();
        ma.l.a(ma.t.f73003b, ma.a.P);
    }

    public void F() {
        this.f59221n.call();
    }

    public void G() {
        this.f59213f.call();
    }

    public void H() {
        this.f59212e.call();
    }

    public void I() {
        this.f59216i.call();
    }

    public final /* synthetic */ String J(Integer num) {
        return getApplication().getString(R.string.my_tab_bcz_id, num);
    }

    public final void K() {
        qb0.h hVar = this.f59227t;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.f59227t.unsubscribe();
    }

    public final void L(Context context) {
        this.f59226s.a().q5(new a(context));
    }

    public void M(Context context) {
        K();
        L(context);
    }

    public final void d() {
        SystemUtil.copyToClipboard(getApplication(), String.valueOf(this.f59209b.getValue()));
        this.f59223p.setValue(getApplication().getString(R.string.my_tab_study_copied_bcz_id));
    }

    public LiveData<String> f() {
        return Transformations.map(this.f59209b, new x00.l() { // from class: he.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                String J;
                J = w.this.J((Integer) obj);
                return J;
            }
        });
    }

    public void g() {
        if (this.f59209b.getValue() == null || this.f59209b.getValue().intValue() == 0) {
            com.baicizhan.client.business.thrift.c.b().a(new b("/rpc/unified_user_service"));
        } else {
            d();
        }
    }

    public LiveData<Void> h() {
        return this.f59225r;
    }

    public SingleLiveEvent<Void> i() {
        return this.f59222o;
    }

    public SingleLiveEvent<Void> j() {
        return this.f59220m;
    }

    public ClickProtectedEvent<Void> k() {
        return this.f59224q;
    }

    public SingleLiveEvent<Void> l() {
        return this.f59219l;
    }

    public SingleLiveEvent<Void> m() {
        return this.f59217j;
    }

    public SingleLiveEvent<Void> n() {
        return this.f59218k;
    }

    public SingleLiveEvent<Void> o() {
        return this.f59215h;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        qb0.h hVar = this.f59227t;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.f59227t.unsubscribe();
    }

    public SingleLiveEvent<Void> p() {
        return this.f59214g;
    }

    public SingleLiveEvent<Void> q() {
        return this.f59221n;
    }

    public SingleLiveEvent<Void> r() {
        return this.f59213f;
    }

    public SingleLiveEvent<Void> s() {
        return this.f59212e;
    }

    public SingleLiveEvent<String> t() {
        return this.f59223p;
    }

    public SingleLiveEvent<Void> u() {
        return this.f59216i;
    }

    public void v() {
        this.f59225r.call();
    }

    public void w() {
        this.f59222o.call();
    }

    public void x() {
        this.f59220m.call();
    }

    public void y() {
        this.f59224q.call();
        ma.l.a(ma.t.f73003b, ma.a.R);
    }

    public void z() {
        this.f59219l.call();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements qb0.c<UserRecord> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Context f59228a;

        public a(final Context val$context) {
            this.f59228a = val$context;
        }

        @Override // qb0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(UserRecord userRecord) {
            w.this.f59208a.setValue(userRecord.getDisplayName());
            w.this.f59209b.setValue(Integer.valueOf(userRecord.getUniqueId()));
            w.this.f59210c.setValue(userRecord.getImage());
            String c11 = userRecord.getRole() != null ? ee.m.c(userRecord.getRole().grade, this.f59228a) : "";
            MutableLiveData<String> mutableLiveData = w.this.f59211d;
            if (TextUtils.isEmpty(c11)) {
                c11 = "填写年级";
            }
            mutableLiveData.setValue(c11);
        }

        @Override // qb0.c
        public void onCompleted() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
        }
    }
}
