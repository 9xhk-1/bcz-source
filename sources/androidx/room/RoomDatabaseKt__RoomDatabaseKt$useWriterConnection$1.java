package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.RoomDatabaseKt__RoomDatabaseKt", f = "RoomDatabase.kt", i = {0}, l = {496}, m = "useWriterConnection", n = {"$this$useWriterConnection"}, s = {"L$0"})
/* loaded from: classes3.dex */
public final class RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1<R> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    public RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1(j00.c<? super RoomDatabaseKt__RoomDatabaseKt$useWriterConnection$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RoomDatabaseKt.useWriterConnection(null, null, this);
    }
}
