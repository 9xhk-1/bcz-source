package ze;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import gs.aa;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final String f102557d = "RemindStudyFragment";

    /* renamed from: a, reason: collision with root package name */
    public aa f102558a;

    /* renamed from: b, reason: collision with root package name */
    public i f102559b;

    /* renamed from: c, reason: collision with root package name */
    public va.f f102560c;

    private void v(LayoutInflater inflater) {
        aa e11 = aa.e(inflater);
        this.f102558a = e11;
        e11.j(this.f102559b);
        this.f102558a.setLifecycleOwner(this);
    }

    private void w() {
        i iVar = (i) new ViewModelProvider(this, new ta.a(this)).get(i.class);
        this.f102559b = iVar;
        iVar.f102571c.observe(this, new Observer() { // from class: ze.a
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                b.this.x((Boolean) obj);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w();
        this.f102559b.start();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v(inflater);
        return this.f102558a.getRoot();
    }

    public final /* synthetic */ void x(Boolean bool) {
        if (this.f102560c == null) {
            this.f102560c = gi.e.c(getContext());
        }
        if (bool.booleanValue()) {
            this.f102560c.show();
        } else {
            this.f102560c.dismiss();
        }
    }
}
