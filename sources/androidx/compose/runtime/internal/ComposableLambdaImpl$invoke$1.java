package androidx.compose.runtime.internal;

import androidx.compose.runtime.Composer;
import kotlin.jvm.internal.AdaptedFunctionReference;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public /* synthetic */ class ComposableLambdaImpl$invoke$1 extends AdaptedFunctionReference implements p<Composer, Integer, g2> {
    public ComposableLambdaImpl$invoke$1(Object obj) {
        super(2, obj, ComposableLambdaImpl.class, "invoke", "invoke(Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", 8);
    }

    @Override // x00.p
    public /* bridge */ /* synthetic */ g2 invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return g2.f100423a;
    }

    public final void invoke(Composer composer, int i11) {
        ((ComposableLambdaImpl) this.receiver).invoke(composer, i11);
    }
}
