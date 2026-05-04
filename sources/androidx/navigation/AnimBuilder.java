package androidx.navigation;

import androidx.annotation.AnimRes;
import androidx.annotation.AnimatorRes;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@NavOptionsDsl
/* loaded from: classes3.dex */
public final class AnimBuilder {

    @AnimRes
    @AnimatorRes
    private int enter = -1;

    @AnimRes
    @AnimatorRes
    private int exit = -1;

    @AnimRes
    @AnimatorRes
    private int popEnter = -1;

    @AnimRes
    @AnimatorRes
    private int popExit = -1;

    public final int getEnter() {
        return this.enter;
    }

    public final int getExit() {
        return this.exit;
    }

    public final int getPopEnter() {
        return this.popEnter;
    }

    public final int getPopExit() {
        return this.popExit;
    }

    public final void setEnter(int i11) {
        this.enter = i11;
    }

    public final void setExit(int i11) {
        this.exit = i11;
    }

    public final void setPopEnter(int i11) {
        this.popEnter = i11;
    }

    public final void setPopExit(int i11) {
        this.popExit = i11;
    }
}
