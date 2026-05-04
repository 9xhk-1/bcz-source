package com.huawei.hms.aggrpay.pay;

import android.app.Activity;
import android.util.Log;
import com.huawei.hms.aggrpay.AggrCarPayTaskApiCall;
import com.huawei.hms.aggrpay.AggrPayTaskApiCall;
import com.huawei.hms.aggrpay.CombinedPayTaskApiCall;
import com.huawei.hms.aggrpay.SignContractTaskApiCall;
import com.huawei.hms.aggrpay.b;
import com.huawei.hms.aggrpay.c;
import com.huawei.hms.api.Api;
import com.huawei.hms.common.HuaweiApi;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.support.hianalytics.HiAnalyticsClient;
import com.huawei.hms.utils.Checker;
import fr.k;

/* loaded from: classes7.dex */
public class a extends HuaweiApi<c> {

    /* renamed from: a, reason: collision with root package name */
    private static c f35381a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final Api<c> f35382b = new Api<>("HuaweiAggrPay.API");

    public a(Activity activity) {
        super(activity, f35382b, f35381a, (AbstractClientBuilder) new b(), 1);
    }

    public k<com.huawei.hms.aggrpay.entity.a> a(String str) {
        Log.i("AggrPayClientImpl", "enter carPay");
        Checker.checkNonEmpty(str);
        return doWrite(new AggrCarPayTaskApiCall("PaymentService.carPay", str, HiAnalyticsClient.reportEntry(getContext(), "PaymentService.carPay", 1)));
    }

    public k<com.huawei.hms.aggrpay.entity.a> b(String str) {
        Log.i("AggrPayClientImpl", "enter combinedPay");
        Checker.checkNonEmpty(str);
        return doWrite(new CombinedPayTaskApiCall("PaymentService.combinedPay", str, HiAnalyticsClient.reportEntry(getContext(), "PaymentService.combinedPay", 1)));
    }

    public k<com.huawei.hms.aggrpay.entity.a> c(String str) {
        Log.i("AggrPayClientImpl", "enter pay");
        Checker.checkNonEmpty(str);
        return doWrite(new AggrPayTaskApiCall("PaymentService.pay", str, HiAnalyticsClient.reportEntry(getContext(), "PaymentService.pay", 1)));
    }

    public k<com.huawei.hms.aggrpay.entity.a> d(String str) {
        Log.i("AggrPayClientImpl", "enter signContract");
        Checker.checkNonEmpty(str);
        return doWrite(new SignContractTaskApiCall("PaymentService.signContract", str, HiAnalyticsClient.reportEntry(getContext(), "PaymentService.signContract", 1)));
    }
}
