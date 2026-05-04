package androidx.datastore.preferences.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.g0;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes2.dex */
public final class PreferenceDataStore$updateData$2 extends SuspendLambda implements p<Preferences, c<? super Preferences>, Object> {
    final /* synthetic */ p<Preferences, c<? super Preferences>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferenceDataStore$updateData$2(p<? super Preferences, ? super c<? super Preferences>, ? extends Object> pVar, c<? super PreferenceDataStore$updateData$2> cVar) {
        super(2, cVar);
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        PreferenceDataStore$updateData$2 preferenceDataStore$updateData$2 = new PreferenceDataStore$updateData$2(this.$transform, cVar);
        preferenceDataStore$updateData$2.L$0 = obj;
        return preferenceDataStore$updateData$2;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k Preferences preferences, @l c<? super Preferences> cVar) {
        return ((PreferenceDataStore$updateData$2) create(preferences, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 == 0) {
            e.n(obj);
            Preferences preferences = (Preferences) this.L$0;
            p<Preferences, c<? super Preferences>, Object> pVar = this.$transform;
            this.label = 1;
            obj = pVar.invoke(preferences, this);
            if (obj == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            e.n(obj);
        }
        Preferences preferences2 = (Preferences) obj;
        g0.n(preferences2, "null cannot be cast to non-null type androidx.datastore.preferences.core.MutablePreferences");
        ((MutablePreferences) preferences2).freeze$datastore_preferences_core_release();
        return preferences2;
    }
}
