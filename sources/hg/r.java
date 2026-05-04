package hg;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.baicizhan.main.fragment.SkillTrainFragment;
import com.jiongji.andriod.card.R;
import gs.ia;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class r extends Fragment {

    /* renamed from: a, reason: collision with root package name */
    public static final String f59306a = "ReviewFragment";

    public static r t() {
        return new r();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ia d11 = ia.d(inflater);
        d11.setLifecycleOwner(this);
        d11.f55291a.setPadding(0, zb.a.k(getActivity()), 0, 0);
        return d11.getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden) {
            zb.a.f(getActivity(), true);
        }
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(R.id.training_fragment);
        if (!(findFragmentById instanceof SkillTrainFragment) || hidden) {
            return;
        }
        ((SkillTrainFragment) findFragmentById).H();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isHidden()) {
            return;
        }
        zb.a.f(getActivity(), true);
    }
}
