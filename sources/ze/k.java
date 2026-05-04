package ze;

import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import gs.w9;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class k extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final String f102574c = "k";

    /* renamed from: a, reason: collision with root package name */
    public w9 f102575a;

    /* renamed from: b, reason: collision with root package name */
    public s f102576b;

    private void v(LayoutInflater inflater) {
        w9 e11 = w9.e(inflater);
        this.f102575a = e11;
        e11.j(this.f102576b);
        this.f102575a.setLifecycleOwner(this);
    }

    private void w() {
        s sVar = (s) new ViewModelProvider(this).get(s.class);
        this.f102576b = sVar;
        sVar.f102591f.observe(this, new Observer() { // from class: ze.j
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                k.this.x((Void) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w();
        this.f102576b.start();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v(inflater);
        return this.f102575a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        y();
    }

    public final /* synthetic */ void x(Void r12) {
        gi.e.i(requireActivity());
    }

    public final void y() {
        int i11 = Build.VERSION.SDK_INT;
        boolean z11 = false;
        if (i11 >= 31) {
            this.f102576b.f102593h.setValue(Boolean.valueOf(requireContext().checkSelfPermission("android.permission.BLUETOOTH_CONNECT") == 0 && requireContext().checkSelfPermission("android.permission.BLUETOOTH_SCAN") == 0));
        }
        this.f102576b.f102594i.setValue(Boolean.valueOf(requireContext().checkSelfPermission("android.permission.CAMERA") == 0));
        if (i11 < 29) {
            boolean z12 = requireContext().checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") == 0;
            boolean z13 = requireContext().checkSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0;
            qb.c.b(f102574c, "sdk = %d, read = %s, write = %s", Integer.valueOf(i11), Boolean.valueOf(z12), Boolean.valueOf(z13));
            this.f102576b.f102595j.setValue(Boolean.valueOf(z12 && z13));
        }
        this.f102576b.f102596k.setValue(Boolean.valueOf(requireContext().checkSelfPermission("android.permission.RECORD_AUDIO") == 0));
        MutableLiveData<Boolean> mutableLiveData = this.f102576b.f102597l;
        if (requireContext().checkSelfPermission("android.permission.ACCESS_FINE_LOCATION") == 0 && requireContext().checkSelfPermission("android.permission.ACCESS_COARSE_LOCATION") == 0) {
            z11 = true;
        }
        mutableLiveData.setValue(Boolean.valueOf(z11));
    }
}
