package mf;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import gf.r;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class l extends AndroidViewModel {

    /* renamed from: m, reason: collision with root package name */
    public static final String f73221m = "MainViewModel";

    /* renamed from: a, reason: collision with root package name */
    public SingleLiveEvent<String> f73222a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<Integer> f73223b;

    /* renamed from: c, reason: collision with root package name */
    public SingleLiveEvent<String> f73224c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<Long> f73225d;

    /* renamed from: e, reason: collision with root package name */
    public LiveData<String> f73226e;

    /* renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f73227f;

    /* renamed from: g, reason: collision with root package name */
    public ClickProtectedEvent<Long> f73228g;

    /* renamed from: h, reason: collision with root package name */
    public ClickProtectedEvent<Integer> f73229h;

    /* renamed from: i, reason: collision with root package name */
    public ClickProtectedEvent<Void> f73230i;

    /* renamed from: j, reason: collision with root package name */
    public ClickProtectedEvent<Void> f73231j;

    /* renamed from: k, reason: collision with root package name */
    public SingleLiveEvent<String> f73232k;

    /* renamed from: l, reason: collision with root package name */
    public r f73233l;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Integer> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            l.this.f73232k.setValue(va.g.d(e11));
            qb.c.c(l.f73221m, "", e11);
        }

        @Override // qb0.c
        public void onNext(Integer s11) {
            l.this.f73223b.setValue(s11);
            l lVar = l.this;
            lVar.f73232k.setValue(lVar.getApplication().getString(R.string.userinfo_edit_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    public l(@NonNull Application application) {
        super(application);
        this.f73222a = new SingleLiveEvent<>();
        this.f73223b = new MutableLiveData<>();
        this.f73224c = new SingleLiveEvent<>();
        this.f73225d = new MutableLiveData<>();
        this.f73227f = new SingleLiveEvent<>();
        this.f73228g = new ClickProtectedEvent<>();
        this.f73229h = new ClickProtectedEvent<>();
        this.f73230i = new ClickProtectedEvent<>();
        this.f73231j = new ClickProtectedEvent<>();
        this.f73232k = new SingleLiveEvent<>();
        this.f73226e = Transformations.map(this.f73225d, new x00.l() { // from class: mf.k
            @Override // x00.l
            public final Object invoke(Object obj) {
                return l.a((Long) obj);
            }
        });
        this.f73233l = new r();
    }

    public static /* synthetic */ String a(Long l11) {
        if (l11.longValue() == 0) {
            return null;
        }
        return String.valueOf(l11);
    }

    public void d() {
        this.f73229h.setValue(this.f73223b.getValue());
    }

    public void f() {
        this.f73228g.setValue(this.f73225d.getValue());
    }

    public void g() {
        this.f73231j.call();
    }

    public void h() {
        this.f73230i.call();
    }

    public LiveData<String> i() {
        return Transformations.map(this.f73223b, new x00.l() { // from class: mf.j
            @Override // x00.l
            public final Object invoke(Object obj) {
                String j11;
                j11 = l.this.j((Integer) obj);
                return j11;
            }
        });
    }

    public final /* synthetic */ String j(Integer num) {
        return gf.e.a(getApplication(), num.intValue());
    }

    public void k(int edu) {
        this.f73233l.o(getApplication(), edu).r5(new b());
    }

    public void l(int y11) {
        this.f73233l.p(getApplication(), y11).r5(new c());
    }

    public void start() {
        this.f73233l.v().r5(new a());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<r.d> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(l.f73221m, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(r.d extraInfo) {
            l.this.f73222a.setValue(extraInfo.f53712a);
            l.this.f73223b.setValue(Integer.valueOf(extraInfo.f53714c));
            l.this.f73224c.setValue(extraInfo.f53715d);
            l.this.f73227f.setValue(Boolean.valueOf(extraInfo.f53718g));
            l.this.f73225d.setValue(Long.valueOf(extraInfo.f53717f));
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
            l.this.f73232k.setValue(va.g.d(e11));
            qb.c.c(l.f73221m, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Long aLong) {
            l.this.f73225d.setValue(aLong);
            l lVar = l.this;
            lVar.f73232k.setValue(lVar.getApplication().getString(R.string.userinfo_edit_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
