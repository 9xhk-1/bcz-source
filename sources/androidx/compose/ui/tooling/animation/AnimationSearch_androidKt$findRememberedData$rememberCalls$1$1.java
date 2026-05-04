package androidx.compose.ui.tooling.animation;

import androidx.compose.ui.tooling.data.Group;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.g0;
import x00.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 extends Lambda implements l<Group, Boolean> {
    public static final AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1 INSTANCE = new AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1();

    public AnimationSearch_androidKt$findRememberedData$rememberCalls$1$1() {
        super(1);
    }

    @Override // x00.l
    public final Boolean invoke(Group group) {
        return Boolean.valueOf(g0.g(group.getName(), "remember"));
    }
}
