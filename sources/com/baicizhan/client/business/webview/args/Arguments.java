package com.baicizhan.client.business.webview.args;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.webview.JsonParams;
import com.baicizhan.client.business.webview.OpenWebViewOption;
import com.baicizhan.client.business.webview.ui.WebWorker;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class Arguments {
    public static final String ARG_ANONYMOUS = "anonymous";
    public static final String ARG_DEFAULT_URL = "default_url";
    public static final String ARG_DISPLAY_SHARE = "display_share";
    public static final String ARG_FIXED_CLOSE = "fixed_close";
    public static final String ARG_FOR_RESULT = "for_result";
    public static final String ARG_IGNORE_TITLE = "ignore_title";
    public static final String ARG_LEFT_IN = "left_in";
    public static final String ARG_NEED_CACHE = "need_cache";
    public static final String ARG_NEW_WEB_OPTION = "web_option";
    public static final String ARG_OTHERS = "others";
    public static final String ARG_STATUS_BAR_PARAM = "status_bar_param";
    public static final String ARG_TITLE = "title";
    public static final String ARG_URL = "url";
    public static final String ARG_URL_STRATEGY = "url_strategy";
    public static final String ARG_USER = "user";
    public static final String ARG_WEB_WORKER = "web_worker";
    public static final String ERROR_URL = "file:///android_asset/html/error.html";
    private Bundle mBundle;
    private String mDefaultUrl;
    private Parcelable mOthers;
    private JsonParams.StatusBar mStatusBarParams;
    private String mTitle;
    private String mUrl;
    private int mUrlStrategy;
    private UserRecord mUser;
    private OpenWebViewOption mWebOption;
    private WebWorker mWebWorker;
    private boolean mDisplayShare = false;
    private boolean mNeedCache = false;
    private boolean mLeftIn = false;
    private boolean mIsTitleIgnored = false;
    private boolean mFixedClose = false;
    private boolean mForResult = false;
    private boolean mAnonymous = false;

    public void deserialize(Bundle out) {
        if (out == null) {
            return;
        }
        out.putString(ARG_DEFAULT_URL, this.mDefaultUrl);
        out.putString("url", this.mUrl);
        out.putInt(ARG_URL_STRATEGY, this.mUrlStrategy);
        out.putString("title", this.mTitle);
        out.putBoolean(ARG_DISPLAY_SHARE, this.mDisplayShare);
        out.putParcelable("user", this.mUser);
        out.putBoolean(ARG_NEED_CACHE, this.mNeedCache);
        out.putParcelable(ARG_OTHERS, this.mOthers);
        out.putBoolean(ARG_LEFT_IN, this.mLeftIn);
        out.putBoolean(ARG_IGNORE_TITLE, this.mIsTitleIgnored);
        out.putParcelable(ARG_STATUS_BAR_PARAM, this.mStatusBarParams);
        out.putBoolean(ARG_FIXED_CLOSE, this.mFixedClose);
        out.putBoolean("for_result", this.mForResult);
        out.putBoolean(ARG_ANONYMOUS, this.mAnonymous);
        out.putParcelable(ARG_NEW_WEB_OPTION, this.mWebOption);
        out.putSerializable(ARG_WEB_WORKER, this.mWebWorker);
    }

    @NonNull
    public Bundle getArguments() {
        if (this.mBundle == null) {
            this.mBundle = new Bundle();
        }
        return this.mBundle;
    }

    public String getDefaultUrl() {
        return this.mDefaultUrl;
    }

    public Parcelable getOthers() {
        return this.mOthers;
    }

    public JsonParams.StatusBar getStatusBarParams() {
        return this.mStatusBarParams;
    }

    public String getTitle() {
        return this.mTitle;
    }

    public String getUrl() {
        return this.mUrl;
    }

    public int getUrlStrategy() {
        return this.mUrlStrategy;
    }

    public UserRecord getUser() {
        return this.mUser;
    }

    public OpenWebViewOption getWebOption() {
        return this.mWebOption;
    }

    public WebWorker getWebWorker() {
        return this.mWebWorker;
    }

    public boolean isAnonymous() {
        return this.mAnonymous;
    }

    public boolean isDisplayShare() {
        return this.mDisplayShare;
    }

    public boolean isFixedClose() {
        return this.mFixedClose;
    }

    public boolean isForResult() {
        return this.mForResult;
    }

    public boolean isLeftIn() {
        return this.mLeftIn;
    }

    public boolean isNeedCache() {
        return this.mNeedCache;
    }

    public boolean isTitleIgnored() {
        return this.mIsTitleIgnored;
    }

    public void serialize(Bundle in2) {
        if (in2 == null) {
            return;
        }
        this.mDefaultUrl = in2.getString(ARG_DEFAULT_URL);
        this.mUrl = in2.getString("url");
        this.mUrlStrategy = in2.getInt(ARG_URL_STRATEGY);
        this.mTitle = in2.getString("title");
        this.mDisplayShare = in2.getBoolean(ARG_DISPLAY_SHARE);
        this.mUser = (UserRecord) in2.getParcelable("user");
        this.mNeedCache = in2.getBoolean(ARG_NEED_CACHE);
        this.mOthers = in2.getParcelable(ARG_OTHERS);
        this.mLeftIn = in2.getBoolean(ARG_LEFT_IN);
        this.mIsTitleIgnored = in2.getBoolean(ARG_IGNORE_TITLE);
        this.mStatusBarParams = (JsonParams.StatusBar) in2.getParcelable(ARG_STATUS_BAR_PARAM);
        this.mFixedClose = in2.getBoolean(ARG_FIXED_CLOSE);
        this.mForResult = in2.getBoolean("for_result");
        this.mAnonymous = in2.getBoolean(ARG_ANONYMOUS);
        this.mWebOption = (OpenWebViewOption) in2.getParcelable(ARG_NEW_WEB_OPTION);
        this.mWebWorker = (WebWorker) in2.getSerializable(ARG_WEB_WORKER);
    }

    public void setAnonymous(boolean anonymous) {
        this.mAnonymous = anonymous;
    }

    public void setArguments(@NonNull Bundle bundle) {
        this.mBundle = bundle;
    }

    public void setDefaultUrl(String defaultUrl) {
        this.mDefaultUrl = defaultUrl;
    }

    public void setDisplayShare(boolean display) {
        this.mDisplayShare = display;
    }

    public void setFixedClose(boolean fixedClose) {
        this.mFixedClose = fixedClose;
    }

    public void setForResult(boolean forResult) {
        this.mForResult = forResult;
    }

    public void setLeftIn(boolean leftIn) {
        this.mLeftIn = leftIn;
    }

    public void setNeedCache(boolean needCache) {
        this.mNeedCache = needCache;
    }

    public void setOthers(Parcelable others) {
        this.mOthers = others;
    }

    public void setStatusBarParams(JsonParams.StatusBar statusBarParams) {
        this.mStatusBarParams = statusBarParams;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setTitleIgnored(boolean titleIgnored) {
        this.mIsTitleIgnored = titleIgnored;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }

    public void setUrlStrategy(int strategy) {
        this.mUrlStrategy = strategy;
    }

    public void setUser(UserRecord user) {
        this.mUser = user;
    }

    public void setWebOption(OpenWebViewOption mWebOption) {
        this.mWebOption = mWebOption;
    }

    public void setWebWorker(WebWorker webWorker) {
        this.mWebWorker = webWorker;
    }
}
