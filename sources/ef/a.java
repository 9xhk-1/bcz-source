package ef;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import com.baicizhan.client.business.util.SingleLiveEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends AndroidViewModel {

    /* renamed from: d, reason: collision with root package name */
    public static final String f49742d = "SexPickUpViewModel";

    /* renamed from: a, reason: collision with root package name */
    public SingleLiveEvent<Integer> f49743a;

    /* renamed from: b, reason: collision with root package name */
    public SingleLiveEvent<Integer> f49744b;

    /* renamed from: c, reason: collision with root package name */
    public SingleLiveEvent<Void> f49745c;

    public a(@NonNull Application application) {
        super(application);
        this.f49743a = new SingleLiveEvent<>();
        this.f49744b = new SingleLiveEvent<>();
        this.f49745c = new SingleLiveEvent<>();
    }

    public void a() {
        this.f49745c.call();
    }

    public void b(int sex) {
        this.f49744b.setValue(Integer.valueOf(sex));
        this.f49743a.setValue(Integer.valueOf(sex));
        this.f49745c.call();
    }

    public void c(int sex) {
        this.f49743a.setValue(Integer.valueOf(sex));
    }
}
