package o2;

import com.badlogic.gdx.utils.GdxRuntimeException;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes3.dex */
public interface e {

    /* renamed from: a, reason: collision with root package name */
    public static final e f75577a = new a();

    /* renamed from: b, reason: collision with root package name */
    public static final e f75578b = new b();

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class a implements e {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
        
            r2 = r2 + 1;
         */
        /* JADX WARN: Code restructure failed: missing block: B:11:0x001e, code lost:
        
            if (r2 >= r1.length) goto L13;
         */
        /* JADX WARN: Code restructure failed: missing block: B:12:0x0020, code lost:
        
            r0 = r1[r2].getMethodName();
         */
        @Override // o2.e
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void onError(int r6) {
            /*
                r5 = this;
                r0 = 0
                java.lang.Thread r1 = java.lang.Thread.currentThread()     // Catch: java.lang.Exception -> L2a
                java.lang.StackTraceElement[] r1 = r1.getStackTrace()     // Catch: java.lang.Exception -> L2a
                r2 = 0
            La:
                int r3 = r1.length     // Catch: java.lang.Exception -> L2a
                if (r2 >= r3) goto L2a
                java.lang.String r3 = "check"
                r4 = r1[r2]     // Catch: java.lang.Exception -> L2a
                java.lang.String r4 = r4.getMethodName()     // Catch: java.lang.Exception -> L2a
                boolean r3 = r3.equals(r4)     // Catch: java.lang.Exception -> L2a
                if (r3 == 0) goto L27
                int r2 = r2 + 1
                int r3 = r1.length     // Catch: java.lang.Exception -> L2a
                if (r2 >= r3) goto L2a
                r1 = r1[r2]     // Catch: java.lang.Exception -> L2a
                java.lang.String r0 = r1.getMethodName()     // Catch: java.lang.Exception -> L2a
                goto L2a
            L27:
                int r2 = r2 + 1
                goto La
            L2a:
                java.lang.String r1 = "Error "
                java.lang.String r2 = "GLProfiler"
                if (r0 == 0) goto L51
                com.badlogic.gdx.Application r3 = q1.g.f81378a
                java.lang.StringBuilder r4 = new java.lang.StringBuilder
                r4.<init>()
                r4.append(r1)
                java.lang.String r6 = o2.f.t5(r6)
                r4.append(r6)
                java.lang.String r6 = " from "
                r4.append(r6)
                r4.append(r0)
                java.lang.String r6 = r4.toString()
                r3.h(r2, r6)
                goto L73
            L51:
                com.badlogic.gdx.Application r0 = q1.g.f81378a
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r1)
                java.lang.String r6 = o2.f.t5(r6)
                r3.append(r6)
                java.lang.String r6 = " at: "
                r3.append(r6)
                java.lang.String r6 = r3.toString()
                java.lang.Exception r1 = new java.lang.Exception
                r1.<init>()
                r0.a(r2, r6, r1)
            L73:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: o2.e.a.onError(int):void");
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public class b implements e {
        @Override // o2.e
        public void onError(int i11) {
            throw new GdxRuntimeException("GLProfiler: Got GL error " + f.t5(i11));
        }
    }

    void onError(int i11);
}
