package androidx.compose.foundation.layout;

import kotlin.jvm.internal.v;
import yz.c0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
final class LazyImpl implements c0<Integer> {

    @m80.k
    public static final Companion Companion = new Companion(null);
    public static final int UNINITIALIZED_VALUE = -1;
    private int _value = -1;

    @m80.k
    private final String errorMessage;

    @m80.k
    private final x00.a<Integer> initializer;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final class Companion {
        public /* synthetic */ Companion(v vVar) {
            this();
        }

        private Companion() {
        }
    }

    public LazyImpl(@m80.k x00.a<Integer> aVar, @m80.k String str) {
        this.initializer = aVar;
        this.errorMessage = str;
    }

    @m80.k
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    @m80.k
    public final x00.a<Integer> getInitializer() {
        return this.initializer;
    }

    @Override // yz.c0
    public boolean isInitialized() {
        return this._value != -1;
    }

    @m80.k
    public String toString() {
        return isInitialized() ? String.valueOf(getValue().intValue()) : this.errorMessage;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // yz.c0
    @m80.k
    public Integer getValue() {
        if (this._value == -1) {
            this._value = this.initializer.invoke().intValue();
        }
        int i11 = this._value;
        if (i11 != -1) {
            return Integer.valueOf(i11);
        }
        throw new IllegalStateException(this.errorMessage);
    }
}
