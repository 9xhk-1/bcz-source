package nf;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import gf.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k extends AndroidViewModel {

    /* renamed from: h, reason: collision with root package name */
    public static final String f75080h = "SearchPositionViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<String> f75081a;

    /* renamed from: b, reason: collision with root package name */
    public SingleLiveEvent<List<gf.c>> f75082b;

    /* renamed from: c, reason: collision with root package name */
    public SingleLiveEvent<Void> f75083c;

    /* renamed from: d, reason: collision with root package name */
    public SingleLiveEvent<String> f75084d;

    /* renamed from: e, reason: collision with root package name */
    public ta.b f75085e;

    /* renamed from: f, reason: collision with root package name */
    public r f75086f;

    /* renamed from: g, reason: collision with root package name */
    public qb0.h f75087g;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Integer> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c("SearchPositionViewModel", "", e11);
            k.this.f75084d.setValue(va.g.d(e11));
        }

        @Override // qb0.c
        public void onNext(Integer s11) {
            k.this.f75083c.call();
            k kVar = k.this;
            kVar.f75084d.setValue(kVar.getApplication().getString(R.string.userinfo_edit_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    public k(@NonNull Application application, ta.b model) {
        super(application);
        this.f75081a = new MutableLiveData<>();
        this.f75082b = new SingleLiveEvent<>();
        this.f75083c = new SingleLiveEvent<>();
        this.f75084d = new SingleLiveEvent<>();
        this.f75085e = model;
        model.f90403e.observeForever(new Observer() { // from class: nf.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.d((Void) obj);
            }
        });
        c();
    }

    private void c() {
        this.f75086f = new r();
        this.f75081a.observeForever(new Observer() { // from class: nf.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.f((String) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(Void r12) {
        f(this.f75081a.getValue());
    }

    public final void f(String key) {
        if (key != null) {
            key = key.trim();
        }
        if (TextUtils.isEmpty(key)) {
            this.f75085e.s();
            this.f75082b.setValue(new ArrayList());
            return;
        }
        qb0.h hVar = this.f75087g;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f75087g.unsubscribe();
        }
        this.f75085e.k();
        this.f75087g = this.f75086f.H(key, 0).r5(new a());
    }

    public void g() {
        this.f75081a.postValue(null);
    }

    public void h(gf.c majorInfo) {
        this.f75086f.r(getApplication(), majorInfo).r5(new b());
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<r.e<gf.c>> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c("SearchPositionViewModel", "", e11);
            k.this.f75085e.f(e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(r.e<gf.c> majorInfoPage) {
            k.this.f75082b.setValue(majorInfoPage.f53720a);
            if (CollectionUtils.isEmpty(majorInfoPage.f53720a)) {
                k.this.f75085e.b(R.string.userinfo_edit_no_major);
            } else {
                k.this.f75085e.s();
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
