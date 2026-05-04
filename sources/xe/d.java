package xe;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.jiongji.andriod.card.R;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class d extends AndroidViewModel {

    /* renamed from: f, reason: collision with root package name */
    public static final String f98018f = "ExtraProblemViewModel";

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<Boolean> f98019a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<Boolean> f98020b;

    /* renamed from: c, reason: collision with root package name */
    public MutableLiveData<Boolean> f98021c;

    /* renamed from: d, reason: collision with root package name */
    public SingleLiveEvent<String> f98022d;

    /* renamed from: e, reason: collision with root package name */
    public xe.a f98023e;

    public d(@NonNull Application application) {
        super(application);
        this.f98019a = new MutableLiveData<>();
        this.f98020b = new MutableLiveData<>();
        this.f98021c = new MutableLiveData<>();
        this.f98022d = new SingleLiveEvent<>();
        this.f98023e = new xe.a();
    }

    private void b() {
        this.f98019a.observeForever(new a());
        this.f98021c.observeForever(new b());
        this.f98020b.observeForever(new c());
    }

    public void start() {
        this.f98019a.setValue(Boolean.valueOf(this.f98023e.b()));
        this.f98020b.setValue(Boolean.valueOf(this.f98023e.c()));
        this.f98021c.setValue(Boolean.valueOf(this.f98023e.a()));
        b();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Observer<Boolean> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable final Boolean aBoolean) {
            if (aBoolean == null) {
                return;
            }
            d.this.f98023e.e(aBoolean.booleanValue()).q5(new C1322a(aBoolean));
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: xe.d$a$a, reason: collision with other inner class name */
        public class C1322a implements qb0.c<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Boolean f98025a;

            public C1322a(final Boolean val$aBoolean) {
                this.f98025a = val$aBoolean;
            }

            @Override // qb0.c
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onNext(Boolean aBoolean) {
                if (aBoolean.booleanValue()) {
                    d dVar = d.this;
                    dVar.f98022d.setValue(dVar.getApplication().getString(R.string.setting_study_operation_success));
                }
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
                d.this.f98019a.setValue(Boolean.valueOf(!this.f98025a.booleanValue()));
                d.this.f98022d.setValue(g.e(e11, R.string.setting_study_operation_failed));
                qb.c.c(d.f98018f, "", e11);
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Boolean> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable final Boolean aBoolean) {
            if (aBoolean == null) {
                return;
            }
            d.this.f98023e.d(aBoolean.booleanValue()).q5(new a(aBoolean));
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.c<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Boolean f98028a;

            public a(final Boolean val$aBoolean) {
                this.f98028a = val$aBoolean;
            }

            @Override // qb0.c
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onNext(Boolean aBoolean) {
                if (aBoolean.booleanValue()) {
                    d dVar = d.this;
                    dVar.f98022d.setValue(dVar.getApplication().getString(R.string.setting_study_operation_success));
                }
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
                d.this.f98022d.setValue(g.e(e11, R.string.setting_study_operation_failed));
                d.this.f98021c.setValue(Boolean.valueOf(!this.f98028a.booleanValue()));
                qb.c.c(d.f98018f, "", e11);
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Boolean> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable final Boolean aBoolean) {
            if (aBoolean == null) {
                return;
            }
            d.this.f98023e.f(aBoolean.booleanValue()).q5(new a(aBoolean));
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class a implements qb0.c<Boolean> {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Boolean f98031a;

            public a(final Boolean val$aBoolean) {
                this.f98031a = val$aBoolean;
            }

            @Override // qb0.c
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public void onNext(Boolean aBoolean) {
                if (aBoolean.booleanValue()) {
                    d dVar = d.this;
                    dVar.f98022d.setValue(dVar.getApplication().getString(R.string.setting_study_operation_success));
                }
            }

            @Override // qb0.c
            public void onError(Throwable e11) {
                d.this.f98020b.setValue(Boolean.valueOf(!this.f98031a.booleanValue()));
                d.this.f98022d.setValue(g.e(e11, R.string.setting_study_operation_failed));
                qb.c.c(d.f98018f, "", e11);
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        }
    }
}
