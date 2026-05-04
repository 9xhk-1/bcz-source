package com.baicizhan.main.web;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.webview.ui.WebWorker;
import com.baicizhan.main.activity.daka.dakapage.DakaActivity;
import com.baicizhan.main.activity.daka.imagedaka.imagedakav2.ImageDakaV2Activity;
import kotlin.jvm.internal.g0;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class BczWebWorker implements WebWorker {
    public static final int $stable = 0;
    private final long serialVersionUID = 1;

    @Override // com.baicizhan.client.business.webview.ui.WebWorker
    public void handle(@l String str, @l Context context) {
        if (context == null) {
            return;
        }
        if (g0.g(str, WebWorker.JUMPER_KEY_REQUEST_PUNCH_CARD)) {
            DakaActivity.g1(context);
        } else if (g0.g(str, WebWorker.JUMPER_KEY_REQUEST_PUNCH_CARD_SHARE)) {
            ImageDakaV2Activity.f18406d.a(context);
        }
    }
}
