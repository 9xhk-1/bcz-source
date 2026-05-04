package com.baicizhan.main.push.message;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baicizhan.main.activity.LoadingPageActivity;
import qb.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class NotifyClickHandler extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        c.i("NotifyClickHandler", "Notify click!", new Object[0]);
        if (xb.a.h().i()) {
            return;
        }
        Intent intent2 = new Intent(context, (Class<?>) LoadingPageActivity.class);
        intent2.putExtra(LoadingPageActivity.f18051o, true);
        intent2.setFlags(268435456);
        context.startActivity(intent2);
    }
}
