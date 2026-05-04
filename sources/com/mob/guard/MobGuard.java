package com.mob.guard;

import android.content.Context;
import com.mob.mcl.MobMCL;
import com.mob.mgs.MobMGS;
import com.mob.mgs.impl.e;
import com.mob.tools.proguard.PublicMemberKeeper;

@Deprecated
/* loaded from: classes7.dex */
public class MobGuard implements PublicMemberKeeper {
    public static String getGuardId() {
        try {
            return MobMCL.getSuid();
        } catch (Throwable th2) {
            e.a().a(th2);
            return null;
        }
    }

    public static void setOnAppActiveListener(final OnAppActiveListener onAppActiveListener) {
        if (onAppActiveListener != null) {
            MobMGS.setOnAppActiveListener(new com.mob.mgs.OnAppActiveListener() { // from class: com.mob.guard.MobGuard.2
                @Override // com.mob.mgs.OnAppActiveListener
                public void onAppActive(Context context, int i11) {
                    OnAppActiveListener onAppActiveListener2 = OnAppActiveListener.this;
                    if (onAppActiveListener2 != null) {
                        onAppActiveListener2.onAppActive(context, i11);
                    }
                }
            });
        }
    }

    public static void getGuardId(final OnIdChangeListener onIdChangeListener) {
        if (onIdChangeListener != null) {
            MobMCL.getSuid(new com.mob.mgs.OnIdChangeListener() { // from class: com.mob.guard.MobGuard.1
                @Override // com.mob.mgs.OnIdChangeListener
                public void onChanged(String str, String str2) {
                    OnIdChangeListener onIdChangeListener2 = OnIdChangeListener.this;
                    if (onIdChangeListener2 != null) {
                        onIdChangeListener2.onChanged(str, str2);
                    }
                }
            });
        }
    }
}
