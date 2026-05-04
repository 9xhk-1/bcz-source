package com.igexin.push.core;

import com.igexin.push.core.d;

/* loaded from: classes7.dex */
public final class j {

    /* renamed from: b, reason: collision with root package name */
    private static final String f38312b = "HeartBeatGenerator";

    /* renamed from: e, reason: collision with root package name */
    private static j f38313e;

    /* renamed from: a, reason: collision with root package name */
    public long f38314a = 240000;

    /* renamed from: c, reason: collision with root package name */
    private int f38315c = b.f38324a;

    /* renamed from: d, reason: collision with root package name */
    private long f38316d = 0;

    /* renamed from: com.igexin.push.core.j$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38317a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f38318b;

        static {
            int[] iArr = new int[a.a().length];
            f38318b = iArr;
            try {
                iArr[a.f38319a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38318b[a.f38320b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38318b[a.f38321c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38318b[a.f38322d - 1] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[b.a().length];
            f38317a = iArr2;
            try {
                iArr2[b.f38324a - 1] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f38317a[b.f38325b - 1] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f38317a[b.f38326c - 1] = 3;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f38319a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f38320b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f38321c = 3;

        /* renamed from: d, reason: collision with root package name */
        public static final int f38322d = 4;

        /* renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ int[] f38323e = {1, 2, 3, 4};

        private a(String str, int i11) {
        }

        public static int[] a() {
            return (int[]) f38323e.clone();
        }
    }

    /* JADX WARN: $VALUES field not found */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f38324a = 1;

        /* renamed from: b, reason: collision with root package name */
        public static final int f38325b = 2;

        /* renamed from: c, reason: collision with root package name */
        public static final int f38326c = 3;

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ int[] f38327d = {1, 2, 3};

        private b(String str, int i11) {
        }

        public static int[] a() {
            return (int[]) f38327d.clone();
        }
    }

    private j() {
    }

    public static j a() {
        if (f38313e == null) {
            f38313e = new j();
        }
        return f38313e;
    }

    private void c(int i11) {
        int i12;
        int i13 = AnonymousClass1.f38318b[i11 - 1];
        if (i13 == 1) {
            i12 = b.f38325b;
        } else if (i13 == 2 || i13 == 3) {
            this.f38314a = Math.max(this.f38314a - 60000, 240000L);
            long j11 = this.f38316d + 1;
            this.f38316d = j11;
            if (j11 < 2) {
                return;
            }
            this.f38314a = 240000L;
            i12 = b.f38326c;
        } else {
            if (i13 != 4) {
                return;
            }
            this.f38314a = 240000L;
            i12 = b.f38324a;
        }
        e(i12);
    }

    private void d(int i11) {
        int i12;
        int i13 = AnonymousClass1.f38318b[i11 - 1];
        if (i13 != 1) {
            if (i13 == 2 || i13 == 3) {
                i12 = b.f38326c;
                e(i12);
            } else if (i13 != 4) {
                return;
            }
        }
        this.f38314a = 240000L;
        i12 = b.f38324a;
        e(i12);
    }

    private void e(int i11) {
        this.f38315c = i11;
        this.f38316d = 0L;
    }

    public final long b() {
        long j11 = this.f38314a;
        int i11 = com.igexin.push.config.d.f37585e;
        if (i11 > 0) {
            j11 = i11 * 1000;
        }
        if (e.f38037n && e.f38044u && d.a.f37956a.f37949h.f38515b) {
            return j11;
        }
        return 3600000L;
    }

    private void b(int i11) {
        int i12;
        int i13 = AnonymousClass1.f38318b[i11 - 1];
        if (i13 == 1) {
            this.f38314a = Math.min(this.f38314a + 60000, com.igexin.push.config.c.f37555n);
        } else {
            if (i13 == 2 || i13 == 3) {
                long j11 = this.f38316d + 1;
                this.f38316d = j11;
                if (j11 >= 2) {
                    this.f38314a = Math.max(this.f38314a - 60000, 240000L);
                    i12 = b.f38325b;
                    e(i12);
                }
                return;
            }
            if (i13 != 4) {
                return;
            } else {
                this.f38314a = 240000L;
            }
        }
        i12 = b.f38324a;
        e(i12);
    }

    public final void a(int i11) {
        int i12;
        int i13 = AnonymousClass1.f38317a[this.f38315c - 1];
        if (i13 == 1) {
            int i14 = AnonymousClass1.f38318b[i11 - 1];
            if (i14 == 1) {
                this.f38314a = Math.min(this.f38314a + 60000, com.igexin.push.config.c.f37555n);
                i12 = b.f38324a;
            } else if (i14 == 2 || i14 == 3) {
                long j11 = this.f38316d + 1;
                this.f38316d = j11;
                if (j11 < 2) {
                    return;
                }
                this.f38314a = Math.max(this.f38314a - 60000, 240000L);
                i12 = b.f38325b;
            } else {
                if (i14 != 4) {
                    return;
                }
                this.f38314a = 240000L;
                i12 = b.f38324a;
            }
        } else if (i13 == 2) {
            int i15 = AnonymousClass1.f38318b[i11 - 1];
            if (i15 != 1) {
                if (i15 == 2 || i15 == 3) {
                    this.f38314a = Math.max(this.f38314a - 60000, 240000L);
                    long j12 = this.f38316d + 1;
                    this.f38316d = j12;
                    if (j12 < 2) {
                        return;
                    }
                    this.f38314a = 240000L;
                    i12 = b.f38326c;
                } else {
                    if (i15 != 4) {
                        return;
                    }
                    this.f38314a = 240000L;
                    i12 = b.f38324a;
                }
            }
            i12 = b.f38325b;
        } else {
            if (i13 != 3) {
                return;
            }
            int i16 = AnonymousClass1.f38318b[i11 - 1];
            if (i16 != 1) {
                if (i16 != 2 && i16 != 3) {
                    if (i16 != 4) {
                        return;
                    }
                }
                i12 = b.f38326c;
            }
            this.f38314a = 240000L;
            i12 = b.f38324a;
        }
        e(i12);
    }

    private void a(long j11) {
        this.f38314a = j11;
    }
}
