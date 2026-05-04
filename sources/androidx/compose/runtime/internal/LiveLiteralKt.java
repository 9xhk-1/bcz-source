package androidx.compose.runtime.internal;

import androidx.compose.runtime.ComposeCompilerApi;
import androidx.compose.runtime.InternalComposeApi;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.runtime.State;
import java.util.HashMap;
import kotlin.jvm.internal.g0;
import kotlin.jvm.internal.u0;
import m80.k;
import m80.l;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nLiveLiteral.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,92:1\n372#2,7:93\n372#2,7:100\n*S KotlinDebug\n*F\n+ 1 LiveLiteral.kt\nandroidx/compose/runtime/internal/LiveLiteralKt\n*L\n76#1:93,7\n84#1:100,7\n*E\n"})
/* loaded from: classes.dex */
public final class LiveLiteralKt {
    private static boolean isLiveLiteralsEnabled;

    @k
    private static final HashMap<String, MutableState<Object>> liveLiteralCache = new HashMap<>();

    @InternalComposeApi
    public static final void enableLiveLiterals() {
        isLiveLiteralsEnabled = true;
    }

    public static final boolean isLiveLiteralsEnabled() {
        return isLiveLiteralsEnabled;
    }

    @ComposeCompilerApi
    @InternalComposeApi
    @k
    public static final <T> State<T> liveLiteral(@k String str, T t11) {
        HashMap<String, MutableState<Object>> hashMap = liveLiteralCache;
        MutableState<Object> mutableState = hashMap.get(str);
        if (mutableState == null) {
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(t11, null, 2, null);
            hashMap.put(str, mutableState);
        }
        g0.n(mutableState, "null cannot be cast to non-null type androidx.compose.runtime.State<T of androidx.compose.runtime.internal.LiveLiteralKt.liveLiteral>");
        return mutableState;
    }

    @InternalComposeApi
    public static final void updateLiveLiteralValue(@k String str, @l Object obj) {
        boolean z11;
        HashMap<String, MutableState<Object>> hashMap = liveLiteralCache;
        MutableState<Object> mutableState = hashMap.get(str);
        if (mutableState == null) {
            mutableState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(obj, null, 2, null);
            hashMap.put(str, mutableState);
            z11 = false;
        } else {
            z11 = true;
        }
        MutableState<Object> mutableState2 = mutableState;
        if (z11) {
            mutableState2.setValue(obj);
        }
    }

    @ComposeCompilerApi
    @InternalComposeApi
    public static /* synthetic */ void isLiveLiteralsEnabled$annotations() {
    }
}
