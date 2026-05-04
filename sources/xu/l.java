package xu;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public CreationExtras f98353a;

    /* renamed from: b, reason: collision with root package name */
    public SavedStateHandle f98354b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f98355c;

    public l(@Nullable CreationExtras extras) {
        this.f98355c = extras == null;
        this.f98353a = extras;
    }

    public void a() {
        this.f98353a = null;
    }

    public SavedStateHandle b() {
        tu.c.a();
        gv.f.d(!this.f98355c, "Activity that does not extend ComponentActivity cannot use SavedStateHandle", new Object[0]);
        SavedStateHandle savedStateHandle = this.f98354b;
        if (savedStateHandle != null) {
            return savedStateHandle;
        }
        gv.f.c(this.f98353a, "The first access to SavedStateHandle should happen between super.onCreate() and super.onDestroy()");
        MutableCreationExtras mutableCreationExtras = new MutableCreationExtras(this.f98353a);
        mutableCreationExtras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, Bundle.EMPTY);
        this.f98353a = mutableCreationExtras;
        SavedStateHandle createSavedStateHandle = SavedStateHandleSupport.createSavedStateHandle(mutableCreationExtras);
        this.f98354b = createSavedStateHandle;
        this.f98353a = null;
        return createSavedStateHandle;
    }

    public boolean c() {
        return this.f98354b == null && this.f98353a == null;
    }

    public void d(CreationExtras extras) {
        if (this.f98354b != null) {
            return;
        }
        this.f98353a = extras;
    }
}
