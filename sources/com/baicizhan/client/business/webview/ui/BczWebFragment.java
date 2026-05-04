package com.baicizhan.client.business.webview.ui;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.ComponentName;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.JavascriptInterface;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentActivity;
import androidx.media3.extractor.text.ttml.TtmlNode;
import c9.a;
import com.baicizhan.client.business.auth.WeixinAuthHelper;
import com.baicizhan.client.business.auth.login.ThirdPartyUserInfo;
import com.baicizhan.client.business.auth.share.ShareChannel;
import com.baicizhan.client.business.auth.share.ShareDelegate;
import com.baicizhan.client.business.auth.share.ShareParams;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.managers.LearnRecordManager;
import com.baicizhan.client.business.managers.upgrade.UpgradeManager;
import com.baicizhan.client.business.util.BczJson;
import com.baicizhan.client.business.util.BczPermissions;
import com.baicizhan.client.business.util.BottomSheetUtils;
import com.baicizhan.client.business.util.ChannelUtils;
import com.baicizhan.client.business.util.CollectionUtils;
import com.baicizhan.client.business.util.DeviceUtil;
import com.baicizhan.client.business.util.NoProguard;
import com.baicizhan.client.business.util.RxFlowUtilsKt;
import com.baicizhan.client.business.util.StoreEntryJumper;
import com.baicizhan.client.business.util.SystemSettingHelperKt;
import com.baicizhan.client.business.util.ThirdAppDialogKt;
import com.baicizhan.client.business.util.UiUtils;
import com.baicizhan.client.business.util.networks.upload.RxLargeFileUpload;
import com.baicizhan.client.business.util.networks.upload.RxUploader;
import com.baicizhan.client.business.util.photo.PhotoPuller;
import com.baicizhan.client.business.view.WebBlankView;
import com.baicizhan.client.business.webview.BczWebDirector;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.webview.CommonJSI;
import com.baicizhan.client.business.webview.CookieConfig;
import com.baicizhan.client.business.webview.DakaConfig;
import com.baicizhan.client.business.webview.InterceptNavBackOption;
import com.baicizhan.client.business.webview.InterceptNavCloseOption;
import com.baicizhan.client.business.webview.JsonParams;
import com.baicizhan.client.business.webview.LoadingBarOption;
import com.baicizhan.client.business.webview.MapLearnHelper;
import com.baicizhan.client.business.webview.NavigationBarOption;
import com.baicizhan.client.business.webview.OpenWebViewOption;
import com.baicizhan.client.business.webview.OrientationOption;
import com.baicizhan.client.business.webview.PayManager;
import com.baicizhan.client.business.webview.PrivacyInfoOption;
import com.baicizhan.client.business.webview.SaveToAlbumOption;
import com.baicizhan.client.business.webview.ScreenOffOption;
import com.baicizhan.client.business.webview.StatusBarOption;
import com.baicizhan.client.business.webview.SwipeLeftBackOption;
import com.baicizhan.client.business.webview.TouchCalloutOption;
import com.baicizhan.client.business.webview.TurnOnNotifPushOption;
import com.baicizhan.client.business.webview.VibrationConfig;
import com.baicizhan.client.business.webview.WVImageRequestBody;
import com.baicizhan.client.business.webview.WebCanGoBack;
import com.baicizhan.client.business.webview.WebImageHelperKt;
import com.baicizhan.client.business.webview.WebShareManager;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.args.JsLearnRecord;
import com.baicizhan.client.business.webview.hijack.WhiteListMgr;
import com.baicizhan.client.business.webview.hwpay.HwPayManager;
import com.baicizhan.client.business.webview.hwpay.HwPayResponse;
import com.baicizhan.client.business.webview.hwpay.SupportHuaweiPay;
import com.baicizhan.client.business.webview.hwpay.aggr.HwAggrPayManager;
import com.baicizhan.client.business.webview.permission.PermissionStatusUtilKt;
import com.baicizhan.client.business.webview.sdk.AudioRecordMgr;
import com.baicizhan.client.business.webview.sdk.Contract;
import com.baicizhan.client.business.webview.sdk.LearnHelper;
import com.baicizhan.client.business.webview.sdk.NavigatorMgr;
import com.baicizhan.client.business.webview.sdk.VoiceMgr;
import com.baicizhan.client.business.webview.sign.SignManager;
import com.baicizhan.client.business.webview.ui.BczWebFragment;
import com.baicizhan.client.business.webview.url.UrlFetcher;
import com.baicizhan.client.business.widget.DisguiseProgressBar;
import com.baicizhan.client.business.widget.share.SharePickerSheetView;
import com.baicizhan.client.framework.audio.IAudioPlayer;
import com.baicizhan.framework.common.magicdialog.Action;
import com.baicizhan.framework.common.magicdialog.ButtonType;
import com.baicizhan.online.bcz_system_api.AppBetaUpdateResult;
import com.flipboard.bottomsheet.BottomSheetLayout;
import com.google.android.material.timepicker.TimeModel;
import com.huawei.hms.aggrpay.entity.PayResult;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.jiongji.andriod.card.R;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mobileqq.openpay.data.base.BaseResponse;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;
import javax.inject.Inject;
import kc.u;
import kotlin.Pair;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@qu.b
/* loaded from: classes4.dex */
public class BczWebFragment extends Hilt_BczWebFragment implements View.OnClickListener, PayManager.IPayListener, IAudioPlayer.b, IAudioPlayer.a {
    public static final String AUDIOR_ECORD_JSI = "bcz_audioRecord";
    public static final String AUDIOR_PLAYER_JSI = "bcz_audioPlayer";
    public static final String BASE_INFO = "bcz_baseInfo";
    private static final String CACHE_DIR = "/webviewCache";
    private static final int ERROR_CODE_BACKPRESS = 1;
    private static final int ERROR_DOWNLOAD = 3;
    private static final int ERROR_FORBIDDEN = 5;
    private static final int ERROR_NETWORK = 4;
    private static final int ERROR_SYS = 2;
    public static final String HW_AGGR_PAY = "bcz_aggrpay";
    public static final String IN_APP_PAY = "bcz_inapppay";
    public static final String PAGE_JUMP = "bcz_pageJump";
    private static final int REQUEST_NATIVE_NAVIGATION = 1001;
    public static String TAG = "BczWebFragment";
    private static final int TIME_OUT = 20000;
    private static final int permissionCode = 111;
    private Arguments mArguments;
    private IAudioPlayer mAudioPlayer;
    private AudioRecordMgr mAudioRecordMgr;
    private View mBottomSelectImageView;
    private ViewGroup mContentView;

    @Inject
    protected z9.a mDakaRepo;
    private WebBlankView mErrorView;
    private ViewStub mErrorViewStub;
    private ValueCallback<Uri[]> mFilePathCallback;
    private qb0.h mGetBlackListSubscription;
    private qb0.h mGetLocationSubscription;
    private boolean mHasPermission;

    @Inject
    protected u9.d mIExperienceRepo;
    private qb0.h mImageUploadSubscription;
    private String mLastUrl;
    private OnFragmentInteractionListener mListener;
    private qb0.h mLoadSubscription;
    private Runnable mPermissionCall;
    private qb0.h mPreloadSub;
    private DisguiseProgressBar mProgressView;
    private TimerTask mScreenOffTask;
    private Timer mScreenTimer;
    private ShareCallback mShareCallback;
    private WebShareManager mShareManager;
    private JsonParams.ShareParamI mShareParam;

    @Inject
    protected z9.b mStudyCommitter;
    private String mTakePhotoPath;
    private qb0.h mTimeOutSub;
    private JsonParams.UploadImageMetaI mUploadImageMeta;
    private Vibrator mVibrator;
    private WebChromeClient.CustomViewCallback mVideoCallback;
    private WXAuthSubscribeCallback mWXSubscribeCallback;
    protected BczWebView mWebView;

