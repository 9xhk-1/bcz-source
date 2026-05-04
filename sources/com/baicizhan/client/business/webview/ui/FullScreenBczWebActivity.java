package com.baicizhan.client.business.webview.ui;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.base.BaseAppCompatActivity;
import com.baicizhan.client.business.webview.JsonParams;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FullScreenBczWebActivity extends BaseAppCompatActivity implements BczWebFragment.OnFragmentInteractionListener {
    protected Arguments mArguments;
    protected gs.r0 mBinding;
    protected BczWebFragment mFragment;

    private BczWebFragment getFragment() {
        return (BczWebFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        finish();
    }

    public static void start(Context context, @NonNull Arguments arguments) {
        Intent intent = new Intent(context, (Class<?>) FullScreenBczWebActivity.class);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        intent.putExtras(arguments.getArguments());
        context.startActivity(intent);
        if (arguments.isLeftIn() && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity
    public boolean enableCustomSystemBar() {
        return true;
    }

    @Override // android.app.Activity
    public void finish() {
        super.finish();
        if (this.mArguments.isLeftIn()) {
            overridePendingTransition(R.anim.business_push_right_in, R.anim.business_push_right_out);
        }
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public BottomSheetLayout getBottomSheetLayout() {
        return this.mBinding.f56553a;
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public FrameLayout getVideoContainer() {
        return this.mBinding.f56558f;
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        this.mFragment.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Arguments arguments = new Arguments();
        this.mArguments = arguments;
        if (savedInstanceState != null) {
            arguments.serialize(savedInstanceState);
        } else {
            arguments.serialize(getIntent().getExtras());
        }
        Arguments arguments2 = this.mArguments;
        arguments2.deserialize(arguments2.getArguments());
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        int i11 = systemUiVisibility | 1280;
        JsonParams.StatusBar statusBarParams = this.mArguments.getStatusBarParams();
        if (statusBarParams != null && !statusBarParams.statusBarVisible) {
            i11 = systemUiVisibility | com.badlogic.gdx.graphics.i.f12422te;
        }
        boolean z11 = statusBarParams == null || statusBarParams.statusContentColorBlack;
        if (zb.a.i(this, z11, false) == -1) {
            i11 = z11 ? i11 | 8192 : i11 & (-8193);
        }
        decorView.setSystemUiVisibility(i11);
        super.onCreate(savedInstanceState);
        gs.r0 r0Var = (gs.r0) DataBindingUtil.setContentView(this, R.layout.activity_fullscreen_bcz_web);
        this.mBinding = r0Var;
        r0Var.setLifecycleOwner(this);
        this.mBinding.f56554b.setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.client.business.webview.ui.p2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FullScreenBczWebActivity.this.lambda$onCreate$0(view);
            }
        });
        this.mFragment = BczWebFragment.newInstance(this.mArguments);
        getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, this.mFragment, (String) null).commitAllowingStateLoss();
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onCustomizeStatusBar(@NonNull JsonParams.StatusBar param) {
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = param.statusBarVisible ? decorView.getSystemUiVisibility() & (-5) : decorView.getSystemUiVisibility() | 4;
        if (zb.a.i(this, param.statusContentColorBlack, false) == -1) {
            systemUiVisibility = param.statusContentColorBlack ? systemUiVisibility | 8192 : systemUiVisibility & (-8193);
        }
        decorView.setSystemUiVisibility(systemUiVisibility);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.app.Activity, android.view.KeyEvent.Callback
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        return getFragment() != null && getFragment().onKeyDown(keyCode, event) && super.onKeyDown(keyCode, event);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        this.mArguments.deserialize(outState);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetCloseVisibility(int visibility, int type) {
        if (type == 2) {
            this.mBinding.f56554b.setVisibility(visibility);
        }
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onShareDefault() {
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void addJavascriptInterfaces(WebView webView) {
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetShareVisibility(int visibility) {
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetTitle(String title) {
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onActionBar(int bgColor, boolean blackIcon) {
    }
}
