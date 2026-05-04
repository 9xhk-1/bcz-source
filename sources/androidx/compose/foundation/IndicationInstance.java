package androidx.compose.foundation;

import androidx.compose.ui.graphics.drawscope.ContentDrawScope;
import kotlin.DeprecationLevel;
import yz.n;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@n(level = DeprecationLevel.ERROR, message = "IndicationInstance has been deprecated along with the rememberUpdatedInstance that returns it. Indication implementations should instead use Modifier.Node APIs, and should be returned from IndicationNodeFactory#create. For a migration guide and background information, please visit developer.android.com")
/* loaded from: classes.dex */
public interface IndicationInstance {
    void drawIndication(@m80.k ContentDrawScope contentDrawScope);
}
