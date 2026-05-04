package com.baicizhan.main.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import com.baicizhan.client.business.util.Standard_extKt;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.baicizhan.main.fragment.WebReviewFragment;
import gs.ob;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;
import yz.c0;
import yz.e0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class WebReviewFragment extends Fragment {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final a f20827b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f20828c = 8;

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final String f20829d = "key_url";

    /* renamed from: e, reason: collision with root package name */
    @k
    public static final String f20830e = "https://learn.baicizhan.com/home-learning/";

    /* renamed from: a, reason: collision with root package name */
    @k
    public final c0 f20831a = e0.c(new x00.a() { // from class: hg.w
        @Override // x00.a
        public final Object invoke() {
            ob v11;
            v11 = WebReviewFragment.v(WebReviewFragment.this);
            return v11;
        }
    });

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a {
        public /* synthetic */ a(v vVar) {
            this();
        }

        @k
        public final WebReviewFragment a(@k String url) {
            g0.p(url, "url");
            WebReviewFragment webReviewFragment = new WebReviewFragment();
            Bundle bundle = new Bundle();
            bundle.putString(WebReviewFragment.f20829d, url);
            webReviewFragment.setArguments(bundle);
            return webReviewFragment;
        }

        public a() {
        }
    }

    public static final ob v(WebReviewFragment webReviewFragment) {
        ob d11 = ob.d(LayoutInflater.from(webReviewFragment.getContext()));
        g0.o(d11, "inflate(...)");
        return d11;
    }

    @Override // androidx.fragment.app.Fragment
    @l
    public View onCreateView(@k LayoutInflater inflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        g0.p(inflater, "inflater");
        super.onCreateView(inflater, viewGroup, bundle);
        w().setLifecycleOwner(getViewLifecycleOwner());
        return w().f56209b;
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean z11) {
        super.onHiddenChanged(z11);
        Fragment findFragmentById = getChildFragmentManager().findFragmentById(w().f56208a.getId());
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
        Bundle arguments = getArguments();
        String availableWith = Standard_extKt.availableWith(arguments != null ? arguments.getString(f20829d) : null, f20830e);
        FragmentTransaction beginTransaction = getChildFragmentManager().beginTransaction();
        int id2 = w().f56208a.getId();
        Arguments arguments2 = new Arguments();
        arguments2.setDefaultUrl(availableWith);
        arguments2.setUrlStrategy(0);
        arguments2.deserialize(arguments2.getArguments());
        g2 g2Var = g2.f100423a;
        beginTransaction.replace(id2, BczWebFragment.newInstance(arguments2)).commitAllowingStateLoss();
    }

    public final ob w() {
        return (ob) this.f20831a.getValue();
    }
}
