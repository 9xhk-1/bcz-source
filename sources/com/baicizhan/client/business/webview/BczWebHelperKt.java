package com.baicizhan.client.business.webview;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import com.baicizhan.client.business.util.PathUtil;
import com.baicizhan.client.business.util.StringUtil;
import com.baicizhan.client.business.webview.BczWebDirector;
import com.baicizhan.client.business.webview.JsonParams;
import com.baicizhan.client.business.webview.OpenWebViewOption;
import com.jiongji.andriod.card.R;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import u30.f0;
import u30.k0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nBczWebHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BczWebHelper.kt\ncom/baicizhan/client/business/webview/BczWebHelperKt\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,265:1\n35#2:266\n35#2:269\n35#2:270\n35#2:271\n35#2:272\n35#2:273\n35#2:274\n35#2:275\n35#2:276\n35#2:277\n35#2:278\n1869#3,2:267\n*S KotlinDebug\n*F\n+ 1 BczWebHelper.kt\ncom/baicizhan/client/business/webview/BczWebHelperKt\n*L\n58#1:266\n126#1:269\n140#1:270\n154#1:271\n168#1:272\n181#1:273\n196#1:274\n213#1:275\n223#1:276\n244#1:277\n261#1:278\n107#1:267,2\n*E\n"})
/* loaded from: classes4.dex */
public final class BczWebHelperKt {

    @k
    public static final String TAG = "BczWebHelper";

    @k
    public static final String URL_OPTION_KEY = "webview.option";
    private static int sCampaignUpdateTime = ia.a.c(ia.a.f60470u);
    private static int sFeedbackUpdateTime = ia.a.c(ia.a.f60469t);

    public static final int getSCampaignUpdateTime() {
        return sCampaignUpdateTime;
    }

    public static final int getSFeedbackUpdateTime() {
        return sFeedbackUpdateTime;
    }

    @k
    public static final Pair<String, OpenWebViewOption> parseUrlToWeb(@k String url) {
        OpenWebViewOption openWebViewOption;
        g0.p(url, "url");
        qb.c.b(TAG, "url:" + url, new Object[0]);
        String queryParameter = Uri.parse(url).getQueryParameter(URL_OPTION_KEY);
        qb.c.b(TAG, "option:" + queryParameter, new Object[0]);
        try {
            openWebViewOption = (OpenWebViewOption) new com.google.gson.d().n(queryParameter, OpenWebViewOption.class);
        } catch (Exception e11) {
            qb.c.d(TAG, "parse web option error:" + e11.getMessage(), new Object[0]);
            openWebViewOption = null;
        }
        String removeKey = removeKey(url, URL_OPTION_KEY);
        qb.c.b(TAG, "resultUrl:" + removeKey, new Object[0]);
        return new Pair<>(removeKey, openWebViewOption);
    }

    @k
    public static final String removeKey(@k String urlStr, @k String key) {
        g0.p(urlStr, "urlStr");
        g0.p(key, "key");
        int J3 = k0.J3(urlStr, "?", 0, false, 6, null);
        if (J3 < 0 || !k0.n3(urlStr, key, false, 2, null)) {
            return urlStr;
        }
        String substring = urlStr.substring(0, J3);
        g0.o(substring, "substring(...)");
        String substring2 = urlStr.substring(J3 + 1);
        g0.o(substring2, "substring(...)");
        String str = "";
        for (String str2 : k0.o5(substring2, new String[]{"&"}, false, 0, 6, null)) {
            if (!f0.H2(str2, key, true)) {
                if (str.length() > 0) {
                    str = ((Object) str) + "&";
                }
                str = ((Object) str) + str2;
            }
        }
        if (str.length() <= 0) {
            return substring;
        }
        return substring + "?" + ((Object) str);
    }

    public static final void setSCampaignUpdateTime(int i11) {
        sCampaignUpdateTime = i11;
    }

    public static final void setSFeedbackUpdateTime(int i11) {
        sFeedbackUpdateTime = i11;
    }

    public static final void startBczProtocolWeb(@l Context context) {
        if (context != null) {
            String string = context.getResources().getString(R.string.url_bcz_protocol);
            String string2 = context.getString(R.string.main_login_bcz_protocol_title);
            g0.o(string2, "getString(...)");
            BczWebExecutorKt.startNormalWeb$default(context, string, string2, true, 0, null, 48, null);
        }
    }

    public static final void startCampaign(@l Context context) {
        if (context != null) {
            new BczWebDirector.Builder().setTitle(context.getResources().getString(R.string.campaign_title)).setUrlStrategy(1).build().goToWeb(context);
            ia.a.k(ia.a.f60470u, sCampaignUpdateTime);
        }
    }

