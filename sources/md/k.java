package md;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class k extends AndroidViewModel {

    /* renamed from: b, reason: collision with root package name */
    public static final int f73129b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final MutableLiveData<Boolean> f73130a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(@m80.k Application application) {
        super(application);
        g0.p(application, "application");
        this.f73130a = new MutableLiveData<>();
    }

    @m80.k
    public final MutableLiveData<Boolean> a() {
        return this.f73130a;
    }

    public final void b(boolean z11) {
        this.f73130a.setValue(Boolean.valueOf(z11));
    }
}
