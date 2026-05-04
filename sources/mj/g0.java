package mj;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class g0 extends ViewModelProvider.AndroidViewModelFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final int f73291d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Application f73292a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final ij.q f73293b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73294c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(@m80.k Application application, @m80.k ij.q wordBookManager, long j11) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(wordBookManager, "wordBookManager");
        this.f73292a = application;
        this.f73293b = wordBookManager;
        this.f73294c = j11;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @m80.k
    public <T extends ViewModel> T create(@m80.k Class<T> modelClass) {
        kotlin.jvm.internal.g0.p(modelClass, "modelClass");
        return modelClass.isAssignableFrom(i0.class) ? new i0(this.f73292a, this.f73293b, this.f73294c) : modelClass.isAssignableFrom(qj.n.class) ? new qj.n(this.f73292a, this.f73293b, this.f73294c) : (T) super.create(modelClass);
    }
}
