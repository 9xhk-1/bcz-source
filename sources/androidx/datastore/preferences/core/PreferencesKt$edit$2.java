package androidx.datastore.preferences.core;

import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", i = {}, l = {358}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nPreferences.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Preferences.kt\nandroidx/datastore/preferences/core/PreferencesKt$edit$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,361:1\n1#2:362\n*E\n"})
/* loaded from: classes2.dex */
public final class PreferencesKt$edit$2 extends SuspendLambda implements p<Preferences, c<? super Preferences>, Object> {
    final /* synthetic */ p<MutablePreferences, c<? super g2>, Object> $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public PreferencesKt$edit$2(p<? super MutablePreferences, ? super c<? super g2>, ? extends Object> pVar, c<? super PreferencesKt$edit$2> cVar) {
        super(2, cVar);
        this.$transform = pVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final c<g2> create(@l Object obj, @k c<?> cVar) {
        PreferencesKt$edit$2 preferencesKt$edit$2 = new PreferencesKt$edit$2(this.$transform, cVar);
        preferencesKt$edit$2.L$0 = obj;
        return preferencesKt$edit$2;
    }

    @Override // x00.p
    @l
    public final Object invoke(@k Preferences preferences, @l c<? super Preferences> cVar) {
        return ((PreferencesKt$edit$2) create(preferences, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object l11 = b.l();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            MutablePreferences mutablePreferences = (MutablePreferences) this.L$0;
            e.n(obj);
            return mutablePreferences;
        }
        e.n(obj);
        MutablePreferences mutablePreferences2 = ((Preferences) this.L$0).toMutablePreferences();
        p<MutablePreferences, c<? super g2>, Object> pVar = this.$transform;
        this.L$0 = mutablePreferences2;
        this.label = 1;
        return pVar.invoke(mutablePreferences2, this) == l11 ? l11 : mutablePreferences2;
    }
}
