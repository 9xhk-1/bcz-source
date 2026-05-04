package org.fusesource.jansi.internal;

import g80.c;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class CLibrary {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f77792a;

    /* renamed from: b, reason: collision with root package name */
    public static int f77793b;

    /* renamed from: c, reason: collision with root package name */
    public static int f77794c;

    /* renamed from: d, reason: collision with root package name */
    public static boolean f77795d;

    /* renamed from: e, reason: collision with root package name */
    public static boolean f77796e;

    /* renamed from: f, reason: collision with root package name */
    public static int f77797f;

    /* renamed from: g, reason: collision with root package name */
    public static int f77798g;

    /* renamed from: h, reason: collision with root package name */
    public static int f77799h;

    /* renamed from: i, reason: collision with root package name */
    public static long f77800i;

    /* renamed from: j, reason: collision with root package name */
    public static long f77801j;

    /* renamed from: k, reason: collision with root package name */
    public static long f77802k;

    /* renamed from: l, reason: collision with root package name */
    public static long f77803l;

    /* renamed from: m, reason: collision with root package name */
    public static long f77804m;

    /* renamed from: n, reason: collision with root package name */
    public static long f77805n;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class Termios {

        /* renamed from: h, reason: collision with root package name */
        public static int f77806h;

        /* renamed from: a, reason: collision with root package name */
        public long f77807a;

        /* renamed from: b, reason: collision with root package name */
        public long f77808b;

        /* renamed from: c, reason: collision with root package name */
        public long f77809c;

        /* renamed from: d, reason: collision with root package name */
        public long f77810d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f77811e = new byte[32];

        /* renamed from: f, reason: collision with root package name */
        public long f77812f;

        /* renamed from: g, reason: collision with root package name */
        public long f77813g;

        static {
            c.k();
            init();
        }

        private static native void init();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WinSize {

        /* renamed from: e, reason: collision with root package name */
        public static int f77814e;

        /* renamed from: a, reason: collision with root package name */
        public short f77815a;

        /* renamed from: b, reason: collision with root package name */
        public short f77816b;

        /* renamed from: c, reason: collision with root package name */
        public short f77817c;

        /* renamed from: d, reason: collision with root package name */
        public short f77818d;

        static {
            c.k();
            init();
        }

        public WinSize() {
        }

        private static native void init();

        public WinSize(short s11, short s12) {
            this.f77815a = s11;
            this.f77816b = s12;
        }
    }

    static {
        boolean k11 = c.k();
        f77792a = k11;
        if (k11) {
            init();
        }
        f77793b = 1;
        f77794c = 2;
    }

    private static native void init();

    public static native int ioctl(int i11, long j11, WinSize winSize);

    public static native int ioctl(int i11, long j11, int[] iArr);

    public static native int isatty(int i11);

    public static native int openpty(int[] iArr, int[] iArr2, byte[] bArr, Termios termios, WinSize winSize);

    public static native int tcgetattr(int i11, Termios termios);

    public static native int tcsetattr(int i11, int i12, Termios termios);

    public static native String ttyname(int i11);
}
