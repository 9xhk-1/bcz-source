package com.baicizhan.main.examassistant;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class x extends ViewModelProvider.AndroidViewModelFactory {

    /* renamed from: d, reason: collision with root package name */
    public static final int f20695d = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Application f20696a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final hj.m f20697b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20698c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(@m80.k Application application, @m80.k hj.m collectHelper, int i11) {
        super(application);
        kotlin.jvm.internal.g0.p(application, "application");
        kotlin.jvm.internal.g0.p(collectHelper, "collectHelper");
        this.f20696a = application;
        this.f20697b = collectHelper;
        this.f20698c = i11;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @m80.k
    public <T extends ViewModel> T create(@m80.k Class<T> modelClass) {
        kotlin.jvm.internal.g0.p(modelClass, "modelClass");
        return modelClass.isAssignableFrom(t1.class) ? new t1(this.f20696a, this.f20697b, this.f20698c) : (T) super.create(modelClass);
    }
}
