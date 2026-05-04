package androidx.room.util;

import androidx.room.RoomDatabase;
import androidx.room.TransactionScope;
import androidx.room.Transactor;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.d0;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1", f = "DBUtil.android.kt", i = {0, 0, 1, 1, 2, 3}, l = {56, 57, 59, 60, 67}, m = "invokeSuspend", n = {"transactor", "type", "transactor", "type", "transactor", "result"}, s = {"L$0", "L$1", "L$0", "L$1", "L$0", "L$0"})
@u0({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$3\n*L\n1#1,66:1\n95#2:67\n*E\n"})
/* loaded from: classes3.dex */
public final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1<R> extends SuspendLambda implements p<Transactor, c<? super R>, Object> {
    final /* synthetic */ l $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ RoomDatabase $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1$1", f = "DBUtil.android.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
    @u0({"SMAP\nDBUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt$internalPerform$2$result$1\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$3\n*L\n1#1,59:1\n95#2:60\n*E\n"})
    /* renamed from: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1$1, reason: invalid class name */
    public static final class AnonymousClass1 extends SuspendLambda implements p<TransactionScope<R>, c<? super R>, Object> {
        final /* synthetic */ l $block$inlined;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(c cVar, l lVar) {
            super(2, cVar);
            this.$block$inlined = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final c<g2> create(Object obj, c<?> cVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(cVar, this.$block$inlined);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // x00.p
        public final Object invoke(TransactionScope<R> transactionScope, c<? super R> cVar) {
            return ((AnonymousClass1) create(transactionScope, cVar)).invokeSuspend(g2.f100423a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object l11 = b.l();
            int i11 = this.label;
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                e.n(obj);
                return obj;
            }
            e.n(obj);
            l lVar = this.$block$inlined;
            this.label = 1;
            d0.e(6);
            Object invoke = lVar.invoke(this);
            d0.e(7);
            return invoke == l11 ? l11 : invoke;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1(boolean z11, boolean z12, RoomDatabase roomDatabase, c cVar, l lVar) {
        super(2, cVar);
        this.$inTransaction = z11;
        this.$isReadOnly = z12;
        this.$this_internalPerform = roomDatabase;
        this.$block$inlined = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1(this.$inTransaction, this.$isReadOnly, this.$this_internalPerform, cVar, this.$block$inlined);
        dBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1.L$0 = obj;
        return dBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1;
    }

    @Override // x00.p
    public final Object invoke(Transactor transactor, c<? super R> cVar) {
        return ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1) create(transactor, cVar)).invokeSuspend(g2.f100423a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00a5, code lost:
    
        if (r9 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008b, code lost:
    
        if (r9.sync$room_runtime_release(r8) == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00c1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            Method dump skipped, instructions count: 224
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
