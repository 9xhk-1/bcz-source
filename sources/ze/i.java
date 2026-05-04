package ze;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class i extends AndroidViewModel {

    /* renamed from: e, reason: collision with root package name */
    public static final String f102568e = "PostSettingViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<Boolean> f102569a;

    /* renamed from: b, reason: collision with root package name */
    public ta.b f102570b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<Boolean> f102571c;

    /* renamed from: d, reason: collision with root package name */
    public qb0.h f102572d;

    public i(@NonNull Application application, ta.b loadingViewModel) {
        super(application);
        this.f102569a = new MutableLiveData<>();
        this.f102571c = new MutableLiveData<>();
        this.f102570b = loadingViewModel;
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(Boolean bool) {
        qb.c.i("PostSettingViewModel", "isOpen %b", bool);
        this.f102571c.postValue(Boolean.FALSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void l(Void r12) {
        o();
    }

    private void o() {
        this.f102570b.k();
        qb0.h hVar = this.f102572d;
        if (hVar != null) {
            hVar.unsubscribe();
        }
        this.f102572d = af.g.f2637a.h().u5(new wb0.b() { // from class: ze.e
            @Override // wb0.b
            public final void call(Object obj) {
                i.this.m((Boolean) obj);
            }
        }, new wb0.b() { // from class: ze.f
            @Override // wb0.b
            public final void call(Object obj) {
                i.this.n((Throwable) obj);
            }
        });
    }

    public void h() {
        this.f102569a.observeForever(new Observer() { // from class: ze.c
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.this.k((Boolean) obj);
            }
        });
        this.f102570b.f90403e.observeForever(new Observer() { // from class: ze.d
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                i.this.l((Void) obj);
            }
        });
    }

    public final /* synthetic */ void j(Boolean bool, Throwable th2) {
        va.g.j(th2, 0);
        this.f102569a.postValue(Boolean.valueOf(!bool.booleanValue()));
        this.f102571c.postValue(Boolean.FALSE);
        qb.c.c("PostSettingViewModel", "", th2);
    }

    public final /* synthetic */ void k(final Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        af.g gVar = af.g.f2637a;
        if (booleanValue == gVar.g()) {
            return;
        }
        this.f102571c.postValue(Boolean.TRUE);
        gVar.m(bool.booleanValue()).u5(new wb0.b() { // from class: ze.g
            @Override // wb0.b
            public final void call(Object obj) {
                i.this.i((Boolean) obj);
            }
        }, new wb0.b() { // from class: ze.h
            @Override // wb0.b
            public final void call(Object obj) {
                i.this.j(bool, (Throwable) obj);
            }
        });
    }

    public final /* synthetic */ void m(Boolean bool) {
        this.f102570b.s();
        this.f102569a.postValue(bool);
    }

    public final /* synthetic */ void n(Throwable th2) {
        this.f102570b.f(th2);
    }

    public void start() {
        o();
    }
}
