package com.mob.commons;

import com.mob.tools.proguard.PublicMemberKeeper;

@Deprecated
/* loaded from: classes7.dex */
public class ForbThrowable extends Throwable implements PublicMemberKeeper {
    public ForbThrowable() {
        super("Service is forbidden currently");
    }

    public ForbThrowable(String str) {
        super(str);
    }
}
