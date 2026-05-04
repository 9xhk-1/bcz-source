package com.baicizhan.client.business.webview.ui;

import android.content.Context;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public interface WebWorker extends Serializable {
    public static final String JUMPER_KEY_REQUEST_PUNCH_CARD = "request_punch_card";
    public static final String JUMPER_KEY_REQUEST_PUNCH_CARD_SHARE = "request_punch_card_share";

    default void handle(String name) {
        handle(name, null);
    }

    void handle(String name, Context context);
}
