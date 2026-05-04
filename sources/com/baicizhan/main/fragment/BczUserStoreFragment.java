package com.baicizhan.main.fragment;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.core.util.Pair;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.baicizhan.main.activity.MainTabActivity;
import com.flipboard.bottomsheet.BottomSheetLayout;
import q9.x;
import zb.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class BczUserStoreFragment extends BczWebFragment {

    /* renamed from: a, reason: collision with root package name */
    public static final String f20725a = "BczUserStoreFragment";

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public Pair<String, String> appendUserAgentPair() {
        return new Pair<>("app_entry", "tab_container");
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public BottomSheetLayout getBottomSheetLayout() {
        FragmentActivity activity = getActivity();
        return activity instanceof MainTabActivity ? ((MainTabActivity) activity).getBottomSheetLayout() : super.getBottomSheetLayout();
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment, androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("user", x.r().p());
        bundle.putString(Arguments.ARG_DEFAULT_URL, "https://learn.baicizhan.com/api/mall/proxy/home_html");
        bundle.putInt(Arguments.ARG_URL_STRATEGY, 0);
        setArguments(bundle);
        super.onCreate(savedInstanceState);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        a.f(getActivity(), true);
    }
}
