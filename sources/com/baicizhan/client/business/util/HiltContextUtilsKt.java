package com.baicizhan.client.business.util;

import android.content.Context;
import kotlin.jvm.internal.g0;
import xu.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class HiltContextUtilsKt {
    public static final Context unWrapHiltContext(@m80.k Context context) {
        g0.p(context, "<this>");
        return context instanceof p.a ? ((p.a) context).getBaseContext() : context;
    }
}
