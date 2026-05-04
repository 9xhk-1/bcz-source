package df;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import gs.eb;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final String f47937c = "RemindStudyFragment";

    /* renamed from: a, reason: collision with root package name */
    public eb f47938a;

    /* renamed from: b, reason: collision with root package name */
    public c f47939b;

    private void t(LayoutInflater inflater) {
        eb e11 = eb.e(inflater);
        this.f47938a = e11;
        e11.j(this.f47939b);
        this.f47938a.setLifecycleOwner(this);
    }

    private void v() {
        this.f47939b = (c) new ViewModelProvider(this).get(c.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        v();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        t(inflater);
        return this.f47938a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f47939b.start();
    }
}
