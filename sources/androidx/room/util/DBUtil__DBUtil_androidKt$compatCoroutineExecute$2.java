package androidx.room.util;

import c40.r0;
import j00.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.e;
import l00.d;
import x00.l;
import x00.p;
import yz.g2;

/* JADX INFO: Add missing generic type declarations: [R] */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.room.util.DBUtil__DBUtil_androidKt$compatCoroutineExecute$2", f = "DBUtil.android.kt", i = {}, l = {111}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class DBUtil__DBUtil_androidKt$compatCoroutineExecute$2<R> extends SuspendLambda implements p<r0, c<? super R>, Object> {
    final /* synthetic */ l<c<? super R>, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(l<? super c<? super R>, ? extends Object> lVar, c<? super DBUtil__DBUtil_androidKt$compatCoroutineExecute$2> cVar) {
        super(2, cVar);
        this.$block = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final c<g2> create(Object obj, c<?> cVar) {
        return new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(this.$block, cVar);
    }

    @Override // x00.p
    public final Object invoke(r0 r0Var, c<? super R> cVar) {
        return ((DBUtil__DBUtil_androidKt$compatCoroutineExecute$2) create(r0Var, cVar)).invokeSuspend(g2.f100423a);
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
        l<c<? super R>, Object> lVar = this.$block;
        this.label = 1;
        Object invoke = lVar.invoke(this);
        return invoke == l11 ? l11 : invoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$block.invoke(this);
    }
}
