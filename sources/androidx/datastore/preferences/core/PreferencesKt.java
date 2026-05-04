package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import j00.c;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PreferencesKt {
    @l
    public static final Object edit(@k DataStore<Preferences> dataStore, @k p<? super MutablePreferences, ? super c<? super g2>, ? extends Object> pVar, @k c<? super Preferences> cVar) {
        return dataStore.updateData(new PreferencesKt$edit$2(pVar, null), cVar);
    }
}
