package androidx.lifecycle.viewmodel.compose;

import androidx.compose.runtime.saveable.SaverScope;
import androidx.lifecycle.SavedStateHandle;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.b0;
import kotlin.jvm.internal.g0;
import m80.k;
import m80.l;
import yz.w;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public /* synthetic */ class SavedStateHandleSaverKt$saveable$1$1$1 implements SaverScope, b0 {
    final /* synthetic */ SavedStateHandle.Companion $tmp0;

    public SavedStateHandleSaverKt$saveable$1$1$1(SavedStateHandle.Companion companion) {
        this.$tmp0 = companion;
    }

    @Override // androidx.compose.runtime.saveable.SaverScope
    public final boolean canBeSaved(@l Object obj) {
        return this.$tmp0.validateValue(obj);
    }

    public final boolean equals(@l Object obj) {
        if ((obj instanceof SaverScope) && (obj instanceof b0)) {
            return g0.g(getFunctionDelegate(), ((b0) obj).getFunctionDelegate());
        }
        return false;
    }

    @Override // kotlin.jvm.internal.b0
    @k
    public final w<?> getFunctionDelegate() {
        return new FunctionReferenceImpl(1, this.$tmp0, SavedStateHandle.Companion.class, "validateValue", "validateValue(Ljava/lang/Object;)Z", 0);
    }

    public final int hashCode() {
        return getFunctionDelegate().hashCode();
    }
}
