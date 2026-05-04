package com.huawei.hms.jos.apps;

import android.content.Context;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;
import com.huawei.hms.jos.JosClientBuilder;
import com.huawei.hms.jos.JosHmsClient;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class AppsClientBuilder extends JosClientBuilder {
    @Override // com.huawei.hms.jos.JosClientBuilder, com.huawei.hms.common.internal.AbstractClientBuilder
    public JosHmsClient buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new AppHmsClient(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
