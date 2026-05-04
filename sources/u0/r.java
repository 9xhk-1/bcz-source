package u0;

import android.os.SystemClock;
import androidx.annotation.WorkerThread;
import java.io.File;
import kotlin.jvm.internal.u0;

/* compiled from: r8-map-id-edd0706d8ade6e5fa050dcf48a624fb4468a151a6c9a3ed423de0572ab36a89c */
@u0({"SMAP\nHardwareBitmaps.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/FileDescriptorCounter\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 3 ArrayIntrinsics.kt\nkotlin/ArrayIntrinsicsKt\n+ 4 Logs.kt\ncoil/util/-Logs\n*L\n1#1,215:1\n18#2:216\n26#3:217\n21#4,4:218\n*S KotlinDebug\n*F\n+ 1 HardwareBitmaps.kt\ncoil/util/FileDescriptorCounter\n*L\n87#1:216\n87#1:217\n90#1:218,4\n*E\n"})
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: b, reason: collision with root package name */
    @m80.k
    public static final String f91472b = "FileDescriptorCounter";

    /* renamed from: c, reason: collision with root package name */
    public static final int f91473c = 800;

    /* renamed from: d, reason: collision with root package name */
    public static final int f91474d = 30;

    /* renamed from: e, reason: collision with root package name */
    public static final int f91475e = 30000;

    /* renamed from: a, reason: collision with root package name */
    @m80.k
    public static final r f91471a = new r();

    /* renamed from: f, reason: collision with root package name */
    @m80.k
    public static final File f91476f = new File("/proc/self/fd");

    /* renamed from: g, reason: collision with root package name */
    public static int f91477g = 30;

    /* renamed from: h, reason: collision with root package name */
    public static long f91478h = SystemClock.uptimeMillis();

    /* renamed from: i, reason: collision with root package name */
    public static boolean f91479i = true;

    public final boolean a() {
        int i11 = f91477g;
        f91477g = i11 + 1;
        return i11 >= 30 || SystemClock.uptimeMillis() > f91478h + ((long) 30000);
    }

    @WorkerThread
    public final synchronized boolean b(@m80.l w wVar) {
        try {
            if (a()) {
                f91477g = 0;
                f91478h = SystemClock.uptimeMillis();
                String[] list = f91476f.list();
                if (list == null) {
                    list = new String[0];
                }
                int length = list.length;
                boolean z11 = length < 800;
                f91479i = z11;
                if (!z11 && wVar != null && wVar.getLevel() <= 5) {
                    wVar.a(f91472b, 5, "Unable to allocate more hardware bitmaps. Number of used file descriptors: " + length, null);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f91479i;
    }
}
