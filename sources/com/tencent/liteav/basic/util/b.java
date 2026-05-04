package com.tencent.liteav.basic.util;

import android.os.Process;
import android.text.TextUtils;
import com.tencent.liteav.basic.log.TXCLog;
import en.r;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
/* loaded from: classes5.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static final long f43424a = TimeUnit.SECONDS.toMillis(2);

    /* renamed from: d, reason: collision with root package name */
    private RandomAccessFile f43427d;

    /* renamed from: e, reason: collision with root package name */
    private RandomAccessFile f43428e;

    /* renamed from: f, reason: collision with root package name */
    private long f43429f = 0;

    /* renamed from: g, reason: collision with root package name */
    private float f43430g = 0.0f;

    /* renamed from: h, reason: collision with root package name */
    private float f43431h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    private long f43432i = 0;

    /* renamed from: j, reason: collision with root package name */
    private long f43433j = 0;

    /* renamed from: k, reason: collision with root package name */
    private float f43434k = 0.0f;

    /* renamed from: b, reason: collision with root package name */
    private final long f43425b = TXCTimeUtil.getClockTickInHz();

    /* renamed from: c, reason: collision with root package name */
    private final int f43426c = Runtime.getRuntime().availableProcessors();

    public b() {
        try {
            this.f43427d = new RandomAccessFile(String.format(Locale.ENGLISH, "/proc/%d/stat", Integer.valueOf(Process.myPid())), r.f50027a);
        } catch (IOException e11) {
            TXCLog.e("CpuUsageMeasurer", "open /proc/[PID]/stat failed. " + e11.getMessage());
        }
        try {
            this.f43428e = new RandomAccessFile("/proc/stat", r.f50027a);
        } catch (IOException unused) {
        }
    }

    private void b() {
        long timeTick;
        long j11;
        String[] a11 = a(this.f43427d);
        if (a11 == null || a11.length < 52) {
            return;
        }
        long parseLong = (long) (((((Long.parseLong(a11[13]) + Long.parseLong(a11[14])) + Long.parseLong(a11[15])) + Long.parseLong(a11[16])) * 1000.0f) / this.f43425b);
        String[] a12 = a(this.f43428e);
        if (a12 == null || a12.length < 8) {
            timeTick = TXCTimeUtil.getTimeTick() * this.f43426c;
            j11 = timeTick;
        } else {
            long parseLong2 = Long.parseLong(a12[1]) + Long.parseLong(a12[2]) + Long.parseLong(a12[3]) + Long.parseLong(a12[4]) + Long.parseLong(a12[5]) + Long.parseLong(a12[6]) + Long.parseLong(a12[7]);
            long parseLong3 = Long.parseLong(a12[4]) + Long.parseLong(a12[5]);
            float f11 = parseLong2 * 1000.0f;
            long j12 = this.f43425b;
            timeTick = (long) (f11 / j12);
            j11 = (long) ((parseLong3 * 1000.0f) / j12);
        }
        float f12 = parseLong;
        float f13 = timeTick - this.f43432i;
        this.f43431h = ((f12 - this.f43430g) * 100.0f) / f13;
        this.f43434k = ((r4 - (j11 - this.f43433j)) * 100.0f) / f13;
        this.f43430g = f12;
        this.f43433j = j11;
        this.f43432i = timeTick;
        this.f43429f = TXCTimeUtil.getTimeTick();
    }

    public int[] a() {
        int[] iArr;
        synchronized (this) {
            try {
                if (TXCTimeUtil.getTimeTick() - this.f43429f >= f43424a) {
                    b();
                }
                iArr = new int[]{(int) (this.f43431h * 10.0f), (int) (this.f43434k * 10.0f)};
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return iArr;
    }

    public void finalize() throws Throwable {
        super.finalize();
        c.a(this.f43427d);
        c.a(this.f43428e);
        TXCLog.i("CpuUsageMeasurer", "measurer is released");
    }

    private static String[] a(RandomAccessFile randomAccessFile) {
        String str;
        if (randomAccessFile == null) {
            return null;
        }
        try {
            randomAccessFile.seek(0L);
            str = randomAccessFile.readLine();
        } catch (IOException e11) {
            TXCLog.e("CpuUsageMeasurer", "read line failed. " + e11.getMessage());
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return str.split("\\s+");
    }
}
