package androidx.room.util;

import androidx.room.RoomDatabase;
import c40.r0;
import com.jiongji.andriod.card.R;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import kotlin.jvm.internal.u0;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performInTransactionSuspending$3", f = "DBUtil.android.kt", i = {}, l = {R.styleable.Theme_drawable_walk_sound3}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$3\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n1#1,246:1\n48#2:247\n67#2:248\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performInTransactionSuspending$3\n*L\n95#1:247\n95#1:248\n*E\n"})
/* loaded from: classes3.dex */
public final class DBUtil__DBUtil_androidKt$performInTransactionSuspending$3<R> extends SuspendLambda implements p<r0, c<? super R>, Object> {
    final /* synthetic */ l<c<? super R>, Object> $block;
    final /* synthetic */ RoomDatabase $db;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtil_androidKt$performInTransactionSuspending$3(RoomDatabase roomDatabase, l<? super c<? super R>, ? extends Object> lVar, c<? super DBUtil__DBUtil_androidKt$performInTransactionSuspending$3> cVar) {
        super(2, cVar);
        this.$db = roomDatabase;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DBUtil__DBUtil_androidKt$performInTransactionSuspending$3(this.$db, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super R> cVar) {
        return ((DBUtil__DBUtil_androidKt$performInTransactionSuspending$3) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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
        RoomDatabase roomDatabase = this.$db;
        DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1(true, false, roomDatabase, null, this.$block);
        this.label = 1;
        Object useConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(false, dBUtil__DBUtil_androidKt$performInTransactionSuspending$3$invokeSuspend$$inlined$internalPerform$1, this);
        return useConnection$room_runtime_release == l11 ? l11 : useConnection$room_runtime_release;
    }
}
