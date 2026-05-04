package com.bun.miitmdid;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* loaded from: classes6.dex */
public interface o0 extends IInterface {

    public static abstract class a extends Binder implements o0 {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f28966a = 0;

        /* renamed from: com.bun.miitmdid.o0$a$a, reason: collision with other inner class name */
        public static class C0340a implements o0 {

            /* renamed from: a, reason: collision with root package name */
            public IBinder f28967a;

            public C0340a(IBinder iBinder) {
                this.f28967a = iBinder;
            }

            @Override // com.bun.miitmdid.o0
            public native void a(n0 n0Var);

            @Override // android.os.IInterface
            public native IBinder asBinder();

            @Override // com.bun.miitmdid.o0
            public native void b(n0 n0Var);
        }
    }

    void a(n0 n0Var);

    void b(n0 n0Var);
}
