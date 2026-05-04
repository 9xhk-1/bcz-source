package androidx.navigation;

import kotlin.jvm.internal.g0;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class NamedNavArgument {

    @k
    private final NavArgument argument;

    @k
    private final String name;

    public NamedNavArgument(@k String name, @k NavArgument argument) {
        g0.p(name, "name");
        g0.p(argument, "argument");
        this.name = name;
        this.argument = argument;
    }

    @k
    public final String component1() {
        return this.name;
    }

    @k
    public final NavArgument component2() {
        return this.argument;
    }

    @k
    public final NavArgument getArgument() {
        return this.argument;
    }

    @k
    public final String getName() {
        return this.name;
    }
}
