package androidx.core.content;

import android.annotation.SuppressLint;
import android.content.SharedPreferences;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class SharedPreferencesKt {
    @SuppressLint({"ApplySharedPref"})
    public static final void edit(@m80.k SharedPreferences sharedPreferences, boolean z11, @m80.k x00.l<? super SharedPreferences.Editor, g2> lVar) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        lVar.invoke(edit);
        if (z11) {
            edit.commit();
        } else {
            edit.apply();
        }
    }

    public static /* synthetic */ void edit$default(SharedPreferences sharedPreferences, boolean z11, x00.l lVar, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            z11 = false;
        }
        SharedPreferences.Editor edit = sharedPreferences.edit();
        lVar.invoke(edit);
        if (z11) {
            edit.commit();
        } else {
            edit.apply();
        }
    }
}
