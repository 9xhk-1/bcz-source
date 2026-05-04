package com.huawei.hms.aggrpay.pay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.d;
import com.huawei.hms.aggrpay.AggrPayApiException;
import com.huawei.hms.aggrpay.e;
import com.huawei.hms.aggrpay.entity.ContractResult;
import com.huawei.hms.aggrpay.entity.PayResult;
import com.huawei.hms.aggrpay.f;
import com.huawei.hms.aggrpay.util.ResultListener;
import com.huawei.hms.support.api.client.Status;
import com.huawei.hms.support.log.HMSLog;
import com.tencent.mobileqq.openpay.constants.OpenConstants;
import fr.h;
import fr.i;
import fr.k;
import java.lang.ref.WeakReference;

/* loaded from: classes7.dex */
public class PayTaskActivity extends Activity {
    public static final String KEY_RESULT_LISTENER = "ResultListener";

    /* renamed from: a, reason: collision with root package name */
    private String f35376a;

    /* renamed from: b, reason: collision with root package name */
    private String f35377b;

    /* renamed from: c, reason: collision with root package name */
    private String f35378c;

    public class a implements h {
        public a() {
        }

        @Override // fr.h
        public void onFailure(Exception exc) {
            HMSLog.e("PayTaskActivity", "onFailure");
            Status status = ((AggrPayApiException) exc).getStatus();
            int statusCode = status.getStatusCode();
            HMSLog.e("PayTaskActivity", "dealException, returnCode: " + statusCode + " returnMsg: " + status.getStatusMessage());
            PayTaskActivity.this.b(String.valueOf(statusCode), status.getStatusMessage());
        }
    }

    public class b implements i<com.huawei.hms.aggrpay.entity.a> {
        public b() {
        }

        @Override // fr.i
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onSuccess(com.huawei.hms.aggrpay.entity.a aVar) {
            PayTaskActivity payTaskActivity;
            int i11;
            HMSLog.i("PayTaskActivity", "onSuccess");
            if ("signContract".equals(PayTaskActivity.this.f35378c)) {
                payTaskActivity = PayTaskActivity.this;
                i11 = 1235;
            } else {
                payTaskActivity = PayTaskActivity.this;
                i11 = 1234;
            }
            aVar.startActivityForResult(payTaskActivity, i11);
        }
    }

    private Object a(String str) {
        PayResult payResult = new PayResult();
        payResult.setReturnCode(str);
        return payResult;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private void b() {
        k<com.huawei.hms.aggrpay.entity.a> a11;
        HMSLog.i("PayTaskActivity", "handleBusiness apiName is " + this.f35378c);
        if (TextUtils.isEmpty(this.f35378c)) {
            HMSLog.e("PayTaskActivity", "sceneType is empty");
            this.f35378c = OpenConstants.API_NAME_PAY;
        }
        com.huawei.hms.aggrpay.pay.a aVar = new com.huawei.hms.aggrpay.pay.a(this);
        String str = this.f35378c;
        str.getClass();
        char c11 = 65535;
        switch (str.hashCode()) {
            case -1367623628:
                if (str.equals("carPay")) {
                    c11 = 0;
                    break;
                }
                break;
            case -645860509:
                if (str.equals("combinedPay")) {
                    c11 = 1;
                    break;
                }
                break;
            case 1738425839:
                if (str.equals("signContract")) {
                    c11 = 2;
                    break;
                }
                break;
        }
        String str2 = this.f35376a;
        switch (c11) {
            case 0:
                a11 = aVar.a(str2);
                break;
            case 1:
                a11 = aVar.b(str2);
                break;
            case 2:
                a11 = aVar.d(str2);
                break;
            default:
                a11 = aVar.c(str2);
                break;
        }
        a(a11);
    }

    public Thread findCpCurrentPayThread(long j11) {
        HMSLog.i("PayTaskActivity", "findCpCurrentPayThread");
        for (Thread thread : Thread.getAllStackTraces().keySet()) {
            if (thread.getId() == j11) {
                return thread;
            }
        }
        HMSLog.i("PayTaskActivity", "findCpCurrentPayThread return null");
        return null;
    }

    @Override // android.app.Activity
    public void finish() {
        try {
            super.finish();
        } catch (Throwable th2) {
            HMSLog.e("PayTaskActivity", "exception or error occur : " + th2.getClass().getSimpleName());
        }
        overridePendingTransition(0, 0);
    }

    @Override // android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        super.onActivityResult(i11, i12, intent);
        HMSLog.i("PayTaskActivity", "onActivityResult requestCode = " + i11 + " resultCode = " + i12);
        if (1234 == i11 && -1 == i12) {
            if (intent == null || intent.getExtras() == null) {
                HMSLog.e("PayTaskActivity", "data or bundle is null onActivityResult");
                a();
                return;
            }
            String b11 = new e(intent.getExtras()).b(PayResult.KEY);
            PayResult payResult = new PayResult();
            if (!TextUtils.isEmpty(b11)) {
                try {
                    payResult = (PayResult) new d().n(dp.b.v(b11), PayResult.class);
                } catch (Exception unused) {
                    HMSLog.e("PayTaskActivity", "payResult json exception");
                }
            }
            a(payResult);
            finish();
            return;
        }
        if (1235 != i11 || -1 != i12) {
            a();
            return;
        }
        if (intent == null || intent.getExtras() == null) {
            HMSLog.e("PayTaskActivity", "data or bundle is null onActivityResult");
            a();
            return;
        }
        String b12 = new e(intent.getExtras()).b(ContractResult.KEY);
        ContractResult contractResult = new ContractResult();
        if (!TextUtils.isEmpty(b12)) {
            try {
                contractResult = (ContractResult) new d().n(dp.b.v(b12), ContractResult.class);
            } catch (Exception unused2) {
                HMSLog.e("PayTaskActivity", "contractResult json exception");
            }
        }
        a(contractResult);
        finish();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setStatusBar();
        HMSLog.i("PayTaskActivity", "onCreate");
        if (bundle == null) {
            f fVar = new f(getIntent());
            this.f35376a = fVar.getStringExtra("requestJsonStr");
            this.f35377b = fVar.getStringExtra("listenerKey");
            this.f35378c = fVar.getStringExtra("apiName");
            b();
            return;
        }
        e eVar = new e(bundle);
        this.f35376a = eVar.b("requestJsonStr");
        this.f35377b = eVar.b("listenerKey");
        this.f35378c = eVar.b("apiName");
        a(eVar);
    }

