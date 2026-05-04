package androidx.compose.ui.platform;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@kotlin.jvm.internal.u0({"SMAP\nAndroidUiFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,59:1\n314#2,11:60\n*S KotlinDebug\n*F\n+ 1 AndroidUiFrameClock.android.kt\nandroidx/compose/ui/platform/AndroidUiFrameClock\n*L\n35#1:60,11\n*E\n"})
/* loaded from: classes2.dex */
public final class AndroidUiFrameClock implements MonotonicFrameClock {
    public static final int $stable = 8;

    @m80.k
    private final Choreographer choreographer;

    @m80.l
    private final AndroidUiDispatcher dispatcher;

    public AndroidUiFrameClock(@m80.k Choreographer choreographer, @m80.l AndroidUiDispatcher androidUiDispatcher) {
        this.choreographer = choreographer;
        this.dispatcher = androidUiDispatcher;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @m80.k x00.p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.l
    public <E extends d.b> E get(@m80.k d.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @m80.k
    public final Choreographer getChoreographer() {
        return this.choreographer;
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d minusKey(@m80.k d.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @m80.k
    public kotlin.coroutines.d plus(@m80.k kotlin.coroutines.d dVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, dVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @m80.l
    public <R> Object withFrameNanos(@m80.k final x00.l<? super Long, ? extends R> lVar, @m80.k j00.c<? super R> cVar) {
        final AndroidUiDispatcher androidUiDispatcher = this.dispatcher;
        if (androidUiDispatcher == null) {
            d.b bVar = cVar.getContext().get(kotlin.coroutines.c.f66933w0);
            androidUiDispatcher = bVar instanceof AndroidUiDispatcher ? (AndroidUiDispatcher) bVar : null;
        }
        final c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                Object m6308constructorimpl;
                j00.c cVar2 = pVar;
                x00.l<Long, R> lVar2 = lVar;
                try {
                    Result.a aVar = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(lVar2.invoke(Long.valueOf(j11)));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(kotlin.e.a(th2));
                }
                cVar2.resumeWith(m6308constructorimpl);
            }
        };
        if (androidUiDispatcher == null || !kotlin.jvm.internal.g0.g(androidUiDispatcher.getChoreographer(), getChoreographer())) {
            getChoreographer().postFrameCallback(frameCallback);
            pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$2
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
                    AndroidUiFrameClock.this.getChoreographer().removeFrameCallback(frameCallback);
                }
            });
        } else {
            androidUiDispatcher.postFrameCallback$ui_release(frameCallback);
            pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.compose.ui.platform.AndroidUiFrameClock$withFrameNanos$2$1
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
                    AndroidUiDispatcher.this.removeFrameCallback$ui_release(frameCallback);
                }
            });
        }
        Object F = pVar.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    public AndroidUiFrameClock(@m80.k Choreographer choreographer) {
        this(choreographer, null);
    }
}
