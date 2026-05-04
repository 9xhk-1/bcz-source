package gd;

import android.app.Application;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.lang.ref.WeakReference;
import jd.e0;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class m extends ViewModelProvider.AndroidViewModelFactory {

    /* renamed from: b, reason: collision with root package name */
    public static final int f53615b = 8;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public final WeakReference<FragmentActivity> f53616a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m(@m80.k androidx.fragment.app.FragmentActivity r3) {
        /*
            r2 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.g0.p(r3, r0)
            android.app.Application r0 = r3.getApplication()
            java.lang.String r1 = "getApplication(...)"
            kotlin.jvm.internal.g0.o(r0, r1)
            r2.<init>(r0)
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.f53616a = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: gd.m.<init>(androidx.fragment.app.FragmentActivity):void");
    }

    @m80.k
    public final WeakReference<FragmentActivity> a() {
        return this.f53616a;
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @m80.k
    public <T extends ViewModel> T create(@m80.k Class<T> modelClass) {
        g0.p(modelClass, "modelClass");
        FragmentActivity fragmentActivity = this.f53616a.get();
        if (fragmentActivity != null) {
            if (!g0.g(modelClass, l.class)) {
                fragmentActivity = null;
            }
            if (fragmentActivity != null) {
                e0 e0Var = (e0) new ViewModelProvider(fragmentActivity).get(e0.class);
                b0 b0Var = (b0) new ViewModelProvider(fragmentActivity).get(b0.class);
                Application application = fragmentActivity.getApplication();
                g0.o(application, "getApplication(...)");
                return new l(application, e0Var, b0Var);
            }
        }
        return (T) super.create(modelClass);
    }
}
