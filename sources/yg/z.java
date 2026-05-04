package yg;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import com.baicizhan.client.business.util.ClickProtectedEvent;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public abstract class z extends AndroidViewModel {

    /* renamed from: c, reason: collision with root package name */
    public static final int f100123c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final ClickProtectedEvent f100124a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final LiveData f100125b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(@m80.k Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        ClickProtectedEvent clickProtectedEvent = new ClickProtectedEvent();
        this.f100124a = clickProtectedEvent;
        this.f100125b = clickProtectedEvent;
    }

    public final void a() {
        this.f100124a.call();
    }

    @m80.k
    public final LiveData b() {
        return this.f100125b;
    }
}
