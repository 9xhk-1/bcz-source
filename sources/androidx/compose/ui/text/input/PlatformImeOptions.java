package androidx.compose.ui.text.input;

import androidx.compose.runtime.Immutable;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.v;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Immutable
/* loaded from: classes2.dex */
public final class PlatformImeOptions {
    public static final int $stable = 0;

    @l
    private final String privateImeOptions;

    /* JADX WARN: Multi-variable type inference failed */
    public PlatformImeOptions() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PlatformImeOptions) && g0.g(this.privateImeOptions, ((PlatformImeOptions) obj).privateImeOptions);
    }

    @l
    public final String getPrivateImeOptions() {
        return this.privateImeOptions;
    }

    public int hashCode() {
        String str = this.privateImeOptions;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    @k
    public String toString() {
        return "PlatformImeOptions(privateImeOptions=" + this.privateImeOptions + ')';
    }

    public PlatformImeOptions(@l String str) {
        this.privateImeOptions = str;
    }

    public /* synthetic */ PlatformImeOptions(String str, int i11, v vVar) {
        this((i11 & 1) != 0 ? null : str);
    }
}
