package androidx.compose.ui.platform;

import androidx.compose.ui.text.input.TextInputService;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3", f = "AndroidPlatformTextInputSession.android.kt", i = {0}, l = {184}, m = "invokeSuspend", n = {"methodSession"}, s = {"L$0"})
@kotlin.jvm.internal.u0({"SMAP\nAndroidPlatformTextInputSession.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,183:1\n314#2,11:184\n*S KotlinDebug\n*F\n+ 1 AndroidPlatformTextInputSession.android.kt\nandroidx/compose/ui/platform/AndroidPlatformTextInputSession$startInputMethod$3\n*L\n80#1:184,11\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidPlatformTextInputSession$startInputMethod$3 extends SuspendLambda implements x00.p<InputMethodSession, j00.c<?>, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AndroidPlatformTextInputSession this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidPlatformTextInputSession$startInputMethod$3(AndroidPlatformTextInputSession androidPlatformTextInputSession, j00.c<? super AndroidPlatformTextInputSession$startInputMethod$3> cVar) {
        super(2, cVar);
        this.this$0 = androidPlatformTextInputSession;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
        AndroidPlatformTextInputSession$startInputMethod$3 androidPlatformTextInputSession$startInputMethod$3 = new AndroidPlatformTextInputSession$startInputMethod$3(this.this$0, cVar);
        androidPlatformTextInputSession$startInputMethod$3.L$0 = obj;
        return androidPlatformTextInputSession$startInputMethod$3;
    }

    @Override // x00.p
    public final Object invoke(InputMethodSession inputMethodSession, j00.c<?> cVar) {
        return ((AndroidPlatformTextInputSession$startInputMethod$3) create(inputMethodSession, cVar)).invokeSuspend(g2.f100423a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        TextInputService textInputService;
        Object l11 = kotlin.coroutines.intrinsics.b.l();
        int i11 = this.label;
        if (i11 == 0) {
            kotlin.e.n(obj);
            final InputMethodSession inputMethodSession = (InputMethodSession) this.L$0;
            final AndroidPlatformTextInputSession androidPlatformTextInputSession = this.this$0;
            this.L$0 = inputMethodSession;
            this.L$1 = androidPlatformTextInputSession;
            this.label = 1;
            c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(this), 1);
            pVar.y();
            textInputService = androidPlatformTextInputSession.textInputService;
            textInputService.startInput();
            pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.compose.ui.platform.AndroidPlatformTextInputSession$startInputMethod$3$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                    invoke2(th2);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(Throwable th2) {
                    TextInputService textInputService2;
                    InputMethodSession.this.dispose();
                    textInputService2 = androidPlatformTextInputSession.textInputService;
                    textInputService2.stopInput();
                }
            });
            Object F = pVar.F();
            if (F == kotlin.coroutines.intrinsics.b.l()) {
                l00.f.c(this);
            }
            if (F == l11) {
                return l11;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.e.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
