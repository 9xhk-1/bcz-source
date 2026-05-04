package androidx.compose.material;

import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.compose.material.FloatingActionButtonElevationAnimatable", f = "FloatingActionButton.kt", i = {0}, l = {370}, m = "snapElevation", n = {"this"}, s = {"L$0"})
/* loaded from: classes.dex */
public final class FloatingActionButtonElevationAnimatable$snapElevation$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ FloatingActionButtonElevationAnimatable this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FloatingActionButtonElevationAnimatable$snapElevation$1(FloatingActionButtonElevationAnimatable floatingActionButtonElevationAnimatable, c<? super FloatingActionButtonElevationAnimatable$snapElevation$1> cVar) {
        super(cVar);
        this.this$0 = floatingActionButtonElevationAnimatable;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object snapElevation;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        snapElevation = this.this$0.snapElevation(this);
        return snapElevation;
    }
}
