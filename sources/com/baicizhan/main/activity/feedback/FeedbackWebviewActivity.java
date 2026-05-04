package com.baicizhan.main.activity.feedback;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.webkit.JavascriptInterface;
import android.webkit.WebView;
import com.baicizhan.client.business.webview.BczWebHelperKt;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebActivity;
import com.jiongji.andriod.card.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class FeedbackWebviewActivity extends BczWebActivity {

    /* renamed from: a, reason: collision with root package name */
    public static final String f18475a = "FeedbackWebviewActivity";

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public WeakReference<FeedbackWebviewActivity> f18476a;

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        /* renamed from: com.baicizhan.main.activity.feedback.FeedbackWebviewActivity$a$a, reason: collision with other inner class name */
        public class RunnableC0285a implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FeedbackWebviewActivity f18477a;

            public RunnableC0285a(final FeedbackWebviewActivity val$activity) {
                this.f18477a = val$activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                BczWebHelperKt.startFeedBack(this.f18477a);
            }
        }

        /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
        public class b implements Runnable {

            /* renamed from: a, reason: collision with root package name */
            public final /* synthetic */ FeedbackWebviewActivity f18479a;

            public b(final FeedbackWebviewActivity val$activity) {
                this.f18479a = val$activity;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f18479a.finish();
            }
        }

        public a(FeedbackWebviewActivity activity) {
            this.f18476a = new WeakReference<>(activity);
        }

        @JavascriptInterface
        public void feedback() {
            FeedbackWebviewActivity feedbackWebviewActivity = this.f18476a.get();
            if (feedbackWebviewActivity != null) {
                feedbackWebviewActivity.runOnUiThread(new RunnableC0285a(feedbackWebviewActivity));
            }
        }

        @JavascriptInterface
        public void finish() {
            FeedbackWebviewActivity feedbackWebviewActivity = this.f18476a.get();
            if (feedbackWebviewActivity != null) {
                feedbackWebviewActivity.runOnUiThread(new b(feedbackWebviewActivity));
            }
        }
    }

    public static void M0(Context context) {
        Bundle arguments = new Arguments().getArguments();
        arguments.putString("title", "帮助与反馈");
        arguments.putString(Arguments.ARG_DEFAULT_URL, "http://www.baicizhan.com/qa");
        arguments.putInt(Arguments.ARG_URL_STRATEGY, 0);
        Intent intent = new Intent(context, (Class<?>) FeedbackWebviewActivity.class);
        intent.putExtras(arguments);
        context.startActivity(intent);
        ((Activity) context).overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebActivity, com.baicizhan.client.business.webview.ui.BczWebFragment.OnFragmentInteractionListener
    public void addJavascriptInterfaces(WebView webView) {
        webView.addJavascriptInterface(new a(this), "Android");
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.business_push_right_in, R.anim.business_push_right_out);
    }
}
