package androidx.compose.runtime;

import android.view.Choreographer;
import androidx.compose.runtime.MonotonicFrameClock;
import c40.h1;
import c40.i;
import j00.c;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.f;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nMonotonicFrameClock.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MonotonicFrameClock.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,75:1\n314#2,11:76\n*S KotlinDebug\n*F\n+ 1 MonotonicFrameClock.android.kt\nandroidx/compose/runtime/DefaultChoreographerFrameClock\n*L\n50#1:76,11\n*E\n"})
/* loaded from: classes.dex */
final class DefaultChoreographerFrameClock implements MonotonicFrameClock {

    @k
    public static final DefaultChoreographerFrameClock INSTANCE = new DefaultChoreographerFrameClock();
    private static final Choreographer choreographer = (Choreographer) i.f(h1.e().q(), new DefaultChoreographerFrameClock$choreographer$1(null));

    private DefaultChoreographerFrameClock() {
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    public <R> R fold(R r11, @k p<? super R, ? super d.b, ? extends R> pVar) {
        return (R) MonotonicFrameClock.DefaultImpls.fold(this, r11, pVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @l
    public <E extends d.b> E get(@k d.c<E> cVar) {
        return (E) MonotonicFrameClock.DefaultImpls.get(this, cVar);
    }

    @Override // kotlin.coroutines.d.b, kotlin.coroutines.d
    @k
    public d minusKey(@k d.c<?> cVar) {
        return MonotonicFrameClock.DefaultImpls.minusKey(this, cVar);
    }

    @Override // kotlin.coroutines.d
    @k
    public d plus(@k d dVar) {
        return MonotonicFrameClock.DefaultImpls.plus(this, dVar);
    }

    @Override // androidx.compose.runtime.MonotonicFrameClock
    @l
    public <R> Object withFrameNanos(@k final x00.l<? super Long, ? extends R> lVar, @k c<? super R> cVar) {
        final c40.p pVar = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        final Choreographer.FrameCallback frameCallback = new Choreographer.FrameCallback() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$callback$1
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j11) {
                Object m6308constructorimpl;
                c cVar2 = pVar;
                DefaultChoreographerFrameClock defaultChoreographerFrameClock = DefaultChoreographerFrameClock.INSTANCE;
                x00.l<Long, R> lVar2 = lVar;
                try {
                    Result.a aVar = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(lVar2.invoke(Long.valueOf(j11)));
                } catch (Throwable th2) {
                    Result.a aVar2 = Result.Companion;
                    m6308constructorimpl = Result.m6308constructorimpl(e.a(th2));
                }
                cVar2.resumeWith(m6308constructorimpl);
            }
        };
        choreographer.postFrameCallback(frameCallback);
        pVar.p(new x00.l<Throwable, g2>() { // from class: androidx.compose.runtime.DefaultChoreographerFrameClock$withFrameNanos$2$1
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
                DefaultChoreographerFrameClock.choreographer.removeFrameCallback(frameCallback);
            }
        });
        Object F = pVar.F();
        if (F == b.l()) {
            f.c(cVar);
        }
        return F;
    }
}