    @Override // android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        HMSLog.i("PayTaskActivity", "onDestroy->");
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        HMSLog.i("PayTaskActivity", "onPause->");
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        HMSLog.i("PayTaskActivity", "onResume->");
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        HMSLog.i("PayTaskActivity", "onSaveInstanceState");
        bundle.putString("requestJsonStr", this.f35376a);
        bundle.putString("listenerKey", this.f35377b);
        bundle.putParcelable(KEY_RESULT_LISTENER, com.huawei.hms.aggrpay.util.b.a().a(this.f35377b));
        bundle.putString("apiName", this.f35378c);
        super.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        HMSLog.i("PayTaskActivity", "onStop->");
    }

    public void setStatusBar() {
        getWindow().getDecorView().setSystemUiVisibility(1280);
        getWindow().setStatusBarColor(0);
        getWindow().getDecorView().setSystemUiVisibility(9216);
    }

    private Object a(String str, String str2) {
        PayResult payResult = new PayResult();
        payResult.setReturnCode(str);
        payResult.setReturnMsg(str2);
        return payResult;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(String str, String str2) {
        a(a(str, str2));
        finish();
    }

    private void a() {
        a(a("-1"));
        finish();
    }

    private void a(e eVar) {
        if (com.huawei.hms.aggrpay.util.b.a().a(this.f35377b) != null) {
            return;
        }
        Parcelable a11 = eVar.a(KEY_RESULT_LISTENER);
        if (!(a11 instanceof ResultListener)) {
            HMSLog.e("PayTaskActivity", "getParcelable but resultListener is null");
            finish();
            return;
        }
        ResultListener resultListener = (ResultListener) a11;
        WeakReference<Thread> threadWeakReference = resultListener.getThreadWeakReference();
        if (threadWeakReference == null || threadWeakReference.get() == null) {
            Thread findCpCurrentPayThread = findCpCurrentPayThread(resultListener.getThreadId());
            if (findCpCurrentPayThread == null) {
                HMSLog.e("PayTaskActivity", "cpCurrentPayThread is null");
                finish();
                return;
            } else {
                if (!com.huawei.hms.aggrpay.util.a.a(findCpCurrentPayThread.getState())) {
                    HMSLog.e("PayTaskActivity", "cpCurrentPayThread is not waiting state");
                    finish();
                    return;
                }
                resultListener.setThread(findCpCurrentPayThread);
            }
        }
        com.huawei.hms.aggrpay.util.b.a().a(this.f35377b, resultListener);
    }

    private void a(k<com.huawei.hms.aggrpay.entity.a> kVar) {
        kVar.addOnSuccessListener(new b()).addOnFailureListener(new a());
    }

    private void a(Object obj) {
        com.huawei.hms.aggrpay.util.b.a().a(this.f35377b, obj);
    }
}
