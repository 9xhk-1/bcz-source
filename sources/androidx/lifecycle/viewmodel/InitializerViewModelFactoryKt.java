package androidx.lifecycle.viewmodel;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.o0;
import m80.k;
import w00.j;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@j(name = "InitializerViewModelFactoryKt")
/* loaded from: classes2.dex */
public final class InitializerViewModelFactoryKt {
    public static final /* synthetic */ <VM extends ViewModel> void initializer(InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder, l<? super CreationExtras, ? extends VM> initializer) {
        g0.p(initializerViewModelFactoryBuilder, "<this>");
        g0.p(initializer, "initializer");
        g0.y(4, "VM");
        initializerViewModelFactoryBuilder.addInitializer(o0.d(ViewModel.class), initializer);
    }

    @k
    public static final ViewModelProvider.Factory viewModelFactory(@k l<? super InitializerViewModelFactoryBuilder, g2> builder) {
        g0.p(builder, "builder");
        InitializerViewModelFactoryBuilder initializerViewModelFactoryBuilder = new InitializerViewModelFactoryBuilder();
        builder.invoke(initializerViewModelFactoryBuilder);
        return initializerViewModelFactoryBuilder.build();
    }
}
