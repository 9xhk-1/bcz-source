package com.xiaomi.push.service;

import android.content.Context;
import android.text.TextUtils;
import com.xiaomi.push.hl;
import com.xiaomi.push.ir;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/* loaded from: classes8.dex */
public class ca {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f46348a = new Object();

    public static void a(Context context, hl hlVar) {
        if (bz.a(hlVar.e())) {
            com.xiaomi.push.aj.a(context).a(new cb(context, hlVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v7, types: [java.io.Closeable] */
    public static void c(Context context, hl hlVar) {
        BufferedOutputStream bufferedOutputStream;
        BufferedOutputStream bufferedOutputStream2;
        String str;
        ?? a11 = a(context);
        try {
            try {
                byte[] b11 = com.xiaomi.push.h.b(a11, ir.a(hlVar));
                if (b11 != null && b11.length >= 1) {
                    if (b11.length > 10240) {
                        com.xiaomi.channel.commonutils.logger.b.m5639a("TinyData write to cache file failed case too much data content item:" + hlVar.d() + "  ts:" + System.currentTimeMillis());
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a((Closeable) null);
                        return;
                    }
                    BufferedOutputStream bufferedOutputStream3 = new BufferedOutputStream(new FileOutputStream(new File(context.getFilesDir(), "tiny_data.data"), true));
                    try {
                        bufferedOutputStream3.write(com.xiaomi.push.ac.a(b11.length));
                        bufferedOutputStream3.write(b11);
                        bufferedOutputStream3.flush();
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a(bufferedOutputStream3);
                        return;
                    } catch (IOException e11) {
                        bufferedOutputStream2 = bufferedOutputStream3;
                        e = e11;
                        str = "TinyData write to cache file failed cause io exception item:" + hlVar.d();
                        a11 = bufferedOutputStream2;
                        com.xiaomi.channel.commonutils.logger.b.a(str, e);
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a((Closeable) a11);
                        return;
                    } catch (Exception e12) {
                        bufferedOutputStream = bufferedOutputStream3;
                        e = e12;
                        str = "TinyData write to cache file  failed item:" + hlVar.d();
                        a11 = bufferedOutputStream;
                        com.xiaomi.channel.commonutils.logger.b.a(str, e);
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a((Closeable) a11);
                        return;
                    } catch (Throwable th2) {
                        a11 = bufferedOutputStream3;
                        th = th2;
                        com.xiaomi.push.y.a((Closeable) null);
                        com.xiaomi.push.y.a((Closeable) a11);
                        throw th;
                    }
                }
                com.xiaomi.channel.commonutils.logger.b.m5639a("TinyData write to cache file failed case encryption fail item:" + hlVar.d() + "  ts:" + System.currentTimeMillis());
                com.xiaomi.push.y.a((Closeable) null);
                com.xiaomi.push.y.a((Closeable) null);
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (IOException e13) {
            e = e13;
            bufferedOutputStream2 = null;
        } catch (Exception e14) {
            e = e14;
            bufferedOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            a11 = 0;
        }
    }

    public static byte[] a(Context context) {
        String a11 = com.xiaomi.push.o.a(context).a("mipush", "td_key", "");
        if (TextUtils.isEmpty(a11)) {
            a11 = com.xiaomi.push.bo.a(20);
            com.xiaomi.push.o.a(context).m6182a("mipush", "td_key", a11);
        }
        return a(a11);
    }

    private static byte[] a(String str) {
        byte[] copyOf = Arrays.copyOf(com.xiaomi.push.bl.m5755a(str), 16);
        copyOf[0] = 68;
        copyOf[15] = 84;
        return copyOf;
    }
}
