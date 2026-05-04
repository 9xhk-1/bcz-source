package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ContentInViewNode;
import androidx.compose.foundation.internal.InlineClassHelperKt;
import androidx.compose.runtime.collection.MutableVector;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.geometry.Rect;
import c40.n;
import g10.u;
import java.util.concurrent.CancellationException;
import kotlin.Result;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@u0({"SMAP\nBringIntoViewRequestPriorityQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 3 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n*L\n1#1,137:1\n1101#2:138\n1083#2,2:139\n516#3:141\n48#3:142\n472#3:143\n472#3:144\n447#3,9:145\n48#3:154\n472#3:155\n519#3:156\n44#3:157\n587#3,2:158\n472#3:160\n516#3:163\n13309#4,2:161\n50#5,5:164\n*S KotlinDebug\n*F\n+ 1 BringIntoViewRequestPriorityQueue.kt\nandroidx/compose/foundation/gestures/BringIntoViewRequestPriorityQueue\n*L\n43#1:138\n43#1:139,2\n48#1:141\n72#1:142\n73#1:143\n92#1:144\n108#1:145,9\n112#1:154\n113#1:155\n120#1:156\n122#1:157\n133#1:158,2\n133#1:160\n134#1:163\n133#1:161,2\n134#1:164,5\n*E\n"})
/* loaded from: classes.dex */
public final class BringIntoViewRequestPriorityQueue {
    public static final int $stable = MutableVector.$stable;

    @k
    private final MutableVector<ContentInViewNode.Request> requests = new MutableVector<>(new ContentInViewNode.Request[16], 0);

    public final void cancelAndRemoveAll(@l Throwable th2) {
        MutableVector<ContentInViewNode.Request> mutableVector = this.requests;
        int size = mutableVector.getSize();
        n[] nVarArr = new n[size];
        for (int i11 = 0; i11 < size; i11++) {
            nVarArr[i11] = mutableVector.content[i11].getContinuation();
        }
        for (int i12 = 0; i12 < size; i12++) {
            nVarArr[i12].a(th2);
        }
        if (this.requests.getSize() == 0) {
            return;
        }
        InlineClassHelperKt.throwIllegalStateException("uncancelled requests present");
    }

    public final boolean enqueue(@k final ContentInViewNode.Request request) {
        Rect invoke = request.getCurrentBounds().invoke();
        if (invoke == null) {
            n<g2> continuation = request.getContinuation();
            Result.a aVar = Result.Companion;
            continuation.resumeWith(Result.m6308constructorimpl(g2.f100423a));
            return false;
        }
        request.getContinuation().p(new x00.l<Throwable, g2>() { // from class: androidx.compose.foundation.gestures.BringIntoViewRequestPriorityQueue$enqueue$1
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
                BringIntoViewRequestPriorityQueue.this.requests.remove(request);
            }
        });
        g10.l W1 = u.W1(0, this.requests.getSize());
        int d11 = W1.d();
        int f11 = W1.f();
        if (d11 <= f11) {
            while (true) {
                Rect invoke2 = this.requests.content[f11].getCurrentBounds().invoke();
                if (invoke2 != null) {
                    Rect intersect = invoke.intersect(invoke2);
                    if (g0.g(intersect, invoke)) {
                        this.requests.add(f11 + 1, request);
                        return true;
                    }
                    if (!g0.g(intersect, invoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= f11) {
                            while (true) {
                                this.requests.content[f11].getContinuation().a(cancellationException);
                                if (size == f11) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (f11 == d11) {
                    break;
                }
                f11--;
            }
        }
        this.requests.add(0, request);
        return true;
    }

    public final void forEachFromSmallest(@k x00.l<? super Rect, g2> lVar) {
        MutableVector mutableVector = this.requests;
        int size = mutableVector.getSize() - 1;
        Object[] objArr = mutableVector.content;
        if (size < objArr.length) {
            while (size >= 0) {
                lVar.invoke(((ContentInViewNode.Request) objArr[size]).getCurrentBounds().invoke());
                size--;
            }
        }
    }

    public final int getSize() {
        return this.requests.getSize();
    }

    public final boolean isEmpty() {
        return this.requests.getSize() == 0;
    }

    public final void resumeAndRemoveAll() {
        g10.l W1 = u.W1(0, this.requests.getSize());
        int d11 = W1.d();
        int f11 = W1.f();
        if (d11 <= f11) {
            while (true) {
                n<g2> continuation = this.requests.content[d11].getContinuation();
                g2 g2Var = g2.f100423a;
                Result.a aVar = Result.Companion;
                continuation.resumeWith(Result.m6308constructorimpl(g2Var));
                if (d11 == f11) {
                    break;
                } else {
                    d11++;
                }
            }
        }
        this.requests.clear();
    }

    public final void resumeAndRemoveWhile(@k x00.l<? super Rect, Boolean> lVar) {
        while (this.requests.getSize() != 0 && lVar.invoke(((ContentInViewNode.Request) this.requests.last()).getCurrentBounds().invoke()).booleanValue()) {
            n<g2> continuation = ((ContentInViewNode.Request) this.requests.removeAt(this.requests.getSize() - 1)).getContinuation();
            g2 g2Var = g2.f100423a;
            Result.a aVar = Result.Companion;
            continuation.resumeWith(Result.m6308constructorimpl(g2Var));
        }
    }
}
