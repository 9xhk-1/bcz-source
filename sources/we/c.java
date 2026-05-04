package we;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import gs.ra;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final String f96188c = "ExtraProblemSetting";

    /* renamed from: a, reason: collision with root package name */
    public ra f96189a;

    /* renamed from: b, reason: collision with root package name */
    public d f96190b;

    private void w() {
        this.f96190b.f96193b.observe(this, new Observer() { // from class: we.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                g.i((String) obj, 0);
            }
        });
        this.f96190b.f96194c.observe(this, new Observer() { // from class: we.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                c.this.z((Void) obj);
            }
        });
    }

    private void x(LayoutInflater inflater) {
        ra e11 = ra.e(inflater);
        this.f96189a = e11;
        e11.j(this.f96190b);
        this.f96189a.setLifecycleOwner(this);
    }

    private void y() {
        this.f96190b = (d) new ViewModelProvider(this).get(d.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Void r12) {
        getActivity().finish();
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        y();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        x(inflater);
        w();
        this.f96190b.start();
        return this.f96189a.getRoot();
    }
}
