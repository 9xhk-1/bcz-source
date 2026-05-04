package androidx.lifecycle;

import androidx.annotation.MainThread;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@w00.j(name = "ViewModelProviderGetKt")
/* loaded from: classes2.dex */
public final class ViewModelProviderGetKt {
    @MainThread
    public static final /* synthetic */ <VM extends ViewModel> VM get(ViewModelProvider viewModelProvider) {
        g0.p(viewModelProvider, "<this>");
        g0.y(4, "VM");
        return (VM) viewModelProvider.get(o0.d(ViewModel.class));
    }
}
