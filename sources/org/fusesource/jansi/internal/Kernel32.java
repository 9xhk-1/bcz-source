package org.fusesource.jansi.internal;

import g80.c;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import l50.b;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes9.dex */
public class Kernel32 {

    /* renamed from: a, reason: collision with root package name */
    public static short f77819a;

    /* renamed from: b, reason: collision with root package name */
    public static short f77820b;

    /* renamed from: c, reason: collision with root package name */
    public static short f77821c;

    /* renamed from: d, reason: collision with root package name */
    public static short f77822d;

    /* renamed from: e, reason: collision with root package name */
    public static short f77823e;

    /* renamed from: f, reason: collision with root package name */
    public static short f77824f;

    /* renamed from: g, reason: collision with root package name */
    public static short f77825g;

    /* renamed from: h, reason: collision with root package name */
    public static short f77826h;

    /* renamed from: i, reason: collision with root package name */
    public static short f77827i;

    /* renamed from: j, reason: collision with root package name */
    public static short f77828j;

    /* renamed from: k, reason: collision with root package name */
    public static short f77829k;

    /* renamed from: l, reason: collision with root package name */
    public static short f77830l;

    /* renamed from: m, reason: collision with root package name */
    public static short f77831m;

    /* renamed from: n, reason: collision with root package name */
    public static short f77832n;

    /* renamed from: o, reason: collision with root package name */
    public static short f77833o;

    /* renamed from: p, reason: collision with root package name */
    public static int f77834p;

    /* renamed from: q, reason: collision with root package name */
    public static int f77835q;

    /* renamed from: r, reason: collision with root package name */
    public static int f77836r;

    /* renamed from: s, reason: collision with root package name */
    public static int f77837s;

