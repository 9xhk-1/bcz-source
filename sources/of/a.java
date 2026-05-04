package of;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.baicizhan.main.activity.SingleFragmentActivity;
import com.jiongji.andriod.card.R;
import gs.y9;
import kf.l;
import pf.g;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class a extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final String f76920b = "UserInfoFragment";

    /* renamed from: a, reason: collision with root package name */
    public y9 f76921a;

    private void w(LayoutInflater inflater) {
        y9 e11 = y9.e(inflater);
        this.f76921a = e11;
        e11.setLifecycleOwner(this);
        this.f76921a.j(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        w(inflater);
        v();
        return this.f76921a.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
    }

    public void t() {
        SingleFragmentActivity.I0(getContext(), g.class, null, getString(R.string.userinfo_edit_school__select_title));
    }

    public void x(int type) {
        l.I(getActivity(), type);
    }

    private void v() {
    }
}
