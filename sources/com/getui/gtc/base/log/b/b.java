package com.getui.gtc.base.log.b;

import android.util.Log;
import com.getui.gtc.base.log.ILogDestination;

/* loaded from: classes6.dex */
public final class b implements ILogDestination {
    @Override // com.getui.gtc.base.log.ILogDestination
    public final void log(int i11, String str, String str2) {
        if (i11 == 1) {
            Log.v(str, str2);
            return;
        }
        if (i11 == 2) {
            Log.d(str, str2);
            return;
        }
        if (i11 == 3) {
            Log.i(str, str2);
        } else if (i11 == 4) {
            Log.w(str, str2);
        } else {
            if (i11 != 5) {
                return;
            }
            Log.e(str, str2);
        }
    }
}
