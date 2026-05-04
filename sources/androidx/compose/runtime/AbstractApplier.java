package androidx.compose.runtime;

import a00.r0;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes.dex */
public abstract class AbstractApplier<T> implements Applier<T> {
    public static final int $stable = 8;
    private T current;
    private final T root;

    @k
    private final ArrayList<T> stack = Stack.m1936constructorimpl$default(null, 1, null);

    public AbstractApplier(T t11) {
        this.root = t11;
        this.current = t11;
    }

    @Override // androidx.compose.runtime.Applier
    public final void clear() {
        Stack.m1934clearimpl(this.stack);
        setCurrent(this.root);
        onClear();
    }

    @Override // androidx.compose.runtime.Applier
    public void down(T t11) {
        Stack.m1946pushimpl(this.stack, getCurrent());
        setCurrent(t11);
    }

    @Override // androidx.compose.runtime.Applier
    public T getCurrent() {
        return this.current;
    }

    public final T getRoot() {
        return this.root;
    }

    public final void move(@k List<T> list, int i11, int i12, int i13) {
        int i14 = i11 > i12 ? i12 : i12 - i13;
        if (i13 != 1) {
            List<T> subList = list.subList(i11, i13 + i11);
            List d62 = r0.d6(subList);
            subList.clear();
            list.addAll(i14, d62);
            return;
        }
        if (i11 == i12 + 1 || i11 == i12 - 1) {
            list.set(i11, list.set(i12, list.get(i11)));
        } else {
            list.add(i14, list.remove(i11));
        }
    }

    public abstract void onClear();

    public final void remove(@k List<T> list, int i11, int i12) {
        if (i12 == 1) {
            list.remove(i11);
        } else {
            list.subList(i11, i12 + i11).clear();
        }
    }

    public void setCurrent(T t11) {
        this.current = t11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.runtime.Applier
    public void up() {
        setCurrent(Stack.m1945popimpl(this.stack));
    }
}
