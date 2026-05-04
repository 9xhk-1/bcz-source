package og;

import androidx.lifecycle.MutableLiveData;
import kotlin.Pair;
import kotlin.jvm.internal.g0;
import yz.g2;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public final class u {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> void a(@m80.k MutableLiveData<T> mutableLiveData, T t11, boolean z11) {
        boolean g11;
        g0.p(mutableLiveData, "<this>");
        try {
            T value = mutableLiveData.getValue();
            if (value instanceof Pair) {
                g0.n(value, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                Pair pair = (Pair) value;
                g0.n(t11, "null cannot be cast to non-null type kotlin.Pair<*, *>");
                Pair pair2 = (Pair) t11;
                g11 = g0.g(pair.getFirst(), pair2.getFirst()) && g0.g(pair.getSecond(), pair2.getSecond());
            } else {
                g11 = g0.g(value, t11);
            }
            if (!g11) {
                value = (T) null;
            }
            if (value == null) {
                if (z11) {
                    mutableLiveData.setValue(t11);
                } else {
                    mutableLiveData.postValue(t11);
                }
                g2 g2Var = g2.f100423a;
            }
        } catch (Exception unused) {
            if (z11) {
                mutableLiveData.setValue(t11);
            } else {
                mutableLiveData.postValue(t11);
            }
        }
    }

    public static /* synthetic */ void b(MutableLiveData mutableLiveData, Object obj, boolean z11, int i11, Object obj2) {
        if ((i11 & 2) != 0) {
            z11 = false;
        }
        a(mutableLiveData, obj, z11);
    }
}
