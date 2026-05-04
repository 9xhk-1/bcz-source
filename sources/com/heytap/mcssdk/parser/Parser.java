package com.heytap.mcssdk.parser;

import android.content.Context;
import android.content.Intent;
import com.heytap.msp.push.mode.BaseMode;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public interface Parser<T> {
    BaseMode parse(Context context, int i11, Intent intent);
}
