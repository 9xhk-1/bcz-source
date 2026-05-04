package com.baicizhan.main.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.baicizhan.main.fragment.TogetherLearningFragment;
import gs.uh;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import x00.a;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class TogetherLearningFragment extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    public static final int f20825b = 8;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f20826a = e0.c(new a() { // from class: hg.v
        @Override // x00.a
        public final Object invoke() {
            uh v11;
            v11 = TogetherLearningFragment.v(TogetherLearningFragment.this);
            return v11;
        }
    });

    public static final uh v(TogetherLearningFragment togetherLearningFragment) {
        uh c11 = uh.c(LayoutInflater.from(togetherLearningFragment.getContext()));
        g0.o(c11, "inflate(...)");
        return c11;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        return w().getRoot();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z11) {
        super.onHiddenChanged(z11);
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(w().f57018b.getId());
        if (z11) {
            if (findFragmentById != null) {
                findFragmentById.onPause();
            }
        } else {
            zb.a.f(getActivity(), true);
            if (findFragmentById != null) {
                findFragmentById.onResume();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        if (isHidden()) {
            return;
        }
        zb.a.f(getActivity(), true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle bundle) {
        g0.p(view, "view");
        super.onViewCreated(view, bundle);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        int id2 = w().f57018b.getId();
        Arguments arguments = new Arguments();
        arguments.setDefaultUrl("https://group.baicizhan.com/study_together");
        arguments.setUrlStrategy(0);
        arguments.deserialize(arguments.getArguments());
        g2 g2Var = g2.f100423a;
        beginTransaction.replace(id2, BczWebFragment.newInstance(arguments)).commitAllowingStateLoss();
    }

    public final uh w() {
        return (uh) this.f20826a.getValue();
    }
}
