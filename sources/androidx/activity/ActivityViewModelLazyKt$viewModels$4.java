package androidx.activity;

import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt$viewModels$4 extends Lambda implements x00.a<CreationExtras> {
    final /* synthetic */ x00.a<CreationExtras> $extrasProducer;
    final /* synthetic */ ComponentActivity $this_viewModels;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public ActivityViewModelLazyKt$viewModels$4(x00.a<? extends CreationExtras> aVar, ComponentActivity componentActivity) {
        super(0);
        this.$extrasProducer = aVar;
        this.$this_viewModels = componentActivity;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // x00.a
    public final CreationExtras invoke() {
        CreationExtras invoke;
        x00.a<CreationExtras> aVar = this.$extrasProducer;
        return (aVar == null || (invoke = aVar.invoke()) == null) ? this.$this_viewModels.getDefaultViewModelCreationExtras() : invoke;
    }
}
