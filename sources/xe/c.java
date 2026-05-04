package xe;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import gs.ta;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class c extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final String f98015c = "ExtraProblemSetting";

    /* renamed from: a, reason: collision with root package name */
    public ta f98016a;

    /* renamed from: b, reason: collision with root package name */
    public d f98017b;

    private void v() {
        this.f98017b.f98022d.observe(this, new Observer() { // from class: xe.b
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                g.i((String) obj, 0);
            }
        });
    }

    private void w(LayoutInflater inflater) {
        ta e11 = ta.e(inflater);
        this.f98016a = e11;
        e11.j(this.f98017b);
        this.f98016a.setLifecycleOwner(this);
    }

    private void x() {
        this.f98017b = (d) new ViewModelProvider(this).get(d.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        x();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        w(inflater);
        v();
        this.f98017b.start();
        return this.f98016a.getRoot();
    }
}
