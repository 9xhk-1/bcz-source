package com.tencent.mobileqq.openpay.api;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.media3.common.C;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.tencent.mobileqq.openpay.constants.OpenConstants;
import com.tencent.mobileqq.openpay.data.base.BaseApi;
import com.tencent.mobileqq.openpay.data.pay.PayResponse;

/* loaded from: classes6.dex */
final class a implements IOpenApi {

    /* renamed from: a, reason: collision with root package name */
    private final String[] f44380a = {OpenConstants.API_NAME_PAY};
    private Context mContext;

    public a(Context context) {
        this.mContext = context;
    }

    private static int a(String str, String str2) {
        if (str == null) {
            return -1;
        }
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        int i11 = 0;
        while (i11 < split.length && i11 < split2.length) {
            try {
                int parseInt = Integer.parseInt(split[i11]);
                int parseInt2 = Integer.parseInt(split2[i11]);
                if (parseInt < parseInt2) {
                    return -1;
                }
                if (parseInt > parseInt2) {
                    return 1;
                }
                i11++;
            } catch (NumberFormatException e11) {
                e11.printStackTrace();
                return str.compareTo(str2);
            }
        }
        if (split.length > i11) {
            return 1;
        }
        return split2.length > i11 ? -1 : 0;
    }

    private boolean b(BaseApi baseApi) {
        try {
            String packageName = this.mContext.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return false;
            }
            Bundle bundle = new Bundle();
            baseApi.toBundle(bundle);
            bundle.putString("_mqqpay_baseapi_pkgname", packageName);
            Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(Uri.parse("mqqwallet://open_pay/"));
            intent.setPackage("com.tencent.mobileqq");
            intent.putExtras(bundle);
            intent.addFlags(268435456).addFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
            this.mContext.startActivity(intent);
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // com.tencent.mobileqq.openpay.api.IOpenApi
    public final boolean execApi(BaseApi baseApi) {
        String a11;
        if (baseApi != null && baseApi.checkParams() && OpenConstants.API_NAME_PAY.compareTo(baseApi.getApiName()) == 0 && (a11 = a()) != null) {
            if (a(a11, "5.3.0") >= 0) {
                return a(baseApi);
            }
            if (a(a11, "4.7.2") >= 0) {
                return b(baseApi);
            }
        }
        return false;
    }

    @Override // com.tencent.mobileqq.openpay.api.IOpenApi
    public final boolean handleIntent(Intent intent, IOpenApiListener iOpenApiListener) {
        Bundle extras;
        PayResponse payResponse;
        if (intent != null && iOpenApiListener != null) {
            String stringExtra = intent.getStringExtra("com_tencent_mobileqq_open_pay");
            if (TextUtils.isEmpty(stringExtra) || stringExtra.compareTo("com.tencent.mobileqq.open.pay") != 0 || (extras = intent.getExtras()) == null) {
                return false;
            }
            if (extras.getInt("_mqqpay_baseapi_apimark", -1) != 1) {
                payResponse = null;
            } else {
                PayResponse payResponse2 = new PayResponse();
                payResponse2.fromBundle(extras);
                payResponse = payResponse2;
            }
            if (payResponse != null && payResponse.checkParams()) {
                iOpenApiListener.onOpenResponse(payResponse);
                return true;
            }
        }
        return false;
    }

    @Override // com.tencent.mobileqq.openpay.api.IOpenApi
    public final boolean isMobileQQInstalled() {
        return a() != null;
    }

    @Override // com.tencent.mobileqq.openpay.api.IOpenApi
    public final boolean isMobileQQSupportApi(String str) {
        String a11;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        int i11 = 0;
        while (true) {
            String[] strArr = this.f44380a;
            if (i11 <= 0 && str.compareTo(strArr[0]) != 0) {
                i11++;
            }
        }
        return i11 <= 0 && (a11 = a()) != null && a(a11, "4.7.2") >= 0;
    }

    private String a() {
        try {
            PackageInfo packageInfo = this.mContext.getPackageManager().getPackageInfo("com.tencent.mobileqq", 0);
            if (packageInfo != null && !TextUtils.isEmpty(packageInfo.versionName)) {
                return packageInfo.versionName;
            }
            return null;
        } catch (PackageManager.NameNotFoundException e11) {
            e11.printStackTrace();
            return null;
        } catch (Exception e12) {
            e12.printStackTrace();
            return null;
        }
    }

    private boolean a(BaseApi baseApi) {
        Bundle bundle = new Bundle();
        baseApi.toBundle(bundle);
        try {
            String packageName = this.mContext.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return false;
            }
            bundle.putString("_mqqpay_payapi_packageName", packageName);
            Intent intent = new Intent();
            intent.setAction(CommonConstant.ACTION.HWID_SCHEME_URL);
            intent.setData(Uri.parse("mqqwallet://open_pay/"));
            intent.setPackage("com.tencent.mobileqq");
            intent.putExtras(bundle);
            intent.addFlags(268435456).addFlags(C.BUFFER_FLAG_FIRST_SAMPLE);
            this.mContext.startActivity(intent);
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }
}
