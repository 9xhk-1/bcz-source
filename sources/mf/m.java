package mf;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import com.baicizhan.client.business.util.SingleLiveEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class m extends AndroidViewModel {

    /* renamed from: a, reason: collision with root package name */
    public MutableLiveData<Integer> f73237a;

    /* renamed from: b, reason: collision with root package name */
    public MutableLiveData<Integer> f73238b;

    /* renamed from: c, reason: collision with root package name */
    public SingleLiveEvent<Void> f73239c;

    public m(@NonNull Application application) {
        super(application);
        this.f73237a = new MutableLiveData<>();
        this.f73238b = new MutableLiveData<>();
        this.f73239c = new SingleLiveEvent<>();
    }

    public void a() {
        this.f73239c.call();
    }

    public void b(Integer type) {
        this.f73238b.setValue(type);
    }
}
