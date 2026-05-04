package com.huawei.hms.jos.product;

import android.content.Context;
import com.huawei.hms.common.HuaweiApiInterface;
import fr.k;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface ProductClient extends HuaweiApiInterface {
    k<List<ProductOrderInfo>> getMissProductOrder(Context context);
}
