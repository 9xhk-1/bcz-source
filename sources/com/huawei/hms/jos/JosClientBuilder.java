package com.huawei.hms.jos;

import android.content.Context;
import com.huawei.hms.common.internal.AbstractClientBuilder;
import com.huawei.hms.common.internal.BaseHmsClient;
import com.huawei.hms.common.internal.ClientSettings;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class JosClientBuilder extends AbstractClientBuilder<JosHmsClient, JosOptions> {
    @Override // com.huawei.hms.common.internal.AbstractClientBuilder
    public JosHmsClient buildClient(Context context, ClientSettings clientSettings, BaseHmsClient.OnConnectionFailedListener onConnectionFailedListener, BaseHmsClient.ConnectionCallbacks connectionCallbacks) {
        return new JosHmsClient(context, clientSettings, onConnectionFailedListener, connectionCallbacks);
    }
}
