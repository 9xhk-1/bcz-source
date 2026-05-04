package androidx.datastore.core;

import c40.l2;
import c40.r0;
import e40.o;
import e40.r;
import e40.s;
import j00.c;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import kotlinx.coroutines.channels.ClosedSendChannelException;
import m80.k;
import x00.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSimpleActor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n*L\n1#1,127:1\n548#2,5:128\n*S KotlinDebug\n*F\n+ 1 SimpleActor.kt\nandroidx/datastore/core/SimpleActor\n*L\n104#1:128,5\n*E\n"})
/* loaded from: classes2.dex */
public final class SimpleActor<T> {

    @k
    private final p<T, c<? super g2>, Object> consumeMessage;

    @k
    private final o<T> messageQueue;

    @k
    private final AtomicInt remainingMessages;

    @k
    private final r0 scope;

    /* JADX WARN: Multi-variable type inference failed */
    public SimpleActor(@k r0 scope, @k final l<? super Throwable, g2> onComplete, @k final p<? super T, ? super Throwable, g2> onUndeliveredElement, @k p<? super T, ? super c<? super g2>, ? extends Object> consumeMessage) {
        g0.p(scope, "scope");
        g0.p(onComplete, "onComplete");
        g0.p(onUndeliveredElement, "onUndeliveredElement");
        g0.p(consumeMessage, "consumeMessage");
        this.scope = scope;
        this.consumeMessage = consumeMessage;
        this.messageQueue = r.d(Integer.MAX_VALUE, null, null, 6, null);
        this.remainingMessages = new AtomicInt(0);
        l2 l2Var = (l2) scope.getCoroutineContext().get(l2.f7886e0);
        if (l2Var != null) {
            l2Var.z0(new l<Throwable, g2>() { // from class: androidx.datastore.core.SimpleActor.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(1);
                }

                @Override // x00.l
                public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
                    invoke2(th2);
                    return g2.f100423a;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@m80.l Throwable th2) {
                    g2 g2Var;
                    onComplete.invoke(th2);
                    ((SimpleActor) this).messageQueue.z(th2);
                    do {
                        Object h11 = s.h(((SimpleActor) this).messageQueue.O());
                        if (h11 != null) {
                            onUndeliveredElement.invoke(h11, th2);
                            g2Var = g2.f100423a;
                        } else {
                            g2Var = null;
                        }
                    } while (g2Var != null);
                }
            });
        }
    }

    public final void offer(T t11) {
        Object m11 = this.messageQueue.m(t11);
        if (m11 instanceof s.a) {
            Throwable f11 = s.f(m11);
            if (f11 != null) {
                throw f11;
            }
            throw new ClosedSendChannelException("Channel was closed normally");
        }
        if (!s.m(m11)) {
            throw new IllegalStateException("Check failed.");
        }
        if (this.remainingMessages.getAndIncrement() == 0) {
            c40.k.f(this.scope, null, null, new SimpleActor$offer$2(this, null), 3, null);
        }
    }
}
