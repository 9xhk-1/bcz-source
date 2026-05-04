package com.mob.secverify.pure.core;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import com.mob.MobSDK;
import com.mob.secverify.common.callback.InternalCallback;
import com.mob.secverify.common.callback.OperationCallback;
import com.mob.secverify.common.exception.VerifyErr;
import com.mob.secverify.common.exception.VerifyException;
import com.mob.secverify.e.g;
import com.mob.secverify.e.h;
import com.mob.secverify.pure.core.ope.b.c.j;
import com.mob.secverify.pure.core.ope.cm.d.i;
import com.mob.secverify.pure.entity.PreVerifyResult;
import com.mob.secverify.pure.entity.VerifyResult;
import com.mob.tools.utils.UIHandler;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static volatile e f40782a;

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReference<String> f40783b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    private long f40784c;

    private e() {
        d.a();
    }

    private boolean c(OperationCallback<PreVerifyResult> operationCallback) {
        com.mob.secverify.a.a c11 = com.mob.secverify.pure.b.c.a().c();
        if (c11 == null) {
            return false;
        }
        if (!h.d().equals(com.mob.secverify.pure.core.ope.a.f40830a)) {
            a(b());
            return false;
        }
        if (com.mob.secverify.e.a.a(c11)) {
            a(b());
            return false;
        }
        a(operationCallback, new PreVerifyResult(c11.e(), com.mob.secverify.pure.core.ope.a.f40830a), (VerifyException) null);
        return true;
    }

    public void b(final OperationCallback<VerifyResult> operationCallback) {
        Log.d("[SecPure] ==>%s", "start verify");
        new Thread() { // from class: com.mob.secverify.pure.core.e.4
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                com.mob.secverify.b.b bVar = new com.mob.secverify.b.b(com.mob.secverify.b.d.VERIFY);
                try {
                    e.this.a(bVar, operationCallback);
                } catch (Throwable th2) {
                    String a11 = h.a(th2);
                    VerifyErr verifyErr = VerifyErr.C_VERIFY_CATCH;
                    VerifyException verifyException = new VerifyException(verifyErr);
                    bVar.a("verify", new VerifyException(verifyErr, new Throwable(a11)), true, "");
                    e.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException);
                }
            }
        }.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(final com.mob.secverify.pure.core.ope.a aVar, final OperationCallback<PreVerifyResult> operationCallback) {
        aVar.a(new InternalCallback<PreVerifyResult>() { // from class: com.mob.secverify.pure.core.e.2
            @Override // com.mob.secverify.common.callback.InternalCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(PreVerifyResult preVerifyResult) {
                int h11 = g.h();
                com.mob.secverify.pure.b.c.a().a(preVerifyResult);
                OperationCallback operationCallback2 = operationCallback;
                if (operationCallback2 != null) {
                    operationCallback2.onComplete(preVerifyResult);
                }
                if (h11 == 2 || h11 == 4 || h11 == 7) {
                    e.this.a(aVar, (OperationCallback<PreVerifyResult>) operationCallback, preVerifyResult != null ? preVerifyResult.getSecurityPhone() : "", preVerifyResult, (VerifyException) null);
                }
            }

            @Override // com.mob.secverify.common.callback.InternalCallback
            public void onFailure(VerifyException verifyException) {
                int h11 = g.h();
                if (h11 == -1 || h11 == 0 || h11 == 1 || h11 == 2) {
                    OperationCallback operationCallback2 = operationCallback;
                    if (operationCallback2 != null) {
                        operationCallback2.onFailure(verifyException);
                        return;
                    }
                    return;
                }
                if (h11 == 3 || h11 == 4 || h11 == 6 || h11 == 7) {
                    e.this.a(aVar, (OperationCallback<PreVerifyResult>) operationCallback, (String) null, (PreVerifyResult) null, verifyException);
                    return;
                }
                OperationCallback operationCallback3 = operationCallback;
                if (operationCallback3 != null) {
                    operationCallback3.onFailure(verifyException);
                }
            }
        });
    }

    public static int b() {
        int b11 = h.b();
        if (b11 == 1) {
            return 1;
        }
        return b11 == 2 ? g.f() ? 3 : 2 : b11 == 3 ? 4 : 5;
    }

    public static e a() {
        if (f40782a == null) {
            synchronized (e.class) {
                try {
                    if (f40782a == null) {
                        f40782a = new e();
                    }
                } finally {
                }
            }
        }
        return f40782a;
    }

    private void c() {
        d.b();
        for (int i11 = 80; d.f40780a.get() == null && i11 > 0 && !d.f40781b.get(); i11--) {
            SystemClock.sleep(50L);
        }
    }

    public void a(OperationCallback<PreVerifyResult> operationCallback) {
        a(operationCallback, false);
    }

    public void a(final OperationCallback<PreVerifyResult> operationCallback, final boolean z11) {
        Log.d("[SecPure] ==>%s", "start preVerify");
        if (c(operationCallback)) {
            return;
        }
        this.f40784c = System.currentTimeMillis();
        new Thread() { // from class: com.mob.secverify.pure.core.e.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                com.mob.secverify.b.b bVar = new com.mob.secverify.b.b(com.mob.secverify.b.d.PREVERIFY);
                try {
                    e.this.a(bVar, operationCallback, z11);
                } catch (Throwable th2) {
                    String a11 = h.a(th2);
                    VerifyErr verifyErr = VerifyErr.C_PREVERIFY_CATCH;
                    VerifyException verifyException = new VerifyException(verifyErr);
                    bVar.a("preVerify", new VerifyException(verifyErr, new Throwable(a11)), true, "");
                    e.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException);
                }
            }
        }.start();
    }

    public void a(final com.mob.secverify.b.b bVar, final OperationCallback<PreVerifyResult> operationCallback, boolean z11) {
        com.mob.secverify.b.b bVar2;
        OperationCallback<PreVerifyResult> operationCallback2;
        if (b.a() == null && c.a() == null && z11) {
            c();
        }
        SparseArray<b> a11 = b.a();
        if (a11 != null) {
            bVar.a("use_cdn");
        } else {
            a11 = c.a();
            if (a11 != null) {
                bVar.a("use_ca");
            } else {
                try {
                    a11 = c.a(MobSDK.getContext());
                    if (a11 != null) {
                        bVar.a("use_de");
                    } else {
                        bVar2 = bVar;
                        operationCallback2 = operationCallback;
                        try {
                            VerifyException verifyException = new VerifyException(VerifyErr.C_PREVERIFY_CATCH, new Throwable("Read Default Config Error"));
                            bVar2.a("preVerify", verifyException, "");
                            a(operationCallback2, (PreVerifyResult) null, verifyException);
                            return;
                        } catch (VerifyException e11) {
                            e = e11;
                            VerifyException verifyException2 = e;
                            bVar2.a("preVerify", verifyException2, "");
                            a(operationCallback2, (PreVerifyResult) null, verifyException2);
                            return;
                        }
                    }
                } catch (VerifyException e12) {
                    e = e12;
                    bVar2 = bVar;
                    operationCallback2 = operationCallback;
                }
            }
        }
        b.b(a11);
        final int b11 = b();
        bVar.a("get_cc");
        if (b11 == 5) {
            VerifyException verifyException3 = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
            bVar.a("preVerify", verifyException3, "");
            a(operationCallback, (PreVerifyResult) null, verifyException3);
            return;
        }
        final b bVar3 = a11.get(b11);
        if (bVar3 == null) {
            VerifyException verifyException4 = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
            bVar.a("preVerify", verifyException4, "");
            a(operationCallback, (PreVerifyResult) null, verifyException4);
            return;
        }
        com.mob.secverify.pure.core.ope.a a12 = a(b11, bVar3.f40777b, bVar3.f40778c, bVar);
        bVar.a("get_ci");
        Log.d("[SecPure] ==>%s", "aid:" + bVar3.f40777b + ", us: " + (System.currentTimeMillis() - this.f40784c));
        a(a12, new OperationCallback<PreVerifyResult>() { // from class: com.mob.secverify.pure.core.e.3
            @Override // com.mob.secverify.common.callback.OperationCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onComplete(PreVerifyResult preVerifyResult) {
                bVar.b("preVerify", bVar3.f40777b);
                e.this.a((OperationCallback<PreVerifyResult>) operationCallback, preVerifyResult, (VerifyException) null);
                e.this.a(b11, bVar);
            }

            @Override // com.mob.secverify.common.callback.OperationCallback
            public void onFailure(VerifyException verifyException5) {
                bVar.a("preVerify", verifyException5, false, bVar3.f40777b);
                e.this.a((OperationCallback<PreVerifyResult>) operationCallback, (PreVerifyResult) null, verifyException5);
                e.this.a(b11, bVar);
            }
        });
    }

    public void a(final com.mob.secverify.b.b bVar, final OperationCallback<VerifyResult> operationCallback) {
        b bVar2;
        int b11 = b();
        bVar.a("get_cc");
        if (b11 == 5) {
            VerifyException verifyException = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
            bVar.a("verify", verifyException, "");
            a(operationCallback, (VerifyResult) null, verifyException);
            return;
        }
        SparseArray<b> a11 = b.a();
        SparseArray<b> b12 = b.b();
        if (b12 == null) {
            VerifyException verifyException2 = new VerifyException(VerifyErr.C_UNPREVERIFY);
            bVar.a("verify", verifyException2, "");
            a(operationCallback, (VerifyResult) null, verifyException2);
            return;
        }
        boolean z11 = (a11 == null || a11.get(b11).f40777b.equals(f40783b.get())) ? false : true;
        if (z11) {
            bVar2 = a11.get(b11);
        } else {
            bVar2 = b12.get(b11);
        }
        final b bVar3 = bVar2;
        if (bVar3 == null) {
            VerifyException verifyException3 = new VerifyException(VerifyErr.C_UNSUPPORTED_OPERATOR);
            bVar.a("verify", verifyException3, "");
            a(operationCallback, (VerifyResult) null, verifyException3);
            return;
        }
        final com.mob.secverify.pure.core.ope.a a12 = a(b11, bVar3.f40777b, bVar3.f40778c, bVar);
        bVar.a("get_ci");
        if (z11) {
            a(b11);
            com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "pre3：" + bVar3.f40777b);
            a(a12, new OperationCallback<PreVerifyResult>() { // from class: com.mob.secverify.pure.core.e.5
                @Override // com.mob.secverify.common.callback.OperationCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onComplete(PreVerifyResult preVerifyResult) {
                    e.this.a(a12, (OperationCallback<VerifyResult>) operationCallback, bVar, bVar3.f40777b);
                }

                @Override // com.mob.secverify.common.callback.OperationCallback
                public void onFailure(VerifyException verifyException4) {
                    bVar.a("preVerify", verifyException4, bVar3.f40777b);
                    e.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException4);
                }
            });
            return;
        }
        a(a12, operationCallback, bVar, bVar3.f40777b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(com.mob.secverify.pure.core.ope.a aVar, OperationCallback<VerifyResult> operationCallback, com.mob.secverify.b.b bVar, String str) {
        com.mob.secverify.a.a c11 = com.mob.secverify.pure.b.c.a().c();
        if (c11 != null && c11.f()) {
            try {
                VerifyResult verifyResult = new VerifyResult(c11.e(), a.a().c(), com.mob.secverify.pure.core.ope.a.f40830a);
                String b11 = com.mob.secverify.c.d.a().b();
                bVar.a("verify", str);
                verifyResult.setToken(b11);
                a(operationCallback, verifyResult, (VerifyException) null);
                return;
            } catch (VerifyException e11) {
                bVar.a("verify", e11, str);
                a(operationCallback, (VerifyResult) null, e11);
                return;
            }
        }
        a(aVar, bVar, operationCallback, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final OperationCallback<VerifyResult> operationCallback, final VerifyResult verifyResult, final VerifyException verifyException) {
        if (operationCallback == null) {
            return;
        }
        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.secverify.pure.core.e.6
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                if (verifyResult == null) {
                    operationCallback.onFailure(verifyException);
                    return false;
                }
                e.this.a(e.b());
                operationCallback.onComplete(verifyResult);
                return false;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final OperationCallback<PreVerifyResult> operationCallback, final PreVerifyResult preVerifyResult, final VerifyException verifyException) {
        if (operationCallback == null) {
            return;
        }
        UIHandler.sendEmptyMessage(0, new Handler.Callback() { // from class: com.mob.secverify.pure.core.e.7
            @Override // android.os.Handler.Callback
            public boolean handleMessage(Message message) {
                PreVerifyResult preVerifyResult2 = preVerifyResult;
                if (preVerifyResult2 != null) {
                    operationCallback.onComplete(preVerifyResult2);
                    return false;
                }
                operationCallback.onFailure(verifyException);
                return false;
            }
        });
    }

    private void a(com.mob.secverify.pure.core.ope.a aVar, OperationCallback<PreVerifyResult> operationCallback) {
        int h11 = g.h();
        if (h11 != 1 && h11 != 5) {
            b(aVar, operationCallback);
        } else {
            a(aVar, operationCallback, (String) null, (PreVerifyResult) null, (VerifyException) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11, final com.mob.secverify.b.b bVar) {
        try {
            final SparseArray<b> a11 = b.a();
            SparseArray<b> b11 = b.b();
            final int b12 = b();
            if (b12 == 5) {
                return;
            }
            if (b12 == i11) {
                if (a11 != null) {
                    if (a11.get(b12).f40777b.equals(f40783b.get())) {
                    }
                }
                bVar.a("pre_2_no", b11.get(i11).f40777b);
                return;
            }
            a(b12);
            b.b(a11);
            com.mob.secverify.b.c.a().a("[SecPure] ==>%s", "pre2:" + a11.get(b12).f40777b);
            a(a(b12, a11.get(b12).f40777b, a11.get(b12).f40778c, bVar), new OperationCallback<PreVerifyResult>() { // from class: com.mob.secverify.pure.core.e.8
                @Override // com.mob.secverify.common.callback.OperationCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onComplete(PreVerifyResult preVerifyResult) {
                    bVar.a("pre_2_s", ((b) a11.get(b12)).f40777b);
                }

                @Override // com.mob.secverify.common.callback.OperationCallback
                public void onFailure(VerifyException verifyException) {
                    bVar.a("pre_2_f", verifyException, ((b) a11.get(b12)).f40777b);
                }
            });
        } catch (Throwable unused) {
        }
    }

    private void a(com.mob.secverify.pure.core.ope.a aVar, final com.mob.secverify.b.b bVar, final OperationCallback<VerifyResult> operationCallback, final String str) {
        aVar.b(new InternalCallback<VerifyResult>() { // from class: com.mob.secverify.pure.core.e.9
            @Override // com.mob.secverify.common.callback.InternalCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(VerifyResult verifyResult) {
                try {
                    String b11 = com.mob.secverify.c.d.a().b();
                    bVar.a("verify", str);
                    verifyResult.setToken(b11);
                    e.this.a((OperationCallback<VerifyResult>) operationCallback, verifyResult, (VerifyException) null);
                } catch (VerifyException e11) {
                    bVar.a("verify", e11, str);
                    e.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, e11);
                }
            }

            @Override // com.mob.secverify.common.callback.InternalCallback
            public void onFailure(VerifyException verifyException) {
                bVar.a("verify", verifyException, str);
                e.this.a((OperationCallback<VerifyResult>) operationCallback, (VerifyResult) null, verifyException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i11) {
        i.f(null);
        i.c(0L);
        j.b(null);
        com.mob.secverify.pure.core.ope.a.a.g.a((String) null);
        com.mob.secverify.pure.b.c.a().a((com.mob.secverify.a.a) null);
        com.mob.secverify.pure.b.c.a().a((PreVerifyResult) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(final com.mob.secverify.pure.core.ope.a aVar, final OperationCallback<PreVerifyResult> operationCallback, String str, final PreVerifyResult preVerifyResult, final VerifyException verifyException) {
        a.a().a(str, new InternalCallback<com.mob.secverify.a.a>() { // from class: com.mob.secverify.pure.core.e.10
            @Override // com.mob.secverify.common.callback.InternalCallback
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public void onSuccess(com.mob.secverify.a.a aVar2) {
                PreVerifyResult preVerifyResult2 = new PreVerifyResult(aVar2.e(), com.mob.secverify.pure.core.ope.a.f40830a);
                com.mob.secverify.pure.b.c.a().a(preVerifyResult2);
                com.mob.secverify.pure.b.c.a().a(aVar2);
                if (preVerifyResult == null) {
                    operationCallback.onComplete(preVerifyResult2);
                }
            }

            @Override // com.mob.secverify.common.callback.InternalCallback
            public void onFailure(VerifyException verifyException2) {
                VerifyException verifyException3;
                int h11 = g.h();
                if (h11 == 1 || h11 == 5) {
                    e.this.b(aVar, operationCallback);
                    return;
                }
                if (h11 != 2 && h11 != 3 && h11 != 6 && h11 != 4 && h11 != 7) {
                    if (com.mob.secverify.pure.b.c.a().b() == null) {
                        operationCallback.onFailure(verifyException2);
                    }
                } else {
                    if (preVerifyResult != null || (verifyException3 = verifyException) == null) {
                        return;
                    }
                    operationCallback.onFailure(verifyException3);
                }
            }
        });
    }

    private static com.mob.secverify.pure.core.ope.a a(int i11, String str, String str2, com.mob.secverify.b.b bVar) {
        f40783b.set(str);
        if (i11 == 1) {
            return new com.mob.secverify.pure.core.ope.cm.a(str, str2, "CMCC", bVar);
        }
        if (i11 == 2 || i11 == 3) {
            if (g.f()) {
                return new com.mob.secverify.pure.core.ope.wo.a(str, str2, "CUCC", bVar);
            }
            return new com.mob.secverify.pure.core.ope.b.a(str, str2, "CUCC", bVar);
        }
        if (i11 == 4) {
            return new com.mob.secverify.pure.core.ope.a.a(str, str2, "CTCC", bVar);
        }
        return null;
    }
}