    @Inject
    protected com.baicizhan.client.business.managers.winningstreak.a mWinningStreak;
    private sa.h permissionBanner;
    private boolean mCurError = false;
    private Boolean showProgress = Boolean.TRUE;
    private AudioPlayerJSI mAudioPlayerJSI = new AudioPlayerJSI();
    private SystemJSI mSystemJSI = null;
    private boolean mForeground = false;
    private CookieConfig mCookieConfig = new CookieConfig();
    private Map<String, String> mHeader = new HashMap();
    private ec0.b mSubscriptions = new ec0.b();
    private final Handler mHandler = new Handler(Looper.getMainLooper());

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.webview.ui.BczWebFragment$1, reason: invalid class name */
    public class AnonymousClass1 extends TimerTask {
        public AnonymousClass1() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$run$0() {
            qb.c.i(BczWebFragment.TAG, "screenOffTask run", new Object[0]);
            BczWebFragment.this.cancelScreenTimeout();
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            BczWebFragment.this.mHandler.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.q
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.AnonymousClass1.this.lambda$run$0();
                }
            });
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.webview.ui.BczWebFragment$11, reason: invalid class name */
    public class AnonymousClass11 implements wb0.q<Boolean, String, String> {
        public AnonymousClass11() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$call$0(Pair pair) {
            BczWebFragment.this.initOption((OpenWebViewOption) pair.getSecond());
        }

        @Override // wb0.q
        public String call(Boolean aBoolean, String s11) {
            final Pair<String, OpenWebViewOption> parseUrlToWeb = BczWebHelperKt.parseUrlToWeb(s11);
            if (parseUrlToWeb.getSecond() != null) {
                BczWebFragment.this.mArguments.setWebOption(parseUrlToWeb.getSecond());
                BczWebFragment.this.mHandler.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.AnonymousClass11.this.lambda$call$0(parseUrlToWeb);
                    }
                });
            }
            return parseUrlToWeb.getFirst();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.webview.ui.BczWebFragment$15, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass15 {
        static final /* synthetic */ int[] $SwitchMap$com$baicizhan$client$framework$audio$IAudioPlayer$State;

        static {
            int[] iArr = new int[IAudioPlayer.State.values().length];
            $SwitchMap$com$baicizhan$client$framework$audio$IAudioPlayer$State = iArr;
            try {
                iArr[IAudioPlayer.State.Paused.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$baicizhan$client$framework$audio$IAudioPlayer$State[IAudioPlayer.State.Stopped.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$baicizhan$client$framework$audio$IAudioPlayer$State[IAudioPlayer.State.Completed.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$baicizhan$client$framework$audio$IAudioPlayer$State[IAudioPlayer.State.Playing.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$baicizhan$client$framework$audio$IAudioPlayer$State[IAudioPlayer.State.Preparing.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.webview.ui.BczWebFragment$8, reason: invalid class name */
    public class AnonymousClass8 extends WebChromeClient {
        public AnonymousClass8() {
        }

        public static /* synthetic */ void b(PermissionRequest permissionRequest, String[] strArr) {
            permissionRequest.grant(strArr);
            qb.c.i(BczWebFragment.TAG, "grant %s", Arrays.toString(strArr));
        }

        public static /* synthetic */ void c(PermissionRequest permissionRequest, String[] strArr) {
            permissionRequest.deny();
            qb.c.i(BczWebFragment.TAG, "deny %s", Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$onShowFileChooser$0() {
            BczWebFragment bczWebFragment = BczWebFragment.this;
            bczWebFragment.showWithSheetView(bczWebFragment.mBottomSelectImageView);
        }

        @Override // android.webkit.WebChromeClient
        public View getVideoLoadingProgressView() {
            FrameLayout frameLayout = new FrameLayout(BczWebFragment.this.getActivity());
            frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return frameLayout;
        }

        @Override // android.webkit.WebChromeClient
        public void onHideCustomView() {
            FrameLayout videoContainer = BczWebFragment.this.mListener.getVideoContainer();
            videoContainer.removeAllViews();
            videoContainer.setVisibility(8);
            BczWebFragment.this.mWebView.setVisibility(0);
            if (BczWebFragment.this.isResumed() && BczWebFragment.this.getResources().getConfiguration().orientation != 1) {
                BczWebFragment.this.fullScreen();
            }
            super.onHideCustomView();
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsAlert(WebView view, String url, String message, JsResult result) {
            return BczWebFragment.this.onJsAlert(view, url, message, result);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
            return BczWebFragment.this.onJsConfirm(view, url, message, result);
        }

        @Override // android.webkit.WebChromeClient
        public void onPermissionRequest(final PermissionRequest request) {
            final String[] resources = request.getResources();
            String[] generateWebPermission = WebUtils.INSTANCE.generateWebPermission(resources);
            qb.c.i(BczWebFragment.TAG, "onPermissionRequest %s %s", Arrays.toString(resources), Arrays.toString(generateWebPermission));
            if (generateWebPermission.length >= 1) {
                BczWebFragment.this.requestClientPermission(generateWebPermission, new Runnable() { // from class: com.baicizhan.client.business.webview.ui.s
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.AnonymousClass8.b(request, resources);
                    }
                }, new Runnable() { // from class: com.baicizhan.client.business.webview.ui.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.AnonymousClass8.c(request, resources);
                    }
                });
            } else {
                request.deny();
                qb.c.i(BczWebFragment.TAG, "deny length %s", Arrays.toString(resources));
            }
        }

        @Override // android.webkit.WebChromeClient
        public void onReceivedTitle(WebView view, String title) {
            super.onReceivedTitle(view, title);
            if (BczWebFragment.this.mCurError || BczWebFragment.this.mListener == null || !BczWebFragment.this.isTitleLegal(view.getTitle())) {
                return;
            }
            BczWebFragment.this.mListener.onSetTitle(view.getTitle());
        }

        @Override // android.webkit.WebChromeClient
        public void onShowCustomView(View view, WebChromeClient.CustomViewCallback callback) {
            FrameLayout videoContainer = BczWebFragment.this.mListener.getVideoContainer();
            videoContainer.removeAllViews();
            videoContainer.addView(view);
            BczWebFragment.this.fullScreen();
            BczWebFragment.this.mListener.getVideoContainer().setVisibility(0);
            BczWebFragment.this.mWebView.setVisibility(8);
            BczWebFragment.this.mVideoCallback = callback;
            super.onShowCustomView(view, callback);
        }

        @Override // android.webkit.WebChromeClient
        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> filePathCallback, WebChromeClient.FileChooserParams fileChooserParams) {
            qb.c.b(BczWebFragment.TAG, "onShowFileChooser: " + fileChooserParams, new Object[0]);
            BczWebFragment.this.mFilePathCallback = filePathCallback;
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.u
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.AnonymousClass8.this.lambda$onShowFileChooser$0();
                }
            });
            return true;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AlipayJSI {
        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$pay$0() {
            BczWebFragment.this.onAliPayResponse("resultStatus={6001};memo={操作已经取消。};result={}");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ yz.g2 lambda$pay$1(String str) {
            PayManager.getInstance().aliPay(BczWebFragment.this.getActivity(), str);
            return yz.g2.f100423a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$pay$2() {
            BczWebFragment.this.onAliPayResponse("resultStatus={6001};memo={操作已经取消。};result={}");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ yz.g2 lambda$pay$3() {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.w
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.AlipayJSI.this.lambda$pay$2();
                }
            });
            return yz.g2.f100423a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$pay$5(kc.u uVar) {
            mc.a.l(BczWebFragment.this, uVar, "show-dialog-ali");
        }

        @JavascriptInterface
        public void pay(final String orderInfo) {
            qb.c.i(BczWebFragment.TAG, "call ali", new Object[0]);
            if (BczWebFragment.this.getActivity() == null) {
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.AlipayJSI.this.lambda$pay$0();
                    }
                });
            } else {
                final kc.u thirdAppDialog = ThirdAppDialogKt.thirdAppDialog(BczWebFragment.this.mWebView.getContext(), new x00.a() { // from class: com.baicizhan.client.business.webview.ui.y
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 lambda$pay$1;
                        lambda$pay$1 = BczWebFragment.AlipayJSI.this.lambda$pay$1(orderInfo);
                        return lambda$pay$1;
                    }
                }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.z
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 lambda$pay$3;
                        lambda$pay$3 = BczWebFragment.AlipayJSI.this.lambda$pay$3();
                        return lambda$pay$3;
                    }
                }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.a0
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 g2Var;
                        g2Var = yz.g2.f100423a;
                        return g2Var;
                    }
                });
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.b0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.AlipayJSI.this.lambda$pay$5(thirdAppDialog);
                    }
                });
            }
        }

        private AlipayJSI() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AudioPlayerJSI {
        boolean enable;

        /* JADX INFO: Access modifiers changed from: private */
        public void invokeOnError(int code, String msg) {
            String format = String.format(Locale.getDefault(), "javascript:%s.onError({\"code\":%d, \"msg\":\"%s\"})", BczWebFragment.AUDIOR_PLAYER_JSI, Integer.valueOf(code), msg);
            BczWebFragment bczWebFragment = BczWebFragment.this;
            bczWebFragment.mWebView.loadUrl(format, bczWebFragment.mHeader);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void realStatus(IAudioPlayer.State state) {
            int i11 = AnonymousClass15.$SwitchMap$com$baicizhan$client$framework$audio$IAudioPlayer$State[state.ordinal()];
            if (i11 == 1) {
                BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onPause()", BczWebFragment.AUDIOR_PLAYER_JSI), BczWebFragment.this.mHeader);
                return;
            }
            if (i11 == 2) {
                BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onStop()", BczWebFragment.AUDIOR_PLAYER_JSI), BczWebFragment.this.mHeader);
            } else if (i11 == 3) {
                BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onComplete()", BczWebFragment.AUDIOR_PLAYER_JSI), BczWebFragment.this.mHeader);
            } else {
                if (i11 != 5) {
                    return;
                }
                BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onStart()", BczWebFragment.AUDIOR_PLAYER_JSI), BczWebFragment.this.mHeader);
            }
        }

        public void error(String error) {
            invokeOnError(2, error);
        }

        public void onStatus(final IAudioPlayer.State state) {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.AudioPlayerJSI.4
                @Override // java.lang.Runnable
                public void run() {
                    AudioPlayerJSI.this.realStatus(state);
                }
            });
        }

        @JavascriptInterface
        public void pause() {
            BczWebFragment.this.mAudioPlayer.pause();
        }

        @JavascriptInterface
        public void resume() {
            BczWebFragment.this.mAudioPlayer.play();
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.AudioPlayerJSI.2
                @Override // java.lang.Runnable
                public void run() {
                    BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onResume()", BczWebFragment.AUDIOR_PLAYER_JSI), BczWebFragment.this.mHeader);
                }
            });
        }

        @JavascriptInterface
        public void seek(int time) {
            BczWebFragment.this.mAudioPlayer.seekTo(time);
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.AudioPlayerJSI.3
                @Override // java.lang.Runnable
                public void run() {
                    BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onSeek()", BczWebFragment.AUDIOR_PLAYER_JSI), BczWebFragment.this.mHeader);
                }
            });
        }

        @JavascriptInterface
        public void start(String url) {
            this.enable = true;
            VoiceMgr.getInstance().loadVoice(url).w5(bc0.c.e()).I3(tb0.a.a()).r5(new qb0.g<File>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.AudioPlayerJSI.1
                @Override // qb0.c
                public void onError(Throwable e11) {
                    if (rb.d.f(BczWebFragment.this.getContext())) {
                        AudioPlayerJSI.this.invokeOnError(3, e11.getMessage());
                    } else {
                        AudioPlayerJSI.this.invokeOnError(4, "network error");
                    }
                }

                @Override // qb0.c
                public void onNext(File file) {
                    BczWebFragment.this.mAudioPlayer.e(file);
                }

                @Override // qb0.c
                public void onCompleted() {
                }
            });
        }

        @JavascriptInterface
        public void stop() {
            BczWebFragment.this.mAudioPlayer.pause();
        }

        private AudioPlayerJSI() {
            this.enable = false;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class AudioRecordJSI {
        private AudioRecordMgr.AudioListener mListener;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.webview.ui.BczWebFragment$AudioRecordJSI$1, reason: invalid class name */
        public class AnonymousClass1 implements AudioRecordMgr.AudioListener {
            public AnonymousClass1() {
            }

            /* JADX INFO: Access modifiers changed from: private */
            public /* synthetic */ void lambda$onStop$0(Contract.RecordSuccess recordSuccess) {
                BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onRecordSuccess(%s)", BczWebFragment.AUDIOR_ECORD_JSI, BczJson.writeToJson(recordSuccess, Contract.RecordSuccess.class)), BczWebFragment.this.mHeader);
            }

            @Override // com.baicizhan.client.business.webview.sdk.AudioRecordMgr.AudioListener
            public void onError(String error) {
                AudioRecordJSI.this.invokeOnError(2, error);
            }

            @Override // com.baicizhan.client.business.webview.sdk.AudioRecordMgr.AudioListener
            public void onPermission(boolean permission) {
                if (permission) {
                    AudioRecordJSI.this.realStart();
                } else {
                    AudioRecordJSI.this.invokeOnError(5, "no permission");
                }
            }

            @Override // com.baicizhan.client.business.webview.sdk.AudioRecordMgr.AudioListener
            public void onStart() {
                BczWebFragment bczWebFragment = BczWebFragment.this;
                bczWebFragment.mWebView.loadUrl("javascript:bcz_audioRecord.onRecordStart()", bczWebFragment.mHeader);
            }

            @Override // com.baicizhan.client.business.webview.sdk.AudioRecordMgr.AudioListener
            public void onStop(String file, long duration, int sample) {
                final Contract.RecordSuccess recordSuccess = new Contract.RecordSuccess();
                recordSuccess.duration = (int) duration;
                recordSuccess.tempFilePath = file;
                recordSuccess.sampleRate = sample;
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.e0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.AudioRecordJSI.AnonymousClass1.this.lambda$onStop$0(recordSuccess);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void invokeOnError(int code, String msg) {
            final String format = String.format(Locale.getDefault(), "javascript:%s.onRecordError({\"code\":%d, \"message\":\"%s\"})", BczWebFragment.AUDIOR_ECORD_JSI, Integer.valueOf(code), msg);
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.d0
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.AudioRecordJSI.this.lambda$invokeOnError$0(format);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$invokeOnError$0(String str) {
            BczWebFragment bczWebFragment = BczWebFragment.this;
            bczWebFragment.mWebView.loadUrl(str, bczWebFragment.mHeader);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$startRecord$1(Contract.StartRecordParam startRecordParam) {
            if (BczWebFragment.this.mAudioRecordMgr == null) {
                BczWebFragment bczWebFragment = BczWebFragment.this;
                bczWebFragment.mAudioRecordMgr = new AudioRecordMgr(bczWebFragment.getContext());
                BczWebFragment.this.mAudioRecordMgr.setListener(this.mListener);
            }
            BczWebFragment.this.mAudioRecordMgr.setSampleRate(startRecordParam.sampleRate);
            BczWebFragment.this.mAudioRecordMgr.setMaxDuration(startRecordParam.duration);
            realStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void realStart() {
            if (BczWebFragment.this.mAudioRecordMgr.hasAudioPremission()) {
                BczWebFragment.this.mAudioRecordMgr.startRecord();
            } else {
                BczWebFragment.this.mAudioRecordMgr.requestPermission(BczWebFragment.this);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void realStop() {
            if (BczWebFragment.this.mAudioRecordMgr == null) {
                BczWebFragment bczWebFragment = BczWebFragment.this;
                bczWebFragment.mAudioRecordMgr = new AudioRecordMgr(bczWebFragment.getContext());
                BczWebFragment.this.mAudioRecordMgr.setListener(this.mListener);
            }
            BczWebFragment.this.mAudioRecordMgr.stopRecord();
        }

        @JavascriptInterface
        public void startRecord(String param) {
            if (BczWebFragment.this.mAudioPlayer != null) {
                BczWebFragment.this.mAudioPlayer.stop();
            }
            final Contract.StartRecordParam startRecordParam = (Contract.StartRecordParam) BczJson.readFromJson(param, Contract.StartRecordParam.class);
            if (startRecordParam != null) {
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.c0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.AudioRecordJSI.this.lambda$startRecord$1(startRecordParam);
                    }
                });
            } else {
                qb.c.d(BczWebFragment.TAG, "res %s", param);
            }
        }

        @JavascriptInterface
        public void stopRecord() {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.AudioRecordJSI.2
                @Override // java.lang.Runnable
                public void run() {
                    AudioRecordJSI.this.realStop();
                }
            });
        }

        private AudioRecordJSI() {
            this.mListener = new AnonymousClass1();
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class BaseInfo {

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class FormDataFile implements NoProguard {
            public String contentType;
            public String filePath;
            public String name;

            public FormDataFile() {
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class UploadParam implements NoProguard {
            public FormDataFile file;
            public Map<String, String> formData;
            public Map<String, String> header;
            public String serverUrl;

            public UploadParam() {
            }
        }

        public static /* synthetic */ rx.c c(UploadParam uploadParam, File file) {
            String str = uploadParam.serverUrl;
            String absolutePath = file.getAbsolutePath();
            FormDataFile formDataFile = uploadParam.file;
            return RxLargeFileUpload.upload(str, absolutePath, formDataFile.name, formDataFile.contentType, uploadParam.header, uploadParam.formData);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$learningRecord$1(Exception exc) {
            BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.learningRecordFailed(%s)", BczWebFragment.BASE_INFO, exc.getMessage()), BczWebFragment.this.mHeader);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$learningRecord$2(String str) {
            try {
                JsLearnRecord jsLearnRecord = (JsLearnRecord) new com.google.gson.d().n(str, JsLearnRecord.class);
                LearnRecordManager A = LearnRecordManager.A();
                int parseInt = Integer.parseInt(jsLearnRecord.f16794id);
                int parseInt2 = Integer.parseInt(jsLearnRecord.score);
                int parseInt3 = Integer.parseInt(jsLearnRecord.spanDay);
                boolean parseBoolean = Boolean.parseBoolean(jsLearnRecord.todayNew);
                String str2 = jsLearnRecord.wrongTimes;
                String str3 = "0";
                if (str2 == null) {
                    str2 = "0";
                }
                int parseInt4 = Integer.parseInt(str2);
                String str4 = jsLearnRecord.reviewRound;
                if (str4 == null) {
                    str4 = "-1";
                }
                int parseInt5 = Integer.parseInt(str4);
                String str5 = jsLearnRecord.extra1;
                if (str5 != null) {
                    str3 = str5;
                }
                A.k(parseInt, parseInt2, parseInt3, parseBoolean, parseInt4, parseInt5, Integer.parseInt(str3));
                BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.learningRecordSuccess(%d)", BczWebFragment.BASE_INFO, Integer.valueOf(Integer.parseInt(jsLearnRecord.f16794id))), BczWebFragment.this.mHeader);
            } catch (Exception e11) {
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.j0
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.BaseInfo.this.lambda$learningRecord$1(e11);
                    }
                });
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$requestLearningInfo$3(String str) {
            qb.c.i(BczWebFragment.TAG, "rsp: %s", str);
            BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onRequestLearningInfo(%s)", BczWebFragment.BASE_INFO, str, BczWebFragment.this.mHeader));
        }

        @JavascriptInterface
        public void commitStudyData() {
            BczWebFragment.this.mDakaRepo.b();
            RxFlowUtilsKt.asRxJava(BczWebFragment.this.mStudyCommitter.commit()).w5(bc0.c.e()).I3(tb0.a.a()).r5(new qb0.g<Boolean>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.BaseInfo.7
                @Override // qb0.c
                public void onError(Throwable e11) {
                    BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onCommitStudyDataResult({\"success\":false, \"msg\": \"%s\"})", BczWebFragment.BASE_INFO, e11.getLocalizedMessage()), BczWebFragment.this.mHeader);
                    qb.c.c(BczWebFragment.TAG, "failed", e11);
                }

                @Override // qb0.c
                public void onNext(Boolean aBoolean) {
                    BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onCommitStudyDataResult({\"success\":true, \"msg\":\"\"})", BczWebFragment.BASE_INFO), BczWebFragment.this.mHeader);
                    qb.c.i(BczWebFragment.TAG, "COMMIT SUCCESS", new Object[0]);
                }

                @Override // qb0.c
                public void onCompleted() {
                }
            });
        }

        @JavascriptInterface
        public void getBczId() {
            UserRecord p11 = q9.x.r().p();
            final int uniqueId = p11 != null ? p11.getUniqueId() : 0;
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.BaseInfo.1
                @Override // java.lang.Runnable
                public void run() {
                    BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onBczId(%d)", BczWebFragment.BASE_INFO, Integer.valueOf(uniqueId)), BczWebFragment.this.mHeader);
                }
            });
        }

        @JavascriptInterface
        public void learningRecord(final String jsonParam) {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.h0
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.BaseInfo.this.lambda$learningRecord$2(jsonParam);
                }
            });
        }

        @JavascriptInterface
        public void preload(String[] urls) {
            if (BczWebFragment.this.mPreloadSub != null && !BczWebFragment.this.mPreloadSub.isUnsubscribed()) {
                BczWebFragment.this.mPreloadSub.unsubscribe();
            }
            BczWebFragment.this.mPreloadSub = VoiceMgr.getInstance().preload(urls).v6().I3(tb0.a.a()).r5(new qb0.g<List<AbstractMap.SimpleEntry<String, Integer>>>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.BaseInfo.2
                @Override // qb0.c
                public void onError(Throwable e11) {
                    qb.c.c(BczWebFragment.TAG, "", e11);
                }

                @Override // qb0.c
                public void onNext(List<AbstractMap.SimpleEntry<String, Integer>> pairs) {
                    qb.c.i(BczWebFragment.TAG, "%s", new com.google.gson.d().z(pairs));
                    StringBuffer stringBuffer = new StringBuffer();
                    for (AbstractMap.SimpleEntry<String, Integer> simpleEntry : pairs) {
                        stringBuffer.append(String.format(Locale.getDefault(), "%s.onPreload(\"%s\", %d);", BczWebFragment.BASE_INFO, simpleEntry.getKey(), simpleEntry.getValue()));
                    }
                    stringBuffer.insert(0, "javascript:");
                    BczWebFragment.this.mWebView.loadUrl(stringBuffer.toString(), BczWebFragment.this.mHeader);
                }

                @Override // qb0.c
                public void onCompleted() {
                }
            });
        }

        @JavascriptInterface
        public void reportWinningStreak() {
            qb.c.i(BczWebFragment.TAG, "reportWinningStreak", new Object[0]);
            com.baicizhan.client.business.managers.winningstreak.d dVar = (com.baicizhan.client.business.managers.winningstreak.d) RxFlowUtilsKt.asRxJava(BczWebFragment.this.mWinningStreak.f()).t6().b();
            if (BczWebFragment.this.mWinningStreak.enable()) {
                xa.b.b(dVar);
            }
        }

        @JavascriptInterface
        public void requestLearningInfo() {
            LearnHelper.learnInfoObs().u5(new wb0.b() { // from class: com.baicizhan.client.business.webview.ui.f0
                @Override // wb0.b
                public final void call(Object obj) {
                    BczWebFragment.BaseInfo.this.lambda$requestLearningInfo$3((String) obj);
                }
            }, new wb0.b() { // from class: com.baicizhan.client.business.webview.ui.g0
                @Override // wb0.b
                public final void call(Object obj) {
                    qb.c.c(BczWebFragment.TAG, "", (Throwable) obj);
                }
            });
        }

        @JavascriptInterface
        public void studyBehaviorRecord(String json) {
            qb.c.i(BczWebFragment.TAG, "studyBehaviorRecord %s", new Object[0]);
            try {
                Contract.BehaviorRecordParam behaviorRecordParam = (Contract.BehaviorRecordParam) BczJson.fromJson(json, Contract.BehaviorRecordParam.class);
                BczWebFragment.this.mIExperienceRepo.c(behaviorRecordParam.bookId, behaviorRecordParam.topicId, behaviorRecordParam.questionType, u9.a.b(behaviorRecordParam.behavior));
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
        }

        @JavascriptInterface
        public void updateWordMapAction() {
            qb.c.b(BczWebFragment.TAG, "updateWordMapAction", new Object[0]);
            MapLearnHelper.INSTANCE.isMapAction().postValue(Boolean.TRUE);
        }

        @JavascriptInterface
        public void uploadFile(String param) {
            final UploadParam uploadParam = (UploadParam) new com.google.gson.d().n(param, UploadParam.class);
            if (uploadParam == null) {
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.BaseInfo.3
                    @Override // java.lang.Runnable
                    public void run() {
                        BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onUploadFileError(%s)", BczWebFragment.BASE_INFO, BczJson.writeToJson(new Contract.UploadFailed(0, "UploadParam error", null), Contract.UploadFailed.class)), BczWebFragment.this.mHeader);
                    }
                });
                return;
            }
            FormDataFile formDataFile = uploadParam.file;
            if (formDataFile == null || TextUtils.isEmpty(formDataFile.filePath)) {
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.BaseInfo.4
                    @Override // java.lang.Runnable
                    public void run() {
                        BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onUploadFileError(%s)", BczWebFragment.BASE_INFO, BczJson.writeToJson(new Contract.UploadFailed(0, "file path == null", null), Contract.UploadFailed.class)), BczWebFragment.this.mHeader);
                    }
                });
            } else if (TextUtils.isEmpty(uploadParam.serverUrl)) {
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.BaseInfo.5
                    @Override // java.lang.Runnable
                    public void run() {
                        BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onUploadFileError(%s)", BczWebFragment.BASE_INFO, BczJson.writeToJson(new Contract.UploadFailed(0, "serverUrl == null", uploadParam.file.filePath), Contract.UploadFailed.class)), BczWebFragment.this.mHeader);
                    }
                });
            } else {
                VoiceMgr.getInstance().loadVoice(uploadParam.file.filePath).b2(new wb0.p() { // from class: com.baicizhan.client.business.webview.ui.i0
                    @Override // wb0.p
                    public final Object call(Object obj) {
                        return BczWebFragment.BaseInfo.c(BczWebFragment.BaseInfo.UploadParam.this, (File) obj);
                    }
                }).I3(tb0.a.a()).r5(new qb0.g<RxLargeFileUpload.Response>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.BaseInfo.6
                    @Override // qb0.c
                    public void onError(Throwable e11) {
                        qb.c.c(BczWebFragment.TAG, "", e11);
                        BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onUploadFileError(%s)", BczWebFragment.BASE_INFO, BczJson.writeToJson(new Contract.UploadFailed(0, e11.getMessage(), uploadParam.file.filePath), Contract.UploadFailed.class)), BczWebFragment.this.mHeader);
                    }

                    @Override // qb0.c
                    public void onNext(RxLargeFileUpload.Response respance) {
                        if (respance.code == 200) {
                            BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onUploadFileSuccess(%s)", BczWebFragment.BASE_INFO, BczJson.writeToJson(new Contract.UploadSuccess(respance, uploadParam.file.filePath), Contract.UploadSuccess.class)), BczWebFragment.this.mHeader);
                        } else {
                            BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onUploadFileError(%s)", BczWebFragment.BASE_INFO, BczJson.writeToJson(new Contract.UploadFailed(respance, uploadParam.file.filePath), Contract.UploadFailed.class)), BczWebFragment.this.mHeader);
                        }
                    }

                    @Override // qb0.c
                    public void onCompleted() {
                    }
                });
            }
        }

        private BaseInfo() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class BczPageJump {
        private void daka(final String type) {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.k0
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.BczPageJump.this.lambda$daka$0(type);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$daka$0(String str) {
            try {
                WebWorker webWorker = BczWebFragment.this.mArguments.getWebWorker();
                if (webWorker == null) {
                    qb.c.q(BczWebFragment.TAG, "worker null! are you sure this page should support daka?", new Object[0]);
                    return;
                }
                webWorker.handle(str, BczWebFragment.this.getContext());
                BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.requestDakaSuccess()", "bcz_pageJump"));
                BczWebFragment.this.requireActivity().finish();
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
        }

        @JavascriptInterface
        public void requestDaka() {
            daka(WebWorker.JUMPER_KEY_REQUEST_PUNCH_CARD);
            ma.l.a(ma.t.f73003b, ma.a.F);
        }

        private BczPageJump() {
        }

        @JavascriptInterface
        public void requestDaka(String config) {
            try {
                DakaConfig dakaConfig = (DakaConfig) BczJson.fromJson(config, DakaConfig.class);
                daka((dakaConfig == null || !dakaConfig.getSkipCalendar()) ? WebWorker.JUMPER_KEY_REQUEST_PUNCH_CARD : WebWorker.JUMPER_KEY_REQUEST_PUNCH_CARD_SHARE);
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
            ma.l.a(ma.t.f73003b, ma.a.F);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class HWAggrPayJsI {
        @JavascriptInterface
        public void pay(final String json) {
            qb.c.b(BczWebFragment.TAG, "call huawei aggr pay", new Object[0]);
            HwAggrPayManager.INSTANCE.pay(BczWebFragment.this.requireActivity(), json);
        }

        private HWAggrPayJsI() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class InAppPayJsI {
        @JavascriptInterface
        public void isSupportHuaweiPay() {
            BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onSupportHuaweiPay(%s)", BczWebFragment.IN_APP_PAY, new com.google.gson.d().z(new SupportHuaweiPay(DeviceUtil.isHuawei()))), BczWebFragment.this.mHeader);
        }

        @JavascriptInterface
        public void pay(final String json) {
            qb.c.b(BczWebFragment.TAG, "call huawei pay", new Object[0]);
            HwPayManager.INSTANCE.pay(BczWebFragment.this.requireActivity(), json);
        }

        private InAppPayJsI() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class QQPayJSI {
        public static /* synthetic */ yz.g2 d(String str) {
            PayManager.getInstance().qqPay(str);
            return yz.g2.f100423a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$pay$1(String str) {
            BczWebFragment.this.mWebView.loadUrl("javascript:bcz_qqpay.onPayResult('" + str + "')", BczWebFragment.this.mHeader);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ yz.g2 lambda$pay$2() {
            final String str = "{\"errCode\": -2, \"msg\": \"\"}";
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.l0
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.QQPayJSI.this.lambda$pay$1(str);
                }
            });
            return yz.g2.f100423a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$pay$4(kc.u uVar) {
            mc.a.l(BczWebFragment.this, uVar, "show-dialog-qq");
        }

        @JavascriptInterface
        public void pay(final String payJson) {
            qb.c.i(BczWebFragment.TAG, "call QQpay", new Object[0]);
            final kc.u thirdAppDialog = ThirdAppDialogKt.thirdAppDialog(BczWebFragment.this.mWebView.getContext(), new x00.a() { // from class: com.baicizhan.client.business.webview.ui.m0
                @Override // x00.a
                public final Object invoke() {
                    return BczWebFragment.QQPayJSI.d(payJson);
                }
            }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.n0
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 lambda$pay$2;
                    lambda$pay$2 = BczWebFragment.QQPayJSI.this.lambda$pay$2();
                    return lambda$pay$2;
                }
            }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.o0
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 g2Var;
                    g2Var = yz.g2.f100423a;
                    return g2Var;
                }
            });
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.p0
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.QQPayJSI.this.lambda$pay$4(thirdAppDialog);
                }
            });
        }

        private QQPayJSI() {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class ShareCallback implements ShareDelegate.b {
        final WeakReference<BczWebFragment> weakFragment;

        public ShareCallback(BczWebFragment fragment) {
            this.weakFragment = new WeakReference<>(fragment);
        }

        public static /* synthetic */ void a(ShareChannel shareChannel, BczWebFragment bczWebFragment) {
            HashMap hashMap = new HashMap();
            hashMap.put("channel", shareChannel.toString());
            bczWebFragment.mWebView.loadUrl("javascript:bcz_system.onShareSend(" + BczJson.toJson(hashMap) + ");");
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareCancel() {
            BczWebFragment bczWebFragment = this.weakFragment.get();
            if (bczWebFragment == null) {
                return;
            }
            bczWebFragment.dismissBottomSheet();
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareError(ShareChannel media, Throwable throwable) {
            BczWebFragment bczWebFragment = this.weakFragment.get();
            if (bczWebFragment == null || bczWebFragment.getActivity() == null) {
                return;
            }
            JsonParams.ShareResultO shareResultO = new JsonParams.ShareResultO();
            shareResultO.errCode = -1;
            shareResultO.channel = JsonParams.ShareResultO.parseChannel(media);
            bczWebFragment.mWebView.loadUrl("javascript:bcz_system.onShare('" + JsonParams.repeatEscape(JsonParams.ShareResultO.toJson(shareResultO)) + "', '" + shareResultO.channel + "')");
            if (!(throwable instanceof ShareDelegate.ReadableException)) {
                va.g.i("分享失败", 0);
                return;
            }
            va.g.i("分享失败," + throwable.getMessage(), 0);
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareSend(ShareChannel media) {
            BczWebFragment bczWebFragment = this.weakFragment.get();
            if (bczWebFragment == null) {
                return;
            }
            if (bczWebFragment.mShareParam != null && bczWebFragment.mShareParam.stat != null) {
                JsonParams.Stat stat = bczWebFragment.mShareParam.stat;
                bczWebFragment.mShareParam = null;
            }
            bczWebFragment.dismissBottomSheet();
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareStart(final ShareChannel shareChannel) {
            final BczWebFragment bczWebFragment = this.weakFragment.get();
            if (bczWebFragment == null) {
                return;
            }
            bczWebFragment.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.q0
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.ShareCallback.a(ShareChannel.this, bczWebFragment);
                }
            });
        }

        @Override // com.baicizhan.client.business.auth.share.ShareDelegate.b
        public void onShareSuccess(ShareChannel media) {
            BczWebFragment bczWebFragment = this.weakFragment.get();
            if (bczWebFragment == null || bczWebFragment.getActivity() == null) {
                return;
            }
            JsonParams.ShareResultO shareResultO = new JsonParams.ShareResultO();
            shareResultO.errCode = 0;
            shareResultO.channel = JsonParams.ShareResultO.parseChannel(media);
            bczWebFragment.mWebView.loadUrl("javascript:bcz_system.onShare('" + JsonParams.repeatEscape(JsonParams.ShareResultO.toJson(shareResultO)) + "', '" + shareResultO.channel + "')");
            if (shareResultO.channel == JsonParams.ShareResultO.CHANNEL_SAVE) {
                va.g.i("图片保存成功", 0);
            } else {
                va.g.i("分享成功", 0);
            }
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SysUiRestorer implements Runnable {
        private WeakReference<BczWebFragment> mReference;
        private final int mSysVis;

        public SysUiRestorer(BczWebFragment fragment) {
            this.mReference = new WeakReference<>(fragment);
            if (fragment.getActivity() == null || fragment.getActivity().isFinishing() || fragment.getActivity().getWindow() == null) {
                this.mSysVis = -1;
            } else {
                this.mSysVis = fragment.getActivity().getWindow().getDecorView().getSystemUiVisibility();
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            BczWebFragment bczWebFragment = this.mReference.get();
            if (bczWebFragment == null || bczWebFragment.getActivity() == null || bczWebFragment.getActivity().isFinishing() || bczWebFragment.getActivity().getWindow() == null || this.mSysVis == -1) {
                return;
            }
            bczWebFragment.getActivity().getWindow().getDecorView().setSystemUiVisibility(this.mSysVis);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WXAuthSubscribeCallback implements a.c {
        final WeakReference<BczWebFragment> weakFragment;

        public WXAuthSubscribeCallback(BczWebFragment fragment) {
            this.weakFragment = new WeakReference<>(fragment);
        }

        @Override // c9.a.c
        public void onCancel() {
            BczWebFragment bczWebFragment = this.weakFragment.get();
            if (bczWebFragment == null || bczWebFragment.getActivity() == null) {
                return;
            }
            va.g.i("授权取消", 0);
        }

        @Override // c9.a.c
        public void onComplete(WeixinAuthHelper.g resp) {
            BczWebFragment bczWebFragment = this.weakFragment.get();
            if (bczWebFragment == null || bczWebFragment.getActivity() == null) {
                return;
            }
            bczWebFragment.mWebView.loadUrl("javascript:bcz_system.onAuthWeixinSubscribeMsg('" + resp + "')");
            va.g.i("授权成功", 0);
        }

        @Override // c9.a.c
        public void onError(Throwable throwable) {
            BczWebFragment bczWebFragment = this.weakFragment.get();
            if (bczWebFragment == null || bczWebFragment.getActivity() == null) {
                return;
            }
            va.g.i("授权失败", 0);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class WeixinPayJSI {
        public static /* synthetic */ yz.g2 d(String str) {
            PayManager.getInstance().wexinPay(str);
            return yz.g2.f100423a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$pay$1(String str) {
            BczWebFragment.this.mWebView.loadUrl("javascript:bcz_weixinpay.onPayResult('" + str + "')", BczWebFragment.this.mHeader);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ yz.g2 lambda$pay$2() {
            final String str = "{\"errCode\": -2, \"msg\": \"\"}";
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.l2
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.WeixinPayJSI.this.lambda$pay$1(str);
                }
            });
            return yz.g2.f100423a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$pay$4(kc.u uVar) {
            mc.a.l(BczWebFragment.this, uVar, "show-dialog-wx");
        }

        @JavascriptInterface
        public void pay(final String payJson) {
            qb.c.i(BczWebFragment.TAG, "call weixinpay", new Object[0]);
            final kc.u thirdAppDialog = ThirdAppDialogKt.thirdAppDialog(BczWebFragment.this.mWebView.getContext(), new x00.a() { // from class: com.baicizhan.client.business.webview.ui.h2
                @Override // x00.a
                public final Object invoke() {
                    return BczWebFragment.WeixinPayJSI.d(payJson);
                }
            }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.i2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 lambda$pay$2;
                    lambda$pay$2 = BczWebFragment.WeixinPayJSI.this.lambda$pay$2();
                    return lambda$pay$2;
                }
            }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.j2
                @Override // x00.a
                public final Object invoke() {
                    yz.g2 g2Var;
                    g2Var = yz.g2.f100423a;
                    return g2Var;
                }
            });
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.k2
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.WeixinPayJSI.this.lambda$pay$4(thirdAppDialog);
                }
            });
        }

        private WeixinPayJSI() {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: cancelImageSelecting, reason: merged with bridge method [inline-methods] */
    public void lambda$showWithSheetView$1() {
        ValueCallback<Uri[]> valueCallback = this.mFilePathCallback;
        if (valueCallback != null) {
            valueCallback.onReceiveValue(new Uri[0]);
            this.mFilePathCallback = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelScreenTimeout() {
        Timer timer = this.mScreenTimer;
        if (timer != null) {
            timer.cancel();
            this.mScreenTimer = null;
        }
        TimerTask timerTask = this.mScreenOffTask;
        if (timerTask != null) {
            timerTask.cancel();
            this.mScreenOffTask = null;
        }
        if (getActivity() != null) {
            getActivity().getWindow().clearFlags(128);
        }
    }

    private void cancelTimeOut() {
        qb0.h hVar = this.mTimeOutSub;
        if (hVar == null || hVar.isUnsubscribed()) {
            return;
        }
        this.mTimeOutSub.unsubscribe();
        this.mTimeOutSub = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void dismissBottomSheet() {
        BottomSheetLayout bottomSheetLayout = getBottomSheetLayout();
        if (bottomSheetLayout != null) {
            bottomSheetLayout.u();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void fullScreen() {
        if (getResources().getConfiguration().orientation == 1) {
            getActivity().setRequestedOrientation(0);
        } else {
            getActivity().setRequestedOrientation(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void goBack() {
        if (!this.mCurError && this.mWebView.canGoBack()) {
            this.mWebView.goBack();
        } else if (getActivity() != null) {
            getActivity().finish();
        }
    }

    private void initHeader() {
        this.mHeader.put("Cookie", this.mCookieConfig.getCookie());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initOption(OpenWebViewOption option) {
        qb.c.b(TAG, "initOption: %s | [%d] -> [%s]", option, Integer.valueOf(hashCode()), getActivity() != null ? Integer.valueOf(getActivity().hashCode()) : "null");
        if (getActivity() == null || getActivity().isFinishing()) {
            qb.c.b(TAG, "initOption: finishing", new Object[0]);
            return;
        }
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.onConfigureOption(option);
        }
    }

    private void initUIConfig() {
        OpenWebViewOption webOption = this.mArguments.getWebOption();
        if (webOption != null) {
            setLoadingBar(webOption.getLoadingBar());
            setTouchCalloutEnabled(webOption.getTouchCallout());
        }
    }

    private View initView(View r11) {
        View inflate = LayoutInflater.from(getActivity()).inflate(R.layout.photo_option_layout, (ViewGroup) null, false);
        this.mBottomSelectImageView = inflate;
        inflate.findViewById(R.id.take).setOnClickListener(this);
        this.mBottomSelectImageView.findViewById(R.id.pick).setOnClickListener(this);
        this.mBottomSelectImageView.findViewById(R.id.cancel).setOnClickListener(this);
        int titleBarResource = getTitleBarResource();
        if (titleBarResource != 0) {
            LinearLayout linearLayout = (LinearLayout) r11.findViewById(R.id.root);
            linearLayout.addView(LayoutInflater.from(getActivity()).inflate(titleBarResource, (ViewGroup) linearLayout, false), 0);
        }
        this.mContentView = (ViewGroup) r11.findViewById(R.id.content);
        this.mWebView = (BczWebView) r11.findViewById(R.id.web_view);
        this.mErrorViewStub = (ViewStub) r11.findViewById(R.id.error_view_stub);
        try {
            this.mWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        } catch (Throwable th2) {
            qb.c.c(TAG, "", th2);
        }
        this.mProgressView = (DisguiseProgressBar) r11.findViewById(R.id.progress_bar);
        initUIConfig();
        initWebView();
        refreshBlackList();
        onViewInited(r11);
        return r11;
    }

    private void initWebChromeClient() {
        if (getActivity() instanceof LandScapeBczWebActivity) {
            return;
        }
        this.mWebView.setWebChromeClient(new AnonymousClass8());
    }

    private void initWebClient() {
        this.mWebView.setWebViewClient(new AnonymousClass9());
    }

    private void initWebCookie() {
        PayManager.putPayHeader(getActivity(), this.mHeader, !this.mArguments.isAnonymous());
        UserRecord p11 = q9.x.r().p();
        String token = p11 == null ? null : p11.getToken();
        if (token != null) {
            try {
                this.mCookieConfig.putCookie("access_token", URLEncoder.encode(token, "UTF-8"));
            } catch (UnsupportedEncodingException unused) {
                qb.c.d(TAG, "无法对token做UTF-8编码", new Object[0]);
            }
        } else {
            qb.c.d(TAG, "webview init cookie failed, token is null, user: " + p11, new Object[0]);
        }
        qb.c.i(TAG, "is anonymous %b", Boolean.valueOf(this.mArguments.isAnonymous()));
        String a11 = !this.mArguments.isAnonymous() ? xb.o.a(pb.a.a()) : Arguments.ARG_ANONYMOUS;
        String o11 = xb.f.o(a11);
        this.mCookieConfig.putCookie("Pay-Support-H5", toIosPaySupport()).putCookie("device_name", "android/" + nb.a.f75039b.replace(" ", "")).putCookie("bcz_dmid", o11.substring(o11.length() - 8, o11.length())).putCookie("device_version", nb.a.f75038a).putCookie("device_id", a11).putCookie("app_name", Integer.toString(xb.o.g(pb.a.a()))).putCookie("channel", ChannelUtils.getChannel(pb.a.a())).putCookie("client_time", String.valueOf(System.currentTimeMillis() / 1000)).setCookie(pb.a.a());
    }

    private void initWebJSInterface() {
        this.mSystemJSI = new SystemJSI(getActivity());
        this.mWebView.addJavascriptInterface(new AlipayJSI(), "bcz_alipay");
        this.mWebView.addJavascriptInterface(new WeixinPayJSI(), "bcz_weixinpay");
        this.mWebView.addJavascriptInterface(new QQPayJSI(), "bcz_qqpay");
        this.mWebView.addJavascriptInterface(new InAppPayJsI(), IN_APP_PAY);
        this.mWebView.addJavascriptInterface(new HWAggrPayJsI(), HW_AGGR_PAY);
        this.mWebView.addJavascriptInterface(this.mSystemJSI, "bcz_system");
        this.mWebView.addJavascriptInterface(this.mAudioPlayerJSI, AUDIOR_PLAYER_JSI);
        this.mWebView.addJavascriptInterface(new AudioRecordJSI(), AUDIOR_ECORD_JSI);
        this.mWebView.addJavascriptInterface(new BaseInfo(), BASE_INFO);
        this.mWebView.addJavascriptInterface(new BczPageJump(), "bcz_pageJump");
        addJavascriptInterfaces();
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.addJavascriptInterfaces(this.mWebView);
        }
    }

    private void initWebUserAgent() {
        Locale locale = Locale.CHINA;
        String format = String.format(locale, "%s/%s %s/%s %s/%s", "bcz_app_android", Integer.valueOf(xb.o.g(getActivity())), "android_version", nb.a.f75038a, "device_name", nb.a.f75039b);
        androidx.core.util.Pair<String, String> appendUserAgentPair = appendUserAgentPair();
        if (appendUserAgentPair != null) {
            format = String.format(locale, "%s %s/%s", format, appendUserAgentPair.first, appendUserAgentPair.second);
        }
        this.mWebView.getSettings().setUserAgentString(format);
    }

    private void initWebView() {
        getActivity().registerForContextMenu(this.mWebView);
        this.mWebView.getSettings().setJavaScriptEnabled(true);
        this.mWebView.getSettings().setDomStorageEnabled(true);
        this.mWebView.getSettings().setSupportZoom(true);
        this.mWebView.getSettings().setBuiltInZoomControls(true);
        this.mWebView.getSettings().setDisplayZoomControls(false);
        this.mWebView.getSettings().setTextZoom(100);
        this.mWebView.getSettings().setMediaPlaybackRequiresUserGesture(false);
        if (q9.x.r().S()) {
            this.mWebView.getSettings().setMixedContentMode(0);
        }
        this.mWebView.getSettings().setDatabaseEnabled(true);
        this.mWebView.getSettings().setCacheMode(1);
        if (getActivity().getFilesDir() != null) {
            String str = getActivity().getFilesDir() + CACHE_DIR;
            File file = new File(str);
            if (!file.exists() && !file.mkdirs()) {
                str = getActivity().getCacheDir().getAbsolutePath();
            }
            qb.c.b(TAG, "web cache path: " + str, new Object[0]);
            this.mWebView.getSettings().setDatabasePath(str);
        }
        this.mWebView.getSettings().setCacheMode(-1);
        this.mWebView.setDownloadListener(new DownloadListener() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.7
            @Override // android.webkit.DownloadListener
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {
                qb.c.i(BczWebFragment.TAG, "download Start [mineType, contentDisposition, userAgent,contentLength, url] [%s, %s, %s, %d, %s]", mimetype, contentDisposition, userAgent, Long.valueOf(contentLength), url);
                try {
                    if (!WhiteListMgr.inst().inWhiteList(url)) {
                        qb.c.d(BczWebFragment.TAG, "url error %s", url);
                        return;
                    }
                    Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
                    intent.setData(Uri.parse(url));
                    BczWebFragment.this.startActivity(intent);
                } catch (Exception e11) {
                    qb.c.c(BczWebFragment.TAG, "onDownloadStart", e11);
                }
            }
        });
        initWebCookie();
        initWebUserAgent();
        initWebChromeClient();
        initWebClient();
        initWebJSInterface();
        initHeader();
    }

    private boolean isTitleEqualsUrl(String title, String url) {
        return title.equals(URLDecoder.decode(url));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean isTitleLegal(String title) {
        if (TextUtils.isEmpty(title) || title.startsWith("http")) {
            return false;
        }
        String str = this.mLastUrl;
        return str == null || !str.contains(title);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onHuaweiPayResponse$11(HwPayResponse hwPayResponse) {
        String z11 = new com.google.gson.d().z(hwPayResponse);
        qb.c.b(TAG, "huawei pay resp:" + z11, new Object[0]);
        this.mWebView.loadUrl(String.format(Locale.getDefault(), "javascript:%s.onPayResult('%s')", IN_APP_PAY, z11), this.mHeader);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ yz.g2 lambda$pickImage$2(View view) {
        BczPermissions.INSTANCE.setPhotoGranted(true);
        com.soundcloud.android.crop.a.o(getActivity(), this);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ yz.g2 lambda$pickImage$3(View view) {
        lambda$showWithSheetView$1();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestClientPermission$8(Runnable runnable, Runnable runnable2) {
        if (this.mHasPermission) {
            runnable.run();
        } else {
            runnable2.run();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$requestClientPermission$9(final Runnable runnable, final Runnable runnable2) {
        this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.p
            @Override // java.lang.Runnable
            public final void run() {
                BczWebFragment.this.lambda$requestClientPermission$8(runnable, runnable2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$setScreenFlag$0(int i11) {
        cancelScreenTimeout();
        if (i11 == -1) {
            getActivity().getWindow().clearFlags(128);
            return;
        }
        if (i11 >= 0) {
            getActivity().getWindow().addFlags(128);
            if (i11 > 0) {
                this.mScreenTimer = new Timer();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1();
                this.mScreenOffTask = anonymousClass1;
                this.mScreenTimer.schedule(anonymousClass1, i11 * 1000);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$startTimeOut$4(Long l11) {
        setErrorPage(true);
        qb.c.d(TAG, "TIME OUT after %d", 20000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$updateCloseVisibility$10() {
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            onFragmentInteractionListener.onSetCloseVisibility(this.mWebView.canGoBack() ? 0 : 8, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void load() {
        /*
            r5 = this;
            com.baicizhan.client.business.webview.args.Arguments r0 = r5.mArguments
            java.lang.String r0 = r0.getUrl()
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L37
            java.lang.String r1 = "http://"
            int r2 = r0.indexOf(r1)
            if (r2 >= 0) goto L37
            java.lang.String r2 = "https://"
            int r3 = r0.indexOf(r2)
            if (r3 >= 0) goto L37
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            q9.x r4 = q9.x.r()
            boolean r4 = r4.S()
            if (r4 == 0) goto L2c
            r1 = r2
        L2c:
            r3.append(r1)
            r3.append(r0)
            java.lang.String r1 = r3.toString()
            goto L38
        L37:
            r1 = 0
        L38:
            if (r1 != 0) goto L3b
            goto L3c
        L3b:
            r0 = r1
        L3c:
            com.baicizhan.client.business.webview.hijack.WhiteListMgr r1 = com.baicizhan.client.business.webview.hijack.WhiteListMgr.inst()
            boolean r1 = r1.inWhiteList(r0)
            if (r1 != 0) goto L4b
            r0 = 1
            r5.setErrorPage(r0)
            return
        L4b:
            com.baicizhan.client.business.webview.ui.BczWebView r1 = r5.mWebView
            java.util.Map<java.lang.String, java.lang.String> r2 = r5.mHeader
            r1.loadUrl(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baicizhan.client.business.webview.ui.BczWebFragment.load():void");
    }

    public static BczWebFragment newInstance(Arguments arguments) {
        BczWebFragment bczWebFragment = new BczWebFragment();
        bczWebFragment.setArguments(arguments.getArguments());
        return bczWebFragment;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onGetNetworkType() {
        String json = JsonParams.NetworkStateO.toJson(new JsonParams.NetworkStateO(getActivity()));
        this.mWebView.loadUrl("javascript:window.bcz_system.onGetNetworkType('" + JsonParams.repeatEscape(json) + "')");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [kc.d, kc.h] */
    private void pickImage() {
        if (BczPermissions.INSTANCE.getPhotoGranted()) {
            PhotoPuller.pick(getActivity());
        } else {
            mc.a.l(this, ((u.a) ((u.a) new u.a(getContext()).L(R.string.permission_request_photo_title).U(R.string.permission_request_photo_content).b0(ButtonType.DOUBLE).E(R.string.permission_request_photo_confirm, null, new x00.l() { // from class: com.baicizhan.client.business.webview.ui.m
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 lambda$pickImage$2;
                    lambda$pickImage$2 = BczWebFragment.this.lambda$pickImage$2((View) obj);
                    return lambda$pickImage$2;
                }
            })).o(R.string.permission_request_photo_no, new x00.l() { // from class: com.baicizhan.client.business.webview.ui.n
                @Override // x00.l
                public final Object invoke(Object obj) {
                    yz.g2 lambda$pickImage$3;
                    lambda$pickImage$3 = BczWebFragment.this.lambda$pickImage$3((View) obj);
                    return lambda$pickImage$3;
                }
            })).d(), "permission");
        }
        dismissBottomSheet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void postImageUploadState(JsonParams.ImageUploadStateO state) {
        String json = JsonParams.ImageUploadStateO.toJson(state);
        this.mWebView.loadUrl("javascript:window.bcz_system.onPostImageUploadState('" + JsonParams.repeatEscape(json) + "')");
    }

    private void postLocation(JsonParams.LocationResultO location) {
        String json = JsonParams.LocationResultO.toJson(location);
        this.mWebView.loadUrl("javascript:window.bcz_system.onLocation('" + JsonParams.repeatEscape(json) + "')");
    }

    private void refreshBlackList() {
        this.mSubscriptions.e(this.mGetBlackListSubscription);
    }

    private void setDocumentTitle(String title, String url) {
        if (title == null || this.mListener == null) {
            return;
        }
        String decode = URLDecoder.decode(url);
        if (!title.startsWith("http")) {
            this.mListener.onSetTitle(title);
        } else if (title.equals(decode)) {
            this.mListener.onSetTitle("");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorPage(boolean error) {
        this.mCurError = error;
        qb.c.b(TAG, "error page: " + error + ", error view: " + this.mErrorView, new Object[0]);
        if (!error) {
            this.mWebView.setVisibility(0);
            this.mErrorView.g(false, true);
            this.mListener.onSetTitle("");
            return;
        }
        this.mWebView.setVisibility(8);
        WebBlankView webBlankView = this.mErrorView;
        if (webBlankView == null) {
            WebBlankView webBlankView2 = (WebBlankView) this.mErrorViewStub.inflate();
            this.mErrorView = webBlankView2;
            webBlankView2.findViewById(R.id.noproguard_retry).setOnClickListener(new sa.c() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.13
                @Override // sa.c, android.view.View.OnClickListener
                public void onClick(View v11) {
                    super.onClick(v11);
                    BczWebFragment.this.setErrorPage(false);
                    BczWebFragment.this.startLoad();
                }
            });
        } else {
            webBlankView.setVisible(true);
        }
        this.mListener.onSetTitle(getString(R.string.web_page_title_error));
    }

    private void setLoadingBar(LoadingBarOption loadingOption) {
        if (loadingOption == null) {
            return;
        }
        this.showProgress = Boolean.valueOf(loadingOption.getVisible());
        if (!TextUtils.isEmpty(loadingOption.getColor())) {
            this.mProgressView.setProgressDrawable(new ClipDrawable(new ColorDrawable(UiUtils.RGBA2ARGB(loadingOption.getColor())), GravityCompat.START, 1));
        }
        if (TextUtils.isEmpty(loadingOption.getBgColor())) {
            return;
        }
        this.mProgressView.setBackgroundColor(UiUtils.RGBA2ARGB(loadingOption.getBgColor()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScreenFlag(final int seconds) {
        if (getActivity() != null) {
            this.mHandler.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.o
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.this.lambda$setScreenFlag$0(seconds);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTouchCalloutEnabled(TouchCalloutOption touchOption) {
        if (touchOption != null) {
            this.mWebView.setEnableDownload(touchOption.getEnabled());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void showWithSheetView(View sheetView) {
        BottomSheetLayout bottomSheetLayout = getBottomSheetLayout();
        if (bottomSheetLayout != null) {
            bottomSheetLayout.p(new ql.c() { // from class: com.baicizhan.client.business.webview.ui.h
                @Override // ql.c
                public final void a() {
                    BczWebFragment.this.lambda$showWithSheetView$1();
                }
            });
            bottomSheetLayout.L(sheetView);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startLoad() {
        rx.c<Boolean> rxInit = SignManager.getInstance().rxInit(getActivity());
        String url = !TextUtils.isEmpty(this.mLastUrl) ? this.mLastUrl : this.mArguments.getUrl();
        rx.c r72 = !TextUtils.isEmpty(url) ? rx.c.r7(rxInit, rx.c.M2(url), new wb0.q<Boolean, String, String>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.10
            @Override // wb0.q
            public String call(Boolean aBoolean, String s11) {
                return s11;
            }
        }) : rx.c.r7(rxInit, UrlFetcher.fetchUrl(UrlFetcher.getFetcher(this.mArguments.getUrlStrategy(), this.mArguments.getDefaultUrl())), new AnonymousClass11());
        qb0.h hVar = this.mLoadSubscription;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mLoadSubscription.unsubscribe();
        }
        this.mLoadSubscription = r72.I3(tb0.a.a()).r5(new qb0.g<String>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.12
            @Override // qb0.c
            public void onError(Throwable e11) {
                if (BczWebFragment.this.getActivity() == null) {
                    return;
                }
                BczWebFragment.this.setErrorPage(true);
                qb.c.c(BczWebFragment.TAG, "fetch url from bczwebview failed. ", e11);
            }

            @Override // qb0.c
            public void onNext(String s11) {
                if (BczWebFragment.this.getActivity() == null) {
                    return;
                }
                BczWebFragment.this.mArguments.setUrl(s11);
                BczWebFragment.this.load();
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        });
    }

    private void startTimeOut() {
        cancelTimeOut();
        this.mTimeOutSub = rx.c.o6(20000L, TimeUnit.MILLISECONDS).I3(tb0.a.a()).u5(new wb0.b() { // from class: com.baicizhan.client.business.webview.ui.i
            @Override // wb0.b
            public final void call(Object obj) {
                BczWebFragment.this.lambda$startTimeOut$4((Long) obj);
            }
        }, new wb0.b() { // from class: com.baicizhan.client.business.webview.ui.j
            @Override // wb0.b
            public final void call(Object obj) {
                qb.c.c(BczWebFragment.TAG, "", (Throwable) obj);
            }
        });
    }

    private void takeImage() {
        dismissBottomSheet();
        if (ContextCompat.checkSelfPermission(requireActivity(), "android.permission.CAMERA") == 0) {
            this.mTakePhotoPath = PhotoPuller.take(requireActivity());
            return;
        }
        qb.c.i(TAG, "need permission %s", "android.permission.CAMERA");
        sa.h hVar = new sa.h(requireActivity());
        this.permissionBanner = hVar;
        hVar.j("android.permission.CAMERA");
        ActivityCompat.requestPermissions(requireActivity(), new String[]{"android.permission.CAMERA"}, 100);
        lambda$showWithSheetView$1();
    }

    private void test() {
        if (this.mArguments.isAnonymous()) {
            qb.c.i(TAG, "isAnonymous", new Object[0]);
            return;
        }
        TelephonyManager telephonyManager = (TelephonyManager) getActivity().getSystemService("phone");
        qb.c.i("GAO", "getSimOperator %s", telephonyManager.getSimOperator());
        qb.c.i("GAO", "getSimOperatorName %s", telephonyManager.getSimOperatorName());
        qb.c.i("GAO", "getNetworkOperator %s", telephonyManager.getNetworkOperator());
        qb.c.i("GAO", "getNetworkOperatorName %s", telephonyManager.getNetworkOperatorName());
        qb.c.i("GAO", "last %d,%d", Integer.valueOf(getActivity().getResources().getConfiguration().mcc), Integer.valueOf(getActivity().getResources().getConfiguration().mnc));
        qb.c.i("GAO", TimeModel.f32588i, Integer.valueOf(rb.d.b(getContext())));
        qb.c.i("GAO", "%s", rb.d.e(getContext()));
        qb.c.i("GAO", "%s", rb.d.c(getContext()));
    }

    private String toIosPaySupport() {
        String str = this.mHeader.get(PayManager.PAY_SUPPORT_KEY);
        if (TextUtils.isEmpty(str)) {
            return "error";
        }
        StringBuilder sb2 = new StringBuilder(str);
        if (sb2.charAt(sb2.length() - 1) == ';') {
            sb2.deleteCharAt(sb2.length() - 1);
        }
        return sb2.toString().replace(com.alipay.sdk.m.u.i.f11097b, ":");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void updateCloseVisibility() {
        this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.e
            @Override // java.lang.Runnable
            public final void run() {
                BczWebFragment.this.lambda$updateCloseVisibility$10();
            }
        });
    }

    private void uploadImage(Uri source) {
        if (this.mUploadImageMeta == null) {
            return;
        }
        qb0.h hVar = this.mImageUploadSubscription;
        if (hVar != null && !hVar.isUnsubscribed()) {
            va.g.g(R.string.toast_web_pic_upload_restriction, 0);
            return;
        }
        File file = new File(getActivity().getCacheDir(), "webview_upload_image");
        if (file.exists()) {
            file.delete();
        }
        this.mImageUploadSubscription = PhotoPuller.compress(getActivity(), PhotoPuller.Compress.of(source, Uri.fromFile(file)).withMaxSaveSize(this.mUploadImageMeta.maxSaveSize)).b2(new wb0.p<Uri, rx.c<InputStream>>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.4
            @Override // wb0.p
            public rx.c<InputStream> call(Uri uri) {
                try {
                    return rx.c.M2(BczWebFragment.this.getActivity().getContentResolver().openInputStream(uri));
                } catch (FileNotFoundException e11) {
                    return rx.c.T1(e11);
                }
            }
        }).b2(new wb0.p<InputStream, rx.c<String>>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.3
            @Override // wb0.p
            public rx.c<String> call(InputStream inputStream) {
                return RxUploader.upload(BczWebFragment.this.mUploadImageMeta.url, new RxUploader.CommonStringRequestFactory(1, new WVImageRequestBody(inputStream, BczWebFragment.this.mUploadImageMeta)));
            }
        }).I3(tb0.a.a()).r5(new qb0.g<String>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.2
            @Override // qb0.c
            public void onError(Throwable e11) {
                JsonParams.ImageUploadStateO imageUploadStateO = new JsonParams.ImageUploadStateO();
                imageUploadStateO.state = -1;
                imageUploadStateO.msg = e11.getMessage();
                BczWebFragment.this.postImageUploadState(imageUploadStateO);
                qb.c.c(BczWebFragment.TAG, "", e11);
            }

            @Override // qb0.g
            public void onStart() {
                JsonParams.ImageUploadStateO imageUploadStateO = new JsonParams.ImageUploadStateO();
                imageUploadStateO.state = 0;
                imageUploadStateO.msg = "开始上传";
                BczWebFragment.this.postImageUploadState(imageUploadStateO);
            }

            @Override // qb0.c
            public void onNext(String s11) {
                JsonParams.ImageUploadStateO imageUploadStateO = new JsonParams.ImageUploadStateO();
                imageUploadStateO.state = 1;
                imageUploadStateO.msg = s11;
                BczWebFragment.this.postImageUploadState(imageUploadStateO);
            }

            @Override // qb0.c
            public void onCompleted() {
            }
        });
    }

    public androidx.core.util.Pair<String, String> appendUserAgentPair() {
        return null;
    }

    public void back() {
        BottomSheetLayout bottomSheetLayout = getBottomSheetLayout();
        if (bottomSheetLayout != null && bottomSheetLayout.C()) {
            bottomSheetLayout.u();
            return;
        }
        FrameLayout videoContainer = this.mListener.getVideoContainer();
        if (this.mVideoCallback != null && videoContainer != null && videoContainer.getVisibility() == 0) {
            this.mVideoCallback.onCustomViewHidden();
            return;
        }
        SystemJSI systemJSI = this.mSystemJSI;
        if (systemJSI.interceptBack) {
            systemJSI.systemBack();
        } else if (systemJSI.isInterceptNavBack) {
            this.mWebView.loadUrl("javascript:window.bcz_system.onInterceptNavBack()");
        } else {
            goBack();
        }
    }

    public void close() {
        SystemJSI systemJSI = this.mSystemJSI;
        if (systemJSI.interceptClose) {
            systemJSI.close();
        } else if (systemJSI.isInterceptNavClose) {
            this.mWebView.loadUrl("javascript:window.bcz_system.onInterceptNavClose()");
        } else if (getActivity() != null) {
            getActivity().finish();
        }
    }

    public BottomSheetLayout getBottomSheetLayout() {
        OnFragmentInteractionListener onFragmentInteractionListener = this.mListener;
        if (onFragmentInteractionListener != null) {
            return onFragmentInteractionListener.getBottomSheetLayout();
        }
        return null;
    }

    public void getShareableChannels() {
        if (getContext() == null) {
            qb.c.d(TAG, "context is null", new Object[0]);
            return;
        }
        ArrayList arrayList = new ArrayList(ShareChannel.values().length);
        if (c9.a.f(getContext())) {
            arrayList.add(ShareChannel.WEIXIN.toString());
            arrayList.add(ShareChannel.WEIXIN_CIRCLE.toString());
        }
        if (c9.a.c(getContext())) {
            arrayList.add(ShareChannel.QQ.toString());
            arrayList.add(ShareChannel.QZONE.toString());
        }
        if (c9.a.e(getContext())) {
            arrayList.add(ShareChannel.WEIBO.toString());
        }
        String str = "try { window.bcz_system.onGetShareableChannels('" + JsonParams.repeatEscape(BczJson.writeToJson(arrayList, new bp.a<List<String>>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.14
        }.getType())) + "') } catch(e) {}";
        this.mWebView.loadUrl("javascript:" + str, this.mHeader);
    }

    @LayoutRes
    public int getTitleBarResource() {
        return 0;
    }

    public boolean loadFromCache() {
        return this.mArguments.isNeedCache();
    }

    public boolean needCache() {
        return this.mArguments.isNeedCache();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        qb.c.b(TAG, "onActivityCreated [%d] -> [%s]", Integer.valueOf(hashCode()), getActivity() != null ? Integer.valueOf(getActivity().hashCode()) : "null");
        initOption(this.mArguments.getWebOption());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        FragmentActivity activity;
        FragmentActivity activity2;
        super.onActivityResult(requestCode, resultCode, data);
        qb.c.b(HwPayManager.TAG, "web fragment onActivityResult:" + requestCode + "," + resultCode, new Object[0]);
        if (requestCode == 6666) {
            HwPayManager.INSTANCE.onActivityResult(requireActivity(), requestCode, resultCode, data);
            return;
        }
        if (this.mShareManager != null && (activity2 = getActivity()) != null) {
            this.mShareManager.resolveActivityResult(activity2, requestCode, resultCode, data);
        }
        if (resultCode != -1) {
            lambda$showWithSheetView$1();
            return;
        }
        if (requestCode == 9162) {
            ValueCallback<Uri[]> valueCallback = this.mFilePathCallback;
            if (valueCallback == null) {
                uploadImage(data.getData());
                return;
            } else {
                valueCallback.onReceiveValue(data != null ? new Uri[]{data.getData()} : null);
                this.mFilePathCallback = null;
                return;
            }
        }
        if (requestCode != 11615 || TextUtils.isEmpty(this.mTakePhotoPath)) {
            if (requestCode != 1001 || data == null || !data.getBooleanExtra(NavigatorMgr.DATA_EXIT, false) || (activity = getActivity()) == null || activity.isFinishing()) {
                return;
            }
            activity.finish();
            return;
        }
        Uri fromFile = Uri.fromFile(new File(this.mTakePhotoPath));
        ValueCallback<Uri[]> valueCallback2 = this.mFilePathCallback;
        if (valueCallback2 == null) {
            uploadImage(fromFile);
        } else {
            valueCallback2.onReceiveValue(new Uri[]{fromFile});
            this.mFilePathCallback = null;
        }
    }

    @Override // com.baicizhan.client.business.webview.PayManager.IPayListener
    public void onAliPayResponse(String result) {
        this.mWebView.loadUrl("javascript:bcz_alipay.onPayResult('" + result + "')", this.mHeader);
        qb.c.i(TAG, "onAliPayResponse %s", result);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.baicizhan.client.business.webview.ui.Hilt_BczWebFragment, androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            this.mListener = (OnFragmentInteractionListener) activity;
            qb.c.b(TAG, "onAttached [%d] -> [%s]", Integer.valueOf(hashCode()), getActivity() != null ? Integer.valueOf(getActivity().hashCode()) : "null");
        } catch (ClassCastException unused) {
            qb.c.d(TAG, "BczWebFragment's activity does not implement OnFragmentInteractionListener... activity: " + activity, new Object[0]);
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v11) {
        int id2 = v11.getId();
        if (id2 == R.id.pick) {
            pickImage();
            return;
        }
        if (id2 == R.id.take) {
            takeImage();
        } else if (id2 == R.id.cancel) {
            lambda$showWithSheetView$1();
            dismissBottomSheet();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration config) {
        super.onConfigurationChanged(config);
        int i11 = config.orientation;
        if (i11 == 1) {
            getActivity().getWindow().clearFlags(1024);
            getActivity().getWindow().addFlags(2048);
        } else {
            if (i11 != 2) {
                return;
            }
            getActivity().getWindow().clearFlags(2048);
            getActivity().getWindow().addFlags(1024);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        qb.c.b(TAG, "onCreated [%d] -> [%s]", Integer.valueOf(hashCode()), getActivity() != null ? Integer.valueOf(getActivity().hashCode()) : "null");
        Arguments arguments = new Arguments();
        this.mArguments = arguments;
        if (savedInstanceState != null) {
            arguments.serialize(savedInstanceState);
        } else {
            arguments.serialize(getArguments());
        }
        com.baicizhan.client.framework.audio.a aVar = new com.baicizhan.client.framework.audio.a(getContext());
        this.mAudioPlayer = aVar;
        aVar.f(this);
        this.mAudioPlayer.j(this);
        PayManager.getInstance().init(this);
        HwPayManager.INSTANCE.setOnPayListener(this);
        HwAggrPayManager.INSTANCE.setOnPayListener(this);
        test();
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        qb.c.b(TAG, "onCreateView [%d] -> [%s]", Integer.valueOf(hashCode()), getActivity() != null ? Integer.valueOf(getActivity().hashCode()) : "null");
        return initView(inflater.inflate(R.layout.fragment_bcz_web, container, false));
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        qb.c.b(TAG, "onDestroy [%d] -> [%s]", Integer.valueOf(hashCode()), getActivity() != null ? Integer.valueOf(getActivity().hashCode()) : "null");
        PayManager.getInstance().destroy();
        SharePickerSheetView.j();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        qb.c.b(TAG, "onDestroyView [%d] -> [%s]", Integer.valueOf(hashCode()), getActivity() != null ? Integer.valueOf(getActivity().hashCode()) : "null");
        qb0.h hVar = this.mLoadSubscription;
        if (hVar != null && !hVar.isUnsubscribed()) {
            this.mLoadSubscription.unsubscribe();
        }
        qb0.h hVar2 = this.mPreloadSub;
        if (hVar2 != null && !hVar2.isUnsubscribed()) {
            this.mPreloadSub.unsubscribe();
        }
        ec0.b bVar = this.mSubscriptions;
        if (bVar != null && !bVar.isUnsubscribed()) {
            this.mSubscriptions.unsubscribe();
        }
        qb0.h hVar3 = this.mImageUploadSubscription;
        if (hVar3 != null && !hVar3.isUnsubscribed()) {
            this.mImageUploadSubscription.unsubscribe();
        }
        this.mProgressView.a();
        this.mContentView.removeView(this.mWebView);
        this.mWebView.destroy();
        dismissBottomSheet();
        this.mAudioPlayer.destroy();
        AudioRecordMgr audioRecordMgr = this.mAudioRecordMgr;
        if (audioRecordMgr != null) {
            audioRecordMgr.release();
        }
        HwPayManager.INSTANCE.destroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden) {
            this.mWebView.onPause();
        } else {
            this.mWebView.onResume();
        }
    }

    @Override // com.baicizhan.client.business.webview.PayManager.IPayListener
    public void onHuaweiPayResponse(final HwPayResponse response) {
        this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.f
            @Override // java.lang.Runnable
            public final void run() {
                BczWebFragment.this.lambda$onHuaweiPayResponse$11(response);
            }
        });
    }

    @Override // com.baicizhan.client.business.webview.PayManager.IPayListener
    public void onHwAggrResponse(PayResult result) {
        if (result == null) {
            va.g.i("支付失败", 0);
            return;
        }
        String str = "{\"errCode\": " + result.getReturnCode() + ", \"msg\": \"\"}";
        this.mWebView.loadUrl("javascript:bcz_aggrpay.onPayResult('" + str + "')", this.mHeader);
        qb.c.i(TAG, "onHwAggrResponse %s", str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onJsAlert(WebView view, String url, String message, final JsResult result) {
        final SysUiRestorer sysUiRestorer = new SysUiRestorer(this);
        mc.a.l(this, ((kc.u) new u.a(view.getContext()).M("百词斩").V(message).b0(ButtonType.SINGLE_POSITIVE).d()).f0(new kc.r() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.5
            @Override // kc.r, kc.q
            public void onDialogPositiveClick(@NonNull View v11) {
                result.confirm();
            }
        }).B(new DialogInterface.OnDismissListener() { // from class: com.baicizhan.client.business.webview.ui.k
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                BczWebFragment.SysUiRestorer.this.run();
            }
        }), "js_alert");
        result.confirm();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean onJsConfirm(WebView view, String url, String message, final JsResult result) {
        final SysUiRestorer sysUiRestorer = new SysUiRestorer(this);
        mc.a.l(this, ((kc.u) new u.a(view.getContext()).M("百词斩").V(message).d()).f0(new kc.r() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.6
            @Override // kc.r, kc.q
            public void onDialogNegativeClick(@NonNull View view2) {
                result.cancel();
            }

            @Override // kc.r, kc.q
            public void onDialogPositiveClick(@NonNull View v11) {
                result.confirm();
            }
        }).B(new DialogInterface.OnDismissListener() { // from class: com.baicizhan.client.business.webview.ui.g
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                BczWebFragment.SysUiRestorer.this.run();
            }
        }), "js_confirm");
        return true;
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode != 4) {
            return true;
        }
        if (!this.mSystemJSI.canSwipeBack) {
            return false;
        }
        back();
        return false;
    }

    public void onPageFinished(WebView view, String url) {
        qb.c.i(TAG, "%s", url);
        cancelTimeOut();
        this.mProgressView.b();
        if (this.mCurError || this.mListener == null || !isTitleLegal(view.getTitle())) {
            return;
        }
        this.mListener.onSetTitle(view.getTitle());
    }

    public void onPageStarted(WebView view, String url, Bitmap favicon) {
        qb.c.i(TAG, "%s", url);
        this.mLastUrl = url;
        startTimeOut();
        if (this.showProgress.booleanValue()) {
            this.mProgressView.d();
        } else {
            this.mProgressView.setVisibility(8);
        }
        if (this.mCurError || this.mListener == null || !isTitleLegal(view.getTitle())) {
            return;
        }
        this.mListener.onSetTitle(view.getTitle());
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.mForeground = false;
        this.mWebView.onPause();
        cancelScreenTimeout();
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer.a
    public void onPlayError(int what, int extra) {
        qb.c.d(TAG, "play word audio error when test listen vocab, what [%d], extra [%d]", Integer.valueOf(what), Integer.valueOf(extra));
        this.mWebView.loadUrl("javascript:audio_callback(0, 'error[" + what + org.junit.jupiter.api.j2.O + extra + "]')");
        AudioPlayerJSI audioPlayerJSI = this.mAudioPlayerJSI;
        if (audioPlayerJSI.enable) {
            audioPlayerJSI.invokeOnError(2, "error[" + what + org.junit.jupiter.api.j2.O + extra + "]");
        }
    }

    @Override // com.baicizhan.client.framework.audio.IAudioPlayer.b
    public void onPlayStateChanged(IAudioPlayer.State state) {
        AudioPlayerJSI audioPlayerJSI = this.mAudioPlayerJSI;
        if (audioPlayerJSI.enable) {
            audioPlayerJSI.onStatus(state);
            return;
        }
        if (IAudioPlayer.State.Playing != state) {
            if (IAudioPlayer.State.Completed == state) {
                this.mWebView.loadUrl("javascript:audio_callback(1, 'completed')");
            }
        } else {
            if (this.mForeground) {
                return;
            }
            this.mAudioPlayer.pause();
            this.mWebView.loadUrl("javascript:pause()");
        }
    }

    @Override // com.baicizhan.client.business.webview.PayManager.IPayListener
    public void onQQPayResponse(BaseResponse response) {
        if (response == null) {
            va.g.i("支付失败", 0);
            return;
        }
        String str = "{\"errCode\": " + response.retCode + ", \"msg\": \"\"}";
        this.mWebView.loadUrl("javascript:bcz_qqpay.onPayResult('" + str + "')", this.mHeader);
        qb.c.i(TAG, "onQQPayResponse %s", response.toString());
    }

    public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
        qb.c.i(TAG, "%d, %s, %s", Integer.valueOf(errorCode), description, failingUrl);
        cancelTimeOut();
        this.mProgressView.b();
        setErrorPage(true);
        if (rb.d.f(getContext())) {
            HashMap hashMap = new HashMap();
            hashMap.put(ma.b.f72948u, Integer.valueOf(errorCode));
            hashMap.put(ma.b.f72951v, description);
            ma.l.e("h5-error", "h5-error", hashMap);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        sa.h hVar = this.permissionBanner;
        if (hVar != null) {
            hVar.f();
        }
        AudioRecordMgr audioRecordMgr = this.mAudioRecordMgr;
        if (audioRecordMgr != null) {
            audioRecordMgr.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
        WebShareManager webShareManager = this.mShareManager;
        if (webShareManager != null) {
            webShareManager.onRequestPermissionsResult(requestCode, permissions, grantResults);
        }
        if (requestCode == 111 && this.mPermissionCall != null) {
            StringBuilder sb2 = new StringBuilder();
            for (int i11 = 0; i11 < permissions.length; i11++) {
                String str = permissions[i11];
                if (grantResults[i11] != 0) {
                    if (sb2.length() > 0) {
                        sb2.append(",");
                    }
                    sb2.append(str);
                }
            }
            this.mHasPermission = sb2.length() == 0;
            this.mPermissionCall.run();
            this.mPermissionCall = null;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.mForeground = true;
        if (!this.mAudioPlayerJSI.enable) {
            this.mAudioPlayer.pause();
        }
        qb.c.i(TAG, "onresume %s", this.mWebView.getUrl());
        if (TextUtils.isEmpty(this.mWebView.getUrl())) {
            startLoad();
        }
        this.mWebView.onResume();
        if (getActivity() instanceof LandScapeBczWebActivity) {
            return;
        }
        int i11 = getResources().getConfiguration().orientation;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        this.mArguments.deserialize(outState);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mProgressView.setProgress(0);
    }

    @Override // com.baicizhan.client.business.webview.PayManager.IPayListener
    public void onWeixinPayResponse(BaseResp resp) {
        String str = "{\"errCode\": " + resp.errCode + ", \"msg\": \"\"}";
        this.mWebView.loadUrl("javascript:bcz_weixinpay.onPayResult('" + str + "')", this.mHeader);
        qb.c.i(TAG, "onWeixinPayResponse %s", resp.toString());
    }

    public void requestClientPermission(String[] keys, final Runnable True, final Runnable False) {
        boolean z11 = true;
        for (String str : keys) {
            if (requireActivity().checkSelfPermission(str) != 0) {
                z11 = false;
            }
        }
        if (z11) {
            True.run();
        } else {
            this.mPermissionCall = new Runnable() { // from class: com.baicizhan.client.business.webview.ui.l
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.this.lambda$requestClientPermission$9(True, False);
                }
            };
            ActivityCompat.requestPermissions(requireActivity(), keys, 111);
        }
    }

    public void scrollToTop() {
        BczWebView bczWebView = this.mWebView;
        if (bczWebView != null) {
            bczWebView.scrollTo(0, 0);
        }
    }

    public void share() {
        this.mWebView.loadUrl("javascript:try { window.bcz_system.onShareClick() } catch(e) { window.bcz_system.shareDefault() }", this.mHeader);
    }

    public void shareDefault() {
        ShareParams shareParams = new ShareParams();
        shareParams.f16057a = this.mWebView.getUrl();
        shareParams.f16058b = "";
        if (isTitleLegal(this.mWebView.getTitle())) {
            shareParams.f16058b = this.mWebView.getTitle();
        }
        dismissBottomSheet();
        if (this.mShareCallback == null) {
            this.mShareCallback = new ShareCallback(this);
        }
        WebShareManager webShareManager = this.mShareManager;
        if (webShareManager != null) {
            webShareManager.showShareSheet(shareParams, this.mShareCallback, getActivity(), getBottomSheetLayout());
        }
    }

    public boolean shouldOverrideUrlLoading(WebView view, String url) {
        Uri parse = Uri.parse(url);
        String scheme = parse.getScheme();
        if (url.startsWith("taobao://")) {
            if (StoreEntryJumper.jumpToTaoBao(getContext(), url)) {
                return true;
            }
            this.mWebView.loadUrl(url.replace(s9.b.f88139c, "https"), this.mHeader);
            return false;
        }
        if (TextUtils.equals(scheme, "http") || TextUtils.equals(scheme, "https") || TextUtils.equals(scheme, "tel")) {
            if (url.startsWith("tel:")) {
                try {
                    startActivity(new Intent("android.intent.action.DIAL", Uri.parse(url)));
                } catch (Exception e11) {
                    qb.c.c(TAG, "", e11);
                }
                view.reload();
                return true;
            }
            if (!WhiteListMgr.inst().inWhiteList(url)) {
                return true;
            }
            if (url.startsWith("http://mall.baicizhan.com") || url.startsWith("https://mall.baicizhan.com")) {
                view.loadUrl(url, this.mHeader);
            }
            return false;
        }
        try {
            try {
                qb.c.i(TAG, "open Action view %s", parse);
                getContext().startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, parse));
            } catch (ActivityNotFoundException unused) {
                qb.c.d(TAG, "No activity can handle this url: " + url, new Object[0]);
            }
        } catch (ActivityNotFoundException unused2) {
            getContext().startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https" + url.substring(scheme.length()))));
        }
        return true;
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    /* renamed from: com.baicizhan.client.business.webview.ui.BczWebFragment$9, reason: invalid class name */
    public class AnonymousClass9 extends WebViewClient {
        public AnonymousClass9() {
        }

        @Override // android.webkit.WebViewClient
        public void doUpdateVisitedHistory(WebView view, String url, boolean isReload) {
            super.doUpdateVisitedHistory(view, url, isReload);
            BczWebFragment.this.updateCloseVisibility();
        }

        @Override // android.webkit.WebViewClient
        public void onPageFinished(WebView view, String url) {
            super.onPageFinished(view, url);
            BczWebFragment.this.onPageFinished(view, url);
        }

        @Override // android.webkit.WebViewClient
        public void onPageStarted(WebView view, String url, Bitmap favicon) {
            super.onPageStarted(view, url, favicon);
            BczWebFragment.this.onPageStarted(view, url, favicon);
        }

        @Override // android.webkit.WebViewClient
        public void onReceivedError(WebView view, int errorCode, String description, String failingUrl) {
            super.onReceivedError(view, errorCode, description, failingUrl);
            BczWebFragment.this.onReceivedError(view, errorCode, description, failingUrl);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.webkit.WebViewClient
        public void onReceivedSslError(WebView view, final SslErrorHandler handler, SslError error) {
            final SysUiRestorer sysUiRestorer = new SysUiRestorer(BczWebFragment.this);
            mc.a.l(BczWebFragment.this, ((kc.u) ((u.a) ((u.a) new u.a(view.getContext()).M("百词斩").V("嘿呀！来到了一个更为安全的网络！不要害怕这里依然是百词斩( •̀ .̫ •́ )✧").F("仍然访问")).p("取消访问")).d()).f0(new kc.r() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.9.1
                @Override // kc.r, kc.q
                public void onDialogNegativeClick(@NonNull View view2) {
                    handler.cancel();
                }

                @Override // kc.r, kc.q
                public void onDialogPositiveClick(@NonNull View view2) {
                    handler.proceed();
                }
            }).B(new DialogInterface.OnDismissListener() { // from class: com.baicizhan.client.business.webview.ui.v
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    BczWebFragment.SysUiRestorer.this.run();
                }
            }), "ssl-error");
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, WebResourceRequest request) {
            String uri = request.getUrl().toString();
            if (WhiteListMgr.inst().inWhiteList(uri)) {
                return super.shouldInterceptRequest(view, request);
            }
            qb.c.b(BczWebFragment.TAG, "override url intercept replace: " + uri, new Object[0]);
            BczWebFragment.this.statHijackUrl(uri);
            return new WebResourceResponse("text/plain", "UTF-8", null);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, String url) {
            qb.c.i(BczWebFragment.TAG, "" + url, new Object[0]);
            return BczWebFragment.this.shouldOverrideUrlLoading(view, url);
        }

        @Override // android.webkit.WebViewClient
        public boolean shouldOverrideUrlLoading(WebView view, WebResourceRequest request) {
            qb.c.i(BczWebFragment.TAG, "" + request, new Object[0]);
            return super.shouldOverrideUrlLoading(view, request);
        }

        @Override // android.webkit.WebViewClient
        public WebResourceResponse shouldInterceptRequest(WebView view, String url) {
            if (WhiteListMgr.inst().inWhiteList(url)) {
                return null;
            }
            qb.c.b(BczWebFragment.TAG, "override url intercept replace: " + url, new Object[0]);
            BczWebFragment.this.statHijackUrl(url);
            return new WebResourceResponse("text/plain", "UTF-8", null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public interface OnFragmentInteractionListener {
        public static final int CLOSE_TYPE_CLOSE = 2;
        public static final int CLOSE_TYPE_HISTORY = 1;

        void addJavascriptInterfaces(WebView webView);

        BottomSheetLayout getBottomSheetLayout();

        FrameLayout getVideoContainer();

        void onActionBar(int bgColor, boolean iconBlack);

        void onSetCloseVisibility(int visibility, int type);

        void onSetShareVisibility(int visibility);

        void onSetTitle(String title);

        void onShareDefault();

        default void onConfigureOption(OpenWebViewOption option) {
        }

        default void onCustomizeStatusBar(@NonNull JsonParams.StatusBar param) {
        }

        default void onUpdateActionBar(NavigationBarOption option) {
        }

        default void onUpdateOrientation(OrientationOption option) {
        }

        default void onUpdateStatusBar(StatusBarOption option) {
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class SystemJSI extends CommonJSI {
        private static final int TEST_LISTEN = 2;
        private static final int TEST_READ = 1;
        public boolean canSwipeBack;
        public boolean interceptBack;
        public boolean interceptClose;
        public boolean isInterceptNavBack;
        public boolean isInterceptNavClose;
        private volatile qb0.h mBack;
        private volatile qb0.h mClose;
        private DialogFragment mDialog;
        private qb0.h mVoice;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.client.business.webview.ui.BczWebFragment$SystemJSI$16, reason: invalid class name */
        public class AnonymousClass16 implements Runnable {
            final /* synthetic */ DialogParam val$dialogParam;

            /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
            /* renamed from: com.baicizhan.client.business.webview.ui.BczWebFragment$SystemJSI$16$1, reason: invalid class name */
            public class AnonymousClass1 extends kc.r {
                public AnonymousClass1() {
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onDialogNegativeClick$0() {
                    BczWebFragment.this.mWebView.loadUrl("javascript:window.bcz_system.onDialogClick('negative')");
                }

                /* JADX INFO: Access modifiers changed from: private */
                public /* synthetic */ void lambda$onDialogPositiveClick$1() {
                    BczWebFragment.this.mWebView.loadUrl("javascript:window.bcz_system.onDialogClick('positive')");
                }

                @Override // kc.r, kc.q
                public void onDialogNegativeClick(@NonNull View view) {
                    BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.g2
                        @Override // java.lang.Runnable
                        public final void run() {
                            BczWebFragment.SystemJSI.AnonymousClass16.AnonymousClass1.this.lambda$onDialogNegativeClick$0();
                        }
                    });
                }

                @Override // kc.r, kc.q
                public void onDialogPositiveClick(@NonNull View view) {
                    BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.f2
                        @Override // java.lang.Runnable
                        public final void run() {
                            BczWebFragment.SystemJSI.AnonymousClass16.AnonymousClass1.this.lambda$onDialogPositiveClick$1();
                        }
                    });
                }
            }

            public AnonymousClass16(final DialogParam val$dialogParam) {
                this.val$dialogParam = val$dialogParam;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public void run() {
                SystemJSI.this.dismiss();
                final SysUiRestorer sysUiRestorer = new SysUiRestorer(BczWebFragment.this);
                ButtonType buttonType = ButtonType.DOUBLE;
                if (TextUtils.isEmpty(this.val$dialogParam.positive) && !TextUtils.isEmpty(this.val$dialogParam.negative)) {
                    buttonType = ButtonType.SINGLE_NEGATIVE;
                } else if (!TextUtils.isEmpty(this.val$dialogParam.positive) && TextUtils.isEmpty(this.val$dialogParam.negative)) {
                    buttonType = ButtonType.SINGLE_POSITIVE;
                } else if (TextUtils.isEmpty(this.val$dialogParam.positive) && TextUtils.isEmpty(this.val$dialogParam.negative)) {
                    buttonType = ButtonType.NONE;
                }
                kc.u uVar = (kc.u) ((u.a) ((u.a) ((u.a) new u.a(BczWebFragment.this.mWebView.getContext()).M(this.val$dialogParam.title).V(this.val$dialogParam.content).p(this.val$dialogParam.negative)).F(this.val$dialogParam.positive)).b0(buttonType).f(buttonType == ButtonType.NONE)).d();
                uVar.f0(new AnonymousClass1()).B(new DialogInterface.OnDismissListener() { // from class: com.baicizhan.client.business.webview.ui.e2
                    @Override // android.content.DialogInterface.OnDismissListener
                    public final void onDismiss(DialogInterface dialogInterface) {
                        BczWebFragment.SysUiRestorer.this.run();
                    }
                });
                SystemJSI.this.mDialog = uVar;
                mc.a.l(BczWebFragment.this, uVar, "show-dialog");
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public final class DialogParam implements NoProguard {
            public String content;
            public String negative;
            public String positive;
            public String title;

            private DialogParam() {
            }
        }

        public SystemJSI(Activity activity) {
            super(activity);
            this.interceptBack = false;
            this.interceptClose = false;
            this.canSwipeBack = true;
            this.isInterceptNavBack = false;
            this.isInterceptNavClose = false;
        }

        public static /* synthetic */ void B(Map map) {
            qb.c.i(BczWebFragment.TAG, "BottomSheet canceled", new Object[0]);
            ma.l.b(ma.t.f73010i, ma.a.f72723c3, map);
        }

        public static /* synthetic */ yz.g2 F(SysUiRestorer sysUiRestorer) {
            sysUiRestorer.run();
            return yz.g2.f100423a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void dismiss() {
            DialogFragment dialogFragment = this.mDialog;
            if (dialogFragment == null || !dialogFragment.isVisible()) {
                return;
            }
            this.mDialog.dismiss();
            this.mDialog = null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$back$2() {
            BczWebFragment.this.goBack();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$changeOrientation$22(OrientationOption orientationOption) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.mListener.onUpdateOrientation(orientationOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$checkAppUpgrade$31() {
            BczWebFragment.this.mWebView.loadUrl("javascript:window.bcz_system.onAppUpgrade(3)");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$checkAppUpgrade$32(UpgradeManager upgradeManager, AppBetaUpdateResult appBetaUpdateResult) {
            UpgradeManager.UpdateType typeOf = UpgradeManager.UpdateType.typeOf(appBetaUpdateResult.type);
            if (upgradeManager.o().booleanValue()) {
                BczWebFragment.this.mWebView.loadUrl("javascript:window.bcz_system.onAppUpgrade(3)");
            } else if (typeOf != UpgradeManager.UpdateType.NEW) {
                BczWebFragment.this.mWebView.loadUrl("javascript:window.bcz_system.onAppUpgrade(2)");
            } else {
                upgradeManager.r(appBetaUpdateResult);
                BczWebFragment.this.mWebView.loadUrl("javascript:window.bcz_system.onAppUpgrade(1)");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$checkAppUpgrade$33(Throwable th2) {
            BczWebFragment.this.mWebView.loadUrl("javascript:window.bcz_system.onAppUpgrade(2)");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$close$15(Long l11) {
            FragmentActivity activity = BczWebFragment.this.getActivity();
            if (activity != null) {
                qb.c.i(BczWebFragment.TAG, "time out finish", new Object[0]);
                activity.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$close$16() {
            if (this.mClose == null || this.mClose.isUnsubscribed()) {
                qb.c.i(BczWebFragment.TAG, "close, press", new Object[0]);
                this.mClose = rx.c.o6(100L, TimeUnit.MILLISECONDS).I3(tb0.a.a()).t5(new wb0.b() { // from class: com.baicizhan.client.business.webview.ui.w1
                    @Override // wb0.b
                    public final void call(Object obj) {
                        BczWebFragment.SystemJSI.this.lambda$close$15((Long) obj);
                    }
                });
                BczWebFragment.this.mWebView.loadUrl("javascript:window.bcz_system.navCloseCallback()");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$customizeStatusBar$0(JsonParams.StatusBar statusBar) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.mListener.onCustomizeStatusBar(statusBar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$getCanGoBack$27() {
            BczWebFragment.this.mWebView.loadUrl(String.format("javascript:window.bcz_system.onGetCanGoBack(%s)", new com.google.gson.d().z(new WebCanGoBack(BczWebFragment.this.mWebView.canGoBack()))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$getPrivacyInfo$26(PrivacyInfoOption privacyInfoOption) {
            Context context = BczWebFragment.this.getContext();
            if (context == null) {
                qb.c.q(BczWebFragment.TAG, "getPrivacyInfo: context is null", new Object[0]);
            } else {
                BczWebFragment.this.mWebView.loadUrl(String.format("javascript:window.bcz_system.onGetPrivacyInfo(%s)", PermissionStatusUtilKt.getPermissionInfo(context, privacyInfoOption.getFeatures())));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$launchApp$14(String str) {
            try {
                JsonParams.NativeAppIntentParam fromJson = JsonParams.NativeAppIntentParam.fromJson(str);
                Intent intent = new Intent();
                intent.setData(Uri.parse(fromJson.launchUrl));
                if (BczWebFragment.this.requireContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                    intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
                    intent.addFlags(268435456);
                    BczWebFragment.this.startActivity(intent);
                } else {
                    if (TextUtils.isEmpty(fromJson.packageName)) {
                        throw new RuntimeException("Unexpected: " + str);
                    }
                    final HashMap<String, String> b11 = ma.u.b(new String[]{"app_name", "app_url"}, new String[]{fromJson.packageName, fromJson.launchUrl});
                    BottomSheetLayout bottomSheetLayout = BczWebFragment.this.getBottomSheetLayout();
                    bottomSheetLayout.p(new ql.c() { // from class: com.baicizhan.client.business.webview.ui.w0
                        @Override // ql.c
                        public final void a() {
                            BczWebFragment.SystemJSI.B(b11);
                        }
                    });
                    BottomSheetUtils.showAppStoreBottomSheet(BczWebFragment.this.getActivity(), bottomSheetLayout, fromJson.packageName, "打开方式", new BottomSheetUtils.OnIntentPickedListener() { // from class: com.baicizhan.client.business.webview.ui.x0
                        @Override // com.baicizhan.client.business.util.BottomSheetUtils.OnIntentPickedListener
                        public final void onIntentPicked(String str2) {
                            ma.l.b(ma.t.f73010i, ma.a.f72716b3, b11);
                        }
                    });
                    ma.l.b(ma.t.f73010i, ma.a.f72709a3, b11);
                }
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "launch native app failed", e11);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$launchMiniProgram$11(kc.u uVar) {
            mc.a.l(BczWebFragment.this, uVar, "show-dialog");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ yz.g2 lambda$launchMiniProgram$8(JsonParams.WeChatMiniProgramParam weChatMiniProgramParam) {
            WeixinAuthHelper.A().D(BczWebFragment.this.requireContext(), weChatMiniProgramParam.programId, weChatMiniProgramParam.programPath, weChatMiniProgramParam.programType);
            return yz.g2.f100423a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$navigatorTo$19(Contract.NavToParam navToParam) {
            FragmentActivity activity = BczWebFragment.this.getActivity();
            if (activity == null) {
                qb.c.d(BczWebFragment.TAG, "null activity", new Object[0]);
            } else if (NavigatorMgr.INSTANCE.navigatorTo(navToParam.url.trim(), activity, 1001) && navToParam.isReplace) {
                activity.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$openAppSettings$28() {
            SystemSettingHelperKt.goAppSetting(BczWebFragment.this.requireContext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$openInWebView$24(OpenWebViewOption openWebViewOption) {
            new BczWebDirector.Builder().setDefaultUrl(openWebViewOption.getUrl()).setWebOption(openWebViewOption).build().goToWeb(BczWebFragment.this.getContext());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ yz.g2 lambda$openWeChat$4() {
            ComponentName componentName = new ComponentName("com.tencent.mm", "com.tencent.mm.ui.LauncherUI");
            Intent intent = new Intent();
            intent.setComponent(componentName);
            intent.setFlags(268435456);
            if (BczWebFragment.this.requireContext().getPackageManager().resolveActivity(intent, 65536) != null) {
                BczWebFragment.this.startActivity(intent);
            }
            return yz.g2.f100423a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$openWeChat$7(kc.u uVar) {
            mc.a.l(BczWebFragment.this, uVar, "show-dialog");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$saveToAlbum$25(String str) {
            Context context = BczWebFragment.this.getContext();
            if (context == null) {
                qb.c.q(BczWebFragment.TAG, "saveToAlbum: context is null", new Object[0]);
            } else {
                WebImageHelperKt.saveImageToLocal(context, str);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setCloseButtonVisibility$1(Boolean bool) {
            if (BczWebFragment.this.mListener != null) {
                BczWebFragment.this.mListener.onSetCloseVisibility(bool.booleanValue() ? 0 : 8, 2);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setNavigationBar$21(NavigationBarOption navigationBarOption) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.mListener.onUpdateActionBar(navigationBarOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setStatusBar$20(StatusBarOption statusBarOption) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.mListener.onUpdateStatusBar(statusBarOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$setTouchCallout$23(TouchCalloutOption touchCalloutOption) {
            BczWebFragment.this.setTouchCalloutEnabled(touchCalloutOption);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$shareEx$3(String str) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.mShareParam = JsonParams.ShareParamI.fromJson(str);
            if (BczWebFragment.this.mShareParam == null) {
                return;
            }
            if (TextUtils.isEmpty(BczWebFragment.this.mShareParam.channel)) {
                BczWebFragment.this.dismissBottomSheet();
            }
            if (BczWebFragment.this.mShareCallback == null) {
                BczWebFragment bczWebFragment = BczWebFragment.this;
                bczWebFragment.mShareCallback = new ShareCallback(bczWebFragment);
            }
            BczWebFragment.this.mShareManager = new WebShareManager();
            BczWebFragment.this.getLifecycle().addObserver(BczWebFragment.this.mShareManager);
            BczWebFragment.this.mShareManager.share(BczWebFragment.this.mShareParam, BczWebFragment.this.getActivity(), BczWebFragment.this.getBottomSheetLayout(), BczWebFragment.this.mShareCallback);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$systemBack$17(Long l11) {
            qb.c.i(BczWebFragment.TAG, "time out back", new Object[0]);
            BczWebFragment.this.goBack();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void lambda$systemBack$18() {
            if (this.mBack == null || this.mBack.isUnsubscribed()) {
                qb.c.i(BczWebFragment.TAG, "back, press", new Object[0]);
                this.mBack = rx.c.o6(100L, TimeUnit.MILLISECONDS).I3(tb0.a.a()).t5(new wb0.b() { // from class: com.baicizhan.client.business.webview.ui.z0
                    @Override // wb0.b
                    public final void call(Object obj) {
                        BczWebFragment.SystemJSI.this.lambda$systemBack$17((Long) obj);
                    }
                });
                BczWebFragment.this.mWebView.loadUrl("javascript:window.bcz_system.navBackCallback()");
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ yz.g2 lambda$turnOnNotifPush$29(View view) {
            SystemSettingHelperKt.tryGoNotificationSetting(BczWebFragment.this.requireContext());
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v9, types: [kc.d, kc.h] */
        public /* synthetic */ void lambda$turnOnNotifPush$30(TurnOnNotifPushOption turnOnNotifPushOption) {
            if (!"popup".equals(turnOnNotifPushOption.getMode())) {
                SystemSettingHelperKt.tryGoNotificationSetting(BczWebFragment.this.requireContext());
            } else {
                BczWebFragment bczWebFragment = BczWebFragment.this;
                mc.a.l(bczWebFragment, ((u.a) ((u.a) new u.a(bczWebFragment.requireContext()).M("开启推送通知").V("开启通知后，可及时查看重要的消息提醒").H("去开启", Action.RECOMMENDED, new x00.l() { // from class: com.baicizhan.client.business.webview.ui.b1
                    @Override // x00.l
                    public final Object invoke(Object obj) {
                        yz.g2 lambda$turnOnNotifPush$29;
                        lambda$turnOnNotifPush$29 = BczWebFragment.SystemJSI.this.lambda$turnOnNotifPush$29((View) obj);
                        return lambda$turnOnNotifPush$29;
                    }
                })).p("暂时不用")).d(), "notification");
            }
        }

        public static /* synthetic */ yz.g2 x(SysUiRestorer sysUiRestorer) {
            sysUiRestorer.run();
            return yz.g2.f100423a;
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void authWeixinSubscribeMsg(final String input) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.14
                @Override // java.lang.Runnable
                public void run() {
                    JsonParams.WXSubscribeI fromJson;
                    if (BczWebFragment.this.getActivity() == null || (fromJson = JsonParams.WXSubscribeI.fromJson(input)) == null) {
                        return;
                    }
                    if (BczWebFragment.this.mWXSubscribeCallback == null) {
                        BczWebFragment bczWebFragment = BczWebFragment.this;
                        bczWebFragment.mWXSubscribeCallback = new WXAuthSubscribeCallback(bczWebFragment);
                    }
                    c9.a.n(BczWebFragment.this.getActivity(), fromJson.scene, fromJson.reserved, BczWebFragment.this.mWXSubscribeCallback);
                }
            });
        }

        @JavascriptInterface
        public void back() {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.r1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$back$2();
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void broadcastIntent(final String encryptMeta) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.12
                @Override // java.lang.Runnable
                public void run() {
                    if (BczWebFragment.this.getActivity() == null) {
                        return;
                    }
                    JsonParams.IntentMetaI fromJson = JsonParams.IntentMetaI.fromJson(new String(SignManager.getInstance().decryptByWebviewRSAPublicKey(encryptMeta)));
                    BottomSheetLayout bottomSheetLayout = BczWebFragment.this.getBottomSheetLayout();
                    if (fromJson == null || bottomSheetLayout == null) {
                        return;
                    }
                    BottomSheetUtils.showAppStoreBottomSheet(BczWebFragment.this.getActivity(), BczWebFragment.this.getBottomSheetLayout(), fromJson.pkgName, "打开方式", null);
                }
            });
        }

        @JavascriptInterface
        public void changeOrientation(String json) {
            final OrientationOption orientationOption = (OrientationOption) new com.google.gson.d().n(json, OrientationOption.class);
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.d2
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$changeOrientation$22(orientationOption);
                }
            });
        }

        @JavascriptInterface
        public void changeTheme(String json) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            Map map = (Map) new com.google.gson.d().n(json, Map.class);
            try {
                final String str = (String) map.get(TtmlNode.ATTR_TTS_BACKGROUND_COLOR);
                final int intValue = ((Double) map.get("iconType")).intValue();
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.2
                    @Override // java.lang.Runnable
                    public void run() {
                        if (BczWebFragment.this.getActivity() == null) {
                            return;
                        }
                        try {
                            if (BczWebFragment.this.mListener != null) {
                                BczWebFragment.this.mListener.onActionBar(Color.parseColor("#" + str), intValue == 0);
                            }
                        } catch (Exception e11) {
                            qb.c.c(BczWebFragment.TAG, "", e11);
                        }
                    }
                });
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
        }

        @JavascriptInterface
        public void checkAppUpgrade() {
            final UpgradeManager m11 = UpgradeManager.m();
            if (m11.o().booleanValue()) {
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.h1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.SystemJSI.this.lambda$checkAppUpgrade$31();
                    }
                });
            } else {
                m11.h().u5(new wb0.b() { // from class: com.baicizhan.client.business.webview.ui.i1
                    @Override // wb0.b
                    public final void call(Object obj) {
                        BczWebFragment.SystemJSI.this.lambda$checkAppUpgrade$32(m11, (AppBetaUpdateResult) obj);
                    }
                }, new wb0.b() { // from class: com.baicizhan.client.business.webview.ui.j1
                    @Override // wb0.b
                    public final void call(Object obj) {
                        BczWebFragment.SystemJSI.this.lambda$checkAppUpgrade$33((Throwable) obj);
                    }
                });
            }
        }

        public void close() {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.t1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$close$16();
                }
            });
        }

        @JavascriptInterface
        public void confirmNavBack() {
            qb.c.i(BczWebFragment.TAG, "", new Object[0]);
            if (this.mBack == null || this.mBack.isUnsubscribed()) {
                return;
            }
            this.mBack.unsubscribe();
            this.mBack = null;
        }

        @JavascriptInterface
        public void confirmNavClose() {
            qb.c.i(BczWebFragment.TAG, "", new Object[0]);
            if (this.mClose == null || this.mClose.isUnsubscribed()) {
                return;
            }
            this.mClose.unsubscribe();
            this.mClose = null;
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void copyToClipboard(String content) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            super.copyToClipboard(content);
        }

        @JavascriptInterface
        public void customizeStatusBar(String json) {
            final JsonParams.StatusBar statusBar;
            if (BczWebFragment.this.getActivity() == null || (statusBar = (JsonParams.StatusBar) new com.google.gson.d().n(json, JsonParams.StatusBar.class)) == null) {
                return;
            }
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.e1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$customizeStatusBar$0(statusBar);
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void dismissDialog() {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.17
                @Override // java.lang.Runnable
                public void run() {
                    SystemJSI.this.dismiss();
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void enterHeroActivity(final String intent) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.8
                @Override // java.lang.Runnable
                public void run() {
                    if (BczWebFragment.this.getActivity() == null) {
                        return;
                    }
                    Intent intent2 = new Intent();
                    intent2.setClassName(fs.b.f52352b, "com.baicizhan.gameshow.GameShowActivity");
                    BczWebFragment.this.getActivity().startActivity(intent2);
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void exit() {
            final FragmentActivity activity = BczWebFragment.this.getActivity();
            if (activity == null) {
                return;
            }
            activity.runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.y0
                @Override // java.lang.Runnable
                public final void run() {
                    activity.finish();
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void feedback() {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            super.feedback();
        }

        @JavascriptInterface
        public void getCanGoBack(String json) {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.a1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$getCanGoBack$27();
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void getNetworkType() {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.10
                @Override // java.lang.Runnable
                public void run() {
                    if (BczWebFragment.this.getActivity() == null) {
                        return;
                    }
                    BczWebFragment.this.onGetNetworkType();
                }
            });
        }

        @JavascriptInterface
        public void getPrivacyInfo(String json) {
            final PrivacyInfoOption privacyInfoOption = (PrivacyInfoOption) new com.google.gson.d().n(json, PrivacyInfoOption.class);
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.s1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$getPrivacyInfo$26(privacyInfoOption);
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void getShareableChannels() {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.5
                @Override // java.lang.Runnable
                public void run() {
                    BczWebFragment.this.getShareableChannels();
                }
            });
        }

        @JavascriptInterface
        public double getStatusBarHeight() {
            if (BczWebFragment.this.getActivity() == null) {
                return 0.0d;
            }
            return zb.a.j(BczWebFragment.this.getActivity());
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public String getUploadInfo(String days) {
            int i11 = 3;
            JsonParams.UploadInfo uploadInfo = new JsonParams.UploadInfo();
            try {
                i11 = Integer.valueOf(days);
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
            uploadInfo.size = oa.a.g().h(i11).t6().p().length();
            uploadInfo.network = rb.d.b(pb.a.a());
            return JsonParams.UploadInfo.toJson(uploadInfo);
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void getWechatUserInfo() {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            WeixinAuthHelper.A().l(BczWebFragment.this.getActivity(), new a.InterfaceC0141a() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.15
                private static final String msFormatCall = "javascript:bcz_system.onGetWechatUserInfo('%s')";
                private static final String msFormatParam = "{\"unionid\":\"%s\", \"nickname\":\"%s\", \"avatar\":\"%s\"}";

                @Override // c9.a.InterfaceC0141a
                public void onCancel() {
                    BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), msFormatCall, ""), BczWebFragment.this.mHeader);
                }

                @Override // c9.a.InterfaceC0141a
                public void onComplete(ThirdPartyUserInfo thirdPartyUserInfo) {
                    String str = thirdPartyUserInfo.nickName;
                    if (str != null) {
                        thirdPartyUserInfo.nickName = str.replace("\"", "\\\"");
                    }
                    BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), msFormatCall, String.format(Locale.getDefault(), msFormatParam, thirdPartyUserInfo.unionid, thirdPartyUserInfo.nickName, thirdPartyUserInfo.imageUrl)), BczWebFragment.this.mHeader);
                }

                @Override // c9.a.InterfaceC0141a
                public void onError(Throwable throwable) {
                    BczWebFragment.this.mWebView.loadUrl(String.format(Locale.getDefault(), msFormatCall, ""), BczWebFragment.this.mHeader);
                }
            });
        }

        @JavascriptInterface
        public void interceptNavBack(String json) {
            this.isInterceptNavBack = ((InterceptNavBackOption) new com.google.gson.d().n(json, InterceptNavBackOption.class)).getEnabled();
        }

        @JavascriptInterface
        public void interceptNavClose(String json) {
            this.isInterceptNavClose = ((InterceptNavCloseOption) new com.google.gson.d().n(json, InterceptNavCloseOption.class)).getEnabled();
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void jumpMall(String url) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            super.jumpMall(url);
        }

        @JavascriptInterface
        public void launchApp(final String url) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            qb.c.i(BczWebFragment.TAG, "launch %s", url);
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.g1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$launchApp$14(url);
                }
            });
        }

        @JavascriptInterface
        public void launchMiniProgram(String json) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            try {
                final JsonParams.WeChatMiniProgramParam fromJson = JsonParams.WeChatMiniProgramParam.fromJson(json);
                if (fromJson != null) {
                    dismiss();
                    final SysUiRestorer sysUiRestorer = new SysUiRestorer(BczWebFragment.this);
                    final kc.u thirdAppDialog = ThirdAppDialogKt.thirdAppDialog(BczWebFragment.this.mWebView.getContext(), new x00.a() { // from class: com.baicizhan.client.business.webview.ui.z1
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 lambda$launchMiniProgram$8;
                            lambda$launchMiniProgram$8 = BczWebFragment.SystemJSI.this.lambda$launchMiniProgram$8(fromJson);
                            return lambda$launchMiniProgram$8;
                        }
                    }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.a2
                        @Override // x00.a
                        public final Object invoke() {
                            yz.g2 g2Var;
                            g2Var = yz.g2.f100423a;
                            return g2Var;
                        }
                    }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.b2
                        @Override // x00.a
                        public final Object invoke() {
                            return BczWebFragment.SystemJSI.x(BczWebFragment.SysUiRestorer.this);
                        }
                    });
                    this.mDialog = thirdAppDialog;
                    BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.c2
                        @Override // java.lang.Runnable
                        public final void run() {
                            BczWebFragment.SystemJSI.this.lambda$launchMiniProgram$11(thirdAppDialog);
                        }
                    });
                }
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "launch mini program failed", e11);
            }
        }

        @JavascriptInterface
        public void navigatorTo(String json) {
            qb.c.i(BczWebFragment.TAG, "%s", json);
            try {
                final Contract.NavToParam navToParam = (Contract.NavToParam) new com.google.gson.d().n(json, Contract.NavToParam.class);
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.k1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.SystemJSI.this.lambda$navigatorTo$19(navToParam);
                    }
                });
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
        }

        @JavascriptInterface
        public void openAppSettings(String json) {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.c1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$openAppSettings$28();
                }
            });
        }

        @JavascriptInterface
        public void openInWebView(String json) {
            final OpenWebViewOption openWebViewOption = (OpenWebViewOption) new com.google.gson.d().n(json, OpenWebViewOption.class);
            if (openWebViewOption == null || TextUtils.isEmpty(openWebViewOption.getUrl())) {
                return;
            }
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.u1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$openInWebView$24(openWebViewOption);
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void openNativeAction(final String intent) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            super.openNativeAction(intent);
        }

        @JavascriptInterface
        public void openWeChat() {
            try {
                dismiss();
                final SysUiRestorer sysUiRestorer = new SysUiRestorer(BczWebFragment.this);
                final kc.u thirdAppDialog = ThirdAppDialogKt.thirdAppDialog(BczWebFragment.this.mWebView.getContext(), new x00.a() { // from class: com.baicizhan.client.business.webview.ui.n1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 lambda$openWeChat$4;
                        lambda$openWeChat$4 = BczWebFragment.SystemJSI.this.lambda$openWeChat$4();
                        return lambda$openWeChat$4;
                    }
                }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.o1
                    @Override // x00.a
                    public final Object invoke() {
                        yz.g2 g2Var;
                        g2Var = yz.g2.f100423a;
                        return g2Var;
                    }
                }, new x00.a() { // from class: com.baicizhan.client.business.webview.ui.p1
                    @Override // x00.a
                    public final Object invoke() {
                        return BczWebFragment.SystemJSI.F(BczWebFragment.SysUiRestorer.this);
                    }
                });
                this.mDialog = thirdAppDialog;
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.q1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.SystemJSI.this.lambda$openWeChat$7(thirdAppDialog);
                    }
                });
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "open WeChat failed", e11);
            }
        }

        @JavascriptInterface
        public void play(final String url) {
            qb0.h hVar = this.mVoice;
            if (hVar != null && !hVar.isUnsubscribed()) {
                this.mVoice.unsubscribe();
            }
            this.mVoice = m9.d.d().e(url).I3(tb0.a.a()).r5(new qb0.g<File>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.4
                @Override // qb0.c
                public void onError(Throwable e11) {
                    qb.c.c(BczWebFragment.TAG, "", e11);
                }

                @Override // qb0.c
                public void onNext(File file) {
                    BczWebFragment.this.mAudioPlayer.e(file);
                }

                @Override // qb0.c
                public void onCompleted() {
                }
            });
        }

        @JavascriptInterface
        public void report(String json) {
            try {
                List<String> list = (List) BczJson.fromJson(json, new bp.a<List<String>>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.1
                }.getType());
                if (CollectionUtils.isEmpty(list)) {
                    qb.c.d(BczWebFragment.TAG, "empty report %s", json);
                } else {
                    ma.r.g().o(list);
                }
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "" + json, e11);
            }
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void retry() {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.9
                @Override // java.lang.Runnable
                public void run() {
                    if (BczWebFragment.this.getActivity() == null) {
                        return;
                    }
                    BczWebFragment.this.startLoad();
                }
            });
        }

        @JavascriptInterface
        public void saveToAlbum(String json) {
            final String imgData = ((SaveToAlbumOption) new com.google.gson.d().n(json, SaveToAlbumOption.class)).getImgData();
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.x1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$saveToAlbum$25(imgData);
                }
            });
        }

        @JavascriptInterface
        public void setCloseButtonVisibility(String json) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            try {
                final Boolean bool = (Boolean) ((Map) new com.google.gson.d().n(json, Map.class)).get("visibility");
                BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.l1
                    @Override // java.lang.Runnable
                    public final void run() {
                        BczWebFragment.SystemJSI.this.lambda$setCloseButtonVisibility$1(bool);
                    }
                });
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
        }

        @JavascriptInterface
        public void setCustomNavBack(String json) {
            qb.c.i(BczWebFragment.TAG, "%s", json);
            try {
                this.interceptBack = ((Contract.CustomNavParam) new com.google.gson.d().n(json, Contract.CustomNavParam.class)).enable;
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
        }

        @JavascriptInterface
        public void setCustomNavClose(String json) {
            qb.c.i(BczWebFragment.TAG, "%s", json);
            try {
                this.interceptClose = ((Contract.CustomNavParam) new com.google.gson.d().n(json, Contract.CustomNavParam.class)).enable;
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
        }

        @JavascriptInterface
        public void setNavigationBar(String json) {
            final NavigationBarOption navigationBarOption = (NavigationBarOption) new com.google.gson.d().n(json, NavigationBarOption.class);
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.y1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$setNavigationBar$21(navigationBarOption);
                }
            });
        }

        @JavascriptInterface
        public void setScreenOffTimeout(String json) {
            ScreenOffOption screenOffOption = (ScreenOffOption) new com.google.gson.d().n(json, ScreenOffOption.class);
            qb.c.i(BczWebFragment.TAG, "setScreenTimeout:" + screenOffOption.getDelay(), new Object[0]);
            BczWebFragment.this.setScreenFlag(screenOffOption.getDelay());
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void setShareState(final String state) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.6
                @Override // java.lang.Runnable
                public void run() {
                    JsonParams.ShareStateI fromJson;
                    if (BczWebFragment.this.getActivity() == null || (fromJson = JsonParams.ShareStateI.fromJson(state)) == null) {
                        return;
                    }
                    if (BczWebFragment.this.mListener != null) {
                        BczWebFragment.this.mListener.onSetShareVisibility(fromJson.visibility ? 0 : 8);
                    }
                    BczWebFragment.this.setShareVisibility(fromJson.visibility ? 0 : 8);
                }
            });
        }

        @JavascriptInterface
        public void setStatusBar(String json) {
            final StatusBarOption statusBarOption = (StatusBarOption) new com.google.gson.d().n(json, StatusBarOption.class);
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.f1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$setStatusBar$20(statusBarOption);
                }
            });
        }

        @JavascriptInterface
        public void setSwipeLeftBack(String json) {
            this.canSwipeBack = ((SwipeLeftBackOption) new com.google.gson.d().n(json, SwipeLeftBackOption.class)).getEnabled();
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void setTitle(final String titleJson) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.3
                @Override // java.lang.Runnable
                public void run() {
                    if (BczWebFragment.this.getActivity() == null) {
                        return;
                    }
                    JsonParams.TitleI fromJson = JsonParams.TitleI.fromJson(titleJson);
                    if (BczWebFragment.this.mCurError || BczWebFragment.this.mListener == null || fromJson == null) {
                        return;
                    }
                    BczWebFragment.this.mListener.onSetTitle(fromJson.title);
                }
            });
        }

        @JavascriptInterface
        public void setTouchCallout(String json) {
            final TouchCalloutOption touchCalloutOption = (TouchCalloutOption) new com.google.gson.d().n(json, TouchCalloutOption.class);
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.v0
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$setTouchCallout$23(touchCalloutOption);
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void shareDefault() {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.7
                @Override // java.lang.Runnable
                public void run() {
                    if (BczWebFragment.this.getActivity() == null) {
                        return;
                    }
                    if (BczWebFragment.this.mListener != null) {
                        BczWebFragment.this.mListener.onShareDefault();
                    } else {
                        BczWebFragment.this.shareDefault();
                    }
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void shareEx(final String param) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.d1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$shareEx$3(param);
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void showDialog(String param) {
            DialogParam dialogParam = (DialogParam) new com.google.gson.d().n(param, DialogParam.class);
            if (dialogParam == null) {
                return;
            }
            BczWebFragment.this.mWebView.post(new AnonymousClass16(dialogParam));
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void startLocating(String option) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getLocation();
        }

        public void systemBack() {
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.v1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$systemBack$18();
                }
            });
        }

        @JavascriptInterface
        public void turnOnNotifPush(String json) {
            final TurnOnNotifPushOption turnOnNotifPushOption = (TurnOnNotifPushOption) new com.google.gson.d().n(json, TurnOnNotifPushOption.class);
            if (turnOnNotifPushOption == null) {
                return;
            }
            BczWebFragment.this.mWebView.post(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.m1
                @Override // java.lang.Runnable
                public final void run() {
                    BczWebFragment.SystemJSI.this.lambda$turnOnNotifPush$30(turnOnNotifPushOption);
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void uploadImage(final String meta) {
            if (BczWebFragment.this.getActivity() == null) {
                return;
            }
            BczWebFragment.this.getActivity().runOnUiThread(new Runnable() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.11
                @Override // java.lang.Runnable
                public void run() {
                    if (BczWebFragment.this.getActivity() == null) {
                        return;
                    }
                    if (BczWebFragment.this.mFilePathCallback != null) {
                        qb.c.i(BczWebFragment.TAG, "can not use js api and js <input> at the same time", new Object[0]);
                        return;
                    }
                    BczWebFragment.this.mUploadImageMeta = JsonParams.UploadImageMetaI.fromJson(meta);
                    BczWebFragment bczWebFragment = BczWebFragment.this;
                    bczWebFragment.showWithSheetView(bczWebFragment.mBottomSelectImageView);
                }
            });
        }

        @Override // com.baicizhan.client.business.webview.CommonJSI
        @JavascriptInterface
        public void uploadLog(String days) {
            int i11 = 3;
            try {
                i11 = Integer.valueOf(days);
            } catch (Exception e11) {
                qb.c.c(BczWebFragment.TAG, "", e11);
            }
            oa.a.g().k(i11).H4(500L, TimeUnit.MILLISECONDS).I3(tb0.a.a()).r5(new qb0.g<Integer>() { // from class: com.baicizhan.client.business.webview.ui.BczWebFragment.SystemJSI.13
                @Override // qb0.c
                public void onError(Throwable e12) {
                    qb.c.c(BczWebFragment.TAG, "", e12);
                }

                @Override // qb0.c
                public void onNext(Integer integer) {
                    BczWebView bczWebView = BczWebFragment.this.mWebView;
                    if (bczWebView != null) {
                        bczWebView.loadUrl("javascript:bcz_system.uploadLogCallback('" + integer + "')");
                    }
                }

                @Override // qb0.c
                public void onCompleted() {
                }
            });
        }

        @JavascriptInterface
        @SuppressLint({"MissingPermission"})
        public void vibrate(String json) {
            VibrationEffect createWaveform;
            VibrationEffect createOneShot;
            boolean z11;
            boolean hasAmplitudeControl;
            if (BczWebFragment.this.getActivity() == null || BczWebFragment.this.getActivity().isFinishing()) {
                return;
            }
            int i11 = 0;
            if (BczWebFragment.this.mVibrator == null) {
                BczWebFragment bczWebFragment = BczWebFragment.this;
                bczWebFragment.mVibrator = (Vibrator) bczWebFragment.requireActivity().getSystemService("vibrator");
                String str = BczWebFragment.TAG;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("vibration amplitude supported: ");
                if (Build.VERSION.SDK_INT >= 26) {
                    hasAmplitudeControl = BczWebFragment.this.mVibrator.hasAmplitudeControl();
                    if (hasAmplitudeControl) {
                        z11 = true;
                        sb2.append(z11);
                        qb.c.i(str, sb2.toString(), new Object[0]);
                    }
                }
                z11 = false;
                sb2.append(z11);
                qb.c.i(str, sb2.toString(), new Object[0]);
            } else {
                BczWebFragment.this.mVibrator.cancel();
            }
            VibrationConfig vibrationConfig = (VibrationConfig) BczJson.fromJson(json, VibrationConfig.class);
            if (vibrationConfig == null) {
                return;
            }
            if (vibrationConfig.getPattern().length == 1 && vibrationConfig.getPattern()[0] != 0) {
                if (Build.VERSION.SDK_INT < 26) {
                    BczWebFragment.this.mVibrator.vibrate(vibrationConfig.getPattern()[0]);
                    return;
                }
                Vibrator vibrator = BczWebFragment.this.mVibrator;
                createOneShot = VibrationEffect.createOneShot(vibrationConfig.getPattern()[0], VibrationConfig.Amplitude.values()[vibrationConfig.getStrength()].getAmp());
                vibrator.vibrate(createOneShot);
                return;
            }
            if (vibrationConfig.getPattern().length <= 1) {
                qb.c.i(BczWebFragment.TAG, "empty arguments", new Object[0]);
                return;
            }
            if (Build.VERSION.SDK_INT < 26) {
                long[] jArr = new long[vibrationConfig.getPattern().length + 1];
                while (i11 < vibrationConfig.getPattern().length) {
                    int i12 = i11 + 1;
                    jArr[i12] = vibrationConfig.getPattern()[i11];
                    i11 = i12;
                }
                BczWebFragment.this.mVibrator.vibrate(jArr, -1);
                return;
            }
            int length = vibrationConfig.getPattern().length;
            int[] iArr = new int[length];
            int amp = VibrationConfig.Amplitude.values()[vibrationConfig.getStrength()].getAmp();
            Arrays.fill(iArr, amp);
            for (int i13 = 0; i13 < length; i13 += 2) {
                iArr[i13] = amp;
                int i14 = i13 + 1;
                if (i14 < length) {
                    iArr[i14] = 0;
                }
            }
            Vibrator vibrator2 = BczWebFragment.this.mVibrator;
            createWaveform = VibrationEffect.createWaveform(vibrationConfig.getPattern(), iArr, -1);
            vibrator2.vibrate(createWaveform);
        }

        @JavascriptInterface
        public void refreshBasicInfo(String json) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getLocation() {
    }

    public void addJavascriptInterfaces() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void statHijackUrl(String url) {
    }

    public void onViewInited(View parent) {
    }

    public void setShareVisibility(int visibility) {
    }
}
