package sf;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.baicizhan.client.business.dataset.models.UserRecord;
import com.baicizhan.online.unified_user_service.UnifiedUserService;
import com.baicizhan.online.unified_user_service.UserLoginResult;
import com.baicizhan.online.unified_user_service.UserTryResult;
import kotlin.jvm.internal.g0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 1)
/* loaded from: classes4.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final d0 f88406a = new d0();

    /* renamed from: b, reason: collision with root package name */
    public static final int f88407b = 0;

    public static final UserTryResult j(UnifiedUserService.Client client) {
        return client.have_a_try_v2();
    }

    public static final UserTryResult k(x00.l lVar, Object obj) {
        return (UserTryResult) lVar.invoke(obj);
    }

    public static final UserRecord l(UserTryResult userTryResult) {
        UserRecord userRecord = new UserRecord();
        userRecord.setUser(userTryResult.email);
        userRecord.setPasswordMD5(userTryResult.password);
        userRecord.setLoginType(3);
        return userRecord;
    }

    public static final UserRecord m(x00.l lVar, Object obj) {
        return (UserRecord) lVar.invoke(obj);
    }

    public static final UserLoginResult n(Context context, UserRecord userRecord, UnifiedUserService.Client client) {
        return gi.e.k(context, client, userRecord, 0);
    }

    public static final UserLoginResult o(x00.p pVar, Object obj, Object obj2) {
        return (UserLoginResult) pVar.invoke(obj, obj2);
    }

    public static final Boolean p(UserLoginResult userLoginResult) {
        ai.a.e().h();
        return Boolean.TRUE;
    }

    public static final Boolean q(x00.l lVar, Object obj) {
        return (Boolean) lVar.invoke(obj);
    }

    @m80.k
    public final rx.c<Boolean> i(@m80.k final Context context) {
        g0.p(context, "context");
        rx.c a11 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").e(false).c(1));
        final x00.l lVar = new x00.l() { // from class: sf.v
            @Override // x00.l
            public final Object invoke(Object obj) {
                UserTryResult j11;
                j11 = d0.j((UnifiedUserService.Client) obj);
                return j11;
            }
        };
        rx.c c32 = a11.c3(new wb0.p() { // from class: sf.w
            @Override // wb0.p
            public final Object call(Object obj) {
                UserTryResult k11;
                k11 = d0.k(x00.l.this, obj);
                return k11;
            }
        });
        final x00.l lVar2 = new x00.l() { // from class: sf.x
            @Override // x00.l
            public final Object invoke(Object obj) {
                UserRecord l11;
                l11 = d0.l((UserTryResult) obj);
                return l11;
            }
        };
        rx.c c33 = c32.c3(new wb0.p() { // from class: sf.y
            @Override // wb0.p
            public final Object call(Object obj) {
                UserRecord m11;
                m11 = d0.m(x00.l.this, obj);
                return m11;
            }
        });
        rx.c a12 = com.baicizhan.client.business.thrift.p.a(new com.baicizhan.client.business.thrift.l("/rpc/unified_user_service").e(false));
        final x00.p pVar = new x00.p() { // from class: sf.z
            @Override // x00.p
            public final Object invoke(Object obj, Object obj2) {
                UserLoginResult n11;
                n11 = d0.n(context, (UserRecord) obj, (UnifiedUserService.Client) obj2);
                return n11;
            }
        };
        rx.c v72 = c33.v7(a12, new wb0.q() { // from class: sf.a0
            @Override // wb0.q
            public final Object call(Object obj, Object obj2) {
                UserLoginResult o11;
                o11 = d0.o(x00.p.this, obj, obj2);
                return o11;
            }
        });
        final x00.l lVar3 = new x00.l() { // from class: sf.b0
            @Override // x00.l
            public final Object invoke(Object obj) {
                Boolean p11;
                p11 = d0.p((UserLoginResult) obj);
                return p11;
            }
        };
        rx.c<Boolean> w52 = v72.c3(new wb0.p() { // from class: sf.c0
            @Override // wb0.p
            public final Object call(Object obj) {
                Boolean q11;
                q11 = d0.q(x00.l.this, obj);
                return q11;
            }
        }).w5(bc0.c.e());
        g0.o(w52, "subscribeOn(...)");
        return w52;
    }
}
