package hg;

import android.os.Bundle;
import android.view.View;
import androidx.annotation.LayoutRes;
import androidx.core.util.Pair;
import androidx.fragment.app.FragmentActivity;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.baicizhan.main.activity.MainTabActivity;
import com.flipboard.bottomsheet.BottomSheetLayout;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends BczWebFragment {

    /* renamed from: b, reason: collision with root package name */
    public static final String f59252b = "BczStoreFragment";

    /* renamed from: a, reason: collision with root package name */
    public View f59253a;

    public static b x0(final UserRecord userRecord) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("user", userRecord);
        bundle.putString(Arguments.ARG_DEFAULT_URL, "https://learn.baicizhan.com/api/mall/proxy/home_html");
        bundle.putInt(Arguments.ARG_URL_STRATEGY, 0);
        b bVar = new b();
        bVar.setArguments(bundle);
        return bVar;
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public Pair<String, String> appendUserAgentPair() {
        return new Pair<>("app_entry", "tab_container");
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public BottomSheetLayout getBottomSheetLayout() {
        FragmentActivity activity = getActivity();
        return (activity == null || !(activity instanceof MainTabActivity)) ? super.getBottomSheetLayout() : ((MainTabActivity) activity).getBottomSheetLayout();
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    @LayoutRes
    public int getTitleBarResource() {
        return 0;
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        zb.a.f(getActivity(), true);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public void onViewInited(View parent) {
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment
    public void setShareVisibility(int visibility) {
    }
}
