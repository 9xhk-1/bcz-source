package bf;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Observer;
import bf.d;
import com.baicizhan.client.business.util.SingleLiveEvent;
import qb0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends AndroidViewModel {

    /* renamed from: g, reason: collision with root package name */
    public static final String f6799g = "RemindViewModel";

    /* renamed from: a, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f6800a;

    /* renamed from: b, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f6801b;

    /* renamed from: c, reason: collision with root package name */
    public SingleLiveEvent<Void> f6802c;

    /* renamed from: d, reason: collision with root package name */
    public SingleLiveEvent<Void> f6803d;

    /* renamed from: e, reason: collision with root package name */
    public ta.b f6804e;

    /* renamed from: f, reason: collision with root package name */
    public d f6805f;

    public c(@NonNull Application application, ta.b loadingViewModel) {
        super(application);
        this.f6800a = new SingleLiveEvent<>();
        this.f6801b = new SingleLiveEvent<>();
        this.f6802c = new SingleLiveEvent<>();
        this.f6803d = new SingleLiveEvent<>();
        this.f6805f = new d();
        this.f6804e = loadingViewModel;
        loadingViewModel.f90403e.observeForever(new Observer() { // from class: bf.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c.this.d((Void) obj);
            }
        });
    }

    private void f() {
        this.f6804e.k();
        this.f6805f.a().r5(new a());
    }

    public void b() {
        this.f6802c.call();
    }

    public void c() {
        this.f6803d.call();
    }

    public final /* synthetic */ void d(Void r12) {
        f();
    }

    public void start() {
        f();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<d.c> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            c.this.f6804e.f(e11);
            qb.c.c(c.f6799g, "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(d.c reminderInfo) {
            c.this.f6804e.s();
            c.this.f6800a.setValue(Boolean.valueOf(reminderInfo.f6810b));
            c.this.f6801b.setValue(Boolean.valueOf(reminderInfo.f6809a));
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
