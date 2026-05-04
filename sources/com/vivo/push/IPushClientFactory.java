package com.vivo.push;

import android.content.Intent;
import com.vivo.push.d.z;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes6.dex */
public interface IPushClientFactory {
    z createReceiveTask(o oVar);

    o createReceiverCommand(Intent intent);

    l createTask(o oVar);
}
