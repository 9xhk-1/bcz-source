package com.baicizhan.main.home.plan;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class p1 extends ViewModelProvider.AndroidViewModelFactory {

    /* renamed from: c, reason: collision with root package name */
    public static final int f22899c = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final Fragment f22900a;

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public final be.i f22901b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public p1(@m80.k androidx.fragment.app.Fragment r3, @m80.k be.i r4) {
        /*
            r2 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.g0.p(r3, r0)
            java.lang.String r0 = "retriever"
            kotlin.jvm.internal.g0.p(r4, r0)
            androidx.fragment.app.FragmentActivity r0 = r3.requireActivity()
            android.app.Application r0 = r0.getApplication()
            java.lang.String r1 = "getApplication(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.<init>(r0)
            r2.f22900a = r3
            r2.f22901b = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.main.home.plan.p1.<init>(androidx.fragment.app.Fragment, be.i):void");
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @m80.k
    public <T extends ViewModel> T create(@m80.k Class<T> modelClass) {
        kotlin.jvm.internal.g0.p(modelClass, "modelClass");
        if (!kotlin.jvm.internal.g0.g(modelClass, a3.class)) {
            return (T) super.create(modelClass);
        }
        Application application = this.f22900a.requireActivity().getApplication();
        Fragment fragment = this.f22900a;
        kotlin.jvm.internal.g0.m(application);
        return new a3(application, (og.t) new ViewModelProvider(fragment, new f(application)).get(og.t.class), this.f22901b);
    }
}
