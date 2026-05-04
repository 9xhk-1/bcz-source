package androidx.activity.contextaware;

import kotlin.jvm.internal.Lambda;
import x00.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$1 extends Lambda implements l<Throwable, g2> {
    final /* synthetic */ ContextAwareKt$withContextAvailable$2$listener$1 $listener;
    final /* synthetic */ ContextAware $this_withContextAvailable;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ContextAwareKt$withContextAvailable$2$1(ContextAware contextAware, ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1) {
        super(1);
        this.$this_withContextAvailable = contextAware;
        this.$listener = contextAwareKt$withContextAvailable$2$listener$1;
    }

    @Override // x00.l
    public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
        invoke2(th2);
        return g2.f100423a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th2) {
        this.$this_withContextAvailable.removeOnContextAvailableListener(this.$listener);
    }
}
