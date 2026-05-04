package pf;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import gf.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i extends AndroidViewModel {

    /* renamed from: f, reason: collision with root package name */
    public static final String f80421f = "SearchViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<String> f80422a;

    /* renamed from: b, reason: collision with root package name */
    public SingleLiveEvent<List<gf.d>> f80423b;

    /* renamed from: c, reason: collision with root package name */
    public SingleLiveEvent<Void> f80424c;

    /* renamed from: d, reason: collision with root package name */
    public SingleLiveEvent<String> f80425d;

    /* renamed from: e, reason: collision with root package name */
    public r f80426e;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Boolean> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            i.this.f80425d.setValue(va.g.e(e11, R.string.userinfo_report_failed));
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            i iVar = i.this;
            iVar.f80425d.setValue(iVar.getApplication().getString(R.string.userinfo_report_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<Integer> {
        public c() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            i.this.f80425d.setValue(va.g.d(e11));
            qb.c.c(i.f80421f, "", e11);
        }

        @Override // qb0.c
        public void onNext(Integer integer) {
            i.this.f80424c.call();
            i iVar = i.this;
            iVar.f80425d.setValue(iVar.getApplication().getString(R.string.userinfo_edit_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    public i(@NonNull Application application) {
        super(application);
        this.f80422a = new MutableLiveData<>();
        this.f80423b = new SingleLiveEvent<>();
        this.f80424c = new SingleLiveEvent<>();
        this.f80425d = new SingleLiveEvent<>();
        b();
    }

    private void b() {
        this.f80426e = new r();
        this.f80422a.observeForever(new Observer() { // from class: pf.h
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.this.c((String) obj);
            }
        });
    }

    public final void c(String key) {
        if (TextUtils.isEmpty(key)) {
            this.f80423b.setValue(new ArrayList());
        } else {
            this.f80426e.I(key.trim()).r5(new a());
        }
    }

    public void d() {
        this.f80422a.postValue(null);
    }

    public void f(gf.d school) {
        if (school == null) {
            return;
        }
        this.f80426e.t(getApplication(), school).r5(new c());
    }

    public void g() {
        if (TextUtils.isEmpty(this.f80422a.getValue())) {
            return;
        }
        this.f80426e.G(this.f80422a.getValue()).r5(new b());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<r.e<gf.d>> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(i.f80421f, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(r.e<gf.d> schoolPage) {
            i.this.f80423b.setValue(schoolPage.f53720a);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
