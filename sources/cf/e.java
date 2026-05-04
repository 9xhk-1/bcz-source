package cf;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.jiongji.andriod.card.R;
import gs.va;
import q9.l;
import va.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class e extends Fragment {

    /* renamed from: d, reason: collision with root package name */
    public static final String f8604d = "StudySettingsFragment";

    /* renamed from: a, reason: collision with root package name */
    public d f8605a;

    /* renamed from: b, reason: collision with root package name */
    public va f8606b;

    /* renamed from: c, reason: collision with root package name */
    public IAudioPlayer f8607c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements Observer<Void> {
        public a() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            SingleFragmentActivity.I0(e.this.getActivity(), xe.c.class, null, e.this.getString(R.string.setting_study_extra_problem));
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements Observer<String> {
        public b() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable String s11) {
            g.i(s11, 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class c implements Observer<Void> {
        public c() {
        }

        @Override // androidx.lifecycle.Observer
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onChanged(@Nullable Void aVoid) {
            e.this.f8607c.a(R.raw.answer_right);
        }
    }

    private void v() {
        this.f8605a.f8584a.observe(this, new a());
        this.f8605a.f8589f.observe(this, new b());
        this.f8605a.f8590g.observe(this, new c());
    }

    private void w(LayoutInflater inflater) {
        va e11 = va.e(inflater);
        this.f8606b = e11;
        e11.j(this.f8605a);
        this.f8606b.setLifecycleOwner(this);
    }

    private void x() {
        this.f8605a = (d) new ViewModelProvider(this).get(d.class);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.f8607c = new l(getContext());
        x();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        w(inflater);
        v();
        this.f8605a.start();
        return this.f8606b.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        IAudioPlayer iAudioPlayer = this.f8607c;
        if (iAudioPlayer != null) {
            iAudioPlayer.destroy();
        }
    }
}
