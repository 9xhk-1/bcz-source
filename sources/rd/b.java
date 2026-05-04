package rd;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.AndroidViewModel;
import com.baicizhan.client.business.util.SingleLiveEvent;
import pd.d;
import pd.f;
import qb.c;
import qb0.g;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends AndroidViewModel {

    /* renamed from: h, reason: collision with root package name */
    public static final String f83957h = "ImageDakaFragmentViewModel";

    /* renamed from: a, reason: collision with root package name */
    public ObservableInt f83958a;

    /* renamed from: b, reason: collision with root package name */
    public ObservableField<Bitmap> f83959b;

    /* renamed from: c, reason: collision with root package name */
    public ObservableInt f83960c;

    /* renamed from: d, reason: collision with root package name */
    public d f83961d;

    /* renamed from: e, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f83962e;

    /* renamed from: f, reason: collision with root package name */
    public h f83963f;

    /* renamed from: g, reason: collision with root package name */
    public h f83964g;

    public b(@NonNull Application application) {
        super(application);
        this.f83958a = new ObservableInt();
        this.f83959b = new ObservableField<>();
        this.f83960c = new ObservableInt();
        this.f83962e = new SingleLiveEvent<>();
    }

    public void a() {
        h hVar = this.f83964g;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f83964g.unsubscribe();
        }
        this.f83964g = this.f83961d.f(getApplication()).I3(tb0.a.a()).q5(new C1048b());
    }

    public void b() {
        if (this.f83961d.b().booleanValue()) {
            this.f83962e.setValue(Boolean.valueOf(!(this.f83962e.getValue() == null ? false : this.f83962e.getValue().booleanValue())));
        }
    }

    public d c() {
        return this.f83961d;
    }

    public SingleLiveEvent<Boolean> d() {
        return this.f83962e;
    }

    public final void f() {
        if (this.f83961d == null) {
            c.d("ImageDakaFragmentViewModel", "mImageProcesser is null", new Object[0]);
            return;
        }
        h hVar = this.f83963f;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f83963f.unsubscribe();
        }
        this.f83960c.set(1);
        this.f83963f = this.f83961d.a(getApplication()).I3(tb0.a.a()).r5(new a());
    }

    public void g() {
        f();
    }

    public void h(int type) {
        c.b("ImageDakaFragmentViewModel", "daka type is " + type, new Object[0]);
        this.f83958a.set(type);
        this.f83961d = f.a(type);
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        h hVar = this.f83963f;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f83963f.unsubscribe();
        }
        h hVar2 = this.f83964g;
        if (hVar2 == null || hVar2.isUnsubscribed()) {
            return;
        }
        this.f83964g.unsubscribe();
    }

    public void start() {
        f();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends g<Bitmap> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            b.this.f83960c.set(3);
            c.c("ImageDakaFragmentViewModel", "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            b.this.f83960c.set(2);
            b.this.f83959b.set(bitmap);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: rd.b$b, reason: collision with other inner class name */
    public class C1048b implements qb0.c<Bitmap> {
        public C1048b() {
        }

        @Override // qb0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            b.this.f83960c.set(2);
            b.this.f83959b.set(bitmap);
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            b.this.f83960c.set(3);
            c.c("ImageDakaFragmentViewModel", "", e11);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
