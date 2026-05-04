package androidx.compose.ui.modifier;

import androidx.compose.runtime.Stable;
import kotlin.jvm.internal.v;
import m80.k;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@Stable
/* loaded from: classes.dex */
public abstract class ModifierLocal<T> {
    public static final int $stable = 0;

    @k
    private final a<T> defaultFactory;

    public /* synthetic */ ModifierLocal(a aVar, v vVar) {
        this(aVar);
    }

    @k
    public final a<T> getDefaultFactory$ui_release() {
        return this.defaultFactory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private ModifierLocal(a<? extends T> aVar) {
        this.defaultFactory = aVar;
    }
}
