package td;

import android.app.Application;
import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.AndroidViewModel;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;
import com.baicizhan.main.activity.daka.datasource.PhotoException;
import com.jiongji.andriod.card.R;
import java.util.concurrent.ExecutionException;
import qb0.h;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends AndroidViewModel {

    /* renamed from: j, reason: collision with root package name */
    public static final String f90442j = "ImageDakaFragmentViewModel";

    /* renamed from: k, reason: collision with root package name */
    public static final int f90443k = 10;

    /* renamed from: a, reason: collision with root package name */
    public ObservableBoolean f90444a;

    /* renamed from: b, reason: collision with root package name */
    public ObservableField<Bitmap> f90445b;

    /* renamed from: c, reason: collision with root package name */
    public ObservableInt f90446c;

    /* renamed from: d, reason: collision with root package name */
    public c f90447d;

    /* renamed from: e, reason: collision with root package name */
    public SingleLiveEvent<Boolean> f90448e;

    /* renamed from: f, reason: collision with root package name */
    public SingleLiveEvent<Void> f90449f;

    /* renamed from: g, reason: collision with root package name */
    public SingleLiveEvent<String> f90450g;

    /* renamed from: h, reason: collision with root package name */
    public h f90451h;

    /* renamed from: i, reason: collision with root package name */
    public h f90452i;

    public b(@NonNull Application application) {
        super(application);
        this.f90444a = new ObservableBoolean();
        this.f90445b = new ObservableField<>();
        this.f90446c = new ObservableInt();
        this.f90448e = new ClickProtectedEvent();
        this.f90449f = new ClickProtectedEvent();
        this.f90450g = new SingleLiveEvent<>();
        this.f90447d = (c) pd.f.a(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        h hVar = this.f90451h;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f90451h.unsubscribe();
        }
        this.f90446c.set(1);
        this.f90444a.set(false);
        this.f90451h = this.f90447d.a(getApplication()).I3(tb0.a.a()).r5(new a());
    }

    public void b() {
        this.f90449f.call();
    }

    public void c() {
        if (this.f90446c.get() != 2) {
            return;
        }
        this.f90448e.setValue(Boolean.valueOf(!(this.f90448e.getValue() == null ? true : this.f90448e.getValue().booleanValue())));
    }

    public SingleLiveEvent<Void> d() {
        return this.f90449f;
    }

    public pd.d f() {
        return this.f90447d;
    }

    public SingleLiveEvent<Boolean> g() {
        return this.f90448e;
    }

    public SingleLiveEvent<String> h() {
        return this.f90450g;
    }

    public void j(String photoUri) {
        h hVar = this.f90452i;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f90452i.unsubscribe();
        }
        this.f90446c.set(1);
        this.f90447d.v(photoUri);
        this.f90452i = this.f90447d.f(getApplication()).I3(tb0.a.a()).q5(new C1200b());
    }

    public void k() {
        i();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
        h hVar = this.f90451h;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.f90451h.unsubscribe();
        }
        h hVar2 = this.f90452i;
        if (hVar2 == null || hVar2.isUnsubscribed()) {
            return;
        }
        this.f90452i.unsubscribe();
    }

    public void start() {
        i();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a extends qb0.g<Bitmap> {
        public a() {
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            b.this.f90446c.set(3);
            qb.c.c("ImageDakaFragmentViewModel", "", e11);
        }

        @Override // qb0.c
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            b.this.f90446c.set(10);
            b.this.f90445b.set(bitmap);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: td.b$b, reason: collision with other inner class name */
    public class C1200b implements qb0.c<Bitmap> {
        public C1200b() {
        }

        @Override // qb0.c
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void onNext(Bitmap bitmap) {
            b.this.f90446c.set(2);
            b.this.f90444a.set(true);
            b.this.f90445b.set(bitmap);
        }

        @Override // qb0.c
        public void onError(Throwable e11) {
            b.this.i();
            if (e11 instanceof PhotoException) {
                b.this.f90450g.setValue(e11.getMessage());
            } else if (e11 instanceof ExecutionException) {
                b bVar = b.this;
                bVar.f90450g.setValue(bVar.getApplication().getString(R.string.network_error_retry_later));
            } else {
                b bVar2 = b.this;
                bVar2.f90450g.setValue(bVar2.getApplication().getString(R.string.daka_image_pick_up_photo_error));
            }
            qb.c.c("ImageDakaFragmentViewModel", "", e11);
        }

        @Override // qb0.c
        public void onCompleted() {
        }
    }
}
