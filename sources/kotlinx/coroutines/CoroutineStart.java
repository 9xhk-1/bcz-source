package kotlinx.coroutines;

import c40.c1;
import c40.g2;
import i40.b;
import j00.d;
import kotlin.NoWhenBranchMatchedException;
import m00.c;
import m80.k;
import x00.p;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes8.dex */
public final class CoroutineStart {
    private static final /* synthetic */ m00.a $ENTRIES;
    private static final /* synthetic */ CoroutineStart[] $VALUES;
    public static final CoroutineStart DEFAULT = new CoroutineStart("DEFAULT", 0);
    public static final CoroutineStart LAZY = new CoroutineStart("LAZY", 1);

    @c1
    public static final CoroutineStart ATOMIC = new CoroutineStart("ATOMIC", 2);
    public static final CoroutineStart UNDISPATCHED = new CoroutineStart("UNDISPATCHED", 3);

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f67807a;

        static {
            int[] iArr = new int[CoroutineStart.values().length];
            try {
                iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CoroutineStart.ATOMIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[CoroutineStart.LAZY.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f67807a = iArr;
        }
    }

    private static final /* synthetic */ CoroutineStart[] $values() {
        return new CoroutineStart[]{DEFAULT, LAZY, ATOMIC, UNDISPATCHED};
    }

    static {
        CoroutineStart[] $values = $values();
        $VALUES = $values;
        $ENTRIES = c.c($values);
    }

    private CoroutineStart(String str, int i11) {
    }

    @k
    public static m00.a<CoroutineStart> getEntries() {
        return $ENTRIES;
    }

    public static CoroutineStart valueOf(String str) {
        return (CoroutineStart) Enum.valueOf(CoroutineStart.class, str);
    }

    public static CoroutineStart[] values() {
        return (CoroutineStart[]) $VALUES.clone();
    }

    @g2
    public final <R, T> void invoke(@k p<? super R, ? super j00.c<? super T>, ? extends Object> pVar, R r11, @k j00.c<? super T> cVar) {
        int i11 = a.f67807a[ordinal()];
        if (i11 == 1) {
            i40.a.e(pVar, r11, cVar);
            return;
        }
        if (i11 == 2) {
            d.i(pVar, r11, cVar);
        } else if (i11 == 3) {
            b.c(pVar, r11, cVar);
        } else if (i11 != 4) {
            throw new NoWhenBranchMatchedException();
        }
    }

    public final boolean isLazy() {
        return this == LAZY;
    }

    @g2
    public static /* synthetic */ void isLazy$annotations() {
    }
}
