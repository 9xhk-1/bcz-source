package com.baicizhan.client.business.webview.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.webkit.WebView;
import androidx.annotation.Nullable;
import androidx.media3.common.C;
import com.baicizhan.client.business.webview.args.Arguments;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NoActionBarWebActivity extends BczWebActivity {
    public static final String TAG = "NoActionBarWeb";

    public static void start(Context context, String url) {
        qb.c.i(TAG, "%s", url);
        Bundle arguments = new Arguments().getArguments();
        arguments.putString("title", "");
        arguments.putString(Arguments.ARG_DEFAULT_URL, url);
        arguments.putInt(Arguments.ARG_URL_STRATEGY, 0);
        Intent intent = new Intent(context, (Class<?>) NoActionBarWebActivity.class);
        intent.putExtras(arguments);
        context.startActivity(intent);
        ((Activity) context).overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebActivity, com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void addJavascriptInterfaces(WebView webView) {
        super.addJavascriptInterfaces(webView);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebActivity, com.baicizhan.client.business.webview.ui.Hilt_BczWebActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int color = getResources().getColor(R.color.main_color_common_background);
        this.mBinding.f56143f.setBackgroundColor(color);
        if (Build.VERSION.SDK_INT >= 27) {
            getWindow().setNavigationBarColor(color);
        } else {
            getWindow().addFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
        }
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebActivity, com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetTitle(String title) {
    }
}
