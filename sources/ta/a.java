package ta;

import android.app.Application;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends ViewModelProvider.AndroidViewModelFactory {

    /* renamed from: a, reason: collision with root package name */
    public WeakReference<FragmentActivity> f90392a;

    /* renamed from: b, reason: collision with root package name */
    public WeakReference<Fragment> f90393b;

    public a(FragmentActivity activity) {
        super(activity.getApplication());
        this.f90392a = new WeakReference<>(activity);
    }

    @Override // androidx.lifecycle.ViewModelProvider.AndroidViewModelFactory, androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
    @NonNull
    public <T extends ViewModel> T create(@NonNull Class<T> cls) {
        b bVar;
        Application application;
        try {
            if (this.f90392a != null) {
                bVar = (b) new ViewModelProvider(this.f90392a.get()).get(b.class);
                application = this.f90392a.get().getApplication();
            } else if (this.f90393b != null) {
                bVar = (b) new ViewModelProvider(this.f90393b.get()).get(b.class);
                application = this.f90393b.get().getActivity().getApplication();
            } else {
                bVar = null;
                application = null;
            }
            if (bVar != null) {
                return cls.getConstructor(Application.class, b.class).newInstance(application, bVar);
            }
            throw new NullPointerException("null model");
        } catch (Exception e11) {
            qb.c.c("LoadingVMFactory", "", e11);
            return (T) super.create(cls);
        }
    }

    public a(Fragment fragment) {
        super(fragment.getActivity().getApplication());
        this.f90393b = new WeakReference<>(fragment);
    }
}
