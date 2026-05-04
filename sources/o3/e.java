package o3;

import com.baicizhan.app.api.service.Gender;
import com.baicizhan.app.biz.auth.q;
import k3.l;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.g0;
import m80.k;
import v8.v;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public final class e {

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static final /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f75681a;

        static {
            int[] iArr = new int[Gender.values().length];
            try {
                iArr[Gender.Boy.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Gender.Girl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Gender.Unknown.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f75681a = iArr;
        }
    }

    @k
    public static final l a(@k v vVar) {
        g0.p(vVar, "<this>");
        String str = vVar.f93549a;
        return new l(str, g0.g(str, q.b.f13745a.a()) ? vVar.f93551c : vVar.f93552d);
    }

    @k
    public static final String b(@k Gender gender) {
        g0.p(gender, "<this>");
        int i11 = a.f75681a[gender.ordinal()];
        if (i11 == 1) {
            return "m";
        }
        if (i11 == 2) {
            return "f";
        }
        if (i11 == 3) {
            return "x";
        }
        throw new NoWhenBranchMatchedException();
    }
}
