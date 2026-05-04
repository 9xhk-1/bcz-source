package ze;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.debug.DebugConfig;
import com.baicizhan.client.business.util.ClickProtectedEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class s extends AndroidViewModel {

    /* renamed from: m, reason: collision with root package name */
    public static final String f102585m = "PostSettingViewModel";

    /* renamed from: a, reason: collision with root package name */
    public ClickProtectedEvent<Void> f102586a;

    /* renamed from: b, reason: collision with root package name */
    public ClickProtectedEvent<Void> f102587b;

    /* renamed from: c, reason: collision with root package name */
    public ClickProtectedEvent<Void> f102588c;

    /* renamed from: d, reason: collision with root package name */
    public ClickProtectedEvent<Void> f102589d;

    /* renamed from: e, reason: collision with root package name */
    public ClickProtectedEvent<Void> f102590e;

    /* renamed from: f, reason: collision with root package name */
    public ClickProtectedEvent<Void> f102591f;

    /* renamed from: g, reason: collision with root package name */
    public LiveData<Boolean> f102592g;

    /* renamed from: h, reason: collision with root package name */
    public MutableLiveData<Boolean> f102593h;

    /* renamed from: i, reason: collision with root package name */
    public MutableLiveData<Boolean> f102594i;

    /* renamed from: j, reason: collision with root package name */
    public MutableLiveData<Boolean> f102595j;

    /* renamed from: k, reason: collision with root package name */
    public MutableLiveData<Boolean> f102596k;

    /* renamed from: l, reason: collision with root package name */
    public MutableLiveData<Boolean> f102597l;

    public s(@NonNull Application application) {
        super(application);
        this.f102586a = new ClickProtectedEvent<>();
        this.f102587b = new ClickProtectedEvent<>();
        this.f102588c = new ClickProtectedEvent<>();
        this.f102589d = new ClickProtectedEvent<>();
        this.f102590e = new ClickProtectedEvent<>();
        this.f102591f = new ClickProtectedEvent<>();
        this.f102592g = new MutableLiveData();
        this.f102593h = new MutableLiveData<>();
        this.f102594i = new MutableLiveData<>();
        this.f102595j = new MutableLiveData<>();
        this.f102596k = new MutableLiveData<>();
        this.f102597l = new MutableLiveData<>();
    }

    public void a() {
        this.f102587b.call();
    }

    public void b() {
        this.f102591f.call();
    }

    public void c() {
        this.f102590e.call();
    }

    public void d() {
        this.f102586a.call();
    }

    public void f() {
        this.f102588c.call();
    }

    public void g() {
        this.f102589d.call();
    }

    public void start() {
        ((MutableLiveData) this.f102592g).postValue(Boolean.valueOf(DebugConfig.getsIntance().enable));
    }
}