    public static final void startChildProtocolWeb(@l Context context) {
        if (context != null) {
            String string = context.getResources().getString(R.string.url_child_private_protocol);
            String string2 = context.getString(R.string.main_login_child_private_protocol_title);
            g0.o(string2, "getString(...)");
            BczWebExecutorKt.startNormalWeb$default(context, string, string2, true, 0, null, 48, null);
        }
    }

    public static final void startExchangeCenter(@l Activity activity, @l String str) {
        if (activity != null) {
            String string = activity.getResources().getString(R.string.url_exchanged, String.valueOf(System.currentTimeMillis()));
            g0.o(string, "getString(...)");
            if (str != null && str.length() != 0) {
                string = string + "&trace=" + str;
            }
            qb.c.i(TAG, "exchange:" + string, new Object[0]);
            BczWebExecutorKt.startWebLeftIn$default(activity, string, null, 4, null);
        }
    }

    public static final void startFeedBack(@l Context context) {
        if (context != null) {
            String string = context.getString(R.string.url_feedback);
            String string2 = context.getResources().getString(R.string.feedback_title);
            g0.o(string2, "getString(...)");
            BczWebExecutorKt.startNormalWeb$default(context, string, string2, false, 0, null, 56, null);
            ia.a.k(ia.a.f60469t, sFeedbackUpdateTime);
        }
    }

    public static final void startListenerTest(@l Context context, @k String from) {
        g0.p(from, "from");
        if (context != null) {
            String string = context.getResources().getString(R.string.url_listen_test, from);
            String string2 = context.getString(R.string.word_test_title_listen);
            g0.o(string2, "getString(...)");
            BczWebExecutorKt.startNormalWeb$default(context, string, string2, false, 0, null, 56, null);
        }
    }

    public static final void startLittleClassCollect(@l Context context) {
        if (context != null) {
            String string = context.getResources().getString(R.string.url_little_class_collect, PathUtil.getDataDns(), "android", "false");
            String string2 = context.getResources().getString(R.string.little_class_collect_title);
            g0.o(string2, "getString(...)");
            BczWebExecutorKt.startNormalWeb$default(context, string, string2, false, 0, null, 56, null);
        }
    }

    public static final boolean startNewWebActivity(@l Context context, @l JsonParams.WebActivityIntentI webActivityIntentI) {
        String str;
        if (context == null || webActivityIntentI == null || (str = webActivityIntentI.url) == null || str.length() == 0) {
            return false;
        }
        BczWebDirector.Builder builder = new BczWebDirector.Builder();
        if (g0.g(webActivityIntentI.type, JsonParams.WebActivityIntentI.TYPE_LITTLE_CLASS)) {
            String str2 = webActivityIntentI.title;
            builder.setTitle((str2 == null || str2.length() == 0) ? "小讲堂" : webActivityIntentI.title);
            builder.setShowShare(true);
            builder.setDefaultUrl(StringUtil.appendUrlQueryParam(PathUtil.getDataDns() + webActivityIntentI.url, "inbczapp=android"));
        } else {
            builder.setTitle(webActivityIntentI.title);
            builder.setDefaultUrl(webActivityIntentI.url);
        }
        builder.setUrlStrategy(0);
        OpenWebViewOption.Builder builder2 = new OpenWebViewOption.Builder();
        if (webActivityIntentI.isLandscape) {
            builder2.setOrientation(new OrientationOption(90));
            builder2.setNavigationBar(new NavigationBarOption(false, null, null, 6, null));
        }
        JsonParams.StatusBar statusBar = webActivityIntentI.statusBar;
        if (statusBar != null) {
            builder2.setNavigationBar(new NavigationBarOption(false, null, null, 6, null));
            builder2.setStatusBar(WebConfigParamKt.convert2NewStatusOption(statusBar));
        }
        builder.setWebOption(builder2.build());
        builder.build().goToWeb(context);
        return true;
    }

    public static final void startPrivacyProtocolWeb(@l Context context) {
        if (context != null) {
            String string = context.getResources().getString(R.string.url_private_protocol);
            String string2 = context.getString(R.string.main_login_private_protocol_title);
            g0.o(string2, "getString(...)");
            BczWebExecutorKt.startNormalWeb$default(context, string, string2, true, 0, null, 48, null);
        }
    }

    public static final void startReadTest(@l Context context, @k String from) {
        g0.p(from, "from");
        if (context != null) {
            String string = context.getResources().getString(R.string.url_read_test, from);
            String string2 = context.getString(R.string.word_test_title_read);
            g0.o(string2, "getString(...)");
            BczWebExecutorKt.startNormalWeb$default(context, string, string2, false, 0, null, 56, null);
        }
    }

    public static final void startWxRemind(@l Context context) {
        if (context != null) {
            String string = context.getString(R.string.url_wx_reminder);
            String string2 = context.getString(R.string.weixin_remind);
            g0.o(string2, "getString(...)");
            BczWebExecutorKt.startNormalWeb$default(context, string, string2, false, 0, null, 56, null);
        }
    }
}
