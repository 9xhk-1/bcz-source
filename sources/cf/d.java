package cf;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import qb0.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends AndroidViewModel {

    /* renamed from: i, reason: collision with root package name */
    public static final String f8583i = "StudySettingViewModel";

    /* renamed from: a, reason: collision with root package name */
    public SingleLiveEvent<Void> f8584a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<Boolean> f8585b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<Boolean> f8586c;

    /* renamed from: d, reason: collision with root package name */
    public MutableLiveData<Boolean> f8587d;

    /* renamed from: e, reason: collision with root package name */
    public MutableLiveData<Boolean> f8588e;

    /* renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<String> f8589f;

    /* renamed from: g, reason: collision with root package name */
    public SingleLiveEvent<Void> f8590g;

    /* renamed from: h, reason: collision with root package name */
    public cf.c f8591h;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Observer<Boolean> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Boolean aBoolean) {
            if (aBoolean == null) {
                return;
            }
            d.this.g(aBoolean.booleanValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Boolean> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends g<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Boolean f8594a;

            public a(final Boolean val$aBoolean) {
                this.f8594a = val$aBoolean;
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
                d.this.f8586c.setValue(Boolean.valueOf(!this.f8594a.booleanValue()));
                qb.c.c(d.f8583i, "", e11);
                d.this.f8589f.setValue(va.g.e(e11, R.string.setting_study_operation_failed));
            }

            @Override // qb0.c
            public void onNext(Boolean success) {
                if (success.booleanValue()) {
                    d dVar = d.this;
                    dVar.f8589f.setValue(dVar.getApplication().getString(R.string.setting_study_operation_success));
                }
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        }

        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Boolean aBoolean) {
            if (aBoolean == null) {
                return;
            }
            d.this.f8591h.k(aBoolean.booleanValue()).r5(new a(aBoolean));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Boolean> {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a extends g<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Boolean f8597a;

            public a(final Boolean val$aBoolean) {
                this.f8597a = val$aBoolean;
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
                d.this.f8587d.setValue(Boolean.valueOf(!this.f8597a.booleanValue()));
                qb.c.c(d.f8583i, "", e11);
                d.this.f8589f.setValue(va.g.e(e11, R.string.setting_study_operation_failed));
            }

            @Override // qb0.c
            public void onNext(Boolean success) {
                if (success.booleanValue()) {
                    d dVar = d.this;
                    dVar.f8589f.setValue(dVar.getApplication().getString(R.string.setting_study_operation_success));
                }
                if (success.booleanValue() && this.f8597a.booleanValue()) {
                    d.this.f8590g.call();
                }
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        }

        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable final Boolean aBoolean) {
            if (aBoolean == null) {
                return;
            }
            d.this.f8591h.j(aBoolean.booleanValue()).r5(new a(aBoolean));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: cf.d$d, reason: collision with other inner class name */
    public class C0148d implements Observer<Boolean> {
        public C0148d() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Boolean aBoolean) {
            if (aBoolean == null) {
                return;
            }
            d.this.h(aBoolean.booleanValue());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class e extends g<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8600a;

        public e(final boolean val$open) {
            this.f8600a = val$open;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            d.this.f8585b.setValue(Boolean.valueOf(!this.f8600a));
            qb.c.c(d.f8583i, "", e11);
            d.this.f8589f.setValue(va.g.e(e11, R.string.setting_study_operation_failed));
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            if (aBoolean.booleanValue()) {
                d dVar = d.this;
                dVar.f8589f.setValue(dVar.getApplication().getString(R.string.setting_study_operation_success));
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class f extends g<Boolean> {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f8602a;

        public f(final boolean val$open) {
            this.f8602a = val$open;
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            d.this.f8588e.setValue(Boolean.valueOf(!this.f8602a));
            qb.c.c(d.f8583i, "", e11);
            d.this.f8589f.setValue(va.g.e(e11, R.string.setting_study_operation_failed));
        }

        @Override // qb0.c
        public void onNext(Boolean aBoolean) {
            if (aBoolean.booleanValue()) {
                d dVar = d.this;
                dVar.f8589f.setValue(dVar.getApplication().getString(R.string.setting_study_operation_success));
            }
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    public d(@NonNull Application application) {
        super(application);
        this.f8584a = new SingleLiveEvent<>();
        this.f8585b = new MutableLiveData<>();
        this.f8586c = new MutableLiveData<>();
        this.f8587d = new MutableLiveData<>();
        this.f8588e = new MutableLiveData<>();
        this.f8589f = new SingleLiveEvent<>();
        this.f8590g = new SingleLiveEvent<>();
        this.f8591h = new cf.c();
    }

    private void f() {
        this.f8585b.observeForever(new a());
        this.f8586c.observeForever(new b());
        this.f8587d.observeForever(new c());
        this.f8588e.observeForever(new C0148d());
    }

    public void d() {
        this.f8584a.call();
    }

    public final void g(final boolean open) {
        this.f8591h.i(getApplication(), open).r5(new e(open));
    }

    public final void h(final boolean open) {
        this.f8591h.h(getApplication(), open).r5(new f(open));
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }

    public void start() {
        this.f8585b.setValue(Boolean.valueOf(this.f8591h.e()));
        this.f8586c.setValue(Boolean.valueOf(this.f8591h.g()));
        this.f8587d.setValue(Boolean.valueOf(this.f8591h.f()));
        this.f8588e.setValue(Boolean.valueOf(this.f8591h.d()));
        f();
    }
}
