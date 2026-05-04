package com.tencent.connect.emotion;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.widget.Toast;
import com.alipay.sdk.m.u.i;
import com.huawei.hms.framework.common.ContainerUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.connect.a;
import com.tencent.connect.auth.QQToken;
import com.tencent.connect.common.BaseApi;
import com.tencent.connect.common.Constants;
import com.tencent.connect.common.UIListenerManager;
import com.tencent.open.log.SLog;
import com.tencent.open.utils.k;
import com.tencent.open.utils.m;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class QQEmotion extends BaseApi {

    /* renamed from: a, reason: collision with root package name */
    private IUiListener f42874a;

    public QQEmotion(QQToken qQToken) {
        super(qQToken);
    }

    private boolean a(Context context, ArrayList<Uri> arrayList) {
        if (arrayList == null || arrayList.size() == 0) {
            return false;
        }
        if (arrayList.size() > 9) {
            SLog.i("QQEMOTION", "isLegality -->illegal, file count > 9, count = " + arrayList.size());
            return false;
        }
        long j11 = 0;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            long a11 = m.a(context, arrayList.get(i11));
            if (a11 > 1048576) {
                SLog.i("QQEMOTION", "isLegality -->illegal, fileSize: " + a11);
                return false;
            }
            j11 += a11;
        }
        if (j11 > 3145728) {
            SLog.i("QQEMOTION", "isLegality -->illegal, totalSize: " + j11);
            return false;
        }
        SLog.i("QQEMOTION", "isLegality -->legal, totalSize: " + j11);
        return true;
    }

    public void setEmotions(Activity activity, ArrayList<Uri> arrayList, IUiListener iUiListener) {
        if (a.a("QQEmotion", iUiListener)) {
            return;
        }
        IUiListener iUiListener2 = this.f42874a;
        if (iUiListener2 != null) {
            iUiListener2.onCancel();
        }
        this.f42874a = iUiListener;
        if (!k.b(activity)) {
            Toast.makeText(activity.getApplicationContext(), "当前手机未安装QQ，请安装最新版QQ后再试。", 1).show();
            return;
        }
        if (k.c(activity, "8.0.0") < 0) {
            Toast.makeText(activity.getApplicationContext(), "当前手机QQ版本过低，不支持设置表情功能。", 1).show();
            return;
        }
        if (!a(activity.getApplicationContext(), arrayList)) {
            Toast.makeText(activity.getApplicationContext(), "图片不符合要求，不支持设置表情功能。", 1).show();
            return;
        }
        String a11 = m.a(activity);
        StringBuffer stringBuffer = new StringBuffer("mqqapi://profile/sdk_face_collection?");
        StringBuilder sb2 = new StringBuilder();
        if (!TextUtils.isEmpty(a11)) {
            if (a11.length() > 20) {
                a11 = a11.substring(0, 20) + "...";
            }
            sb2.append(a11);
            stringBuffer.append("&app_name=" + Base64.encodeToString(m.j(a11), 2));
        }
        String appId = this.f42865c.getAppId();
        String openId = this.f42865c.getOpenId();
        if (!TextUtils.isEmpty(appId)) {
            stringBuffer.append("&share_id=" + appId);
            sb2.append(appId);
        }
        if (!TextUtils.isEmpty(openId)) {
            sb2.append(openId);
            stringBuffer.append("&open_id=" + Base64.encodeToString(m.j(openId), 2));
        }
        stringBuffer.append("&sdk_version=" + Base64.encodeToString(m.j(Constants.SDK_VERSION), 2));
        sb2.append(Constants.SDK_VERSION);
        String a12 = a(activity, arrayList);
        if (TextUtils.isEmpty(a12)) {
            iUiListener.onError(new UiError(-6, Constants.MSG_UNKNOWN_ERROR, "picPathList is null"));
            return;
        }
        sb2.append(a12);
        stringBuffer.append("&set_uri_list=" + Base64.encodeToString(m.j(a12), 2));
        stringBuffer.append("&");
        stringBuffer.append(Constants.KEY_PPSTS);
        stringBuffer.append(ContainerUtils.KEY_VALUE_DELIMITER);
        stringBuffer.append(k.a(activity, sb2.toString()));
        SLog.v("QQEMOTION", "-->set avatar, url: " + stringBuffer.toString());
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL);
        intent.setData(Uri.parse(stringBuffer.toString()));
        intent.setPackage("com.tencent.mobileqq");
        intent.putParcelableArrayListExtra("android.intent.extra.STREAM", arrayList);
        if (a(intent)) {
            UIListenerManager.getInstance().setListenerWithRequestcode(Constants.REQUEST_EDIT_EMOTION, iUiListener);
            a(activity, Constants.REQUEST_EDIT_EMOTION, intent, false);
        }
    }

    private String a(Activity activity, ArrayList<Uri> arrayList) {
        StringBuilder sb2 = new StringBuilder();
        Iterator<Uri> it = arrayList.iterator();
        while (it.hasNext()) {
            Uri a11 = m.a(activity, this.f42865c.getAppId(), m.b(activity, it.next()));
            if (a11 == null) {
                SLog.e("QQEmotion", "getFilePathListJson: grantedUri = null");
            } else {
                sb2.append(a11);
                sb2.append(i.f11097b);
            }
        }
        String sb3 = sb2.toString();
        SLog.i("QQEmotion", "-->getFilePathListJson listStr : " + sb3);
        return sb3;
    }
}
