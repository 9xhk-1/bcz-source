package com.baicizhan.client.business.store;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.client.business.webview.args.Arguments;
import com.baicizhan.client.business.webview.ui.BczWebActivity;
import com.jiongji.andriod.card.R;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NewMallActivity extends BczWebActivity {

    /* renamed from: a, reason: collision with root package name */
    public static final String f16546a = "bcz_app_main";

    /* renamed from: b, reason: collision with root package name */
    public static final String f16547b = "bcz-mall.baicizhan.com/homeV2?webview.option=%7B%22navigationBar%22%3A%7B%22visible%22%3Afalse%7D%7D&trace=";

    /* renamed from: c, reason: collision with root package name */
    public static final String f16548c = "https://bcz-mall.baicizhan.com/homeV2?webview.option=%7B%22navigationBar%22%3A%7B%22visible%22%3Afalse%7D%7D&trace=";

    public static String M0(String trace) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(f16548c);
        if (TextUtils.isEmpty(trace)) {
            trace = f16546a;
        }
        sb2.append(trace);
        return sb2.toString();
    }

    public static void N0(final Context context, final UserRecord userRecord) {
        O0(context, userRecord, M0(""));
    }

    public static void O0(final Context context, final UserRecord userRecord, final String productUrl) {
        Intent intent = new Intent(context, (Class<?>) NewMallActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelable("user", userRecord);
        bundle.putString(Arguments.ARG_DEFAULT_URL, productUrl);
        bundle.putInt(Arguments.ARG_URL_STRATEGY, 0);
        intent.putExtras(bundle);
        context.startActivity(intent);
        ((Activity) context).overridePendingTransition(R.anim.business_push_left_in, R.anim.business_push_left_out);
    }

    @Override // com.baicizhan.client.business.webview.ui.BczWebActivity, android.app.Activity
    public void finish() {
        super.finish();
        overridePendingTransition(R.anim.business_push_right_in, R.anim.business_push_right_out);
    }
}
