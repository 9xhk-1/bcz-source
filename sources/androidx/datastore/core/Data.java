package androidx.datastore.core;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public final class Data<T> extends State<T> {
    private final int hashCode;
    private final T value;

    public Data(T t11, int i11, int i12) {
        super(i12, null);
        this.value = t11;
        this.hashCode = i11;
    }

    public final void checkHashCode() {
        T t11 = this.value;
        if ((t11 != null ? t11.hashCode() : 0) != this.hashCode) {
            throw new IllegalStateException("Data in DataStore was mutated but DataStore is only compatible with Immutable types.");
        }
    }

    public final int getHashCode() {
        return this.hashCode;
    }

    public final T getValue() {
        return this.value;
    }
}
