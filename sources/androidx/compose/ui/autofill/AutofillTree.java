package androidx.compose.ui.autofill;

import androidx.compose.runtime.internal.StabilityInferred;
import java.util.LinkedHashMap;
import java.util.Map;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
@yz.n(message = "\n        Use the new semantics-based Autofill APIs androidx.compose.ui.autofill.ContentType and\n        androidx.compose.ui.autofill.ContentDataType instead.\n        ")
/* loaded from: classes.dex */
public final class AutofillTree {
    public static final int $stable = 8;

    @m80.k
    private final Map<Integer, AutofillNode> children = new LinkedHashMap();

    @m80.k
    public final Map<Integer, AutofillNode> getChildren() {
        return this.children;
    }

    @m80.l
    public final g2 performAutofill(int i11, @m80.k String str) {
        x00.l<String, g2> onFill;
        AutofillNode autofillNode = this.children.get(Integer.valueOf(i11));
        if (autofillNode == null || (onFill = autofillNode.getOnFill()) == null) {
            return null;
        }
        onFill.invoke(str);
        return g2.f100423a;
    }

    public final void plusAssign(@m80.k AutofillNode autofillNode) {
        this.children.put(Integer.valueOf(autofillNode.getId()), autofillNode);
    }
}
