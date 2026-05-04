package kf;

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
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class p extends AndroidViewModel {

    /* renamed from: o, reason: collision with root package name */
    public static final String f66493o = "CategoryViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<String> f66494a;

    /* renamed from: b, reason: collision with root package name */
    public SingleLiveEvent<String> f66495b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<Boolean> f66496c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<List> f66497d;

    /* renamed from: e, reason: collision with root package name */
    public SingleLiveEvent<Void> f66498e;

    /* renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f66499f;

    /* renamed from: g, reason: collision with root package name */
    public MutableLiveData<Boolean> f66500g;

    /* renamed from: h, reason: collision with root package name */
    public SingleLiveEvent<String> f66501h;

    /* renamed from: i, reason: collision with root package name */
    public m f66502i;

    /* renamed from: j, reason: collision with root package name */
    public Stack<List> f66503j;

    /* renamed from: k, reason: collision with root package name */
    public r f66504k;

    /* renamed from: l, reason: collision with root package name */
    public qb0.h f66505l;

    /* renamed from: m, reason: collision with root package name */
    public qb0.h f66506m;

    /* renamed from: n, reason: collision with root package name */
    public ta.b f66507n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Integer> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            p.this.f66501h.setValue(va.g.d(e11));
            qb.c.c(p.f66493o, "", e11);
        }

        @Override // qb0.c
        public void onNext(Integer integer) {
            p pVar = p.this;
            pVar.f66501h.setValue(pVar.getApplication().getString(R.string.userinfo_edit_success));
            p.this.f66498e.call();
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b extends qb0.g<Boolean> {
        public b() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(p.f66493o, "", e11);
            p.this.f66501h.setValue(va.g.e(e11, R.string.userinfo_report_failed));
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            p pVar = p.this;
            pVar.f66501h.setValue(pVar.getApplication().getString(R.string.userinfo_report_success));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c extends qb0.g<List> {
        public c() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            qb.c.c(p.f66493o, "", e11);
            p.this.f66507n.f(e11);
        }

        @Override // qb0.c
        public void onNext(List list) {
            if (!CollectionUtils.isEmpty(list) && (list.get(0) instanceof gf.d) && !p.this.h()) {
                p.this.f66500g.setValue(Boolean.TRUE);
            }
            p.this.f66497d.setValue(list);
            if (p.this.h() || !CollectionUtils.isEmpty(p.this.f66497d.getValue())) {
                p.this.f66507n.s();
            } else {
                p.this.f66507n.b(R.string.empty_school);
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    public p(@NonNull Application application, ta.b loadingViewModel) {
        super(application);
        this.f66494a = new MutableLiveData<>();
        this.f66495b = new SingleLiveEvent<>();
        this.f66496c = new MutableLiveData<>();
        this.f66497d = new MutableLiveData<>();
        this.f66498e = new SingleLiveEvent<>();
        this.f66499f = new SingleLiveEvent<>();
        this.f66500g = new MutableLiveData<>();
        this.f66501h = new SingleLiveEvent<>();
        this.f66502i = new m();
        this.f66503j = new Stack<>();
        this.f66507n = loadingViewModel;
        g();
    }

    private void g() {
        this.f66504k = new r();
        this.f66497d.setValue(Arrays.asList(5, 3, 4, 2, 1));
        this.f66495b.setValue(this.f66502i.i(getApplication()));
        this.f66500g.setValue(Boolean.FALSE);
        this.f66494a.observeForever(new Observer() { // from class: kf.n
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                p.this.p((String) obj);
            }
        });
        this.f66507n.f90403e.observeForever(new Observer() { // from class: kf.o
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                p.this.i((Void) obj);
            }
        });
        this.f66507n.s();
    }

    public void d() {
        if (this.f66503j.isEmpty()) {
            return;
        }
        qb0.h hVar = this.f66505l;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f66505l.unsubscribe();
        }
        SingleLiveEvent<Boolean> singleLiveEvent = this.f66499f;
        Boolean bool = Boolean.FALSE;
        singleLiveEvent.setValue(bool);
        this.f66507n.s();
        this.f66500g.setValue(bool);
        this.f66494a.setValue(null);
        this.f66502i.f();
        this.f66497d.setValue(this.f66503j.pop());
        this.f66495b.setValue(this.f66502i.i(getApplication()));
        this.f66496c.setValue(Boolean.valueOf(!this.f66503j.isEmpty()));
    }

    public final void f() {
        int d11 = this.f66502i.d();
        String e11 = this.f66502i.e();
        String b11 = this.f66502i.b();
        String c11 = this.f66502i.c();
        if (-1 == d11) {
            qb.c.d(f66493o, "", new Object[0]);
            return;
        }
        this.f66507n.k();
        qb0.h hVar = this.f66505l;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f66505l.unsubscribe();
        }
        this.f66505l = this.f66504k.J(d11, e11, b11, c11, this.f66494a.getValue()).r5(new c());
    }

    public final boolean h() {
        if (!CollectionUtils.isEmpty(this.f66503j)) {
            List peek = this.f66503j.peek();
            if (!CollectionUtils.isEmpty(peek) && (peek.get(0) instanceof gf.d)) {
                return true;
            }
        }
        return false;
    }

    public final /* synthetic */ void i(Void r12) {
        f();
    }

    public void j(String next) {
        if (this.f66507n.j()) {
            return;
        }
        if (!this.f66502i.h(next)) {
            qb.c.d(f66493o, "%s", new com.google.gson.d().z(this.f66503j));
            return;
        }
        this.f66495b.setValue(this.f66502i.i(getApplication()));
        n();
        this.f66497d.setValue(null);
        f();
        this.f66496c.setValue(Boolean.valueOf(!this.f66503j.isEmpty()));
    }

    public void k() {
        this.f66494a.setValue(null);
    }

    public void l(int level) {
        if (this.f66507n.j()) {
            return;
        }
        if (!this.f66502i.g(level)) {
            qb.c.d(f66493o, "%s", new com.google.gson.d().z(this.f66503j));
            return;
        }
        this.f66495b.setValue(this.f66502i.i(getApplication()));
        n();
        this.f66497d.setValue(null);
        f();
        this.f66496c.setValue(Boolean.valueOf(!this.f66503j.isEmpty()));
    }

    public void m(gf.d school) {
        qb0.h hVar = this.f66506m;
        if (hVar == null || hVar.isUnsubscribed()) {
            this.f66506m = this.f66504k.t(getApplication(), school).r5(new a());
        }
    }

    public final void n() {
        if (this.f66497d.getValue() != null) {
            this.f66503j.push(this.f66497d.getValue());
        }
    }

    public void o(String text) {
        if (TextUtils.isEmpty(text)) {
            return;
        }
        this.f66504k.G(text).r5(new b());
    }

    public final void p(String key) {
        if (key != null) {
            key = key.trim();
        }
        if (!TextUtils.isEmpty(key)) {
            if (!h()) {
                n();
            }
            this.f66497d.setValue(null);
            f();
            return;
        }
        if (h()) {
            this.f66497d.setValue(this.f66503j.pop());
            this.f66507n.s();
            qb0.h hVar = this.f66505l;
            if (hVar != null && !hVar.isUnsubscribed()) {
                this.f66505l.unsubscribe();
            }
            qb.c.i(f66493o, "change to category school list", new Object[0]);
        }
    }
}
