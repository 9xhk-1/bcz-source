package androidx.datastore.core;

import kotlin.jvm.internal.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public abstract class State<T> {
    private final int version;

    public /* synthetic */ State(int i11, v vVar) {
        this(i11);
    }

    public final int getVersion() {
        return this.version;
    }

    private State(int i11) {
        this.version = i11;
    }
}
