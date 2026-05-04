package androidx.room;

import c40.n3;
import c40.r0;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Result;
import kotlin.coroutines.d;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import yz.g2;
import yz.w0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nRoomDatabase.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabaseKt__RoomDatabase_androidKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,2151:1\n314#2,11:2152\n*S KotlinDebug\n*F\n+ 1 RoomDatabase.android.kt\nandroidx/room/RoomDatabaseKt__RoomDatabase_androidKt\n*L\n2038#1:2152,11\n*E\n"})
/* loaded from: classes3.dex */
final /* synthetic */ class RoomDatabaseKt__RoomDatabase_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final kotlin.coroutines.d createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(RoomDatabase roomDatabase, kotlin.coroutines.c cVar) {
        TransactionElement transactionElement = new TransactionElement(cVar);
        return cVar.plus(transactionElement).plus(n3.a(roomDatabase.getSuspendingTransactionId(), Integer.valueOf(System.identityHashCode(transactionElement))));
    }

    @yz.n(message = "Replaced by equivalent API in InvalidationTracker.", replaceWith = @w0(expression = "this.invalidationTracker.createFlow(*tables)", imports = {}))
    @m80.k
    public static final kotlinx.coroutines.flow.i<Set<String>> invalidationTrackerFlow(@m80.k RoomDatabase roomDatabase, @m80.k String[] tables, boolean z11) {
        g0.p(roomDatabase, "<this>");
        g0.p(tables, "tables");
        return roomDatabase.getInvalidationTracker().createFlow((String[]) Arrays.copyOf(tables, tables.length), z11);
    }

    public static /* synthetic */ kotlinx.coroutines.flow.i invalidationTrackerFlow$default(RoomDatabase roomDatabase, String[] strArr, boolean z11, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            z11 = true;
        }
        return RoomDatabaseKt.invalidationTrackerFlow(roomDatabase, strArr, z11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R> Object startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(final RoomDatabase roomDatabase, final kotlin.coroutines.d dVar, final x00.p<? super r0, ? super j00.c<? super R>, ? extends Object> pVar, j00.c<? super R> cVar) {
        final c40.p pVar2 = new c40.p(IntrinsicsKt__IntrinsicsJvmKt.e(cVar), 1);
        pVar2.y();
        try {
            roomDatabase.getTransactionExecutor().execute(new Runnable() { // from class: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1

                /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
                @l00.d(c = "androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1", f = "RoomDatabase.android.kt", i = {}, l = {2048}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: androidx.room.RoomDatabaseKt__RoomDatabase_androidKt$startTransactionCoroutine$2$1$1, reason: invalid class name */
                public static final class AnonymousClass1 extends SuspendLambda implements x00.p<r0, j00.c<? super g2>, Object> {
                    final /* synthetic */ c40.n<R> $continuation;
                    final /* synthetic */ RoomDatabase $this_startTransactionCoroutine;
                    final /* synthetic */ x00.p<r0, j00.c<? super R>, Object> $transactionBlock;
                    private /* synthetic */ Object L$0;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    public AnonymousClass1(RoomDatabase roomDatabase, c40.n<? super R> nVar, x00.p<? super r0, ? super j00.c<? super R>, ? extends Object> pVar, j00.c<? super AnonymousClass1> cVar) {
                        super(2, cVar);
                        this.$this_startTransactionCoroutine = roomDatabase;
                        this.$continuation = nVar;
                        this.$transactionBlock = pVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final j00.c<g2> create(Object obj, j00.c<?> cVar) {
                        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_startTransactionCoroutine, this.$continuation, this.$transactionBlock, cVar);
                        anonymousClass1.L$0 = obj;
                        return anonymousClass1;
                    }

                    @Override // x00.p
                    public final Object invoke(r0 r0Var, j00.c<? super g2> cVar) {
                        return ((AnonymousClass1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    public final Object invokeSuspend(Object obj) {
                        kotlin.coroutines.d createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt;
                        j00.c cVar;
                        Object l11 = kotlin.coroutines.intrinsics.b.l();
                        int i11 = this.label;
                        if (i11 == 0) {
                            kotlin.e.n(obj);
                            d.b bVar = ((r0) this.L$0).getCoroutineContext().get(kotlin.coroutines.c.f66933w0);
                            g0.m(bVar);
                            createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt = RoomDatabaseKt__RoomDatabase_androidKt.createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt(this.$this_startTransactionCoroutine, (kotlin.coroutines.c) bVar);
                            j00.c cVar2 = this.$continuation;
                            Result.a aVar = Result.Companion;
                            x00.p<r0, j00.c<? super R>, Object> pVar = this.$transactionBlock;
                            this.L$0 = cVar2;
                            this.label = 1;
                            obj = c40.i.h(createTransactionContext$RoomDatabaseKt__RoomDatabase_androidKt, pVar, this);
                            if (obj == l11) {
                                return l11;
                            }
                            cVar = cVar2;
                        } else {
                            if (i11 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            cVar = (j00.c) this.L$0;
                            kotlin.e.n(obj);
                        }
                        cVar.resumeWith(Result.m6308constructorimpl(obj));
                        return g2.f100423a;
                    }
                }

                @Override // java.lang.Runnable
                public final void run() {
                    try {
                        c40.i.f(kotlin.coroutines.d.this.minusKey(kotlin.coroutines.c.f66933w0), new AnonymousClass1(roomDatabase, pVar2, pVar, null));
                    } catch (Throwable th2) {
                        pVar2.a(th2);
                    }
                }
            });
        } catch (RejectedExecutionException e11) {
            pVar2.a(new IllegalStateException("Unable to acquire a thread to perform the database transaction.", e11));
        }
        Object F = pVar2.F();
        if (F == kotlin.coroutines.intrinsics.b.l()) {
            l00.f.c(cVar);
        }
        return F;
    }

    @m80.l
    public static final <R> Object withTransaction(@m80.k RoomDatabase roomDatabase, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar, @m80.k j00.c<? super R> cVar) {
        return RoomDatabaseKt.withTransactionContext(roomDatabase, new RoomDatabaseKt__RoomDatabase_androidKt$withTransaction$2(roomDatabase, lVar, null), cVar);
    }

    @m80.l
    public static final <R> Object withTransactionContext(@m80.k RoomDatabase roomDatabase, @m80.k x00.l<? super j00.c<? super R>, ? extends Object> lVar, @m80.k j00.c<? super R> cVar) {
        RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1 = new RoomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1(lVar, null);
        TransactionElement transactionElement = (TransactionElement) cVar.getContext().get(TransactionElement.Key);
        kotlin.coroutines.c transactionDispatcher$room_runtime_release = transactionElement != null ? transactionElement.getTransactionDispatcher$room_runtime_release() : null;
        return transactionDispatcher$room_runtime_release != null ? c40.i.h(transactionDispatcher$room_runtime_release, roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, cVar) : startTransactionCoroutine$RoomDatabaseKt__RoomDatabase_androidKt(roomDatabase, cVar.getContext(), roomDatabaseKt__RoomDatabase_androidKt$withTransactionContext$transactionBlock$1, cVar);
    }
}
