package com.huawei.hms.aggrpay;

import android.app.Activity;
import android.content.Intent;
import android.text.TextUtils;
import com.huawei.hms.aggrpay.entity.ContractResult;
import com.huawei.hms.aggrpay.entity.PayResult;
import com.huawei.hms.aggrpay.entity.ResultStatus;
import com.huawei.hms.aggrpay.pay.PayTaskActivity;
import com.huawei.hms.aggrpay.util.ResultListener;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.Checker;
import com.tencent.mobileqq.openpay.constants.OpenConstants;
import java.lang.ref.WeakReference;
import java.security.SecureRandom;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes7.dex */
public class d implements AggrPayClient {

    /* renamed from: a, reason: collision with root package name */
    private WeakReference<Activity> f35358a;

    /* renamed from: b, reason: collision with root package name */
    private PayResult f35359b;

    /* renamed from: c, reason: collision with root package name */
    private ContractResult f35360c;

    /* renamed from: d, reason: collision with root package name */
    private final SecureRandom f35361d = new SecureRandom();

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f35362a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35363b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35364c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35365d;

        public a(Activity activity, String str, String str2, String str3) {
            this.f35362a = activity;
            this.f35363b = str;
            this.f35364c = str2;
            this.f35365d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent(this.f35362a, (Class<?>) PayTaskActivity.class);
            intent.putExtra("requestJsonStr", this.f35363b);
            intent.putExtra("listenerKey", this.f35364c);
            intent.putExtra("apiName", this.f35365d);
            this.f35362a.startActivity(intent);
        }
    }

    public class b extends ResultListener {
        public b(Thread thread, long j11) {
            super(thread, j11);
        }

        @Override // com.huawei.hms.aggrpay.util.ResultListener
        public void notifyResult(String str, Object obj) {
            String str2;
            HMSLog.i("PayClientEntryImpl", "payResult update");
            if (obj instanceof PayResult) {
                d.this.f35359b = (PayResult) obj;
            } else if (obj instanceof ContractResult) {
                d.this.f35360c = (ContractResult) obj;
            }
            com.huawei.hms.aggrpay.util.b.a().b(str);
            if (getThreadWeakReference() == null) {
                str2 = "notifyResult update but mThreadWeakReference is null";
            } else {
                Thread thread = getThreadWeakReference().get();
                if (thread == null) {
                    str2 = "notifyResult update but thread is null";
                } else {
                    if (com.huawei.hms.aggrpay.util.a.a(thread.getState())) {
                        LockSupport.unpark(thread);
                        return;
                    }
                    str2 = "notifyResult update but thread is not waiting state";
                }
            }
            HMSLog.e("PayClientEntryImpl", str2);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Activity f35368a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f35369b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f35370c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f35371d;

        public c(Activity activity, String str, String str2, String str3) {
            this.f35368a = activity;
            this.f35369b = str;
            this.f35370c = str2;
            this.f35371d = str3;
        }

        @Override // java.lang.Runnable
        public void run() {
            Intent intent = new Intent(this.f35368a, (Class<?>) PayTaskActivity.class);
            intent.putExtra("requestJsonStr", this.f35369b);
            intent.putExtra("listenerKey", this.f35370c);
            intent.putExtra("apiName", this.f35371d);
            this.f35368a.startActivity(intent);
        }
    }

    public d(Activity activity) {
        this.f35358a = new WeakReference<>(activity);
    }

    private ContractResult b(String str, String str2) {
        Checker.assertNonEmpty(str);
        Activity activity = this.f35358a.get();
        if (activity == null) {
            ContractResult contractResult = new ContractResult();
            this.f35360c = contractResult;
            contractResult.setReturnCode(ResultStatus.STATUS_PARAM_ERROR);
            this.f35360c.setReturnMsg("activity is null");
            return this.f35360c;
        }
        if (com.huawei.hms.aggrpay.util.c.a()) {
            HMSLog.w("PayClientEntryImpl", "is duplicate request");
            ContractResult contractResult2 = new ContractResult();
            this.f35360c = contractResult2;
            contractResult2.setReturnCode(ResultStatus.STATUS_DUPLICATE_REQUEST);
            this.f35360c.setReturnMsg("is duplicate request");
            return this.f35360c;
        }
        String a11 = a();
        a(a11);
        activity.runOnUiThread(new c(activity, str, a11, str2));
        LockSupport.parkNanos(1800000000000L);
        ContractResult contractResult3 = this.f35360c;
        if (contractResult3 == null || TextUtils.isEmpty(contractResult3.getReturnCode())) {
            HMSLog.e("PayClientEntryImpl", "no result return");
            ContractResult contractResult4 = new ContractResult();
            this.f35360c = contractResult4;
            contractResult4.setReturnCode("-1");
        }
        HMSLog.i("PayClientEntryImpl", "contractResult return");
        return this.f35360c;
    }

    @Override // com.huawei.hms.aggrpay.AggrPayClient
    public PayResult carPay(String str) {
        HMSLog.i("PayClientEntryImpl", "carPay come in");
        return a(str, "carPay");
    }

    @Override // com.huawei.hms.aggrpay.AggrPayClient
    public PayResult combinedPay(String str) {
        HMSLog.i("PayClientEntryImpl", "combinedPay come in");
        return a(str, "combinedPay");
    }

    @Override // com.huawei.hms.aggrpay.AggrPayClient
    public PayResult pay(String str) {
        HMSLog.i("PayClientEntryImpl", "pay come in");
        return a(str, OpenConstants.API_NAME_PAY);
    }

    @Override // com.huawei.hms.aggrpay.AggrPayClient
    public ContractResult signContract(String str) {
        return b(str, "signContract");
    }

    private PayResult a(Activity activity, String str, String str2) {
        if (com.huawei.hms.aggrpay.util.c.a()) {
            HMSLog.w("PayClientEntryImpl", "is duplicate request");
            PayResult payResult = new PayResult();
            this.f35359b = payResult;
            payResult.setReturnCode(ResultStatus.STATUS_DUPLICATE_REQUEST);
            this.f35359b.setReturnMsg("is duplicate request");
            return this.f35359b;
        }
        String a11 = a();
        a(a11);
        activity.runOnUiThread(new a(activity, str, a11, str2));
        LockSupport.parkNanos(1800000000000L);
        PayResult payResult2 = this.f35359b;
        if (payResult2 == null || TextUtils.isEmpty(payResult2.getReturnCode())) {
            HMSLog.e("PayClientEntryImpl", "no result return");
            PayResult payResult3 = new PayResult();
            this.f35359b = payResult3;
            payResult3.setReturnCode("-1");
        }
        HMSLog.i("PayClientEntryImpl", "payResult return");
        return this.f35359b;
    }

    private PayResult a(String str, String str2) {
        Checker.assertNonEmpty(str);
        Activity activity = this.f35358a.get();
        if (activity != null) {
            return a(activity, str, str2);
        }
        PayResult payResult = new PayResult();
        this.f35359b = payResult;
        payResult.setReturnCode(ResultStatus.STATUS_PARAM_ERROR);
        this.f35359b.setReturnMsg("activity is null");
        return this.f35359b;
    }

    private String a() {
        return System.currentTimeMillis() + "_" + this.f35361d.nextInt(1000);
    }

    private void a(String str) {
        com.huawei.hms.aggrpay.util.b.a().a(str, (ResultListener) new b(Thread.currentThread(), Thread.currentThread().getId()));
    }
}
