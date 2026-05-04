package androidx.compose.ui.layout;

import androidx.compose.runtime.Composer;
import java.util.List;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SubcomposeMeasureScope extends MeasureScope {
    @k
    List<Measurable> subcompose(@l Object obj, @k p<? super Composer, ? super Integer, g2> pVar);
}
