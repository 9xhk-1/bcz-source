package androidx.databinding;

import androidx.annotation.Nullable;
import java.io.Serializable;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes2.dex */
public class ObservableField<T> extends BaseObservableField implements Serializable {
    static final long serialVersionUID = 1;
    private T mValue;

    public ObservableField(T t11) {
        this.mValue = t11;
    }

    @Nullable
    public T get() {
        return this.mValue;
    }

    public void set(T t11) {
        if (t11 != this.mValue) {
            this.mValue = t11;
            notifyChange();
        }
    }

    public ObservableField() {
    }

    public ObservableField(Observable... observableArr) {
        super(observableArr);
    }
}
