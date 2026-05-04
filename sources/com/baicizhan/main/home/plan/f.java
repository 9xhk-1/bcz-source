package com.baicizhan.main.home.plan;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class f extends ViewModelProvider.AndroidViewModelFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final int f22412b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Application f22413a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(@m80.k Application application) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        this.f22413a = application;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @m80.k
    public <T extends ViewModel> T create(@m80.k Class<T> modelClass) {
        kotlin.jvm.internal.g0.p(modelClass, "modelClass");
        return modelClass.isAssignableFrom(og.t.class) ? new og.t(this.f22413a) : (T) super.create(modelClass);
    }
}
