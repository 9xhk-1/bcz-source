package androidx.compose.ui.tooling.data;

import androidx.compose.ui.unit.IntRect;
import java.util.List;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@UiToolingDataApi
/* loaded from: classes2.dex */
public interface SourceContext {
    @k
    IntRect getBounds();

    int getDepth();

    @l
    SourceLocation getLocation();

    @l
    String getName();

    @k
    List<ParameterInformation> getParameters();

    default boolean isInline() {
        return false;
    }
}
