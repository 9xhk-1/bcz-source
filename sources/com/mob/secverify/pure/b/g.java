package com.mob.secverify.pure.b;

import android.content.res.Resources;
import com.mob.MobSDK;
import com.mob.tools.utils.ResHelper;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class g extends ResHelper {

    /* renamed from: a, reason: collision with root package name */
    private static Resources f40767a;

    public static String a(int i11) {
        if (f40767a == null) {
            f40767a = MobSDK.getContext().getResources();
        }
        return f40767a.getString(i11);
    }
}
