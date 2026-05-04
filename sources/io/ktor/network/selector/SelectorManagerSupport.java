package io.ktor.network.selector;

import c40.n;
import c40.p;
import j00.c;
import java.nio.channels.CancelledKeyException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.KotlinNothingValueException;
import kotlin.Result;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.intrinsics.b;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import l00.f;
import m80.k;
import m80.l;
import sx.e;
import sx.g;
import sx.i;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nSelectorManagerSupport.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectorManagerSupport.kt\nio/ktor/network/selector/SelectorManagerSupport\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 3 InterestSuspensionsMap.kt\nio/ktor/network/selector/InterestSuspensionsMap\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,185:1\n351#2,11:186\n32#3,8:197\n42#3,2:205\n45#3:208\n1#4:207\n1#4:210\n1863#5:209\n1864#5:211\n*S KotlinDebug\n*F\n+ 1 SelectorManagerSupport.kt\nio/ktor/network/selector/SelectorManagerSupport\n*L\n42#1:186,11\n84#1:197,8\n148#1:205,2\n148#1:208\n148#1:207\n159#1:209\n159#1:211\n*E\n"})
/* loaded from: classes8.dex */
public abstract class SelectorManagerSupport implements g {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SelectorProvider f61019a;

    /* renamed from: b, reason: collision with root package name */
    public int f61020b;

    /* renamed from: c, reason: collision with root package name */
    public int f61021c;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class ClosedSelectorCancellationException extends CancellationException {
        public ClosedSelectorCancellationException() {
            super("Closed selector");
        }
    }

    public SelectorManagerSupport() {
        SelectorProvider provider = SelectorProvider.provider();
        g0.o(provider, "provider(...)");
        this.f61019a = provider;
    }

    public final int C() {
        return this.f61020b;
    }

    public final e H(SelectionKey selectionKey) {
        Object attachment = selectionKey.attachment();
        if (attachment instanceof e) {
            return (e) attachment;
        }
        return null;
    }

    @Override // sx.g
    @l
    public final Object N4(@k e eVar, @k SelectInterest selectInterest, @k c<? super g2> cVar) {
        int x52 = eVar.x5();
        int flag = selectInterest.getFlag();
        if (eVar.isClosed()) {
            i.c();
            throw new KotlinNothingValueException();
        }
        if ((x52 & flag) == 0) {
            i.d(x52, flag);
            throw new KotlinNothingValueException();
        }
        p pVar = new p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar.y();
        pVar.p(a.f61022a);
        eVar.C4().j(selectInterest, pVar);
        if (!pVar.isCancelled()) {
            c0(eVar);
        }
        Object F = pVar.F();
        if (F == b.l()) {
            f.c(cVar);
        }
        return F == b.l() ? F : g2.f100423a;
    }

    public final void S(@k SelectionKey key) {
        n<g2> m11;
        g0.p(key, "key");
        try {
            int readyOps = key.readyOps();
            int interestOps = key.interestOps();
            e H = H(key);
            if (H == null) {
                key.cancel();
                this.f61021c++;
                return;
            }
            io.ktor.network.selector.a C4 = H.C4();
            int[] b11 = SelectInterest.Companion.b();
            int length = b11.length;
            for (int i11 = 0; i11 < length; i11++) {
                if ((b11[i11] & readyOps) != 0 && (m11 = C4.m(i11)) != null) {
                    Result.a aVar = Result.Companion;
                    m11.resumeWith(Result.m6308constructorimpl(g2.f100423a));
                }
            }
            int i12 = (~readyOps) & interestOps;
            if (i12 != interestOps) {
                key.interestOps(i12);
            }
            if (i12 != 0) {
                this.f61020b++;
            }
        } catch (Throwable th2) {
            key.cancel();
            this.f61021c++;
            e H2 = H(key);
            if (H2 != null) {
                i(H2, th2);
                v0(key, null);
            }
        }
    }

    public final void V(@k Set<SelectionKey> selectedKeys, @k Set<? extends SelectionKey> keys) {
        g0.p(selectedKeys, "selectedKeys");
        g0.p(keys, "keys");
        int size = selectedKeys.size();
        this.f61020b = keys.size() - size;
        this.f61021c = 0;
        if (size <= 0) {
            return;
        }
        Iterator<SelectionKey> it = selectedKeys.iterator();
        while (it.hasNext()) {
            S(it.next());
            it.remove();
        }
    }

    @Override // sx.g
    @k
    public final SelectorProvider X() {
        return this.f61019a;
    }

    public final void Z(@k Selector selector, @k SelectionKey key, @k e attachment) {
        g0.p(selector, "selector");
        g0.p(key, "key");
        g0.p(attachment, "attachment");
        i(attachment, new ClosedChannelException());
        v0(key, null);
        selector.wakeup();
    }

    public final void a(@k Selector selector, @k e selectable) {
        g0.p(selector, "selector");
        g0.p(selectable, "selectable");
        try {
            SelectableChannel channel = selectable.getChannel();
            SelectionKey keyFor = channel.keyFor(selector);
            int x52 = selectable.x5();
            if (keyFor == null) {
                if (x52 != 0) {
                    channel.register(selector, x52, selectable);
                }
            } else if (keyFor.interestOps() != x52) {
                keyFor.interestOps(x52);
            }
            if (x52 != 0) {
                this.f61020b++;
            }
        } catch (Throwable th2) {
            SelectionKey keyFor2 = selectable.getChannel().keyFor(selector);
            if (keyFor2 != null) {
                keyFor2.cancel();
            }
            i(selectable, th2);
        }
    }

    public abstract void c0(@k e eVar);

    public final void e(@k Selector selector, @l Throwable th2) {
        g0.p(selector, "selector");
        if (th2 == null) {
            th2 = new ClosedSelectorCancellationException();
        }
        Set<SelectionKey> keys = selector.keys();
        g0.o(keys, "keys(...)");
        for (SelectionKey selectionKey : keys) {
            try {
                if (selectionKey.isValid()) {
                    selectionKey.interestOps(0);
                }
            } catch (CancelledKeyException unused) {
            }
            Object attachment = selectionKey.attachment();
            e eVar = attachment instanceof e ? (e) attachment : null;
            if (eVar != null) {
                i(eVar, th2);
            }
            selectionKey.cancel();
        }
    }

    public final void i(@k e attachment, @k Throwable cause) {
        g0.p(attachment, "attachment");
        g0.p(cause, "cause");
        io.ktor.network.selector.a C4 = attachment.C4();
        for (SelectInterest selectInterest : SelectInterest.Companion.a()) {
            n<g2> n11 = C4.n(selectInterest);
            if (n11 != null) {
                Result.a aVar = Result.Companion;
                n11.resumeWith(Result.m6308constructorimpl(kotlin.e.a(cause)));
            }
        }
    }

    public final void m0(int i11) {
        this.f61021c = i11;
    }

    public final void o0(int i11) {
        this.f61020b = i11;
    }

    public final int r() {
        return this.f61021c;
    }

    public final void v0(SelectionKey selectionKey, e eVar) {
        selectionKey.attach(eVar);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class a implements x00.l<Throwable, g2> {

        /* renamed from: a, reason: collision with root package name */
        public static final a f61022a = new a();

        @Override // x00.l
        public /* bridge */ /* synthetic */ g2 invoke(Throwable th2) {
            a(th2);
            return g2.f100423a;
        }

        public final void a(Throwable th2) {
        }
    }
}
