package com.baicizhan.client.business.webview;

import com.baicizhan.client.business.webview.JsonParams;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class WebConfigParamKt {

    @k
    public static final String TURN_NOTIFICATION_MODE_JUMP = "jump";

    @k
    public static final String TURN_NOTIFICATION_MODE_POPUP = "popup";

    @k
    public static final StatusBarOption convert2NewStatusOption(@l JsonParams.StatusBar statusBar) {
        if (statusBar == null) {
            return new StatusBarOption(false, null, 3, null);
        }
        return new StatusBarOption(statusBar.statusBarVisible, (statusBar.statusContentColorBlack ? UiColorEnum.BLACK : UiColorEnum.WHITE).getValue());
    }
}
