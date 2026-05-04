package com.huawei.hms.jos;

import com.huawei.hms.common.HuaweiApiInterface;
import fr.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface JosAppsClient extends HuaweiApiInterface {
    k<String> getAppId();

    k<Void> init(AppParams appParams);
}