    /* renamed from: t, reason: collision with root package name */
    public static int f77838t;

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CHAR_INFO {

        /* renamed from: c, reason: collision with root package name */
        public static int f77839c;

        /* renamed from: a, reason: collision with root package name */
        public short f77840a;

        /* renamed from: b, reason: collision with root package name */
        public char f77841b;

        static {
            c.k();
            init();
        }

        private static native void init();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class CONSOLE_SCREEN_BUFFER_INFO {

        /* renamed from: f, reason: collision with root package name */
        public static int f77842f;

        /* renamed from: c, reason: collision with root package name */
        public short f77845c;

        /* renamed from: a, reason: collision with root package name */
        public COORD f77843a = new COORD();

        /* renamed from: b, reason: collision with root package name */
        public COORD f77844b = new COORD();

        /* renamed from: d, reason: collision with root package name */
        public SMALL_RECT f77846d = new SMALL_RECT();

        /* renamed from: e, reason: collision with root package name */
        public COORD f77847e = new COORD();

        static {
            c.k();
            init();
        }

        private static native void init();

        public int a() {
            return this.f77846d.b() + 1;
        }

        public int b() {
            return this.f77846d.c() + 1;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class COORD {

        /* renamed from: c, reason: collision with root package name */
        public static int f77848c;

        /* renamed from: a, reason: collision with root package name */
        public short f77849a;

        /* renamed from: b, reason: collision with root package name */
        public short f77850b;

        static {
            c.k();
            init();
        }

        private static native void init();

        public COORD a() {
            COORD coord = new COORD();
            coord.f77849a = this.f77849a;
            coord.f77850b = this.f77850b;
            return coord;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class FOCUS_EVENT_RECORD {

        /* renamed from: b, reason: collision with root package name */
        public static int f77851b;

        /* renamed from: a, reason: collision with root package name */
        public boolean f77852a;

        static {
            c.k();
            init();
        }

        private static native void init();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class INPUT_RECORD {

        /* renamed from: g, reason: collision with root package name */
        public static int f77853g;

        /* renamed from: h, reason: collision with root package name */
        public static short f77854h;

        /* renamed from: i, reason: collision with root package name */
        public static short f77855i;

        /* renamed from: j, reason: collision with root package name */
        public static short f77856j;

        /* renamed from: k, reason: collision with root package name */
        public static short f77857k;

        /* renamed from: l, reason: collision with root package name */
        public static short f77858l;

        /* renamed from: a, reason: collision with root package name */
        public short f77859a;

        /* renamed from: b, reason: collision with root package name */
        public KEY_EVENT_RECORD f77860b = new KEY_EVENT_RECORD();

        /* renamed from: c, reason: collision with root package name */
        public MOUSE_EVENT_RECORD f77861c = new MOUSE_EVENT_RECORD();

        /* renamed from: d, reason: collision with root package name */
        public WINDOW_BUFFER_SIZE_RECORD f77862d = new WINDOW_BUFFER_SIZE_RECORD();

        /* renamed from: e, reason: collision with root package name */
        public MENU_EVENT_RECORD f77863e = new MENU_EVENT_RECORD();

        /* renamed from: f, reason: collision with root package name */
        public FOCUS_EVENT_RECORD f77864f = new FOCUS_EVENT_RECORD();

        static {
            c.k();
            init();
        }

        private static native void init();

        public static native void memmove(INPUT_RECORD input_record, long j11, long j12);
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class KEY_EVENT_RECORD {

        /* renamed from: g, reason: collision with root package name */
        public static int f77865g;

        /* renamed from: h, reason: collision with root package name */
        public static int f77866h;

        /* renamed from: i, reason: collision with root package name */
        public static int f77867i;

        /* renamed from: j, reason: collision with root package name */
        public static int f77868j;

        /* renamed from: k, reason: collision with root package name */
        public static int f77869k;

        /* renamed from: l, reason: collision with root package name */
        public static int f77870l;

        /* renamed from: m, reason: collision with root package name */
        public static int f77871m;

        /* renamed from: n, reason: collision with root package name */
        public static int f77872n;

        /* renamed from: o, reason: collision with root package name */
        public static int f77873o;

        /* renamed from: p, reason: collision with root package name */
        public static int f77874p;

        /* renamed from: a, reason: collision with root package name */
        public boolean f77875a;

        /* renamed from: b, reason: collision with root package name */
        public short f77876b;

        /* renamed from: c, reason: collision with root package name */
        public short f77877c;

        /* renamed from: d, reason: collision with root package name */
        public short f77878d;

        /* renamed from: e, reason: collision with root package name */
        public char f77879e;

        /* renamed from: f, reason: collision with root package name */
        public int f77880f;

        static {
            c.k();
            init();
        }

        private static native void init();

        public String toString() {
            return "KEY_EVENT_RECORD{keyDown=" + this.f77875a + ", repeatCount=" + ((int) this.f77876b) + ", keyCode=" + ((int) this.f77877c) + ", scanCode=" + ((int) this.f77878d) + ", uchar=" + this.f77879e + ", controlKeyState=" + this.f77880f + b.f69928j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MENU_EVENT_RECORD {

        /* renamed from: b, reason: collision with root package name */
        public static int f77881b;

        /* renamed from: a, reason: collision with root package name */
        public int f77882a;

        static {
            c.k();
            init();
        }

        private static native void init();
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class MOUSE_EVENT_RECORD {

        /* renamed from: e, reason: collision with root package name */
        public static int f77883e;

        /* renamed from: f, reason: collision with root package name */
        public static int f77884f;

        /* renamed from: g, reason: collision with root package name */
        public static int f77885g;

        /* renamed from: h, reason: collision with root package name */
        public static int f77886h;

        /* renamed from: i, reason: collision with root package name */
        public static int f77887i;

        /* renamed from: j, reason: collision with root package name */
        public static int f77888j;

        /* renamed from: k, reason: collision with root package name */
        public static int f77889k;

        /* renamed from: l, reason: collision with root package name */
        public static int f77890l;

        /* renamed from: m, reason: collision with root package name */
        public static int f77891m;

        /* renamed from: n, reason: collision with root package name */
        public static int f77892n;

        /* renamed from: o, reason: collision with root package name */
        public static int f77893o;

        /* renamed from: p, reason: collision with root package name */
        public static int f77894p;

        /* renamed from: q, reason: collision with root package name */
        public static int f77895q;

        /* renamed from: r, reason: collision with root package name */
        public static int f77896r;

        /* renamed from: s, reason: collision with root package name */
        public static int f77897s;

        /* renamed from: t, reason: collision with root package name */
        public static int f77898t;

        /* renamed from: u, reason: collision with root package name */
        public static int f77899u;

        /* renamed from: v, reason: collision with root package name */
        public static int f77900v;

        /* renamed from: w, reason: collision with root package name */
        public static int f77901w;

        /* renamed from: a, reason: collision with root package name */
        public COORD f77902a = new COORD();

        /* renamed from: b, reason: collision with root package name */
        public int f77903b;

        /* renamed from: c, reason: collision with root package name */
        public int f77904c;

        /* renamed from: d, reason: collision with root package name */
        public int f77905d;

        static {
            c.k();
            init();
        }

        private static native void init();

        public String toString() {
            return "MOUSE_EVENT_RECORD{mousePosition=" + this.f77902a + ", buttonState=" + this.f77903b + ", controlKeyState=" + this.f77904c + ", eventFlags=" + this.f77905d + b.f69928j;
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class SMALL_RECT {

        /* renamed from: e, reason: collision with root package name */
        public static int f77906e;

        /* renamed from: a, reason: collision with root package name */
        public short f77907a;

        /* renamed from: b, reason: collision with root package name */
        public short f77908b;

        /* renamed from: c, reason: collision with root package name */
        public short f77909c;

        /* renamed from: d, reason: collision with root package name */
        public short f77910d;

        static {
            c.k();
            init();
        }

        private static native void init();

        public SMALL_RECT a() {
            SMALL_RECT small_rect = new SMALL_RECT();
            small_rect.f77907a = this.f77907a;
            small_rect.f77908b = this.f77908b;
            small_rect.f77909c = this.f77909c;
            small_rect.f77910d = this.f77910d;
            return small_rect;
        }

        public short b() {
            return (short) (this.f77910d - this.f77908b);
        }

        public short c() {
            return (short) (this.f77909c - this.f77907a);
        }
    }

    /* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
    public static class WINDOW_BUFFER_SIZE_RECORD {

        /* renamed from: b, reason: collision with root package name */
        public static int f77911b;

        /* renamed from: a, reason: collision with root package name */
        public COORD f77912a = new COORD();

        static {
            c.k();
            init();
        }

        private static native void init();

        public String toString() {
            return "WINDOW_BUFFER_SIZE_RECORD{size=" + this.f77912a + b.f69928j;
        }
    }

    static {
        if (c.k()) {
            init();
        }
    }

    public static native int CloseHandle(long j11);

    public static native int FillConsoleOutputAttribute(long j11, short s11, int i11, COORD coord, int[] iArr);

    public static native int FillConsoleOutputCharacterW(long j11, char c11, int i11, COORD coord, int[] iArr);

    public static native int FlushConsoleInputBuffer(long j11);

    public static native int FormatMessageW(int i11, long j11, int i12, int i13, byte[] bArr, int i14, long[] jArr);

    public static native int GetConsoleMode(long j11, int[] iArr);

    public static native int GetConsoleOutputCP();

    public static native int GetConsoleScreenBufferInfo(long j11, CONSOLE_SCREEN_BUFFER_INFO console_screen_buffer_info);

    public static native int GetLastError();

    public static native int GetNumberOfConsoleInputEvents(long j11, int[] iArr);

    public static native long GetStdHandle(int i11);

    private static native int PeekConsoleInputW(long j11, long j12, int i11, int[] iArr);

    private static native int ReadConsoleInputW(long j11, long j12, int i11, int[] iArr);

    public static native int ScrollConsoleScreenBuffer(long j11, SMALL_RECT small_rect, SMALL_RECT small_rect2, COORD coord, CHAR_INFO char_info);

    public static native int SetConsoleCursorPosition(long j11, COORD coord);

    public static native int SetConsoleMode(long j11, int i11);

    public static native int SetConsoleOutputCP(int i11);

    public static native int SetConsoleTextAttribute(long j11, short s11);

    public static native int SetConsoleTitle(String str);

    public static native int WaitForSingleObject(long j11, int i11);

    public static native int WriteConsoleW(long j11, char[] cArr, int i11, int[] iArr, long j12);

    public static native int _getch();

    public static String a(int i11) {
        byte[] bArr = new byte[160];
        FormatMessageW(f77834p, 0L, i11, 0, bArr, 160, null);
        try {
            return new String(bArr, n60.c.f74537e).trim();
        } catch (UnsupportedEncodingException e11) {
            throw new IllegalStateException(e11);
        }
    }

    public static String b() {
        return a(GetLastError());
    }

    public static INPUT_RECORD[] c(long j11, int i11, boolean z11) throws IOException {
        Throwable th2;
        long j12;
        int[] iArr = new int[1];
        try {
            j12 = malloc(INPUT_RECORD.f77853g * i11);
        } catch (Throwable th3) {
            th2 = th3;
            j12 = 0;
        }
        try {
            if (j12 == 0) {
                throw new IOException("cannot allocate memory with JNI");
            }
            if ((z11 ? PeekConsoleInputW(j11, j12, i11, iArr) : ReadConsoleInputW(j11, j12, i11, iArr)) == 0) {
                throw new IOException("ReadConsoleInputW failed: " + b());
            }
            int i12 = iArr[0];
            if (i12 <= 0) {
                INPUT_RECORD[] input_recordArr = new INPUT_RECORD[0];
                if (j12 != 0) {
                    free(j12);
                }
                return input_recordArr;
            }
            INPUT_RECORD[] input_recordArr2 = new INPUT_RECORD[i12];
            for (int i13 = 0; i13 < i12; i13++) {
                INPUT_RECORD input_record = new INPUT_RECORD();
                input_recordArr2[i13] = input_record;
                INPUT_RECORD.memmove(input_record, (i13 * r1) + j12, INPUT_RECORD.f77853g);
            }
            if (j12 != 0) {
                free(j12);
            }
            return input_recordArr2;
        } catch (Throwable th4) {
            th2 = th4;
            if (j12 == 0) {
                throw th2;
            }
            free(j12);
            throw th2;
        }
    }

    public static INPUT_RECORD[] d(long j11, int i11, boolean z11) throws IOException {
        INPUT_RECORD[] c11;
        int i12;
        int i13;
        do {
            c11 = c(j11, i11, z11);
            i13 = 0;
            for (INPUT_RECORD input_record : c11) {
                if (input_record.f77859a == INPUT_RECORD.f77854h) {
                    i13++;
                }
            }
        } while (i13 <= 0);
        INPUT_RECORD[] input_recordArr = new INPUT_RECORD[i13];
        int i14 = 0;
        for (INPUT_RECORD input_record2 : c11) {
            if (input_record2.f77859a == INPUT_RECORD.f77854h) {
                input_recordArr[i14] = input_record2;
                i14++;
            }
        }
        return input_recordArr;
    }

    public static native void free(long j11);

    private static native void init();

    public static native long malloc(long j11);
}
