package lf;

import android.app.Application;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import gf.r;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k extends AndroidViewModel {

    /* renamed from: i, reason: collision with root package name */
    public static final String f71199i = "SearchPositionViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<String> f71200a;

    /* renamed from: b, reason: collision with root package name */
    public SingleLiveEvent<List<gf.b>> f71201b;

    /* renamed from: c, reason: collision with root package name */
    public ClickProtectedEvent<Void> f71202c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<Boolean> f71203d;

    /* renamed from: e, reason: collision with root package name */
    public SingleLiveEvent<String> f71204e;

    /* renamed from: f, reason: collision with root package name */
    public List<gf.b> f71205f;

    /* renamed from: g, reason: collision with root package name */
    public r f71206g;

    /* renamed from: h, reason: collision with root package name */
    public ta.b f71207h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<List<gf.b>> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c("SearchPositionViewModel", "", e11);
            k.this.f71207h.f(e11);
        }

        @Override // qb0.c
        public void onNext(List<gf.b> locationInfos) {
            k.this.f71205f = locationInfos;
            k.this.f71207h.s();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<String> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            k.this.f71204e.setValue(va.g.d(e11));
            qb.c.c("SearchPositionViewModel", "", e11);
        }

        @Override // qb0.c
        public void onNext(String s11) {
            k.this.f71202c.call();
            k kVar = k.this;
            kVar.f71204e.setValue(kVar.getApplication().getString(R.string.userinfo_edit_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    public k(@NonNull Application application, ta.b loadingViewModel) {
        super(application);
        this.f71200a = new MutableLiveData<>();
        this.f71201b = new SingleLiveEvent<>();
        this.f71202c = new ClickProtectedEvent<>();
        this.f71203d = new MutableLiveData<>();
        this.f71204e = new SingleLiveEvent<>();
        this.f71207h = loadingViewModel;
        d();
    }

    private void d() {
        this.f71206g = new r();
        this.f71200a.observeForever(new Observer() { // from class: lf.i
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.f((String) obj);
            }
        });
        this.f71207h.f90403e.observeForever(new Observer() { // from class: lf.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.g((Void) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(Void r12) {
        h();
    }

    public final /* synthetic */ void f(String str) {
        if (str != null) {
            str = str.trim();
        }
        if (TextUtils.isEmpty(str) || CollectionUtils.isEmpty(this.f71205f)) {
            this.f71203d.setValue(Boolean.FALSE);
            this.f71201b.setValue(new ArrayList());
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (gf.b bVar : this.f71205f) {
            if (bVar.f53658b.contains(str) || bVar.f53657a.contains(str)) {
                arrayList.add(bVar);
            }
        }
        this.f71203d.setValue(Boolean.valueOf(arrayList.isEmpty()));
        this.f71201b.setValue(arrayList);
    }

    public final void h() {
        this.f71207h.k();
        this.f71206g.x().r5(new a());
    }

    public void i() {
        this.f71200a.setValue(null);
    }

    public void j(gf.b locationInfo) {
        this.f71206g.q(getApplication(), locationInfo).r5(new b());
    }

    public void start() {
        h();
    }
}
