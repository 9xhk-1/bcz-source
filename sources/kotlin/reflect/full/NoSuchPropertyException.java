package kotlin.reflect.full;

import kotlin.jvm.internal.v;
import m80.l;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.1")
/* loaded from: classes8.dex */
public final class NoSuchPropertyException extends Exception {
    /* JADX WARN: Multi-variable type inference failed */
    public NoSuchPropertyException() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public NoSuchPropertyException(@l Exception exc) {
        super(exc);
    }

    public /* synthetic */ NoSuchPropertyException(Exception exc, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : exc);
    }
}
