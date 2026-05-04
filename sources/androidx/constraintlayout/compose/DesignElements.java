package androidx.constraintlayout.compose;

import androidx.compose.runtime.ComposableInferredTarget;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.HashMap;
import m80.k;
import x00.r;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes2.dex */
public final class DesignElements {

    @k
    public static final DesignElements INSTANCE = new DesignElements();

    @k
    private static HashMap<String, r<String, HashMap<String, String>, Composer, Integer, g2>> map = new HashMap<>();
    public static final int $stable = 8;

    private DesignElements() {
    }

    @ComposableInferredTarget(scheme = "[0[0]]")
    public final void define(@k String str, @k r<? super String, ? super HashMap<String, String>, ? super Composer, ? super Integer, g2> rVar) {
        map.put(str, rVar);
    }

    @k
    public final HashMap<String, r<String, HashMap<String, String>, Composer, Integer, g2>> getMap() {
        return map;
    }

    public final void setMap(@k HashMap<String, r<String, HashMap<String, String>, Composer, Integer, g2>> hashMap) {
        map = hashMap;
    }
}
