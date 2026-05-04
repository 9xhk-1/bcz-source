package uh;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.main.selftest.FastTestStrategy;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class d extends ViewModelProvider.NewInstanceFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final int f92214b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final FastTestStrategy f92215a;

    public d(@k FastTestStrategy strategy) {
        g0.p(strategy, "strategy");
        this.f92215a = strategy;
    }

    @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @k
    public <T extends ViewModel> T create(@k Class<T> modelClass) {
        g0.p(modelClass, "modelClass");
        return modelClass.isAssignableFrom(com.baicizhan.main.selftest.a.class) ? new com.baicizhan.main.selftest.a(this.f92215a) : (T) super.create(modelClass);
    }
}
