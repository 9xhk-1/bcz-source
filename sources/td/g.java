package td;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import com.baicizhan.client.business.util.ClickProtectedEvent;
import com.baicizhan.client.business.util.SingleLiveEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g extends AndroidViewModel {

    /* renamed from: d, reason: collision with root package name */
    public static final String f90468d = "PickupPhotoViewModel";

    /* renamed from: a, reason: collision with root package name */
    public SingleLiveEvent<Void> f90469a;

    /* renamed from: b, reason: collision with root package name */
    public SingleLiveEvent<Void> f90470b;

    /* renamed from: c, reason: collision with root package name */
    public SingleLiveEvent<Void> f90471c;

    public g(@NonNull Application application) {
        super(application);
        this.f90469a = new SingleLiveEvent<>();
        this.f90470b = new ClickProtectedEvent();
        this.f90471c = new ClickProtectedEvent();
    }

    public void a() {
        this.f90469a.call();
    }

    public SingleLiveEvent<Void> b() {
        return this.f90469a;
    }

    public SingleLiveEvent<Void> c() {
        return this.f90471c;
    }

    public SingleLiveEvent<Void> d() {
        return this.f90470b;
    }

    public void f() {
        this.f90471c.call();
    }

    public void g() {
        this.f90470b.call();
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        super.onCleared();
    }
}
