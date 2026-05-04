package com.baicizhan.client.business.webview.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import com.baicizhan.client.business.util.AndroidBug5497Workaround;
import com.baicizhan.client.business.util.AutoSizeMgr;
import com.baicizhan.client.business.util.UiUtils;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.webview.JsonParams;
import com.baicizhan.client.business.webview.NavigationBarOption;
import com.baicizhan.client.business.webview.OpenWebViewOption;
import com.baicizhan.client.business.webview.OrientationOption;
import com.baicizhan.client.business.webview.StatusBarOption;
import com.baicizhan.client.business.webview.UiColorEnum;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.hwpay.HwPayManager;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.jiongji.andriod.card.R;
import java.net.URLDecoder;
import kotlin.Pair;
import me.jessyan.autosize.AutoSizeConfig;
import me.jessyan.autosize.internal.CustomAdapt;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class BczWebActivity extends Hilt_BczWebActivity implements BczWebFragment.OnFragmentInteractionListener, CustomAdapt {
    private static final String BCZ_FRAGMENT_TAG = "bcz_fragment";
    private static final String TAG = "BczWebActivity";
    private boolean isShowActionBar = true;
    private boolean isShowClose = false;
    private boolean isShowHistoryClose = false;
    protected Arguments mArguments;
    protected gs.o mBinding;
    protected BczWebFragment mFragment;

    private BczWebFragment getFragment() {
        return (BczWebFragment) getSupportFragmentManager().findFragmentById(R.id.fragment_container);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0(View view) {
        back();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(View view) {
        close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$2(View view) {
        share();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$3(View view) {
        top();
    }

    private void setActionBarTopPadding(int statusBarHeight) {
        View root = this.mBinding.f56138a.getRoot();
        root.setPadding(root.getPaddingLeft(), statusBarHeight, root.getPaddingRight(), root.getPaddingBottom());
    }

    private void setCloseIconVisible() {
        boolean z11 = false;
        this.mBinding.f56140c.setVisibility((this.isShowActionBar || !this.isShowClose) ? 8 : 0);
        gs.c cVar = this.mBinding.f56138a;
        if (this.isShowActionBar && this.isShowHistoryClose) {
            z11 = true;
        }
        cVar.F(Boolean.valueOf(z11));
        int dimensionPixelSize = getResources().getDimensionPixelSize((this.isShowActionBar && this.isShowHistoryClose) ? R.dimen.action_bar_title_padding_lr_large : R.dimen.action_bar_title_padding_lr);
        TextView textView = this.mBinding.f56138a.f54331f;
        textView.setPadding(dimensionPixelSize, textView.getPaddingTop(), dimensionPixelSize, this.mBinding.f56138a.f54331f.getPaddingBottom());
    }

    private void setCloseVisible(boolean visible) {
        this.mBinding.f56138a.F(Boolean.valueOf(visible));
        int dimensionPixelSize = getResources().getDimensionPixelSize(visible ? R.dimen.action_bar_title_padding_lr_large : R.dimen.action_bar_title_padding_lr);
        TextView textView = this.mBinding.f56138a.f54331f;
        textView.setPadding(dimensionPixelSize, textView.getPaddingTop(), dimensionPixelSize, this.mBinding.f56138a.f54331f.getPaddingBottom());
    }

    private void setLandScapeSystemUI() {
        setActionBarTopPadding(0);
        View decorView = getWindow().getDecorView();
        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 258);
    }

    public static void start(Context context, @NonNull Arguments arguments) {
        Intent intent = new Intent(context, (Class<?>) BczWebActivity.class);
        if (context instanceof Application) {
            intent.addFlags(268435456);
        }
        intent.putExtras(arguments.getArguments());
        context.startActivity(intent);
        if (arguments.getArguments().getBoolean(Arguments.ARG_LEFT_IN, false) && (context instanceof Activity)) {
            ((Activity) context).overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
        }
    }

    public static void startForResult(Activity activity, @NonNull Arguments arguments, int requestCode) {
        Intent intent = new Intent(activity, (Class<?>) BczWebActivity.class);
        Bundle arguments2 = arguments.getArguments();
        arguments2.putBoolean("for_result", true);
        intent.putExtras(arguments2);
        activity.startActivityForResult(intent, requestCode);
        if (arguments.getArguments().getBoolean(Arguments.ARG_LEFT_IN, false)) {
            activity.overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
        }
    }

    private void top() {
        BczWebFragment fragment = getFragment();
        if (fragment != null) {
            fragment.scrollToTop();
        }
    }

    public void back() {
        BczWebFragment fragment = getFragment();
        if (fragment != null) {
            fragment.back();
        }
    }

    public void close() {
        BczWebFragment fragment = getFragment();
        if (fragment != null) {
            fragment.close();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity
    public boolean enableCustomSystemBar() {
        return true;
    }

    @Override // android.app.Activity
    public void finish() {
        if (this.mArguments.isForResult()) {
            setResult(-1);
        }
        super.finish();
        if (this.mArguments.isLeftIn()) {
            overridePendingTransition(R.anim.business_push_right_in, R.anim.business_push_right_out);
        }
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public BottomSheetLayout getBottomSheetLayout() {
        return this.mBinding.f56139b;
    }

    @Override // androidx.appcompat.app.AppCompatActivity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public Resources getResources() {
        Resources resources = super.getResources();
        AutoSizeMgr.INSTANCE.adjust(resources);
        return resources;
    }

    @Override // me.jessyan.autosize.internal.CustomAdapt
    public float getSizeInDp() {
        return AutoSizeConfig.getInstance().getDesignWidthInDp();
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public FrameLayout getVideoContainer() {
        return this.mBinding.f56144g;
    }

    @Override // me.jessyan.autosize.internal.CustomAdapt
    public boolean isBaseOnWidth() {
        return getResources().getConfiguration().orientation == 1;
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onActionBar(int bgColor, boolean blackIcon) {
        this.mBinding.f56138a.y(bgColor);
        this.mBinding.f56138a.K(!blackIcon);
        zb.a.f(this, blackIcon);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        qb.c.b(HwPayManager.TAG, "web activity onActivityResult:" + resultCode + "," + resultCode, new Object[0]);
        this.mFragment.onActivityResult(requestCode, resultCode, data);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onConfigureOption(@Nullable OpenWebViewOption option) {
        if (option == null) {
            return;
        }
        if (option.getNavigationBar() != null) {
            this.isShowClose = !option.getNavigationBar().getVisible();
        }
        onUpdateActionBar(option.getNavigationBar());
        onUpdateStatusBar(option.getStatusBar());
        onUpdateOrientation(option.getOrientation());
    }

    @Override // com.baicizhan.client.business.webview.ui.Hilt_BczWebActivity, com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(@Nullable Bundle savedInstanceState) {
        Uri data;
        setTheme(R.style.AppCompatStandardDefault);
        super.onCreate(savedInstanceState);
        qb.c.b(TAG, "onCreate [%d]", Integer.valueOf(hashCode()));
        this.mBinding = (gs.o) DataBindingUtil.setContentView(this, R.layout.activity_bcz_web);
        AndroidBug5497Workaround.assistActivity(findViewById(android.R.id.content));
        this.mBinding.setLifecycleOwner(this);
        this.mArguments = new Arguments();
        Intent intent = getIntent();
        if (jc.a.f64014a.equals(intent.getAction()) && (data = intent.getData()) != null && "bcz".equals(data.getScheme()) && "nativebrowser".equals(data.getHost())) {
            String queryParameter = data.getQueryParameter("url");
            if (!TextUtils.isEmpty(queryParameter)) {
                try {
                    Pair<String, OpenWebViewOption> parseUrlToWeb = BczWebHelperKt.parseUrlToWeb(URLDecoder.decode(queryParameter, "UTF-8"));
                    Bundle bundle = new Bundle();
                    bundle.putString("url", parseUrlToWeb.getFirst());
                    if (parseUrlToWeb.getSecond() != null) {
                        bundle.putParcelable(Arguments.ARG_NEW_WEB_OPTION, parseUrlToWeb.getSecond());
                    }
                    this.mArguments.serialize(bundle);
                } catch (Exception e11) {
                    qb.c.d(TAG, "Failed to decode URL: " + e11.getMessage(), new Object[0]);
                    finish();
                    return;
                }
            }
        }
        if (savedInstanceState != null) {
            this.mArguments.serialize(savedInstanceState);
        } else if (getIntent().getExtras() != null) {
            this.mArguments.serialize(getIntent().getExtras());
        }
        Arguments arguments = this.mArguments;
        arguments.deserialize(arguments.getArguments());
        BczWebFragment bczWebFragment = (BczWebFragment) getSupportFragmentManager().findFragmentByTag(BCZ_FRAGMENT_TAG);
        this.mFragment = bczWebFragment;
        if (bczWebFragment == null) {
            this.mFragment = BczWebFragment.newInstance(this.mArguments);
            getSupportFragmentManager().beginTransaction().add(R.id.fragment_container, this.mFragment, BCZ_FRAGMENT_TAG).commitAllowingStateLoss();
        }
        if (!this.mArguments.isTitleIgnored()) {
            this.mBinding.f56138a.J(this.mArguments.getTitle());
        }
        this.mBinding.f56138a.x(new View.OnClickListener() { // from class: com.baicizhan.client.business.webview.ui.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BczWebActivity.this.lambda$onCreate$0(view);
            }
        });
        this.mBinding.f56138a.I(new View.OnClickListener() { // from class: com.baicizhan.client.business.webview.ui.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BczWebActivity.this.lambda$onCreate$1(view);
            }
        });
        this.mBinding.f56138a.A(new View.OnClickListener() { // from class: com.baicizhan.client.business.webview.ui.c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BczWebActivity.this.lambda$onCreate$2(view);
            }
        });
        this.mBinding.f56138a.H(this.mArguments.isDisplayShare());
        this.mBinding.f56138a.getRoot().setOnClickListener(new View.OnClickListener() { // from class: com.baicizhan.client.business.webview.ui.d
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BczWebActivity.this.lambda$onCreate$3(view);
            }
        });
        View root = this.mBinding.f56138a.getRoot();
        root.setPadding(root.getPaddingLeft(), zb.a.k(this), root.getPaddingRight(), root.getPaddingBottom());
        setActionBarTopPadding(zb.a.k(this));
        if (this.mArguments.isFixedClose()) {
            setCloseVisible(true);
            this.mBinding.f56138a.D(Boolean.FALSE);
        }
        this.mBinding.f56140c.setOnClickListener(new sa.c() { // from class: com.baicizhan.client.business.webview.ui.BczWebActivity.1
            @Override // sa.c, android.view.View.OnClickListener
            public void onClick(View v11) {
                super.onClick(v11);
                BczWebActivity.this.finish();
            }
        });
        ((FrameLayout.LayoutParams) this.mBinding.f56140c.getLayoutParams()).topMargin = zb.a.k(this);
        setupImmerseStatusBar();
        setStatusBarColor();
        this.mBinding.executePendingBindings();
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

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onRequestPermissionsResult(int requestCode, @NonNull @m80.k String[] permissions, @NonNull @m80.k int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        BczWebFragment bczWebFragment = this.mFragment;
        if (bczWebFragment != null) {
            bczWebFragment.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        this.mArguments.deserialize(outState);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetCloseVisibility(int visibility, int type) {
        if (type == 2) {
            this.isShowClose = visibility == 0;
        } else {
            this.isShowHistoryClose = visibility == 0;
        }
        setCloseIconVisible();
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetShareVisibility(int visibility) {
        this.mBinding.f56138a.H(visibility == 0);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onSetTitle(String title) {
        if (this.mArguments.isTitleIgnored()) {
            return;
        }
        this.mBinding.f56138a.J(title);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onShareDefault() {
        BczWebFragment fragment = getFragment();
        if (fragment != null) {
            fragment.shareDefault();
        }
    }

    @Override // com.baicizhan.base.BaseAppCompatActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onUpdateActionBar(NavigationBarOption option) {
        if (option == null) {
            return;
        }
        this.isShowActionBar = option.getVisible();
        this.mBinding.f56138a.getRoot().setVisibility(this.isShowActionBar ? 0 : 8);
        setCloseIconVisible();
        if (!TextUtils.isEmpty(option.getBgColor())) {
            this.mBinding.f56138a.y(UiUtils.RGBA2ARGB(option.getBgColor()));
        }
        this.mBinding.f56138a.K(UiColorEnum.WHITE.getValue().equals(option.getForegroundColor()));
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    @SuppressLint({"SourceLockedOrientationActivity"})
    public void onUpdateOrientation(OrientationOption option) {
        if (option == null) {
            return;
        }
        int angle = option.getAngle();
        if (angle == 0) {
            setRequestedOrientation(1);
            setActionBarTopPadding(zb.a.k(this));
            return;
        }
        if (angle == 90) {
            setRequestedOrientation(0);
            setLandScapeSystemUI();
        } else if (angle == 180) {
            setRequestedOrientation(9);
            setActionBarTopPadding(zb.a.k(this));
        } else {
            if (angle != 270) {
                return;
            }
            setRequestedOrientation(8);
            setLandScapeSystemUI();
        }
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void onUpdateStatusBar(StatusBarOption option) {
        if (option == null) {
            return;
        }
        View decorView = getWindow().getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        boolean z11 = UiColorEnum.BLACK.getValue().equals(option.getForegroundColor()) || TextUtils.isEmpty(option.getForegroundColor());
        int i11 = option.getVisible() ? systemUiVisibility & (-5) : systemUiVisibility | 4;
        if (zb.a.i(this, z11, false) == -1) {
            i11 = z11 ? i11 | 8192 : i11 & (-8193);
        }
        decorView.setSystemUiVisibility(i11);
    }

    public void share() {
        BczWebFragment fragment = getFragment();
        if (fragment != null) {
            fragment.share();
        }
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void addJavascriptInterfaces(WebView webView) {
    }
}
