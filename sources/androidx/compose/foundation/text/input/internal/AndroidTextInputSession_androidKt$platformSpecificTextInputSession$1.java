package androidx.compose.foundation.text.input.internal;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.foundation.text.input.internal.AndroidTextInputSession_androidKt", f = "AndroidTextInputSession.android.kt", i = {}, l = {59}, m = "platformSpecificTextInputSession", n = {}, s = {})
/* loaded from: classes.dex */
public final class AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;

    public AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1(j00.c<? super AndroidTextInputSession_androidKt$platformSpecificTextInputSession$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return AndroidTextInputSession_androidKt.platformSpecificTextInputSession(null, null, null, null, null, null, null, null, null, this);
    }
}
