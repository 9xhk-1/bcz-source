package bf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.main.activity.EverydayNoticeSettingActivity;
import gs.ga;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment {

    /* renamed from: c, reason: collision with root package name */
    public static final String f6793c = "RemindStudyFragment";

    /* renamed from: a, reason: collision with root package name */
    public ga f6794a;

    /* renamed from: b, reason: collision with root package name */
    public c f6795b;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: bf.a$a, reason: collision with other inner class name */
    public class C0118a implements Observer<Void> {
        public C0118a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            EverydayNoticeSettingActivity.U0(a.this.getActivity());
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<Void> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            BczWebHelperKt.startWxRemind(a.this.getActivity());
        }
    }

    private void t() {
        this.f6795b.f6802c.observe(this, new C0118a());
        this.f6795b.f6803d.observe(this, new b());
    }

    private void v(LayoutInflater inflater) {
        ga e11 = ga.e(inflater);
        this.f6794a = e11;
        e11.j(this.f6795b);
        this.f6794a.setLifecycleOwner(this);
    }

    private void w() {
        this.f6795b = (c) new ViewModelProvider(this, new ta.a(this)).get(c.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        w();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        v(inflater);
        t();
        return this.f6794a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.f6795b.start();
    }
}
