package androidx.compose.ui.tooling.preview.datasource;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.compose.ui.tooling.preview.PreviewParameterProvider;
import java.util.List;
import kotlin.jvm.internal.Ref;
import m80.k;
import q30.k0;
import q30.m;
import q30.x;
import x00.a;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes2.dex */
public class LoremIpsum implements PreviewParameterProvider<String> {
    public static final int $stable = 0;
    private final int words;

    public LoremIpsum(int i11) {
        this.words = i11;
    }

    private final String generateLoremIpsum(int i11) {
        List list;
        final Ref.IntRef intRef = new Ref.IntRef();
        list = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE;
        final int size = list.size();
        return k0.H1(k0.E3(x.u(new a<String>() { // from class: androidx.compose.ui.tooling.preview.datasource.LoremIpsum$generateLoremIpsum$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // x00.a
            public final String invoke() {
                List list2;
                list2 = LoremIpsum_androidKt.LOREM_IPSUM_SOURCE;
                Ref.IntRef intRef2 = Ref.IntRef.this;
                int i12 = intRef2.element;
                intRef2.element = i12 + 1;
                return (String) list2.get(i12 % size);
            }
        }), i11), " ", null, null, 0, null, null, 62, null);
    }

    @Override // androidx.compose.ui.tooling.preview.PreviewParameterProvider
    @k
    public m<String> getValues() {
        return x.C(generateLoremIpsum(this.words));
    }

    public LoremIpsum() {
        this(500);
    }
}
