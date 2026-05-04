package gi;

import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.main.activity.idenity.UserIdentity;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class i0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final i0 f53777a = new i0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f53778b = 0;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f53779a;

        static {
            int[] iArr = new int[UserIdentity.values().length];
            try {
                iArr[UserIdentity.PRIMARY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[UserIdentity.JUNIOR_HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[UserIdentity.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[UserIdentity.COLLEGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[UserIdentity.EMPLOYEES.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[UserIdentity.OTHERS.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[UserIdentity.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f53779a = iArr;
        }
    }

    @w00.o
    @m80.k
    public static final String a(@m80.k UserIdentity identity) {
        kotlin.jvm.internal.g0.p(identity, "identity");
        switch (a.f53779a[identity.ordinal()]) {
            case 1:
                return ma.v.f73031b;
            case 2:
                return ma.v.f73032c;
            case 3:
                return ma.v.f73033d;
            case 4:
                return ma.v.f73034e;
            case 5:
            case 6:
            case 7:
                return ma.v.f73030a;
            default:
                return "";
        }
    }

    @w00.o
    public static final boolean b(@m80.k UserIdentity identity) {
        kotlin.jvm.internal.g0.p(identity, "identity");
        return identity.compareTo(UserIdentity.COLLEGE) <= 0 && identity.compareTo(UserIdentity.PRIMARY) >= 0;
    }
}
