package androidx.datastore.preferences.core;

import androidx.datastore.core.DataStore;
import j00.c;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.flow.i;
import m80.k;
import m80.l;
import x00.p;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class PreferenceDataStore implements DataStore<Preferences> {

    @k
    private final DataStore<Preferences> delegate;

    public PreferenceDataStore(@k DataStore<Preferences> delegate) {
        g0.p(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.DataStore
    @k
    public i<Preferences> getData() {
        return this.delegate.getData();
    }

    @Override // androidx.datastore.core.DataStore
    @l
    public Object updateData(@k p<? super Preferences, ? super c<? super Preferences>, ? extends Object> pVar, @k c<? super Preferences> cVar) {
        return this.delegate.updateData(new PreferenceDataStore$updateData$2(pVar, null), cVar);
    }
}
