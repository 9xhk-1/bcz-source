package androidx.compose.runtime.saveable;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import m80.k;
import m80.l;
import x00.p;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes.dex */
public interface SaveableStateHolder {
    @Composable
    void SaveableStateProvider(@k Object obj, @k p<? super Composer, ? super Integer, g2> pVar, @l Composer composer, int i11);

    void removeState(@k Object obj);
}
