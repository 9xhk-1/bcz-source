package pj;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.AndroidViewModel;
import ij.q;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public abstract class a extends AndroidViewModel {

    /* renamed from: b, reason: collision with root package name */
    public static final int f80652b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final q f80653a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@k q wordBookManager, @k Application application) {
        super(application);
        g0.p(wordBookManager, "wordBookManager");
        g0.p(application, "application");
        this.f80653a = wordBookManager;
    }

    @k
    public final q a() {
        return this.f80653a;
    }
}
