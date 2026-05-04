package com.baicizhan.app.preferences;

import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.handlers.ReplaceFileCorruptionHandler;
import androidx.datastore.preferences.core.Preferences;
import androidx.datastore.preferences.core.PreferencesFactory;
import kotlin.jvm.internal.g0;
import m80.k;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class d {
    @k
    public static final ReplaceFileCorruptionHandler<Preferences> b() {
        return new ReplaceFileCorruptionHandler<>(new l() { // from class: com.baicizhan.app.preferences.c
            @Override // x00.l
            public final Object invoke(Object obj) {
                Preferences c11;
                c11 = d.c((CorruptionException) obj);
                return c11;
            }
        });
    }

    public static final Preferences c(CorruptionException it) {
        g0.p(it, "it");
        return PreferencesFactory.createEmpty();
    }
}
