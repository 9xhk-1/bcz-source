package kotlin.reflect.full;

import kotlin.jvm.internal.g0;
import m80.k;
import yz.y0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@y0(version = "1.1")
/* loaded from: classes8.dex */
public final class IllegalPropertyDelegateAccessException extends Exception {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IllegalPropertyDelegateAccessException(@k IllegalAccessException cause) {
        super("Cannot obtain the delegate of a non-accessible property. Use \"isAccessible = true\" to make the property accessible", cause);
        g0.p(cause, "cause");
    }
}
