package yc;

import com.baicizhan.client.business.dataset.provider.a;
import com.baicizhan.learning_strategy.util.L;
import com.baicizhan.learning_strategy.util.d;
import com.baicizhan.main.receiver.LearnOperationReceiver;
import org.mozilla.javascript.Context;
import org.mozilla.javascript.NativeObject;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes4.dex */
public class b extends d {
    public b() {
        this(Z());
    }

    public static b Y() {
        NativeObject Z = Z();
        if (Z != null) {
            return new b(Z);
        }
        return null;
    }

    public static NativeObject Z() {
        try {
            Object b11 = com.baicizhan.learning_strategy.util.c.b(zc.c.d().b(), zc.c.d().c(), "new Problem()");
            if (b11 instanceof NativeObject) {
                return (NativeObject) b11;
            }
            return null;
        } catch (Throwable th2) {
            try {
                L.log.error("create problem error", th2);
                return null;
            } finally {
                Context.exit();
            }
        }
    }

    public void A0(int i11) {
        V("listenScore", Integer.valueOf(i11));
    }

    public void B0(int i11) {
        V("reviewMoreCount", Integer.valueOf(i11));
    }

    public void C0(int i11) {
        V("reviewRound", Integer.valueOf(i11));
    }

    public void D0(int i11) {
        V(a.b.C0242a.f16107c, Integer.valueOf(i11));
    }

    public void E0(boolean z11) {
        V("todayNewLearned", Boolean.valueOf(z11));
    }

    public void F0(String str) {
        V("word", str);
    }

    public void G0(int i11) {
        V("wrongCount", Integer.valueOf(i11));
    }

    public void W() {
        T("cancelKill", new Object[0]);
    }

    public void X() {
        x0(0);
        F0(null);
        u0(false);
        w0(0);
        y0(0L);
        z0(0);
        B0(0);
        D0(0);
        G0(0);
        E0(false);
        v0(false);
    }

    public void a0() {
        T("disableSpell", new Object[0]);
    }

    public void b0(int i11) {
        T("enableSpell", Integer.valueOf(i11));
    }

    public int c0() {
        return I("cn2enScore", 0);
    }

    public int d0() {
        return I("groupId", 0);
    }

    public int e0() {
        return I("id", 0);
    }

    public long f0() {
        return J("lastLearnedTime", 0L);
    }

    public int g0() {
        return I("lastScore", 0);
    }

    public int h0() {
        return I("listenScore", 0);
    }

    public int i0() {
        return I("reviewMoreCount", 0);
    }

    public int j0() {
        return I("reviewRound", 0);
    }

    public int k0() {
        return I(a.b.C0242a.f16107c, 0);
    }

    public int l0() {
        return I("spellScore", 0);
    }

    public String m0() {
        return K("word", null);
    }

    public int n0() {
        return I("wrongCount", 0);
    }

    public boolean o0() {
        return H("deepLearning", false);
    }

    public boolean p0() {
        return H("easyWord", false);
    }

    public boolean q0() {
        return L("isKilled", false, new Object[0]);
    }

    public boolean r0() {
        return H("todayNewLearned", false);
    }

    public void s0() {
        T(LearnOperationReceiver.f24791b, new Object[0]);
    }

    public void t0(int i11) {
        V("cn2enScore", Integer.valueOf(i11));
    }

    public void u0(boolean z11) {
        V("deepLearning", Boolean.valueOf(z11));
    }

    public void v0(boolean z11) {
        V("easyWord", Boolean.valueOf(z11));
    }

    public void w0(int i11) {
        V("groupId", Integer.valueOf(i11));
    }

    public void x0(int i11) {
        V("id", Integer.valueOf(i11));
    }

    public void y0(long j11) {
        V("lastLearnedTime", Long.valueOf(j11));
    }

    public void z0(int i11) {
        V("lastScore", Integer.valueOf(i11));
    }

    @Deprecated
    public b(NativeObject nativeObject) {
        super(nativeObject);
    }
}
