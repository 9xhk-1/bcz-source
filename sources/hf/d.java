package hf;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import gf.r;
import qb0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends AndroidViewModel {

    /* renamed from: i, reason: collision with root package name */
    public static final String f59238i = "UserEditViewModel";

    /* renamed from: j, reason: collision with root package name */
    public static final int f59239j = 24;

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<String> f59240a;

    /* renamed from: b, reason: collision with root package name */
    public SingleLiveEvent<Void> f59241b;

    /* renamed from: c, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f59242c;

    /* renamed from: d, reason: collision with root package name */
    public SingleLiveEvent<Void> f59243d;

    /* renamed from: e, reason: collision with root package name */
    public SingleLiveEvent<String> f59244e;

    /* renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<Void> f59245f;

    /* renamed from: g, reason: collision with root package name */
    public MutableLiveData<Boolean> f59246g;

    /* renamed from: h, reason: collision with root package name */
    public r f59247h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<Boolean> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(d.f59238i, "", e11);
            d.this.f59244e.setValue(va.g.d(e11));
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            d.this.f59242c.setValue(Boolean.FALSE);
            d.this.f59245f.call();
            d dVar = d.this;
            dVar.f59244e.setValue(dVar.getApplication().getString(R.string.userinfo_edit_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    public d(@NonNull Application application) {
        super(application);
        this.f59240a = new MutableLiveData<>();
        this.f59241b = new SingleLiveEvent<>();
        this.f59242c = new SingleLiveEvent<>();
        this.f59243d = new SingleLiveEvent<>();
        this.f59244e = new SingleLiveEvent<>();
        this.f59245f = new SingleLiveEvent<>();
        this.f59246g = new MutableLiveData<>();
        this.f59247h = new r();
    }

    public void b() {
        this.f59241b.call();
    }

    public void c() {
        this.f59240a.setValue("");
        this.f59242c.setValue(Boolean.TRUE);
    }

    public final /* synthetic */ void d(String str) {
        if (TextUtils.isEmpty(str)) {
            this.f59246g.setValue(Boolean.FALSE);
        } else {
            this.f59246g.setValue(Boolean.valueOf(!str.equals(this.f59247h.y() == null ? null : r0.trim())));
        }
    }

    public void f() {
        if (this.f59246g.getValue() == null || !this.f59246g.getValue().booleanValue()) {
            return;
        }
        String value = this.f59240a.getValue();
        if (value == null) {
            this.f59244e.setValue(getApplication().getString(R.string.user_center_nickname_empty_warn));
        } else {
            this.f59247h.s(getApplication(), value.trim()).r5(new a());
        }
    }

    public void start() {
        this.f59240a.setValue(this.f59247h.y());
        this.f59240a.observeForever(new Observer() { // from class: hf.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                d.this.d((String) obj);
            }
        });
        this.f59243d.call();
        this.f59242c.setValue(Boolean.TRUE);
    }
}
