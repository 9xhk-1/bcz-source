package a1;

import androidx.compose.runtime.Stable;
import androidx.compose.runtime.State;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes3.dex */
public interface i extends State<com.airbnb.lottie.k> {
    @m80.l
    Throwable getError();

    @Override // androidx.compose.runtime.State
    @m80.l
    com.airbnb.lottie.k getValue();

    @m80.l
    Object i(@m80.k j00.c<? super com.airbnb.lottie.k> cVar);

    boolean isComplete();

    boolean isLoading();

    boolean l();

    boolean m();
}
