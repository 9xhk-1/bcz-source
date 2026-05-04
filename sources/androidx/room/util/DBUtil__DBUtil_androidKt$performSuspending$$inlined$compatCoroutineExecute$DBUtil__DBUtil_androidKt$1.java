package androidx.room.util;

import androidx.room.RoomDatabase;
import c40.r0;
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
@d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
@u0({"SMAP\nDBUtil.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt$compatCoroutineExecute$2\n+ 2 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n+ 3 DBUtil.kt\nandroidx/room/util/DBUtil__DBUtilKt\n*L\n1#1,111:1\n53#2:112\n56#2:115\n48#3:113\n67#3:114\n*S KotlinDebug\n*F\n+ 1 DBUtil.android.kt\nandroidx/room/util/DBUtil__DBUtil_androidKt\n*L\n53#1:113\n53#1:114\n*E\n"})
/* loaded from: classes3.dex */
public final class DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1<R> extends SuspendLambda implements p<r0, c<? super R>, Object> {
    final /* synthetic */ l $block$inlined;
    final /* synthetic */ RoomDatabase $db$inlined;
    final /* synthetic */ boolean $inTransaction$inlined;
    final /* synthetic */ boolean $isReadOnly$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(c cVar, RoomDatabase roomDatabase, boolean z11, boolean z12, l lVar) {
        super(2, cVar);
        this.$db$inlined = roomDatabase;
        this.$isReadOnly$inlined = z11;
        this.$inTransaction$inlined = z12;
        this.$block$inlined = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(cVar, this.$db$inlined, this.$isReadOnly$inlined, this.$inTransaction$inlined, this.$block$inlined);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super R> cVar) {
        return ((DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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
        RoomDatabase roomDatabase = this.$db$inlined;
        boolean z11 = this.$isReadOnly$inlined;
        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(this.$inTransaction$inlined, z11, roomDatabase, null, this.$block$inlined);
        this.label = 1;
        Object useConnection$room_runtime_release = roomDatabase.useConnection$room_runtime_release(z11, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, this);
        return useConnection$room_runtime_release == l11 ? l11 : useConnection$room_runtime_release;
    }
}
