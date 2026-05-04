package com.xiaomi.push;

import android.util.Log;
import android.util.Pair;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/* loaded from: classes8.dex */
class dj implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ di f45392a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ String f258a;

    /* renamed from: a, reason: collision with other field name */
    final /* synthetic */ Throwable f259a;

    public dj(di diVar, String str, Throwable th2) {
        this.f45392a = diVar;
        this.f258a = str;
        this.f259a = th2;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list;
        SimpleDateFormat simpleDateFormat;
        String str;
        List list2;
        String str2;
        String str3;
        List list3;
        List list4;
        SimpleDateFormat simpleDateFormat2;
        String str4;
        List list5;
        List list6;
        list = di.f255a;
        simpleDateFormat = di.f254a;
        String format = simpleDateFormat.format(new Date());
        str = this.f45392a.f45390b;
        list.add(new Pair(String.format("%1$s %2$s %3$s ", format, str, this.f258a), this.f259a));
        list2 = di.f255a;
        if (list2.size() > 20000) {
            list3 = di.f255a;
            int size = list3.size() - 19950;
            for (int i11 = 0; i11 < size; i11++) {
                try {
                    list5 = di.f255a;
                    if (list5.size() > 0) {
                        list6 = di.f255a;
                        list6.remove(0);
                    }
                } catch (IndexOutOfBoundsException unused) {
                }
            }
            list4 = di.f255a;
            simpleDateFormat2 = di.f254a;
            String format2 = simpleDateFormat2.format(new Date());
            str4 = this.f45392a.f45390b;
            list4.add(new Pair(String.format("%1$s %2$s %3$s ", format2, str4, "flush " + size + " lines logs."), null));
        }
        try {
            if (aa.d()) {
                this.f45392a.m5822a();
            } else {
                str3 = this.f45392a.f45390b;
                Log.w(str3, "SDCard is unavailable.");
            }
        } catch (Exception e11) {
            str2 = this.f45392a.f45390b;
            Log.e(str2, "", e11);
        }
    }
}
