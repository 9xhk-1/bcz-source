package tf;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import com.mob.MobSDK;
import com.mob.secverify.SecPure;
import com.mob.secverify.common.callback.OperationCallback;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.pure.entity.PreVerifyResult;
import com.mob.secverify.pure.entity.VerifyResult;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@StabilityInferred(parameters = 0)
/* loaded from: classes4.dex */
public final class c extends tf.a {

    /* renamed from: e, reason: collision with root package name */
    @m80.k
    public static final String f90517e = "MobOneKeyLoginManager";

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final String f90518f = "2fa0d87bf1765";

    /* renamed from: g, reason: collision with root package name */
    @m80.k
    public static final String f90519g = "a9ade62acbf977f32099037ecabeb84d";

    /* renamed from: d, reason: collision with root package name */
    @m80.k
    public static final c f90516d = new c();

    /* renamed from: h, reason: collision with root package name */
    public static final int f90520h = 8;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMobOneKeyLoginManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobOneKeyLoginManager.kt\ncom/baicizhan/main/auth/onekey/MobOneKeyLoginManager$go2Login$1\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,88:1\n35#2:89\n*S KotlinDebug\n*F\n+ 1 MobOneKeyLoginManager.kt\ncom/baicizhan/main/auth/onekey/MobOneKeyLoginManager$go2Login$1\n*L\n69#1:89\n*E\n"})
    public static final class a extends OperationCallback<VerifyResult> {

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ tf.b f90521f;

        public a(tf.b bVar) {
            this.f90521f = bVar;
        }

        @Override // com.mob.secverify.common.callback.OperationCallback
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onComplete(VerifyResult verifyResult) {
            qb.c.i(c.f90517e, "verify complete:" + (verifyResult != null ? verifyResult.toJson() : null), new Object[0]);
            tf.b bVar = this.f90521f;
            if (verifyResult == null) {
                bVar.b("UNKNOWN");
                return;
            }
            String opToken = verifyResult.getOpToken();
            kotlin.jvm.internal.g0.o(opToken, "getOpToken(...)");
            String token = verifyResult.getToken();
            kotlin.jvm.internal.g0.o(token, "getToken(...)");
            String operator = verifyResult.getOperator();
            kotlin.jvm.internal.g0.o(operator, "getOperator(...)");
            bVar.a(new r(opToken, token, operator));
        }

        @Override // com.mob.secverify.common.callback.OperationCallback
        public void onFailure(VerifyException verifyException) {
            qb.c.d(c.f90517e, "verify failure:" + (verifyException != null ? verifyException.getMessage() : null), new Object[0]);
            this.f90521f.b(verifyException != null ? verifyException.getMessage() : null);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    @u0({"SMAP\nMobOneKeyLoginManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MobOneKeyLoginManager.kt\ncom/baicizhan/main/auth/onekey/MobOneKeyLoginManager$preGetPhone$1\n+ 2 KotlinExt.kt\ncom/baicizhan/client/business/util/KotlinExtKt\n*L\n1#1,88:1\n35#2:89\n35#2:90\n*S KotlinDebug\n*F\n+ 1 MobOneKeyLoginManager.kt\ncom/baicizhan/main/auth/onekey/MobOneKeyLoginManager$preGetPhone$1\n*L\n39#1:89\n53#1:90\n*E\n"})
    public static final class b extends OperationCallback<PreVerifyResult> {
        @Override // com.mob.secverify.common.callback.OperationCallback
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void onComplete(PreVerifyResult preVerifyResult) {
            qb.c.i(c.f90517e, "pre get phone complete:" + (preVerifyResult != null ? preVerifyResult.toJson() : null), new Object[0]);
            if (preVerifyResult != null) {
                c.f90516d.h(new j0(preVerifyResult.getSecurityPhone(), preVerifyResult.getOperator(), preVerifyResult.getUiElement().getSlogan(), preVerifyResult.getUiElement().getPrivacyName(), preVerifyResult.getUiElement().getPrivacyUrl(), null, 32, null));
            }
            c.f90516d.a().onNext(Boolean.TRUE);
        }

        @Override // com.mob.secverify.common.callback.OperationCallback
        public void onFailure(VerifyException verifyException) {
            qb.c.d(c.f90517e, "pre get phone failure:" + (verifyException != null ? verifyException.getMessage() : null), new Object[0]);
            if (verifyException != null) {
                c.f90516d.h(new j0(null, null, null, null, null, verifyException.getMessage(), 31, null));
            }
            c.f90516d.a().onNext(Boolean.TRUE);
        }
    }

    @Override // tf.a
    public void c(@m80.k tf.b callback) {
        kotlin.jvm.internal.g0.p(callback, "callback");
        qb.c.i(f90517e, "start get token", new Object[0]);
        SecPure.verify(new a(callback));
    }

    @Override // tf.a
    public void d(@m80.k Context context) {
        kotlin.jvm.internal.g0.p(context, "context");
        qb.c.i(f90517e, "init mob sdk", new Object[0]);
        MobSDK.submitPolicyGrantResult(true);
        MobSDK.init(context, f90518f, f90519g);
    }

    @Override // tf.a
    public boolean e() {
        j0 b11 = b();
        String k11 = b11 != null ? b11.k() : null;
        return !(k11 == null || k11.length() == 0);
    }

    @Override // tf.a
    public void f() {
        qb.c.i(f90517e, "start pre get phone", new Object[0]);
        a().onNext(Boolean.FALSE);
        SecPure.preVerify(new b());
    }
}
