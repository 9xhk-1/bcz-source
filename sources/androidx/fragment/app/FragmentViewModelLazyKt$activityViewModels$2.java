package androidx.fragment.app;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nFragmentViewModelLazy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt$activityViewModels$2\n*L\n1#1,222:1\n*E\n"})
/* loaded from: classes2.dex */
public final class FragmentViewModelLazyKt$activityViewModels$2 extends Lambda implements x00.a<CreationExtras> {
    final /* synthetic */ Fragment $this_activityViewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FragmentViewModelLazyKt$activityViewModels$2(Fragment fragment) {
        super(0);
        this.$this_activityViewModels = fragment;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // x00.a
    @m80.k
    public final CreationExtras invoke() {
        return this.$this_activityViewModels.requireActivity().getDefaultViewModelCreationExtras();
    }
}
