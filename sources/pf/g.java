package pf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.baicizhan.main.activity.userinfo.school.main.EditSchoolActivity;
import gs.oa;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class g extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final String f80416d = "SearchSchoolFragment";

    /* renamed from: a, reason: collision with root package name */
    public oa f80417a;

    /* renamed from: b, reason: collision with root package name */
    public i f80418b;

    /* renamed from: c, reason: collision with root package name */
    public RecyclerView.Adapter f80419c;

    private void w() {
        this.f80418b.f80424c.observe(this, new Observer() { // from class: pf.e
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                g.this.z((Void) obj);
            }
        });
        this.f80418b.f80425d.observe(this, new Observer() { // from class: pf.f
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                va.g.i((String) obj, 0);
            }
        });
    }

    private void x(LayoutInflater inflater) {
        oa e11 = oa.e(inflater);
        this.f80417a = e11;
        e11.j(this.f80418b);
        this.f80417a.setLifecycleOwner(this);
        c cVar = new c(this.f80418b);
        this.f80419c = cVar;
        this.f80417a.f56205a.setAdapter(cVar);
        this.f80417a.f56205a.setLayoutManager(new LinearLayoutManager(getContext()));
    }

    private void y() {
        this.f80418b = (i) new ViewModelProvider(this).get(i.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void z(Void r12) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
        EditSchoolActivity.J0(getContext());
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
        return this.f80417a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }
}
