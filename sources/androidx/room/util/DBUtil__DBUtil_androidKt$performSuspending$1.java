package androidx.room.util;

import com.jiongji.andriod.card.R;
import j00.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import l00.d;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@d(c = "androidx.room.util.DBUtil__DBUtil_androidKt", f = "DBUtil.android.kt", i = {1, 1, 1, 1}, l = {249, R.styleable.Theme_drawable_wiki_sound, R.styleable.Theme_drawable_wiki_sound}, m = "performSuspending", n = {"db", "block", "isReadOnly", "inTransaction"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
/* loaded from: classes3.dex */
public final class DBUtil__DBUtil_androidKt$performSuspending$1<R> extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    int label;
    /* synthetic */ Object result;

    public DBUtil__DBUtil_androidKt$performSuspending$1(c<? super DBUtil__DBUtil_androidKt$performSuspending$1> cVar) {
        super(cVar);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DBUtil.performSuspending(null, false, false, null, this);
    }
}
