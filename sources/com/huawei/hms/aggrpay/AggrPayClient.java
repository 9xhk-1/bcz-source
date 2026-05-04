package com.huawei.hms.aggrpay;

import com.huawei.hms.aggrpay.entity.ContractResult;
import com.huawei.hms.aggrpay.entity.PayResult;

/* loaded from: classes7.dex */
public interface AggrPayClient {
    PayResult carPay(String str);

    PayResult combinedPay(String str);

    PayResult pay(String str);

    ContractResult signContract(String str);
}
