package androidx.compose.ui.platform;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class ValueElementSequence implements q30.m<ValueElement> {
    public static final int $stable = 8;

    @m80.k
    private final List<ValueElement> elements = new ArrayList();

    @Override // q30.m
    @m80.k
    public Iterator<ValueElement> iterator() {
        return this.elements.iterator();
    }

    public final void set(@m80.k String str, @m80.l Object obj) {
        this.elements.add(new ValueElement(str, obj));
    }
}
