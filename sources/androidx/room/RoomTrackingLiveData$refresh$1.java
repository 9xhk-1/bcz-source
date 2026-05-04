package androidx.room;

import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@l00.d(c = "androidx.room.RoomTrackingLiveData", f = "RoomTrackingLiveData.android.kt", i = {0, 0}, l = {82}, m = com.alipay.sdk.m.x.d.f11177w, n = {"this", "computed"}, s = {"L$0", "I$0"})
/* loaded from: classes3.dex */
public final class RoomTrackingLiveData$refresh$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RoomTrackingLiveData<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomTrackingLiveData$refresh$1(RoomTrackingLiveData<T> roomTrackingLiveData, j00.c<? super RoomTrackingLiveData$refresh$1> cVar) {
        super(cVar);
        this.this$0 = roomTrackingLiveData;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @m80.l
    public final Object invokeSuspend(@m80.k Object obj) {
        Object refresh;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        refresh = this.this$0.refresh(this);
        return refresh;
    }
}
