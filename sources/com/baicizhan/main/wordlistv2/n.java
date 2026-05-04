package com.baicizhan.main.wordlistv2;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes5.dex */
public final class n extends ViewModelProvider.AndroidViewModelFactory {

    /* renamed from: c, reason: collision with root package name */
    public static final int f27893c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Application f27894a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final w0 f27895b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(@m80.k Application application, @m80.k w0 activityVM) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(activityVM, "activityVM");
        this.f27894a = application;
        this.f27895b = activityVM;
    }

    @m80.k
    public final w0 a() {
        return this.f27895b;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @m80.k
    public <T extends ViewModel> T create(@m80.k Class<T> modelClass) {
        kotlin.jvm.internal.g0.p(modelClass, "modelClass");
        return modelClass.isAssignableFrom(t.class) ? new t(this.f27894a, this.f27895b) : (T) super.create(modelClass);
    }
}
