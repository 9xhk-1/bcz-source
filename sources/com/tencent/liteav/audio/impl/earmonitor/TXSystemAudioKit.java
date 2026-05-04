package com.tencent.liteav.audio.impl.earmonitor;

import android.content.Context;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public interface TXSystemAudioKit {
    void initialize(Context context, a aVar);

    void setSystemEarMonitoringVolume(int i11);

    void startSystemEarMonitoring();

    void stopSystemEarMonitoring();

    void uninitialize();
}
