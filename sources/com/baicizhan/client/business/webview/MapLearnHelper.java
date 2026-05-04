package com.baicizhan.client.business.webview;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class MapLearnHelper {

    @k
    public static final MapLearnHelper INSTANCE = new MapLearnHelper();

    @k
    private static MutableLiveData<Boolean> isMapAction = new MutableLiveData<>();

    @k
    private static final String KEY_HAS_SHOW_MAP_TIP = "key_has_show_map_tip";
    public static final int $stable = 8;

    private MapLearnHelper() {
    }

    @k
    public final String getKEY_HAS_SHOW_MAP_TIP() {
        return KEY_HAS_SHOW_MAP_TIP;
    }

    @k
    public final MutableLiveData<Boolean> isMapAction() {
        return isMapAction;
    }

    public final void setMapAction(@k MutableLiveData<Boolean> mutableLiveData) {
        g0.p(mutableLiveData, "<set-?>");
        isMapAction = mutableLiveData;
    }
}
