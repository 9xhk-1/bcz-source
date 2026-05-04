package androidx.constraintlayout.compose;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.parser.CLParser;
import androidx.constraintlayout.core.parser.CLParsingException;
import kotlin.jvm.internal.u0;
import l80.d;
import m80.k;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/constraintlayout/compose/TransitionKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,113:1\n1#2:114\n*E\n"})
/* loaded from: classes2.dex */
public final class TransitionKt {
    @ExperimentalMotionApi
    @SuppressLint({"ComposableNaming"})
    @k
    public static final Transition Transition(@d("json5") @k String str) {
        CLObject cLObject;
        try {
            cLObject = CLParser.parse(str);
        } catch (CLParsingException e11) {
            Log.e("CML", "Error parsing JSON " + e11);
            cLObject = null;
        }
        return cLObject != null ? new TransitionImpl(cLObject) : TransitionImpl.Companion.getEMPTY$constraintlayout_compose_release();
    }
}
