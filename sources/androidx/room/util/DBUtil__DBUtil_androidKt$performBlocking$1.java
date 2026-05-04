package androidx.room.util;

import androidx.room.RoomDatabase;
import androidx.sqlite.SQLiteConnection;
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
@d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performBlocking$1", f = "DBUtil.android.kt", i = {}, l = {R.styleable.Theme_drawable_walk_sound3}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1\n+ 2 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n1#1,246:1\n48#2:247\n67#2:248\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$performBlocking$1\n*L\n74#1:247\n74#1:248\n*E\n"})
/* loaded from: classes3.dex */
public final class DBUtil__DBUtil_androidKt$performBlocking$1<R> extends SuspendLambda implements p<r0, c<? super R>, Object> {
    final /* synthetic */ l<SQLiteConnection, R> $block;
    final /* synthetic */ RoomDatabase $db;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtil_androidKt$performBlocking$1(RoomDatabase roomDatabase, boolean z11, boolean z12, l<? super SQLiteConnection, ? extends R> lVar, c<? super DBUtil__DBUtil_androidKt$performBlocking$1> cVar) {
        super(2, cVar);
        this.$db = roomDatabase;
        this.$inTransaction = z11;
        this.$isReadOnly = z12;
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DBUtil__DBUtil_androidKt$performBlocking$1(this.$db, this.$inTransaction, this.$isReadOnly, this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super R> cVar) {
        return ((DBUtil__DBUtil_androidKt$performBlocking$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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
        boolean z11 = !(this.$db.inCompatibilityMode$room_runtime_release() && this.$db.inTransaction()) && this.$inTransaction;
        RoomDatabase roomDatabase = this.$db;
        boolean z12 = this.$isReadOnly;
        DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1(z11, z12, roomDatabase, null, this.$block);
        this.label = 1;
        Object useConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z12, dBUtil__DBUtil_androidKt$performBlocking$1$invokeSuspend$$inlined$internalPerform$1, this);
        return useConnection$room_runtime_release == l11 ? l11 : useConnection$room_runtime_release;
    }
}
